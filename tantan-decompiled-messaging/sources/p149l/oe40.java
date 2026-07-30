package p149l;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.p046p1.mobile.putong.feed.newui.camera.ImageEditAct;
import com.p046p1.mobile.putong.feed.newui.camera.VideoEditAct;
import com.p046p1.mobile.putong.feed.newui.kankan.recorder.ComicFaceRecorderActivity;
import com.p046p1.mobile.putong.feed.newui.mediapicker.CompactMediaPickerAct;
import com.p046p1.mobile.putong.feed.newui.mediapicker.NewAlbumSelectFrameAct;
import com.p046p1.mobile.putong.feed.newui.mediapicker.NewAlbumVideoEditAct;
import com.p046p1.mobile.putong.feed.newui.mediapicker.newcaption.NewCaptionAct;
import com.p046p1.mobile.putong.feed.newui.mediapicker.post.NewPostAct;
import com.p046p1.mobile.putong.feed.p060ui.moments.CaptionAct;
import com.p046p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import com.p046p1.mobile.putong.safety.IllegalPictureException;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes12.dex */
public class oe40 {

    /* JADX INFO: renamed from: a */
    public static int f143278a = 10010;

    /* JADX INFO: renamed from: b */
    public static int f143279b = 6;

    /* JADX INFO: renamed from: c */
    public static Moment f143280c = new Moment();

    /* JADX INFO: renamed from: d */
    public static Moment f143281d = null;

    /* JADX INFO: renamed from: e */
    public static C22392a<j760<Integer, Moment>> f143282e = C22392a.m221512b();

    /* JADX INFO: renamed from: f */
    public static C22392a<j760<Integer, Moment>> f143283f = C22392a.m221512b();

    /* JADX INFO: renamed from: g */
    public static e30<j760<Act, Intent>> f143284g = xck0.m208120a(400, new e30() { // from class: l.kd40
        @Override // p149l.e30
        public final void call(Object obj) {
            oe40.m163802D((j760) obj);
        }
    });

    /* JADX INFO: renamed from: h */
    public static C22392a<Moment> f143285h = C22392a.m221512b();

    /* JADX INFO: renamed from: i */
    public static C22392a<Moment> f143286i = C22392a.m221512b();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m163798A(j760 j760Var) {
        if (NullChecker.m81304b(j760Var) && ((Integer) j760Var.f116564a).intValue() == 0) {
            f143285h.m132487l(f143280c);
            f143279b = 6;
        }
        f143282e.m132487l(j760Var);
        f143279b = ((Integer) j760Var.f116564a).intValue();
        S s = j760Var.f116565b;
        if (s != 0) {
            Moment moment = (Moment) s;
            f143281d = moment;
            if (TextUtils.isEmpty(moment.f56011id)) {
                return;
            }
            FeedModule.f38859h.m180641A0(f143281d);
        }
    }

    /* JADX INFO: renamed from: A0 */
    public static void m163799A0(final j760<Integer, Moment> j760Var) {
        e51.m114748M(new Runnable() { // from class: l.ee40
            @Override // java.lang.Runnable
            public final void run() {
                oe40.m163798A(j760Var);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m163802D(final j760 j760Var) {
        if (nkg.m159915x0()) {
            kyg.m147870e((Act) j760Var.f116564a, "p_fake_nearby_moment_popup", null, new d30() { // from class: l.ld40
                @Override // p149l.d30
                public final void call() {
                    oe40.m163837g(j760Var);
                }
            });
        } else if (NullChecker.m81303a(j760Var.f116564a)) {
            ((Act) j760Var.f116564a).startActivity((Intent) j760Var.f116565b);
        }
    }

    /* JADX INFO: renamed from: E */
    public static void m163803E() {
        Iterator<ArrayList<Act.C4299r>> it = Act.globalLifeCycle_().values().iterator();
        while (it.hasNext()) {
            Iterator<Act.C4299r> it2 = it.next().iterator();
            while (it2.hasNext()) {
                Activity activity = it2.next().f15343a.get();
                if (activity != null && ((activity instanceof CompactMediaPickerAct) || (activity instanceof VideoEditAct) || (activity instanceof ImageEditAct) || (activity instanceof NewAlbumVideoEditAct) || (activity instanceof MediaPickerAct) || (activity instanceof ComicFaceRecorderActivity))) {
                    activity.finish();
                }
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public static C22306c<Moment> m163804F() {
        return f143285h.filter(new w9j() { // from class: l.ke40
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!((Moment) obj).equals(oe40.f143280c));
            }
        });
    }

    /* JADX INFO: renamed from: G */
    public static C22306c<Moment> m163805G() {
        return f143286i.filter(new w9j() { // from class: l.qd40
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!((Moment) obj).equals(oe40.f143280c));
            }
        });
    }

    /* JADX INFO: renamed from: H */
    public static void m163806H() {
        if (NullChecker.m81303a(f143283f.m221515e())) {
            f143283f.m132487l(new j760<>(6, null));
        }
    }

    /* JADX INFO: renamed from: I */
    public static void m163807I() {
        if (NullChecker.m81303a(f143282e.m221515e())) {
            f143282e.m132487l(new j760<>(6, null));
        }
    }

    /* JADX INFO: renamed from: J */
    public static boolean m163808J(String str) {
        return TextUtils.equals("newuser_checkin_post_guide_pop", str) || TextUtils.equals("newuser_checkin", str);
    }

    /* JADX INFO: renamed from: K */
    public static boolean m163809K() {
        return f143282e.m221515e() == null || f143282e.m221515e().f116564a.intValue() == 5;
    }

    /* JADX INFO: renamed from: L */
    public static boolean m163810L(Throwable th) {
        return (NullChecker.m81303a(th) && (th instanceof TantanException.Client.TantanForbidden) && ((TantanException.Client.TantanForbidden) th).code == 40365) ? false : true;
    }

    /* JADX INFO: renamed from: M */
    public static void m163811M(final Act act, final NewPostAct.C11244a c11244a) {
        if (wc40.m202629f()) {
            if (!vb4.m197675i()) {
                m163826a0(act, new d30() { // from class: l.ud40
                    @Override // p149l.d30
                    public final void call() {
                        oe40.m163811M(act, c11244a);
                    }
                });
            } else {
                if (m163872x0(act, c11244a.f40627a)) {
                    return;
                }
                m163858q0(act, null);
            }
        }
    }

    /* JADX INFO: renamed from: N */
    public static void m163812N(Act act, MusicContent musicContent) {
        m163813O(act, musicContent, null);
    }

    /* JADX INFO: renamed from: O */
    public static void m163813O(Act act, MusicContent musicContent, String str) {
        m163814P(act, musicContent, str, null, null, null);
    }

    /* JADX INFO: renamed from: P */
    public static void m163814P(Act act, MusicContent musicContent, String str, String str2, String str3, TopicMoment topicMoment) {
        m163815Q(act, musicContent, str, str2, str3, topicMoment, null);
    }

    /* JADX INFO: renamed from: Q */
    public static void m163815Q(final Act act, final MusicContent musicContent, final String str, String str2, String str3, TopicMoment topicMoment, String str4) {
        if (wc40.m202629f()) {
            if (!vb4.m197675i()) {
                m163826a0(act, new d30() { // from class: l.ne40
                    @Override // p149l.d30
                    public final void call() {
                        oe40.m163813O(act, musicContent, str);
                    }
                });
            } else {
                if (musicContent == null && !m163808J(str) && m163874y0(act, str, topicMoment)) {
                    return;
                }
                m163858q0(act, musicContent);
            }
        }
    }

    /* JADX INFO: renamed from: R */
    public static void m163816R(final Act act, final String str, final Parcelable parcelable) {
        if (!wc40.m202629f()) {
            lsi0.m151595y("当前机型不支持发布动态！");
        } else if (vb4.m197675i()) {
            m163868v0(act, new NewPostAct.C11244a(act).m62692c(str).m62697h(parcelable).m62690a(), null, null);
        } else {
            m163826a0(act, new d30() { // from class: l.od40
                @Override // p149l.d30
                public final void call() {
                    oe40.m163816R(act, str, parcelable);
                }
            });
        }
    }

    /* JADX INFO: renamed from: S */
    public static void m163817S(Moment moment, boolean z, String str) {
        f143285h.m132487l(moment);
        m163820V(moment, false, z, str);
    }

    /* JADX INFO: renamed from: T */
    public static void m163818T(Act act, Moment moment, String str) {
        if (FeedModule.m60222H().mo30805pe()) {
            f143285h.m132487l(moment);
            m163821W(moment, false, false, false, true, str);
        } else {
            m163817S(moment, false, str);
            act.startActivity(kjb0.m146211v(act, true));
        }
    }

    /* JADX INFO: renamed from: U */
    public static void m163819U(Moment moment, boolean z) {
        m163821W(moment, false, z, false, true, null);
    }

    /* JADX INFO: renamed from: V */
    public static void m163820V(Moment moment, boolean z, boolean z2, String str) {
        m163821W(moment, z, false, z2, false, str);
    }

    /* JADX INFO: renamed from: W */
    public static void m163821W(final Moment moment, boolean z, boolean z2, final boolean z3, final boolean z4, final String str) {
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        FeedModule.f38855d.m209247Bc(moment, z, z2).subscribe(mkd0.m154956H(new e30() { // from class: l.le40
            @Override // p149l.e30
            public final void call(Object obj) {
                oe40.m163851n(str, z4, moment, jElapsedRealtime, z3, (roj0) obj);
            }
        }, new e30() { // from class: l.me40
            @Override // p149l.e30
            public final void call(Object obj) {
                oe40.m163831d(z4, moment, z3, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: X */
    public static void m163822X(Moment moment) {
        f143286i.m132487l(moment);
    }

    /* JADX INFO: renamed from: Y */
    public static C22306c<j760<Integer, Moment>> m163823Y() {
        return f143283f;
    }

    /* JADX INFO: renamed from: Z */
    public static C22392a<j760<Integer, Moment>> m163824Z() {
        return f143282e;
    }

    /* JADX INFO: renamed from: a0 */
    public static void m163826a0(Act act, final d30 d30Var) {
        final Dialog dialogProgress = act.progress("正在下载相机资源");
        dialogProgress.setCancelable(true);
        dialogProgress.setCanceledOnTouchOutside(true);
        dialogProgress.show();
        act.duringCreated(vb4.m197680n()).subscribe(mkd0.m154956H(new e30() { // from class: l.md40
            @Override // p149l.e30
            public final void call(Object obj) {
                oe40.m163829c(dialogProgress, d30Var, (roj0) obj);
            }
        }, new e30() { // from class: l.nd40
            @Override // p149l.e30
            public final void call(Object obj) {
                oe40.m163871x((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: b0 */
    public static void m163828b0(Act act, int i) {
        m163830c0(act, i, true);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m163829c(Dialog dialog, d30 d30Var, roj0 roj0Var) {
        if (dialog.isShowing()) {
            dialog.dismiss();
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: c0 */
    public static void m163830c0(final Act act, final int i, boolean z) {
        if (wc40.m202629f()) {
            if (!vb4.m197675i()) {
                m163826a0(act, new d30() { // from class: l.wd40
                    @Override // p149l.d30
                    public final void call() {
                        oe40.m163828b0(act, i);
                    }
                });
                return;
            }
            Intent intentM78919X1 = MediaPickerAct.m78919X1(act, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(i).build()).withVideoPickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).build()).withFadeFinishAnim(z).withFromType(2).withMediaPreviewPageId("p_camera_album_picture_preview").build());
            act.overridePendingTransition(uzb0.f178984i, 0);
            f143284g.call(new j760<>(act, intentM78919X1));
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m163831d(boolean z, Moment moment, boolean z2, Throwable th) {
        if (z && m163810L(th)) {
            lsi0.m151595y("发布失败");
        }
        kyg.m147872g(true, th);
        zi60.m218961w().m218983o(moment, "p_moment_post", th, z2, null);
        if ((th instanceof IllegalPictureException) && !TextUtils.isEmpty(th.getMessage()) && th.getMessage().toLowerCase(Locale.getDefault()).contains("qrcode")) {
            lsi0.m151595y("图片中存在二维码，发布失败");
        } else if (m163810L(th)) {
            yij0.m214926D(th);
        }
    }

    /* JADX INFO: renamed from: d0 */
    public static void m163832d0(final Act act, final int i, final boolean z, final e30<Intent> e30Var) {
        if (wc40.m202629f()) {
            if (!vb4.m197675i()) {
                m163826a0(act, new d30() { // from class: l.pd40
                    @Override // p149l.d30
                    public final void call() {
                        oe40.m163832d0(act, i, z, e30Var);
                    }
                });
                return;
            }
            Intent intentM78919X1 = MediaPickerAct.m78919X1(act, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(i).build()).withVideoPickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).build()).withFadeFinishAnim(z).withFromType(2).withMediaPreviewPageId("p_camera_album_picture_preview").build());
            act.overridePendingTransition(uzb0.f178984i, 0);
            if (NullChecker.m81303a(e30Var)) {
                e30Var.call(intentM78919X1);
            }
            f143284g.call(new j760<>(act, intentM78919X1));
        }
    }

    /* JADX INFO: renamed from: e0 */
    public static void m163834e0(Act act) {
        m163838g0(act, false, null, "");
    }

    /* JADX INFO: renamed from: f0 */
    public static void m163836f0(Act act, boolean z) {
        m163840h0(act, false, null, "", false, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m163837g(j760 j760Var) {
        if (NullChecker.m81303a(j760Var.f116564a)) {
            ((Act) j760Var.f116564a).startActivity((Intent) j760Var.f116565b);
        }
    }

    /* JADX INFO: renamed from: g0 */
    public static void m163838g0(Act act, boolean z, ArrayList<Media> arrayList, String str) {
        m163840h0(act, z, arrayList, str, false, false);
    }

    /* JADX INFO: renamed from: h0 */
    public static void m163840h0(final Act act, boolean z, ArrayList<Media> arrayList, String str, final boolean z2, boolean z3) {
        if (wc40.m202629f()) {
            if (!vb4.m197675i()) {
                m163826a0(act, new d30() { // from class: l.ie40
                    @Override // p149l.d30
                    public final void call() {
                        oe40.m163834e0(act);
                    }
                });
            } else {
                final Intent intentM62190d2 = CompactMediaPickerAct.m62190d2(act, 9, null, true, false, z, arrayList, str, z2, z3);
                PermissionHelper.m79882c().m79900r("android.permission.CAMERA").m79905w(false).m79903u(true).m79897o(new d30() { // from class: l.je40
                    @Override // p149l.d30
                    public final void call() {
                        oe40.m163869w(act, intentM62190d2, z2);
                    }
                }).m79891i(act);
            }
        }
    }

    /* JADX INFO: renamed from: i0 */
    public static void m163842i0(Act act, ArrayList<Media> arrayList, boolean z) {
        m163846k0(act, arrayList, z, null);
    }

    /* JADX INFO: renamed from: j0 */
    public static void m163844j0(Act act, ArrayList<Media> arrayList, boolean z, TopicMoment topicMoment, String str, boolean z2) {
        if (wc40.m202629f()) {
            m163866u0(act, NewCaptionAct.m62648p2(act, arrayList, z, topicMoment, str, true), null, null);
        } else {
            act.startActivity(CaptionAct.m66583X1(act, arrayList));
        }
    }

    /* JADX INFO: renamed from: k0 */
    public static void m163846k0(Act act, ArrayList<Media> arrayList, boolean z, String str) {
        m163848l0(act, arrayList, z, str, null, null);
    }

    /* JADX INFO: renamed from: l0 */
    public static void m163848l0(Act act, ArrayList<Media> arrayList, boolean z, String str, String str2, String str3) {
        m163850m0(act, arrayList, z, str, str2, str3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m163849m(j760 j760Var) {
        if (NullChecker.m81304b(j760Var) && ((Integer) j760Var.f116564a).intValue() == 0) {
            f143286i.m132487l(f143280c);
        }
        f143283f.m132487l(j760Var);
    }

    /* JADX INFO: renamed from: m0 */
    public static void m163850m0(Act act, ArrayList<Media> arrayList, boolean z, String str, String str2, String str3, TopicMoment topicMoment) {
        m163852n0(act, arrayList, z, str, str2, str3, topicMoment, null);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m163851n(String str, boolean z, Moment moment, long j, boolean z2, roj0 roj0Var) {
        if (TextUtils.equals(str, "p_meet_greet")) {
            lsi0.m151595y("今日偶遇机会+1");
        } else if (z) {
            lsi0.m151595y("发布成功");
        }
        r7i.m178139j0("nearby", moment, SystemClock.elapsedRealtime() - j);
        zi60.m218961w().m218982n(moment, "p_moment_post", 201, z2, null);
    }

    /* JADX INFO: renamed from: n0 */
    public static void m163852n0(Act act, ArrayList<Media> arrayList, boolean z, String str, String str2, String str3, TopicMoment topicMoment, String str4) {
        if (wc40.m202629f()) {
            m163866u0(act, NewCaptionAct.m62647o2(act, arrayList, z), null, null);
        } else {
            act.startActivityForResult(CaptionAct.m66583X1(act, arrayList), 50);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public static void m163854o0(Act act, ArrayList<Media> arrayList) {
        act.startActivity(CaptionAct.m66584Y1(act, arrayList));
    }

    /* JADX INFO: renamed from: p0 */
    public static void m163856p0(final Act act, final Media media) {
        if (vb4.m197675i()) {
            act.startActivityForResult(NewAlbumSelectFrameAct.m62344K2(act, media), f143278a);
        } else {
            m163826a0(act, new d30() { // from class: l.de40
                @Override // p149l.d30
                public final void call() {
                    oe40.m163856p0(act, media);
                }
            });
        }
    }

    /* JADX INFO: renamed from: q0 */
    public static void m163858q0(final Act act, final MusicContent musicContent) {
        if (wc40.m202629f()) {
            if (!vb4.m197675i()) {
                m163826a0(act, new d30() { // from class: l.zd40
                    @Override // p149l.d30
                    public final void call() {
                        oe40.m163858q0(act, musicContent);
                    }
                });
            } else {
                final Intent intentM62188b2 = CompactMediaPickerAct.m62188b2(act, 9, musicContent, true, false);
                PermissionHelper.m79882c().m79900r("android.permission.CAMERA").m79905w(false).m79903u(true).m79897o(new d30() { // from class: l.ae40
                    @Override // p149l.d30
                    public final void call() {
                        oe40.f143284g.call(new j760<>(act, intentM62188b2));
                    }
                }).m79891i(act);
            }
        }
    }

    /* JADX INFO: renamed from: r0 */
    public static void m163860r0(final Act act, final String str, final int i) {
        if (!vb4.m197675i()) {
            m163826a0(act, new d30() { // from class: l.vd40
                @Override // p149l.d30
                public final void call() {
                    oe40.m163860r0(act, str, i);
                }
            });
        } else {
            final Intent intentM62189c2 = CompactMediaPickerAct.m62189c2(act, 1, null, false, false, str);
            PermissionHelper.m79882c().m79900r(zqx.m219898k() ? new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"} : new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO", "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}).m79905w(false).m79903u(true).m79897o(new d30() { // from class: l.ge40
                @Override // p149l.d30
                public final void call() {
                    act.startActivityForResult(intentM62189c2, i);
                }
            }).m79891i(act);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public static void m163862s0(Act act, ArrayList<Media> arrayList, String str, boolean z, String str2) {
        m163866u0(act, NewCaptionAct.m62647o2(act, arrayList, false), new e30() { // from class: l.xd40
            @Override // p149l.e30
            public final void call(Object obj) {
                ((Intent) obj).setFlags(603979776);
            }
        }, new d30() { // from class: l.yd40
            @Override // p149l.d30
            public final void call() {
                oe40.m163803E();
            }
        });
    }

    /* JADX INFO: renamed from: t0 */
    public static void m163864t0(Act act, ArrayList<Media> arrayList, String str, boolean z, String str2, boolean z2) {
        m163868v0(act, new NewPostAct.C11244a(act).m62695f(arrayList).m62692c(str2).m62699j(false).m62700k(str).m62701l(z).m62698i(z2).m62690a(), new e30() { // from class: l.be40
            @Override // p149l.e30
            public final void call(Object obj) {
                ((Intent) obj).setFlags(603979776);
            }
        }, new d30() { // from class: l.ce40
            @Override // p149l.d30
            public final void call() {
                oe40.m163803E();
            }
        });
    }

    /* JADX INFO: renamed from: u0 */
    public static void m163866u0(final Act act, final Intent intent, final e30<Intent> e30Var, final d30 d30Var) {
        if (!vb4.m197675i()) {
            m163826a0(act, new d30() { // from class: l.he40
                @Override // p149l.d30
                public final void call() {
                    oe40.m163866u0(act, intent, e30Var, d30Var);
                }
            });
            return;
        }
        if (NullChecker.m81303a(e30Var)) {
            e30Var.call(intent);
        }
        f143284g.call(new j760<>(act, intent));
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: v0 */
    public static void m163868v0(final Act act, final Intent intent, final e30<Intent> e30Var, final d30 d30Var) {
        if (wc40.m202629f()) {
            if (!vb4.m197675i()) {
                m163826a0(act, new d30() { // from class: l.rd40
                    @Override // p149l.d30
                    public final void call() {
                        oe40.m163868v0(act, intent, e30Var, d30Var);
                    }
                });
            } else if (sti.m185955a()) {
                v1h.m196580P0(act, new d30() { // from class: l.sd40
                    @Override // p149l.d30
                    public final void call() {
                        lsi0.m151593w(R$string.f38983U1);
                    }
                }, false, new d30() { // from class: l.td40
                    @Override // p149l.d30
                    public final void call() {
                        oe40.m163870w0(act, intent, e30Var, d30Var);
                    }
                }, w1h.f184003a);
            } else {
                m163870w0(act, intent, e30Var, d30Var);
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m163869w(Act act, Intent intent, boolean z) {
        f143284g.call(new j760<>(act, intent));
        if (z) {
            act.overridePendingTransition(uzb0.f178984i, 0);
        }
    }

    /* JADX INFO: renamed from: w0 */
    public static void m163870w0(Act act, Intent intent, e30<Intent> e30Var, d30 d30Var) {
        if (NullChecker.m81303a(e30Var)) {
            e30Var.call(intent);
        }
        f143284g.call(new j760<>(act, intent));
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m163871x(Throwable th) {
    }

    /* JADX INFO: renamed from: x0 */
    public static boolean m163872x0(Act act, String str) {
        return m163874y0(act, str, null);
    }

    /* JADX INFO: renamed from: y0 */
    public static boolean m163874y0(Act act, String str, TopicMoment topicMoment) {
        if (!FeedModule.f38855d.f193019U.get().booleanValue()) {
            return false;
        }
        m163866u0(act, NewCaptionAct.m62647o2(act, vwb.m200299M(Picture.new_()), true), null, null);
        return true;
    }

    /* JADX INFO: renamed from: z0 */
    public static void m163876z0(final j760<Integer, Moment> j760Var) {
        e51.m114748M(new Runnable() { // from class: l.fe40
            @Override // java.lang.Runnable
            public final void run() {
                oe40.m163849m(j760Var);
            }
        });
    }
}
