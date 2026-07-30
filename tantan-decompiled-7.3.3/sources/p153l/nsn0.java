package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000e\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0012\u001a\u00020\u00112\b\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R#\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m88121d2 = {"Ll/nsn0;", "Ll/jk2;", "Lcom/p1/mobile/longlink/msg/liveroom/LongLinkVoiceKtv$VoiceKTVOrderRating;", "Ll/wbg0;", "subject", "Ll/zod;", "param", "<init>", "(Ll/wbg0;Ll/zod;)V", "", "e", "()Ljava/lang/String;", "msgId", "message", c4s.C_ZONE, "(Ljava/lang/String;Lcom/p1/mobile/longlink/msg/liveroom/LongLinkVoiceKtv$VoiceKTVOrderRating;)Lcom/p1/mobile/longlink/msg/liveroom/LongLinkVoiceKtv$VoiceKTVOrderRating;", "userId", "", "B", "(Lcom/p1/mobile/longlink/msg/liveroom/LongLinkVoiceKtv$VoiceKTVOrderRating;Ljava/lang/String;)Z", "Ljava/lang/Class;", "b", "()Ljava/lang/Class;", "h", "Ll/wbg0;", "getSubject", "()Ll/wbg0;", RXScreenCaptureService.KEY_INDEX, "Ll/zod;", "getParam", "()Ll/zod;", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class nsn0 extends jk2<LongLinkVoiceKtv.VoiceKTVOrderRating, LongLinkVoiceKtv.VoiceKTVOrderRating> {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final wbg0<LongLinkVoiceKtv.VoiceKTVOrderRating, LongLinkVoiceKtv.VoiceKTVOrderRating> subject;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final zod param;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nsn0(@NotNull wbg0<LongLinkVoiceKtv.VoiceKTVOrderRating, LongLinkVoiceKtv.VoiceKTVOrderRating> wbg0Var, @NotNull zod zodVar) {
        super(wbg0Var, zodVar);
        wbg0Var.getClass();
        zodVar.getClass();
        this.subject = wbg0Var;
        this.param = zodVar;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(@Nullable LongLinkVoiceKtv.VoiceKTVOrderRating message, @Nullable String userId) {
        return true;
    }

    @Override // p153l.jk2
    @NotNull
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkVoiceKtv.VoiceKTVOrderRating mo95993z(@Nullable String msgId, @NotNull LongLinkVoiceKtv.VoiceKTVOrderRating message) {
        message.getClass();
        return message;
    }

    @Override // p153l.mq2, p153l.fxl
    @NotNull
    /* JADX INFO: renamed from: b */
    public Class<LongLinkVoiceKtv.VoiceKTVOrderRating> mo95510b() {
        return LongLinkVoiceKtv.VoiceKTVOrderRating.class;
    }

    @Override // p153l.mq2
    @NotNull
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "voicetrick.ktv.orderRating";
    }
}
