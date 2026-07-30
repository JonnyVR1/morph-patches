package p002l;

import android.text.TextUtils;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.api.api.Network;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.api.j;
import com.p1.mobile.putong.core.data.Greeting;
import com.p1.mobile.putong.core.data.GreetingHotLevelInfo;
import com.p1.mobile.putong.core.data.GreetingPermission;
import com.p1.mobile.putong.core.data.HotLevel;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.MessageReference;
import com.p1.mobile.putong.core.data.MessageType;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.data.Channel;
import com.p1.mobile.putong.data.Counter;
import com.p1.mobile.putong.data.CounterLikeLimit;
import com.p1.mobile.putong.data.CounterSuperlikeAndUndoLimit;
import com.p1.mobile.putong.data.LikeExtraData;
import com.p1.mobile.putong.data.LikeFrom;
import com.p1.mobile.putong.data.MatchFrom;
import com.p1.mobile.putong.data.Relationship;
import com.p1.mobile.putong.data.RelationshipStatus;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import l.d30;
import l.e30;
import l.e51;
import l.j760;
import l.jo0;
import l.lsi0;
import l.mb90;
import l.mkd0;
import l.osi0;
import l.q860;
import l.sja;
import l.vwb;
import l.w9j;
import l.wwb;
import l.x19;
import l.xma;
import rx.c;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class yz9 {
    /* JADX INFO: renamed from: A */
    public static void m26983A(Act act, User user, boolean z, String str, LikeFrom likeFrom, e30<Relationship> e30Var, e30<Throwable> e30Var2, boolean z2, boolean... zArr) {
        m26984B(act, user, false, z, str, likeFrom, e30Var, e30Var2, null, null, z2, zArr);
    }

    /* JADX INFO: renamed from: B */
    public static void m26984B(final Act act, final User user, boolean z, final boolean z2, final String str, final LikeFrom likeFrom, final e30<Relationship> e30Var, final e30<Throwable> e30Var2, final String str2, String str3, final boolean z3, final boolean... zArr) {
        String str4 = TextUtils.isEmpty(str3) ? "p_suggest_users_home_view,e_superlike,click" : str3;
        if (!Network.isConnected(CoreModule.b)) {
            lsi0.n(R.string.B2);
            return;
        }
        if (CoreModule.N().so() && z) {
            Counter counterO3 = CoreModule.c.o3();
            CounterSuperlikeAndUndoLimit counterSuperlikeAndUndoLimit = counterO3 == null ? null : counterO3.superLikeLimit;
            User userP9 = CoreModule.c.e0.p9();
            if (userP9.isJailed()) {
                CoreModule.K().startJailedDialogLikeAct();
                return;
            }
            if (userP9.isNameFake()) {
                CoreModule.P().i().A(act);
                return;
            }
            if (!mb90.c(userP9, PurchaseType.TYPE_SUPERLIKE_PKG) && NullChecker.a(counterSuperlikeAndUndoLimit) && CoreModule.P().i().A3(counterSuperlikeAndUndoLimit.remainToday()) == 0) {
                CoreModule.P().i().L6(act, str4, Privilege.vip_super_like, user);
                return;
            } else {
                if (CoreModule.P().i().U5(act, new d30() { // from class: l.iz9
                    public final void call() {
                        yz9.m27003r(false, false, act, user, true, z2, str, likeFrom, e30Var, e30Var2, str2, z3, zArr);
                    }
                })) {
                    return;
                }
                if (NullChecker.a(counterSuperlikeAndUndoLimit) && CoreModule.P().i().A3(counterSuperlikeAndUndoLimit.remainToday()) == 0) {
                    CoreModule.P().i().Uh(act, str4);
                    return;
                }
            }
        }
        m27003r(false, false, act, user, z, z2, str, likeFrom, e30Var, e30Var2, str2, z3, zArr);
    }

    /* JADX INFO: renamed from: C */
    public static boolean m26985C() {
        User userP9 = CoreModule.c.e0.p9();
        Counter counterO3 = CoreModule.c.o3();
        CounterLikeLimit counterLikeLimit = counterO3 == null ? null : counterO3.likeLimit;
        return counterLikeLimit != null && counterLikeLimit.remaining == 0 && counterLikeLimit.resetNowMillis() > 0 && !mb90.c(userP9, PurchaseType.TYPE_LIKENOLIMIT_PKG);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m26987b(boolean z, Relationship relationship, User user, boolean z2) {
        if (z) {
            return;
        }
        CoreModule.N().processMomentLikeStatusChanged(relationship, user, true, z2);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m26990e(e30 e30Var, String str, Channel channel, Throwable th) {
        e30Var.call(Boolean.FALSE);
        if (th instanceof TantanException.Client.CoreService) {
            int i = ((TantanException.Client.CoreService) th).code;
            if (i == 40042 || i == 40044 || i == 40045) {
                lsi0.y("对方账号异常");
                return;
            } else {
                if (i == 40046) {
                    CoreModule.c.f0.ap(str);
                    return;
                }
                return;
            }
        }
        if (th instanceof TantanException.Client.TantanForbidden) {
            TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
            if (!x19.e(tantanForbidden)) {
                if (x19.d(tantanForbidden)) {
                    lsi0.y(tantanForbidden.message);
                    return;
                }
                return;
            }
            if (!TEnum.equals(channel, "reply_thanks") && !TEnum.equals(channel, "red_flower")) {
                lsi0.y("对方同意配对后可发送消息，请耐心等待");
                return;
            }
            User userById = CoreModule.N().getUserById(str);
            String str2 = userById == null ? null : userById.name;
            String str3 = TEnum.equals(channel, "red_flower") ? "小红花" : "礼貌回谢";
            if (TextUtils.isEmpty(str2)) {
                lsi0.y("你已发送过".concat(str3));
                return;
            }
            lsi0.y("你已向" + str2 + "发送过" + str3);
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m26992g(e30 e30Var, Throwable th) {
        if (NullChecker.a(e30Var)) {
            e30Var.call(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m26993h(e30 e30Var, Message message) {
        e30Var.call(Boolean.TRUE);
        CoreModule.c.r0.J6();
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m26994i(e30 e30Var, Act act, String str, GreetingHotLevelInfo greetingHotLevelInfo) {
        GreetingPermission greetingPermission = !wwb.a(greetingHotLevelInfo.greetingPermissions) ? (GreetingPermission) greetingHotLevelInfo.greetingPermissions.get(0) : null;
        if (NullChecker.a(greetingPermission) && !greetingPermission.enable) {
            if (NullChecker.a(e30Var)) {
                e30Var.call(Boolean.FALSE);
                return;
            }
            return;
        }
        if (NullChecker.a(wwb.a(greetingHotLevelInfo.greetings) ? null : (Greeting) greetingHotLevelInfo.greetings.get(0))) {
            m27009x(act, str, e30Var);
            return;
        }
        if (wwb.a(greetingHotLevelInfo.hotLevels)) {
            if (NullChecker.a(e30Var)) {
                e30Var.call(Boolean.FALSE);
                return;
            }
            return;
        }
        HotLevel hotLevel = (HotLevel) greetingHotLevelInfo.hotLevels.get(0);
        if (NullChecker.a(hotLevel)) {
            if (hotLevel.level <= 0) {
                m27009x(act, str, e30Var);
            } else if (NullChecker.a(e30Var)) {
                e30Var.call(Boolean.FALSE);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m26995j(String str, Relationship relationship) {
        if (TextUtils.isEmpty(str) || xma.G3() || sja.r3() <= 0) {
            return;
        }
        CoreModule.c.m0.d9();
        CoreModule.c.C0.u4();
        CoreModule.c.k1.A3();
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m26999n(boolean[] zArr, final boolean z, final User user, Act act, final boolean z2, e30 e30Var, String str, String str2, final Relationship relationship) {
        CoreModule.N().kq(relationship);
        if (zArr.length == 0) {
            if (z) {
                osi0.g("超级喜欢已发送");
            } else {
                osi0.g("喜欢成功，" + ((NullChecker.a(user) && user.isFemale()) ? "她" : "他") + "的动态更新将会出现在「喜欢的人」");
            }
        }
        if (TEnum.equals(relationship.state, "liked")) {
            CoreSuggested coreSuggested = CoreModule.c.m0;
            coreSuggested.y0++;
            coreSuggested.z0++;
        } else if (TEnum.equals(relationship.state, "matched")) {
            CoreSuggested coreSuggested2 = CoreModule.c.m0;
            coreSuggested2.y0 = 0;
            coreSuggested2.z0 = 0;
            m27008w(act, user, z, relationship);
        }
        if (z) {
            relationship.status.add(MatchFrom.get("superLiked"));
            relationship.state = RelationshipStatus.get("superliked");
            user.localRelationship = relationship;
            CoreModule.K().refreshUser(((DbObject) user).id);
        }
        e51.F(act, new Runnable() { // from class: l.vz9
            @Override // java.lang.Runnable
            public final void run() {
                yz9.m26987b(z2, relationship, user, z);
            }
        });
        if (NullChecker.a(e30Var)) {
            e30Var.call(relationship);
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        CoreModule.c.r0.h0.onNext(j760.a(((DbObject) user).id, relationship.state));
        if (NullChecker.a(str2)) {
            CoreModule.c.f0.ap(str2);
        }
        CoreModule.c.k1.I3(((DbObject) user).id);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m27000o(e30 e30Var, Throwable th) {
        if (NullChecker.a(e30Var)) {
            e30Var.call(th);
        }
        th.getMessage();
    }

    /* JADX INFO: renamed from: p */
    public static void m27001p(boolean z, Act act, User user, e30<Relationship> e30Var, e30<Throwable> e30Var2) {
        m27003r(true, z, act, user, false, false, null, null, e30Var, e30Var2, null, false, false);
    }

    /* JADX INFO: renamed from: q */
    public static void m27002q(List<Message> list, e30<Boolean> e30Var) {
        if (vwb.J(list)) {
            e30Var.call(Boolean.TRUE);
        } else {
            e30Var.call(Boolean.valueOf(vwb.J(vwb.n(list, new w9j() { // from class: l.oz9
                public final Object call(Object obj) {
                    Message message = (Message) obj;
                    return Boolean.valueOf(message.isMe() && !message.isLocal() && (TEnum.equals(message.messageType, "text") || TEnum.equals(message.messageType, "state_like")));
                }
            }))));
        }
    }

    /* JADX INFO: renamed from: r */
    public static void m27003r(final boolean z, boolean z2, final Act act, final User user, final boolean z3, boolean z4, final String str, LikeFrom likeFrom, final e30<Relationship> e30Var, final e30<Throwable> e30Var2, String str2, boolean z5, final boolean... zArr) {
        LikeFrom likeFrom2;
        if (z3 || !m27005t(user) || z) {
            if (z3) {
                likeFrom2 = likeFrom;
            } else {
                likeFrom2 = likeFrom;
                if (TEnum.equals(likeFrom2, "moment") && m26985C()) {
                    CoreModule.P().a().L6(act, "p_home,likelimit", Privilege.vip_unlimited_likes, user);
                    return;
                }
            }
            if (!z4 && !z) {
                j jVar = CoreModule.c.r0;
                String str3 = ((DbObject) user).id;
                jVar.k0 = str3;
                jVar.i0.onNext(str3);
            }
            final String strT3 = CoreModule.c.k1.t3(((DbObject) user).id);
            act.duringCreated(CoreModule.c.m0.b8(z, z2, true, z3, (Map) null, user, (String) null, likeFrom2, true, (LikeExtraData) null, 0, strT3, z4, 1, str2, z5)).doOnNext(new e30() { // from class: l.pz9
                public final void call(Object obj) {
                    yz9.m26995j(strT3, (Relationship) obj);
                }
            }).subscribe(mkd0.H(new e30() { // from class: l.qz9
                public final void call(Object obj) {
                    yz9.m26999n(zArr, z3, user, act, z, e30Var, strT3, str, (Relationship) obj);
                }
            }, new e30() { // from class: l.rz9
                public final void call(Object obj) {
                    yz9.m27000o(e30Var2, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: s */
    public static List<Message> m27004s(List<Message> list) {
        return (vwb.J(list) || !vwb.m(list, new w9j() { // from class: l.nz9
            public final Object call(Object obj) {
                Message message = (Message) obj;
                return Boolean.valueOf(NullChecker.a(message) && !((DbObject) message).id.startsWith("fake_id_"));
            }
        })) ? new ArrayList() : list;
    }

    /* JADX INFO: renamed from: t */
    public static boolean m27005t(User user) {
        if (user == null || user.localRelationship == null) {
            return false;
        }
        return !m27007v(user);
    }

    /* JADX INFO: renamed from: u */
    public static void m27006u(final Act act, final String str, final e30<Boolean> e30Var) {
        act.duringCreated(CoreModule.c.r0.p5(str, false)).filter(new w9j() { // from class: l.sz9
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.a((GreetingHotLevelInfo) obj));
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.tz9
            public final void call(Object obj) {
                yz9.m26994i(e30Var, act, str, (GreetingHotLevelInfo) obj);
            }
        }, new e30() { // from class: l.uz9
            public final void call(Object obj) {
                yz9.m26992g(e30Var, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: v */
    public static boolean m27007v(User user) {
        Relationship relationship = user.localRelationship;
        if (relationship == null || TEnum.equals(relationship.state, "unknown_") || TEnum.equals(user.localRelationship.state, "default")) {
            return true;
        }
        return (TEnum.equals(user.localRelationship.state, "liked") && NullChecker.a(user.localRelationship.relationshipExtensions) && TEnum.equals(user.localRelationship.relationshipExtensions.relationType, "DEFAULT")) || TEnum.equals(user.localRelationship.state, "disliked");
    }

    /* JADX INFO: renamed from: w */
    public static void m27008w(Act act, User user, boolean z, Relationship relationship) {
        if (!TEnum.equals(relationship.state, "matched") || relationship.status.contains(MatchFrom.get("xmasActivity"))) {
            return;
        }
        if (relationship.status.size() == 0 || !TEnum.equals((MatchFrom) relationship.status.get(0), "superLikedEach")) {
            if ((relationship.status.size() == 0 || !TEnum.equals((MatchFrom) relationship.status.get(0), "superLiked")) && relationship.status.size() != 0) {
                TEnum.equals((MatchFrom) relationship.status.get(0), "secretcrush");
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public static void m27009x(Act act, final String str, final e30<Boolean> e30Var) {
        act.duringCreated(c.just(0).observeOn(Schedulers.io()).map(new w9j() { // from class: l.kz9
            public final Object call(Object obj) {
                return CoreModule.k.c.O(str, "").j();
            }
        }).flatMap(new w9j() { // from class: l.lz9
            public final Object call(Object obj) {
                List list = (List) obj;
                return CoreModule.c.r0.A5(str, vwb.J(list) ? 0.0d : ((Message) list.get(0)).createdTime, 0L, false, false);
            }
        }).observeOn(jo0.a())).take(1).subscribe(mkd0.G(new e30() { // from class: l.mz9
            public final void call(Object obj) {
                yz9.m27002q(yz9.m27004s(((q860) obj).a), e30Var);
            }
        }));
    }

    /* JADX INFO: renamed from: y */
    public static void m27010y(Act act, String str, final String str2, String str3, String str4, final Channel channel, final e30<Boolean> e30Var) {
        String str5;
        Message messageNew_ = Message.new_();
        if (TextUtils.isEmpty(str3)) {
            messageNew_.messageType = MessageType.get("text");
        } else {
            messageNew_.messageType = MessageType.get("moment_reference");
        }
        messageNew_.value = str;
        MessageReference messageReferenceNew_ = MessageReference.new_();
        messageReferenceNew_.type = "moment";
        messageReferenceNew_.id = str3;
        messageNew_.api_only_reference = messageReferenceNew_;
        if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
            str5 = null;
        } else {
            str5 = "?source=moment&moment_id=" + str3 + "&moment_owner_id=" + str4;
        }
        act.duringCreated(CoreModule.c.r0.u6(str2, channel, messageNew_, str5, new d30() { // from class: l.wz9
            public final void call() {
                CoreModule.N().Zk(str2);
            }
        })).take(1).subscribe(mkd0.H(new e30() { // from class: l.xz9
            public final void call(Object obj) {
                yz9.m26993h(e30Var, (Message) obj);
            }
        }, new e30() { // from class: l.jz9
            public final void call(Object obj) {
                yz9.m26990e(e30Var, str2, channel, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: z */
    public static void m27011z(Act act, User user, boolean z, String str, LikeFrom likeFrom, e30<Relationship> e30Var, e30<Throwable> e30Var2, String str2, boolean... zArr) {
        m26984B(act, user, false, z, str, likeFrom, e30Var, e30Var2, str2, null, false, zArr);
    }
}
