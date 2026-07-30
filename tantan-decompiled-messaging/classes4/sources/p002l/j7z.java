package p002l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.ChatGroup;
import com.p1.mobile.putong.core.data.ChatGroupMember;
import com.p1.mobile.putong.core.data.ChatGroupSilence;
import com.p1.mobile.putong.core.data.ChatSendMessage;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.NotificationStatus;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.core.ui.messages.b;
import com.p1.mobile.putong.data.JailedGroupChat;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserLiveLabel;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import l.c4g0;
import l.dg7;
import l.e30;
import l.e51;
import l.fcz;
import l.j760;
import l.jo0;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.ml6;
import l.mqi0;
import l.o7z;
import l.q860;
import l.roj0;
import l.tbk;
import l.w9j;
import l.wl20;
import l.xaj0;
import l.z9j;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class j7z extends fcz<ChatGroup, o7z> {

    /* JADX INFO: renamed from: I0 */
    public String f13626I0;

    /* JADX INFO: renamed from: J0 */
    public double f13627J0;

    /* JADX INFO: renamed from: K0 */
    public final String f13628K0;

    /* JADX INFO: renamed from: L0 */
    public a<roj0> f13629L0;

    /* JADX INFO: renamed from: M0 */
    public c4g0 f13630M0;

    /* JADX INFO: renamed from: N0 */
    public Runnable f13631N0;

    public j7z(mcr mcrVar, Conversation conversation) {
        super(mcrVar);
        this.f13626I0 = "";
        this.f13627J0 = -1.0d;
        this.f13628K0 = "19";
        this.f13629L0 = a.c(roj0.a);
        this.f13631N0 = new Runnable() { // from class: l.a7z
            @Override // java.lang.Runnable
            public final void run() {
                this.f7440a.m15760b8();
            }
        };
        if (NullChecker.a(conversation)) {
            this.f13626I0 = conversation.otherUser;
            if (NullChecker.a(conversation.group) && !ml6.c(conversation)) {
                this.f13627J0 = conversation.group.joinedTime;
            }
            if (this.f13627J0 == 0.0d) {
                this.f13627J0 = -1.0d;
            }
        }
    }

    /* JADX INFO: renamed from: F7 */
    public static /* synthetic */ void m15729F7(Throwable th) {
    }

    /* JADX INFO: renamed from: O7 */
    private void m15734O7() {
        creates(new e30() { // from class: l.u6z
            public final void call(Object obj) {
                this.f20512a.m15756X7((Bundle) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a8 */
    public /* synthetic */ void m15735a8(Bundle bundle) {
        m15749R7();
    }

    /* JADX INFO: renamed from: y7 */
    public static /* synthetic */ xaj0 m15740y7(ChatSendMessage chatSendMessage, ChatGroupMember chatGroupMember, User user, roj0 roj0Var) {
        return new xaj0(chatSendMessage, chatGroupMember, user);
    }

    /* JADX INFO: renamed from: z7 */
    public static /* synthetic */ void m15741z7(Bundle bundle) {
    }

    /* JADX INFO: renamed from: A3 */
    public String m15742A3() {
        ChatGroup chatGroupS6 = CoreModule.c.g0.s6(m15769r3());
        return (NullChecker.a(chatGroupS6) && TEnum.equals(chatGroupS6.groupType, "anonymous")) ? "chat_group_anonymity" : super.A3();
    }

    /* JADX INFO: renamed from: K7 */
    public final void m15743K7() {
        duringCreated(c.combineLatest(CoreModule.c.g0.o6(m15769r3()).map(new w9j() { // from class: l.g7z
            public final Object call(Object obj) {
                return ((ChatGroup) obj).punishment.sendMessage;
            }
        }).distinctUntilChanged(), CoreModule.c.g0.T6(m15769r3(), CoreModule.H().userId()).filter(new dg7()), CoreModule.c.e0.o9(), this.f13629L0, new z9j() { // from class: l.h7z
            /* JADX INFO: renamed from: b */
            public final Object m14280b(Object obj, Object obj2, Object obj3, Object obj4) {
                return j7z.m15740y7((ChatSendMessage) obj, (ChatGroupMember) obj2, (User) obj3, (roj0) obj4);
            }
        })).subscribe(new e30() { // from class: l.i7z
            public final void call(Object obj) {
                this.f13092a.m15750S7((xaj0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: L7 */
    public final void m15744L7() {
        duringCreated(CoreModule.c.g0.y6()).filter(new w9j() { // from class: l.x6z
            public final Object call(Object obj) {
                return this.f22150a.m15751T7((roj0) obj);
            }
        }).take(1).subscribe(mkd0.G(new e30() { // from class: l.y6z
            public final void call(Object obj) {
                this.f22716a.m15752U7((roj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: M7 */
    public final void m15745M7() {
        duringCreated(CoreModule.c.g0.R6()).subscribe(mkd0.G(new e30() { // from class: l.f7z
            public final void call(Object obj) {
                this.f10184a.m15754V7((Integer) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N7 */
    public final void m15746N7() {
        if (!CoreModule.P().i().D() || User.isTeamAccount(m15769r3())) {
            return;
        }
        duringCreated(mkd0.r(CoreModule.c.f0.Ne(i3()), CoreModule.c.f0.Un(i3(), m15771t3()), new wl20())).subscribe(mkd0.G(new e30() { // from class: l.d7z
            public final void call(Object obj) {
                this.f9093a.m15755W7((j760) obj);
            }
        }));
        creates(new e30() { // from class: l.e7z
            public final void call(Object obj) {
                j7z.m15741z7((Bundle) obj);
            }
        }, new hfz());
    }

    /* JADX INFO: renamed from: P7 */
    public final void m15747P7() {
        duringCreated(CoreModule.c.g0.T6(m15769r3(), CoreModule.H().userId()).filter(new dg7())).subscribe(mkd0.G(new e30() { // from class: l.w6z
            public final void call(Object obj) {
                this.f21545a.m15757Y7((ChatGroupMember) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Q7 */
    public final void m15748Q7() {
        lifecycle().subscribe(mkd0.G(new e30() { // from class: l.v6z
            public final void call(Object obj) {
                this.f21022a.m15758Z7((com.p1.mobile.android.app.c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: R7 */
    public final void m15749R7() {
        LinkedHashMap linkedHashMapZg;
        UserLiveLabel userLiveLabel;
        ChatGroup chatGroupH7 = CoreModule.c.g0.h7(m15769r3());
        if (chatGroupH7 == null || !CoreModule.P().i().p() || chatGroupH7.ownerUserId.equals(((DbObject) CoreModule.K().me_()).id) || (linkedHashMapZg = CoreModule.c.f0.zg(false)) == null || linkedHashMapZg.isEmpty() || (userLiveLabel = (UserLiveLabel) linkedHashMapZg.get(chatGroupH7.ownerUserId)) == null) {
            return;
        }
        if (("onVoice".equals(userLiveLabel.liveState) || "onLive".equals(userLiveLabel.liveState)) && m15769r3().equals(userLiveLabel.groupId)) {
            ((jq2) this).viewModel.Y1(chatGroupH7.category.id, m15769r3());
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0040  */
    /* JADX INFO: renamed from: S7 */
    public final /* synthetic */ void m15750S7(xaj0 xaj0Var) {
        boolean z;
        mkd0.z(this.f13630M0);
        User user = (User) xaj0Var.c;
        boolean z2 = true;
        if (NullChecker.a(user.state) && NullChecker.a(user.state.jailedBusiness) && NullChecker.a(user.state.jailedBusiness.groupChat)) {
            JailedGroupChat jailedGroupChat = user.state.jailedBusiness.groupChat;
            if (!jailedGroupChat.active || jailedGroupChat.expireTime <= mqi0.o()) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        ChatGroupMember chatGroupMember = (ChatGroupMember) xaj0Var.b;
        if (TEnum.equals(chatGroupMember.status, "exited")) {
            ((jq2) this).viewModel.w2(false);
            return;
        }
        if (!((ChatSendMessage) xaj0Var.a).active && !chatGroupMember.silence.enable && !z) {
            z2 = false;
        }
        ((jq2) this).viewModel.w2(z2);
        if (z2) {
            m15766g8((ChatSendMessage) xaj0Var.a, chatGroupMember.silence, (User) xaj0Var.c);
        }
    }

    /* JADX INFO: renamed from: T7 */
    public final /* synthetic */ Boolean m15751T7(roj0 roj0Var) {
        return Boolean.valueOf(!NullChecker.a(CoreModule.c.g0.h7(m15769r3())));
    }

    /* JADX INFO: renamed from: U7 */
    public final /* synthetic */ void m15752U7(roj0 roj0Var) {
        act().finish();
    }

    /* JADX INFO: renamed from: V2 */
    public boolean m15753V2() {
        return !m15767h4();
    }

    /* JADX INFO: renamed from: V7 */
    public final /* synthetic */ void m15754V7(Integer num) {
        m15764e8();
    }

    /* JADX INFO: renamed from: W7 */
    public final /* synthetic */ void m15755W7(j760 j760Var) {
        if (b.l((Conversation) j760Var.a, ((q860) j760Var.b).a, 10, ((fcz) this).n)) {
            e51.H(act(), this.f13631N0, 500L);
            s7(false);
        }
    }

    /* JADX INFO: renamed from: X7 */
    public final /* synthetic */ void m15756X7(Bundle bundle) {
        ((jq2) this).viewModel.q2();
    }

    /* JADX INFO: renamed from: Y7 */
    public final /* synthetic */ void m15757Y7(ChatGroupMember chatGroupMember) {
        ((jq2) this).viewModel.z2((TEnum.equals(chatGroupMember.status, "exited") || m15767h4()) ? false : true);
    }

    /* JADX INFO: renamed from: Z7 */
    public final /* synthetic */ void m15758Z7(com.p1.mobile.android.app.c cVar) {
        if ((cVar == com.p1.mobile.android.app.c.f || cVar == com.p1.mobile.android.app.c.j) && NullChecker.a(i3())) {
            s7(true);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m15759a0() {
        super.a0();
        CoreModule.c.f0.dn(i3());
        m15748Q7();
        m15746N7();
        m15743K7();
        m15764e8();
        m15745M7();
        m15747P7();
        creates(new e30() { // from class: l.t6z
            public final void call(Object obj) {
                this.f20114a.m15735a8((Bundle) obj);
            }
        });
        m15768h8();
        m15744L7();
        m15734O7();
    }

    /* JADX INFO: renamed from: b8 */
    public final /* synthetic */ void m15760b8() {
        ((jq2) this).viewModel.C1();
    }

    /* JADX INFO: renamed from: c8 */
    public final /* synthetic */ void m15761c8(roj0 roj0Var) {
        ChatGroup chatGroupS6 = CoreModule.c.g0.s6(m15769r3());
        uly ulyVarE = e0().E();
        if (NullChecker.a(ulyVarE) && NullChecker.a(chatGroupS6) && (ulyVarE instanceof dmy)) {
            ((dmy) ulyVarE).m11975I0(chatGroupS6);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006e, code lost:
    
        if (r10.expireTime > l.mqi0.o()) goto L26;
     */
    /* JADX INFO: renamed from: d8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void m15762d8(long r9, int r11, long r12, com.p1.mobile.putong.core.data.ChatSendMessage r14, com.p1.mobile.putong.core.data.ChatGroupSilence r15, com.p1.mobile.putong.data.User r16, java.lang.Long r17) {
        /*
            r8 = this;
            r0 = r16
            long r1 = l.mqi0.o()
            int r1 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r1 >= 0) goto L18
            long r14 = l.mqi0.o()
            long r2 = r9 - r14
            r0 = r8
            r4 = r9
            r1 = r11
            r6 = r12
            r0.m15765f8(r1, r2, r4, r6)
            return
        L18:
            l.c4g0 r10 = r8.f13630M0
            l.mkd0.z(r10)
            boolean r10 = r14.active
            if (r10 == 0) goto L2d
            long r10 = l.mqi0.o()
            double r10 = (double) r10
            double r12 = r14.until
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L2d
            goto L70
        L2d:
            boolean r10 = r15.enable
            if (r10 == 0) goto L3d
            long r10 = l.mqi0.o()
            double r10 = (double) r10
            double r12 = r15.until
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L3d
            goto L70
        L3d:
            com.p1.mobile.putong.data.UserState r10 = r0.state
            boolean r10 = com.tantanapp.common.utils.NullChecker.a(r10)
            if (r10 == 0) goto L78
            com.p1.mobile.putong.data.UserState r10 = r0.state
            com.p1.mobile.putong.data.JailedBusiness r10 = r10.jailedBusiness
            boolean r10 = com.tantanapp.common.utils.NullChecker.a(r10)
            if (r10 == 0) goto L78
            com.p1.mobile.putong.data.UserState r10 = r0.state
            com.p1.mobile.putong.data.JailedBusiness r10 = r10.jailedBusiness
            com.p1.mobile.putong.data.JailedGroupChat r10 = r10.groupChat
            boolean r10 = com.tantanapp.common.utils.NullChecker.a(r10)
            if (r10 == 0) goto L78
            com.p1.mobile.putong.data.UserState r10 = r0.state
            com.p1.mobile.putong.data.JailedBusiness r10 = r10.jailedBusiness
            com.p1.mobile.putong.data.JailedGroupChat r10 = r10.groupChat
            boolean r11 = r10.active
            if (r11 == 0) goto L78
            double r10 = r10.expireTime
            long r12 = l.mqi0.o()
            double r12 = (double) r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 <= 0) goto L78
        L70:
            rx.subjects.a<l.roj0> r8 = r8.f13629L0
            l.roj0 r9 = l.roj0.a
            r8.onNext(r9)
            return
        L78:
            l.s7m r10 = r8.viewModel
            l.o7z r10 = (l.o7z) r10
            r11 = 0
            r10.w2(r11)
            r8.m15764e8()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p002l.j7z.m15762d8(long, int, long, com.p1.mobile.putong.core.data.ChatSendMessage, com.p1.mobile.putong.core.data.ChatGroupSilence, com.p1.mobile.putong.data.User, java.lang.Long):void");
    }

    /* JADX INFO: renamed from: e4 */
    public boolean m15763e4() {
        return true;
    }

    /* JADX INFO: renamed from: e8 */
    public final void m15764e8() {
        duringCreated(CoreModule.c.g0.X8(m15769r3())).subscribe(mkd0.H(new e30() { // from class: l.b7z
            public final void call(Object obj) {
                this.f8029a.m15761c8((roj0) obj);
            }
        }, new e30() { // from class: l.c7z
            public final void call(Object obj) {
                j7z.m15729F7((Throwable) obj);
            }
        }));
        CoreModule.c.g0.Q8(m15769r3());
        CoreModule.c.e0.W9(CoreModule.H().userId());
        CoreModule.c.g0.Z8(m15769r3(), CoreModule.H().userId());
    }

    /* JADX INFO: renamed from: f8 */
    public final void m15765f8(int i, long j, long j2, long j3) {
        long j4 = j / 1000;
        long j5 = j3 / 60;
        if (i == 0) {
            String str = tbk.a.format(new Date(j2));
            ((jq2) this).viewModel.u2(act().getString(R.string.h0, str.substring(0, 4), str.substring(5, 7), str.substring(8, 10)));
        } else if (i == 2) {
            Date date = new Date(j2);
            ((jq2) this).viewModel.u2("您的账号收到多条举报，经平台核实确定违规，将于 " + mqi0.e.format(date) + " 解除禁言。");
        } else if (i == 1) {
            o7z o7zVar = ((jq2) this).viewModel;
            if (j4 < 60) {
                o7zVar.u2(act().getString(R.string.B, Math.max(1L, j4) + ""));
            } else {
                o7zVar.u2(act().getString(R.string.A, String.valueOf(j5)));
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
    public final void m15766g8(final ChatSendMessage chatSendMessage, final ChatGroupSilence chatGroupSilence, final User user) {
        long jO;
        long j;
        long j2;
        int i;
        final long j3;
        final long j4;
        if (!chatSendMessage.active || chatSendMessage.until <= mqi0.o()) {
            if (NullChecker.a(user.state) && NullChecker.a(user.state.jailedBusiness) && NullChecker.a(user.state.jailedBusiness.groupChat)) {
                JailedGroupChat jailedGroupChat = user.state.jailedBusiness.groupChat;
                if (!jailedGroupChat.active || jailedGroupChat.expireTime <= mqi0.o()) {
                    if (chatGroupSilence.enable) {
                    }
                    jO = 0;
                    j = 0;
                    j2 = 0;
                } else {
                    jO = ((long) user.state.jailedBusiness.groupChat.expireTime) - mqi0.o();
                    j = (long) user.state.jailedBusiness.groupChat.expireTime;
                    i = 2;
                    j2 = 0;
                }
            } else if (chatGroupSilence.enable || chatGroupSilence.until <= mqi0.o()) {
                jO = 0;
                j = 0;
                j2 = 0;
            } else {
                jO = ((long) chatGroupSilence.until) - mqi0.o();
                j = (long) chatGroupSilence.until;
                j2 = chatGroupSilence.duration;
                i = 1;
            }
            mkd0.z(this.f13630M0);
            if (jO <= 0) {
                ((jq2) this).viewModel.w2(false);
                return;
            }
            if (mqi0.o() < j) {
                long j5 = j;
                long j6 = j2;
                m15765f8(i, j - mqi0.o(), j5, j6);
                j3 = j5;
                j4 = j6;
            } else {
                j3 = j;
                j4 = j2;
            }
            final int i2 = i;
            this.f13630M0 = duringCreated(c.interval(1L, TimeUnit.SECONDS)).onBackpressureLatest().observeOn(jo0.a()).subscribe(new e30() { // from class: l.z6z
                public final void call(Object obj) {
                    this.f23285a.m15762d8(j3, i2, j4, chatSendMessage, chatGroupSilence, user, (Long) obj);
                }
            });
        }
        jO = ((long) chatSendMessage.until) - mqi0.o();
        j = (long) chatSendMessage.until;
        j2 = 0;
        i = 0;
        mkd0.z(this.f13630M0);
        if (jO <= 0) {
            ((jq2) this).viewModel.w2(false);
            return;
        }
        if (mqi0.o() < j) {
            long j7 = j;
            long j8 = j2;
            m15765f8(i, j - mqi0.o(), j7, j8);
            j3 = j7;
            j4 = j8;
        } else {
            j3 = j;
            j4 = j2;
        }
        final int i3 = i;
        this.f13630M0 = duringCreated(c.interval(1L, TimeUnit.SECONDS)).onBackpressureLatest().observeOn(jo0.a()).subscribe(new e30() { // from class: l.z6z
            public final void call(Object obj) {
                this.f23285a.m15762d8(j3, i3, j4, chatSendMessage, chatGroupSilence, user, (Long) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h4 */
    public boolean m15767h4() {
        return TextUtils.equals("19", ((ChatGroup) q3()).category.id);
    }

    /* JADX INFO: renamed from: h8 */
    public final void m15768h8() {
        CoreModule.c.f0.Xp(NotificationStatus.get("pending"), NotificationStatus.get("removed"), m15769r3());
        CoreModule.c.f0.Xp(NotificationStatus.get("ongoing"), NotificationStatus.get("removed"), m15769r3());
    }

    /* JADX INFO: renamed from: r3 */
    public String m15769r3() {
        return this.f13626I0;
    }

    /* JADX INFO: renamed from: s3 */
    public c<ChatGroup> m15770s3(String str) {
        return CoreModule.c.g0.o6(str);
    }

    /* JADX INFO: renamed from: t3 */
    public double m15771t3() {
        return this.f13627J0;
    }
}
