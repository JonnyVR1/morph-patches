package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.core.p053ui.match.view.FemaleMatchSuccessLayout;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import com.p069ss.bytertc.audio.device.webrtc.WebRtcAudioTrack;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;
import p147v.VDraweeView;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class aci {

    /* JADX INFO: renamed from: F */
    public static volatile aci f68816F;

    /* JADX INFO: renamed from: a */
    public VRelative f68822a;

    /* JADX INFO: renamed from: b */
    public FemaleMatchSuccessLayout f68823b;

    /* JADX INFO: renamed from: c */
    public View f68824c;

    /* JADX INFO: renamed from: d */
    public SVGAnimationView f68825d;

    /* JADX INFO: renamed from: e */
    public VText f68826e;

    /* JADX INFO: renamed from: f */
    public TextView f68827f;

    /* JADX INFO: renamed from: g */
    public TextView f68828g;

    /* JADX INFO: renamed from: h */
    public VText f68829h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f68830i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f68831j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f68832k;

    /* JADX INFO: renamed from: l */
    public SVGAnimationView f68833l;

    /* JADX INFO: renamed from: m */
    public Act f68834m;

    /* JADX INFO: renamed from: n */
    public User f68835n;

    /* JADX INFO: renamed from: o */
    public PopupWindow f68836o;

    /* JADX INFO: renamed from: x */
    public cwf0 f68845x;

    /* JADX INFO: renamed from: p */
    public final int f68837p = t100.f167255d * 2;

    /* JADX INFO: renamed from: q */
    public final int f68838q = t100.f167254c * 2;

    /* JADX INFO: renamed from: r */
    public float f68839r = 0.0f;

    /* JADX INFO: renamed from: s */
    public float f68840s = 0.0f;

    /* JADX INFO: renamed from: t */
    public final float f68841t = t100.m186890d(200.0f);

    /* JADX INFO: renamed from: u */
    public float f68842u = 0.0f;

    /* JADX INFO: renamed from: v */
    public float f68843v = 0.0f;

    /* JADX INFO: renamed from: w */
    public boolean f68844w = true;

    /* JADX INFO: renamed from: y */
    public boolean f68846y = false;

    /* JADX INFO: renamed from: z */
    public String f68847z = "";

    /* JADX INFO: renamed from: A */
    public int f68817A = 0;

    /* JADX INFO: renamed from: B */
    public int f68818B = 0;

    /* JADX INFO: renamed from: C */
    public final Runnable f68819C = new Runnable() { // from class: l.xbi
        @Override // java.lang.Runnable
        public final void run() {
            this.f191952a.m95796W();
        }
    };

    /* JADX INFO: renamed from: D */
    public final Interpolator f68820D = new PathInterpolator(0.17f, 0.17f, 0.7f, 1.0f);

    /* JADX INFO: renamed from: E */
    public float f68821E = 0.0f;

    /* JADX INFO: renamed from: G */
    public static Act m95748G() {
        Act.C4299r c4299rForeground_ = Act.foreground_();
        if (NullChecker.m81303a(c4299rForeground_) && NullChecker.m81303a(c4299rForeground_.f15343a) && NullChecker.m81303a(c4299rForeground_.f15343a.get()) && (c4299rForeground_.f15343a.get() instanceof Act)) {
            return (Act) c4299rForeground_.f15343a.get();
        }
        return null;
    }

    /* JADX INFO: renamed from: b0 */
    public static void m95751b0(Act act, User user, boolean z, String str) {
        m95753c0(act, user, z, str, false);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m95752c(Throwable th) {
    }

    /* JADX INFO: renamed from: c0 */
    public static void m95753c0(final Act act, final User user, final boolean z, final String str, final boolean z2) {
        act.runOnUiThread(new Runnable() { // from class: l.cbi
            @Override // java.lang.Runnable
            public final void run() {
                aci.m95758g(user, z2, z, str, act);
            }
        });
    }

    /* JADX INFO: renamed from: d0 */
    public static void m95755d0(final String str, final boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        final Act actM95748G = m95748G();
        if (c30.m104964f(actM95748G)) {
            actM95748G.duringCreated((C22306c) CoreModule.f17545c.f19642f0.m32902ap(str).map(new w9j() { // from class: l.nbi
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return CoreModule.f17545c.f19639e0.m169430Pa(str);
                }
            })).subscribe(mkd0.m154956H(new e30() { // from class: l.sbi
                @Override // p149l.e30
                public final void call(Object obj) {
                    aci.m95769r(actM95748G, z, (User) obj);
                }
            }, new e30() { // from class: l.tbi
                @Override // p149l.e30
                public final void call(Object obj) {
                    aci.m95752c((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m95758g(User user, boolean z, boolean z2, String str, Act act) {
        if (user == null) {
            return;
        }
        if (f68816F == null) {
            f68816F = new aci();
        }
        f68816F.f68844w = z;
        f68816F.f68846y = z2;
        f68816F.f68847z = str;
        if (!NullChecker.m81303a(f68816F.f68836o) || !f68816F.f68836o.isShowing()) {
            f68816F.m95800a0(act, user);
        } else {
            if (NullChecker.m81303a(f68816F.f68835n) && TextUtils.equals(user.f56011id, f68816F.f68835n.f56011id)) {
                return;
            }
            f68816F.m95803z(act, user);
        }
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m95766o() {
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m95769r(Act act, boolean z, User user) {
        if (c30.m104964f(act) && v930.m197534h() == TabName.Card && (act instanceof NewMainAct) && ((NewMainAct) act).m39816g6()) {
            m95751b0(act, user, z, "");
        }
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m95773v() {
    }

    /* JADX INFO: renamed from: A */
    public void m95775A() {
        this.f68834m.runOnUiThread(new Runnable() { // from class: l.ebi
            @Override // java.lang.Runnable
            public final void run() {
                this.f90329a.m95786M();
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public final void m95776B() {
        final int iM208434B = xdx.m208434B(this.f68834m) + t100.f167240O + t100.f167261j;
        final PathInterpolator pathInterpolator = new PathInterpolator(0.26f, 0.0f, 0.6f, 0.57f);
        pa30.m167981k(pa30.m167982l().female_exit_time / 2, new e30() { // from class: l.fbi
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f96717a.m95787N(iM208434B, pathInterpolator, (Float) obj);
            }
        }, new gbi(this));
    }

    /* JADX INFO: renamed from: C */
    public final void m95777C() {
        int i = pa30.m167982l().female_enter_time;
        SVGALoader.with(this.f68834m).from(upa.m194847z() ? "https://auto.tancdn.com/v1/raw/24c3c444-03a1-4520-acd3-043962688f0714.svga" : "core_female_match_success_heart_bg.svga").isCacheable(true).autoPlay(true).repeatCount(-1).into(this.f68825d);
        e51.m114743H(this.f68834m, new Runnable() { // from class: l.jbi
            @Override // java.lang.Runnable
            public final void run() {
                this.f117193a.m95788O();
            }
        }, i + WebRtcAudioTrack.AudioTrackErrorCode.AUDIO_TRACK_INIT_MINBUFFER_ERROR);
        final PathInterpolator pathInterpolator = new PathInterpolator(0.34f, 1.6f, 0.61f, 0.96f);
        final int i2 = t100.f167273v;
        final int iM208434B = xdx.m208434B(this.f68834m) + t100.f167240O + t100.f167261j;
        pa30.m167981k(i, new e30() { // from class: l.kbi
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f122242a.m95789P(iM208434B, pathInterpolator, i2, (Float) obj);
            }
        }, new Runnable() { // from class: l.lbi
            @Override // java.lang.Runnable
            public final void run() {
                this.f127297a.m95802y();
            }
        });
    }

    /* JADX INFO: renamed from: D */
    public final void m95778D() {
        float fM186890d = t100.m186890d(200.0f);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f68831j.getLayoutParams();
        this.f68839r = fM186890d - ((layoutParams.topMargin + (layoutParams.height / 2.0f)) - (this.f68823b.getHeight() / 2.0f));
        this.f68840s = (this.f68823b.getWidth() / 2.0f) - ((layoutParams.width / 2.0f) + layoutParams.leftMargin);
        this.f68842u = ((((this.f68818B - this.f68817A) - (layoutParams.height / 2.0f)) - layoutParams.topMargin) - this.f68839r) + (this.f68831j.getHeight() / 2.0f);
        pa30.m167981k(pa30.m167982l().female_exit_time, new e30() { // from class: l.mbi
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f133024a.m95790Q((Float) obj);
            }
        }, new gbi(this));
    }

    /* JADX INFO: renamed from: E */
    public final void m95779E(float f) {
        pa30.m167973c(this.f68823b.getWidth(), this.f68831j.getWidth() + this.f68837p, f, new e30() { // from class: l.obi
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f142943a.m95791R((Float) obj);
            }
        });
        pa30.m167973c(this.f68823b.getHeight(), this.f68831j.getHeight() + this.f68837p, f, new e30() { // from class: l.pbi
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f148086a.m95792S((Float) obj);
            }
        });
        pa30.m167976f(this.f68823b, 0.0f, 10.0f, f);
        pa30.m167980j(this.f68823b, 0.0f, this.f68841t, f);
        pa30.m167979i(this.f68830i, 0.0f, this.f68840s, f);
        pa30.m167980j(this.f68830i, 0.0f, this.f68839r, f);
        pa30.m167975e(this.f68830i, 1.0f, 0.0f, f);
        pa30.m167979i(this.f68831j, 0.0f, this.f68840s, f);
        pa30.m167980j(this.f68831j, 0.0f, this.f68839r, f);
        pa30.m167975e(this.f68826e, 1.0f, 0.0f, f);
        pa30.m167975e(this.f68827f, 1.0f, 0.0f, f);
    }

    /* JADX INFO: renamed from: F */
    public final void m95780F(float f) {
        pa30.m167973c(this.f68831j.getWidth() + this.f68837p, (this.f68831j.getWidth() / 2.0f) + this.f68838q, f, new e30() { // from class: l.qbi
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f153652a.m95793T((Float) obj);
            }
        });
        pa30.m167973c(this.f68831j.getHeight() + this.f68837p, (this.f68831j.getHeight() / 2.0f) + this.f68838q, f, new e30() { // from class: l.rbi
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f158611a.m95794U((Float) obj);
            }
        });
        pa30.m167977g(this.f68831j, 1.0f, 0.5f, f);
        pa30.m167978h(this.f68831j, 1.0f, 0.5f, f);
        float interpolation = this.f68820D.getInterpolation(f);
        VDraweeView vDraweeView = this.f68831j;
        float f2 = this.f68839r;
        pa30.m167980j(vDraweeView, f2, this.f68842u + f2, interpolation);
        FemaleMatchSuccessLayout femaleMatchSuccessLayout = this.f68823b;
        float f3 = this.f68841t;
        pa30.m167980j(femaleMatchSuccessLayout, f3, this.f68842u + f3, interpolation);
        VDraweeView vDraweeView2 = this.f68831j;
        if (f < 0.9f) {
            vDraweeView2.setAlpha(1.0f);
            this.f68823b.setAlpha(1.0f);
        } else {
            float f4 = (f * 10.0f) - 9.0f;
            pa30.m167975e(vDraweeView2, 1.0f, 0.0f, f4);
            pa30.m167975e(this.f68823b, 1.0f, 0.0f, f4);
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m95781H(Act act) {
        String str = this.f68846y ? "fisrt_liked" : "female";
        if (!TextUtils.isEmpty(this.f68847z)) {
            str = this.f68847z;
        }
        zvf0.m220399u("e_matched_push_other_area", "p_successful_match_view", j760.m140076a("matched_received_page_type", str));
        e51.m114745J(this.f68819C);
        act.startActivity(MessagesAct.m48949p2(act, this.f68835n.f56011id, false, false, false, false, null, 2, ""));
        m95775A();
    }

    /* JADX INFO: renamed from: I */
    public final void m95782I() {
        final String strM194786m3 = upa.m194786m3();
        if (TextUtils.isEmpty(strM194786m3)) {
            strM194786m3 = "[" + App.f15369e.getString(R$string.f18536g4) + Constants.AES_SUFFIX;
        }
        final String str = "EMOJI_63";
        xdl0.m208329E0(this.f68829h, new View.OnClickListener() { // from class: l.dbi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f85318a.m95795V(str, strM194786m3, view);
            }
        });
        m95799Z(this.f68827f, this.f68835n);
        qib0.f154691G.m102331L0(this.f68831j, this.f68835n.m60124fp().profileBig().formatted());
        qib0.f154691G.m102331L0(this.f68830i, CoreModule.f17545c.f19639e0.m169520na().m60124fp().profileBig().formatted());
        this.f68829h.setText(strM194786m3);
        this.f68826e.getPaint().setFakeBoldText(true);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f68823b.getLayoutParams();
        this.f68823b.setPivotX(((t100.m186889c().widthPixels - layoutParams.leftMargin) - layoutParams.rightMargin) / 2.0f);
        this.f68823b.setPivotY(layoutParams.height / 2.0f);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f68831j.getLayoutParams();
        this.f68831j.setPivotX(layoutParams2.width / 2.0f);
        this.f68831j.setPivotY(layoutParams2.height / 2.0f);
        this.f68830i.setPivotX(layoutParams2.width / 2.0f);
        this.f68830i.setPivotY(layoutParams2.height / 2.0f);
        m95777C();
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m95783J(Act act) {
        SVGALoader.with(act).from("core_female_match_success_flow_bg.svga").isCacheable(true).autoPlay(true).repeatCount(1).into(this.f68833l);
        m95802y();
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m95784K(float f, Interpolator interpolator, float f2, Float f3) {
        pa30.m167975e(this.f68832k, 1.0f, 0.0f, Math.min(f3.floatValue() / 0.6f, 1.0f));
        pa30.m167979i(this.f68831j, f, 0.0f, interpolator.getInterpolation(f3.floatValue()));
        pa30.m167975e(this.f68831j, 0.0f, 1.0f, f3.floatValue());
        pa30.m167975e(this.f68827f, 1.0f, 0.0f, f3.floatValue());
        pa30.m167980j(this.f68827f, 0.0f, -f2, f3.floatValue());
        pa30.m167975e(this.f68828g, 0.0f, 1.0f, f3.floatValue());
        pa30.m167980j(this.f68828g, f2, 0.0f, f3.floatValue());
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m95785L(User user) {
        xdl0.m208344M(this.f68832k, false);
        xdl0.m208344M(this.f68828g, false);
        m95799Z(this.f68827f, user);
        this.f68827f.setAlpha(1.0f);
        this.f68827f.setTranslationY(0.0f);
        this.f68835n = user;
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m95786M() {
        if (NullChecker.m81303a(this.f68836o)) {
            this.f68836o.dismiss();
            this.f68836o = null;
            f68816F = null;
        }
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m95787N(int i, Interpolator interpolator, Float f) {
        pa30.m167980j(this.f68822a, 0.0f, -i, interpolator.getInterpolation(f.floatValue()));
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m95788O() {
        SVGALoader.SVGARequestBuilder sVGARequestBuilderRepeatCount = SVGALoader.with(this.f68834m).from(upa.m194847z() ? "https://auto.tancdn.com/v1/raw/21a07bab-d71a-48a2-8f84-c161a936051714.svga" : "core_female_match_success_flow_bg.svga").isCacheable(true).autoPlay(true).repeatCount(1);
        if (upa.m194847z()) {
            sVGARequestBuilderRepeatCount.frameMode(SVGAnimationView.FrameMode.AFTER);
        }
        sVGARequestBuilderRepeatCount.into(this.f68833l);
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m95789P(int i, Interpolator interpolator, int i2, Float f) {
        pa30.m167980j(this.f68822a, -i, 0.0f, Math.min(1.0f, f.floatValue() / 0.6f));
        pa30.m167975e(this.f68822a, 0.0f, 1.0f, Math.min(1.0f, f.floatValue() / 0.6f));
        if (f.floatValue() < 0.3f) {
            this.f68830i.setAlpha(0.0f);
            this.f68831j.setAlpha(0.0f);
            return;
        }
        float fFloatValue = (f.floatValue() - 0.3f) / 0.7f;
        float f2 = fFloatValue / 0.3f;
        this.f68831j.setAlpha(Math.min(1.0f, f2));
        this.f68830i.setAlpha(Math.min(1.0f, f2));
        float interpolation = interpolator.getInterpolation(fFloatValue);
        pa30.m167979i(this.f68830i, -i2, 0.0f, interpolation);
        pa30.m167979i(this.f68831j, i2, 0.0f, interpolation);
        float fMin = Math.min(1.0f, fFloatValue * 2.0f);
        pa30.m167976f(this.f68830i, 0.0f, -10.0f, fMin);
        pa30.m167976f(this.f68831j, 0.0f, 10.0f, fMin);
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m95790Q(Float f) {
        if (f.floatValue() <= 0.3f) {
            m95779E(f.floatValue() / 0.3f);
        } else {
            if (this.f68843v <= 0.3f && f.floatValue() > 0.3f) {
                m95779E(1.0f);
            }
            m95780F((f.floatValue() / 0.7f) - 0.42857146f);
        }
        if (f.floatValue() > 0.6f && !CoreModule.f17545c.f19639e0.m169565z7()) {
            CoreModule.f17545c.f19639e0.m169535r9(true);
        }
        this.f68843v = f.floatValue();
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m95791R(Float f) {
        this.f68823b.setMoveX(f.floatValue() / 2.0f);
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m95792S(Float f) {
        this.f68823b.setMoveY(f.floatValue() / 2.0f);
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m95793T(Float f) {
        this.f68823b.setMoveX(f.floatValue() / 2.0f);
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m95794U(Float f) {
        this.f68823b.setMoveY(f.floatValue() / 2.0f);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m95795V(String str, String str2, View view) {
        e51.m114745J(this.f68819C);
        pxe.m171835c().m171846l(str);
        tz00.m191128j(this.f68834m, this.f68835n, str2, false, new Runnable() { // from class: l.hbi
            @Override // java.lang.Runnable
            public final void run() {
                aci.m95766o();
            }
        }, new Runnable() { // from class: l.ibi
            @Override // java.lang.Runnable
            public final void run() {
                aci.m95773v();
            }
        }, "");
        if (!this.f68844w) {
            m95776B();
            return;
        }
        Act act = this.f68834m;
        if ((act instanceof NewMainAct) && ((NewMainAct) act).m39801Z5().m39989U()) {
            m95778D();
        } else {
            m95776B();
        }
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m95796W() {
        if (NullChecker.m81303a(this.f68836o) && this.f68836o.isShowing()) {
            m95776B();
        }
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ boolean m95797X(int i, Act act, View view, MotionEvent motionEvent) {
        if (((int) motionEvent.getY()) >= i) {
            return act.dispatchTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 0) {
            this.f68821E = motionEvent.getY();
            return false;
        }
        if (motionEvent.getAction() != 1 || motionEvent.getX() >= t100.m186889c().widthPixels - t100.m186890d(72.0f)) {
            return false;
        }
        float y = motionEvent.getY() - this.f68821E;
        if (Math.abs(y) < 10.0f) {
            m95781H(act);
            return false;
        }
        if (y >= 0.0f) {
            return false;
        }
        e51.m114745J(this.f68819C);
        m95776B();
        return false;
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m95798Y() {
        cwf0 cwf0Var = this.f68845x;
        if (cwf0Var == null) {
            return;
        }
        cwf0Var.m109035k();
        this.f68845x.m109034j();
    }

    /* JADX INFO: renamed from: Z */
    public final void m95799Z(@NonNull TextView textView, @NonNull User user) {
        String strConcat = user.name;
        if (strConcat.length() > 6) {
            strConcat = strConcat.substring(0, 6).concat("...");
        }
        if (!upa.m194676O()) {
            textView.setText("轻触和 " + strConcat + " 聊天");
            return;
        }
        long jM155944o = mqi0.m155944o() - user.getLastActiveTimeMillis();
        if (jM155944o < Constants.INBOX_V2_THROTTLE_WINDOW_MS) {
            textView.setCompoundDrawablesWithIntrinsicBounds(App.f15369e.getResources().getDrawable(x2c0.f189886Xd), (Drawable) null, (Drawable) null, (Drawable) null);
            textView.setCompoundDrawablePadding(t100.m186890d(1.0f));
            textView.setText("当前在线");
            return;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        textView.setCompoundDrawablePadding(t100.m186890d(0.0f));
        if (jM155944o < 3600000) {
            textView.setText(String.format("%s分钟前活跃", Long.valueOf(jM155944o / Constants.ONE_MIN_IN_MILLIS)));
            return;
        }
        if (jM155944o < 86400000) {
            textView.setText(String.format("%s小时前活跃", Long.valueOf(jM155944o / 3600000)));
            return;
        }
        if (jM155944o < 172800000) {
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
    public final void m95800a0(final Act act, User user) {
        String str;
        this.f68834m = act;
        this.f68835n = user;
        CoreModule.f17545c.f19639e0.m169535r9(false);
        View viewM95801x = m95801x(act.inflater(), null);
        this.f68817A = xdx.m208434B(act) + t100.f167261j;
        this.f68818B = (xdx.m208434B(act) + t100.m186889c().heightPixels) - t100.m186890d(56.0f);
        xdl0.m208374f0(viewM95801x, this.f68817A);
        PopupWindow popupWindow = new PopupWindow(viewM95801x, -1, this.f68818B, true);
        this.f68836o = popupWindow;
        popupWindow.setClippingEnabled(false);
        final int i = ((RelativeLayout.LayoutParams) this.f68823b.getLayoutParams()).height + this.f68817A;
        this.f68836o.setTouchInterceptor(new View.OnTouchListener() { // from class: l.ybi
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f197334a.m95797X(i, act, view, motionEvent);
            }
        });
        this.f68836o.showAtLocation(act.getWindow().getDecorView(), 49, 0, 0);
        this.f68836o.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: l.zbi
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                this.f202443a.m95798Y();
            }
        });
        String str2 = this.f68846y ? "fisrt_liked" : "female";
        if (!TextUtils.isEmpty(this.f68847z)) {
            str2 = this.f68847z;
            str = TextUtils.equals(str2, "long_time_no_see") ? "female" : str2;
        }
        this.f68845x = new cwf0("p_successful_match_view", xdx.class.getName());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("match_source", this.f68846y ? "negative" : "positive");
            jSONObject.put("moments_user_id", user.f56011id);
            jSONObject.put("matched_received_page_type", str);
            if (upa.m194809r1()) {
                jSONObject.put("is_matched_longtimenosee", TextUtils.equals(this.f68847z, "long_time_no_see") ? 1 : 0);
            }
            this.f68845x.m109039o(jSONObject);
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        this.f68845x.m109033i();
        this.f68845x.m109036l();
        m95782I();
    }

    /* JADX INFO: renamed from: x */
    public View m95801x(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return bci.m101064b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: y */
    public final void m95802y() {
        e51.m114743H(this.f68834m, this.f68819C, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
    }

    /* JADX INFO: renamed from: z */
    public final void m95803z(final Act act, final User user) {
        e51.m114745J(this.f68819C);
        int i = pa30.m167982l().female_enter_time;
        final float f = t100.f167276y;
        final float f2 = t100.f167266o;
        qib0.f154691G.m102331L0(this.f68832k, this.f68835n.m60124fp().profileBig().formatted());
        xdl0.m208344M(this.f68832k, true);
        qib0.f154691G.m102331L0(this.f68831j, user.m60124fp().profileBig().formatted());
        xdl0.m208344M(this.f68828g, true);
        m95799Z(this.f68828g, user);
        e51.m114743H(act, new Runnable() { // from class: l.ubi
            @Override // java.lang.Runnable
            public final void run() {
                this.f175697a.m95783J(act);
            }
        }, i + WebRtcAudioTrack.AudioTrackErrorCode.AUDIO_TRACK_INIT_MINBUFFER_ERROR);
        final OvershootInterpolator overshootInterpolator = new OvershootInterpolator();
        pa30.m167981k(i, new e30() { // from class: l.vbi
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f180845a.m95784K(f, overshootInterpolator, f2, (Float) obj);
            }
        }, new Runnable() { // from class: l.wbi
            @Override // java.lang.Runnable
            public final void run() {
                this.f185577a.m95785L(user);
            }
        });
    }
}
