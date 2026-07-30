package p002l;

import android.text.TextUtils;
import android.view.View;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.live.base.data.BLiveVoice;
import com.p1.mobile.putong.live.livingroom.virtual.api.VirtualVoiceRoomApiProvider;
import l.e30;
import l.ffw;
import l.lsi0;
import l.ult;
import l.x4s;
import l.xh0;
import l.ygt;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class mio0 extends kud0<ygt> {
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m17960b(BLiveVoice bLiveVoice) {
    }

    /* JADX WARN: Type inference failed for: r4v17, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r4v3, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r4v7, types: [l.ho2, l.lh20] */
    @Override // p002l.kud0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo9496a(ygt ygtVar, final c2e0 c2e0Var, @Nullable x1e0.C0892b c0892b) {
        final String strG = ygtVar.g("liveMode");
        if (TextUtils.isEmpty(strG)) {
            return;
        }
        if (TextUtils.equals(c2e0Var.m25547E2().m17234j().liveMode, strG) && (!x4s.d(strG) || !"game".equals(c2e0Var.m25547E2().m17234j().template))) {
            lsi0.y("您正处于该模式下，请勿重复切换");
        } else if (!x4s.c(c2e0Var.m25547E2().m17234j().liveMode) || x4s.c(strG)) {
            m17964f(c2e0Var, strG);
        } else {
            new xh0.a(c2e0Var.act()).r("确认").f("取消").j("切换模式将会关闭恋爱星球，确认切换吗？").o(new View.OnClickListener() { // from class: l.kio0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f14347a.m17963e(c2e0Var, strG, view);
                }
            }).a().g();
        }
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m17963e(c2e0 c2e0Var, String str, View view) {
        m17964f(c2e0Var, str);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: f */
    public final void m17964f(c2e0 c2e0Var, String str) {
        c2e0Var.duringCreated(VirtualVoiceRoomApiProvider.switchLiveMode(c2e0Var.m25547E2().m17235k(), str)).subscribe(ffw.e(new e30() { // from class: l.lio0
            public final void call(Object obj) {
                mio0.m17960b((BLiveVoice) obj);
            }
        }, new ult()));
    }
}
