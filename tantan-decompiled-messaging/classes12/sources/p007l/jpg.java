package p007l;

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
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.Music;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.data.Video;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.RawFeed;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feedbottom.insert.FeedInteractiveView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.momentdetail.MomentDetailAct;
import com.p000p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumPlayerView;
import com.p000p1.mobile.putong.feed.newui.videoflow.FeedVideoFlowAct;
import com.p000p1.mobile.putong.feed.newui.view.FeedVideoLikeContainerView;
import com.p000p1.mobile.putong.feed.newui.view.LiveHeadAnimView;
import com.p000p1.mobile.putong.feed.p005ui.FeedPhotoPreviewView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.c;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.Objects;
import l.c680;
import l.dyq;
import l.e30;
import l.fyq;
import l.i0g0;
import l.j760;
import l.mkd0;
import l.mqi0;
import l.qib0;
import l.soe;
import l.vwb;
import l.w660;
import l.w9j;
import l.xdl0;
import v.VDraweeView;
import v.VEditText;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public abstract class jpg implements dyq, wvh {

    /* JADX INFO: renamed from: A */
    public Moment f9466A;

    /* JADX INFO: renamed from: B */
    public User f9467B;

    /* JADX INFO: renamed from: C */
    public Act f9468C;

    /* JADX INFO: renamed from: D */
    public List<Media> f9469D;

    /* JADX INFO: renamed from: E */
    public String f9470E;

    /* JADX INFO: renamed from: F */
    public lqv f9471F;

    /* JADX INFO: renamed from: G */
    public fyq f9472G;

    /* JADX INFO: renamed from: H */
    public zeh f9473H;

    /* JADX INFO: renamed from: I */
    public int f9474I = -1;

    /* JADX INFO: renamed from: a */
    public View f9475a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f9476b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f9477c;

    /* JADX INFO: renamed from: d */
    public LiveHeadAnimView f9478d;

    /* JADX INFO: renamed from: e */
    public VText f9479e;

    /* JADX INFO: renamed from: f */
    public VText f9480f;

    /* JADX INFO: renamed from: g */
    public VText f9481g;

    /* JADX INFO: renamed from: h */
    public VImage f9482h;

    /* JADX INFO: renamed from: i */
    public VText f9483i;

    /* JADX INFO: renamed from: j */
    public VImage f9484j;

    /* JADX INFO: renamed from: k */
    public VText f9485k;

    /* JADX INFO: renamed from: l */
    public LinearLayout f9486l;

    /* JADX INFO: renamed from: m */
    public LinearLayout f9487m;

    /* JADX INFO: renamed from: n */
    public VEditText f9488n;

    /* JADX INFO: renamed from: o */
    public TextView f9489o;

    /* JADX INFO: renamed from: p */
    public LinearLayout f9490p;

    /* JADX INFO: renamed from: q */
    public VImage f9491q;

    /* JADX INFO: renamed from: r */
    public TextView f9492r;

    /* JADX INFO: renamed from: s */
    public VImage f9493s;

    /* JADX INFO: renamed from: t */
    public View f9494t;

    /* JADX INFO: renamed from: u */
    public View f9495u;

    /* JADX INFO: renamed from: v */
    public LinearLayout f9496v;

    /* JADX INFO: renamed from: w */
    public FeedInteractiveView f9497w;

    /* JADX INFO: renamed from: x */
    public String f9498x;

    /* JADX INFO: renamed from: y */
    public boolean f9499y;

    /* JADX INFO: renamed from: z */
    public boolean f9500z;

    public jpg(Act act) {
        this.f9468C = act;
    }

    /* JADX INFO: renamed from: J */
    private void m11263J() {
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.apg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5799a.m11264S(view);
            }
        };
        xdl0.E0(this.f9476b, onClickListener);
        xdl0.E0(this.f9479e, onClickListener);
        mo11222N();
        xdl0.E0(this.f9481g, new View.OnClickListener() { // from class: l.bpg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6399a.m11265T(view);
            }
        });
        xdl0.E0(this.f9491q, new View.OnClickListener() { // from class: l.cpg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6702a.m11266U(view);
            }
        });
        xdl0.E0(this.f9490p, new View.OnClickListener() { // from class: l.dpg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                jpg.m11274u(view);
            }
        });
        xdl0.E0(this.f9480f, new View.OnClickListener() { // from class: l.epg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7451a.m11293V(view);
            }
        });
        xdl0.E0(this.f9493s, new View.OnClickListener() { // from class: l.fpg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8181a.m11294W(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public /* synthetic */ void m11264S(View view) {
        if (view instanceof VDraweeView) {
            zi60.m17436w().m17456m(this.f9466A, "moment_preview", false);
        }
        m11320t0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m11265T(View view) {
        m11319s0(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public /* synthetic */ void m11266U(View view) {
        m11304d0();
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m11274u(View view) {
    }

    /* JADX INFO: renamed from: A */
    public Act m11280A() {
        return this.f9468C;
    }

    /* JADX INFO: renamed from: B */
    public void m11281B(Boolean bool) {
        if (bool.booleanValue() == this.f9500z) {
            return;
        }
        this.f9500z = bool.booleanValue();
        ValueAnimator valueAnimatorOfFloat = bool.booleanValue() ? ValueAnimator.ofFloat(1.0f, 0.0f) : ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(250L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ipg
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f9114a.m11292R(valueAnimator);
            }
        });
        valueAnimatorOfFloat.start();
    }

    @Override // p007l.vvh
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public void mo11302c(View view, tvh tvhVar) {
        View viewMo11215H = mo11215H();
        if (viewMo11215H != null) {
            ((ViewGroup) view).addView(viewMo11215H);
        }
        m11285F(tvhVar);
    }

    /* JADX INFO: renamed from: D */
    public void mo11283D() {
        m11318r0();
        m11319s0(true);
    }

    @Override // p007l.vvh
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo11309i(tvh tvhVar) {
        m11285F(tvhVar);
    }

    /* JADX INFO: renamed from: F */
    public final void m11285F(tvh tvhVar) {
        mo11291O(tvhVar);
        m11287I();
        this.f9473H.m17345D(this);
    }

    /* JADX INFO: renamed from: G */
    public final void m11286G() {
        p6j0.m12915e("e_moment_profile_pic", "p_moment_preview", new j760("moment_id", ((DbObject) this.f9466A).id), new j760("owner_id", this.f9466A.owner));
    }

    /* JADX INFO: renamed from: H */
    public abstract View mo11215H();

    /* JADX INFO: renamed from: I */
    public void m11287I() {
        zeh zehVar = this.f9473H;
        Moment moment = zehVar.f15714i;
        if (moment == null) {
            return;
        }
        this.f9466A = moment;
        this.f9469D = moment.media;
        this.f9470E = zehVar.f15717l;
        if (u2h.m14723h()) {
            this.f9491q.setImageResource(f3c0.f7762a6);
            this.f9493s.setImageResource(f3c0.f7770b6);
            soe.a(this.f9488n);
        }
        xdl0.M0(this.f9493s, !vqg.m15498V(this.f9466A));
        m11316p0(this.f9466A);
        m11289L();
        m11290M();
        m11263J();
        m11286G();
        u7h.m14786d(this.f9466A, "p_moment_preview");
        FeedInteractiveView feedInteractiveView = this.f9497w;
        if (feedInteractiveView != null) {
            feedInteractiveView.m5666R();
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m11288K() {
        if (nkg.m12255o()) {
            xdl0.M0(this.f9486l, false);
            return;
        }
        this.f9487m.getChildAt(0).setVisibility(8);
        this.f9487m.setVisibility(0);
        this.f9488n.setHint(this.f9468C.getString(R$string.f340D));
        ((View) this.f9488n.getParent()).setBackgroundColor(0);
        this.f9473H.m17369y(this.f9488n, this.f9489o, this.f9466A);
    }

    /* JADX INFO: renamed from: L */
    public final void m11289L() {
        this.f9468C.lifecycle().subscribe(mkd0.G(new e30() { // from class: l.gpg
            public final void call(Object obj) {
                this.f8495a.m11295X((c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: M */
    public void m11290M() {
        mo11311j0();
    }

    /* JADX INFO: renamed from: N */
    public void mo11222N() {
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.xog
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15055a.m11296Y(view);
            }
        };
        xdl0.E0(this.f9484j, onClickListener);
        xdl0.E0(this.f9485k, onClickListener);
        View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: l.yog
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15482a.m11297Z(view);
            }
        };
        xdl0.E0(this.f9482h, onClickListener2);
        xdl0.E0(this.f9483i, onClickListener2);
    }

    /* JADX INFO: renamed from: O */
    public zeh mo11291O(tvh tvhVar) {
        zeh zehVar = new zeh(m11280A(), tvhVar);
        this.f9473H = zehVar;
        return zehVar;
    }

    /* JADX INFO: renamed from: P */
    public void mo11224P(Moment moment) {
        m11315o0();
        mo11230i0(moment);
        m11308h0(moment.messages.count);
        mo11313k0(moment);
    }

    /* JADX INFO: renamed from: Q */
    public void mo11225Q(final User user) {
        this.f9479e.setText(vs0.m15563a(this.f9466A, user.name));
        xdl0.M(this.f9476b, true);
        vs0.m15567e(this.f9466A, this.f9476b, user);
        mo11229g0(user);
        LiveHeadAnimView liveHeadAnimView = this.f9478d;
        if (liveHeadAnimView != null) {
            xdl0.M(liveHeadAnimView, false);
        }
        lqv lqvVar = this.f9471F;
        if (lqvVar != null && lqvVar.m11697b(((DbObject) user).id) && !vs0.m15566d(this.f9466A)) {
            m11280A().duringCreated(qib0.G.E(user.m1042fp().profileSmall().base).compose(mkd0.C())).subscribe(mkd0.G(new e30() { // from class: l.wog
                public final void call(Object obj) {
                    this.f14653a.m11301b0(user, (Bitmap) obj);
                }
            }));
            return;
        }
        List<Double> list = user.profile.extensions.headFrame.expiredTime;
        if (vwb.J(list) || list.get(0).doubleValue() <= mqi0.o() || vwb.J(user.profile.extensions.headFrame.url)) {
            return;
        }
        this.f9477c.setVisibility(0);
        qib0.G.L0(this.f9477c, user.profile.extensions.headFrame.url.get(0));
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m11292R(ValueAnimator valueAnimator) {
        float fFloatValue = Float.valueOf(valueAnimator.getAnimatedValue() + "").floatValue();
        this.f9490p.setAlpha(fFloatValue);
        this.f9494t.setAlpha(fFloatValue);
        this.f9486l.setAlpha(fFloatValue);
        this.f9495u.setAlpha(fFloatValue);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m11293V(View view) {
        mo11303c0();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0033  */
    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m11294W(View view) {
        Media media;
        if (this.f9467B == null) {
            return;
        }
        mo11306e0();
        if (vwb.J(this.f9469D) || (this.f9469D.get(0) instanceof Video) || this.f9474I < 0) {
            media = null;
        } else {
            int size = this.f9469D.size();
            int i = this.f9474I;
            if (size > i) {
                media = this.f9469D.get(i);
            } else {
                media = null;
            }
        }
        vwi.m15602Q(this.f9466A, new w9j() { // from class: l.hpg
            public final Object call(Object obj) {
                return FeedModule.f316d.m16543S6((Moment) obj);
            }
        }, this.f9467B, this.f9468C, "p_moment_preview", true, media);
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m11295X(c cVar) {
        if (cVar == c.o) {
            m11281B(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m11296Y(View view) {
        mo11283D();
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m11297Z(View view) {
        this.f9473H.m17342A(this.f9466A);
    }

    @Override // p007l.vvh
    /* JADX INFO: renamed from: a */
    public void mo11298a(boolean z) {
        if (z) {
            this.f9473H.m17366Y();
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m11299a0(User user, View view) {
        lqv lqvVar = this.f9471F;
        if (lqvVar == null) {
            return;
        }
        jqv.m11321a(this.f9473H.f15713h, lqvVar.m11696a(((DbObject) user).id), ((DbObject) user).id);
        FeedModule.m1141M().startAudienceLive(this.f9468C, this.f9471F.m11696a(((DbObject) user).id), "live-group", (String) null);
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m11301b0(final User user, Bitmap bitmap) {
        LiveHeadAnimView liveHeadAnimView;
        if (!NullChecker.a(bitmap) || bitmap.isRecycled() || (liveHeadAnimView = this.f9478d) == null) {
            return;
        }
        liveHeadAnimView.m7556j(bitmap.copy(bitmap.getConfig(), true));
        jqv.m11322b(this.f9473H.f15713h, this.f9471F.m11696a(((DbObject) user).id), ((DbObject) user).id);
        xdl0.E0(this.f9478d, new View.OnClickListener() { // from class: l.zog
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15816a.m11299a0(user, view);
            }
        });
        xdl0.M(this.f9478d, true);
        xdl0.M0(this.f9476b, false);
    }

    /* JADX INFO: renamed from: c0 */
    public void mo11303c0() {
        if (NullChecker.a(this.f9467B)) {
            this.f9473H.m17370z(this.f9467B);
        }
    }

    /* JADX INFO: renamed from: d0 */
    public void m11304d0() {
        this.f9468C.finish();
    }

    @Override // p007l.uvh
    /* JADX INFO: renamed from: e */
    public c680.c mo11305e() {
        return null;
    }

    /* JADX INFO: renamed from: f */
    public void mo11226f(ViewPager viewPager, int i, int i2) {
        mo11227f0(i2);
    }

    /* JADX INFO: renamed from: g */
    public void mo11228g() {
        if (this.f9499y) {
            Act act = this.f9468C;
            if (act instanceof FeedVideoFlowAct) {
                return;
            }
            act.hideInput();
        }
    }

    /* JADX INFO: renamed from: g0 */
    public abstract void mo11229g0(User user);

    /* JADX INFO: renamed from: h */
    public void mo11307h(int i, int i2) {
        if (i == 0 && this.f9499y) {
            this.f9499y = false;
            this.f9486l.setBackgroundColor(Color.parseColor("#66000000"));
            this.f9488n.setTextColor(-1);
            this.f9488n.setHintTextColor(Color.parseColor("#66ffffff"));
            this.f9488n.setMaxLines(1);
            this.f9488n.setEllipsize(TextUtils.TruncateAt.END);
            this.f9489o.setTextColor(this.f9468C.getResources().getColorStateList(u2h.m14723h() ? e1c0.f7119R : e1c0.f7118Q));
        }
        if (i != 0 && !this.f9499y) {
            this.f9499y = true;
            this.f9486l.setBackgroundColor(-1);
            this.f9488n.setTextColor(-16777216);
            this.f9488n.setHintTextColor(this.f9468C.getResources().getColor(u2h.m14723h() ? e1c0.f7142h : e1c0.f7153m0));
            this.f9488n.setMaxLines(3);
            this.f9489o.setTextColor(this.f9468C.getResources().getColorStateList(u2h.m14723h() ? e1c0.f7131b0 : e1c0.f7129a0));
            m11318r0();
        }
        ViewGroup.LayoutParams layoutParams = this.f9486l.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = i;
        }
        this.f9486l.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: h0 */
    public void m11308h0(int i) {
        VText vText = this.f9485k;
        if (i > 0) {
            vText.setText(i0g0.h0(i));
        } else {
            vText.setText(R$string.f499d);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public abstract void mo11230i0(Moment moment);

    /* JADX INFO: renamed from: j0 */
    public void mo11311j0() {
        fyq fyqVar = new fyq(this.f9468C);
        this.f9472G = fyqVar;
        fyqVar.g(this);
        View decorView = this.f9468C.getWindow().getDecorView();
        fyq fyqVar2 = this.f9472G;
        Objects.requireNonNull(fyqVar2);
        decorView.post(new vog(fyqVar2));
    }

    /* JADX INFO: renamed from: l0 */
    public abstract void mo11231l0(RawFeed rawFeed);

    /* JADX INFO: renamed from: m */
    public void mo11232m(Moment moment, RawFeed rawFeed, Music music) {
        m11316p0(moment);
        mo11231l0(rawFeed);
    }

    /* JADX INFO: renamed from: o0 */
    public final void m11315o0() {
        if (TextUtils.isEmpty(this.f9466A.value) && (this.f9466A.getTopicList() == null || this.f9466A.getTopicList().size() == 0)) {
            this.f9481g.setVisibility(8);
            return;
        }
        this.f9481g.setVisibility(0);
        Act actM11280A = m11280A();
        VText vText = this.f9481g;
        Moment moment = this.f9466A;
        u7h.m14785c(actM11280A, vText, moment.value, moment, this.f9470E, "p_moment_preview");
    }

    @Override // p007l.vvh
    public void onDestroy() {
        LiveHeadAnimView liveHeadAnimView = this.f9478d;
        if (liveHeadAnimView != null) {
            liveHeadAnimView.m7552f();
        }
        if (NullChecker.a(this.f9472G)) {
            this.f9472G.b();
        }
    }

    /* JADX INFO: renamed from: p0 */
    public void m11316p0(Moment moment) {
        if (NullChecker.a(moment)) {
            this.f9466A = moment;
            mo11224P(moment);
            m11288K();
            mo11233m0();
        }
    }

    /* JADX INFO: renamed from: q0 */
    public void m11317q0(User user) {
        this.f9467B = user;
        mo11225Q(user);
    }

    /* JADX INFO: renamed from: r0 */
    public void m11318r0() {
        if (this.f9466A == null || this.f9473H == null) {
            return;
        }
        j760 j760Var = new j760("moment_type", this.f9498x);
        j760 j760Var2 = new j760("moment_id", ((DbObject) this.f9466A).id);
        j760 j760Var3 = new j760("owner_id", this.f9466A.owner);
        j760 j760Var4 = new j760("receiver_user_id", this.f9466A.owner);
        j760 j760Var5 = new j760("comment_detail", "comment");
        zi60.m17436w();
        p6j0.m12913c("e_comment", this.f9473H.f15713h, j760Var, j760Var2, j760Var3, j760Var4, j760Var5, new j760("moment_showfrom", zi60.m17435D(this.f9470E)));
    }

    /* JADX INFO: renamed from: s0 */
    public void m11319s0(boolean z) {
        Intent intentM5932b;
        if (nkg.m12255o() || (intentM5932b = MomentDetailAct.C2150a.m5931a(m11280A()).m5936f(this.f9470E).m5943m(((DbObject) this.f9466A).id).m5944n(this.f9466A.owner).m5950t(true).m5939i(this.f9473H.f15712g).m5945o(this.f9466A.momentValue).m5935e("from_preview_page").m5951u(z).m5932b()) == null) {
            return;
        }
        this.f9468C.startActivity(intentM5932b);
    }

    /* JADX INFO: renamed from: t0 */
    public void m11320t0() {
        boolean zEquals = qib0.b0.a.userId().equals(this.f9466A.owner);
        Act act = this.f9468C;
        if (zEquals) {
            act.startActivity(vs0.m15565c(m11280A(), this.f9466A.owner, "from_nearby_focus_single"));
        } else {
            Moment moment = this.f9466A;
            vs0.m15571i(act, moment, moment.owner, "from_nearby_focus_single");
        }
    }

    /* JADX INFO: renamed from: e0 */
    public void mo11306e0() {
    }

    /* JADX INFO: renamed from: m0 */
    public void mo11233m0() {
    }

    @Override // p007l.uvh
    /* JADX INFO: renamed from: b */
    public void mo11300b(w660 w660Var) {
    }

    /* JADX INFO: renamed from: f0 */
    public void mo11227f0(int i) {
    }

    /* JADX INFO: renamed from: k0 */
    public void mo11313k0(Moment moment) {
    }

    @Override // p007l.uvh
    /* JADX INFO: renamed from: l */
    public void mo11314l(FeedVideoLikeContainerView feedVideoLikeContainerView) {
    }

    @Override // p007l.uvh
    /* JADX INFO: renamed from: j */
    public void mo11310j(int i, PhotoAlbumPlayerView photoAlbumPlayerView) {
    }

    @Override // p007l.uvh
    /* JADX INFO: renamed from: k */
    public void mo11312k(int i, FeedPhotoPreviewView feedPhotoPreviewView) {
    }

    /* JADX INFO: renamed from: n0 */
    public void mo11234n0(Moment moment, RawFeed rawFeed) {
    }
}
