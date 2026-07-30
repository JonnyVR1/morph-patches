package p153l;

import android.view.View;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m88121d2 = {"Ll/r3n0;", "Ll/o2e0;", "Ll/zit;", "<init>", "()V", "liveRoomScheme", "Ll/gae0;", "plug", "Ll/bae0$b;", "extraInfo", "", "e", "(Ll/zit;Ll/gae0;Ll/bae0$b;)V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class r3n0 extends o2e0<zit> {
    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: f */
    public static final void m179653f(final gae0 gae0Var, View view) {
        String strM207631D0 = zrv.f205799a.m207631D0();
        jkp0.m145881l(gae0Var);
        gae0Var.duringCreated(LivingNormalApiProvider.m72558W6(gae0Var.m213810E2().m202194o(), strM207631D0)).subscribe(dhw.m115826e(new y20() { // from class: l.p3n0
            @Override // p153l.y20
            public final void call(Object obj) {
                r3n0.m179654g(gae0Var, (BLiveEnvelope) obj);
            }
        }, new y20() { // from class: l.q3n0
            @Override // p153l.y20
            public final void call(Object obj) {
                r3n0.m179655h((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g */
    public static final void m179654g(gae0 gae0Var, BLiveEnvelope bLiveEnvelope) {
        o1j0.m165651y("已取消入驻");
        gae0Var.m213811F2().BottomZoneEvent.refreshAllButton().m199277p();
    }

    /* JADX INFO: renamed from: h */
    public static final void m179655h(Throwable th) {
        th.getClass();
        bf10.m103834j(th);
    }

    @Override // p153l.o2e0
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo97254a(@NotNull zit liveRoomScheme, @NotNull final gae0 plug, @Nullable bae0.C15954b extraInfo) {
        liveRoomScheme.getClass();
        plug.getClass();
        Act act = plug.act();
        if (act != null) {
            new th0.C20312a(act).m191160s("确认取消入驻？").m191151j("取消入驻后，本群将不会出现在你的消息列表中，你也不会再收到本群的任何消息提醒。").m191157p(n9c0.f140855p0).m191159r("确认").m191156o(new View.OnClickListener() { // from class: l.o3n0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    r3n0.m179653f(plug, view);
                }
            }).m191145d(n9c0.f140804X0).m191147f("取消").m191142a().m191141g();
        }
    }
}
