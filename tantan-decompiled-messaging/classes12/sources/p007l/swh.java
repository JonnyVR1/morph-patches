package p007l;

import com.p000p1.mobile.putong.data.Followship;
import com.p000p1.mobile.putong.data.FollowshipStatus;
import com.p000p1.mobile.putong.data.Relationship;
import com.p000p1.mobile.putong.data.RelationshipStatus;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.e30;
import l.lsi0;
import l.mkd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class swh {
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m14334b(User user, boolean z, e30 e30Var, Relationship relationship) {
        if (NullChecker.a(user) && NullChecker.a(user.localFollowship) && z) {
            if (TEnum.equals(user.localFollowship.state, "matched")) {
                Followship followshipNew_ = Followship.new_();
                followshipNew_.state = FollowshipStatus.get(FollowshipStatus.followed);
                user.localFollowship = followshipNew_;
            } else if (TEnum.equals(user.localFollowship.state, FollowshipStatus.following)) {
                Followship followshipNew_2 = Followship.new_();
                followshipNew_2.state = FollowshipStatus.get("default");
                user.localFollowship = followshipNew_2;
            }
            FeedModule.f316d.m16479Ic(user, false);
        }
        ijb0.m10898I();
        FeedModule.f316d.m16493Kc(relationship, user, false, false);
        if (NullChecker.a(e30Var)) {
            e30Var.call(relationship);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m14335c(boolean z, Followship followship) {
        if (z) {
            return;
        }
        lsi0.w(R$string.f395M0);
    }

    /* JADX INFO: renamed from: e */
    public static void m14337e(Act act, final User user, final String str, final boolean z) {
        if (user == null) {
            return;
        }
        boolean zM15497U = vqg.m15497U(FeedModule.m1140H().Zj(((DbObject) user).id));
        boolean zM8 = FeedModule.m1140H().m8(((DbObject) user).id);
        if (User.isMatched(user) && zM15497U && !zM8) {
            FeedModule.m1140H().Sr(act, ((DbObject) user).id, str, true);
        } else {
            v1h.m15267v0(act, FeedModule.f313a.getResources().getString(R$string.f644z), new d30() { // from class: l.owh
                public final void call() {
                    FeedModule.f316d.m16683m7(FeedModule.m1139F().userId(), user, false, str).subscribe(mkd0.H(new e30() { // from class: l.pwh
                        public final void call(Object obj) {
                            swh.m14335c(z, (Followship) obj);
                        }
                    }, new qwh()));
                }
            });
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m14338f(final Act act, final User user, String str, final e30<Relationship> e30Var) {
        if (user == null) {
            return;
        }
        final boolean z = User.isMatched(user) && vqg.m15497U(FeedModule.m1140H().Zj(((DbObject) user).id)) && !FeedModule.m1140H().m8(((DbObject) user).id);
        final boolean zM14340h = m14340h(user);
        if (z) {
            FeedModule.m1140H().Sr(act, ((DbObject) user).id, str, true);
        } else {
            v1h.m15267v0(act, "确定取消喜欢吗？", new d30() { // from class: l.nwh
                public final void call() {
                    boolean z2 = z;
                    Act act2 = act;
                    User user2 = user;
                    FeedModule.m1140H().Q7(z2, act2, user2, new e30() { // from class: l.rwh
                        public final void call(Object obj) {
                            swh.m14334b(user2, z, e30Var, (Relationship) obj);
                        }
                    }, new qwh());
                }
            });
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m14339g(User user) {
        return NullChecker.a(user.localFollowship) && TEnum.equals(user.localFollowship.state, "matched");
    }

    /* JADX INFO: renamed from: h */
    public static boolean m14340h(User user) {
        if (m14339g(user)) {
            return true;
        }
        return NullChecker.a(user.localFollowship) && TEnum.equals(user.localFollowship.state, FollowshipStatus.following);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m14341i(User user) {
        if (NullChecker.a(user)) {
            return m14344l(user) || m14339g(user);
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m14342j(User user) {
        Relationship relationship = user.localRelationship;
        if (relationship == null || TEnum.equals(relationship.state, "unknown_") || TEnum.equals(user.localRelationship.state, "default")) {
            return true;
        }
        return (TEnum.equals(user.localRelationship.state, "liked") && NullChecker.a(user.localRelationship.relationshipExtensions) && TEnum.equals(user.localRelationship.relationshipExtensions.relationType, RelationshipStatus.DEFAULT)) || TEnum.equals(user.localRelationship.state, RelationshipStatus.disliked);
    }

    /* JADX INFO: renamed from: k */
    public static boolean m14343k(User user) {
        return NullChecker.a(user) && user.superLikedMe();
    }

    /* JADX INFO: renamed from: l */
    public static boolean m14344l(User user) {
        if (user == null) {
            return false;
        }
        return !m14342j(user) || User.isRelationshipMatched(user);
    }
}
