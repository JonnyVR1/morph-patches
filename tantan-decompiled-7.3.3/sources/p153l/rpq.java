package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveJoinFanBaseContent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, m88121d2 = {"Ll/rpq;", "Ll/o2e0;", "Ll/zit;", "<init>", "()V", "liveRoomScheme", "Ll/gae0;", "plug", "Ll/bae0$b;", "extraInfo", "", "c", "(Ll/zit;Ll/gae0;Ll/bae0$b;)V", "Companion", "a", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class rpq extends o2e0<zit> {
    /* JADX INFO: renamed from: b */
    public static void m182541b(String str, String str2) {
        nsh0.m164608j("[live][schema]", "schema: joinFanbaseAfterSendGift contentJson is " + str + ", result is " + str2);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [l.oo2] */
    @Override // p153l.o2e0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo97254a(@NotNull zit liveRoomScheme, @NotNull gae0 plug, @Nullable bae0.C15954b extraInfo) {
        liveRoomScheme.getClass();
        plug.getClass();
        String strM219937g = liveRoomScheme.m219937g("anchorId");
        String str = plug.m213810E2().m168532l0().f56859id;
        str.getClass();
        if (!Intrinsics.m88377d(str, strM219937g)) {
            nsh0.m164608j("[live][schema]", "schema: joinFanbaseAfterSendGift anchorId is " + strM219937g + ", and real anchorId is " + str + ". return");
            return;
        }
        BLiveJoinFanBaseContent bLiveJoinFanBaseContentNew_ = BLiveJoinFanBaseContent.new_();
        bLiveJoinFanBaseContentNew_.anchorId = strM219937g;
        bLiveJoinFanBaseContentNew_.userId = zrv.f205799a.m207631D0();
        final String json = bLiveJoinFanBaseContentNew_.toJson();
        nsh0.m164608j("[live][schema]", "schema: joinFanbaseAfterSendGift contentJson is " + json);
        plug.m213811F2().LiveBridgeImplEvent.fanBaseController().mo199273j(new drq("joinFanBase", json, new y20() { // from class: l.qpq
            @Override // p153l.y20
            public final void call(Object obj) {
                rpq.m182541b(json, (String) obj);
            }
        }));
    }
}
