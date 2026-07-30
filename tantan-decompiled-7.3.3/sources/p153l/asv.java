package p153l;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.LiveRegionTag;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.bean.AnchorStartData;
import com.p051p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p051p1.mobile.putong.live.base.data.BLiveAnchorLevel;

/* JADX INFO: loaded from: classes13.dex */
public interface asv {
    /* JADX INFO: renamed from: a */
    boolean mo99970a();

    /* JADX INFO: renamed from: b */
    void mo99971b();

    /* JADX INFO: renamed from: c */
    User mo99972c(String str);

    /* JADX INFO: renamed from: d */
    void mo99973d(Context context, String str, String str2);

    /* JADX INFO: renamed from: e */
    long mo99974e();

    /* JADX INFO: renamed from: f */
    void mo99975f();

    /* JADX INFO: renamed from: g */
    boolean mo99976g();

    String getFakeId();

    /* JADX INFO: renamed from: h */
    long mo99977h();

    /* JADX INFO: renamed from: i */
    String mo99978i();

    /* JADX INFO: renamed from: j */
    void mo99979j(Context context, String str);

    /* JADX INFO: renamed from: k */
    void mo99980k(boolean z);

    /* JADX INFO: renamed from: l */
    Intent mo99981l(AudienceStartData audienceStartData);

    /* JADX INFO: renamed from: m */
    void mo99982m(Act act, AnchorStartData anchorStartData);

    /* JADX INFO: renamed from: n */
    void mo99983n(Act act);

    /* JADX INFO: renamed from: o */
    void mo99984o(Act act, AnchorStartData anchorStartData);

    /* JADX INFO: renamed from: p */
    boolean mo99985p(Activity activity);

    /* JADX INFO: renamed from: q */
    void mo99986q(boolean z);

    /* JADX INFO: renamed from: r */
    BLiveAnchorLevel mo99987r(long j);

    /* JADX INFO: renamed from: s */
    void mo99988s(LiveRegionTag liveRegionTag);

    /* JADX INFO: renamed from: t */
    void mo99989t(User user, boolean z);
}
