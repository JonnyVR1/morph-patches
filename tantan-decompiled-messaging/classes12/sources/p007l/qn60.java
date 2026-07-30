package p007l;

import com.p000p1.mobile.putong.data.BubbleInfo;
import com.p000p1.mobile.putong.data.ConversationStatus;
import com.p000p1.mobile.putong.data.Followship;
import com.p000p1.mobile.putong.data.FollowshipStatus;
import com.p000p1.mobile.putong.data.MatchScData;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p000p1.mobile.putong.feed.data.TopicOperations;
import com.p000p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedAct;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feed.personalfeed.PersonalPhotoAlbumFeedFrag;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.e30;
import l.e51;
import l.j760;
import l.jq2;
import l.lsi0;
import l.mcr;
import l.mkd0;
import l.s7m;
import l.xaj0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class qn60 extends jq2<po60> implements vyp {

    /* JADX INFO: renamed from: a */
    public PersonalPhotoAlbumFeedFrag f12280a;

    /* JADX INFO: renamed from: b */
    public PhotoAlbumBaseFrag f12281b;

    /* JADX INFO: renamed from: c */
    public hx60 f12282c;

    /* JADX INFO: renamed from: d */
    public String f12283d;

    /* JADX INFO: renamed from: e */
    public String f12284e;

    /* JADX INFO: renamed from: f */
    public int f12285f;

    /* JADX INFO: renamed from: g */
    public int f12286g;

    /* JADX INFO: renamed from: h */
    public String f12287h;

    /* JADX INFO: renamed from: i */
    public boolean f12288i;

    /* JADX INFO: renamed from: j */
    public User f12289j;

    /* JADX INFO: renamed from: k */
    public boolean f12290k;

    /* JADX INFO: renamed from: l */
    public xaj0<List<TopicOperations>, List<TopicMoment>, List<Moment>> f12291l;

    /* JADX INFO: renamed from: m */
    public boolean f12292m;

    /* JADX INFO: renamed from: n */
    public boolean f12293n;

    public qn60(mcr mcrVar) {
        super(mcrVar);
        this.f12287h = User.ID_TEAM_ACCOUNT;
        this.f12293n = false;
        this.f12280a = (PersonalPhotoAlbumFeedFrag) mcrVar;
    }

    /* JADX INFO: renamed from: E0 */
    private void m13590E0() {
        duringCreated(FeedModule.f316d.m16642g8(this.f12283d)).subscribe(mkd0.H(new e30() { // from class: l.cn60
            public final void call(Object obj) {
                this.f6696a.m13619L0((BubbleInfo) obj);
            }
        }, new e30() { // from class: l.dn60
            public final void call(Object obj) {
                this.f7007a.m13620N0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public /* synthetic */ void m13591G0(List list) {
        ((po60) ((jq2) this).viewModel).m13148r0(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public /* synthetic */ void m13592H0(Throwable th) {
        ((po60) ((jq2) this).viewModel).m13148r0(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P0 */
    public /* synthetic */ void m13593P0(j760 j760Var) {
        ((po60) ((jq2) this).viewModel).m13147q0((User) j760Var.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public /* synthetic */ void m13594V0(User user) {
        this.f12289j = user;
        ((po60) ((jq2) this).viewModel).m13150u0(user);
    }

    /* JADX INFO: renamed from: c1 */
    private void m13595c1() {
        act().duringCreated(FeedModule.f316d.m16635f8(this.f12283d)).subscribe(mkd0.H(new e30() { // from class: l.en60
            public final void call(Object obj) {
                this.f7434a.m13594V0((User) obj);
            }
        }, new e30() { // from class: l.fn60
            public final void call(Object obj) {
                this.f8168a.m13626W0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q0 */
    public static /* synthetic */ void m13608q0(Throwable th) {
    }

    /* JADX INFO: renamed from: y0 */
    private PhotoAlbumBaseFrag m13611y0() {
        if (this.f12281b == null) {
            this.f12281b = this.f12280a.mo3007Q0();
        }
        return this.f12281b;
    }

    /* JADX INFO: renamed from: z0 */
    private py60 m13612z0() {
        return m13611y0().f2912A;
    }

    /* JADX INFO: renamed from: A0 */
    public final sy60 m13613A0() {
        return m13611y0().f2915z;
    }

    /* JADX INFO: renamed from: C0 */
    public hx60 m13614C0() {
        m13613A0().m14390H();
        return new bm60(this.f12280a, "from_profile_opt".equals(this.f12284e), this.f12280a);
    }

    /* JADX INFO: renamed from: D0 */
    public void m13615D0() {
        this.f12284e = this.f12280a.getArguments().getString("from");
        this.f12283d = this.f12280a.getArguments().getString("user_id");
        this.f12285f = this.f12280a.getArguments().getInt("page_type", -1);
        this.f12286g = this.f12280a.getArguments().getInt("selected_item_position");
        this.f12287h = this.f12280a.getArguments().getString("target_moment_id");
        this.f12292m = this.f12280a.getArguments().getBoolean("start_home_card");
        if (nkg.m12227Y() && !this.f12288i) {
            duringCreated(FeedModule.m1140H().se(this.f12283d)).subscribe(mkd0.H(new e30() { // from class: l.bn60
                public final void call(Object obj) {
                    this.f6377a.m13591G0((List) obj);
                }
            }, new e30() { // from class: l.hn60
                public final void call(Object obj) {
                    this.f8778a.m13592H0((Throwable) obj);
                }
            }));
        }
        if (nkg.m12248k0()) {
            m13590E0();
            duringCreated(FeedModule.f316d.f15016z0).subscribe(mkd0.G(new e30() { // from class: l.in60
                public final void call(Object obj) {
                    this.f9103a.m13617I0((Boolean) obj);
                }
            }));
            duringCreated(FeedModule.f316d.f15005t1).subscribe(mkd0.G(new e30() { // from class: l.jn60
                public final void call(Object obj) {
                    this.f9455a.m13618J0((Boolean) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: F0 */
    public boolean m13616F0() {
        return this.f12288i;
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m13617I0(Boolean bool) {
        m13590E0();
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m13618J0(Boolean bool) {
        m13590E0();
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m13619L0(BubbleInfo bubbleInfo) {
        s7m s7mVar = ((jq2) this).viewModel;
        if (bubbleInfo == null) {
            ((po60) s7mVar).m13129U();
        } else {
            ((po60) s7mVar).m13151v0(bubbleInfo);
        }
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m13620N0(Throwable th) {
        ((po60) ((jq2) this).viewModel).m13129U();
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m13621O0(xaj0 xaj0Var) {
        this.f12291l = xaj0Var;
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m13622Q0(String str) {
        this.f12293n = true;
        m13595c1();
        User userM16628e8 = FeedModule.f316d.m16628e8(str);
        this.f12289j = userM16628e8;
        if (NullChecker.a(userM16628e8)) {
            ((po60) ((jq2) this).viewModel).m13150u0(this.f12289j);
        } else {
            m13595c1();
        }
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ void m13623R0(final String str, Boolean bool) {
        e51.H(act(), new Runnable() { // from class: l.gn60
            @Override // java.lang.Runnable
            public final void run() {
                this.f8484a.m13622Q0(str);
            }
        }, this.f12293n ? 1000L : 0L);
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m13624S0(ConversationStatus conversationStatus) {
        ((po60) ((jq2) this).viewModel).m13149t0(vqg.m15497U(conversationStatus));
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ void m13625U0(User user) {
        ((po60) ((jq2) this).viewModel).m13150u0(user);
    }

    /* JADX INFO: renamed from: W0 */
    public final /* synthetic */ void m13626W0(Throwable th) {
        User userM16628e8 = FeedModule.f316d.m16628e8(this.f12283d);
        this.f12289j = userM16628e8;
        ((po60) ((jq2) this).viewModel).m13150u0(userM16628e8);
    }

    /* JADX INFO: renamed from: X0 */
    public void m13627X0() {
        this.f12290k = true;
    }

    /* JADX INFO: renamed from: Y0 */
    public void m13628Y0(final String str) {
        if (!this.f12288i) {
            m13595c1();
            act().duringCreated(ovi.m12869b(this.f12283d)).subscribe(mkd0.G(new e30() { // from class: l.ln60
                public final void call(Object obj) {
                    this.f10075a.m13623R0(str, (Boolean) obj);
                }
            }));
            duringCreated(FeedModule.m1140H().ab(str)).subscribe(mkd0.G(new e30() { // from class: l.mn60
                public final void call(Object obj) {
                    this.f10519a.m13624S0((ConversationStatus) obj);
                }
            }));
        } else {
            ijb0.m10902M(str);
            User userM16628e8 = FeedModule.f316d.m16628e8(str);
            this.f12289j = userM16628e8;
            ((po60) ((jq2) this).viewModel).m13150u0(userM16628e8);
            act().duringCreated(ijb0.m10891B()).subscribe(mkd0.G(new e30() { // from class: l.kn60
                public final void call(Object obj) {
                    this.f9748a.m13625U0((User) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m13629a0() {
        super.a0();
        duringCreated(FeedModule.f316d.m16688mc("album")).subscribe(mkd0.H(new e30() { // from class: l.nn60
            public final void call(Object obj) {
                this.f10838a.m13621O0((xaj0) obj);
            }
        }, new e30() { // from class: l.on60
            public final void call(Object obj) {
                qn60.m13608q0((Throwable) obj);
            }
        }));
        if (!nkg.m12213K() || this.f12288i) {
            return;
        }
        duringCreated(FeedModule.f316d.f14951S0).subscribe(mkd0.G(new e30() { // from class: l.pn60
            public final void call(Object obj) {
                this.f11890a.m13593P0((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a1 */
    public void m13630a1() {
        this.f12288i = FeedModule.m1139F().userId().equals(this.f12283d);
        User userM16628e8 = FeedModule.f316d.m16628e8(this.f12283d);
        if (NullChecker.a(userM16628e8)) {
            ((po60) ((jq2) this).viewModel).m13150u0(userM16628e8);
        }
        m13628Y0(this.f12283d);
    }

    /* JADX INFO: renamed from: b1 */
    public void m13631b1() {
        if ((act() instanceof PhotoAlbumFeedAct) && "p_christmas_profile".equals(act().m5432Z1())) {
            p6j0.m12913c(MatchScData.ModuleId.mid_e_follow, "p_album", j760.a("owner_id", ((DbObject) this.f12289j).id), j760.a("album_from", "p_christmas_profile"), j760.a("receiver_user_id", ((DbObject) this.f12289j).id));
        } else {
            p6j0.m12913c(MatchScData.ModuleId.mid_e_follow, "p_album", j760.a("owner_id", ((DbObject) this.f12289j).id), j760.a("receiver_user_id", ((DbObject) this.f12289j).id));
        }
    }

    /* JADX INFO: renamed from: t0 */
    public void m13632t0(j760<User, Boolean> j760Var, boolean z) {
        m13612z0().m13331X0(j760Var, z);
        User userMo10741m = m13634x0().mo10741m(this.f12283d);
        act().invalidateOptionsMenu();
        ((po60) ((jq2) this).viewModel).m13150u0(userMo10741m);
    }

    /* JADX INFO: renamed from: u0 */
    public void m13633u0() {
        if (NullChecker.b(this.f12289j)) {
            Followship followship = this.f12289j.localFollowship;
            if (followship == null || TEnum.equals(followship.state, "default") || TEnum.equals(this.f12289j.localFollowship.state, FollowshipStatus.followed) || TEnum.equals(this.f12289j.localFollowship.state, FollowshipStatus.unfollow) || TEnum.equals(this.f12289j.localFollowship.state, "unknown_")) {
                m13631b1();
                if (this.f12289j.profile.moments.hidePublicMoments) {
                    lsi0.w(R$string.f590q);
                    return;
                } else {
                    FeedModule.f316d.m16634f7(FeedModule.m1139F().userId(), this.f12289j, true);
                    return;
                }
            }
            if (NullChecker.a(this.f12289j.localFollowship)) {
                if (TEnum.equals(this.f12289j.localFollowship.state, FollowshipStatus.following) || TEnum.equals(this.f12289j.localFollowship.state, "matched")) {
                    p6j0.m12913c("e_cancelfollow", "p_album", j760.a("owner_id", ((DbObject) this.f12289j).id), j760.a("receiver_user_id", ((DbObject) this.f12289j).id));
                    ((po60) ((jq2) this).viewModel).m13114G0(act().getResources().getString(R$string.f644z));
                }
            }
        }
    }

    @Override // p007l.vyp
    /* JADX INFO: renamed from: w1 */
    public boolean mo3015w1() {
        return this.f12290k;
    }

    /* JADX INFO: renamed from: x0 */
    public hx60 m13634x0() {
        if (this.f12282c == null) {
            this.f12282c = m13612z0().f12011b;
        }
        return this.f12282c;
    }

    public void destroy() {
    }
}
