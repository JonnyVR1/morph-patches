package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.ReminderAction;
import com.p051p1.mobile.putong.data.FollowshipStatus;
import com.p051p1.mobile.putong.data.Music;
import com.p051p1.mobile.putong.data.PartialIdList;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.RawFeed;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinminetab.FeedWriterLevelView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feedbottom.insert.FeedInteractiveView;
import com.p051p1.mobile.putong.feed.newui.view.FeedUserSexAndAgeView;
import com.p051p1.mobile.putong.feed.p065ui.FeedPhotoPreviewView;
import com.p051p1.mobile.putong.newui.view.InnerClickSpanTextView;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VEditText;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class ynh extends yqg {

    /* JADX INFO: renamed from: E0 */
    public VText f200824E0;

    /* JADX INFO: renamed from: F0 */
    public RelativeLayout f200825F0;

    /* JADX INFO: renamed from: G0 */
    public VText f200826G0;

    /* JADX INFO: renamed from: H0 */
    public LinearLayout f200827H0;

    /* JADX INFO: renamed from: I0 */
    public TextView f200828I0;

    /* JADX INFO: renamed from: J */
    public ConstraintLayout f200829J;

    /* JADX INFO: renamed from: J0 */
    public InnerClickSpanTextView f200830J0;

    /* JADX INFO: renamed from: K */
    public View f200831K;

    /* JADX INFO: renamed from: K0 */
    public FeedInteractiveView f200832K0;

    /* JADX INFO: renamed from: L */
    public LinearLayout f200833L;

    /* JADX INFO: renamed from: L0 */
    public VLinear f200834L0;

    /* JADX INFO: renamed from: M */
    public VImage f200835M;

    /* JADX INFO: renamed from: M0 */
    public VImage f200836M0;

    /* JADX INFO: renamed from: N */
    public VText f200837N;

    /* JADX INFO: renamed from: N0 */
    public VText f200838N0;

    /* JADX INFO: renamed from: O */
    public VImage f200839O;

    /* JADX INFO: renamed from: O0 */
    public VLinear f200840O0;

    /* JADX INFO: renamed from: P */
    public VImage f200841P;

    /* JADX INFO: renamed from: P0 */
    public VImage f200842P0;

    /* JADX INFO: renamed from: Q */
    public View f200843Q;

    /* JADX INFO: renamed from: Q0 */
    public VText f200844Q0;

    /* JADX INFO: renamed from: R */
    public ConstraintLayout f200845R;

    /* JADX INFO: renamed from: R0 */
    public VLinear f200846R0;

    /* JADX INFO: renamed from: S */
    public VDraweeView f200847S;

    /* JADX INFO: renamed from: S0 */
    public VImage f200848S0;

    /* JADX INFO: renamed from: T */
    public VDraweeView f200849T;

    /* JADX INFO: renamed from: T0 */
    public VText f200850T0;

    /* JADX INFO: renamed from: U */
    public VText f200851U;

    /* JADX INFO: renamed from: U0 */
    public View f200852U0;

    /* JADX INFO: renamed from: V */
    public LinearLayout f200853V;

    /* JADX INFO: renamed from: V0 */
    public LinearLayout f200854V0;

    /* JADX INFO: renamed from: W */
    public VImage f200855W;

    /* JADX INFO: renamed from: W0 */
    public LinearLayout f200856W0;

    /* JADX INFO: renamed from: X */
    public VLinear f200857X;

    /* JADX INFO: renamed from: X0 */
    public View f200858X0;

    /* JADX INFO: renamed from: Y */
    public FeedWriterLevelView f200859Y;

    /* JADX INFO: renamed from: Y0 */
    public LinearLayout f200860Y0;

    /* JADX INFO: renamed from: Z */
    public LinearLayout f200861Z;

    /* JADX INFO: renamed from: Z0 */
    public VEditText f200862Z0;

    /* JADX INFO: renamed from: a1 */
    public TextView f200863a1;

    /* JADX INFO: renamed from: b1 */
    public VLinear f200864b1;

    /* JADX INFO: renamed from: c1 */
    public boolean f200865c1;

    /* JADX INFO: renamed from: d1 */
    public float f200866d1;

    /* JADX INFO: renamed from: e1 */
    public float f200867e1;

    /* JADX INFO: renamed from: f1 */
    public float f200868f1;

    /* JADX INFO: renamed from: g1 */
    public boolean f200869g1;

    /* JADX INFO: renamed from: h1 */
    public boolean f200870h1;

    /* JADX INFO: renamed from: i1 */
    public boolean f200871i1;

    /* JADX INFO: renamed from: k0 */
    public ImageView f200872k0;

    /* JADX INFO: renamed from: p0 */
    public VText f200873p0;

    /* JADX INFO: renamed from: l.ynh$a */
    public class C21646a extends AnimatorListenerAdapter {
        public C21646a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            ynh.this.m216859N0();
        }
    }

    public ynh(Moment moment, boolean z, boolean z2, Act act) {
        super(act);
        this.f200865c1 = true;
        this.f201178A = moment;
        this.f200870h1 = z;
        this.f200871i1 = z2;
        this.f201210x = ReminderAction.photo;
        if (NullChecker.m82486a(moment)) {
            this.f201179B = FeedModule.f39703d.m145688e8(moment.owner);
        }
        m216852H0();
    }

    /* JADX INFO: renamed from: A0 */
    public View m216845A0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return znh.m220599b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: B0 */
    public void m216846B0() {
        this.f201188b = this.f200847S;
        this.f201189c = this.f200849T;
        this.f201191e = this.f200851U;
        this.f201192f = this.f200826G0;
        this.f201193g = this.f200830J0;
        this.f201194h = this.f200836M0;
        this.f201195i = this.f200838N0;
        this.f201197k = this.f200844Q0;
        this.f201196j = this.f200842P0;
        this.f201198l = this.f200854V0;
        this.f201199m = this.f200856W0;
        this.f201200n = this.f200862Z0;
        this.f201201o = this.f200863a1;
        this.f201187a = this.f200831K;
        this.f201202p = this.f200833L;
        this.f201206t = this.f200845R;
        this.f201204r = this.f200837N;
        this.f201203q = this.f200835M;
        this.f201205s = this.f200841P;
        this.f201207u = this.f200843Q;
        this.f201208v = this.f200860Y0;
        this.f201209w = this.f200832K0;
    }

    /* JADX INFO: renamed from: C0 */
    public void m216847C0() {
        ConstraintLayout.C0221a c0221a = new ConstraintLayout.C0221a(qa00.m175859d(72.0f), -1);
        c0221a.f1249g = this.f200845R.getId();
        c0221a.f1251h = this.f200834L0.getId();
        this.f200840O0.setLayoutParams(c0221a);
        this.f200840O0.setBackground(null);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f200842P0.getLayoutParams();
        layoutParams.width = qa00.m175859d(24.0f);
        layoutParams.height = qa00.m175859d(24.0f);
        layoutParams.setMargins(0, 0, 0, 0);
        this.f200842P0.setLayoutParams(layoutParams);
        this.f200842P0.setImageResource(j4h.m143424h() ? lbc0.f131162v3 : lbc0.f131170w3);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f200844Q0.getLayoutParams();
        this.f200844Q0.setPadding(0, 0, 0, 0);
        layoutParams2.leftMargin = qa00.m175859d(6.0f);
        this.f200844Q0.setLayoutParams(layoutParams2);
        this.f200844Q0.setTextSize(13.0f);
    }

    /* JADX INFO: renamed from: D0 */
    public final void m216848D0() {
        if (cmg.m111225o()) {
            bnl0.m105524M(this.f200854V0, false);
        }
        bnl0.m105524M(this.f200846R0, false);
        m216847C0();
        m216849E0();
        if (j4h.m143424h()) {
            this.f200842P0.setImageResource(lbc0.f131162v3);
            this.f200848S0.setImageResource(TextUtils.equals(m217104A().getString(R$string.f39962n5), this.f200850T0.getText()) ? lbc0.f131091m4 : lbc0.f131067j4);
        }
        if (cmg.m111225o()) {
            bnl0.m105524M(this.f200840O0, false);
            bnl0.m105524M(this.f200846R0, false);
            bnl0.m105524M(this.f200852U0, false);
            bnl0.m105537U(this.f200845R, qa00.m175859d(24.0f));
        }
        FeedModule.m61406H().mo31745a().mo192243I5();
        if (j4h.m143424h()) {
            ConstraintLayout.C0221a c0221a = new ConstraintLayout.C0221a(qa00.m175859d(-2.0f), -1);
            c0221a.f1249g = this.f200845R.getId();
            c0221a.f1251h = this.f200834L0.getId();
            ((ViewGroup.MarginLayoutParams) c0221a).rightMargin = qa00.m175859d(12.0f);
            this.f200846R0.setLayoutParams(c0221a);
            this.f200846R0.setGravity(16);
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.f200846R0.getLayoutParams();
        int i = layoutParams.width;
        int i2 = qa00.f156297J;
        if (i != i2) {
            layoutParams.width = i2;
            this.f200846R0.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: E0 */
    public void m216849E0() {
        ConstraintLayout.C0221a c0221a = new ConstraintLayout.C0221a(qa00.m175859d(76.0f), -1);
        if (cmg.m111225o()) {
            ((ViewGroup.MarginLayoutParams) c0221a).width = -2;
        }
        ((ViewGroup.MarginLayoutParams) c0221a).bottomMargin = qa00.m175859d(16.0f);
        c0221a.f1247f = this.f200840O0.getId();
        c0221a.f1255j = this.f200852U0.getId();
        this.f200834L0.setLayoutParams(c0221a);
        this.f200834L0.setBackground(null);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f200836M0.getLayoutParams();
        layoutParams.width = qa00.m175859d(24.0f);
        layoutParams.height = qa00.m175859d(24.0f);
        layoutParams.setMargins(0, 0, 0, 0);
        this.f200836M0.setLayoutParams(layoutParams);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f200838N0.getLayoutParams();
        this.f200838N0.setPadding(0, 0, 0, 0);
        layoutParams2.leftMargin = qa00.m175859d(6.0f);
        if (cmg.m111225o()) {
            layoutParams2.leftMargin = qa00.m175859d(3.0f);
            layoutParams2.rightMargin = qa00.m175859d(12.0f);
        }
        this.f200838N0.setLayoutParams(layoutParams2);
        this.f200838N0.setTextSize(13.0f);
    }

    /* JADX INFO: renamed from: F0 */
    public void m216850F0() {
        ValueAnimator valueAnimatorOfFloat;
        boolean z = this.f200865c1;
        ConstraintLayout constraintLayout = this.f200845R;
        if (z) {
            valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, constraintLayout.getHeight() + this.f200854V0.getHeight() + (cmg.m111225o() ? qa00.m175859d(52.0f) : qa00.m175859d(4.0f)));
        } else {
            valueAnimatorOfFloat = ValueAnimator.ofFloat(constraintLayout.getHeight() + this.f200854V0.getHeight() + (cmg.m111225o() ? qa00.m175859d(52.0f) : qa00.m175859d(4.0f)), 0.0f);
        }
        valueAnimatorOfFloat.addListener(new C21646a());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.xnh
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f195396a.m216853I0(valueAnimator);
            }
        });
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: G0 */
    public final void m216851G0() {
        if (at0.m100010d(this.f201178A)) {
            this.f200826G0.setVisibility(8);
        }
    }

    @Override // p153l.yqg
    /* JADX INFO: renamed from: H */
    public View mo144241H() {
        View viewM216845A0 = m216845A0(LayoutInflater.from(this.f201180C), null);
        m216848D0();
        m216846B0();
        return viewM216845A0;
    }

    /* JADX INFO: renamed from: H0 */
    public final void m216852H0() {
        if (j4h.m143417a() && NullChecker.m82486a(this.f201179B)) {
            m217104A().duringCreated(kyi.m151973b(this.f201179B.f56859id)).subscribe(psd0.m173596G(new y20() { // from class: l.tnh
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f175262a.m216857M0((Boolean) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m216853I0(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float f = -fFloatValue;
        this.f200833L.setTranslationY(f);
        this.f200831K.setTranslationY(f);
        this.f200845R.setTranslationY(fFloatValue);
        this.f200843Q.setTranslationY(fFloatValue);
        this.f200854V0.setTranslationY(fFloatValue);
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m216854J0(View view) {
        m217127r0();
        m217128s0(true);
    }

    /* JADX INFO: renamed from: K0 */
    public final /* synthetic */ void m216855K0(View view) {
        this.f201185H.m167622A(this.f201178A);
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m216856L0() {
        this.f201179B = FeedModule.f39703d.m145688e8(this.f201179B.f56859id);
        if (NullChecker.m82486a(this.f201178A)) {
            this.f200869g1 = ksg.m151186U(FeedModule.m61406H().mo31744Zj(this.f201179B.f56859id)) && !at0.m100010d(this.f201178A);
        }
        m216848D0();
    }

    /* JADX INFO: renamed from: M0 */
    public final /* synthetic */ void m216857M0(Boolean bool) {
        l51.m152888H(m217104A(), new Runnable() { // from class: l.unh
            @Override // java.lang.Runnable
            public final void run() {
                this.f179729a.m216856L0();
            }
        }, 1000L);
    }

    @Override // p153l.yqg
    /* JADX INFO: renamed from: N */
    public void mo216858N() {
        bnl0.m105509E0(this.f200840O0, new View.OnClickListener() { // from class: l.vnh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f184880a.m216854J0(view);
            }
        });
        bnl0.m105509E0(this.f200834L0, new View.OnClickListener() { // from class: l.wnh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f189907a.m216855K0(view);
            }
        });
    }

    /* JADX INFO: renamed from: N0 */
    public final void m216859N0() {
        this.f200865c1 = !this.f200865c1;
        this.f200866d1 = this.f200833L.getTranslationY();
        this.f200867e1 = this.f200845R.getTranslationY();
        this.f200868f1 = this.f200831K.getTranslationY();
    }

    @Override // p153l.yqg
    /* JADX INFO: renamed from: P */
    public void mo144246P(Moment moment) {
        super.mo144246P(moment);
        mo216860f0(this.f201185H.f147262f);
        String strM170908q = p6i.m170908q(moment.createdTime);
        if (cmg.m111173C() && ksg.m151193a0(this.f201185H.f147268l)) {
            User userM145688e8 = FeedModule.f39703d.m145688e8(moment.owner);
            strM170908q = ksg.m151168H((long) moment.createdTime, userM145688e8 == null ? 0L : userM145688e8.getLastActiveTimeMillis());
        }
        this.f200824E0.setText(strM170908q);
        bnl0.m105524M(this.f200824E0, !TextUtils.isEmpty(strM170908q));
        this.f200873p0.setVisibility(8);
        this.f200872k0.setVisibility(8);
    }

    @Override // p153l.yqg
    /* JADX INFO: renamed from: Q */
    public void mo144248Q(User user) {
        super.mo144248Q(user);
        FeedUserSexAndAgeView feedUserSexAndAgeView = (FeedUserSexAndAgeView) View.inflate(m217104A(), tec0.f173681i3, null);
        feedUserSexAndAgeView.m67558d(user, 4, 6);
        this.f200857X.removeAllViews();
        this.f200857X.addView(feedUserSexAndAgeView);
        bnl0.m105524M(this.f200857X, true);
        if (nrb0.m164466b()) {
            uqb0.f180396b0.f170325b.showUserVerificationLogo(m217104A(), user, this.f200855W);
        }
    }

    @Override // p153l.yqg, p153l.jxh
    /* JADX INFO: renamed from: f */
    public void mo107413f(ViewPager viewPager, int i, int i2) {
        super.mo107413f(viewPager, i, i2);
        View viewFindViewWithTag = viewPager.findViewWithTag(Integer.valueOf(i));
        if (viewFindViewWithTag instanceof FeedPhotoPreviewView) {
            ((FeedPhotoPreviewView) viewFindViewWithTag).reset();
        }
    }

    @Override // p153l.yqg
    /* JADX INFO: renamed from: f0 */
    public void mo216860f0(int i) {
        super.mo216860f0(i);
        ogh oghVar = this.f201185H;
        if (oghVar != null) {
            oghVar.f147262f = i;
        }
        this.f200837N.setText(String.format("%d/%d", Integer.valueOf(i + 1), Integer.valueOf(this.f201181D.size())));
        this.f201186I = i;
    }

    @Override // p153l.yqg, p153l.jxh
    /* JADX INFO: renamed from: g */
    public void mo107414g() {
        if (this.f201211y) {
            this.f201180C.hideInput();
        } else {
            m216850F0();
        }
    }

    @Override // p153l.yqg
    /* JADX INFO: renamed from: g0 */
    public void mo144265g0(User user) {
        this.f201179B = user;
        if (!user.f56859id.equals(uqb0.f180396b0.f170324a.userId()) && (!NullChecker.m82486a(user.localRelationship) || !TEnum.equals(user.localRelationship.state, "matched"))) {
            this.f200826G0.setSelected(false);
            if (cmg.m111225o()) {
                this.f200826G0.setVisibility(0);
                this.f200826G0.setTextColor(Color.parseColor("#ffffff"));
                this.f200826G0.setText("打招呼");
                this.f200826G0.setTypeface(lyh0.m156283c(3), 1);
                bnl0.m105505C0(this.f200826G0, qa00.m175859d(34.0f));
                this.f200826G0.setTextSize(14.0f);
                this.f200826G0.setBackgroundResource(j4h.m143424h() ? lbc0.f131107o4 : lbc0.f131099n4);
                er60.m122104w().m122131t(this.f201178A, "p_moment_preview", true, false);
            } else if (cmg.m111183K()) {
                if (hyh.m137732i(user) || cmg.m111229q()) {
                    this.f200826G0.setVisibility(8);
                } else {
                    this.f200826G0.setVisibility(0);
                    this.f200826G0.setTextColor(Color.parseColor("#ffffff"));
                    this.f200826G0.setText("喜欢");
                    this.f200826G0.setTypeface(lyh0.m156283c(3), 1);
                    bnl0.m105505C0(this.f200826G0, qa00.m175859d(34.0f));
                    this.f200826G0.setTextSize(14.0f);
                    this.f200826G0.setBackgroundResource(j4h.m143424h() ? lbc0.f131107o4 : lbc0.f131099n4);
                    this.f201185H.m167645X();
                }
            } else if (NullChecker.m82486a(user.localFollowship)) {
                FollowshipStatus followshipStatus = user.localFollowship.state;
                if (TEnum.equals(followshipStatus, FollowshipStatus.following)) {
                    this.f200826G0.setVisibility(0);
                    this.f200826G0.setTextColor(Color.parseColor("#ffffff"));
                    this.f200826G0.setBackground(this.f201180C.getResources().getDrawable(lbc0.f131154u3));
                    this.f200826G0.setText(R$string.f39802P2);
                    this.f200826G0.setSelected(true);
                } else {
                    boolean zEquals = TEnum.equals(followshipStatus, "matched");
                    VText vText = this.f200826G0;
                    if (zEquals) {
                        vText.setVisibility(0);
                        this.f200826G0.setText(R$string.f39790N2);
                        this.f200826G0.setTextColor(Color.parseColor("#ffffff"));
                        this.f200826G0.setBackground(this.f201180C.getResources().getDrawable(lbc0.f131154u3));
                        this.f200826G0.setSelected(true);
                    } else {
                        vText.setVisibility(0);
                        this.f200826G0.setTextColor(Color.parseColor("#ffffff"));
                        this.f200826G0.setText(R$string.f39814R2);
                        this.f200826G0.setBackgroundResource(j4h.m143424h() ? lbc0.f131107o4 : lbc0.f131099n4);
                        this.f201185H.m167645X();
                    }
                }
            } else {
                this.f200826G0.setVisibility(0);
                this.f200826G0.setTextColor(Color.parseColor("#ffffff"));
                this.f200826G0.setText(R$string.f39814R2);
                this.f200826G0.setBackgroundResource(j4h.m143424h() ? lbc0.f131107o4 : lbc0.f131099n4);
                this.f201185H.m167645X();
            }
        } else if (cmg.m111225o() && NullChecker.m82486a(user.localRelationship) && TEnum.equals(user.localRelationship.state, "matched")) {
            this.f200826G0.setVisibility(0);
            this.f200826G0.setTextColor(Color.parseColor("#ffffff"));
            this.f200826G0.setTypeface(lyh0.m156283c(3), 1);
            this.f200826G0.setText("聊天");
            bnl0.m105505C0(this.f200826G0, qa00.m175859d(34.0f));
            this.f200826G0.setTextSize(14.0f);
            this.f200826G0.setBackgroundResource(j4h.m143424h() ? lbc0.f131107o4 : lbc0.f131099n4);
        } else {
            this.f200826G0.setVisibility(8);
        }
        m216851G0();
    }

    @Override // p153l.yqg
    /* JADX INFO: renamed from: i0 */
    public void mo134158i0(Moment moment) {
        if (moment == null) {
            return;
        }
        this.f201178A = moment;
        boolean z = moment.haveLiked;
        VText vText = this.f201195i;
        if (z) {
            vText.setTextColor(m217104A().getResources().getColor(j4h.m143424h() ? k9c0.f124511i : k9c0.f124521n));
            this.f201194h.setImageResource(j4h.m143424h() ? lbc0.f131178x3 : lbc0.f131186y3);
        } else {
            vText.setTextColor(m217104A().getResources().getColor(k9c0.f124526p0));
            this.f201194h.setImageResource(j4h.m143424h() ? lbc0.f131194z3 : lbc0.f130802A3);
        }
        PartialIdList partialIdList = moment.likes;
        int iMax = Math.max(partialIdList.count, partialIdList.ids.size());
        if (iMax > 0) {
            this.f201195i.setText(q8g0.m175802h0(iMax));
        } else if (iMax == 0) {
            this.f201195i.setText(R$string.f39935k);
        }
    }

    @Override // p153l.yqg
    /* JADX INFO: renamed from: l0 */
    public void mo144272l0(RawFeed rawFeed) {
        if (NullChecker.m82486a(rawFeed)) {
            this.f200870h1 = rawFeed.canGreeting;
        }
        m216848D0();
    }

    @Override // p153l.yqg, p153l.kxh
    /* JADX INFO: renamed from: m */
    public void mo107419m(Moment moment, RawFeed rawFeed, Music music) {
        super.mo107419m(moment, rawFeed, music);
        mo216862n0(moment, rawFeed);
    }

    @Override // p153l.yqg
    /* JADX INFO: renamed from: m0 */
    public void mo216861m0() {
        View viewM65753P = this.f200832K0.m65753P(m217104A(), this.f201178A, "", "p_moment_preview", true, 0);
        InnerClickSpanTextView innerClickSpanTextView = this.f200830J0;
        if (viewM65753P == null) {
            bnl0.m105537U(innerClickSpanTextView, qa00.f156326m);
            bnl0.m105524M(this.f200832K0, false);
        } else {
            bnl0.m105537U(innerClickSpanTextView, qa00.m175859d(9.0f));
            bnl0.m105524M(this.f200832K0, true);
        }
    }

    @Override // p153l.yqg
    /* JADX INFO: renamed from: n0 */
    public void mo216862n0(Moment moment, RawFeed rawFeed) {
        super.mo216862n0(moment, rawFeed);
    }
}
