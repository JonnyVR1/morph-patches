package p153l;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core.p058ui.match.view.FemaleMatchSuccessLayout;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import com.p074ss.bytertc.audio.device.webrtc.WebRtcAudioTrack;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;
import p151v.VDraweeView;
import p151v.VRelative;
import p151v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class pdi {

    /* JADX INFO: renamed from: F */
    public static volatile pdi f151758F;

    /* JADX INFO: renamed from: a */
    public VRelative f151764a;

    /* JADX INFO: renamed from: b */
    public FemaleMatchSuccessLayout f151765b;

    /* JADX INFO: renamed from: c */
    public View f151766c;

    /* JADX INFO: renamed from: d */
    public SVGAnimationView f151767d;

    /* JADX INFO: renamed from: e */
    public VText f151768e;

    /* JADX INFO: renamed from: f */
    public TextView f151769f;

    /* JADX INFO: renamed from: g */
    public TextView f151770g;

    /* JADX INFO: renamed from: h */
    public VText f151771h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f151772i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f151773j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f151774k;

    /* JADX INFO: renamed from: l */
    public SVGAnimationView f151775l;

    /* JADX INFO: renamed from: m */
    public Act f151776m;

    /* JADX INFO: renamed from: n */
    public User f151777n;

    /* JADX INFO: renamed from: o */
    public PopupWindow f151778o;

    /* JADX INFO: renamed from: x */
    public l4g0 f151787x;

    /* JADX INFO: renamed from: p */
    public final int f151779p = qa00.f156317d * 2;

    /* JADX INFO: renamed from: q */
    public final int f151780q = qa00.f156316c * 2;

    /* JADX INFO: renamed from: r */
    public float f151781r = 0.0f;

    /* JADX INFO: renamed from: s */
    public float f151782s = 0.0f;

    /* JADX INFO: renamed from: t */
    public final float f151783t = qa00.m175859d(200.0f);

    /* JADX INFO: renamed from: u */
    public float f151784u = 0.0f;

    /* JADX INFO: renamed from: v */
    public float f151785v = 0.0f;

    /* JADX INFO: renamed from: w */
    public boolean f151786w = true;

    /* JADX INFO: renamed from: y */
    public boolean f151788y = false;

    /* JADX INFO: renamed from: z */
    public String f151789z = "";

    /* JADX INFO: renamed from: A */
    public int f151759A = 0;

    /* JADX INFO: renamed from: B */
    public int f151760B = 0;

    /* JADX INFO: renamed from: C */
    public final Runnable f151761C = new Runnable() { // from class: l.mdi
        @Override // java.lang.Runnable
        public final void run() {
            this.f136384a.m171862W();
        }
    };

    /* JADX INFO: renamed from: D */
    public final Interpolator f151762D = new PathInterpolator(0.17f, 0.17f, 0.7f, 1.0f);

    /* JADX INFO: renamed from: E */
    public float f151763E = 0.0f;

    /* JADX INFO: renamed from: G */
    public static Act m171814G() {
        Act.C4450r c4450rForeground_ = Act.foreground_();
        if (NullChecker.m82486a(c4450rForeground_) && NullChecker.m82486a(c4450rForeground_.f16062a) && NullChecker.m82486a(c4450rForeground_.f16062a.get()) && (c4450rForeground_.f16062a.get() instanceof Act)) {
            return (Act) c4450rForeground_.f16062a.get();
        }
        return null;
    }

    /* JADX INFO: renamed from: b0 */
    public static void m171817b0(Act act, User user, boolean z, String str) {
        m171819c0(act, user, z, str, false);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m171818c(Throwable th) {
    }

    /* JADX INFO: renamed from: c0 */
    public static void m171819c0(final Act act, final User user, final boolean z, final String str, final boolean z2) {
        act.runOnUiThread(new Runnable() { // from class: l.rci
            @Override // java.lang.Runnable
            public final void run() {
                pdi.m171824g(user, z2, z, str, act);
            }
        });
    }

    /* JADX INFO: renamed from: d0 */
    public static void m171821d0(final String str, final boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        final Act actM171814G = m171814G();
        if (w20.m204491f(actM171814G)) {
            actM171814G.duringCreated((C22421c) CoreModule.f18264c.f20384f0.m33905ap(str).map(new qcj() { // from class: l.cdi
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return CoreModule.f18264c.f20381e0.m116503Pa(str);
                }
            })).subscribe(psd0.m173597H(new y20() { // from class: l.hdi
                @Override // p153l.y20
                public final void call(Object obj) {
                    pdi.m171835r(actM171814G, z, (User) obj);
                }
            }, new y20() { // from class: l.idi
                @Override // p153l.y20
                public final void call(Object obj) {
                    pdi.m171818c((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m171824g(User user, boolean z, boolean z2, String str, Act act) {
        if (user == null) {
            return;
        }
        if (f151758F == null) {
            f151758F = new pdi();
        }
        f151758F.f151786w = z;
        f151758F.f151788y = z2;
        f151758F.f151789z = str;
        if (!NullChecker.m82486a(f151758F.f151778o) || !f151758F.f151778o.isShowing()) {
            f151758F.m171866a0(act, user);
        } else {
            if (NullChecker.m82486a(f151758F.f151777n) && TextUtils.equals(user.f56859id, f151758F.f151777n.f56859id)) {
                return;
            }
            f151758F.m171869z(act, user);
        }
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m171832o() {
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m171835r(Act act, boolean z, User user) {
        if (w20.m204491f(act) && ji30.m144964h() == TabName.Card && (act instanceof NewMainAct) && ((NewMainAct) act).m40824k6()) {
            m171817b0(act, user, z, "");
        }
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m171839v() {
    }

    /* JADX INFO: renamed from: A */
    public void m171841A() {
        this.f151776m.runOnUiThread(new Runnable() { // from class: l.tci
            @Override // java.lang.Runnable
            public final void run() {
                this.f173234a.m171852M();
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public final void m171842B() {
        final int iM206284B = wgx.m206284B(this.f151776m) + qa00.f156302O + qa00.f156323j;
        final PathInterpolator pathInterpolator = new PathInterpolator(0.26f, 0.0f, 0.6f, 0.57f);
        dj30.m116034k(dj30.m116035l().female_exit_time / 2, new y20() { // from class: l.uci
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f178435a.m171853N(iM206284B, pathInterpolator, (Float) obj);
            }
        }, new vci(this));
    }

    /* JADX INFO: renamed from: C */
    public final void m171843C() {
        int i = dj30.m116035l().female_enter_time;
        SVGALoader.with(this.f151776m).from(gra.m131778z() ? "https://auto.tancdn.com/v1/raw/24c3c444-03a1-4520-acd3-043962688f0714.svga" : "core_female_match_success_heart_bg.svga").isCacheable(true).autoPlay(true).repeatCount(-1).into(this.f151767d);
        l51.m152888H(this.f151776m, new Runnable() { // from class: l.yci
            @Override // java.lang.Runnable
            public final void run() {
                this.f198510a.m171854O();
            }
        }, i + WebRtcAudioTrack.AudioTrackErrorCode.AUDIO_TRACK_INIT_MINBUFFER_ERROR);
        final PathInterpolator pathInterpolator = new PathInterpolator(0.34f, 1.6f, 0.61f, 0.96f);
        final int i2 = qa00.f156335v;
        final int iM206284B = wgx.m206284B(this.f151776m) + qa00.f156302O + qa00.f156323j;
        dj30.m116034k(i, new y20() { // from class: l.zci
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f203787a.m171855P(iM206284B, pathInterpolator, i2, (Float) obj);
            }
        }, new Runnable() { // from class: l.adi
            @Override // java.lang.Runnable
            public final void run() {
                this.f70691a.m171868y();
            }
        });
    }

    /* JADX INFO: renamed from: D */
    public final void m171844D() {
        float fM175859d = qa00.m175859d(200.0f);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f151773j.getLayoutParams();
        this.f151781r = fM175859d - ((layoutParams.topMargin + (layoutParams.height / 2.0f)) - (this.f151765b.getHeight() / 2.0f));
        this.f151782s = (this.f151765b.getWidth() / 2.0f) - ((layoutParams.width / 2.0f) + layoutParams.leftMargin);
        this.f151784u = ((((this.f151760B - this.f151759A) - (layoutParams.height / 2.0f)) - layoutParams.topMargin) - this.f151781r) + (this.f151773j.getHeight() / 2.0f);
        dj30.m116034k(dj30.m116035l().female_exit_time, new y20() { // from class: l.bdi
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f76268a.m171856Q((Float) obj);
            }
        }, new vci(this));
    }

    /* JADX INFO: renamed from: E */
    public final void m171845E(float f) {
        dj30.m116026c(this.f151765b.getWidth(), this.f151773j.getWidth() + this.f151779p, f, new y20() { // from class: l.ddi
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f87938a.m171857R((Float) obj);
            }
        });
        dj30.m116026c(this.f151765b.getHeight(), this.f151773j.getHeight() + this.f151779p, f, new y20() { // from class: l.edi
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f93518a.m171858S((Float) obj);
            }
        });
        dj30.m116029f(this.f151765b, 0.0f, 10.0f, f);
        dj30.m116033j(this.f151765b, 0.0f, this.f151783t, f);
        dj30.m116032i(this.f151772i, 0.0f, this.f151782s, f);
        dj30.m116033j(this.f151772i, 0.0f, this.f151781r, f);
        dj30.m116028e(this.f151772i, 1.0f, 0.0f, f);
        dj30.m116032i(this.f151773j, 0.0f, this.f151782s, f);
        dj30.m116033j(this.f151773j, 0.0f, this.f151781r, f);
        dj30.m116028e(this.f151768e, 1.0f, 0.0f, f);
        dj30.m116028e(this.f151769f, 1.0f, 0.0f, f);
    }

    /* JADX INFO: renamed from: F */
    public final void m171846F(float f) {
        dj30.m116026c(this.f151773j.getWidth() + this.f151779p, (this.f151773j.getWidth() / 2.0f) + this.f151780q, f, new y20() { // from class: l.fdi
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f98477a.m171859T((Float) obj);
            }
        });
        dj30.m116026c(this.f151773j.getHeight() + this.f151779p, (this.f151773j.getHeight() / 2.0f) + this.f151780q, f, new y20() { // from class: l.gdi
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f103713a.m171860U((Float) obj);
            }
        });
        dj30.m116030g(this.f151773j, 1.0f, 0.5f, f);
        dj30.m116031h(this.f151773j, 1.0f, 0.5f, f);
        float interpolation = this.f151762D.getInterpolation(f);
        VDraweeView vDraweeView = this.f151773j;
        float f2 = this.f151781r;
        dj30.m116033j(vDraweeView, f2, this.f151784u + f2, interpolation);
        FemaleMatchSuccessLayout femaleMatchSuccessLayout = this.f151765b;
        float f3 = this.f151783t;
        dj30.m116033j(femaleMatchSuccessLayout, f3, this.f151784u + f3, interpolation);
        VDraweeView vDraweeView2 = this.f151773j;
        if (f < 0.9f) {
            vDraweeView2.setAlpha(1.0f);
            this.f151765b.setAlpha(1.0f);
        } else {
            float f4 = (f * 10.0f) - 9.0f;
            dj30.m116028e(vDraweeView2, 1.0f, 0.0f, f4);
            dj30.m116028e(this.f151765b, 1.0f, 0.0f, f4);
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m171847H(Act act) {
        String str = this.f151788y ? "fisrt_liked" : "female";
        if (!TextUtils.isEmpty(this.f151789z)) {
            str = this.f151789z;
        }
        i4g0.m138523u("e_matched_push_other_area", "p_successful_match_view", pf60.m172085a("matched_received_page_type", str));
        l51.m152890J(this.f151761C);
        act.startActivity(MessagesAct.m50132q2(act, this.f151777n.f56859id, false, false, false, false, null, 2, ""));
        m171841A();
    }

    /* JADX INFO: renamed from: I */
    public final void m171848I() {
        final String strM131717m3 = gra.m131717m3();
        if (TextUtils.isEmpty(strM131717m3)) {
            strM131717m3 = "[" + App.f16088e.getString(R$string.f19328i4) + Constants.AES_SUFFIX;
        }
        final String str = "EMOJI_63";
        bnl0.m105509E0(this.f151771h, new View.OnClickListener() { // from class: l.sci
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f167256a.m171861V(str, strM131717m3, view);
            }
        });
        m171865Z(this.f151769f, this.f151777n);
        uqb0.f180374G.m127115L0(this.f151773j, this.f151777n.m61308fp().profileBig().formatted());
        uqb0.f180374G.m127115L0(this.f151772i, CoreModule.f18264c.f20381e0.m116593na().m61308fp().profileBig().formatted());
        this.f151771h.setText(strM131717m3);
        this.f151768e.getPaint().setFakeBoldText(true);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f151765b.getLayoutParams();
        this.f151765b.setPivotX(((qa00.m175858c().widthPixels - layoutParams.leftMargin) - layoutParams.rightMargin) / 2.0f);
        this.f151765b.setPivotY(layoutParams.height / 2.0f);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f151773j.getLayoutParams();
        this.f151773j.setPivotX(layoutParams2.width / 2.0f);
        this.f151773j.setPivotY(layoutParams2.height / 2.0f);
        this.f151772i.setPivotX(layoutParams2.width / 2.0f);
        this.f151772i.setPivotY(layoutParams2.height / 2.0f);
        m171843C();
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m171849J(Act act) {
        SVGALoader.with(act).from("core_female_match_success_flow_bg.svga").isCacheable(true).autoPlay(true).repeatCount(1).into(this.f151775l);
        m171868y();
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m171850K(float f, Interpolator interpolator, float f2, Float f3) {
        dj30.m116028e(this.f151774k, 1.0f, 0.0f, Math.min(f3.floatValue() / 0.6f, 1.0f));
        dj30.m116032i(this.f151773j, f, 0.0f, interpolator.getInterpolation(f3.floatValue()));
        dj30.m116028e(this.f151773j, 0.0f, 1.0f, f3.floatValue());
        dj30.m116028e(this.f151769f, 1.0f, 0.0f, f3.floatValue());
        dj30.m116033j(this.f151769f, 0.0f, -f2, f3.floatValue());
        dj30.m116028e(this.f151770g, 0.0f, 1.0f, f3.floatValue());
        dj30.m116033j(this.f151770g, f2, 0.0f, f3.floatValue());
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m171851L(User user) {
        bnl0.m105524M(this.f151774k, false);
        bnl0.m105524M(this.f151770g, false);
        m171865Z(this.f151769f, user);
        this.f151769f.setAlpha(1.0f);
        this.f151769f.setTranslationY(0.0f);
        this.f151777n = user;
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m171852M() {
        if (NullChecker.m82486a(this.f151778o)) {
            this.f151778o.dismiss();
            this.f151778o = null;
            f151758F = null;
        }
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m171853N(int i, Interpolator interpolator, Float f) {
        dj30.m116033j(this.f151764a, 0.0f, -i, interpolator.getInterpolation(f.floatValue()));
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m171854O() {
        SVGALoader.SVGARequestBuilder sVGARequestBuilderRepeatCount = SVGALoader.with(this.f151776m).from(gra.m131778z() ? "https://auto.tancdn.com/v1/raw/21a07bab-d71a-48a2-8f84-c161a936051714.svga" : "core_female_match_success_flow_bg.svga").isCacheable(true).autoPlay(true).repeatCount(1);
        if (gra.m131778z()) {
            sVGARequestBuilderRepeatCount.frameMode(SVGAnimationView.FrameMode.AFTER);
        }
        sVGARequestBuilderRepeatCount.into(this.f151775l);
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m171855P(int i, Interpolator interpolator, int i2, Float f) {
        dj30.m116033j(this.f151764a, -i, 0.0f, Math.min(1.0f, f.floatValue() / 0.6f));
        dj30.m116028e(this.f151764a, 0.0f, 1.0f, Math.min(1.0f, f.floatValue() / 0.6f));
        if (f.floatValue() < 0.3f) {
            this.f151772i.setAlpha(0.0f);
            this.f151773j.setAlpha(0.0f);
            return;
        }
        float fFloatValue = (f.floatValue() - 0.3f) / 0.7f;
        float f2 = fFloatValue / 0.3f;
        this.f151773j.setAlpha(Math.min(1.0f, f2));
        this.f151772i.setAlpha(Math.min(1.0f, f2));
        float interpolation = interpolator.getInterpolation(fFloatValue);
        dj30.m116032i(this.f151772i, -i2, 0.0f, interpolation);
        dj30.m116032i(this.f151773j, i2, 0.0f, interpolation);
        float fMin = Math.min(1.0f, fFloatValue * 2.0f);
        dj30.m116029f(this.f151772i, 0.0f, -10.0f, fMin);
        dj30.m116029f(this.f151773j, 0.0f, 10.0f, fMin);
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m171856Q(Float f) {
        if (f.floatValue() <= 0.3f) {
            m171845E(f.floatValue() / 0.3f);
        } else {
            if (this.f151785v <= 0.3f && f.floatValue() > 0.3f) {
                m171845E(1.0f);
            }
            m171846F((f.floatValue() / 0.7f) - 0.42857146f);
        }
        if (f.floatValue() > 0.6f && !CoreModule.f18264c.f20381e0.m116638z7()) {
            CoreModule.f18264c.f20381e0.m116608r9(true);
        }
        this.f151785v = f.floatValue();
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m171857R(Float f) {
        this.f151765b.setMoveX(f.floatValue() / 2.0f);
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m171858S(Float f) {
        this.f151765b.setMoveY(f.floatValue() / 2.0f);
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m171859T(Float f) {
        this.f151765b.setMoveX(f.floatValue() / 2.0f);
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m171860U(Float f) {
        this.f151765b.setMoveY(f.floatValue() / 2.0f);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m171861V(String str, String str2, View view) {
        l51.m152890J(this.f151761C);
        tye.m193572c().m193583l(str);
        d810.m114777j(this.f151776m, this.f151777n, str2, false, new Runnable() { // from class: l.wci
            @Override // java.lang.Runnable
            public final void run() {
                pdi.m171832o();
            }
        }, new Runnable() { // from class: l.xci
            @Override // java.lang.Runnable
            public final void run() {
                pdi.m171839v();
            }
        }, "");
        if (!this.f151786w) {
            m171842B();
            return;
        }
        Act act = this.f151776m;
        if ((act instanceof NewMainAct) && ((NewMainAct) act).m40810d6().m40996U()) {
            m171844D();
        } else {
            m171842B();
        }
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m171862W() {
        if (NullChecker.m82486a(this.f151778o) && this.f151778o.isShowing()) {
            m171842B();
        }
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ boolean m171863X(int i, Act act, View view, MotionEvent motionEvent) {
        if (((int) motionEvent.getY()) >= i) {
            return act.dispatchTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 0) {
            this.f151763E = motionEvent.getY();
            return false;
        }
        if (motionEvent.getAction() != 1 || motionEvent.getX() >= qa00.m175858c().widthPixels - qa00.m175859d(72.0f)) {
            return false;
        }
        float y = motionEvent.getY() - this.f151763E;
        if (Math.abs(y) < 10.0f) {
            m171847H(act);
            return false;
        }
        if (y >= 0.0f) {
            return false;
        }
        l51.m152890J(this.f151761C);
        m171842B();
        return false;
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m171864Y() {
        l4g0 l4g0Var = this.f151787x;
        if (l4g0Var == null) {
            return;
        }
        l4g0Var.m152776k();
        this.f151787x.m152775j();
    }

    /* JADX INFO: renamed from: Z */
    public final void m171865Z(@NonNull TextView textView, @NonNull User user) {
        String strConcat = user.name;
        if (strConcat.length() > 6) {
            strConcat = strConcat.substring(0, 6).concat("...");
        }
        if (!gra.m131607O()) {
            textView.setText("轻触和 " + strConcat + " 聊天");
            return;
        }
        long jM174454o = pzi0.m174454o() - user.getLastActiveTimeMillis();
        if (jM174454o < Constants.INBOX_V2_THROTTLE_WINDOW_MS) {
            textView.setCompoundDrawablesWithIntrinsicBounds(App.f16088e.getResources().getDrawable(dbc0.f86758Yd), (Drawable) null, (Drawable) null, (Drawable) null);
            textView.setCompoundDrawablePadding(qa00.m175859d(1.0f));
            textView.setText("当前在线");
            return;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        textView.setCompoundDrawablePadding(qa00.m175859d(0.0f));
        if (jM174454o < 3600000) {
            textView.setText(String.format("%s分钟前活跃", Long.valueOf(jM174454o / Constants.ONE_MIN_IN_MILLIS)));
            return;
        }
        if (jM174454o < 86400000) {
            textView.setText(String.format("%s小时前活跃", Long.valueOf(jM174454o / 3600000)));
            return;
        }
        if (jM174454o < 172800000) {
            textView.setText("昨天活跃");
            return;
        }
        textView.setText("轻触和 " + strConcat + " 聊天");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0092 A[PHI: r7
      0x0092: PHI (r7v7 java.lang.String) = (r7v6 java.lang.String), (r7v13 java.lang.String) binds: [B:7:0x0087, B:9:0x008f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: a0 */
    public final void m171866a0(final Act act, User user) {
        String str;
        this.f151776m = act;
        this.f151777n = user;
        CoreModule.f18264c.f20381e0.m116608r9(false);
        View viewM171867x = m171867x(act.inflater(), null);
        this.f151759A = wgx.m206284B(act) + qa00.f156323j;
        this.f151760B = (wgx.m206284B(act) + qa00.m175858c().heightPixels) - qa00.m175859d(56.0f);
        bnl0.m105554f0(viewM171867x, this.f151759A);
        PopupWindow popupWindow = new PopupWindow(viewM171867x, -1, this.f151760B, true);
        this.f151778o = popupWindow;
        popupWindow.setClippingEnabled(false);
        final int i = ((RelativeLayout.LayoutParams) this.f151765b.getLayoutParams()).height + this.f151759A;
        this.f151778o.setTouchInterceptor(new View.OnTouchListener() { // from class: l.ndi
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f141496a.m171863X(i, act, view, motionEvent);
            }
        });
        this.f151778o.showAtLocation(act.getWindow().getDecorView(), 49, 0, 0);
        this.f151778o.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: l.odi
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                this.f146907a.m171864Y();
            }
        });
        String str2 = this.f151788y ? "fisrt_liked" : "female";
        if (!TextUtils.isEmpty(this.f151789z)) {
            str2 = this.f151789z;
            str = TextUtils.equals(str2, "long_time_no_see") ? "female" : str2;
        }
        this.f151787x = new l4g0("p_successful_match_view", wgx.class.getName());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("match_source", this.f151788y ? "negative" : "positive");
            jSONObject.put("moments_user_id", user.f56859id);
            jSONObject.put("matched_received_page_type", str);
            if (gra.m131740r1()) {
                jSONObject.put("is_matched_longtimenosee", TextUtils.equals(this.f151789z, "long_time_no_see") ? 1 : 0);
            }
            this.f151787x.m152780o(jSONObject);
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        this.f151787x.m152774i();
        this.f151787x.m152777l();
        m171848I();
    }

    /* JADX INFO: renamed from: x */
    public View m171867x(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return qdi.m176167b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: y */
    public final void m171868y() {
        l51.m152888H(this.f151776m, this.f151761C, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
    }

    /* JADX INFO: renamed from: z */
    public final void m171869z(final Act act, final User user) {
        l51.m152890J(this.f151761C);
        int i = dj30.m116035l().female_enter_time;
        final float f = qa00.f156338y;
        final float f2 = qa00.f156328o;
        uqb0.f180374G.m127115L0(this.f151774k, this.f151777n.m61308fp().profileBig().formatted());
        bnl0.m105524M(this.f151774k, true);
        uqb0.f180374G.m127115L0(this.f151773j, user.m61308fp().profileBig().formatted());
        bnl0.m105524M(this.f151770g, true);
        m171865Z(this.f151770g, user);
        l51.m152888H(act, new Runnable() { // from class: l.jdi
            @Override // java.lang.Runnable
            public final void run() {
                this.f120265a.m171849J(act);
            }
        }, i + WebRtcAudioTrack.AudioTrackErrorCode.AUDIO_TRACK_INIT_MINBUFFER_ERROR);
        final OvershootInterpolator overshootInterpolator = new OvershootInterpolator();
        dj30.m116034k(i, new y20() { // from class: l.kdi
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f125246a.m171850K(f, overshootInterpolator, f2, (Float) obj);
            }
        }, new Runnable() { // from class: l.ldi
            @Override // java.lang.Runnable
            public final void run() {
                this.f131634a.m171851L(user);
            }
        });
    }
}
