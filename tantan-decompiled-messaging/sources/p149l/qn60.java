package p149l;

import com.p046p1.mobile.putong.core.data.ProfileLikeModuleType;
import com.p046p1.mobile.putong.data.BubbleInfo;
import com.p046p1.mobile.putong.data.ConversationStatus;
import com.p046p1.mobile.putong.data.Followship;
import com.p046p1.mobile.putong.data.FollowshipStatus;
import com.p046p1.mobile.putong.data.MatchScData;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.p046p1.mobile.putong.feed.data.TopicOperations;
import com.p046p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedAct;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feed.personalfeed.PersonalPhotoAlbumFeedFrag;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class qn60 extends jq2<po60> implements vyp {

    /* JADX INFO: renamed from: a */
    public PersonalPhotoAlbumFeedFrag f155388a;

    /* JADX INFO: renamed from: b */
    public PhotoAlbumBaseFrag f155389b;

    /* JADX INFO: renamed from: c */
    public hx60 f155390c;

    /* JADX INFO: renamed from: d */
    public String f155391d;

    /* JADX INFO: renamed from: e */
    public String f155392e;

    /* JADX INFO: renamed from: f */
    public int f155393f;

    /* JADX INFO: renamed from: g */
    public int f155394g;

    /* JADX INFO: renamed from: h */
    public String f155395h;

    /* JADX INFO: renamed from: i */
    public boolean f155396i;

    /* JADX INFO: renamed from: j */
    public User f155397j;

    /* JADX INFO: renamed from: k */
    public boolean f155398k;

    /* JADX INFO: renamed from: l */
    public xaj0<List<TopicOperations>, List<TopicMoment>, List<Moment>> f155399l;

    /* JADX INFO: renamed from: m */
    public boolean f155400m;

    /* JADX INFO: renamed from: n */
    public boolean f155401n;

    public qn60(mcr mcrVar) {
        super(mcrVar);
        this.f155395h = User.ID_TEAM_ACCOUNT;
        this.f155401n = false;
        this.f155388a = (PersonalPhotoAlbumFeedFrag) mcrVar;
    }

    /* JADX INFO: renamed from: E0 */
    private void m175589E0() {
        duringCreated(FeedModule.f38855d.m209461g8(this.f155391d)).subscribe(mkd0.m154956H(new e30() { // from class: l.cn60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f81647a.m175618L0((BubbleInfo) obj);
            }
        }, new e30() { // from class: l.dn60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f87031a.m175619N0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public /* synthetic */ void m175590G0(List list) {
        ((po60) this.viewModel).m170547r0(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public /* synthetic */ void m175591H0(Throwable th) {
        ((po60) this.viewModel).m170547r0(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P0 */
    public /* synthetic */ void m175592P0(j760 j760Var) {
        ((po60) this.viewModel).m170546q0((User) j760Var.f116564a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public /* synthetic */ void m175593V0(User user) {
        this.f155397j = user;
        ((po60) this.viewModel).m170549u0(user);
    }

    /* JADX INFO: renamed from: c1 */
    private void m175594c1() {
        act().duringCreated(FeedModule.f38855d.m209454f8(this.f155391d)).subscribe(mkd0.m154956H(new e30() { // from class: l.en60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f92281a.m175593V0((User) obj);
            }
        }, new e30() { // from class: l.fn60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f98400a.m175625W0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q0 */
    public static /* synthetic */ void m175607q0(Throwable th) {
    }

    /* JADX INFO: renamed from: y0 */
    private PhotoAlbumBaseFrag m175610y0() {
        if (this.f155389b == null) {
            this.f155389b = this.f155388a.mo62031Q0();
        }
        return this.f155389b;
    }

    /* JADX INFO: renamed from: z0 */
    private py60 m175611z0() {
        return m175610y0().f41451A;
    }

    /* JADX INFO: renamed from: A0 */
    public final sy60 m175612A0() {
        return m175610y0().f41454z;
    }

    /* JADX INFO: renamed from: C0 */
    public hx60 m175613C0() {
        m175612A0().m186618H();
        return new bm60(this.f155388a, "from_profile_opt".equals(this.f155392e), this.f155388a);
    }

    /* JADX INFO: renamed from: D0 */
    public void m175614D0() {
        this.f155392e = this.f155388a.getArguments().getString("from");
        this.f155391d = this.f155388a.getArguments().getString("user_id");
        this.f155393f = this.f155388a.getArguments().getInt("page_type", -1);
        this.f155394g = this.f155388a.getArguments().getInt("selected_item_position");
        this.f155395h = this.f155388a.getArguments().getString("target_moment_id");
        this.f155400m = this.f155388a.getArguments().getBoolean("start_home_card");
        if (nkg.m159868Y() && !this.f155396i) {
            duringCreated(FeedModule.m60222H().mo30818se(this.f155391d)).subscribe(mkd0.m154956H(new e30() { // from class: l.bn60
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f76373a.m175590G0((List) obj);
                }
            }, new e30() { // from class: l.hn60
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f108586a.m175591H0((Throwable) obj);
                }
            }));
        }
        if (nkg.m159889k0()) {
            m175589E0();
            duringCreated(FeedModule.f38855d.f193081z0).subscribe(mkd0.m154955G(new e30() { // from class: l.in60
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f113990a.m175616I0((Boolean) obj);
                }
            }));
            duringCreated(FeedModule.f38855d.f193070t1).subscribe(mkd0.m154955G(new e30() { // from class: l.jn60
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f118813a.m175617J0((Boolean) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: F0 */
    public boolean m175615F0() {
        return this.f155396i;
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m175616I0(Boolean bool) {
        m175589E0();
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m175617J0(Boolean bool) {
        m175589E0();
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m175618L0(BubbleInfo bubbleInfo) {
        V v2 = this.viewModel;
        if (bubbleInfo == null) {
            ((po60) v2).m170529U();
        } else {
            ((po60) v2).m170550v0(bubbleInfo);
        }
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m175619N0(Throwable th) {
        ((po60) this.viewModel).m170529U();
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m175620O0(xaj0 xaj0Var) {
        this.f155399l = xaj0Var;
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m175621Q0(String str) {
        this.f155401n = true;
        m175594c1();
        User userM209447e8 = FeedModule.f38855d.m209447e8(str);
        this.f155397j = userM209447e8;
        if (NullChecker.m81303a(userM209447e8)) {
            ((po60) this.viewModel).m170549u0(this.f155397j);
        } else {
            m175594c1();
        }
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ void m175622R0(final String str, Boolean bool) {
        e51.m114743H(act(), new Runnable() { // from class: l.gn60
            @Override // java.lang.Runnable
            public final void run() {
                this.f103576a.m175621Q0(str);
            }
        }, this.f155401n ? 1000L : 0L);
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m175623S0(ConversationStatus conversationStatus) {
        ((po60) this.viewModel).m170548t0(vqg.m199527U(conversationStatus));
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ void m175624U0(User user) {
        ((po60) this.viewModel).m170549u0(user);
    }

    /* JADX INFO: renamed from: W0 */
    public final /* synthetic */ void m175625W0(Throwable th) {
        User userM209447e8 = FeedModule.f38855d.m209447e8(this.f155391d);
        this.f155397j = userM209447e8;
        ((po60) this.viewModel).m170549u0(userM209447e8);
    }

    /* JADX INFO: renamed from: X0 */
    public void m175626X0() {
        this.f155398k = true;
    }

    /* JADX INFO: renamed from: Y0 */
    public void m175627Y0(final String str) {
        if (!this.f155396i) {
            m175594c1();
            act().duringCreated(ovi.m166195b(this.f155391d)).subscribe(mkd0.m154955G(new e30() { // from class: l.ln60
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f128966a.m175622R0(str, (Boolean) obj);
                }
            }));
            duringCreated(FeedModule.m60222H().mo30744ab(str)).subscribe(mkd0.m154955G(new e30() { // from class: l.mn60
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f134741a.m175623S0((ConversationStatus) obj);
                }
            }));
        } else {
            ijb0.m136549M(str);
            User userM209447e8 = FeedModule.f38855d.m209447e8(str);
            this.f155397j = userM209447e8;
            ((po60) this.viewModel).m170549u0(userM209447e8);
            act().duringCreated(ijb0.m136538B()).subscribe(mkd0.m154955G(new e30() { // from class: l.kn60
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f123861a.m175624U0((User) obj);
                }
            }));
        }
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        duringCreated(FeedModule.f38855d.m209507mc(ProfileLikeModuleType.album)).subscribe(mkd0.m154956H(new e30() { // from class: l.nn60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f139699a.m175620O0((xaj0) obj);
            }
        }, new e30() { // from class: l.on60
            @Override // p149l.e30
            public final void call(Object obj) {
                qn60.m175607q0((Throwable) obj);
            }
        }));
        if (!nkg.m159854K() || this.f155396i) {
            return;
        }
        duringCreated(FeedModule.f38855d.f193016S0).subscribe(mkd0.m154955G(new e30() { // from class: l.pn60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f150368a.m175592P0((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a1 */
    public void m175628a1() {
        this.f155396i = FeedModule.m60221F().userId().equals(this.f155391d);
        User userM209447e8 = FeedModule.f38855d.m209447e8(this.f155391d);
        if (NullChecker.m81303a(userM209447e8)) {
            ((po60) this.viewModel).m170549u0(userM209447e8);
        }
        m175627Y0(this.f155391d);
    }

    /* JADX INFO: renamed from: b1 */
    public void m175629b1() {
        if ((act() instanceof PhotoAlbumFeedAct) && "p_christmas_profile".equals(((PhotoAlbumFeedAct) act()).m64358Z1())) {
            p6j0.m167669c(MatchScData.ModuleId.mid_e_follow, "p_album", j760.m140076a("owner_id", this.f155397j.f56011id), j760.m140076a("album_from", "p_christmas_profile"), j760.m140076a("receiver_user_id", this.f155397j.f56011id));
        } else {
            p6j0.m167669c(MatchScData.ModuleId.mid_e_follow, "p_album", j760.m140076a("owner_id", this.f155397j.f56011id), j760.m140076a("receiver_user_id", this.f155397j.f56011id));
        }
    }

    /* JADX INFO: renamed from: t0 */
    public void m175630t0(j760<User, Boolean> j760Var, boolean z) {
        m175611z0().m172073X0(j760Var, z);
        User userMo133306m = m175632x0().mo133306m(this.f155391d);
        act().invalidateOptionsMenu();
        ((po60) this.viewModel).m170549u0(userMo133306m);
    }

    /* JADX INFO: renamed from: u0 */
    public void m175631u0() {
        if (NullChecker.m81304b(this.f155397j)) {
            Followship followship = this.f155397j.localFollowship;
            if (followship == null || TEnum.equals(followship.state, "default") || TEnum.equals(this.f155397j.localFollowship.state, FollowshipStatus.followed) || TEnum.equals(this.f155397j.localFollowship.state, FollowshipStatus.unfollow) || TEnum.equals(this.f155397j.localFollowship.state, "unknown_")) {
                m175629b1();
                if (this.f155397j.profile.moments.hidePublicMoments) {
                    lsi0.m151593w(R$string.f39129q);
                    return;
                } else {
                    FeedModule.f38855d.m209453f7(FeedModule.m60221F().userId(), this.f155397j, true);
                    return;
                }
            }
            if (NullChecker.m81303a(this.f155397j.localFollowship)) {
                if (TEnum.equals(this.f155397j.localFollowship.state, FollowshipStatus.following) || TEnum.equals(this.f155397j.localFollowship.state, "matched")) {
                    p6j0.m167669c("e_cancelfollow", "p_album", j760.m140076a("owner_id", this.f155397j.f56011id), j760.m140076a("receiver_user_id", this.f155397j.f56011id));
                    ((po60) this.viewModel).m170514G0(act().getResources().getString(R$string.f39183z));
                }
            }
        }
    }

    @Override // p149l.vyp
    /* JADX INFO: renamed from: w1 */
    public boolean mo62037w1() {
        return this.f155398k;
    }

    /* JADX INFO: renamed from: x0 */
    public hx60 m175632x0() {
        if (this.f155390c == null) {
            this.f155390c = m175611z0().f151803b;
        }
        return this.f155390c;
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
