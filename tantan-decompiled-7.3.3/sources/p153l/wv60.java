package p153l;

import com.p051p1.mobile.putong.core.data.ProfileLikeModuleType;
import com.p051p1.mobile.putong.data.BubbleInfo;
import com.p051p1.mobile.putong.data.ConversationStatus;
import com.p051p1.mobile.putong.data.Followship;
import com.p051p1.mobile.putong.data.FollowshipStatus;
import com.p051p1.mobile.putong.data.MatchScData;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.p051p1.mobile.putong.feed.data.TopicOperations;
import com.p051p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedAct;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feed.personalfeed.PersonalPhotoAlbumFeedFrag;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class wv60 extends ar2<vw60> implements v0q {

    /* JADX INFO: renamed from: a */
    public PersonalPhotoAlbumFeedFrag f190914a;

    /* JADX INFO: renamed from: b */
    public PhotoAlbumBaseFrag f190915b;

    /* JADX INFO: renamed from: c */
    public n570 f190916c;

    /* JADX INFO: renamed from: d */
    public String f190917d;

    /* JADX INFO: renamed from: e */
    public String f190918e;

    /* JADX INFO: renamed from: f */
    public int f190919f;

    /* JADX INFO: renamed from: g */
    public int f190920g;

    /* JADX INFO: renamed from: h */
    public String f190921h;

    /* JADX INFO: renamed from: i */
    public boolean f190922i;

    /* JADX INFO: renamed from: j */
    public User f190923j;

    /* JADX INFO: renamed from: k */
    public boolean f190924k;

    /* JADX INFO: renamed from: l */
    public bkj0<List<TopicOperations>, List<TopicMoment>, List<Moment>> f190925l;

    /* JADX INFO: renamed from: m */
    public boolean f190926m;

    /* JADX INFO: renamed from: n */
    public boolean f190927n;

    public wv60(ner nerVar) {
        super(nerVar);
        this.f190921h = User.ID_TEAM_ACCOUNT;
        this.f190927n = false;
        this.f190914a = (PersonalPhotoAlbumFeedFrag) nerVar;
    }

    /* JADX INFO: renamed from: E0 */
    private void m207989E0() {
        duringCreated(FeedModule.f39703d.m145702g8(this.f190917d)).subscribe(psd0.m173597H(new y20() { // from class: l.iv60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f117022a.m208018L0((BubbleInfo) obj);
            }
        }, new y20() { // from class: l.jv60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f122772a.m208019N0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public /* synthetic */ void m207990G0(List list) {
        ((vw60) this.viewModel).m203140r0(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public /* synthetic */ void m207991H0(Throwable th) {
        ((vw60) this.viewModel).m203140r0(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P0 */
    public /* synthetic */ void m207992P0(pf60 pf60Var) {
        ((vw60) this.viewModel).m203139q0((User) pf60Var.f152156a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public /* synthetic */ void m207993V0(User user) {
        this.f190923j = user;
        ((vw60) this.viewModel).m203142u0(user);
    }

    /* JADX INFO: renamed from: c1 */
    private void m207994c1() {
        act().duringCreated(FeedModule.f39703d.m145695f8(this.f190917d)).subscribe(psd0.m173597H(new y20() { // from class: l.kv60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f128946a.m207993V0((User) obj);
            }
        }, new y20() { // from class: l.lv60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f133686a.m208025W0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q0 */
    public static /* synthetic */ void m208007q0(Throwable th) {
    }

    /* JADX INFO: renamed from: y0 */
    private PhotoAlbumBaseFrag m208010y0() {
        if (this.f190915b == null) {
            this.f190915b = this.f190914a.mo63214Q0();
        }
        return this.f190915b;
    }

    /* JADX INFO: renamed from: z0 */
    private v670 m208011z0() {
        return m208010y0().f42299A;
    }

    /* JADX INFO: renamed from: A0 */
    public final y670 m208012A0() {
        return m208010y0().f42302z;
    }

    /* JADX INFO: renamed from: C0 */
    public n570 m208013C0() {
        m208012A0().m214388H();
        return new hu60(this.f190914a, "from_profile_opt".equals(this.f190918e), this.f190914a);
    }

    /* JADX INFO: renamed from: D0 */
    public void m208014D0() {
        this.f190918e = this.f190914a.getArguments().getString("from");
        this.f190917d = this.f190914a.getArguments().getString("user_id");
        this.f190919f = this.f190914a.getArguments().getInt("page_type", -1);
        this.f190920g = this.f190914a.getArguments().getInt("selected_item_position");
        this.f190921h = this.f190914a.getArguments().getString("target_moment_id");
        this.f190926m = this.f190914a.getArguments().getBoolean("start_home_card");
        if (cmg.m111197Y() && !this.f190922i) {
            duringCreated(FeedModule.m61406H().mo31821se(this.f190917d)).subscribe(psd0.m173597H(new y20() { // from class: l.hv60
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f111736a.m207990G0((List) obj);
                }
            }, new y20() { // from class: l.nv60
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f143779a.m207991H0((Throwable) obj);
                }
            }));
        }
        if (cmg.m111218k0()) {
            m207989E0();
            duringCreated(FeedModule.f39703d.f121391z0).subscribe(psd0.m173596G(new y20() { // from class: l.ov60
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f149233a.m208016I0((Boolean) obj);
                }
            }));
            duringCreated(FeedModule.f39703d.f121380t1).subscribe(psd0.m173596G(new y20() { // from class: l.pv60
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f154263a.m208017J0((Boolean) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: F0 */
    public boolean m208015F0() {
        return this.f190922i;
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m208016I0(Boolean bool) {
        m207989E0();
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m208017J0(Boolean bool) {
        m207989E0();
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m208018L0(BubbleInfo bubbleInfo) {
        V v2 = this.viewModel;
        if (bubbleInfo == null) {
            ((vw60) v2).m203122U();
        } else {
            ((vw60) v2).m203143v0(bubbleInfo);
        }
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m208019N0(Throwable th) {
        ((vw60) this.viewModel).m203122U();
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m208020O0(bkj0 bkj0Var) {
        this.f190925l = bkj0Var;
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m208021Q0(String str) {
        this.f190927n = true;
        m207994c1();
        User userM145688e8 = FeedModule.f39703d.m145688e8(str);
        this.f190923j = userM145688e8;
        if (NullChecker.m82486a(userM145688e8)) {
            ((vw60) this.viewModel).m203142u0(this.f190923j);
        } else {
            m207994c1();
        }
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ void m208022R0(final String str, Boolean bool) {
        l51.m152888H(act(), new Runnable() { // from class: l.mv60
            @Override // java.lang.Runnable
            public final void run() {
                this.f138875a.m208021Q0(str);
            }
        }, this.f190927n ? 1000L : 0L);
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m208023S0(ConversationStatus conversationStatus) {
        ((vw60) this.viewModel).m203141t0(ksg.m151186U(conversationStatus));
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ void m208024U0(User user) {
        ((vw60) this.viewModel).m203142u0(user);
    }

    /* JADX INFO: renamed from: W0 */
    public final /* synthetic */ void m208025W0(Throwable th) {
        User userM145688e8 = FeedModule.f39703d.m145688e8(this.f190917d);
        this.f190923j = userM145688e8;
        ((vw60) this.viewModel).m203142u0(userM145688e8);
    }

    /* JADX INFO: renamed from: X0 */
    public void m208026X0() {
        this.f190924k = true;
    }

    /* JADX INFO: renamed from: Y0 */
    public void m208027Y0(final String str) {
        if (!this.f190922i) {
            m207994c1();
            act().duringCreated(kyi.m151973b(this.f190917d)).subscribe(psd0.m173596G(new y20() { // from class: l.rv60
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f164986a.m208022R0(str, (Boolean) obj);
                }
            }));
            duringCreated(FeedModule.m61406H().mo31747ab(str)).subscribe(psd0.m173596G(new y20() { // from class: l.sv60
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f170810a.m208023S0((ConversationStatus) obj);
                }
            }));
        } else {
            mrb0.m159635M(str);
            User userM145688e8 = FeedModule.f39703d.m145688e8(str);
            this.f190923j = userM145688e8;
            ((vw60) this.viewModel).m203142u0(userM145688e8);
            act().duringCreated(mrb0.m159624B()).subscribe(psd0.m173596G(new y20() { // from class: l.qv60
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f159723a.m208024U0((User) obj);
                }
            }));
        }
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        duringCreated(FeedModule.f39703d.m145748mc(ProfileLikeModuleType.album)).subscribe(psd0.m173597H(new y20() { // from class: l.tv60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f176244a.m208020O0((bkj0) obj);
            }
        }, new y20() { // from class: l.uv60
            @Override // p153l.y20
            public final void call(Object obj) {
                wv60.m208007q0((Throwable) obj);
            }
        }));
        if (!cmg.m111183K() || this.f190922i) {
            return;
        }
        duringCreated(FeedModule.f39703d.f121326S0).subscribe(psd0.m173596G(new y20() { // from class: l.vv60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f185904a.m207992P0((pf60) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a1 */
    public void m208028a1() {
        this.f190922i = FeedModule.m61405F().userId().equals(this.f190917d);
        User userM145688e8 = FeedModule.f39703d.m145688e8(this.f190917d);
        if (NullChecker.m82486a(userM145688e8)) {
            ((vw60) this.viewModel).m203142u0(userM145688e8);
        }
        m208027Y0(this.f190917d);
    }

    /* JADX INFO: renamed from: b1 */
    public void m208029b1() {
        if ((act() instanceof PhotoAlbumFeedAct) && "p_christmas_profile".equals(((PhotoAlbumFeedAct) act()).m65541a2())) {
            tfj0.m190940c(MatchScData.ModuleId.mid_e_follow, "p_album", pf60.m172085a("owner_id", this.f190923j.f56859id), pf60.m172085a("album_from", "p_christmas_profile"), pf60.m172085a("receiver_user_id", this.f190923j.f56859id));
        } else {
            tfj0.m190940c(MatchScData.ModuleId.mid_e_follow, "p_album", pf60.m172085a("owner_id", this.f190923j.f56859id), pf60.m172085a("receiver_user_id", this.f190923j.f56859id));
        }
    }

    /* JADX INFO: renamed from: t0 */
    public void m208030t0(pf60<User, Boolean> pf60Var, boolean z) {
        m208011z0().m200027X0(pf60Var, z);
        User userMo137270m = m208032x0().mo137270m(this.f190917d);
        act().invalidateOptionsMenu();
        ((vw60) this.viewModel).m203142u0(userMo137270m);
    }

    /* JADX INFO: renamed from: u0 */
    public void m208031u0() {
        if (NullChecker.m82487b(this.f190923j)) {
            Followship followship = this.f190923j.localFollowship;
            if (followship == null || TEnum.equals(followship.state, "default") || TEnum.equals(this.f190923j.localFollowship.state, FollowshipStatus.followed) || TEnum.equals(this.f190923j.localFollowship.state, FollowshipStatus.unfollow) || TEnum.equals(this.f190923j.localFollowship.state, "unknown_")) {
                m208029b1();
                if (this.f190923j.profile.moments.hidePublicMoments) {
                    o1j0.m165649w(R$string.f39977q);
                    return;
                } else {
                    FeedModule.f39703d.m145694f7(FeedModule.m61405F().userId(), this.f190923j, true);
                    return;
                }
            }
            if (NullChecker.m82486a(this.f190923j.localFollowship)) {
                if (TEnum.equals(this.f190923j.localFollowship.state, FollowshipStatus.following) || TEnum.equals(this.f190923j.localFollowship.state, "matched")) {
                    tfj0.m190940c("e_cancelfollow", "p_album", pf60.m172085a("owner_id", this.f190923j.f56859id), pf60.m172085a("receiver_user_id", this.f190923j.f56859id));
                    ((vw60) this.viewModel).m203107G0(act().getResources().getString(R$string.f40031z));
                }
            }
        }
    }

    @Override // p153l.v0q
    /* JADX INFO: renamed from: w1 */
    public boolean mo63220w1() {
        return this.f190924k;
    }

    /* JADX INFO: renamed from: x0 */
    public n570 m208032x0() {
        if (this.f190916c == null) {
            this.f190916c = m208011z0().f182605b;
        }
        return this.f190916c;
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
