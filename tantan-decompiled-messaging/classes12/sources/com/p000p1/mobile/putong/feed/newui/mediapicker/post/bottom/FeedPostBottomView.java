package com.p000p1.mobile.putong.feed.newui.mediapicker.post.bottom;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.data.Audio;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.TopicCategorie;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p000p1.mobile.putong.feed.newui.kankan.recorder.ComicFaceRecorderActivity;
import com.p000p1.mobile.putong.feed.newui.mediapicker.audiopost.AudioRecordState;
import com.p000p1.mobile.putong.feed.newui.mediapicker.post.C2089a;
import com.p000p1.mobile.putong.feed.newui.mediapicker.post.C2090b;
import com.p000p1.mobile.putong.feed.newui.mediapicker.post.FeedPostPageMediaSelectableHandle;
import com.p000p1.mobile.putong.feed.newui.mediapicker.post.bottom.FeedPostBottomView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.redpointview.FeedRedDotView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.ui.bubble.a;
import com.p1.mobile.android.ui.bubble.d;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p1.mobile.putong.ui.permission.PermissionHelper;
import com.p1.mobile.putong.util.audio.AudioBusinessType;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.bt0;
import l.d30;
import l.e30;
import l.hpd0;
import l.ib1;
import l.j760;
import l.lsi0;
import l.osi0;
import l.t100;
import l.xdl0;
import l.zqx;
import l.zvf0;
import p007l.e1c0;
import p007l.el00;
import p007l.eqg;
import p007l.f3c0;
import p007l.m84;
import p007l.nkg;
import p007l.oe40;
import p007l.u2h;
import p007l.ush;
import p007l.uzb0;
import v.VImage;
import v.VListCell;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedPostBottomView extends ConstraintLayout {

    /* JADX INFO: renamed from: G */
    public static hpd0 f2231G = new hpd0("HAS_SHOW_AT_TIP" + FeedModule.m1139F().userId(), Boolean.FALSE);

    /* JADX INFO: renamed from: A */
    public boolean f2232A;

    /* JADX INFO: renamed from: B */
    public boolean f2233B;

    /* JADX INFO: renamed from: C */
    public int f2234C;

    /* JADX INFO: renamed from: D */
    public InterfaceC2102f f2235D;

    /* JADX INFO: renamed from: E */
    public String f2236E;

    /* JADX INFO: renamed from: F */
    public boolean f2237F;

    /* JADX INFO: renamed from: d */
    public FeedPostBottomTitleTagsView f2238d;

    /* JADX INFO: renamed from: e */
    public FeedPostBottomTopicView f2239e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f2240f;

    /* JADX INFO: renamed from: g */
    public ImageView f2241g;

    /* JADX INFO: renamed from: h */
    public ImageView f2242h;

    /* JADX INFO: renamed from: i */
    public FeedRedDotView f2243i;

    /* JADX INFO: renamed from: j */
    public VImage f2244j;

    /* JADX INFO: renamed from: k */
    public ImageView f2245k;

    /* JADX INFO: renamed from: l */
    public ImageView f2246l;

    /* JADX INFO: renamed from: m */
    public ImageView f2247m;

    /* JADX INFO: renamed from: n */
    public VText f2248n;

    /* JADX INFO: renamed from: o */
    public FrameLayout f2249o;

    /* JADX INFO: renamed from: p */
    public FrameLayout f2250p;

    /* JADX INFO: renamed from: q */
    public FeedPostBottomAlbumView f2251q;

    /* JADX INFO: renamed from: r */
    public FeedPostBottomAudioView f2252r;

    /* JADX INFO: renamed from: s */
    public View f2253s;

    /* JADX INFO: renamed from: t */
    public int f2254t;

    /* JADX INFO: renamed from: u */
    public C2089a f2255u;

    /* JADX INFO: renamed from: v */
    public Act f2256v;

    /* JADX INFO: renamed from: w */
    public InterfaceC2100d f2257w;

    /* JADX INFO: renamed from: x */
    public InterfaceC2101e f2258x;

    /* JADX INFO: renamed from: y */
    public InterfaceC2099c f2259y;

    /* JADX INFO: renamed from: z */
    public d30 f2260z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.post.bottom.FeedPostBottomView$a */
    public class C2097a implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f2261a;

        public C2097a(boolean z) {
            this.f2261a = z;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f2261a) {
                return;
            }
            FeedPostBottomView.this.f2253s.setVisibility(8);
            FeedPostBottomView.this.f2253s.requestLayout();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f2261a) {
                FeedPostBottomView.this.f2253s.setVisibility(0);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.post.bottom.FeedPostBottomView$b */
    public static /* synthetic */ class C2098b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f2263a;

        static {
            int[] iArr = new int[AudioRecordState.values().length];
            f2263a = iArr;
            try {
                iArr[AudioRecordState.WAITING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2263a[AudioRecordState.RECORDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.post.bottom.FeedPostBottomView$c */
    public interface InterfaceC2099c {
        /* JADX INFO: renamed from: a */
        void mo4071a();
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.post.bottom.FeedPostBottomView$d */
    public interface InterfaceC2100d {
        /* JADX INFO: renamed from: a */
        void mo4072a(Audio audio);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.post.bottom.FeedPostBottomView$e */
    public interface InterfaceC2101e {
        /* JADX INFO: renamed from: a */
        void mo4073a();
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.post.bottom.FeedPostBottomView$f */
    public interface InterfaceC2102f {
        /* JADX INFO: renamed from: a */
        void mo4074a(String str);
    }

    public FeedPostBottomView(Context context) {
        super(context);
        this.f2254t = C2090b.f2145X;
    }

    /* JADX INFO: renamed from: F1 */
    private void m3999F1(Act act, final d30 d30Var) {
        PermissionHelper.c().r(new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}).w(false).o(new d30() { // from class: l.ksh
            public final void call() {
                FeedPostBottomView.m4017s0(d30Var);
            }
        }).i(act);
    }

    /* JADX INFO: renamed from: G0 */
    private boolean m4000G0() {
        return PermissionHelper.b(new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"});
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public /* synthetic */ void m4001V0(View view) {
        m4054j1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X0 */
    public /* synthetic */ void m4002X0(View view) {
        zvf0.r("e_moment_poi", "p_moment_post");
        if (NullChecker.a(this.f2258x)) {
            this.f2258x.mo4073a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y0 */
    public /* synthetic */ void m4003Y0(View view) {
        if (NullChecker.a(this.f2259y)) {
            this.f2259y.mo4071a();
        }
        this.f2246l.setSelected(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z0 */
    public /* synthetic */ void m4004Z0(View view) {
        m4051f1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e1 */
    public /* synthetic */ void m4005e1(View view) {
        this.f2239e.m3993K();
    }

    /* JADX INFO: renamed from: n0 */
    public static /* synthetic */ boolean m4012n0(View view, MotionEvent motionEvent) {
        return true;
    }

    /* JADX INFO: renamed from: s0 */
    public static /* synthetic */ void m4017s0(d30 d30Var) {
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: u0 */
    public static /* synthetic */ boolean m4019u0(View view, MotionEvent motionEvent) {
        return false;
    }

    /* JADX INFO: renamed from: A1 */
    public void m4022A1(List<String> list, eqg eqgVar) {
        if (!this.f2238d.m3973z()) {
            this.f2238d.m3972w(this.f2256v, this.f2255u);
        }
        if (!xdl0.O0(this.f2238d)) {
            xdl0.M(this.f2238d, true);
        }
        if (!xdl0.O0(this.f2247m)) {
            xdl0.M(this.f2247m, true);
        }
        if (xdl0.O0(this.f2239e)) {
            xdl0.M(this.f2239e, false);
        }
        this.f2237F = true;
        this.f2238d.m3970C(list, eqgVar);
    }

    /* JADX INFO: renamed from: B0 */
    public void m4023B0() {
        if (this.f2233B) {
            m4056l1();
        } else {
            m4043P0();
        }
    }

    /* JADX INFO: renamed from: B1 */
    public void m4024B1(j760<List<TopicCategorie>, List<TopicMoment>> j760Var) {
        this.f2239e.m3991F(j760Var);
    }

    /* JADX INFO: renamed from: C1 */
    public final void m4025C1() {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f2252r.getLayoutParams();
        marginLayoutParams.height = this.f2254t;
        this.f2252r.setLayoutParams(marginLayoutParams);
        this.f2252r.setKeyboardHeight(Integer.valueOf(this.f2254t));
    }

    /* JADX INFO: renamed from: D0 */
    public boolean m4026D0() {
        return this.f2252r.m3962w();
    }

    /* JADX INFO: renamed from: E0 */
    public void m4027E0() {
        this.f2253s.setOnTouchListener(new View.OnTouchListener() { // from class: l.gsh
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return FeedPostBottomView.m4019u0(view, motionEvent);
            }
        });
        m4033I1(false);
    }

    /* JADX INFO: renamed from: E1 */
    public boolean m4028E1() {
        if (!nkg.m12273x() || ((Boolean) f2231G.get()).booleanValue()) {
            return false;
        }
        f2231G.put(Boolean.TRUE);
        this.f2236E = d.l().t(new a(this.f2256v).D("新玩法上线，点击体验").o(a.P, t100.d(8.0f)).q(a.Q | a.P).b(3000L).x(-t100.d(13.0f)), this.f2246l);
        return true;
    }

    /* JADX INFO: renamed from: G1 */
    public void m4029G1(boolean z) {
        this.f2241g.setSelected(z);
        xdl0.M0(this.f2251q, z);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: H0 */
    public void m4030H0(float f, boolean z) {
        if (this.f2233B) {
            if (m4039L1()) {
                return;
            }
            m4056l1();
            return;
        }
        if (f > 0.0f && m4044Q0()) {
            int[] iArr = new int[2];
            this.f2251q.getLocationInWindow(iArr);
            if (f > iArr[1]) {
                return;
            }
        }
        if (m4044Q0()) {
            this.f2241g.setSelected(false);
            m4061r1(false);
        } else if (z && NullChecker.a(this.f2260z)) {
            this.f2260z.call();
        }
    }

    /* JADX INFO: renamed from: H1 */
    public void m4031H1() {
        this.f2253s.setOnTouchListener(new View.OnTouchListener() { // from class: l.hsh
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return FeedPostBottomView.m4012n0(view, motionEvent);
            }
        });
        m4033I1(true);
    }

    /* JADX INFO: renamed from: I0 */
    public void m4032I0() {
        this.f2251q.m3949p(this.f2256v, this.f2255u);
    }

    /* JADX INFO: renamed from: I1 */
    public final void m4033I1(boolean z) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f2253s, "alpha", z ? 0.0f : 1.0f, z ? 1.0f : 0.0f);
        objectAnimatorOfFloat.setDuration(200L);
        objectAnimatorOfFloat.addListener(new C2097a(z));
        objectAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: J0 */
    public final void m4034J0() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f2251q.getLayoutParams();
        layoutParams.height = this.f2254t;
        this.f2251q.setLayoutParams(layoutParams);
        m4025C1();
        xdl0.C0(this.f2250p, this.f2254t);
    }

    /* JADX INFO: renamed from: J1 */
    public void m4035J1() {
        if (this.f2233B) {
            this.f2252r.m3960F();
        }
    }

    /* JADX INFO: renamed from: K0 */
    public void m4036K0(d30 d30Var) {
        this.f2244j.setVisibility(0);
        m4038L0(d30Var);
        zvf0.x("e_voice_moment_post", "p_moment_post");
    }

    /* JADX INFO: renamed from: K1 */
    public void m4037K1(boolean z) {
        if (this.f2237F) {
            return;
        }
        xdl0.M(this.f2239e, z);
    }

    /* JADX INFO: renamed from: L0 */
    public final void m4038L0(final d30 d30Var) {
        xdl0.E0(this.f2244j, new View.OnClickListener() { // from class: l.fsh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8244a.m4046S0(d30Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: L1 */
    public boolean m4039L1() {
        return this.f2253s.getVisibility() == 0;
    }

    /* JADX INFO: renamed from: M1 */
    public void m4040M1(Integer num) {
        setAlbumHeight(num);
    }

    /* JADX INFO: renamed from: N0 */
    public void m4041N0() {
        this.f2252r.m3963z(this.f2256v, new e30() { // from class: l.ssh
            public final void call(Object obj) {
                this.f13072a.m4047T0(obj);
            }
        }, new e30() { // from class: l.tsh
            public final void call(Object obj) {
                this.f13414a.m4048U0(obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O0 */
    public void m4042O0(final Act act, C2089a c2089a) {
        this.f2256v = act;
        this.f2255u = c2089a;
        addView(m4067y0(LayoutInflater.from(act), this));
        if (u2h.m14723h()) {
            this.f2241g.setImageResource(f3c0.f7783d3);
            this.f2242h.setImageResource(f3c0.f7799f3);
            this.f2244j.setImageResource(f3c0.f7791e3);
            this.f2245k.setImageResource(f3c0.f7807g3);
            this.f2247m.setImageResource(f3c0.f7815h3);
            this.f2248n.setTextColor(getResources().getColor(e1c0.f7142h));
            Drawable drawable = getResources().getDrawable(f3c0.f7743Y1);
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            this.f2248n.setCompoundDrawables((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        }
        xdl0.E0(this.f2242h, new View.OnClickListener() { // from class: l.msh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10564a.m4001V0(view);
            }
        });
        xdl0.E0(this.f2245k, new View.OnClickListener() { // from class: l.nsh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10860a.m4002X0(view);
            }
        });
        xdl0.M(this.f2246l, nkg.m12273x());
        xdl0.E0(this.f2246l, new View.OnClickListener() { // from class: l.osh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11612a.m4003Y0(view);
            }
        });
        xdl0.E0(this.f2241g, new View.OnClickListener() { // from class: l.psh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11972a.m4004Z0(view);
            }
        });
        this.f2248n.getPaint().setFakeBoldText(true);
        this.f2248n.setText(el00.m9903k().m9907j());
        this.f2234C = el00.m9903k().m9905h();
        xdl0.E0(this.f2248n, new View.OnClickListener() { // from class: l.qsh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12360a.m4050d1(act, view);
            }
        });
        xdl0.M(this.f2247m, false);
        xdl0.E0(this.f2247m, new View.OnClickListener() { // from class: l.rsh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12733a.m4005e1(view);
            }
        });
        this.f2239e.m3996z(act, c2089a);
        m4034J0();
    }

    /* JADX INFO: renamed from: P0 */
    public void m4043P0() {
        this.f2244j.setSelected(true);
        if (m4044Q0() || this.f2232A) {
            m4029G1(false);
            xdl0.M0(this.f2250p, true);
            this.f2252r.m3961v(true);
        } else {
            xdl0.M0(this.f2250p, true);
            xdl0.M0(this.f2252r, true);
            m4061r1(true);
        }
        if (this.f2232A && NullChecker.a(this.f2260z)) {
            this.f2260z.call();
        }
        this.f2233B = true;
        zvf0.x("e_voice_button", "p_moment_post");
    }

    /* JADX INFO: renamed from: Q0 */
    public boolean m4044Q0() {
        return this.f2241g.isSelected();
    }

    /* JADX INFO: renamed from: R0 */
    public boolean m4045R0() {
        return this.f2233B;
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m4046S0(d30 d30Var, View view) {
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
        m4055k1(true);
    }

    /* JADX INFO: renamed from: T0 */
    public final /* synthetic */ void m4047T0(Object obj) {
        if (NullChecker.a(this.f2257w)) {
            this.f2257w.mo4072a((Audio) obj);
        }
        m4027E0();
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ void m4048U0(Object obj) {
        int i = C2098b.f2263a[((AudioRecordState) obj).ordinal()];
        if (i == 1) {
            m4027E0();
        } else {
            if (i != 2) {
                return;
            }
            m4031H1();
        }
    }

    /* JADX INFO: renamed from: a1 */
    public final /* synthetic */ void m4049a1(VListCell.a aVar, int i) {
        this.f2248n.setText(el00.m9903k().m9909m(i));
        this.f2234C = i;
        if (NullChecker.a(this.f2235D)) {
            this.f2235D.mo4074a(el00.m9903k().m9911o(this.f2234C));
        }
    }

    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ void m4050d1(Act act, View view) {
        el00.m9903k().m9916t(act, this.f2234C, new el00.InterfaceC2377b() { // from class: l.ish
            @Override // p007l.el00.InterfaceC2377b
            /* JADX INFO: renamed from: a */
            public final void mo9929a(VListCell.a aVar, int i) {
                this.f9131a.m4049a1(aVar, i);
            }
        });
    }

    /* JADX INFO: renamed from: g1 */
    public final /* synthetic */ void m4052g1(int i) {
        xdl0.C0(this.f2250p, i);
    }

    public String getSelectedFolderPath() {
        return this.f2251q.getSelectedFolderPath();
    }

    public int getSelectedPosition() {
        return this.f2234C;
    }

    public List<TopicMoment> getTopicList() {
        return this.f2239e.getTopicList();
    }

    /* JADX INFO: renamed from: h1 */
    public final /* synthetic */ void m4053h1(ValueAnimator valueAnimator) {
        xdl0.C0(this.f2250p, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: renamed from: j1 */
    public void m4054j1() {
        AudioBusinessType audioBusinessTypeC = ib1.b().c();
        if (NullChecker.a(audioBusinessTypeC)) {
            osi0.g(audioBusinessTypeC.getBusinessMsg());
            return;
        }
        if (FeedPostPageMediaSelectableHandle.m3683c(this.f2255u.m3784g1(), this.f2255u.f2134p)) {
            if (this.f2255u.m3790m1()) {
                ComicFaceRecorderActivity.m3041h2(this.f2256v);
                return;
            }
            if (this.f2251q.m3950s()) {
                oe40.m12577h0(this.f2256v, this.f2255u.m3784g1().size() > 0, null, "", true, false);
            } else if (this.f2255u.m3784g1().size() == this.f2251q.getMaxCount()) {
                lsi0.h(R$string.f354F1);
                return;
            } else {
                this.f2243i.m6157k();
                oe40.m12577h0(this.f2256v, this.f2255u.m3784g1().size() > 0, this.f2251q.getSelectedImages(), this.f2251q.getSelectedFolderPath(), true, false);
            }
            m84.m11844e().m11854k();
        }
    }

    /* JADX INFO: renamed from: k1 */
    public void m4055k1(boolean z) {
        AudioBusinessType audioBusinessTypeC = ib1.b().c();
        if (NullChecker.a(audioBusinessTypeC)) {
            osi0.g(audioBusinessTypeC.getBusinessMsg());
            return;
        }
        zvf0.r("e_voice_moment_post", "p_moment_post");
        if (FeedPostPageMediaSelectableHandle.m3682b(this.f2255u.m3784g1(), this.f2255u.f2134p)) {
            m4041N0();
            m4023B0();
        }
    }

    /* JADX INFO: renamed from: l1 */
    public void m4056l1() {
        this.f2233B = false;
        if (!this.f2232A && !m4044Q0()) {
            m4061r1(false);
        }
        if (this.f2232A) {
            xdl0.M0(this.f2250p, false);
        }
        this.f2244j.setSelected(false);
        this.f2253s.setVisibility(8);
    }

    /* JADX INFO: renamed from: n1, reason: merged with bridge method [inline-methods] */
    public final void m4051f1() {
        if (!zqx.k() && !m4000G0()) {
            m3999F1(this.f2256v, new d30() { // from class: l.jsh
                public final void call() {
                    this.f9513a.m4051f1();
                }
            });
        } else if (FeedPostPageMediaSelectableHandle.m3681a(this.f2255u.m3784g1(), this.f2255u.f2134p)) {
            m4062s1();
        }
    }

    /* JADX INFO: renamed from: o1 */
    public void m4058o1(boolean z) {
        this.f2251q.m3951u(z);
    }

    /* JADX INFO: renamed from: p1 */
    public void m4059p1(String str, List<TopicMoment> list) {
        if (this.f2237F) {
            return;
        }
        this.f2239e.m3989C(str, list);
    }

    /* JADX INFO: renamed from: q1 */
    public void m4060q1(ArrayList<Media> arrayList) {
        this.f2251q.m3952v(arrayList);
    }

    /* JADX INFO: renamed from: r1 */
    public final void m4061r1(boolean z) {
        int i = z ? 0 : this.f2254t;
        final int i2 = z ? this.f2254t : 0;
        Animator animatorK = bt0.k(ValueAnimator.ofInt(i, i2), new LinearInterpolator(), 0L, z ? 200L : 300L);
        ((ValueAnimator) animatorK).addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.esh
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f7473a.m4053h1(valueAnimator);
            }
        });
        bt0.f(animatorK, new Runnable() { // from class: l.lsh
            @Override // java.lang.Runnable
            public final void run() {
                this.f10127a.m4052g1(i2);
            }
        });
        animatorK.start();
    }

    /* JADX INFO: renamed from: s1 */
    public void m4062s1() {
        if (this.f2251q.m3950s()) {
            return;
        }
        if (NullChecker.a(this.f2251q.getSelectedVideo())) {
            lsi0.h(R$string.f528h0);
            return;
        }
        Act act = this.f2256v;
        act.startActivityForResult(MediaPickerAct.X1(act, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(9).build()).withVideoPickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).build()).withAlreadySelectedMedia(this.f2255u.m3784g1()).withSelectedFolderPath(this.f2251q.getSelectedFolderPath()).withFromType(2).withMediaPreviewPageId("p_camera_album_picture_preview").needAllSelectedMediaPreview().withIsNewUIAb(u2h.m14723h()).build()), 66);
        this.f2256v.overridePendingTransition(uzb0.f13995i, 0);
    }

    public void setAlbumHeight(Integer num) {
        if (num.intValue() == 0 || this.f2254t == num.intValue()) {
            return;
        }
        this.f2254t = num.intValue();
        m4034J0();
    }

    public void setFeedPostAtListener(InterfaceC2099c interfaceC2099c) {
        this.f2259y = interfaceC2099c;
    }

    public void setFeedPostAudioFinishListener(InterfaceC2100d interfaceC2100d) {
        this.f2257w = interfaceC2100d;
    }

    public void setFeedPostLocationListener(InterfaceC2101e interfaceC2101e) {
        this.f2258x = interfaceC2101e;
    }

    public void setHideInputEditFieldAction(d30 d30Var) {
        this.f2260z = d30Var;
    }

    public void setIMomentVisibleChangedListener(InterfaceC2102f interfaceC2102f) {
        this.f2235D = interfaceC2102f;
    }

    public void setSelectedImages(ArrayList<Media> arrayList) {
        this.f2251q.setSelectedImages(arrayList);
    }

    /* JADX INFO: renamed from: t1 */
    public void m4063t1(Boolean bool) {
        if (bool.booleanValue() == this.f2232A) {
            return;
        }
        this.f2232A = bool.booleanValue();
        if (bool.booleanValue()) {
            m4066w1();
        } else {
            m4065v1();
        }
    }

    /* JADX INFO: renamed from: u1 */
    public void m4064u1(boolean z) {
        xdl0.M(this.f2243i, z);
    }

    /* JADX INFO: renamed from: v1 */
    public final void m4065v1() {
        if (m4044Q0() || this.f2233B) {
            return;
        }
        m4061r1(this.f2232A);
    }

    /* JADX INFO: renamed from: w1 */
    public final void m4066w1() {
        if (m4044Q0()) {
            m4029G1(false);
        } else if (this.f2233B) {
            m4056l1();
        } else {
            xdl0.M0(this.f2250p, false);
            m4061r1(this.f2232A);
        }
    }

    /* JADX INFO: renamed from: y0 */
    public View m4067y0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ush.m15134b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: y1 */
    public void m4068y1(String str) {
        this.f2251q.m3953w(str);
    }

    /* JADX INFO: renamed from: z0 */
    public void m4069z0() {
        if (this.f2232A || this.f2250p.getHeight() == 0) {
            return;
        }
        m4061r1(false);
    }

    /* JADX INFO: renamed from: z1 */
    public void m4070z1() {
        this.f2239e.m3990E();
    }

    public FeedPostBottomView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2254t = C2090b.f2145X;
    }

    public FeedPostBottomView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2254t = C2090b.f2145X;
    }
}
