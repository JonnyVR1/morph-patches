package p002l;

import android.text.TextUtils;
import com.p1.mobile.putong.live.base.data.BLiveVoiceLivePush;
import com.p1.mobile.putong.live.livingroom.virtual.api.VirtualVoiceRoomApiProvider;
import kotlin.Metadata;
import l.e30;
import l.fbp0;
import l.ffw;
import l.lsi0;
import l.r610;
import l.ygt;
import l.ypv;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ll/o5o0;", "Ll/kud0;", "Ll/ygt;", "<init>", "()V", "liveRoomScheme", "Ll/c2e0;", "plug", "Ll/x1e0$b;", "extraInfo", "", "d", "(Ll/ygt;Ll/c2e0;Ll/x1e0$b;)V", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o5o0 extends kud0<ygt> {
    /* JADX INFO: renamed from: e */
    public static final void m19222e(BLiveVoiceLivePush bLiveVoiceLivePush) {
        if (TextUtils.isEmpty(bLiveVoiceLivePush.message)) {
            return;
        }
        lsi0.y(bLiveVoiceLivePush.message);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final void m19223f(Throwable th) {
        th.getClass();
        r610.j(th);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [l.ho2, l.lh20] */
    @Override // p002l.kud0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo9496a(@NotNull ygt liveRoomScheme, @NotNull c2e0 plug, @Nullable x1e0.C0892b extraInfo) {
        liveRoomScheme.getClass();
        plug.getClass();
        if (plug.act() != null) {
            String strD0 = ypv.a.D0();
            fbp0.p(plug);
            strD0.getClass();
            String strM17235k = plug.m25547E2().m17235k();
            strM17235k.getClass();
            plug.duringCreated(VirtualVoiceRoomApiProvider.notifyFans(strD0, strM17235k)).subscribe(ffw.e(new e30() { // from class: l.m5o0
                public final void call(Object obj) {
                    o5o0.m19222e((BLiveVoiceLivePush) obj);
                }
            }, new e30() { // from class: l.n5o0
                public final void call(Object obj) {
                    o5o0.m19223f((Throwable) obj);
                }
            }));
        }
    }
}
