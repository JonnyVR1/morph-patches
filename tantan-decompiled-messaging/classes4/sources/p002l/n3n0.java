package p002l;

import android.view.View;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.livingroom.virtual.api.VirtualVoiceRoomApiProvider;
import kotlin.Metadata;
import l.e30;
import l.fbp0;
import l.ffw;
import l.lsi0;
import l.r610;
import l.roj0;
import l.xh0;
import l.ygt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ll/n3n0;", "Ll/kud0;", "Ll/ygt;", "<init>", "()V", "liveRoomScheme", "Ll/c2e0;", "plug", "Ll/x1e0$b;", "extraInfo", "", "e", "(Ll/ygt;Ll/c2e0;Ll/x1e0$b;)V", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n3n0 extends kud0<ygt> {
    /* JADX WARN: Type inference failed for: r2v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: f */
    public static final void m18502f(c2e0 c2e0Var, final Act act, View view) {
        fbp0.o(c2e0Var);
        String strM17239o = c2e0Var.m25547E2().m17239o();
        strM17239o.getClass();
        c2e0Var.duringCreated(VirtualVoiceRoomApiProvider.deleteRoom(strM17239o)).subscribe(ffw.e(new e30() { // from class: l.l3n0
            public final void call(Object obj) {
                n3n0.m18503g(act, (roj0) obj);
            }
        }, new e30() { // from class: l.m3n0
            public final void call(Object obj) {
                n3n0.m18504h((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g */
    public static final void m18503g(Act act, roj0 roj0Var) {
        lsi0.y("解散成功");
        act.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final void m18504h(Throwable th) {
        th.getClass();
        r610.j(th);
    }

    @Override // p002l.kud0
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo9496a(@NotNull ygt liveRoomScheme, @NotNull final c2e0 plug, @Nullable x1e0.C0892b extraInfo) {
        liveRoomScheme.getClass();
        plug.getClass();
        final Act act = plug.act();
        if (act != null) {
            new xh0.a(act).s("确认解散本群？").j("群解散后，所有已入驻的群成员将无法进入本群。").p(h1c0.f11814p0).r("确认").o(new View.OnClickListener() { // from class: l.k3n0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    n3n0.m18502f(plug, act, view);
                }
            }).d(h1c0.f11763X0).f("取消").a().g();
        }
    }
}
