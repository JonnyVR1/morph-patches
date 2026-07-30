package p153l;

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
public final class wxg0 implements ISudGamePkgPreload {

    /* JADX INFO: renamed from: c */
    public static volatile wxg0 f191490c;

    /* JADX INFO: renamed from: a */
    public final HashMap f191491a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final qxg0 f191492b = new qxg0(this);

    public wxg0(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (dlg0.f89532c == null) {
            dlg0.f89532c = new dlg0(applicationContext);
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
                dng0 dng0Var = (dng0) this.f191491a.get(l2);
                if (dng0Var != null) {
                    long j = dng0Var.f89804f;
                    long j2 = dng0Var.f89805g;
                    PkgDownloadStatus pkgDownloadStatus = PkgDownloadStatus.PKG_DOWNLOAD_CANCELED;
                    dng0Var.f89804f = j;
                    dng0Var.f89805g = j2;
                    ArrayList arrayList = dng0Var.f89800b;
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        ((ISudListenerPreloadMGPkg) arrayList.get(i)).onPreloadStatus(dng0Var.f89799a, j, j2, pkgDownloadStatus);
                    }
                    dng0Var.f89801c = false;
                    dng0Var.f89800b.clear();
                    qxg0 qxg0Var = dng0Var.f89806h;
                    if (qxg0Var != null) {
                        qxg0Var.f160046a.f191491a.remove(Long.valueOf(dng0Var.f89799a));
                    }
                }
                String str = bhg0.f76783d;
                bhg0 bhg0Var = weg0.f188695a;
                sgg0 sgg0VarM104342b = bhg0Var.m104342b(jLongValue);
                if (sgg0VarM104342b != null) {
                    Iterator it2 = sgg0VarM104342b.f167862l.iterator();
                    while (it2.hasNext()) {
                        wfg0 wfg0Var = (wfg0) it2.next();
                        Sudfor sudforMo154719b = wfg0Var.mo154719b();
                        if (sudforMo154719b == Sudfor.PreloadPackageCore || sudforMo154719b == Sudfor.PreloadPackageGamePackage) {
                            wfg0Var.mo154720c(sgg0VarM104342b.f167867q, sgg0VarM104342b.f167866p, PkgDownloadStatus.PKG_DOWNLOAD_CANCELED);
                            it2.remove();
                        }
                    }
                    Iterator it3 = sgg0VarM104342b.f167860j.iterator();
                    while (it3.hasNext()) {
                        Sudfor sudfor = (Sudfor) it3.next();
                        if (sudfor == Sudfor.PreloadPackageCore || sudfor == Sudfor.PreloadPackageGamePackage) {
                            it3.remove();
                        }
                    }
                    if (sgg0VarM104342b.f167862l.size() == 0) {
                        sgg0VarM104342b.m185778f();
                    }
                    bhg0Var.m104343c();
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
                String str = bhg0.f76783d;
                bhg0 bhg0Var = weg0.f188695a;
                sgg0 sgg0VarM104342b = bhg0Var.m104342b(jLongValue);
                if (sgg0VarM104342b != null && !sgg0VarM104342b.m185779g()) {
                    LogUtils.file("SudDownloadTask", "pauseDownload mgId:" + sgg0VarM104342b.f167852b + "  status:" + sgg0VarM104342b.f167858h);
                    SudLogger.m222811d(sgg0.f167850u, "pauseDownload mgId:" + sgg0VarM104342b.f167852b + "  status:" + sgg0VarM104342b.f167858h);
                    e0h0 e0h0Var = sgg0VarM104342b.f167864n;
                    if (e0h0Var != null) {
                        e0h0Var.f91463a.clear();
                        sgg0VarM104342b.f167864n.cancel();
                        sgg0VarM104342b.f167864n = null;
                    }
                    if (sgg0VarM104342b.m185780h()) {
                        sgg0VarM104342b.f167856f = 3;
                        sgg0VarM104342b.f167851a.m100399n();
                    } else {
                        PkgDownloadStatus pkgDownloadStatus = PkgDownloadStatus.PKG_DOWNLOAD_PAUSE;
                        sgg0VarM104342b.f167858h = pkgDownloadStatus;
                        sgg0VarM104342b.f167868r = System.currentTimeMillis();
                        sgg0VarM104342b.m185776d(pkgDownloadStatus);
                    }
                    bhg0Var.m104343c();
                }
            }
        }
    }

    @Override // tech.sud.gip.core.ISudGamePkgPreload
    public final void preloadMGPkgList(Context context, List list, ISudListenerPreloadMGPkg iSudListenerPreloadMGPkg) {
        sgg0 sgg0Var;
        if (list == null || list.size() == 0) {
            return;
        }
        String str = bhg0.f76783d;
        bhg0 bhg0Var = weg0.f188695a;
        bhg0Var.getClass();
        if (ThreadUtils.checkUIThread() && list.size() != 0) {
            for (int size = list.size() - 1; size >= 0; size--) {
                Long l2 = (Long) list.get(size);
                if (l2 != null) {
                    long jLongValue = l2.longValue();
                    ArrayList arrayList = bhg0Var.f76784a;
                    int size2 = arrayList.size();
                    int i = 0;
                    while (true) {
                        if (i >= size2) {
                            sgg0Var = null;
                            break;
                        }
                        Object obj = arrayList.get(i);
                        i++;
                        sgg0Var = (sgg0) obj;
                        if (sgg0Var.f167852b == jLongValue && !sgg0Var.m185779g()) {
                            break;
                        }
                    }
                    if (sgg0Var != null && bhg0Var.f76784a.remove(sgg0Var)) {
                        bhg0Var.f76784a.add(0, sgg0Var);
                    }
                }
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Long l3 = (Long) it.next();
            if (l3 != null) {
                long jLongValue2 = l3.longValue();
                dng0 dng0Var = (dng0) this.f191491a.get(l3);
                if (dng0Var == null) {
                    dng0Var = new dng0(jLongValue2);
                    if (iSudListenerPreloadMGPkg != null && !dng0Var.f89800b.contains(iSudListenerPreloadMGPkg)) {
                        dng0Var.f89800b.add(iSudListenerPreloadMGPkg);
                    }
                    dng0Var.f89806h = this.f191492b;
                    this.f191491a.put(l3, dng0Var);
                } else if (iSudListenerPreloadMGPkg != null && !dng0Var.f89800b.contains(iSudListenerPreloadMGPkg)) {
                    dng0Var.f89800b.add(iSudListenerPreloadMGPkg);
                }
                if (!dng0Var.f89801c) {
                    dng0Var.f89801c = true;
                    long j = dng0Var.f89799a;
                    shg0 shg0Var = new shg0(dng0Var);
                    String str2 = utg0.f180946a;
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        uyg0 uyg0Var = utg0.f180947b;
                        if (uyg0Var.f181601a) {
                            GameInfo gameInfo = (GameInfo) uyg0Var.f181615o.get(Long.valueOf(j));
                            if (gameInfo != null) {
                                shg0Var.onSuccess(gameInfo);
                            } else if (uyg0Var.f181601a) {
                                GameInfo gameInfo2 = (GameInfo) uyg0Var.f181615o.get(Long.valueOf(j));
                                tsg0.f175997c.execute(new hhg0(uyg0Var, j, uyg0Var.f181609i, gameInfo2 != null ? gameInfo2.clientVersion : 0L, null, shg0Var));
                            } else {
                                shg0Var.onFailure(-10103, "Please call initSDK first successfully");
                            }
                        } else {
                            shg0Var.onFailure(-10103, "Please call initSDK first successfully");
                        }
                    } else {
                        shg0Var.onFailure(-1, "Please call on UI or Main thread");
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
                String str = bhg0.f76783d;
                bhg0 bhg0Var = weg0.f188695a;
                sgg0 sgg0VarM104342b = bhg0Var.m104342b(jLongValue);
                if (sgg0VarM104342b != null && sgg0VarM104342b.f167858h == PkgDownloadStatus.PKG_DOWNLOAD_PAUSE) {
                    PkgDownloadStatus pkgDownloadStatus = PkgDownloadStatus.PKG_DOWNLOAD_WAITING;
                    sgg0VarM104342b.f167858h = pkgDownloadStatus;
                    sgg0VarM104342b.f167868r = System.currentTimeMillis();
                    sgg0VarM104342b.m185776d(pkgDownloadStatus);
                    bhg0Var.m104343c();
                }
            }
        }
    }
}
