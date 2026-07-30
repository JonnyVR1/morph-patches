package p149l;

import com.p046p1.mobile.putong.live.base.api.LiveApiBuilder;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftDetail;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m87232d2 = {"Ll/jrl0;", "", "<init>", "()V", "", "giftId", "Lrx/c;", "", "Lcom/p1/mobile/putong/live/base/data/BLiveGiftDetail;", "c", "(Ljava/lang/String;)Lrx/c;", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class jrl0 {

    @NotNull
    public static final jrl0 INSTANCE = new jrl0();

    /* JADX INFO: renamed from: a */
    public static List m142968a(BLiveEnvelope bLiveEnvelope) {
        bLiveEnvelope.getClass();
        return bLiveEnvelope.data.giftDetails;
    }

    /* JADX INFO: renamed from: b */
    public static List m142969b(Function1 function1, Object obj) {
        return (List) function1.invoke(obj);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final C22306c<List<BLiveGiftDetail>> m142970c(@NotNull String giftId) {
        giftId.getClass();
        C22306c<BLiveEnvelope> c22306cM194935w = upv.m194935w(LiveApiBuilder.m67315u(ytr.m216076e("/voice-gift/" + giftId), new mt0[0]).m107524p().m107537d(), "requestCpGiftDetail" + giftId);
        final Function1 function1 = new Function1() { // from class: l.hrl0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return jrl0.m142968a((BLiveEnvelope) obj);
            }
        };
        C22306c map = c22306cM194935w.map(new w9j() { // from class: l.irl0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return jrl0.m142969b(function1, obj);
            }
        });
        map.getClass();
        return map;
    }
}
