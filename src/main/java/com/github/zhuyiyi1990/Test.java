package com.github.zhuyiyi1990;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;

public class Test {

    public static void main(String[] args) {
        try {
            // 需要导oracle driver jar包
            Class.forName("oracle.jdbc.driver.OracleDriver");
//			Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:oracle:thin:@192.1.108.253:1521:ECSDB";
            String user = "ocbcp2";
            String password = "password";
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            String sql = "insert into HKBBCMAS (REFNO, CUSTCOD, FLIUSER, FLIDATE, AUSER, ADATE, VERNO, TXNO, FUNC, FLRECTY, FLRCSTS, FLSTSCD, CUSTAD1, CUSTAD2, CUSTAD3, CUSTAD4, CRTTYPE, BAREF, VALDATE, RELREFN, BATYPE, SUBTYPE, LNCCY, LNAMT, LNRTAMT, LNSCRTA, INTRATT, FIXRATE, VARRATE, VSPREAD, COMDATE, LNSDATE, LNINSDA, LNINPDA, TENOR, BOOKID, CRLINE, NTENOR, SUMINV, AUTODR, AUTOACC, SPTDATE, LNDUEDA, BENECOD, BENADD1, BENADD2, BENADD3, BENADD4, GREENBA, INTENDD, COLIFLA, INTACCA, SCINTAC, SCRETIN, TRETINA, LACCDAT, LPAYDAT, LRETDAT, INTACDA, LSTAMDT, EFFDATE, FLLCYCD, PENDING, MERCODE, INDCODE, INTCLTP, DINT, DINTL, OSODINT, INTAMRT, INTAMRL, OSAMT, TXCCY, TXAMT, OSAMTL, OSINTLY, OSUELLY, LCYINTA, LCYINTX, INTMTHD, BASEDAY, ODSTRDA, ODRATYE, ODSPRED, ODINTFG, ODFRATE, UPINTAM, WAIVE, TXSTAT, NCRESON, REDISIN, ACCCOMM, BNKCHGS, DSCPROC, NETPROC, ADVMODE, PAYAMT, PAYMODE, CURACNO, CORRBNK, CORRBNM, CORRBA1, CORRBA2, CORRBA3, SHRTFAL, ACTTNR, ACCRATE, STSDESC, INPUSER, AUTUSER, APPUSER, CRTDATE, FLBCHCD, INTNCOL, PYFCYCY, PYFCYAM, BILLAMT, BILLCCY, BILLEXG, LCLEQUL, INFOFLG, EARMARK, MULTIBE, MULTIBA, ITEBKCD, ITEBKNM, ITEADD1, ITEADD2, ITEADD3, LASTPIN, SUBTP01, NOSTROI, NOSTRNM, CHGTOFG, CHGTYPE, CABLECH, ACCTOCR, BENTELL, NPLDATE, INTOCOL, CONDATE, NPLCOLL, NPLTCOL, NPLLAST, BFINTR, BFINT, SALIND, SVALDAT, SFVDATE, SUBRCH, CNLTYPE, CNLDATE, CAPPPU, LAPPPU, BILAMT1, BILCCY1, BILEXG1, BILAMT2, BILCCY2, BILEXG2, SREFNO, BSDRATE, BROKER, DRFNO, SCNLDAT, SDINT, SPRCDS, DSERNO, SCNLTYP, SBBRATE, SBBINT, SSECBNM, ODINT, REFINT, MATDATE, OSDINT, PDTOLPR, BANKENT, BRANCH, YTDACCF, YTDACCL, YTDPAYF, YTDPAYL, TMPDAT1, TMPDAT2, TMPDAT3, TMPCCY1, TMPCCY2, TMPAMT1, TMPAMT2, TMPNUM1, TMPNUM2, TMPCHR1, TMPCHR2, FLITIME, ATIME, PCENTER, ACUDBU, GSTRSD, GSTREG, MERCHD, INTACCM, DRACCCY, DRACNO, LNTYPE) values (?, '1017000041  ', '1         ', 20161228, '2         ', 20161228, 2, 1, 'HKBBCCAA', 'M', 'C', 'A', 'masked5                            ', 'masked6                            ', 'masked7                            ', 'masked8                            ', ' ', 'XXXX         ', 20161228, '             ', 'BPI', 'A', 'MYR', 75000.00, 0.00, 0.00, ' ', 1.000000, '  ', 0.000000, 20161228, 0, 20161228, 0, 500, '1017000041  ', 'LN002', 999, 'N', 'N', '                      ', 0, 20190923, '            ', '                                   ', '                                   ', '                                   ', '                                   ', ' ', 0, ' ', 0.00, 2052.72, 0.00, 0.00, 0, 0, 0, 0, 0, 0, '   ', '               ', '    ', '      ', 'AV', 2052.72, 0.00, 0.00, 1918.96, 1918.96, 75000.00, 'MYR', 75000.00, 0.00, 0.00, 0.00, 0.00, 0.00, ' ', 0, 20190923, 'C1', 0.000000, ' ', 0.000000, 0.00, ' ', 'U', '   ', ' ', 0.00, 0.00, 0.00, 75000.00, ' ', 0.00, ' ', '           ', '            ', '                                   ', '                                   ', '                                   ', '                                   ', 0.00, 0, 0.000000, '               ', '1         ', '          ', '2         ', 20161228, '   ', 0.00, 'MYR', 75000.00, 75000.00, 'MYR', 1.0000000, 0.00, ' ', ' ', ' ', ' ', '            ', '                                   ', '                                   ', '                                   ', '                                   ', 0, ' ', '            ', '                                   ', ' ', ' ', 0.00, '                    ', '               ', 0, 0.00, 0, 0.00, 0.00, 0.00, 0.000000, 0.00, ' ', 0, 0, '173', ' ', 0, 'TF', 'TF', 0.00, '   ', 0.0000000, 0.00, '   ', 0.0000000, '             ', 0.000000, '                                   ', '            ', 0, 0.00, 0.00, '            ', ' ', 0.000000, 0.00, '                                   ', 0.00, 0.00, 20190923, 133.76, 0, 'M', '173', 0.00, 0.00, 0.00, 0.00, 0, 0, 0, '   ', '   ', 13050000.00, 0.00, 0, 0, '               ', '               ', 0, 0, '308', 'D', 'N', 'N', '                                   ', 0.00, '   ', '                    ', 'BPI  ')";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            DecimalFormat df1 = new DecimalFormat("000000");
            String s = "BAX1736";
            for (int i = 4; i <= 100000; i++) {
                preparedStatement.setString(1, s + df1.format(i));
                preparedStatement.execute();
                System.out.println("sql " + i + " executed");
            }
            System.out.println("done");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
