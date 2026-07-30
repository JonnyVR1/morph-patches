package p153l;

import android.text.TextUtils;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4895j;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.GreetingHotLevelInfo;
import com.p051p1.mobile.putong.core.data.GreetingPermission;
import com.p051p1.mobile.putong.core.data.HotLevel;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageReference;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.data.Channel;
import com.p051p1.mobile.putong.data.Counter;
import com.p051p1.mobile.putong.data.CounterLikeLimit;
import com.p051p1.mobile.putong.data.CounterSuperlikeAndUndoLimit;
import com.p051p1.mobile.putong.data.LikeFrom;
import com.p051p1.mobile.putong.data.MatchFrom;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.RelationshipStatus;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p137rx.C22421c;
import p137rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes4.dex */
public class j1a {
    /* JADX INFO: renamed from: A */
    public static void m143081A(Act act, User user, boolean z, String str, LikeFrom likeFrom, y20<Relationship> y20Var, y20<Throwable> y20Var2, boolean z2, boolean... zArr) {
        m143082B(act, user, false, z, str, likeFrom, y20Var, y20Var2, null, null, z2, zArr);
    }

    /* JADX INFO: renamed from: B */
    public static void m143082B(final Act act, final User user, boolean z, final boolean z2, final String str, final LikeFrom likeFrom, final y20<Relationship> y20Var, final y20<Throwable> y20Var2, final String str2, String str3, final boolean z3, final boolean... zArr) {
        String str4 = TextUtils.isEmpty(str3) ? "p_suggest_users_home_view,e_superlike,click" : str3;
        if (!Network.isConnected(CoreModule.f18263b)) {
            o1j0.m165640n(R$string.f21461B2);
            return;
        }
        if (CoreModule.m30932N().mo61573so() && z) {
            Counter counterM32487o3 = CoreModule.f18264c.m32487o3();
            CounterSuperlikeAndUndoLimit counterSuperlikeAndUndoLimit = counterM32487o3 == null ? null : counterM32487o3.superLikeLimit;
            User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
            if (userM116600p9.isJailed()) {
                CoreModule.m30930K().startJailedDialogLikeAct();
                return;
            }
            if (userM116600p9.isNameFake()) {
                CoreModule.m30933P().m143412i().mo180291A(act);
                return;
            }
            if (!qj90.m176831c(userM116600p9, PurchaseType.TYPE_SUPERLIKE_PKG) && NullChecker.m82486a(counterSuperlikeAndUndoLimit) && CoreModule.m30933P().m143412i().mo180294A3(counterSuperlikeAndUndoLimit.remainToday()) == 0) {
                CoreModule.m30933P().m143412i().mo34359L6(act, str4, Privilege.vip_super_like, user);
                return;
            } else {
                if (CoreModule.m30933P().m143412i().mo180407U5(act, new x20() { // from class: l.t0a
                    @Override // p153l.x20
                    public final void call() {
                        j1a.m143101r(false, false, act, user, true, z2, str, likeFrom, y20Var, y20Var2, str2, z3, zArr);
                    }
                })) {
                    return;
                }
                if (NullChecker.m82486a(counterSuperlikeAndUndoLimit) && CoreModule.m30933P().m143412i().mo180294A3(counterSuperlikeAndUndoLimit.remainToday()) == 0) {
                    CoreModule.m30933P().m143412i().mo34432Uh(act, str4);
                    return;
                }
            }
        }
        m143101r(false, false, act, user, z, z2, str, likeFrom, y20Var, y20Var2, str2, z3, zArr);
    }

    /* JADX INFO: renamed from: C */
    public static boolean m143083C() {
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        Counter counterM32487o3 = CoreModule.f18264c.m32487o3();
        CounterLikeLimit counterLikeLimit = counterM32487o3 == null ? null : counterM32487o3.likeLimit;
        return counterLikeLimit != null && counterLikeLimit.remaining == 0 && counterLikeLimit.resetNowMillis() > 0 && !qj90.m176831c(userM116600p9, PurchaseType.TYPE_LIKENOLIMIT_PKG);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m143085b(boolean z, Relationship relationship, User user, boolean z2) {
        if (z) {
            return;
        }
        CoreModule.m30932N().processMomentLikeStatusChanged(relationship, user, true, z2);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m143088e(y20 y20Var, String str, Channel channel, Throwable th) {
        y20Var.call(Boolean.FALSE);
        if (th instanceof TantanException.Client.CoreService) {
            int i = ((TantanException.Client.CoreService) th).code;
            if (i == 40042 || i == 40044 || i == 40045) {
                o1j0.m165651y("对方账号异常");
                return;
            } else {
                if (i == 40046) {
                    CoreModule.f18264c.f20384f0.m33905ap(str);
                    return;
                }
                return;
            }
        }
        if (th instanceof TantanException.Client.TantanForbidden) {
            TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
            if (!g39.m128719e(tantanForbidden)) {
                if (g39.m128718d(tantanForbidden)) {
                    o1j0.m165651y(tantanForbidden.message);
                    return;
                }
                return;
            }
            if (!TEnum.equals(channel, Channel.reply_thanks) && !TEnum.equals(channel, Channel.red_flower)) {
                o1j0.m165651y("对方同意配对后可发送消息，请耐心等待");
                return;
            }
            User userById = CoreModule.m30932N().getUserById(str);
            String str2 = userById == null ? null : userById.name;
            String str3 = TEnum.equals(channel, Channel.red_flower) ? "小红花" : "礼貌回谢";
            if (TextUtils.isEmpty(str2)) {
                o1j0.m165651y("你已发送过".concat(str3));
                return;
            }
            o1j0.m165651y("你已向" + str2 + "发送过" + str3);
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m143090g(y20 y20Var, Throwable th) {
        if (NullChecker.m82486a(y20Var)) {
            y20Var.call(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m143091h(y20 y20Var, Message message) {
        y20Var.call(Boolean.TRUE);
        CoreModule.f18264c.f20420r0.m35095J6();
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m143092i(y20 y20Var, Act act, String str, GreetingHotLevelInfo greetingHotLevelInfo) {
        GreetingPermission greetingPermission = !kyb.m151952a(greetingHotLevelInfo.greetingPermissions) ? greetingHotLevelInfo.greetingPermissions.get(0) : null;
        if (NullChecker.m82486a(greetingPermission) && !greetingPermission.enable) {
            if (NullChecker.m82486a(y20Var)) {
                y20Var.call(Boolean.FALSE);
                return;
            }
            return;
        }
        if (NullChecker.m82486a(kyb.m151952a(greetingHotLevelInfo.greetings) ? null : greetingHotLevelInfo.greetings.get(0))) {
            m143107x(act, str, y20Var);
            return;
        }
        if (kyb.m151952a(greetingHotLevelInfo.hotLevels)) {
            if (NullChecker.m82486a(y20Var)) {
                y20Var.call(Boolean.FALSE);
                return;
            }
            return;
        }
        HotLevel hotLevel = greetingHotLevelInfo.hotLevels.get(0);
        if (NullChecker.m82486a(hotLevel)) {
            if (hotLevel.level <= 0) {
                m143107x(act, str, y20Var);
            } else if (NullChecker.m82486a(y20Var)) {
                y20Var.call(Boolean.FALSE);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m143093j(String str, Relationship relationship) {
        if (TextUtils.isEmpty(str) || joa.m146358H3() || ela.m121122r3() <= 0) {
            return;
        }
        CoreModule.f18264c.f20405m0.m32097d9();
        CoreModule.f18264c.f20297C0.m146425v4();
        CoreModule.f18264c.f20400k1.m121123A3();
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m143097n(boolean[] zArr, final boolean z, final User user, Act act, final boolean z2, y20 y20Var, String str, String str2, final Relationship relationship) {
        CoreModule.m30932N().mo61550kq(relationship);
        if (zArr.length == 0) {
            if (z) {
                r1j0.m179420g("超级喜欢已发送");
            } else {
                r1j0.m179420g("喜欢成功，" + ((NullChecker.m82486a(user) && user.isFemale()) ? "她" : "他") + "的动态更新将会出现在「喜欢的人」");
            }
        }
        if (TEnum.equals(relationship.state, "liked")) {
            CoreSuggested coreSuggested = CoreModule.f18264c.f20405m0;
            coreSuggested.f20208y0++;
            coreSuggested.f20211z0++;
        } else if (TEnum.equals(relationship.state, "matched")) {
            CoreSuggested coreSuggested2 = CoreModule.f18264c.f20405m0;
            coreSuggested2.f20208y0 = 0;
            coreSuggested2.f20211z0 = 0;
            m143106w(act, user, z, relationship);
        }
        if (z) {
            relationship.status.add(MatchFrom.get(MatchFrom.superLiked));
            relationship.state = RelationshipStatus.get("superliked");
            user.localRelationship = relationship;
            CoreModule.m30930K().refreshUser(user.f56859id);
        }
        l51.m152886F(act, new Runnable() { // from class: l.g1a
            @Override // java.lang.Runnable
            public final void run() {
                j1a.m143085b(z2, relationship, user, z);
            }
        });
        if (NullChecker.m82486a(y20Var)) {
            y20Var.call(relationship);
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        CoreModule.f18264c.f20420r0.f20769h0.m137019l(pf60.m172085a(user.f56859id, relationship.state));
        if (NullChecker.m82486a(str2)) {
            CoreModule.f18264c.f20384f0.m33905ap(str2);
        }
        CoreModule.f18264c.f20400k1.m121130I3(user.f56859id);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m143098o(y20 y20Var, Throwable th) {
        if (NullChecker.m82486a(y20Var)) {
            y20Var.call(th);
        }
        th.getMessage();
    }

    /* JADX INFO: renamed from: p */
    public static void m143099p(boolean z, Act act, User user, y20<Relationship> y20Var, y20<Throwable> y20Var2) {
        m143101r(true, z, act, user, false, false, null, null, y20Var, y20Var2, null, false, false);
    }

    /* JADX INFO: renamed from: q */
    public static void m143100q(List<Message> list, y20<Boolean> y20Var) {
        if (jyb.m147479J(list)) {
            y20Var.call(Boolean.TRUE);
        } else {
            y20Var.call(Boolean.valueOf(jyb.m147479J(jyb.m147522n(list, new qcj() { // from class: l.z0a
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    Message message = (Message) obj;
                    return Boolean.valueOf(message.isMe() && !message.isLocal() && (TEnum.equals(message.messageType, "text") || TEnum.equals(message.messageType, MessageType.state_like)));
                }
            }))));
        }
    }

    /* JADX INFO: renamed from: r */
    public static void m143101r(final boolean z, boolean z2, final Act act, final User user, final boolean z3, boolean z4, final String str, LikeFrom likeFrom, final y20<Relationship> y20Var, final y20<Throwable> y20Var2, String str2, boolean z5, final boolean... zArr) {
        LikeFrom likeFrom2;
        if (z3 || !m143103t(user) || z) {
            if (z3) {
                likeFrom2 = likeFrom;
            } else {
                likeFrom2 = likeFrom;
                if (TEnum.equals(likeFrom2, "moment") && m143083C()) {
                    CoreModule.m30933P().m143405a().mo34359L6(act, "p_home,likelimit", Privilege.vip_unlimited_likes, user);
                    return;
                }
            }
            if (!z4 && !z) {
                C4895j c4895j = CoreModule.f18264c.f20420r0;
                String str3 = user.f56859id;
                c4895j.f20772k0 = str3;
                c4895j.f20770i0.m137019l(str3);
            }
            final String strM121135t3 = CoreModule.f18264c.f20400k1.m121135t3(user.f56859id);
            act.duringCreated(CoreModule.f18264c.f20405m0.m32088b8(z, z2, true, z3, null, user, null, likeFrom2, true, null, 0, strM121135t3, z4, 1, str2, z5)).doOnNext(new y20() { // from class: l.a1a
                @Override // p153l.y20
                public final void call(Object obj) {
                    j1a.m143093j(strM121135t3, (Relationship) obj);
                }
            }).subscribe(psd0.m173597H(new y20() { // from class: l.b1a
                @Override // p153l.y20
                public final void call(Object obj) {
                    j1a.m143097n(zArr, z3, user, act, z, y20Var, strM121135t3, str, (Relationship) obj);
                }
            }, new y20() { // from class: l.c1a
                @Override // p153l.y20
                public final void call(Object obj) {
                    j1a.m143098o(y20Var2, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: s */
    public static List<Message> m143102s(List<Message> list) {
        return (jyb.m147479J(list) || !jyb.m147520m(list, new qcj() { // from class: l.y0a
            @Override // p153l.qcj
            public final Object call(Object obj) {
                Message message = (Message) obj;
                return Boolean.valueOf(NullChecker.m82486a(message) && !message.f56859id.startsWith("fake_id_"));
            }
        })) ? new ArrayList() : list;
    }

    /* JADX INFO: renamed from: t */
    public static boolean m143103t(User user) {
        if (user == null || user.localRelationship == null) {
            return false;
        }
        return !m143105v(user);
    }

    /* JADX INFO: renamed from: u */
    public static void m143104u(final Act act, final String str, final y20<Boolean> y20Var) {
        act.duringCreated(CoreModule.f18264c.f20420r0.m35141p5(str, false)).filter(new qcj() { // from class: l.d1a
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((GreetingHotLevelInfo) obj));
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.e1a
            @Override // p153l.y20
            public final void call(Object obj) {
                j1a.m143092i(y20Var, act, str, (GreetingHotLevelInfo) obj);
            }
        }, new y20() { // from class: l.f1a
            @Override // p153l.y20
            public final void call(Object obj) {
                j1a.m143090g(y20Var, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: v */
    public static boolean m143105v(User user) {
        Relationship relationship = user.localRelationship;
        if (relationship == null || TEnum.equals(relationship.state, "unknown_") || TEnum.equals(user.localRelationship.state, "default")) {
            return true;
        }
        return (TEnum.equals(user.localRelationship.state, "liked") && NullChecker.m82486a(user.localRelationship.relationshipExtensions) && TEnum.equals(user.localRelationship.relationshipExtensions.relationType, RelationshipStatus.DEFAULT)) || TEnum.equals(user.localRelationship.state, RelationshipStatus.disliked);
    }

    /* JADX INFO: renamed from: w */
    public static void m143106w(Act act, User user, boolean z, Relationship relationship) {
        if (!TEnum.equals(relationship.state, "matched") || relationship.status.contains(MatchFrom.get(MatchFrom.xmasActivity))) {
            return;
        }
        if (relationship.status.size() == 0 || !TEnum.equals(relationship.status.get(0), MatchFrom.superLikedEach)) {
            if ((relationship.status.size() == 0 || !TEnum.equals(relationship.status.get(0), MatchFrom.superLiked)) && relationship.status.size() != 0) {
                TEnum.equals(relationship.status.get(0), "secretcrush");
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public static void m143107x(Act act, final String str, final y20<Boolean> y20Var) {
        act.duringCreated(C22421c.just(0).observeOn(Schedulers.m222739io()).map(new qcj() { // from class: l.v0a
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return CoreModule.f18272k.f115535c.m189453O(str, "").m208674j();
            }
        }).flatMap(new qcj() { // from class: l.w0a
            @Override // p153l.qcj
            public final Object call(Object obj) {
                List list = (List) obj;
                return CoreModule.f18264c.f20420r0.m35076A5(str, jyb.m147479J(list) ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : ((Message) list.get(0)).createdTime, 0L, false, false);
            }
        }).observeOn(fo0.m126432a())).take(1).subscribe(psd0.m173596G(new y20() { // from class: l.x0a
            @Override // p153l.y20
            public final void call(Object obj) {
                j1a.m143100q(j1a.m143102s(((vg60) obj).f184001a), y20Var);
            }
        }));
    }

    /* JADX INFO: renamed from: y */
    public static void m143108y(Act act, String str, final String str2, String str3, String str4, final Channel channel, final y20<Boolean> y20Var) {
        String str5;
        Message messageNew_ = Message.new_();
        if (TextUtils.isEmpty(str3)) {
            messageNew_.messageType = MessageType.get("text");
        } else {
            messageNew_.messageType = MessageType.get(MessageType.moment_reference);
        }
        messageNew_.value = str;
        MessageReference messageReferenceNew_ = MessageReference.new_();
        messageReferenceNew_.type = "moment";
        messageReferenceNew_.f21189id = str3;
        messageNew_.api_only_reference = messageReferenceNew_;
        if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
            str5 = null;
        } else {
            str5 = "?source=moment&moment_id=" + str3 + "&moment_owner_id=" + str4;
        }
        act.duringCreated(CoreModule.f18264c.f20420r0.m35152u6(str2, channel, messageNew_, str5, new x20() { // from class: l.h1a
            @Override // p153l.x20
            public final void call() {
                CoreModule.m30932N().mo61521Zk(str2);
            }
        })).take(1).subscribe(psd0.m173597H(new y20() { // from class: l.i1a
            @Override // p153l.y20
            public final void call(Object obj) {
                j1a.m143091h(y20Var, (Message) obj);
            }
        }, new y20() { // from class: l.u0a
            @Override // p153l.y20
            public final void call(Object obj) {
                j1a.m143088e(y20Var, str2, channel, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: z */
    public static void m143109z(Act act, User user, boolean z, String str, LikeFrom likeFrom, y20<Relationship> y20Var, y20<Throwable> y20Var2, String str2, boolean... zArr) {
        m143082B(act, user, false, z, str, likeFrom, y20Var, y20Var2, str2, null, false, zArr);
    }
}
