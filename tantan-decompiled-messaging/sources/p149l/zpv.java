package p149l;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.LiveRegionTag;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.bean.AnchorStartData;
import com.p046p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p046p1.mobile.putong.live.base.data.BLiveAnchorLevel;

/* JADX INFO: loaded from: classes13.dex */
public interface zpv {
    /* JADX INFO: renamed from: a */
    boolean mo98345a();

    /* JADX INFO: renamed from: b */
    void mo98346b();

    /* JADX INFO: renamed from: c */
    User mo98347c(String str);

    /* JADX INFO: renamed from: d */
    void mo98348d(Context context, String str, String str2);

    /* JADX INFO: renamed from: e */
    long mo98349e();

    /* JADX INFO: renamed from: f */
    void mo98350f();

    /* JADX INFO: renamed from: g */
    boolean mo98351g();

    String getFakeId();

    /* JADX INFO: renamed from: h */
    long mo98352h();

    /* JADX INFO: renamed from: i */
    String mo98353i();

    /* JADX INFO: renamed from: j */
    void mo98354j(Context context, String str);

    /* JADX INFO: renamed from: k */
    void mo98355k(boolean z);

    /* JADX INFO: renamed from: l */
    Intent mo98356l(AudienceStartData audienceStartData);

    /* JADX INFO: renamed from: m */
    void mo98357m(Act act, AnchorStartData anchorStartData);

    /* JADX INFO: renamed from: n */
    void mo98358n(Act act);

    /* JADX INFO: renamed from: o */
    void mo98359o(Act act, AnchorStartData anchorStartData);

    /* JADX INFO: renamed from: p */
    boolean mo98360p(Activity activity);

    /* JADX INFO: renamed from: q */
    void mo98361q(boolean z);

    /* JADX INFO: renamed from: r */
    BLiveAnchorLevel mo98362r(long j);

    /* JADX INFO: renamed from: s */
    void mo98363s(LiveRegionTag liveRegionTag);

    /* JADX INFO: renamed from: t */
    void mo98364t(User user, boolean z);
}
