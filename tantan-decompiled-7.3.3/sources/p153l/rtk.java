package p153l;

import android.text.TextUtils;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.core.CoreModule;

/* JADX INFO: loaded from: classes11.dex */
public class rtk extends AbstractC18774n4 {
    @Override // p153l.g6m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Boolean mo38500a(p8l.C19323a c19323a) {
        String str = CoreModule.f18264c.f20381e0.f89035G2.get();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        CoreModule.f18264c.f20381e0.f89035G2.put("");
        i4g0.m138526x("e_boost_checkin_toast", "p_suggest_users_home_view");
        of7.m167420o().m167425A(c19323a.m171258a(), str + BaseSei.f14624X);
        return null;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(p8l.C19323a c19323a) {
        return !TextUtils.isEmpty(CoreModule.f18264c.f20381e0.f89035G2.get()) && pzi0.m174438C(pzi0.m174454o(), CoreModule.f18264c.f20381e0.f89042H2.get().longValue());
    }
}
