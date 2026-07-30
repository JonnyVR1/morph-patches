package p149l;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ChatGroup;
import com.p046p1.mobile.putong.core.data.ChatGroupMember;
import com.p046p1.mobile.putong.core.data.ChatGroupMemberStatus;
import com.p046p1.mobile.putong.core.data.ChatGroupSilence;
import com.p046p1.mobile.putong.core.data.ChatSendMessage;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.NotificationStatus;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.p053ui.messages.C8524b;
import com.p046p1.mobile.putong.data.JailedGroupChat;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserLiveLabel;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.connect.common.Constants;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes4.dex */
public class j7z extends fcz<ChatGroup, o7z> {

    /* JADX INFO: renamed from: I0 */
    public String f116664I0;

    /* JADX INFO: renamed from: J0 */
    public double f116665J0;

    /* JADX INFO: renamed from: K0 */
    public final String f116666K0;

    /* JADX INFO: renamed from: L0 */
    public C22392a<roj0> f116667L0;

    /* JADX INFO: renamed from: M0 */
    public c4g0 f116668M0;

    /* JADX INFO: renamed from: N0 */
    public Runnable f116669N0;

    public j7z(mcr mcrVar, Conversation conversation) {
        super(mcrVar);
        this.f116664I0 = "";
        this.f116665J0 = -1.0d;
        this.f116666K0 = Constants.VIA_ACT_TYPE_NINETEEN;
        this.f116667L0 = C22392a.m221513c(roj0.f160388a);
        this.f116669N0 = new Runnable() { // from class: l.a7z
            @Override // java.lang.Runnable
            public final void run() {
                this.f67966a.m140167b8();
            }
        };
        if (NullChecker.m81303a(conversation)) {
            this.f116664I0 = conversation.otherUser;
            if (NullChecker.m81303a(conversation.group) && !ml6.m155118c(conversation)) {
                this.f116665J0 = conversation.group.joinedTime;
            }
            if (this.f116665J0 == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                this.f116665J0 = -1.0d;
            }
        }
    }

    /* JADX INFO: renamed from: F7 */
    public static /* synthetic */ void m140139F7(Throwable th) {
    }

    /* JADX INFO: renamed from: O7 */
    private void m140144O7() {
        creates(new e30() { // from class: l.u6z
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f174899a.m140164X7((Bundle) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a8 */
    public /* synthetic */ void m140145a8(Bundle bundle) {
        m140158R7();
    }

    /* JADX INFO: renamed from: y7 */
    public static /* synthetic */ xaj0 m140150y7(ChatSendMessage chatSendMessage, ChatGroupMember chatGroupMember, User user, roj0 roj0Var) {
        return new xaj0(chatSendMessage, chatGroupMember, user);
    }

    /* JADX INFO: renamed from: z7 */
    public static /* synthetic */ void m140151z7(Bundle bundle) {
    }

    @Override // p149l.fcz
    /* JADX INFO: renamed from: A3 */
    public String mo120628A3() {
        ChatGroup chatGroupM31920s6 = CoreModule.f17545c.f19645g0.m31920s6(mo120828r3());
        return (NullChecker.m81303a(chatGroupM31920s6) && TEnum.equals(chatGroupM31920s6.groupType, "anonymous")) ? "chat_group_anonymity" : super.mo120628A3();
    }

    /* JADX INFO: renamed from: K7 */
    public final void m140152K7() {
        duringCreated(C22306c.combineLatest(CoreModule.f17545c.f19645g0.m31908o6(mo120828r3()).map(new w9j() { // from class: l.g7z
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((ChatGroup) obj).punishment.sendMessage;
            }
        }).distinctUntilChanged(), CoreModule.f17545c.f19645g0.m31844T6(mo120828r3(), CoreModule.m29931H().userId()).filter(new dg7()), CoreModule.f17545c.f19639e0.m169523o9(), this.f116667L0, new z9j() { // from class: l.h7z
            @Override // p149l.z9j
            /* JADX INFO: renamed from: b */
            public final Object mo100621b(Object obj, Object obj2, Object obj3, Object obj4) {
                return j7z.m140150y7((ChatSendMessage) obj, (ChatGroupMember) obj2, (User) obj3, (roj0) obj4);
            }
        })).subscribe(new e30() { // from class: l.i7z
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f111962a.m140159S7((xaj0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: L7 */
    public final void m140153L7() {
        duringCreated(CoreModule.f17545c.f19645g0.m31938y6()).filter(new w9j() { // from class: l.x6z
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f191298a.m140160T7((roj0) obj);
            }
        }).take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.y6z
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f196656a.m140161U7((roj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: M7 */
    public final void m140154M7() {
        duringCreated(CoreModule.f17545c.f19645g0.m31838R6()).subscribe(mkd0.m154955G(new e30() { // from class: l.f7z
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f96305a.m140162V7((Integer) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N7 */
    public final void m140155N7() {
        if (!CoreModule.m29935P().m94658i().mo158216D() || User.isTeamAccount(mo120828r3())) {
            return;
        }
        duringCreated(mkd0.m154984r(CoreModule.f17545c.f19642f0.m32737Ne(m120783i3()), CoreModule.f17545c.f19642f0.m32829Un(m120783i3(), mo120838t3()), new wl20())).subscribe(mkd0.m154955G(new e30() { // from class: l.d7z
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f84806a.m140163W7((j760) obj);
            }
        }));
        creates(new e30() { // from class: l.e7z
            @Override // p149l.e30
            public final void call(Object obj) {
                j7z.m140151z7((Bundle) obj);
            }
        }, new hfz());
    }

    /* JADX INFO: renamed from: P7 */
    public final void m140156P7() {
        duringCreated(CoreModule.f17545c.f19645g0.m31844T6(mo120828r3(), CoreModule.m29931H().userId()).filter(new dg7())).subscribe(mkd0.m154955G(new e30() { // from class: l.w6z
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f185013a.m140165Y7((ChatGroupMember) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Q7 */
    public final void m140157Q7() {
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.v6z
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f180246a.m140166Z7((C4319c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: R7 */
    public final void m140158R7() {
        LinkedHashMap<String, UserLiveLabel> linkedHashMapM33207zg;
        UserLiveLabel userLiveLabel;
        ChatGroup chatGroupM31886h7 = CoreModule.f17545c.f19645g0.m31886h7(mo120828r3());
        if (chatGroupM31886h7 == null || !CoreModule.m29935P().m94658i().mo158425p() || chatGroupM31886h7.ownerUserId.equals(CoreModule.m29932K().me_().f56011id) || (linkedHashMapM33207zg = CoreModule.f17545c.f19642f0.m33207zg(false)) == null || linkedHashMapM33207zg.isEmpty() || (userLiveLabel = linkedHashMapM33207zg.get(chatGroupM31886h7.ownerUserId)) == null) {
            return;
        }
        if (("onVoice".equals(userLiveLabel.liveState) || "onLive".equals(userLiveLabel.liveState)) && mo120828r3().equals(userLiveLabel.groupId)) {
            ((o7z) this.viewModel).m190284Y1(chatGroupM31886h7.category.f20363id, mo120828r3());
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0040  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S7 */
    public final /* synthetic */ void m140159S7(xaj0 xaj0Var) {
        boolean z;
        mkd0.m154992z(this.f116668M0);
        User user = (User) xaj0Var.f191753c;
        boolean z2 = true;
        if (NullChecker.m81303a(user.state) && NullChecker.m81303a(user.state.jailedBusiness) && NullChecker.m81303a(user.state.jailedBusiness.groupChat)) {
            JailedGroupChat jailedGroupChat = user.state.jailedBusiness.groupChat;
            if (!jailedGroupChat.active || jailedGroupChat.expireTime <= mqi0.m155944o()) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        ChatGroupMember chatGroupMember = (ChatGroupMember) xaj0Var.f191752b;
        if (TEnum.equals(chatGroupMember.status, ChatGroupMemberStatus.exited)) {
            ((o7z) this.viewModel).m163087w2(false);
            return;
        }
        if (!((ChatSendMessage) xaj0Var.f191751a).active && !chatGroupMember.silence.enable && !z) {
            z2 = false;
        }
        ((o7z) this.viewModel).m163087w2(z2);
        if (z2) {
            m140172g8((ChatSendMessage) xaj0Var.f191751a, chatGroupMember.silence, (User) xaj0Var.f191753c);
        }
    }

    /* JADX INFO: renamed from: T7 */
    public final /* synthetic */ Boolean m140160T7(roj0 roj0Var) {
        return Boolean.valueOf(!NullChecker.m81303a(CoreModule.f17545c.f19645g0.m31886h7(mo120828r3())));
    }

    /* JADX INFO: renamed from: U7 */
    public final /* synthetic */ void m140161U7(roj0 roj0Var) {
        act().m66873d2();
    }

    @Override // p149l.fcz
    /* JADX INFO: renamed from: V2 */
    public boolean mo120719V2() {
        return !mo120779h4();
    }

    /* JADX INFO: renamed from: V7 */
    public final /* synthetic */ void m140162V7(Integer num) {
        m140170e8();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: W7 */
    public final /* synthetic */ void m140163W7(j760 j760Var) {
        if (C8524b.m49060l((Conversation) j760Var.f116564a, ((q860) j760Var.f116565b).f153135a, 10, this.f96923n)) {
            e51.m114743H(act(), this.f116669N0, 500L);
            m120837s7(false);
        }
    }

    /* JADX INFO: renamed from: X7 */
    public final /* synthetic */ void m140164X7(Bundle bundle) {
        ((o7z) this.viewModel).m163082q2();
    }

    /* JADX INFO: renamed from: Y7 */
    public final /* synthetic */ void m140165Y7(ChatGroupMember chatGroupMember) {
        ((o7z) this.viewModel).m163088z2((TEnum.equals(chatGroupMember.status, ChatGroupMemberStatus.exited) || mo120779h4()) ? false : true);
    }

    /* JADX INFO: renamed from: Z7 */
    public final /* synthetic */ void m140166Z7(C4319c c4319c) {
        if ((c4319c == C4319c.f15545f || c4319c == C4319c.f15549j) && NullChecker.m81303a(m120783i3())) {
            m120837s7(true);
        }
    }

    @Override // p149l.fcz, p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        CoreModule.f17545c.f19642f0.m33210zj(m120783i3());
        m140157Q7();
        m140155N7();
        m140152K7();
        m140170e8();
        m140154M7();
        m140156P7();
        creates(new e30() { // from class: l.t6z
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f168652a.m140145a8((Bundle) obj);
            }
        });
        m140173h8();
        m140153L7();
        m140144O7();
    }

    /* JADX INFO: renamed from: b8 */
    public final /* synthetic */ void m140167b8() {
        ((o7z) this.viewModel).m190249C1();
    }

    /* JADX INFO: renamed from: c8 */
    public final /* synthetic */ void m140168c8(roj0 roj0Var) {
        ChatGroup chatGroupM31920s6 = CoreModule.f17545c.f19645g0.m31920s6(mo120828r3());
        uly ulyVarMo48959E = m156455e0().mo48959E();
        if (NullChecker.m81303a(ulyVarMo48959E) && NullChecker.m81303a(chatGroupM31920s6) && (ulyVarMo48959E instanceof dmy)) {
            ((dmy) ulyVarMo48959E).m112576I0(chatGroupM31920s6);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006e, code lost:
    
        if (r10.expireTime > p149l.mqi0.m155944o()) goto L26;
     */
    /* JADX INFO: renamed from: d8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void m140169d8(long r9, int r11, long r12, com.p046p1.mobile.putong.core.data.ChatSendMessage r14, com.p046p1.mobile.putong.core.data.ChatGroupSilence r15, com.p046p1.mobile.putong.data.User r16, java.lang.Long r17) {
        /*
            r8 = this;
            r0 = r16
            long r1 = p149l.mqi0.m155944o()
            int r1 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r1 >= 0) goto L18
            long r14 = p149l.mqi0.m155944o()
            long r2 = r9 - r14
            r0 = r8
            r4 = r9
            r1 = r11
            r6 = r12
            r0.m140171f8(r1, r2, r4, r6)
            return
        L18:
            l.c4g0 r10 = r8.f116668M0
            p149l.mkd0.m154992z(r10)
            boolean r10 = r14.active
            if (r10 == 0) goto L2d
            long r10 = p149l.mqi0.m155944o()
            double r10 = (double) r10
            double r12 = r14.until
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L2d
            goto L70
        L2d:
            boolean r10 = r15.enable
            if (r10 == 0) goto L3d
            long r10 = p149l.mqi0.m155944o()
            double r10 = (double) r10
            double r12 = r15.until
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L3d
            goto L70
        L3d:
            com.p1.mobile.putong.data.UserState r10 = r0.state
            boolean r10 = com.tantanapp.common.utils.NullChecker.m81303a(r10)
            if (r10 == 0) goto L78
            com.p1.mobile.putong.data.UserState r10 = r0.state
            com.p1.mobile.putong.data.JailedBusiness r10 = r10.jailedBusiness
            boolean r10 = com.tantanapp.common.utils.NullChecker.m81303a(r10)
            if (r10 == 0) goto L78
            com.p1.mobile.putong.data.UserState r10 = r0.state
            com.p1.mobile.putong.data.JailedBusiness r10 = r10.jailedBusiness
            com.p1.mobile.putong.data.JailedGroupChat r10 = r10.groupChat
            boolean r10 = com.tantanapp.common.utils.NullChecker.m81303a(r10)
            if (r10 == 0) goto L78
            com.p1.mobile.putong.data.UserState r10 = r0.state
            com.p1.mobile.putong.data.JailedBusiness r10 = r10.jailedBusiness
            com.p1.mobile.putong.data.JailedGroupChat r10 = r10.groupChat
            boolean r11 = r10.active
            if (r11 == 0) goto L78
            double r10 = r10.expireTime
            long r12 = p149l.mqi0.m155944o()
            double r12 = (double) r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 <= 0) goto L78
        L70:
            rx.subjects.a<l.roj0> r8 = r8.f116667L0
            l.roj0 r9 = p149l.roj0.f160388a
            r8.m132487l(r9)
            return
        L78:
            V extends l.s7m r10 = r8.viewModel
            l.o7z r10 = (p149l.o7z) r10
            r11 = 0
            r10.m163087w2(r11)
            r8.m140170e8()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p149l.j7z.m140169d8(long, int, long, com.p1.mobile.putong.core.data.ChatSendMessage, com.p1.mobile.putong.core.data.ChatGroupSilence, com.p1.mobile.putong.data.User, java.lang.Long):void");
    }

    @Override // p149l.fcz
    /* JADX INFO: renamed from: e4 */
    public boolean mo120764e4() {
        return true;
    }

    /* JADX INFO: renamed from: e8 */
    public final void m140170e8() {
        duringCreated(CoreModule.f17545c.f19645g0.m31858X8(mo120828r3())).subscribe(mkd0.m154956H(new e30() { // from class: l.b7z
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f74028a.m140168c8((roj0) obj);
            }
        }, new e30() { // from class: l.c7z
            @Override // p149l.e30
            public final void call(Object obj) {
                j7z.m140139F7((Throwable) obj);
            }
        }));
        CoreModule.f17545c.f19645g0.m31837Q8(mo120828r3());
        CoreModule.f17545c.f19639e0.m169454W9(CoreModule.m29931H().userId());
        CoreModule.f17545c.f19645g0.m31864Z8(mo120828r3(), CoreModule.m29931H().userId());
    }

    /* JADX INFO: renamed from: f8 */
    public final void m140171f8(int i, long j, long j2, long j3) {
        long j4 = j / 1000;
        long j5 = j3 / 60;
        if (i == 0) {
            String str = tbk.f169267a.format(new Date(j2));
            ((o7z) this.viewModel).m163085u2(act().getString(R$string.f20980h0, str.substring(0, 4), str.substring(5, 7), str.substring(8, 10)));
        } else if (i == 2) {
            Date date = new Date(j2);
            ((o7z) this.viewModel).m163085u2("您的账号收到多条举报，经平台核实确定违规，将于 " + mqi0.f135253e.format(date) + " 解除禁言。");
        } else if (i == 1) {
            V v2 = this.viewModel;
            if (j4 < 60) {
                ((o7z) v2).m163085u2(act().getString(R$string.f20716B, Math.max(1L, j4) + ""));
            } else {
                ((o7z) v2).m163085u2(act().getString(R$string.f20708A, String.valueOf(j5)));
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
    public final void m140172g8(final ChatSendMessage chatSendMessage, final ChatGroupSilence chatGroupSilence, final User user) {
        long jM155944o;
        long j;
        long j2;
        int i;
        final long j3;
        final long j4;
        if (!chatSendMessage.active || chatSendMessage.until <= mqi0.m155944o()) {
            if (NullChecker.m81303a(user.state) && NullChecker.m81303a(user.state.jailedBusiness) && NullChecker.m81303a(user.state.jailedBusiness.groupChat)) {
                JailedGroupChat jailedGroupChat = user.state.jailedBusiness.groupChat;
                if (!jailedGroupChat.active || jailedGroupChat.expireTime <= mqi0.m155944o()) {
                    if (chatGroupSilence.enable) {
                    }
                    jM155944o = 0;
                    j = 0;
                    j2 = 0;
                } else {
                    jM155944o = ((long) user.state.jailedBusiness.groupChat.expireTime) - mqi0.m155944o();
                    j = (long) user.state.jailedBusiness.groupChat.expireTime;
                    i = 2;
                    j2 = 0;
                }
            } else if (chatGroupSilence.enable || chatGroupSilence.until <= mqi0.m155944o()) {
                jM155944o = 0;
                j = 0;
                j2 = 0;
            } else {
                jM155944o = ((long) chatGroupSilence.until) - mqi0.m155944o();
                j = (long) chatGroupSilence.until;
                j2 = chatGroupSilence.duration;
                i = 1;
            }
            mkd0.m154992z(this.f116668M0);
            if (jM155944o <= 0) {
                ((o7z) this.viewModel).m163087w2(false);
                return;
            }
            if (mqi0.m155944o() < j) {
                long j5 = j;
                long j6 = j2;
                m140171f8(i, j - mqi0.m155944o(), j5, j6);
                j3 = j5;
                j4 = j6;
            } else {
                j3 = j;
                j4 = j2;
            }
            final int i2 = i;
            this.f116668M0 = duringCreated(C22306c.interval(1L, TimeUnit.SECONDS)).onBackpressureLatest().observeOn(jo0.m142408a()).subscribe(new e30() { // from class: l.z6z
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f201973a.m140169d8(j3, i2, j4, chatSendMessage, chatGroupSilence, user, (Long) obj);
                }
            });
        }
        jM155944o = ((long) chatSendMessage.until) - mqi0.m155944o();
        j = (long) chatSendMessage.until;
        j2 = 0;
        i = 0;
        mkd0.m154992z(this.f116668M0);
        if (jM155944o <= 0) {
            ((o7z) this.viewModel).m163087w2(false);
            return;
        }
        if (mqi0.m155944o() < j) {
            long j7 = j;
            long j8 = j2;
            m140171f8(i, j - mqi0.m155944o(), j7, j8);
            j3 = j7;
            j4 = j8;
        } else {
            j3 = j;
            j4 = j2;
        }
        final int i3 = i;
        this.f116668M0 = duringCreated(C22306c.interval(1L, TimeUnit.SECONDS)).onBackpressureLatest().observeOn(jo0.m142408a()).subscribe(new e30() { // from class: l.z6z
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f201973a.m140169d8(j3, i3, j4, chatSendMessage, chatGroupSilence, user, (Long) obj);
            }
        });
    }

    @Override // p149l.fcz
    /* JADX INFO: renamed from: h4 */
    public boolean mo120779h4() {
        return TextUtils.equals(Constants.VIA_ACT_TYPE_NINETEEN, m120823q3().category.f20363id);
    }

    /* JADX INFO: renamed from: h8 */
    public final void m140173h8() {
        CoreModule.f17545c.f19642f0.m32867Xp(NotificationStatus.get("pending"), NotificationStatus.get("removed"), mo120828r3());
        CoreModule.f17545c.f19642f0.m32867Xp(NotificationStatus.get("ongoing"), NotificationStatus.get("removed"), mo120828r3());
    }

    @Override // p149l.fcz
    /* JADX INFO: renamed from: r3 */
    public String mo120828r3() {
        return this.f116664I0;
    }

    @Override // p149l.fcz
    /* JADX INFO: renamed from: s3 */
    public C22306c<ChatGroup> mo120833s3(String str) {
        return CoreModule.f17545c.f19645g0.m31908o6(str);
    }

    @Override // p149l.fcz
    /* JADX INFO: renamed from: t3 */
    public double mo120838t3() {
        return this.f116665J0;
    }
}
