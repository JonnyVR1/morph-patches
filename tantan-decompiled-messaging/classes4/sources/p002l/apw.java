package p002l;

import android.text.TextUtils;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.live.base.data.BLiveDynamicEffect;
import com.p1.mobile.putong.live.base.data.BLiveMagic;
import com.p1.mobile.putong.live.base.data.BLiveMagicList;
import com.p1.mobile.putong.ui.download.DownloadTask;
import com.p1.mobile.putong.ui.download.a;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.media.ttmediautils.tinker.SharePatchFileUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.dkw;
import l.e30;
import l.f30;
import l.gkh0;
import l.hfw;
import l.j760;
import l.k9j;
import l.mkd0;
import l.ogw;
import l.qib0;
import l.rhi;
import l.uqd0;
import l.vwb;
import l.ypv;
import l.z3g0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class apw {

    /* JADX INFO: renamed from: a */
    public static String f7853a = "MagicGestureResManager";

    /* JADX INFO: renamed from: b */
    public static final uqd0 f7854b = new uqd0("live_gesture_model_md5", "");

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m9999a(DownloadTask downloadTask, Integer num) {
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m10001c(final BLiveDynamicEffect bLiveDynamicEffect, File file, final z3g0 z3g0Var) {
        try {
            k9j.H(new File(m10012n()));
            DownloadTask downloadTaskA = new DownloadTask.b(qib0.H.getDownloadHttp()).q(bLiveDynamicEffect.zipurl).n(file).t(true).j(new f30() { // from class: l.wow
                public final void call(Object obj, Object obj2) {
                    apw.m10004f(bLiveDynamicEffect, z3g0Var, (DownloadTask) obj, (File) obj2);
                }
            }).g(new f30() { // from class: l.xow
                public final void call(Object obj, Object obj2) {
                    apw.m9999a((DownloadTask) obj, (Integer) obj2);
                }
            }).f(new f30() { // from class: l.yow
                public final void call(Object obj, Object obj2) {
                    z3g0Var.onError((Throwable) obj2);
                }
            }).d(new e30() { // from class: l.zow
                public final void call(Object obj) {
                    z3g0Var.onError(new RuntimeException("canceled"));
                }
            }).a();
            hfw.a("magic_gesture", "start download magic gesture");
            a.u().o(downloadTaskA);
        } catch (RuntimeException e) {
            CrashHelper.c(e);
            App.d.k(e);
            z3g0Var.onError(e);
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m10003e(File file, BLiveMagic bLiveMagic, z3g0 z3g0Var, DownloadTask downloadTask, File file2) {
        gkh0.j(f7853a, "gesture model download success");
        try {
            dkw.j(file.getAbsolutePath());
            f7854b.put(bLiveMagic.gestureModelMd5);
            z3g0Var.onNext(bLiveMagic);
        } catch (Exception e) {
            CrashHelper.c(e);
            rhi.m(m10014p());
            z3g0Var.onError(e);
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m10004f(BLiveDynamicEffect bLiveDynamicEffect, z3g0 z3g0Var, DownloadTask downloadTask, File file) {
        if (!TextUtils.equals(ogw.d(file), bLiveDynamicEffect.zipMd5)) {
            z3g0Var.onError(new Throwable("error:download file's md5 not equal to json's zipMd5"));
            return;
        }
        File file2 = new File(m10016r(bLiveDynamicEffect.zipurl));
        try {
            k9j.H(file2);
            rhi.g(file, file2);
            rhi.m(file.getAbsolutePath());
            hfw.a("magic_gesture", "unzip success");
            bLiveDynamicEffect.hasDownloaded = true;
            bLiveDynamicEffect.modelPath = file2.getAbsolutePath();
            z3g0Var.onNext(bLiveDynamicEffect);
            z3g0Var.onCompleted();
        } catch (Exception e) {
            CrashHelper.c(e);
            rhi.k(file2);
            z3g0Var.onError(e);
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m10006h(z3g0 z3g0Var, DownloadTask downloadTask, Throwable th) {
        z3g0Var.onError(th);
        gkh0.j(f7853a, "gesture model download fail " + th.getMessage());
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m10007i(z3g0 z3g0Var, DownloadTask downloadTask) {
        z3g0Var.onError(new Throwable("cancel"));
        gkh0.j(f7853a, "gesture model  download cancel");
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m10008j(final BLiveMagic bLiveMagic, final z3g0 z3g0Var) {
        try {
            File file = new File(m10014p());
            rhi.k(file);
            SharePatchFileUtil.ensureDirectory(file);
            final File file2 = new File(m10015q());
            a.u().o(new DownloadTask.b(qib0.H.getDownloadHttp()).q(bLiveMagic.gestureModelUrl).n(file2).j(new f30() { // from class: l.tow
                public final void call(Object obj, Object obj2) {
                    apw.m10003e(file2, bLiveMagic, z3g0Var, (DownloadTask) obj, (File) obj2);
                }
            }).f(new f30() { // from class: l.uow
                public final void call(Object obj, Object obj2) {
                    apw.m10006h(z3g0Var, (DownloadTask) obj, (Throwable) obj2);
                }
            }).d(new e30() { // from class: l.vow
                public final void call(Object obj) {
                    apw.m10007i(z3g0Var, (DownloadTask) obj);
                }
            }).a());
            gkh0.j(f7853a, "gesture model download start");
        } catch (RuntimeException e) {
            gkh0.j(f7853a, "gesture model ensure dir error " + e.getMessage());
            CrashHelper.c(e);
            z3g0Var.onError(e);
        }
    }

    /* JADX INFO: renamed from: k */
    public static c<BLiveMagic> m10009k(final BLiveMagic bLiveMagic) {
        if (bLiveMagic == null) {
            return c.error(new Exception("magic is null"));
        }
        File file = new File(m10015q());
        if (!TextUtils.equals((String) f7854b.get(), bLiveMagic.gestureModelMd5) || !file.exists()) {
            return c.create(new c.a() { // from class: l.sow
                public final void call(Object obj) {
                    apw.m10008j(bLiveMagic, (z3g0) obj);
                }
            });
        }
        dkw.j(m10015q());
        gkh0.j(f7853a, "gesture model has downloaded");
        return c.just(bLiveMagic);
    }

    /* JADX INFO: renamed from: l */
    public static c<BLiveDynamicEffect> m10010l(List<BLiveMagicList> list) {
        if (vwb.J(list)) {
            return c.just((Object) null);
        }
        ArrayList arrayList = new ArrayList();
        j760<List<BLiveDynamicEffect>, List<BLiveDynamicEffect>> j760VarM10013o = m10013o(list);
        Iterator it = ((List) j760VarM10013o.a).iterator();
        while (it.hasNext()) {
            arrayList.add(c.just((BLiveDynamicEffect) it.next()));
        }
        Iterator it2 = ((List) j760VarM10013o.b).iterator();
        while (it2.hasNext()) {
            arrayList.add(m10011m((BLiveDynamicEffect) it2.next()));
        }
        return c.mergeDelayError(arrayList);
    }

    /* JADX INFO: renamed from: m */
    public static c<BLiveDynamicEffect> m10011m(final BLiveDynamicEffect bLiveDynamicEffect) {
        final File file = new File(m10018t(bLiveDynamicEffect.zipurl));
        return c.create(new c.a() { // from class: l.qow
            public final void call(Object obj) {
                apw.m10001c(bLiveDynamicEffect, file, (z3g0) obj);
            }
        }).doOnError(new e30() { // from class: l.row
            public final void call(Object obj) {
                SharePatchFileUtil.safeDeleteFile(file);
            }
        }).compose(mkd0.C());
    }

    /* JADX INFO: renamed from: n */
    public static String m10012n() {
        return ypv.e.getDir("magic_gesture", 0).getAbsolutePath();
    }

    /* JADX INFO: renamed from: o */
    public static j760<List<BLiveDynamicEffect>, List<BLiveDynamicEffect>> m10013o(List<BLiveMagicList> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (BLiveMagicList bLiveMagicList : list) {
            if (!vwb.J(bLiveMagicList.dynamicEffect)) {
                for (BLiveDynamicEffect bLiveDynamicEffect : bLiveMagicList.dynamicEffect) {
                    String strM10016r = m10016r(bLiveDynamicEffect.zipurl);
                    if (rhi.w(strM10016r)) {
                        bLiveDynamicEffect.hasDownloaded = true;
                        bLiveDynamicEffect.modelPath = strM10016r;
                        bLiveDynamicEffect.typeName = bLiveMagicList.typeName;
                        bLiveDynamicEffect.type = bLiveMagicList.type;
                        bLiveDynamicEffect.notice = bLiveMagicList.notice;
                        arrayList.add(bLiveDynamicEffect);
                    } else {
                        bLiveDynamicEffect.typeName = bLiveMagicList.typeName;
                        bLiveDynamicEffect.notice = bLiveMagicList.notice;
                        bLiveDynamicEffect.type = bLiveMagicList.type;
                        arrayList2.add(bLiveDynamicEffect);
                    }
                }
            }
        }
        return vwb.Y(arrayList, arrayList2);
    }

    /* JADX INFO: renamed from: p */
    public static String m10014p() {
        return ypv.e.getDir("liveGestureModel", 0).getAbsolutePath();
    }

    /* JADX INFO: renamed from: q */
    public static String m10015q() {
        return ypv.e.getDir("liveGestureModel", 0).getAbsolutePath() + File.separator + "gestureModel";
    }

    /* JADX INFO: renamed from: r */
    public static String m10016r(String str) {
        String strM10018t = m10018t(str);
        return strM10018t.substring(0, strM10018t.lastIndexOf(".zip"));
    }

    /* JADX INFO: renamed from: s */
    public static String m10017s(String str) {
        return str.substring(str.lastIndexOf(File.separator) + 1);
    }

    /* JADX INFO: renamed from: t */
    public static String m10018t(String str) {
        return m10012n() + File.separator + m10017s(str);
    }
}
