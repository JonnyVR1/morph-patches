package p002l;

import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p1.mobile.putong.live.livingroom.virtual.api.VirtualVoiceRoomApiProvider;
import kotlin.Metadata;
import l.e30;
import l.ffw;
import l.lsi0;
import l.oem0;
import l.xtr;
import l.ygt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0010\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Ll/emo0;", "Ll/kud0;", "Ll/ygt;", "<init>", "()V", "liveRoomScheme", "Ll/c2e0;", "plug", "Ll/x1e0$b;", "extraInfo", "", "e", "(Ll/ygt;Ll/c2e0;Ll/x1e0$b;)V", "plugin", "", "message", "f", "(Ll/c2e0;Ljava/lang/String;)V", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class emo0 extends kud0<ygt> {
    /* JADX INFO: renamed from: b */
    public static void m12616b(BLiveEnvelope bLiveEnvelope) {
        lsi0.y(bLiveEnvelope.meta.message);
    }

    /* JADX INFO: renamed from: d */
    public static void m12618d(emo0 emo0Var, c2e0 c2e0Var, Throwable th) {
        if (xtr.b(60043, th)) {
            emo0Var.m12621f(c2e0Var, xtr.a(th));
        } else {
            xtr.c(th);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m12619g(c2e0 c2e0Var) {
        c2e0Var.m25548F2().VoiceApplyManagerEvent.show().j(new oem0(0));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [l.ho2, l.lh20] */
    @Override // p002l.kud0
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo9496a(@NotNull ygt liveRoomScheme, @NotNull final c2e0 plug, @Nullable x1e0.C0892b extraInfo) {
        liveRoomScheme.getClass();
        plug.getClass();
        String strM17239o = plug.m25547E2().m17239o();
        strM17239o.getClass();
        plug.duringCreated(VirtualVoiceRoomApiProvider.createStarRedPacket(strM17239o)).subscribe(ffw.e(new e30() { // from class: l.bmo0
            public final void call(Object obj) {
                emo0.m12616b((BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.cmo0
            public final void call(Object obj) {
                emo0.m12618d(this.f8752a, plug, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f */
    public final void m12621f(final c2e0 plugin, String message) {
        Act act = plugin.act();
        if (act != null) {
            act.dialog().F(message).m0("知道了").v0("邀请好友", new Runnable() { // from class: l.dmo0
                @Override // java.lang.Runnable
                public final void run() {
                    emo0.m12619g(plugin);
                }
            }).B(false).z().show();
        }
    }
}
