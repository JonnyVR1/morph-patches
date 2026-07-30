package p149l;

import android.text.TextUtils;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4744j;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.GreetingHotLevelInfo;
import com.p046p1.mobile.putong.core.data.GreetingPermission;
import com.p046p1.mobile.putong.core.data.HotLevel;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageReference;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.data.Channel;
import com.p046p1.mobile.putong.data.Counter;
import com.p046p1.mobile.putong.data.CounterLikeLimit;
import com.p046p1.mobile.putong.data.CounterSuperlikeAndUndoLimit;
import com.p046p1.mobile.putong.data.LikeFrom;
import com.p046p1.mobile.putong.data.MatchFrom;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.RelationshipStatus;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p133rx.C22306c;
import p133rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes4.dex */
public class yz9 {
    /* JADX INFO: renamed from: A */
    public static void m216604A(Act act, User user, boolean z, String str, LikeFrom likeFrom, e30<Relationship> e30Var, e30<Throwable> e30Var2, boolean z2, boolean... zArr) {
        m216605B(act, user, false, z, str, likeFrom, e30Var, e30Var2, null, null, z2, zArr);
    }

    /* JADX INFO: renamed from: B */
    public static void m216605B(final Act act, final User user, boolean z, final boolean z2, final String str, final LikeFrom likeFrom, final e30<Relationship> e30Var, final e30<Throwable> e30Var2, final String str2, String str3, final boolean z3, final boolean... zArr) {
        String str4 = TextUtils.isEmpty(str3) ? "p_suggest_users_home_view,e_superlike,click" : str3;
        if (!Network.isConnected(CoreModule.f17544b)) {
            lsi0.m151584n(R$string.f20719B2);
            return;
        }
        if (CoreModule.m29934N().mo60389so() && z) {
            Counter counterM31484o3 = CoreModule.f17545c.m31484o3();
            CounterSuperlikeAndUndoLimit counterSuperlikeAndUndoLimit = counterM31484o3 == null ? null : counterM31484o3.superLikeLimit;
            User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
            if (userM169527p9.isJailed()) {
                CoreModule.m29932K().startJailedDialogLikeAct();
                return;
            }
            if (userM169527p9.isNameFake()) {
                CoreModule.m29935P().m94658i().mo158199A(act);
                return;
            }
            if (!mb90.m153867c(userM169527p9, PurchaseType.TYPE_SUPERLIKE_PKG) && NullChecker.m81303a(counterSuperlikeAndUndoLimit) && CoreModule.m29935P().m94658i().mo158202A3(counterSuperlikeAndUndoLimit.remainToday()) == 0) {
                CoreModule.m29935P().m94658i().mo33356L6(act, str4, Privilege.vip_super_like, user);
                return;
            } else {
                if (CoreModule.m29935P().m94658i().mo158315U5(act, new d30() { // from class: l.iz9
                    @Override // p149l.d30
                    public final void call() {
                        yz9.m216624r(false, false, act, user, true, z2, str, likeFrom, e30Var, e30Var2, str2, z3, zArr);
                    }
                })) {
                    return;
                }
                if (NullChecker.m81303a(counterSuperlikeAndUndoLimit) && CoreModule.m29935P().m94658i().mo158202A3(counterSuperlikeAndUndoLimit.remainToday()) == 0) {
                    CoreModule.m29935P().m94658i().mo33429Uh(act, str4);
                    return;
                }
            }
        }
        m216624r(false, false, act, user, z, z2, str, likeFrom, e30Var, e30Var2, str2, z3, zArr);
    }

    /* JADX INFO: renamed from: C */
    public static boolean m216606C() {
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        Counter counterM31484o3 = CoreModule.f17545c.m31484o3();
        CounterLikeLimit counterLikeLimit = counterM31484o3 == null ? null : counterM31484o3.likeLimit;
        return counterLikeLimit != null && counterLikeLimit.remaining == 0 && counterLikeLimit.resetNowMillis() > 0 && !mb90.m153867c(userM169527p9, PurchaseType.TYPE_LIKENOLIMIT_PKG);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m216608b(boolean z, Relationship relationship, User user, boolean z2) {
        if (z) {
            return;
        }
        CoreModule.m29934N().processMomentLikeStatusChanged(relationship, user, true, z2);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m216611e(e30 e30Var, String str, Channel channel, Throwable th) {
        e30Var.call(Boolean.FALSE);
        if (th instanceof TantanException.Client.CoreService) {
            int i = ((TantanException.Client.CoreService) th).code;
            if (i == 40042 || i == 40044 || i == 40045) {
                lsi0.m151595y("对方账号异常");
                return;
            } else {
                if (i == 40046) {
                    CoreModule.f17545c.f19642f0.m32902ap(str);
                    return;
                }
                return;
            }
        }
        if (th instanceof TantanException.Client.TantanForbidden) {
            TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
            if (!x19.m206695e(tantanForbidden)) {
                if (x19.m206694d(tantanForbidden)) {
                    lsi0.m151595y(tantanForbidden.message);
                    return;
                }
                return;
            }
            if (!TEnum.equals(channel, Channel.reply_thanks) && !TEnum.equals(channel, Channel.red_flower)) {
                lsi0.m151595y("对方同意配对后可发送消息，请耐心等待");
                return;
            }
            User userById = CoreModule.m29934N().getUserById(str);
            String str2 = userById == null ? null : userById.name;
            String str3 = TEnum.equals(channel, Channel.red_flower) ? "小红花" : "礼貌回谢";
            if (TextUtils.isEmpty(str2)) {
                lsi0.m151595y("你已发送过".concat(str3));
                return;
            }
            lsi0.m151595y("你已向" + str2 + "发送过" + str3);
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m216613g(e30 e30Var, Throwable th) {
        if (NullChecker.m81303a(e30Var)) {
            e30Var.call(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m216614h(e30 e30Var, Message message) {
        e30Var.call(Boolean.TRUE);
        CoreModule.f17545c.f19678r0.m34092J6();
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m216615i(e30 e30Var, Act act, String str, GreetingHotLevelInfo greetingHotLevelInfo) {
        GreetingPermission greetingPermission = !wwb.m205852a(greetingHotLevelInfo.greetingPermissions) ? greetingHotLevelInfo.greetingPermissions.get(0) : null;
        if (NullChecker.m81303a(greetingPermission) && !greetingPermission.enable) {
            if (NullChecker.m81303a(e30Var)) {
                e30Var.call(Boolean.FALSE);
                return;
            }
            return;
        }
        if (NullChecker.m81303a(wwb.m205852a(greetingHotLevelInfo.greetings) ? null : greetingHotLevelInfo.greetings.get(0))) {
            m216630x(act, str, e30Var);
            return;
        }
        if (wwb.m205852a(greetingHotLevelInfo.hotLevels)) {
            if (NullChecker.m81303a(e30Var)) {
                e30Var.call(Boolean.FALSE);
                return;
            }
            return;
        }
        HotLevel hotLevel = greetingHotLevelInfo.hotLevels.get(0);
        if (NullChecker.m81303a(hotLevel)) {
            if (hotLevel.level <= 0) {
                m216630x(act, str, e30Var);
            } else if (NullChecker.m81303a(e30Var)) {
                e30Var.call(Boolean.FALSE);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m216616j(String str, Relationship relationship) {
        if (TextUtils.isEmpty(str) || xma.m210044G3() || sja.m184461r3() <= 0) {
            return;
        }
        CoreModule.f17545c.f19663m0.m31094d9();
        CoreModule.f17545c.f19555C0.m210112u4();
        CoreModule.f17545c.f19658k1.m184462A3();
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m216620n(boolean[] zArr, final boolean z, final User user, Act act, final boolean z2, e30 e30Var, String str, String str2, final Relationship relationship) {
        CoreModule.m29934N().mo60366kq(relationship);
        if (zArr.length == 0) {
            if (z) {
                osi0.m165783g("超级喜欢已发送");
            } else {
                osi0.m165783g("喜欢成功，" + ((NullChecker.m81303a(user) && user.isFemale()) ? "她" : "他") + "的动态更新将会出现在「喜欢的人」");
            }
        }
        if (TEnum.equals(relationship.state, "liked")) {
            CoreSuggested coreSuggested = CoreModule.f17545c.f19663m0;
            coreSuggested.f19466y0++;
            coreSuggested.f19469z0++;
        } else if (TEnum.equals(relationship.state, "matched")) {
            CoreSuggested coreSuggested2 = CoreModule.f17545c.f19663m0;
            coreSuggested2.f19466y0 = 0;
            coreSuggested2.f19469z0 = 0;
            m216629w(act, user, z, relationship);
        }
        if (z) {
            relationship.status.add(MatchFrom.get(MatchFrom.superLiked));
            relationship.state = RelationshipStatus.get("superliked");
            user.localRelationship = relationship;
            CoreModule.m29932K().refreshUser(user.f56011id);
        }
        e51.m114741F(act, new Runnable() { // from class: l.vz9
            @Override // java.lang.Runnable
            public final void run() {
                yz9.m216608b(z2, relationship, user, z);
            }
        });
        if (NullChecker.m81303a(e30Var)) {
            e30Var.call(relationship);
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        CoreModule.f17545c.f19678r0.f20027h0.m132487l(j760.m140076a(user.f56011id, relationship.state));
        if (NullChecker.m81303a(str2)) {
            CoreModule.f17545c.f19642f0.m32902ap(str2);
        }
        CoreModule.f17545c.f19658k1.m184469I3(user.f56011id);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m216621o(e30 e30Var, Throwable th) {
        if (NullChecker.m81303a(e30Var)) {
            e30Var.call(th);
        }
        th.getMessage();
    }

    /* JADX INFO: renamed from: p */
    public static void m216622p(boolean z, Act act, User user, e30<Relationship> e30Var, e30<Throwable> e30Var2) {
        m216624r(true, z, act, user, false, false, null, null, e30Var, e30Var2, null, false, false);
    }

    /* JADX INFO: renamed from: q */
    public static void m216623q(List<Message> list, e30<Boolean> e30Var) {
        if (vwb.m200296J(list)) {
            e30Var.call(Boolean.TRUE);
        } else {
            e30Var.call(Boolean.valueOf(vwb.m200296J(vwb.m200339n(list, new w9j() { // from class: l.oz9
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    Message message = (Message) obj;
                    return Boolean.valueOf(message.isMe() && !message.isLocal() && (TEnum.equals(message.messageType, "text") || TEnum.equals(message.messageType, MessageType.state_like)));
                }
            }))));
        }
    }

    /* JADX INFO: renamed from: r */
    public static void m216624r(final boolean z, boolean z2, final Act act, final User user, final boolean z3, boolean z4, final String str, LikeFrom likeFrom, final e30<Relationship> e30Var, final e30<Throwable> e30Var2, String str2, boolean z5, final boolean... zArr) {
        LikeFrom likeFrom2;
        if (z3 || !m216626t(user) || z) {
            if (z3) {
                likeFrom2 = likeFrom;
            } else {
                likeFrom2 = likeFrom;
                if (TEnum.equals(likeFrom2, "moment") && m216606C()) {
                    CoreModule.m29935P().m94651a().mo33356L6(act, "p_home,likelimit", Privilege.vip_unlimited_likes, user);
                    return;
                }
            }
            if (!z4 && !z) {
                C4744j c4744j = CoreModule.f17545c.f19678r0;
                String str3 = user.f56011id;
                c4744j.f20030k0 = str3;
                c4744j.f20028i0.m132487l(str3);
            }
            final String strM184474t3 = CoreModule.f17545c.f19658k1.m184474t3(user.f56011id);
            act.duringCreated(CoreModule.f17545c.f19663m0.m31085b8(z, z2, true, z3, null, user, null, likeFrom2, true, null, 0, strM184474t3, z4, 1, str2, z5)).doOnNext(new e30() { // from class: l.pz9
                @Override // p149l.e30
                public final void call(Object obj) {
                    yz9.m216616j(strM184474t3, (Relationship) obj);
                }
            }).subscribe(mkd0.m154956H(new e30() { // from class: l.qz9
                @Override // p149l.e30
                public final void call(Object obj) {
                    yz9.m216620n(zArr, z3, user, act, z, e30Var, strM184474t3, str, (Relationship) obj);
                }
            }, new e30() { // from class: l.rz9
                @Override // p149l.e30
                public final void call(Object obj) {
                    yz9.m216621o(e30Var2, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: s */
    public static List<Message> m216625s(List<Message> list) {
        return (vwb.m200296J(list) || !vwb.m200337m(list, new w9j() { // from class: l.nz9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                Message message = (Message) obj;
                return Boolean.valueOf(NullChecker.m81303a(message) && !message.f56011id.startsWith("fake_id_"));
            }
        })) ? new ArrayList() : list;
    }

    /* JADX INFO: renamed from: t */
    public static boolean m216626t(User user) {
        if (user == null || user.localRelationship == null) {
            return false;
        }
        return !m216628v(user);
    }

    /* JADX INFO: renamed from: u */
    public static void m216627u(final Act act, final String str, final e30<Boolean> e30Var) {
        act.duringCreated(CoreModule.f17545c.f19678r0.m34138p5(str, false)).filter(new w9j() { // from class: l.sz9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((GreetingHotLevelInfo) obj));
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.tz9
            @Override // p149l.e30
            public final void call(Object obj) {
                yz9.m216615i(e30Var, act, str, (GreetingHotLevelInfo) obj);
            }
        }, new e30() { // from class: l.uz9
            @Override // p149l.e30
            public final void call(Object obj) {
                yz9.m216613g(e30Var, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: v */
    public static boolean m216628v(User user) {
        Relationship relationship = user.localRelationship;
        if (relationship == null || TEnum.equals(relationship.state, "unknown_") || TEnum.equals(user.localRelationship.state, "default")) {
            return true;
        }
        return (TEnum.equals(user.localRelationship.state, "liked") && NullChecker.m81303a(user.localRelationship.relationshipExtensions) && TEnum.equals(user.localRelationship.relationshipExtensions.relationType, RelationshipStatus.DEFAULT)) || TEnum.equals(user.localRelationship.state, RelationshipStatus.disliked);
    }

    /* JADX INFO: renamed from: w */
    public static void m216629w(Act act, User user, boolean z, Relationship relationship) {
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
    public static void m216630x(Act act, final String str, final e30<Boolean> e30Var) {
        act.duringCreated(C22306c.just(0).observeOn(Schedulers.m221493io()).map(new w9j() { // from class: l.kz9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return CoreModule.f17553k.f91940c.m206057O(str, "").m165617j();
            }
        }).flatMap(new w9j() { // from class: l.lz9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                List list = (List) obj;
                return CoreModule.f17545c.f19678r0.m34073A5(str, vwb.m200296J(list) ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : ((Message) list.get(0)).createdTime, 0L, false, false);
            }
        }).observeOn(jo0.m142408a())).take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.mz9
            @Override // p149l.e30
            public final void call(Object obj) {
                yz9.m216623q(yz9.m216625s(((q860) obj).f153135a), e30Var);
            }
        }));
    }

    /* JADX INFO: renamed from: y */
    public static void m216631y(Act act, String str, final String str2, String str3, String str4, final Channel channel, final e30<Boolean> e30Var) {
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
        messageReferenceNew_.f20447id = str3;
        messageNew_.api_only_reference = messageReferenceNew_;
        if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
            str5 = null;
        } else {
            str5 = "?source=moment&moment_id=" + str3 + "&moment_owner_id=" + str4;
        }
        act.duringCreated(CoreModule.f17545c.f19678r0.m34149u6(str2, channel, messageNew_, str5, new d30() { // from class: l.wz9
            @Override // p149l.d30
            public final void call() {
                CoreModule.m29934N().mo60337Zk(str2);
            }
        })).take(1).subscribe(mkd0.m154956H(new e30() { // from class: l.xz9
            @Override // p149l.e30
            public final void call(Object obj) {
                yz9.m216614h(e30Var, (Message) obj);
            }
        }, new e30() { // from class: l.jz9
            @Override // p149l.e30
            public final void call(Object obj) {
                yz9.m216611e(e30Var, str2, channel, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: z */
    public static void m216632z(Act act, User user, boolean z, String str, LikeFrom likeFrom, e30<Relationship> e30Var, e30<Throwable> e30Var2, String str2, boolean... zArr) {
        m216605B(act, user, false, z, str, likeFrom, e30Var, e30Var2, str2, null, false, zArr);
    }
}
