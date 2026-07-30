package p153l;

import android.app.Activity;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Followship;
import com.p051p1.mobile.putong.data.User;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes13.dex */
public interface hrf {
    /* JADX INFO: renamed from: a */
    C22421c<Followship> mo136844a(String str, User user, boolean z, String str2, String str3, String str4, String str5);

    /* JADX INFO: renamed from: b */
    void mo136845b(Act act, String str, String str2);

    /* JADX INFO: renamed from: c */
    String mo136846c();

    /* JADX INFO: renamed from: d */
    void mo136847d(Activity activity, y20<Boolean> y20Var);

    C22421c<Followship> following(String str, User user, boolean z, String str2, String str3);

    boolean isMomentDetailAct(Activity activity);

    /* JADX INFO: renamed from: u0 */
    boolean mo136848u0(Activity activity);
}
