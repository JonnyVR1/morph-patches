package com.p046p1.mobile.putong.core.p053ui.profile.exp;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.clevertap.android.sdk.Constants;
import com.facebook.drawee.generic.RoundingParams;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.android.p048ui.cropiwa.CropperAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.NewTags;
import com.p046p1.mobile.putong.core.data.PhotoLowConfig;
import com.p046p1.mobile.putong.core.data.PhotoLowModelData;
import com.p046p1.mobile.putong.core.newui.profile.TagChooseMkAct;
import com.p046p1.mobile.putong.core.p053ui.profile.MediaReorderCardScaleIndependentFrame;
import com.p046p1.mobile.putong.core.p053ui.profile.ProfileMediaAct;
import com.p046p1.mobile.putong.core.p053ui.profile.VReorderCard;
import com.p046p1.mobile.putong.core.p053ui.profile.exp.ExpEditProfileImageCard;
import com.p046p1.mobile.putong.data.Dimension;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.MediaLabel;
import com.p046p1.mobile.putong.data.MediaLocalStatus;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.UploadSource;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p065ui.download.C13111a;
import com.p046p1.mobile.putong.p065ui.download.DownloadTask;
import com.p046p1.mobile.putong.safety.IllegalPictureException;
import com.p046p1.mobile.putong.util.TrackMediaUploadUtil;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import p133rx.C22306c;
import p133rx.schedulers.Schedulers;
import p147v.VDraweeView;
import p147v.VFrame_Anim;
import p147v.VListCell;
import p147v.VProgressBar;
import p147v.VText;
import p149l.a2m;
import p149l.bt0;
import p149l.c40;
import p149l.c4g0;
import p149l.cwf0;
import p149l.d30;
import p149l.dd80;
import p149l.e30;
import p149l.f30;
import p149l.ffx;
import p149l.fwl;
import p149l.g30;
import p149l.ijf;
import p149l.j760;
import p149l.jo0;
import p149l.lew;
import p149l.lqa;
import p149l.lsi0;
import p149l.mkd0;
import p149l.mqi0;
import p149l.o6j0;
import p149l.ogw;
import p149l.qib0;
import p149l.rhi;
import p149l.roj0;
import p149l.t100;
import p149l.u4c0;
import p149l.ura;
import p149l.vwb;
import p149l.w0c0;
import p149l.w9j;
import p149l.wn90;
import p149l.x2c0;
import p149l.xaj0;
import p149l.xdl0;
import p149l.ya5;
import p149l.yij0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes4.dex */
public class ExpEditProfileImageCard extends VReorderCard {

    /* JADX INFO: renamed from: G0 */
    public static String f33103G0 = "RepeatPicture";

    /* JADX INFO: renamed from: H0 */
    public static String f33104H0 = "NetPicture";

    /* JADX INFO: renamed from: A */
    public VProgressBar f33105A;

    /* JADX INFO: renamed from: B */
    public VProgressBar f33106B;

    /* JADX INFO: renamed from: C */
    public ImageView f33107C;

    /* JADX INFO: renamed from: D */
    public ijf f33108D;

    /* JADX INFO: renamed from: E */
    public ImageView f33109E;

    /* JADX INFO: renamed from: E0 */
    public int f33110E0;

    /* JADX INFO: renamed from: F */
    public boolean f33111F;

    /* JADX INFO: renamed from: F0 */
    public ObjectAnimator f33112F0;

    /* JADX INFO: renamed from: G */
    public int f33113G;

    /* JADX INFO: renamed from: H */
    public String f33114H;

    /* JADX INFO: renamed from: I */
    public Media f33115I;

    /* JADX INFO: renamed from: J */
    public c4g0 f33116J;

    /* JADX INFO: renamed from: K */
    public g30<Media, Boolean, Boolean> f33117K;

    /* JADX INFO: renamed from: L */
    public List<String> f33118L;

    /* JADX INFO: renamed from: M */
    public List<Media> f33119M;

    /* JADX INFO: renamed from: N */
    public boolean f33120N;

    /* JADX INFO: renamed from: O */
    public PhotoLowModelData f33121O;

    /* JADX INFO: renamed from: P */
    public PhotoLowModelData f33122P;

    /* JADX INFO: renamed from: Q */
    public PhotoLowModelData f33123Q;

    /* JADX INFO: renamed from: R */
    public PhotoLowModelData f33124R;

    /* JADX INFO: renamed from: S */
    public cwf0 f33125S;

    /* JADX INFO: renamed from: T */
    public cwf0 f33126T;

    /* JADX INFO: renamed from: U */
    public boolean f33127U;

    /* JADX INFO: renamed from: V */
    public long f33128V;

    /* JADX INFO: renamed from: W */
    public Runnable f33129W;

    /* JADX INFO: renamed from: k0 */
    public Media f33130k0;

    /* JADX INFO: renamed from: p0 */
    public ExpFakeCardBgView f33131p0;

    /* JADX INFO: renamed from: r */
    public MediaReorderCardScaleIndependentFrame f33132r;

    /* JADX INFO: renamed from: s */
    public VDraweeView f33133s;

    /* JADX INFO: renamed from: t */
    public View f33134t;

    /* JADX INFO: renamed from: u */
    public VText f33135u;

    /* JADX INFO: renamed from: v */
    public TextView f33136v;

    /* JADX INFO: renamed from: w */
    public LinearLayout f33137w;

    /* JADX INFO: renamed from: x */
    public TextView f33138x;

    /* JADX INFO: renamed from: y */
    public VFrame_Anim f33139y;

    /* JADX INFO: renamed from: z */
    public ImageView f33140z;

    public ExpEditProfileImageCard(Context context) {
        super(context);
        this.f33111F = false;
        this.f33113G = 0;
        this.f33118L = new ArrayList(1);
        this.f33119M = new ArrayList();
        this.f33110E0 = -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O */
    public static /* synthetic */ roj0 m50841O(xaj0 xaj0Var) {
        if (((Boolean) xaj0Var.f191751a).booleanValue()) {
            throw new IllegalPictureException("检测到敏感信息，上传失败");
        }
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m50844R() {
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ Picture m50846T(List list) {
        return (Picture) list.get(0);
    }

    /* JADX INFO: renamed from: Y0 */
    private boolean m50852Y0() {
        PhotoLowConfig photoLowConfigM150966d = lqa.m150966d();
        if (!mqi0.m155929D(CoreModule.f17545c.f19639e0.f149180G4.get().longValue())) {
            CoreModule.f17545c.f19639e0.f149180G4.put(Long.valueOf(mqi0.m155944o()));
            CoreModule.f17545c.f19639e0.f149187H4.put(1);
            return true;
        }
        if (CoreModule.f17545c.f19639e0.f149187H4.get().intValue() >= (photoLowConfigM150966d == null ? 2 : photoLowConfigM150966d.count)) {
            return false;
        }
        CoreModule.f17545c.f19639e0.f149180G4.put(Long.valueOf(mqi0.m155944o()));
        CoreModule.f17545c.f19639e0.f149187H4.m189988a(1);
        return true;
    }

    /* JADX INFO: renamed from: c1 */
    private void m50857c1() {
        if (getWidth() <= 0 || getHeight() <= 0) {
            return;
        }
        measureChildWithMargins(this.f33135u, ffx.m121198a(getWidth()), 0, ffx.m121198a(getHeight()), 0);
        int height = getHeight() - ((FrameLayout.LayoutParams) this.f33135u.getLayoutParams()).bottomMargin;
        int width = (getWidth() / 2) - (this.f33135u.getMeasuredWidth() / 2);
        int measuredWidth = this.f33135u.getMeasuredWidth() + width;
        this.f33135u.layout(width, height - this.f33135u.getMeasuredHeight(), measuredWidth, height);
    }

    /* JADX INFO: renamed from: g1 */
    private void m50862g1() {
        if (!NullChecker.m81303a(this.f33115I) || TextUtils.isEmpty(this.f33115I.url) || this.f33111F) {
            xdl0.m208345M0(this.f33138x, false);
        } else {
            xdl0.m208345M0(this.f33138x, true);
            int iM50800v = m50800v();
            TextView textView = this.f33138x;
            if (iM50800v == 0) {
                textView.setBackgroundResource(x2c0.f190031c1);
                this.f33138x.setText("首图");
                this.f33138x.setTextColor(Color.parseColor("#ffffff"));
            } else {
                textView.setBackgroundResource(x2c0.f190063d1);
                xdl0.m208329E0(this.f33138x, new View.OnClickListener() { // from class: l.laf
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f127192a.m50890L0(view);
                    }
                });
                NewTags newTagsMo33691Gh = !vwb.m200296J(this.f33115I.tags) ? ura.m195053e().m195057d().mo33691Gh(this.f33115I.tags.get(0)) : null;
                if (newTagsMo33691Gh == null || TextUtils.isEmpty(newTagsMo33691Gh.name)) {
                    this.f33138x.setTextColor(getResources().getColor(w0c0.f183749A));
                    this.f33138x.setText("添加标签");
                } else {
                    this.f33138x.setTextColor(Color.parseColor(Constants.BLACK));
                    this.f33138x.setText(newTagsMo33691Gh.name);
                }
            }
            this.f33138x.getPaint().setFakeBoldText(true);
        }
        requestLayout();
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ Picture m50863h0(Media media) {
        return (Picture) media;
    }

    /* JADX INFO: renamed from: i1 */
    private void m50865i1() {
        new lew(m50912n0(), new Runnable() { // from class: l.haf
            @Override // java.lang.Runnable
            public final void run() {
                ExpEditProfileImageCard.m50844R();
            }
        }, new Runnable() { // from class: l.iaf
            @Override // java.lang.Runnable
            public final void run() {
                this.f112299a.m50876s0();
            }
        }).show();
    }

    /* JADX INFO: renamed from: j1 */
    private void m50867j1() {
        if (!NullChecker.m81303a(this.f33121O) || TextUtils.isEmpty(this.f33121O.conclusion)) {
            return;
        }
        if (this.f33125S == null) {
            this.f33125S = new cwf0("p_lowqualityphoto__popup", Dialog.class.getName());
        }
        new dd80.C16336a(m50912n0()).m110996y0("温馨提示").m110991t0(this.f33121O.conclusion).m110974c0("更换照片", new Runnable() { // from class: l.vaf
            @Override // java.lang.Runnable
            public final void run() {
                this.f180731a.m50891M0();
            }
        }).m110969X("稍后再说", new Runnable() { // from class: l.waf
            @Override // java.lang.Runnable
            public final void run() {
                this.f185456a.m50892N0();
            }
        }).m110986o0(new DialogInterface.OnShowListener() { // from class: l.xaf
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f191734a.m50893O0(dialogInterface);
            }
        }).m110985n0(new DialogInterface.OnDismissListener() { // from class: l.yaf
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f197200a.m50894P0(dialogInterface);
            }
        }).m110989r0();
    }

    /* JADX INFO: renamed from: k1 */
    private void m50869k1(String str) {
        String str2;
        final String str3;
        if (this.f33126T == null) {
            this.f33126T = new cwf0("p_lowqualityphoto__popup", Dialog.class.getName());
        }
        if (TextUtils.equals(str, f33103G0) && NullChecker.m81303a(this.f33122P)) {
            PhotoLowModelData photoLowModelData = this.f33122P;
            str2 = photoLowModelData.conclusion;
            str3 = photoLowModelData.mapping;
        } else if (TextUtils.equals(str, f33104H0) && NullChecker.m81303a(this.f33123Q)) {
            PhotoLowModelData photoLowModelData2 = this.f33123Q;
            str2 = photoLowModelData2.conclusion;
            str3 = photoLowModelData2.mapping;
        } else {
            str2 = "";
            str3 = "";
        }
        this.f33126T.m109040p(j760.m140076a("lowquality_reason", str3));
        new dd80.C16336a(m50912n0()).m110996y0("温馨提示").m110991t0(str2).m110974c0("更换照片", new Runnable() { // from class: l.bbf
            @Override // java.lang.Runnable
            public final void run() {
                this.f74802a.m50895Q0(str3);
            }
        }).m110969X("稍后再说", new Runnable() { // from class: l.cbf
            @Override // java.lang.Runnable
            public final void run() {
                zvf0.m220399u("e_replace_photo_cancel", "p_lowqualityphoto__popup", j760.m140076a("lowquality_reason", str3));
            }
        }).m110986o0(new DialogInterface.OnShowListener() { // from class: l.dbf
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f85312a.m50896R0(dialogInterface);
            }
        }).m110985n0(new DialogInterface.OnDismissListener() { // from class: l.ebf
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f90325a.m50897S0(dialogInterface);
            }
        }).m110989r0();
    }

    /* JADX INFO: renamed from: m1 */
    private void m50871m1(String str) {
        this.f33118L.add(str);
    }

    /* JADX INFO: renamed from: o0 */
    private void m50872o0() {
        if (this.f33058o && TEnum.equals(this.f33115I.status, "normal")) {
            if (NullChecker.m81303a(m50789h().f33077j)) {
                m50789h().f33077j.run();
            }
            TagChooseMkAct.m43222v2(m50912n0(), vwb.m200299M(this.f33115I), null, new Runnable() { // from class: l.zaf
                @Override // java.lang.Runnable
                public final void run() {
                    this.f202344a.m50921z0();
                }
            }, null);
        }
    }

    /* JADX INFO: renamed from: p1 */
    private void m50873p1() {
        if (NullChecker.m81303a(this.f33116J)) {
            m50910l1(null);
            yij0.m214943U(this.f33116J);
            this.f33134t.setAlpha(0.0f);
            this.f33116J = null;
        }
    }

    /* JADX INFO: renamed from: q0 */
    private C22306c<Picture> m50874q0(final Picture picture) {
        return C22306c.just(picture).observeOn(jo0.m142408a()).map(new w9j() { // from class: l.qaf
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return CoreModule.f17545c.f19639e0.m169516ma();
            }
        }).observeOn(Schedulers.m221493io()).flatMap(new w9j() { // from class: l.raf
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f158513a.m50881C0(picture, (User) obj);
            }
        });
    }

    /* JADX INFO: renamed from: r0 */
    private C22306c<roj0> m50875r0(Media media) {
        return (qib0.f154703R.m94727c() && (media instanceof Picture)) ? qib0.f154703R.m94726b(Uri.parse(media.url).getPath()).map(new w9j() { // from class: l.oaf
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ExpEditProfileImageCard.m50841O((xaj0) obj);
            }
        }) : C22306c.just(roj0.f160388a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public void m50876s0() {
        wn90.m204602F().m204664n0((Act) getContext(), new f30() { // from class: l.saf
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                this.f163351a.m50882D0((String) obj, (Media) obj2);
            }
        }, m50800v() != 0);
    }

    /* JADX INFO: renamed from: v0 */
    private void m50877v0(final Media media) throws Throwable {
        if (m50912n0() == null || m50912n0().isFinishing() || m50912n0().isDestroyed()) {
            return;
        }
        if (lqa.m150971i() && NullChecker.m81303a(this.f33115I) && (media instanceof Picture) && TEnum.equals(this.f33115I.status, MediaLocalStatus.preprocessed)) {
            Picture picture = (Picture) media;
            String strM164283d = ogw.m164283d(new File(rhi.m179382z(this.f33115I.url)));
            Dimension dimension = picture.size;
            int i = dimension.width;
            int i2 = dimension.height;
            o6j0.m162869m("e_hyper_profile_pic_double_check", "p_edit_profile_view", o6j0.C18854a.m162878h("pic_trace_id", strM164283d), o6j0.C18854a.m162878h("pic_trace_type", "trimmed"), o6j0.C18854a.m162878h("pic_trace_url", media.url), o6j0.C18854a.m162878h("pic_trace_resolution", picture.size.width + BaseSei.f13930X + picture.size.height));
            CoreModule.f17545c.f19639e0.f149184H1.onNext(this.f33115I.url);
        }
        if (NullChecker.m81303a(this.f33115I) && NullChecker.m81303a(media)) {
            Media media2 = this.f33115I;
            media2.status = media.status;
            media.tags = media2.tags;
        }
        boolean z = false;
        if (m50800v() == 0 && (media instanceof Picture)) {
            Picture picture2 = (Picture) media;
            boolean zIsLabelJudge = picture2.isLabelJudge(MediaLabel.get(MediaLabel.WITH_REPEAT_MAIN_PICTURE));
            boolean z2 = this.f33120N && picture2.isLow();
            boolean zIsLabelJudge2 = picture2.isLabelJudge(MediaLabel.get(MediaLabel.WITH_NET_MAIN_PICTURE));
            picture2.isLabelJudge(MediaLabel.get(MediaLabel.NOT_VERIFICATION));
            if (ura.m195053e().m195057d().mo33798ak()) {
                m50907e1(media, true, false);
                if (zIsLabelJudge) {
                    m50869k1(f33103G0);
                } else if (z2) {
                    m50867j1();
                } else if (zIsLabelJudge2) {
                    m50869k1(f33104H0);
                }
            } else if (ura.m195053e().m195057d().mo33687Fl()) {
                m50907e1(media, true, false);
                if (zIsLabelJudge) {
                    m50869k1(f33103G0);
                } else if (z2) {
                    m50867j1();
                }
            } else if (lqa.m150985w() && z2 && NullChecker.m81303a(this.f33130k0)) {
                m50910l1(null);
                m50907e1(this.f33130k0, true, false);
                m50867j1();
            } else {
                m50907e1(media, true, false);
                if (z2) {
                    m50867j1();
                }
            }
            if (TEnum.equals(media.status, "normal") || !z) {
            }
            this.f33119M.add(media);
            this.f33116J = null;
            this.f33107C.setImageResource(x2c0.f190005b7);
            m50910l1(this.f33107C);
            postDelayed(new Runnable() { // from class: l.taf
                @Override // java.lang.Runnable
                public final void run() {
                    this.f169116a.m50887I0(media);
                }
            }, 1000L);
            if (NullChecker.m81303a(this.f33046c.f87435f.f33076i)) {
                this.f33046c.f87435f.f33076i.mo50821a(m50800v(), true);
            }
            CoreModule.f17545c.f19639e0.f149177G1.onNext(roj0.f160388a);
            return;
        }
        m50907e1(media, true, false);
        z = true;
        if (TEnum.equals(media.status, "normal")) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
    public void m50902X0(Throwable th) {
        setVisibility(0);
        this.f33116J = null;
        xdl0.m208345M0(this.f33140z, false);
        this.f33107C.setImageResource(x2c0.f189973a7);
        m50910l1(this.f33107C);
        m50913n1(true);
        if (NullChecker.m81303a(this.f33046c.f87435f.f33076i)) {
            this.f33046c.f87435f.f33076i.mo50821a(m50800v(), false);
        }
        if (m50800v() == 0 && (this.f33115I instanceof Picture) && NullChecker.m81303a(this.f33130k0)) {
            m50910l1(null);
            m50907e1(this.f33130k0, true, false);
        }
        if (th instanceof IllegalPictureException) {
            lsi0.m151595y(th.getMessage());
        }
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m50879A0(Drawable drawable, Drawable drawable2, ValueAnimator valueAnimator) {
        if (xdl0.m208349O0(this.f33131p0.f33157c)) {
            this.f33131p0.f33157c.setTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(((Integer) valueAnimator.getAnimatedValue()).intValue(), PorterDuff.Mode.SRC_ATOP);
        drawable.setColorFilter(porterDuffColorFilter);
        drawable2.setColorFilter(porterDuffColorFilter);
    }

    /* JADX INFO: renamed from: B0 */
    public final /* synthetic */ Picture m50880B0(Picture picture, Envelope envelope) {
        if (envelope.meta.code == 200) {
            CoreData coreData = (CoreData) envelope.data.getModuleData(CoreData.class);
            if (NullChecker.m81303a(coreData)) {
                this.f33121O = coreData.lowPhotoResult;
                this.f33122P = coreData.repeatPictureResult;
                this.f33123Q = coreData.netPictureResult;
                this.f33124R = coreData.notVerificationResultData;
                if (ura.m195053e().m195057d().mo33798ak()) {
                    if (NullChecker.m81303a(this.f33122P) && TextUtils.equals(this.f33122P.audit, "repeat")) {
                        picture.setLabel(MediaLabel.get(MediaLabel.WITH_REPEAT_MAIN_PICTURE));
                    } else {
                        picture.removeLabel(MediaLabel.get(MediaLabel.WITH_REPEAT_MAIN_PICTURE));
                    }
                    if (NullChecker.m81303a(this.f33123Q) && TextUtils.equals(this.f33123Q.audit, "net")) {
                        picture.setLabel(MediaLabel.get(MediaLabel.WITH_NET_MAIN_PICTURE));
                    } else {
                        picture.removeLabel(MediaLabel.get(MediaLabel.WITH_NET_MAIN_PICTURE));
                    }
                }
                if (ura.m195053e().m195057d().mo33687Fl()) {
                    if (NullChecker.m81303a(this.f33122P) && TextUtils.equals(this.f33122P.audit, "repeat")) {
                        picture.setLabel(MediaLabel.get(MediaLabel.WITH_REPEAT_MAIN_PICTURE));
                    } else {
                        picture.removeLabel(MediaLabel.get(MediaLabel.WITH_REPEAT_MAIN_PICTURE));
                    }
                }
                if (this.f33120N && NullChecker.m81303a(this.f33121O) && TextUtils.equals(this.f33121O.audit, "low")) {
                    picture.setLow();
                } else {
                    picture.removeLowLabel();
                }
                picture.removeLabel(MediaLabel.get(MediaLabel.NOT_VERIFICATION));
            }
        }
        return picture;
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ C22306c m50881C0(final Picture picture, User user) {
        return CoreModule.f17545c.f19639e0.m169393G9(picture.url, this.f33110E0 == 0 ? 1 : 2, null).map(new w9j() { // from class: l.uaf
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f175598a.m50880B0(picture, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m50882D0(String str, Media media) {
        ijf ijfVar = this.f33108D;
        if (ijfVar != null) {
            ijfVar.mo136608a(m50800v(), str, media);
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m50883E0(View view) {
        this.f33047d.m105113b();
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m50884F0(VListCell vListCell, VListCell.C22545a c22545a, int i) {
        this.f33047d.m105113b();
        if (TextUtils.equals(c22545a.f209159a, "更换头像")) {
            m50876s0();
            return;
        }
        if (TextUtils.equals(c22545a.f209159a, m50912n0().string(R$string.f19038wj)) || TextUtils.equals(c22545a.f209159a, "重新裁剪照片")) {
            if (!TextUtils.equals(getCurPageId(), "p_upload_photos")) {
                o6j0.m162859c("e_picture_re_edit_button", "p_edit_profile_view", new o6j0.C18854a[0]);
            }
            if (NullChecker.m81303a(this.f33115I)) {
                this.f33119M.remove(this.f33115I);
                m50918u0(this.f33115I.url);
                CoreModule.f17545c.f19639e0.f149177G1.onNext(roj0.f160388a);
                return;
            }
            StringBuilder sb = new StringBuilder("MediaReorderCard error: ");
            for (int i2 = 0; i2 < this.f33118L.size(); i2++) {
                if (i2 > 0) {
                    sb.append(", ");
                }
                sb.append(this.f33118L.get(i2));
            }
            CrashHelper.m81296c(new NullPointerException(sb.toString()));
            return;
        }
        if (TextUtils.equals(c22545a.f209159a, m50912n0().string(R$string.f18928t))) {
            m50916q1();
            return;
        }
        if (!TextUtils.equals(c22545a.f209159a, m50912n0().string(R$string.f18622j)) && !TextUtils.equals(c22545a.f209159a, "删除该照片") && !TextUtils.equals(c22545a.f209159a, "删除该视频")) {
            if (TextUtils.equals(c22545a.f209159a, "编辑标签")) {
                m50872o0();
                return;
            }
            return;
        }
        if (!TextUtils.equals(getCurPageId(), "p_upload_photos")) {
            o6j0.m162859c("e_profile_add_delete_photos", "p_edit_profile_view", o6j0.C18854a.m162878h("add_delete_picture", "delete_picture"), o6j0.C18854a.m162876f("picture_number", m50800v() + 1));
        }
        this.f33119M.remove(this.f33115I);
        this.f33115I = null;
        m50871m1(RequestParameters.SUBRESOURCE_DELETE);
        m50873p1();
        m50792l();
        setIllegalPicture(false);
        m50907e1(null, true, false);
        m50909h1();
        a2m a2mVar = this.f33046c.f87435f.f33075h;
        if (a2mVar != null) {
            a2mVar.mo47539b();
        }
        CoreModule.f17545c.f19639e0.f149177G1.onNext(roj0.f160388a);
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m50885G0(DownloadTask downloadTask, File file) {
        m50912n0().progressDismiss();
        getMediaOperation().mo43239f2(m50800v(), file.getAbsolutePath());
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m50886H0(DownloadTask downloadTask, Throwable th) {
        m50912n0().progressDismiss();
        lsi0.m151593w(R$string.f18903s4);
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m50887I0(Media media) {
        if (this.f33115I == media) {
            m50910l1(null);
            this.f33134t.animate().alpha(0.0f).start();
        }
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m50888J0(Picture picture, int[] iArr) {
        m50905b1(picture);
    }

    /* JADX INFO: renamed from: K0 */
    public final /* synthetic */ void m50889K0(int[] iArr) {
        if (NullChecker.m81303a(this.f33115I) && NullChecker.m81303a(this.f33115I.cover()) && NullChecker.m81303a(this.f33115I.cover().url)) {
            qib0.f154691G.m102327J0(this.f33133s, this.f33115I.cover().profile480(), false);
        }
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m50890L0(View view) {
        m50872o0();
    }

    /* JADX INFO: renamed from: M0 */
    public final /* synthetic */ void m50891M0() {
        m50876s0();
        zvf0.m220399u("e_replace_photo", "p_lowqualityphoto__popup", j760.m140076a("lowquality_reason", this.f33121O.mapping));
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m50892N0() {
        zvf0.m220399u("e_replace_photo_cancel", "p_lowqualityphoto__popup", j760.m140076a("lowquality_reason", this.f33121O.mapping));
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m50893O0(DialogInterface dialogInterface) {
        this.f33125S.m109033i();
        this.f33125S.m109036l();
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m50894P0(DialogInterface dialogInterface) {
        this.f33125S.m109035k();
        this.f33125S.m109034j();
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m50895Q0(String str) {
        m50876s0();
        zvf0.m220399u("e_replace_photo", "p_lowqualityphoto__popup", j760.m140076a("lowquality_reason", str));
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ void m50896R0(DialogInterface dialogInterface) {
        this.f33126T.m109033i();
        this.f33126T.m109036l();
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m50897S0(DialogInterface dialogInterface) {
        this.f33126T.m109035k();
        this.f33126T.m109034j();
    }

    /* JADX INFO: renamed from: T0 */
    public final /* synthetic */ C22306c m50898T0(roj0 roj0Var) {
        return ya5.m213795K(vwb.m200324f0(this.f33115I), "profile", "user-profile", UploadSource.get("profile"));
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ C22306c m50899U0(Picture picture) {
        CoreProviderInterface coreProviderInterfaceM195057d = ura.m195053e().m195057d();
        return ((coreProviderInterfaceM195057d.mo33798ak() || coreProviderInterfaceM195057d.mo33687Fl() || this.f33120N) && NullChecker.m81303a(picture) && TEnum.equals(picture.status, "normal")) ? m50874q0(picture) : C22306c.just(picture);
    }

    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ C22306c m50900V0(Media media) throws Throwable {
        m50877v0(media);
        if (NullChecker.m81303a(this.f33129W)) {
            this.f33129W.run();
        }
        return C22306c.just(roj0.f160388a);
    }

    /* JADX INFO: renamed from: W0 */
    public final /* synthetic */ void m50901W0(roj0 roj0Var) {
        setVisibility(0);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00ae  */
    /* JADX INFO: renamed from: Z0 */
    public void m50903Z0() {
        int size;
        ArrayList<CharSequence> arrayList = new ArrayList<>();
        if (NullChecker.m81303a(this.f33115I) && TEnum.equals(this.f33115I.status, "normal") && this.f33110E0 > 0) {
            arrayList.add("编辑标签");
        }
        if (NullChecker.m81303a(this.f33115I) && TEnum.equals(this.f33115I.status, "normal")) {
            if (this.f33115I instanceof Picture) {
                arrayList.add("重新裁剪照片");
            }
            if (this.f33110E0 == 0) {
                arrayList.add("更换头像");
            }
            if (this.f33115I instanceof Picture) {
                this.f33118L.clear();
                this.f33118L.add("show action dialog");
            }
        }
        if (NullChecker.m81303a(this.f33115I) && !TEnum.equals(this.f33115I.status, "normal") && this.f33116J == null) {
            arrayList.add(m50912n0().getString(R$string.f18928t));
        }
        if (m50790i() <= 1 || !NullChecker.m81303a(this.f33115I) || this.f33110E0 <= 0) {
            size = -1;
        } else {
            Media media = this.f33115I;
            if (media instanceof Picture) {
                size = arrayList.size();
                arrayList.add("删除该照片");
            } else if (media instanceof Video) {
                size = arrayList.size();
                arrayList.add("删除该视频");
            } else {
                size = -1;
            }
        }
        if (this.f33120N && NullChecker.m81303a(this.f33115I)) {
            Media media2 = this.f33115I;
            if ((media2 instanceof Picture) && ((Picture) media2).isLow() && m50800v() != 0) {
                arrayList.clear();
                arrayList.add(m50912n0().getString(R$string.f18928t));
                size = arrayList.size();
                arrayList.add(m50912n0().getString(R$string.f18622j));
            }
        }
        if (!this.f33058o) {
            arrayList.clear();
            if (!TEnum.equals(this.f33115I.status, "normal")) {
                arrayList.add(m50912n0().getString(R$string.f18928t));
            }
        }
        if (arrayList.size() == 0) {
            return;
        }
        m50917t0(arrayList, size);
    }

    /* JADX INFO: renamed from: a1 */
    public void m50904a1(final Picture picture) {
        xdl0.m208353Q0(this, new e30() { // from class: l.abf
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f68655a.m50888J0(picture, (int[]) obj);
            }
        });
    }

    /* JADX INFO: renamed from: b1 */
    public void m50905b1(Media media) {
        if (NullChecker.m81303a(this.f33115I)) {
            media.tags = this.f33115I.tags;
        }
        if (NullChecker.m81303a(this.f33115I)) {
            this.f33130k0 = this.f33115I.mo223809clone();
        }
        this.f33115I = media;
        m50871m1("onPickMedia");
        m50916q1();
        m50908f1();
        m50787f();
        m50909h1();
    }

    /* JADX INFO: renamed from: d1 */
    public void m50906d1(Media media) {
        m50907e1(media, false, true);
    }

    /* JADX INFO: renamed from: e1 */
    public void m50907e1(Media media, boolean z, boolean z2) {
        if (NullChecker.m81303a(media) && NullChecker.m81303a(this.f33115I)) {
            media.tags = this.f33115I.tags;
        }
        this.f33115I = media;
        m50871m1("render");
        m50908f1();
        if (NullChecker.m81303a(this.f33117K)) {
            this.f33117K.mo36055a(media, Boolean.valueOf(z), Boolean.valueOf(z2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:49:0x0124  */
    /* JADX INFO: renamed from: f1 */
    public void m50908f1() {
        boolean z = false;
        boolean z2 = true;
        mo50692k(this.f33115I == null);
        xdl0.m208344M(this.f33109E, this.f33115I instanceof Video);
        if (NullChecker.m81303a(this.f33115I) && NullChecker.m81303a(this.f33115I.cover()) && NullChecker.m81303a(this.f33115I.cover().url)) {
            xdl0.m208353Q0(this.f33133s, new e30() { // from class: l.eaf
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f90192a.m50889K0((int[]) obj);
                }
            });
        } else {
            Media media = this.f33115I;
            if (media instanceof Video) {
                qib0.f154691G.m102367m0(this.f33133s, media.url);
            } else {
                qib0.f154691G.m184725o(this.f33133s);
            }
        }
        if (NullChecker.m81303a(this.f33115I) && this.f33116J == null && !TEnum.equals(this.f33115I.status, "normal")) {
            this.f33107C.setImageResource(x2c0.f189973a7);
            m50910l1(this.f33107C);
            z = true;
        }
        if (this.f33115I == null) {
            m50910l1(null);
            this.f33134t.setAlpha(0.0f);
        }
        if ((ura.m195053e().m195057d().mo33798ak() || ura.m195053e().m195057d().mo33687Fl()) && NullChecker.m81303a(this.f33115I)) {
            Media media2 = this.f33115I;
            if ((media2 instanceof Picture) && (((Picture) media2).isLabelJudge(MediaLabel.get(MediaLabel.WITH_REPEAT_MAIN_PICTURE)) || ((Picture) this.f33115I).isLabelJudge(MediaLabel.get(MediaLabel.WITH_NET_MAIN_PICTURE)))) {
                this.f33107C.setImageResource(x2c0.f189973a7);
                m50910l1(this.f33107C);
                this.f33134t.animate().alpha(1.0f).start();
            } else if (this.f33120N || !NullChecker.m81303a(this.f33115I)) {
                this.f33134t.animate().alpha(0.0f).start();
                z2 = z;
            } else {
                Media media3 = this.f33115I;
                if ((media3 instanceof Picture) && ((Picture) media3).isLow()) {
                    this.f33107C.setImageResource(x2c0.f189973a7);
                    m50910l1(this.f33107C);
                    this.f33134t.animate().alpha(1.0f).start();
                } else {
                    this.f33134t.animate().alpha(0.0f).start();
                    z2 = z;
                }
            }
        } else if (this.f33120N) {
            this.f33134t.animate().alpha(0.0f).start();
            z2 = z;
        } else {
            this.f33134t.animate().alpha(0.0f).start();
            z2 = z;
        }
        m50913n1(z2);
        m50862g1();
    }

    public List<Media> getAddPhotos() {
        return this.f33119M;
    }

    public fwl getMediaOperation() {
        if (NullChecker.m81303a(this.f33056m)) {
            return this.f33056m;
        }
        return getContext() instanceof fwl ? (fwl) getContext() : (ProfileMediaAct) getContext();
    }

    /* JADX INFO: renamed from: h1 */
    public void m50909h1() {
        ObjectAnimator objectAnimator;
        if (!ura.m195053e().m195057d().mo33684F7() || this.f33110E0 == -1) {
            return;
        }
        this.f33132r.setBackgroundResource(x2c0.f189755T6);
        if (this.f33131p0 == null) {
            ExpFakeCardBgView expFakeCardBgView = new ExpFakeCardBgView(getContext());
            this.f33131p0 = expFakeCardBgView;
            MediaReorderCardScaleIndependentFrame mediaReorderCardScaleIndependentFrame = this.f33132r;
            int i = xdl0.f192403e;
            mediaReorderCardScaleIndependentFrame.addView(expFakeCardBgView, i, i);
            this.f33131p0.setGravity(17);
        }
        if (lqa.m150973k()) {
            int i2 = this.f33110E0;
            if (i2 <= 0 || i2 >= 3 || ((objectAnimator = this.f33112F0) != null && objectAnimator.isRunning())) {
                int i3 = this.f33110E0;
                if (i3 <= 0 || i3 >= 3) {
                    this.f33131p0.f33156b.setTextColor(Color.parseColor("#cccccc"));
                    this.f33131p0.f33157c.setTextColor(Color.parseColor("#cccccc"));
                    if (this.f33131p0.f33155a.getBackground() != null) {
                        this.f33131p0.f33155a.getBackground().clearColorFilter();
                    }
                    this.f33132r.getBackground().clearColorFilter();
                }
            } else {
                this.f33131p0.f33156b.setTextColor(getResources().getColor(w0c0.f183749A));
                this.f33131p0.f33157c.setTextColor(getResources().getColor(w0c0.f183749A));
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(getResources().getColor(w0c0.f183749A), PorterDuff.Mode.SRC_ATOP);
                this.f33132r.getBackground().setColorFilter(porterDuffColorFilter);
                if (this.f33131p0.f33155a.getBackground() != null && !porterDuffColorFilter.equals(this.f33131p0.f33155a.getBackground().getColorFilter())) {
                    Drawable drawableMutate = this.f33131p0.f33155a.getBackground().mutate();
                    drawableMutate.setColorFilter(porterDuffColorFilter);
                    this.f33131p0.f33155a.setImageDrawable(drawableMutate);
                }
            }
        }
        int i4 = this.f33113G;
        this.f33131p0.m50951c(this.f33110E0, (i4 == 2 || i4 == 3) ? false : true, i4 != 3 || this.f33110E0 < 3);
        xdl0.m208345M0(this.f33131p0, this.f33115I == null);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.VReorderCard
    /* JADX INFO: renamed from: k */
    public void mo50692k(boolean z) {
        super.mo50692k(z);
    }

    /* JADX INFO: renamed from: l1 */
    public void m50910l1(View view) {
        this.f33139y.m223025F(view, new w9j() { // from class: l.jaf
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((View) obj).animate().alpha(1.0f).setDuration(200L);
            }
        }, new w9j() { // from class: l.kaf
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((View) obj).animate().alpha(0.0f).setDuration(200L);
            }
        });
    }

    /* JADX INFO: renamed from: m0 */
    public void m50911m0(View view) {
        this.f33132r = (MediaReorderCardScaleIndependentFrame) view.findViewById(u4c0.f174580z4);
        this.f33133s = (VDraweeView) view.findViewById(u4c0.f173909L5);
        this.f33134t = view.findViewById(u4c0.f174079V7);
        this.f33135u = (VText) view.findViewById(u4c0.f173986Pe);
        this.f33136v = (TextView) view.findViewById(u4c0.f173875J5);
        this.f33137w = (LinearLayout) view.findViewById(u4c0.f173849Hd);
        this.f33138x = (TextView) view.findViewById(u4c0.f173815Fd);
        this.f33140z = (ImageView) view.findViewById(u4c0.f174571yc);
        this.f33139y = (VFrame_Anim) view.findViewById(u4c0.f174588zc);
        this.f33105A = (VProgressBar) view.findViewById(u4c0.f174003Qe);
        this.f33106B = (VProgressBar) view.findViewById(u4c0.f174020Re);
        this.f33107C = (ImageView) view.findViewById(u4c0.f174216dd);
        ImageView imageView = (ImageView) view.findViewById(u4c0.f173980P8);
        this.f33109E = imageView;
        imageView.setImageResource(x2c0.f189631P6);
    }

    /* JADX INFO: renamed from: n0 */
    public Act m50912n0() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: n1 */
    public final void m50913n1(boolean z) {
        if (z || this.f33113G == 0 || !NullChecker.m81303a(this.f33115I) || !TEnum.equals(this.f33115I.status, "normal")) {
            xdl0.m208345M0(this.f33140z, false);
            return;
        }
        int iM50800v = m50800v();
        ImageView imageView = this.f33140z;
        if (iM50800v == 0) {
            imageView.setImageResource(x2c0.f189662Q6);
            xdl0.m208345M0(this.f33140z, true);
        } else {
            imageView.setImageResource(x2c0.f189569N6);
            xdl0.m208345M0(this.f33140z, true);
        }
    }

    /* JADX INFO: renamed from: o1 */
    public void m50914o1(String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        VText vText = this.f33135u;
        if (zIsEmpty) {
            xdl0.m208345M0(vText, false);
            return;
        }
        xdl0.m208345M0(vText, true);
        this.f33135u.setText(m50912n0().getString(R$string.f18290Y3, str));
        m50857c1();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.VReorderCard, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m50911m0(this);
        this.f33132r.setBackgroundResource(x2c0.f189802Um);
        setClipToPadding(false);
        setClipChildren(false);
        MediaReorderCardScaleIndependentFrame mediaReorderCardScaleIndependentFrame = this.f33132r;
        int i = t100.f167259h;
        xdl0.m208359W(mediaReorderCardScaleIndependentFrame, i);
        xdl0.m208357U(this.f33132r, i);
        this.f33133s.getHierarchy().m112053H(RoundingParams.m8248b(i, i, i, i));
        xdl0.m208394p0(this.f33105A);
        this.f33105A = this.f33106B;
        xdl0.m208344M(findViewById(u4c0.f173983Pb), false);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    /* JADX INFO: renamed from: p0 */
    public void m50915p0() {
        final Drawable background = this.f33132r.getBackground();
        ExpFakeCardBgView expFakeCardBgView = this.f33131p0;
        if (expFakeCardBgView == null || this.f33115I != null) {
            this.f33127U = true;
            return;
        }
        final Drawable drawableMutate = expFakeCardBgView.f33155a.getBackground().mutate();
        this.f33131p0.f33155a.setBackground(drawableMutate);
        ObjectAnimator duration = ObjectAnimator.ofObject(this.f33131p0.f33156b, "textColor", new ArgbEvaluator(), Integer.valueOf(Color.parseColor("#e2e2e2")), Integer.valueOf(Color.parseColor("#FF7602"))).setDuration(800L);
        this.f33112F0 = duration;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.hbf
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f106926a.m50879A0(background, drawableMutate, valueAnimator);
            }
        });
        this.f33112F0.setRepeatMode(2);
        this.f33112F0.setRepeatCount(4);
        this.f33112F0.setInterpolator(null);
        bt0.m103733f(this.f33112F0, new Runnable() { // from class: l.ibf
            @Override // java.lang.Runnable
            public final void run() {
                this.f112361a.m50909h1();
            }
        });
        this.f33112F0.start();
    }

    /* JADX INFO: renamed from: q1 */
    public void m50916q1() {
        TrackMediaUploadUtil.m80296a0(this.f33115I);
        boolean zStartsWith = this.f33115I.url.startsWith("http");
        Media media = this.f33115I;
        C22306c c22306cCompose = (zStartsWith ? C22306c.just(media.mo223809clone()).map(new w9j() { // from class: l.jbf
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ExpEditProfileImageCard.m50863h0((Media) obj);
            }
        }) : m50875r0(media).flatMap(new w9j() { // from class: l.kbf
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f122233a.m50898T0((roj0) obj);
            }
        }).map(new w9j() { // from class: l.lbf
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ExpEditProfileImageCard.m50846T((List) obj);
            }
        })).flatMap(new w9j() { // from class: l.mbf
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f133016a.m50899U0((Picture) obj);
            }
        }).compose(TrackMediaUploadUtil.m80306f0("profile", vwb.m200324f0(this.f33115I), null));
        m50910l1(this.f33105A);
        setIllegalPicture(false);
        this.f33134t.animate().alpha(1.0f).start();
        this.f33116J = m50912n0().duringCreated(c22306cCompose.compose(mkd0.m154951C()).switchMap(new w9j() { // from class: l.nbf
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f138029a.m50900V0((Media) obj);
            }
        })).subscribe(mkd0.m154956H(new e30() { // from class: l.faf
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f96595a.m50901W0((roj0) obj);
            }
        }, new e30() { // from class: l.gaf
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f101666a.m50902X0((Throwable) obj);
            }
        }));
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.VReorderCard
    /* JADX INFO: renamed from: r */
    public void mo50700r(Media media, Runnable runnable) {
        this.f33129W = runnable;
        m50905b1(media);
    }

    public void setChangeAction(g30<Media, Boolean, Boolean> g30Var) {
        this.f33117K = g30Var;
    }

    public void setEnableLowPhoto(boolean z) {
        this.f33120N = z;
    }

    public void setFrom(String str) {
        this.f33114H = str;
    }

    public void setIllegalPicture(boolean z) {
        this.f33111F = z;
        this.f33136v.setVisibility(z ? 0 : 4);
    }

    public void setStyle(int i) {
        this.f33113G = i;
    }

    public void setUploadDataCallback(ijf ijfVar) {
        this.f33108D = ijfVar;
    }

    /* JADX INFO: renamed from: t0 */
    public void m50917t0(ArrayList<CharSequence> arrayList, int i) {
        c40.C16057b c16057b = new c40.C16057b(getContext());
        c16057b.m105156I(m50912n0().getString(R$string.f18408c)).m105168U(new View.OnClickListener() { // from class: l.maf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f132847a.m50883E0(view);
            }
        }).m105164Q(arrayList).m105165R(new int[]{i}, new int[]{w0c0.f183782L}).m105169V(new c40.InterfaceC16059d() { // from class: l.naf
            @Override // p149l.c40.InterfaceC16059d
            /* JADX INFO: renamed from: a */
            public final void mo41896a(VListCell vListCell, VListCell.C22545a c22545a, int i2) {
                this.f137895a.m50884F0(vListCell, c22545a, i2);
            }
        });
        c40 c40VarM105153F = c16057b.m105153F();
        this.f33047d = c40VarM105153F;
        c40VarM105153F.m105117f();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.VReorderCard
    /* JADX INFO: renamed from: u */
    public void mo50704u() {
        if (SystemClock.uptimeMillis() - this.f33128V < 500) {
            return;
        }
        this.f33128V = SystemClock.uptimeMillis();
        if (xdl0.m208349O0(this)) {
            if (this.f33115I != null || !lqa.m150985w()) {
                m50903Z0();
                return;
            }
            if (lqa.m150973k()) {
                CoreModule.m29935P().m94651a().mo33351Kc(m50912n0(), this.f33110E0, new d30() { // from class: l.paf
                    @Override // p149l.d30
                    public final void call() {
                        this.f147974a.m50876s0();
                    }
                });
                return;
            }
            if (!this.f33120N) {
                m50876s0();
            } else if (m50852Y0()) {
                m50865i1();
            } else {
                m50876s0();
            }
        }
    }

    /* JADX INFO: renamed from: u0 */
    public void m50918u0(String str) {
        String str2 = ogw.m164284e(str) + ".jpg";
        File fileM21054G1 = CropperAct.m21054G1(getContext());
        if (!fileM21054G1.exists()) {
            fileM21054G1.mkdir();
        }
        File file = new File(fileM21054G1, str2);
        if (file.exists()) {
            getMediaOperation().mo43239f2(m50800v(), file.getAbsolutePath());
        } else {
            m50912n0().progress((String) null);
            C13111a.m79654u().m79665o(new DownloadTask.C13110b(qib0.f154693H.getDownloadHttp()).m79642q(str).m79640o(file.getAbsolutePath()).m79635j(new f30() { // from class: l.fbf
                @Override // p149l.f30
                public final void call(Object obj, Object obj2) {
                    this.f96709a.m50885G0((DownloadTask) obj, (File) obj2);
                }
            }).m79631f(new f30() { // from class: l.gbf
                @Override // p149l.f30
                public final void call(Object obj, Object obj2) {
                    this.f101843a.m50886H0((DownloadTask) obj, (Throwable) obj2);
                }
            }).m79626a());
        }
    }

    /* JADX INFO: renamed from: x0 */
    public void m50919x0(int i) {
        if (ura.m195053e().m195057d().mo33684F7()) {
            this.f33110E0 = i;
            m50909h1();
        }
    }

    /* JADX INFO: renamed from: y0 */
    public boolean m50920y0() {
        return this.f33119M.size() > 0;
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m50921z0() {
        m50906d1(this.f33115I);
        if (NullChecker.m81303a(this.f33046c.f87435f.f33075h)) {
            this.f33046c.f87435f.f33075h.mo51215a();
        }
    }

    public ExpEditProfileImageCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f33111F = false;
        this.f33113G = 0;
        this.f33118L = new ArrayList(1);
        this.f33119M = new ArrayList();
        this.f33110E0 = -1;
    }

    public ExpEditProfileImageCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f33111F = false;
        this.f33113G = 0;
        this.f33118L = new ArrayList(1);
        this.f33119M = new ArrayList();
        this.f33110E0 = -1;
    }
}
