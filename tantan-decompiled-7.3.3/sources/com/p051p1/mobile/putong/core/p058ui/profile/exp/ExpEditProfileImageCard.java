package com.p051p1.mobile.putong.core.p058ui.profile.exp;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.android.p053ui.cropiwa.CropperAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.NewTags;
import com.p051p1.mobile.putong.core.data.PhotoLowConfig;
import com.p051p1.mobile.putong.core.data.PhotoLowModelData;
import com.p051p1.mobile.putong.core.newui.profile.TagChooseMkAct;
import com.p051p1.mobile.putong.core.p058ui.profile.MediaReorderCardScaleIndependentFrame;
import com.p051p1.mobile.putong.core.p058ui.profile.ProfileMediaAct;
import com.p051p1.mobile.putong.core.p058ui.profile.VReorderCard;
import com.p051p1.mobile.putong.core.p058ui.profile.exp.ExpEditProfileImageCard;
import com.p051p1.mobile.putong.data.Dimension;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.MediaLabel;
import com.p051p1.mobile.putong.data.MediaLocalStatus;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.UploadSource;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p070ui.download.C13274a;
import com.p051p1.mobile.putong.p070ui.download.DownloadTask;
import com.p051p1.mobile.putong.safety.IllegalPictureException;
import com.p051p1.mobile.putong.util.TrackMediaUploadUtil;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import p137rx.C22421c;
import p137rx.schedulers.Schedulers;
import p151v.VDraweeView;
import p151v.VFrame_Anim;
import p151v.VListCell;
import p151v.VProgressBar;
import p151v.VText;
import p153l.a30;
import p153l.adc0;
import p153l.aw90;
import p153l.bkj0;
import p153l.bnl0;
import p153l.bsj0;
import p153l.c9c0;
import p153l.dbc0;
import p153l.dox;
import p153l.fo0;
import p153l.gt0;
import p153l.gta;
import p153l.i4g0;
import p153l.jgw;
import p153l.jl80;
import p153l.jyb;
import p153l.kcg0;
import p153l.l4g0;
import p153l.niw;
import p153l.o1j0;
import p153l.okf;
import p153l.oki;
import p153l.pf60;
import p153l.psd0;
import p153l.pzi0;
import p153l.qa00;
import p153l.qcj;
import p153l.sfj0;
import p153l.t4m;
import p153l.uqb0;
import p153l.uxj0;
import p153l.w30;
import p153l.x20;
import p153l.xra;
import p153l.xyl;
import p153l.y20;
import p153l.yb5;
import p153l.z20;

/* JADX INFO: loaded from: classes4.dex */
public class ExpEditProfileImageCard extends VReorderCard {

    /* JADX INFO: renamed from: G0 */
    public static String f33951G0 = "RepeatPicture";

    /* JADX INFO: renamed from: H0 */
    public static String f33952H0 = "NetPicture";

    /* JADX INFO: renamed from: A */
    public VProgressBar f33953A;

    /* JADX INFO: renamed from: B */
    public VProgressBar f33954B;

    /* JADX INFO: renamed from: C */
    public ImageView f33955C;

    /* JADX INFO: renamed from: D */
    public okf f33956D;

    /* JADX INFO: renamed from: E */
    public ImageView f33957E;

    /* JADX INFO: renamed from: E0 */
    public int f33958E0;

    /* JADX INFO: renamed from: F */
    public boolean f33959F;

    /* JADX INFO: renamed from: F0 */
    public ObjectAnimator f33960F0;

    /* JADX INFO: renamed from: G */
    public int f33961G;

    /* JADX INFO: renamed from: H */
    public String f33962H;

    /* JADX INFO: renamed from: I */
    public Media f33963I;

    /* JADX INFO: renamed from: J */
    public kcg0 f33964J;

    /* JADX INFO: renamed from: K */
    public a30<Media, Boolean, Boolean> f33965K;

    /* JADX INFO: renamed from: L */
    public List<String> f33966L;

    /* JADX INFO: renamed from: M */
    public List<Media> f33967M;

    /* JADX INFO: renamed from: N */
    public boolean f33968N;

    /* JADX INFO: renamed from: O */
    public PhotoLowModelData f33969O;

    /* JADX INFO: renamed from: P */
    public PhotoLowModelData f33970P;

    /* JADX INFO: renamed from: Q */
    public PhotoLowModelData f33971Q;

    /* JADX INFO: renamed from: R */
    public PhotoLowModelData f33972R;

    /* JADX INFO: renamed from: S */
    public l4g0 f33973S;

    /* JADX INFO: renamed from: T */
    public l4g0 f33974T;

    /* JADX INFO: renamed from: U */
    public boolean f33975U;

    /* JADX INFO: renamed from: V */
    public long f33976V;

    /* JADX INFO: renamed from: W */
    public Runnable f33977W;

    /* JADX INFO: renamed from: k0 */
    public Media f33978k0;

    /* JADX INFO: renamed from: p0 */
    public ExpFakeCardBgView f33979p0;

    /* JADX INFO: renamed from: r */
    public MediaReorderCardScaleIndependentFrame f33980r;

    /* JADX INFO: renamed from: s */
    public VDraweeView f33981s;

    /* JADX INFO: renamed from: t */
    public View f33982t;

    /* JADX INFO: renamed from: u */
    public VText f33983u;

    /* JADX INFO: renamed from: v */
    public TextView f33984v;

    /* JADX INFO: renamed from: w */
    public LinearLayout f33985w;

    /* JADX INFO: renamed from: x */
    public TextView f33986x;

    /* JADX INFO: renamed from: y */
    public VFrame_Anim f33987y;

    /* JADX INFO: renamed from: z */
    public ImageView f33988z;

    public ExpEditProfileImageCard(Context context) {
        super(context);
        this.f33959F = false;
        this.f33961G = 0;
        this.f33966L = new ArrayList(1);
        this.f33967M = new ArrayList();
        this.f33958E0 = -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O */
    public static /* synthetic */ uxj0 m52024O(bkj0 bkj0Var) {
        if (((Boolean) bkj0Var.f77081a).booleanValue()) {
            throw new IllegalPictureException("检测到敏感信息，上传失败");
        }
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m52027R() {
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ Picture m52029T(List list) {
        return (Picture) list.get(0);
    }

    /* JADX INFO: renamed from: Y0 */
    private boolean m52035Y0() {
        PhotoLowConfig photoLowConfigM212785d = xra.m212785d();
        if (!pzi0.m174439D(CoreModule.f18264c.f20381e0.f89037G4.get().longValue())) {
            CoreModule.f18264c.f20381e0.f89037G4.put(Long.valueOf(pzi0.m174454o()));
            CoreModule.f18264c.f20381e0.f89044H4.put(1);
            return true;
        }
        if (CoreModule.f18264c.f20381e0.f89044H4.get().intValue() >= (photoLowConfigM212785d == null ? 2 : photoLowConfigM212785d.count)) {
            return false;
        }
        CoreModule.f18264c.f20381e0.f89037G4.put(Long.valueOf(pzi0.m174454o()));
        CoreModule.f18264c.f20381e0.f89044H4.m203841a(1);
        return true;
    }

    /* JADX INFO: renamed from: c1 */
    private void m52040c1() {
        if (getWidth() <= 0 || getHeight() <= 0) {
            return;
        }
        measureChildWithMargins(this.f33983u, dox.m117363a(getWidth()), 0, dox.m117363a(getHeight()), 0);
        int height = getHeight() - ((FrameLayout.LayoutParams) this.f33983u.getLayoutParams()).bottomMargin;
        int width = (getWidth() / 2) - (this.f33983u.getMeasuredWidth() / 2);
        int measuredWidth = this.f33983u.getMeasuredWidth() + width;
        this.f33983u.layout(width, height - this.f33983u.getMeasuredHeight(), measuredWidth, height);
    }

    /* JADX INFO: renamed from: g1 */
    private void m52045g1() {
        if (!NullChecker.m82486a(this.f33963I) || TextUtils.isEmpty(this.f33963I.url) || this.f33959F) {
            bnl0.m105525M0(this.f33986x, false);
        } else {
            bnl0.m105525M0(this.f33986x, true);
            int iM51983v = m51983v();
            TextView textView = this.f33986x;
            if (iM51983v == 0) {
                textView.setBackgroundResource(dbc0.f86909d1);
                this.f33986x.setText("首图");
                this.f33986x.setTextColor(Color.parseColor("#ffffff"));
            } else {
                textView.setBackgroundResource(dbc0.f86941e1);
                bnl0.m105509E0(this.f33986x, new View.OnClickListener() { // from class: l.rbf
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f162019a.m52073L0(view);
                    }
                });
                NewTags newTagsMo34694Gh = !jyb.m147479J(this.f33963I.tags) ? gta.m132210e().m132214d().mo34694Gh(this.f33963I.tags.get(0)) : null;
                if (newTagsMo34694Gh == null || TextUtils.isEmpty(newTagsMo34694Gh.name)) {
                    this.f33986x.setTextColor(getResources().getColor(c9c0.f80318A));
                    this.f33986x.setText("添加标签");
                } else {
                    this.f33986x.setTextColor(Color.parseColor(Constants.BLACK));
                    this.f33986x.setText(newTagsMo34694Gh.name);
                }
            }
            this.f33986x.getPaint().setFakeBoldText(true);
        }
        requestLayout();
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ Picture m52046h0(Media media) {
        return (Picture) media;
    }

    /* JADX INFO: renamed from: i1 */
    private void m52048i1() {
        new jgw(m52095n0(), new Runnable() { // from class: l.nbf
            @Override // java.lang.Runnable
            public final void run() {
                ExpEditProfileImageCard.m52027R();
            }
        }, new Runnable() { // from class: l.obf
            @Override // java.lang.Runnable
            public final void run() {
                this.f146581a.m52059s0();
            }
        }).show();
    }

    /* JADX INFO: renamed from: j1 */
    private void m52050j1() {
        if (!NullChecker.m82486a(this.f33969O) || TextUtils.isEmpty(this.f33969O.conclusion)) {
            return;
        }
        if (this.f33973S == null) {
            this.f33973S = new l4g0("p_lowqualityphoto__popup", Dialog.class.getName());
        }
        new jl80.C17971a(m52095n0()).m146056y0("温馨提示").m146051t0(this.f33969O.conclusion).m146034c0("更换照片", new Runnable() { // from class: l.bcf
            @Override // java.lang.Runnable
            public final void run() {
                this.f76139a.m52074M0();
            }
        }).m146029X("稍后再说", new Runnable() { // from class: l.ccf
            @Override // java.lang.Runnable
            public final void run() {
                this.f80957a.m52075N0();
            }
        }).m146046o0(new DialogInterface.OnShowListener() { // from class: l.dcf
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f87782a.m52076O0(dialogInterface);
            }
        }).m146045n0(new DialogInterface.OnDismissListener() { // from class: l.ecf
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f93055a.m52077P0(dialogInterface);
            }
        }).m146049r0();
    }

    /* JADX INFO: renamed from: k1 */
    private void m52052k1(String str) {
        String str2;
        final String str3;
        if (this.f33974T == null) {
            this.f33974T = new l4g0("p_lowqualityphoto__popup", Dialog.class.getName());
        }
        if (TextUtils.equals(str, f33951G0) && NullChecker.m82486a(this.f33970P)) {
            PhotoLowModelData photoLowModelData = this.f33970P;
            str2 = photoLowModelData.conclusion;
            str3 = photoLowModelData.mapping;
        } else if (TextUtils.equals(str, f33952H0) && NullChecker.m82486a(this.f33971Q)) {
            PhotoLowModelData photoLowModelData2 = this.f33971Q;
            str2 = photoLowModelData2.conclusion;
            str3 = photoLowModelData2.mapping;
        } else {
            str2 = "";
            str3 = "";
        }
        this.f33974T.m152781p(pf60.m172085a("lowquality_reason", str3));
        new jl80.C17971a(m52095n0()).m146056y0("温馨提示").m146051t0(str2).m146034c0("更换照片", new Runnable() { // from class: l.hcf
            @Override // java.lang.Runnable
            public final void run() {
                this.f108690a.m52078Q0(str3);
            }
        }).m146029X("稍后再说", new Runnable() { // from class: l.icf
            @Override // java.lang.Runnable
            public final void run() {
                i4g0.m138523u("e_replace_photo_cancel", "p_lowqualityphoto__popup", pf60.m172085a("lowquality_reason", str3));
            }
        }).m146046o0(new DialogInterface.OnShowListener() { // from class: l.jcf
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f120046a.m52079R0(dialogInterface);
            }
        }).m146045n0(new DialogInterface.OnDismissListener() { // from class: l.kcf
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f125060a.m52080S0(dialogInterface);
            }
        }).m146049r0();
    }

    /* JADX INFO: renamed from: m1 */
    private void m52054m1(String str) {
        this.f33966L.add(str);
    }

    /* JADX INFO: renamed from: o0 */
    private void m52055o0() {
        if (this.f33906o && TEnum.equals(this.f33963I.status, "normal")) {
            if (NullChecker.m82486a(m51972h().f33925j)) {
                m51972h().f33925j.run();
            }
            TagChooseMkAct.m44233w2(m52095n0(), jyb.m147482M(this.f33963I), null, new Runnable() { // from class: l.fcf
                @Override // java.lang.Runnable
                public final void run() {
                    this.f98214a.m52104z0();
                }
            }, null);
        }
    }

    /* JADX INFO: renamed from: p1 */
    private void m52056p1() {
        if (NullChecker.m82486a(this.f33964J)) {
            m52093l1(null);
            bsj0.m106263U(this.f33964J);
            this.f33982t.setAlpha(0.0f);
            this.f33964J = null;
        }
    }

    /* JADX INFO: renamed from: q0 */
    private C22421c<Picture> m52057q0(final Picture picture) {
        return C22421c.just(picture).observeOn(fo0.m126432a()).map(new qcj() { // from class: l.wbf
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return CoreModule.f18264c.f20381e0.m116589ma();
            }
        }).observeOn(Schedulers.m222739io()).flatMap(new qcj() { // from class: l.xbf
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f193157a.m52064C0(picture, (User) obj);
            }
        });
    }

    /* JADX INFO: renamed from: r0 */
    private C22421c<uxj0> m52058r0(Media media) {
        return (uqb0.f180386R.m184740c() && (media instanceof Picture)) ? uqb0.f180386R.m184739b(Uri.parse(media.url).getPath()).map(new qcj() { // from class: l.ubf
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ExpEditProfileImageCard.m52024O((bkj0) obj);
            }
        }) : C22421c.just(uxj0.f181467a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public void m52059s0() {
        aw90.m100562F().m100624n0((Act) getContext(), new z20() { // from class: l.ybf
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                this.f198304a.m52065D0((String) obj, (Media) obj2);
            }
        }, m51983v() != 0);
    }

    /* JADX INFO: renamed from: v0 */
    private void m52060v0(final Media media) throws Throwable {
        if (m52095n0() == null || m52095n0().isFinishing() || m52095n0().isDestroyed()) {
            return;
        }
        if (xra.m212790i() && NullChecker.m82486a(this.f33963I) && (media instanceof Picture) && TEnum.equals(this.f33963I.status, MediaLocalStatus.preprocessed)) {
            Picture picture = (Picture) media;
            String strM163314d = niw.m163314d(new File(oki.m168038z(this.f33963I.url)));
            Dimension dimension = picture.size;
            int i = dimension.width;
            int i2 = dimension.height;
            sfj0.m185606m("e_hyper_profile_pic_double_check", "p_edit_profile_view", sfj0.C20032a.m185615h("pic_trace_id", strM163314d), sfj0.C20032a.m185615h("pic_trace_type", "trimmed"), sfj0.C20032a.m185615h("pic_trace_url", media.url), sfj0.C20032a.m185615h("pic_trace_resolution", picture.size.width + BaseSei.f14624X + picture.size.height));
            CoreModule.f18264c.f20381e0.f89041H1.onNext(this.f33963I.url);
        }
        if (NullChecker.m82486a(this.f33963I) && NullChecker.m82486a(media)) {
            Media media2 = this.f33963I;
            media2.status = media.status;
            media.tags = media2.tags;
        }
        boolean z = false;
        if (m51983v() == 0 && (media instanceof Picture)) {
            Picture picture2 = (Picture) media;
            boolean zIsLabelJudge = picture2.isLabelJudge(MediaLabel.get(MediaLabel.WITH_REPEAT_MAIN_PICTURE));
            boolean z2 = this.f33968N && picture2.isLow();
            boolean zIsLabelJudge2 = picture2.isLabelJudge(MediaLabel.get(MediaLabel.WITH_NET_MAIN_PICTURE));
            picture2.isLabelJudge(MediaLabel.get(MediaLabel.NOT_VERIFICATION));
            if (gta.m132210e().m132214d().mo34801ak()) {
                m52090e1(media, true, false);
                if (zIsLabelJudge) {
                    m52052k1(f33951G0);
                } else if (z2) {
                    m52050j1();
                } else if (zIsLabelJudge2) {
                    m52052k1(f33952H0);
                }
            } else if (gta.m132210e().m132214d().mo34690Fl()) {
                m52090e1(media, true, false);
                if (zIsLabelJudge) {
                    m52052k1(f33951G0);
                } else if (z2) {
                    m52050j1();
                }
            } else if (xra.m212804w() && z2 && NullChecker.m82486a(this.f33978k0)) {
                m52093l1(null);
                m52090e1(this.f33978k0, true, false);
                m52050j1();
            } else {
                m52090e1(media, true, false);
                if (z2) {
                    m52050j1();
                }
            }
            if (TEnum.equals(media.status, "normal") || !z) {
            }
            this.f33967M.add(media);
            this.f33964J = null;
            this.f33955C.setImageResource(dbc0.f86882c7);
            m52093l1(this.f33955C);
            postDelayed(new Runnable() { // from class: l.zbf
                @Override // java.lang.Runnable
                public final void run() {
                    this.f203664a.m52070I0(media);
                }
            }, 1000L);
            if (NullChecker.m82486a(this.f33894c.f123275f.f33924i)) {
                this.f33894c.f123275f.f33924i.mo52004a(m51983v(), true);
            }
            CoreModule.f18264c.f20381e0.f89034G1.onNext(uxj0.f181467a);
            return;
        }
        m52090e1(media, true, false);
        z = true;
        if (TEnum.equals(media.status, "normal")) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
    public void m52085X0(Throwable th) {
        setVisibility(0);
        this.f33964J = null;
        bnl0.m105525M0(this.f33988z, false);
        this.f33955C.setImageResource(dbc0.f86849b7);
        m52093l1(this.f33955C);
        m52096n1(true);
        if (NullChecker.m82486a(this.f33894c.f123275f.f33924i)) {
            this.f33894c.f123275f.f33924i.mo52004a(m51983v(), false);
        }
        if (m51983v() == 0 && (this.f33963I instanceof Picture) && NullChecker.m82486a(this.f33978k0)) {
            m52093l1(null);
            m52090e1(this.f33978k0, true, false);
        }
        if (th instanceof IllegalPictureException) {
            o1j0.m165651y(th.getMessage());
        }
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m52062A0(Drawable drawable, Drawable drawable2, ValueAnimator valueAnimator) {
        if (bnl0.m105529O0(this.f33979p0.f34005c)) {
            this.f33979p0.f34005c.setTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(((Integer) valueAnimator.getAnimatedValue()).intValue(), PorterDuff.Mode.SRC_ATOP);
        drawable.setColorFilter(porterDuffColorFilter);
        drawable2.setColorFilter(porterDuffColorFilter);
    }

    /* JADX INFO: renamed from: B0 */
    public final /* synthetic */ Picture m52063B0(Picture picture, Envelope envelope) {
        if (envelope.meta.code == 200) {
            CoreData coreData = (CoreData) envelope.data.getModuleData(CoreData.class);
            if (NullChecker.m82486a(coreData)) {
                this.f33969O = coreData.lowPhotoResult;
                this.f33970P = coreData.repeatPictureResult;
                this.f33971Q = coreData.netPictureResult;
                this.f33972R = coreData.notVerificationResultData;
                if (gta.m132210e().m132214d().mo34801ak()) {
                    if (NullChecker.m82486a(this.f33970P) && TextUtils.equals(this.f33970P.audit, "repeat")) {
                        picture.setLabel(MediaLabel.get(MediaLabel.WITH_REPEAT_MAIN_PICTURE));
                    } else {
                        picture.removeLabel(MediaLabel.get(MediaLabel.WITH_REPEAT_MAIN_PICTURE));
                    }
                    if (NullChecker.m82486a(this.f33971Q) && TextUtils.equals(this.f33971Q.audit, "net")) {
                        picture.setLabel(MediaLabel.get(MediaLabel.WITH_NET_MAIN_PICTURE));
                    } else {
                        picture.removeLabel(MediaLabel.get(MediaLabel.WITH_NET_MAIN_PICTURE));
                    }
                }
                if (gta.m132210e().m132214d().mo34690Fl()) {
                    if (NullChecker.m82486a(this.f33970P) && TextUtils.equals(this.f33970P.audit, "repeat")) {
                        picture.setLabel(MediaLabel.get(MediaLabel.WITH_REPEAT_MAIN_PICTURE));
                    } else {
                        picture.removeLabel(MediaLabel.get(MediaLabel.WITH_REPEAT_MAIN_PICTURE));
                    }
                }
                if (this.f33968N && NullChecker.m82486a(this.f33969O) && TextUtils.equals(this.f33969O.audit, "low")) {
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
    public final /* synthetic */ C22421c m52064C0(final Picture picture, User user) {
        return CoreModule.f18264c.f20381e0.m116466G9(picture.url, this.f33958E0 == 0 ? 1 : 2, null).map(new qcj() { // from class: l.acf
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f69700a.m52063B0(picture, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m52065D0(String str, Media media) {
        okf okfVar = this.f33956D;
        if (okfVar != null) {
            okfVar.mo109169a(m51983v(), str, media);
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m52066E0(View view) {
        this.f33895d.m204614b();
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m52067F0(VListCell vListCell, VListCell.C22660a c22660a, int i) {
        this.f33895d.m204614b();
        if (TextUtils.equals(c22660a.f210081a, "更换头像")) {
            m52059s0();
            return;
        }
        if (TextUtils.equals(c22660a.f210081a, m52095n0().string(R$string.f18856Sj)) || TextUtils.equals(c22660a.f210081a, "重新裁剪照片")) {
            if (!TextUtils.equals(getCurPageId(), "p_upload_photos")) {
                sfj0.m185596c("e_picture_re_edit_button", "p_edit_profile_view", new sfj0.C20032a[0]);
            }
            if (NullChecker.m82486a(this.f33963I)) {
                this.f33967M.remove(this.f33963I);
                m52101u0(this.f33963I.url);
                CoreModule.f18264c.f20381e0.f89034G1.onNext(uxj0.f181467a);
                return;
            }
            StringBuilder sb = new StringBuilder("MediaReorderCard error: ");
            for (int i2 = 0; i2 < this.f33966L.size(); i2++) {
                if (i2 > 0) {
                    sb.append(", ");
                }
                sb.append(this.f33966L.get(i2));
            }
            CrashHelper.m82479c(new NullPointerException(sb.toString()));
            return;
        }
        if (TextUtils.equals(c22660a.f210081a, m52095n0().string(R$string.f19662t))) {
            m52099q1();
            return;
        }
        if (!TextUtils.equals(c22660a.f210081a, m52095n0().string(R$string.f19352j)) && !TextUtils.equals(c22660a.f210081a, "删除该照片") && !TextUtils.equals(c22660a.f210081a, "删除该视频")) {
            if (TextUtils.equals(c22660a.f210081a, "编辑标签")) {
                m52055o0();
                return;
            }
            return;
        }
        if (!TextUtils.equals(getCurPageId(), "p_upload_photos")) {
            sfj0.m185596c("e_profile_add_delete_photos", "p_edit_profile_view", sfj0.C20032a.m185615h("add_delete_picture", "delete_picture"), sfj0.C20032a.m185613f("picture_number", m51983v() + 1));
        }
        this.f33967M.remove(this.f33963I);
        this.f33963I = null;
        m52054m1(RequestParameters.SUBRESOURCE_DELETE);
        m52056p1();
        m51975l();
        setIllegalPicture(false);
        m52090e1(null, true, false);
        m52092h1();
        t4m t4mVar = this.f33894c.f123275f.f33923h;
        if (t4mVar != null) {
            t4mVar.mo48722b();
        }
        CoreModule.f18264c.f20381e0.f89034G1.onNext(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m52068G0(DownloadTask downloadTask, File file) {
        m52095n0().progressDismiss();
        getMediaOperation().mo44250f2(m51983v(), file.getAbsolutePath());
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m52069H0(DownloadTask downloadTask, Throwable th) {
        m52095n0().progressDismiss();
        o1j0.m165649w(R$string.f19698u4);
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m52070I0(Media media) {
        if (this.f33963I == media) {
            m52093l1(null);
            this.f33982t.animate().alpha(0.0f).start();
        }
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m52071J0(Picture picture, int[] iArr) {
        m52088b1(picture);
    }

    /* JADX INFO: renamed from: K0 */
    public final /* synthetic */ void m52072K0(int[] iArr) {
        if (NullChecker.m82486a(this.f33963I) && NullChecker.m82486a(this.f33963I.cover()) && NullChecker.m82486a(this.f33963I.cover().url)) {
            uqb0.f180374G.m127111J0(this.f33981s, this.f33963I.cover().profile480(), false);
        }
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m52073L0(View view) {
        m52055o0();
    }

    /* JADX INFO: renamed from: M0 */
    public final /* synthetic */ void m52074M0() {
        m52059s0();
        i4g0.m138523u("e_replace_photo", "p_lowqualityphoto__popup", pf60.m172085a("lowquality_reason", this.f33969O.mapping));
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m52075N0() {
        i4g0.m138523u("e_replace_photo_cancel", "p_lowqualityphoto__popup", pf60.m172085a("lowquality_reason", this.f33969O.mapping));
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m52076O0(DialogInterface dialogInterface) {
        this.f33973S.m152774i();
        this.f33973S.m152777l();
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m52077P0(DialogInterface dialogInterface) {
        this.f33973S.m152776k();
        this.f33973S.m152775j();
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m52078Q0(String str) {
        m52059s0();
        i4g0.m138523u("e_replace_photo", "p_lowqualityphoto__popup", pf60.m172085a("lowquality_reason", str));
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ void m52079R0(DialogInterface dialogInterface) {
        this.f33974T.m152774i();
        this.f33974T.m152777l();
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m52080S0(DialogInterface dialogInterface) {
        this.f33974T.m152776k();
        this.f33974T.m152775j();
    }

    /* JADX INFO: renamed from: T0 */
    public final /* synthetic */ C22421c m52081T0(uxj0 uxj0Var) {
        return yb5.m214982K(jyb.m147507f0(this.f33963I), "profile", "user-profile", UploadSource.get("profile"));
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ C22421c m52082U0(Picture picture) {
        CoreProviderInterface coreProviderInterfaceM132214d = gta.m132210e().m132214d();
        return ((coreProviderInterfaceM132214d.mo34801ak() || coreProviderInterfaceM132214d.mo34690Fl() || this.f33968N) && NullChecker.m82486a(picture) && TEnum.equals(picture.status, "normal")) ? m52057q0(picture) : C22421c.just(picture);
    }

    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ C22421c m52083V0(Media media) throws Throwable {
        m52060v0(media);
        if (NullChecker.m82486a(this.f33977W)) {
            this.f33977W.run();
        }
        return C22421c.just(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: W0 */
    public final /* synthetic */ void m52084W0(uxj0 uxj0Var) {
        setVisibility(0);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00ae  */
    /* JADX INFO: renamed from: Z0 */
    public void m52086Z0() {
        int size;
        ArrayList<CharSequence> arrayList = new ArrayList<>();
        if (NullChecker.m82486a(this.f33963I) && TEnum.equals(this.f33963I.status, "normal") && this.f33958E0 > 0) {
            arrayList.add("编辑标签");
        }
        if (NullChecker.m82486a(this.f33963I) && TEnum.equals(this.f33963I.status, "normal")) {
            if (this.f33963I instanceof Picture) {
                arrayList.add("重新裁剪照片");
            }
            if (this.f33958E0 == 0) {
                arrayList.add("更换头像");
            }
            if (this.f33963I instanceof Picture) {
                this.f33966L.clear();
                this.f33966L.add("show action dialog");
            }
        }
        if (NullChecker.m82486a(this.f33963I) && !TEnum.equals(this.f33963I.status, "normal") && this.f33964J == null) {
            arrayList.add(m52095n0().getString(R$string.f19662t));
        }
        if (m51973i() <= 1 || !NullChecker.m82486a(this.f33963I) || this.f33958E0 <= 0) {
            size = -1;
        } else {
            Media media = this.f33963I;
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
        if (this.f33968N && NullChecker.m82486a(this.f33963I)) {
            Media media2 = this.f33963I;
            if ((media2 instanceof Picture) && ((Picture) media2).isLow() && m51983v() != 0) {
                arrayList.clear();
                arrayList.add(m52095n0().getString(R$string.f19662t));
                size = arrayList.size();
                arrayList.add(m52095n0().getString(R$string.f19352j));
            }
        }
        if (!this.f33906o) {
            arrayList.clear();
            if (!TEnum.equals(this.f33963I.status, "normal")) {
                arrayList.add(m52095n0().getString(R$string.f19662t));
            }
        }
        if (arrayList.size() == 0) {
            return;
        }
        m52100t0(arrayList, size);
    }

    /* JADX INFO: renamed from: a1 */
    public void m52087a1(final Picture picture) {
        bnl0.m105533Q0(this, new y20() { // from class: l.gcf
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f103563a.m52071J0(picture, (int[]) obj);
            }
        });
    }

    /* JADX INFO: renamed from: b1 */
    public void m52088b1(Media media) {
        if (NullChecker.m82486a(this.f33963I)) {
            media.tags = this.f33963I.tags;
        }
        if (NullChecker.m82486a(this.f33963I)) {
            this.f33978k0 = this.f33963I.mo225055clone();
        }
        this.f33963I = media;
        m52054m1("onPickMedia");
        m52099q1();
        m52091f1();
        m51970f();
        m52092h1();
    }

    /* JADX INFO: renamed from: d1 */
    public void m52089d1(Media media) {
        m52090e1(media, false, true);
    }

    /* JADX INFO: renamed from: e1 */
    public void m52090e1(Media media, boolean z, boolean z2) {
        if (NullChecker.m82486a(media) && NullChecker.m82486a(this.f33963I)) {
            media.tags = this.f33963I.tags;
        }
        this.f33963I = media;
        m52054m1("render");
        m52091f1();
        if (NullChecker.m82486a(this.f33965K)) {
            this.f33965K.mo37058a(media, Boolean.valueOf(z), Boolean.valueOf(z2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:49:0x0124  */
    /* JADX INFO: renamed from: f1 */
    public void m52091f1() {
        boolean z = false;
        boolean z2 = true;
        mo51875k(this.f33963I == null);
        bnl0.m105524M(this.f33957E, this.f33963I instanceof Video);
        if (NullChecker.m82486a(this.f33963I) && NullChecker.m82486a(this.f33963I.cover()) && NullChecker.m82486a(this.f33963I.cover().url)) {
            bnl0.m105533Q0(this.f33981s, new y20() { // from class: l.kbf
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f124938a.m52072K0((int[]) obj);
                }
            });
        } else {
            Media media = this.f33963I;
            if (media instanceof Video) {
                uqb0.f180374G.m127150m0(this.f33981s, media.url);
            } else {
                uqb0.f180374G.m98798o(this.f33981s);
            }
        }
        if (NullChecker.m82486a(this.f33963I) && this.f33964J == null && !TEnum.equals(this.f33963I.status, "normal")) {
            this.f33955C.setImageResource(dbc0.f86849b7);
            m52093l1(this.f33955C);
            z = true;
        }
        if (this.f33963I == null) {
            m52093l1(null);
            this.f33982t.setAlpha(0.0f);
        }
        if ((gta.m132210e().m132214d().mo34801ak() || gta.m132210e().m132214d().mo34690Fl()) && NullChecker.m82486a(this.f33963I)) {
            Media media2 = this.f33963I;
            if ((media2 instanceof Picture) && (((Picture) media2).isLabelJudge(MediaLabel.get(MediaLabel.WITH_REPEAT_MAIN_PICTURE)) || ((Picture) this.f33963I).isLabelJudge(MediaLabel.get(MediaLabel.WITH_NET_MAIN_PICTURE)))) {
                this.f33955C.setImageResource(dbc0.f86849b7);
                m52093l1(this.f33955C);
                this.f33982t.animate().alpha(1.0f).start();
            } else if (this.f33968N || !NullChecker.m82486a(this.f33963I)) {
                this.f33982t.animate().alpha(0.0f).start();
                z2 = z;
            } else {
                Media media3 = this.f33963I;
                if ((media3 instanceof Picture) && ((Picture) media3).isLow()) {
                    this.f33955C.setImageResource(dbc0.f86849b7);
                    m52093l1(this.f33955C);
                    this.f33982t.animate().alpha(1.0f).start();
                } else {
                    this.f33982t.animate().alpha(0.0f).start();
                    z2 = z;
                }
            }
        } else if (this.f33968N) {
            this.f33982t.animate().alpha(0.0f).start();
            z2 = z;
        } else {
            this.f33982t.animate().alpha(0.0f).start();
            z2 = z;
        }
        m52096n1(z2);
        m52045g1();
    }

    public List<Media> getAddPhotos() {
        return this.f33967M;
    }

    public xyl getMediaOperation() {
        if (NullChecker.m82486a(this.f33904m)) {
            return this.f33904m;
        }
        return getContext() instanceof xyl ? (xyl) getContext() : (ProfileMediaAct) getContext();
    }

    /* JADX INFO: renamed from: h1 */
    public void m52092h1() {
        ObjectAnimator objectAnimator;
        if (!gta.m132210e().m132214d().mo34687F7() || this.f33958E0 == -1) {
            return;
        }
        this.f33980r.setBackgroundResource(dbc0.f86623U6);
        if (this.f33979p0 == null) {
            ExpFakeCardBgView expFakeCardBgView = new ExpFakeCardBgView(getContext());
            this.f33979p0 = expFakeCardBgView;
            MediaReorderCardScaleIndependentFrame mediaReorderCardScaleIndependentFrame = this.f33980r;
            int i = bnl0.f77544e;
            mediaReorderCardScaleIndependentFrame.addView(expFakeCardBgView, i, i);
            this.f33979p0.setGravity(17);
        }
        if (xra.m212792k()) {
            int i2 = this.f33958E0;
            if (i2 <= 0 || i2 >= 3 || ((objectAnimator = this.f33960F0) != null && objectAnimator.isRunning())) {
                int i3 = this.f33958E0;
                if (i3 <= 0 || i3 >= 3) {
                    this.f33979p0.f34004b.setTextColor(Color.parseColor("#cccccc"));
                    this.f33979p0.f34005c.setTextColor(Color.parseColor("#cccccc"));
                    if (this.f33979p0.f34003a.getBackground() != null) {
                        this.f33979p0.f34003a.getBackground().clearColorFilter();
                    }
                    this.f33980r.getBackground().clearColorFilter();
                }
            } else {
                this.f33979p0.f34004b.setTextColor(getResources().getColor(c9c0.f80318A));
                this.f33979p0.f34005c.setTextColor(getResources().getColor(c9c0.f80318A));
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(getResources().getColor(c9c0.f80318A), PorterDuff.Mode.SRC_ATOP);
                this.f33980r.getBackground().setColorFilter(porterDuffColorFilter);
                if (this.f33979p0.f34003a.getBackground() != null && !porterDuffColorFilter.equals(this.f33979p0.f34003a.getBackground().getColorFilter())) {
                    Drawable drawableMutate = this.f33979p0.f34003a.getBackground().mutate();
                    drawableMutate.setColorFilter(porterDuffColorFilter);
                    this.f33979p0.f34003a.setImageDrawable(drawableMutate);
                }
            }
        }
        int i4 = this.f33961G;
        this.f33979p0.m52134c(this.f33958E0, (i4 == 2 || i4 == 3) ? false : true, i4 != 3 || this.f33958E0 < 3);
        bnl0.m105525M0(this.f33979p0, this.f33963I == null);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.VReorderCard
    /* JADX INFO: renamed from: k */
    public void mo51875k(boolean z) {
        super.mo51875k(z);
    }

    /* JADX INFO: renamed from: l1 */
    public void m52093l1(View view) {
        this.f33987y.m224271F(view, new qcj() { // from class: l.pbf
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((View) obj).animate().alpha(1.0f).setDuration(200L);
            }
        }, new qcj() { // from class: l.qbf
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((View) obj).animate().alpha(0.0f).setDuration(200L);
            }
        });
    }

    /* JADX INFO: renamed from: m0 */
    public void m52094m0(View view) {
        this.f33980r = (MediaReorderCardScaleIndependentFrame) view.findViewById(adc0.f69826B4);
        this.f33981s = (VDraweeView) view.findViewById(adc0.f70031N5);
        this.f33982t = view.findViewById(adc0.f70202X7);
        this.f33983u = (VText) view.findViewById(adc0.f70125Se);
        this.f33984v = (TextView) view.findViewById(adc0.f69997L5);
        this.f33985w = (LinearLayout) view.findViewById(adc0.f69971Jd);
        this.f33986x = (TextView) view.findViewById(adc0.f69937Hd);
        this.f33988z = (ImageView) view.findViewById(adc0.f69817Ac);
        this.f33987y = (VFrame_Anim) view.findViewById(adc0.f69834Bc);
        this.f33953A = (VProgressBar) view.findViewById(adc0.f70142Te);
        this.f33954B = (VProgressBar) view.findViewById(adc0.f70159Ue);
        this.f33955C = (ImageView) view.findViewById(adc0.f70341fd);
        ImageView imageView = (ImageView) view.findViewById(adc0.f70102R8);
        this.f33957E = imageView;
        imageView.setImageResource(dbc0.f86495Q6);
    }

    /* JADX INFO: renamed from: n0 */
    public Act m52095n0() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: n1 */
    public final void m52096n1(boolean z) {
        if (z || this.f33961G == 0 || !NullChecker.m82486a(this.f33963I) || !TEnum.equals(this.f33963I.status, "normal")) {
            bnl0.m105525M0(this.f33988z, false);
            return;
        }
        int iM51983v = m51983v();
        ImageView imageView = this.f33988z;
        if (iM51983v == 0) {
            imageView.setImageResource(dbc0.f86527R6);
            bnl0.m105525M0(this.f33988z, true);
        } else {
            imageView.setImageResource(dbc0.f86431O6);
            bnl0.m105525M0(this.f33988z, true);
        }
    }

    /* JADX INFO: renamed from: o1 */
    public void m52097o1(String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        VText vText = this.f33983u;
        if (zIsEmpty) {
            bnl0.m105525M0(vText, false);
            return;
        }
        bnl0.m105525M0(vText, true);
        this.f33983u.setText(m52095n0().getString(R$string.f19081a4, str));
        m52040c1();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.VReorderCard, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m52094m0(this);
        this.f33980r.setBackgroundResource(dbc0.f86256In);
        setClipToPadding(false);
        setClipChildren(false);
        MediaReorderCardScaleIndependentFrame mediaReorderCardScaleIndependentFrame = this.f33980r;
        int i = qa00.f156321h;
        bnl0.m105539W(mediaReorderCardScaleIndependentFrame, i);
        bnl0.m105537U(this.f33980r, i);
        this.f33981s.getHierarchy().m207045H(RoundingParams.m8302b(i, i, i, i));
        bnl0.m105574p0(this.f33953A);
        this.f33953A = this.f33954B;
        bnl0.m105524M(findViewById(adc0.f70105Rb), false);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    /* JADX INFO: renamed from: p0 */
    public void m52098p0() {
        final Drawable background = this.f33980r.getBackground();
        ExpFakeCardBgView expFakeCardBgView = this.f33979p0;
        if (expFakeCardBgView == null || this.f33963I != null) {
            this.f33975U = true;
            return;
        }
        final Drawable drawableMutate = expFakeCardBgView.f34003a.getBackground().mutate();
        this.f33979p0.f34003a.setBackground(drawableMutate);
        ObjectAnimator duration = ObjectAnimator.ofObject(this.f33979p0.f34004b, "textColor", new ArgbEvaluator(), Integer.valueOf(Color.parseColor("#e2e2e2")), Integer.valueOf(Color.parseColor("#FF7602"))).setDuration(800L);
        this.f33960F0 = duration;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ncf
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f141347a.m52062A0(background, drawableMutate, valueAnimator);
            }
        });
        this.f33960F0.setRepeatMode(2);
        this.f33960F0.setRepeatCount(4);
        this.f33960F0.setInterpolator(null);
        gt0.m132160f(this.f33960F0, new Runnable() { // from class: l.ocf
            @Override // java.lang.Runnable
            public final void run() {
                this.f146698a.m52092h1();
            }
        });
        this.f33960F0.start();
    }

    /* JADX INFO: renamed from: q1 */
    public void m52099q1() {
        TrackMediaUploadUtil.m81479a0(this.f33963I);
        boolean zStartsWith = this.f33963I.url.startsWith("http");
        Media media = this.f33963I;
        C22421c c22421cCompose = (zStartsWith ? C22421c.just(media.mo225055clone()).map(new qcj() { // from class: l.pcf
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ExpEditProfileImageCard.m52046h0((Media) obj);
            }
        }) : m52058r0(media).flatMap(new qcj() { // from class: l.qcf
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f156596a.m52081T0((uxj0) obj);
            }
        }).map(new qcj() { // from class: l.rcf
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ExpEditProfileImageCard.m52029T((List) obj);
            }
        })).flatMap(new qcj() { // from class: l.scf
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f167250a.m52082U0((Picture) obj);
            }
        }).compose(TrackMediaUploadUtil.m81489f0("profile", jyb.m147507f0(this.f33963I), null));
        m52093l1(this.f33953A);
        setIllegalPicture(false);
        this.f33982t.animate().alpha(1.0f).start();
        this.f33964J = m52095n0().duringCreated(c22421cCompose.compose(psd0.m173592C()).switchMap(new qcj() { // from class: l.tcf
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f173230a.m52083V0((Media) obj);
            }
        })).subscribe(psd0.m173597H(new y20() { // from class: l.lbf
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f131202a.m52084W0((uxj0) obj);
            }
        }, new y20() { // from class: l.mbf
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f135718a.m52085X0((Throwable) obj);
            }
        }));
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.VReorderCard
    /* JADX INFO: renamed from: r */
    public void mo51883r(Media media, Runnable runnable) {
        this.f33977W = runnable;
        m52088b1(media);
    }

    public void setChangeAction(a30<Media, Boolean, Boolean> a30Var) {
        this.f33965K = a30Var;
    }

    public void setEnableLowPhoto(boolean z) {
        this.f33968N = z;
    }

    public void setFrom(String str) {
        this.f33962H = str;
    }

    public void setIllegalPicture(boolean z) {
        this.f33959F = z;
        this.f33984v.setVisibility(z ? 0 : 4);
    }

    public void setStyle(int i) {
        this.f33961G = i;
    }

    public void setUploadDataCallback(okf okfVar) {
        this.f33956D = okfVar;
    }

    /* JADX INFO: renamed from: t0 */
    public void m52100t0(ArrayList<CharSequence> arrayList, int i) {
        w30.C21001b c21001b = new w30.C21001b(getContext());
        c21001b.m204657I(m52095n0().getString(R$string.f19138c)).m204669U(new View.OnClickListener() { // from class: l.sbf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f167145a.m52066E0(view);
            }
        }).m204665Q(arrayList).m204666R(new int[]{i}, new int[]{c9c0.f80351L}).m204670V(new w30.InterfaceC21003d() { // from class: l.tbf
            @Override // p153l.w30.InterfaceC21003d
            /* JADX INFO: renamed from: a */
            public final void mo42907a(VListCell vListCell, VListCell.C22660a c22660a, int i2) {
                this.f172919a.m52067F0(vListCell, c22660a, i2);
            }
        });
        w30 w30VarM204654F = c21001b.m204654F();
        this.f33895d = w30VarM204654F;
        w30VarM204654F.m204618f();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.VReorderCard
    /* JADX INFO: renamed from: u */
    public void mo51887u() {
        if (SystemClock.uptimeMillis() - this.f33976V < 500) {
            return;
        }
        this.f33976V = SystemClock.uptimeMillis();
        if (bnl0.m105529O0(this)) {
            if (this.f33963I != null || !xra.m212804w()) {
                m52086Z0();
                return;
            }
            if (xra.m212792k()) {
                CoreModule.m30933P().m143405a().mo34354Kc(m52095n0(), this.f33958E0, new x20() { // from class: l.vbf
                    @Override // p153l.x20
                    public final void call() {
                        this.f183242a.m52059s0();
                    }
                });
                return;
            }
            if (!this.f33968N) {
                m52059s0();
            } else if (m52035Y0()) {
                m52048i1();
            } else {
                m52059s0();
            }
        }
    }

    /* JADX INFO: renamed from: u0 */
    public void m52101u0(String str) {
        String str2 = niw.m163315e(str) + ".jpg";
        File fileM22053H1 = CropperAct.m22053H1(getContext());
        if (!fileM22053H1.exists()) {
            fileM22053H1.mkdir();
        }
        File file = new File(fileM22053H1, str2);
        if (file.exists()) {
            getMediaOperation().mo44250f2(m51983v(), file.getAbsolutePath());
        } else {
            m52095n0().progress((String) null);
            C13274a.m80837u().m80848o(new DownloadTask.C13273b(uqb0.f180376H.getDownloadHttp()).m80825q(str).m80823o(file.getAbsolutePath()).m80818j(new z20() { // from class: l.lcf
                @Override // p153l.z20
                public final void call(Object obj, Object obj2) {
                    this.f131355a.m52068G0((DownloadTask) obj, (File) obj2);
                }
            }).m80814f(new z20() { // from class: l.mcf
                @Override // p153l.z20
                public final void call(Object obj, Object obj2) {
                    this.f135808a.m52069H0((DownloadTask) obj, (Throwable) obj2);
                }
            }).m80809a());
        }
    }

    /* JADX INFO: renamed from: x0 */
    public void m52102x0(int i) {
        if (gta.m132210e().m132214d().mo34687F7()) {
            this.f33958E0 = i;
            m52092h1();
        }
    }

    /* JADX INFO: renamed from: y0 */
    public boolean m52103y0() {
        return this.f33967M.size() > 0;
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m52104z0() {
        m52089d1(this.f33963I);
        if (NullChecker.m82486a(this.f33894c.f123275f.f33923h)) {
            this.f33894c.f123275f.f33923h.mo52398a();
        }
    }

    public ExpEditProfileImageCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f33959F = false;
        this.f33961G = 0;
        this.f33966L = new ArrayList(1);
        this.f33967M = new ArrayList();
        this.f33958E0 = -1;
    }

    public ExpEditProfileImageCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f33959F = false;
        this.f33961G = 0;
        this.f33966L = new ArrayList(1);
        this.f33967M = new ArrayList();
        this.f33958E0 = -1;
    }
}
