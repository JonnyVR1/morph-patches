package p149l;

import android.text.TextUtils;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.core.CoreModule;

/* JADX INFO: loaded from: classes11.dex */
public class brk extends AbstractC18834o4 {
    @Override // p149l.p3m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Boolean mo37497a(z5l.C21640a c21640a) {
        String str = CoreModule.f17545c.f19639e0.f149178G2.get();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        CoreModule.f17545c.f19639e0.f149178G2.put("");
        zvf0.m220402x("e_boost_checkin_toast", "p_suggest_users_home_view");
        ke7.m145732o().m145737A(c21640a.m217363a(), str + BaseSei.f13930X);
        return null;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(z5l.C21640a c21640a) {
        return !TextUtils.isEmpty(CoreModule.f17545c.f19639e0.f149178G2.get()) && mqi0.m155928C(mqi0.m155944o(), CoreModule.f17545c.f19639e0.f149185H2.get().longValue());
    }
}
