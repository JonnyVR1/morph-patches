package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\f\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0013\u001a\u00020\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m88121d2 = {"Ll/gf10;", "Ll/jk2;", "Lcom/p1/mobile/longlink/msg/liveroom/LongLinkMultiCallMessage$MultiCallSwitchToLeadRoleInviteMessage;", "Ll/wbg0;", "subject", "Ll/zod;", "param", "<init>", "(Ll/wbg0;Ll/zod;)V", "", "msgId", "message", c4s.C_ZONE, "(Ljava/lang/String;Lcom/p1/mobile/longlink/msg/liveroom/LongLinkMultiCallMessage$MultiCallSwitchToLeadRoleInviteMessage;)Lcom/p1/mobile/longlink/msg/liveroom/LongLinkMultiCallMessage$MultiCallSwitchToLeadRoleInviteMessage;", "Ljava/lang/Class;", "b", "()Ljava/lang/Class;", "userId", "", "B", "(Lcom/p1/mobile/longlink/msg/liveroom/LongLinkMultiCallMessage$MultiCallSwitchToLeadRoleInviteMessage;Ljava/lang/String;)Z", "e", "()Ljava/lang/String;", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class gf10 extends jk2<LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInviteMessage, LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInviteMessage> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gf10(@NotNull wbg0<LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInviteMessage, LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInviteMessage> wbg0Var, @NotNull zod zodVar) {
        super(wbg0Var, zodVar);
        wbg0Var.getClass();
        zodVar.getClass();
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(@Nullable LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInviteMessage message, @Nullable String userId) {
        return true;
    }

    @Override // p153l.jk2
    @NotNull
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInviteMessage mo95993z(@Nullable String msgId, @NotNull LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInviteMessage message) {
        message.getClass();
        return message;
    }

    @Override // p153l.mq2, p153l.fxl
    @NotNull
    /* JADX INFO: renamed from: b */
    public Class<LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInviteMessage> mo95510b() {
        return LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInviteMessage.class;
    }

    @Override // p153l.mq2
    @NotNull
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.live.multi.call.switch.to.lead.role.invite";
    }
}
