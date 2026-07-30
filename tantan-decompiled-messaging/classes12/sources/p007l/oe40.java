package p007l;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.Picture;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p000p1.mobile.putong.feed.newui.camera.ImageEditAct;
import com.p000p1.mobile.putong.feed.newui.camera.VideoEditAct;
import com.p000p1.mobile.putong.feed.newui.kankan.recorder.ComicFaceRecorderActivity;
import com.p000p1.mobile.putong.feed.newui.mediapicker.CompactMediaPickerAct;
import com.p000p1.mobile.putong.feed.newui.mediapicker.NewAlbumSelectFrameAct;
import com.p000p1.mobile.putong.feed.newui.mediapicker.NewAlbumVideoEditAct;
import com.p000p1.mobile.putong.feed.newui.mediapicker.newcaption.NewCaptionAct;
import com.p000p1.mobile.putong.feed.newui.mediapicker.post.NewPostAct;
import com.p000p1.mobile.putong.feed.p005ui.moments.CaptionAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p1.mobile.putong.safety.IllegalPictureException;
import com.p1.mobile.putong.ui.permission.PermissionHelper;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import l.d30;
import l.e30;
import l.e51;
import l.j760;
import l.lsi0;
import l.mkd0;
import l.roj0;
import l.vwb;
import l.w9j;
import l.wc40;
import l.xck0;
import l.yij0;
import l.zqx;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class oe40 {

    /* JADX INFO: renamed from: a */
    public static int f11441a = 10010;

    /* JADX INFO: renamed from: b */
    public static int f11442b = 6;

    /* JADX INFO: renamed from: c */
    public static Moment f11443c = new Moment();

    /* JADX INFO: renamed from: d */
    public static Moment f11444d = null;

    /* JADX INFO: renamed from: e */
    public static a<j760<Integer, Moment>> f11445e = a.b();

    /* JADX INFO: renamed from: f */
    public static a<j760<Integer, Moment>> f11446f = a.b();

    /* JADX INFO: renamed from: g */
    public static e30<j760<Act, Intent>> f11447g = xck0.a(400, new e30() { // from class: l.kd40
        public final void call(Object obj) {
            oe40.m12539D((j760) obj);
        }
    });

    /* JADX INFO: renamed from: h */
    public static a<Moment> f11448h = a.b();

    /* JADX INFO: renamed from: i */
    public static a<Moment> f11449i = a.b();

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m12535A(j760 j760Var) {
        if (NullChecker.b(j760Var) && ((Integer) j760Var.a).intValue() == 0) {
            f11448h.onNext(f11443c);
            f11442b = 6;
        }
        f11445e.onNext(j760Var);
        f11442b = ((Integer) j760Var.a).intValue();
        Object obj = j760Var.b;
        if (obj != null) {
            Moment moment = (Moment) obj;
            f11444d = moment;
            if (TextUtils.isEmpty(((DbObject) moment).id)) {
                return;
            }
            FeedModule.f320h.m13955A0(f11444d);
        }
    }

    /* JADX INFO: renamed from: A0 */
    public static void m12536A0(final j760<Integer, Moment> j760Var) {
        e51.M(new Runnable() { // from class: l.ee40
            @Override // java.lang.Runnable
            public final void run() {
                oe40.m12535A(j760Var);
            }
        });
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m12539D(final j760 j760Var) {
        if (nkg.m12274x0()) {
            kyg.m11536e((Act) j760Var.a, "p_fake_nearby_moment_popup", null, new d30() { // from class: l.ld40
                public final void call() {
                    oe40.m12574g(j760Var);
                }
            });
        } else if (NullChecker.a(j760Var.a)) {
            ((Act) j760Var.a).startActivity((Intent) j760Var.b);
        }
    }

    /* JADX INFO: renamed from: E */
    public static void m12540E() {
        Iterator it = Act.globalLifeCycle_().values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((ArrayList) it.next()).iterator();
            while (it2.hasNext()) {
                Activity activity = (Activity) ((Act.r) it2.next()).a.get();
                if (activity != null && ((activity instanceof CompactMediaPickerAct) || (activity instanceof VideoEditAct) || (activity instanceof ImageEditAct) || (activity instanceof NewAlbumVideoEditAct) || (activity instanceof MediaPickerAct) || (activity instanceof ComicFaceRecorderActivity))) {
                    activity.finish();
                }
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public static c<Moment> m12541F() {
        return f11448h.filter(new w9j() { // from class: l.ke40
            public final Object call(Object obj) {
                return Boolean.valueOf(!((Moment) obj).equals(oe40.f11443c));
            }
        });
    }

    /* JADX INFO: renamed from: G */
    public static c<Moment> m12542G() {
        return f11449i.filter(new w9j() { // from class: l.qd40
            public final Object call(Object obj) {
                return Boolean.valueOf(!((Moment) obj).equals(oe40.f11443c));
            }
        });
    }

    /* JADX INFO: renamed from: H */
    public static void m12543H() {
        if (NullChecker.a(f11446f.e())) {
            f11446f.onNext(new j760(6, (Object) null));
        }
    }

    /* JADX INFO: renamed from: I */
    public static void m12544I() {
        if (NullChecker.a(f11445e.e())) {
            f11445e.onNext(new j760(6, (Object) null));
        }
    }

    /* JADX INFO: renamed from: J */
    public static boolean m12545J(String str) {
        return TextUtils.equals("newuser_checkin_post_guide_pop", str) || TextUtils.equals("newuser_checkin", str);
    }

    /* JADX INFO: renamed from: K */
    public static boolean m12546K() {
        return f11445e.e() == null || ((Integer) ((j760) f11445e.e()).a).intValue() == 5;
    }

    /* JADX INFO: renamed from: L */
    public static boolean m12547L(Throwable th) {
        return (NullChecker.a(th) && (th instanceof TantanException.Client.TantanForbidden) && ((TantanException.Client.TantanForbidden) th).code == 40365) ? false : true;
    }

    /* JADX INFO: renamed from: M */
    public static void m12548M(final Act act, final NewPostAct.C2088a c2088a) {
        if (wc40.f()) {
            if (!vb4.m15410i()) {
                m12563a0(act, new d30() { // from class: l.ud40
                    public final void call() {
                        oe40.m12548M(act, c2088a);
                    }
                });
            } else {
                if (m12609x0(act, c2088a.f2088a)) {
                    return;
                }
                m12595q0(act, null);
            }
        }
    }

    /* JADX INFO: renamed from: N */
    public static void m12549N(Act act, MusicContent musicContent) {
        m12550O(act, musicContent, null);
    }

    /* JADX INFO: renamed from: O */
    public static void m12550O(Act act, MusicContent musicContent, String str) {
        m12551P(act, musicContent, str, null, null, null);
    }

    /* JADX INFO: renamed from: P */
    public static void m12551P(Act act, MusicContent musicContent, String str, String str2, String str3, TopicMoment topicMoment) {
        m12552Q(act, musicContent, str, str2, str3, topicMoment, null);
    }

    /* JADX INFO: renamed from: Q */
    public static void m12552Q(final Act act, final MusicContent musicContent, final String str, String str2, String str3, TopicMoment topicMoment, String str4) {
        if (wc40.f()) {
            if (!vb4.m15410i()) {
                m12563a0(act, new d30() { // from class: l.ne40
                    public final void call() {
                        oe40.m12550O(act, musicContent, str);
                    }
                });
            } else {
                if (musicContent == null && !m12545J(str) && m12611y0(act, str, topicMoment)) {
                    return;
                }
                m12595q0(act, musicContent);
            }
        }
    }

    /* JADX INFO: renamed from: R */
    public static void m12553R(final Act act, final String str, final Parcelable parcelable) {
        if (!wc40.f()) {
            lsi0.y("当前机型不支持发布动态！");
        } else if (vb4.m15410i()) {
            m12605v0(act, new NewPostAct.C2088a(act).m3697c(str).m3702h(parcelable).m3695a(), null, null);
        } else {
            m12563a0(act, new d30() { // from class: l.od40
                public final void call() {
                    oe40.m12553R(act, str, parcelable);
                }
            });
        }
    }

    /* JADX INFO: renamed from: S */
    public static void m12554S(Moment moment, boolean z, String str) {
        f11448h.onNext(moment);
        m12557V(moment, false, z, str);
    }

    /* JADX INFO: renamed from: T */
    public static void m12555T(Act act, Moment moment, String str) {
        if (FeedModule.m1140H().pe()) {
            f11448h.onNext(moment);
            m12558W(moment, false, false, false, true, str);
        } else {
            m12554S(moment, false, str);
            act.startActivity(kjb0.m11470v(act, true));
        }
    }

    /* JADX INFO: renamed from: U */
    public static void m12556U(Moment moment, boolean z) {
        m12558W(moment, false, z, false, true, null);
    }

    /* JADX INFO: renamed from: V */
    public static void m12557V(Moment moment, boolean z, boolean z2, String str) {
        m12558W(moment, z, false, z2, false, str);
    }

    /* JADX INFO: renamed from: W */
    public static void m12558W(final Moment moment, boolean z, boolean z2, final boolean z3, final boolean z4, final String str) {
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        FeedModule.f316d.m16428Bc(moment, z, z2).subscribe(mkd0.H(new e30() { // from class: l.le40
            public final void call(Object obj) {
                oe40.m12588n(str, z4, moment, jElapsedRealtime, z3, (roj0) obj);
            }
        }, new e30() { // from class: l.me40
            public final void call(Object obj) {
                oe40.m12568d(z4, moment, z3, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: X */
    public static void m12559X(Moment moment) {
        f11449i.onNext(moment);
    }

    /* JADX INFO: renamed from: Y */
    public static c<j760<Integer, Moment>> m12560Y() {
        return f11446f;
    }

    /* JADX INFO: renamed from: Z */
    public static a<j760<Integer, Moment>> m12561Z() {
        return f11445e;
    }

    /* JADX INFO: renamed from: a0 */
    public static void m12563a0(Act act, final d30 d30Var) {
        final Dialog dialogProgress = act.progress("正在下载相机资源");
        dialogProgress.setCancelable(true);
        dialogProgress.setCanceledOnTouchOutside(true);
        dialogProgress.show();
        act.duringCreated(vb4.m15415n()).subscribe(mkd0.H(new e30() { // from class: l.md40
            public final void call(Object obj) {
                oe40.m12566c(dialogProgress, d30Var, (roj0) obj);
            }
        }, new e30() { // from class: l.nd40
            public final void call(Object obj) {
                oe40.m12608x((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: b0 */
    public static void m12565b0(Act act, int i) {
        m12567c0(act, i, true);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m12566c(Dialog dialog, d30 d30Var, roj0 roj0Var) {
        if (dialog.isShowing()) {
            dialog.dismiss();
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: c0 */
    public static void m12567c0(final Act act, final int i, boolean z) {
        if (wc40.f()) {
            if (!vb4.m15410i()) {
                m12563a0(act, new d30() { // from class: l.wd40
                    public final void call() {
                        oe40.m12565b0(act, i);
                    }
                });
                return;
            }
            Intent intentX1 = MediaPickerAct.X1(act, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(i).build()).withVideoPickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).build()).withFadeFinishAnim(z).withFromType(2).withMediaPreviewPageId("p_camera_album_picture_preview").build());
            act.overridePendingTransition(uzb0.f13995i, 0);
            f11447g.call(new j760(act, intentX1));
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m12568d(boolean z, Moment moment, boolean z2, Throwable th) {
        if (z && m12547L(th)) {
            lsi0.y("发布失败");
        }
        kyg.m11538g(true, th);
        zi60.m17436w().m17458o(moment, "p_moment_post", th, z2, null);
        if ((th instanceof IllegalPictureException) && !TextUtils.isEmpty(th.getMessage()) && th.getMessage().toLowerCase(Locale.getDefault()).contains("qrcode")) {
            lsi0.y("图片中存在二维码，发布失败");
        } else if (m12547L(th)) {
            yij0.D(th);
        }
    }

    /* JADX INFO: renamed from: d0 */
    public static void m12569d0(final Act act, final int i, final boolean z, final e30<Intent> e30Var) {
        if (wc40.f()) {
            if (!vb4.m15410i()) {
                m12563a0(act, new d30() { // from class: l.pd40
                    public final void call() {
                        oe40.m12569d0(act, i, z, e30Var);
                    }
                });
                return;
            }
            Intent intentX1 = MediaPickerAct.X1(act, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(i).build()).withVideoPickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).build()).withFadeFinishAnim(z).withFromType(2).withMediaPreviewPageId("p_camera_album_picture_preview").build());
            act.overridePendingTransition(uzb0.f13995i, 0);
            if (NullChecker.a(e30Var)) {
                e30Var.call(intentX1);
            }
            f11447g.call(new j760(act, intentX1));
        }
    }

    /* JADX INFO: renamed from: e0 */
    public static void m12571e0(Act act) {
        m12575g0(act, false, null, "");
    }

    /* JADX INFO: renamed from: f0 */
    public static void m12573f0(Act act, boolean z) {
        m12577h0(act, false, null, "", false, z);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m12574g(j760 j760Var) {
        if (NullChecker.a(j760Var.a)) {
            ((Act) j760Var.a).startActivity((Intent) j760Var.b);
        }
    }

    /* JADX INFO: renamed from: g0 */
    public static void m12575g0(Act act, boolean z, ArrayList<Media> arrayList, String str) {
        m12577h0(act, z, arrayList, str, false, false);
    }

    /* JADX INFO: renamed from: h0 */
    public static void m12577h0(final Act act, boolean z, ArrayList<Media> arrayList, String str, final boolean z2, boolean z3) {
        if (wc40.f()) {
            if (!vb4.m15410i()) {
                m12563a0(act, new d30() { // from class: l.ie40
                    public final void call() {
                        oe40.m12571e0(act);
                    }
                });
            } else {
                final Intent intentM3172d2 = CompactMediaPickerAct.m3172d2(act, 9, null, true, false, z, arrayList, str, z2, z3);
                PermissionHelper.c().r(new String[]{"android.permission.CAMERA"}).w(false).u(true).o(new d30() { // from class: l.je40
                    public final void call() {
                        oe40.m12606w(act, intentM3172d2, z2);
                    }
                }).i(act);
            }
        }
    }

    /* JADX INFO: renamed from: i0 */
    public static void m12579i0(Act act, ArrayList<Media> arrayList, boolean z) {
        m12583k0(act, arrayList, z, null);
    }

    /* JADX INFO: renamed from: j0 */
    public static void m12581j0(Act act, ArrayList<Media> arrayList, boolean z, TopicMoment topicMoment, String str, boolean z2) {
        if (wc40.f()) {
            m12603u0(act, NewCaptionAct.m3653p2(act, arrayList, z, topicMoment, str, true), null, null);
        } else {
            act.startActivity(CaptionAct.m7774X1(act, arrayList));
        }
    }

    /* JADX INFO: renamed from: k0 */
    public static void m12583k0(Act act, ArrayList<Media> arrayList, boolean z, String str) {
        m12585l0(act, arrayList, z, str, null, null);
    }

    /* JADX INFO: renamed from: l0 */
    public static void m12585l0(Act act, ArrayList<Media> arrayList, boolean z, String str, String str2, String str3) {
        m12587m0(act, arrayList, z, str, str2, str3, null);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m12586m(j760 j760Var) {
        if (NullChecker.b(j760Var) && ((Integer) j760Var.a).intValue() == 0) {
            f11449i.onNext(f11443c);
        }
        f11446f.onNext(j760Var);
    }

    /* JADX INFO: renamed from: m0 */
    public static void m12587m0(Act act, ArrayList<Media> arrayList, boolean z, String str, String str2, String str3, TopicMoment topicMoment) {
        m12589n0(act, arrayList, z, str, str2, str3, topicMoment, null);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m12588n(String str, boolean z, Moment moment, long j, boolean z2, roj0 roj0Var) {
        if (TextUtils.equals(str, "p_meet_greet")) {
            lsi0.y("今日偶遇机会+1");
        } else if (z) {
            lsi0.y("发布成功");
        }
        r7i.m13852j0("nearby", moment, SystemClock.elapsedRealtime() - j);
        zi60.m17436w().m17457n(moment, "p_moment_post", 201, z2, null);
    }

    /* JADX INFO: renamed from: n0 */
    public static void m12589n0(Act act, ArrayList<Media> arrayList, boolean z, String str, String str2, String str3, TopicMoment topicMoment, String str4) {
        if (wc40.f()) {
            m12603u0(act, NewCaptionAct.m3652o2(act, arrayList, z), null, null);
        } else {
            act.startActivityForResult(CaptionAct.m7774X1(act, arrayList), 50);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public static void m12591o0(Act act, ArrayList<Media> arrayList) {
        act.startActivity(CaptionAct.m7775Y1(act, arrayList));
    }

    /* JADX INFO: renamed from: p0 */
    public static void m12593p0(final Act act, final Media media) {
        if (vb4.m15410i()) {
            act.startActivityForResult(NewAlbumSelectFrameAct.m3338K2(act, media), f11441a);
        } else {
            m12563a0(act, new d30() { // from class: l.de40
                public final void call() {
                    oe40.m12593p0(act, media);
                }
            });
        }
    }

    /* JADX INFO: renamed from: q0 */
    public static void m12595q0(final Act act, final MusicContent musicContent) {
        if (wc40.f()) {
            if (!vb4.m15410i()) {
                m12563a0(act, new d30() { // from class: l.zd40
                    public final void call() {
                        oe40.m12595q0(act, musicContent);
                    }
                });
            } else {
                final Intent intentM3170b2 = CompactMediaPickerAct.m3170b2(act, 9, musicContent, true, false);
                PermissionHelper.c().r(new String[]{"android.permission.CAMERA"}).w(false).u(true).o(new d30() { // from class: l.ae40
                    public final void call() {
                        oe40.f11447g.call(new j760(act, intentM3170b2));
                    }
                }).i(act);
            }
        }
    }

    /* JADX INFO: renamed from: r0 */
    public static void m12597r0(final Act act, final String str, final int i) {
        if (!vb4.m15410i()) {
            m12563a0(act, new d30() { // from class: l.vd40
                public final void call() {
                    oe40.m12597r0(act, str, i);
                }
            });
        } else {
            final Intent intentM3171c2 = CompactMediaPickerAct.m3171c2(act, 1, null, false, false, str);
            PermissionHelper.c().r(zqx.k() ? new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"} : new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO", "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}).w(false).u(true).o(new d30() { // from class: l.ge40
                public final void call() {
                    act.startActivityForResult(intentM3171c2, i);
                }
            }).i(act);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public static void m12599s0(Act act, ArrayList<Media> arrayList, String str, boolean z, String str2) {
        m12603u0(act, NewCaptionAct.m3652o2(act, arrayList, false), new e30() { // from class: l.xd40
            public final void call(Object obj) {
                ((Intent) obj).setFlags(603979776);
            }
        }, new d30() { // from class: l.yd40
            public final void call() {
                oe40.m12540E();
            }
        });
    }

    /* JADX INFO: renamed from: t0 */
    public static void m12601t0(Act act, ArrayList<Media> arrayList, String str, boolean z, String str2, boolean z2) {
        m12605v0(act, new NewPostAct.C2088a(act).m3700f(arrayList).m3697c(str2).m3704j(false).m3705k(str).m3706l(z).m3703i(z2).m3695a(), new e30() { // from class: l.be40
            public final void call(Object obj) {
                ((Intent) obj).setFlags(603979776);
            }
        }, new d30() { // from class: l.ce40
            public final void call() {
                oe40.m12540E();
            }
        });
    }

    /* JADX INFO: renamed from: u0 */
    public static void m12603u0(final Act act, final Intent intent, final e30<Intent> e30Var, final d30 d30Var) {
        if (!vb4.m15410i()) {
            m12563a0(act, new d30() { // from class: l.he40
                public final void call() {
                    oe40.m12603u0(act, intent, e30Var, d30Var);
                }
            });
            return;
        }
        if (NullChecker.a(e30Var)) {
            e30Var.call(intent);
        }
        f11447g.call(new j760(act, intent));
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: v0 */
    public static void m12605v0(final Act act, final Intent intent, final e30<Intent> e30Var, final d30 d30Var) {
        if (wc40.f()) {
            if (!vb4.m15410i()) {
                m12563a0(act, new d30() { // from class: l.rd40
                    public final void call() {
                        oe40.m12605v0(act, intent, e30Var, d30Var);
                    }
                });
            } else if (sti.m14315a()) {
                v1h.m15219P0(act, new d30() { // from class: l.sd40
                    public final void call() {
                        lsi0.w(R$string.f444U1);
                    }
                }, false, new d30() { // from class: l.td40
                    public final void call() {
                        oe40.m12607w0(act, intent, e30Var, d30Var);
                    }
                }, w1h.f14361a);
            } else {
                m12607w0(act, intent, e30Var, d30Var);
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m12606w(Act act, Intent intent, boolean z) {
        f11447g.call(new j760(act, intent));
        if (z) {
            act.overridePendingTransition(uzb0.f13995i, 0);
        }
    }

    /* JADX INFO: renamed from: w0 */
    public static void m12607w0(Act act, Intent intent, e30<Intent> e30Var, d30 d30Var) {
        if (NullChecker.a(e30Var)) {
            e30Var.call(intent);
        }
        f11447g.call(new j760(act, intent));
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m12608x(Throwable th) {
    }

    /* JADX INFO: renamed from: x0 */
    public static boolean m12609x0(Act act, String str) {
        return m12611y0(act, str, null);
    }

    /* JADX INFO: renamed from: y0 */
    public static boolean m12611y0(Act act, String str, TopicMoment topicMoment) {
        if (!((Boolean) FeedModule.f316d.f14954U.get()).booleanValue()) {
            return false;
        }
        m12603u0(act, NewCaptionAct.m3652o2(act, vwb.M(Picture.new_()), true), null, null);
        return true;
    }

    /* JADX INFO: renamed from: z0 */
    public static void m12613z0(final j760<Integer, Moment> j760Var) {
        e51.M(new Runnable() { // from class: l.fe40
            @Override // java.lang.Runnable
            public final void run() {
                oe40.m12586m(j760Var);
            }
        });
    }
}
