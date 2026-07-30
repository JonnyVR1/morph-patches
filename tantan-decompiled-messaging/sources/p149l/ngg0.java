package p149l;

import Sudabstract.Sudfor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.tencent.could.component.common.p079ai.clipphoto.FileUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import tech.sud.gip.C22396R;
import tech.sud.gip.core.ISudCfg;
import tech.sud.gip.core.SudGIP;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ngg0 {

    /* JADX INFO: renamed from: d */
    public static final String f138872d = "SudGIP ".concat(ngg0.class.getSimpleName());

    /* JADX INFO: renamed from: b */
    public final gdg0 f138874b;

    /* JADX INFO: renamed from: a */
    public int f138873a = 10;

    /* JADX INFO: renamed from: c */
    public final ekg0 f138875c = new ekg0(this);

    public ngg0(gdg0 gdg0Var) {
        this.f138874b = gdg0Var;
    }

    /* JADX INFO: renamed from: a */
    public final long m159330a(gig0 gig0Var, cdg0 cdg0Var) {
        String str;
        String strM215499b = yog0.m215499b(gig0Var.f102896d);
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(gig0Var.f102896d);
        if (TextUtils.isEmpty(fileExtensionFromUrl)) {
            str = strM215499b;
        } else {
            str = strM215499b + "." + fileExtensionFromUrl;
        }
        String strMo121854k = mo121854k(strM215499b);
        g7g0.m124690a(strMo121854k);
        mmg0 mmg0Var = new mmg0();
        mmg0Var.f134665c = gig0Var.f102896d;
        mmg0Var.f134663a = gig0Var.f102895c;
        mmg0Var.f134664b = gig0Var.f102897e;
        mmg0Var.f134666d = str;
        gig0Var.f102899g = mmg0Var;
        LogUtils.file("RealSudGamePackageManager", "downloadPackage");
        SudLogger.m221565d(f138872d, "downloadPackage");
        String str2 = t8g0.f168916d;
        return o6g0.f142345a.m187552a(gig0Var, strMo121854k, str, new ddg0(this, cdg0Var, gig0Var), this.f138875c);
    }

    /* JADX INFO: renamed from: b */
    public abstract Object mo121852b(mmg0 mmg0Var, File file);

    /* JADX WARN: Code duplicated, block: B:37:0x009b  */
    /* JADX INFO: renamed from: d */
    public final void m159331d(int i, long j, String str, mgg0 mgg0Var) {
        String strGroup;
        boolean z;
        boolean z2;
        ymg0 ymg0Var;
        ukg0 ukg0Var;
        if (mgg0Var == null) {
            return;
        }
        if ("true".equals(SudGIP.getCfg().getAdvancedConfigMap().get(ISudCfg.PRIORITY_EMBEDDED_GAME_PKG))) {
            String str2 = (String) sig0.f164716a.f106932c.get(Long.valueOf(j));
            if (!TextUtils.isEmpty(str2)) {
                mo126615g(j, str2, mgg0Var);
                return;
            }
        }
        asg0 asg0Var = mlg0.f134430e;
        if ((asg0Var == null || (ymg0Var = asg0Var.f71451c) == null || (ukg0Var = ymg0Var.f199005g) == null) ? true : ukg0Var.f176923a) {
            String str3 = (String) sig0.f164716a.f106932c.get(Long.valueOf(j));
            if (TextUtils.isEmpty(str3)) {
                z2 = false;
            } else {
                Matcher matcher = Pattern.compile("\\d+(\\.\\d+){3}").matcher(str3);
                strGroup = matcher.find() ? matcher.group() : null;
                if (TextUtils.isEmpty(strGroup)) {
                    z2 = false;
                } else {
                    if (TextUtils.isEmpty(str)) {
                        m159333f(j, strGroup, str3, mgg0Var);
                    } else if (strGroup.equals(str)) {
                        mo126615g(j, str3, mgg0Var);
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
            String str4 = (String) sig0.f164716a.f106932c.get(Long.valueOf(j));
            if (TextUtils.isEmpty(str4)) {
                z = false;
            } else {
                Matcher matcher2 = Pattern.compile("\\d+(\\.\\d+){3}").matcher(str4);
                strGroup = matcher2.find() ? matcher2.group() : null;
                if (TextUtils.isEmpty(strGroup)) {
                    mo126615g(j, str4, mgg0Var);
                } else {
                    m159333f(j, strGroup, str4, mgg0Var);
                }
                z = true;
            }
            if (z) {
                return;
            }
        }
        mmg0 mmg0VarM141028a = jdg0.m141028a(this.f138874b.f102111a.getString(String.valueOf(j), ""));
        if (mmg0VarM141028a != null) {
            LogUtils.file("RealSudGamePackageManager", "isPackageInstalled gamePackageInfo != null");
            String str5 = f138872d;
            SudLogger.m221565d(str5, "isPackageInstalled gamePackageInfo != null");
            if (!TextUtils.isEmpty(mmg0VarM141028a.f134666d)) {
                String strMo126616j = mo126616j(mmg0VarM141028a.f134665c);
                String absolutePath = new File(strMo126616j, mmg0VarM141028a.f134666d).getAbsolutePath();
                clg0 clg0Var = new clg0();
                clg0Var.f81405a = Sudfor.LoadMGPackageGamePackage;
                clg0Var.f81406b = str;
                clg0Var.f81407c = mmg0VarM141028a.f134664b;
                clg0Var.f81408d = strMo126616j;
                clg0Var.f81409e = mmg0VarM141028a.f134666d;
                clg0Var.f81410f = mmg0VarM141028a.f134667e;
                clg0Var.f81411g = i;
                String str6 = t8g0.f168916d;
                o6g0.f142345a.getClass();
                boolean zM187551d = t8g0.m187551d(clg0Var);
                LogUtils.file("RealSudGamePackageManager", "isPackageInstalled isOk=" + zM187551d);
                SudLogger.m221565d(str5, "isPackageInstalled isOk=" + zM187551d);
                if (zM187551d) {
                    mmg0VarM141028a.f134668f = System.currentTimeMillis();
                    this.f138874b.m125554g(mmg0VarM141028a);
                    mgg0Var.mo154544a(true, mo126614c(absolutePath), true);
                    return;
                }
                this.f138874b.m125550c(j);
            }
        }
        mgg0Var.mo154544a(false, "", true);
    }

    /* JADX INFO: renamed from: e */
    public final void m159332e(long j) {
        ArrayList arrayListM125549b = this.f138874b.m125549b();
        if (arrayListM125549b.size() > this.f138873a) {
            for (mmg0 mmg0Var : arrayListM125549b.subList(0, arrayListM125549b.size() - this.f138873a)) {
                if (mmg0Var.f134663a != j) {
                    LogUtils.file("RealSudGamePackageManager", "removeDiskCacheLimit mgId:" + mmg0Var.f134663a);
                    this.f138874b.m125550c(mmg0Var.f134663a);
                    String str = mo126616j(mmg0Var.f134665c) + "/" + mmg0Var.f134666d;
                    String str2 = afg0.f69172a;
                    LogUtils.file(FileUtils.TAG, "deleteFile result:" + new File(str).delete());
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004e  */
    /* JADX INFO: renamed from: f */
    public final void m159333f(long j, String str, String str2, mgg0 mgg0Var) {
        boolean zExists;
        byte b;
        mmg0 mmg0VarM141028a = jdg0.m141028a(this.f138874b.f102111a.getString(String.valueOf(j), ""));
        if (mmg0VarM141028a == null || TextUtils.isEmpty(mmg0VarM141028a.f134664b) || TextUtils.isEmpty(mmg0VarM141028a.f134666d)) {
            zExists = false;
        } else {
            String absolutePath = new File(mo126616j(mmg0VarM141028a.f134665c), mmg0VarM141028a.f134666d).getAbsolutePath();
            String str3 = afg0.f69172a;
            if (absolutePath == null) {
                zExists = false;
            } else {
                zExists = new File(absolutePath).exists();
            }
        }
        if (!zExists) {
            mo126615g(j, str2, mgg0Var);
            return;
        }
        mmg0 mmg0VarM141028a2 = jdg0.m141028a(this.f138874b.f102111a.getString(String.valueOf(j), ""));
        String[] strArrSplit = mmg0VarM141028a2.f134664b.split("\\.");
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
            mgg0Var.mo154544a(true, mo126614c(new File(mo126616j(mmg0VarM141028a2.f134665c), mmg0VarM141028a2.f134666d).getAbsolutePath()), false);
        } else {
            mo126615g(j, str2, mgg0Var);
        }
    }

    /* JADX INFO: renamed from: g */
    public void mo126615g(long j, String str, mgg0 mgg0Var) {
        mgg0Var.mo154544a(true, str, false);
    }

    /* JADX INFO: renamed from: h */
    public abstract void mo121853h(String str, Object obj, tog0 tog0Var, cdg0 cdg0Var);

    /* JADX INFO: renamed from: i */
    public final void m159334i(dkg0 dkg0Var) {
        l8g0 l8g0Var = (l8g0) dkg0Var;
        LogUtils.file("SudGameLoadingStageLoadPackage", "PackageInstallListener.onInstallStart");
        String str = l9g0.f127108j;
        SudLogger.m221565d(str, "PackageInstallListener.onInstallStart");
        l9g0 l9g0Var = l8g0Var.f126827a;
        if (!l9g0Var.f127114f) {
            l9g0Var.f127111c.m116843c(l9g0Var.f127109a.getString(C22396R.string.f207527x86f56e8));
        }
        l9g0 l9g0Var2 = l8g0Var.f126827a;
        if (!l9g0Var2.f127114f) {
            l9g0Var2.f127111c.m116843c(l9g0Var2.f127109a.getString(C22396R.string.f207526xbd01b860));
        }
        LogUtils.file("SudGameLoadingStageLoadPackage", "PackageInstallListener.onSuccess");
        SudLogger.m221565d(str, "PackageInstallListener.onSuccess");
        l9g0 l9g0Var3 = l8g0Var.f126827a;
        if (l9g0Var3.f127114f) {
            return;
        }
        l9g0Var3.f127111c.m116843c(l9g0Var3.f127109a.getString(C22396R.string.f207525x5c593b30));
        l8g0Var.f126827a.f127111c.m116841a(3);
    }

    /* JADX INFO: renamed from: j */
    public String mo126616j(String str) {
        return mo121854k(str);
    }

    /* JADX INFO: renamed from: k */
    public abstract String mo121854k(String str);

    /* JADX INFO: renamed from: c */
    public String mo126614c(String str) {
        return str;
    }
}
