package p153l;

import android.text.TextUtils;
import android.view.View;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.data.BLiveVoice;
import com.p051p1.mobile.putong.live.livingroom.virtual.api.VirtualVoiceRoomApiProvider;

/* JADX INFO: loaded from: classes4.dex */
public class qro0 extends o2e0<zit> {
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m177590b(BLiveVoice bLiveVoice) {
    }

    /* JADX WARN: Type inference failed for: r4v17, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r4v3, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r4v7, types: [l.oo2, l.vp20] */
    @Override // p153l.o2e0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo97254a(zit zitVar, final gae0 gae0Var, @Nullable bae0.C15954b c15954b) {
        final String strM219937g = zitVar.m219937g("liveMode");
        if (TextUtils.isEmpty(strM219937g)) {
            return;
        }
        if (TextUtils.equals(gae0Var.m213810E2().mo183435j().liveMode, strM219937g) && (!y6s.m214496d(strM219937g) || !"game".equals(((BLiveVoice) gae0Var.m213810E2().mo183435j()).template))) {
            o1j0.m165651y("您正处于该模式下，请勿重复切换");
        } else if (!y6s.m214495c(gae0Var.m213810E2().mo183435j().liveMode) || y6s.m214495c(strM219937g)) {
            m177594f(gae0Var, strM219937g);
        } else {
            new th0.C20312a(gae0Var.act()).m191159r("确认").m191147f("取消").m191151j("切换模式将会关闭恋爱星球，确认切换吗？").m191156o(new View.OnClickListener() { // from class: l.oro0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f148730a.m177593e(gae0Var, strM219937g, view);
                }
            }).m191142a().m191141g();
        }
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m177593e(gae0 gae0Var, String str, View view) {
        m177594f(gae0Var, str);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: f */
    public final void m177594f(gae0 gae0Var, String str) {
        gae0Var.duringCreated(VirtualVoiceRoomApiProvider.switchLiveMode(gae0Var.m213810E2().m202191k(), str)).subscribe(dhw.m115826e(new y20() { // from class: l.pro0
            @Override // p153l.y20
            public final void call(Object obj) {
                qro0.m177590b((BLiveVoice) obj);
            }
        }, new wnt()));
    }
}
