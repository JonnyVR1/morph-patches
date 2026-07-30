package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B#\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m88121d2 = {"Ll/iom0;", "Ll/jk2;", "Lcom/p1/mobile/longlink/msg/liveroom/LongLinkVoiceAuctionMessage$VoiceLiveAuctionChange;", "Ll/d3v;", "Ll/wbg0;", "subject", "Ll/zod;", "param", "<init>", "(Ll/wbg0;Ll/zod;)V", "", "msgId", "message", c4s.C_ZONE, "(Ljava/lang/String;Lcom/p1/mobile/longlink/msg/liveroom/LongLinkVoiceAuctionMessage$VoiceLiveAuctionChange;)Ll/d3v;", "Ljava/lang/Class;", "b", "()Ljava/lang/Class;", "userId", "", "B", "(Lcom/p1/mobile/longlink/msg/liveroom/LongLinkVoiceAuctionMessage$VoiceLiveAuctionChange;Ljava/lang/String;)Z", "e", "()Ljava/lang/String;", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class iom0 extends jk2<LongLinkVoiceAuctionMessage.VoiceLiveAuctionChange, d3v> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iom0(@NotNull wbg0<d3v, d3v> wbg0Var, @NotNull zod zodVar) {
        super(wbg0Var, zodVar);
        wbg0Var.getClass();
        zodVar.getClass();
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(@NotNull LongLinkVoiceAuctionMessage.VoiceLiveAuctionChange message, @Nullable String userId) {
        message.getClass();
        return true;
    }

    @Override // p153l.jk2
    @NotNull
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public d3v mo95993z(@NotNull String msgId, @NotNull LongLinkVoiceAuctionMessage.VoiceLiveAuctionChange message) {
        msgId.getClass();
        message.getClass();
        return new d3v(message);
    }

    @Override // p153l.mq2, p153l.fxl
    @NotNull
    /* JADX INFO: renamed from: b */
    public Class<LongLinkVoiceAuctionMessage.VoiceLiveAuctionChange> mo95510b() {
        return LongLinkVoiceAuctionMessage.VoiceLiveAuctionChange.class;
    }

    @Override // p153l.mq2
    @NotNull
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "voicelive.auction.info";
    }
}
