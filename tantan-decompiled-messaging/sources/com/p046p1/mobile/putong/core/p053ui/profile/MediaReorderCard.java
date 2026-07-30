package com.p046p1.mobile.putong.core.p053ui.profile;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.android.p048ui.cropiwa.CropperAct;
import com.p046p1.mobile.android.p048ui.pushbubble.SimplePushBubble;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.CoreStaticData;
import com.p046p1.mobile.putong.core.data.NewTags;
import com.p046p1.mobile.putong.core.data.PhotoLowConfig;
import com.p046p1.mobile.putong.core.data.PhotoLowModelData;
import com.p046p1.mobile.putong.core.data.UserHomeMode;
import com.p046p1.mobile.putong.core.newui.profile.TagChooseMkAct;
import com.p046p1.mobile.putong.core.newui.view.ShimmerLayout;
import com.p046p1.mobile.putong.core.p053ui.growth.fakeexperience.view.FakeCardBgView;
import com.p046p1.mobile.putong.core.p053ui.poplevel.CorePopLevel;
import com.p046p1.mobile.putong.core.p053ui.profile.MediaReorderCard;
import com.p046p1.mobile.putong.core.profile.R$string;
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
import p133rx.subjects.C22393b;
import p147v.VDraweeView;
import p147v.VFrame_Anim;
import p147v.VImage;
import p147v.VListCell;
import p147v.VProgressBar;
import p147v.VText;
import p149l.bt0;
import p149l.c40;
import p149l.c4g0;
import p149l.cwf0;
import p149l.d30;
import p149l.dd80;
import p149l.djj;
import p149l.e30;
import p149l.e3c0;
import p149l.f30;
import p149l.ffx;
import p149l.fwl;
import p149l.fwx;
import p149l.g30;
import p149l.hdb0;
import p149l.j760;
import p149l.jo0;
import p149l.lew;
import p149l.lqa;
import p149l.lsi0;
import p149l.lsx;
import p149l.mkd0;
import p149l.mqi0;
import p149l.n6c0;
import p149l.o6j0;
import p149l.ogw;
import p149l.pj90;
import p149l.qib0;
import p149l.r5l0;
import p149l.rhi;
import p149l.roj0;
import p149l.t100;
import p149l.ura;
import p149l.vwb;
import p149l.w9j;
import p149l.xaj0;
import p149l.xdl0;
import p149l.ya5;
import p149l.yij0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes4.dex */
public class MediaReorderCard extends VReorderCard {

    /* JADX INFO: renamed from: Q0 */
    public static String f32952Q0 = "RepeatPicture";

    /* JADX INFO: renamed from: R0 */
    public static String f32953R0 = "NetPictur";

    /* JADX INFO: renamed from: A */
    public TextView f32954A;

    /* JADX INFO: renamed from: B */
    public ImageView f32955B;

    /* JADX INFO: renamed from: C */
    public VFrame_Anim f32956C;

    /* JADX INFO: renamed from: D */
    public ImageView f32957D;

    /* JADX INFO: renamed from: E */
    public VProgressBar f32958E;

    /* JADX INFO: renamed from: E0 */
    public PhotoLowModelData f32959E0;

    /* JADX INFO: renamed from: F */
    public VProgressBar f32960F;

    /* JADX INFO: renamed from: F0 */
    public PhotoLowModelData f32961F0;

    /* JADX INFO: renamed from: G */
    public ImageView f32962G;

    /* JADX INFO: renamed from: G0 */
    public PhotoLowModelData f32963G0;

    /* JADX INFO: renamed from: H */
    public ImageView f32964H;

    /* JADX INFO: renamed from: H0 */
    public PhotoLowModelData f32965H0;

    /* JADX INFO: renamed from: I */
    public C22393b<roj0> f32966I;

    /* JADX INFO: renamed from: I0 */
    public cwf0 f32967I0;

    /* JADX INFO: renamed from: J */
    public c4g0 f32968J;

    /* JADX INFO: renamed from: J0 */
    public cwf0 f32969J0;

    /* JADX INFO: renamed from: K */
    public boolean f32970K;

    /* JADX INFO: renamed from: K0 */
    public long f32971K0;

    /* JADX INFO: renamed from: L */
    public String f32972L;

    /* JADX INFO: renamed from: L0 */
    public Runnable f32973L0;

    /* JADX INFO: renamed from: M */
    public String f32974M;

    /* JADX INFO: renamed from: M0 */
    public Media f32975M0;

    /* JADX INFO: renamed from: N */
    public Media f32976N;

    /* JADX INFO: renamed from: N0 */
    public FakeCardBgView f32977N0;

    /* JADX INFO: renamed from: O */
    public c4g0 f32978O;

    /* JADX INFO: renamed from: O0 */
    public int f32979O0;

    /* JADX INFO: renamed from: P */
    public g30<Media, Boolean, Boolean> f32980P;

    /* JADX INFO: renamed from: P0 */
    public ObjectAnimator f32981P0;

    /* JADX INFO: renamed from: Q */
    public List<String> f32982Q;

    /* JADX INFO: renamed from: R */
    public List<Media> f32983R;

    /* JADX INFO: renamed from: S */
    public View f32984S;

    /* JADX INFO: renamed from: T */
    public boolean f32985T;

    /* JADX INFO: renamed from: U */
    public boolean f32986U;

    /* JADX INFO: renamed from: V */
    public boolean f32987V;

    /* JADX INFO: renamed from: W */
    public CardType f32988W;

    /* JADX INFO: renamed from: k0 */
    public CardDataType f32989k0;

    /* JADX INFO: renamed from: p0 */
    public boolean f32990p0;

    /* JADX INFO: renamed from: r */
    public MediaReorderCardScaleIndependentFrame f32991r;

    /* JADX INFO: renamed from: s */
    public VDraweeView f32992s;

    /* JADX INFO: renamed from: t */
    public View f32993t;

    /* JADX INFO: renamed from: u */
    public VImage f32994u;

    /* JADX INFO: renamed from: v */
    public VText f32995v;

    /* JADX INFO: renamed from: w */
    public ShimmerLayout f32996w;

    /* JADX INFO: renamed from: x */
    public VText f32997x;

    /* JADX INFO: renamed from: y */
    public TextView f32998y;

    /* JADX INFO: renamed from: z */
    public LinearLayout f32999z;

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
        this.f32966I = C22393b.m221521b();
        this.f32968J = null;
        this.f32970K = false;
        this.f32972L = pj90.f149720h;
        this.f32982Q = new ArrayList(1);
        this.f32983R = new ArrayList();
        this.f32985T = true;
        this.f32986U = false;
        this.f32987V = false;
        this.f32988W = CardType.AVATAR;
        this.f32979O0 = -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E */
    public static /* synthetic */ roj0 m50590E(xaj0 xaj0Var) {
        if (((Boolean) xaj0Var.f191751a).booleanValue()) {
            throw new IllegalPictureException("检测到敏感信息，上传失败");
        }
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ Media m50595J(List list) {
        return (Media) list.get(0);
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ Picture m50602Q(Media media) {
        return (Picture) media;
    }

    /* JADX INFO: renamed from: Z */
    public static /* synthetic */ Video m50611Z(List list) {
        return (Video) list.get(0);
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ Picture m50622k0(List list) {
        return (Picture) list.get(0);
    }

    /* JADX INFO: renamed from: r0 */
    public static /* synthetic */ void m50629r0(Throwable th) {
    }

    /* JADX INFO: renamed from: w0 */
    private void m50634w0(View view) {
        fwx.m123577a(this, view);
    }

    /* JADX INFO: renamed from: A0 */
    public final void m50635A0() {
        mkd0.m154992z(this.f32968J);
    }

    /* JADX INFO: renamed from: A1 */
    public final void m50636A1() {
        if (getWidth() <= 0 || getHeight() <= 0) {
            return;
        }
        measureChildWithMargins(this.f32995v, ffx.m121198a(getWidth()), 0, ffx.m121198a(getHeight()), 0);
        int height = getHeight() - ((FrameLayout.LayoutParams) this.f32995v.getLayoutParams()).bottomMargin;
        int width = (getWidth() / 2) - (this.f32995v.getMeasuredWidth() / 2);
        int measuredWidth = this.f32995v.getMeasuredWidth() + width;
        this.f32995v.layout(width, height - this.f32995v.getMeasuredHeight(), measuredWidth, height);
    }

    /* JADX INFO: renamed from: B0 */
    public final C22306c<Picture> m50637B0(final Picture picture) {
        return C22306c.just(picture).observeOn(jo0.m142408a()).map(new w9j() { // from class: l.lvx
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return CoreModule.f17545c.f19639e0.m169516ma();
            }
        }).observeOn(Schedulers.m221493io()).flatMap(new w9j() { // from class: l.mvx
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f136003a.m50669R0(picture, (User) obj);
            }
        });
    }

    /* JADX INFO: renamed from: B1 */
    public void m50638B1() {
        if (getWidth() <= 0 || getHeight() <= 0) {
            return;
        }
        requestLayout();
        measure(ffx.m121199b(getWidth()), ffx.m121199b(getHeight()));
        layout(getLeft(), getTop(), getLeft() + getWidth(), getTop() + getHeight());
    }

    /* JADX INFO: renamed from: C0 */
    public final C22306c<roj0> m50639C0(Media media) {
        return (qib0.f154703R.m94727c() && (media instanceof Picture)) ? qib0.f154703R.m94726b(Uri.parse(media.url).getPath()).map(new w9j() { // from class: l.dvx
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return MediaReorderCard.m50590E((xaj0) obj);
            }
        }) : C22306c.just(roj0.f160388a);
    }

    /* JADX INFO: renamed from: C1 */
    public void m50640C1(Media media) {
        m50642D1(media, false, true);
    }

    /* JADX INFO: renamed from: D0 */
    public final void m50641D0() {
        if (this.f32979O0 == 0 || !lqa.m150985w() || m50659M0()) {
            getMediaOperation().mo43246n0(m50800v(), false, false, true);
        } else {
            ura.m195053e().m195057d().mo33806bp((Act) getContext(), this.f32972L, "");
        }
    }

    /* JADX INFO: renamed from: D1 */
    public void m50642D1(Media media, boolean z, boolean z2) {
        m50635A0();
        if (NullChecker.m81303a(media) && NullChecker.m81303a(this.f32976N)) {
            media.tags = this.f32976N.tags;
        }
        this.f32976N = media;
        m50668Q1("render");
        m50646F1();
        if (NullChecker.m81303a(this.f32980P)) {
            this.f32980P.mo36055a(media, Boolean.valueOf(z), Boolean.valueOf(z2));
        }
    }

    /* JADX INFO: renamed from: E0 */
    public void m50643E0(ArrayList<CharSequence> arrayList) {
        c40.C16057b c16057b = new c40.C16057b(getContext());
        c16057b.m105156I(m50709x0().getString(R$string.f27815a)).m105168U(new View.OnClickListener() { // from class: l.fvx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99482a.m50671S0(view);
            }
        }).m105164Q(arrayList).m105169V(new c40.InterfaceC16059d() { // from class: l.gvx
            @Override // p149l.c40.InterfaceC16059d
            /* JADX INFO: renamed from: a */
            public final void mo41896a(VListCell vListCell, VListCell.C22545a c22545a, int i) {
                this.f104610a.m50673T0(vListCell, c22545a, i);
            }
        });
        c40 c40VarM105153F = c16057b.m105153F();
        this.f33047d = c40VarM105153F;
        c40VarM105153F.m105117f();
    }

    /* JADX INFO: renamed from: E1 */
    public void m50644E1(int i, String str) {
        String string;
        if (TextUtils.equals(str, "p_edit_profile_view") && ura.m195053e().m195057d().mo33684F7()) {
            return;
        }
        if (i == 0 || i == 1) {
            string = m50709x0().getString(R$string.f27844e4);
        } else if (i == 2) {
            string = m50709x0().getString(R$string.f27850f4);
        } else if (i == 3) {
            string = m50709x0().getString(R$string.f27856g4);
        } else if (i != 4) {
            string = i != 5 ? "" : m50709x0().getString(R$string.f27868i4);
        } else {
            string = m50709x0().getString(R$string.f27862h4);
        }
        this.f32997x.setText(string);
        xdl0.m208345M0(this.f32997x, (lqa.m150985w() || lqa.m150975m() || lqa.m150976n() || !lqa.m150972j() || NullChecker.m81303a(this.f32976N)) ? false : true);
    }

    /* JADX INFO: renamed from: F0 */
    public void m50645F0(String str) {
        String str2 = ogw.m164284e(str) + ".jpg";
        File fileM21054G1 = CropperAct.m21054G1(getContext());
        if (!fileM21054G1.exists()) {
            fileM21054G1.mkdir();
        }
        File file = new File(fileM21054G1, str2);
        if (file.exists()) {
            getMediaOperation().mo43239f2(m50800v(), file.getAbsolutePath());
        } else {
            m50709x0().progress((String) null);
            C13111a.m79654u().m79665o(new DownloadTask.C13110b(qib0.f154693H.getDownloadHttp()).m79642q(str).m79640o(file.getAbsolutePath()).m79635j(new f30() { // from class: l.xvx
                @Override // p149l.f30
                public final void call(Object obj, Object obj2) {
                    this.f194677a.m50675U0((DownloadTask) obj, (File) obj2);
                }
            }).m79631f(new f30() { // from class: l.yvx
                @Override // p149l.f30
                public final void call(Object obj, Object obj2) {
                    this.f200296a.m50677V0((DownloadTask) obj, (Throwable) obj2);
                }
            }).m79626a());
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:56:0x010a  */
    /* JADX WARN: Code duplicated, block: B:61:0x013b  */
    /* JADX WARN: Code duplicated, block: B:63:0x013f  */
    /* JADX WARN: Code duplicated, block: B:70:0x0168  */
    /* JADX INFO: renamed from: F1 */
    public void m50646F1() {
        Media media;
        mo50692k(this.f32976N == null);
        xdl0.m208344M(this.f32955B, (this.f32976N instanceof Video) && !lqa.m150985w());
        xdl0.m208344M(this.f32964H, (this.f32976N instanceof Video) && lqa.m150985w());
        if (NullChecker.m81303a(this.f32976N) && NullChecker.m81303a(this.f32976N.cover()) && NullChecker.m81303a(this.f32976N.cover().url)) {
            xdl0.m208353Q0(this.f32992s, new e30() { // from class: l.xux
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f194563a.m50683b1((int[]) obj);
                }
            });
        } else {
            Media media2 = this.f32976N;
            if (media2 instanceof Video) {
                qib0.f154691G.m102367m0(this.f32992s, media2.url);
            } else {
                qib0.f154691G.m184725o(this.f32992s);
            }
        }
        if (NullChecker.m81303a(this.f32976N) && this.f32978O == null && !TEnum.equals(this.f32976N.status, "normal")) {
            m50662N1(this.f32957D);
            setCropPicStateVisibility(false);
        }
        if (this.f32976N == null) {
            m50662N1(null);
            this.f32993t.setAlpha(0.0f);
        }
        if (ura.m195053e().m195057d().mo33756Ua() && NullChecker.m81303a(this.f32976N)) {
            Media media3 = this.f32976N;
            if ((media3 instanceof Picture) && ((Picture) media3).isAiFakePic()) {
                m50662N1(this.f32957D);
                this.f32993t.animate().alpha(1.0f).start();
            } else if (ura.m195053e().m195057d().mo33798ak()) {
                media = this.f32976N;
                if (!(media instanceof Picture)) {
                    if (this.f32990p0) {
                        this.f32993t.animate().alpha(0.0f).start();
                    } else {
                        this.f32993t.animate().alpha(0.0f).start();
                    }
                } else if (this.f32990p0) {
                    this.f32993t.animate().alpha(0.0f).start();
                } else {
                    this.f32993t.animate().alpha(0.0f).start();
                }
            } else {
                media = this.f32976N;
                if (!(media instanceof Picture)) {
                    if (this.f32990p0) {
                        this.f32993t.animate().alpha(0.0f).start();
                    } else {
                        this.f32993t.animate().alpha(0.0f).start();
                    }
                } else if (this.f32990p0) {
                    this.f32993t.animate().alpha(0.0f).start();
                } else {
                    this.f32993t.animate().alpha(0.0f).start();
                }
            }
        } else if ((ura.m195053e().m195057d().mo33798ak() || ura.m195053e().m195057d().mo33687Fl()) && NullChecker.m81303a(this.f32976N)) {
            media = this.f32976N;
            if (!(media instanceof Picture) && (((Picture) media).isLabelJudge(MediaLabel.get(MediaLabel.WITH_REPEAT_MAIN_PICTURE)) || ((Picture) this.f32976N).isLabelJudge(MediaLabel.get(MediaLabel.WITH_NET_MAIN_PICTURE)))) {
                m50662N1(this.f32957D);
                this.f32993t.animate().alpha(1.0f).start();
            } else if (this.f32990p0 || !NullChecker.m81303a(this.f32976N)) {
                this.f32993t.animate().alpha(0.0f).start();
            } else {
                Media media4 = this.f32976N;
                if ((media4 instanceof Picture) && ((Picture) media4).isLow()) {
                    m50662N1(this.f32957D);
                    this.f32993t.animate().alpha(1.0f).start();
                } else {
                    this.f32993t.animate().alpha(0.0f).start();
                }
            }
        } else if (this.f32990p0) {
            this.f32993t.animate().alpha(0.0f).start();
        } else {
            this.f32993t.animate().alpha(0.0f).start();
        }
        setCropPicStateVisibility(!xdl0.m208349O0(this.f32957D) && NullChecker.m81303a(this.f32976N));
        m50650H1();
    }

    /* JADX INFO: renamed from: G0 */
    public final void m50647G0(final Media media) throws Throwable {
        boolean z;
        if (m50709x0() == null || m50709x0().isFinishing() || m50709x0().isDestroyed()) {
            return;
        }
        if (lqa.m150971i() && NullChecker.m81303a(this.f32976N) && (media instanceof Picture) && TEnum.equals(this.f32976N.status, MediaLocalStatus.preprocessed)) {
            Picture picture = (Picture) media;
            String strM164283d = ogw.m164283d(new File(rhi.m179382z(this.f32976N.url)));
            Dimension dimension = picture.size;
            int i = dimension.width;
            int i2 = dimension.height;
            o6j0.m162869m("e_hyper_profile_pic_double_check", "p_edit_profile_view", o6j0.C18854a.m162878h("pic_trace_id", strM164283d), o6j0.C18854a.m162878h("pic_trace_type", "trimmed"), o6j0.C18854a.m162878h("pic_trace_url", media.url), o6j0.C18854a.m162878h("pic_trace_resolution", picture.size.width + BaseSei.f13930X + picture.size.height));
            CoreModule.f17545c.f19639e0.f149184H1.onNext(this.f32976N.url);
        }
        if (NullChecker.m81303a(this.f32976N) && NullChecker.m81303a(media)) {
            Media media2 = this.f32976N;
            media2.status = media.status;
            media.tags = media2.tags;
        }
        boolean z2 = false;
        if (m50800v() == 0 && (media instanceof Picture)) {
            Picture picture2 = (Picture) media;
            boolean zIsLabelJudge = picture2.isLabelJudge(MediaLabel.get(MediaLabel.WITH_REPEAT_MAIN_PICTURE));
            boolean z3 = this.f32990p0 && picture2.isLow();
            boolean zIsLabelJudge2 = picture2.isLabelJudge(MediaLabel.get(MediaLabel.WITH_NET_MAIN_PICTURE));
            picture2.isLabelJudge(MediaLabel.get(MediaLabel.NOT_VERIFICATION));
            if (ura.m195053e().m195057d().mo33798ak()) {
                m50642D1(media, true, false);
                if (zIsLabelJudge) {
                    m50660M1(f32952Q0);
                } else if (z3) {
                    m50658L1();
                } else if (zIsLabelJudge2) {
                    m50660M1(f32953R0);
                }
                z = false;
            } else if (ura.m195053e().m195057d().mo33687Fl()) {
                m50642D1(media, true, false);
                if (zIsLabelJudge) {
                    m50660M1(f32952Q0);
                } else if (z3) {
                    m50658L1();
                }
                z = false;
            } else {
                if (lqa.m150985w() && z3 && NullChecker.m81303a(this.f32975M0)) {
                    m50662N1(null);
                    m50642D1(this.f32975M0, true, false);
                    m50658L1();
                } else {
                    m50642D1(media, true, false);
                    if (z3) {
                        m50658L1();
                    }
                }
                z = false;
            }
            if (TEnum.equals(media.status, "normal") || !z) {
            }
            this.f32983R.add(media);
            this.f32978O = null;
            m50662N1(this.f32962G);
            postDelayed(new Runnable() { // from class: l.evx
                @Override // java.lang.Runnable
                public final void run() {
                    this.f93401a.m50678W0(media);
                }
            }, 1000L);
            setCropPicStateVisibility(true);
            boolean z4 = !ura.m195053e().m195057d().mo33819ee(m50709x0());
            CardType cardType = this.f32988W;
            if (cardType != CardType.LIFE_MOMENT && cardType != CardType.MARRY_AVATAR && cardType != CardType.MY_LIFT) {
                z2 = z4;
            }
            if (z2 && !TextUtils.equals(this.f32974M, CoreStaticData.ProfileFromType.FROM_EXPLORE)) {
                hdb0.m130575c().m130582i(new SimplePushBubble.C4372a(m50709x0(), LayoutInflater.from(m50709x0()).inflate(n6c0.f137336Z0, (ViewGroup) null)).m21164B(1).m21176z(CorePopLevel.MediaReorderCardDone).m21169s());
            }
            if (NullChecker.m81303a(this.f33046c.f87435f.f33076i)) {
                this.f33046c.f87435f.f33076i.mo50821a(m50800v(), true);
            }
            CoreModule.f17545c.f19639e0.f149177G1.onNext(roj0.f160388a);
            return;
        }
        m50642D1(media, true, false);
        z = true;
        if (TEnum.equals(media.status, "normal")) {
        }
    }

    /* JADX INFO: renamed from: G1 */
    public boolean m50648G1() {
        Boolean bool = Boolean.FALSE;
        j760<Boolean, Boolean> j760VarM140076a = j760.m140076a(bool, bool);
        if (NullChecker.m81303a(this.f33056m)) {
            j760VarM140076a = this.f33056m.mo123527Q1();
        }
        if (!NullChecker.m81303a(j760VarM140076a) || !NullChecker.m81303a(j760VarM140076a.f116564a) || !j760VarM140076a.f116564a.booleanValue()) {
            if (!m50705u1()) {
                return false;
            }
            m50656K1();
            return true;
        }
        if (!NullChecker.m81303a(j760VarM140076a.f116565b) || !j760VarM140076a.f116565b.booleanValue()) {
            return false;
        }
        m50656K1();
        return true;
    }

    /* JADX INFO: renamed from: H0, reason: merged with bridge method [inline-methods] */
    public final void m50701r1(Throwable th) {
        setVisibility(0);
        this.f32978O = null;
        setCropPicStateVisibility(false);
        m50662N1(this.f32957D);
        setCropPicStateVisibility(false);
        if (NullChecker.m81303a(this.f33046c.f87435f.f33076i)) {
            this.f33046c.f87435f.f33076i.mo50821a(m50800v(), false);
        }
        if (m50800v() == 0 && (this.f32976N instanceof Picture) && NullChecker.m81303a(this.f32975M0) && lqa.m150985w()) {
            m50662N1(null);
            m50642D1(this.f32975M0, true, false);
        }
        if (th instanceof IllegalPictureException) {
            lsi0.m151595y(((IllegalPictureException) th).getMessage());
        }
    }

    /* JADX INFO: renamed from: H1 */
    public final void m50650H1() {
        if (m50659M0()) {
            xdl0.m208345M0(this.f32954A, false);
            return;
        }
        if (!NullChecker.m81303a(this.f32976N) || TextUtils.isEmpty(this.f32976N.url) || this.f32970K || !this.f32986U) {
            xdl0.m208345M0(this.f32954A, false);
            return;
        }
        xdl0.m208345M0(this.f32954A, true);
        this.f32954A.setCompoundDrawables(null, null, null, null);
        TextView textView = this.f32954A;
        int i = t100.f167259h;
        textView.setPadding(i, 0, i, 0);
        if (m50800v() == 0) {
            this.f32954A.setBackgroundResource(e3c0.f89126m);
            this.f32954A.setText("封面");
            this.f32954A.setTextColor(Color.parseColor("#ffffffff"));
        } else {
            NewTags newTagsMo33691Gh = !vwb.m200296J(this.f32976N.tags) ? ura.m195053e().m195057d().mo33691Gh(this.f32976N.tags.get(0)) : null;
            if (!NullChecker.m81303a(newTagsMo33691Gh) || TextUtils.isEmpty(newTagsMo33691Gh.name)) {
                boolean z = this.f32987V;
                TextView textView2 = this.f32954A;
                if (z) {
                    textView2.setTextColor(Color.parseColor("#FFFE7E1D"));
                    this.f32954A.setText("添加标签");
                    Drawable drawable = getContext().getResources().getDrawable(e3c0.f89134o1);
                    drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
                    this.f32954A.setCompoundDrawables(drawable, null, null, null);
                    this.f32954A.setCompoundDrawablePadding(t100.f167254c);
                    this.f32954A.setPadding(t100.f167258g, 0, i, 0);
                    xdl0.m208329E0(this.f32954A, new View.OnClickListener() { // from class: l.sux
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f166506a.m50685d1(view);
                        }
                    });
                } else {
                    xdl0.m208345M0(textView2, false);
                }
            } else {
                this.f32954A.setTextColor(Color.parseColor("#CC000000"));
                this.f32954A.setText(newTagsMo33691Gh.name);
                xdl0.m208329E0(this.f32954A, new View.OnClickListener() { // from class: l.rux
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f161147a.m50684c1(view);
                    }
                });
            }
            this.f32954A.setBackgroundResource(e3c0.f89135p);
        }
        this.f32954A.getPaint().setFakeBoldText(true);
        measure(View.MeasureSpec.makeMeasureSpec(getWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getHeight(), 1073741824));
        layout(getLeft(), getTop(), getLeft() + getMeasuredWidth(), getTop() + getMeasuredHeight());
    }

    /* JADX INFO: renamed from: I0 */
    public void m50651I0(int i) {
        if (ura.m195053e().m195057d().mo33684F7()) {
            this.f32979O0 = i;
            m50654J1();
        }
    }

    /* JADX INFO: renamed from: I1 */
    public void m50652I1(boolean z, boolean z2) {
        this.f32986U = z;
        this.f32987V = z2;
    }

    /* JADX INFO: renamed from: J0 */
    public void m50653J0(int i, CardType cardType) {
        this.f32979O0 = i;
        this.f32988W = cardType;
        djj hierarchy = this.f32992s.getHierarchy();
        int i2 = t100.f167260i;
        hierarchy.m112053H(RoundingParams.m8248b(i2, i2, i2, i2));
        m50654J1();
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0188  */
    /* JADX INFO: renamed from: J1 */
    public void m50654J1() {
        CardDataType cardDataType;
        CardType cardType = this.f32988W;
        CardType cardType2 = CardType.AVATAR;
        CardDataType cardDataType2 = null;
        if (cardType != cardType2 && cardType != CardType.MARRY_AVATAR && cardType != CardType.MY_LIFT) {
            if (cardType != CardType.LIFE_MOMENT || this.f32979O0 < 0) {
                return;
            }
            this.f32991r.setBackgroundResource(e3c0.f89155v1);
            if (this.f32977N0 == null) {
                FakeCardBgView fakeCardBgView = new FakeCardBgView(getContext(), null);
                this.f32977N0 = fakeCardBgView;
                this.f32991r.addView(fakeCardBgView);
                this.f32977N0.setGravity(17);
            }
            if (lqa.m150976n()) {
                boolean z = getParent() instanceof MediaReorderCards ? ((MediaReorderCards) getParent()).f33002C : false;
                int i = this.f32979O0;
                if (z) {
                    if (i <= 0 || i >= 3) {
                        this.f32977N0.f29527b.setTextColor(Color.parseColor("#e2e2e2"));
                        this.f32977N0.f29528c.setTextColor(Color.parseColor("#e2e2e2"));
                        if (this.f32977N0.f29526a.getBackground() != null) {
                            this.f32977N0.f29526a.getBackground().clearColorFilter();
                        }
                        this.f32991r.getBackground().clearColorFilter();
                    } else {
                        this.f32977N0.f29527b.setTextColor(Color.parseColor("#FF7602"));
                        this.f32977N0.f29528c.setTextColor(Color.parseColor("#FF7602"));
                        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(Color.parseColor("#ff7602"), PorterDuff.Mode.SRC_ATOP);
                        this.f32991r.getBackground().setColorFilter(porterDuffColorFilter);
                        if (!porterDuffColorFilter.equals(this.f32977N0.f29526a.getBackground().getColorFilter())) {
                            Drawable drawableMutate = this.f32977N0.f29526a.getBackground().mutate();
                            drawableMutate.setColorFilter(porterDuffColorFilter);
                            this.f32977N0.f29526a.setImageDrawable(drawableMutate);
                        }
                    }
                } else if (i <= 0 || i >= 3) {
                    ObjectAnimator objectAnimator = this.f32981P0;
                    if (objectAnimator != null && objectAnimator.isRunning()) {
                        this.f32981P0.cancel();
                    }
                    this.f32977N0.f29527b.setTextColor(Color.parseColor("#e2e2e2"));
                    this.f32977N0.f29528c.setTextColor(Color.parseColor("#e2e2e2"));
                    this.f32991r.getBackground().clearColorFilter();
                    if (this.f32977N0.f29526a.getBackground() != null) {
                        this.f32977N0.f29526a.getBackground().clearColorFilter();
                    }
                }
            }
            this.f32977N0.m45974b(this.f32979O0);
            xdl0.m208345M0(this.f32977N0, this.f32976N == null);
            return;
        }
        if (!ura.m195053e().m195057d().mo33684F7() || this.f32979O0 == -1) {
            return;
        }
        boolean zMo33606v4 = CoreModule.m29935P().m94651a().mo33606v4();
        MediaReorderCardScaleIndependentFrame mediaReorderCardScaleIndependentFrame = this.f32991r;
        if (zMo33606v4) {
            mediaReorderCardScaleIndependentFrame.setBackgroundResource(e3c0.f89005A);
        } else {
            mediaReorderCardScaleIndependentFrame.setBackgroundResource(e3c0.f89155v1);
        }
        if (this.f32977N0 == null) {
            if (lqa.m150975m()) {
                CardDataType cardDataType3 = this.f32989k0;
                CardDataType cardDataType4 = CardDataType.LIFE;
                if (cardDataType3 == cardDataType4) {
                    cardDataType2 = cardDataType4;
                } else if (lqa.m150976n() && (cardDataType = this.f32989k0) != (cardDataType2 = CardDataType.EDIT) && cardDataType != (cardDataType2 = CardDataType.DIALOG)) {
                    cardDataType2 = CardDataType.DEFAULT;
                }
            } else if (lqa.m150976n()) {
                cardDataType2 = CardDataType.DEFAULT;
            }
            FakeCardBgView fakeCardBgView2 = new FakeCardBgView(getContext(), cardDataType2);
            this.f32977N0 = fakeCardBgView2;
            this.f32991r.addView(fakeCardBgView2);
            this.f32977N0.setGravity(17);
        }
        if (lqa.m150973k() || lqa.m150974l()) {
            boolean z2 = getParent() instanceof MediaReorderCards ? ((MediaReorderCards) getParent()).f33002C : false;
            int i2 = this.f32979O0;
            if (z2) {
                if (i2 <= 0 || i2 >= 3) {
                    this.f32977N0.f29527b.setTextColor(Color.parseColor("#e2e2e2"));
                    this.f32977N0.f29528c.setTextColor(Color.parseColor("#e2e2e2"));
                    if (this.f32977N0.f29526a.getBackground() != null) {
                        this.f32977N0.f29526a.getBackground().clearColorFilter();
                    }
                    this.f32991r.getBackground().clearColorFilter();
                } else {
                    this.f32977N0.f29527b.setTextColor(Color.parseColor("#FF7602"));
                    this.f32977N0.f29528c.setTextColor(Color.parseColor("#FF7602"));
                    PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(Color.parseColor("#ff7602"), PorterDuff.Mode.SRC_ATOP);
                    this.f32991r.getBackground().setColorFilter(porterDuffColorFilter2);
                    if (!porterDuffColorFilter2.equals(this.f32977N0.f29526a.getBackground().getColorFilter())) {
                        Drawable drawableMutate2 = this.f32977N0.f29526a.getBackground().mutate();
                        drawableMutate2.setColorFilter(porterDuffColorFilter2);
                        this.f32977N0.f29526a.setImageDrawable(drawableMutate2);
                    }
                }
            } else if (i2 <= 0 || i2 >= 3) {
                ObjectAnimator objectAnimator2 = this.f32981P0;
                if (objectAnimator2 != null && objectAnimator2.isRunning()) {
                    this.f32981P0.cancel();
                }
                this.f32977N0.f29527b.setTextColor(Color.parseColor("#e2e2e2"));
                this.f32977N0.f29528c.setTextColor(Color.parseColor("#e2e2e2"));
                this.f32991r.getBackground().clearColorFilter();
                if (this.f32977N0.f29526a.getBackground() != null) {
                    this.f32977N0.f29526a.getBackground().clearColorFilter();
                }
            }
        }
        FakeCardBgView fakeCardBgView3 = this.f32977N0;
        int i3 = this.f32979O0;
        CardType cardType3 = this.f32988W;
        fakeCardBgView3.m45975c(i3, cardType3 == cardType2 || cardType3 == CardType.MARRY_AVATAR);
        xdl0.m208345M0(this.f32977N0, this.f32976N == null);
    }

    /* JADX INFO: renamed from: K0 */
    public boolean m50655K0() {
        return this.f32983R.size() > 0;
    }

    /* JADX INFO: renamed from: K1 */
    public final void m50656K1() {
        new lew(m50709x0(), new Runnable() { // from class: l.yux
            @Override // java.lang.Runnable
            public final void run() {
                this.f200139a.m50686e1();
            }
        }, new Runnable() { // from class: l.zux
            @Override // java.lang.Runnable
            public final void run() {
                this.f204914a.m50641D0();
            }
        }).show();
    }

    /* JADX INFO: renamed from: L0 */
    public boolean m50657L0() {
        return this.f32970K;
    }

    /* JADX INFO: renamed from: L1 */
    public final void m50658L1() {
        if (!NullChecker.m81303a(this.f32959E0) || TextUtils.isEmpty(this.f32959E0.conclusion)) {
            return;
        }
        if (this.f32967I0 == null) {
            this.f32967I0 = new cwf0("p_lowqualityphoto__popup", Dialog.class.getName());
        }
        new dd80.C16336a(m50709x0()).m110996y0("温馨提示").m110991t0(this.f32959E0.conclusion).m110974c0("更换照片", new Runnable() { // from class: l.ovx
            @Override // java.lang.Runnable
            public final void run() {
                this.f145891a.m50687f1();
            }
        }).m110969X("稍后再说", new Runnable() { // from class: l.pvx
            @Override // java.lang.Runnable
            public final void run() {
                this.f151520a.m50688g1();
            }
        }).m110986o0(new DialogInterface.OnShowListener() { // from class: l.qvx
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f156639a.m50689h1(dialogInterface);
            }
        }).m110985n0(new DialogInterface.OnDismissListener() { // from class: l.rvx
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f161285a.m50690i1(dialogInterface);
            }
        }).m110989r0();
    }

    /* JADX INFO: renamed from: M0 */
    public final boolean m50659M0() {
        if (!lqa.m150979q()) {
            return false;
        }
        if (CoreModule.f17545c.f19639e0.f149321Z3.get().equals(UserHomeMode.marryMode) || TextUtils.equals(this.f32972L, "data_from_marry")) {
            return true;
        }
        String strPageId = m50709x0().pageId();
        return TextUtils.equals(strPageId, "p_edit_life_moment") || TextUtils.equals(strPageId, "p_marriage_profile_edit");
    }

    /* JADX INFO: renamed from: M1 */
    public final void m50660M1(String str) {
        String str2;
        final String str3;
        if (this.f32969J0 == null) {
            this.f32969J0 = new cwf0("p_lowqualityphoto__popup", Dialog.class.getName());
        }
        if (TextUtils.equals(str, f32952Q0) && NullChecker.m81303a(this.f32961F0)) {
            PhotoLowModelData photoLowModelData = this.f32961F0;
            str2 = photoLowModelData.conclusion;
            str3 = photoLowModelData.mapping;
        } else if (TextUtils.equals(str, f32953R0) && NullChecker.m81303a(this.f32963G0)) {
            PhotoLowModelData photoLowModelData2 = this.f32963G0;
            str2 = photoLowModelData2.conclusion;
            str3 = photoLowModelData2.mapping;
        } else {
            str2 = "";
            str3 = "";
        }
        this.f32969J0.m109040p(j760.m140076a("lowquality_reason", str3));
        new dd80.C16336a(m50709x0()).m110996y0("温馨提示").m110991t0(str2).m110974c0("更换照片", new Runnable() { // from class: l.svx
            @Override // java.lang.Runnable
            public final void run() {
                this.f166600a.m50691j1(str3);
            }
        }).m110969X("稍后再说", new Runnable() { // from class: l.uvx
            @Override // java.lang.Runnable
            public final void run() {
                zvf0.m220399u("e_replace_photo_cancel", "p_lowqualityphoto__popup", j760.m140076a("lowquality_reason", str3));
            }
        }).m110986o0(new DialogInterface.OnShowListener() { // from class: l.vvx
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f183276a.m50693k1(dialogInterface);
            }
        }).m110985n0(new DialogInterface.OnDismissListener() { // from class: l.wvx
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f188296a.m50694l1(dialogInterface);
            }
        }).m110989r0();
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m50661N0() {
        m50640C1(this.f32976N);
        if (NullChecker.m81303a(this.f33046c.f87435f.f33075h)) {
            this.f33046c.f87435f.f33075h.mo51215a();
        }
    }

    /* JADX INFO: renamed from: N1 */
    public void m50662N1(View view) {
        this.f32956C.m223023C(view, new w9j() { // from class: l.vux
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((View) obj).animate().alpha(1.0f).setDuration(200L);
            }
        }, new w9j() { // from class: l.wux
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((View) obj).animate().alpha(0.0f).setDuration(200L);
            }
        });
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m50663O0(Drawable drawable, Drawable drawable2, ValueAnimator valueAnimator) {
        if (xdl0.m208349O0(this.f32977N0.f29528c)) {
            this.f32977N0.f29528c.setTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(((Integer) valueAnimator.getAnimatedValue()).intValue(), PorterDuff.Mode.SRC_ATOP);
        drawable.setColorFilter(porterDuffColorFilter);
        drawable2.setColorFilter(porterDuffColorFilter);
    }

    /* JADX INFO: renamed from: O1 */
    public final void m50664O1() {
        this.f32968J = this.f32966I.observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.bvx
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f77500a.m50695m1((roj0) obj);
            }
        }, new e30() { // from class: l.cvx
            @Override // p149l.e30
            public final void call(Object obj) {
                MediaReorderCard.m50629r0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m50665P0() {
        if (getParent() instanceof MediaReorderCards) {
            ((MediaReorderCards) getParent()).f33002C = true;
        }
    }

    /* JADX INFO: renamed from: P1 */
    public void m50666P1() {
        this.f32996w.m43767u();
        this.f32996w.m43766t();
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ Picture m50667Q0(Picture picture, Envelope envelope) {
        if (envelope.meta.code == 200) {
            CoreData coreData = (CoreData) envelope.data.getModuleData(CoreData.class);
            if (NullChecker.m81303a(coreData)) {
                this.f32959E0 = coreData.lowPhotoResult;
                this.f32961F0 = coreData.repeatPictureResult;
                this.f32963G0 = coreData.netPictureResult;
                this.f32965H0 = coreData.notVerificationResultData;
                if (ura.m195053e().m195057d().mo33798ak()) {
                    if (NullChecker.m81303a(this.f32961F0) && TextUtils.equals(this.f32961F0.audit, "repeat")) {
                        picture.setLabel(MediaLabel.get(MediaLabel.WITH_REPEAT_MAIN_PICTURE));
                    } else {
                        picture.removeLabel(MediaLabel.get(MediaLabel.WITH_REPEAT_MAIN_PICTURE));
                    }
                    if (NullChecker.m81303a(this.f32963G0) && TextUtils.equals(this.f32963G0.audit, "net")) {
                        picture.setLabel(MediaLabel.get(MediaLabel.WITH_NET_MAIN_PICTURE));
                    } else {
                        picture.removeLabel(MediaLabel.get(MediaLabel.WITH_NET_MAIN_PICTURE));
                    }
                }
                if (ura.m195053e().m195057d().mo33687Fl()) {
                    if (NullChecker.m81303a(this.f32961F0) && TextUtils.equals(this.f32961F0.audit, "repeat")) {
                        picture.setLabel(MediaLabel.get(MediaLabel.WITH_REPEAT_MAIN_PICTURE));
                    } else {
                        picture.removeLabel(MediaLabel.get(MediaLabel.WITH_REPEAT_MAIN_PICTURE));
                    }
                }
                if (this.f32990p0 && NullChecker.m81303a(this.f32959E0) && TextUtils.equals(this.f32959E0.audit, "low")) {
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
    public final void m50668Q1(String str) {
        this.f32982Q.add(str);
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ C22306c m50669R0(final Picture picture, User user) {
        return CoreModule.f17545c.f19639e0.m169393G9(picture.url, this.f32979O0 == 0 ? 1 : 2, null).map(new w9j() { // from class: l.nvx
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f140854a.m50667Q0(picture, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: R1 */
    public void m50670R1(int i) {
        if (this.f32979O0 == i || this.f32977N0 == null) {
            return;
        }
        m50651I0(i);
        m50638B1();
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m50671S0(View view) {
        this.f33047d.m105113b();
    }

    /* JADX INFO: renamed from: S1 */
    public void m50672S1(String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        VText vText = this.f32995v;
        if (zIsEmpty) {
            xdl0.m208345M0(vText, false);
            return;
        }
        xdl0.m208345M0(vText, true);
        this.f32995v.setText(m50709x0().getString(R$string.f27882l0, str));
        m50636A1();
    }

    /* JADX INFO: renamed from: T0 */
    public final /* synthetic */ void m50673T0(VListCell vListCell, VListCell.C22545a c22545a, int i) {
        this.f33047d.m105113b();
        if (TextUtils.equals(c22545a.f209159a, m50709x0().string(R$string.f27821b)) || TextUtils.equals(c22545a.f209159a, "更换头像")) {
            m50641D0();
            return;
        }
        if (TextUtils.equals(c22545a.f209159a, m50709x0().string(R$string.f27827c))) {
            if (ura.m195053e().m195057d().mo33664C(100015)) {
                getMediaOperation().mo43246n0(m50800v(), false, true, false);
                return;
            }
            return;
        }
        if (TextUtils.equals(c22545a.f209159a, m50709x0().string(R$string.f27878k2)) || TextUtils.equals(c22545a.f209159a, "重新裁剪照片")) {
            if (!TextUtils.equals(getCurPageId(), "p_upload_photos")) {
                o6j0.m162859c("e_picture_re_edit_button", "p_edit_profile_view", new o6j0.C18854a[0]);
            }
            if (NullChecker.m81303a(this.f32976N)) {
                this.f32983R.remove(this.f32976N);
                m50645F0(this.f32976N.url);
                CoreModule.f17545c.f19639e0.f149177G1.onNext(roj0.f160388a);
                return;
            }
            StringBuilder sb = new StringBuilder("MediaReorderCard error: ");
            for (int i2 = 0; i2 < this.f32982Q.size(); i2++) {
                if (i2 > 0) {
                    sb.append(", ");
                }
                sb.append(this.f32982Q.get(i2));
            }
            CrashHelper.m81296c(new NullPointerException(sb.toString()));
            return;
        }
        if (TextUtils.equals(c22545a.f209159a, m50709x0().string(R$string.f27851g))) {
            m50676U1();
            return;
        }
        if (!TextUtils.equals(c22545a.f209159a, m50709x0().string(R$string.f27833d)) && !TextUtils.equals(c22545a.f209159a, "删除该照片") && !TextUtils.equals(c22545a.f209159a, "删除该视频")) {
            if (TextUtils.equals(c22545a.f209159a, "编辑标签")) {
                m50711y0();
                return;
            } else {
                if (NullChecker.m81303a(this.f33056m)) {
                    this.f33056m.m123529g1(c22545a.f209159a, this.f32979O0);
                    return;
                }
                return;
            }
        }
        if (!TextUtils.equals(getCurPageId(), "p_upload_photos")) {
            o6j0.m162859c("e_profile_add_delete_photos", "p_edit_profile_view", o6j0.C18854a.m162878h("add_delete_picture", "delete_picture"), o6j0.C18854a.m162876f("picture_number", m50800v() + 1));
        }
        this.f32983R.remove(this.f32976N);
        this.f32976N = null;
        m50668Q1(RequestParameters.SUBRESOURCE_DELETE);
        m50674T1();
        m50792l();
        setIllegalPicture(false);
        m50642D1(null, true, false);
        m50644E1(m50800v(), getCurPageId());
        m50654J1();
        CoreModule.f17545c.f19639e0.f149177G1.onNext(roj0.f160388a);
    }

    /* JADX INFO: renamed from: T1 */
    public final void m50674T1() {
        if (NullChecker.m81303a(this.f32978O)) {
            m50662N1(null);
            yij0.m214943U(this.f32978O);
            this.f32993t.setAlpha(0.0f);
            this.f32978O = null;
        }
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ void m50675U0(DownloadTask downloadTask, File file) {
        m50709x0().progressDismiss();
        getMediaOperation().mo43239f2(m50800v(), file.getAbsolutePath());
    }

    /* JADX INFO: renamed from: U1 */
    public void m50676U1() {
        C22306c c22306cCompose;
        View view;
        m50635A0();
        TrackMediaUploadUtil.m80296a0(this.f32976N);
        Media media = this.f32976N;
        if (media instanceof Video) {
            m50664O1();
            c22306cCompose = this.f32976N.url.startsWith("http") ? C22306c.just(this.f32976N.mo223809clone()).map(new w9j() { // from class: l.zvx
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f205074a.m50702s1((Media) obj);
                }
            }) : new lsx(vwb.m200324f0(this.f32976N), true).map(new w9j() { // from class: l.awx
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return MediaReorderCard.m50595J((List) obj);
                }
            }).flatMap(new w9j() { // from class: l.bwx
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f77712a.m50703t1((Media) obj);
                }
            }).compose(TrackMediaUploadUtil.m80306f0("profile", vwb.m200324f0(this.f32976N), null));
        } else {
            boolean zStartsWith = media.url.startsWith("http");
            Media media2 = this.f32976N;
            c22306cCompose = (zStartsWith ? C22306c.just(media2.mo223809clone()).map(new w9j() { // from class: l.cwx
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return MediaReorderCard.m50602Q((Media) obj);
                }
            }) : m50639C0(media2).flatMap(new w9j() { // from class: l.dwx
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f88222a.m50696n1((roj0) obj);
                }
            }).map(new w9j() { // from class: l.ewx
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return MediaReorderCard.m50622k0((List) obj);
                }
            })).flatMap(new w9j() { // from class: l.nux
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f140657a.m50697o1((Picture) obj);
                }
            }).compose(TrackMediaUploadUtil.m80306f0("profile", vwb.m200324f0(this.f32976N), null));
        }
        m50662N1(this.f32958E);
        setIllegalPicture(false);
        if (m50800v() == 0 && (view = this.f32984S) != null) {
            view.setVisibility(0);
        }
        this.f32993t.animate().alpha(1.0f).start();
        this.f32978O = m50709x0().duringCreated(c22306cCompose.compose(mkd0.m154951C()).switchMap(new w9j() { // from class: l.oux
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f145750a.m50698p1((Media) obj);
            }
        })).subscribe(mkd0.m154956H(new e30() { // from class: l.pux
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f151369a.m50699q1((roj0) obj);
            }
        }, new e30() { // from class: l.qux
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f156552a.m50701r1((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ void m50677V0(DownloadTask downloadTask, Throwable th) {
        m50709x0().progressDismiss();
        lsi0.m151593w(R$string.f27721H0);
    }

    /* JADX INFO: renamed from: W0 */
    public final /* synthetic */ void m50678W0(Media media) {
        if (this.f32976N == media) {
            m50662N1(null);
            this.f32993t.animate().alpha(0.0f).start();
        }
    }

    /* JADX INFO: renamed from: X0 */
    public final /* synthetic */ void m50679X0(View view) {
        mo50704u();
    }

    /* JADX INFO: renamed from: Y0 */
    public final /* synthetic */ void m50680Y0(Picture picture, int[] iArr) {
        xdl0.m208345M0(this.f32997x, false);
        m50710x1(picture);
    }

    /* JADX INFO: renamed from: Z0 */
    public final /* synthetic */ void m50681Z0(Video video, int[] iArr) {
        long j = new r5l0(rhi.m179382z(video.url)).f157831b;
        if (j >= 16000) {
            lsi0.m151578h(R$string.f27695C2);
        } else if (j < 3000) {
            lsi0.m151578h(R$string.f27701D2);
        } else {
            m50710x1(video);
        }
    }

    /* JADX INFO: renamed from: a1 */
    public final /* synthetic */ void m50682a1() {
        getMediaOperation().mo45972i0(m50800v(), false);
    }

    /* JADX INFO: renamed from: b1 */
    public final /* synthetic */ void m50683b1(int[] iArr) {
        if (NullChecker.m81303a(this.f32976N) && NullChecker.m81303a(this.f32976N.cover()) && NullChecker.m81303a(this.f32976N.cover().url)) {
            if (getParent() instanceof ViewGroup) {
                ((ViewGroup) getParent()).indexOfChild(this);
            }
            qib0.f154691G.m102327J0(this.f32992s, this.f32976N.cover().profile480(), false);
        }
    }

    /* JADX INFO: renamed from: c1 */
    public final /* synthetic */ void m50684c1(View view) {
        m50711y0();
    }

    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ void m50685d1(View view) {
        m50711y0();
    }

    /* JADX INFO: renamed from: e1 */
    public final /* synthetic */ void m50686e1() {
        if (ura.m195053e().m195057d().mo33664C(100015)) {
            getMediaOperation().mo43246n0(m50800v(), false, true, false);
        }
    }

    /* JADX INFO: renamed from: f1 */
    public final /* synthetic */ void m50687f1() {
        m50641D0();
        zvf0.m220399u("e_replace_photo", "p_lowqualityphoto__popup", j760.m140076a("lowquality_reason", this.f32959E0.mapping));
    }

    /* JADX INFO: renamed from: g1 */
    public final /* synthetic */ void m50688g1() {
        zvf0.m220399u("e_replace_photo_cancel", "p_lowqualityphoto__popup", j760.m140076a("lowquality_reason", this.f32959E0.mapping));
    }

    public List<Media> getAddPhotos() {
        return this.f32983R;
    }

    public fwl getMediaOperation() {
        if (NullChecker.m81303a(this.f33056m)) {
            return this.f33056m;
        }
        return getContext() instanceof fwl ? (fwl) getContext() : (ProfileMediaAct) getContext();
    }

    /* JADX INFO: renamed from: h1 */
    public final /* synthetic */ void m50689h1(DialogInterface dialogInterface) {
        this.f32967I0.m109033i();
        this.f32967I0.m109036l();
    }

    /* JADX INFO: renamed from: i1 */
    public final /* synthetic */ void m50690i1(DialogInterface dialogInterface) {
        this.f32967I0.m109035k();
        this.f32967I0.m109034j();
    }

    /* JADX INFO: renamed from: j1 */
    public final /* synthetic */ void m50691j1(String str) {
        m50641D0();
        zvf0.m220399u("e_replace_photo", "p_lowqualityphoto__popup", j760.m140076a("lowquality_reason", str));
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.VReorderCard
    /* JADX INFO: renamed from: k */
    public void mo50692k(boolean z) {
        super.mo50692k(z);
        setCropPicStateVisibility(!z);
    }

    /* JADX INFO: renamed from: k1 */
    public final /* synthetic */ void m50693k1(DialogInterface dialogInterface) {
        this.f32969J0.m109033i();
        this.f32969J0.m109036l();
    }

    /* JADX INFO: renamed from: l1 */
    public final /* synthetic */ void m50694l1(DialogInterface dialogInterface) {
        this.f32969J0.m109035k();
        this.f32969J0.m109034j();
    }

    /* JADX INFO: renamed from: m1 */
    public final /* synthetic */ void m50695m1(roj0 roj0Var) {
        if (NullChecker.m81303a(this.f32976N)) {
            m50646F1();
        }
    }

    /* JADX INFO: renamed from: n1 */
    public final /* synthetic */ C22306c m50696n1(roj0 roj0Var) {
        return ya5.m213795K(vwb.m200324f0(this.f32976N), "profile", "user-profile", UploadSource.get("profile"));
    }

    /* JADX INFO: renamed from: o1 */
    public final /* synthetic */ C22306c m50697o1(Picture picture) {
        CoreProviderInterface coreProviderInterfaceM195057d = ura.m195053e().m195057d();
        return ((coreProviderInterfaceM195057d.mo33798ak() || coreProviderInterfaceM195057d.mo33687Fl() || this.f32990p0) && NullChecker.m81303a(picture) && TEnum.equals(picture.status, "normal")) ? m50637B0(picture) : C22306c.just(picture);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m50635A0();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.VReorderCard, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m50634w0(this);
        if (lqa.m150972j()) {
            this.f32991r.setBackgroundResource(e3c0.f89161x1);
        }
        setClipToPadding(false);
        setClipChildren(false);
        xdl0.m208359W(this.f32991r, t100.f167260i);
        xdl0.m208357U(this.f32991r, t100.m186890d(9.0f));
        this.f32955B.setImageResource(e3c0.f89027H0);
        this.f32964H.setImageResource(e3c0.f89027H0);
        xdl0.m208360X(this.f32955B, t100.f167254c);
        xdl0.m208359W(this.f32955B, t100.m186890d(5.0f));
        setCropPicStateVisibility(true);
        djj hierarchy = this.f32992s.getHierarchy();
        int i = t100.f167259h;
        hierarchy.m112053H(RoundingParams.m8248b(i, i, i, i));
        xdl0.m208329E0(this.f32994u, new View.OnClickListener() { // from class: l.mux
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f135850a.m50679X0(view);
            }
        });
        xdl0.m208394p0(this.f32958E);
        this.f32958E = this.f32960F;
        this.f32991r.setBackgroundResource(e3c0.f89137p1);
        if (ura.m195053e().m195057d().mo33699I4()) {
            this.f32957D.setImageResource(e3c0.f89008B);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f32957D.getLayoutParams();
            layoutParams.gravity = 17;
            layoutParams.rightMargin = 0;
            layoutParams.bottomMargin = 0;
            this.f32957D.setLayoutParams(layoutParams);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    /* JADX INFO: renamed from: p1 */
    public final /* synthetic */ C22306c m50698p1(Media media) throws Throwable {
        m50647G0(media);
        if (NullChecker.m81303a(this.f32973L0)) {
            this.f32973L0.run();
        }
        return C22306c.just(roj0.f160388a);
    }

    /* JADX INFO: renamed from: q1 */
    public final /* synthetic */ void m50699q1(roj0 roj0Var) {
        setVisibility(0);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.VReorderCard
    /* JADX INFO: renamed from: r */
    public void mo50700r(Media media, Runnable runnable) {
        this.f32973L0 = runnable;
        m50710x1(media);
    }

    /* JADX INFO: renamed from: s1 */
    public final /* synthetic */ Media m50702s1(Media media) {
        this.f32966I.onNext(roj0.f160388a);
        return media;
    }

    public void setCardDataType(CardDataType cardDataType) {
        this.f32989k0 = cardDataType;
    }

    public void setCardType(CardType cardType) {
        this.f32988W = cardType;
    }

    public void setChangeAction(g30<Media, Boolean, Boolean> g30Var) {
        this.f32980P = g30Var;
    }

    public void setCropPicStateVisibility(boolean z) {
        if (NullChecker.m81303a(m50789h()) && m50789h().f33072e) {
            z = false;
        }
        xdl0.m208345M0(this.f32994u, z);
    }

    public void setDataFrom(String str) {
        this.f32972L = str;
    }

    public void setEnableLowPhoto(boolean z) {
        this.f32990p0 = z;
    }

    public void setFrom(String str) {
        this.f32974M = str;
    }

    public void setIllegalPicture(boolean z) {
        this.f32970K = z;
        this.f32998y.setVisibility(z ? 0 : 4);
    }

    public void setMainPicTag(View view) {
        this.f32984S = view;
    }

    public void setShouldShowEdit(boolean z) {
        this.f32985T = z;
    }

    /* JADX INFO: renamed from: t1 */
    public final /* synthetic */ C22306c m50703t1(Media media) {
        this.f32976N = media;
        this.f32966I.onNext(roj0.f160388a);
        m50668Q1("uploadStart");
        return TEnum.equals(media.status, MediaLocalStatus.preprocessed) ? ya5.m213795K(vwb.m200324f0(media), "profile", "user-profile", UploadSource.get("profile")).map(new w9j() { // from class: l.avx
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return MediaReorderCard.m50611Z((List) obj);
            }
        }) : C22306c.just(media);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.VReorderCard
    /* JADX INFO: renamed from: u */
    public void mo50704u() {
        if (SystemClock.uptimeMillis() - this.f32971K0 < 500) {
            return;
        }
        if (!NullChecker.m81303a(this.f33056m) || this.f33056m.mo123526P3(this.f32979O0)) {
            this.f32971K0 = SystemClock.uptimeMillis();
            if (xdl0.m208349O0(this)) {
                if (this.f32976N == null && lqa.m150985w()) {
                    if (lqa.m150973k()) {
                        CoreModule.m29935P().m94651a().mo33351Kc(m50709x0(), this.f32979O0, new d30() { // from class: l.tux
                            @Override // p149l.d30
                            public final void call() {
                                this.f172229a.m50641D0();
                            }
                        });
                        return;
                    } else {
                        if (this.f32990p0 && m50648G1()) {
                            return;
                        }
                        m50641D0();
                        return;
                    }
                }
                if (this.f32976N == null && ((lqa.m150975m() && this.f32989k0 == CardDataType.LIFE) || lqa.m150976n())) {
                    CoreModule.m29935P().m94651a().mo33351Kc(m50709x0(), this.f32979O0, new d30() { // from class: l.uux
                        @Override // p149l.d30
                        public final void call() {
                            this.f178469a.m50682a1();
                        }
                    });
                } else {
                    m50706v1();
                }
            }
        }
    }

    /* JADX INFO: renamed from: u1 */
    public final boolean m50705u1() {
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

    /* JADX INFO: renamed from: v1 */
    public void m50706v1() {
        Media media;
        ArrayList<CharSequence> arrayList = new ArrayList<>();
        if (NullChecker.m81303a(this.f32976N) && TEnum.equals(this.f32976N.status, "normal") && this.f32986U && this.f32979O0 > 0) {
            arrayList.add("编辑标签");
        }
        if (NullChecker.m81303a(this.f32976N) && TEnum.equals(this.f32976N.status, "normal") && this.f32985T) {
            boolean zM150985w = lqa.m150985w();
            Media media2 = this.f32976N;
            if (zM150985w) {
                if (media2 instanceof Picture) {
                    arrayList.add("重新裁剪照片");
                }
                if (this.f32979O0 == 0) {
                    arrayList.add("更换头像");
                }
            } else if (media2 instanceof Picture) {
                arrayList.add(m50709x0().string(R$string.f27878k2));
            }
            if (this.f32976N instanceof Picture) {
                this.f32982Q.clear();
                this.f32982Q.add("show action dialog");
            }
        }
        if ((m50790i() <= 1 || !NullChecker.m81303a(this.f32976N)) && (((media = this.f32976N) == null || TEnum.equals(media.status, "normal")) && !lqa.m150985w())) {
            if (NullChecker.m81303a(this.f33056m)) {
                List<String> selfActions = this.f33056m.getSelfActions();
                if (vwb.m200296J(selfActions)) {
                    arrayList.add(m50709x0().getString(R$string.f27821b));
                    arrayList.add(m50709x0().getString(R$string.f27827c));
                } else {
                    arrayList.addAll(selfActions);
                }
            } else {
                arrayList.add(m50709x0().getString(R$string.f27821b));
                arrayList.add(m50709x0().getString(R$string.f27827c));
            }
            if (!TextUtils.equals(getCurPageId(), "p_upload_photos")) {
                o6j0.m162859c("e_edit_profile_add_icon", "p_edit_profile_view", new o6j0.C18854a[0]);
            }
            if (!TextUtils.equals(getCurPageId(), "p_upload_photos")) {
                o6j0.m162859c("e_profile_add_delete_photos", "p_edit_profile_view", o6j0.C18854a.m162878h("add_delete_picture", "add_picture"), o6j0.C18854a.m162876f("picture_number", m50800v() + 1));
            }
        }
        if (NullChecker.m81303a(this.f32976N) && !TEnum.equals(this.f32976N.status, "normal") && this.f32978O == null) {
            arrayList.add(m50709x0().getString(R$string.f27851g));
        }
        if ((m50790i() > 1 || this.f32988W == CardType.LIFE_MOMENT) && NullChecker.m81303a(this.f32976N)) {
            if (!lqa.m150985w()) {
                arrayList.add(m50709x0().getString(R$string.f27833d));
            } else if (this.f32979O0 > 0) {
                Media media3 = this.f32976N;
                if (media3 instanceof Picture) {
                    arrayList.add("删除该照片");
                } else if (media3 instanceof Video) {
                    arrayList.add("删除该视频");
                }
            }
        }
        if (this.f32990p0) {
            if (this.f32976N == null && arrayList.contains(m50709x0().getString(R$string.f27821b)) && arrayList.contains(m50709x0().getString(R$string.f27827c))) {
                if (m50648G1()) {
                    return;
                }
            } else if (NullChecker.m81303a(this.f32976N)) {
                Media media4 = this.f32976N;
                if ((media4 instanceof Picture) && ((Picture) media4).isLow() && (m50800v() != 0 || !lqa.m150985w())) {
                    arrayList.clear();
                    arrayList.add(m50709x0().getString(R$string.f27851g));
                    arrayList.add(m50709x0().getString(R$string.f27833d));
                }
            }
        }
        if (!this.f33058o) {
            arrayList.clear();
            if (!TEnum.equals(this.f32976N.status, "normal")) {
                arrayList.add(m50709x0().getString(R$string.f27851g));
            }
        }
        if (arrayList.size() == 0) {
            return;
        }
        m50643E0(arrayList);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.VReorderCard
    /* JADX INFO: renamed from: w */
    public void mo50707w(boolean z) {
        super.mo50707w(z);
        setCropPicStateVisibility((z || xdl0.m208349O0(this.f32957D)) ? false : true);
    }

    /* JADX INFO: renamed from: w1 */
    public void m50708w1(final Picture picture) {
        xdl0.m208353Q0(this, new e30() { // from class: l.ivx
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f115205a.m50680Y0(picture, (int[]) obj);
            }
        });
    }

    /* JADX INFO: renamed from: x0 */
    public Act m50709x0() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: x1 */
    public void m50710x1(Media media) {
        if (NullChecker.m81303a(this.f32976N)) {
            media.tags = this.f32976N.tags;
        }
        if (NullChecker.m81303a(this.f32976N)) {
            this.f32975M0 = this.f32976N.mo223809clone();
        }
        this.f32976N = media;
        m50668Q1("onPickMedia");
        m50676U1();
        m50646F1();
        m50787f();
        m50654J1();
        if (NullChecker.m81303a(this.f33056m)) {
            this.f33056m.mo123528e1();
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final void m50711y0() {
        if (this.f33058o && TEnum.equals(this.f32976N.status, "normal")) {
            if (NullChecker.m81303a(m50789h().f33077j)) {
                m50789h().f33077j.run();
            }
            TagChooseMkAct.m43222v2(m50709x0(), vwb.m200299M(this.f32976N), null, new Runnable() { // from class: l.kvx
                @Override // java.lang.Runnable
                public final void run() {
                    this.f124799a.m50661N0();
                }
            }, null);
        }
    }

    /* JADX INFO: renamed from: y1 */
    public void m50712y1(Media media) {
        if (NullChecker.m81303a(this.f32976N)) {
            this.f32975M0 = this.f32976N.mo223809clone();
        }
        this.f32976N = media;
        m50668Q1("onPickMedia");
        m50676U1();
        m50646F1();
        m50787f();
        m50654J1();
        if (NullChecker.m81303a(this.f33056m)) {
            this.f33056m.mo123528e1();
        }
    }

    /* JADX INFO: renamed from: z0 */
    public void m50713z0() {
        final Drawable background = this.f32991r.getBackground();
        FakeCardBgView fakeCardBgView = this.f32977N0;
        if (fakeCardBgView == null || this.f32976N != null) {
            if (getParent() instanceof MediaReorderCards) {
                ((MediaReorderCards) getParent()).f33002C = true;
                return;
            }
            return;
        }
        final Drawable drawableMutate = fakeCardBgView.f29526a.getBackground().mutate();
        this.f32977N0.f29526a.setBackground(drawableMutate);
        ObjectAnimator duration = ObjectAnimator.ofObject(this.f32977N0.f29527b, "textColor", new ArgbEvaluator(), Integer.valueOf(Color.parseColor("#e2e2e2")), Integer.valueOf(Color.parseColor("#FF7602"))).setDuration(800L);
        this.f32981P0 = duration;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.hvx
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f109705a.m50663O0(background, drawableMutate, valueAnimator);
            }
        });
        this.f32981P0.setRepeatMode(2);
        this.f32981P0.setRepeatCount(4);
        this.f32981P0.setInterpolator(null);
        bt0.m103733f(this.f32981P0, new Runnable() { // from class: l.jvx
            @Override // java.lang.Runnable
            public final void run() {
                this.f120000a.m50665P0();
            }
        });
        this.f32981P0.start();
    }

    /* JADX INFO: renamed from: z1 */
    public void m50714z1(final Video video) {
        xdl0.m208353Q0(this, new e30() { // from class: l.tvx
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f172349a.m50681Z0(video, (int[]) obj);
            }
        });
    }

    public MediaReorderCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32966I = C22393b.m221521b();
        this.f32968J = null;
        this.f32970K = false;
        this.f32972L = pj90.f149720h;
        this.f32982Q = new ArrayList(1);
        this.f32983R = new ArrayList();
        this.f32985T = true;
        this.f32986U = false;
        this.f32987V = false;
        this.f32988W = CardType.AVATAR;
        this.f32979O0 = -1;
    }

    public MediaReorderCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32966I = C22393b.m221521b();
        this.f32968J = null;
        this.f32970K = false;
        this.f32972L = pj90.f149720h;
        this.f32982Q = new ArrayList(1);
        this.f32983R = new ArrayList();
        this.f32985T = true;
        this.f32986U = false;
        this.f32987V = false;
        this.f32988W = CardType.AVATAR;
        this.f32979O0 = -1;
    }
}
