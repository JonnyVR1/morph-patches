package com.p000p1.mobile.putong.core.p001ui.profile.photo;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.core.p001ui.profile.MediaReorderCard;
import com.p000p1.mobile.putong.core.p001ui.profile.VReorderCard;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType;
import com.p000p1.mobile.putong.core.p001ui.profile.photo.AvatarCard;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.NewTags;
import com.p1.mobile.putong.core.data.PhotoLowModelData;
import com.p1.mobile.putong.core.data.PictureServeCheckResult;
import com.p1.mobile.putong.core.newui.profile.TagChooseMkAct;
import com.p1.mobile.putong.core.view.AvatarUpdateCheckType;
import com.p1.mobile.putong.core.view.AvatarUpdateProgress;
import com.p1.mobile.putong.core.view.AvatarUpdateType;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.MediaLabel;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.Video;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.Locale;
import l.cwf0;
import l.dd80;
import l.e30;
import l.e3c0;
import l.e51;
import l.f0m;
import l.j0m;
import l.j760;
import l.jo0;
import l.lqa;
import l.lrj0;
import l.lsi0;
import l.mkd0;
import l.qib0;
import l.t100;
import l.tk1;
import l.ura;
import l.v9j;
import l.vwb;
import l.w9j;
import l.wwc0;
import l.xdl0;
import l.zvf0;
import p002l.ho4;
import p002l.jh70;
import p002l.qk1;
import rx.c;
import rx.subjects.a;
import v.VDraweeView;
import v.VFrame;
import v.VFrame_Anim;
import v.VImage;
import v.VLinear;
import v.VProgressBar;
import v.VText;
import v.VText_NoTopPadding;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class AvatarCard extends VReorderCard {

    /* JADX INFO: renamed from: A */
    public VText f1397A;

    /* JADX INFO: renamed from: B */
    public VText_NoTopPadding f1398B;

    /* JADX INFO: renamed from: C */
    public VText_NoTopPadding f1399C;

    /* JADX INFO: renamed from: D */
    public VText_NoTopPadding f1400D;

    /* JADX INFO: renamed from: E */
    public VFrame_Anim f1401E;

    /* JADX INFO: renamed from: F */
    public VImage f1402F;

    /* JADX INFO: renamed from: G */
    public VProgressBar f1403G;

    /* JADX INFO: renamed from: H */
    public VImage f1404H;

    /* JADX INFO: renamed from: I */
    public VText f1405I;

    /* JADX INFO: renamed from: J */
    public qk1 f1406J;

    /* JADX INFO: renamed from: K */
    public long f1407K;

    /* JADX INFO: renamed from: L */
    public lrj0 f1408L;

    /* JADX INFO: renamed from: M */
    public a<lrj0.b> f1409M;

    /* JADX INFO: renamed from: N */
    public lrj0.b f1410N;

    /* JADX INFO: renamed from: O */
    public boolean f1411O;

    /* JADX INFO: renamed from: P */
    public ObjectAnimator f1412P;

    /* JADX INFO: renamed from: r */
    public VFrame f1413r;

    /* JADX INFO: renamed from: s */
    public VLinear f1414s;

    /* JADX INFO: renamed from: t */
    public VImage f1415t;

    /* JADX INFO: renamed from: u */
    public VText f1416u;

    /* JADX INFO: renamed from: v */
    public VText f1417v;

    /* JADX INFO: renamed from: w */
    public VDraweeView f1418w;

    /* JADX INFO: renamed from: x */
    public View f1419x;

    /* JADX INFO: renamed from: y */
    public VImage f1420y;

    /* JADX INFO: renamed from: z */
    public VImage f1421z;

    public enum ClickAction {
        CHOOSE_PICTURE,
        CHOOSE_VIDEO,
        CHOOSE_PICTURE_AND_VIDEO,
        EDIT_PICTURE,
        RETRY_UPLOAD,
        DELETE_PICTURE,
        EDIT_PICTURE_TAG
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.photo.AvatarCard$a */
    public static /* synthetic */ class C0109a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f1422a;

        static {
            int[] iArr = new int[ClickAction.values().length];
            f1422a = iArr;
            try {
                iArr[ClickAction.CHOOSE_PICTURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1422a[ClickAction.CHOOSE_VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1422a[ClickAction.CHOOSE_PICTURE_AND_VIDEO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1422a[ClickAction.EDIT_PICTURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1422a[ClickAction.RETRY_UPLOAD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1422a[ClickAction.DELETE_PICTURE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1422a[ClickAction.EDIT_PICTURE_TAG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public AvatarCard(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m2266K(cwf0 cwf0Var, DialogInterface dialogInterface) {
        cwf0Var.i();
        cwf0Var.l();
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ void m2267L(cwf0 cwf0Var, DialogInterface dialogInterface) {
        cwf0Var.i();
        cwf0Var.l();
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m2279A0(cwf0 cwf0Var, DialogInterface dialogInterface) {
        cwf0Var.k();
        cwf0Var.j();
        this.f1411O = false;
    }

    /* JADX INFO: renamed from: B0 */
    public final /* synthetic */ void m2280B0(String str) {
        m2295c0(ClickAction.CHOOSE_PICTURE);
        zvf0.u("e_replace_photo", "p_lowqualityphoto__popup", new j760[]{j760.a("lowquality_reason", str)});
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ void m2281C0(cwf0 cwf0Var, DialogInterface dialogInterface) {
        cwf0Var.k();
        cwf0Var.j();
        this.f1411O = false;
    }

    /* JADX INFO: renamed from: D0 */
    public final void m2282D0() {
        ObjectAnimator objectAnimator = this.f1412P;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.f1416u.setTextColor(Color.parseColor("#33000000"));
        this.f1417v.setTextColor(Color.parseColor("#33000000"));
        this.f1415t.setColorFilter((ColorFilter) null);
        if (this.f1413r.getBackground() != null) {
            this.f1413r.getBackground().clearColorFilter();
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final void m2283E0(lrj0.b bVar) {
        AvatarUpdateProgress avatarUpdateProgress;
        AvatarUpdateProgress avatarUpdateProgress2;
        if (this.f1406J == null || (avatarUpdateProgress = bVar.a) == AvatarUpdateProgress.CANCEL || avatarUpdateProgress == AvatarUpdateProgress.CROP || avatarUpdateProgress == AvatarUpdateProgress.PICK) {
            return;
        }
        if (avatarUpdateProgress.isLoading()) {
            m1233f();
        }
        final Media media = bVar.b;
        if (NullChecker.a(media) && NullChecker.a(media.cover())) {
            xdl0.Q0(this.f1418w, new e30() { // from class: l.mk1
                public final void call(Object obj) {
                    this.f15416a.m2313u0(media, (int[]) obj);
                }
            });
        } else if (media instanceof Video) {
            qib0.G.m0(this.f1418w, media.url);
        } else {
            qib0.G.o(this.f1418w);
        }
        xdl0.M0(this.f1421z, media instanceof Video);
        xdl0.M0(this.f1403G, bVar.a.isLoading());
        if (bVar.e && bVar.a == AvatarUpdateProgress.FINISH && media != null && TEnum.equals(media.status, "normal")) {
            xdl0.M0(this.f1404H, true);
            e51.H(getContext(), new Runnable() { // from class: l.nk1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f16078a.m2314v0();
                }
            }, 1000L);
        }
        if (m2298f0(bVar, media)) {
            xdl0.M0(this.f1402F, true);
            m2289K0(false);
            this.f1419x.animate().alpha(1.0f).start();
        } else {
            this.f1419x.animate().alpha(0.0f).start();
            xdl0.M0(this.f1402F, false);
            m2289K0(media != null);
        }
        if (media == null || !this.f1406J.m21309r()) {
            xdl0.M0(this.f1399C, false);
        } else {
            NewTags newTagsGh = !vwb.J(media.tags) ? ura.e().d().Gh((String) media.tags.get(0)) : null;
            if (!NullChecker.a(newTagsGh) || TextUtils.isEmpty(newTagsGh.name)) {
                xdl0.M0(this.f1399C, false);
            } else {
                xdl0.M0(this.f1399C, true);
                this.f1399C.setText(newTagsGh.name);
            }
        }
        xdl0.M0(this.f1400D, this.f1406J.m21308q() && media != null && ((avatarUpdateProgress2 = bVar.a) == AvatarUpdateProgress.FINISH || avatarUpdateProgress2 == AvatarUpdateProgress.IDLE) && !xdl0.O0(this.f1399C));
        xdl0.M0(this.f1398B, (media == null || TextUtils.isEmpty(this.f1406J.m21304m()) || bVar.i) ? false : true);
        xdl0.M0(this.f1397A, bVar.i);
        if (bVar.a == AvatarUpdateProgress.FINISH && !this.f1411O) {
            m2300h0(media, bVar.g);
        }
        if (bVar.a == AvatarUpdateProgress.ADD_TAG_FINISH && NullChecker.a(this.f868c.f9399f.f897h)) {
            this.f868c.f9399f.f897h.mo1669c();
        }
    }

    /* JADX INFO: renamed from: F0 */
    public final void m2284F0() {
        this.f1408L.I0(getContext(), m2299g0(false, false), this.f1409M);
    }

    /* JADX INFO: renamed from: G0 */
    public final void m2285G0() {
        xdl0.M(this.f1417v, true);
        List list = lqa.w() ? lqa.s().weight.picture : lqa.c().weight.picture;
        if (m1246v() < 0 || m1246v() >= list.size() || ((Integer) list.get(m1246v())).intValue() <= 0) {
            return;
        }
        this.f1417v.setText(String.format(Locale.getDefault(), "+%d%%", list.get(m1246v())));
    }

    /* JADX INFO: renamed from: H0 */
    public final void m2286H0(final Media media) {
        final User userMa = CoreModule.c.e0.ma();
        ho4 ho4Var = new ho4(getContext(), userMa.fp(), (Picture) media, new Runnable() { // from class: l.ek1
            @Override // java.lang.Runnable
            public final void run() {
                this.f9830a.m2316x0(userMa, media);
            }
        });
        ho4Var.i(new f0m() { // from class: l.fk1
            /* JADX INFO: renamed from: a */
            public final void m13266a(j0m j0mVar) {
                this.f10433a.m2317y0(j0mVar);
            }
        });
        ho4Var.show();
        this.f1411O = true;
    }

    /* JADX INFO: renamed from: I0 */
    public final void m2287I0(final PictureServeCheckResult pictureServeCheckResult) {
        if (pictureServeCheckResult == null || TextUtils.isEmpty(pictureServeCheckResult.lowPhotoResult.conclusion)) {
            return;
        }
        final cwf0 cwf0Var = new cwf0("p_lowqualityphoto__popup", Dialog.class.getName());
        new dd80.a(getContext()).y0("温馨提示").t0(pictureServeCheckResult.lowPhotoResult.conclusion).c0("更换照片", new Runnable() { // from class: l.ak1
            @Override // java.lang.Runnable
            public final void run() {
                this.f7663a.m2318z0(pictureServeCheckResult);
            }
        }).X("稍后再说", new Runnable() { // from class: l.bk1
            @Override // java.lang.Runnable
            public final void run() {
                zvf0.u("e_replace_photo_cancel", "p_lowqualityphoto__popup", new j760[]{j760.a("lowquality_reason", pictureServeCheckResult.lowPhotoResult.mapping)});
            }
        }).o0(new DialogInterface.OnShowListener() { // from class: l.ck1
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                AvatarCard.m2266K(cwf0Var, dialogInterface);
            }
        }).n0(new DialogInterface.OnDismissListener() { // from class: l.dk1
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f9310a.m2279A0(cwf0Var, dialogInterface);
            }
        }).r0();
        this.f1411O = true;
    }

    /* JADX INFO: renamed from: J0 */
    public final void m2288J0(String str, PictureServeCheckResult pictureServeCheckResult) {
        String str2;
        final String str3;
        if (pictureServeCheckResult == null) {
            return;
        }
        final cwf0 cwf0Var = new cwf0("p_lowqualityphoto__popup", Dialog.class.getName());
        if (TextUtils.equals(str, MediaReorderCard.f774Q0)) {
            PhotoLowModelData photoLowModelData = pictureServeCheckResult.repeatPictureResult;
            str2 = photoLowModelData.conclusion;
            str3 = photoLowModelData.mapping;
        } else if (TextUtils.equals(str, MediaReorderCard.f775R0)) {
            PhotoLowModelData photoLowModelData2 = pictureServeCheckResult.netPictureResult;
            str2 = photoLowModelData2.conclusion;
            str3 = photoLowModelData2.mapping;
        } else {
            str2 = "";
            str3 = "";
        }
        cwf0Var.p(new j760[]{j760.a("lowquality_reason", str3)});
        new dd80.a(getContext()).y0("温馨提示").t0(str2).c0("更换照片", new Runnable() { // from class: l.wj1
            @Override // java.lang.Runnable
            public final void run() {
                this.f21798a.m2280B0(str3);
            }
        }).X("稍后再说", new Runnable() { // from class: l.xj1
            @Override // java.lang.Runnable
            public final void run() {
                zvf0.u("e_replace_photo_cancel", "p_lowqualityphoto__popup", new j760[]{j760.a("lowquality_reason", str3)});
            }
        }).o0(new DialogInterface.OnShowListener() { // from class: l.yj1
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                AvatarCard.m2267L(cwf0Var, dialogInterface);
            }
        }).n0(new DialogInterface.OnDismissListener() { // from class: l.zj1
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f23448a.m2281C0(cwf0Var, dialogInterface);
            }
        }).r0();
        this.f1411O = true;
    }

    /* JADX INFO: renamed from: K0 */
    public final void m2289K0(boolean z) {
        if (m1235h() != null && m1235h().f894e) {
            z = false;
        }
        xdl0.M0(this.f1420y, z);
    }

    /* JADX INFO: renamed from: X */
    public final void m2290X(View view) {
        tk1.a(this, view);
    }

    /* JADX INFO: renamed from: Y */
    public final void m2291Y() {
        qk1 qk1Var = this.f1406J;
        if (qk1Var != null) {
            if (wwc0.a(qk1Var.m21293b())) {
                this.f1413r.setBackgroundResource(this.f1406J.m21293b());
            }
            boolean zA = wwc0.a(this.f1406J.m21296e());
            VImage vImage = this.f1420y;
            if (zA) {
                vImage.setImageResource(this.f1406J.m21296e());
            } else {
                vImage.setImageResource(0);
            }
            if (wwc0.a(this.f1406J.m21306o())) {
                this.f1421z.setImageResource(this.f1406J.m21306o());
            }
            if (wwc0.a(this.f1406J.m21297f())) {
                this.f1402F.setImageResource(this.f1406J.m21297f());
            }
            if (wwc0.a(this.f1406J.m21300i())) {
                this.f1403G.setColor(this.f1406J.m21300i());
            }
            if (wwc0.a(this.f1406J.m21301j())) {
                this.f1404H.setImageResource(this.f1406J.m21301j());
            }
            boolean zA2 = wwc0.a(this.f1406J.m21302k());
            VImage vImage2 = this.f1415t;
            if (zA2) {
                vImage2.setImageResource(this.f1406J.m21302k());
                xdl0.M(this.f1415t, true);
            } else {
                vImage2.setImageResource(0);
                xdl0.M(this.f1415t, false);
            }
            boolean zIsEmpty = TextUtils.isEmpty(this.f1406J.m21303l());
            VText vText = this.f1416u;
            if (zIsEmpty) {
                vText.setText(null);
                xdl0.M(this.f1416u, false);
            } else {
                vText.setText(this.f1406J.m21303l());
                xdl0.M(this.f1416u, true);
            }
            boolean zIsEmpty2 = TextUtils.isEmpty(this.f1406J.m21304m());
            VText_NoTopPadding vText_NoTopPadding = this.f1398B;
            if (zIsEmpty2) {
                vText_NoTopPadding.setText(null);
                xdl0.M(this.f1398B, false);
            } else {
                vText_NoTopPadding.setText(this.f1406J.m21304m());
                xdl0.M(this.f1398B, true);
            }
            if (this.f1406J.m21310s()) {
                m2285G0();
            } else {
                this.f1417v.setText(null);
                xdl0.M(this.f1417v, false);
            }
            if (this.f1406J.m21292a()) {
                m2301i0();
            } else {
                m2282D0();
            }
            this.f879n = this.f1406J.m21294c();
            this.f881p = this.f1406J.m21298g();
            xdl0.M(this.f1405I, false);
            if (this.f1406J.m21311t()) {
                m2302j0();
            }
        }
    }

    /* JADX INFO: renamed from: Z */
    public final void m2292Z(boolean z, boolean z2) {
        this.f1408L.J0(getContext(), m2299g0(z, z2), this.f1409M);
    }

    /* JADX INFO: renamed from: a0 */
    public final void m2293a0() {
        lrj0.b bVar = (lrj0.b) this.f1409M.e();
        if (bVar == null || bVar.b == null) {
            this.f1406J.m21295d().mo2331d(this, m1246v());
            return;
        }
        if (bVar.a.isLoading()) {
            this.f1406J.m21295d().m2328a(this, m1246v());
        } else if (!bVar.a.isSuccess() || m2298f0(bVar, getMedia())) {
            this.f1406J.m21295d().mo2329b(this, m1246v());
        } else {
            this.f1406J.m21295d().mo2330c(this, m1246v());
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m2294b0() {
        lrj0.b bVar = new lrj0.b();
        bVar.b = null;
        bVar.f = true;
        this.f1409M.onNext(bVar);
        m1238l();
        this.f1408L.H0();
    }

    /* JADX INFO: renamed from: c0 */
    public void m2295c0(ClickAction clickAction) {
        switch (C0109a.f1422a[clickAction.ordinal()]) {
            case 1:
                m2292Z(true, false);
                break;
            case 2:
                m2292Z(false, true);
                break;
            case 3:
                m2292Z(false, false);
                break;
            case 4:
                m2296d0();
                break;
            case 5:
                m2284F0();
                break;
            case 6:
                m2294b0();
                break;
            case ExpLoopInputType.FRIEND_PURPOSE /* 7 */:
                m2297e0();
                break;
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final void m2296d0() {
        Media media = getMedia();
        if (media != null) {
            this.f1408L.a0(getContext(), m2299g0(false, false).j(media.tags).i(!vwb.J(media.tags)), this.f1409M);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final void m2297e0() {
        Media media;
        lrj0.b bVar = (lrj0.b) this.f1409M.e();
        if (bVar == null || (media = bVar.b) == null) {
            return;
        }
        final Media mediaClone = media.clone();
        TagChooseMkAct.v2(getContext(), vwb.M(mediaClone), (String) null, new Runnable() { // from class: l.pk1
            @Override // java.lang.Runnable
            public final void run() {
                this.f17446a.m2306n0(mediaClone);
            }
        }, (Runnable) null);
    }

    /* JADX INFO: renamed from: f0 */
    public final boolean m2298f0(lrj0.b bVar, Media media) {
        if (bVar == null || media == null) {
            return false;
        }
        boolean z = media instanceof Picture;
        return !bVar.a.isSuccess() || (z && this.f1406J.m21299h().mo15912c() && ((Picture) media).isLabelJudge(MediaLabel.get("WITH_AUDIT_AI_PICTURE"))) || (z && this.f1406J.m21299h().mo15913d() && ((Picture) media).isLabelJudge(MediaLabel.get("WITH_REPEAT_MAIN_PICTURE"))) || (z && this.f1406J.m21299h().mo15910a() && ((Picture) media).isLabelJudge(MediaLabel.get("WITH_NET_MAIN_PICTURE"))) || (z && this.f1406J.m21299h().mo15914e() && ((Picture) media).isLabelJudge(MediaLabel.get("WITH_LOW")));
    }

    /* JADX INFO: renamed from: g0 */
    public final lrj0.a m2299g0(boolean z, boolean z2) {
        lrj0.a aVarI = new lrj0.a().n(this.f1406J.m21305n()).k(z).l(z2).i(this.f1406J.m21309r());
        if (this.f1406J.m21307p()) {
            aVarI.h(AvatarUpdateCheckType.LOCAL_CHECK);
        }
        jh70 jh70VarM21299h = this.f1406J.m21299h();
        if (!jh70VarM21299h.mo15913d() && !jh70VarM21299h.mo15914e() && !jh70VarM21299h.mo15910a() && !jh70VarM21299h.mo15911b()) {
            return aVarI;
        }
        aVarI.h(AvatarUpdateCheckType.REMOTE_CHECK);
        aVarI.m("editProfile");
        return aVarI;
    }

    public qk1 getConfig() {
        return this.f1406J;
    }

    public Media getMedia() {
        if (!NullChecker.a(this.f1409M)) {
            return null;
        }
        lrj0.b bVar = (lrj0.b) this.f1409M.e();
        if (NullChecker.a(bVar)) {
            return bVar.b;
        }
        return null;
    }

    public lrj0.b getMediaStateResult() {
        if (!NullChecker.a(this.f1409M)) {
            return null;
        }
        lrj0.b bVar = (lrj0.b) this.f1409M.e();
        if (NullChecker.a(bVar)) {
            return bVar;
        }
        return null;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m2300h0(Media media, PictureServeCheckResult pictureServeCheckResult) {
        if (this.f1406J.m21305n() == AvatarUpdateType.AVATAR && (media instanceof Picture) && m1246v() == 0) {
            Picture picture = (Picture) media;
            if (this.f1406J.m21299h().mo15911b() && picture.isLabelJudge(MediaLabel.get("NOT_VERIFICATION")) && CoreModule.c.e0.na().isPicVerificationVerified()) {
                m2286H0(picture);
                return;
            }
            if (this.f1406J.m21299h().mo15913d() && picture.isLabelJudge(MediaLabel.get("WITH_REPEAT_MAIN_PICTURE"))) {
                m2288J0(MediaReorderCard.f774Q0, pictureServeCheckResult);
                return;
            }
            if (this.f1406J.m21299h().mo15914e() && picture.isLow()) {
                m2287I0(pictureServeCheckResult);
            } else if (this.f1406J.m21299h().mo15910a() && picture.isLabelJudge(MediaLabel.get("WITH_NET_MAIN_PICTURE"))) {
                m2288J0(MediaReorderCard.f775R0, pictureServeCheckResult);
            }
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final void m2301i0() {
        if (this.f1412P != null) {
            return;
        }
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(this.f1416u, "textColor", new ArgbEvaluator(), Integer.valueOf(Color.parseColor("#e2e2e2")), Integer.valueOf(Color.parseColor("#FF7602")));
        this.f1412P = objectAnimatorOfObject;
        objectAnimatorOfObject.setDuration(800L);
        this.f1412P.setRepeatCount(4);
        this.f1412P.setInterpolator(null);
        this.f1412P.setRepeatMode(2);
        this.f1412P.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.lk1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f14911a.m2307o0(valueAnimator);
            }
        });
        if (this.f1412P.isStarted()) {
            return;
        }
        this.f1412P.start();
    }

    /* JADX INFO: renamed from: j0 */
    public final void m2302j0() {
        this.f1399C.setTextSize(10.0f);
        this.f1400D.setTextSize(10.0f);
        this.f1398B.setTextSize(10.0f);
        this.f1398B.setBackgroundResource(e3c0.o);
        this.f1400D.setTextColor(Color.parseColor("#FF700A"));
        this.f1400D.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        xdl0.C0(this.f1399C, t100.d(20.0f));
        xdl0.C0(this.f1398B, t100.d(20.0f));
        xdl0.C0(this.f1400D, t100.d(20.0f));
        this.f1421z.setImageResource(e3c0.y);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f1402F.getLayoutParams();
        layoutParams.gravity = 17;
        this.f1402F.setLayoutParams(layoutParams);
        xdl0.W(this.f1402F, 0);
        xdl0.U(this.f1402F, 0);
    }

    /* JADX INFO: renamed from: k0 */
    public final void m2303k0() {
        lrj0 lrj0Var = new lrj0();
        this.f1408L = lrj0Var;
        this.f1409M = lrj0Var.c0();
        getContext().duringCreated(new v9j() { // from class: l.jk1
            public final Object call() {
                return this.f13838a.m2308p0();
            }
        }, false).subscribe(mkd0.G(new e30() { // from class: l.kk1
            public final void call(Object obj) {
                this.f14362a.m2309q0((lrj0.b) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l0 */
    public final void m2304l0() {
        xdl0.E0(this.f1420y, new View.OnClickListener() { // from class: l.vj1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21185a.m2310r0(view);
            }
        });
        xdl0.E0(this.f1399C, new View.OnClickListener() { // from class: l.gk1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11481a.m2311s0(view);
            }
        });
        xdl0.E0(this.f1400D, new View.OnClickListener() { // from class: l.ik1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13283a.m2312t0(view);
            }
        });
    }

    /* JADX INFO: renamed from: m0 */
    public boolean m2305m0() {
        if (NullChecker.a(this.f1409M)) {
            lrj0.b bVar = (lrj0.b) this.f1409M.e();
            if (NullChecker.a(bVar) && bVar.e && bVar.b != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m2307o0(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.f1416u.setTextColor(iIntValue);
        VImage vImage = this.f1415t;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        vImage.setColorFilter(new PorterDuffColorFilter(iIntValue, mode));
        this.f1417v.setTextColor(iIntValue);
        this.f1413r.getBackground().setColorFilter(new PorterDuffColorFilter(((Integer) valueAnimator.getAnimatedValue()).intValue(), mode));
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.VReorderCard, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m2290X(this);
        m2304l0();
        m2303k0();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ c m2308p0() {
        return this.f1409M.onBackpressureLatest().filter(new w9j() { // from class: l.ok1
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.a((lrj0.b) obj));
            }
        }).observeOn(jo0.a());
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m2309q0(lrj0.b bVar) {
        if (bVar.equals(this.f1410N)) {
            return;
        }
        this.f1410N = bVar.a();
        mo1128k(bVar.b == null);
        m2283E0(bVar);
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m2310r0(View view) {
        m2293a0();
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m2311s0(View view) {
        m2297e0();
    }

    public void setConfig(qk1 qk1Var) {
        this.f1406J = qk1Var;
        m2291Y();
    }

    public void setIllegalVisible(boolean z) {
        lrj0.b bVar = (lrj0.b) this.f1409M.e();
        if (bVar != null) {
            bVar.i = z;
            this.f1409M.onNext(bVar);
        }
    }

    /* JADX INFO: renamed from: setMedia, reason: merged with bridge method [inline-methods] */
    public void m2306n0(Media media) {
        lrj0.b bVar = (media == null || this.f1409M.e() == null) ? new lrj0.b() : (lrj0.b) this.f1409M.e();
        bVar.b = media;
        this.f1409M.onNext(bVar);
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m2312t0(View view) {
        m2297e0();
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.VReorderCard
    /* JADX INFO: renamed from: u */
    public void mo1140u() {
        if (SystemClock.uptimeMillis() - this.f1407K < 300) {
            return;
        }
        this.f1407K = SystemClock.uptimeMillis();
        m2293a0();
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m2313u0(Media media, int[] iArr) {
        if (NullChecker.a(media.cover())) {
            qib0.G.J0(this.f1418w, media.cover().profile480(), false);
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m2314v0() {
        xdl0.M0(this.f1404H, false);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.VReorderCard
    /* JADX INFO: renamed from: w */
    public void mo1143w(boolean z) {
        super.mo1143w(z);
        m2289K0(!z);
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ void m2315w0(AvatarCards avatarCards, Media media) {
        avatarCards.m1257h(avatarCards.m1258i()).m2306n0(media);
        m1233f();
        lsi0.y("新上传头像已保存为生活照");
        zvf0.x("e_new_avatar_save_toast", "p_edit_profile_view");
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m2316x0(User user, final Media media) {
        m2306n0(user.picture(0));
        if (getParent() instanceof AvatarCards) {
            final AvatarCards avatarCards = (AvatarCards) getParent();
            if (avatarCards.m1258i() >= avatarCards.f893d) {
                lsi0.y(String.format(Locale.CHINA, "%s已达上限，不保存新上传头像", lqa.w() ? "生活照" : "我的照片"));
                m1233f();
            } else {
                if (avatarCards.m1257h(avatarCards.m1258i()).f1406J.m21309r()) {
                    TagChooseMkAct.v2(getContext(), vwb.M(media), (String) null, new Runnable() { // from class: l.hk1
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f12083a.m2315w0(avatarCards, media);
                        }
                    }, (Runnable) null);
                    return;
                }
                avatarCards.m1257h(avatarCards.m1258i()).m2306n0(media);
                m1233f();
                lsi0.y("新上传头像已保存为其他照片");
                zvf0.x("e_new_avatar_save_toast", "p_edit_profile_view");
            }
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m2317y0(j0m j0mVar) {
        this.f1411O = false;
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m2318z0(PictureServeCheckResult pictureServeCheckResult) {
        m2295c0(ClickAction.CHOOSE_PICTURE);
        zvf0.u("e_replace_photo", "p_lowqualityphoto__popup", new j760[]{j760.a("lowquality_reason", pictureServeCheckResult.lowPhotoResult.mapping)});
    }

    public AvatarCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AvatarCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
