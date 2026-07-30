package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Followship;
import com.p046p1.mobile.putong.data.FollowshipStatus;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.RelationshipStatus;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes12.dex */
public class swh {
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m186165b(User user, boolean z, e30 e30Var, Relationship relationship) {
        if (NullChecker.m81303a(user) && NullChecker.m81303a(user.localFollowship) && z) {
            if (TEnum.equals(user.localFollowship.state, "matched")) {
                Followship followshipNew_ = Followship.new_();
                followshipNew_.state = FollowshipStatus.get(FollowshipStatus.followed);
                user.localFollowship = followshipNew_;
            } else if (TEnum.equals(user.localFollowship.state, FollowshipStatus.following)) {
                Followship followshipNew_2 = Followship.new_();
                followshipNew_2.state = FollowshipStatus.get("default");
                user.localFollowship = followshipNew_2;
            }
            FeedModule.f38855d.m209298Ic(user, false);
        }
        ijb0.m136545I();
        FeedModule.f38855d.m209312Kc(relationship, user, false, false);
        if (NullChecker.m81303a(e30Var)) {
            e30Var.call(relationship);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m186166c(boolean z, Followship followship) {
        if (z) {
            return;
        }
        lsi0.m151593w(R$string.f38934M0);
    }

    /* JADX INFO: renamed from: e */
    public static void m186168e(Act act, final User user, final String str, final boolean z) {
        if (user == null) {
            return;
        }
        boolean zM199527U = vqg.m199527U(FeedModule.m60222H().mo30741Zj(user.f56011id));
        boolean zMo30792m8 = FeedModule.m60222H().mo30792m8(user.f56011id);
        if (User.isMatched(user) && zM199527U && !zMo30792m8) {
            FeedModule.m60222H().mo30727Sr(act, user.f56011id, str, true);
        } else {
            v1h.m196628v0(act, FeedModule.f38852a.getResources().getString(R$string.f39183z), new d30() { // from class: l.owh
                @Override // p149l.d30
                public final void call() {
                    FeedModule.f38855d.m209502m7(FeedModule.m60221F().userId(), user, false, str).subscribe(mkd0.m154956H(new e30() { // from class: l.pwh
                        @Override // p149l.e30
                        public final void call(Object obj) {
                            swh.m186166c(z, (Followship) obj);
                        }
                    }, new qwh()));
                }
            });
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m186169f(final Act act, final User user, String str, final e30<Relationship> e30Var) {
        if (user == null) {
            return;
        }
        final boolean z = User.isMatched(user) && vqg.m199527U(FeedModule.m60222H().mo30741Zj(user.f56011id)) && !FeedModule.m60222H().mo30792m8(user.f56011id);
        final boolean zM186171h = m186171h(user);
        if (z) {
            FeedModule.m60222H().mo30727Sr(act, user.f56011id, str, true);
        } else {
            v1h.m196628v0(act, "确定取消喜欢吗？", new d30() { // from class: l.nwh
                @Override // p149l.d30
                public final void call() {
                    boolean z2 = z;
                    Act act2 = act;
                    User user2 = user;
                    FeedModule.m60222H().mo30720Q7(z2, act2, user2, new e30() { // from class: l.rwh
                        @Override // p149l.e30
                        public final void call(Object obj) {
                            swh.m186165b(user2, z, e30Var, (Relationship) obj);
                        }
                    }, new qwh());
                }
            });
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m186170g(User user) {
        return NullChecker.m81303a(user.localFollowship) && TEnum.equals(user.localFollowship.state, "matched");
    }

    /* JADX INFO: renamed from: h */
    public static boolean m186171h(User user) {
        if (m186170g(user)) {
            return true;
        }
        return NullChecker.m81303a(user.localFollowship) && TEnum.equals(user.localFollowship.state, FollowshipStatus.following);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m186172i(User user) {
        if (NullChecker.m81303a(user)) {
            return m186175l(user) || m186170g(user);
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m186173j(User user) {
        Relationship relationship = user.localRelationship;
        if (relationship == null || TEnum.equals(relationship.state, "unknown_") || TEnum.equals(user.localRelationship.state, "default")) {
            return true;
        }
        return (TEnum.equals(user.localRelationship.state, "liked") && NullChecker.m81303a(user.localRelationship.relationshipExtensions) && TEnum.equals(user.localRelationship.relationshipExtensions.relationType, RelationshipStatus.DEFAULT)) || TEnum.equals(user.localRelationship.state, RelationshipStatus.disliked);
    }

    /* JADX INFO: renamed from: k */
    public static boolean m186174k(User user) {
        return NullChecker.m81303a(user) && user.superLikedMe();
    }

    /* JADX INFO: renamed from: l */
    public static boolean m186175l(User user) {
        if (user == null) {
            return false;
        }
        return !m186173j(user) || User.isRelationshipMatched(user);
    }
}
