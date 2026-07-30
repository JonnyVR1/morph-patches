package p153l;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ChatGroup;
import com.p051p1.mobile.putong.core.data.ChatGroupMember;
import com.p051p1.mobile.putong.core.data.ChatGroupMemberStatus;
import com.p051p1.mobile.putong.core.data.ChatGroupSilence;
import com.p051p1.mobile.putong.core.data.ChatSendMessage;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.NotificationStatus;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.p058ui.messages.C8687b;
import com.p051p1.mobile.putong.data.JailedGroupChat;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserLiveLabel;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.connect.common.Constants;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes4.dex */
public class ggz extends clz<ChatGroup, lgz> {

    /* JADX INFO: renamed from: I0 */
    public String f104056I0;

    /* JADX INFO: renamed from: J0 */
    public double f104057J0;

    /* JADX INFO: renamed from: K0 */
    public final String f104058K0;

    /* JADX INFO: renamed from: L0 */
    public C22507a<uxj0> f104059L0;

    /* JADX INFO: renamed from: M0 */
    public kcg0 f104060M0;

    /* JADX INFO: renamed from: N0 */
    public Runnable f104061N0;

    public ggz(ner nerVar, Conversation conversation) {
        super(nerVar);
        this.f104056I0 = "";
        this.f104057J0 = -1.0d;
        this.f104058K0 = Constants.VIA_ACT_TYPE_NINETEEN;
        this.f104059L0 = C22507a.m222759c(uxj0.f181467a);
        this.f104061N0 = new Runnable() { // from class: l.xfz
            @Override // java.lang.Runnable
            public final void run() {
                this.f194122a.m130232b8();
            }
        };
        if (NullChecker.m82486a(conversation)) {
            this.f104056I0 = conversation.otherUser;
            if (NullChecker.m82486a(conversation.group) && !pm6.m172915c(conversation)) {
                this.f104057J0 = conversation.group.joinedTime;
            }
            if (this.f104057J0 == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                this.f104057J0 = -1.0d;
            }
        }
    }

    /* JADX INFO: renamed from: F7 */
    public static /* synthetic */ void m130204F7(Throwable th) {
    }

    /* JADX INFO: renamed from: O7 */
    private void m130209O7() {
        creates(new y20() { // from class: l.rfz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f162893a.m130229X7((Bundle) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a8 */
    public /* synthetic */ void m130210a8(Bundle bundle) {
        m130223R7();
    }

    /* JADX INFO: renamed from: y7 */
    public static /* synthetic */ bkj0 m130215y7(ChatSendMessage chatSendMessage, ChatGroupMember chatGroupMember, User user, uxj0 uxj0Var) {
        return new bkj0(chatSendMessage, chatGroupMember, user);
    }

    /* JADX INFO: renamed from: z7 */
    public static /* synthetic */ void m130216z7(Bundle bundle) {
    }

    @Override // p153l.clz
    /* JADX INFO: renamed from: A3 */
    public String mo110834A3() {
        ChatGroup chatGroupM32923s6 = CoreModule.f18264c.f20387g0.m32923s6(mo111034r3());
        return (NullChecker.m82486a(chatGroupM32923s6) && TEnum.equals(chatGroupM32923s6.groupType, "anonymous")) ? "chat_group_anonymity" : super.mo110834A3();
    }

    /* JADX INFO: renamed from: K7 */
    public final void m130217K7() {
        duringCreated(C22421c.combineLatest(CoreModule.f18264c.f20387g0.m32911o6(mo111034r3()).map(new qcj() { // from class: l.dgz
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((ChatGroup) obj).punishment.sendMessage;
            }
        }).distinctUntilChanged(), CoreModule.f18264c.f20387g0.m32847T6(mo111034r3(), CoreModule.m30929H().userId()).filter(new hh7()), CoreModule.f18264c.f20381e0.m116596o9(), this.f104059L0, new tcj() { // from class: l.egz
            @Override // p153l.tcj
            /* JADX INFO: renamed from: b */
            public final Object mo112959b(Object obj, Object obj2, Object obj3, Object obj4) {
                return ggz.m130215y7((ChatSendMessage) obj, (ChatGroupMember) obj2, (User) obj3, (uxj0) obj4);
            }
        })).subscribe(new y20() { // from class: l.fgz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f98991a.m130224S7((bkj0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: L7 */
    public final void m130218L7() {
        duringCreated(CoreModule.f18264c.f20387g0.m32941y6()).filter(new qcj() { // from class: l.ufz
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f178848a.m130225T7((uxj0) obj);
            }
        }).take(1).subscribe(psd0.m173596G(new y20() { // from class: l.vfz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f183991a.m130226U7((uxj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: M7 */
    public final void m130219M7() {
        duringCreated(CoreModule.f18264c.f20387g0.m32841R6()).subscribe(psd0.m173596G(new y20() { // from class: l.cgz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f81751a.m130227V7((Integer) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N7 */
    public final void m130220N7() {
        if (!CoreModule.m30933P().m143412i().mo180308D() || User.isTeamAccount(mo111034r3())) {
            return;
        }
        duringCreated(psd0.m173625r(CoreModule.f18264c.f20384f0.m33740Ne(m110989i3()), CoreModule.f18264c.f20384f0.m33832Un(m110989i3(), mo111044t3()), new gu20())).subscribe(psd0.m173596G(new y20() { // from class: l.agz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f71300a.m130228W7((pf60) obj);
            }
        }));
        creates(new y20() { // from class: l.bgz
            @Override // p153l.y20
            public final void call(Object obj) {
                ggz.m130216z7((Bundle) obj);
            }
        }, new eoz());
    }

    /* JADX INFO: renamed from: P7 */
    public final void m130221P7() {
        duringCreated(CoreModule.f18264c.f20387g0.m32847T6(mo111034r3(), CoreModule.m30929H().userId()).filter(new hh7())).subscribe(psd0.m173596G(new y20() { // from class: l.tfz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f174030a.m130230Y7((ChatGroupMember) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Q7 */
    public final void m130222Q7() {
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.sfz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f167782a.m130231Z7((C4470c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: R7 */
    public final void m130223R7() {
        LinkedHashMap<String, UserLiveLabel> linkedHashMapM34210zg;
        UserLiveLabel userLiveLabel;
        ChatGroup chatGroupM32889h7 = CoreModule.f18264c.f20387g0.m32889h7(mo111034r3());
        if (chatGroupM32889h7 == null || !CoreModule.m30933P().m143412i().mo180517p() || chatGroupM32889h7.ownerUserId.equals(CoreModule.m30930K().me_().f56859id) || (linkedHashMapM34210zg = CoreModule.f18264c.f20384f0.m34210zg(false)) == null || linkedHashMapM34210zg.isEmpty() || (userLiveLabel = linkedHashMapM34210zg.get(chatGroupM32889h7.ownerUserId)) == null) {
            return;
        }
        if (("onVoice".equals(userLiveLabel.liveState) || "onLive".equals(userLiveLabel.liveState)) && mo111034r3().equals(userLiveLabel.groupId)) {
            ((lgz) this.viewModel).m178927Y1(chatGroupM32889h7.category.f21105id, mo111034r3());
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0040  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S7 */
    public final /* synthetic */ void m130224S7(bkj0 bkj0Var) {
        boolean z;
        psd0.m173633z(this.f104060M0);
        User user = (User) bkj0Var.f77083c;
        boolean z2 = true;
        if (NullChecker.m82486a(user.state) && NullChecker.m82486a(user.state.jailedBusiness) && NullChecker.m82486a(user.state.jailedBusiness.groupChat)) {
            JailedGroupChat jailedGroupChat = user.state.jailedBusiness.groupChat;
            if (!jailedGroupChat.active || jailedGroupChat.expireTime <= pzi0.m174454o()) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        ChatGroupMember chatGroupMember = (ChatGroupMember) bkj0Var.f77082b;
        if (TEnum.equals(chatGroupMember.status, ChatGroupMemberStatus.exited)) {
            ((lgz) this.viewModel).m154154w2(false);
            return;
        }
        if (!((ChatSendMessage) bkj0Var.f77081a).active && !chatGroupMember.silence.enable && !z) {
            z2 = false;
        }
        ((lgz) this.viewModel).m154154w2(z2);
        if (z2) {
            m130237g8((ChatSendMessage) bkj0Var.f77081a, chatGroupMember.silence, (User) bkj0Var.f77083c);
        }
    }

    /* JADX INFO: renamed from: T7 */
    public final /* synthetic */ Boolean m130225T7(uxj0 uxj0Var) {
        return Boolean.valueOf(!NullChecker.m82486a(CoreModule.f18264c.f20387g0.m32889h7(mo111034r3())));
    }

    /* JADX INFO: renamed from: U7 */
    public final /* synthetic */ void m130226U7(uxj0 uxj0Var) {
        act().m68056e2();
    }

    @Override // p153l.clz
    /* JADX INFO: renamed from: V2 */
    public boolean mo110925V2() {
        return !mo110985h4();
    }

    /* JADX INFO: renamed from: V7 */
    public final /* synthetic */ void m130227V7(Integer num) {
        m130235e8();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: W7 */
    public final /* synthetic */ void m130228W7(pf60 pf60Var) {
        if (C8687b.m50243l((Conversation) pf60Var.f152156a, ((vg60) pf60Var.f152157b).f184001a, 10, this.f82486n)) {
            l51.m152888H(act(), this.f104061N0, 500L);
            m111043s7(false);
        }
    }

    /* JADX INFO: renamed from: X7 */
    public final /* synthetic */ void m130229X7(Bundle bundle) {
        ((lgz) this.viewModel).m154149q2();
    }

    /* JADX INFO: renamed from: Y7 */
    public final /* synthetic */ void m130230Y7(ChatGroupMember chatGroupMember) {
        ((lgz) this.viewModel).m154155z2((TEnum.equals(chatGroupMember.status, ChatGroupMemberStatus.exited) || mo110985h4()) ? false : true);
    }

    /* JADX INFO: renamed from: Z7 */
    public final /* synthetic */ void m130231Z7(C4470c c4470c) {
        if ((c4470c == C4470c.f16264f || c4470c == C4470c.f16268j) && NullChecker.m82486a(m110989i3())) {
            m111043s7(true);
        }
    }

    @Override // p153l.clz, p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        CoreModule.f18264c.f20384f0.m34213zj(m110989i3());
        m130222Q7();
        m130220N7();
        m130217K7();
        m130235e8();
        m130219M7();
        m130221P7();
        creates(new y20() { // from class: l.qfz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f157368a.m130210a8((Bundle) obj);
            }
        });
        m130238h8();
        m130218L7();
        m130209O7();
    }

    /* JADX INFO: renamed from: b8 */
    public final /* synthetic */ void m130232b8() {
        ((lgz) this.viewModel).m178889C1();
    }

    /* JADX INFO: renamed from: c8 */
    public final /* synthetic */ void m130233c8(uxj0 uxj0Var) {
        ChatGroup chatGroupM32923s6 = CoreModule.f18264c.f20387g0.m32923s6(mo111034r3());
        ruy ruyVarMo50143F = m143372e0().mo50143F();
        if (NullChecker.m82486a(ruyVarMo50143F) && NullChecker.m82486a(chatGroupM32923s6) && (ruyVarMo50143F instanceof avy)) {
            ((avy) ruyVarMo50143F).m100555I0(chatGroupM32923s6);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006e, code lost:
    
        if (r10.expireTime > p153l.pzi0.m174454o()) goto L26;
     */
    /* JADX INFO: renamed from: d8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ void m130234d8(long j, int i, long j2, ChatSendMessage chatSendMessage, ChatGroupSilence chatGroupSilence, User user, Long l2) {
        if (pzi0.m174454o() < j) {
            m130236f8(i, j - pzi0.m174454o(), j, j2);
            return;
        }
        psd0.m173633z(this.f104060M0);
        if ((!chatSendMessage.active || pzi0.m174454o() >= chatSendMessage.until) && (!chatGroupSilence.enable || pzi0.m174454o() >= chatGroupSilence.until)) {
            if (NullChecker.m82486a(user.state) && NullChecker.m82486a(user.state.jailedBusiness) && NullChecker.m82486a(user.state.jailedBusiness.groupChat)) {
                JailedGroupChat jailedGroupChat = user.state.jailedBusiness.groupChat;
                if (jailedGroupChat.active) {
                }
            }
            ((lgz) this.viewModel).m154154w2(false);
            m130235e8();
            return;
        }
        this.f104059L0.m137019l(uxj0.f181467a);
    }

    @Override // p153l.clz
    /* JADX INFO: renamed from: e4 */
    public boolean mo110970e4() {
        return true;
    }

    /* JADX INFO: renamed from: e8 */
    public final void m130235e8() {
        duringCreated(CoreModule.f18264c.f20387g0.m32861X8(mo111034r3())).subscribe(psd0.m173597H(new y20() { // from class: l.yfz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f199694a.m130233c8((uxj0) obj);
            }
        }, new y20() { // from class: l.zfz
            @Override // p153l.y20
            public final void call(Object obj) {
                ggz.m130204F7((Throwable) obj);
            }
        }));
        CoreModule.f18264c.f20387g0.m32840Q8(mo111034r3());
        CoreModule.f18264c.f20381e0.m116527W9(CoreModule.m30929H().userId());
        CoreModule.f18264c.f20387g0.m32867Z8(mo111034r3(), CoreModule.m30929H().userId());
    }

    /* JADX INFO: renamed from: f8 */
    public final void m130236f8(int i, long j, long j2, long j3) {
        long j4 = j / 1000;
        long j5 = j3 / 60;
        if (i == 0) {
            String str = jek.f120505a.format(new Date(j2));
            ((lgz) this.viewModel).m154152u2(act().getString(R$string.f21722h0, str.substring(0, 4), str.substring(5, 7), str.substring(8, 10)));
        } else if (i == 2) {
            Date date = new Date(j2);
            ((lgz) this.viewModel).m154152u2("您的账号收到多条举报，经平台核实确定违规，将于 " + pzi0.f154858e.format(date) + " 解除禁言。");
        } else if (i == 1) {
            V v2 = this.viewModel;
            if (j4 < 60) {
                ((lgz) v2).m154152u2(act().getString(R$string.f21458B, Math.max(1L, j4) + ""));
            } else {
                ((lgz) v2).m154152u2(act().getString(R$string.f21450A, String.valueOf(j5)));
            }
        }
        act().hideInput();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0076  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:32:0x00bf  */
    /* JADX INFO: renamed from: g8 */
    public final void m130237g8(final ChatSendMessage chatSendMessage, final ChatGroupSilence chatGroupSilence, final User user) {
        long jM174454o;
        long j;
        long j2;
        int i;
        final long j3;
        final long j4;
        if (!chatSendMessage.active || chatSendMessage.until <= pzi0.m174454o()) {
            if (NullChecker.m82486a(user.state) && NullChecker.m82486a(user.state.jailedBusiness) && NullChecker.m82486a(user.state.jailedBusiness.groupChat)) {
                JailedGroupChat jailedGroupChat = user.state.jailedBusiness.groupChat;
                if (!jailedGroupChat.active || jailedGroupChat.expireTime <= pzi0.m174454o()) {
                    if (chatGroupSilence.enable) {
                    }
                    jM174454o = 0;
                    j = 0;
                    j2 = 0;
                } else {
                    jM174454o = ((long) user.state.jailedBusiness.groupChat.expireTime) - pzi0.m174454o();
                    j = (long) user.state.jailedBusiness.groupChat.expireTime;
                    i = 2;
                    j2 = 0;
                }
            } else if (chatGroupSilence.enable || chatGroupSilence.until <= pzi0.m174454o()) {
                jM174454o = 0;
                j = 0;
                j2 = 0;
            } else {
                jM174454o = ((long) chatGroupSilence.until) - pzi0.m174454o();
                j = (long) chatGroupSilence.until;
                j2 = chatGroupSilence.duration;
                i = 1;
            }
            psd0.m173633z(this.f104060M0);
            if (jM174454o <= 0) {
                ((lgz) this.viewModel).m154154w2(false);
                return;
            }
            if (pzi0.m174454o() < j) {
                long j5 = j;
                long j6 = j2;
                m130236f8(i, j - pzi0.m174454o(), j5, j6);
                j3 = j5;
                j4 = j6;
            } else {
                j3 = j;
                j4 = j2;
            }
            final int i2 = i;
            this.f104060M0 = duringCreated(C22421c.interval(1L, TimeUnit.SECONDS)).onBackpressureLatest().observeOn(fo0.m126432a()).subscribe(new y20() { // from class: l.wfz
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f188899a.m130234d8(j3, i2, j4, chatSendMessage, chatGroupSilence, user, (Long) obj);
                }
            });
        }
        jM174454o = ((long) chatSendMessage.until) - pzi0.m174454o();
        j = (long) chatSendMessage.until;
        j2 = 0;
        i = 0;
        psd0.m173633z(this.f104060M0);
        if (jM174454o <= 0) {
            ((lgz) this.viewModel).m154154w2(false);
            return;
        }
        if (pzi0.m174454o() < j) {
            long j7 = j;
            long j8 = j2;
            m130236f8(i, j - pzi0.m174454o(), j7, j8);
            j3 = j7;
            j4 = j8;
        } else {
            j3 = j;
            j4 = j2;
        }
        final int i3 = i;
        this.f104060M0 = duringCreated(C22421c.interval(1L, TimeUnit.SECONDS)).onBackpressureLatest().observeOn(fo0.m126432a()).subscribe(new y20() { // from class: l.wfz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f188899a.m130234d8(j3, i3, j4, chatSendMessage, chatGroupSilence, user, (Long) obj);
            }
        });
    }

    @Override // p153l.clz
    /* JADX INFO: renamed from: h4 */
    public boolean mo110985h4() {
        return TextUtils.equals(Constants.VIA_ACT_TYPE_NINETEEN, m111029q3().category.f21105id);
    }

    /* JADX INFO: renamed from: h8 */
    public final void m130238h8() {
        CoreModule.f18264c.f20384f0.m33870Xp(NotificationStatus.get("pending"), NotificationStatus.get("removed"), mo111034r3());
        CoreModule.f18264c.f20384f0.m33870Xp(NotificationStatus.get("ongoing"), NotificationStatus.get("removed"), mo111034r3());
    }

    @Override // p153l.clz
    /* JADX INFO: renamed from: r3 */
    public String mo111034r3() {
        return this.f104056I0;
    }

    @Override // p153l.clz
    /* JADX INFO: renamed from: s3 */
    public C22421c<ChatGroup> mo111039s3(String str) {
        return CoreModule.f18264c.f20387g0.m32911o6(str);
    }

    @Override // p153l.clz
    /* JADX INFO: renamed from: t3 */
    public double mo111044t3() {
        return this.f104057J0;
    }
}
