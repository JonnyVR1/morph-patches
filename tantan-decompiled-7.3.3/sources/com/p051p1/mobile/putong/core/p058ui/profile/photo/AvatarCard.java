package com.p051p1.mobile.putong.core.p058ui.profile.photo;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.NewTags;
import com.p051p1.mobile.putong.core.data.PhotoLowModelData;
import com.p051p1.mobile.putong.core.data.PictureServeCheckResult;
import com.p051p1.mobile.putong.core.newui.profile.TagChooseMkAct;
import com.p051p1.mobile.putong.core.p058ui.profile.MediaReorderCard;
import com.p051p1.mobile.putong.core.p058ui.profile.VReorderCard;
import com.p051p1.mobile.putong.core.p058ui.profile.photo.AvatarCard;
import com.p051p1.mobile.putong.core.view.AvatarUpdateCheckType;
import com.p051p1.mobile.putong.core.view.AvatarUpdateProgress;
import com.p051p1.mobile.putong.core.view.AvatarUpdateType;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.MediaLabel;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.Locale;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VFrame_Anim;
import p151v.VImage;
import p151v.VLinear;
import p151v.VProgressBar;
import p151v.VText;
import p151v.VText_NoTopPadding;
import p153l.a5d0;
import p153l.al1;
import p153l.bnl0;
import p153l.d3m;
import p153l.fo0;
import p153l.gp4;
import p153l.gta;
import p153l.i4g0;
import p153l.jl80;
import p153l.jyb;
import p153l.kbc0;
import p153l.l4g0;
import p153l.l51;
import p153l.o1j0;
import p153l.p0k0;
import p153l.pcj;
import p153l.pf60;
import p153l.pp70;
import p153l.psd0;
import p153l.qa00;
import p153l.qcj;
import p153l.uqb0;
import p153l.xk1;
import p153l.xra;
import p153l.y20;
import p153l.z2m;

/* JADX INFO: loaded from: classes4.dex */
public class AvatarCard extends VReorderCard {

    /* JADX INFO: renamed from: A */
    public VText f34423A;

    /* JADX INFO: renamed from: B */
    public VText_NoTopPadding f34424B;

    /* JADX INFO: renamed from: C */
    public VText_NoTopPadding f34425C;

    /* JADX INFO: renamed from: D */
    public VText_NoTopPadding f34426D;

    /* JADX INFO: renamed from: E */
    public VFrame_Anim f34427E;

    /* JADX INFO: renamed from: F */
    public VImage f34428F;

    /* JADX INFO: renamed from: G */
    public VProgressBar f34429G;

    /* JADX INFO: renamed from: H */
    public VImage f34430H;

    /* JADX INFO: renamed from: I */
    public VText f34431I;

    /* JADX INFO: renamed from: J */
    public xk1 f34432J;

    /* JADX INFO: renamed from: K */
    public long f34433K;

    /* JADX INFO: renamed from: L */
    public p0k0 f34434L;

    /* JADX INFO: renamed from: M */
    public C22507a<p0k0.C19267b> f34435M;

    /* JADX INFO: renamed from: N */
    public p0k0.C19267b f34436N;

    /* JADX INFO: renamed from: O */
    public boolean f34437O;

    /* JADX INFO: renamed from: P */
    public ObjectAnimator f34438P;

    /* JADX INFO: renamed from: r */
    public VFrame f34439r;

    /* JADX INFO: renamed from: s */
    public VLinear f34440s;

    /* JADX INFO: renamed from: t */
    public VImage f34441t;

    /* JADX INFO: renamed from: u */
    public VText f34442u;

    /* JADX INFO: renamed from: v */
    public VText f34443v;

    /* JADX INFO: renamed from: w */
    public VDraweeView f34444w;

    /* JADX INFO: renamed from: x */
    public View f34445x;

    /* JADX INFO: renamed from: y */
    public VImage f34446y;

    /* JADX INFO: renamed from: z */
    public VImage f34447z;

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
    public static /* synthetic */ class C8847a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f34448a;

        static {
            int[] iArr = new int[ClickAction.values().length];
            f34448a = iArr;
            try {
                iArr[ClickAction.CHOOSE_PICTURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34448a[ClickAction.CHOOSE_VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34448a[ClickAction.CHOOSE_PICTURE_AND_VIDEO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34448a[ClickAction.EDIT_PICTURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f34448a[ClickAction.RETRY_UPLOAD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f34448a[ClickAction.DELETE_PICTURE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f34448a[ClickAction.EDIT_PICTURE_TAG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public AvatarCard(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m52921K(l4g0 l4g0Var, DialogInterface dialogInterface) {
        l4g0Var.m152774i();
        l4g0Var.m152777l();
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ void m52922L(l4g0 l4g0Var, DialogInterface dialogInterface) {
        l4g0Var.m152774i();
        l4g0Var.m152777l();
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m52934A0(l4g0 l4g0Var, DialogInterface dialogInterface) {
        l4g0Var.m152776k();
        l4g0Var.m152775j();
        this.f34437O = false;
    }

    /* JADX INFO: renamed from: B0 */
    public final /* synthetic */ void m52935B0(String str) {
        m52950c0(ClickAction.CHOOSE_PICTURE);
        i4g0.m138523u("e_replace_photo", "p_lowqualityphoto__popup", pf60.m172085a("lowquality_reason", str));
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ void m52936C0(l4g0 l4g0Var, DialogInterface dialogInterface) {
        l4g0Var.m152776k();
        l4g0Var.m152775j();
        this.f34437O = false;
    }

    /* JADX INFO: renamed from: D0 */
    public final void m52937D0() {
        ObjectAnimator objectAnimator = this.f34438P;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.f34442u.setTextColor(Color.parseColor("#33000000"));
        this.f34443v.setTextColor(Color.parseColor("#33000000"));
        this.f34441t.setColorFilter((ColorFilter) null);
        if (this.f34439r.getBackground() != null) {
            this.f34439r.getBackground().clearColorFilter();
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final void m52938E0(p0k0.C19267b c19267b) {
        AvatarUpdateProgress avatarUpdateProgress;
        AvatarUpdateProgress avatarUpdateProgress2;
        if (this.f34432J == null || (avatarUpdateProgress = c19267b.f150064a) == AvatarUpdateProgress.CANCEL || avatarUpdateProgress == AvatarUpdateProgress.CROP || avatarUpdateProgress == AvatarUpdateProgress.PICK) {
            return;
        }
        if (avatarUpdateProgress.isLoading()) {
            m51970f();
        }
        final Media media = c19267b.f150065b;
        if (NullChecker.m82486a(media) && NullChecker.m82486a(media.cover())) {
            bnl0.m105533Q0(this.f34444w, new y20() { // from class: l.tk1
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f174640a.m52968u0(media, (int[]) obj);
                }
            });
        } else if (media instanceof Video) {
            uqb0.f180374G.m127150m0(this.f34444w, media.url);
        } else {
            uqb0.f180374G.m98798o(this.f34444w);
        }
        bnl0.m105525M0(this.f34447z, media instanceof Video);
        bnl0.m105525M0(this.f34429G, c19267b.f150064a.isLoading());
        if (c19267b.f150068e && c19267b.f150064a == AvatarUpdateProgress.FINISH && media != null && TEnum.equals(media.status, "normal")) {
            bnl0.m105525M0(this.f34430H, true);
            l51.m152888H(getContext(), new Runnable() { // from class: l.uk1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f179354a.m52969v0();
                }
            }, 1000L);
        }
        if (m52953f0(c19267b, media)) {
            bnl0.m105525M0(this.f34428F, true);
            m52944K0(false);
            this.f34445x.animate().alpha(1.0f).start();
        } else {
            this.f34445x.animate().alpha(0.0f).start();
            bnl0.m105525M0(this.f34428F, false);
            m52944K0(media != null);
        }
        if (media == null || !this.f34432J.m211296r()) {
            bnl0.m105525M0(this.f34425C, false);
        } else {
            NewTags newTagsMo34694Gh = !jyb.m147479J(media.tags) ? gta.m132210e().m132214d().mo34694Gh(media.tags.get(0)) : null;
            if (!NullChecker.m82486a(newTagsMo34694Gh) || TextUtils.isEmpty(newTagsMo34694Gh.name)) {
                bnl0.m105525M0(this.f34425C, false);
            } else {
                bnl0.m105525M0(this.f34425C, true);
                this.f34425C.setText(newTagsMo34694Gh.name);
            }
        }
        bnl0.m105525M0(this.f34426D, this.f34432J.m211295q() && media != null && ((avatarUpdateProgress2 = c19267b.f150064a) == AvatarUpdateProgress.FINISH || avatarUpdateProgress2 == AvatarUpdateProgress.IDLE) && !bnl0.m105529O0(this.f34425C));
        bnl0.m105525M0(this.f34424B, (media == null || TextUtils.isEmpty(this.f34432J.m211291m()) || c19267b.f150072i) ? false : true);
        bnl0.m105525M0(this.f34423A, c19267b.f150072i);
        if (c19267b.f150064a == AvatarUpdateProgress.FINISH && !this.f34437O) {
            m52955h0(media, c19267b.f150070g);
        }
        if (c19267b.f150064a == AvatarUpdateProgress.ADD_TAG_FINISH && NullChecker.m82486a(this.f33894c.f123275f.f33923h)) {
            this.f33894c.f123275f.f33923h.mo48723c();
        }
    }

    /* JADX INFO: renamed from: F0 */
    public final void m52939F0() {
        this.f34434L.m170118I0((Act) getContext(), m52954g0(false, false), this.f34435M);
    }

    /* JADX INFO: renamed from: G0 */
    public final void m52940G0() {
        bnl0.m105524M(this.f34443v, true);
        List<Integer> list = xra.m212804w() ? xra.m212800s().weight.picture : xra.m212784c().weight.picture;
        if (m51983v() < 0 || m51983v() >= list.size() || list.get(m51983v()).intValue() <= 0) {
            return;
        }
        this.f34443v.setText(String.format(Locale.getDefault(), "+%d%%", list.get(m51983v())));
    }

    /* JADX INFO: renamed from: H0 */
    public final void m52941H0(final Media media) {
        final User userM116589ma = CoreModule.f18264c.f20381e0.m116589ma();
        gp4 gp4Var = new gp4((Act) getContext(), userM116589ma.m61308fp(), (Picture) media, new Runnable() { // from class: l.lk1
            @Override // java.lang.Runnable
            public final void run() {
                this.f132426a.m52971x0(userM116589ma, media);
            }
        });
        gp4Var.mo21867i(new z2m() { // from class: l.mk1
            @Override // p153l.z2m
            /* JADX INFO: renamed from: a */
            public final void mo22108a(d3m d3mVar) {
                this.f137192a.m52972y0(d3mVar);
            }
        });
        gp4Var.show();
        this.f34437O = true;
    }

    /* JADX INFO: renamed from: I0 */
    public final void m52942I0(final PictureServeCheckResult pictureServeCheckResult) {
        if (pictureServeCheckResult == null || TextUtils.isEmpty(pictureServeCheckResult.lowPhotoResult.conclusion)) {
            return;
        }
        final l4g0 l4g0Var = new l4g0("p_lowqualityphoto__popup", Dialog.class.getName());
        new jl80.C17971a(getContext()).m146056y0("温馨提示").m146051t0(pictureServeCheckResult.lowPhotoResult.conclusion).m146034c0("更换照片", new Runnable() { // from class: l.hk1
            @Override // java.lang.Runnable
            public final void run() {
                this.f110360a.m52973z0(pictureServeCheckResult);
            }
        }).m146029X("稍后再说", new Runnable() { // from class: l.ik1
            @Override // java.lang.Runnable
            public final void run() {
                i4g0.m138523u("e_replace_photo_cancel", "p_lowqualityphoto__popup", pf60.m172085a("lowquality_reason", pictureServeCheckResult.lowPhotoResult.mapping));
            }
        }).m146046o0(new DialogInterface.OnShowListener() { // from class: l.jk1
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                AvatarCard.m52921K(l4g0Var, dialogInterface);
            }
        }).m146045n0(new DialogInterface.OnDismissListener() { // from class: l.kk1
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f127159a.m52934A0(l4g0Var, dialogInterface);
            }
        }).m146049r0();
        this.f34437O = true;
    }

    /* JADX INFO: renamed from: J0 */
    public final void m52943J0(String str, PictureServeCheckResult pictureServeCheckResult) {
        String str2;
        final String str3;
        if (pictureServeCheckResult == null) {
            return;
        }
        final l4g0 l4g0Var = new l4g0("p_lowqualityphoto__popup", Dialog.class.getName());
        if (TextUtils.equals(str, MediaReorderCard.f33800Q0)) {
            PhotoLowModelData photoLowModelData = pictureServeCheckResult.repeatPictureResult;
            str2 = photoLowModelData.conclusion;
            str3 = photoLowModelData.mapping;
        } else if (TextUtils.equals(str, MediaReorderCard.f33801R0)) {
            PhotoLowModelData photoLowModelData2 = pictureServeCheckResult.netPictureResult;
            str2 = photoLowModelData2.conclusion;
            str3 = photoLowModelData2.mapping;
        } else {
            str2 = "";
            str3 = "";
        }
        l4g0Var.m152781p(pf60.m172085a("lowquality_reason", str3));
        new jl80.C17971a(getContext()).m146056y0("温馨提示").m146051t0(str2).m146034c0("更换照片", new Runnable() { // from class: l.dk1
            @Override // java.lang.Runnable
            public final void run() {
                this.f88960a.m52935B0(str3);
            }
        }).m146029X("稍后再说", new Runnable() { // from class: l.ek1
            @Override // java.lang.Runnable
            public final void run() {
                i4g0.m138523u("e_replace_photo_cancel", "p_lowqualityphoto__popup", pf60.m172085a("lowquality_reason", str3));
            }
        }).m146046o0(new DialogInterface.OnShowListener() { // from class: l.fk1
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                AvatarCard.m52922L(l4g0Var, dialogInterface);
            }
        }).m146045n0(new DialogInterface.OnDismissListener() { // from class: l.gk1
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f104698a.m52936C0(l4g0Var, dialogInterface);
            }
        }).m146049r0();
        this.f34437O = true;
    }

    /* JADX INFO: renamed from: K0 */
    public final void m52944K0(boolean z) {
        if (m51972h() != null && m51972h().f33920e) {
            z = false;
        }
        bnl0.m105525M0(this.f34446y, z);
    }

    /* JADX INFO: renamed from: X */
    public final void m52945X(View view) {
        al1.m98636a(this, view);
    }

    /* JADX INFO: renamed from: Y */
    public final void m52946Y() {
        xk1 xk1Var = this.f34432J;
        if (xk1Var != null) {
            if (a5d0.m96049a(xk1Var.m211280b())) {
                this.f34439r.setBackgroundResource(this.f34432J.m211280b());
            }
            boolean zM96049a = a5d0.m96049a(this.f34432J.m211283e());
            VImage vImage = this.f34446y;
            if (zM96049a) {
                vImage.setImageResource(this.f34432J.m211283e());
            } else {
                vImage.setImageResource(0);
            }
            if (a5d0.m96049a(this.f34432J.m211293o())) {
                this.f34447z.setImageResource(this.f34432J.m211293o());
            }
            if (a5d0.m96049a(this.f34432J.m211284f())) {
                this.f34428F.setImageResource(this.f34432J.m211284f());
            }
            if (a5d0.m96049a(this.f34432J.m211287i())) {
                this.f34429G.setColor(this.f34432J.m211287i());
            }
            if (a5d0.m96049a(this.f34432J.m211288j())) {
                this.f34430H.setImageResource(this.f34432J.m211288j());
            }
            boolean zM96049a2 = a5d0.m96049a(this.f34432J.m211289k());
            VImage vImage2 = this.f34441t;
            if (zM96049a2) {
                vImage2.setImageResource(this.f34432J.m211289k());
                bnl0.m105524M(this.f34441t, true);
            } else {
                vImage2.setImageResource(0);
                bnl0.m105524M(this.f34441t, false);
            }
            boolean zIsEmpty = TextUtils.isEmpty(this.f34432J.m211290l());
            VText vText = this.f34442u;
            if (zIsEmpty) {
                vText.setText((CharSequence) null);
                bnl0.m105524M(this.f34442u, false);
            } else {
                vText.setText(this.f34432J.m211290l());
                bnl0.m105524M(this.f34442u, true);
            }
            boolean zIsEmpty2 = TextUtils.isEmpty(this.f34432J.m211291m());
            VText_NoTopPadding vText_NoTopPadding = this.f34424B;
            if (zIsEmpty2) {
                vText_NoTopPadding.setText((CharSequence) null);
                bnl0.m105524M(this.f34424B, false);
            } else {
                vText_NoTopPadding.setText(this.f34432J.m211291m());
                bnl0.m105524M(this.f34424B, true);
            }
            if (this.f34432J.m211297s()) {
                m52940G0();
            } else {
                this.f34443v.setText((CharSequence) null);
                bnl0.m105524M(this.f34443v, false);
            }
            if (this.f34432J.m211279a()) {
                m52956i0();
            } else {
                m52937D0();
            }
            this.f33905n = this.f34432J.m211281c();
            this.f33907p = this.f34432J.m211285g();
            bnl0.m105524M(this.f34431I, false);
            if (this.f34432J.m211298t()) {
                m52957j0();
            }
        }
    }

    /* JADX INFO: renamed from: Z */
    public final void m52947Z(boolean z, boolean z2) {
        this.f34434L.m170119J0((Act) getContext(), m52954g0(z, z2), this.f34435M);
    }

    /* JADX INFO: renamed from: a0 */
    public final void m52948a0() {
        p0k0.C19267b c19267bM222761e = this.f34435M.m222761e();
        if (c19267bM222761e == null || c19267bM222761e.f150065b == null) {
            this.f34432J.m211282d().mo52986d(this, m51983v());
            return;
        }
        if (c19267bM222761e.f150064a.isLoading()) {
            this.f34432J.m211282d().m52983a(this, m51983v());
        } else if (!c19267bM222761e.f150064a.isSuccess() || m52953f0(c19267bM222761e, getMedia())) {
            this.f34432J.m211282d().mo52984b(this, m51983v());
        } else {
            this.f34432J.m211282d().mo52985c(this, m51983v());
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m52949b0() {
        p0k0.C19267b c19267b = new p0k0.C19267b();
        c19267b.f150065b = null;
        c19267b.f150069f = true;
        this.f34435M.onNext(c19267b);
        m51975l();
        this.f34434L.m170117H0();
    }

    /* JADX INFO: renamed from: c0 */
    public void m52950c0(ClickAction clickAction) {
        switch (C8847a.f34448a[clickAction.ordinal()]) {
            case 1:
                m52947Z(true, false);
                break;
            case 2:
                m52947Z(false, true);
                break;
            case 3:
                m52947Z(false, false);
                break;
            case 4:
                m52951d0();
                break;
            case 5:
                m52939F0();
                break;
            case 6:
                m52949b0();
                break;
            case 7:
                m52952e0();
                break;
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final void m52951d0() {
        Media media = getMedia();
        if (media != null) {
            this.f34434L.m170126a0((Act) getContext(), m52954g0(false, false).m170161j(media.tags).m170160i(!jyb.m147479J(media.tags)), this.f34435M);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final void m52952e0() {
        Media media;
        p0k0.C19267b c19267bM222761e = this.f34435M.m222761e();
        if (c19267bM222761e == null || (media = c19267bM222761e.f150065b) == null) {
            return;
        }
        final Media mediaMo225055clone = media.mo225055clone();
        TagChooseMkAct.m44233w2((Act) getContext(), jyb.m147482M(mediaMo225055clone), null, new Runnable() { // from class: l.wk1
            @Override // java.lang.Runnable
            public final void run() {
                this.f189520a.m52961n0(mediaMo225055clone);
            }
        }, null);
    }

    /* JADX INFO: renamed from: f0 */
    public final boolean m52953f0(p0k0.C19267b c19267b, Media media) {
        if (c19267b == null || media == null) {
            return false;
        }
        boolean z = media instanceof Picture;
        return !c19267b.f150064a.isSuccess() || (z && this.f34432J.m211286h().mo132025c() && ((Picture) media).isLabelJudge(MediaLabel.get(MediaLabel.WITH_AUDIT_AI_PICTURE))) || (z && this.f34432J.m211286h().mo132026d() && ((Picture) media).isLabelJudge(MediaLabel.get(MediaLabel.WITH_REPEAT_MAIN_PICTURE))) || (z && this.f34432J.m211286h().mo132023a() && ((Picture) media).isLabelJudge(MediaLabel.get(MediaLabel.WITH_NET_MAIN_PICTURE))) || (z && this.f34432J.m211286h().mo132027e() && ((Picture) media).isLabelJudge(MediaLabel.get(MediaLabel.WITH_LOW)));
    }

    /* JADX INFO: renamed from: g0 */
    public final p0k0.C19266a m52954g0(boolean z, boolean z2) {
        p0k0.C19266a c19266aM170160i = new p0k0.C19266a().m170165n(this.f34432J.m211292n()).m170162k(z).m170163l(z2).m170160i(this.f34432J.m211296r());
        if (this.f34432J.m211294p()) {
            c19266aM170160i.m170159h(AvatarUpdateCheckType.LOCAL_CHECK);
        }
        pp70 pp70VarM211286h = this.f34432J.m211286h();
        if (!pp70VarM211286h.mo132026d() && !pp70VarM211286h.mo132027e() && !pp70VarM211286h.mo132023a() && !pp70VarM211286h.mo132024b()) {
            return c19266aM170160i;
        }
        c19266aM170160i.m170159h(AvatarUpdateCheckType.REMOTE_CHECK);
        c19266aM170160i.m170164m("editProfile");
        return c19266aM170160i;
    }

    public xk1 getConfig() {
        return this.f34432J;
    }

    public Media getMedia() {
        if (!NullChecker.m82486a(this.f34435M)) {
            return null;
        }
        p0k0.C19267b c19267bM222761e = this.f34435M.m222761e();
        if (NullChecker.m82486a(c19267bM222761e)) {
            return c19267bM222761e.f150065b;
        }
        return null;
    }

    public p0k0.C19267b getMediaStateResult() {
        if (!NullChecker.m82486a(this.f34435M)) {
            return null;
        }
        p0k0.C19267b c19267bM222761e = this.f34435M.m222761e();
        if (NullChecker.m82486a(c19267bM222761e)) {
            return c19267bM222761e;
        }
        return null;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m52955h0(Media media, PictureServeCheckResult pictureServeCheckResult) {
        if (this.f34432J.m211292n() == AvatarUpdateType.AVATAR && (media instanceof Picture) && m51983v() == 0) {
            Picture picture = (Picture) media;
            if (this.f34432J.m211286h().mo132024b() && picture.isLabelJudge(MediaLabel.get(MediaLabel.NOT_VERIFICATION)) && CoreModule.f18264c.f20381e0.m116593na().isPicVerificationVerified()) {
                m52941H0(picture);
                return;
            }
            if (this.f34432J.m211286h().mo132026d() && picture.isLabelJudge(MediaLabel.get(MediaLabel.WITH_REPEAT_MAIN_PICTURE))) {
                m52943J0(MediaReorderCard.f33800Q0, pictureServeCheckResult);
                return;
            }
            if (this.f34432J.m211286h().mo132027e() && picture.isLow()) {
                m52942I0(pictureServeCheckResult);
            } else if (this.f34432J.m211286h().mo132023a() && picture.isLabelJudge(MediaLabel.get(MediaLabel.WITH_NET_MAIN_PICTURE))) {
                m52943J0(MediaReorderCard.f33801R0, pictureServeCheckResult);
            }
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final void m52956i0() {
        if (this.f34438P != null) {
            return;
        }
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(this.f34442u, "textColor", new ArgbEvaluator(), Integer.valueOf(Color.parseColor("#e2e2e2")), Integer.valueOf(Color.parseColor("#FF7602")));
        this.f34438P = objectAnimatorOfObject;
        objectAnimatorOfObject.setDuration(800L);
        this.f34438P.setRepeatCount(4);
        this.f34438P.setInterpolator(null);
        this.f34438P.setRepeatMode(2);
        this.f34438P.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.sk1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f169225a.m52962o0(valueAnimator);
            }
        });
        if (this.f34438P.isStarted()) {
            return;
        }
        this.f34438P.start();
    }

    /* JADX INFO: renamed from: j0 */
    public final void m52957j0() {
        this.f34425C.setTextSize(10.0f);
        this.f34426D.setTextSize(10.0f);
        this.f34424B.setTextSize(10.0f);
        this.f34424B.setBackgroundResource(kbc0.f124895o);
        this.f34426D.setTextColor(Color.parseColor("#FF700A"));
        this.f34426D.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        bnl0.m105505C0(this.f34425C, qa00.m175859d(20.0f));
        bnl0.m105505C0(this.f34424B, qa00.m175859d(20.0f));
        bnl0.m105505C0(this.f34426D, qa00.m175859d(20.0f));
        this.f34447z.setImageResource(kbc0.f124925y);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f34428F.getLayoutParams();
        layoutParams.gravity = 17;
        this.f34428F.setLayoutParams(layoutParams);
        bnl0.m105539W(this.f34428F, 0);
        bnl0.m105537U(this.f34428F, 0);
    }

    /* JADX INFO: renamed from: k0 */
    public final void m52958k0() {
        p0k0 p0k0Var = new p0k0();
        this.f34434L = p0k0Var;
        this.f34435M = p0k0Var.m170128c0();
        ((Act) getContext()).duringCreated(new pcj() { // from class: l.qk1
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f158072a.m52963p0();
            }
        }, false).subscribe(psd0.m173596G(new y20() { // from class: l.rk1
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f163535a.m52964q0((p0k0.C19267b) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l0 */
    public final void m52959l0() {
        bnl0.m105509E0(this.f34446y, new View.OnClickListener() { // from class: l.ck1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f82253a.m52965r0(view);
            }
        });
        bnl0.m105509E0(this.f34425C, new View.OnClickListener() { // from class: l.nk1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f142422a.m52966s0(view);
            }
        });
        bnl0.m105509E0(this.f34426D, new View.OnClickListener() { // from class: l.pk1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f152768a.m52967t0(view);
            }
        });
    }

    /* JADX INFO: renamed from: m0 */
    public boolean m52960m0() {
        if (NullChecker.m82486a(this.f34435M)) {
            p0k0.C19267b c19267bM222761e = this.f34435M.m222761e();
            if (NullChecker.m82486a(c19267bM222761e) && c19267bM222761e.f150068e && c19267bM222761e.f150065b != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m52962o0(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.f34442u.setTextColor(iIntValue);
        VImage vImage = this.f34441t;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        vImage.setColorFilter(new PorterDuffColorFilter(iIntValue, mode));
        this.f34443v.setTextColor(iIntValue);
        this.f34439r.getBackground().setColorFilter(new PorterDuffColorFilter(((Integer) valueAnimator.getAnimatedValue()).intValue(), mode));
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.VReorderCard, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m52945X(this);
        m52959l0();
        m52958k0();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C22421c m52963p0() {
        return this.f34435M.onBackpressureLatest().filter(new qcj() { // from class: l.vk1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((p0k0.C19267b) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m52964q0(p0k0.C19267b c19267b) {
        if (c19267b.equals(this.f34436N)) {
            return;
        }
        this.f34436N = c19267b.m170166a();
        mo51875k(c19267b.f150065b == null);
        m52938E0(c19267b);
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m52965r0(View view) {
        m52948a0();
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m52966s0(View view) {
        m52952e0();
    }

    public void setConfig(xk1 xk1Var) {
        this.f34432J = xk1Var;
        m52946Y();
    }

    public void setIllegalVisible(boolean z) {
        p0k0.C19267b c19267bM222761e = this.f34435M.m222761e();
        if (c19267bM222761e != null) {
            c19267bM222761e.f150072i = z;
            this.f34435M.onNext(c19267bM222761e);
        }
    }

    /* JADX INFO: renamed from: setMedia, reason: merged with bridge method [inline-methods] */
    public void m52961n0(Media media) {
        p0k0.C19267b c19267b = (media == null || this.f34435M.m222761e() == null) ? new p0k0.C19267b() : this.f34435M.m222761e();
        c19267b.f150065b = media;
        this.f34435M.onNext(c19267b);
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m52967t0(View view) {
        m52952e0();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.VReorderCard
    /* JADX INFO: renamed from: u */
    public void mo51887u() {
        if (SystemClock.uptimeMillis() - this.f34433K < 300) {
            return;
        }
        this.f34433K = SystemClock.uptimeMillis();
        m52948a0();
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m52968u0(Media media, int[] iArr) {
        if (NullChecker.m82486a(media.cover())) {
            uqb0.f180374G.m127111J0(this.f34444w, media.cover().profile480(), false);
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m52969v0() {
        bnl0.m105525M0(this.f34430H, false);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.VReorderCard
    /* JADX INFO: renamed from: w */
    public void mo51890w(boolean z) {
        super.mo51890w(z);
        m52944K0(!z);
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ void m52970w0(AvatarCards avatarCards, Media media) {
        avatarCards.m51994h(avatarCards.m51995i()).m52961n0(media);
        m51970f();
        o1j0.m165651y("新上传头像已保存为生活照");
        i4g0.m138526x("e_new_avatar_save_toast", "p_edit_profile_view");
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m52971x0(User user, final Media media) {
        m52961n0(user.picture(0));
        if (getParent() instanceof AvatarCards) {
            final AvatarCards avatarCards = (AvatarCards) getParent();
            if (avatarCards.m51995i() >= avatarCards.f33919d) {
                o1j0.m165651y(String.format(Locale.CHINA, "%s已达上限，不保存新上传头像", xra.m212804w() ? "生活照" : "我的照片"));
                m51970f();
            } else {
                if (avatarCards.m51994h(avatarCards.m51995i()).f34432J.m211296r()) {
                    TagChooseMkAct.m44233w2((Act) getContext(), jyb.m147482M(media), null, new Runnable() { // from class: l.ok1
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f147731a.m52970w0(avatarCards, media);
                        }
                    }, null);
                    return;
                }
                avatarCards.m51994h(avatarCards.m51995i()).m52961n0(media);
                m51970f();
                o1j0.m165651y("新上传头像已保存为其他照片");
                i4g0.m138526x("e_new_avatar_save_toast", "p_edit_profile_view");
            }
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m52972y0(d3m d3mVar) {
        this.f34437O = false;
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m52973z0(PictureServeCheckResult pictureServeCheckResult) {
        m52950c0(ClickAction.CHOOSE_PICTURE);
        i4g0.m138523u("e_replace_photo", "p_lowqualityphoto__popup", pf60.m172085a("lowquality_reason", pictureServeCheckResult.lowPhotoResult.mapping));
    }

    public AvatarCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AvatarCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
