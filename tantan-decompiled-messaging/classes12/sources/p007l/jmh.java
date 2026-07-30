package p007l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.ViewPager;
import com.p000p1.mobile.putong.data.FollowshipStatus;
import com.p000p1.mobile.putong.data.Music;
import com.p000p1.mobile.putong.data.PartialIdList;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.RawFeed;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinminetab.FeedWriterLevelView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feedbottom.insert.FeedInteractiveView;
import com.p000p1.mobile.putong.feed.newui.view.FeedUserSexAndAgeView;
import com.p000p1.mobile.putong.feed.p005ui.FeedPhotoPreviewView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.newui.view.InnerClickSpanTextView;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.e51;
import l.eqh0;
import l.i0g0;
import l.jjb0;
import l.mkd0;
import l.qib0;
import l.t100;
import l.xdl0;
import v.VDraweeView;
import v.VEditText;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class jmh extends jpg {

    /* JADX INFO: renamed from: E0 */
    public VText f9393E0;

    /* JADX INFO: renamed from: F0 */
    public RelativeLayout f9394F0;

    /* JADX INFO: renamed from: G0 */
    public VText f9395G0;

    /* JADX INFO: renamed from: H0 */
    public LinearLayout f9396H0;

    /* JADX INFO: renamed from: I0 */
    public TextView f9397I0;

    /* JADX INFO: renamed from: J */
    public ConstraintLayout f9398J;

    /* JADX INFO: renamed from: J0 */
    public InnerClickSpanTextView f9399J0;

    /* JADX INFO: renamed from: K */
    public View f9400K;

    /* JADX INFO: renamed from: K0 */
    public FeedInteractiveView f9401K0;

    /* JADX INFO: renamed from: L */
    public LinearLayout f9402L;

    /* JADX INFO: renamed from: L0 */
    public VLinear f9403L0;

    /* JADX INFO: renamed from: M */
    public VImage f9404M;

    /* JADX INFO: renamed from: M0 */
    public VImage f9405M0;

    /* JADX INFO: renamed from: N */
    public VText f9406N;

    /* JADX INFO: renamed from: N0 */
    public VText f9407N0;

    /* JADX INFO: renamed from: O */
    public VImage f9408O;

    /* JADX INFO: renamed from: O0 */
    public VLinear f9409O0;

    /* JADX INFO: renamed from: P */
    public VImage f9410P;

    /* JADX INFO: renamed from: P0 */
    public VImage f9411P0;

    /* JADX INFO: renamed from: Q */
    public View f9412Q;

    /* JADX INFO: renamed from: Q0 */
    public VText f9413Q0;

    /* JADX INFO: renamed from: R */
    public ConstraintLayout f9414R;

    /* JADX INFO: renamed from: R0 */
    public VLinear f9415R0;

    /* JADX INFO: renamed from: S */
    public VDraweeView f9416S;

    /* JADX INFO: renamed from: S0 */
    public VImage f9417S0;

    /* JADX INFO: renamed from: T */
    public VDraweeView f9418T;

    /* JADX INFO: renamed from: T0 */
    public VText f9419T0;

    /* JADX INFO: renamed from: U */
    public VText f9420U;

    /* JADX INFO: renamed from: U0 */
    public View f9421U0;

    /* JADX INFO: renamed from: V */
    public LinearLayout f9422V;

    /* JADX INFO: renamed from: V0 */
    public LinearLayout f9423V0;

    /* JADX INFO: renamed from: W */
    public VImage f9424W;

    /* JADX INFO: renamed from: W0 */
    public LinearLayout f9425W0;

    /* JADX INFO: renamed from: X */
    public VLinear f9426X;

    /* JADX INFO: renamed from: X0 */
    public View f9427X0;

    /* JADX INFO: renamed from: Y */
    public FeedWriterLevelView f9428Y;

    /* JADX INFO: renamed from: Y0 */
    public LinearLayout f9429Y0;

    /* JADX INFO: renamed from: Z */
    public LinearLayout f9430Z;

    /* JADX INFO: renamed from: Z0 */
    public VEditText f9431Z0;

    /* JADX INFO: renamed from: a1 */
    public TextView f9432a1;

    /* JADX INFO: renamed from: b1 */
    public VLinear f9433b1;

    /* JADX INFO: renamed from: c1 */
    public boolean f9434c1;

    /* JADX INFO: renamed from: d1 */
    public float f9435d1;

    /* JADX INFO: renamed from: e1 */
    public float f9436e1;

    /* JADX INFO: renamed from: f1 */
    public float f9437f1;

    /* JADX INFO: renamed from: g1 */
    public boolean f9438g1;

    /* JADX INFO: renamed from: h1 */
    public boolean f9439h1;

    /* JADX INFO: renamed from: i1 */
    public boolean f9440i1;

    /* JADX INFO: renamed from: k0 */
    public ImageView f9441k0;

    /* JADX INFO: renamed from: p0 */
    public VText f9442p0;

    /* JADX INFO: renamed from: l.jmh$a */
    public class C2404a extends AnimatorListenerAdapter {
        public C2404a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            jmh.this.m11223N0();
        }
    }

    public jmh(Moment moment, boolean z, boolean z2, Act act) {
        super(act);
        this.f9434c1 = true;
        this.f9466A = moment;
        this.f9439h1 = z;
        this.f9440i1 = z2;
        this.f9498x = "photo";
        if (NullChecker.a(moment)) {
            this.f9467B = FeedModule.f316d.m16628e8(moment.owner);
        }
        m11216H0();
    }

    /* JADX INFO: renamed from: A0 */
    public View m11208A0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return kmh.m11505b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: B0 */
    public void m11209B0() {
        this.f9476b = this.f9416S;
        this.f9477c = this.f9418T;
        this.f9479e = this.f9420U;
        this.f9480f = this.f9395G0;
        this.f9481g = this.f9399J0;
        this.f9482h = this.f9405M0;
        this.f9483i = this.f9407N0;
        this.f9485k = this.f9413Q0;
        this.f9484j = this.f9411P0;
        this.f9486l = this.f9423V0;
        this.f9487m = this.f9425W0;
        this.f9488n = this.f9431Z0;
        this.f9489o = this.f9432a1;
        this.f9475a = this.f9400K;
        this.f9490p = this.f9402L;
        this.f9494t = this.f9414R;
        this.f9492r = this.f9406N;
        this.f9491q = this.f9404M;
        this.f9493s = this.f9410P;
        this.f9495u = this.f9412Q;
        this.f9496v = this.f9429Y0;
        this.f9497w = this.f9401K0;
    }

    /* JADX INFO: renamed from: C0 */
    public void m11210C0() {
        ViewGroup.LayoutParams aVar = new ConstraintLayout.a(t100.d(72.0f), -1);
        ((ConstraintLayout.a) aVar).g = this.f9414R.getId();
        ((ConstraintLayout.a) aVar).h = this.f9403L0.getId();
        this.f9409O0.setLayoutParams(aVar);
        this.f9409O0.setBackground(null);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f9411P0.getLayoutParams();
        layoutParams.width = t100.d(24.0f);
        layoutParams.height = t100.d(24.0f);
        layoutParams.setMargins(0, 0, 0, 0);
        this.f9411P0.setLayoutParams(layoutParams);
        this.f9411P0.setImageResource(u2h.m14723h() ? f3c0.f7927v3 : f3c0.f7935w3);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f9413Q0.getLayoutParams();
        this.f9413Q0.setPadding(0, 0, 0, 0);
        layoutParams2.leftMargin = t100.d(6.0f);
        this.f9413Q0.setLayoutParams(layoutParams2);
        this.f9413Q0.setTextSize(13.0f);
    }

    /* JADX INFO: renamed from: D0 */
    public final void m11211D0() {
        if (nkg.m12255o()) {
            xdl0.M(this.f9423V0, false);
        }
        xdl0.M(this.f9415R0, false);
        m11210C0();
        m11212E0();
        if (u2h.m14723h()) {
            this.f9411P0.setImageResource(f3c0.f7927v3);
            this.f9417S0.setImageResource(TextUtils.equals(m11280A().getString(R$string.f575n5), this.f9419T0.getText()) ? f3c0.f7856m4 : f3c0.f7832j4);
        }
        if (nkg.m12255o()) {
            xdl0.M(this.f9409O0, false);
            xdl0.M(this.f9415R0, false);
            xdl0.M(this.f9421U0, false);
            xdl0.U(this.f9414R, t100.d(24.0f));
        }
        FeedModule.m1140H().a().I5();
        if (u2h.m14723h()) {
            ConstraintLayout.a aVar = new ConstraintLayout.a(t100.d(-2.0f), -1);
            aVar.g = this.f9414R.getId();
            aVar.h = this.f9403L0.getId();
            ((ViewGroup.MarginLayoutParams) aVar).rightMargin = t100.d(12.0f);
            this.f9415R0.setLayoutParams(aVar);
            this.f9415R0.setGravity(16);
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.f9415R0.getLayoutParams();
        int i = layoutParams.width;
        int i2 = t100.J;
        if (i != i2) {
            layoutParams.width = i2;
            this.f9415R0.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: E0 */
    public void m11212E0() {
        ConstraintLayout.a aVar = new ConstraintLayout.a(t100.d(76.0f), -1);
        if (nkg.m12255o()) {
            ((ViewGroup.MarginLayoutParams) aVar).width = -2;
        }
        ((ViewGroup.MarginLayoutParams) aVar).bottomMargin = t100.d(16.0f);
        aVar.f = this.f9409O0.getId();
        aVar.j = this.f9421U0.getId();
        this.f9403L0.setLayoutParams(aVar);
        this.f9403L0.setBackground(null);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f9405M0.getLayoutParams();
        layoutParams.width = t100.d(24.0f);
        layoutParams.height = t100.d(24.0f);
        layoutParams.setMargins(0, 0, 0, 0);
        this.f9405M0.setLayoutParams(layoutParams);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f9407N0.getLayoutParams();
        this.f9407N0.setPadding(0, 0, 0, 0);
        layoutParams2.leftMargin = t100.d(6.0f);
        if (nkg.m12255o()) {
            layoutParams2.leftMargin = t100.d(3.0f);
            layoutParams2.rightMargin = t100.d(12.0f);
        }
        this.f9407N0.setLayoutParams(layoutParams2);
        this.f9407N0.setTextSize(13.0f);
    }

    /* JADX INFO: renamed from: F0 */
    public void m11213F0() {
        ValueAnimator valueAnimatorOfFloat;
        boolean z = this.f9434c1;
        ConstraintLayout constraintLayout = this.f9414R;
        if (z) {
            valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, constraintLayout.getHeight() + this.f9423V0.getHeight() + (nkg.m12255o() ? t100.d(52.0f) : t100.d(4.0f)));
        } else {
            valueAnimatorOfFloat = ValueAnimator.ofFloat(constraintLayout.getHeight() + this.f9423V0.getHeight() + (nkg.m12255o() ? t100.d(52.0f) : t100.d(4.0f)), 0.0f);
        }
        valueAnimatorOfFloat.addListener(new C2404a());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.imh
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f9100a.m11217I0(valueAnimator);
            }
        });
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: G0 */
    public final void m11214G0() {
        if (vs0.m15566d(this.f9466A)) {
            this.f9395G0.setVisibility(8);
        }
    }

    @Override // p007l.jpg
    /* JADX INFO: renamed from: H */
    public View mo11215H() {
        View viewM11208A0 = m11208A0(LayoutInflater.from(this.f9468C), null);
        m11211D0();
        m11209B0();
        return viewM11208A0;
    }

    /* JADX INFO: renamed from: H0 */
    public final void m11216H0() {
        if (u2h.m14716a() && NullChecker.a(this.f9467B)) {
            m11280A().duringCreated(ovi.m12869b(((DbObject) this.f9467B).id)).subscribe(mkd0.G(new e30() { // from class: l.emh
                public final void call(Object obj) {
                    this.f7432a.m11221M0((Boolean) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m11217I0(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float f = -fFloatValue;
        this.f9402L.setTranslationY(f);
        this.f9400K.setTranslationY(f);
        this.f9414R.setTranslationY(fFloatValue);
        this.f9412Q.setTranslationY(fFloatValue);
        this.f9423V0.setTranslationY(fFloatValue);
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m11218J0(View view) {
        m11318r0();
        m11319s0(true);
    }

    /* JADX INFO: renamed from: K0 */
    public final /* synthetic */ void m11219K0(View view) {
        this.f9473H.m17342A(this.f9466A);
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m11220L0() {
        this.f9467B = FeedModule.f316d.m16628e8(((DbObject) this.f9467B).id);
        if (NullChecker.a(this.f9466A)) {
            this.f9438g1 = vqg.m15497U(FeedModule.m1140H().Zj(((DbObject) this.f9467B).id)) && !vs0.m15566d(this.f9466A);
        }
        m11211D0();
    }

    /* JADX INFO: renamed from: M0 */
    public final /* synthetic */ void m11221M0(Boolean bool) {
        e51.H(m11280A(), new Runnable() { // from class: l.fmh
            @Override // java.lang.Runnable
            public final void run() {
                this.f8166a.m11220L0();
            }
        }, 1000L);
    }

    @Override // p007l.jpg
    /* JADX INFO: renamed from: N */
    public void mo11222N() {
        xdl0.E0(this.f9409O0, new View.OnClickListener() { // from class: l.gmh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8482a.m11218J0(view);
            }
        });
        xdl0.E0(this.f9403L0, new View.OnClickListener() { // from class: l.hmh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8775a.m11219K0(view);
            }
        });
    }

    /* JADX INFO: renamed from: N0 */
    public final void m11223N0() {
        this.f9434c1 = !this.f9434c1;
        this.f9435d1 = this.f9402L.getTranslationY();
        this.f9436e1 = this.f9414R.getTranslationY();
        this.f9437f1 = this.f9400K.getTranslationY();
    }

    @Override // p007l.jpg
    /* JADX INFO: renamed from: P */
    public void mo11224P(Moment moment) {
        super.mo11224P(moment);
        mo11227f0(this.f9473H.f15711f);
        String strM8417q = a5i.m8417q(moment.createdTime);
        if (nkg.m12203C() && vqg.m15504a0(this.f9473H.f15717l)) {
            User userM16628e8 = FeedModule.f316d.m16628e8(moment.owner);
            strM8417q = vqg.m15479H((long) moment.createdTime, userM16628e8 == null ? 0L : userM16628e8.getLastActiveTimeMillis());
        }
        this.f9393E0.setText(strM8417q);
        xdl0.M(this.f9393E0, !TextUtils.isEmpty(strM8417q));
        this.f9442p0.setVisibility(8);
        this.f9441k0.setVisibility(8);
    }

    @Override // p007l.jpg
    /* JADX INFO: renamed from: Q */
    public void mo11225Q(User user) {
        super.mo11225Q(user);
        FeedUserSexAndAgeView feedUserSexAndAgeView = (FeedUserSexAndAgeView) View.inflate(m11280A(), o6c0.f11231i3, null);
        feedUserSexAndAgeView.m7540d(user, 4, 6);
        this.f9426X.removeAllViews();
        this.f9426X.addView(feedUserSexAndAgeView);
        xdl0.M(this.f9426X, true);
        if (jjb0.b()) {
            qib0.b0.b.showUserVerificationLogo(m11280A(), user, this.f9424W);
        }
    }

    @Override // p007l.jpg, p007l.uvh
    /* JADX INFO: renamed from: f */
    public void mo11226f(ViewPager viewPager, int i, int i2) {
        super.mo11226f(viewPager, i, i2);
        Object objFindViewWithTag = viewPager.findViewWithTag(Integer.valueOf(i));
        if (objFindViewWithTag instanceof FeedPhotoPreviewView) {
            ((FeedPhotoPreviewView) objFindViewWithTag).reset();
        }
    }

    @Override // p007l.jpg
    /* JADX INFO: renamed from: f0 */
    public void mo11227f0(int i) {
        super.mo11227f0(i);
        zeh zehVar = this.f9473H;
        if (zehVar != null) {
            zehVar.f15711f = i;
        }
        this.f9406N.setText(String.format("%d/%d", Integer.valueOf(i + 1), Integer.valueOf(this.f9469D.size())));
        this.f9474I = i;
    }

    @Override // p007l.jpg, p007l.uvh
    /* JADX INFO: renamed from: g */
    public void mo11228g() {
        if (this.f9499y) {
            this.f9468C.hideInput();
        } else {
            m11213F0();
        }
    }

    @Override // p007l.jpg
    /* JADX INFO: renamed from: g0 */
    public void mo11229g0(User user) {
        this.f9467B = user;
        if (!((DbObject) user).id.equals(qib0.b0.a.userId()) && (!NullChecker.a(user.localRelationship) || !TEnum.equals(user.localRelationship.state, "matched"))) {
            this.f9395G0.setSelected(false);
            if (nkg.m12255o()) {
                this.f9395G0.setVisibility(0);
                this.f9395G0.setTextColor(Color.parseColor("#ffffff"));
                this.f9395G0.setText("打招呼");
                this.f9395G0.setTypeface(eqh0.c(3), 1);
                xdl0.C0(this.f9395G0, t100.d(34.0f));
                this.f9395G0.setTextSize(14.0f);
                this.f9395G0.setBackgroundResource(u2h.m14723h() ? f3c0.f7872o4 : f3c0.f7864n4);
                zi60.m17436w().m17463t(this.f9466A, "p_moment_preview", true, false);
            } else if (nkg.m12213K()) {
                if (swh.m14341i(user) || nkg.m12259q()) {
                    this.f9395G0.setVisibility(8);
                } else {
                    this.f9395G0.setVisibility(0);
                    this.f9395G0.setTextColor(Color.parseColor("#ffffff"));
                    this.f9395G0.setText("喜欢");
                    this.f9395G0.setTypeface(eqh0.c(3), 1);
                    xdl0.C0(this.f9395G0, t100.d(34.0f));
                    this.f9395G0.setTextSize(14.0f);
                    this.f9395G0.setBackgroundResource(u2h.m14723h() ? f3c0.f7872o4 : f3c0.f7864n4);
                    this.f9473H.m17365X();
                }
            } else if (NullChecker.a(user.localFollowship)) {
                FollowshipStatus followshipStatus = user.localFollowship.state;
                if (TEnum.equals(followshipStatus, FollowshipStatus.following)) {
                    this.f9395G0.setVisibility(0);
                    this.f9395G0.setTextColor(Color.parseColor("#ffffff"));
                    this.f9395G0.setBackground(this.f9468C.getResources().getDrawable(f3c0.f7919u3));
                    this.f9395G0.setText(R$string.f415P2);
                    this.f9395G0.setSelected(true);
                } else {
                    boolean zEquals = TEnum.equals(followshipStatus, "matched");
                    VText vText = this.f9395G0;
                    if (zEquals) {
                        vText.setVisibility(0);
                        this.f9395G0.setText(R$string.f403N2);
                        this.f9395G0.setTextColor(Color.parseColor("#ffffff"));
                        this.f9395G0.setBackground(this.f9468C.getResources().getDrawable(f3c0.f7919u3));
                        this.f9395G0.setSelected(true);
                    } else {
                        vText.setVisibility(0);
                        this.f9395G0.setTextColor(Color.parseColor("#ffffff"));
                        this.f9395G0.setText(R$string.f427R2);
                        this.f9395G0.setBackgroundResource(u2h.m14723h() ? f3c0.f7872o4 : f3c0.f7864n4);
                        this.f9473H.m17365X();
                    }
                }
            } else {
                this.f9395G0.setVisibility(0);
                this.f9395G0.setTextColor(Color.parseColor("#ffffff"));
                this.f9395G0.setText(R$string.f427R2);
                this.f9395G0.setBackgroundResource(u2h.m14723h() ? f3c0.f7872o4 : f3c0.f7864n4);
                this.f9473H.m17365X();
            }
        } else if (nkg.m12255o() && NullChecker.a(user.localRelationship) && TEnum.equals(user.localRelationship.state, "matched")) {
            this.f9395G0.setVisibility(0);
            this.f9395G0.setTextColor(Color.parseColor("#ffffff"));
            this.f9395G0.setTypeface(eqh0.c(3), 1);
            this.f9395G0.setText("聊天");
            xdl0.C0(this.f9395G0, t100.d(34.0f));
            this.f9395G0.setTextSize(14.0f);
            this.f9395G0.setBackgroundResource(u2h.m14723h() ? f3c0.f7872o4 : f3c0.f7864n4);
        } else {
            this.f9395G0.setVisibility(8);
        }
        m11214G0();
    }

    @Override // p007l.jpg
    /* JADX INFO: renamed from: i0 */
    public void mo11230i0(Moment moment) {
        if (moment == null) {
            return;
        }
        this.f9466A = moment;
        boolean z = moment.haveLiked;
        VText vText = this.f9483i;
        if (z) {
            vText.setTextColor(m11280A().getResources().getColor(u2h.m14723h() ? e1c0.f7144i : e1c0.f7154n));
            this.f9482h.setImageResource(u2h.m14723h() ? f3c0.f7943x3 : f3c0.f7951y3);
        } else {
            vText.setTextColor(m11280A().getResources().getColor(e1c0.f7159p0));
            this.f9482h.setImageResource(u2h.m14723h() ? f3c0.f7959z3 : f3c0.f7567A3);
        }
        PartialIdList partialIdList = moment.likes;
        int iMax = Math.max(partialIdList.count, partialIdList.ids.size());
        if (iMax > 0) {
            this.f9483i.setText(i0g0.h0(iMax));
        } else if (iMax == 0) {
            this.f9483i.setText(R$string.f548k);
        }
    }

    @Override // p007l.jpg
    /* JADX INFO: renamed from: l0 */
    public void mo11231l0(RawFeed rawFeed) {
        if (NullChecker.a(rawFeed)) {
            this.f9439h1 = rawFeed.canGreeting;
        }
        m11211D0();
    }

    @Override // p007l.jpg, p007l.vvh
    /* JADX INFO: renamed from: m */
    public void mo11232m(Moment moment, RawFeed rawFeed, Music music) {
        super.mo11232m(moment, rawFeed, music);
        mo11234n0(moment, rawFeed);
    }

    @Override // p007l.jpg
    /* JADX INFO: renamed from: m0 */
    public void mo11233m0() {
        View viewM5664P = this.f9401K0.m5664P(m11280A(), this.f9466A, "", "p_moment_preview", true, 0);
        InnerClickSpanTextView innerClickSpanTextView = this.f9399J0;
        if (viewM5664P == null) {
            xdl0.U(innerClickSpanTextView, t100.m);
            xdl0.M(this.f9401K0, false);
        } else {
            xdl0.U(innerClickSpanTextView, t100.d(9.0f));
            xdl0.M(this.f9401K0, true);
        }
    }

    @Override // p007l.jpg
    /* JADX INFO: renamed from: n0 */
    public void mo11234n0(Moment moment, RawFeed rawFeed) {
        super.mo11234n0(moment, rawFeed);
    }
}
