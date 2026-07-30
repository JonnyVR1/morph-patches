package p153l;

import android.animation.ValueAnimator;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Music;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.RawFeed;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feedbottom.insert.FeedInteractiveView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.momentdetail.MomentDetailAct;
import com.p051p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumPlayerView;
import com.p051p1.mobile.putong.feed.newui.videoflow.FeedVideoFlowAct;
import com.p051p1.mobile.putong.feed.newui.view.FeedVideoLikeContainerView;
import com.p051p1.mobile.putong.feed.newui.view.LiveHeadAnimView;
import com.p051p1.mobile.putong.feed.p065ui.FeedPhotoPreviewView;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.Objects;
import p137rx.C22421c;
import p151v.VDraweeView;
import p151v.VEditText;
import p151v.VImage;
import p151v.VText;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes13.dex */
public abstract class yqg implements d0r, lxh {

    /* JADX INFO: renamed from: A */
    public Moment f201178A;

    /* JADX INFO: renamed from: B */
    public User f201179B;

    /* JADX INFO: renamed from: C */
    public Act f201180C;

    /* JADX INFO: renamed from: D */
    public List<Media> f201181D;

    /* JADX INFO: renamed from: E */
    public String f201182E;

    /* JADX INFO: renamed from: F */
    public msv f201183F;

    /* JADX INFO: renamed from: G */
    public f0r f201184G;

    /* JADX INFO: renamed from: H */
    public ogh f201185H;

    /* JADX INFO: renamed from: I */
    public int f201186I = -1;

    /* JADX INFO: renamed from: a */
    public View f201187a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f201188b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f201189c;

    /* JADX INFO: renamed from: d */
    public LiveHeadAnimView f201190d;

    /* JADX INFO: renamed from: e */
    public VText f201191e;

    /* JADX INFO: renamed from: f */
    public VText f201192f;

    /* JADX INFO: renamed from: g */
    public VText f201193g;

    /* JADX INFO: renamed from: h */
    public VImage f201194h;

    /* JADX INFO: renamed from: i */
    public VText f201195i;

    /* JADX INFO: renamed from: j */
    public VImage f201196j;

    /* JADX INFO: renamed from: k */
    public VText f201197k;

    /* JADX INFO: renamed from: l */
    public LinearLayout f201198l;

    /* JADX INFO: renamed from: m */
    public LinearLayout f201199m;

    /* JADX INFO: renamed from: n */
    public VEditText f201200n;

    /* JADX INFO: renamed from: o */
    public TextView f201201o;

    /* JADX INFO: renamed from: p */
    public LinearLayout f201202p;

    /* JADX INFO: renamed from: q */
    public VImage f201203q;

    /* JADX INFO: renamed from: r */
    public TextView f201204r;

    /* JADX INFO: renamed from: s */
    public VImage f201205s;

    /* JADX INFO: renamed from: t */
    public View f201206t;

    /* JADX INFO: renamed from: u */
    public View f201207u;

    /* JADX INFO: renamed from: v */
    public LinearLayout f201208v;

    /* JADX INFO: renamed from: w */
    public FeedInteractiveView f201209w;

    /* JADX INFO: renamed from: x */
    public String f201210x;

    /* JADX INFO: renamed from: y */
    public boolean f201211y;

    /* JADX INFO: renamed from: z */
    public boolean f201212z;

    public yqg(Act act) {
        this.f201180C = act;
    }

    /* JADX INFO: renamed from: J */
    private void m217087J() {
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.pqg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f153672a.m217088S(view);
            }
        };
        bnl0.m105509E0(this.f201188b, onClickListener);
        bnl0.m105509E0(this.f201191e, onClickListener);
        mo216858N();
        bnl0.m105509E0(this.f201193g, new View.OnClickListener() { // from class: l.qqg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f158999a.m217089T(view);
            }
        });
        bnl0.m105509E0(this.f201203q, new View.OnClickListener() { // from class: l.rqg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f164477a.m217090U(view);
            }
        });
        bnl0.m105509E0(this.f201202p, new View.OnClickListener() { // from class: l.sqg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                yqg.m217098u(view);
            }
        });
        bnl0.m105509E0(this.f201192f, new View.OnClickListener() { // from class: l.tqg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f175710a.m217115V(view);
            }
        });
        bnl0.m105509E0(this.f201205s, new View.OnClickListener() { // from class: l.uqg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f180452a.m217116W(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public /* synthetic */ void m217088S(View view) {
        if (view instanceof VDraweeView) {
            er60.m122104w().m122124m(this.f201178A, "moment_preview", false);
        }
        m217129t0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m217089T(View view) {
        m217128s0(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public /* synthetic */ void m217090U(View view) {
        m217122d0();
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m217098u(View view) {
    }

    /* JADX INFO: renamed from: A */
    public Act m217104A() {
        return this.f201180C;
    }

    /* JADX INFO: renamed from: B */
    public void m217105B(Boolean bool) {
        if (bool.booleanValue() == this.f201212z) {
            return;
        }
        this.f201212z = bool.booleanValue();
        ValueAnimator valueAnimatorOfFloat = bool.booleanValue() ? ValueAnimator.ofFloat(1.0f, 0.0f) : ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(250L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.xqg
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f195802a.m217114R(valueAnimator);
            }
        });
        valueAnimatorOfFloat.start();
    }

    @Override // p153l.kxh
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public void mo107411c(View view, ixh ixhVar) {
        View viewMo144241H = mo144241H();
        if (viewMo144241H != null) {
            ((ViewGroup) view).addView(viewMo144241H);
        }
        m217108F(ixhVar);
    }

    /* JADX INFO: renamed from: D */
    public void mo144240D() {
        m217127r0();
        m217128s0(true);
    }

    @Override // p153l.kxh
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo107415i(ixh ixhVar) {
        m217108F(ixhVar);
    }

    /* JADX INFO: renamed from: F */
    public final void m217108F(ixh ixhVar) {
        mo134156O(ixhVar);
        m217110I();
        this.f201185H.m167625D(this);
    }

    /* JADX INFO: renamed from: G */
    public final void m217109G() {
        tfj0.m190942e("e_moment_profile_pic", "p_moment_preview", new pf60("moment_id", this.f201178A.f56859id), new pf60("owner_id", this.f201178A.owner));
    }

    /* JADX INFO: renamed from: H */
    public abstract View mo144241H();

    /* JADX INFO: renamed from: I */
    public void m217110I() {
        ogh oghVar = this.f201185H;
        Moment moment = oghVar.f147265i;
        if (moment == null) {
            return;
        }
        this.f201178A = moment;
        this.f201181D = moment.media;
        this.f201182E = oghVar.f147268l;
        if (j4h.m143424h()) {
            this.f201203q.setImageResource(lbc0.f130997a6);
            this.f201205s.setImageResource(lbc0.f131005b6);
            wpe.m207454a(this.f201200n);
        }
        bnl0.m105525M0(this.f201205s, !ksg.m151187V(this.f201178A));
        m217125p0(this.f201178A);
        m217112L();
        m217113M();
        m217087J();
        m217109G();
        j9h.m143945d(this.f201178A, "p_moment_preview");
        FeedInteractiveView feedInteractiveView = this.f201209w;
        if (feedInteractiveView != null) {
            feedInteractiveView.m65755R();
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m217111K() {
        if (cmg.m111225o()) {
            bnl0.m105525M0(this.f201198l, false);
            return;
        }
        this.f201199m.getChildAt(0).setVisibility(8);
        this.f201199m.setVisibility(0);
        this.f201200n.setHint(this.f201180C.getString(R$string.f39727D));
        ((View) this.f201200n.getParent()).setBackgroundColor(0);
        this.f201185H.m167649y(this.f201200n, this.f201201o, this.f201178A);
    }

    /* JADX INFO: renamed from: L */
    public final void m217112L() {
        this.f201180C.lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.vqg
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f185349a.m217117X((C4470c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: M */
    public void m217113M() {
        mo134159j0();
    }

    /* JADX INFO: renamed from: N */
    public void mo216858N() {
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.mqg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f138053a.m217118Y(view);
            }
        };
        bnl0.m105509E0(this.f201196j, onClickListener);
        bnl0.m105509E0(this.f201197k, onClickListener);
        View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: l.nqg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f143226a.m217119Z(view);
            }
        };
        bnl0.m105509E0(this.f201194h, onClickListener2);
        bnl0.m105509E0(this.f201195i, onClickListener2);
    }

    /* JADX INFO: renamed from: O */
    public ogh mo134156O(ixh ixhVar) {
        ogh oghVar = new ogh(m217104A(), ixhVar);
        this.f201185H = oghVar;
        return oghVar;
    }

    /* JADX INFO: renamed from: P */
    public void mo144246P(Moment moment) {
        m217124o0();
        mo134158i0(moment);
        m217123h0(moment.messages.count);
        mo144270k0(moment);
    }

    /* JADX INFO: renamed from: Q */
    public void mo144248Q(final User user) {
        this.f201191e.setText(at0.m100007a(this.f201178A, user.name));
        bnl0.m105524M(this.f201188b, true);
        at0.m100011e(this.f201178A, this.f201188b, user);
        mo144265g0(user);
        LiveHeadAnimView liveHeadAnimView = this.f201190d;
        if (liveHeadAnimView != null) {
            bnl0.m105524M(liveHeadAnimView, false);
        }
        msv msvVar = this.f201183F;
        if (msvVar != null && msvVar.m159938b(user.f56859id) && !at0.m100010d(this.f201178A)) {
            m217104A().duringCreated((C22421c) uqb0.f180374G.m127100E(user.m61308fp().profileSmall().base).compose(psd0.m173592C())).subscribe(psd0.m173596G(new y20() { // from class: l.lqg
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f133212a.m217121b0(user, (Bitmap) obj);
                }
            }));
            return;
        }
        List<Double> list = user.profile.extensions.headFrame.expiredTime;
        if (jyb.m147479J(list) || list.get(0).doubleValue() <= pzi0.m174454o() || jyb.m147479J(user.profile.extensions.headFrame.url)) {
            return;
        }
        this.f201189c.setVisibility(0);
        uqb0.f180374G.m127115L0(this.f201189c, user.profile.extensions.headFrame.url.get(0));
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m217114R(ValueAnimator valueAnimator) {
        float fFloatValue = Float.valueOf(valueAnimator.getAnimatedValue() + "").floatValue();
        this.f201202p.setAlpha(fFloatValue);
        this.f201206t.setAlpha(fFloatValue);
        this.f201198l.setAlpha(fFloatValue);
        this.f201207u.setAlpha(fFloatValue);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m217115V(View view) {
        mo144260c0();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0033  */
    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m217116W(View view) {
        Media media;
        if (this.f201179B == null) {
            return;
        }
        mo134157e0();
        if (jyb.m147479J(this.f201181D) || (this.f201181D.get(0) instanceof Video) || this.f201186I < 0) {
            media = null;
        } else {
            int size = this.f201181D.size();
            int i = this.f201186I;
            if (size > i) {
                media = this.f201181D.get(i);
            } else {
                media = null;
            }
        }
        rzi.m183770Q(this.f201178A, new qcj() { // from class: l.wqg
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return FeedModule.f39703d.m145603S6((Moment) obj);
            }
        }, this.f201179B, this.f201180C, "p_moment_preview", true, media);
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m217117X(C4470c c4470c) {
        if (c4470c == C4470c.f16273o) {
            m217105B(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m217118Y(View view) {
        mo144240D();
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m217119Z(View view) {
        this.f201185H.m167622A(this.f201178A);
    }

    @Override // p153l.kxh
    /* JADX INFO: renamed from: a */
    public void mo107409a(boolean z) {
        if (z) {
            this.f201185H.m167646Y();
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m217120a0(User user, View view) {
        msv msvVar = this.f201183F;
        if (msvVar == null) {
            return;
        }
        ksv.m151291a(this.f201185H.f147264h, msvVar.m159937a(user.f56859id), user.f56859id);
        FeedModule.m61407M().startAudienceLive(this.f201180C, this.f201183F.m159937a(user.f56859id), "live-group", null);
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m217121b0(final User user, Bitmap bitmap) {
        LiveHeadAnimView liveHeadAnimView;
        if (!NullChecker.m82486a(bitmap) || bitmap.isRecycled() || (liveHeadAnimView = this.f201190d) == null) {
            return;
        }
        liveHeadAnimView.m67574j(bitmap.copy(bitmap.getConfig(), true));
        ksv.m151292b(this.f201185H.f147264h, this.f201183F.m159937a(user.f56859id), user.f56859id);
        bnl0.m105509E0(this.f201190d, new View.OnClickListener() { // from class: l.oqg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f148586a.m217120a0(user, view);
            }
        });
        bnl0.m105524M(this.f201190d, true);
        bnl0.m105525M0(this.f201188b, false);
    }

    /* JADX INFO: renamed from: c0 */
    public void mo144260c0() {
        if (NullChecker.m82486a(this.f201179B)) {
            this.f201185H.m167650z(this.f201179B);
        }
    }

    /* JADX INFO: renamed from: d0 */
    public void m217122d0() {
        this.f201180C.m68056e2();
    }

    /* JADX INFO: renamed from: e */
    public ie80.C17711c mo107412e() {
        return null;
    }

    /* JADX INFO: renamed from: f */
    public void mo107413f(ViewPager viewPager, int i, int i2) {
        mo216860f0(i2);
    }

    /* JADX INFO: renamed from: g */
    public void mo107414g() {
        if (this.f201211y) {
            Act act = this.f201180C;
            if (act instanceof FeedVideoFlowAct) {
                return;
            }
            act.hideInput();
        }
    }

    /* JADX INFO: renamed from: g0 */
    public abstract void mo144265g0(User user);

    @Override // p153l.d0r
    /* JADX INFO: renamed from: h */
    public void mo43567h(int i, int i2) {
        if (i == 0 && this.f201211y) {
            this.f201211y = false;
            this.f201198l.setBackgroundColor(Color.parseColor("#66000000"));
            this.f201200n.setTextColor(-1);
            this.f201200n.setHintTextColor(Color.parseColor("#66ffffff"));
            this.f201200n.setMaxLines(1);
            this.f201200n.setEllipsize(TextUtils.TruncateAt.END);
            this.f201201o.setTextColor(this.f201180C.getResources().getColorStateList(j4h.m143424h() ? k9c0.f124486R : k9c0.f124485Q));
        }
        if (i != 0 && !this.f201211y) {
            this.f201211y = true;
            this.f201198l.setBackgroundColor(-1);
            this.f201200n.setTextColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
            this.f201200n.setHintTextColor(this.f201180C.getResources().getColor(j4h.m143424h() ? k9c0.f124509h : k9c0.f124520m0));
            this.f201200n.setMaxLines(3);
            this.f201201o.setTextColor(this.f201180C.getResources().getColorStateList(j4h.m143424h() ? k9c0.f124498b0 : k9c0.f124496a0));
            m217127r0();
        }
        ViewGroup.LayoutParams layoutParams = this.f201198l.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = i;
        }
        this.f201198l.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: h0 */
    public void m217123h0(int i) {
        VText vText = this.f201197k;
        if (i > 0) {
            vText.setText(q8g0.m175802h0(i));
        } else {
            vText.setText(R$string.f39886d);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public abstract void mo134158i0(Moment moment);

    /* JADX INFO: renamed from: j0 */
    public void mo134159j0() {
        f0r f0rVar = new f0r(this.f201180C);
        this.f201184G = f0rVar;
        f0rVar.m123509g(this);
        View decorView = this.f201180C.getWindow().getDecorView();
        f0r f0rVar2 = this.f201184G;
        Objects.requireNonNull(f0rVar2);
        decorView.post(new kqg(f0rVar2));
    }

    /* JADX INFO: renamed from: l0 */
    public abstract void mo144272l0(RawFeed rawFeed);

    /* JADX INFO: renamed from: m */
    public void mo107419m(Moment moment, RawFeed rawFeed, Music music) {
        m217125p0(moment);
        mo144272l0(rawFeed);
    }

    /* JADX INFO: renamed from: o0 */
    public final void m217124o0() {
        if (TextUtils.isEmpty(this.f201178A.value) && (this.f201178A.getTopicList() == null || this.f201178A.getTopicList().size() == 0)) {
            this.f201193g.setVisibility(8);
            return;
        }
        this.f201193g.setVisibility(0);
        Act actM217104A = m217104A();
        VText vText = this.f201193g;
        Moment moment = this.f201178A;
        j9h.m143944c(actM217104A, vText, moment.value, moment, this.f201182E, "p_moment_preview");
    }

    public void onDestroy() {
        LiveHeadAnimView liveHeadAnimView = this.f201190d;
        if (liveHeadAnimView != null) {
            liveHeadAnimView.m67570f();
        }
        if (NullChecker.m82486a(this.f201184G)) {
            this.f201184G.m123504b();
        }
    }

    /* JADX INFO: renamed from: p0 */
    public void m217125p0(Moment moment) {
        if (NullChecker.m82486a(moment)) {
            this.f201178A = moment;
            mo144246P(moment);
            m217111K();
            mo216861m0();
        }
    }

    /* JADX INFO: renamed from: q0 */
    public void m217126q0(User user) {
        this.f201179B = user;
        mo144248Q(user);
    }

    /* JADX INFO: renamed from: r0 */
    public void m217127r0() {
        if (this.f201178A == null || this.f201185H == null) {
            return;
        }
        pf60 pf60Var = new pf60("moment_type", this.f201210x);
        pf60 pf60Var2 = new pf60("moment_id", this.f201178A.f56859id);
        pf60 pf60Var3 = new pf60("owner_id", this.f201178A.owner);
        pf60 pf60Var4 = new pf60("receiver_user_id", this.f201178A.owner);
        pf60 pf60Var5 = new pf60("comment_detail", "comment");
        er60.m122104w();
        tfj0.m190940c("e_comment", this.f201185H.f147264h, pf60Var, pf60Var2, pf60Var3, pf60Var4, pf60Var5, new pf60("moment_showfrom", er60.m122103D(this.f201182E)));
    }

    /* JADX INFO: renamed from: s0 */
    public void m217128s0(boolean z) {
        Intent intentM66018b;
        if (cmg.m111225o() || (intentM66018b = MomentDetailAct.C11469a.m66017a(m217104A()).m66022f(this.f201182E).m66029m(this.f201178A.f56859id).m66030n(this.f201178A.owner).m66036t(true).m66025i(this.f201185H.f147263g).m66031o(this.f201178A.momentValue).m66021e("from_preview_page").m66037u(z).m66018b()) == null) {
            return;
        }
        this.f201180C.startActivity(intentM66018b);
    }

    /* JADX INFO: renamed from: t0 */
    public void m217129t0() {
        boolean zEquals = uqb0.f180396b0.f170324a.userId().equals(this.f201178A.owner);
        Act act = this.f201180C;
        if (zEquals) {
            act.startActivity(at0.m100009c(m217104A(), this.f201178A.owner, "from_nearby_focus_single"));
        } else {
            Moment moment = this.f201178A;
            at0.m100015i(act, moment, moment.owner, "from_nearby_focus_single");
        }
    }

    /* JADX INFO: renamed from: e0 */
    public void mo134157e0() {
    }

    /* JADX INFO: renamed from: m0 */
    public void mo216861m0() {
    }

    /* JADX INFO: renamed from: b */
    public void mo107410b(cf60 cf60Var) {
    }

    /* JADX INFO: renamed from: f0 */
    public void mo216860f0(int i) {
    }

    /* JADX INFO: renamed from: k0 */
    public void mo144270k0(Moment moment) {
    }

    /* JADX INFO: renamed from: l */
    public void mo107418l(FeedVideoLikeContainerView feedVideoLikeContainerView) {
    }

    /* JADX INFO: renamed from: j */
    public void mo107416j(int i, PhotoAlbumPlayerView photoAlbumPlayerView) {
    }

    @Override // p153l.jxh
    /* JADX INFO: renamed from: k */
    public void mo107417k(int i, FeedPhotoPreviewView feedPhotoPreviewView) {
    }

    /* JADX INFO: renamed from: n0 */
    public void mo216862n0(Moment moment, RawFeed rawFeed) {
    }
}
