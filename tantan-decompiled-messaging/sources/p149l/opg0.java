package p149l;

import Sudabstract.Sudfor;
import android.content.Context;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import tech.sud.gip.base.ThreadUtils;
import tech.sud.gip.core.GameInfo;
import tech.sud.gip.core.ISudGamePkgPreload;
import tech.sud.gip.core.ISudListenerPreloadMGPkg;
import tech.sud.gip.core.PkgDownloadStatus;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class opg0 implements ISudGamePkgPreload {

    /* JADX INFO: renamed from: c */
    public static volatile opg0 f144995c;

    /* JADX INFO: renamed from: a */
    public final HashMap f144996a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final ipg0 f144997b = new ipg0(this);

    public opg0(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (vcg0.f180926c == null) {
            vcg0.f180926c = new vcg0(applicationContext);
        }
    }

    @Override // tech.sud.gip.core.ISudGamePkgPreload
    public final void cancelPreloadMGPkgList(List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Long l2 = (Long) it.next();
            if (l2 != null) {
                long jLongValue = l2.longValue();
                veg0 veg0Var = (veg0) this.f144996a.get(l2);
                if (veg0Var != null) {
                    long j = veg0Var.f181193f;
                    long j2 = veg0Var.f181194g;
                    PkgDownloadStatus pkgDownloadStatus = PkgDownloadStatus.PKG_DOWNLOAD_CANCELED;
                    veg0Var.f181193f = j;
                    veg0Var.f181194g = j2;
                    ArrayList arrayList = veg0Var.f181189b;
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        ((ISudListenerPreloadMGPkg) arrayList.get(i)).onPreloadStatus(veg0Var.f181188a, j, j2, pkgDownloadStatus);
                    }
                    veg0Var.f181190c = false;
                    veg0Var.f181189b.clear();
                    ipg0 ipg0Var = veg0Var.f181195h;
                    if (ipg0Var != null) {
                        ipg0Var.f114294a.f144996a.remove(Long.valueOf(veg0Var.f181188a));
                    }
                }
                String str = t8g0.f168916d;
                t8g0 t8g0Var = o6g0.f142345a;
                k8g0 k8g0VarM187553b = t8g0Var.m187553b(jLongValue);
                if (k8g0VarM187553b != null) {
                    Iterator it2 = k8g0VarM187553b.f121823l.iterator();
                    while (it2.hasNext()) {
                        o7g0 o7g0Var = (o7g0) it2.next();
                        Sudfor sudforMo111013b = o7g0Var.mo111013b();
                        if (sudforMo111013b == Sudfor.PreloadPackageCore || sudforMo111013b == Sudfor.PreloadPackageGamePackage) {
                            o7g0Var.mo111014c(k8g0VarM187553b.f121828q, k8g0VarM187553b.f121827p, PkgDownloadStatus.PKG_DOWNLOAD_CANCELED);
                            it2.remove();
                        }
                    }
                    Iterator it3 = k8g0VarM187553b.f121821j.iterator();
                    while (it3.hasNext()) {
                        Sudfor sudfor = (Sudfor) it3.next();
                        if (sudfor == Sudfor.PreloadPackageCore || sudfor == Sudfor.PreloadPackageGamePackage) {
                            it3.remove();
                        }
                    }
                    if (k8g0VarM187553b.f121823l.size() == 0) {
                        k8g0VarM187553b.m144940f();
                    }
                    t8g0Var.m187554c();
                }
            }
        }
    }

    @Override // tech.sud.gip.core.ISudGamePkgPreload
    public final void pausePreloadMGPkgList(List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Long l2 = (Long) it.next();
            if (l2 != null) {
                long jLongValue = l2.longValue();
                String str = t8g0.f168916d;
                t8g0 t8g0Var = o6g0.f142345a;
                k8g0 k8g0VarM187553b = t8g0Var.m187553b(jLongValue);
                if (k8g0VarM187553b != null && !k8g0VarM187553b.m144941g()) {
                    LogUtils.file("SudDownloadTask", "pauseDownload mgId:" + k8g0VarM187553b.f121813b + "  status:" + k8g0VarM187553b.f121819h);
                    SudLogger.m221565d(k8g0.f121811u, "pauseDownload mgId:" + k8g0VarM187553b.f121813b + "  status:" + k8g0VarM187553b.f121819h);
                    wrg0 wrg0Var = k8g0VarM187553b.f121825n;
                    if (wrg0Var != null) {
                        wrg0Var.f187795a.clear();
                        k8g0VarM187553b.f121825n.cancel();
                        k8g0VarM187553b.f121825n = null;
                    }
                    if (k8g0VarM187553b.m144942h()) {
                        k8g0VarM187553b.f121817f = 3;
                        k8g0VarM187553b.f121812a.m184804n();
                    } else {
                        PkgDownloadStatus pkgDownloadStatus = PkgDownloadStatus.PKG_DOWNLOAD_PAUSE;
                        k8g0VarM187553b.f121819h = pkgDownloadStatus;
                        k8g0VarM187553b.f121829r = System.currentTimeMillis();
                        k8g0VarM187553b.m144938d(pkgDownloadStatus);
                    }
                    t8g0Var.m187554c();
                }
            }
        }
    }

    @Override // tech.sud.gip.core.ISudGamePkgPreload
    public final void preloadMGPkgList(Context context, List list, ISudListenerPreloadMGPkg iSudListenerPreloadMGPkg) {
        k8g0 k8g0Var;
        if (list == null || list.size() == 0) {
            return;
        }
        String str = t8g0.f168916d;
        t8g0 t8g0Var = o6g0.f142345a;
        t8g0Var.getClass();
        if (ThreadUtils.checkUIThread() && list.size() != 0) {
            for (int size = list.size() - 1; size >= 0; size--) {
                Long l2 = (Long) list.get(size);
                if (l2 != null) {
                    long jLongValue = l2.longValue();
                    ArrayList arrayList = t8g0Var.f168917a;
                    int size2 = arrayList.size();
                    int i = 0;
                    while (true) {
                        if (i >= size2) {
                            k8g0Var = null;
                            break;
                        }
                        Object obj = arrayList.get(i);
                        i++;
                        k8g0Var = (k8g0) obj;
                        if (k8g0Var.f121813b == jLongValue && !k8g0Var.m144941g()) {
                            break;
                        }
                    }
                    if (k8g0Var != null && t8g0Var.f168917a.remove(k8g0Var)) {
                        t8g0Var.f168917a.add(0, k8g0Var);
                    }
                }
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Long l3 = (Long) it.next();
            if (l3 != null) {
                long jLongValue2 = l3.longValue();
                veg0 veg0Var = (veg0) this.f144996a.get(l3);
                if (veg0Var == null) {
                    veg0Var = new veg0(jLongValue2);
                    if (iSudListenerPreloadMGPkg != null && !veg0Var.f181189b.contains(iSudListenerPreloadMGPkg)) {
                        veg0Var.f181189b.add(iSudListenerPreloadMGPkg);
                    }
                    veg0Var.f181195h = this.f144997b;
                    this.f144996a.put(l3, veg0Var);
                } else if (iSudListenerPreloadMGPkg != null && !veg0Var.f181189b.contains(iSudListenerPreloadMGPkg)) {
                    veg0Var.f181189b.add(iSudListenerPreloadMGPkg);
                }
                if (!veg0Var.f181190c) {
                    veg0Var.f181190c = true;
                    long j = veg0Var.f181188a;
                    k9g0 k9g0Var = new k9g0(veg0Var);
                    String str2 = mlg0.f134426a;
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        mqg0 mqg0Var = mlg0.f134427b;
                        if (mqg0Var.f135224a) {
                            GameInfo gameInfo = (GameInfo) mqg0Var.f135238o.get(Long.valueOf(j));
                            if (gameInfo != null) {
                                k9g0Var.onSuccess(gameInfo);
                            } else if (mqg0Var.f135224a) {
                                GameInfo gameInfo2 = (GameInfo) mqg0Var.f135238o.get(Long.valueOf(j));
                                lkg0.f128532c.execute(new z8g0(mqg0Var, j, mqg0Var.f135232i, gameInfo2 != null ? gameInfo2.clientVersion : 0L, null, k9g0Var));
                            } else {
                                k9g0Var.onFailure(-10103, "Please call initSDK first successfully");
                            }
                        } else {
                            k9g0Var.onFailure(-10103, "Please call initSDK first successfully");
                        }
                    } else {
                        k9g0Var.onFailure(-1, "Please call on UI or Main thread");
                    }
                }
            }
        }
    }

    @Override // tech.sud.gip.core.ISudGamePkgPreload
    public final void resumePreloadMGPkgList(List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Long l2 = (Long) it.next();
            if (l2 != null) {
                long jLongValue = l2.longValue();
                String str = t8g0.f168916d;
                t8g0 t8g0Var = o6g0.f142345a;
                k8g0 k8g0VarM187553b = t8g0Var.m187553b(jLongValue);
                if (k8g0VarM187553b != null && k8g0VarM187553b.f121819h == PkgDownloadStatus.PKG_DOWNLOAD_PAUSE) {
                    PkgDownloadStatus pkgDownloadStatus = PkgDownloadStatus.PKG_DOWNLOAD_WAITING;
                    k8g0VarM187553b.f121819h = pkgDownloadStatus;
                    k8g0VarM187553b.f121829r = System.currentTimeMillis();
                    k8g0VarM187553b.m144938d(pkgDownloadStatus);
                    t8g0Var.m187554c();
                }
            }
        }
    }
}
