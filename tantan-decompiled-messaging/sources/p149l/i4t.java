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
public class i4t {

    /* JADX INFO: renamed from: a */
    public aqv f111479a;

    /* JADX INFO: renamed from: a */
    public void m134368a(Context context, AnchorStartData anchorStartData) {
        m134377j().mo98357m((Act) context, anchorStartData);
    }

    /* JADX INFO: renamed from: b */
    public void m134369b(Context context, AnchorStartData anchorStartData) {
        m134377j().mo98359o((Act) context, anchorStartData);
    }

    /* JADX INFO: renamed from: c */
    public void m134370c() {
        m134377j().mo98350f();
    }

    /* JADX INFO: renamed from: d */
    public void m134371d() {
        m134377j().mo98346b();
    }

    /* JADX INFO: renamed from: e */
    public BLiveAnchorLevel m134372e(long j) {
        return m134377j().mo98362r(j);
    }

    /* JADX INFO: renamed from: f */
    public Intent m134373f(Context context, AudienceStartData audienceStartData) {
        return m134377j().mo98356l(audienceStartData);
    }

    /* JADX INFO: renamed from: g */
    public long m134374g() {
        return m134377j().mo98352h();
    }

    /* JADX INFO: renamed from: h */
    public String m134375h() {
        return m134377j().getFakeId();
    }

    /* JADX INFO: renamed from: i */
    public long m134376i() {
        return m134377j().mo98349e();
    }

    /* JADX INFO: renamed from: j */
    public zpv m134377j() {
        if (this.f111479a == null) {
            this.f111479a = new aqv();
        }
        return this.f111479a;
    }

    /* JADX INFO: renamed from: k */
    public User m134378k(String str) {
        return m134377j().mo98347c(str);
    }

    /* JADX INFO: renamed from: l */
    public String m134379l() {
        return m134377j().mo98353i();
    }

    /* JADX INFO: renamed from: m */
    public boolean m134380m(Activity activity) {
        return m134377j().mo98360p(activity);
    }

    /* JADX INFO: renamed from: n */
    public boolean m134381n() {
        return m134377j().mo98351g();
    }

    /* JADX INFO: renamed from: o */
    public void m134382o(Context context, String str, String str2) {
        m134377j().mo98348d(context, str, str2);
    }

    /* JADX INFO: renamed from: p */
    public void m134383p(boolean z) {
        m134377j().mo98361q(z);
    }

    /* JADX INFO: renamed from: q */
    public boolean m134384q() {
        return m134377j().mo98345a();
    }

    /* JADX INFO: renamed from: r */
    public void m134385r(LiveRegionTag liveRegionTag) {
        m134377j().mo98363s(liveRegionTag);
    }

    /* JADX INFO: renamed from: s */
    public void m134386s(Act act) {
        m134377j().mo98358n(act);
    }

    /* JADX INFO: renamed from: t */
    public void m134387t(Context context, String str) {
        m134377j().mo98354j(context, str);
    }

    /* JADX INFO: renamed from: u */
    public void m134388u(User user, boolean z) {
        m134377j().mo98364t(user, z);
    }

    /* JADX INFO: renamed from: v */
    public void m134389v(boolean z) {
        m134377j().mo98355k(z);
    }
}
