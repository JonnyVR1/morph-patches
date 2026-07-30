package p002l;

import com.p1.mobile.longlink.msg.livegift.LongLinkConfession;
import kotlin.Metadata;
import l.p3g0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000e\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0012\u001a\u00020\u00112\b\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R#\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Ll/ues;", "Ll/bk2;", "Lcom/p1/mobile/longlink/msg/livegift/LongLinkConfession$ConfessionGiftReceiveMsg;", "Ll/p3g0;", "subject", "Ll/und;", "param", "<init>", "(Ll/p3g0;Ll/und;)V", "", "e", "()Ljava/lang/String;", "msgId", "message", "C", "(Ljava/lang/String;Lcom/p1/mobile/longlink/msg/livegift/LongLinkConfession$ConfessionGiftReceiveMsg;)Lcom/p1/mobile/longlink/msg/livegift/LongLinkConfession$ConfessionGiftReceiveMsg;", "userId", "", "B", "(Lcom/p1/mobile/longlink/msg/livegift/LongLinkConfession$ConfessionGiftReceiveMsg;Ljava/lang/String;)Z", "Ljava/lang/Class;", "b", "()Ljava/lang/Class;", "h", "Ll/p3g0;", "getSubject", "()Ll/p3g0;", "i", "Ll/und;", "getParam", "()Ll/und;", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ues extends bk2<LongLinkConfession.ConfessionGiftReceiveMsg, LongLinkConfession.ConfessionGiftReceiveMsg> {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final p3g0<LongLinkConfession.ConfessionGiftReceiveMsg, LongLinkConfession.ConfessionGiftReceiveMsg> subject;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final und param;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ues(@NotNull p3g0<LongLinkConfession.ConfessionGiftReceiveMsg, LongLinkConfession.ConfessionGiftReceiveMsg> p3g0Var, @NotNull und undVar) {
        super(p3g0Var, undVar);
        p3g0Var.getClass();
        undVar.getClass();
        this.subject = p3g0Var;
        this.param = undVar;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(@Nullable LongLinkConfession.ConfessionGiftReceiveMsg message, @Nullable String userId) {
        return true;
    }

    @Override // p002l.bk2
    @NotNull
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkConfession.ConfessionGiftReceiveMsg mo9251z(@Nullable String msgId, @NotNull LongLinkConfession.ConfessionGiftReceiveMsg message) {
        message.getClass();
        return message;
    }

    @Override // p002l.vp2
    @NotNull
    /* JADX INFO: renamed from: b */
    public Class<LongLinkConfession.ConfessionGiftReceiveMsg> mo9244b() {
        return LongLinkConfession.ConfessionGiftReceiveMsg.class;
    }

    @Override // p002l.vp2
    @NotNull
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.gift.confessionreceive";
    }
}
