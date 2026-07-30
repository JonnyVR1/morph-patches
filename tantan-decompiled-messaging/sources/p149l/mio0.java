package p149l;

import android.text.TextUtils;
import android.view.View;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLiveVoice;
import com.p046p1.mobile.putong.live.livingroom.virtual.api.VirtualVoiceRoomApiProvider;

/* JADX INFO: loaded from: classes4.dex */
public class mio0 extends kud0<ygt> {
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m154742b(BLiveVoice bLiveVoice) {
    }

    /* JADX WARN: Type inference failed for: r4v17, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r4v3, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r4v7, types: [l.ho2, l.lh20] */
    @Override // p149l.kud0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo95830a(ygt ygtVar, final c2e0 c2e0Var, @Nullable x1e0.C21019b c21019b) {
        final String strM214763g = ygtVar.m214763g("liveMode");
        if (TextUtils.isEmpty(strM214763g)) {
            return;
        }
        if (TextUtils.equals(c2e0Var.m206027E2().mo149813j().liveMode, strM214763g) && (!x4s.m207014d(strM214763g) || !"game".equals(((BLiveVoice) c2e0Var.m206027E2().mo149813j()).template))) {
            lsi0.m151595y("您正处于该模式下，请勿重复切换");
        } else if (!x4s.m207013c(c2e0Var.m206027E2().mo149813j().liveMode) || x4s.m207013c(strM214763g)) {
            m154746f(c2e0Var, strM214763g);
        } else {
            new xh0.C21150a(c2e0Var.act()).m208739r("确认").m208727f("取消").m208731j("切换模式将会关闭恋爱星球，确认切换吗？").m208736o(new View.OnClickListener() { // from class: l.kio0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f123368a.m154745e(c2e0Var, strM214763g, view);
                }
            }).m208722a().m208721g();
        }
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m154745e(c2e0 c2e0Var, String str, View view) {
        m154746f(c2e0Var, str);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: f */
    public final void m154746f(c2e0 c2e0Var, String str) {
        c2e0Var.duringCreated(VirtualVoiceRoomApiProvider.switchLiveMode(c2e0Var.m206027E2().m149814k(), str)).subscribe(ffw.m121194e(new e30() { // from class: l.lio0
            @Override // p149l.e30
            public final void call(Object obj) {
                mio0.m154742b((BLiveVoice) obj);
            }
        }, new ult()));
    }
}
