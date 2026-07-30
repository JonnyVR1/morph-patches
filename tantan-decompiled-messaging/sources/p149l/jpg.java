package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Music;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.RawFeed;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feedbottom.insert.FeedInteractiveView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.momentdetail.MomentDetailAct;
import com.p046p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumPlayerView;
import com.p046p1.mobile.putong.feed.newui.videoflow.FeedVideoFlowAct;
import com.p046p1.mobile.putong.feed.newui.view.FeedVideoLikeContainerView;
import com.p046p1.mobile.putong.feed.newui.view.LiveHeadAnimView;
import com.p046p1.mobile.putong.feed.p060ui.FeedPhotoPreviewView;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.Objects;
import p133rx.C22306c;
import p147v.VDraweeView;
import p147v.VEditText;
import p147v.VImage;
import p147v.VText;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes12.dex */
public abstract class jpg implements dyq, wvh {

    /* JADX INFO: renamed from: A */
    public Moment f119151A;

    /* JADX INFO: renamed from: B */
    public User f119152B;

    /* JADX INFO: renamed from: C */
    public Act f119153C;

    /* JADX INFO: renamed from: D */
    public List<Media> f119154D;

    /* JADX INFO: renamed from: E */
    public String f119155E;

    /* JADX INFO: renamed from: F */
    public lqv f119156F;

    /* JADX INFO: renamed from: G */
    public fyq f119157G;

    /* JADX INFO: renamed from: H */
    public zeh f119158H;

    /* JADX INFO: renamed from: I */
    public int f119159I = -1;

    /* JADX INFO: renamed from: a */
    public View f119160a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f119161b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f119162c;

    /* JADX INFO: renamed from: d */
    public LiveHeadAnimView f119163d;

    /* JADX INFO: renamed from: e */
    public VText f119164e;

    /* JADX INFO: renamed from: f */
    public VText f119165f;

    /* JADX INFO: renamed from: g */
    public VText f119166g;

    /* JADX INFO: renamed from: h */
    public VImage f119167h;

    /* JADX INFO: renamed from: i */
    public VText f119168i;

    /* JADX INFO: renamed from: j */
    public VImage f119169j;

    /* JADX INFO: renamed from: k */
    public VText f119170k;

    /* JADX INFO: renamed from: l */
    public LinearLayout f119171l;

    /* JADX INFO: renamed from: m */
    public LinearLayout f119172m;

    /* JADX INFO: renamed from: n */
    public VEditText f119173n;

    /* JADX INFO: renamed from: o */
    public TextView f119174o;

    /* JADX INFO: renamed from: p */
    public LinearLayout f119175p;

    /* JADX INFO: renamed from: q */
    public VImage f119176q;

    /* JADX INFO: renamed from: r */
    public TextView f119177r;

    /* JADX INFO: renamed from: s */
    public VImage f119178s;

    /* JADX INFO: renamed from: t */
    public View f119179t;

    /* JADX INFO: renamed from: u */
    public View f119180u;

    /* JADX INFO: renamed from: v */
    public LinearLayout f119181v;

    /* JADX INFO: renamed from: w */
    public FeedInteractiveView f119182w;

    /* JADX INFO: renamed from: x */
    public String f119183x;

    /* JADX INFO: renamed from: y */
    public boolean f119184y;

    /* JADX INFO: renamed from: z */
    public boolean f119185z;

    public jpg(Act act) {
        this.f119153C = act;
    }

    /* JADX INFO: renamed from: J */
    private void m142680J() {
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.apg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f71036a.m142681S(view);
            }
        };
        xdl0.m208329E0(this.f119161b, onClickListener);
        xdl0.m208329E0(this.f119164e, onClickListener);
        mo142204N();
        xdl0.m208329E0(this.f119166g, new View.OnClickListener() { // from class: l.bpg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f76624a.m142682T(view);
            }
        });
        xdl0.m208329E0(this.f119176q, new View.OnClickListener() { // from class: l.cpg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f81933a.m142683U(view);
            }
        });
        xdl0.m208329E0(this.f119175p, new View.OnClickListener() { // from class: l.dpg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                jpg.m142691u(view);
            }
        });
        xdl0.m208329E0(this.f119165f, new View.OnClickListener() { // from class: l.epg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f92652a.m142710V(view);
            }
        });
        xdl0.m208329E0(this.f119178s, new View.OnClickListener() { // from class: l.fpg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f98695a.m142711W(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public /* synthetic */ void m142681S(View view) {
        if (view instanceof VDraweeView) {
            zi60.m218961w().m218981m(this.f119151A, "moment_preview", false);
        }
        m142736t0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m142682T(View view) {
        m142735s0(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public /* synthetic */ void m142683U(View view) {
        m142721d0();
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m142691u(View view) {
    }

    /* JADX INFO: renamed from: A */
    public Act m142697A() {
        return this.f119153C;
    }

    /* JADX INFO: renamed from: B */
    public void m142698B(Boolean bool) {
        if (bool.booleanValue() == this.f119185z) {
            return;
        }
        this.f119185z = bool.booleanValue();
        ValueAnimator valueAnimatorOfFloat = bool.booleanValue() ? ValueAnimator.ofFloat(1.0f, 0.0f) : ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(250L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ipg
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f114293a.m142709R(valueAnimator);
            }
        });
        valueAnimatorOfFloat.start();
    }

    @Override // p149l.vvh
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public void mo142719c(View view, tvh tvhVar) {
        View viewMo142197H = mo142197H();
        if (viewMo142197H != null) {
            ((ViewGroup) view).addView(viewMo142197H);
        }
        m142702F(tvhVar);
    }

    /* JADX INFO: renamed from: D */
    public void mo142700D() {
        m142734r0();
        m142735s0(true);
    }

    @Override // p149l.vvh
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo142725i(tvh tvhVar) {
        m142702F(tvhVar);
    }

    /* JADX INFO: renamed from: F */
    public final void m142702F(tvh tvhVar) {
        mo142708O(tvhVar);
        m142704I();
        this.f119158H.m218308D(this);
    }

    /* JADX INFO: renamed from: G */
    public final void m142703G() {
        p6j0.m167671e("e_moment_profile_pic", "p_moment_preview", new j760("moment_id", this.f119151A.f56011id), new j760("owner_id", this.f119151A.owner));
    }

    /* JADX INFO: renamed from: H */
    public abstract View mo142197H();

    /* JADX INFO: renamed from: I */
    public void m142704I() {
        zeh zehVar = this.f119158H;
        Moment moment = zehVar.f202823i;
        if (moment == null) {
            return;
        }
        this.f119151A = moment;
        this.f119154D = moment.media;
        this.f119155E = zehVar.f202826l;
        if (u2h.m191499h()) {
            this.f119176q.setImageResource(f3c0.f94479a6);
            this.f119178s.setImageResource(f3c0.f94487b6);
            soe.m185291a(this.f119173n);
        }
        xdl0.m208345M0(this.f119178s, !vqg.m199528V(this.f119151A));
        m142732p0(this.f119151A);
        m142706L();
        m142707M();
        m142680J();
        m142703G();
        u7h.m192139d(this.f119151A, "p_moment_preview");
        FeedInteractiveView feedInteractiveView = this.f119182w;
        if (feedInteractiveView != null) {
            feedInteractiveView.m64572R();
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m142705K() {
        if (nkg.m159896o()) {
            xdl0.m208345M0(this.f119171l, false);
            return;
        }
        this.f119172m.getChildAt(0).setVisibility(8);
        this.f119172m.setVisibility(0);
        this.f119173n.setHint(this.f119153C.getString(R$string.f38879D));
        ((View) this.f119173n.getParent()).setBackgroundColor(0);
        this.f119158H.m218332y(this.f119173n, this.f119174o, this.f119151A);
    }

    /* JADX INFO: renamed from: L */
    public final void m142706L() {
        this.f119153C.lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.gpg
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f103799a.m142712X((C4319c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: M */
    public void m142707M() {
        mo142727j0();
    }

    /* JADX INFO: renamed from: N */
    public void mo142204N() {
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.xog
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f193839a.m142713Y(view);
            }
        };
        xdl0.m208329E0(this.f119169j, onClickListener);
        xdl0.m208329E0(this.f119170k, onClickListener);
        View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: l.yog
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f199290a.m142714Z(view);
            }
        };
        xdl0.m208329E0(this.f119167h, onClickListener2);
        xdl0.m208329E0(this.f119168i, onClickListener2);
    }

    /* JADX INFO: renamed from: O */
    public zeh mo142708O(tvh tvhVar) {
        zeh zehVar = new zeh(m142697A(), tvhVar);
        this.f119158H = zehVar;
        return zehVar;
    }

    /* JADX INFO: renamed from: P */
    public void mo142206P(Moment moment) {
        m142731o0();
        mo142212i0(moment);
        m142724h0(moment.messages.count);
        mo142729k0(moment);
    }

    /* JADX INFO: renamed from: Q */
    public void mo142207Q(final User user) {
        this.f119164e.setText(vs0.m199795a(this.f119151A, user.name));
        xdl0.m208344M(this.f119161b, true);
        vs0.m199799e(this.f119151A, this.f119161b, user);
        mo142211g0(user);
        LiveHeadAnimView liveHeadAnimView = this.f119163d;
        if (liveHeadAnimView != null) {
            xdl0.m208344M(liveHeadAnimView, false);
        }
        lqv lqvVar = this.f119156F;
        if (lqvVar != null && lqvVar.m151094b(user.f56011id) && !vs0.m199798d(this.f119151A)) {
            m142697A().duringCreated((C22306c) qib0.f154691G.m102316E(user.m60124fp().profileSmall().base).compose(mkd0.m154951C())).subscribe(mkd0.m154955G(new e30() { // from class: l.wog
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f187411a.m142718b0(user, (Bitmap) obj);
                }
            }));
            return;
        }
        List<Double> list = user.profile.extensions.headFrame.expiredTime;
        if (vwb.m200296J(list) || list.get(0).doubleValue() <= mqi0.m155944o() || vwb.m200296J(user.profile.extensions.headFrame.url)) {
            return;
        }
        this.f119162c.setVisibility(0);
        qib0.f154691G.m102331L0(this.f119162c, user.profile.extensions.headFrame.url.get(0));
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m142709R(ValueAnimator valueAnimator) {
        float fFloatValue = Float.valueOf(valueAnimator.getAnimatedValue() + "").floatValue();
        this.f119175p.setAlpha(fFloatValue);
        this.f119179t.setAlpha(fFloatValue);
        this.f119171l.setAlpha(fFloatValue);
        this.f119180u.setAlpha(fFloatValue);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m142710V(View view) {
        mo142720c0();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0033  */
    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m142711W(View view) {
        Media media;
        if (this.f119152B == null) {
            return;
        }
        mo142723e0();
        if (vwb.m200296J(this.f119154D) || (this.f119154D.get(0) instanceof Video) || this.f119159I < 0) {
            media = null;
        } else {
            int size = this.f119154D.size();
            int i = this.f119159I;
            if (size > i) {
                media = this.f119154D.get(i);
            } else {
                media = null;
            }
        }
        vwi.m200386Q(this.f119151A, new w9j() { // from class: l.hpg
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return FeedModule.f38855d.m209362S6((Moment) obj);
            }
        }, this.f119152B, this.f119153C, "p_moment_preview", true, media);
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m142712X(C4319c c4319c) {
        if (c4319c == C4319c.f15554o) {
            m142698B(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m142713Y(View view) {
        mo142700D();
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m142714Z(View view) {
        this.f119158H.m218305A(this.f119151A);
    }

    @Override // p149l.vvh
    /* JADX INFO: renamed from: a */
    public void mo142715a(boolean z) {
        if (z) {
            this.f119158H.m218329Y();
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m142716a0(User user, View view) {
        lqv lqvVar = this.f119156F;
        if (lqvVar == null) {
            return;
        }
        jqv.m142854a(this.f119158H.f202822h, lqvVar.m151093a(user.f56011id), user.f56011id);
        FeedModule.m60223M().startAudienceLive(this.f119153C, this.f119156F.m151093a(user.f56011id), "live-group", null);
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m142718b0(final User user, Bitmap bitmap) {
        LiveHeadAnimView liveHeadAnimView;
        if (!NullChecker.m81303a(bitmap) || bitmap.isRecycled() || (liveHeadAnimView = this.f119163d) == null) {
            return;
        }
        liveHeadAnimView.m66391j(bitmap.copy(bitmap.getConfig(), true));
        jqv.m142855b(this.f119158H.f202822h, this.f119156F.m151093a(user.f56011id), user.f56011id);
        xdl0.m208329E0(this.f119163d, new View.OnClickListener() { // from class: l.zog
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f204109a.m142716a0(user, view);
            }
        });
        xdl0.m208344M(this.f119163d, true);
        xdl0.m208345M0(this.f119161b, false);
    }

    /* JADX INFO: renamed from: c0 */
    public void mo142720c0() {
        if (NullChecker.m81303a(this.f119152B)) {
            this.f119158H.m218333z(this.f119152B);
        }
    }

    /* JADX INFO: renamed from: d0 */
    public void m142721d0() {
        this.f119153C.m66873d2();
    }

    @Override // p149l.uvh
    /* JADX INFO: renamed from: e */
    public c680.C16085c mo142722e() {
        return null;
    }

    /* JADX INFO: renamed from: f */
    public void mo142208f(ViewPager viewPager, int i, int i2) {
        mo142209f0(i2);
    }

    /* JADX INFO: renamed from: g */
    public void mo142210g() {
        if (this.f119184y) {
            Act act = this.f119153C;
            if (act instanceof FeedVideoFlowAct) {
                return;
            }
            act.hideInput();
        }
    }

    /* JADX INFO: renamed from: g0 */
    public abstract void mo142211g0(User user);

    @Override // p149l.dyq
    /* JADX INFO: renamed from: h */
    public void mo42557h(int i, int i2) {
        if (i == 0 && this.f119184y) {
            this.f119184y = false;
            this.f119171l.setBackgroundColor(Color.parseColor("#66000000"));
            this.f119173n.setTextColor(-1);
            this.f119173n.setHintTextColor(Color.parseColor("#66ffffff"));
            this.f119173n.setMaxLines(1);
            this.f119173n.setEllipsize(TextUtils.TruncateAt.END);
            this.f119174o.setTextColor(this.f119153C.getResources().getColorStateList(u2h.m191499h() ? e1c0.f88763R : e1c0.f88762Q));
        }
        if (i != 0 && !this.f119184y) {
            this.f119184y = true;
            this.f119171l.setBackgroundColor(-1);
            this.f119173n.setTextColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
            this.f119173n.setHintTextColor(this.f119153C.getResources().getColor(u2h.m191499h() ? e1c0.f88786h : e1c0.f88797m0));
            this.f119173n.setMaxLines(3);
            this.f119174o.setTextColor(this.f119153C.getResources().getColorStateList(u2h.m191499h() ? e1c0.f88775b0 : e1c0.f88773a0));
            m142734r0();
        }
        ViewGroup.LayoutParams layoutParams = this.f119171l.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = i;
        }
        this.f119171l.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: h0 */
    public void m142724h0(int i) {
        VText vText = this.f119170k;
        if (i > 0) {
            vText.setText(i0g0.m133867h0(i));
        } else {
            vText.setText(R$string.f39038d);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public abstract void mo142212i0(Moment moment);

    /* JADX INFO: renamed from: j0 */
    public void mo142727j0() {
        fyq fyqVar = new fyq(this.f119153C);
        this.f119157G = fyqVar;
        fyqVar.m123794g(this);
        View decorView = this.f119153C.getWindow().getDecorView();
        fyq fyqVar2 = this.f119157G;
        Objects.requireNonNull(fyqVar2);
        decorView.post(new vog(fyqVar2));
    }

    /* JADX INFO: renamed from: l0 */
    public abstract void mo142213l0(RawFeed rawFeed);

    /* JADX INFO: renamed from: m */
    public void mo142214m(Moment moment, RawFeed rawFeed, Music music) {
        m142732p0(moment);
        mo142213l0(rawFeed);
    }

    /* JADX INFO: renamed from: o0 */
    public final void m142731o0() {
        if (TextUtils.isEmpty(this.f119151A.value) && (this.f119151A.getTopicList() == null || this.f119151A.getTopicList().size() == 0)) {
            this.f119166g.setVisibility(8);
            return;
        }
        this.f119166g.setVisibility(0);
        Act actM142697A = m142697A();
        VText vText = this.f119166g;
        Moment moment = this.f119151A;
        u7h.m192138c(actM142697A, vText, moment.value, moment, this.f119155E, "p_moment_preview");
    }

    @Override // p149l.vvh
    public void onDestroy() {
        LiveHeadAnimView liveHeadAnimView = this.f119163d;
        if (liveHeadAnimView != null) {
            liveHeadAnimView.m66387f();
        }
        if (NullChecker.m81303a(this.f119157G)) {
            this.f119157G.m123789b();
        }
    }

    /* JADX INFO: renamed from: p0 */
    public void m142732p0(Moment moment) {
        if (NullChecker.m81303a(moment)) {
            this.f119151A = moment;
            mo142206P(moment);
            m142705K();
            mo142215m0();
        }
    }

    /* JADX INFO: renamed from: q0 */
    public void m142733q0(User user) {
        this.f119152B = user;
        mo142207Q(user);
    }

    /* JADX INFO: renamed from: r0 */
    public void m142734r0() {
        if (this.f119151A == null || this.f119158H == null) {
            return;
        }
        j760 j760Var = new j760("moment_type", this.f119183x);
        j760 j760Var2 = new j760("moment_id", this.f119151A.f56011id);
        j760 j760Var3 = new j760("owner_id", this.f119151A.owner);
        j760 j760Var4 = new j760("receiver_user_id", this.f119151A.owner);
        j760 j760Var5 = new j760("comment_detail", "comment");
        zi60.m218961w();
        p6j0.m167669c("e_comment", this.f119158H.f202822h, j760Var, j760Var2, j760Var3, j760Var4, j760Var5, new j760("moment_showfrom", zi60.m218960D(this.f119155E)));
    }

    /* JADX INFO: renamed from: s0 */
    public void m142735s0(boolean z) {
        Intent intentM64835b;
        if (nkg.m159896o() || (intentM64835b = MomentDetailAct.C11306a.m64834a(m142697A()).m64839f(this.f119155E).m64846m(this.f119151A.f56011id).m64847n(this.f119151A.owner).m64853t(true).m64842i(this.f119158H.f202821g).m64848o(this.f119151A.momentValue).m64838e("from_preview_page").m64854u(z).m64835b()) == null) {
            return;
        }
        this.f119153C.startActivity(intentM64835b);
    }

    /* JADX INFO: renamed from: t0 */
    public void m142736t0() {
        boolean zEquals = qib0.f154713b0.f139230a.userId().equals(this.f119151A.owner);
        Act act = this.f119153C;
        if (zEquals) {
            act.startActivity(vs0.m199797c(m142697A(), this.f119151A.owner, "from_nearby_focus_single"));
        } else {
            Moment moment = this.f119151A;
            vs0.m199803i(act, moment, moment.owner, "from_nearby_focus_single");
        }
    }

    /* JADX INFO: renamed from: e0 */
    public void mo142723e0() {
    }

    /* JADX INFO: renamed from: m0 */
    public void mo142215m0() {
    }

    @Override // p149l.uvh
    /* JADX INFO: renamed from: b */
    public void mo142717b(w660 w660Var) {
    }

    /* JADX INFO: renamed from: f0 */
    public void mo142209f0(int i) {
    }

    /* JADX INFO: renamed from: k0 */
    public void mo142729k0(Moment moment) {
    }

    @Override // p149l.uvh
    /* JADX INFO: renamed from: l */
    public void mo142730l(FeedVideoLikeContainerView feedVideoLikeContainerView) {
    }

    @Override // p149l.uvh
    /* JADX INFO: renamed from: j */
    public void mo142726j(int i, PhotoAlbumPlayerView photoAlbumPlayerView) {
    }

    @Override // p149l.uvh
    /* JADX INFO: renamed from: k */
    public void mo142728k(int i, FeedPhotoPreviewView feedPhotoPreviewView) {
    }

    /* JADX INFO: renamed from: n0 */
    public void mo142216n0(Moment moment, RawFeed rawFeed) {
    }
}
