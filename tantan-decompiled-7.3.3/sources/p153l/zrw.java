package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.live.base.data.BLiveDynamicEffect;
import com.p051p1.mobile.putong.live.base.data.BLiveMagic;
import com.p051p1.mobile.putong.live.base.data.BLiveMagicList;
import com.p051p1.mobile.putong.p070ui.download.C13274a;
import com.p051p1.mobile.putong.p070ui.download.DownloadTask;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.media.ttmediautils.tinker.SharePatchFileUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes4.dex */
public class zrw {

    /* JADX INFO: renamed from: a */
    public static String f205809a = "MagicGestureResManager";

    /* JADX INFO: renamed from: b */
    public static final wyd0 f205810b = new wyd0("live_gesture_model_md5", "");

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m221208a(DownloadTask downloadTask, Integer num) {
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m221210c(final BLiveDynamicEffect bLiveDynamicEffect, File file, final gcg0 gcg0Var) {
        try {
            ecj.m120374H(new File(m221221n()));
            DownloadTask downloadTaskM80809a = new DownloadTask.C13273b(uqb0.f180376H.getDownloadHttp()).m80825q(bLiveDynamicEffect.zipurl).m80822n(file).m80828t(true).m80818j(new z20() { // from class: l.vrw
                @Override // p153l.z20
                public final void call(Object obj, Object obj2) {
                    zrw.m221213f(bLiveDynamicEffect, gcg0Var, (DownloadTask) obj, (File) obj2);
                }
            }).m80815g(new z20() { // from class: l.wrw
                @Override // p153l.z20
                public final void call(Object obj, Object obj2) {
                    zrw.m221208a((DownloadTask) obj, (Integer) obj2);
                }
            }).m80814f(new z20() { // from class: l.xrw
                @Override // p153l.z20
                public final void call(Object obj, Object obj2) {
                    gcg0Var.onError((Throwable) obj2);
                }
            }).m80812d(new y20() { // from class: l.yrw
                @Override // p153l.y20
                public final void call(Object obj) {
                    gcg0Var.onError(new RuntimeException("canceled"));
                }
            }).m80809a();
            fhw.m125605a("magic_gesture", "start download magic gesture");
            C13274a.m80837u().m80848o(downloadTaskM80809a);
        } catch (RuntimeException e) {
            CrashHelper.m82479c(e);
            App.f16087d.m21432k(e);
            gcg0Var.onError(e);
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m221212e(File file, BLiveMagic bLiveMagic, gcg0 gcg0Var, DownloadTask downloadTask, File file2) {
        nsh0.m164608j(f205809a, "gesture model download success");
        try {
            cnw.m111551j(file.getAbsolutePath());
            f205810b.put(bLiveMagic.gestureModelMd5);
            gcg0Var.m137019l(bLiveMagic);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            oki.m168025m(m221223p());
            gcg0Var.onError(e);
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m221213f(BLiveDynamicEffect bLiveDynamicEffect, gcg0 gcg0Var, DownloadTask downloadTask, File file) {
        if (!TextUtils.equals(niw.m163314d(file), bLiveDynamicEffect.zipMd5)) {
            gcg0Var.onError(new Throwable("error:download file's md5 not equal to json's zipMd5"));
            return;
        }
        File file2 = new File(m221225r(bLiveDynamicEffect.zipurl));
        try {
            ecj.m120374H(file2);
            oki.m168019g(file, file2);
            oki.m168025m(file.getAbsolutePath());
            fhw.m125605a("magic_gesture", "unzip success");
            bLiveDynamicEffect.hasDownloaded = true;
            bLiveDynamicEffect.modelPath = file2.getAbsolutePath();
            gcg0Var.m137019l(bLiveDynamicEffect);
            gcg0Var.onCompleted();
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            oki.m168023k(file2);
            gcg0Var.onError(e);
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m221215h(gcg0 gcg0Var, DownloadTask downloadTask, Throwable th) {
        gcg0Var.onError(th);
        nsh0.m164608j(f205809a, "gesture model download fail " + th.getMessage());
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m221216i(gcg0 gcg0Var, DownloadTask downloadTask) {
        gcg0Var.onError(new Throwable("cancel"));
        nsh0.m164608j(f205809a, "gesture model  download cancel");
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m221217j(final BLiveMagic bLiveMagic, final gcg0 gcg0Var) {
        try {
            File file = new File(m221223p());
            oki.m168023k(file);
            SharePatchFileUtil.ensureDirectory(file);
            final File file2 = new File(m221224q());
            C13274a.m80837u().m80848o(new DownloadTask.C13273b(uqb0.f180376H.getDownloadHttp()).m80825q(bLiveMagic.gestureModelUrl).m80822n(file2).m80818j(new z20() { // from class: l.srw
                @Override // p153l.z20
                public final void call(Object obj, Object obj2) {
                    zrw.m221212e(file2, bLiveMagic, gcg0Var, (DownloadTask) obj, (File) obj2);
                }
            }).m80814f(new z20() { // from class: l.trw
                @Override // p153l.z20
                public final void call(Object obj, Object obj2) {
                    zrw.m221215h(gcg0Var, (DownloadTask) obj, (Throwable) obj2);
                }
            }).m80812d(new y20() { // from class: l.urw
                @Override // p153l.y20
                public final void call(Object obj) {
                    zrw.m221216i(gcg0Var, (DownloadTask) obj);
                }
            }).m80809a());
            nsh0.m164608j(f205809a, "gesture model download start");
        } catch (RuntimeException e) {
            nsh0.m164608j(f205809a, "gesture model ensure dir error " + e.getMessage());
            CrashHelper.m82479c(e);
            gcg0Var.onError(e);
        }
    }

    /* JADX INFO: renamed from: k */
    public static C22421c<BLiveMagic> m221218k(final BLiveMagic bLiveMagic) {
        if (bLiveMagic == null) {
            return C22421c.error(new Exception("magic is null"));
        }
        File file = new File(m221224q());
        if (!TextUtils.equals(f205810b.get(), bLiveMagic.gestureModelMd5) || !file.exists()) {
            return C22421c.create(new C22421c.a() { // from class: l.rrw
                @Override // p153l.y20
                public final void call(Object obj) {
                    zrw.m221217j(bLiveMagic, (gcg0) obj);
                }
            });
        }
        cnw.m111551j(m221224q());
        nsh0.m164608j(f205809a, "gesture model has downloaded");
        return C22421c.just(bLiveMagic);
    }

    /* JADX INFO: renamed from: l */
    public static C22421c<BLiveDynamicEffect> m221219l(List<BLiveMagicList> list) {
        if (jyb.m147479J(list)) {
            return C22421c.just(null);
        }
        ArrayList arrayList = new ArrayList();
        pf60<List<BLiveDynamicEffect>, List<BLiveDynamicEffect>> pf60VarM221222o = m221222o(list);
        Iterator<BLiveDynamicEffect> it = pf60VarM221222o.f152156a.iterator();
        while (it.hasNext()) {
            arrayList.add(C22421c.just(it.next()));
        }
        Iterator<BLiveDynamicEffect> it2 = pf60VarM221222o.f152157b.iterator();
        while (it2.hasNext()) {
            arrayList.add(m221220m(it2.next()));
        }
        return C22421c.mergeDelayError(arrayList);
    }

    /* JADX INFO: renamed from: m */
    public static C22421c<BLiveDynamicEffect> m221220m(final BLiveDynamicEffect bLiveDynamicEffect) {
        final File file = new File(m221227t(bLiveDynamicEffect.zipurl));
        return C22421c.create(new C22421c.a() { // from class: l.prw
            @Override // p153l.y20
            public final void call(Object obj) {
                zrw.m221210c(bLiveDynamicEffect, file, (gcg0) obj);
            }
        }).doOnError(new y20() { // from class: l.qrw
            @Override // p153l.y20
            public final void call(Object obj) {
                SharePatchFileUtil.safeDeleteFile(file);
            }
        }).compose(psd0.m173592C());
    }

    /* JADX INFO: renamed from: n */
    public static String m221221n() {
        return zrv.f205803e.getDir("magic_gesture", 0).getAbsolutePath();
    }

    /* JADX INFO: renamed from: o */
    public static pf60<List<BLiveDynamicEffect>, List<BLiveDynamicEffect>> m221222o(List<BLiveMagicList> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (BLiveMagicList bLiveMagicList : list) {
            if (!jyb.m147479J(bLiveMagicList.dynamicEffect)) {
                for (BLiveDynamicEffect bLiveDynamicEffect : bLiveMagicList.dynamicEffect) {
                    String strM221225r = m221225r(bLiveDynamicEffect.zipurl);
                    if (oki.m168035w(strM221225r)) {
                        bLiveDynamicEffect.hasDownloaded = true;
                        bLiveDynamicEffect.modelPath = strM221225r;
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
        return jyb.m147494Y(arrayList, arrayList2);
    }

    /* JADX INFO: renamed from: p */
    public static String m221223p() {
        return zrv.f205803e.getDir("liveGestureModel", 0).getAbsolutePath();
    }

    /* JADX INFO: renamed from: q */
    public static String m221224q() {
        return zrv.f205803e.getDir("liveGestureModel", 0).getAbsolutePath() + File.separator + "gestureModel";
    }

    /* JADX INFO: renamed from: r */
    public static String m221225r(String str) {
        String strM221227t = m221227t(str);
        return strM221227t.substring(0, strM221227t.lastIndexOf(".zip"));
    }

    /* JADX INFO: renamed from: s */
    public static String m221226s(String str) {
        return str.substring(str.lastIndexOf(File.separator) + 1);
    }

    /* JADX INFO: renamed from: t */
    public static String m221227t(String str) {
        return m221221n() + File.separator + m221226s(str);
    }
}
