package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.live.base.data.BLiveDynamicEffect;
import com.p046p1.mobile.putong.live.base.data.BLiveMagic;
import com.p046p1.mobile.putong.live.base.data.BLiveMagicList;
import com.p046p1.mobile.putong.p065ui.download.C13111a;
import com.p046p1.mobile.putong.p065ui.download.DownloadTask;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.media.ttmediautils.tinker.SharePatchFileUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes4.dex */
public class apw {

    /* JADX INFO: renamed from: a */
    public static String f71087a = "MagicGestureResManager";

    /* JADX INFO: renamed from: b */
    public static final uqd0 f71088b = new uqd0("live_gesture_model_md5", "");

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m98175a(DownloadTask downloadTask, Integer num) {
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m98177c(final BLiveDynamicEffect bLiveDynamicEffect, File file, final z3g0 z3g0Var) {
        try {
            k9j.m145076H(new File(m98188n()));
            DownloadTask downloadTaskM79626a = new DownloadTask.C13110b(qib0.f154693H.getDownloadHttp()).m79642q(bLiveDynamicEffect.zipurl).m79639n(file).m79645t(true).m79635j(new f30() { // from class: l.wow
                @Override // p149l.f30
                public final void call(Object obj, Object obj2) {
                    apw.m98180f(bLiveDynamicEffect, z3g0Var, (DownloadTask) obj, (File) obj2);
                }
            }).m79632g(new f30() { // from class: l.xow
                @Override // p149l.f30
                public final void call(Object obj, Object obj2) {
                    apw.m98175a((DownloadTask) obj, (Integer) obj2);
                }
            }).m79631f(new f30() { // from class: l.yow
                @Override // p149l.f30
                public final void call(Object obj, Object obj2) {
                    z3g0Var.onError((Throwable) obj2);
                }
            }).m79629d(new e30() { // from class: l.zow
                @Override // p149l.e30
                public final void call(Object obj) {
                    z3g0Var.onError(new RuntimeException("canceled"));
                }
            }).m79626a();
            hfw.m130790a("magic_gesture", "start download magic gesture");
            C13111a.m79654u().m79665o(downloadTaskM79626a);
        } catch (RuntimeException e) {
            CrashHelper.m81296c(e);
            App.f15368d.m20433k(e);
            z3g0Var.onError(e);
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m98179e(File file, BLiveMagic bLiveMagic, z3g0 z3g0Var, DownloadTask downloadTask, File file2) {
        gkh0.m126627j(f71087a, "gesture model download success");
        try {
            dkw.m112283j(file.getAbsolutePath());
            f71088b.put(bLiveMagic.gestureModelMd5);
            z3g0Var.m132487l(bLiveMagic);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            rhi.m179369m(m98190p());
            z3g0Var.onError(e);
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m98180f(BLiveDynamicEffect bLiveDynamicEffect, z3g0 z3g0Var, DownloadTask downloadTask, File file) {
        if (!TextUtils.equals(ogw.m164283d(file), bLiveDynamicEffect.zipMd5)) {
            z3g0Var.onError(new Throwable("error:download file's md5 not equal to json's zipMd5"));
            return;
        }
        File file2 = new File(m98192r(bLiveDynamicEffect.zipurl));
        try {
            k9j.m145076H(file2);
            rhi.m179363g(file, file2);
            rhi.m179369m(file.getAbsolutePath());
            hfw.m130790a("magic_gesture", "unzip success");
            bLiveDynamicEffect.hasDownloaded = true;
            bLiveDynamicEffect.modelPath = file2.getAbsolutePath();
            z3g0Var.m132487l(bLiveDynamicEffect);
            z3g0Var.onCompleted();
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            rhi.m179367k(file2);
            z3g0Var.onError(e);
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m98182h(z3g0 z3g0Var, DownloadTask downloadTask, Throwable th) {
        z3g0Var.onError(th);
        gkh0.m126627j(f71087a, "gesture model download fail " + th.getMessage());
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m98183i(z3g0 z3g0Var, DownloadTask downloadTask) {
        z3g0Var.onError(new Throwable("cancel"));
        gkh0.m126627j(f71087a, "gesture model  download cancel");
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m98184j(final BLiveMagic bLiveMagic, final z3g0 z3g0Var) {
        try {
            File file = new File(m98190p());
            rhi.m179367k(file);
            SharePatchFileUtil.ensureDirectory(file);
            final File file2 = new File(m98191q());
            C13111a.m79654u().m79665o(new DownloadTask.C13110b(qib0.f154693H.getDownloadHttp()).m79642q(bLiveMagic.gestureModelUrl).m79639n(file2).m79635j(new f30() { // from class: l.tow
                @Override // p149l.f30
                public final void call(Object obj, Object obj2) {
                    apw.m98179e(file2, bLiveMagic, z3g0Var, (DownloadTask) obj, (File) obj2);
                }
            }).m79631f(new f30() { // from class: l.uow
                @Override // p149l.f30
                public final void call(Object obj, Object obj2) {
                    apw.m98182h(z3g0Var, (DownloadTask) obj, (Throwable) obj2);
                }
            }).m79629d(new e30() { // from class: l.vow
                @Override // p149l.e30
                public final void call(Object obj) {
                    apw.m98183i(z3g0Var, (DownloadTask) obj);
                }
            }).m79626a());
            gkh0.m126627j(f71087a, "gesture model download start");
        } catch (RuntimeException e) {
            gkh0.m126627j(f71087a, "gesture model ensure dir error " + e.getMessage());
            CrashHelper.m81296c(e);
            z3g0Var.onError(e);
        }
    }

    /* JADX INFO: renamed from: k */
    public static C22306c<BLiveMagic> m98185k(final BLiveMagic bLiveMagic) {
        if (bLiveMagic == null) {
            return C22306c.error(new Exception("magic is null"));
        }
        File file = new File(m98191q());
        if (!TextUtils.equals(f71088b.get(), bLiveMagic.gestureModelMd5) || !file.exists()) {
            return C22306c.create(new C22306c.a() { // from class: l.sow
                @Override // p149l.e30
                public final void call(Object obj) {
                    apw.m98184j(bLiveMagic, (z3g0) obj);
                }
            });
        }
        dkw.m112283j(m98191q());
        gkh0.m126627j(f71087a, "gesture model has downloaded");
        return C22306c.just(bLiveMagic);
    }

    /* JADX INFO: renamed from: l */
    public static C22306c<BLiveDynamicEffect> m98186l(List<BLiveMagicList> list) {
        if (vwb.m200296J(list)) {
            return C22306c.just(null);
        }
        ArrayList arrayList = new ArrayList();
        j760<List<BLiveDynamicEffect>, List<BLiveDynamicEffect>> j760VarM98189o = m98189o(list);
        Iterator<BLiveDynamicEffect> it = j760VarM98189o.f116564a.iterator();
        while (it.hasNext()) {
            arrayList.add(C22306c.just(it.next()));
        }
        Iterator<BLiveDynamicEffect> it2 = j760VarM98189o.f116565b.iterator();
        while (it2.hasNext()) {
            arrayList.add(m98187m(it2.next()));
        }
        return C22306c.mergeDelayError(arrayList);
    }

    /* JADX INFO: renamed from: m */
    public static C22306c<BLiveDynamicEffect> m98187m(final BLiveDynamicEffect bLiveDynamicEffect) {
        final File file = new File(m98194t(bLiveDynamicEffect.zipurl));
        return C22306c.create(new C22306c.a() { // from class: l.qow
            @Override // p149l.e30
            public final void call(Object obj) {
                apw.m98177c(bLiveDynamicEffect, file, (z3g0) obj);
            }
        }).doOnError(new e30() { // from class: l.row
            @Override // p149l.e30
            public final void call(Object obj) {
                SharePatchFileUtil.safeDeleteFile(file);
            }
        }).compose(mkd0.m154951C());
    }

    /* JADX INFO: renamed from: n */
    public static String m98188n() {
        return ypv.f199497e.getDir("magic_gesture", 0).getAbsolutePath();
    }

    /* JADX INFO: renamed from: o */
    public static j760<List<BLiveDynamicEffect>, List<BLiveDynamicEffect>> m98189o(List<BLiveMagicList> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (BLiveMagicList bLiveMagicList : list) {
            if (!vwb.m200296J(bLiveMagicList.dynamicEffect)) {
                for (BLiveDynamicEffect bLiveDynamicEffect : bLiveMagicList.dynamicEffect) {
                    String strM98192r = m98192r(bLiveDynamicEffect.zipurl);
                    if (rhi.m179379w(strM98192r)) {
                        bLiveDynamicEffect.hasDownloaded = true;
                        bLiveDynamicEffect.modelPath = strM98192r;
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
        return vwb.m200311Y(arrayList, arrayList2);
    }

    /* JADX INFO: renamed from: p */
    public static String m98190p() {
        return ypv.f199497e.getDir("liveGestureModel", 0).getAbsolutePath();
    }

    /* JADX INFO: renamed from: q */
    public static String m98191q() {
        return ypv.f199497e.getDir("liveGestureModel", 0).getAbsolutePath() + File.separator + "gestureModel";
    }

    /* JADX INFO: renamed from: r */
    public static String m98192r(String str) {
        String strM98194t = m98194t(str);
        return strM98194t.substring(0, strM98194t.lastIndexOf(".zip"));
    }

    /* JADX INFO: renamed from: s */
    public static String m98193s(String str) {
        return str.substring(str.lastIndexOf(File.separator) + 1);
    }

    /* JADX INFO: renamed from: t */
    public static String m98194t(String str) {
        return m98188n() + File.separator + m98193s(str);
    }
}
