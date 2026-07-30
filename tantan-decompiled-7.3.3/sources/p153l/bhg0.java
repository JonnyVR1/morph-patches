package p153l;

import Sudabstract.Sudfor;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import tech.sud.gip.core.PkgDownloadStatus;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class bhg0 {

    /* JADX INFO: renamed from: d */
    public static final String f76783d = "SudGIP ".concat(bhg0.class.getSimpleName());

    /* JADX INFO: renamed from: a */
    public final ArrayList f76784a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final ltg0 f76785b = new ltg0();

    /* JADX INFO: renamed from: c */
    public final dzg0 f76786c = new dzg0(this);

    public bhg0() {
        jwg0.m147162a().f122919a.f114578a = Math.max(1, 3);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m104340d(ktg0 ktg0Var) {
        String str;
        File[] fileArrListFiles;
        String str2 = ktg0Var.f128692b;
        if (str2 != null && !str2.isEmpty() && (str = ktg0Var.f128693c) != null && str.equals(ktg0Var.f128692b)) {
            Sudfor sudfor = ktg0Var.f128691a;
            if (sudfor == Sudfor.LoadMGPackageGamePackage || sudfor == Sudfor.PreloadPackageGamePackage) {
                boolean zM141128b = ing0.m141128b(ktg0Var.f128696f, ktg0Var.f128694d, ktg0Var.f128695e);
                LogUtils.file("SudDownloadManager", "isPackageInstalled isOk=" + zM141128b);
                SudLogger.m222811d(f76783d, "isPackageInstalled isOk=" + zM141128b);
                return zM141128b;
            }
            if (sudfor == Sudfor.LoadMGPackageCore || sudfor == Sudfor.PreloadPackageCore) {
                int i = ktg0Var.f128697g;
                if (i == 1) {
                    boolean zM141128b2 = ing0.m141128b(ktg0Var.f128696f, ktg0Var.f128694d, ktg0Var.f128695e);
                    boolean zM141128b3 = ing0.m141128b(0L, ktg0Var.f128694d, null);
                    LogUtils.file("SudDownloadManager", "isCoreInstalled isOK1=" + zM141128b2 + "  isOk2=" + zM141128b3);
                    SudLogger.m222811d(f76783d, "isCoreInstalled isOK1=" + zM141128b2 + "  isOk2=" + zM141128b3);
                    if (zM141128b2 && zM141128b3) {
                        File file = new File(ktg0Var.f128694d);
                        kjg0 kjg0VarM150043a = kjg0.m150043a("TechSudMGPGlobal.sp");
                        if (!kjg0VarM150043a.f127100a.getBoolean("key_fix_android14_read_only_cocos", false)) {
                            kjg0VarM150043a.m150047e("key_fix_android14_read_only_cocos");
                            rsg0.m182971d(file);
                        }
                        return true;
                    }
                } else if (i == 5) {
                    File file2 = new File(ktg0Var.f128694d);
                    if (file2.exists() && file2.isDirectory() && (fileArrListFiles = file2.listFiles()) != null && fileArrListFiles.length > 0 && fileArrListFiles[0].isFile() && fileArrListFiles[0].length() > 0) {
                        kjg0 kjg0VarM150043a2 = kjg0.m150043a("TechSudMGPGlobal.sp");
                        if (!kjg0VarM150043a2.f127100a.getBoolean("key_fix_android14_read_only_unity", false)) {
                            kjg0VarM150043a2.m150047e("key_fix_android14_read_only_unity");
                            rsg0.m182971d(file2);
                        }
                        return true;
                    }
                }
            }
        }
        LogUtils.file("SudDownloadManager", "isPackageInstalled not exists:" + ktg0Var.f128694d);
        SudLogger.m222811d(f76783d, "isPackageInstalled not exists:" + ktg0Var.f128694d);
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final long m104341a(oqg0 oqg0Var, String str, String str2, wfg0 wfg0Var, prg0 prg0Var) {
        sgg0 sgg0Var;
        String str3;
        sgg0 sgg0Var2;
        boolean z;
        LogUtils.file("SudDownloadManager", "downloadPackage:" + oqg0Var.f148590c);
        SudLogger.m222811d(f76783d, "downloadPackage:" + oqg0Var.f148590c);
        ArrayList arrayList = this.f76784a;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            sgg0Var = null;
            if (i2 >= size) {
                str3 = str2;
                sgg0Var2 = null;
                break;
            }
            Object obj = arrayList.get(i2);
            i2++;
            sgg0Var2 = (sgg0) obj;
            long j = oqg0Var.f148590c;
            String str4 = oqg0Var.f148591d;
            if (sgg0Var2 != null && sgg0Var2.f167852b == j && Objects.equals(sgg0Var2.f167851a.f73494c, str4)) {
                if (Objects.equals(sgg0Var2.f167854d, str)) {
                    str3 = str2;
                    if (Objects.equals(sgg0Var2.f167855e, str3)) {
                        break;
                    }
                }
            }
        }
        if (sgg0Var2 == null) {
            try {
                ltg0 ltg0Var = this.f76785b;
                long j2 = ltg0Var.f133545a + 1;
                ltg0Var.f133545a = j2;
                sgg0 sgg0Var3 = new sgg0(oqg0Var, j2, str, str3, this.f76786c);
                sgg0Var3.m185775c(wfg0Var);
                sgg0Var3.f167859i = prg0Var;
                PkgDownloadStatus pkgDownloadStatus = PkgDownloadStatus.PKG_DOWNLOAD_WAITING;
                sgg0Var3.f167858h = pkgDownloadStatus;
                sgg0Var3.f167868r = System.currentTimeMillis();
                sgg0Var3.m185776d(pkgDownloadStatus);
                this.f76784a.add(sgg0Var3);
                sgg0Var2 = sgg0Var3;
            } catch (Exception e) {
                LogUtils.file("SudDownloadManager", "create download task error:" + LogUtils.getErrorInfo(e));
                wfg0Var.mo154722e(-1, "create download task error:" + e, null);
                sgg0Var2 = null;
            }
            if (sgg0Var2 == null) {
                return 0L;
            }
            z = true;
        } else {
            sgg0Var2.m185775c(wfg0Var);
            z = false;
        }
        PkgDownloadStatus pkgDownloadStatus2 = sgg0Var2.f167858h;
        if (pkgDownloadStatus2 == PkgDownloadStatus.PKG_DOWNLOAD_PAUSE || pkgDownloadStatus2 == PkgDownloadStatus.PKG_DOWNLOAD_COMPLETED || pkgDownloadStatus2 == PkgDownloadStatus.PKG_DOWNLOAD_CANCELED) {
            PkgDownloadStatus pkgDownloadStatus3 = PkgDownloadStatus.PKG_DOWNLOAD_WAITING;
            sgg0Var2.f167858h = pkgDownloadStatus3;
            sgg0Var2.f167868r = System.currentTimeMillis();
            sgg0Var2.m185776d(pkgDownloadStatus3);
        }
        Sudfor sudfor = oqg0Var.f148589b;
        if ((sudfor == Sudfor.LoadMGPackageCore || sudfor == Sudfor.LoadMGPackageGamePackage) && this.f76784a.remove(sgg0Var2)) {
            this.f76784a.add(0, sgg0Var2);
        }
        m104343c();
        if (z && sgg0Var2.m185779g()) {
            ArrayList arrayList2 = sgg0Var2.f167860j;
            int size2 = arrayList2.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj2 = arrayList2.get(i3);
                i3++;
                Sudfor sudfor2 = (Sudfor) obj2;
                if (sudfor2 == Sudfor.LoadMGPackageGamePackage || sudfor2 == Sudfor.PreloadPackageGamePackage) {
                    long j3 = sgg0Var2.f167852b;
                    ArrayList arrayList3 = this.f76784a;
                    int size3 = arrayList3.size();
                    int i4 = 0;
                    loop2: while (i4 < size3) {
                        Object obj3 = arrayList3.get(i4);
                        i4++;
                        sgg0 sgg0Var4 = (sgg0) obj3;
                        if (sgg0Var4.f167852b == j3 && !sgg0Var4.m185779g()) {
                            ArrayList arrayList4 = sgg0Var4.f167860j;
                            int size4 = arrayList4.size();
                            int i5 = 0;
                            while (i5 < size4) {
                                Object obj4 = arrayList4.get(i5);
                                i5++;
                                Sudfor sudfor3 = (Sudfor) obj4;
                                if (sudfor3 == Sudfor.LoadMGPackageGamePackage || sudfor3 == Sudfor.PreloadPackageGamePackage) {
                                    sgg0Var = sgg0Var4;
                                    break loop2;
                                }
                            }
                        }
                    }
                    if (sgg0Var == null) {
                        break;
                    }
                    LogUtils.file("SudDownloadManager", "replaceTask:" + sgg0Var2.f167853c);
                    if (sgg0Var2 != sgg0Var) {
                        ArrayList arrayList5 = sgg0Var.f167862l;
                        int size5 = arrayList5.size();
                        while (i < size5) {
                            Object obj5 = arrayList5.get(i);
                            i++;
                            sgg0Var2.m185775c((wfg0) obj5);
                        }
                        sgg0Var.f167862l.clear();
                    }
                    sgg0Var.m185778f();
                    break;
                }
            }
        }
        return sgg0Var2.f167853c;
    }

    /* JADX INFO: renamed from: b */
    public final sgg0 m104342b(long j) {
        ArrayList arrayList = this.f76784a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            sgg0 sgg0Var = (sgg0) obj;
            if (sgg0Var.f167852b == j) {
                return sgg0Var;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m104343c() {
        sgg0 sgg0Var;
        sgg0 sgg0Var2;
        ArrayList arrayList = this.f76784a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (((sgg0) obj).m185779g()) {
                ArrayList arrayList2 = this.f76784a;
                int size2 = arrayList2.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj2 = arrayList2.get(i2);
                    i2++;
                    sgg0 sgg0Var3 = (sgg0) obj2;
                    if (!sgg0Var3.m185779g()) {
                        if (sgg0Var3.m185780h()) {
                            LogUtils.file("SudDownloadTask", "hangUp:" + sgg0Var3.f167858h + "  :mgId:" + sgg0Var3.f167852b);
                            SudLogger.m222811d(sgg0.f167850u, "hangUp:" + sgg0Var3.f167858h + "  :mgId:" + sgg0Var3.f167852b);
                            e0h0 e0h0Var = sgg0Var3.f167864n;
                            if (e0h0Var != null) {
                                e0h0Var.f91463a.clear();
                                sgg0Var3.f167864n.cancel();
                                sgg0Var3.f167864n = null;
                            }
                            if (sgg0Var3.m185780h()) {
                                sgg0Var3.f167856f = 4;
                                sgg0Var3.f167851a.m100399n();
                            } else {
                                PkgDownloadStatus pkgDownloadStatus = PkgDownloadStatus.PKG_DOWNLOAD_WAITING;
                                sgg0Var3.f167858h = pkgDownloadStatus;
                                sgg0Var3.f167868r = System.currentTimeMillis();
                                sgg0Var3.m185776d(pkgDownloadStatus);
                            }
                        } else {
                            PkgDownloadStatus pkgDownloadStatus2 = PkgDownloadStatus.PKG_DOWNLOAD_WAITING;
                            sgg0Var3.f167858h = pkgDownloadStatus2;
                            sgg0Var3.f167868r = System.currentTimeMillis();
                            sgg0Var3.m185776d(pkgDownloadStatus2);
                        }
                    }
                }
                while (true) {
                    ArrayList arrayList3 = this.f76784a;
                    int size3 = arrayList3.size();
                    int i3 = 0;
                    int i4 = 0;
                    while (i3 < size3) {
                        Object obj3 = arrayList3.get(i3);
                        i3++;
                        if (((sgg0) obj3).m185780h()) {
                            i4++;
                        }
                    }
                    if (i4 >= 3) {
                        return;
                    }
                    ArrayList arrayList4 = this.f76784a;
                    int size4 = arrayList4.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= size4) {
                            sgg0Var2 = null;
                            break;
                        }
                        Object obj4 = arrayList4.get(i5);
                        i5++;
                        sgg0Var2 = (sgg0) obj4;
                        if (sgg0Var2.f167858h == PkgDownloadStatus.PKG_DOWNLOAD_WAITING && sgg0Var2.m185779g()) {
                            break;
                        }
                    }
                    if (sgg0Var2 == null) {
                        return;
                    } else {
                        sgg0Var2.m185777e();
                    }
                }
            }
        }
        while (true) {
            ArrayList arrayList5 = this.f76784a;
            int size5 = arrayList5.size();
            int i6 = 0;
            int i7 = 0;
            while (i6 < size5) {
                Object obj5 = arrayList5.get(i6);
                i6++;
                if (((sgg0) obj5).m185780h()) {
                    i7++;
                }
            }
            if (i7 >= 3) {
                return;
            }
            ArrayList arrayList6 = this.f76784a;
            int size6 = arrayList6.size();
            int i8 = 0;
            do {
                if (i8 >= size6) {
                    sgg0Var = null;
                    break;
                } else {
                    Object obj6 = arrayList6.get(i8);
                    i8++;
                    sgg0Var = (sgg0) obj6;
                }
            } while (sgg0Var.f167858h != PkgDownloadStatus.PKG_DOWNLOAD_WAITING);
            if (sgg0Var == null) {
                return;
            } else {
                sgg0Var.m185777e();
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m104344e(long j) {
        sgg0 sgg0Var;
        ArrayList arrayList = this.f76784a;
        int size = arrayList.size();
        int i = 0;
        do {
            if (i >= size) {
                sgg0Var = null;
                break;
            } else {
                Object obj = arrayList.get(i);
                i++;
                sgg0Var = (sgg0) obj;
            }
        } while (sgg0Var.f167853c != j);
        if (sgg0Var != null) {
            Iterator it = sgg0Var.f167862l.iterator();
            while (it.hasNext()) {
                wfg0 wfg0Var = (wfg0) it.next();
                Sudfor sudforMo154719b = wfg0Var.mo154719b();
                if (sudforMo154719b == Sudfor.LoadMGPackageCore || sudforMo154719b == Sudfor.LoadMGPackageGamePackage) {
                    wfg0Var.mo154720c(sgg0Var.f167867q, sgg0Var.f167866p, PkgDownloadStatus.PKG_DOWNLOAD_CANCELED);
                    it.remove();
                }
            }
            Iterator it2 = sgg0Var.f167860j.iterator();
            while (it2.hasNext()) {
                Sudfor sudfor = (Sudfor) it2.next();
                if (sudfor == Sudfor.LoadMGPackageCore || sudfor == Sudfor.LoadMGPackageGamePackage) {
                    it2.remove();
                }
            }
            if (sgg0Var.f167862l.size() == 0) {
                sgg0Var.m185778f();
            }
            m104343c();
        }
    }
}
