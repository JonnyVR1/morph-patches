package p007l;

import android.animation.Animator;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import com.p000p1.mobile.putong.data.Followship;
import com.p000p1.mobile.putong.data.FollowshipStatus;
import com.p000p1.mobile.putong.data.LikeFrom;
import com.p000p1.mobile.putong.data.MatchScData;
import com.p000p1.mobile.putong.data.Relationship;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.newui.photoalbum.discovery.FriendsFeedViewPagerFrag;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feedtop.PhotoAlbumTopView;
import com.p1.mobile.android.app.Act;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import l.bt0;
import l.d30;
import l.e30;
import l.j760;
import l.lsi0;
import l.mkd0;
import l.roj0;
import l.t100;
import l.vwb;
import l.xdl0;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class q5i {

    /* JADX INFO: renamed from: a */
    public xa70 f12100a;

    /* JADX INFO: renamed from: b */
    public View f12101b;

    /* JADX INFO: renamed from: c */
    public TextView f12102c;

    /* JADX INFO: renamed from: d */
    public Moment f12103d;

    /* JADX INFO: renamed from: e */
    public SVGAnimationView f12104e;

    /* JADX INFO: renamed from: f */
    public boolean f12105f;

    /* JADX INFO: renamed from: l.q5i$b */
    public class C2463b extends AnimListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f12108a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ PhotoAlbumTopView f12109b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ xa70 f12110c;

        public C2463b(View view, PhotoAlbumTopView photoAlbumTopView, xa70 xa70Var) {
            this.f12108a = view;
            this.f12109b = photoAlbumTopView;
            this.f12110c = xa70Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m13412b(PhotoAlbumTopView photoAlbumTopView, xa70 xa70Var, View view) {
            q5i.this.f12104e.setVisibility(8);
            photoAlbumTopView.removeView(q5i.this.f12104e);
            if (TextUtils.equals(xa70Var.f14821b, "from_like")) {
                view.setVisibility(0);
            }
        }

        public void onFinished() {
            super.onFinished();
            Animator animatorP = bt0.p(q5i.this.f12104e, "alpha", 0L, 250L, new LinearInterpolator(), new float[]{1.0f, 0.0f});
            final PhotoAlbumTopView photoAlbumTopView = this.f12109b;
            final xa70 xa70Var = this.f12110c;
            final View view = this.f12108a;
            bt0.f(animatorP, new Runnable() { // from class: l.r5i
                @Override // java.lang.Runnable
                public final void run() {
                    this.f12488a.m13412b(photoAlbumTopView, xa70Var, view);
                }
            });
            animatorP.start();
        }

        public void onStart() {
            super.onStart();
            this.f12108a.setVisibility(4);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m13389a(boolean z, Followship followship) {
        if (z) {
            return;
        }
        lsi0.w(R$string.f395M0);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m13390b(xa70 xa70Var, View view, Relationship relationship) {
        xa70Var.f14825f.localRelationship = relationship;
        view.setVisibility(8);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m13392d(Throwable th) {
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m13397i(boolean z, Followship followship) {
        if (z) {
            return;
        }
        lsi0.w(R$string.f489b3);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m13398j(Throwable th) {
    }

    /* JADX INFO: renamed from: k */
    public static int m13399k(User user, boolean z) {
        if (user == null) {
            return -1;
        }
        if (NullChecker.a(user.localRelationship)) {
            return (TEnum.equals(user.localRelationship.state, "liked") || TEnum.equals(user.localRelationship.state, "matched")) ? 5 : 4;
        }
        return 4;
    }

    /* JADX INFO: renamed from: l */
    public static int m13400l(User user, boolean z) {
        FollowshipStatus followshipStatus;
        if (user == null) {
            return -1;
        }
        if (user.isTeamAccount()) {
            return (!ovi.m12868a(((DbObject) user).id) || z) ? -1 : 3;
        }
        if (NullChecker.a(user.localRelationship) && TEnum.equals(user.localRelationship.state, "matched") && ovi.m12868a(((DbObject) user).id) && !z) {
            return 3;
        }
        Followship followship = user.localFollowship;
        if (followship != null && (followshipStatus = followship.state) != null) {
            if (TEnum.equals(followshipStatus, FollowshipStatus.following)) {
                return 2;
            }
            if (!TEnum.equals(user.localFollowship.state, "default") && !TEnum.equals(user.localFollowship.state, FollowshipStatus.followed) && !TEnum.equals(user.localFollowship.state, FollowshipStatus.unfollow) && !TEnum.equals(user.localFollowship.state, "unknown_")) {
                if (TEnum.equals(user.localFollowship.state, "matched")) {
                    return ovi.m12868a(((DbObject) user).id) ? 3 : 2;
                }
                return -1;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m13401m(String str) {
        return "topic_latest".equals(str);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m13402n(String str, final boolean z) {
        FeedModule.f316d.m16683m7(FeedModule.m1139F().userId(), this.f12100a.f14825f, false, str).subscribe(mkd0.H(new e30() { // from class: l.o5i
            public final void call(Object obj) {
                q5i.m13389a(z, (Followship) obj);
            }
        }, new e30() { // from class: l.p5i
            public final void call(Object obj) {
                q5i.m13398j((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m13403o(xa70 xa70Var, View view, PhotoAlbumTopView photoAlbumTopView, Relationship relationship) {
        if (!xa70Var.f14822c && TextUtils.equals(xa70Var.f14821b, "from_discover_dating")) {
            FriendsFeedViewPagerFrag.f2957I0.onNext(roj0.a);
        }
        if (xa70Var.f14822c) {
            return;
        }
        if (TextUtils.equals(xa70Var.f14821b, "from_discover_dating") || TextUtils.equals(xa70Var.f14821b, "from_like")) {
            m13410v(xa70Var, view, photoAlbumTopView);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m13404p(TextView textView, final xa70 xa70Var, Moment moment, final View view, String str, final PhotoAlbumTopView photoAlbumTopView, View view2) {
        if (TextUtils.equals(textView.getText().toString(), "打招呼") || TextUtils.equals(textView.getText().toString(), "聊天")) {
            zi60.m17436w().m17462s(xa70Var.f14820a, vqg.m15485K(xa70Var.f14821b, false), true, false);
            FeedModule.f315c.m1650f3(xa70Var.f14826g, xa70Var.f14825f, xa70Var.f14820a, vqg.m15485K(xa70Var.f14821b, false), false);
        } else {
            if (TextUtils.equals(textView.getText().toString(), "超级喜欢")) {
                zvf0.u(MatchScData.ModuleId.mid_e_superlikeButton, vqg.m15485K(xa70Var.f14821b, false), new j760[]{vwb.Y("moments_user_id", ((DbObject) xa70Var.f14825f).id), vwb.Y("is_privileged", ((DbObject) xa70Var.f14825f).id), vwb.Y("showfrom_superlike", xa70Var.f14821b)});
                FeedModule.m1140H().v8(xa70Var.f14826g, xa70Var.f14825f, true, !xa70Var.f14824e, (String) null, LikeFrom.get("moment"), ((DbObject) moment).id, vqg.m15490N(xa70Var.f14831l.m17284c()), new e30() { // from class: l.i5i
                    public final void call(Object obj) {
                        q5i.m13390b(xa70Var, view, (Relationship) obj);
                    }
                }, (e30) null);
                return;
            }
            zvf0.u(MatchScData.ModuleId.mid_e_likeButton, xa70Var.f14831l.m17284c(), new j760[]{vwb.Y("moments_user_id", ((DbObject) xa70Var.f14825f).id), vwb.Y("moment_id", ((DbObject) moment).id)});
            if (!TextUtils.isEmpty(str)) {
                FeedModule.m1140H().Rs(xa70Var.f14826g, xa70Var.f14825f, true, LikeFrom.get("greet"), (String) null, true, xa70Var.f14831l.m17284c());
            } else {
                this.f12104e = bxh.m9055a(xa70Var.f14826g, photoAlbumTopView, view, 0.0f, -t100.d(10.0f), 48.0f, 48.0f);
                FeedModule.m1140H().kn(xa70Var.f14826g, xa70Var.f14825f, !xa70Var.f14824e, (String) null, LikeFrom.get("moment"), ((DbObject) moment).id, new e30() { // from class: l.j5i
                    public final void call(Object obj) {
                        this.f9230a.m13403o(xa70Var, view, photoAlbumTopView, (Relationship) obj);
                    }
                }, new e30() { // from class: l.k5i
                    public final void call(Object obj) {
                        view.setVisibility(0);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m13405q(FollowshipStatus followshipStatus, xa70 xa70Var, View view) {
        m13406r(followshipStatus, xa70Var.f14822c);
    }

    /* JADX INFO: renamed from: r */
    public final void m13406r(FollowshipStatus followshipStatus, final boolean z) {
        if (!TextUtils.isEmpty(this.f12100a.f14836q)) {
            p6j0.m12916f("e_follow_behind_guide", "p_user_moment_interactions_details_view", p6j0.C2456a.m12922g("trigger_time", this.f12100a.f14836q));
        }
        if (NullChecker.a(followshipStatus) && (TEnum.equals(followshipStatus, FollowshipStatus.following) || TEnum.equals(followshipStatus, "matched"))) {
            final String strM13408t = m13408t(false);
            Act act = this.f12100a.f14826g;
            v1h.m15267v0(act, act.getResources().getString(R$string.f644z), new d30() { // from class: l.l5i
                public final void call() {
                    this.f9891a.m13402n(strM13408t, z);
                }
            });
            return;
        }
        String strM13408t2 = m13408t(true);
        User user = this.f12100a.f14825f;
        if (!user.profile.moments.hidePublicMoments || User.isMatched(user)) {
            FeedModule.f316d.m16690n7(FeedModule.m1139F().userId(), this.f12100a.f14825f, true, "liveMomentNearby", this.f12103d.live.f228id, strM13408t2).subscribe(mkd0.H(new e30() { // from class: l.m5i
                public final void call(Object obj) {
                    q5i.m13397i(z, (Followship) obj);
                }
            }, new e30() { // from class: l.n5i
                public final void call(Object obj) {
                    q5i.m13392d((Throwable) obj);
                }
            }));
        } else {
            lsi0.w(R$string.f590q);
        }
    }

    /* JADX INFO: renamed from: s */
    public void m13407s(final xa70 xa70Var, final View view, final TextView textView, final String str, final PhotoAlbumTopView photoAlbumTopView) {
        this.f12100a = xa70Var;
        this.f12101b = view;
        this.f12102c = textView;
        final Moment moment = xa70Var.f14820a;
        Moment moment2 = this.f12103d;
        if (moment2 == null || moment == null || !TextUtils.equals(((DbObject) moment2).id, ((DbObject) moment).id)) {
            this.f12105f = false;
        }
        this.f12103d = moment;
        if (vs0.m15566d(moment) || xa70Var.f14825f.isMe() || (User.isMatched(xa70Var.f14825f) && !nkg.m12255o())) {
            view.setVisibility(8);
            return;
        }
        if (!nkg.m12213K() && ((!nkg.m12227Y() || moment.owner.equals(FeedModule.m1139F().userId()) || xa70Var.f14825f.isTeamAccount()) && TextUtils.isEmpty(str) && (!TextUtils.equals(xa70Var.f14821b, "from_live_square_tab") || xa70Var.f14822c))) {
            ab70.C2321a c2321a = ab70.m8476a().m8477b().get(xa70Var.f14821b);
            final FollowshipStatus followshipStatus = null;
            if (!((NullChecker.a(c2321a) && c2321a.f5692a && !m13401m(xa70Var.f14821b)) || xa70Var.f14822c) || moment.owner.equals(FeedModule.m1139F().userId()) || (NullChecker.a(xa70Var.f14825f.localRelationship) && TEnum.equals(xa70Var.f14825f.localRelationship.state, "matched"))) {
                view.setVisibility(8);
            } else {
                int i = R$string.f421Q2;
                int i2 = f3c0.f7947y;
                if (NullChecker.a(xa70Var.f14825f.localFollowship)) {
                    followshipStatus = xa70Var.f14825f.localFollowship.state;
                    if (TEnum.equals(followshipStatus, FollowshipStatus.following)) {
                        view.setVisibility(0);
                        textView.setTextColor(xa70Var.f14826g.getResources().getColor(e1c0.f7107F));
                        textView.setText(R$string.f415P2);
                        view.setBackgroundDrawable(xa70Var.f14826g.getResources().getDrawable(f3c0.f7771c));
                    } else if (TEnum.equals(followshipStatus, "matched")) {
                        view.setVisibility(0);
                        textView.setTextColor(xa70Var.f14826g.getResources().getColor(e1c0.f7107F));
                        textView.setText(R$string.f403N2);
                        view.setBackgroundDrawable(xa70Var.f14826g.getResources().getDrawable(f3c0.f7771c));
                    } else {
                        m13409u(xa70Var.f14822c);
                        view.setVisibility(0);
                        textView.setTextColor(Color.parseColor("#f55a43"));
                        textView.setText(i);
                        view.setBackgroundDrawable(xa70Var.f14826g.getResources().getDrawable(i2));
                    }
                } else {
                    m13409u(xa70Var.f14822c);
                    view.setVisibility(0);
                    textView.setTextColor(Color.parseColor("#f55a43"));
                    textView.setText(i);
                    view.setBackgroundDrawable(xa70Var.f14826g.getResources().getDrawable(i2));
                }
                textView.getPaint().setFakeBoldText(true);
            }
            view.setOnClickListener(new View.OnClickListener() { // from class: l.h5i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f8602a.m13405q(followshipStatus, xa70Var, view2);
                }
            });
            return;
        }
        view.setVisibility(0);
        if ((!TextUtils.equals(xa70Var.f14821b, "from_like") || swh.m14343k(xa70Var.f14825f)) && swh.m14344l(xa70Var.f14825f) && TextUtils.isEmpty(str) && !nkg.m12255o()) {
            view.setVisibility(8);
        } else {
            if (nkg.m12213K() || TextUtils.equals(xa70Var.f14821b, "from_live_square_tab")) {
                if (xa70Var.f14822c) {
                    textView.setTextSize(14.0f);
                    xdl0.C0(textView, t100.d(34.0f));
                    view.setBackground(xa70Var.f14826g.getResources().getDrawable(f3c0.f7909t1));
                } else {
                    textView.setTextSize(12.0f);
                    xdl0.C0(textView, t100.d(28.0f));
                    view.setBackground(xa70Var.f14826g.getResources().getDrawable(f3c0.f7901s1));
                }
            }
            textView.setTextColor(Color.parseColor("#fe7e1d"));
            view.setSelected(false);
            if (!TextUtils.equals(xa70Var.f14821b, "from_like") || swh.m14343k(xa70Var.f14825f)) {
                xdl0.d0(textView, t100.d(12.0f));
                xdl0.e0(textView, t100.d(12.0f));
                textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                textView.setText(TextUtils.isEmpty(str) ? "喜欢" : str);
            } else {
                if (TextUtils.equals(xa70Var.f14821b, "from_like") && NullChecker.a(this.f12104e) && this.f12104e.isAnimating()) {
                    view.setVisibility(8);
                }
                textView.setTextColor(Color.parseColor("#cc000000"));
                textView.setText("超级喜欢");
                xdl0.k(textView, FeedModule.f313a.getDrawable(f3c0.f7881p5));
                textView.setCompoundDrawablePadding(t100.d(4.0f));
                xdl0.d0(textView, t100.d(10.0f));
                xdl0.e0(textView, xa70Var.f14822c ? t100.d(12.0f) : t100.d(10.0f));
            }
        }
        if (TextUtils.isEmpty(str) && !this.f12105f) {
            this.f12105f = true;
            zvf0.A(MatchScData.ModuleId.mid_e_likeButton, xa70Var.f14831l.m17284c(), new j760[]{vwb.Y("moments_user_id", ((DbObject) xa70Var.f14825f).id), vwb.Y("moment_id", ((DbObject) moment).id)});
        }
        if (nkg.m12255o() && !TextUtils.equals("from_live_square_tab", xa70Var.f14821b)) {
            xdl0.d0(textView, t100.d(10.0f));
            xdl0.e0(textView, t100.d(10.0f));
            xdl0.W(view, t100.d(16.0f));
            if (User.isMatched(xa70Var.f14825f)) {
                textView.setText("聊天");
            } else {
                textView.setText("打招呼");
            }
            view.setVisibility(0);
        }
        xdl0.E0(view, new View.OnClickListener() { // from class: l.g5i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f8356a.m13404p(textView, xa70Var, moment, view, str, photoAlbumTopView, view2);
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public final String m13408t(boolean z) {
        String strM17284c = this.f12100a.f14831l.m17284c();
        String strM17282a = this.f12100a.f14831l.m17282a(z);
        xa70 xa70Var = this.f12100a;
        p6j0.m12913c(strM17282a, strM17284c, vqg.m15519i(xa70Var.f14821b, xa70Var.f14831l.m17283b()));
        return strM17284c;
    }

    /* JADX INFO: renamed from: u */
    public final void m13409u(boolean z) {
        if (z) {
            this.f12102c.getText().equals(this.f12100a.f14826g.getString(PhotoAlbumTopView.f3406k));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v */
    public void m13410v(xa70 xa70Var, View view, PhotoAlbumTopView photoAlbumTopView) {
        if (photoAlbumTopView.getTag() != null) {
            photoAlbumTopView.removeOnAttachStateChangeListener((View.OnAttachStateChangeListener) photoAlbumTopView.getTag());
        }
        ViewOnAttachStateChangeListenerC2462a viewOnAttachStateChangeListenerC2462a = new ViewOnAttachStateChangeListenerC2462a(photoAlbumTopView);
        photoAlbumTopView.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC2462a);
        photoAlbumTopView.setTag(viewOnAttachStateChangeListenerC2462a);
        this.f12104e.setVisibility(0);
        SVGALoader.with(xa70Var.f14826g).from("https://auto.tancdn.com/v1/raw/edf12e0b-b98f-410b-bb94-230b17af6c7313.pdf").autoPlay(false).repeatCount(1).animListener(new C2463b(view, photoAlbumTopView, xa70Var)).into(this.f12104e);
        this.f12104e.startAnimation();
    }

    /* JADX INFO: renamed from: l.q5i$a */
    public class ViewOnAttachStateChangeListenerC2462a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ PhotoAlbumTopView f12106a;

        public ViewOnAttachStateChangeListenerC2462a(PhotoAlbumTopView photoAlbumTopView) {
            this.f12106a = photoAlbumTopView;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            if (NullChecker.a(q5i.this.f12104e)) {
                q5i.this.f12104e.stopAnimation(false);
                this.f12106a.removeView(q5i.this.f12104e);
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }
    }
}
