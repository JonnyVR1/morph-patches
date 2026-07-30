package p153l;

import android.content.Intent;
import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p051p1.mobile.putong.live.livingroom.archi.act.VirtualCompatibleActivity;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes4.dex */
public class ezl0 extends a3g0 {
    @Override // p153l.a3g0
    /* JADX INFO: renamed from: a */
    public void mo95802a(p2g0 p2g0Var) {
        d3g0 d3g0VarMo170350a = p2g0Var.mo170350a();
        AudienceStartData audienceStartDataM113813c = d3g0VarMo170350a.m113813c();
        if (d3g0VarMo170350a.m113812b() != null) {
            p2g0Var.mo170351b(d3g0VarMo170350a);
            return;
        }
        if (NullChecker.m82486a(audienceStartDataM113813c) && NullChecker.m82486a(audienceStartDataM113813c.live) && cmp0.m111299d().m111305f() && TextUtils.equals(cmp0.m111299d().m111304e(), audienceStartDataM113813c.live.f45171id)) {
            oo2 oo2VarM111303c = cmp0.m111299d().m111303c();
            if (NullChecker.m82486a(oo2VarM111303c)) {
                o5c.m166095a().m166097c(oo2VarM111303c);
                audienceStartDataM113813c.fromFW = true;
            }
            if (oo2VarM111303c instanceof jlm0) {
                d3g0VarMo170350a.m113817g(new Intent(d3g0VarMo170350a.m113811a(), (Class<?>) VirtualCompatibleActivity.class));
            }
        }
        p2g0Var.mo170351b(d3g0VarMo170350a);
    }
}
