package p153l;

import android.animation.Animator;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Followship;
import com.p051p1.mobile.putong.data.FollowshipStatus;
import com.p051p1.mobile.putong.data.LikeFrom;
import com.p051p1.mobile.putong.data.MatchScData;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.newui.photoalbum.discovery.FriendsFeedViewPagerFrag;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feedtop.PhotoAlbumTopView;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes13.dex */
public class f7i {

    /* JADX INFO: renamed from: a */
    public dj70 f97559a;

    /* JADX INFO: renamed from: b */
    public View f97560b;

    /* JADX INFO: renamed from: c */
    public TextView f97561c;

    /* JADX INFO: renamed from: d */
    public Moment f97562d;

    /* JADX INFO: renamed from: e */
    public SVGAnimationView f97563e;

    /* JADX INFO: renamed from: f */
    public boolean f97564f;

    /* JADX INFO: renamed from: l.f7i$b */
    public class C16922b extends AnimListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f97567a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ PhotoAlbumTopView f97568b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ dj70 f97569c;

        public C16922b(View view, PhotoAlbumTopView photoAlbumTopView, dj70 dj70Var) {
            this.f97567a = view;
            this.f97568b = photoAlbumTopView;
            this.f97569c = dj70Var;
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m124464b(PhotoAlbumTopView photoAlbumTopView, dj70 dj70Var, View view) {
            f7i.this.f97563e.setVisibility(8);
            photoAlbumTopView.removeView(f7i.this.f97563e);
            if (TextUtils.equals(dj70Var.f88792b, "from_like")) {
                view.setVisibility(0);
            }
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            super.onFinished();
            Animator animatorM132170p = gt0.m132170p(f7i.this.f97563e, "alpha", 0L, 250L, new LinearInterpolator(), 1.0f, 0.0f);
            final PhotoAlbumTopView photoAlbumTopView = this.f97568b;
            final dj70 dj70Var = this.f97569c;
            final View view = this.f97567a;
            gt0.m132160f(animatorM132170p, new Runnable() { // from class: l.g7i
                @Override // java.lang.Runnable
                public final void run() {
                    this.f102584a.m124464b(photoAlbumTopView, dj70Var, view);
                }
            });
            animatorM132170p.start();
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStart() {
            super.onStart();
            this.f97567a.setVisibility(4);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m124441a(boolean z, Followship followship) {
        if (z) {
            return;
        }
        o1j0.m165649w(R$string.f39782M0);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m124442b(dj70 dj70Var, View view, Relationship relationship) {
        dj70Var.f88796f.localRelationship = relationship;
        view.setVisibility(8);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m124444d(Throwable th) {
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m124449i(boolean z, Followship followship) {
        if (z) {
            return;
        }
        o1j0.m165649w(R$string.f39876b3);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m124450j(Throwable th) {
    }

    /* JADX INFO: renamed from: k */
    public static int m124451k(User user, boolean z) {
        if (user == null) {
            return -1;
        }
        if (NullChecker.m82486a(user.localRelationship)) {
            return (TEnum.equals(user.localRelationship.state, "liked") || TEnum.equals(user.localRelationship.state, "matched")) ? 5 : 4;
        }
        return 4;
    }

    /* JADX INFO: renamed from: l */
    public static int m124452l(User user, boolean z) {
        FollowshipStatus followshipStatus;
        if (user == null) {
            return -1;
        }
        if (user.isTeamAccount()) {
            return (!kyi.m151972a(user.f56859id) || z) ? -1 : 3;
        }
        if (NullChecker.m82486a(user.localRelationship) && TEnum.equals(user.localRelationship.state, "matched") && kyi.m151972a(user.f56859id) && !z) {
            return 3;
        }
        Followship followship = user.localFollowship;
        if (followship != null && (followshipStatus = followship.state) != null) {
            if (TEnum.equals(followshipStatus, FollowshipStatus.following)) {
                return 2;
            }
            if (!TEnum.equals(user.localFollowship.state, "default") && !TEnum.equals(user.localFollowship.state, FollowshipStatus.followed) && !TEnum.equals(user.localFollowship.state, FollowshipStatus.unfollow) && !TEnum.equals(user.localFollowship.state, "unknown_")) {
                if (TEnum.equals(user.localFollowship.state, "matched")) {
                    return kyi.m151972a(user.f56859id) ? 3 : 2;
                }
                return -1;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m124453m(String str) {
        return "topic_latest".equals(str);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m124454n(String str, final boolean z) {
        FeedModule.f39703d.m145743m7(FeedModule.m61405F().userId(), this.f97559a.f88796f, false, str).subscribe(psd0.m173597H(new y20() { // from class: l.d7i
            @Override // p153l.y20
            public final void call(Object obj) {
                f7i.m124441a(z, (Followship) obj);
            }
        }, new y20() { // from class: l.e7i
            @Override // p153l.y20
            public final void call(Object obj) {
                f7i.m124450j((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m124455o(dj70 dj70Var, View view, PhotoAlbumTopView photoAlbumTopView, Relationship relationship) {
        if (!dj70Var.f88793c && TextUtils.equals(dj70Var.f88792b, "from_discover_dating")) {
            FriendsFeedViewPagerFrag.f42344I0.m137019l(uxj0.f181467a);
        }
        if (dj70Var.f88793c) {
            return;
        }
        if (TextUtils.equals(dj70Var.f88792b, "from_discover_dating") || TextUtils.equals(dj70Var.f88792b, "from_like")) {
            m124462v(dj70Var, view, photoAlbumTopView);
        }
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m124456p(TextView textView, final dj70 dj70Var, Moment moment, final View view, String str, final PhotoAlbumTopView photoAlbumTopView, View view2) {
        if (TextUtils.equals(textView.getText().toString(), "打招呼") || TextUtils.equals(textView.getText().toString(), "聊天")) {
            er60.m122104w().m122130s(dj70Var.f88791a, ksg.m151174K(dj70Var.f88792b, false), true, false);
            FeedModule.f39702c.m61908f3(dj70Var.f88797g, dj70Var.f88796f, dj70Var.f88791a, ksg.m151174K(dj70Var.f88792b, false), false);
        } else {
            if (TextUtils.equals(textView.getText().toString(), "超级喜欢")) {
                i4g0.m138523u(MatchScData.ModuleId.mid_e_superlikeButton, ksg.m151174K(dj70Var.f88792b, false), jyb.m147494Y("moments_user_id", dj70Var.f88796f.f56859id), jyb.m147494Y("is_privileged", dj70Var.f88796f.f56859id), jyb.m147494Y("showfrom_superlike", dj70Var.f88792b));
                FeedModule.m61406H().mo31832v8(dj70Var.f88797g, dj70Var.f88796f, true, !dj70Var.f88795e, null, LikeFrom.get("moment"), moment.f56859id, ksg.m151179N(dj70Var.f88802l.m125789c()), new y20() { // from class: l.x6i
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        f7i.m124442b(dj70Var, view, (Relationship) obj);
                    }
                }, null);
                return;
            }
            i4g0.m138523u(MatchScData.ModuleId.mid_e_likeButton, dj70Var.f88802l.m125789c(), jyb.m147494Y("moments_user_id", dj70Var.f88796f.f56859id), jyb.m147494Y("moment_id", moment.f56859id));
            if (!TextUtils.isEmpty(str)) {
                FeedModule.m61406H().mo31728Rs(dj70Var.f88797g, dj70Var.f88796f, true, LikeFrom.get("greet"), null, true, dj70Var.f88802l.m125789c());
            } else {
                this.f97563e = qyh.m178649a(dj70Var.f88797g, photoAlbumTopView, view, 0.0f, -qa00.m175859d(10.0f), 48.0f, 48.0f);
                FeedModule.m61406H().mo31791kn(dj70Var.f88797g, dj70Var.f88796f, !dj70Var.f88795e, null, LikeFrom.get("moment"), moment.f56859id, new y20() { // from class: l.y6i
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f197686a.m124455o(dj70Var, view, photoAlbumTopView, (Relationship) obj);
                    }
                }, new y20() { // from class: l.z6i
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        view.setVisibility(0);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m124457q(FollowshipStatus followshipStatus, dj70 dj70Var, View view) {
        m124458r(followshipStatus, dj70Var.f88793c);
    }

    /* JADX INFO: renamed from: r */
    public final void m124458r(FollowshipStatus followshipStatus, final boolean z) {
        if (!TextUtils.isEmpty(this.f97559a.f88807q)) {
            tfj0.m190943f("e_follow_behind_guide", "p_user_moment_interactions_details_view", tfj0.C20302a.m190949g("trigger_time", this.f97559a.f88807q));
        }
        if (NullChecker.m82486a(followshipStatus) && (TEnum.equals(followshipStatus, FollowshipStatus.following) || TEnum.equals(followshipStatus, "matched"))) {
            final String strM124460t = m124460t(false);
            Act act = this.f97559a.f88797g;
            k3h.m148105v0(act, act.getResources().getString(R$string.f40031z), new x20() { // from class: l.a7i
                @Override // p153l.x20
                public final void call() {
                    this.f68820a.m124454n(strM124460t, z);
                }
            });
            return;
        }
        String strM124460t2 = m124460t(true);
        User user = this.f97559a.f88796f;
        if (!user.profile.moments.hidePublicMoments || User.isMatched(user)) {
            FeedModule.f39703d.m145750n7(FeedModule.m61405F().userId(), this.f97559a.f88796f, true, "liveMomentNearby", this.f97562d.live.f39615id, strM124460t2).subscribe(psd0.m173597H(new y20() { // from class: l.b7i
                @Override // p153l.y20
                public final void call(Object obj) {
                    f7i.m124449i(z, (Followship) obj);
                }
            }, new y20() { // from class: l.c7i
                @Override // p153l.y20
                public final void call(Object obj) {
                    f7i.m124444d((Throwable) obj);
                }
            }));
        } else {
            o1j0.m165649w(R$string.f39977q);
        }
    }

    /* JADX INFO: renamed from: s */
    public void m124459s(final dj70 dj70Var, final View view, final TextView textView, final String str, final PhotoAlbumTopView photoAlbumTopView) {
        this.f97559a = dj70Var;
        this.f97560b = view;
        this.f97561c = textView;
        final Moment moment = dj70Var.f88791a;
        Moment moment2 = this.f97562d;
        if (moment2 == null || moment == null || !TextUtils.equals(moment2.f56859id, moment.f56859id)) {
            this.f97564f = false;
        }
        this.f97562d = moment;
        if (at0.m100010d(moment) || dj70Var.f88796f.isMe() || (User.isMatched(dj70Var.f88796f) && !cmg.m111225o())) {
            view.setVisibility(8);
            return;
        }
        if (!cmg.m111183K() && ((!cmg.m111197Y() || moment.owner.equals(FeedModule.m61405F().userId()) || dj70Var.f88796f.isTeamAccount()) && TextUtils.isEmpty(str) && (!TextUtils.equals(dj70Var.f88792b, "from_live_square_tab") || dj70Var.f88793c))) {
            gj70.C17230a c17230a = gj70.m130463a().m130464b().get(dj70Var.f88792b);
            final FollowshipStatus followshipStatus = null;
            if (!((NullChecker.m82486a(c17230a) && c17230a.f104609a && !m124453m(dj70Var.f88792b)) || dj70Var.f88793c) || moment.owner.equals(FeedModule.m61405F().userId()) || (NullChecker.m82486a(dj70Var.f88796f.localRelationship) && TEnum.equals(dj70Var.f88796f.localRelationship.state, "matched"))) {
                view.setVisibility(8);
            } else {
                int i = R$string.f39808Q2;
                int i2 = lbc0.f131182y;
                if (NullChecker.m82486a(dj70Var.f88796f.localFollowship)) {
                    followshipStatus = dj70Var.f88796f.localFollowship.state;
                    if (TEnum.equals(followshipStatus, FollowshipStatus.following)) {
                        view.setVisibility(0);
                        textView.setTextColor(dj70Var.f88797g.getResources().getColor(k9c0.f124474F));
                        textView.setText(R$string.f39802P2);
                        view.setBackgroundDrawable(dj70Var.f88797g.getResources().getDrawable(lbc0.f131006c));
                    } else if (TEnum.equals(followshipStatus, "matched")) {
                        view.setVisibility(0);
                        textView.setTextColor(dj70Var.f88797g.getResources().getColor(k9c0.f124474F));
                        textView.setText(R$string.f39790N2);
                        view.setBackgroundDrawable(dj70Var.f88797g.getResources().getDrawable(lbc0.f131006c));
                    } else {
                        m124461u(dj70Var.f88793c);
                        view.setVisibility(0);
                        textView.setTextColor(Color.parseColor("#f55a43"));
                        textView.setText(i);
                        view.setBackgroundDrawable(dj70Var.f88797g.getResources().getDrawable(i2));
                    }
                } else {
                    m124461u(dj70Var.f88793c);
                    view.setVisibility(0);
                    textView.setTextColor(Color.parseColor("#f55a43"));
                    textView.setText(i);
                    view.setBackgroundDrawable(dj70Var.f88797g.getResources().getDrawable(i2));
                }
                textView.getPaint().setFakeBoldText(true);
            }
            view.setOnClickListener(new View.OnClickListener() { // from class: l.w6i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f187622a.m124457q(followshipStatus, dj70Var, view2);
                }
            });
            return;
        }
        view.setVisibility(0);
        if ((!TextUtils.equals(dj70Var.f88792b, "from_like") || hyh.m137734k(dj70Var.f88796f)) && hyh.m137735l(dj70Var.f88796f) && TextUtils.isEmpty(str) && !cmg.m111225o()) {
            view.setVisibility(8);
        } else {
            if (cmg.m111183K() || TextUtils.equals(dj70Var.f88792b, "from_live_square_tab")) {
                if (dj70Var.f88793c) {
                    textView.setTextSize(14.0f);
                    bnl0.m105505C0(textView, qa00.m175859d(34.0f));
                    view.setBackground(dj70Var.f88797g.getResources().getDrawable(lbc0.f131144t1));
                } else {
                    textView.setTextSize(12.0f);
                    bnl0.m105505C0(textView, qa00.m175859d(28.0f));
                    view.setBackground(dj70Var.f88797g.getResources().getDrawable(lbc0.f131136s1));
                }
            }
            textView.setTextColor(Color.parseColor("#fe7e1d"));
            view.setSelected(false);
            if (!TextUtils.equals(dj70Var.f88792b, "from_like") || hyh.m137734k(dj70Var.f88796f)) {
                bnl0.m105550d0(textView, qa00.m175859d(12.0f));
                bnl0.m105552e0(textView, qa00.m175859d(12.0f));
                textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                textView.setText(TextUtils.isEmpty(str) ? "喜欢" : str);
            } else {
                if (TextUtils.equals(dj70Var.f88792b, "from_like") && NullChecker.m82486a(this.f97563e) && this.f97563e.isAnimating()) {
                    view.setVisibility(8);
                }
                textView.setTextColor(Color.parseColor("#cc000000"));
                textView.setText("超级喜欢");
                bnl0.m105563k(textView, FeedModule.f39700a.getDrawable(lbc0.f131116p5));
                textView.setCompoundDrawablePadding(qa00.m175859d(4.0f));
                bnl0.m105550d0(textView, qa00.m175859d(10.0f));
                bnl0.m105552e0(textView, dj70Var.f88793c ? qa00.m175859d(12.0f) : qa00.m175859d(10.0f));
            }
        }
        if (TextUtils.isEmpty(str) && !this.f97564f) {
            this.f97564f = true;
            i4g0.m138492A(MatchScData.ModuleId.mid_e_likeButton, dj70Var.f88802l.m125789c(), jyb.m147494Y("moments_user_id", dj70Var.f88796f.f56859id), jyb.m147494Y("moment_id", moment.f56859id));
        }
        if (cmg.m111225o() && !TextUtils.equals("from_live_square_tab", dj70Var.f88792b)) {
            bnl0.m105550d0(textView, qa00.m175859d(10.0f));
            bnl0.m105552e0(textView, qa00.m175859d(10.0f));
            bnl0.m105539W(view, qa00.m175859d(16.0f));
            if (User.isMatched(dj70Var.f88796f)) {
                textView.setText("聊天");
            } else {
                textView.setText("打招呼");
            }
            view.setVisibility(0);
        }
        bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.v6i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f182648a.m124456p(textView, dj70Var, moment, view, str, photoAlbumTopView, view2);
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public final String m124460t(boolean z) {
        String strM125789c = this.f97559a.f88802l.m125789c();
        String strM125787a = this.f97559a.f88802l.m125787a(z);
        dj70 dj70Var = this.f97559a;
        tfj0.m190940c(strM125787a, strM125789c, ksg.m151208i(dj70Var.f88792b, dj70Var.f88802l.m125788b()));
        return strM125789c;
    }

    /* JADX INFO: renamed from: u */
    public final void m124461u(boolean z) {
        if (z) {
            this.f97561c.getText().equals(this.f97559a.f88797g.getString(PhotoAlbumTopView.f42793k));
        }
    }

    /* JADX INFO: renamed from: v */
    public void m124462v(dj70 dj70Var, View view, PhotoAlbumTopView photoAlbumTopView) {
        if (photoAlbumTopView.getTag() != null) {
            photoAlbumTopView.removeOnAttachStateChangeListener((View.OnAttachStateChangeListener) photoAlbumTopView.getTag());
        }
        ViewOnAttachStateChangeListenerC16921a viewOnAttachStateChangeListenerC16921a = new ViewOnAttachStateChangeListenerC16921a(photoAlbumTopView);
        photoAlbumTopView.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC16921a);
        photoAlbumTopView.setTag(viewOnAttachStateChangeListenerC16921a);
        this.f97563e.setVisibility(0);
        SVGALoader.with(dj70Var.f88797g).from("https://auto.tancdn.com/v1/raw/edf12e0b-b98f-410b-bb94-230b17af6c7313.pdf").autoPlay(false).repeatCount(1).animListener(new C16922b(view, photoAlbumTopView, dj70Var)).into(this.f97563e);
        this.f97563e.startAnimation();
    }

    /* JADX INFO: renamed from: l.f7i$a */
    public class ViewOnAttachStateChangeListenerC16921a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ PhotoAlbumTopView f97565a;

        public ViewOnAttachStateChangeListenerC16921a(PhotoAlbumTopView photoAlbumTopView) {
            this.f97565a = photoAlbumTopView;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            if (NullChecker.m82486a(f7i.this.f97563e)) {
                f7i.this.f97563e.stopAnimation(false);
                this.f97565a.removeView(f7i.this.f97563e);
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }
    }
}
