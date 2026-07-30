package p153l;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.p051p1.mobile.putong.feed.newui.camera.ImageEditAct;
import com.p051p1.mobile.putong.feed.newui.camera.VideoEditAct;
import com.p051p1.mobile.putong.feed.newui.kankan.recorder.ComicFaceRecorderActivity;
import com.p051p1.mobile.putong.feed.newui.mediapicker.CompactMediaPickerAct;
import com.p051p1.mobile.putong.feed.newui.mediapicker.NewAlbumSelectFrameAct;
import com.p051p1.mobile.putong.feed.newui.mediapicker.NewAlbumVideoEditAct;
import com.p051p1.mobile.putong.feed.newui.mediapicker.newcaption.NewCaptionAct;
import com.p051p1.mobile.putong.feed.newui.mediapicker.post.NewPostAct;
import com.p051p1.mobile.putong.feed.p065ui.moments.CaptionAct;
import com.p051p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import com.p051p1.mobile.putong.safety.IllegalPictureException;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes13.dex */
public class cn40 {

    /* JADX INFO: renamed from: a */
    public static int f82681a = 10010;

    /* JADX INFO: renamed from: b */
    public static int f82682b = 6;

    /* JADX INFO: renamed from: c */
    public static Moment f82683c = new Moment();

    /* JADX INFO: renamed from: d */
    public static Moment f82684d = null;

    /* JADX INFO: renamed from: e */
    public static C22507a<pf60<Integer, Moment>> f82685e = C22507a.m222758b();

    /* JADX INFO: renamed from: f */
    public static C22507a<pf60<Integer, Moment>> f82686f = C22507a.m222758b();

    /* JADX INFO: renamed from: g */
    public static y20<pf60<Act, Intent>> f82687g = dmk0.m116962a(400, new y20() { // from class: l.yl40
        @Override // p153l.y20
        public final void call(Object obj) {
            cn40.m111352D((pf60) obj);
        }
    });

    /* JADX INFO: renamed from: h */
    public static C22507a<Moment> f82688h = C22507a.m222758b();

    /* JADX INFO: renamed from: i */
    public static C22507a<Moment> f82689i = C22507a.m222758b();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m111348A(pf60 pf60Var) {
        if (NullChecker.m82487b(pf60Var) && ((Integer) pf60Var.f152156a).intValue() == 0) {
            f82688h.m137019l(f82683c);
            f82682b = 6;
        }
        f82685e.m137019l(pf60Var);
        f82682b = ((Integer) pf60Var.f152156a).intValue();
        S s = pf60Var.f152157b;
        if (s != 0) {
            Moment moment = (Moment) s;
            f82684d = moment;
            if (TextUtils.isEmpty(moment.f56859id)) {
                return;
            }
            FeedModule.f39707h.m112654A0(f82684d);
        }
    }

    /* JADX INFO: renamed from: A0 */
    public static void m111349A0(final pf60<Integer, Moment> pf60Var) {
        l51.m152893M(new Runnable() { // from class: l.sm40
            @Override // java.lang.Runnable
            public final void run() {
                cn40.m111348A(pf60Var);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m111352D(final pf60 pf60Var) {
        if (cmg.m111244x0()) {
            zzg.m222253e((Act) pf60Var.f152156a, "p_fake_nearby_moment_popup", null, new x20() { // from class: l.zl40
                @Override // p153l.x20
                public final void call() {
                    cn40.m111387g(pf60Var);
                }
            });
        } else if (NullChecker.m82486a(pf60Var.f152156a)) {
            ((Act) pf60Var.f152156a).startActivity((Intent) pf60Var.f152157b);
        }
    }

    /* JADX INFO: renamed from: E */
    public static void m111353E() {
        Iterator<ArrayList<Act.C4450r>> it = Act.globalLifeCycle_().values().iterator();
        while (it.hasNext()) {
            Iterator<Act.C4450r> it2 = it.next().iterator();
            while (it2.hasNext()) {
                Activity activity = it2.next().f16062a.get();
                if (activity != null && ((activity instanceof CompactMediaPickerAct) || (activity instanceof VideoEditAct) || (activity instanceof ImageEditAct) || (activity instanceof NewAlbumVideoEditAct) || (activity instanceof MediaPickerAct) || (activity instanceof ComicFaceRecorderActivity))) {
                    activity.finish();
                }
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public static C22421c<Moment> m111354F() {
        return f82688h.filter(new qcj() { // from class: l.ym40
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!((Moment) obj).equals(cn40.f82683c));
            }
        });
    }

    /* JADX INFO: renamed from: G */
    public static C22421c<Moment> m111355G() {
        return f82689i.filter(new qcj() { // from class: l.em40
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!((Moment) obj).equals(cn40.f82683c));
            }
        });
    }

    /* JADX INFO: renamed from: H */
    public static void m111356H() {
        if (NullChecker.m82486a(f82686f.m222761e())) {
            f82686f.m137019l(new pf60<>(6, null));
        }
    }

    /* JADX INFO: renamed from: I */
    public static void m111357I() {
        if (NullChecker.m82486a(f82685e.m222761e())) {
            f82685e.m137019l(new pf60<>(6, null));
        }
    }

    /* JADX INFO: renamed from: J */
    public static boolean m111358J(String str) {
        return TextUtils.equals("newuser_checkin_post_guide_pop", str) || TextUtils.equals("newuser_checkin", str);
    }

    /* JADX INFO: renamed from: K */
    public static boolean m111359K() {
        return f82685e.m222761e() == null || f82685e.m222761e().f152156a.intValue() == 5;
    }

    /* JADX INFO: renamed from: L */
    public static boolean m111360L(Throwable th) {
        return (NullChecker.m82486a(th) && (th instanceof TantanException.Client.TantanForbidden) && ((TantanException.Client.TantanForbidden) th).code == 40365) ? false : true;
    }

    /* JADX INFO: renamed from: M */
    public static void m111361M(final Act act, final NewPostAct.C11407a c11407a) {
        if (kl40.m150348f()) {
            if (!uc4.m195359i()) {
                m111376a0(act, new x20() { // from class: l.im40
                    @Override // p153l.x20
                    public final void call() {
                        cn40.m111361M(act, c11407a);
                    }
                });
            } else {
                if (m111422x0(act, c11407a.f41475a)) {
                    return;
                }
                m111408q0(act, null);
            }
        }
    }

    /* JADX INFO: renamed from: N */
    public static void m111362N(Act act, MusicContent musicContent) {
        m111363O(act, musicContent, null);
    }

    /* JADX INFO: renamed from: O */
    public static void m111363O(Act act, MusicContent musicContent, String str) {
        m111364P(act, musicContent, str, null, null, null);
    }

    /* JADX INFO: renamed from: P */
    public static void m111364P(Act act, MusicContent musicContent, String str, String str2, String str3, TopicMoment topicMoment) {
        m111365Q(act, musicContent, str, str2, str3, topicMoment, null);
    }

    /* JADX INFO: renamed from: Q */
    public static void m111365Q(final Act act, final MusicContent musicContent, final String str, String str2, String str3, TopicMoment topicMoment, String str4) {
        if (kl40.m150348f()) {
            if (!uc4.m195359i()) {
                m111376a0(act, new x20() { // from class: l.bn40
                    @Override // p153l.x20
                    public final void call() {
                        cn40.m111363O(act, musicContent, str);
                    }
                });
            } else {
                if (musicContent == null && !m111358J(str) && m111424y0(act, str, topicMoment)) {
                    return;
                }
                m111408q0(act, musicContent);
            }
        }
    }

    /* JADX INFO: renamed from: R */
    public static void m111366R(final Act act, final String str, final Parcelable parcelable) {
        if (!kl40.m150348f()) {
            o1j0.m165651y("当前机型不支持发布动态！");
        } else if (uc4.m195359i()) {
            m111418v0(act, new NewPostAct.C11407a(act).m63875c(str).m63880h(parcelable).m63873a(), null, null);
        } else {
            m111376a0(act, new x20() { // from class: l.cm40
                @Override // p153l.x20
                public final void call() {
                    cn40.m111366R(act, str, parcelable);
                }
            });
        }
    }

    /* JADX INFO: renamed from: S */
    public static void m111367S(Moment moment, boolean z, String str) {
        f82688h.m137019l(moment);
        m111370V(moment, false, z, str);
    }

    /* JADX INFO: renamed from: T */
    public static void m111368T(Act act, Moment moment, String str) {
        if (FeedModule.m61406H().mo31808pe()) {
            f82688h.m137019l(moment);
            m111371W(moment, false, false, false, true, str);
        } else {
            m111367S(moment, false, str);
            act.startActivity(orb0.m168905v(act, true));
        }
    }

    /* JADX INFO: renamed from: U */
    public static void m111369U(Moment moment, boolean z) {
        m111371W(moment, false, z, false, true, null);
    }

    /* JADX INFO: renamed from: V */
    public static void m111370V(Moment moment, boolean z, boolean z2, String str) {
        m111371W(moment, z, false, z2, false, str);
    }

    /* JADX INFO: renamed from: W */
    public static void m111371W(final Moment moment, boolean z, boolean z2, final boolean z3, final boolean z4, final String str) {
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        FeedModule.f39703d.m145488Bc(moment, z, z2).subscribe(psd0.m173597H(new y20() { // from class: l.zm40
            @Override // p153l.y20
            public final void call(Object obj) {
                cn40.m111401n(str, z4, moment, jElapsedRealtime, z3, (uxj0) obj);
            }
        }, new y20() { // from class: l.an40
            @Override // p153l.y20
            public final void call(Object obj) {
                cn40.m111381d(z4, moment, z3, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: X */
    public static void m111372X(Moment moment) {
        f82689i.m137019l(moment);
    }

    /* JADX INFO: renamed from: Y */
    public static C22421c<pf60<Integer, Moment>> m111373Y() {
        return f82686f;
    }

    /* JADX INFO: renamed from: Z */
    public static C22507a<pf60<Integer, Moment>> m111374Z() {
        return f82685e;
    }

    /* JADX INFO: renamed from: a0 */
    public static void m111376a0(Act act, final x20 x20Var) {
        final Dialog dialogProgress = act.progress("正在下载相机资源");
        dialogProgress.setCancelable(true);
        dialogProgress.setCanceledOnTouchOutside(true);
        dialogProgress.show();
        act.duringCreated(uc4.m195364n()).subscribe(psd0.m173597H(new y20() { // from class: l.am40
            @Override // p153l.y20
            public final void call(Object obj) {
                cn40.m111379c(dialogProgress, x20Var, (uxj0) obj);
            }
        }, new y20() { // from class: l.bm40
            @Override // p153l.y20
            public final void call(Object obj) {
                cn40.m111421x((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: b0 */
    public static void m111378b0(Act act, int i) {
        m111380c0(act, i, true);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m111379c(Dialog dialog, x20 x20Var, uxj0 uxj0Var) {
        if (dialog.isShowing()) {
            dialog.dismiss();
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: c0 */
    public static void m111380c0(final Act act, final int i, boolean z) {
        if (kl40.m150348f()) {
            if (!uc4.m195359i()) {
                m111376a0(act, new x20() { // from class: l.km40
                    @Override // p153l.x20
                    public final void call() {
                        cn40.m111378b0(act, i);
                    }
                });
                return;
            }
            Intent intentM80102Y1 = MediaPickerAct.m80102Y1(act, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(i).build()).withVideoPickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).build()).withFadeFinishAnim(z).withFromType(2).withMediaPreviewPageId("p_camera_album_picture_preview").build());
            act.overridePendingTransition(a8c0.f68909i, 0);
            f82687g.call(new pf60<>(act, intentM80102Y1));
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m111381d(boolean z, Moment moment, boolean z2, Throwable th) {
        if (z && m111360L(th)) {
            o1j0.m165651y("发布失败");
        }
        zzg.m222255g(true, th);
        er60.m122104w().m122126o(moment, "p_moment_post", th, z2, null);
        if ((th instanceof IllegalPictureException) && !TextUtils.isEmpty(th.getMessage()) && th.getMessage().toLowerCase(Locale.getDefault()).contains("qrcode")) {
            o1j0.m165651y("图片中存在二维码，发布失败");
        } else if (m111360L(th)) {
            bsj0.m106246D(th);
        }
    }

    /* JADX INFO: renamed from: d0 */
    public static void m111382d0(final Act act, final int i, final boolean z, final y20<Intent> y20Var) {
        if (kl40.m150348f()) {
            if (!uc4.m195359i()) {
                m111376a0(act, new x20() { // from class: l.dm40
                    @Override // p153l.x20
                    public final void call() {
                        cn40.m111382d0(act, i, z, y20Var);
                    }
                });
                return;
            }
            Intent intentM80102Y1 = MediaPickerAct.m80102Y1(act, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(i).build()).withVideoPickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).build()).withFadeFinishAnim(z).withFromType(2).withMediaPreviewPageId("p_camera_album_picture_preview").build());
            act.overridePendingTransition(a8c0.f68909i, 0);
            if (NullChecker.m82486a(y20Var)) {
                y20Var.call(intentM80102Y1);
            }
            f82687g.call(new pf60<>(act, intentM80102Y1));
        }
    }

    /* JADX INFO: renamed from: e0 */
    public static void m111384e0(Act act) {
        m111388g0(act, false, null, "");
    }

    /* JADX INFO: renamed from: f0 */
    public static void m111386f0(Act act, boolean z) {
        m111390h0(act, false, null, "", false, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m111387g(pf60 pf60Var) {
        if (NullChecker.m82486a(pf60Var.f152156a)) {
            ((Act) pf60Var.f152156a).startActivity((Intent) pf60Var.f152157b);
        }
    }

    /* JADX INFO: renamed from: g0 */
    public static void m111388g0(Act act, boolean z, ArrayList<Media> arrayList, String str) {
        m111390h0(act, z, arrayList, str, false, false);
    }

    /* JADX INFO: renamed from: h0 */
    public static void m111390h0(final Act act, boolean z, ArrayList<Media> arrayList, String str, final boolean z2, boolean z3) {
        if (kl40.m150348f()) {
            if (!uc4.m195359i()) {
                m111376a0(act, new x20() { // from class: l.wm40
                    @Override // p153l.x20
                    public final void call() {
                        cn40.m111384e0(act);
                    }
                });
            } else {
                final Intent intentM63373e2 = CompactMediaPickerAct.m63373e2(act, 9, null, true, false, z, arrayList, str, z2, z3);
                PermissionHelper.m81065c().m81083r("android.permission.CAMERA").m81088w(false).m81086u(true).m81080o(new x20() { // from class: l.xm40
                    @Override // p153l.x20
                    public final void call() {
                        cn40.m111419w(act, intentM63373e2, z2);
                    }
                }).m81074i(act);
            }
        }
    }

    /* JADX INFO: renamed from: i0 */
    public static void m111392i0(Act act, ArrayList<Media> arrayList, boolean z) {
        m111396k0(act, arrayList, z, null);
    }

    /* JADX INFO: renamed from: j0 */
    public static void m111394j0(Act act, ArrayList<Media> arrayList, boolean z, TopicMoment topicMoment, String str, boolean z2) {
        if (kl40.m150348f()) {
            m111416u0(act, NewCaptionAct.m63832q2(act, arrayList, z, topicMoment, str, true), null, null);
        } else {
            act.startActivity(CaptionAct.m67766Y1(act, arrayList));
        }
    }

    /* JADX INFO: renamed from: k0 */
    public static void m111396k0(Act act, ArrayList<Media> arrayList, boolean z, String str) {
        m111398l0(act, arrayList, z, str, null, null);
    }

    /* JADX INFO: renamed from: l0 */
    public static void m111398l0(Act act, ArrayList<Media> arrayList, boolean z, String str, String str2, String str3) {
        m111400m0(act, arrayList, z, str, str2, str3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m111399m(pf60 pf60Var) {
        if (NullChecker.m82487b(pf60Var) && ((Integer) pf60Var.f152156a).intValue() == 0) {
            f82689i.m137019l(f82683c);
        }
        f82686f.m137019l(pf60Var);
    }

    /* JADX INFO: renamed from: m0 */
    public static void m111400m0(Act act, ArrayList<Media> arrayList, boolean z, String str, String str2, String str3, TopicMoment topicMoment) {
        m111402n0(act, arrayList, z, str, str2, str3, topicMoment, null);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m111401n(String str, boolean z, Moment moment, long j, boolean z2, uxj0 uxj0Var) {
        if (TextUtils.equals(str, "p_meet_greet")) {
            o1j0.m165651y("今日偶遇机会+1");
        } else if (z) {
            o1j0.m165651y("发布成功");
        }
        g9i.m129585j0("nearby", moment, SystemClock.elapsedRealtime() - j);
        er60.m122104w().m122125n(moment, "p_moment_post", 201, z2, null);
    }

    /* JADX INFO: renamed from: n0 */
    public static void m111402n0(Act act, ArrayList<Media> arrayList, boolean z, String str, String str2, String str3, TopicMoment topicMoment, String str4) {
        if (kl40.m150348f()) {
            m111416u0(act, NewCaptionAct.m63831p2(act, arrayList, z), null, null);
        } else {
            act.startActivityForResult(CaptionAct.m67766Y1(act, arrayList), 50);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public static void m111404o0(Act act, ArrayList<Media> arrayList) {
        act.startActivity(CaptionAct.m67767Z1(act, arrayList));
    }

    /* JADX INFO: renamed from: p0 */
    public static void m111406p0(final Act act, final Media media) {
        if (uc4.m195359i()) {
            act.startActivityForResult(NewAlbumSelectFrameAct.m63528L2(act, media), f82681a);
        } else {
            m111376a0(act, new x20() { // from class: l.rm40
                @Override // p153l.x20
                public final void call() {
                    cn40.m111406p0(act, media);
                }
            });
        }
    }

    /* JADX INFO: renamed from: q0 */
    public static void m111408q0(final Act act, final MusicContent musicContent) {
        if (kl40.m150348f()) {
            if (!uc4.m195359i()) {
                m111376a0(act, new x20() { // from class: l.nm40
                    @Override // p153l.x20
                    public final void call() {
                        cn40.m111408q0(act, musicContent);
                    }
                });
            } else {
                final Intent intentM63371c2 = CompactMediaPickerAct.m63371c2(act, 9, musicContent, true, false);
                PermissionHelper.m81065c().m81083r("android.permission.CAMERA").m81088w(false).m81086u(true).m81080o(new x20() { // from class: l.om40
                    @Override // p153l.x20
                    public final void call() {
                        cn40.f82687g.call(new pf60<>(act, intentM63371c2));
                    }
                }).m81074i(act);
            }
        }
    }

    /* JADX INFO: renamed from: r0 */
    public static void m111410r0(final Act act, final String str, final int i) {
        if (!uc4.m195359i()) {
            m111376a0(act, new x20() { // from class: l.jm40
                @Override // p153l.x20
                public final void call() {
                    cn40.m111410r0(act, str, i);
                }
            });
        } else {
            final Intent intentM63372d2 = CompactMediaPickerAct.m63372d2(act, 1, null, false, false, str);
            PermissionHelper.m81065c().m81083r(wzx.m208784k() ? new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"} : new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO", "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}).m81088w(false).m81086u(true).m81080o(new x20() { // from class: l.um40
                @Override // p153l.x20
                public final void call() {
                    act.startActivityForResult(intentM63372d2, i);
                }
            }).m81074i(act);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public static void m111412s0(Act act, ArrayList<Media> arrayList, String str, boolean z, String str2) {
        m111416u0(act, NewCaptionAct.m63831p2(act, arrayList, false), new y20() { // from class: l.lm40
            @Override // p153l.y20
            public final void call(Object obj) {
                ((Intent) obj).setFlags(603979776);
            }
        }, new x20() { // from class: l.mm40
            @Override // p153l.x20
            public final void call() {
                cn40.m111353E();
            }
        });
    }

    /* JADX INFO: renamed from: t0 */
    public static void m111414t0(Act act, ArrayList<Media> arrayList, String str, boolean z, String str2, boolean z2) {
        m111418v0(act, new NewPostAct.C11407a(act).m63878f(arrayList).m63875c(str2).m63882j(false).m63883k(str).m63884l(z).m63881i(z2).m63873a(), new y20() { // from class: l.pm40
            @Override // p153l.y20
            public final void call(Object obj) {
                ((Intent) obj).setFlags(603979776);
            }
        }, new x20() { // from class: l.qm40
            @Override // p153l.x20
            public final void call() {
                cn40.m111353E();
            }
        });
    }

    /* JADX INFO: renamed from: u0 */
    public static void m111416u0(final Act act, final Intent intent, final y20<Intent> y20Var, final x20 x20Var) {
        if (!uc4.m195359i()) {
            m111376a0(act, new x20() { // from class: l.vm40
                @Override // p153l.x20
                public final void call() {
                    cn40.m111416u0(act, intent, y20Var, x20Var);
                }
            });
            return;
        }
        if (NullChecker.m82486a(y20Var)) {
            y20Var.call(intent);
        }
        f82687g.call(new pf60<>(act, intent));
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: v0 */
    public static void m111418v0(final Act act, final Intent intent, final y20<Intent> y20Var, final x20 x20Var) {
        if (kl40.m150348f()) {
            if (!uc4.m195359i()) {
                m111376a0(act, new x20() { // from class: l.fm40
                    @Override // p153l.x20
                    public final void call() {
                        cn40.m111418v0(act, intent, y20Var, x20Var);
                    }
                });
            } else if (owi.m169565a()) {
                k3h.m148057P0(act, new x20() { // from class: l.gm40
                    @Override // p153l.x20
                    public final void call() {
                        o1j0.m165649w(R$string.f39831U1);
                    }
                }, false, new x20() { // from class: l.hm40
                    @Override // p153l.x20
                    public final void call() {
                        cn40.m111420w0(act, intent, y20Var, x20Var);
                    }
                }, l3h.f129875a);
            } else {
                m111420w0(act, intent, y20Var, x20Var);
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m111419w(Act act, Intent intent, boolean z) {
        f82687g.call(new pf60<>(act, intent));
        if (z) {
            act.overridePendingTransition(a8c0.f68909i, 0);
        }
    }

    /* JADX INFO: renamed from: w0 */
    public static void m111420w0(Act act, Intent intent, y20<Intent> y20Var, x20 x20Var) {
        if (NullChecker.m82486a(y20Var)) {
            y20Var.call(intent);
        }
        f82687g.call(new pf60<>(act, intent));
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m111421x(Throwable th) {
    }

    /* JADX INFO: renamed from: x0 */
    public static boolean m111422x0(Act act, String str) {
        return m111424y0(act, str, null);
    }

    /* JADX INFO: renamed from: y0 */
    public static boolean m111424y0(Act act, String str, TopicMoment topicMoment) {
        if (!FeedModule.f39703d.f121329U.get().booleanValue()) {
            return false;
        }
        m111416u0(act, NewCaptionAct.m63831p2(act, jyb.m147482M(Picture.new_()), true), null, null);
        return true;
    }

    /* JADX INFO: renamed from: z0 */
    public static void m111426z0(final pf60<Integer, Moment> pf60Var) {
        l51.m152893M(new Runnable() { // from class: l.tm40
            @Override // java.lang.Runnable
            public final void run() {
                cn40.m111399m(pf60Var);
            }
        });
    }
}
