package p153l;

import android.app.Activity;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Followship;
import com.p051p1.mobile.putong.data.User;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class irf implements hrf {
    @Override // p153l.hrf
    /* JADX INFO: renamed from: a */
    public C22421c<Followship> mo136844a(String str, User user, boolean z, String str2, String str3, String str4, String str5) {
        return mbs.m157861k(str, user, z, str2, str3, str4, str5);
    }

    @Override // p153l.hrf
    /* JADX INFO: renamed from: b */
    public void mo136845b(Act act, String str, String str2) {
        mbs.m157857i().mo61468Jg(act, str, str2);
    }

    @Override // p153l.hrf
    /* JADX INFO: renamed from: c */
    public String mo136846c() {
        return mbs.m157873q();
    }

    @Override // p153l.hrf
    public C22421c<Followship> following(String str, User user, boolean z, String str2, String str3) {
        return mbs.m157859j(str, user, z, str2, str3);
    }

    @Override // p153l.hrf
    public boolean isMomentDetailAct(Activity activity) {
        return mbs.m157818D(activity);
    }

    @Override // p153l.hrf
    /* JADX INFO: renamed from: u0 */
    public boolean mo136848u0(Activity activity) {
        return mbs.m157819E(activity);
    }

    @Override // p153l.hrf
    /* JADX INFO: renamed from: d */
    public void mo136847d(Activity activity, y20<Boolean> y20Var) {
    }
}
