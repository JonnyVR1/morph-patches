package com.p051p1.mobile.putong.core.p058ui.profile;

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
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.facebook.drawee.generic.RoundingParams;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.android.p053ui.cropiwa.CropperAct;
import com.p051p1.mobile.android.p053ui.pushbubble.SimplePushBubble;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.CoreStaticData;
import com.p051p1.mobile.putong.core.data.NewTags;
import com.p051p1.mobile.putong.core.data.PhotoLowConfig;
import com.p051p1.mobile.putong.core.data.PhotoLowModelData;
import com.p051p1.mobile.putong.core.data.UserHomeMode;
import com.p051p1.mobile.putong.core.newui.profile.TagChooseMkAct;
import com.p051p1.mobile.putong.core.newui.view.ShimmerLayout;
import com.p051p1.mobile.putong.core.p058ui.growth.fakeexperience.view.FakeCardBgView;
import com.p051p1.mobile.putong.core.p058ui.poplevel.CorePopLevel;
import com.p051p1.mobile.putong.core.p058ui.profile.MediaReorderCard;
import com.p051p1.mobile.putong.core.profile.R$string;
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
import p137rx.subjects.C22508b;
import p151v.VDraweeView;
import p151v.VFrame_Anim;
import p151v.VImage;
import p151v.VListCell;
import p151v.VProgressBar;
import p151v.VText;
import p153l.a30;
import p153l.bkj0;
import p153l.bnl0;
import p153l.bsj0;
import p153l.c5y;
import p153l.dox;
import p153l.fo0;
import p153l.gt0;
import p153l.gta;
import p153l.i1y;
import p153l.i4g0;
import p153l.jgw;
import p153l.jl80;
import p153l.jyb;
import p153l.kbc0;
import p153l.kcg0;
import p153l.l4g0;
import p153l.llb0;
import p153l.niw;
import p153l.o1j0;
import p153l.oki;
import p153l.pf60;
import p153l.psd0;
import p153l.pzi0;
import p153l.qa00;
import p153l.qcj;
import p153l.sec0;
import p153l.sfj0;
import p153l.tr90;
import p153l.uqb0;
import p153l.uxj0;
import p153l.vel0;
import p153l.w30;
import p153l.wlj;
import p153l.x20;
import p153l.xra;
import p153l.xyl;
import p153l.y20;
import p153l.yb5;
import p153l.z20;

/* JADX INFO: loaded from: classes4.dex */
public class MediaReorderCard extends VReorderCard {

    /* JADX INFO: renamed from: Q0 */
    public static String f33800Q0 = "RepeatPicture";

    /* JADX INFO: renamed from: R0 */
    public static String f33801R0 = "NetPictur";

    /* JADX INFO: renamed from: A */
    public TextView f33802A;

    /* JADX INFO: renamed from: B */
    public ImageView f33803B;

    /* JADX INFO: renamed from: C */
    public VFrame_Anim f33804C;

    /* JADX INFO: renamed from: D */
    public ImageView f33805D;

    /* JADX INFO: renamed from: E */
    public VProgressBar f33806E;

    /* JADX INFO: renamed from: E0 */
    public PhotoLowModelData f33807E0;

    /* JADX INFO: renamed from: F */
    public VProgressBar f33808F;

    /* JADX INFO: renamed from: F0 */
    public PhotoLowModelData f33809F0;

    /* JADX INFO: renamed from: G */
    public ImageView f33810G;

    /* JADX INFO: renamed from: G0 */
    public PhotoLowModelData f33811G0;

    /* JADX INFO: renamed from: H */
    public ImageView f33812H;

    /* JADX INFO: renamed from: H0 */
    public PhotoLowModelData f33813H0;

    /* JADX INFO: renamed from: I */
    public C22508b<uxj0> f33814I;

    /* JADX INFO: renamed from: I0 */
    public l4g0 f33815I0;

    /* JADX INFO: renamed from: J */
    public kcg0 f33816J;

    /* JADX INFO: renamed from: J0 */
    public l4g0 f33817J0;

    /* JADX INFO: renamed from: K */
    public boolean f33818K;

    /* JADX INFO: renamed from: K0 */
    public long f33819K0;

    /* JADX INFO: renamed from: L */
    public String f33820L;

    /* JADX INFO: renamed from: L0 */
    public Runnable f33821L0;

    /* JADX INFO: renamed from: M */
    public String f33822M;

    /* JADX INFO: renamed from: M0 */
    public Media f33823M0;

    /* JADX INFO: renamed from: N */
    public Media f33824N;

    /* JADX INFO: renamed from: N0 */
    public FakeCardBgView f33825N0;

    /* JADX INFO: renamed from: O */
    public kcg0 f33826O;

    /* JADX INFO: renamed from: O0 */
    public int f33827O0;

    /* JADX INFO: renamed from: P */
    public a30<Media, Boolean, Boolean> f33828P;

    /* JADX INFO: renamed from: P0 */
    public ObjectAnimator f33829P0;

    /* JADX INFO: renamed from: Q */
    public List<String> f33830Q;

    /* JADX INFO: renamed from: R */
    public List<Media> f33831R;

    /* JADX INFO: renamed from: S */
    public View f33832S;

    /* JADX INFO: renamed from: T */
    public boolean f33833T;

    /* JADX INFO: renamed from: U */
    public boolean f33834U;

    /* JADX INFO: renamed from: V */
    public boolean f33835V;

    /* JADX INFO: renamed from: W */
    public CardType f33836W;

    /* JADX INFO: renamed from: k0 */
    public CardDataType f33837k0;

    /* JADX INFO: renamed from: p0 */
    public boolean f33838p0;

    /* JADX INFO: renamed from: r */
    public MediaReorderCardScaleIndependentFrame f33839r;

    /* JADX INFO: renamed from: s */
    public VDraweeView f33840s;

    /* JADX INFO: renamed from: t */
    public View f33841t;

    /* JADX INFO: renamed from: u */
    public VImage f33842u;

    /* JADX INFO: renamed from: v */
    public VText f33843v;

    /* JADX INFO: renamed from: w */
    public ShimmerLayout f33844w;

    /* JADX INFO: renamed from: x */
    public VText f33845x;

    /* JADX INFO: renamed from: y */
    public TextView f33846y;

    /* JADX INFO: renamed from: z */
    public LinearLayout f33847z;

    public enum CardDataType {
        EDIT,
        LIFE,
        DIALOG,
        DEFAULT
    }

    public enum CardType {
        AVATAR,
        LIFE_MOMENT,
        MARRY_AVATAR,
        MY_LIFT
    }

    public MediaReorderCard(Context context) {
        super(context);
        this.f33814I = C22508b.m222767b();
        this.f33816J = null;
        this.f33818K = false;
        this.f33820L = tr90.f175814h;
        this.f33830Q = new ArrayList(1);
        this.f33831R = new ArrayList();
        this.f33833T = true;
        this.f33834U = false;
        this.f33835V = false;
        this.f33836W = CardType.AVATAR;
        this.f33827O0 = -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E */
    public static /* synthetic */ uxj0 m51773E(bkj0 bkj0Var) {
        if (((Boolean) bkj0Var.f77081a).booleanValue()) {
            throw new IllegalPictureException("检测到敏感信息，上传失败");
        }
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ Media m51778J(List list) {
        return (Media) list.get(0);
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ Picture m51785Q(Media media) {
        return (Picture) media;
    }

    /* JADX INFO: renamed from: Z */
    public static /* synthetic */ Video m51794Z(List list) {
        return (Video) list.get(0);
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ Picture m51805k0(List list) {
        return (Picture) list.get(0);
    }

    /* JADX INFO: renamed from: r0 */
    public static /* synthetic */ void m51812r0(Throwable th) {
    }

    /* JADX INFO: renamed from: w0 */
    private void m51817w0(View view) {
        c5y.m108085a(this, view);
    }

    /* JADX INFO: renamed from: A0 */
    public final void m51818A0() {
        psd0.m173633z(this.f33816J);
    }

    /* JADX INFO: renamed from: A1 */
    public final void m51819A1() {
        if (getWidth() <= 0 || getHeight() <= 0) {
            return;
        }
        measureChildWithMargins(this.f33843v, dox.m117363a(getWidth()), 0, dox.m117363a(getHeight()), 0);
        int height = getHeight() - ((FrameLayout.LayoutParams) this.f33843v.getLayoutParams()).bottomMargin;
        int width = (getWidth() / 2) - (this.f33843v.getMeasuredWidth() / 2);
        int measuredWidth = this.f33843v.getMeasuredWidth() + width;
        this.f33843v.layout(width, height - this.f33843v.getMeasuredHeight(), measuredWidth, height);
    }

    /* JADX INFO: renamed from: B0 */
    public final C22421c<Picture> m51820B0(final Picture picture) {
        return C22421c.just(picture).observeOn(fo0.m126432a()).map(new qcj() { // from class: l.i4y
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return CoreModule.f18264c.f20381e0.m116589ma();
            }
        }).observeOn(Schedulers.m222739io()).flatMap(new qcj() { // from class: l.j4y
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f118342a.m51852R0(picture, (User) obj);
            }
        });
    }

    /* JADX INFO: renamed from: B1 */
    public void m51821B1() {
        if (getWidth() <= 0 || getHeight() <= 0) {
            return;
        }
        requestLayout();
        measure(dox.m117364b(getWidth()), dox.m117364b(getHeight()));
        layout(getLeft(), getTop(), getLeft() + getWidth(), getTop() + getHeight());
    }

    /* JADX INFO: renamed from: C0 */
    public final C22421c<uxj0> m51822C0(Media media) {
        return (uqb0.f180386R.m184740c() && (media instanceof Picture)) ? uqb0.f180386R.m184739b(Uri.parse(media.url).getPath()).map(new qcj() { // from class: l.a4y
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return MediaReorderCard.m51773E((bkj0) obj);
            }
        }) : C22421c.just(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: C1 */
    public void m51823C1(Media media) {
        m51825D1(media, false, true);
    }

    /* JADX INFO: renamed from: D0 */
    public final void m51824D0() {
        if (this.f33827O0 == 0 || !xra.m212804w() || m51842M0()) {
            getMediaOperation().mo44257n0(m51983v(), false, false, true);
        } else {
            gta.m132210e().m132214d().mo34809bp((Act) getContext(), this.f33820L, "");
        }
    }

    /* JADX INFO: renamed from: D1 */
    public void m51825D1(Media media, boolean z, boolean z2) {
        m51818A0();
        if (NullChecker.m82486a(media) && NullChecker.m82486a(this.f33824N)) {
            media.tags = this.f33824N.tags;
        }
        this.f33824N = media;
        m51851Q1("render");
        m51829F1();
        if (NullChecker.m82486a(this.f33828P)) {
            this.f33828P.mo37058a(media, Boolean.valueOf(z), Boolean.valueOf(z2));
        }
    }

    /* JADX INFO: renamed from: E0 */
    public void m51826E0(ArrayList<CharSequence> arrayList) {
        w30.C21001b c21001b = new w30.C21001b(getContext());
        c21001b.m204657I(m51892x0().getString(R$string.f28663a)).m204669U(new View.OnClickListener() { // from class: l.c4y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f79742a.m51854S0(view);
            }
        }).m204665Q(arrayList).m204670V(new w30.InterfaceC21003d() { // from class: l.d4y
            @Override // p153l.w30.InterfaceC21003d
            /* JADX INFO: renamed from: a */
            public final void mo42907a(VListCell vListCell, VListCell.C22660a c22660a, int i) {
                this.f85086a.m51856T0(vListCell, c22660a, i);
            }
        });
        w30 w30VarM204654F = c21001b.m204654F();
        this.f33895d = w30VarM204654F;
        w30VarM204654F.m204618f();
    }

    /* JADX INFO: renamed from: E1 */
    public void m51827E1(int i, String str) {
        String string;
        if (TextUtils.equals(str, "p_edit_profile_view") && gta.m132210e().m132214d().mo34687F7()) {
            return;
        }
        if (i == 0 || i == 1) {
            string = m51892x0().getString(R$string.f28692e4);
        } else if (i == 2) {
            string = m51892x0().getString(R$string.f28698f4);
        } else if (i == 3) {
            string = m51892x0().getString(R$string.f28704g4);
        } else if (i != 4) {
            string = i != 5 ? "" : m51892x0().getString(R$string.f28716i4);
        } else {
            string = m51892x0().getString(R$string.f28710h4);
        }
        this.f33845x.setText(string);
        bnl0.m105525M0(this.f33845x, (xra.m212804w() || xra.m212794m() || xra.m212795n() || !xra.m212791j() || NullChecker.m82486a(this.f33824N)) ? false : true);
    }

    /* JADX INFO: renamed from: F0 */
    public void m51828F0(String str) {
        String str2 = niw.m163315e(str) + ".jpg";
        File fileM22053H1 = CropperAct.m22053H1(getContext());
        if (!fileM22053H1.exists()) {
            fileM22053H1.mkdir();
        }
        File file = new File(fileM22053H1, str2);
        if (file.exists()) {
            getMediaOperation().mo44250f2(m51983v(), file.getAbsolutePath());
        } else {
            m51892x0().progress((String) null);
            C13274a.m80837u().m80848o(new DownloadTask.C13273b(uqb0.f180376H.getDownloadHttp()).m80825q(str).m80823o(file.getAbsolutePath()).m80818j(new z20() { // from class: l.u4y
                @Override // p153l.z20
                public final void call(Object obj, Object obj2) {
                    this.f177565a.m51858U0((DownloadTask) obj, (File) obj2);
                }
            }).m80814f(new z20() { // from class: l.v4y
                @Override // p153l.z20
                public final void call(Object obj, Object obj2) {
                    this.f182443a.m51860V0((DownloadTask) obj, (Throwable) obj2);
                }
            }).m80809a());
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:56:0x010a  */
    /* JADX WARN: Code duplicated, block: B:61:0x013b  */
    /* JADX WARN: Code duplicated, block: B:63:0x013f  */
    /* JADX WARN: Code duplicated, block: B:70:0x0168  */
    /* JADX INFO: renamed from: F1 */
    public void m51829F1() {
        Media media;
        mo51875k(this.f33824N == null);
        bnl0.m105524M(this.f33803B, (this.f33824N instanceof Video) && !xra.m212804w());
        bnl0.m105524M(this.f33812H, (this.f33824N instanceof Video) && xra.m212804w());
        if (NullChecker.m82486a(this.f33824N) && NullChecker.m82486a(this.f33824N.cover()) && NullChecker.m82486a(this.f33824N.cover().url)) {
            bnl0.m105533Q0(this.f33840s, new y20() { // from class: l.u3y
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f177410a.m51866b1((int[]) obj);
                }
            });
        } else {
            Media media2 = this.f33824N;
            if (media2 instanceof Video) {
                uqb0.f180374G.m127150m0(this.f33840s, media2.url);
            } else {
                uqb0.f180374G.m98798o(this.f33840s);
            }
        }
        if (NullChecker.m82486a(this.f33824N) && this.f33826O == null && !TEnum.equals(this.f33824N.status, "normal")) {
            m51845N1(this.f33805D);
            setCropPicStateVisibility(false);
        }
        if (this.f33824N == null) {
            m51845N1(null);
            this.f33841t.setAlpha(0.0f);
        }
        if (gta.m132210e().m132214d().mo34759Ua() && NullChecker.m82486a(this.f33824N)) {
            Media media3 = this.f33824N;
            if ((media3 instanceof Picture) && ((Picture) media3).isAiFakePic()) {
                m51845N1(this.f33805D);
                this.f33841t.animate().alpha(1.0f).start();
            } else if (gta.m132210e().m132214d().mo34801ak()) {
                media = this.f33824N;
                if (!(media instanceof Picture)) {
                    if (this.f33838p0) {
                        this.f33841t.animate().alpha(0.0f).start();
                    } else {
                        this.f33841t.animate().alpha(0.0f).start();
                    }
                } else if (this.f33838p0) {
                    this.f33841t.animate().alpha(0.0f).start();
                } else {
                    this.f33841t.animate().alpha(0.0f).start();
                }
            } else {
                media = this.f33824N;
                if (!(media instanceof Picture)) {
                    if (this.f33838p0) {
                        this.f33841t.animate().alpha(0.0f).start();
                    } else {
                        this.f33841t.animate().alpha(0.0f).start();
                    }
                } else if (this.f33838p0) {
                    this.f33841t.animate().alpha(0.0f).start();
                } else {
                    this.f33841t.animate().alpha(0.0f).start();
                }
            }
        } else if ((gta.m132210e().m132214d().mo34801ak() || gta.m132210e().m132214d().mo34690Fl()) && NullChecker.m82486a(this.f33824N)) {
            media = this.f33824N;
            if (!(media instanceof Picture) && (((Picture) media).isLabelJudge(MediaLabel.get(MediaLabel.WITH_REPEAT_MAIN_PICTURE)) || ((Picture) this.f33824N).isLabelJudge(MediaLabel.get(MediaLabel.WITH_NET_MAIN_PICTURE)))) {
                m51845N1(this.f33805D);
                this.f33841t.animate().alpha(1.0f).start();
            } else if (this.f33838p0 || !NullChecker.m82486a(this.f33824N)) {
                this.f33841t.animate().alpha(0.0f).start();
            } else {
                Media media4 = this.f33824N;
                if ((media4 instanceof Picture) && ((Picture) media4).isLow()) {
                    m51845N1(this.f33805D);
                    this.f33841t.animate().alpha(1.0f).start();
                } else {
                    this.f33841t.animate().alpha(0.0f).start();
                }
            }
        } else if (this.f33838p0) {
            this.f33841t.animate().alpha(0.0f).start();
        } else {
            this.f33841t.animate().alpha(0.0f).start();
        }
        setCropPicStateVisibility(!bnl0.m105529O0(this.f33805D) && NullChecker.m82486a(this.f33824N));
        m51833H1();
    }

    /* JADX INFO: renamed from: G0 */
    public final void m51830G0(final Media media) throws Throwable {
        boolean z;
        if (m51892x0() == null || m51892x0().isFinishing() || m51892x0().isDestroyed()) {
            return;
        }
        if (xra.m212790i() && NullChecker.m82486a(this.f33824N) && (media instanceof Picture) && TEnum.equals(this.f33824N.status, MediaLocalStatus.preprocessed)) {
            Picture picture = (Picture) media;
            String strM163314d = niw.m163314d(new File(oki.m168038z(this.f33824N.url)));
            Dimension dimension = picture.size;
            int i = dimension.width;
            int i2 = dimension.height;
            sfj0.m185606m("e_hyper_profile_pic_double_check", "p_edit_profile_view", sfj0.C20032a.m185615h("pic_trace_id", strM163314d), sfj0.C20032a.m185615h("pic_trace_type", "trimmed"), sfj0.C20032a.m185615h("pic_trace_url", media.url), sfj0.C20032a.m185615h("pic_trace_resolution", picture.size.width + BaseSei.f14624X + picture.size.height));
            CoreModule.f18264c.f20381e0.f89041H1.onNext(this.f33824N.url);
        }
        if (NullChecker.m82486a(this.f33824N) && NullChecker.m82486a(media)) {
            Media media2 = this.f33824N;
            media2.status = media.status;
            media.tags = media2.tags;
        }
        boolean z2 = false;
        if (m51983v() == 0 && (media instanceof Picture)) {
            Picture picture2 = (Picture) media;
            boolean zIsLabelJudge = picture2.isLabelJudge(MediaLabel.get(MediaLabel.WITH_REPEAT_MAIN_PICTURE));
            boolean z3 = this.f33838p0 && picture2.isLow();
            boolean zIsLabelJudge2 = picture2.isLabelJudge(MediaLabel.get(MediaLabel.WITH_NET_MAIN_PICTURE));
            picture2.isLabelJudge(MediaLabel.get(MediaLabel.NOT_VERIFICATION));
            if (gta.m132210e().m132214d().mo34801ak()) {
                m51825D1(media, true, false);
                if (zIsLabelJudge) {
                    m51843M1(f33800Q0);
                } else if (z3) {
                    m51841L1();
                } else if (zIsLabelJudge2) {
                    m51843M1(f33801R0);
                }
                z = false;
            } else if (gta.m132210e().m132214d().mo34690Fl()) {
                m51825D1(media, true, false);
                if (zIsLabelJudge) {
                    m51843M1(f33800Q0);
                } else if (z3) {
                    m51841L1();
                }
                z = false;
            } else {
                if (xra.m212804w() && z3 && NullChecker.m82486a(this.f33823M0)) {
                    m51845N1(null);
                    m51825D1(this.f33823M0, true, false);
                    m51841L1();
                } else {
                    m51825D1(media, true, false);
                    if (z3) {
                        m51841L1();
                    }
                }
                z = false;
            }
            if (TEnum.equals(media.status, "normal") || !z) {
            }
            this.f33831R.add(media);
            this.f33826O = null;
            m51845N1(this.f33810G);
            postDelayed(new Runnable() { // from class: l.b4y
                @Override // java.lang.Runnable
                public final void run() {
                    this.f75002a.m51861W0(media);
                }
            }, 1000L);
            setCropPicStateVisibility(true);
            boolean z4 = !gta.m132210e().m132214d().mo34822ee(m51892x0());
            CardType cardType = this.f33836W;
            if (cardType != CardType.LIFE_MOMENT && cardType != CardType.MARRY_AVATAR && cardType != CardType.MY_LIFT) {
                z2 = z4;
            }
            if (z2 && !TextUtils.equals(this.f33822M, CoreStaticData.ProfileFromType.FROM_EXPLORE)) {
                llb0.m154703c().m154710i(new SimplePushBubble.C4523a(m51892x0(), LayoutInflater.from(m51892x0()).inflate(sec0.f167550Z0, (ViewGroup) null)).m22163B(1).m22175z(CorePopLevel.MediaReorderCardDone).m22168s());
            }
            if (NullChecker.m82486a(this.f33894c.f123275f.f33924i)) {
                this.f33894c.f123275f.f33924i.mo52004a(m51983v(), true);
            }
            CoreModule.f18264c.f20381e0.f89034G1.onNext(uxj0.f181467a);
            return;
        }
        m51825D1(media, true, false);
        z = true;
        if (TEnum.equals(media.status, "normal")) {
        }
    }

    /* JADX INFO: renamed from: G1 */
    public boolean m51831G1() {
        Boolean bool = Boolean.FALSE;
        pf60<Boolean, Boolean> pf60VarM172085a = pf60.m172085a(bool, bool);
        if (NullChecker.m82486a(this.f33904m)) {
            pf60VarM172085a = this.f33904m.mo148180Q1();
        }
        if (!NullChecker.m82486a(pf60VarM172085a) || !NullChecker.m82486a(pf60VarM172085a.f152156a) || !pf60VarM172085a.f152156a.booleanValue()) {
            if (!m51888u1()) {
                return false;
            }
            m51839K1();
            return true;
        }
        if (!NullChecker.m82486a(pf60VarM172085a.f152157b) || !pf60VarM172085a.f152157b.booleanValue()) {
            return false;
        }
        m51839K1();
        return true;
    }

    /* JADX INFO: renamed from: H0, reason: merged with bridge method [inline-methods] */
    public final void m51884r1(Throwable th) {
        setVisibility(0);
        this.f33826O = null;
        setCropPicStateVisibility(false);
        m51845N1(this.f33805D);
        setCropPicStateVisibility(false);
        if (NullChecker.m82486a(this.f33894c.f123275f.f33924i)) {
            this.f33894c.f123275f.f33924i.mo52004a(m51983v(), false);
        }
        if (m51983v() == 0 && (this.f33824N instanceof Picture) && NullChecker.m82486a(this.f33823M0) && xra.m212804w()) {
            m51845N1(null);
            m51825D1(this.f33823M0, true, false);
        }
        if (th instanceof IllegalPictureException) {
            o1j0.m165651y(((IllegalPictureException) th).getMessage());
        }
    }

    /* JADX INFO: renamed from: H1 */
    public final void m51833H1() {
        if (m51842M0()) {
            bnl0.m105525M0(this.f33802A, false);
            return;
        }
        if (!NullChecker.m82486a(this.f33824N) || TextUtils.isEmpty(this.f33824N.url) || this.f33818K || !this.f33834U) {
            bnl0.m105525M0(this.f33802A, false);
            return;
        }
        bnl0.m105525M0(this.f33802A, true);
        this.f33802A.setCompoundDrawables(null, null, null, null);
        TextView textView = this.f33802A;
        int i = qa00.f156321h;
        textView.setPadding(i, 0, i, 0);
        if (m51983v() == 0) {
            this.f33802A.setBackgroundResource(kbc0.f124889m);
            this.f33802A.setText("封面");
            this.f33802A.setTextColor(Color.parseColor("#ffffffff"));
        } else {
            NewTags newTagsMo34694Gh = !jyb.m147479J(this.f33824N.tags) ? gta.m132210e().m132214d().mo34694Gh(this.f33824N.tags.get(0)) : null;
            if (!NullChecker.m82486a(newTagsMo34694Gh) || TextUtils.isEmpty(newTagsMo34694Gh.name)) {
                boolean z = this.f33835V;
                TextView textView2 = this.f33802A;
                if (z) {
                    textView2.setTextColor(Color.parseColor("#FFFE7E1D"));
                    this.f33802A.setText("添加标签");
                    Drawable drawable = getContext().getResources().getDrawable(kbc0.f124897o1);
                    drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
                    this.f33802A.setCompoundDrawables(drawable, null, null, null);
                    this.f33802A.setCompoundDrawablePadding(qa00.f156316c);
                    this.f33802A.setPadding(qa00.f156320g, 0, i, 0);
                    bnl0.m105509E0(this.f33802A, new View.OnClickListener() { // from class: l.p3y
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f150477a.m51868d1(view);
                        }
                    });
                } else {
                    bnl0.m105525M0(textView2, false);
                }
            } else {
                this.f33802A.setTextColor(Color.parseColor("#CC000000"));
                this.f33802A.setText(newTagsMo34694Gh.name);
                bnl0.m105509E0(this.f33802A, new View.OnClickListener() { // from class: l.o3y
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f144866a.m51867c1(view);
                    }
                });
            }
            this.f33802A.setBackgroundResource(kbc0.f124898p);
        }
        this.f33802A.getPaint().setFakeBoldText(true);
        measure(View.MeasureSpec.makeMeasureSpec(getWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getHeight(), 1073741824));
        layout(getLeft(), getTop(), getLeft() + getMeasuredWidth(), getTop() + getMeasuredHeight());
    }

    /* JADX INFO: renamed from: I0 */
    public void m51834I0(int i) {
        if (gta.m132210e().m132214d().mo34687F7()) {
            this.f33827O0 = i;
            m51837J1();
        }
    }

    /* JADX INFO: renamed from: I1 */
    public void m51835I1(boolean z, boolean z2) {
        this.f33834U = z;
        this.f33835V = z2;
    }

    /* JADX INFO: renamed from: J0 */
    public void m51836J0(int i, CardType cardType) {
        this.f33827O0 = i;
        this.f33836W = cardType;
        wlj hierarchy = this.f33840s.getHierarchy();
        int i2 = qa00.f156322i;
        hierarchy.m207045H(RoundingParams.m8302b(i2, i2, i2, i2));
        m51837J1();
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0188  */
    /* JADX INFO: renamed from: J1 */
    public void m51837J1() {
        CardDataType cardDataType;
        CardType cardType = this.f33836W;
        CardType cardType2 = CardType.AVATAR;
        CardDataType cardDataType2 = null;
        if (cardType != cardType2 && cardType != CardType.MARRY_AVATAR && cardType != CardType.MY_LIFT) {
            if (cardType != CardType.LIFE_MOMENT || this.f33827O0 < 0) {
                return;
            }
            this.f33839r.setBackgroundResource(kbc0.f124918v1);
            if (this.f33825N0 == null) {
                FakeCardBgView fakeCardBgView = new FakeCardBgView(getContext(), null);
                this.f33825N0 = fakeCardBgView;
                this.f33839r.addView(fakeCardBgView);
                this.f33825N0.setGravity(17);
            }
            if (xra.m212795n()) {
                boolean z = getParent() instanceof MediaReorderCards ? ((MediaReorderCards) getParent()).f33850C : false;
                int i = this.f33827O0;
                if (z) {
                    if (i <= 0 || i >= 3) {
                        this.f33825N0.f30375b.setTextColor(Color.parseColor("#e2e2e2"));
                        this.f33825N0.f30376c.setTextColor(Color.parseColor("#e2e2e2"));
                        if (this.f33825N0.f30374a.getBackground() != null) {
                            this.f33825N0.f30374a.getBackground().clearColorFilter();
                        }
                        this.f33839r.getBackground().clearColorFilter();
                    } else {
                        this.f33825N0.f30375b.setTextColor(Color.parseColor("#FF7602"));
                        this.f33825N0.f30376c.setTextColor(Color.parseColor("#FF7602"));
                        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(Color.parseColor("#ff7602"), PorterDuff.Mode.SRC_ATOP);
                        this.f33839r.getBackground().setColorFilter(porterDuffColorFilter);
                        if (!porterDuffColorFilter.equals(this.f33825N0.f30374a.getBackground().getColorFilter())) {
                            Drawable drawableMutate = this.f33825N0.f30374a.getBackground().mutate();
                            drawableMutate.setColorFilter(porterDuffColorFilter);
                            this.f33825N0.f30374a.setImageDrawable(drawableMutate);
                        }
                    }
                } else if (i <= 0 || i >= 3) {
                    ObjectAnimator objectAnimator = this.f33829P0;
                    if (objectAnimator != null && objectAnimator.isRunning()) {
                        this.f33829P0.cancel();
                    }
                    this.f33825N0.f30375b.setTextColor(Color.parseColor("#e2e2e2"));
                    this.f33825N0.f30376c.setTextColor(Color.parseColor("#e2e2e2"));
                    this.f33839r.getBackground().clearColorFilter();
                    if (this.f33825N0.f30374a.getBackground() != null) {
                        this.f33825N0.f30374a.getBackground().clearColorFilter();
                    }
                }
            }
            this.f33825N0.m47157b(this.f33827O0);
            bnl0.m105525M0(this.f33825N0, this.f33824N == null);
            return;
        }
        if (!gta.m132210e().m132214d().mo34687F7() || this.f33827O0 == -1) {
            return;
        }
        boolean zMo34609v4 = CoreModule.m30933P().m143405a().mo34609v4();
        MediaReorderCardScaleIndependentFrame mediaReorderCardScaleIndependentFrame = this.f33839r;
        if (zMo34609v4) {
            mediaReorderCardScaleIndependentFrame.setBackgroundResource(kbc0.f124768A);
        } else {
            mediaReorderCardScaleIndependentFrame.setBackgroundResource(kbc0.f124918v1);
        }
        if (this.f33825N0 == null) {
            if (xra.m212794m()) {
                CardDataType cardDataType3 = this.f33837k0;
                CardDataType cardDataType4 = CardDataType.LIFE;
                if (cardDataType3 == cardDataType4) {
                    cardDataType2 = cardDataType4;
                } else if (xra.m212795n() && (cardDataType = this.f33837k0) != (cardDataType2 = CardDataType.EDIT) && cardDataType != (cardDataType2 = CardDataType.DIALOG)) {
                    cardDataType2 = CardDataType.DEFAULT;
                }
            } else if (xra.m212795n()) {
                cardDataType2 = CardDataType.DEFAULT;
            }
            FakeCardBgView fakeCardBgView2 = new FakeCardBgView(getContext(), cardDataType2);
            this.f33825N0 = fakeCardBgView2;
            this.f33839r.addView(fakeCardBgView2);
            this.f33825N0.setGravity(17);
        }
        if (xra.m212792k() || xra.m212793l()) {
            boolean z2 = getParent() instanceof MediaReorderCards ? ((MediaReorderCards) getParent()).f33850C : false;
            int i2 = this.f33827O0;
            if (z2) {
                if (i2 <= 0 || i2 >= 3) {
                    this.f33825N0.f30375b.setTextColor(Color.parseColor("#e2e2e2"));
                    this.f33825N0.f30376c.setTextColor(Color.parseColor("#e2e2e2"));
                    if (this.f33825N0.f30374a.getBackground() != null) {
                        this.f33825N0.f30374a.getBackground().clearColorFilter();
                    }
                    this.f33839r.getBackground().clearColorFilter();
                } else {
                    this.f33825N0.f30375b.setTextColor(Color.parseColor("#FF7602"));
                    this.f33825N0.f30376c.setTextColor(Color.parseColor("#FF7602"));
                    PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(Color.parseColor("#ff7602"), PorterDuff.Mode.SRC_ATOP);
                    this.f33839r.getBackground().setColorFilter(porterDuffColorFilter2);
                    if (!porterDuffColorFilter2.equals(this.f33825N0.f30374a.getBackground().getColorFilter())) {
                        Drawable drawableMutate2 = this.f33825N0.f30374a.getBackground().mutate();
                        drawableMutate2.setColorFilter(porterDuffColorFilter2);
                        this.f33825N0.f30374a.setImageDrawable(drawableMutate2);
                    }
                }
            } else if (i2 <= 0 || i2 >= 3) {
                ObjectAnimator objectAnimator2 = this.f33829P0;
                if (objectAnimator2 != null && objectAnimator2.isRunning()) {
                    this.f33829P0.cancel();
                }
                this.f33825N0.f30375b.setTextColor(Color.parseColor("#e2e2e2"));
                this.f33825N0.f30376c.setTextColor(Color.parseColor("#e2e2e2"));
                this.f33839r.getBackground().clearColorFilter();
                if (this.f33825N0.f30374a.getBackground() != null) {
                    this.f33825N0.f30374a.getBackground().clearColorFilter();
                }
            }
        }
        FakeCardBgView fakeCardBgView3 = this.f33825N0;
        int i3 = this.f33827O0;
        CardType cardType3 = this.f33836W;
        fakeCardBgView3.m47158c(i3, cardType3 == cardType2 || cardType3 == CardType.MARRY_AVATAR);
        bnl0.m105525M0(this.f33825N0, this.f33824N == null);
    }

    /* JADX INFO: renamed from: K0 */
    public boolean m51838K0() {
        return this.f33831R.size() > 0;
    }

    /* JADX INFO: renamed from: K1 */
    public final void m51839K1() {
        new jgw(m51892x0(), new Runnable() { // from class: l.v3y
            @Override // java.lang.Runnable
            public final void run() {
                this.f182313a.m51869e1();
            }
        }, new Runnable() { // from class: l.w3y
            @Override // java.lang.Runnable
            public final void run() {
                this.f187184a.m51824D0();
            }
        }).show();
    }

    /* JADX INFO: renamed from: L0 */
    public boolean m51840L0() {
        return this.f33818K;
    }

    /* JADX INFO: renamed from: L1 */
    public final void m51841L1() {
        if (!NullChecker.m82486a(this.f33807E0) || TextUtils.isEmpty(this.f33807E0.conclusion)) {
            return;
        }
        if (this.f33815I0 == null) {
            this.f33815I0 = new l4g0("p_lowqualityphoto__popup", Dialog.class.getName());
        }
        new jl80.C17971a(m51892x0()).m146056y0("温馨提示").m146051t0(this.f33807E0.conclusion).m146034c0("更换照片", new Runnable() { // from class: l.l4y
            @Override // java.lang.Runnable
            public final void run() {
                this.f130027a.m51870f1();
            }
        }).m146029X("稍后再说", new Runnable() { // from class: l.m4y
            @Override // java.lang.Runnable
            public final void run() {
                this.f134839a.m51871g1();
            }
        }).m146046o0(new DialogInterface.OnShowListener() { // from class: l.n4y
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f140264a.m51872h1(dialogInterface);
            }
        }).m146045n0(new DialogInterface.OnDismissListener() { // from class: l.o4y
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f145019a.m51873i1(dialogInterface);
            }
        }).m146049r0();
    }

    /* JADX INFO: renamed from: M0 */
    public final boolean m51842M0() {
        if (!xra.m212798q()) {
            return false;
        }
        if (CoreModule.f18264c.f20381e0.f89178Z3.get().equals(UserHomeMode.marryMode) || TextUtils.equals(this.f33820L, "data_from_marry")) {
            return true;
        }
        String strPageId = m51892x0().pageId();
        return TextUtils.equals(strPageId, "p_edit_life_moment") || TextUtils.equals(strPageId, "p_marriage_profile_edit");
    }

    /* JADX INFO: renamed from: M1 */
    public final void m51843M1(String str) {
        String str2;
        final String str3;
        if (this.f33817J0 == null) {
            this.f33817J0 = new l4g0("p_lowqualityphoto__popup", Dialog.class.getName());
        }
        if (TextUtils.equals(str, f33800Q0) && NullChecker.m82486a(this.f33809F0)) {
            PhotoLowModelData photoLowModelData = this.f33809F0;
            str2 = photoLowModelData.conclusion;
            str3 = photoLowModelData.mapping;
        } else if (TextUtils.equals(str, f33801R0) && NullChecker.m82486a(this.f33811G0)) {
            PhotoLowModelData photoLowModelData2 = this.f33811G0;
            str2 = photoLowModelData2.conclusion;
            str3 = photoLowModelData2.mapping;
        } else {
            str2 = "";
            str3 = "";
        }
        this.f33817J0.m152781p(pf60.m172085a("lowquality_reason", str3));
        new jl80.C17971a(m51892x0()).m146056y0("温馨提示").m146051t0(str2).m146034c0("更换照片", new Runnable() { // from class: l.p4y
            @Override // java.lang.Runnable
            public final void run() {
                this.f150577a.m51874j1(str3);
            }
        }).m146029X("稍后再说", new Runnable() { // from class: l.r4y
            @Override // java.lang.Runnable
            public final void run() {
                i4g0.m138523u("e_replace_photo_cancel", "p_lowqualityphoto__popup", pf60.m172085a("lowquality_reason", str3));
            }
        }).m146046o0(new DialogInterface.OnShowListener() { // from class: l.s4y
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f166295a.m51876k1(dialogInterface);
            }
        }).m146045n0(new DialogInterface.OnDismissListener() { // from class: l.t4y
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f172153a.m51877l1(dialogInterface);
            }
        }).m146049r0();
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m51844N0() {
        m51823C1(this.f33824N);
        if (NullChecker.m82486a(this.f33894c.f123275f.f33923h)) {
            this.f33894c.f123275f.f33923h.mo52398a();
        }
    }

    /* JADX INFO: renamed from: N1 */
    public void m51845N1(View view) {
        this.f33804C.m224269C(view, new qcj() { // from class: l.s3y
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((View) obj).animate().alpha(1.0f).setDuration(200L);
            }
        }, new qcj() { // from class: l.t3y
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((View) obj).animate().alpha(0.0f).setDuration(200L);
            }
        });
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m51846O0(Drawable drawable, Drawable drawable2, ValueAnimator valueAnimator) {
        if (bnl0.m105529O0(this.f33825N0.f30376c)) {
            this.f33825N0.f30376c.setTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(((Integer) valueAnimator.getAnimatedValue()).intValue(), PorterDuff.Mode.SRC_ATOP);
        drawable.setColorFilter(porterDuffColorFilter);
        drawable2.setColorFilter(porterDuffColorFilter);
    }

    /* JADX INFO: renamed from: O1 */
    public final void m51847O1() {
        this.f33816J = this.f33814I.observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.y3y
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f197396a.m51878m1((uxj0) obj);
            }
        }, new y20() { // from class: l.z3y
            @Override // p153l.y20
            public final void call(Object obj) {
                MediaReorderCard.m51812r0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m51848P0() {
        if (getParent() instanceof MediaReorderCards) {
            ((MediaReorderCards) getParent()).f33850C = true;
        }
    }

    /* JADX INFO: renamed from: P1 */
    public void m51849P1() {
        this.f33844w.m44953u();
        this.f33844w.m44952t();
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ Picture m51850Q0(Picture picture, Envelope envelope) {
        if (envelope.meta.code == 200) {
            CoreData coreData = (CoreData) envelope.data.getModuleData(CoreData.class);
            if (NullChecker.m82486a(coreData)) {
                this.f33807E0 = coreData.lowPhotoResult;
                this.f33809F0 = coreData.repeatPictureResult;
                this.f33811G0 = coreData.netPictureResult;
                this.f33813H0 = coreData.notVerificationResultData;
                if (gta.m132210e().m132214d().mo34801ak()) {
                    if (NullChecker.m82486a(this.f33809F0) && TextUtils.equals(this.f33809F0.audit, "repeat")) {
                        picture.setLabel(MediaLabel.get(MediaLabel.WITH_REPEAT_MAIN_PICTURE));
                    } else {
                        picture.removeLabel(MediaLabel.get(MediaLabel.WITH_REPEAT_MAIN_PICTURE));
                    }
                    if (NullChecker.m82486a(this.f33811G0) && TextUtils.equals(this.f33811G0.audit, "net")) {
                        picture.setLabel(MediaLabel.get(MediaLabel.WITH_NET_MAIN_PICTURE));
                    } else {
                        picture.removeLabel(MediaLabel.get(MediaLabel.WITH_NET_MAIN_PICTURE));
                    }
                }
                if (gta.m132210e().m132214d().mo34690Fl()) {
                    if (NullChecker.m82486a(this.f33809F0) && TextUtils.equals(this.f33809F0.audit, "repeat")) {
                        picture.setLabel(MediaLabel.get(MediaLabel.WITH_REPEAT_MAIN_PICTURE));
                    } else {
                        picture.removeLabel(MediaLabel.get(MediaLabel.WITH_REPEAT_MAIN_PICTURE));
                    }
                }
                if (this.f33838p0 && NullChecker.m82486a(this.f33807E0) && TextUtils.equals(this.f33807E0.audit, "low")) {
                    picture.setLabel(MediaLabel.get(MediaLabel.WITH_LOW));
                } else {
                    picture.removeLabel(MediaLabel.get(MediaLabel.WITH_LOW));
                }
                picture.removeLabel(MediaLabel.get(MediaLabel.NOT_VERIFICATION));
            }
        }
        return picture;
    }

    /* JADX INFO: renamed from: Q1 */
    public final void m51851Q1(String str) {
        this.f33830Q.add(str);
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ C22421c m51852R0(final Picture picture, User user) {
        return CoreModule.f18264c.f20381e0.m116466G9(picture.url, this.f33827O0 == 0 ? 1 : 2, null).map(new qcj() { // from class: l.k4y
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f123949a.m51850Q0(picture, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: R1 */
    public void m51853R1(int i) {
        if (this.f33827O0 == i || this.f33825N0 == null) {
            return;
        }
        m51834I0(i);
        m51821B1();
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m51854S0(View view) {
        this.f33895d.m204614b();
    }

    /* JADX INFO: renamed from: S1 */
    public void m51855S1(String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        VText vText = this.f33843v;
        if (zIsEmpty) {
            bnl0.m105525M0(vText, false);
            return;
        }
        bnl0.m105525M0(vText, true);
        this.f33843v.setText(m51892x0().getString(R$string.f28730l0, str));
        m51819A1();
    }

    /* JADX INFO: renamed from: T0 */
    public final /* synthetic */ void m51856T0(VListCell vListCell, VListCell.C22660a c22660a, int i) {
        this.f33895d.m204614b();
        if (TextUtils.equals(c22660a.f210081a, m51892x0().string(R$string.f28669b)) || TextUtils.equals(c22660a.f210081a, "更换头像")) {
            m51824D0();
            return;
        }
        if (TextUtils.equals(c22660a.f210081a, m51892x0().string(R$string.f28675c))) {
            if (gta.m132210e().m132214d().mo34667C(100015)) {
                getMediaOperation().mo44257n0(m51983v(), false, true, false);
                return;
            }
            return;
        }
        if (TextUtils.equals(c22660a.f210081a, m51892x0().string(R$string.f28726k2)) || TextUtils.equals(c22660a.f210081a, "重新裁剪照片")) {
            if (!TextUtils.equals(getCurPageId(), "p_upload_photos")) {
                sfj0.m185596c("e_picture_re_edit_button", "p_edit_profile_view", new sfj0.C20032a[0]);
            }
            if (NullChecker.m82486a(this.f33824N)) {
                this.f33831R.remove(this.f33824N);
                m51828F0(this.f33824N.url);
                CoreModule.f18264c.f20381e0.f89034G1.onNext(uxj0.f181467a);
                return;
            }
            StringBuilder sb = new StringBuilder("MediaReorderCard error: ");
            for (int i2 = 0; i2 < this.f33830Q.size(); i2++) {
                if (i2 > 0) {
                    sb.append(", ");
                }
                sb.append(this.f33830Q.get(i2));
            }
            CrashHelper.m82479c(new NullPointerException(sb.toString()));
            return;
        }
        if (TextUtils.equals(c22660a.f210081a, m51892x0().string(R$string.f28699g))) {
            m51859U1();
            return;
        }
        if (!TextUtils.equals(c22660a.f210081a, m51892x0().string(R$string.f28681d)) && !TextUtils.equals(c22660a.f210081a, "删除该照片") && !TextUtils.equals(c22660a.f210081a, "删除该视频")) {
            if (TextUtils.equals(c22660a.f210081a, "编辑标签")) {
                m51894y0();
                return;
            } else {
                if (NullChecker.m82486a(this.f33904m)) {
                    this.f33904m.m213631g1(c22660a.f210081a, this.f33827O0);
                    return;
                }
                return;
            }
        }
        if (!TextUtils.equals(getCurPageId(), "p_upload_photos")) {
            sfj0.m185596c("e_profile_add_delete_photos", "p_edit_profile_view", sfj0.C20032a.m185615h("add_delete_picture", "delete_picture"), sfj0.C20032a.m185613f("picture_number", m51983v() + 1));
        }
        this.f33831R.remove(this.f33824N);
        this.f33824N = null;
        m51851Q1(RequestParameters.SUBRESOURCE_DELETE);
        m51857T1();
        m51975l();
        setIllegalPicture(false);
        m51825D1(null, true, false);
        m51827E1(m51983v(), getCurPageId());
        m51837J1();
        CoreModule.f18264c.f20381e0.f89034G1.onNext(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: T1 */
    public final void m51857T1() {
        if (NullChecker.m82486a(this.f33826O)) {
            m51845N1(null);
            bsj0.m106263U(this.f33826O);
            this.f33841t.setAlpha(0.0f);
            this.f33826O = null;
        }
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ void m51858U0(DownloadTask downloadTask, File file) {
        m51892x0().progressDismiss();
        getMediaOperation().mo44250f2(m51983v(), file.getAbsolutePath());
    }

    /* JADX INFO: renamed from: U1 */
    public void m51859U1() {
        C22421c c22421cCompose;
        View view;
        m51818A0();
        TrackMediaUploadUtil.m81479a0(this.f33824N);
        Media media = this.f33824N;
        if (media instanceof Video) {
            m51847O1();
            c22421cCompose = this.f33824N.url.startsWith("http") ? C22421c.just(this.f33824N.mo225055clone()).map(new qcj() { // from class: l.w4y
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f187451a.m51885s1((Media) obj);
                }
            }) : new i1y(jyb.m147507f0(this.f33824N), true).map(new qcj() { // from class: l.x4y
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return MediaReorderCard.m51778J((List) obj);
                }
            }).flatMap(new qcj() { // from class: l.y4y
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f197522a.m51886t1((Media) obj);
                }
            }).compose(TrackMediaUploadUtil.m81489f0("profile", jyb.m147507f0(this.f33824N), null));
        } else {
            boolean zStartsWith = media.url.startsWith("http");
            Media media2 = this.f33824N;
            c22421cCompose = (zStartsWith ? C22421c.just(media2.mo225055clone()).map(new qcj() { // from class: l.z4y
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return MediaReorderCard.m51785Q((Media) obj);
                }
            }) : m51822C0(media2).flatMap(new qcj() { // from class: l.a5y
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f68655a.m51879n1((uxj0) obj);
                }
            }).map(new qcj() { // from class: l.b5y
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return MediaReorderCard.m51805k0((List) obj);
                }
            })).flatMap(new qcj() { // from class: l.k3y
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f123799a.m51880o1((Picture) obj);
                }
            }).compose(TrackMediaUploadUtil.m81489f0("profile", jyb.m147507f0(this.f33824N), null));
        }
        m51845N1(this.f33806E);
        setIllegalPicture(false);
        if (m51983v() == 0 && (view = this.f33832S) != null) {
            view.setVisibility(0);
        }
        this.f33841t.animate().alpha(1.0f).start();
        this.f33826O = m51892x0().duringCreated(c22421cCompose.compose(psd0.m173592C()).switchMap(new qcj() { // from class: l.l3y
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f129916a.m51881p1((Media) obj);
            }
        })).subscribe(psd0.m173597H(new y20() { // from class: l.m3y
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f134718a.m51882q1((uxj0) obj);
            }
        }, new y20() { // from class: l.n3y
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f140046a.m51884r1((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ void m51860V0(DownloadTask downloadTask, Throwable th) {
        m51892x0().progressDismiss();
        o1j0.m165649w(R$string.f28569H0);
    }

    /* JADX INFO: renamed from: W0 */
    public final /* synthetic */ void m51861W0(Media media) {
        if (this.f33824N == media) {
            m51845N1(null);
            this.f33841t.animate().alpha(0.0f).start();
        }
    }

    /* JADX INFO: renamed from: X0 */
    public final /* synthetic */ void m51862X0(View view) {
        mo51887u();
    }

    /* JADX INFO: renamed from: Y0 */
    public final /* synthetic */ void m51863Y0(Picture picture, int[] iArr) {
        bnl0.m105525M0(this.f33845x, false);
        m51893x1(picture);
    }

    /* JADX INFO: renamed from: Z0 */
    public final /* synthetic */ void m51864Z0(Video video, int[] iArr) {
        long j = new vel0(oki.m168038z(video.url)).f183806b;
        if (j >= 16000) {
            o1j0.m165634h(R$string.f28543C2);
        } else if (j < 3000) {
            o1j0.m165634h(R$string.f28549D2);
        } else {
            m51893x1(video);
        }
    }

    /* JADX INFO: renamed from: a1 */
    public final /* synthetic */ void m51865a1() {
        getMediaOperation().mo47155i0(m51983v(), false);
    }

    /* JADX INFO: renamed from: b1 */
    public final /* synthetic */ void m51866b1(int[] iArr) {
        if (NullChecker.m82486a(this.f33824N) && NullChecker.m82486a(this.f33824N.cover()) && NullChecker.m82486a(this.f33824N.cover().url)) {
            if (getParent() instanceof ViewGroup) {
                ((ViewGroup) getParent()).indexOfChild(this);
            }
            uqb0.f180374G.m127111J0(this.f33840s, this.f33824N.cover().profile480(), false);
        }
    }

    /* JADX INFO: renamed from: c1 */
    public final /* synthetic */ void m51867c1(View view) {
        m51894y0();
    }

    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ void m51868d1(View view) {
        m51894y0();
    }

    /* JADX INFO: renamed from: e1 */
    public final /* synthetic */ void m51869e1() {
        if (gta.m132210e().m132214d().mo34667C(100015)) {
            getMediaOperation().mo44257n0(m51983v(), false, true, false);
        }
    }

    /* JADX INFO: renamed from: f1 */
    public final /* synthetic */ void m51870f1() {
        m51824D0();
        i4g0.m138523u("e_replace_photo", "p_lowqualityphoto__popup", pf60.m172085a("lowquality_reason", this.f33807E0.mapping));
    }

    /* JADX INFO: renamed from: g1 */
    public final /* synthetic */ void m51871g1() {
        i4g0.m138523u("e_replace_photo_cancel", "p_lowqualityphoto__popup", pf60.m172085a("lowquality_reason", this.f33807E0.mapping));
    }

    public List<Media> getAddPhotos() {
        return this.f33831R;
    }

    public xyl getMediaOperation() {
        if (NullChecker.m82486a(this.f33904m)) {
            return this.f33904m;
        }
        return getContext() instanceof xyl ? (xyl) getContext() : (ProfileMediaAct) getContext();
    }

    /* JADX INFO: renamed from: h1 */
    public final /* synthetic */ void m51872h1(DialogInterface dialogInterface) {
        this.f33815I0.m152774i();
        this.f33815I0.m152777l();
    }

    /* JADX INFO: renamed from: i1 */
    public final /* synthetic */ void m51873i1(DialogInterface dialogInterface) {
        this.f33815I0.m152776k();
        this.f33815I0.m152775j();
    }

    /* JADX INFO: renamed from: j1 */
    public final /* synthetic */ void m51874j1(String str) {
        m51824D0();
        i4g0.m138523u("e_replace_photo", "p_lowqualityphoto__popup", pf60.m172085a("lowquality_reason", str));
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.VReorderCard
    /* JADX INFO: renamed from: k */
    public void mo51875k(boolean z) {
        super.mo51875k(z);
        setCropPicStateVisibility(!z);
    }

    /* JADX INFO: renamed from: k1 */
    public final /* synthetic */ void m51876k1(DialogInterface dialogInterface) {
        this.f33817J0.m152774i();
        this.f33817J0.m152777l();
    }

    /* JADX INFO: renamed from: l1 */
    public final /* synthetic */ void m51877l1(DialogInterface dialogInterface) {
        this.f33817J0.m152776k();
        this.f33817J0.m152775j();
    }

    /* JADX INFO: renamed from: m1 */
    public final /* synthetic */ void m51878m1(uxj0 uxj0Var) {
        if (NullChecker.m82486a(this.f33824N)) {
            m51829F1();
        }
    }

    /* JADX INFO: renamed from: n1 */
    public final /* synthetic */ C22421c m51879n1(uxj0 uxj0Var) {
        return yb5.m214982K(jyb.m147507f0(this.f33824N), "profile", "user-profile", UploadSource.get("profile"));
    }

    /* JADX INFO: renamed from: o1 */
    public final /* synthetic */ C22421c m51880o1(Picture picture) {
        CoreProviderInterface coreProviderInterfaceM132214d = gta.m132210e().m132214d();
        return ((coreProviderInterfaceM132214d.mo34801ak() || coreProviderInterfaceM132214d.mo34690Fl() || this.f33838p0) && NullChecker.m82486a(picture) && TEnum.equals(picture.status, "normal")) ? m51820B0(picture) : C22421c.just(picture);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m51818A0();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.VReorderCard, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m51817w0(this);
        if (xra.m212791j()) {
            this.f33839r.setBackgroundResource(kbc0.f124924x1);
        }
        setClipToPadding(false);
        setClipChildren(false);
        bnl0.m105539W(this.f33839r, qa00.f156322i);
        bnl0.m105537U(this.f33839r, qa00.m175859d(9.0f));
        this.f33803B.setImageResource(kbc0.f124790H0);
        this.f33812H.setImageResource(kbc0.f124790H0);
        bnl0.m105540X(this.f33803B, qa00.f156316c);
        bnl0.m105539W(this.f33803B, qa00.m175859d(5.0f));
        setCropPicStateVisibility(true);
        wlj hierarchy = this.f33840s.getHierarchy();
        int i = qa00.f156321h;
        hierarchy.m207045H(RoundingParams.m8302b(i, i, i, i));
        bnl0.m105509E0(this.f33842u, new View.OnClickListener() { // from class: l.j3y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f118225a.m51862X0(view);
            }
        });
        bnl0.m105574p0(this.f33806E);
        this.f33806E = this.f33808F;
        this.f33839r.setBackgroundResource(kbc0.f124900p1);
        if (gta.m132210e().m132214d().mo34702I4()) {
            this.f33805D.setImageResource(kbc0.f124771B);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f33805D.getLayoutParams();
            layoutParams.gravity = 17;
            layoutParams.rightMargin = 0;
            layoutParams.bottomMargin = 0;
            this.f33805D.setLayoutParams(layoutParams);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    /* JADX INFO: renamed from: p1 */
    public final /* synthetic */ C22421c m51881p1(Media media) throws Throwable {
        m51830G0(media);
        if (NullChecker.m82486a(this.f33821L0)) {
            this.f33821L0.run();
        }
        return C22421c.just(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: q1 */
    public final /* synthetic */ void m51882q1(uxj0 uxj0Var) {
        setVisibility(0);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.VReorderCard
    /* JADX INFO: renamed from: r */
    public void mo51883r(Media media, Runnable runnable) {
        this.f33821L0 = runnable;
        m51893x1(media);
    }

    /* JADX INFO: renamed from: s1 */
    public final /* synthetic */ Media m51885s1(Media media) {
        this.f33814I.onNext(uxj0.f181467a);
        return media;
    }

    public void setCardDataType(CardDataType cardDataType) {
        this.f33837k0 = cardDataType;
    }

    public void setCardType(CardType cardType) {
        this.f33836W = cardType;
    }

    public void setChangeAction(a30<Media, Boolean, Boolean> a30Var) {
        this.f33828P = a30Var;
    }

    public void setCropPicStateVisibility(boolean z) {
        if (NullChecker.m82486a(m51972h()) && m51972h().f33920e) {
            z = false;
        }
        bnl0.m105525M0(this.f33842u, z);
    }

    public void setDataFrom(String str) {
        this.f33820L = str;
    }

    public void setEnableLowPhoto(boolean z) {
        this.f33838p0 = z;
    }

    public void setFrom(String str) {
        this.f33822M = str;
    }

    public void setIllegalPicture(boolean z) {
        this.f33818K = z;
        this.f33846y.setVisibility(z ? 0 : 4);
    }

    public void setMainPicTag(View view) {
        this.f33832S = view;
    }

    public void setShouldShowEdit(boolean z) {
        this.f33833T = z;
    }

    /* JADX INFO: renamed from: t1 */
    public final /* synthetic */ C22421c m51886t1(Media media) {
        this.f33824N = media;
        this.f33814I.onNext(uxj0.f181467a);
        m51851Q1("uploadStart");
        return TEnum.equals(media.status, MediaLocalStatus.preprocessed) ? yb5.m214982K(jyb.m147507f0(media), "profile", "user-profile", UploadSource.get("profile")).map(new qcj() { // from class: l.x3y
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return MediaReorderCard.m51794Z((List) obj);
            }
        }) : C22421c.just(media);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.VReorderCard
    /* JADX INFO: renamed from: u */
    public void mo51887u() {
        if (SystemClock.uptimeMillis() - this.f33819K0 < 500) {
            return;
        }
        if (!NullChecker.m82486a(this.f33904m) || this.f33904m.mo106105P3(this.f33827O0)) {
            this.f33819K0 = SystemClock.uptimeMillis();
            if (bnl0.m105529O0(this)) {
                if (this.f33824N == null && xra.m212804w()) {
                    if (xra.m212792k()) {
                        CoreModule.m30933P().m143405a().mo34354Kc(m51892x0(), this.f33827O0, new x20() { // from class: l.q3y
                            @Override // p153l.x20
                            public final void call() {
                                this.f155500a.m51824D0();
                            }
                        });
                        return;
                    } else {
                        if (this.f33838p0 && m51831G1()) {
                            return;
                        }
                        m51824D0();
                        return;
                    }
                }
                if (this.f33824N == null && ((xra.m212794m() && this.f33837k0 == CardDataType.LIFE) || xra.m212795n())) {
                    CoreModule.m30933P().m143405a().mo34354Kc(m51892x0(), this.f33827O0, new x20() { // from class: l.r3y
                        @Override // p153l.x20
                        public final void call() {
                            this.f161126a.m51865a1();
                        }
                    });
                } else {
                    m51889v1();
                }
            }
        }
    }

    /* JADX INFO: renamed from: u1 */
    public final boolean m51888u1() {
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

    /* JADX INFO: renamed from: v1 */
    public void m51889v1() {
        Media media;
        ArrayList<CharSequence> arrayList = new ArrayList<>();
        if (NullChecker.m82486a(this.f33824N) && TEnum.equals(this.f33824N.status, "normal") && this.f33834U && this.f33827O0 > 0) {
            arrayList.add("编辑标签");
        }
        if (NullChecker.m82486a(this.f33824N) && TEnum.equals(this.f33824N.status, "normal") && this.f33833T) {
            boolean zM212804w = xra.m212804w();
            Media media2 = this.f33824N;
            if (zM212804w) {
                if (media2 instanceof Picture) {
                    arrayList.add("重新裁剪照片");
                }
                if (this.f33827O0 == 0) {
                    arrayList.add("更换头像");
                }
            } else if (media2 instanceof Picture) {
                arrayList.add(m51892x0().string(R$string.f28726k2));
            }
            if (this.f33824N instanceof Picture) {
                this.f33830Q.clear();
                this.f33830Q.add("show action dialog");
            }
        }
        if ((m51973i() <= 1 || !NullChecker.m82486a(this.f33824N)) && (((media = this.f33824N) == null || TEnum.equals(media.status, "normal")) && !xra.m212804w())) {
            if (NullChecker.m82486a(this.f33904m)) {
                List<String> selfActions = this.f33904m.getSelfActions();
                if (jyb.m147479J(selfActions)) {
                    arrayList.add(m51892x0().getString(R$string.f28669b));
                    arrayList.add(m51892x0().getString(R$string.f28675c));
                } else {
                    arrayList.addAll(selfActions);
                }
            } else {
                arrayList.add(m51892x0().getString(R$string.f28669b));
                arrayList.add(m51892x0().getString(R$string.f28675c));
            }
            if (!TextUtils.equals(getCurPageId(), "p_upload_photos")) {
                sfj0.m185596c("e_edit_profile_add_icon", "p_edit_profile_view", new sfj0.C20032a[0]);
            }
            if (!TextUtils.equals(getCurPageId(), "p_upload_photos")) {
                sfj0.m185596c("e_profile_add_delete_photos", "p_edit_profile_view", sfj0.C20032a.m185615h("add_delete_picture", "add_picture"), sfj0.C20032a.m185613f("picture_number", m51983v() + 1));
            }
        }
        if (NullChecker.m82486a(this.f33824N) && !TEnum.equals(this.f33824N.status, "normal") && this.f33826O == null) {
            arrayList.add(m51892x0().getString(R$string.f28699g));
        }
        if ((m51973i() > 1 || this.f33836W == CardType.LIFE_MOMENT) && NullChecker.m82486a(this.f33824N)) {
            if (!xra.m212804w()) {
                arrayList.add(m51892x0().getString(R$string.f28681d));
            } else if (this.f33827O0 > 0) {
                Media media3 = this.f33824N;
                if (media3 instanceof Picture) {
                    arrayList.add("删除该照片");
                } else if (media3 instanceof Video) {
                    arrayList.add("删除该视频");
                }
            }
        }
        if (this.f33838p0) {
            if (this.f33824N == null && arrayList.contains(m51892x0().getString(R$string.f28669b)) && arrayList.contains(m51892x0().getString(R$string.f28675c))) {
                if (m51831G1()) {
                    return;
                }
            } else if (NullChecker.m82486a(this.f33824N)) {
                Media media4 = this.f33824N;
                if ((media4 instanceof Picture) && ((Picture) media4).isLow() && (m51983v() != 0 || !xra.m212804w())) {
                    arrayList.clear();
                    arrayList.add(m51892x0().getString(R$string.f28699g));
                    arrayList.add(m51892x0().getString(R$string.f28681d));
                }
            }
        }
        if (!this.f33906o) {
            arrayList.clear();
            if (!TEnum.equals(this.f33824N.status, "normal")) {
                arrayList.add(m51892x0().getString(R$string.f28699g));
            }
        }
        if (arrayList.size() == 0) {
            return;
        }
        m51826E0(arrayList);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.VReorderCard
    /* JADX INFO: renamed from: w */
    public void mo51890w(boolean z) {
        super.mo51890w(z);
        setCropPicStateVisibility((z || bnl0.m105529O0(this.f33805D)) ? false : true);
    }

    /* JADX INFO: renamed from: w1 */
    public void m51891w1(final Picture picture) {
        bnl0.m105533Q0(this, new y20() { // from class: l.f4y
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f97165a.m51863Y0(picture, (int[]) obj);
            }
        });
    }

    /* JADX INFO: renamed from: x0 */
    public Act m51892x0() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: x1 */
    public void m51893x1(Media media) {
        if (NullChecker.m82486a(this.f33824N)) {
            media.tags = this.f33824N.tags;
        }
        if (NullChecker.m82486a(this.f33824N)) {
            this.f33823M0 = this.f33824N.mo225055clone();
        }
        this.f33824N = media;
        m51851Q1("onPickMedia");
        m51859U1();
        m51829F1();
        m51970f();
        m51837J1();
        if (NullChecker.m82486a(this.f33904m)) {
            this.f33904m.mo148181e1();
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final void m51894y0() {
        if (this.f33906o && TEnum.equals(this.f33824N.status, "normal")) {
            if (NullChecker.m82486a(m51972h().f33925j)) {
                m51972h().f33925j.run();
            }
            TagChooseMkAct.m44233w2(m51892x0(), jyb.m147482M(this.f33824N), null, new Runnable() { // from class: l.h4y
                @Override // java.lang.Runnable
                public final void run() {
                    this.f107837a.m51844N0();
                }
            }, null);
        }
    }

    /* JADX INFO: renamed from: y1 */
    public void m51895y1(Media media) {
        if (NullChecker.m82486a(this.f33824N)) {
            this.f33823M0 = this.f33824N.mo225055clone();
        }
        this.f33824N = media;
        m51851Q1("onPickMedia");
        m51859U1();
        m51829F1();
        m51970f();
        m51837J1();
        if (NullChecker.m82486a(this.f33904m)) {
            this.f33904m.mo148181e1();
        }
    }

    /* JADX INFO: renamed from: z0 */
    public void m51896z0() {
        final Drawable background = this.f33839r.getBackground();
        FakeCardBgView fakeCardBgView = this.f33825N0;
        if (fakeCardBgView == null || this.f33824N != null) {
            if (getParent() instanceof MediaReorderCards) {
                ((MediaReorderCards) getParent()).f33850C = true;
                return;
            }
            return;
        }
        final Drawable drawableMutate = fakeCardBgView.f30374a.getBackground().mutate();
        this.f33825N0.f30374a.setBackground(drawableMutate);
        ObjectAnimator duration = ObjectAnimator.ofObject(this.f33825N0.f30375b, "textColor", new ArgbEvaluator(), Integer.valueOf(Color.parseColor("#e2e2e2")), Integer.valueOf(Color.parseColor("#FF7602"))).setDuration(800L);
        this.f33829P0 = duration;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.e4y
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f92164a.m51846O0(background, drawableMutate, valueAnimator);
            }
        });
        this.f33829P0.setRepeatMode(2);
        this.f33829P0.setRepeatCount(4);
        this.f33829P0.setInterpolator(null);
        gt0.m132160f(this.f33829P0, new Runnable() { // from class: l.g4y
            @Override // java.lang.Runnable
            public final void run() {
                this.f102205a.m51848P0();
            }
        });
        this.f33829P0.start();
    }

    /* JADX INFO: renamed from: z1 */
    public void m51897z1(final Video video) {
        bnl0.m105533Q0(this, new y20() { // from class: l.q4y
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f155623a.m51864Z0(video, (int[]) obj);
            }
        });
    }

    public MediaReorderCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f33814I = C22508b.m222767b();
        this.f33816J = null;
        this.f33818K = false;
        this.f33820L = tr90.f175814h;
        this.f33830Q = new ArrayList(1);
        this.f33831R = new ArrayList();
        this.f33833T = true;
        this.f33834U = false;
        this.f33835V = false;
        this.f33836W = CardType.AVATAR;
        this.f33827O0 = -1;
    }

    public MediaReorderCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f33814I = C22508b.m222767b();
        this.f33816J = null;
        this.f33818K = false;
        this.f33820L = tr90.f175814h;
        this.f33830Q = new ArrayList(1);
        this.f33831R = new ArrayList();
        this.f33833T = true;
        this.f33834U = false;
        this.f33835V = false;
        this.f33836W = CardType.AVATAR;
        this.f33827O0 = -1;
    }
}
