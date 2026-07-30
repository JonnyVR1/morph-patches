package p009l;

import android.view.View;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.data.CoreMomentInfo;
import com.p1.mobile.putong.data.User;
import p009l.a5m;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public interface bol<Card extends a5m> {
    /* JADX INFO: renamed from: a */
    void mo1403a(int i, boolean z);

    /* JADX INFO: renamed from: c */
    void mo1405c(User user);

    /* JADX INFO: renamed from: d */
    void mo1406d(Act act, User user);

    /* JADX INFO: renamed from: e */
    void mo1407e(Card card, User user, CoreSuggested.UserInfo userInfo, boolean z, CoreMomentInfo coreMomentInfo);

    /* JADX INFO: renamed from: f */
    View mo1408f();

    /* JADX INFO: renamed from: g */
    String mo1409g();

    /* JADX INFO: renamed from: h */
    void mo1410h(Card card);

    /* JADX INFO: renamed from: i */
    boolean mo1411i();

    /* JADX INFO: renamed from: j */
    void mo1412j(int i);

    /* JADX INFO: renamed from: b */
    default void mo1404b() {
    }
}
