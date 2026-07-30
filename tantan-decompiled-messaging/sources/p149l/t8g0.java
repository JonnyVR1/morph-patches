package p149l;

import Sudabstract.Sudfor;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import tech.sud.gip.core.PkgDownloadStatus;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class t8g0 {

    /* JADX INFO: renamed from: d */
    public static final String f168916d = "SudGIP ".concat(t8g0.class.getSimpleName());

    /* JADX INFO: renamed from: a */
    public final ArrayList f168917a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final dlg0 f168918b = new dlg0();

    /* JADX INFO: renamed from: c */
    public final vqg0 f168919c = new vqg0(this);

    public t8g0() {
        bog0.m102944a().f76515a.f67759a = Math.max(1, 3);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m187551d(clg0 clg0Var) {
        String str;
        File[] fileArrListFiles;
        String str2 = clg0Var.f81406b;
        if (str2 != null && !str2.isEmpty() && (str = clg0Var.f81407c) != null && str.equals(clg0Var.f81406b)) {
            Sudfor sudfor = clg0Var.f81405a;
            if (sudfor == Sudfor.LoadMGPackageGamePackage || sudfor == Sudfor.PreloadPackageGamePackage) {
                boolean zM96221b = afg0.m96221b(clg0Var.f81410f, clg0Var.f81408d, clg0Var.f81409e);
                LogUtils.file("SudDownloadManager", "isPackageInstalled isOk=" + zM96221b);
                SudLogger.m221565d(f168916d, "isPackageInstalled isOk=" + zM96221b);
                return zM96221b;
            }
            if (sudfor == Sudfor.LoadMGPackageCore || sudfor == Sudfor.PreloadPackageCore) {
                int i = clg0Var.f81411g;
                if (i == 1) {
                    boolean zM96221b2 = afg0.m96221b(clg0Var.f81410f, clg0Var.f81408d, clg0Var.f81409e);
                    boolean zM96221b3 = afg0.m96221b(0L, clg0Var.f81408d, null);
                    LogUtils.file("SudDownloadManager", "isCoreInstalled isOK1=" + zM96221b2 + "  isOk2=" + zM96221b3);
                    SudLogger.m221565d(f168916d, "isCoreInstalled isOK1=" + zM96221b2 + "  isOk2=" + zM96221b3);
                    if (zM96221b2 && zM96221b3) {
                        File file = new File(clg0Var.f81408d);
                        cbg0 cbg0VarM105995a = cbg0.m105995a("TechSudMGPGlobal.sp");
                        if (!cbg0VarM105995a.f80140a.getBoolean("key_fix_android14_read_only_cocos", false)) {
                            cbg0VarM105995a.m105999e("key_fix_android14_read_only_cocos");
                            jkg0.m141872d(file);
                        }
                        return true;
                    }
                } else if (i == 5) {
                    File file2 = new File(clg0Var.f81408d);
                    if (file2.exists() && file2.isDirectory() && (fileArrListFiles = file2.listFiles()) != null && fileArrListFiles.length > 0 && fileArrListFiles[0].isFile() && fileArrListFiles[0].length() > 0) {
                        cbg0 cbg0VarM105995a2 = cbg0.m105995a("TechSudMGPGlobal.sp");
                        if (!cbg0VarM105995a2.f80140a.getBoolean("key_fix_android14_read_only_unity", false)) {
                            cbg0VarM105995a2.m105999e("key_fix_android14_read_only_unity");
                            jkg0.m141872d(file2);
                        }
                        return true;
                    }
                }
            }
        }
        LogUtils.file("SudDownloadManager", "isPackageInstalled not exists:" + clg0Var.f81408d);
        SudLogger.m221565d(f168916d, "isPackageInstalled not exists:" + clg0Var.f81408d);
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final long m187552a(gig0 gig0Var, String str, String str2, o7g0 o7g0Var, hjg0 hjg0Var) {
        k8g0 k8g0Var;
        String str3;
        k8g0 k8g0Var2;
        boolean z;
        LogUtils.file("SudDownloadManager", "downloadPackage:" + gig0Var.f102895c);
        SudLogger.m221565d(f168916d, "downloadPackage:" + gig0Var.f102895c);
        ArrayList arrayList = this.f168917a;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            k8g0Var = null;
            if (i2 >= size) {
                str3 = str2;
                k8g0Var2 = null;
                break;
            }
            Object obj = arrayList.get(i2);
            i2++;
            k8g0Var2 = (k8g0) obj;
            long j = gig0Var.f102895c;
            String str4 = gig0Var.f102896d;
            if (k8g0Var2 != null && k8g0Var2.f121813b == j && Objects.equals(k8g0Var2.f121812a.f165191c, str4)) {
                if (Objects.equals(k8g0Var2.f121815d, str)) {
                    str3 = str2;
                    if (Objects.equals(k8g0Var2.f121816e, str3)) {
                        break;
                    }
                }
            }
        }
        if (k8g0Var2 == null) {
            try {
                dlg0 dlg0Var = this.f168918b;
                long j2 = dlg0Var.f86804a + 1;
                dlg0Var.f86804a = j2;
                k8g0 k8g0Var3 = new k8g0(gig0Var, j2, str, str3, this.f168919c);
                k8g0Var3.m144937c(o7g0Var);
                k8g0Var3.f121820i = hjg0Var;
                PkgDownloadStatus pkgDownloadStatus = PkgDownloadStatus.PKG_DOWNLOAD_WAITING;
                k8g0Var3.f121819h = pkgDownloadStatus;
                k8g0Var3.f121829r = System.currentTimeMillis();
                k8g0Var3.m144938d(pkgDownloadStatus);
                this.f168917a.add(k8g0Var3);
                k8g0Var2 = k8g0Var3;
            } catch (Exception e) {
                LogUtils.file("SudDownloadManager", "create download task error:" + LogUtils.getErrorInfo(e));
                o7g0Var.mo111016e(-1, "create download task error:" + e, null);
                k8g0Var2 = null;
            }
            if (k8g0Var2 == null) {
                return 0L;
            }
            z = true;
        } else {
            k8g0Var2.m144937c(o7g0Var);
            z = false;
        }
        PkgDownloadStatus pkgDownloadStatus2 = k8g0Var2.f121819h;
        if (pkgDownloadStatus2 == PkgDownloadStatus.PKG_DOWNLOAD_PAUSE || pkgDownloadStatus2 == PkgDownloadStatus.PKG_DOWNLOAD_COMPLETED || pkgDownloadStatus2 == PkgDownloadStatus.PKG_DOWNLOAD_CANCELED) {
            PkgDownloadStatus pkgDownloadStatus3 = PkgDownloadStatus.PKG_DOWNLOAD_WAITING;
            k8g0Var2.f121819h = pkgDownloadStatus3;
            k8g0Var2.f121829r = System.currentTimeMillis();
            k8g0Var2.m144938d(pkgDownloadStatus3);
        }
        Sudfor sudfor = gig0Var.f102894b;
        if ((sudfor == Sudfor.LoadMGPackageCore || sudfor == Sudfor.LoadMGPackageGamePackage) && this.f168917a.remove(k8g0Var2)) {
            this.f168917a.add(0, k8g0Var2);
        }
        m187554c();
        if (z && k8g0Var2.m144941g()) {
            ArrayList arrayList2 = k8g0Var2.f121821j;
            int size2 = arrayList2.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj2 = arrayList2.get(i3);
                i3++;
                Sudfor sudfor2 = (Sudfor) obj2;
                if (sudfor2 == Sudfor.LoadMGPackageGamePackage || sudfor2 == Sudfor.PreloadPackageGamePackage) {
                    long j3 = k8g0Var2.f121813b;
                    ArrayList arrayList3 = this.f168917a;
                    int size3 = arrayList3.size();
                    int i4 = 0;
                    loop2: while (i4 < size3) {
                        Object obj3 = arrayList3.get(i4);
                        i4++;
                        k8g0 k8g0Var4 = (k8g0) obj3;
                        if (k8g0Var4.f121813b == j3 && !k8g0Var4.m144941g()) {
                            ArrayList arrayList4 = k8g0Var4.f121821j;
                            int size4 = arrayList4.size();
                            int i5 = 0;
                            while (i5 < size4) {
                                Object obj4 = arrayList4.get(i5);
                                i5++;
                                Sudfor sudfor3 = (Sudfor) obj4;
                                if (sudfor3 == Sudfor.LoadMGPackageGamePackage || sudfor3 == Sudfor.PreloadPackageGamePackage) {
                                    k8g0Var = k8g0Var4;
                                    break loop2;
                                }
                            }
                        }
                    }
                    if (k8g0Var == null) {
                        break;
                    }
                    LogUtils.file("SudDownloadManager", "replaceTask:" + k8g0Var2.f121814c);
                    if (k8g0Var2 != k8g0Var) {
                        ArrayList arrayList5 = k8g0Var.f121823l;
                        int size5 = arrayList5.size();
                        while (i < size5) {
                            Object obj5 = arrayList5.get(i);
                            i++;
                            k8g0Var2.m144937c((o7g0) obj5);
                        }
                        k8g0Var.f121823l.clear();
                    }
                    k8g0Var.m144940f();
                    break;
                }
            }
        }
        return k8g0Var2.f121814c;
    }

    /* JADX INFO: renamed from: b */
    public final k8g0 m187553b(long j) {
        ArrayList arrayList = this.f168917a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            k8g0 k8g0Var = (k8g0) obj;
            if (k8g0Var.f121813b == j) {
                return k8g0Var;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m187554c() {
        k8g0 k8g0Var;
        k8g0 k8g0Var2;
        ArrayList arrayList = this.f168917a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (((k8g0) obj).m144941g()) {
                ArrayList arrayList2 = this.f168917a;
                int size2 = arrayList2.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj2 = arrayList2.get(i2);
                    i2++;
                    k8g0 k8g0Var3 = (k8g0) obj2;
                    if (!k8g0Var3.m144941g()) {
                        if (k8g0Var3.m144942h()) {
                            LogUtils.file("SudDownloadTask", "hangUp:" + k8g0Var3.f121819h + "  :mgId:" + k8g0Var3.f121813b);
                            SudLogger.m221565d(k8g0.f121811u, "hangUp:" + k8g0Var3.f121819h + "  :mgId:" + k8g0Var3.f121813b);
                            wrg0 wrg0Var = k8g0Var3.f121825n;
                            if (wrg0Var != null) {
                                wrg0Var.f187795a.clear();
                                k8g0Var3.f121825n.cancel();
                                k8g0Var3.f121825n = null;
                            }
                            if (k8g0Var3.m144942h()) {
                                k8g0Var3.f121817f = 4;
                                k8g0Var3.f121812a.m184804n();
                            } else {
                                PkgDownloadStatus pkgDownloadStatus = PkgDownloadStatus.PKG_DOWNLOAD_WAITING;
                                k8g0Var3.f121819h = pkgDownloadStatus;
                                k8g0Var3.f121829r = System.currentTimeMillis();
                                k8g0Var3.m144938d(pkgDownloadStatus);
                            }
                        } else {
                            PkgDownloadStatus pkgDownloadStatus2 = PkgDownloadStatus.PKG_DOWNLOAD_WAITING;
                            k8g0Var3.f121819h = pkgDownloadStatus2;
                            k8g0Var3.f121829r = System.currentTimeMillis();
                            k8g0Var3.m144938d(pkgDownloadStatus2);
                        }
                    }
                }
                while (true) {
                    ArrayList arrayList3 = this.f168917a;
                    int size3 = arrayList3.size();
                    int i3 = 0;
                    int i4 = 0;
                    while (i3 < size3) {
                        Object obj3 = arrayList3.get(i3);
                        i3++;
                        if (((k8g0) obj3).m144942h()) {
                            i4++;
                        }
                    }
                    if (i4 >= 3) {
                        return;
                    }
                    ArrayList arrayList4 = this.f168917a;
                    int size4 = arrayList4.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= size4) {
                            k8g0Var2 = null;
                            break;
                        }
                        Object obj4 = arrayList4.get(i5);
                        i5++;
                        k8g0Var2 = (k8g0) obj4;
                        if (k8g0Var2.f121819h == PkgDownloadStatus.PKG_DOWNLOAD_WAITING && k8g0Var2.m144941g()) {
                            break;
                        }
                    }
                    if (k8g0Var2 == null) {
                        return;
                    } else {
                        k8g0Var2.m144939e();
                    }
                }
            }
        }
        while (true) {
            ArrayList arrayList5 = this.f168917a;
            int size5 = arrayList5.size();
            int i6 = 0;
            int i7 = 0;
            while (i6 < size5) {
                Object obj5 = arrayList5.get(i6);
                i6++;
                if (((k8g0) obj5).m144942h()) {
                    i7++;
                }
            }
            if (i7 >= 3) {
                return;
            }
            ArrayList arrayList6 = this.f168917a;
            int size6 = arrayList6.size();
            int i8 = 0;
            do {
                if (i8 >= size6) {
                    k8g0Var = null;
                    break;
                } else {
                    Object obj6 = arrayList6.get(i8);
                    i8++;
                    k8g0Var = (k8g0) obj6;
                }
            } while (k8g0Var.f121819h != PkgDownloadStatus.PKG_DOWNLOAD_WAITING);
            if (k8g0Var == null) {
                return;
            } else {
                k8g0Var.m144939e();
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m187555e(long j) {
        k8g0 k8g0Var;
        ArrayList arrayList = this.f168917a;
        int size = arrayList.size();
        int i = 0;
        do {
            if (i >= size) {
                k8g0Var = null;
                break;
            } else {
                Object obj = arrayList.get(i);
                i++;
                k8g0Var = (k8g0) obj;
            }
        } while (k8g0Var.f121814c != j);
        if (k8g0Var != null) {
            Iterator it = k8g0Var.f121823l.iterator();
            while (it.hasNext()) {
                o7g0 o7g0Var = (o7g0) it.next();
                Sudfor sudforMo111013b = o7g0Var.mo111013b();
                if (sudforMo111013b == Sudfor.LoadMGPackageCore || sudforMo111013b == Sudfor.LoadMGPackageGamePackage) {
                    o7g0Var.mo111014c(k8g0Var.f121828q, k8g0Var.f121827p, PkgDownloadStatus.PKG_DOWNLOAD_CANCELED);
                    it.remove();
                }
            }
            Iterator it2 = k8g0Var.f121821j.iterator();
            while (it2.hasNext()) {
                Sudfor sudfor = (Sudfor) it2.next();
                if (sudfor == Sudfor.LoadMGPackageCore || sudfor == Sudfor.LoadMGPackageGamePackage) {
                    it2.remove();
                }
            }
            if (k8g0Var.f121823l.size() == 0) {
                k8g0Var.m144940f();
            }
            m187554c();
        }
    }
}
