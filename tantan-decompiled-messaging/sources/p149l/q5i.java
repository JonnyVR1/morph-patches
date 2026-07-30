package p149l;

import android.animation.Animator;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Followship;
import com.p046p1.mobile.putong.data.FollowshipStatus;
import com.p046p1.mobile.putong.data.LikeFrom;
import com.p046p1.mobile.putong.data.MatchScData;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.newui.photoalbum.discovery.FriendsFeedViewPagerFrag;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feedtop.PhotoAlbumTopView;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes12.dex */
public class q5i {

    /* JADX INFO: renamed from: a */
    public xa70 f152764a;

    /* JADX INFO: renamed from: b */
    public View f152765b;

    /* JADX INFO: renamed from: c */
    public TextView f152766c;

    /* JADX INFO: renamed from: d */
    public Moment f152767d;

    /* JADX INFO: renamed from: e */
    public SVGAnimationView f152768e;

    /* JADX INFO: renamed from: f */
    public boolean f152769f;

    /* JADX INFO: renamed from: l.q5i$b */
    public class C19431b extends AnimListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f152772a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ PhotoAlbumTopView f152773b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ xa70 f152774c;

        public C19431b(View view, PhotoAlbumTopView photoAlbumTopView, xa70 xa70Var) {
            this.f152772a = view;
            this.f152773b = photoAlbumTopView;
            this.f152774c = xa70Var;
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m173029b(PhotoAlbumTopView photoAlbumTopView, xa70 xa70Var, View view) {
            q5i.this.f152768e.setVisibility(8);
            photoAlbumTopView.removeView(q5i.this.f152768e);
            if (TextUtils.equals(xa70Var.f191690b, "from_like")) {
                view.setVisibility(0);
            }
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            super.onFinished();
            Animator animatorM103743p = bt0.m103743p(q5i.this.f152768e, "alpha", 0L, 250L, new LinearInterpolator(), 1.0f, 0.0f);
            final PhotoAlbumTopView photoAlbumTopView = this.f152773b;
            final xa70 xa70Var = this.f152774c;
            final View view = this.f152772a;
            bt0.m103733f(animatorM103743p, new Runnable() { // from class: l.r5i
                @Override // java.lang.Runnable
                public final void run() {
                    this.f157822a.m173029b(photoAlbumTopView, xa70Var, view);
                }
            });
            animatorM103743p.start();
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStart() {
            super.onStart();
            this.f152772a.setVisibility(4);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m173006a(boolean z, Followship followship) {
        if (z) {
            return;
        }
        lsi0.m151593w(R$string.f38934M0);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m173007b(xa70 xa70Var, View view, Relationship relationship) {
        xa70Var.f191694f.localRelationship = relationship;
        view.setVisibility(8);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m173009d(Throwable th) {
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m173014i(boolean z, Followship followship) {
        if (z) {
            return;
        }
        lsi0.m151593w(R$string.f39028b3);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m173015j(Throwable th) {
    }

    /* JADX INFO: renamed from: k */
    public static int m173016k(User user, boolean z) {
        if (user == null) {
            return -1;
        }
        if (NullChecker.m81303a(user.localRelationship)) {
            return (TEnum.equals(user.localRelationship.state, "liked") || TEnum.equals(user.localRelationship.state, "matched")) ? 5 : 4;
        }
        return 4;
    }

    /* JADX INFO: renamed from: l */
    public static int m173017l(User user, boolean z) {
        FollowshipStatus followshipStatus;
        if (user == null) {
            return -1;
        }
        if (user.isTeamAccount()) {
            return (!ovi.m166194a(user.f56011id) || z) ? -1 : 3;
        }
        if (NullChecker.m81303a(user.localRelationship) && TEnum.equals(user.localRelationship.state, "matched") && ovi.m166194a(user.f56011id) && !z) {
            return 3;
        }
        Followship followship = user.localFollowship;
        if (followship != null && (followshipStatus = followship.state) != null) {
            if (TEnum.equals(followshipStatus, FollowshipStatus.following)) {
                return 2;
            }
            if (!TEnum.equals(user.localFollowship.state, "default") && !TEnum.equals(user.localFollowship.state, FollowshipStatus.followed) && !TEnum.equals(user.localFollowship.state, FollowshipStatus.unfollow) && !TEnum.equals(user.localFollowship.state, "unknown_")) {
                if (TEnum.equals(user.localFollowship.state, "matched")) {
                    return ovi.m166194a(user.f56011id) ? 3 : 2;
                }
                return -1;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m173018m(String str) {
        return "topic_latest".equals(str);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m173019n(String str, final boolean z) {
        FeedModule.f38855d.m209502m7(FeedModule.m60221F().userId(), this.f152764a.f191694f, false, str).subscribe(mkd0.m154956H(new e30() { // from class: l.o5i
            @Override // p149l.e30
            public final void call(Object obj) {
                q5i.m173006a(z, (Followship) obj);
            }
        }, new e30() { // from class: l.p5i
            @Override // p149l.e30
            public final void call(Object obj) {
                q5i.m173015j((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m173020o(xa70 xa70Var, View view, PhotoAlbumTopView photoAlbumTopView, Relationship relationship) {
        if (!xa70Var.f191691c && TextUtils.equals(xa70Var.f191690b, "from_discover_dating")) {
            FriendsFeedViewPagerFrag.f41496I0.m132487l(roj0.f160388a);
        }
        if (xa70Var.f191691c) {
            return;
        }
        if (TextUtils.equals(xa70Var.f191690b, "from_discover_dating") || TextUtils.equals(xa70Var.f191690b, "from_like")) {
            m173027v(xa70Var, view, photoAlbumTopView);
        }
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m173021p(TextView textView, final xa70 xa70Var, Moment moment, final View view, String str, final PhotoAlbumTopView photoAlbumTopView, View view2) {
        if (TextUtils.equals(textView.getText().toString(), "打招呼") || TextUtils.equals(textView.getText().toString(), "聊天")) {
            zi60.m218961w().m218987s(xa70Var.f191689a, vqg.m199515K(xa70Var.f191690b, false), true, false);
            FeedModule.f38854c.m60724f3(xa70Var.f191695g, xa70Var.f191694f, xa70Var.f191689a, vqg.m199515K(xa70Var.f191690b, false), false);
        } else {
            if (TextUtils.equals(textView.getText().toString(), "超级喜欢")) {
                zvf0.m220399u(MatchScData.ModuleId.mid_e_superlikeButton, vqg.m199515K(xa70Var.f191690b, false), vwb.m200311Y("moments_user_id", xa70Var.f191694f.f56011id), vwb.m200311Y("is_privileged", xa70Var.f191694f.f56011id), vwb.m200311Y("showfrom_superlike", xa70Var.f191690b));
                FeedModule.m60222H().mo30829v8(xa70Var.f191695g, xa70Var.f191694f, true, !xa70Var.f191693e, null, LikeFrom.get("moment"), moment.f56011id, vqg.m199520N(xa70Var.f191700l.m217730c()), new e30() { // from class: l.i5i
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        q5i.m173007b(xa70Var, view, (Relationship) obj);
                    }
                }, null);
                return;
            }
            zvf0.m220399u(MatchScData.ModuleId.mid_e_likeButton, xa70Var.f191700l.m217730c(), vwb.m200311Y("moments_user_id", xa70Var.f191694f.f56011id), vwb.m200311Y("moment_id", moment.f56011id));
            if (!TextUtils.isEmpty(str)) {
                FeedModule.m60222H().mo30725Rs(xa70Var.f191695g, xa70Var.f191694f, true, LikeFrom.get("greet"), null, true, xa70Var.f191700l.m217730c());
            } else {
                this.f152768e = bxh.m104315a(xa70Var.f191695g, photoAlbumTopView, view, 0.0f, -t100.m186890d(10.0f), 48.0f, 48.0f);
                FeedModule.m60222H().mo30788kn(xa70Var.f191695g, xa70Var.f191694f, !xa70Var.f191693e, null, LikeFrom.get("moment"), moment.f56011id, new e30() { // from class: l.j5i
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f116320a.m173020o(xa70Var, view, photoAlbumTopView, (Relationship) obj);
                    }
                }, new e30() { // from class: l.k5i
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        view.setVisibility(0);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m173022q(FollowshipStatus followshipStatus, xa70 xa70Var, View view) {
        m173023r(followshipStatus, xa70Var.f191691c);
    }

    /* JADX INFO: renamed from: r */
    public final void m173023r(FollowshipStatus followshipStatus, final boolean z) {
        if (!TextUtils.isEmpty(this.f152764a.f191705q)) {
            p6j0.m167672f("e_follow_behind_guide", "p_user_moment_interactions_details_view", p6j0.C19147a.m167678g("trigger_time", this.f152764a.f191705q));
        }
        if (NullChecker.m81303a(followshipStatus) && (TEnum.equals(followshipStatus, FollowshipStatus.following) || TEnum.equals(followshipStatus, "matched"))) {
            final String strM173025t = m173025t(false);
            Act act = this.f152764a.f191695g;
            v1h.m196628v0(act, act.getResources().getString(R$string.f39183z), new d30() { // from class: l.l5i
                @Override // p149l.d30
                public final void call() {
                    this.f126173a.m173019n(strM173025t, z);
                }
            });
            return;
        }
        String strM173025t2 = m173025t(true);
        User user = this.f152764a.f191694f;
        if (!user.profile.moments.hidePublicMoments || User.isMatched(user)) {
            FeedModule.f38855d.m209509n7(FeedModule.m60221F().userId(), this.f152764a.f191694f, true, "liveMomentNearby", this.f152767d.live.f38767id, strM173025t2).subscribe(mkd0.m154956H(new e30() { // from class: l.m5i
                @Override // p149l.e30
                public final void call(Object obj) {
                    q5i.m173014i(z, (Followship) obj);
                }
            }, new e30() { // from class: l.n5i
                @Override // p149l.e30
                public final void call(Object obj) {
                    q5i.m173009d((Throwable) obj);
                }
            }));
        } else {
            lsi0.m151593w(R$string.f39129q);
        }
    }

    /* JADX INFO: renamed from: s */
    public void m173024s(final xa70 xa70Var, final View view, final TextView textView, final String str, final PhotoAlbumTopView photoAlbumTopView) {
        this.f152764a = xa70Var;
        this.f152765b = view;
        this.f152766c = textView;
        final Moment moment = xa70Var.f191689a;
        Moment moment2 = this.f152767d;
        if (moment2 == null || moment == null || !TextUtils.equals(moment2.f56011id, moment.f56011id)) {
            this.f152769f = false;
        }
        this.f152767d = moment;
        if (vs0.m199798d(moment) || xa70Var.f191694f.isMe() || (User.isMatched(xa70Var.f191694f) && !nkg.m159896o())) {
            view.setVisibility(8);
            return;
        }
        if (!nkg.m159854K() && ((!nkg.m159868Y() || moment.owner.equals(FeedModule.m60221F().userId()) || xa70Var.f191694f.isTeamAccount()) && TextUtils.isEmpty(str) && (!TextUtils.equals(xa70Var.f191690b, "from_live_square_tab") || xa70Var.f191691c))) {
            ab70.C15567a c15567a = ab70.m95586a().m95587b().get(xa70Var.f191690b);
            final FollowshipStatus followshipStatus = null;
            if (!((NullChecker.m81303a(c15567a) && c15567a.f68629a && !m173018m(xa70Var.f191690b)) || xa70Var.f191691c) || moment.owner.equals(FeedModule.m60221F().userId()) || (NullChecker.m81303a(xa70Var.f191694f.localRelationship) && TEnum.equals(xa70Var.f191694f.localRelationship.state, "matched"))) {
                view.setVisibility(8);
            } else {
                int i = R$string.f38960Q2;
                int i2 = f3c0.f94664y;
                if (NullChecker.m81303a(xa70Var.f191694f.localFollowship)) {
                    followshipStatus = xa70Var.f191694f.localFollowship.state;
                    if (TEnum.equals(followshipStatus, FollowshipStatus.following)) {
                        view.setVisibility(0);
                        textView.setTextColor(xa70Var.f191695g.getResources().getColor(e1c0.f88751F));
                        textView.setText(R$string.f38954P2);
                        view.setBackgroundDrawable(xa70Var.f191695g.getResources().getDrawable(f3c0.f94488c));
                    } else if (TEnum.equals(followshipStatus, "matched")) {
                        view.setVisibility(0);
                        textView.setTextColor(xa70Var.f191695g.getResources().getColor(e1c0.f88751F));
                        textView.setText(R$string.f38942N2);
                        view.setBackgroundDrawable(xa70Var.f191695g.getResources().getDrawable(f3c0.f94488c));
                    } else {
                        m173026u(xa70Var.f191691c);
                        view.setVisibility(0);
                        textView.setTextColor(Color.parseColor("#f55a43"));
                        textView.setText(i);
                        view.setBackgroundDrawable(xa70Var.f191695g.getResources().getDrawable(i2));
                    }
                } else {
                    m173026u(xa70Var.f191691c);
                    view.setVisibility(0);
                    textView.setTextColor(Color.parseColor("#f55a43"));
                    textView.setText(i);
                    view.setBackgroundDrawable(xa70Var.f191695g.getResources().getDrawable(i2));
                }
                textView.getPaint().setFakeBoldText(true);
            }
            view.setOnClickListener(new View.OnClickListener() { // from class: l.h5i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f105948a.m173022q(followshipStatus, xa70Var, view2);
                }
            });
            return;
        }
        view.setVisibility(0);
        if ((!TextUtils.equals(xa70Var.f191690b, "from_like") || swh.m186174k(xa70Var.f191694f)) && swh.m186175l(xa70Var.f191694f) && TextUtils.isEmpty(str) && !nkg.m159896o()) {
            view.setVisibility(8);
        } else {
            if (nkg.m159854K() || TextUtils.equals(xa70Var.f191690b, "from_live_square_tab")) {
                if (xa70Var.f191691c) {
                    textView.setTextSize(14.0f);
                    xdl0.m208325C0(textView, t100.m186890d(34.0f));
                    view.setBackground(xa70Var.f191695g.getResources().getDrawable(f3c0.f94626t1));
                } else {
                    textView.setTextSize(12.0f);
                    xdl0.m208325C0(textView, t100.m186890d(28.0f));
                    view.setBackground(xa70Var.f191695g.getResources().getDrawable(f3c0.f94618s1));
                }
            }
            textView.setTextColor(Color.parseColor("#fe7e1d"));
            view.setSelected(false);
            if (!TextUtils.equals(xa70Var.f191690b, "from_like") || swh.m186174k(xa70Var.f191694f)) {
                xdl0.m208370d0(textView, t100.m186890d(12.0f));
                xdl0.m208372e0(textView, t100.m186890d(12.0f));
                textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                textView.setText(TextUtils.isEmpty(str) ? "喜欢" : str);
            } else {
                if (TextUtils.equals(xa70Var.f191690b, "from_like") && NullChecker.m81303a(this.f152768e) && this.f152768e.isAnimating()) {
                    view.setVisibility(8);
                }
                textView.setTextColor(Color.parseColor("#cc000000"));
                textView.setText("超级喜欢");
                xdl0.m208383k(textView, FeedModule.f38852a.getDrawable(f3c0.f94598p5));
                textView.setCompoundDrawablePadding(t100.m186890d(4.0f));
                xdl0.m208370d0(textView, t100.m186890d(10.0f));
                xdl0.m208372e0(textView, xa70Var.f191691c ? t100.m186890d(12.0f) : t100.m186890d(10.0f));
            }
        }
        if (TextUtils.isEmpty(str) && !this.f152769f) {
            this.f152769f = true;
            zvf0.m220368A(MatchScData.ModuleId.mid_e_likeButton, xa70Var.f191700l.m217730c(), vwb.m200311Y("moments_user_id", xa70Var.f191694f.f56011id), vwb.m200311Y("moment_id", moment.f56011id));
        }
        if (nkg.m159896o() && !TextUtils.equals("from_live_square_tab", xa70Var.f191690b)) {
            xdl0.m208370d0(textView, t100.m186890d(10.0f));
            xdl0.m208372e0(textView, t100.m186890d(10.0f));
            xdl0.m208359W(view, t100.m186890d(16.0f));
            if (User.isMatched(xa70Var.f191694f)) {
                textView.setText("聊天");
            } else {
                textView.setText("打招呼");
            }
            view.setVisibility(0);
        }
        xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.g5i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f101153a.m173021p(textView, xa70Var, moment, view, str, photoAlbumTopView, view2);
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public final String m173025t(boolean z) {
        String strM217730c = this.f152764a.f191700l.m217730c();
        String strM217728a = this.f152764a.f191700l.m217728a(z);
        xa70 xa70Var = this.f152764a;
        p6j0.m167669c(strM217728a, strM217730c, vqg.m199549i(xa70Var.f191690b, xa70Var.f191700l.m217729b()));
        return strM217730c;
    }

    /* JADX INFO: renamed from: u */
    public final void m173026u(boolean z) {
        if (z) {
            this.f152766c.getText().equals(this.f152764a.f191695g.getString(PhotoAlbumTopView.f41945k));
        }
    }

    /* JADX INFO: renamed from: v */
    public void m173027v(xa70 xa70Var, View view, PhotoAlbumTopView photoAlbumTopView) {
        if (photoAlbumTopView.getTag() != null) {
            photoAlbumTopView.removeOnAttachStateChangeListener((View.OnAttachStateChangeListener) photoAlbumTopView.getTag());
        }
        ViewOnAttachStateChangeListenerC19430a viewOnAttachStateChangeListenerC19430a = new ViewOnAttachStateChangeListenerC19430a(photoAlbumTopView);
        photoAlbumTopView.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC19430a);
        photoAlbumTopView.setTag(viewOnAttachStateChangeListenerC19430a);
        this.f152768e.setVisibility(0);
        SVGALoader.with(xa70Var.f191695g).from("https://auto.tancdn.com/v1/raw/edf12e0b-b98f-410b-bb94-230b17af6c7313.pdf").autoPlay(false).repeatCount(1).animListener(new C19431b(view, photoAlbumTopView, xa70Var)).into(this.f152768e);
        this.f152768e.startAnimation();
    }

    /* JADX INFO: renamed from: l.q5i$a */
    public class ViewOnAttachStateChangeListenerC19430a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ PhotoAlbumTopView f152770a;

        public ViewOnAttachStateChangeListenerC19430a(PhotoAlbumTopView photoAlbumTopView) {
            this.f152770a = photoAlbumTopView;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            if (NullChecker.m81303a(q5i.this.f152768e)) {
                q5i.this.f152768e.stopAnimation(false);
                this.f152770a.removeView(q5i.this.f152768e);
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }
    }
}
