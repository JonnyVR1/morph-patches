package com.p000p1.mobile.putong.core.p001ui.profile;

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
import com.facebook.drawee.generic.RoundingParams;
import com.p000p1.mobile.putong.core.p001ui.poplevel.CorePopLevel;
import com.p000p1.mobile.putong.core.p001ui.profile.MediaReorderCard;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.android.ui.cropiwa.CropperAct;
import com.p1.mobile.android.ui.pushbubble.SimplePushBubble;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.inject.provider.CoreProviderInterface;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.NewTags;
import com.p1.mobile.putong.core.data.PhotoLowConfig;
import com.p1.mobile.putong.core.data.PhotoLowModelData;
import com.p1.mobile.putong.core.newui.profile.TagChooseMkAct;
import com.p1.mobile.putong.core.newui.view.ShimmerLayout;
import com.p1.mobile.putong.core.profile.R;
import com.p1.mobile.putong.core.ui.growth.fakeexperience.view.FakeCardBgView;
import com.p1.mobile.putong.data.Dimension;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.MediaLabel;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.UploadSource;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.Video;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.safety.IllegalPictureException;
import com.p1.mobile.putong.ui.download.DownloadTask;
import com.p1.mobile.putong.ui.download.a;
import com.p1.mobile.putong.util.TrackMediaUploadUtil;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import l.bt0;
import l.c40;
import l.c4g0;
import l.cwf0;
import l.d30;
import l.dd80;
import l.djj;
import l.e30;
import l.e3c0;
import l.f30;
import l.ffx;
import l.fwl;
import l.fwx;
import l.g30;
import l.hdb0;
import l.j760;
import l.jo0;
import l.lqa;
import l.lsi0;
import l.lsx;
import l.mkd0;
import l.mqi0;
import l.n6c0;
import l.o6j0;
import l.ogw;
import l.pj90;
import l.qib0;
import l.r5l0;
import l.rhi;
import l.roj0;
import l.t100;
import l.ura;
import l.vwb;
import l.w9j;
import l.xaj0;
import l.xdl0;
import l.ya5;
import l.yij0;
import l.zvf0;
import p002l.lew;
import rx.c;
import rx.schedulers.Schedulers;
import rx.subjects.b;
import v.VDraweeView;
import v.VFrame_Anim;
import v.VImage;
import v.VListCell;
import v.VProgressBar;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class MediaReorderCard extends VReorderCard {

    /* JADX INFO: renamed from: Q0 */
    public static String f774Q0 = "RepeatPicture";

    /* JADX INFO: renamed from: R0 */
    public static String f775R0 = "NetPictur";

    /* JADX INFO: renamed from: A */
    public TextView f776A;

    /* JADX INFO: renamed from: B */
    public ImageView f777B;

    /* JADX INFO: renamed from: C */
    public VFrame_Anim f778C;

    /* JADX INFO: renamed from: D */
    public ImageView f779D;

    /* JADX INFO: renamed from: E */
    public VProgressBar f780E;

    /* JADX INFO: renamed from: E0 */
    public PhotoLowModelData f781E0;

    /* JADX INFO: renamed from: F */
    public VProgressBar f782F;

    /* JADX INFO: renamed from: F0 */
    public PhotoLowModelData f783F0;

    /* JADX INFO: renamed from: G */
    public ImageView f784G;

    /* JADX INFO: renamed from: G0 */
    public PhotoLowModelData f785G0;

    /* JADX INFO: renamed from: H */
    public ImageView f786H;

    /* JADX INFO: renamed from: H0 */
    public PhotoLowModelData f787H0;

    /* JADX INFO: renamed from: I */
    public b<roj0> f788I;

    /* JADX INFO: renamed from: I0 */
    public cwf0 f789I0;

    /* JADX INFO: renamed from: J */
    public c4g0 f790J;

    /* JADX INFO: renamed from: J0 */
    public cwf0 f791J0;

    /* JADX INFO: renamed from: K */
    public boolean f792K;

    /* JADX INFO: renamed from: K0 */
    public long f793K0;

    /* JADX INFO: renamed from: L */
    public String f794L;

    /* JADX INFO: renamed from: L0 */
    public Runnable f795L0;

    /* JADX INFO: renamed from: M */
    public String f796M;

    /* JADX INFO: renamed from: M0 */
    public Media f797M0;

    /* JADX INFO: renamed from: N */
    public Media f798N;

    /* JADX INFO: renamed from: N0 */
    public FakeCardBgView f799N0;

    /* JADX INFO: renamed from: O */
    public c4g0 f800O;

    /* JADX INFO: renamed from: O0 */
    public int f801O0;

    /* JADX INFO: renamed from: P */
    public g30<Media, Boolean, Boolean> f802P;

    /* JADX INFO: renamed from: P0 */
    public ObjectAnimator f803P0;

    /* JADX INFO: renamed from: Q */
    public List<String> f804Q;

    /* JADX INFO: renamed from: R */
    public List<Media> f805R;

    /* JADX INFO: renamed from: S */
    public View f806S;

    /* JADX INFO: renamed from: T */
    public boolean f807T;

    /* JADX INFO: renamed from: U */
    public boolean f808U;

    /* JADX INFO: renamed from: V */
    public boolean f809V;

    /* JADX INFO: renamed from: W */
    public CardType f810W;

    /* JADX INFO: renamed from: k0 */
    public CardDataType f811k0;

    /* JADX INFO: renamed from: p0 */
    public boolean f812p0;

    /* JADX INFO: renamed from: r */
    public MediaReorderCardScaleIndependentFrame f813r;

    /* JADX INFO: renamed from: s */
    public VDraweeView f814s;

    /* JADX INFO: renamed from: t */
    public View f815t;

    /* JADX INFO: renamed from: u */
    public VImage f816u;

    /* JADX INFO: renamed from: v */
    public VText f817v;

    /* JADX INFO: renamed from: w */
    public ShimmerLayout f818w;

    /* JADX INFO: renamed from: x */
    public VText f819x;

    /* JADX INFO: renamed from: y */
    public TextView f820y;

    /* JADX INFO: renamed from: z */
    public LinearLayout f821z;

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
        this.f788I = b.b();
        this.f790J = null;
        this.f792K = false;
        this.f794L = pj90.h;
        this.f804Q = new ArrayList(1);
        this.f805R = new ArrayList();
        this.f807T = true;
        this.f808U = false;
        this.f809V = false;
        this.f810W = CardType.AVATAR;
        this.f801O0 = -1;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.p1.mobile.putong.safety.IllegalPictureException */
    /* JADX INFO: renamed from: E */
    public static /* synthetic */ roj0 m1026E(xaj0 xaj0Var) throws IllegalPictureException {
        if (((Boolean) xaj0Var.a).booleanValue()) {
            throw new IllegalPictureException("检测到敏感信息，上传失败");
        }
        return roj0.a;
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ Media m1031J(List list) {
        return (Media) list.get(0);
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ Picture m1038Q(Media media) {
        return (Picture) media;
    }

    /* JADX INFO: renamed from: Z */
    public static /* synthetic */ Video m1047Z(List list) {
        return (Video) list.get(0);
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ Picture m1058k0(List list) {
        return (Picture) list.get(0);
    }

    /* JADX INFO: renamed from: r0 */
    public static /* synthetic */ void m1065r0(Throwable th) {
    }

    /* JADX INFO: renamed from: w0 */
    private void m1070w0(View view) {
        fwx.a(this, view);
    }

    /* JADX INFO: renamed from: A0 */
    public final void m1071A0() {
        mkd0.z(this.f790J);
    }

    /* JADX INFO: renamed from: A1 */
    public final void m1072A1() {
        if (getWidth() <= 0 || getHeight() <= 0) {
            return;
        }
        measureChildWithMargins(this.f817v, ffx.a(getWidth()), 0, ffx.a(getHeight()), 0);
        int height = getHeight() - ((FrameLayout.LayoutParams) this.f817v.getLayoutParams()).bottomMargin;
        int width = (getWidth() / 2) - (this.f817v.getMeasuredWidth() / 2);
        int measuredWidth = this.f817v.getMeasuredWidth() + width;
        this.f817v.layout(width, height - this.f817v.getMeasuredHeight(), measuredWidth, height);
    }

    /* JADX INFO: renamed from: B0 */
    public final c<Picture> m1073B0(final Picture picture) {
        return c.just(picture).observeOn(jo0.a()).map(new w9j() { // from class: l.lvx
            public final Object call(Object obj) {
                return CoreModule.c.e0.ma();
            }
        }).observeOn(Schedulers.io()).flatMap(new w9j() { // from class: l.mvx
            public final Object call(Object obj) {
                return this.f15716a.m1105R0(picture, (User) obj);
            }
        });
    }

    /* JADX INFO: renamed from: B1 */
    public void m1074B1() {
        if (getWidth() <= 0 || getHeight() <= 0) {
            return;
        }
        requestLayout();
        measure(ffx.b(getWidth()), ffx.b(getHeight()));
        layout(getLeft(), getTop(), getLeft() + getWidth(), getTop() + getHeight());
    }

    /* JADX INFO: renamed from: C0 */
    public final c<roj0> m1075C0(Media media) {
        return (qib0.R.c() && (media instanceof Picture)) ? qib0.R.b(Uri.parse(media.url).getPath()).map(new w9j() { // from class: l.dvx
            public final Object call(Object obj) {
                return MediaReorderCard.m1026E((xaj0) obj);
            }
        }) : c.just(roj0.a);
    }

    /* JADX INFO: renamed from: C1 */
    public void m1076C1(Media media) {
        m1078D1(media, false, true);
    }

    /* JADX INFO: renamed from: D0 */
    public final void m1077D0() {
        if (this.f801O0 == 0 || !lqa.w() || m1095M0()) {
            getMediaOperation().n0(m1246v(), false, false, true);
        } else {
            ura.e().d().bp(getContext(), this.f794L, "");
        }
    }

    /* JADX INFO: renamed from: D1 */
    public void m1078D1(Media media, boolean z, boolean z2) {
        m1071A0();
        if (NullChecker.a(media) && NullChecker.a(this.f798N)) {
            media.tags = this.f798N.tags;
        }
        this.f798N = media;
        m1104Q1("render");
        m1082F1();
        if (NullChecker.a(this.f802P)) {
            this.f802P.a(media, Boolean.valueOf(z), Boolean.valueOf(z2));
        }
    }

    /* JADX INFO: renamed from: E0 */
    public void m1079E0(ArrayList<CharSequence> arrayList) {
        c40.b bVar = new c40.b(getContext());
        bVar.I(m1145x0().getString(R.string.a)).U(new View.OnClickListener() { // from class: l.fvx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10656a.m1107S0(view);
            }
        }).Q(arrayList).V(new c40.d() { // from class: l.gvx
            /* JADX INFO: renamed from: a */
            public final void m14050a(VListCell vListCell, VListCell.a aVar, int i) {
                this.f11644a.m1109T0(vListCell, aVar, i);
            }
        });
        c40 c40VarF = bVar.F();
        this.f869d = c40VarF;
        c40VarF.f();
    }

    /* JADX INFO: renamed from: E1 */
    public void m1080E1(int i, String str) {
        String string;
        if (TextUtils.equals(str, "p_edit_profile_view") && ura.e().d().F7()) {
            return;
        }
        if (i == 0 || i == 1) {
            string = m1145x0().getString(R.string.e4);
        } else if (i == 2) {
            string = m1145x0().getString(R.string.f4);
        } else if (i == 3) {
            string = m1145x0().getString(R.string.g4);
        } else if (i != 4) {
            string = i != 5 ? "" : m1145x0().getString(R.string.i4);
        } else {
            string = m1145x0().getString(R.string.h4);
        }
        this.f819x.setText(string);
        xdl0.M0(this.f819x, (lqa.w() || lqa.m() || lqa.n() || !lqa.j() || NullChecker.a(this.f798N)) ? false : true);
    }

    /* JADX INFO: renamed from: F0 */
    public void m1081F0(String str) {
        String str2 = ogw.e(str) + ".jpg";
        File fileG1 = CropperAct.G1(getContext());
        if (!fileG1.exists()) {
            fileG1.mkdir();
        }
        File file = new File(fileG1, str2);
        if (file.exists()) {
            getMediaOperation().f2(m1246v(), file.getAbsolutePath());
        } else {
            m1145x0().progress((String) null);
            a.u().o(new DownloadTask.b(qib0.H.getDownloadHttp()).q(str).o(file.getAbsolutePath()).j(new f30() { // from class: l.xvx
                public final void call(Object obj, Object obj2) {
                    this.f22484a.m1111U0((DownloadTask) obj, (File) obj2);
                }
            }).f(new f30() { // from class: l.yvx
                public final void call(Object obj, Object obj2) {
                    this.f23123a.m1113V0((DownloadTask) obj, (Throwable) obj2);
                }
            }).a());
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:56:0x010a  */
    /* JADX WARN: Code duplicated, block: B:61:0x013b  */
    /* JADX WARN: Code duplicated, block: B:63:0x013f  */
    /* JADX WARN: Code duplicated, block: B:70:0x0168  */
    /* JADX INFO: renamed from: F1 */
    public void m1082F1() {
        Picture picture;
        mo1128k(this.f798N == null);
        xdl0.M(this.f777B, (this.f798N instanceof Video) && !lqa.w());
        xdl0.M(this.f786H, (this.f798N instanceof Video) && lqa.w());
        if (NullChecker.a(this.f798N) && NullChecker.a(this.f798N.cover()) && NullChecker.a(((Media) this.f798N.cover()).url)) {
            xdl0.Q0(this.f814s, new e30() { // from class: l.xux
                public final void call(Object obj) {
                    this.f22476a.m1119b1((int[]) obj);
                }
            });
        } else {
            Media media = this.f798N;
            if (media instanceof Video) {
                qib0.G.m0(this.f814s, media.url);
            } else {
                qib0.G.o(this.f814s);
            }
        }
        if (NullChecker.a(this.f798N) && this.f800O == null && !TEnum.equals(this.f798N.status, "normal")) {
            m1098N1(this.f779D);
            setCropPicStateVisibility(false);
        }
        if (this.f798N == null) {
            m1098N1(null);
            this.f815t.setAlpha(0.0f);
        }
        if (ura.e().d().Ua() && NullChecker.a(this.f798N)) {
            Picture picture2 = this.f798N;
            if ((picture2 instanceof Picture) && picture2.isAiFakePic()) {
                m1098N1(this.f779D);
                this.f815t.animate().alpha(1.0f).start();
            } else if (ura.e().d().ak()) {
                picture = this.f798N;
                if (!(picture instanceof Picture)) {
                    if (this.f812p0) {
                        this.f815t.animate().alpha(0.0f).start();
                    } else {
                        this.f815t.animate().alpha(0.0f).start();
                    }
                } else if (this.f812p0) {
                    this.f815t.animate().alpha(0.0f).start();
                } else {
                    this.f815t.animate().alpha(0.0f).start();
                }
            } else {
                picture = this.f798N;
                if (!(picture instanceof Picture)) {
                    if (this.f812p0) {
                        this.f815t.animate().alpha(0.0f).start();
                    } else {
                        this.f815t.animate().alpha(0.0f).start();
                    }
                } else if (this.f812p0) {
                    this.f815t.animate().alpha(0.0f).start();
                } else {
                    this.f815t.animate().alpha(0.0f).start();
                }
            }
        } else if ((ura.e().d().ak() || ura.e().d().Fl()) && NullChecker.a(this.f798N)) {
            picture = this.f798N;
            if (!(picture instanceof Picture) && (picture.isLabelJudge(MediaLabel.get("WITH_REPEAT_MAIN_PICTURE")) || this.f798N.isLabelJudge(MediaLabel.get("WITH_NET_MAIN_PICTURE")))) {
                m1098N1(this.f779D);
                this.f815t.animate().alpha(1.0f).start();
            } else if (this.f812p0 || !NullChecker.a(this.f798N)) {
                this.f815t.animate().alpha(0.0f).start();
            } else {
                Picture picture3 = this.f798N;
                if ((picture3 instanceof Picture) && picture3.isLow()) {
                    m1098N1(this.f779D);
                    this.f815t.animate().alpha(1.0f).start();
                } else {
                    this.f815t.animate().alpha(0.0f).start();
                }
            }
        } else if (this.f812p0) {
            this.f815t.animate().alpha(0.0f).start();
        } else {
            this.f815t.animate().alpha(0.0f).start();
        }
        setCropPicStateVisibility(!xdl0.O0(this.f779D) && NullChecker.a(this.f798N));
        m1086H1();
    }

    /* JADX INFO: renamed from: G0 */
    public final void m1083G0(final Media media) {
        boolean z;
        if (m1145x0() == null || m1145x0().isFinishing() || m1145x0().isDestroyed()) {
            return;
        }
        if (lqa.i() && NullChecker.a(this.f798N) && (media instanceof Picture) && TEnum.equals(this.f798N.status, "preprocessed")) {
            Picture picture = (Picture) media;
            String strD = ogw.d(new File(rhi.z(this.f798N.url)));
            Dimension dimension = picture.size;
            int i = dimension.width;
            int i2 = dimension.height;
            o6j0.m("e_hyper_profile_pic_double_check", "p_edit_profile_view", new o6j0.a[]{o6j0.a.h("pic_trace_id", strD), o6j0.a.h("pic_trace_type", "trimmed"), o6j0.a.h("pic_trace_url", media.url), o6j0.a.h("pic_trace_resolution", picture.size.width + "x" + picture.size.height)});
            CoreModule.c.e0.H1.onNext(this.f798N.url);
        }
        if (NullChecker.a(this.f798N) && NullChecker.a(media)) {
            Media media2 = this.f798N;
            media2.status = media.status;
            media.tags = media2.tags;
        }
        boolean z2 = false;
        if (m1246v() == 0 && (media instanceof Picture)) {
            Picture picture2 = (Picture) media;
            boolean zIsLabelJudge = picture2.isLabelJudge(MediaLabel.get("WITH_REPEAT_MAIN_PICTURE"));
            boolean z3 = this.f812p0 && picture2.isLow();
            boolean zIsLabelJudge2 = picture2.isLabelJudge(MediaLabel.get("WITH_NET_MAIN_PICTURE"));
            picture2.isLabelJudge(MediaLabel.get("NOT_VERIFICATION"));
            if (ura.e().d().ak()) {
                m1078D1(media, true, false);
                if (zIsLabelJudge) {
                    m1096M1(f774Q0);
                } else if (z3) {
                    m1094L1();
                } else if (zIsLabelJudge2) {
                    m1096M1(f775R0);
                }
                z = false;
            } else if (ura.e().d().Fl()) {
                m1078D1(media, true, false);
                if (zIsLabelJudge) {
                    m1096M1(f774Q0);
                } else if (z3) {
                    m1094L1();
                }
                z = false;
            } else {
                if (lqa.w() && z3 && NullChecker.a(this.f797M0)) {
                    m1098N1(null);
                    m1078D1(this.f797M0, true, false);
                    m1094L1();
                } else {
                    m1078D1(media, true, false);
                    if (z3) {
                        m1094L1();
                    }
                }
                z = false;
            }
            if (TEnum.equals(media.status, "normal") || !z) {
            }
            this.f805R.add(media);
            this.f800O = null;
            m1098N1(this.f784G);
            postDelayed(new Runnable() { // from class: l.evx
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9987a.m1114W0(media);
                }
            }, 1000L);
            setCropPicStateVisibility(true);
            boolean z4 = !ura.e().d().ee(m1145x0());
            CardType cardType = this.f810W;
            if (cardType != CardType.LIFE_MOMENT && cardType != CardType.MARRY_AVATAR && cardType != CardType.MY_LIFT) {
                z2 = z4;
            }
            if (z2 && !TextUtils.equals(this.f796M, "from_explore_card")) {
                hdb0.c().i(new SimplePushBubble.a(m1145x0(), LayoutInflater.from(m1145x0()).inflate(n6c0.Z0, (ViewGroup) null)).B(1).z(CorePopLevel.MediaReorderCardDone).s());
            }
            if (NullChecker.a(this.f868c.f9399f.f898i)) {
                this.f868c.f9399f.f898i.mo1267a(m1246v(), true);
            }
            CoreModule.c.e0.G1.onNext(roj0.a);
            return;
        }
        m1078D1(media, true, false);
        z = true;
        if (TEnum.equals(media.status, "normal")) {
        }
    }

    /* JADX INFO: renamed from: G1 */
    public boolean m1084G1() {
        Boolean bool = Boolean.FALSE;
        j760 j760VarA = j760.a(bool, bool);
        if (NullChecker.a(this.f878m)) {
            j760VarA = this.f878m.Q1();
        }
        if (!NullChecker.a(j760VarA) || !NullChecker.a(j760VarA.a) || !((Boolean) j760VarA.a).booleanValue()) {
            if (!m1141u1()) {
                return false;
            }
            m1092K1();
            return true;
        }
        if (!NullChecker.a(j760VarA.b) || !((Boolean) j760VarA.b).booleanValue()) {
            return false;
        }
        m1092K1();
        return true;
    }

    /* JADX INFO: renamed from: H0, reason: merged with bridge method [inline-methods] */
    public final void m1137r1(Throwable th) {
        setVisibility(0);
        this.f800O = null;
        setCropPicStateVisibility(false);
        m1098N1(this.f779D);
        setCropPicStateVisibility(false);
        if (NullChecker.a(this.f868c.f9399f.f898i)) {
            this.f868c.f9399f.f898i.mo1267a(m1246v(), false);
        }
        if (m1246v() == 0 && (this.f798N instanceof Picture) && NullChecker.a(this.f797M0) && lqa.w()) {
            m1098N1(null);
            m1078D1(this.f797M0, true, false);
        }
        if (th instanceof IllegalPictureException) {
            lsi0.y(((IllegalPictureException) th).getMessage());
        }
    }

    /* JADX INFO: renamed from: H1 */
    public final void m1086H1() {
        if (m1095M0()) {
            xdl0.M0(this.f776A, false);
            return;
        }
        if (!NullChecker.a(this.f798N) || TextUtils.isEmpty(this.f798N.url) || this.f792K || !this.f808U) {
            xdl0.M0(this.f776A, false);
            return;
        }
        xdl0.M0(this.f776A, true);
        this.f776A.setCompoundDrawables(null, null, null, null);
        TextView textView = this.f776A;
        int i = t100.h;
        textView.setPadding(i, 0, i, 0);
        if (m1246v() == 0) {
            this.f776A.setBackgroundResource(e3c0.m);
            this.f776A.setText("封面");
            this.f776A.setTextColor(Color.parseColor("#ffffffff"));
        } else {
            NewTags newTagsGh = !vwb.J(this.f798N.tags) ? ura.e().d().Gh((String) this.f798N.tags.get(0)) : null;
            if (!NullChecker.a(newTagsGh) || TextUtils.isEmpty(newTagsGh.name)) {
                boolean z = this.f809V;
                TextView textView2 = this.f776A;
                if (z) {
                    textView2.setTextColor(Color.parseColor("#FFFE7E1D"));
                    this.f776A.setText("添加标签");
                    Drawable drawable = getContext().getResources().getDrawable(e3c0.o1);
                    drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
                    this.f776A.setCompoundDrawables(drawable, null, null, null);
                    this.f776A.setCompoundDrawablePadding(t100.c);
                    this.f776A.setPadding(t100.g, 0, i, 0);
                    xdl0.E0(this.f776A, new View.OnClickListener() { // from class: l.sux
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f19297a.m1121d1(view);
                        }
                    });
                } else {
                    xdl0.M0(textView2, false);
                }
            } else {
                this.f776A.setTextColor(Color.parseColor("#CC000000"));
                this.f776A.setText(newTagsGh.name);
                xdl0.E0(this.f776A, new View.OnClickListener() { // from class: l.rux
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f18689a.m1120c1(view);
                    }
                });
            }
            this.f776A.setBackgroundResource(e3c0.p);
        }
        this.f776A.getPaint().setFakeBoldText(true);
        measure(View.MeasureSpec.makeMeasureSpec(getWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getHeight(), 1073741824));
        layout(getLeft(), getTop(), getLeft() + getMeasuredWidth(), getTop() + getMeasuredHeight());
    }

    /* JADX INFO: renamed from: I0 */
    public void m1087I0(int i) {
        if (ura.e().d().F7()) {
            this.f801O0 = i;
            m1090J1();
        }
    }

    /* JADX INFO: renamed from: I1 */
    public void m1088I1(boolean z, boolean z2) {
        this.f808U = z;
        this.f809V = z2;
    }

    /* JADX INFO: renamed from: J0 */
    public void m1089J0(int i, CardType cardType) {
        this.f801O0 = i;
        this.f810W = cardType;
        djj hierarchy = this.f814s.getHierarchy();
        int i2 = t100.i;
        hierarchy.H(RoundingParams.b(i2, i2, i2, i2));
        m1090J1();
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0188  */
    /* JADX INFO: renamed from: J1 */
    public void m1090J1() {
        CardDataType cardDataType;
        CardType cardType = this.f810W;
        CardType cardType2 = CardType.AVATAR;
        CardDataType cardDataType2 = null;
        if (cardType != cardType2 && cardType != CardType.MARRY_AVATAR && cardType != CardType.MY_LIFT) {
            if (cardType != CardType.LIFE_MOMENT || this.f801O0 < 0) {
                return;
            }
            this.f813r.setBackgroundResource(e3c0.v1);
            if (this.f799N0 == null) {
                View fakeCardBgView = new FakeCardBgView(getContext(), (CardDataType) null);
                this.f799N0 = fakeCardBgView;
                this.f813r.addView(fakeCardBgView);
                this.f799N0.setGravity(17);
            }
            if (lqa.n()) {
                boolean z = getParent() instanceof MediaReorderCards ? ((MediaReorderCards) getParent()).f824C : false;
                int i = this.f801O0;
                if (z) {
                    if (i <= 0 || i >= 3) {
                        this.f799N0.b.setTextColor(Color.parseColor("#e2e2e2"));
                        this.f799N0.c.setTextColor(Color.parseColor("#e2e2e2"));
                        if (this.f799N0.a.getBackground() != null) {
                            this.f799N0.a.getBackground().clearColorFilter();
                        }
                        this.f813r.getBackground().clearColorFilter();
                    } else {
                        this.f799N0.b.setTextColor(Color.parseColor("#FF7602"));
                        this.f799N0.c.setTextColor(Color.parseColor("#FF7602"));
                        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(Color.parseColor("#ff7602"), PorterDuff.Mode.SRC_ATOP);
                        this.f813r.getBackground().setColorFilter(porterDuffColorFilter);
                        if (!porterDuffColorFilter.equals(this.f799N0.a.getBackground().getColorFilter())) {
                            Drawable drawableMutate = this.f799N0.a.getBackground().mutate();
                            drawableMutate.setColorFilter(porterDuffColorFilter);
                            this.f799N0.a.setImageDrawable(drawableMutate);
                        }
                    }
                } else if (i <= 0 || i >= 3) {
                    ObjectAnimator objectAnimator = this.f803P0;
                    if (objectAnimator != null && objectAnimator.isRunning()) {
                        this.f803P0.cancel();
                    }
                    this.f799N0.b.setTextColor(Color.parseColor("#e2e2e2"));
                    this.f799N0.c.setTextColor(Color.parseColor("#e2e2e2"));
                    this.f813r.getBackground().clearColorFilter();
                    if (this.f799N0.a.getBackground() != null) {
                        this.f799N0.a.getBackground().clearColorFilter();
                    }
                }
            }
            this.f799N0.b(this.f801O0);
            xdl0.M0(this.f799N0, this.f798N == null);
            return;
        }
        if (!ura.e().d().F7() || this.f801O0 == -1) {
            return;
        }
        boolean zV4 = CoreModule.P().a().v4();
        MediaReorderCardScaleIndependentFrame mediaReorderCardScaleIndependentFrame = this.f813r;
        if (zV4) {
            mediaReorderCardScaleIndependentFrame.setBackgroundResource(e3c0.A);
        } else {
            mediaReorderCardScaleIndependentFrame.setBackgroundResource(e3c0.v1);
        }
        if (this.f799N0 == null) {
            if (lqa.m()) {
                CardDataType cardDataType3 = this.f811k0;
                CardDataType cardDataType4 = CardDataType.LIFE;
                if (cardDataType3 == cardDataType4) {
                    cardDataType2 = cardDataType4;
                } else if (lqa.n() && (cardDataType = this.f811k0) != (cardDataType2 = CardDataType.EDIT) && cardDataType != (cardDataType2 = CardDataType.DIALOG)) {
                    cardDataType2 = CardDataType.DEFAULT;
                }
            } else if (lqa.n()) {
                cardDataType2 = CardDataType.DEFAULT;
            }
            View fakeCardBgView2 = new FakeCardBgView(getContext(), cardDataType2);
            this.f799N0 = fakeCardBgView2;
            this.f813r.addView(fakeCardBgView2);
            this.f799N0.setGravity(17);
        }
        if (lqa.k() || lqa.l()) {
            boolean z2 = getParent() instanceof MediaReorderCards ? ((MediaReorderCards) getParent()).f824C : false;
            int i2 = this.f801O0;
            if (z2) {
                if (i2 <= 0 || i2 >= 3) {
                    this.f799N0.b.setTextColor(Color.parseColor("#e2e2e2"));
                    this.f799N0.c.setTextColor(Color.parseColor("#e2e2e2"));
                    if (this.f799N0.a.getBackground() != null) {
                        this.f799N0.a.getBackground().clearColorFilter();
                    }
                    this.f813r.getBackground().clearColorFilter();
                } else {
                    this.f799N0.b.setTextColor(Color.parseColor("#FF7602"));
                    this.f799N0.c.setTextColor(Color.parseColor("#FF7602"));
                    PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(Color.parseColor("#ff7602"), PorterDuff.Mode.SRC_ATOP);
                    this.f813r.getBackground().setColorFilter(porterDuffColorFilter2);
                    if (!porterDuffColorFilter2.equals(this.f799N0.a.getBackground().getColorFilter())) {
                        Drawable drawableMutate2 = this.f799N0.a.getBackground().mutate();
                        drawableMutate2.setColorFilter(porterDuffColorFilter2);
                        this.f799N0.a.setImageDrawable(drawableMutate2);
                    }
                }
            } else if (i2 <= 0 || i2 >= 3) {
                ObjectAnimator objectAnimator2 = this.f803P0;
                if (objectAnimator2 != null && objectAnimator2.isRunning()) {
                    this.f803P0.cancel();
                }
                this.f799N0.b.setTextColor(Color.parseColor("#e2e2e2"));
                this.f799N0.c.setTextColor(Color.parseColor("#e2e2e2"));
                this.f813r.getBackground().clearColorFilter();
                if (this.f799N0.a.getBackground() != null) {
                    this.f799N0.a.getBackground().clearColorFilter();
                }
            }
        }
        FakeCardBgView fakeCardBgView3 = this.f799N0;
        int i3 = this.f801O0;
        CardType cardType3 = this.f810W;
        fakeCardBgView3.c(i3, cardType3 == cardType2 || cardType3 == CardType.MARRY_AVATAR);
        xdl0.M0(this.f799N0, this.f798N == null);
    }

    /* JADX INFO: renamed from: K0 */
    public boolean m1091K0() {
        return this.f805R.size() > 0;
    }

    /* JADX INFO: renamed from: K1 */
    public final void m1092K1() {
        new lew(m1145x0(), new Runnable() { // from class: l.yux
            @Override // java.lang.Runnable
            public final void run() {
                this.f23109a.m1122e1();
            }
        }, new Runnable() { // from class: l.zux
            @Override // java.lang.Runnable
            public final void run() {
                this.f23598a.m1077D0();
            }
        }).show();
    }

    /* JADX INFO: renamed from: L0 */
    public boolean m1093L0() {
        return this.f792K;
    }

    /* JADX INFO: renamed from: L1 */
    public final void m1094L1() {
        if (!NullChecker.a(this.f781E0) || TextUtils.isEmpty(this.f781E0.conclusion)) {
            return;
        }
        if (this.f789I0 == null) {
            this.f789I0 = new cwf0("p_lowqualityphoto__popup", Dialog.class.getName());
        }
        new dd80.a(m1145x0()).y0("温馨提示").t0(this.f781E0.conclusion).c0("更换照片", new Runnable() { // from class: l.ovx
            @Override // java.lang.Runnable
            public final void run() {
                this.f16809a.m1123f1();
            }
        }).X("稍后再说", new Runnable() { // from class: l.pvx
            @Override // java.lang.Runnable
            public final void run() {
                this.f17702a.m1124g1();
            }
        }).o0(new DialogInterface.OnShowListener() { // from class: l.qvx
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f18252a.m1125h1(dialogInterface);
            }
        }).n0(new DialogInterface.OnDismissListener() { // from class: l.rvx
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f18699a.m1126i1(dialogInterface);
            }
        }).r0();
    }

    /* JADX INFO: renamed from: M0 */
    public final boolean m1095M0() {
        if (!lqa.q()) {
            return false;
        }
        if (((String) CoreModule.c.e0.Z3.get()).equals("marryMode") || TextUtils.equals(this.f794L, "data_from_marry")) {
            return true;
        }
        String strPageId = m1145x0().pageId();
        return TextUtils.equals(strPageId, "p_edit_life_moment") || TextUtils.equals(strPageId, "p_marriage_profile_edit");
    }

    /* JADX INFO: renamed from: M1 */
    public final void m1096M1(String str) {
        String str2;
        final String str3;
        if (this.f791J0 == null) {
            this.f791J0 = new cwf0("p_lowqualityphoto__popup", Dialog.class.getName());
        }
        if (TextUtils.equals(str, f774Q0) && NullChecker.a(this.f783F0)) {
            PhotoLowModelData photoLowModelData = this.f783F0;
            str2 = photoLowModelData.conclusion;
            str3 = photoLowModelData.mapping;
        } else if (TextUtils.equals(str, f775R0) && NullChecker.a(this.f785G0)) {
            PhotoLowModelData photoLowModelData2 = this.f785G0;
            str2 = photoLowModelData2.conclusion;
            str3 = photoLowModelData2.mapping;
        } else {
            str2 = "";
            str3 = "";
        }
        this.f791J0.p(new j760[]{j760.a("lowquality_reason", str3)});
        new dd80.a(m1145x0()).y0("温馨提示").t0(str2).c0("更换照片", new Runnable() { // from class: l.svx
            @Override // java.lang.Runnable
            public final void run() {
                this.f19304a.m1127j1(str3);
            }
        }).X("稍后再说", new Runnable() { // from class: l.uvx
            @Override // java.lang.Runnable
            public final void run() {
                zvf0.u("e_replace_photo_cancel", "p_lowqualityphoto__popup", new j760[]{j760.a("lowquality_reason", str3)});
            }
        }).o0(new DialogInterface.OnShowListener() { // from class: l.vvx
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f21351a.m1129k1(dialogInterface);
            }
        }).n0(new DialogInterface.OnDismissListener() { // from class: l.wvx
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f22008a.m1130l1(dialogInterface);
            }
        }).r0();
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m1097N0() {
        m1076C1(this.f798N);
        if (NullChecker.a(this.f868c.f9399f.f897h)) {
            this.f868c.f9399f.f897h.mo1667a();
        }
    }

    /* JADX INFO: renamed from: N1 */
    public void m1098N1(View view) {
        this.f778C.C(view, new w9j() { // from class: l.vux
            public final Object call(Object obj) {
                return ((View) obj).animate().alpha(1.0f).setDuration(200L);
            }
        }, new w9j() { // from class: l.wux
            public final Object call(Object obj) {
                return ((View) obj).animate().alpha(0.0f).setDuration(200L);
            }
        });
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m1099O0(Drawable drawable, Drawable drawable2, ValueAnimator valueAnimator) {
        if (xdl0.O0(this.f799N0.c)) {
            this.f799N0.c.setTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(((Integer) valueAnimator.getAnimatedValue()).intValue(), PorterDuff.Mode.SRC_ATOP);
        drawable.setColorFilter(porterDuffColorFilter);
        drawable2.setColorFilter(porterDuffColorFilter);
    }

    /* JADX INFO: renamed from: O1 */
    public final void m1100O1() {
        this.f790J = this.f788I.observeOn(jo0.a()).subscribe(mkd0.H(new e30() { // from class: l.bvx
            public final void call(Object obj) {
                this.f8382a.m1131m1((roj0) obj);
            }
        }, new e30() { // from class: l.cvx
            public final void call(Object obj) {
                MediaReorderCard.m1065r0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m1101P0() {
        if (getParent() instanceof MediaReorderCards) {
            ((MediaReorderCards) getParent()).f824C = true;
        }
    }

    /* JADX INFO: renamed from: P1 */
    public void m1102P1() {
        this.f818w.u();
        this.f818w.t();
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ Picture m1103Q0(Picture picture, Envelope envelope) {
        if (envelope.meta.code == 200) {
            CoreData moduleData = envelope.data.getModuleData(CoreData.class);
            if (NullChecker.a(moduleData)) {
                this.f781E0 = moduleData.lowPhotoResult;
                this.f783F0 = moduleData.repeatPictureResult;
                this.f785G0 = moduleData.netPictureResult;
                this.f787H0 = moduleData.notVerificationResultData;
                if (ura.e().d().ak()) {
                    if (NullChecker.a(this.f783F0) && TextUtils.equals(this.f783F0.audit, "repeat")) {
                        picture.setLabel(MediaLabel.get("WITH_REPEAT_MAIN_PICTURE"));
                    } else {
                        picture.removeLabel(MediaLabel.get("WITH_REPEAT_MAIN_PICTURE"));
                    }
                    if (NullChecker.a(this.f785G0) && TextUtils.equals(this.f785G0.audit, "net")) {
                        picture.setLabel(MediaLabel.get("WITH_NET_MAIN_PICTURE"));
                    } else {
                        picture.removeLabel(MediaLabel.get("WITH_NET_MAIN_PICTURE"));
                    }
                }
                if (ura.e().d().Fl()) {
                    if (NullChecker.a(this.f783F0) && TextUtils.equals(this.f783F0.audit, "repeat")) {
                        picture.setLabel(MediaLabel.get("WITH_REPEAT_MAIN_PICTURE"));
                    } else {
                        picture.removeLabel(MediaLabel.get("WITH_REPEAT_MAIN_PICTURE"));
                    }
                }
                if (this.f812p0 && NullChecker.a(this.f781E0) && TextUtils.equals(this.f781E0.audit, "low")) {
                    picture.setLabel(MediaLabel.get("WITH_LOW"));
                } else {
                    picture.removeLabel(MediaLabel.get("WITH_LOW"));
                }
                picture.removeLabel(MediaLabel.get("NOT_VERIFICATION"));
            }
        }
        return picture;
    }

    /* JADX INFO: renamed from: Q1 */
    public final void m1104Q1(String str) {
        this.f804Q.add(str);
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ c m1105R0(final Picture picture, User user) {
        return CoreModule.c.e0.G9(((Media) picture).url, this.f801O0 == 0 ? 1 : 2, (String) null).map(new w9j() { // from class: l.nvx
            public final Object call(Object obj) {
                return this.f16275a.m1103Q0(picture, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: R1 */
    public void m1106R1(int i) {
        if (this.f801O0 == i || this.f799N0 == null) {
            return;
        }
        m1087I0(i);
        m1074B1();
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m1107S0(View view) {
        this.f869d.b();
    }

    /* JADX INFO: renamed from: S1 */
    public void m1108S1(String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        VText vText = this.f817v;
        if (zIsEmpty) {
            xdl0.M0(vText, false);
            return;
        }
        xdl0.M0(vText, true);
        this.f817v.setText(m1145x0().getString(R.string.l0, str));
        m1072A1();
    }

    /* JADX INFO: renamed from: T0 */
    public final /* synthetic */ void m1109T0(VListCell vListCell, VListCell.a aVar, int i) {
        this.f869d.b();
        if (TextUtils.equals(aVar.a, m1145x0().string(R.string.b)) || TextUtils.equals(aVar.a, "更换头像")) {
            m1077D0();
            return;
        }
        if (TextUtils.equals(aVar.a, m1145x0().string(R.string.c))) {
            if (ura.e().d().C(100015)) {
                getMediaOperation().n0(m1246v(), false, true, false);
                return;
            }
            return;
        }
        if (TextUtils.equals(aVar.a, m1145x0().string(R.string.k2)) || TextUtils.equals(aVar.a, "重新裁剪照片")) {
            if (!TextUtils.equals(getCurPageId(), "p_upload_photos")) {
                o6j0.c("e_picture_re_edit_button", "p_edit_profile_view", new o6j0.a[0]);
            }
            if (NullChecker.a(this.f798N)) {
                this.f805R.remove(this.f798N);
                m1081F0(this.f798N.url);
                CoreModule.c.e0.G1.onNext(roj0.a);
                return;
            }
            StringBuilder sb = new StringBuilder("MediaReorderCard error: ");
            for (int i2 = 0; i2 < this.f804Q.size(); i2++) {
                if (i2 > 0) {
                    sb.append(", ");
                }
                sb.append(this.f804Q.get(i2));
            }
            CrashHelper.c(new NullPointerException(sb.toString()));
            return;
        }
        if (TextUtils.equals(aVar.a, m1145x0().string(R.string.g))) {
            m1112U1();
            return;
        }
        if (!TextUtils.equals(aVar.a, m1145x0().string(R.string.d)) && !TextUtils.equals(aVar.a, "删除该照片") && !TextUtils.equals(aVar.a, "删除该视频")) {
            if (TextUtils.equals(aVar.a, "编辑标签")) {
                m1147y0();
                return;
            } else {
                if (NullChecker.a(this.f878m)) {
                    this.f878m.g1(aVar.a, this.f801O0);
                    return;
                }
                return;
            }
        }
        if (!TextUtils.equals(getCurPageId(), "p_upload_photos")) {
            o6j0.c("e_profile_add_delete_photos", "p_edit_profile_view", new o6j0.a[]{o6j0.a.h("add_delete_picture", "delete_picture"), o6j0.a.f("picture_number", m1246v() + 1)});
        }
        this.f805R.remove(this.f798N);
        this.f798N = null;
        m1104Q1("delete");
        m1110T1();
        m1238l();
        setIllegalPicture(false);
        m1078D1(null, true, false);
        m1080E1(m1246v(), getCurPageId());
        m1090J1();
        CoreModule.c.e0.G1.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: T1 */
    public final void m1110T1() {
        if (NullChecker.a(this.f800O)) {
            m1098N1(null);
            yij0.U(this.f800O);
            this.f815t.setAlpha(0.0f);
            this.f800O = null;
        }
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ void m1111U0(DownloadTask downloadTask, File file) {
        m1145x0().progressDismiss();
        getMediaOperation().f2(m1246v(), file.getAbsolutePath());
    }

    /* JADX INFO: renamed from: U1 */
    public void m1112U1() {
        c cVarCompose;
        View view;
        m1071A0();
        TrackMediaUploadUtil.a0(this.f798N);
        Media media = this.f798N;
        if (media instanceof Video) {
            m1100O1();
            cVarCompose = this.f798N.url.startsWith("http") ? c.just(this.f798N.clone()).map(new w9j() { // from class: l.zvx
                public final Object call(Object obj) {
                    return this.f23646a.m1138s1((Media) obj);
                }
            }) : new lsx(vwb.f0(new Media[]{this.f798N}), true).map(new w9j() { // from class: l.awx
                public final Object call(Object obj) {
                    return MediaReorderCard.m1031J((List) obj);
                }
            }).flatMap(new w9j() { // from class: l.bwx
                public final Object call(Object obj) {
                    return this.f8397a.m1139t1((Media) obj);
                }
            }).compose(TrackMediaUploadUtil.f0("profile", vwb.f0(new Media[]{this.f798N}), (w9j) null));
        } else {
            boolean zStartsWith = media.url.startsWith("http");
            Media media2 = this.f798N;
            cVarCompose = (zStartsWith ? c.just(media2.clone()).map(new w9j() { // from class: l.cwx
                public final Object call(Object obj) {
                    return MediaReorderCard.m1038Q((Media) obj);
                }
            }) : m1075C0(media2).flatMap(new w9j() { // from class: l.dwx
                public final Object call(Object obj) {
                    return this.f9468a.m1132n1((roj0) obj);
                }
            }).map(new w9j() { // from class: l.ewx
                public final Object call(Object obj) {
                    return MediaReorderCard.m1058k0((List) obj);
                }
            })).flatMap(new w9j() { // from class: l.nux
                public final Object call(Object obj) {
                    return this.f16206a.m1133o1((Picture) obj);
                }
            }).compose(TrackMediaUploadUtil.f0("profile", vwb.f0(new Media[]{this.f798N}), (w9j) null));
        }
        m1098N1(this.f780E);
        setIllegalPicture(false);
        if (m1246v() == 0 && (view = this.f806S) != null) {
            view.setVisibility(0);
        }
        this.f815t.animate().alpha(1.0f).start();
        this.f800O = m1145x0().duringCreated(cVarCompose.compose(mkd0.C()).switchMap(new w9j() { // from class: l.oux
            public final Object call(Object obj) {
                return this.f16800a.m1134p1((Media) obj);
            }
        })).subscribe(mkd0.H(new e30() { // from class: l.pux
            public final void call(Object obj) {
                this.f17663a.m1135q1((roj0) obj);
            }
        }, new e30() { // from class: l.qux
            public final void call(Object obj) {
                this.f18242a.m1137r1((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ void m1113V0(DownloadTask downloadTask, Throwable th) {
        m1145x0().progressDismiss();
        lsi0.w(R.string.H0);
    }

    /* JADX INFO: renamed from: W0 */
    public final /* synthetic */ void m1114W0(Media media) {
        if (this.f798N == media) {
            m1098N1(null);
            this.f815t.animate().alpha(0.0f).start();
        }
    }

    /* JADX INFO: renamed from: X0 */
    public final /* synthetic */ void m1115X0(View view) {
        mo1140u();
    }

    /* JADX INFO: renamed from: Y0 */
    public final /* synthetic */ void m1116Y0(Picture picture, int[] iArr) {
        xdl0.M0(this.f819x, false);
        m1146x1(picture);
    }

    /* JADX INFO: renamed from: Z0 */
    public final /* synthetic */ void m1117Z0(Video video, int[] iArr) {
        long j = new r5l0(rhi.z(((Media) video).url)).b;
        if (j >= 16000) {
            lsi0.h(R.string.C2);
        } else if (j < 3000) {
            lsi0.h(R.string.D2);
        } else {
            m1146x1(video);
        }
    }

    /* JADX INFO: renamed from: a1 */
    public final /* synthetic */ void m1118a1() {
        getMediaOperation().i0(m1246v(), false);
    }

    /* JADX INFO: renamed from: b1 */
    public final /* synthetic */ void m1119b1(int[] iArr) {
        if (NullChecker.a(this.f798N) && NullChecker.a(this.f798N.cover()) && NullChecker.a(((Media) this.f798N.cover()).url)) {
            if (getParent() instanceof ViewGroup) {
                ((ViewGroup) getParent()).indexOfChild(this);
            }
            qib0.G.J0(this.f814s, this.f798N.cover().profile480(), false);
        }
    }

    /* JADX INFO: renamed from: c1 */
    public final /* synthetic */ void m1120c1(View view) {
        m1147y0();
    }

    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ void m1121d1(View view) {
        m1147y0();
    }

    /* JADX INFO: renamed from: e1 */
    public final /* synthetic */ void m1122e1() {
        if (ura.e().d().C(100015)) {
            getMediaOperation().n0(m1246v(), false, true, false);
        }
    }

    /* JADX INFO: renamed from: f1 */
    public final /* synthetic */ void m1123f1() {
        m1077D0();
        zvf0.u("e_replace_photo", "p_lowqualityphoto__popup", new j760[]{j760.a("lowquality_reason", this.f781E0.mapping)});
    }

    /* JADX INFO: renamed from: g1 */
    public final /* synthetic */ void m1124g1() {
        zvf0.u("e_replace_photo_cancel", "p_lowqualityphoto__popup", new j760[]{j760.a("lowquality_reason", this.f781E0.mapping)});
    }

    public List<Media> getAddPhotos() {
        return this.f805R;
    }

    public fwl getMediaOperation() {
        if (NullChecker.a(this.f878m)) {
            return this.f878m;
        }
        return getContext() instanceof fwl ? getContext() : (ProfileMediaAct) getContext();
    }

    /* JADX INFO: renamed from: h1 */
    public final /* synthetic */ void m1125h1(DialogInterface dialogInterface) {
        this.f789I0.i();
        this.f789I0.l();
    }

    /* JADX INFO: renamed from: i1 */
    public final /* synthetic */ void m1126i1(DialogInterface dialogInterface) {
        this.f789I0.k();
        this.f789I0.j();
    }

    /* JADX INFO: renamed from: j1 */
    public final /* synthetic */ void m1127j1(String str) {
        m1077D0();
        zvf0.u("e_replace_photo", "p_lowqualityphoto__popup", new j760[]{j760.a("lowquality_reason", str)});
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.VReorderCard
    /* JADX INFO: renamed from: k */
    public void mo1128k(boolean z) {
        super.mo1128k(z);
        setCropPicStateVisibility(!z);
    }

    /* JADX INFO: renamed from: k1 */
    public final /* synthetic */ void m1129k1(DialogInterface dialogInterface) {
        this.f791J0.i();
        this.f791J0.l();
    }

    /* JADX INFO: renamed from: l1 */
    public final /* synthetic */ void m1130l1(DialogInterface dialogInterface) {
        this.f791J0.k();
        this.f791J0.j();
    }

    /* JADX INFO: renamed from: m1 */
    public final /* synthetic */ void m1131m1(roj0 roj0Var) {
        if (NullChecker.a(this.f798N)) {
            m1082F1();
        }
    }

    /* JADX INFO: renamed from: n1 */
    public final /* synthetic */ c m1132n1(roj0 roj0Var) {
        return ya5.K(vwb.f0(new Media[]{this.f798N}), "profile", "user-profile", UploadSource.get("profile"));
    }

    /* JADX INFO: renamed from: o1 */
    public final /* synthetic */ c m1133o1(Picture picture) {
        CoreProviderInterface coreProviderInterfaceD = ura.e().d();
        return ((coreProviderInterfaceD.ak() || coreProviderInterfaceD.Fl() || this.f812p0) && NullChecker.a(picture) && TEnum.equals(((Media) picture).status, "normal")) ? m1073B0(picture) : c.just(picture);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m1071A0();
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.VReorderCard, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m1070w0(this);
        if (lqa.j()) {
            this.f813r.setBackgroundResource(e3c0.x1);
        }
        setClipToPadding(false);
        setClipChildren(false);
        xdl0.W(this.f813r, t100.i);
        xdl0.U(this.f813r, t100.d(9.0f));
        this.f777B.setImageResource(e3c0.H0);
        this.f786H.setImageResource(e3c0.H0);
        xdl0.X(this.f777B, t100.c);
        xdl0.W(this.f777B, t100.d(5.0f));
        setCropPicStateVisibility(true);
        djj hierarchy = this.f814s.getHierarchy();
        int i = t100.h;
        hierarchy.H(RoundingParams.b(i, i, i, i));
        xdl0.E0(this.f816u, new View.OnClickListener() { // from class: l.mux
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15665a.m1115X0(view);
            }
        });
        xdl0.p0(this.f780E);
        this.f780E = this.f782F;
        this.f813r.setBackgroundResource(e3c0.p1);
        if (ura.e().d().I4()) {
            this.f779D.setImageResource(e3c0.B);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f779D.getLayoutParams();
            layoutParams.gravity = 17;
            layoutParams.rightMargin = 0;
            layoutParams.bottomMargin = 0;
            this.f779D.setLayoutParams(layoutParams);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    /* JADX INFO: renamed from: p1 */
    public final /* synthetic */ c m1134p1(Media media) {
        m1083G0(media);
        if (NullChecker.a(this.f795L0)) {
            this.f795L0.run();
        }
        return c.just(roj0.a);
    }

    /* JADX INFO: renamed from: q1 */
    public final /* synthetic */ void m1135q1(roj0 roj0Var) {
        setVisibility(0);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.VReorderCard
    /* JADX INFO: renamed from: r */
    public void mo1136r(Media media, Runnable runnable) {
        this.f795L0 = runnable;
        m1146x1(media);
    }

    /* JADX INFO: renamed from: s1 */
    public final /* synthetic */ Media m1138s1(Media media) {
        this.f788I.onNext(roj0.a);
        return media;
    }

    public void setCardDataType(CardDataType cardDataType) {
        this.f811k0 = cardDataType;
    }

    public void setCardType(CardType cardType) {
        this.f810W = cardType;
    }

    public void setChangeAction(g30<Media, Boolean, Boolean> g30Var) {
        this.f802P = g30Var;
    }

    public void setCropPicStateVisibility(boolean z) {
        if (NullChecker.a(m1235h()) && m1235h().f894e) {
            z = false;
        }
        xdl0.M0(this.f816u, z);
    }

    public void setDataFrom(String str) {
        this.f794L = str;
    }

    public void setEnableLowPhoto(boolean z) {
        this.f812p0 = z;
    }

    public void setFrom(String str) {
        this.f796M = str;
    }

    public void setIllegalPicture(boolean z) {
        this.f792K = z;
        this.f820y.setVisibility(z ? 0 : 4);
    }

    public void setMainPicTag(View view) {
        this.f806S = view;
    }

    public void setShouldShowEdit(boolean z) {
        this.f807T = z;
    }

    /* JADX INFO: renamed from: t1 */
    public final /* synthetic */ c m1139t1(Media media) {
        this.f798N = media;
        this.f788I.onNext(roj0.a);
        m1104Q1("uploadStart");
        return TEnum.equals(media.status, "preprocessed") ? ya5.K(vwb.f0(new Media[]{media}), "profile", "user-profile", UploadSource.get("profile")).map(new w9j() { // from class: l.avx
            public final Object call(Object obj) {
                return MediaReorderCard.m1047Z((List) obj);
            }
        }) : c.just(media);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.VReorderCard
    /* JADX INFO: renamed from: u */
    public void mo1140u() {
        if (SystemClock.uptimeMillis() - this.f793K0 < 500) {
            return;
        }
        if (!NullChecker.a(this.f878m) || this.f878m.P3(this.f801O0)) {
            this.f793K0 = SystemClock.uptimeMillis();
            if (xdl0.O0(this)) {
                if (this.f798N == null && lqa.w()) {
                    if (lqa.k()) {
                        CoreModule.P().a().Kc(m1145x0(), this.f801O0, new d30() { // from class: l.tux
                            public final void call() {
                                this.f20393a.m1077D0();
                            }
                        });
                        return;
                    } else {
                        if (this.f812p0 && m1084G1()) {
                            return;
                        }
                        m1077D0();
                        return;
                    }
                }
                if (this.f798N == null && ((lqa.m() && this.f811k0 == CardDataType.LIFE) || lqa.n())) {
                    CoreModule.P().a().Kc(m1145x0(), this.f801O0, new d30() { // from class: l.uux
                        public final void call() {
                            this.f20841a.m1118a1();
                        }
                    });
                } else {
                    m1142v1();
                }
            }
        }
    }

    /* JADX INFO: renamed from: u1 */
    public final boolean m1141u1() {
        PhotoLowConfig photoLowConfigD = lqa.d();
        if (!mqi0.D(((Long) CoreModule.c.e0.G4.get()).longValue())) {
            CoreModule.c.e0.G4.put(Long.valueOf(mqi0.o()));
            CoreModule.c.e0.H4.put(1);
            return true;
        }
        if (((Integer) CoreModule.c.e0.H4.get()).intValue() >= (photoLowConfigD == null ? 2 : photoLowConfigD.count)) {
            return false;
        }
        CoreModule.c.e0.G4.put(Long.valueOf(mqi0.o()));
        CoreModule.c.e0.H4.a(1);
        return true;
    }

    /* JADX INFO: renamed from: v1 */
    public void m1142v1() {
        Media media;
        ArrayList<CharSequence> arrayList = new ArrayList<>();
        if (NullChecker.a(this.f798N) && TEnum.equals(this.f798N.status, "normal") && this.f808U && this.f801O0 > 0) {
            arrayList.add("编辑标签");
        }
        if (NullChecker.a(this.f798N) && TEnum.equals(this.f798N.status, "normal") && this.f807T) {
            boolean zW = lqa.w();
            Media media2 = this.f798N;
            if (zW) {
                if (media2 instanceof Picture) {
                    arrayList.add("重新裁剪照片");
                }
                if (this.f801O0 == 0) {
                    arrayList.add("更换头像");
                }
            } else if (media2 instanceof Picture) {
                arrayList.add(m1145x0().string(R.string.k2));
            }
            if (this.f798N instanceof Picture) {
                this.f804Q.clear();
                this.f804Q.add("show action dialog");
            }
        }
        if ((m1236i() <= 1 || !NullChecker.a(this.f798N)) && (((media = this.f798N) == null || TEnum.equals(media.status, "normal")) && !lqa.w())) {
            if (NullChecker.a(this.f878m)) {
                List selfActions = this.f878m.getSelfActions();
                if (vwb.J(selfActions)) {
                    arrayList.add(m1145x0().getString(R.string.b));
                    arrayList.add(m1145x0().getString(R.string.c));
                } else {
                    arrayList.addAll(selfActions);
                }
            } else {
                arrayList.add(m1145x0().getString(R.string.b));
                arrayList.add(m1145x0().getString(R.string.c));
            }
            if (!TextUtils.equals(getCurPageId(), "p_upload_photos")) {
                o6j0.c("e_edit_profile_add_icon", "p_edit_profile_view", new o6j0.a[0]);
            }
            if (!TextUtils.equals(getCurPageId(), "p_upload_photos")) {
                o6j0.c("e_profile_add_delete_photos", "p_edit_profile_view", new o6j0.a[]{o6j0.a.h("add_delete_picture", "add_picture"), o6j0.a.f("picture_number", m1246v() + 1)});
            }
        }
        if (NullChecker.a(this.f798N) && !TEnum.equals(this.f798N.status, "normal") && this.f800O == null) {
            arrayList.add(m1145x0().getString(R.string.g));
        }
        if ((m1236i() > 1 || this.f810W == CardType.LIFE_MOMENT) && NullChecker.a(this.f798N)) {
            if (!lqa.w()) {
                arrayList.add(m1145x0().getString(R.string.d));
            } else if (this.f801O0 > 0) {
                Media media3 = this.f798N;
                if (media3 instanceof Picture) {
                    arrayList.add("删除该照片");
                } else if (media3 instanceof Video) {
                    arrayList.add("删除该视频");
                }
            }
        }
        if (this.f812p0) {
            if (this.f798N == null && arrayList.contains(m1145x0().getString(R.string.b)) && arrayList.contains(m1145x0().getString(R.string.c))) {
                if (m1084G1()) {
                    return;
                }
            } else if (NullChecker.a(this.f798N)) {
                Picture picture = this.f798N;
                if ((picture instanceof Picture) && picture.isLow() && (m1246v() != 0 || !lqa.w())) {
                    arrayList.clear();
                    arrayList.add(m1145x0().getString(R.string.g));
                    arrayList.add(m1145x0().getString(R.string.d));
                }
            }
        }
        if (!this.f880o) {
            arrayList.clear();
            if (!TEnum.equals(this.f798N.status, "normal")) {
                arrayList.add(m1145x0().getString(R.string.g));
            }
        }
        if (arrayList.size() == 0) {
            return;
        }
        m1079E0(arrayList);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.VReorderCard
    /* JADX INFO: renamed from: w */
    public void mo1143w(boolean z) {
        super.mo1143w(z);
        setCropPicStateVisibility((z || xdl0.O0(this.f779D)) ? false : true);
    }

    /* JADX INFO: renamed from: w1 */
    public void m1144w1(final Picture picture) {
        xdl0.Q0(this, new e30() { // from class: l.ivx
            public final void call(Object obj) {
                this.f13441a.m1116Y0(picture, (int[]) obj);
            }
        });
    }

    /* JADX INFO: renamed from: x0 */
    public Act m1145x0() {
        return getContext();
    }

    /* JADX INFO: renamed from: x1 */
    public void m1146x1(Media media) {
        if (NullChecker.a(this.f798N)) {
            media.tags = this.f798N.tags;
        }
        if (NullChecker.a(this.f798N)) {
            this.f797M0 = this.f798N.clone();
        }
        this.f798N = media;
        m1104Q1("onPickMedia");
        m1112U1();
        m1082F1();
        m1233f();
        m1090J1();
        if (NullChecker.a(this.f878m)) {
            this.f878m.e1();
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final void m1147y0() {
        if (this.f880o && TEnum.equals(this.f798N.status, "normal")) {
            if (NullChecker.a(m1235h().f899j)) {
                m1235h().f899j.run();
            }
            TagChooseMkAct.v2(m1145x0(), vwb.M(this.f798N), (String) null, new Runnable() { // from class: l.kvx
                @Override // java.lang.Runnable
                public final void run() {
                    this.f14559a.m1097N0();
                }
            }, (Runnable) null);
        }
    }

    /* JADX INFO: renamed from: y1 */
    public void m1148y1(Media media) {
        if (NullChecker.a(this.f798N)) {
            this.f797M0 = this.f798N.clone();
        }
        this.f798N = media;
        m1104Q1("onPickMedia");
        m1112U1();
        m1082F1();
        m1233f();
        m1090J1();
        if (NullChecker.a(this.f878m)) {
            this.f878m.e1();
        }
    }

    /* JADX INFO: renamed from: z0 */
    public void m1149z0() {
        final Drawable background = this.f813r.getBackground();
        FakeCardBgView fakeCardBgView = this.f799N0;
        if (fakeCardBgView == null || this.f798N != null) {
            if (getParent() instanceof MediaReorderCards) {
                ((MediaReorderCards) getParent()).f824C = true;
                return;
            }
            return;
        }
        final Drawable drawableMutate = fakeCardBgView.a.getBackground().mutate();
        this.f799N0.a.setBackground(drawableMutate);
        ObjectAnimator duration = ObjectAnimator.ofObject(this.f799N0.b, "textColor", new ArgbEvaluator(), Integer.valueOf(Color.parseColor("#e2e2e2")), Integer.valueOf(Color.parseColor("#FF7602"))).setDuration(800L);
        this.f803P0 = duration;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.hvx
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f12301a.m1099O0(background, drawableMutate, valueAnimator);
            }
        });
        this.f803P0.setRepeatMode(2);
        this.f803P0.setRepeatCount(4);
        this.f803P0.setInterpolator(null);
        bt0.f(this.f803P0, new Runnable() { // from class: l.jvx
            @Override // java.lang.Runnable
            public final void run() {
                this.f14061a.m1101P0();
            }
        });
        this.f803P0.start();
    }

    /* JADX INFO: renamed from: z1 */
    public void m1150z1(final Video video) {
        xdl0.Q0(this, new e30() { // from class: l.tvx
            public final void call(Object obj) {
                this.f20409a.m1117Z0(video, (int[]) obj);
            }
        });
    }

    public MediaReorderCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f788I = b.b();
        this.f790J = null;
        this.f792K = false;
        this.f794L = pj90.h;
        this.f804Q = new ArrayList(1);
        this.f805R = new ArrayList();
        this.f807T = true;
        this.f808U = false;
        this.f809V = false;
        this.f810W = CardType.AVATAR;
        this.f801O0 = -1;
    }

    public MediaReorderCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f788I = b.b();
        this.f790J = null;
        this.f792K = false;
        this.f794L = pj90.h;
        this.f804Q = new ArrayList(1);
        this.f805R = new ArrayList();
        this.f807T = true;
        this.f808U = false;
        this.f809V = false;
        this.f810W = CardType.AVATAR;
        this.f801O0 = -1;
    }
}
