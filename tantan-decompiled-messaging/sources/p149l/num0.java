package p149l;

import android.view.View;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m87232d2 = {"Ll/num0;", "Ll/kud0;", "Ll/ygt;", "<init>", "()V", "liveRoomScheme", "Ll/c2e0;", "plug", "Ll/x1e0$b;", "extraInfo", "", "e", "(Ll/ygt;Ll/c2e0;Ll/x1e0$b;)V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class num0 extends kud0<ygt> {
    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: f */
    public static final void m161510f(final c2e0 c2e0Var, View view) {
        String strM199309D0 = ypv.f199493a.m199309D0();
        fbp0.m120396l(c2e0Var);
        c2e0Var.duringCreated(LivingNormalApiProvider.m71375W6(c2e0Var.m206027E2().m149818o(), strM199309D0)).subscribe(ffw.m121194e(new e30() { // from class: l.lum0
            @Override // p149l.e30
            public final void call(Object obj) {
                num0.m161511g(c2e0Var, (BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.mum0
            @Override // p149l.e30
            public final void call(Object obj) {
                num0.m161512h((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g */
    public static final void m161511g(c2e0 c2e0Var, BLiveEnvelope bLiveEnvelope) {
        lsi0.m151595y("已取消入驻");
        c2e0Var.m206028F2().BottomZoneEvent.refreshAllButton().m172467p();
    }

    /* JADX INFO: renamed from: h */
    public static final void m161512h(Throwable th) {
        th.getClass();
        r610.m178005j(th);
    }

    @Override // p149l.kud0
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo95830a(@NotNull ygt liveRoomScheme, @NotNull final c2e0 plug, @Nullable x1e0.C21019b extraInfo) {
        liveRoomScheme.getClass();
        plug.getClass();
        Act act = plug.act();
        if (act != null) {
            new xh0.C21150a(act).m208740s("确认取消入驻？").m208731j("取消入驻后，本群将不会出现在你的消息列表中，你也不会再收到本群的任何消息提醒。").m208737p(h1c0.f105394p0).m208739r("确认").m208736o(new View.OnClickListener() { // from class: l.kum0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    num0.m161510f(plug, view);
                }
            }).m208725d(h1c0.f105343X0).m208727f("取消").m208722a().m208721g();
        }
    }
}
