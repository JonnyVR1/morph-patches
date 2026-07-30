package p006l;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.alipay.sdk.app.AuthTask;
import com.p000p1.mobile.putong.account_api.api.serviceprovider.api.AccountCommonService;
import com.p000p1.mobile.putong.app.C0125a;
import com.p000p1.mobile.putong.app.PutongAct;
import com.p000p1.mobile.putong.app.TantanApp;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core_api.api.serviceprovider.api.core.CoreCommonService;
import com.p1.mobile.putong.data.AlipayAuthEnvelop;
import com.p1.mobile.putong.data.AuthData;
import com.p1.mobile.putong.data.Contract;
import com.p1.mobile.putong.data.Counter;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.SignUpData;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.Video;
import com.p1.mobile.putong.feed_api.api.serviceprovider.api.feed.FeedCommonService;
import com.p1.mobile.putong.live_api.api.serviceprovider.api.live.LiveCommonService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import l.d30;
import l.epd0;
import l.g9s;
import l.j760;
import l.op8;
import l.roj0;
import l.stc0;
import l.tpx;
import l.v9j;
import l.vrx;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public final class am5 implements yl5 {

    /* JADX INFO: renamed from: a */
    public volatile AccountCommonService f8356a;

    /* JADX INFO: renamed from: b */
    public volatile CoreCommonService f8357b;

    /* JADX INFO: renamed from: c */
    public volatile FeedCommonService f8358c;

    /* JADX INFO: renamed from: d */
    public volatile LiveCommonService f8359d;

    @Override // p006l.yl5
    /* JADX INFO: renamed from: A2 */
    public vrx mo11984A2() {
        return this.f8357b.A2();
    }

    @Override // p006l.yl5
    /* JADX INFO: renamed from: B5 */
    public void mo11985B5(Act act, Video video, String str) {
        this.f8358c.B5(act, video, str);
    }

    @Override // p006l.yl5
    /* JADX INFO: renamed from: C3 */
    public c<Boolean> mo11986C3(String str) {
        return this.f8357b.C3(str);
    }

    @Override // p006l.yl5
    /* JADX INFO: renamed from: D5 */
    public boolean mo11987D5() {
        return this.f8356a.mo36D5();
    }

    @Override // p006l.yl5
    /* JADX INFO: renamed from: G */
    public C0125a mo11988G(PutongAct putongAct) {
        return this.f8357b.G(putongAct);
    }

    @Override // p006l.yl5
    /* JADX INFO: renamed from: G2 */
    public tpx mo11989G2() {
        return this.f8356a.mo37G2();
    }

    @Override // p006l.yl5
    /* JADX INFO: renamed from: H0 */
    public String mo11990H0() {
        if (this.f8358c == null) {
            return null;
        }
        return this.f8358c.H0();
    }

    @Override // p006l.yl5
    /* JADX INFO: renamed from: I */
    public boolean mo11991I(Envelope envelope) {
        return this.f8357b.I(envelope);
    }

    @Override // p006l.yl5
    /* JADX INFO: renamed from: L0 */
    public vrx mo11992L0() {
        return this.f8357b.L0();
    }

    @Override // p006l.yl5
    /* JADX INFO: renamed from: O0 */
    public HashSet<String> mo11993O0(Envelope envelope, Integer num) {
        return this.f8358c.O0(envelope, num);
    }

    @Override // p006l.yl5
    /* JADX INFO: renamed from: P1 */
    public String mo11994P1() {
        return this.f8357b.P1();
    }

    @Override // p006l.yl5
    /* JADX INFO: renamed from: P4 */
    public vrx mo11995P4() {
        return this.f8357b.P4();
    }

    @Override // p006l.yl5
    /* JADX INFO: renamed from: R0 */
    public vrx mo11996R0() {
        return this.f8358c.R0();
    }

    @Override // p006l.yl5
    /* JADX INFO: renamed from: R3 */
    public void mo11997R3(Throwable th) {
        this.f8357b.R3(th);
    }

    @Override // p006l.yl5
    /* JADX INFO: renamed from: T3 */
    public void mo11998T3(Envelope envelope, HashSet<String> hashSet, Integer num) {
        this.f8357b.T3(envelope, hashSet, num);
    }

    @Override // p006l.yl5
    /* JADX INFO: renamed from: U4 */
    public boolean mo11999U4() {
        return this.f8357b == null || this.f8357b.U4();
    }

    @Override // p006l.yl5
    /* JADX INFO: renamed from: X4 */
    public boolean mo12000X4() {
        return this.f8357b.X4();
    }

    @Override // p006l.yl5
    /* JADX INFO: renamed from: Y1 */
    public c<Picture> mo12001Y1(Picture picture) {
        return this.f8357b.Y1(picture);
    }

    @Override // p006l.yl5
    /* JADX INFO: renamed from: a */
    public User mo12002a(String str) {
        return this.f8357b.getUserByIdInModule(str);
    }

    @Override // p006l.yl5
    /* JADX INFO: renamed from: a3 */
    public int mo12003a3() {
        return this.f8357b.a3();
    }

    @Override // p006l.yl5
    public c<AuthData> accessOutterToken() {
        return this.f8356a.accessOutterToken();
    }

    @Override // p006l.yl5
    public String accessToken() {
        epd0 epd0Var = TantanApp.f1171e;
        return epd0Var.b() == null ? "" : ((AuthData) epd0Var.b()).accessToken;
    }

    @Override // p006l.yl5
    public c<j760<Integer, String>> alipayAuthWithErrorCode(AuthTask authTask) {
        return this.f8357b.alipayAuthWithErrorCode(authTask);
    }

    @Override // p006l.yl5
    /* JADX INFO: renamed from: b */
    public op8 mo12004b() {
        return this.f8357b.a();
    }

    @Override // p006l.yl5
    /* JADX INFO: renamed from: c */
    public g9s mo12005c() {
        return this.f8359d.a();
    }

    @Override // p006l.yl5
    /* JADX INFO: renamed from: c2 */
    public void mo12006c2(PutongAct putongAct, d30 d30Var) {
        this.f8357b.c2(putongAct, d30Var);
    }

    @Override // p006l.yl5
    public void clientNeedsForceUpdate() {
        this.f8356a.clientNeedsForceUpdate();
    }

    @Override // p006l.yl5
    public Counter counter_() {
        return this.f8357b.counter_();
    }

    @Override // p006l.yl5
    /* JADX INFO: renamed from: d */
    public vrx mo12007d() {
        return this.f8358c.nh();
    }

    @Override // p006l.yl5
    /* JADX INFO: renamed from: e */
    public boolean mo12008e() {
        return this.f8356a.mo38G9();
    }

    @Override // p006l.yl5
    /* JADX INFO: renamed from: f */
    public boolean mo12009f() {
        return this.f8356a.mo42x9();
    }

    @Override // p006l.yl5
    /* JADX INFO: renamed from: g */
    public InterfaceC0810ho mo12010g() {
        return this.f8356a.mo40a();
    }

    @Override // p006l.yl5
    public epd0 getAuthData() {
        return TantanApp.f1171e;
    }

    @Override // p006l.yl5
    public Intent getMainActIntent(Context context) {
        return this.f8357b.getMainActIntent(context);
    }

    @Override // p006l.yl5
    public Class<? extends Activity> getSignOutJumpAct() {
        return this.f8356a.getSignOutJumpAct();
    }

    @Override // p006l.yl5
    public SignUpData getSignUpData() {
        return this.f8356a.getSignUpData();
    }

    @Override // p006l.yl5
    /* JADX INFO: renamed from: j0 */
    public vrx mo12011j0() {
        return this.f8357b.j0();
    }

    @Override // p006l.yl5
    /* JADX INFO: renamed from: l3 */
    public c<List<Picture>> mo12012l3(List<Media> list) {
        return this.f8357b.l3(list);
    }

    @Override // p006l.yl5
    /* JADX INFO: renamed from: l5 */
    public vrx mo12013l5() {
        return this.f8357b.l5();
    }

    @Override // p006l.yl5
    /* JADX INFO: renamed from: me */
    public c<User> mo12014me() {
        return this.f8357b.me();
    }

    @Override // p006l.yl5
    public User me_() {
        return this.f8357b.me_();
    }

    @Override // p006l.yl5
    public void mergeNetworkStateIntoLocalState(Envelope envelope, d30 d30Var) {
        this.f8357b.mergeNetworkStateIntoLocalState(envelope, d30Var);
    }

    @Override // p006l.yl5
    public void pollUserCounters() {
        this.f8357b.pollUserCounters();
    }

    @Override // p006l.yl5
    public User queryMe() {
        return this.f8357b.queryMe();
    }

    @Override // p006l.yl5
    /* JADX INFO: renamed from: r */
    public void mo12015r(Act act) {
        this.f8357b.r(act);
    }

    @Override // p006l.yl5
    public void sendThirdPartLoginResult(int i, String str) {
        this.f8356a.sendThirdPartLoginResult(i, str);
    }

    @Override // p006l.yl5
    public void signOut() {
        this.f8356a.signOut();
    }

    @Override // p006l.yl5
    public boolean signedIn_() {
        return TantanApp.f1171e.b() != null && ((Boolean) TantanApp.f1170d.b()).booleanValue();
    }

    @Override // p006l.yl5
    /* JADX INFO: renamed from: t2 */
    public vrx mo12016t2() {
        return this.f8356a.mo41t2();
    }

    @Override // p006l.yl5
    /* JADX INFO: renamed from: t5 */
    public Class mo12017t5() {
        return this.f8356a.mo39Vs();
    }

    @Override // p006l.yl5
    public void trackPlayerBlockTime(long j, String str, String str2) {
        this.f8357b.trackPlayerBlockTime(j, str, str2);
    }

    @Override // p006l.yl5
    /* JADX INFO: renamed from: u4 */
    public c<AlipayAuthEnvelop> mo12018u4(String str, String str2) {
        return this.f8357b.u4(str, str2);
    }

    @Override // p006l.yl5
    public String userId() {
        if (getAuthData().b() == null) {
            return null;
        }
        return ((AuthData) getAuthData().b()).userId;
    }

    @Override // p006l.yl5
    /* JADX INFO: renamed from: v0 */
    public Class<? extends Act> mo12019v0() {
        return this.f8357b.v0();
    }

    @Override // p006l.yl5
    /* JADX INFO: renamed from: z5 */
    public c<roj0> mo12020z5(v9j<stc0> v9jVar, a<ArrayList<Contract>> aVar) {
        return this.f8357b.z5(v9jVar, aVar);
    }
}
