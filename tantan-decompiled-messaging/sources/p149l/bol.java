package p149l;

import android.view.View;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.CoreMomentInfo;
import com.p046p1.mobile.putong.data.User;
import p149l.a5m;

/* JADX INFO: loaded from: classes11.dex */
public interface bol<Card extends a5m> {
    /* JADX INFO: renamed from: a */
    void mo37432a(int i, boolean z);

    /* JADX INFO: renamed from: c */
    void mo37434c(User user);

    /* JADX INFO: renamed from: d */
    void mo37435d(Act act, User user);

    /* JADX INFO: renamed from: e */
    void mo37436e(Card card, User user, CoreSuggested.UserInfo userInfo, boolean z, CoreMomentInfo coreMomentInfo);

    /* JADX INFO: renamed from: f */
    View mo37437f();

    /* JADX INFO: renamed from: g */
    String mo37438g();

    /* JADX INFO: renamed from: h */
    void mo37439h(Card card);

    /* JADX INFO: renamed from: i */
    boolean mo37440i();

    /* JADX INFO: renamed from: j */
    void mo37441j(int i);

    /* JADX INFO: renamed from: b */
    default void mo37433b() {
    }
}
