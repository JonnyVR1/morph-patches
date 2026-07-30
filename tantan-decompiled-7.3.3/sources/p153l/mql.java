package p153l;

import android.view.View;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.CoreMomentInfo;
import com.p051p1.mobile.putong.data.User;
import p153l.q7m;

/* JADX INFO: loaded from: classes11.dex */
public interface mql<Card extends q7m> {
    /* JADX INFO: renamed from: a */
    void mo38435a(int i, boolean z);

    /* JADX INFO: renamed from: c */
    void mo38437c(User user);

    /* JADX INFO: renamed from: d */
    void mo38438d(Act act, User user);

    /* JADX INFO: renamed from: e */
    void mo38439e(Card card, User user, CoreSuggested.UserInfo userInfo, boolean z, CoreMomentInfo coreMomentInfo);

    /* JADX INFO: renamed from: f */
    View mo38440f();

    /* JADX INFO: renamed from: g */
    String mo38441g();

    /* JADX INFO: renamed from: h */
    void mo38442h(Card card);

    /* JADX INFO: renamed from: i */
    boolean mo38443i();

    /* JADX INFO: renamed from: j */
    void mo38444j(int i);

    /* JADX INFO: renamed from: b */
    default void mo38436b() {
    }
}
