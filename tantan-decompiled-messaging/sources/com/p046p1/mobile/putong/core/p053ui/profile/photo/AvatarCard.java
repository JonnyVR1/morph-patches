package com.p046p1.mobile.putong.core.p053ui.profile.photo;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.NewTags;
import com.p046p1.mobile.putong.core.data.PhotoLowModelData;
import com.p046p1.mobile.putong.core.data.PictureServeCheckResult;
import com.p046p1.mobile.putong.core.newui.profile.TagChooseMkAct;
import com.p046p1.mobile.putong.core.p053ui.profile.MediaReorderCard;
import com.p046p1.mobile.putong.core.p053ui.profile.VReorderCard;
import com.p046p1.mobile.putong.core.p053ui.profile.photo.AvatarCard;
import com.p046p1.mobile.putong.core.view.AvatarUpdateCheckType;
import com.p046p1.mobile.putong.core.view.AvatarUpdateProgress;
import com.p046p1.mobile.putong.core.view.AvatarUpdateType;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.MediaLabel;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.Locale;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VFrame_Anim;
import p147v.VImage;
import p147v.VLinear;
import p147v.VProgressBar;
import p147v.VText;
import p147v.VText_NoTopPadding;
import p149l.cwf0;
import p149l.dd80;
import p149l.e30;
import p149l.e3c0;
import p149l.e51;
import p149l.f0m;
import p149l.ho4;
import p149l.j0m;
import p149l.j760;
import p149l.jh70;
import p149l.jo0;
import p149l.lqa;
import p149l.lrj0;
import p149l.lsi0;
import p149l.mkd0;
import p149l.qib0;
import p149l.qk1;
import p149l.t100;
import p149l.tk1;
import p149l.ura;
import p149l.v9j;
import p149l.vwb;
import p149l.w9j;
import p149l.wwc0;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes4.dex */
public class AvatarCard extends VReorderCard {

    /* JADX INFO: renamed from: A */
    public VText f33575A;

    /* JADX INFO: renamed from: B */
    public VText_NoTopPadding f33576B;

    /* JADX INFO: renamed from: C */
    public VText_NoTopPadding f33577C;

    /* JADX INFO: renamed from: D */
    public VText_NoTopPadding f33578D;

    /* JADX INFO: renamed from: E */
    public VFrame_Anim f33579E;

    /* JADX INFO: renamed from: F */
    public VImage f33580F;

    /* JADX INFO: renamed from: G */
    public VProgressBar f33581G;

    /* JADX INFO: renamed from: H */
    public VImage f33582H;

    /* JADX INFO: renamed from: I */
    public VText f33583I;

    /* JADX INFO: renamed from: J */
    public qk1 f33584J;

    /* JADX INFO: renamed from: K */
    public long f33585K;

    /* JADX INFO: renamed from: L */
    public lrj0 f33586L;

    /* JADX INFO: renamed from: M */
    public C22392a<lrj0.C18309b> f33587M;

    /* JADX INFO: renamed from: N */
    public lrj0.C18309b f33588N;

    /* JADX INFO: renamed from: O */
    public boolean f33589O;

    /* JADX INFO: renamed from: P */
    public ObjectAnimator f33590P;

    /* JADX INFO: renamed from: r */
    public VFrame f33591r;

    /* JADX INFO: renamed from: s */
    public VLinear f33592s;

    /* JADX INFO: renamed from: t */
    public VImage f33593t;

    /* JADX INFO: renamed from: u */
    public VText f33594u;

    /* JADX INFO: renamed from: v */
    public VText f33595v;

    /* JADX INFO: renamed from: w */
    public VDraweeView f33596w;

    /* JADX INFO: renamed from: x */
    public View f33597x;

    /* JADX INFO: renamed from: y */
    public VImage f33598y;

    /* JADX INFO: renamed from: z */
    public VImage f33599z;

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
    public static /* synthetic */ class C8684a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f33600a;

        static {
            int[] iArr = new int[ClickAction.values().length];
            f33600a = iArr;
            try {
                iArr[ClickAction.CHOOSE_PICTURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33600a[ClickAction.CHOOSE_VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33600a[ClickAction.CHOOSE_PICTURE_AND_VIDEO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33600a[ClickAction.EDIT_PICTURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f33600a[ClickAction.RETRY_UPLOAD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f33600a[ClickAction.DELETE_PICTURE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f33600a[ClickAction.EDIT_PICTURE_TAG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public AvatarCard(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m51738K(cwf0 cwf0Var, DialogInterface dialogInterface) {
        cwf0Var.m109033i();
        cwf0Var.m109036l();
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ void m51739L(cwf0 cwf0Var, DialogInterface dialogInterface) {
        cwf0Var.m109033i();
        cwf0Var.m109036l();
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m51751A0(cwf0 cwf0Var, DialogInterface dialogInterface) {
        cwf0Var.m109035k();
        cwf0Var.m109034j();
        this.f33589O = false;
    }

    /* JADX INFO: renamed from: B0 */
    public final /* synthetic */ void m51752B0(String str) {
        m51767c0(ClickAction.CHOOSE_PICTURE);
        zvf0.m220399u("e_replace_photo", "p_lowqualityphoto__popup", j760.m140076a("lowquality_reason", str));
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ void m51753C0(cwf0 cwf0Var, DialogInterface dialogInterface) {
        cwf0Var.m109035k();
        cwf0Var.m109034j();
        this.f33589O = false;
    }

    /* JADX INFO: renamed from: D0 */
    public final void m51754D0() {
        ObjectAnimator objectAnimator = this.f33590P;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.f33594u.setTextColor(Color.parseColor("#33000000"));
        this.f33595v.setTextColor(Color.parseColor("#33000000"));
        this.f33593t.setColorFilter((ColorFilter) null);
        if (this.f33591r.getBackground() != null) {
            this.f33591r.getBackground().clearColorFilter();
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final void m51755E0(lrj0.C18309b c18309b) {
        AvatarUpdateProgress avatarUpdateProgress;
        AvatarUpdateProgress avatarUpdateProgress2;
        if (this.f33584J == null || (avatarUpdateProgress = c18309b.f129724a) == AvatarUpdateProgress.CANCEL || avatarUpdateProgress == AvatarUpdateProgress.CROP || avatarUpdateProgress == AvatarUpdateProgress.PICK) {
            return;
        }
        if (avatarUpdateProgress.isLoading()) {
            m50787f();
        }
        final Media media = c18309b.f129725b;
        if (NullChecker.m81303a(media) && NullChecker.m81303a(media.cover())) {
            xdl0.m208353Q0(this.f33596w, new e30() { // from class: l.mk1
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f134275a.m51785u0(media, (int[]) obj);
                }
            });
        } else if (media instanceof Video) {
            qib0.f154691G.m102367m0(this.f33596w, media.url);
        } else {
            qib0.f154691G.m184725o(this.f33596w);
        }
        xdl0.m208345M0(this.f33599z, media instanceof Video);
        xdl0.m208345M0(this.f33581G, c18309b.f129724a.isLoading());
        if (c18309b.f129728e && c18309b.f129724a == AvatarUpdateProgress.FINISH && media != null && TEnum.equals(media.status, "normal")) {
            xdl0.m208345M0(this.f33582H, true);
            e51.m114743H(getContext(), new Runnable() { // from class: l.nk1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f139370a.m51786v0();
                }
            }, 1000L);
        }
        if (m51770f0(c18309b, media)) {
            xdl0.m208345M0(this.f33580F, true);
            m51761K0(false);
            this.f33597x.animate().alpha(1.0f).start();
        } else {
            this.f33597x.animate().alpha(0.0f).start();
            xdl0.m208345M0(this.f33580F, false);
            m51761K0(media != null);
        }
        if (media == null || !this.f33584J.m175087r()) {
            xdl0.m208345M0(this.f33577C, false);
        } else {
            NewTags newTagsMo33691Gh = !vwb.m200296J(media.tags) ? ura.m195053e().m195057d().mo33691Gh(media.tags.get(0)) : null;
            if (!NullChecker.m81303a(newTagsMo33691Gh) || TextUtils.isEmpty(newTagsMo33691Gh.name)) {
                xdl0.m208345M0(this.f33577C, false);
            } else {
                xdl0.m208345M0(this.f33577C, true);
                this.f33577C.setText(newTagsMo33691Gh.name);
            }
        }
        xdl0.m208345M0(this.f33578D, this.f33584J.m175086q() && media != null && ((avatarUpdateProgress2 = c18309b.f129724a) == AvatarUpdateProgress.FINISH || avatarUpdateProgress2 == AvatarUpdateProgress.IDLE) && !xdl0.m208349O0(this.f33577C));
        xdl0.m208345M0(this.f33576B, (media == null || TextUtils.isEmpty(this.f33584J.m175082m()) || c18309b.f129732i) ? false : true);
        xdl0.m208345M0(this.f33575A, c18309b.f129732i);
        if (c18309b.f129724a == AvatarUpdateProgress.FINISH && !this.f33589O) {
            m51772h0(media, c18309b.f129730g);
        }
        if (c18309b.f129724a == AvatarUpdateProgress.ADD_TAG_FINISH && NullChecker.m81303a(this.f33046c.f87435f.f33075h)) {
            this.f33046c.f87435f.f33075h.mo47540c();
        }
    }

    /* JADX INFO: renamed from: F0 */
    public final void m51756F0() {
        this.f33586L.m151445I0((Act) getContext(), m51771g0(false, false), this.f33587M);
    }

    /* JADX INFO: renamed from: G0 */
    public final void m51757G0() {
        xdl0.m208344M(this.f33595v, true);
        List<Integer> list = lqa.m150985w() ? lqa.m150981s().weight.picture : lqa.m150965c().weight.picture;
        if (m50800v() < 0 || m50800v() >= list.size() || list.get(m50800v()).intValue() <= 0) {
            return;
        }
        this.f33595v.setText(String.format(Locale.getDefault(), "+%d%%", list.get(m50800v())));
    }

    /* JADX INFO: renamed from: H0 */
    public final void m51758H0(final Media media) {
        final User userM169516ma = CoreModule.f17545c.f19639e0.m169516ma();
        ho4 ho4Var = new ho4((Act) getContext(), userM169516ma.m60124fp(), (Picture) media, new Runnable() { // from class: l.ek1
            @Override // java.lang.Runnable
            public final void run() {
                this.f91925a.m51788x0(userM169516ma, media);
            }
        });
        ho4Var.mo20868i(new f0m() { // from class: l.fk1
            @Override // p149l.f0m
            /* JADX INFO: renamed from: a */
            public final void mo21109a(j0m j0mVar) {
                this.f98022a.m51789y0(j0mVar);
            }
        });
        ho4Var.show();
        this.f33589O = true;
    }

    /* JADX INFO: renamed from: I0 */
    public final void m51759I0(final PictureServeCheckResult pictureServeCheckResult) {
        if (pictureServeCheckResult == null || TextUtils.isEmpty(pictureServeCheckResult.lowPhotoResult.conclusion)) {
            return;
        }
        final cwf0 cwf0Var = new cwf0("p_lowqualityphoto__popup", Dialog.class.getName());
        new dd80.C16336a(getContext()).m110996y0("温馨提示").m110991t0(pictureServeCheckResult.lowPhotoResult.conclusion).m110974c0("更换照片", new Runnable() { // from class: l.ak1
            @Override // java.lang.Runnable
            public final void run() {
                this.f70230a.m51790z0(pictureServeCheckResult);
            }
        }).m110969X("稍后再说", new Runnable() { // from class: l.bk1
            @Override // java.lang.Runnable
            public final void run() {
                zvf0.m220399u("e_replace_photo_cancel", "p_lowqualityphoto__popup", j760.m140076a("lowquality_reason", pictureServeCheckResult.lowPhotoResult.mapping));
            }
        }).m110986o0(new DialogInterface.OnShowListener() { // from class: l.ck1
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                AvatarCard.m51738K(cwf0Var, dialogInterface);
            }
        }).m110985n0(new DialogInterface.OnDismissListener() { // from class: l.dk1
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f86587a.m51751A0(cwf0Var, dialogInterface);
            }
        }).m110989r0();
        this.f33589O = true;
    }

    /* JADX INFO: renamed from: J0 */
    public final void m51760J0(String str, PictureServeCheckResult pictureServeCheckResult) {
        String str2;
        final String str3;
        if (pictureServeCheckResult == null) {
            return;
        }
        final cwf0 cwf0Var = new cwf0("p_lowqualityphoto__popup", Dialog.class.getName());
        if (TextUtils.equals(str, MediaReorderCard.f32952Q0)) {
            PhotoLowModelData photoLowModelData = pictureServeCheckResult.repeatPictureResult;
            str2 = photoLowModelData.conclusion;
            str3 = photoLowModelData.mapping;
        } else if (TextUtils.equals(str, MediaReorderCard.f32953R0)) {
            PhotoLowModelData photoLowModelData2 = pictureServeCheckResult.netPictureResult;
            str2 = photoLowModelData2.conclusion;
            str3 = photoLowModelData2.mapping;
        } else {
            str2 = "";
            str3 = "";
        }
        cwf0Var.m109040p(j760.m140076a("lowquality_reason", str3));
        new dd80.C16336a(getContext()).m110996y0("温馨提示").m110991t0(str2).m110974c0("更换照片", new Runnable() { // from class: l.wj1
            @Override // java.lang.Runnable
            public final void run() {
                this.f186590a.m51752B0(str3);
            }
        }).m110969X("稍后再说", new Runnable() { // from class: l.xj1
            @Override // java.lang.Runnable
            public final void run() {
                zvf0.m220399u("e_replace_photo_cancel", "p_lowqualityphoto__popup", j760.m140076a("lowquality_reason", str3));
            }
        }).m110986o0(new DialogInterface.OnShowListener() { // from class: l.yj1
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                AvatarCard.m51739L(cwf0Var, dialogInterface);
            }
        }).m110985n0(new DialogInterface.OnDismissListener() { // from class: l.zj1
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f203368a.m51753C0(cwf0Var, dialogInterface);
            }
        }).m110989r0();
        this.f33589O = true;
    }

    /* JADX INFO: renamed from: K0 */
    public final void m51761K0(boolean z) {
        if (m50789h() != null && m50789h().f33072e) {
            z = false;
        }
        xdl0.m208345M0(this.f33598y, z);
    }

    /* JADX INFO: renamed from: X */
    public final void m51762X(View view) {
        tk1.m189421a(this, view);
    }

    /* JADX INFO: renamed from: Y */
    public final void m51763Y() {
        qk1 qk1Var = this.f33584J;
        if (qk1Var != null) {
            if (wwc0.m205855a(qk1Var.m175071b())) {
                this.f33591r.setBackgroundResource(this.f33584J.m175071b());
            }
            boolean zM205855a = wwc0.m205855a(this.f33584J.m175074e());
            VImage vImage = this.f33598y;
            if (zM205855a) {
                vImage.setImageResource(this.f33584J.m175074e());
            } else {
                vImage.setImageResource(0);
            }
            if (wwc0.m205855a(this.f33584J.m175084o())) {
                this.f33599z.setImageResource(this.f33584J.m175084o());
            }
            if (wwc0.m205855a(this.f33584J.m175075f())) {
                this.f33580F.setImageResource(this.f33584J.m175075f());
            }
            if (wwc0.m205855a(this.f33584J.m175078i())) {
                this.f33581G.setColor(this.f33584J.m175078i());
            }
            if (wwc0.m205855a(this.f33584J.m175079j())) {
                this.f33582H.setImageResource(this.f33584J.m175079j());
            }
            boolean zM205855a2 = wwc0.m205855a(this.f33584J.m175080k());
            VImage vImage2 = this.f33593t;
            if (zM205855a2) {
                vImage2.setImageResource(this.f33584J.m175080k());
                xdl0.m208344M(this.f33593t, true);
            } else {
                vImage2.setImageResource(0);
                xdl0.m208344M(this.f33593t, false);
            }
            boolean zIsEmpty = TextUtils.isEmpty(this.f33584J.m175081l());
            VText vText = this.f33594u;
            if (zIsEmpty) {
                vText.setText((CharSequence) null);
                xdl0.m208344M(this.f33594u, false);
            } else {
                vText.setText(this.f33584J.m175081l());
                xdl0.m208344M(this.f33594u, true);
            }
            boolean zIsEmpty2 = TextUtils.isEmpty(this.f33584J.m175082m());
            VText_NoTopPadding vText_NoTopPadding = this.f33576B;
            if (zIsEmpty2) {
                vText_NoTopPadding.setText((CharSequence) null);
                xdl0.m208344M(this.f33576B, false);
            } else {
                vText_NoTopPadding.setText(this.f33584J.m175082m());
                xdl0.m208344M(this.f33576B, true);
            }
            if (this.f33584J.m175088s()) {
                m51757G0();
            } else {
                this.f33595v.setText((CharSequence) null);
                xdl0.m208344M(this.f33595v, false);
            }
            if (this.f33584J.m175070a()) {
                m51773i0();
            } else {
                m51754D0();
            }
            this.f33057n = this.f33584J.m175072c();
            this.f33059p = this.f33584J.m175076g();
            xdl0.m208344M(this.f33583I, false);
            if (this.f33584J.m175089t()) {
                m51774j0();
            }
        }
    }

    /* JADX INFO: renamed from: Z */
    public final void m51764Z(boolean z, boolean z2) {
        this.f33586L.m151446J0((Act) getContext(), m51771g0(z, z2), this.f33587M);
    }

    /* JADX INFO: renamed from: a0 */
    public final void m51765a0() {
        lrj0.C18309b c18309bM221515e = this.f33587M.m221515e();
        if (c18309bM221515e == null || c18309bM221515e.f129725b == null) {
            this.f33584J.m175073d().mo51803d(this, m50800v());
            return;
        }
        if (c18309bM221515e.f129724a.isLoading()) {
            this.f33584J.m175073d().m51800a(this, m50800v());
        } else if (!c18309bM221515e.f129724a.isSuccess() || m51770f0(c18309bM221515e, getMedia())) {
            this.f33584J.m175073d().mo51801b(this, m50800v());
        } else {
            this.f33584J.m175073d().mo51802c(this, m50800v());
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m51766b0() {
        lrj0.C18309b c18309b = new lrj0.C18309b();
        c18309b.f129725b = null;
        c18309b.f129729f = true;
        this.f33587M.onNext(c18309b);
        m50792l();
        this.f33586L.m151444H0();
    }

    /* JADX INFO: renamed from: c0 */
    public void m51767c0(ClickAction clickAction) {
        switch (C8684a.f33600a[clickAction.ordinal()]) {
            case 1:
                m51764Z(true, false);
                break;
            case 2:
                m51764Z(false, true);
                break;
            case 3:
                m51764Z(false, false);
                break;
            case 4:
                m51768d0();
                break;
            case 5:
                m51756F0();
                break;
            case 6:
                m51766b0();
                break;
            case 7:
                m51769e0();
                break;
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final void m51768d0() {
        Media media = getMedia();
        if (media != null) {
            this.f33586L.m151453a0((Act) getContext(), m51771g0(false, false).m151488j(media.tags).m151487i(!vwb.m200296J(media.tags)), this.f33587M);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final void m51769e0() {
        Media media;
        lrj0.C18309b c18309bM221515e = this.f33587M.m221515e();
        if (c18309bM221515e == null || (media = c18309bM221515e.f129725b) == null) {
            return;
        }
        final Media mediaMo223809clone = media.mo223809clone();
        TagChooseMkAct.m43222v2((Act) getContext(), vwb.m200299M(mediaMo223809clone), null, new Runnable() { // from class: l.pk1
            @Override // java.lang.Runnable
            public final void run() {
                this.f149926a.m51778n0(mediaMo223809clone);
            }
        }, null);
    }

    /* JADX INFO: renamed from: f0 */
    public final boolean m51770f0(lrj0.C18309b c18309b, Media media) {
        if (c18309b == null || media == null) {
            return false;
        }
        boolean z = media instanceof Picture;
        return !c18309b.f129724a.isSuccess() || (z && this.f33584J.m175077h().mo141487c() && ((Picture) media).isLabelJudge(MediaLabel.get(MediaLabel.WITH_AUDIT_AI_PICTURE))) || (z && this.f33584J.m175077h().mo141488d() && ((Picture) media).isLabelJudge(MediaLabel.get(MediaLabel.WITH_REPEAT_MAIN_PICTURE))) || (z && this.f33584J.m175077h().mo141485a() && ((Picture) media).isLabelJudge(MediaLabel.get(MediaLabel.WITH_NET_MAIN_PICTURE))) || (z && this.f33584J.m175077h().mo141489e() && ((Picture) media).isLabelJudge(MediaLabel.get(MediaLabel.WITH_LOW)));
    }

    /* JADX INFO: renamed from: g0 */
    public final lrj0.C18308a m51771g0(boolean z, boolean z2) {
        lrj0.C18308a c18308aM151487i = new lrj0.C18308a().m151492n(this.f33584J.m175083n()).m151489k(z).m151490l(z2).m151487i(this.f33584J.m175087r());
        if (this.f33584J.m175085p()) {
            c18308aM151487i.m151486h(AvatarUpdateCheckType.LOCAL_CHECK);
        }
        jh70 jh70VarM175077h = this.f33584J.m175077h();
        if (!jh70VarM175077h.mo141488d() && !jh70VarM175077h.mo141489e() && !jh70VarM175077h.mo141485a() && !jh70VarM175077h.mo141486b()) {
            return c18308aM151487i;
        }
        c18308aM151487i.m151486h(AvatarUpdateCheckType.REMOTE_CHECK);
        c18308aM151487i.m151491m("editProfile");
        return c18308aM151487i;
    }

    public qk1 getConfig() {
        return this.f33584J;
    }

    public Media getMedia() {
        if (!NullChecker.m81303a(this.f33587M)) {
            return null;
        }
        lrj0.C18309b c18309bM221515e = this.f33587M.m221515e();
        if (NullChecker.m81303a(c18309bM221515e)) {
            return c18309bM221515e.f129725b;
        }
        return null;
    }

    public lrj0.C18309b getMediaStateResult() {
        if (!NullChecker.m81303a(this.f33587M)) {
            return null;
        }
        lrj0.C18309b c18309bM221515e = this.f33587M.m221515e();
        if (NullChecker.m81303a(c18309bM221515e)) {
            return c18309bM221515e;
        }
        return null;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m51772h0(Media media, PictureServeCheckResult pictureServeCheckResult) {
        if (this.f33584J.m175083n() == AvatarUpdateType.AVATAR && (media instanceof Picture) && m50800v() == 0) {
            Picture picture = (Picture) media;
            if (this.f33584J.m175077h().mo141486b() && picture.isLabelJudge(MediaLabel.get(MediaLabel.NOT_VERIFICATION)) && CoreModule.f17545c.f19639e0.m169520na().isPicVerificationVerified()) {
                m51758H0(picture);
                return;
            }
            if (this.f33584J.m175077h().mo141488d() && picture.isLabelJudge(MediaLabel.get(MediaLabel.WITH_REPEAT_MAIN_PICTURE))) {
                m51760J0(MediaReorderCard.f32952Q0, pictureServeCheckResult);
                return;
            }
            if (this.f33584J.m175077h().mo141489e() && picture.isLow()) {
                m51759I0(pictureServeCheckResult);
            } else if (this.f33584J.m175077h().mo141485a() && picture.isLabelJudge(MediaLabel.get(MediaLabel.WITH_NET_MAIN_PICTURE))) {
                m51760J0(MediaReorderCard.f32953R0, pictureServeCheckResult);
            }
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final void m51773i0() {
        if (this.f33590P != null) {
            return;
        }
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(this.f33594u, "textColor", new ArgbEvaluator(), Integer.valueOf(Color.parseColor("#e2e2e2")), Integer.valueOf(Color.parseColor("#FF7602")));
        this.f33590P = objectAnimatorOfObject;
        objectAnimatorOfObject.setDuration(800L);
        this.f33590P.setRepeatCount(4);
        this.f33590P.setInterpolator(null);
        this.f33590P.setRepeatMode(2);
        this.f33590P.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.lk1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f128442a.m51779o0(valueAnimator);
            }
        });
        if (this.f33590P.isStarted()) {
            return;
        }
        this.f33590P.start();
    }

    /* JADX INFO: renamed from: j0 */
    public final void m51774j0() {
        this.f33577C.setTextSize(10.0f);
        this.f33578D.setTextSize(10.0f);
        this.f33576B.setTextSize(10.0f);
        this.f33576B.setBackgroundResource(e3c0.f89132o);
        this.f33578D.setTextColor(Color.parseColor("#FF700A"));
        this.f33578D.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        xdl0.m208325C0(this.f33577C, t100.m186890d(20.0f));
        xdl0.m208325C0(this.f33576B, t100.m186890d(20.0f));
        xdl0.m208325C0(this.f33578D, t100.m186890d(20.0f));
        this.f33599z.setImageResource(e3c0.f89162y);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f33580F.getLayoutParams();
        layoutParams.gravity = 17;
        this.f33580F.setLayoutParams(layoutParams);
        xdl0.m208359W(this.f33580F, 0);
        xdl0.m208357U(this.f33580F, 0);
    }

    /* JADX INFO: renamed from: k0 */
    public final void m51775k0() {
        lrj0 lrj0Var = new lrj0();
        this.f33586L = lrj0Var;
        this.f33587M = lrj0Var.m151455c0();
        ((Act) getContext()).duringCreated(new v9j() { // from class: l.jk1
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f118331a.m51780p0();
            }
        }, false).subscribe(mkd0.m154955G(new e30() { // from class: l.kk1
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f123523a.m51781q0((lrj0.C18309b) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l0 */
    public final void m51776l0() {
        xdl0.m208329E0(this.f33598y, new View.OnClickListener() { // from class: l.vj1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f181653a.m51782r0(view);
            }
        });
        xdl0.m208329E0(this.f33577C, new View.OnClickListener() { // from class: l.gk1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f103135a.m51783s0(view);
            }
        });
        xdl0.m208329E0(this.f33578D, new View.OnClickListener() { // from class: l.ik1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f113624a.m51784t0(view);
            }
        });
    }

    /* JADX INFO: renamed from: m0 */
    public boolean m51777m0() {
        if (NullChecker.m81303a(this.f33587M)) {
            lrj0.C18309b c18309bM221515e = this.f33587M.m221515e();
            if (NullChecker.m81303a(c18309bM221515e) && c18309bM221515e.f129728e && c18309bM221515e.f129725b != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m51779o0(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.f33594u.setTextColor(iIntValue);
        VImage vImage = this.f33593t;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        vImage.setColorFilter(new PorterDuffColorFilter(iIntValue, mode));
        this.f33595v.setTextColor(iIntValue);
        this.f33591r.getBackground().setColorFilter(new PorterDuffColorFilter(((Integer) valueAnimator.getAnimatedValue()).intValue(), mode));
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.VReorderCard, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m51762X(this);
        m51776l0();
        m51775k0();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C22306c m51780p0() {
        return this.f33587M.onBackpressureLatest().filter(new w9j() { // from class: l.ok1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((lrj0.C18309b) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m51781q0(lrj0.C18309b c18309b) {
        if (c18309b.equals(this.f33588N)) {
            return;
        }
        this.f33588N = c18309b.m151493a();
        mo50692k(c18309b.f129725b == null);
        m51755E0(c18309b);
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m51782r0(View view) {
        m51765a0();
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m51783s0(View view) {
        m51769e0();
    }

    public void setConfig(qk1 qk1Var) {
        this.f33584J = qk1Var;
        m51763Y();
    }

    public void setIllegalVisible(boolean z) {
        lrj0.C18309b c18309bM221515e = this.f33587M.m221515e();
        if (c18309bM221515e != null) {
            c18309bM221515e.f129732i = z;
            this.f33587M.onNext(c18309bM221515e);
        }
    }

    /* JADX INFO: renamed from: setMedia, reason: merged with bridge method [inline-methods] */
    public void m51778n0(Media media) {
        lrj0.C18309b c18309b = (media == null || this.f33587M.m221515e() == null) ? new lrj0.C18309b() : this.f33587M.m221515e();
        c18309b.f129725b = media;
        this.f33587M.onNext(c18309b);
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m51784t0(View view) {
        m51769e0();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.VReorderCard
    /* JADX INFO: renamed from: u */
    public void mo50704u() {
        if (SystemClock.uptimeMillis() - this.f33585K < 300) {
            return;
        }
        this.f33585K = SystemClock.uptimeMillis();
        m51765a0();
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m51785u0(Media media, int[] iArr) {
        if (NullChecker.m81303a(media.cover())) {
            qib0.f154691G.m102327J0(this.f33596w, media.cover().profile480(), false);
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m51786v0() {
        xdl0.m208345M0(this.f33582H, false);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.VReorderCard
    /* JADX INFO: renamed from: w */
    public void mo50707w(boolean z) {
        super.mo50707w(z);
        m51761K0(!z);
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ void m51787w0(AvatarCards avatarCards, Media media) {
        avatarCards.m50811h(avatarCards.m50812i()).m51778n0(media);
        m50787f();
        lsi0.m151595y("新上传头像已保存为生活照");
        zvf0.m220402x("e_new_avatar_save_toast", "p_edit_profile_view");
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m51788x0(User user, final Media media) {
        m51778n0(user.picture(0));
        if (getParent() instanceof AvatarCards) {
            final AvatarCards avatarCards = (AvatarCards) getParent();
            if (avatarCards.m50812i() >= avatarCards.f33071d) {
                lsi0.m151595y(String.format(Locale.CHINA, "%s已达上限，不保存新上传头像", lqa.m150985w() ? "生活照" : "我的照片"));
                m50787f();
            } else {
                if (avatarCards.m50811h(avatarCards.m50812i()).f33584J.m175087r()) {
                    TagChooseMkAct.m43222v2((Act) getContext(), vwb.m200299M(media), null, new Runnable() { // from class: l.hk1
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f108143a.m51787w0(avatarCards, media);
                        }
                    }, null);
                    return;
                }
                avatarCards.m50811h(avatarCards.m50812i()).m51778n0(media);
                m50787f();
                lsi0.m151595y("新上传头像已保存为其他照片");
                zvf0.m220402x("e_new_avatar_save_toast", "p_edit_profile_view");
            }
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m51789y0(j0m j0mVar) {
        this.f33589O = false;
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m51790z0(PictureServeCheckResult pictureServeCheckResult) {
        m51767c0(ClickAction.CHOOSE_PICTURE);
        zvf0.m220399u("e_replace_photo", "p_lowqualityphoto__popup", j760.m140076a("lowquality_reason", pictureServeCheckResult.lowPhotoResult.mapping));
    }

    public AvatarCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AvatarCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
