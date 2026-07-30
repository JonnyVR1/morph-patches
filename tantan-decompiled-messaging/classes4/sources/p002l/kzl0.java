package p002l;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l.vwb;
import l.ygt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ll/kzl0;", "Ll/kud0;", "Ll/ygt;", "<init>", "()V", "liveRoomScheme", "Ll/c2e0;", "plug", "Ll/x1e0$b;", "extraInfo", "", "b", "(Ll/ygt;Ll/c2e0;Ll/x1e0$b;)V", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class kzl0 extends kud0<ygt> {
    /* JADX WARN: Type inference failed for: r0v5, types: [l.ho2] */
    @Override // p002l.kud0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo9496a(@NotNull ygt liveRoomScheme, @NotNull c2e0 plug, @Nullable x1e0.C0892b extraInfo) {
        liveRoomScheme.getClass();
        plug.getClass();
        String strG = liveRoomScheme.g("userId");
        if (strG == null) {
            strG = plug.m25547E2().m14576j0();
        }
        plug.m25548F2().GiftWallDialogEvent.showLocalGiftWallDialog().j(vwb.Y(strG, Integer.valueOf(!Intrinsics.d("gift", liveRoomScheme.g("tab")) ? 1 : 0)));
    }
}
