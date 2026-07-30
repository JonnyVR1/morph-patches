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

/* JADX INFO: loaded from: classes9.dex */
public class j6t {

    /* JADX INFO: renamed from: a */
    public bsv f118598a;

    /* JADX INFO: renamed from: a */
    public void m143699a(Context context, AnchorStartData anchorStartData) {
        m143708j().mo99982m((Act) context, anchorStartData);
    }

    /* JADX INFO: renamed from: b */
    public void m143700b(Context context, AnchorStartData anchorStartData) {
        m143708j().mo99984o((Act) context, anchorStartData);
    }

    /* JADX INFO: renamed from: c */
    public void m143701c() {
        m143708j().mo99975f();
    }

    /* JADX INFO: renamed from: d */
    public void m143702d() {
        m143708j().mo99971b();
    }

    /* JADX INFO: renamed from: e */
    public BLiveAnchorLevel m143703e(long j) {
        return m143708j().mo99987r(j);
    }

    /* JADX INFO: renamed from: f */
    public Intent m143704f(Context context, AudienceStartData audienceStartData) {
        return m143708j().mo99981l(audienceStartData);
    }

    /* JADX INFO: renamed from: g */
    public long m143705g() {
        return m143708j().mo99977h();
    }

    /* JADX INFO: renamed from: h */
    public String m143706h() {
        return m143708j().getFakeId();
    }

    /* JADX INFO: renamed from: i */
    public long m143707i() {
        return m143708j().mo99974e();
    }

    /* JADX INFO: renamed from: j */
    public asv m143708j() {
        if (this.f118598a == null) {
            this.f118598a = new bsv();
        }
        return this.f118598a;
    }

    /* JADX INFO: renamed from: k */
    public User m143709k(String str) {
        return m143708j().mo99972c(str);
    }

    /* JADX INFO: renamed from: l */
    public String m143710l() {
        return m143708j().mo99978i();
    }

    /* JADX INFO: renamed from: m */
    public boolean m143711m(Activity activity) {
        return m143708j().mo99985p(activity);
    }

    /* JADX INFO: renamed from: n */
    public boolean m143712n() {
        return m143708j().mo99976g();
    }

    /* JADX INFO: renamed from: o */
    public void m143713o(Context context, String str, String str2) {
        m143708j().mo99973d(context, str, str2);
    }

    /* JADX INFO: renamed from: p */
    public void m143714p(boolean z) {
        m143708j().mo99986q(z);
    }

    /* JADX INFO: renamed from: q */
    public boolean m143715q() {
        return m143708j().mo99970a();
    }

    /* JADX INFO: renamed from: r */
    public void m143716r(LiveRegionTag liveRegionTag) {
        m143708j().mo99988s(liveRegionTag);
    }

    /* JADX INFO: renamed from: s */
    public void m143717s(Act act) {
        m143708j().mo99983n(act);
    }

    /* JADX INFO: renamed from: t */
    public void m143718t(Context context, String str) {
        m143708j().mo99979j(context, str);
    }

    /* JADX INFO: renamed from: u */
    public void m143719u(User user, boolean z) {
        m143708j().mo99989t(user, z);
    }

    /* JADX INFO: renamed from: v */
    public void m143720v(boolean z) {
        m143708j().mo99980k(z);
    }
}
