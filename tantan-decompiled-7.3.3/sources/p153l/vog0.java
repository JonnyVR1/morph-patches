package p153l;

import Sudabstract.Sudfor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.tencent.could.component.common.p084ai.clipphoto.FileUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import tech.sud.gip.C22511R;
import tech.sud.gip.core.ISudCfg;
import tech.sud.gip.core.SudGIP;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes2.dex */
public abstract class vog0 {

    /* JADX INFO: renamed from: d */
    public static final String f185041d = "SudGIP ".concat(vog0.class.getSimpleName());

    /* JADX INFO: renamed from: b */
    public final olg0 f185043b;

    /* JADX INFO: renamed from: a */
    public int f185042a = 10;

    /* JADX INFO: renamed from: c */
    public final msg0 f185044c = new msg0(this);

    public vog0(olg0 olg0Var) {
        this.f185043b = olg0Var;
    }

    /* JADX INFO: renamed from: a */
    public final long m202119a(oqg0 oqg0Var, klg0 klg0Var) {
        String str;
        String strM132863b = gxg0.m132863b(oqg0Var.f148591d);
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(oqg0Var.f148591d);
        if (TextUtils.isEmpty(fileExtensionFromUrl)) {
            str = strM132863b;
        } else {
            str = strM132863b + "." + fileExtensionFromUrl;
        }
        String strMo164598k = mo164598k(strM132863b);
        ofg0.m167448a(strMo164598k);
        uug0 uug0Var = new uug0();
        uug0Var.f181075c = oqg0Var.f148591d;
        uug0Var.f181073a = oqg0Var.f148590c;
        uug0Var.f181074b = oqg0Var.f148592e;
        uug0Var.f181076d = str;
        oqg0Var.f148594g = uug0Var;
        LogUtils.file("RealSudGamePackageManager", "downloadPackage");
        SudLogger.m222811d(f185041d, "downloadPackage");
        String str2 = bhg0.f76783d;
        return weg0.f188695a.m104341a(oqg0Var, strMo164598k, str, new llg0(this, klg0Var, oqg0Var), this.f185044c);
    }

    /* JADX INFO: renamed from: b */
    public abstract Object mo164596b(uug0 uug0Var, File file);

    /* JADX WARN: Code duplicated, block: B:37:0x009b  */
    /* JADX INFO: renamed from: d */
    public final void m202120d(int i, long j, String str, uog0 uog0Var) {
        String strGroup;
        boolean z;
        boolean z2;
        gvg0 gvg0Var;
        ctg0 ctg0Var;
        if (uog0Var == null) {
            return;
        }
        if ("true".equals(SudGIP.getCfg().getAdvancedConfigMap().get(ISudCfg.PRIORITY_EMBEDDED_GAME_PKG))) {
            String str2 = (String) arg0.f72934a.f152694c.get(Long.valueOf(j));
            if (!TextUtils.isEmpty(str2)) {
                mo168988g(j, str2, uog0Var);
                return;
            }
        }
        i0h0 i0h0Var = utg0.f180950e;
        if ((i0h0Var == null || (gvg0Var = i0h0Var.f112370c) == null || (ctg0Var = gvg0Var.f106636g) == null) ? true : ctg0Var.f83696a) {
            String str3 = (String) arg0.f72934a.f152694c.get(Long.valueOf(j));
            if (TextUtils.isEmpty(str3)) {
                z2 = false;
            } else {
                Matcher matcher = Pattern.compile("\\d+(\\.\\d+){3}").matcher(str3);
                strGroup = matcher.find() ? matcher.group() : null;
                if (TextUtils.isEmpty(strGroup)) {
                    z2 = false;
                } else {
                    if (TextUtils.isEmpty(str)) {
                        m202122f(j, strGroup, str3, uog0Var);
                    } else if (strGroup.equals(str)) {
                        mo168988g(j, str3, uog0Var);
                    } else {
                        z2 = false;
                    }
                    z2 = true;
                }
            }
            if (z2) {
                return;
            }
        } else {
            String str4 = (String) arg0.f72934a.f152694c.get(Long.valueOf(j));
            if (TextUtils.isEmpty(str4)) {
                z = false;
            } else {
                Matcher matcher2 = Pattern.compile("\\d+(\\.\\d+){3}").matcher(str4);
                strGroup = matcher2.find() ? matcher2.group() : null;
                if (TextUtils.isEmpty(strGroup)) {
                    mo168988g(j, str4, uog0Var);
                } else {
                    m202122f(j, strGroup, str4, uog0Var);
                }
                z = true;
            }
            if (z) {
                return;
            }
        }
        uug0 uug0VarM181992a = rlg0.m181992a(this.f185043b.f147834a.getString(String.valueOf(j), ""));
        if (uug0VarM181992a != null) {
            LogUtils.file("RealSudGamePackageManager", "isPackageInstalled gamePackageInfo != null");
            String str5 = f185041d;
            SudLogger.m222811d(str5, "isPackageInstalled gamePackageInfo != null");
            if (!TextUtils.isEmpty(uug0VarM181992a.f181076d)) {
                String strMo168989j = mo168989j(uug0VarM181992a.f181075c);
                String absolutePath = new File(strMo168989j, uug0VarM181992a.f181076d).getAbsolutePath();
                ktg0 ktg0Var = new ktg0();
                ktg0Var.f128691a = Sudfor.LoadMGPackageGamePackage;
                ktg0Var.f128692b = str;
                ktg0Var.f128693c = uug0VarM181992a.f181074b;
                ktg0Var.f128694d = strMo168989j;
                ktg0Var.f128695e = uug0VarM181992a.f181076d;
                ktg0Var.f128696f = uug0VarM181992a.f181077e;
                ktg0Var.f128697g = i;
                String str6 = bhg0.f76783d;
                weg0.f188695a.getClass();
                boolean zM104340d = bhg0.m104340d(ktg0Var);
                LogUtils.file("RealSudGamePackageManager", "isPackageInstalled isOk=" + zM104340d);
                SudLogger.m222811d(str5, "isPackageInstalled isOk=" + zM104340d);
                if (zM104340d) {
                    uug0VarM181992a.f181078f = System.currentTimeMillis();
                    this.f185043b.m168115g(uug0VarM181992a);
                    uog0Var.mo105395a(true, mo168987c(absolutePath), true);
                    return;
                }
                this.f185043b.m168111c(j);
            }
        }
        uog0Var.mo105395a(false, "", true);
    }

    /* JADX INFO: renamed from: e */
    public final void m202121e(long j) {
        ArrayList arrayListM168110b = this.f185043b.m168110b();
        if (arrayListM168110b.size() > this.f185042a) {
            for (uug0 uug0Var : arrayListM168110b.subList(0, arrayListM168110b.size() - this.f185042a)) {
                if (uug0Var.f181073a != j) {
                    LogUtils.file("RealSudGamePackageManager", "removeDiskCacheLimit mgId:" + uug0Var.f181073a);
                    this.f185043b.m168111c(uug0Var.f181073a);
                    String str = mo168989j(uug0Var.f181075c) + "/" + uug0Var.f181076d;
                    String str2 = ing0.f115953a;
                    LogUtils.file(FileUtils.TAG, "deleteFile result:" + new File(str).delete());
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004e  */
    /* JADX INFO: renamed from: f */
    public final void m202122f(long j, String str, String str2, uog0 uog0Var) {
        boolean zExists;
        byte b;
        uug0 uug0VarM181992a = rlg0.m181992a(this.f185043b.f147834a.getString(String.valueOf(j), ""));
        if (uug0VarM181992a == null || TextUtils.isEmpty(uug0VarM181992a.f181074b) || TextUtils.isEmpty(uug0VarM181992a.f181076d)) {
            zExists = false;
        } else {
            String absolutePath = new File(mo168989j(uug0VarM181992a.f181075c), uug0VarM181992a.f181076d).getAbsolutePath();
            String str3 = ing0.f115953a;
            if (absolutePath == null) {
                zExists = false;
            } else {
                zExists = new File(absolutePath).exists();
            }
        }
        if (!zExists) {
            mo168988g(j, str2, uog0Var);
            return;
        }
        uug0 uug0VarM181992a2 = rlg0.m181992a(this.f185043b.f147834a.getString(String.valueOf(j), ""));
        String[] strArrSplit = uug0VarM181992a2.f181074b.split("\\.");
        String[] strArrSplit2 = str.split("\\.");
        int iMin = Math.min(strArrSplit.length, strArrSplit2.length);
        int i = 0;
        long j2 = 0;
        while (i < iMin) {
            j2 = Long.parseLong(strArrSplit[i]) - Long.parseLong(strArrSplit2[i]);
            if (j2 != 0) {
                break;
            } else {
                i++;
            }
        }
        if (j2 != 0) {
            if (j2 <= 0) {
                b = -1;
                break;
            } else {
                b = 1;
                break;
            }
        }
        int i2 = i;
        while (true) {
            if (i2 >= strArrSplit.length) {
                while (true) {
                    if (i >= strArrSplit2.length) {
                        b = 0;
                        break;
                    } else {
                        if (Long.parseLong(strArrSplit2[i]) > 0) {
                            b = -1;
                            break;
                        }
                        i++;
                    }
                }
            } else {
                if (Long.parseLong(strArrSplit[i2]) > 0) {
                    b = 1;
                    break;
                }
                i2++;
            }
        }
        if (b > 0) {
            uog0Var.mo105395a(true, mo168987c(new File(mo168989j(uug0VarM181992a2.f181075c), uug0VarM181992a2.f181076d).getAbsolutePath()), false);
        } else {
            mo168988g(j, str2, uog0Var);
        }
    }

    /* JADX INFO: renamed from: g */
    public void mo168988g(long j, String str, uog0 uog0Var) {
        uog0Var.mo105395a(true, str, false);
    }

    /* JADX INFO: renamed from: h */
    public abstract void mo164597h(String str, Object obj, bxg0 bxg0Var, klg0 klg0Var);

    /* JADX INFO: renamed from: i */
    public final void m202123i(lsg0 lsg0Var) {
        tgg0 tgg0Var = (tgg0) lsg0Var;
        LogUtils.file("SudGameLoadingStageLoadPackage", "PackageInstallListener.onInstallStart");
        String str = thg0.f174360j;
        SudLogger.m222811d(str, "PackageInstallListener.onInstallStart");
        thg0 thg0Var = tgg0Var.f174081a;
        if (!thg0Var.f174366f) {
            thg0Var.f174363c.m159700c(thg0Var.f174361a.getString(C22511R.string.f208449x86f56e8));
        }
        thg0 thg0Var2 = tgg0Var.f174081a;
        if (!thg0Var2.f174366f) {
            thg0Var2.f174363c.m159700c(thg0Var2.f174361a.getString(C22511R.string.f208448xbd01b860));
        }
        LogUtils.file("SudGameLoadingStageLoadPackage", "PackageInstallListener.onSuccess");
        SudLogger.m222811d(str, "PackageInstallListener.onSuccess");
        thg0 thg0Var3 = tgg0Var.f174081a;
        if (thg0Var3.f174366f) {
            return;
        }
        thg0Var3.f174363c.m159700c(thg0Var3.f174361a.getString(C22511R.string.f208447x5c593b30));
        tgg0Var.f174081a.f174363c.m159698a(3);
    }

    /* JADX INFO: renamed from: j */
    public String mo168989j(String str) {
        return mo164598k(str);
    }

    /* JADX INFO: renamed from: k */
    public abstract String mo164598k(String str);

    /* JADX INFO: renamed from: c */
    public String mo168987c(String str) {
        return str;
    }
}
