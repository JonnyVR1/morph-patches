package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveJoinFanBaseContent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, m87232d2 = {"Ll/snq;", "Ll/kud0;", "Ll/ygt;", "<init>", "()V", "liveRoomScheme", "Ll/c2e0;", "plug", "Ll/x1e0$b;", "extraInfo", "", "c", "(Ll/ygt;Ll/c2e0;Ll/x1e0$b;)V", "Companion", "a", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class snq extends kud0<ygt> {
    /* JADX INFO: renamed from: b */
    public static void m185190b(String str, String str2) {
        gkh0.m126627j("[live][schema]", "schema: joinFanbaseAfterSendGift contentJson is " + str + ", result is " + str2);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [l.ho2] */
    @Override // p149l.kud0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo95830a(@NotNull ygt liveRoomScheme, @NotNull c2e0 plug, @Nullable x1e0.C21019b extraInfo) {
        liveRoomScheme.getClass();
        plug.getClass();
        String strM214763g = liveRoomScheme.m214763g("anchorId");
        String str = plug.m206027E2().m132146l0().f56011id;
        str.getClass();
        if (!Intrinsics.m87488d(str, strM214763g)) {
            gkh0.m126627j("[live][schema]", "schema: joinFanbaseAfterSendGift anchorId is " + strM214763g + ", and real anchorId is " + str + ". return");
            return;
        }
        BLiveJoinFanBaseContent bLiveJoinFanBaseContentNew_ = BLiveJoinFanBaseContent.new_();
        bLiveJoinFanBaseContentNew_.anchorId = strM214763g;
        bLiveJoinFanBaseContentNew_.userId = ypv.f199493a.m199309D0();
        final String json = bLiveJoinFanBaseContentNew_.toJson();
        gkh0.m126627j("[live][schema]", "schema: joinFanbaseAfterSendGift contentJson is " + json);
        plug.m206028F2().LiveBridgeImplEvent.fanBaseController().mo172463j(new dpq("joinFanBase", json, new e30() { // from class: l.rnq
            @Override // p149l.e30
            public final void call(Object obj) {
                snq.m185190b(json, (String) obj);
            }
        }));
    }
}
