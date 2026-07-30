package p009l;

import android.text.TextUtils;
import com.p1.mobile.putong.core.CoreModule;
import l.ke7;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class brk extends AbstractC1065o4 {
    @Override // p009l.p3m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Boolean mo1468a(z5l.C1346a c1346a) {
        String str = (String) CoreModule.c.e0.G2.get();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        CoreModule.c.e0.G2.put("");
        zvf0.x("e_boost_checkin_toast", "p_suggest_users_home_view");
        ke7.o().A(c1346a.m25611a(), str + "x");
        return null;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(z5l.C1346a c1346a) {
        return !TextUtils.isEmpty((CharSequence) CoreModule.c.e0.G2.get()) && mqi0.m18534C(mqi0.m18550o(), ((Long) CoreModule.c.e0.H2.get()).longValue());
    }
}
