package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.ReminderAction;
import com.p046p1.mobile.putong.data.FollowshipStatus;
import com.p046p1.mobile.putong.data.Music;
import com.p046p1.mobile.putong.data.PartialIdList;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.RawFeed;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinminetab.FeedWriterLevelView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feedbottom.insert.FeedInteractiveView;
import com.p046p1.mobile.putong.feed.newui.view.FeedUserSexAndAgeView;
import com.p046p1.mobile.putong.feed.p060ui.FeedPhotoPreviewView;
import com.p046p1.mobile.putong.newui.view.InnerClickSpanTextView;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VEditText;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class jmh extends jpg {

    /* JADX INFO: renamed from: E0 */
    public VText f118636E0;

    /* JADX INFO: renamed from: F0 */
    public RelativeLayout f118637F0;

    /* JADX INFO: renamed from: G0 */
    public VText f118638G0;

    /* JADX INFO: renamed from: H0 */
    public LinearLayout f118639H0;

    /* JADX INFO: renamed from: I0 */
    public TextView f118640I0;

    /* JADX INFO: renamed from: J */
    public ConstraintLayout f118641J;

    /* JADX INFO: renamed from: J0 */
    public InnerClickSpanTextView f118642J0;

    /* JADX INFO: renamed from: K */
    public View f118643K;

    /* JADX INFO: renamed from: K0 */
    public FeedInteractiveView f118644K0;

    /* JADX INFO: renamed from: L */
    public LinearLayout f118645L;

    /* JADX INFO: renamed from: L0 */
    public VLinear f118646L0;

    /* JADX INFO: renamed from: M */
    public VImage f118647M;

    /* JADX INFO: renamed from: M0 */
    public VImage f118648M0;

    /* JADX INFO: renamed from: N */
    public VText f118649N;

    /* JADX INFO: renamed from: N0 */
    public VText f118650N0;

    /* JADX INFO: renamed from: O */
    public VImage f118651O;

    /* JADX INFO: renamed from: O0 */
    public VLinear f118652O0;

    /* JADX INFO: renamed from: P */
    public VImage f118653P;

    /* JADX INFO: renamed from: P0 */
    public VImage f118654P0;

    /* JADX INFO: renamed from: Q */
    public View f118655Q;

    /* JADX INFO: renamed from: Q0 */
    public VText f118656Q0;

    /* JADX INFO: renamed from: R */
    public ConstraintLayout f118657R;

    /* JADX INFO: renamed from: R0 */
    public VLinear f118658R0;

    /* JADX INFO: renamed from: S */
    public VDraweeView f118659S;

    /* JADX INFO: renamed from: S0 */
    public VImage f118660S0;

    /* JADX INFO: renamed from: T */
    public VDraweeView f118661T;

    /* JADX INFO: renamed from: T0 */
    public VText f118662T0;

    /* JADX INFO: renamed from: U */
    public VText f118663U;

    /* JADX INFO: renamed from: U0 */
    public View f118664U0;

    /* JADX INFO: renamed from: V */
    public LinearLayout f118665V;

    /* JADX INFO: renamed from: V0 */
    public LinearLayout f118666V0;

    /* JADX INFO: renamed from: W */
    public VImage f118667W;

    /* JADX INFO: renamed from: W0 */
    public LinearLayout f118668W0;

    /* JADX INFO: renamed from: X */
    public VLinear f118669X;

    /* JADX INFO: renamed from: X0 */
    public View f118670X0;

    /* JADX INFO: renamed from: Y */
    public FeedWriterLevelView f118671Y;

    /* JADX INFO: renamed from: Y0 */
    public LinearLayout f118672Y0;

    /* JADX INFO: renamed from: Z */
    public LinearLayout f118673Z;

    /* JADX INFO: renamed from: Z0 */
    public VEditText f118674Z0;

    /* JADX INFO: renamed from: a1 */
    public TextView f118675a1;

    /* JADX INFO: renamed from: b1 */
    public VLinear f118676b1;

    /* JADX INFO: renamed from: c1 */
    public boolean f118677c1;

    /* JADX INFO: renamed from: d1 */
    public float f118678d1;

    /* JADX INFO: renamed from: e1 */
    public float f118679e1;

    /* JADX INFO: renamed from: f1 */
    public float f118680f1;

    /* JADX INFO: renamed from: g1 */
    public boolean f118681g1;

    /* JADX INFO: renamed from: h1 */
    public boolean f118682h1;

    /* JADX INFO: renamed from: i1 */
    public boolean f118683i1;

    /* JADX INFO: renamed from: k0 */
    public ImageView f118684k0;

    /* JADX INFO: renamed from: p0 */
    public VText f118685p0;

    /* JADX INFO: renamed from: l.jmh$a */
    public class C17816a extends AnimatorListenerAdapter {
        public C17816a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            jmh.this.m142205N0();
        }
    }

    public jmh(Moment moment, boolean z, boolean z2, Act act) {
        super(act);
        this.f118677c1 = true;
        this.f119151A = moment;
        this.f118682h1 = z;
        this.f118683i1 = z2;
        this.f119183x = ReminderAction.photo;
        if (NullChecker.m81303a(moment)) {
            this.f119152B = FeedModule.f38855d.m209447e8(moment.owner);
        }
        m142198H0();
    }

    /* JADX INFO: renamed from: A0 */
    public View m142190A0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return kmh.m146534b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: B0 */
    public void m142191B0() {
        this.f119161b = this.f118659S;
        this.f119162c = this.f118661T;
        this.f119164e = this.f118663U;
        this.f119165f = this.f118638G0;
        this.f119166g = this.f118642J0;
        this.f119167h = this.f118648M0;
        this.f119168i = this.f118650N0;
        this.f119170k = this.f118656Q0;
        this.f119169j = this.f118654P0;
        this.f119171l = this.f118666V0;
        this.f119172m = this.f118668W0;
        this.f119173n = this.f118674Z0;
        this.f119174o = this.f118675a1;
        this.f119160a = this.f118643K;
        this.f119175p = this.f118645L;
        this.f119179t = this.f118657R;
        this.f119177r = this.f118649N;
        this.f119176q = this.f118647M;
        this.f119178s = this.f118653P;
        this.f119180u = this.f118655Q;
        this.f119181v = this.f118672Y0;
        this.f119182w = this.f118644K0;
    }

    /* JADX INFO: renamed from: C0 */
    public void m142192C0() {
        ConstraintLayout.C0220a c0220a = new ConstraintLayout.C0220a(t100.m186890d(72.0f), -1);
        c0220a.f1249g = this.f118657R.getId();
        c0220a.f1251h = this.f118646L0.getId();
        this.f118652O0.setLayoutParams(c0220a);
        this.f118652O0.setBackground(null);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f118654P0.getLayoutParams();
        layoutParams.width = t100.m186890d(24.0f);
        layoutParams.height = t100.m186890d(24.0f);
        layoutParams.setMargins(0, 0, 0, 0);
        this.f118654P0.setLayoutParams(layoutParams);
        this.f118654P0.setImageResource(u2h.m191499h() ? f3c0.f94644v3 : f3c0.f94652w3);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f118656Q0.getLayoutParams();
        this.f118656Q0.setPadding(0, 0, 0, 0);
        layoutParams2.leftMargin = t100.m186890d(6.0f);
        this.f118656Q0.setLayoutParams(layoutParams2);
        this.f118656Q0.setTextSize(13.0f);
    }

    /* JADX INFO: renamed from: D0 */
    public final void m142193D0() {
        if (nkg.m159896o()) {
            xdl0.m208344M(this.f118666V0, false);
        }
        xdl0.m208344M(this.f118658R0, false);
        m142192C0();
        m142194E0();
        if (u2h.m191499h()) {
            this.f118654P0.setImageResource(f3c0.f94644v3);
            this.f118660S0.setImageResource(TextUtils.equals(m142697A().getString(R$string.f39114n5), this.f118662T0.getText()) ? f3c0.f94573m4 : f3c0.f94549j4);
        }
        if (nkg.m159896o()) {
            xdl0.m208344M(this.f118652O0, false);
            xdl0.m208344M(this.f118658R0, false);
            xdl0.m208344M(this.f118664U0, false);
            xdl0.m208357U(this.f118657R, t100.m186890d(24.0f));
        }
        FeedModule.m60222H().mo30742a().mo165300I5();
        if (u2h.m191499h()) {
            ConstraintLayout.C0220a c0220a = new ConstraintLayout.C0220a(t100.m186890d(-2.0f), -1);
            c0220a.f1249g = this.f118657R.getId();
            c0220a.f1251h = this.f118646L0.getId();
            ((ViewGroup.MarginLayoutParams) c0220a).rightMargin = t100.m186890d(12.0f);
            this.f118658R0.setLayoutParams(c0220a);
            this.f118658R0.setGravity(16);
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.f118658R0.getLayoutParams();
        int i = layoutParams.width;
        int i2 = t100.f167235J;
        if (i != i2) {
            layoutParams.width = i2;
            this.f118658R0.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: E0 */
    public void m142194E0() {
        ConstraintLayout.C0220a c0220a = new ConstraintLayout.C0220a(t100.m186890d(76.0f), -1);
        if (nkg.m159896o()) {
            ((ViewGroup.MarginLayoutParams) c0220a).width = -2;
        }
        ((ViewGroup.MarginLayoutParams) c0220a).bottomMargin = t100.m186890d(16.0f);
        c0220a.f1247f = this.f118652O0.getId();
        c0220a.f1255j = this.f118664U0.getId();
        this.f118646L0.setLayoutParams(c0220a);
        this.f118646L0.setBackground(null);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f118648M0.getLayoutParams();
        layoutParams.width = t100.m186890d(24.0f);
        layoutParams.height = t100.m186890d(24.0f);
        layoutParams.setMargins(0, 0, 0, 0);
        this.f118648M0.setLayoutParams(layoutParams);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f118650N0.getLayoutParams();
        this.f118650N0.setPadding(0, 0, 0, 0);
        layoutParams2.leftMargin = t100.m186890d(6.0f);
        if (nkg.m159896o()) {
            layoutParams2.leftMargin = t100.m186890d(3.0f);
            layoutParams2.rightMargin = t100.m186890d(12.0f);
        }
        this.f118650N0.setLayoutParams(layoutParams2);
        this.f118650N0.setTextSize(13.0f);
    }

    /* JADX INFO: renamed from: F0 */
    public void m142195F0() {
        ValueAnimator valueAnimatorOfFloat;
        boolean z = this.f118677c1;
        ConstraintLayout constraintLayout = this.f118657R;
        if (z) {
            valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, constraintLayout.getHeight() + this.f118666V0.getHeight() + (nkg.m159896o() ? t100.m186890d(52.0f) : t100.m186890d(4.0f)));
        } else {
            valueAnimatorOfFloat = ValueAnimator.ofFloat(constraintLayout.getHeight() + this.f118666V0.getHeight() + (nkg.m159896o() ? t100.m186890d(52.0f) : t100.m186890d(4.0f)), 0.0f);
        }
        valueAnimatorOfFloat.addListener(new C17816a());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.imh
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f113936a.m142199I0(valueAnimator);
            }
        });
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: G0 */
    public final void m142196G0() {
        if (vs0.m199798d(this.f119151A)) {
            this.f118638G0.setVisibility(8);
        }
    }

    @Override // p149l.jpg
    /* JADX INFO: renamed from: H */
    public View mo142197H() {
        View viewM142190A0 = m142190A0(LayoutInflater.from(this.f119153C), null);
        m142193D0();
        m142191B0();
        return viewM142190A0;
    }

    /* JADX INFO: renamed from: H0 */
    public final void m142198H0() {
        if (u2h.m191492a() && NullChecker.m81303a(this.f119152B)) {
            m142697A().duringCreated(ovi.m166195b(this.f119152B.f56011id)).subscribe(mkd0.m154955G(new e30() { // from class: l.emh
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f92218a.m142203M0((Boolean) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m142199I0(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float f = -fFloatValue;
        this.f118645L.setTranslationY(f);
        this.f118643K.setTranslationY(f);
        this.f118657R.setTranslationY(fFloatValue);
        this.f118655Q.setTranslationY(fFloatValue);
        this.f118666V0.setTranslationY(fFloatValue);
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m142200J0(View view) {
        m142734r0();
        m142735s0(true);
    }

    /* JADX INFO: renamed from: K0 */
    public final /* synthetic */ void m142201K0(View view) {
        this.f119158H.m218305A(this.f119151A);
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m142202L0() {
        this.f119152B = FeedModule.f38855d.m209447e8(this.f119152B.f56011id);
        if (NullChecker.m81303a(this.f119151A)) {
            this.f118681g1 = vqg.m199527U(FeedModule.m60222H().mo30741Zj(this.f119152B.f56011id)) && !vs0.m199798d(this.f119151A);
        }
        m142193D0();
    }

    /* JADX INFO: renamed from: M0 */
    public final /* synthetic */ void m142203M0(Boolean bool) {
        e51.m114743H(m142697A(), new Runnable() { // from class: l.fmh
            @Override // java.lang.Runnable
            public final void run() {
                this.f98303a.m142202L0();
            }
        }, 1000L);
    }

    @Override // p149l.jpg
    /* JADX INFO: renamed from: N */
    public void mo142204N() {
        xdl0.m208329E0(this.f118652O0, new View.OnClickListener() { // from class: l.gmh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f103476a.m142200J0(view);
            }
        });
        xdl0.m208329E0(this.f118646L0, new View.OnClickListener() { // from class: l.hmh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f108428a.m142201K0(view);
            }
        });
    }

    /* JADX INFO: renamed from: N0 */
    public final void m142205N0() {
        this.f118677c1 = !this.f118677c1;
        this.f118678d1 = this.f118645L.getTranslationY();
        this.f118679e1 = this.f118657R.getTranslationY();
        this.f118680f1 = this.f118643K.getTranslationY();
    }

    @Override // p149l.jpg
    /* JADX INFO: renamed from: P */
    public void mo142206P(Moment moment) {
        super.mo142206P(moment);
        mo142209f0(this.f119158H.f202820f);
        String strM95041q = a5i.m95041q(moment.createdTime);
        if (nkg.m159844C() && vqg.m199534a0(this.f119158H.f202826l)) {
            User userM209447e8 = FeedModule.f38855d.m209447e8(moment.owner);
            strM95041q = vqg.m199509H((long) moment.createdTime, userM209447e8 == null ? 0L : userM209447e8.getLastActiveTimeMillis());
        }
        this.f118636E0.setText(strM95041q);
        xdl0.m208344M(this.f118636E0, !TextUtils.isEmpty(strM95041q));
        this.f118685p0.setVisibility(8);
        this.f118684k0.setVisibility(8);
    }

    @Override // p149l.jpg
    /* JADX INFO: renamed from: Q */
    public void mo142207Q(User user) {
        super.mo142207Q(user);
        FeedUserSexAndAgeView feedUserSexAndAgeView = (FeedUserSexAndAgeView) View.inflate(m142697A(), o6c0.f142212i3, null);
        feedUserSexAndAgeView.m66375d(user, 4, 6);
        this.f118669X.removeAllViews();
        this.f118669X.addView(feedUserSexAndAgeView);
        xdl0.m208344M(this.f118669X, true);
        if (jjb0.m141784b()) {
            qib0.f154713b0.f139231b.showUserVerificationLogo(m142697A(), user, this.f118667W);
        }
    }

    @Override // p149l.jpg, p149l.uvh
    /* JADX INFO: renamed from: f */
    public void mo142208f(ViewPager viewPager, int i, int i2) {
        super.mo142208f(viewPager, i, i2);
        View viewFindViewWithTag = viewPager.findViewWithTag(Integer.valueOf(i));
        if (viewFindViewWithTag instanceof FeedPhotoPreviewView) {
            ((FeedPhotoPreviewView) viewFindViewWithTag).reset();
        }
    }

    @Override // p149l.jpg
    /* JADX INFO: renamed from: f0 */
    public void mo142209f0(int i) {
        super.mo142209f0(i);
        zeh zehVar = this.f119158H;
        if (zehVar != null) {
            zehVar.f202820f = i;
        }
        this.f118649N.setText(String.format("%d/%d", Integer.valueOf(i + 1), Integer.valueOf(this.f119154D.size())));
        this.f119159I = i;
    }

    @Override // p149l.jpg, p149l.uvh
    /* JADX INFO: renamed from: g */
    public void mo142210g() {
        if (this.f119184y) {
            this.f119153C.hideInput();
        } else {
            m142195F0();
        }
    }

    @Override // p149l.jpg
    /* JADX INFO: renamed from: g0 */
    public void mo142211g0(User user) {
        this.f119152B = user;
        if (!user.f56011id.equals(qib0.f154713b0.f139230a.userId()) && (!NullChecker.m81303a(user.localRelationship) || !TEnum.equals(user.localRelationship.state, "matched"))) {
            this.f118638G0.setSelected(false);
            if (nkg.m159896o()) {
                this.f118638G0.setVisibility(0);
                this.f118638G0.setTextColor(Color.parseColor("#ffffff"));
                this.f118638G0.setText("打招呼");
                this.f118638G0.setTypeface(eqh0.m117752c(3), 1);
                xdl0.m208325C0(this.f118638G0, t100.m186890d(34.0f));
                this.f118638G0.setTextSize(14.0f);
                this.f118638G0.setBackgroundResource(u2h.m191499h() ? f3c0.f94589o4 : f3c0.f94581n4);
                zi60.m218961w().m218988t(this.f119151A, "p_moment_preview", true, false);
            } else if (nkg.m159854K()) {
                if (swh.m186172i(user) || nkg.m159900q()) {
                    this.f118638G0.setVisibility(8);
                } else {
                    this.f118638G0.setVisibility(0);
                    this.f118638G0.setTextColor(Color.parseColor("#ffffff"));
                    this.f118638G0.setText("喜欢");
                    this.f118638G0.setTypeface(eqh0.m117752c(3), 1);
                    xdl0.m208325C0(this.f118638G0, t100.m186890d(34.0f));
                    this.f118638G0.setTextSize(14.0f);
                    this.f118638G0.setBackgroundResource(u2h.m191499h() ? f3c0.f94589o4 : f3c0.f94581n4);
                    this.f119158H.m218328X();
                }
            } else if (NullChecker.m81303a(user.localFollowship)) {
                FollowshipStatus followshipStatus = user.localFollowship.state;
                if (TEnum.equals(followshipStatus, FollowshipStatus.following)) {
                    this.f118638G0.setVisibility(0);
                    this.f118638G0.setTextColor(Color.parseColor("#ffffff"));
                    this.f118638G0.setBackground(this.f119153C.getResources().getDrawable(f3c0.f94636u3));
                    this.f118638G0.setText(R$string.f38954P2);
                    this.f118638G0.setSelected(true);
                } else {
                    boolean zEquals = TEnum.equals(followshipStatus, "matched");
                    VText vText = this.f118638G0;
                    if (zEquals) {
                        vText.setVisibility(0);
                        this.f118638G0.setText(R$string.f38942N2);
                        this.f118638G0.setTextColor(Color.parseColor("#ffffff"));
                        this.f118638G0.setBackground(this.f119153C.getResources().getDrawable(f3c0.f94636u3));
                        this.f118638G0.setSelected(true);
                    } else {
                        vText.setVisibility(0);
                        this.f118638G0.setTextColor(Color.parseColor("#ffffff"));
                        this.f118638G0.setText(R$string.f38966R2);
                        this.f118638G0.setBackgroundResource(u2h.m191499h() ? f3c0.f94589o4 : f3c0.f94581n4);
                        this.f119158H.m218328X();
                    }
                }
            } else {
                this.f118638G0.setVisibility(0);
                this.f118638G0.setTextColor(Color.parseColor("#ffffff"));
                this.f118638G0.setText(R$string.f38966R2);
                this.f118638G0.setBackgroundResource(u2h.m191499h() ? f3c0.f94589o4 : f3c0.f94581n4);
                this.f119158H.m218328X();
            }
        } else if (nkg.m159896o() && NullChecker.m81303a(user.localRelationship) && TEnum.equals(user.localRelationship.state, "matched")) {
            this.f118638G0.setVisibility(0);
            this.f118638G0.setTextColor(Color.parseColor("#ffffff"));
            this.f118638G0.setTypeface(eqh0.m117752c(3), 1);
            this.f118638G0.setText("聊天");
            xdl0.m208325C0(this.f118638G0, t100.m186890d(34.0f));
            this.f118638G0.setTextSize(14.0f);
            this.f118638G0.setBackgroundResource(u2h.m191499h() ? f3c0.f94589o4 : f3c0.f94581n4);
        } else {
            this.f118638G0.setVisibility(8);
        }
        m142196G0();
    }

    @Override // p149l.jpg
    /* JADX INFO: renamed from: i0 */
    public void mo142212i0(Moment moment) {
        if (moment == null) {
            return;
        }
        this.f119151A = moment;
        boolean z = moment.haveLiked;
        VText vText = this.f119168i;
        if (z) {
            vText.setTextColor(m142697A().getResources().getColor(u2h.m191499h() ? e1c0.f88788i : e1c0.f88798n));
            this.f119167h.setImageResource(u2h.m191499h() ? f3c0.f94660x3 : f3c0.f94668y3);
        } else {
            vText.setTextColor(m142697A().getResources().getColor(e1c0.f88803p0));
            this.f119167h.setImageResource(u2h.m191499h() ? f3c0.f94676z3 : f3c0.f94284A3);
        }
        PartialIdList partialIdList = moment.likes;
        int iMax = Math.max(partialIdList.count, partialIdList.ids.size());
        if (iMax > 0) {
            this.f119168i.setText(i0g0.m133867h0(iMax));
        } else if (iMax == 0) {
            this.f119168i.setText(R$string.f39087k);
        }
    }

    @Override // p149l.jpg
    /* JADX INFO: renamed from: l0 */
    public void mo142213l0(RawFeed rawFeed) {
        if (NullChecker.m81303a(rawFeed)) {
            this.f118682h1 = rawFeed.canGreeting;
        }
        m142193D0();
    }

    @Override // p149l.jpg, p149l.vvh
    /* JADX INFO: renamed from: m */
    public void mo142214m(Moment moment, RawFeed rawFeed, Music music) {
        super.mo142214m(moment, rawFeed, music);
        mo142216n0(moment, rawFeed);
    }

    @Override // p149l.jpg
    /* JADX INFO: renamed from: m0 */
    public void mo142215m0() {
        View viewM64570P = this.f118644K0.m64570P(m142697A(), this.f119151A, "", "p_moment_preview", true, 0);
        InnerClickSpanTextView innerClickSpanTextView = this.f118642J0;
        if (viewM64570P == null) {
            xdl0.m208357U(innerClickSpanTextView, t100.f167264m);
            xdl0.m208344M(this.f118644K0, false);
        } else {
            xdl0.m208357U(innerClickSpanTextView, t100.m186890d(9.0f));
            xdl0.m208344M(this.f118644K0, true);
        }
    }

    @Override // p149l.jpg
    /* JADX INFO: renamed from: n0 */
    public void mo142216n0(Moment moment, RawFeed rawFeed) {
        super.mo142216n0(moment, rawFeed);
    }
}
