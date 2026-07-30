package p153l;

import com.facebook.AuthenticationTokenClaims;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JT\u0010\u0011\u001a\u00020\u000f2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2#\u0010\u0010\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\nH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m88121d2 = {"Ll/toe0;", "", "<init>", "()V", "Ll/y8s;", "presenter", "Lcom/p1/mobile/putong/live/base/data/BLiveGiftItem;", "giftItem", "", "receiverId", "Lkotlin/Function1;", "Ll/stj;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "interceptorWrapperData", "", "sendGiftAction", "b", "(Ll/y8s;Lcom/p1/mobile/putong/live/base/data/BLiveGiftItem;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "Ll/uoe0;", "sendGiftRequestInfo", "a", "(Ll/uoe0;Ll/stj;)V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class toe0 {

    @NotNull
    public static final toe0 INSTANCE = new toe0();

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m192020a(@NotNull uoe0 sendGiftRequestInfo, @NotNull stj interceptorWrapperData) {
        sendGiftRequestInfo.getClass();
        interceptorWrapperData.getClass();
        sendGiftRequestInfo.f180042E = interceptorWrapperData;
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final void m192021b(@NotNull y8s<?, ?> presenter, @NotNull BLiveGiftItem giftItem, @NotNull String receiverId, @NotNull Function1<? super stj, Unit> sendGiftAction) {
        presenter.getClass();
        giftItem.getClass();
        receiverId.getClass();
        sendGiftAction.getClass();
        if (au5.INSTANCE.m100361e(giftItem)) {
            au5.m100359f(presenter, giftItem, receiverId, sendGiftAction);
            return;
        }
        if (vd60.m200916l(giftItem)) {
            vd60.INSTANCE.m200923m(presenter, giftItem, sendGiftAction);
        } else if (n9t.m162045b(presenter, giftItem)) {
            n9t.m162046c(presenter);
        } else {
            sendGiftAction.invoke(null);
        }
    }
}
