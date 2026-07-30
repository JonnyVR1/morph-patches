package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.livingroom.virtual.api.VirtualVoiceRoomApiProvider;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0010\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m88121d2 = {"Ll/ivo0;", "Ll/o2e0;", "Ll/zit;", "<init>", "()V", "liveRoomScheme", "Ll/gae0;", "plug", "Ll/bae0$b;", "extraInfo", "", "e", "(Ll/zit;Ll/gae0;Ll/bae0$b;)V", "plugin", "", "message", "f", "(Ll/gae0;Ljava/lang/String;)V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class ivo0 extends o2e0<zit> {
    /* JADX INFO: renamed from: b */
    public static void m142347b(BLiveEnvelope bLiveEnvelope) {
        o1j0.m165651y(bLiveEnvelope.meta.message);
    }

    /* JADX INFO: renamed from: d */
    public static void m142349d(ivo0 ivo0Var, gae0 gae0Var, Throwable th) {
        if (yvr.m217556b(60043, th)) {
            ivo0Var.m142352f(gae0Var, yvr.m217555a(th));
        } else {
            yvr.m217557c(th);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m142350g(gae0 gae0Var) {
        gae0Var.m213811F2().VoiceApplyManagerEvent.show().mo199273j(new snm0(0));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [l.oo2, l.vp20] */
    @Override // p153l.o2e0
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo97254a(@NotNull zit liveRoomScheme, @NotNull final gae0 plug, @Nullable bae0.C15954b extraInfo) {
        liveRoomScheme.getClass();
        plug.getClass();
        String strM202194o = plug.m213810E2().m202194o();
        strM202194o.getClass();
        plug.duringCreated(VirtualVoiceRoomApiProvider.createStarRedPacket(strM202194o)).subscribe(dhw.m115826e(new y20() { // from class: l.fvo0
            @Override // p153l.y20
            public final void call(Object obj) {
                ivo0.m142347b((BLiveEnvelope) obj);
            }
        }, new y20() { // from class: l.gvo0
            @Override // p153l.y20
            public final void call(Object obj) {
                ivo0.m142349d(this.f106666a, plug, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f */
    public final void m142352f(final gae0 plugin, String message) {
        Act act = plugin.act();
        if (act != null) {
            act.dialog().m21503F(message).m21542m0("知道了").m21559v0("邀请好友", new Runnable() { // from class: l.hvo0
                @Override // java.lang.Runnable
                public final void run() {
                    ivo0.m142350g(plugin);
                }
            }).m21495B(false).m21566z().show();
        }
    }
}
