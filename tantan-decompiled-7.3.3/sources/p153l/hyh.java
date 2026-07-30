package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Followship;
import com.p051p1.mobile.putong.data.FollowshipStatus;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.RelationshipStatus;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes13.dex */
public class hyh {
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m137725b(User user, boolean z, y20 y20Var, Relationship relationship) {
        if (NullChecker.m82486a(user) && NullChecker.m82486a(user.localFollowship) && z) {
            if (TEnum.equals(user.localFollowship.state, "matched")) {
                Followship followshipNew_ = Followship.new_();
                followshipNew_.state = FollowshipStatus.get(FollowshipStatus.followed);
                user.localFollowship = followshipNew_;
            } else if (TEnum.equals(user.localFollowship.state, FollowshipStatus.following)) {
                Followship followshipNew_2 = Followship.new_();
                followshipNew_2.state = FollowshipStatus.get("default");
                user.localFollowship = followshipNew_2;
            }
            FeedModule.f39703d.m145539Ic(user, false);
        }
        mrb0.m159631I();
        FeedModule.f39703d.m145553Kc(relationship, user, false, false);
        if (NullChecker.m82486a(y20Var)) {
            y20Var.call(relationship);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m137726c(boolean z, Followship followship) {
        if (z) {
            return;
        }
        o1j0.m165649w(R$string.f39782M0);
    }

    /* JADX INFO: renamed from: e */
    public static void m137728e(Act act, final User user, final String str, final boolean z) {
        if (user == null) {
            return;
        }
        boolean zM151186U = ksg.m151186U(FeedModule.m61406H().mo31744Zj(user.f56859id));
        boolean zMo31795m8 = FeedModule.m61406H().mo31795m8(user.f56859id);
        if (User.isMatched(user) && zM151186U && !zMo31795m8) {
            FeedModule.m61406H().mo31730Sr(act, user.f56859id, str, true);
        } else {
            k3h.m148105v0(act, FeedModule.f39700a.getResources().getString(R$string.f40031z), new x20() { // from class: l.dyh
                @Override // p153l.x20
                public final void call() {
                    FeedModule.f39703d.m145743m7(FeedModule.m61405F().userId(), user, false, str).subscribe(psd0.m173597H(new y20() { // from class: l.eyh
                        @Override // p153l.y20
                        public final void call(Object obj) {
                            hyh.m137726c(z, (Followship) obj);
                        }
                    }, new fyh()));
                }
            });
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m137729f(final Act act, final User user, String str, final y20<Relationship> y20Var) {
        if (user == null) {
            return;
        }
        final boolean z = User.isMatched(user) && ksg.m151186U(FeedModule.m61406H().mo31744Zj(user.f56859id)) && !FeedModule.m61406H().mo31795m8(user.f56859id);
        final boolean zM137731h = m137731h(user);
        if (z) {
            FeedModule.m61406H().mo31730Sr(act, user.f56859id, str, true);
        } else {
            k3h.m148105v0(act, "确定取消喜欢吗？", new x20() { // from class: l.cyh
                @Override // p153l.x20
                public final void call() {
                    boolean z2 = z;
                    Act act2 = act;
                    User user2 = user;
                    FeedModule.m61406H().mo31723Q7(z2, act2, user2, new y20() { // from class: l.gyh
                        @Override // p153l.y20
                        public final void call(Object obj) {
                            hyh.m137725b(user2, z, y20Var, (Relationship) obj);
                        }
                    }, new fyh());
                }
            });
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m137730g(User user) {
        return NullChecker.m82486a(user.localFollowship) && TEnum.equals(user.localFollowship.state, "matched");
    }

    /* JADX INFO: renamed from: h */
    public static boolean m137731h(User user) {
        if (m137730g(user)) {
            return true;
        }
        return NullChecker.m82486a(user.localFollowship) && TEnum.equals(user.localFollowship.state, FollowshipStatus.following);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m137732i(User user) {
        if (NullChecker.m82486a(user)) {
            return m137735l(user) || m137730g(user);
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m137733j(User user) {
        Relationship relationship = user.localRelationship;
        if (relationship == null || TEnum.equals(relationship.state, "unknown_") || TEnum.equals(user.localRelationship.state, "default")) {
            return true;
        }
        return (TEnum.equals(user.localRelationship.state, "liked") && NullChecker.m82486a(user.localRelationship.relationshipExtensions) && TEnum.equals(user.localRelationship.relationshipExtensions.relationType, RelationshipStatus.DEFAULT)) || TEnum.equals(user.localRelationship.state, RelationshipStatus.disliked);
    }

    /* JADX INFO: renamed from: k */
    public static boolean m137734k(User user) {
        return NullChecker.m82486a(user) && user.superLikedMe();
    }

    /* JADX INFO: renamed from: l */
    public static boolean m137735l(User user) {
        if (user == null) {
            return false;
        }
        return !m137733j(user) || User.isRelationshipMatched(user);
    }
}
