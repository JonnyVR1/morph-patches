package p153l;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.alipay.sdk.app.AuthTask;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.account_api.api.serviceprovider.api.AccountCommonService;
import com.p051p1.mobile.putong.app.C4850a;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.app.TantanApp;
import com.p051p1.mobile.putong.core_api.api.serviceprovider.api.core.CoreCommonService;
import com.p051p1.mobile.putong.data.AlipayAuthEnvelop;
import com.p051p1.mobile.putong.data.AuthData;
import com.p051p1.mobile.putong.data.Contract;
import com.p051p1.mobile.putong.data.Counter;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.SignUpData;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.feed.FeedCommonService;
import com.p051p1.mobile.putong.live_api.api.serviceprovider.api.live.LiveCommonService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes9.dex */
public final class dn5 implements bn5 {

    /* JADX INFO: renamed from: a */
    public volatile AccountCommonService f89756a;

    /* JADX INFO: renamed from: b */
    public volatile CoreCommonService f89757b;

    /* JADX INFO: renamed from: c */
    public volatile FeedCommonService f89758c;

    /* JADX INFO: renamed from: d */
    public volatile LiveCommonService f89759d;

    @Override // p153l.bn5
    /* JADX INFO: renamed from: A2 */
    public s0y mo105281A2() {
        return this.f89757b.mo31098A2();
    }

    @Override // p153l.bn5
    /* JADX INFO: renamed from: B5 */
    public void mo105282B5(Act act, Video video, String str) {
        this.f89758c.mo61412B5(act, video, str);
    }

    @Override // p153l.bn5
    /* JADX INFO: renamed from: C3 */
    public C22421c<Boolean> mo105283C3(String str) {
        return this.f89757b.mo31099C3(str);
    }

    @Override // p153l.bn5
    /* JADX INFO: renamed from: D5 */
    public boolean mo105284D5() {
        return this.f89756a.mo29140D5();
    }

    @Override // p153l.bn5
    /* JADX INFO: renamed from: G */
    public C4850a mo105285G(PutongAct putongAct) {
        return this.f89757b.mo31100G(putongAct);
    }

    @Override // p153l.bn5
    /* JADX INFO: renamed from: G2 */
    public qyx mo105286G2() {
        return this.f89756a.mo29141G2();
    }

    @Override // p153l.bn5
    /* JADX INFO: renamed from: H0 */
    public String mo105287H0() {
        if (this.f89758c == null) {
            return null;
        }
        return this.f89758c.mo61413H0();
    }

    @Override // p153l.bn5
    /* JADX INFO: renamed from: I */
    public boolean mo105288I(Envelope envelope) {
        return this.f89757b.mo31101I(envelope);
    }

    @Override // p153l.bn5
    /* JADX INFO: renamed from: L0 */
    public s0y mo105289L0() {
        return this.f89757b.mo31102L0();
    }

    @Override // p153l.bn5
    /* JADX INFO: renamed from: O0 */
    public HashSet<String> mo105290O0(Envelope envelope, Integer num) {
        return this.f89758c.mo61414O0(envelope, num);
    }

    @Override // p153l.bn5
    /* JADX INFO: renamed from: P1 */
    public String mo105291P1() {
        return this.f89757b.mo31103P1();
    }

    @Override // p153l.bn5
    /* JADX INFO: renamed from: P4 */
    public s0y mo105292P4() {
        return this.f89757b.mo31104P4();
    }

    @Override // p153l.bn5
    /* JADX INFO: renamed from: R0 */
    public s0y mo105293R0() {
        return this.f89758c.mo61415R0();
    }

    @Override // p153l.bn5
    /* JADX INFO: renamed from: R3 */
    public void mo105294R3(Throwable th) {
        this.f89757b.mo31105R3(th);
    }

    @Override // p153l.bn5
    /* JADX INFO: renamed from: T3 */
    public void mo105295T3(Envelope envelope, HashSet<String> hashSet, Integer num) {
        this.f89757b.mo31106T3(envelope, hashSet, num);
    }

    @Override // p153l.bn5
    /* JADX INFO: renamed from: U4 */
    public boolean mo105296U4() {
        return this.f89757b == null || this.f89757b.mo31107U4();
    }

    @Override // p153l.bn5
    /* JADX INFO: renamed from: X4 */
    public boolean mo105297X4() {
        return this.f89757b.mo31108X4();
    }

    @Override // p153l.bn5
    /* JADX INFO: renamed from: Y1 */
    public C22421c<Picture> mo105298Y1(Picture picture) {
        return this.f89757b.mo31109Y1(picture);
    }

    @Override // p153l.bn5
    /* JADX INFO: renamed from: a */
    public User mo105299a(String str) {
        return this.f89757b.getUserByIdInModule(str);
    }

    @Override // p153l.bn5
    /* JADX INFO: renamed from: a3 */
    public int mo105300a3() {
        return this.f89757b.mo31111a3();
    }

    @Override // p153l.bn5
    public C22421c<AuthData> accessOutterToken() {
        return this.f89756a.accessOutterToken();
    }

    @Override // p153l.bn5
    public String accessToken() {
        gxd0 gxd0Var = TantanApp.f17901e;
        return gxd0Var.mo107143b() == null ? "" : gxd0Var.mo107143b().accessToken;
    }

    @Override // p153l.bn5
    public C22421c<pf60<Integer, String>> alipayAuthWithErrorCode(AuthTask authTask) {
        return this.f89757b.alipayAuthWithErrorCode(authTask);
    }

    @Override // p153l.bn5
    /* JADX INFO: renamed from: b */
    public tq8 mo105301b() {
        return this.f89757b.mo31110a();
    }

    @Override // p153l.bn5
    /* JADX INFO: renamed from: c */
    public hbs mo105302c() {
        return this.f89759d.mo68352a();
    }

    @Override // p153l.bn5
    /* JADX INFO: renamed from: c2 */
    public void mo105303c2(PutongAct putongAct, x20 x20Var) {
        this.f89757b.mo31112c2(putongAct, x20Var);
    }

    @Override // p153l.bn5
    public void clientNeedsForceUpdate() {
        this.f89756a.clientNeedsForceUpdate();
    }

    @Override // p153l.bn5
    public Counter counter_() {
        return this.f89757b.counter_();
    }

    @Override // p153l.bn5
    /* JADX INFO: renamed from: d */
    public s0y mo105304d() {
        return this.f89758c.mo61416nh();
    }

    @Override // p153l.bn5
    /* JADX INFO: renamed from: e */
    public boolean mo105305e() {
        return this.f89756a.mo29142G9();
    }

    @Override // p153l.bn5
    /* JADX INFO: renamed from: f */
    public boolean mo105306f() {
        return this.f89756a.mo29146x9();
    }

    @Override // p153l.bn5
    /* JADX INFO: renamed from: g */
    public InterfaceC16069bo mo105307g() {
        return this.f89756a.mo29144a();
    }

    @Override // p153l.bn5
    public gxd0 getAuthData() {
        return TantanApp.f17901e;
    }

    @Override // p153l.bn5
    public Intent getMainActIntent(Context context) {
        return this.f89757b.getMainActIntent(context);
    }

    @Override // p153l.bn5
    public Class<? extends Activity> getSignOutJumpAct() {
        return this.f89756a.getSignOutJumpAct();
    }

    @Override // p153l.bn5
    public SignUpData getSignUpData() {
        return this.f89756a.getSignUpData();
    }

    @Override // p153l.bn5
    /* JADX INFO: renamed from: j0 */
    public s0y mo105308j0() {
        return this.f89757b.mo31113j0();
    }

    @Override // p153l.bn5
    /* JADX INFO: renamed from: l3 */
    public C22421c<List<Picture>> mo105309l3(List<Media> list) {
        return this.f89757b.mo31115l3(list);
    }

    @Override // p153l.bn5
    /* JADX INFO: renamed from: l5 */
    public s0y mo105310l5() {
        return this.f89757b.mo31116l5();
    }

    @Override // p153l.bn5
    /* JADX INFO: renamed from: me */
    public C22421c<User> mo105311me() {
        return this.f89757b.mo31117me();
    }

    @Override // p153l.bn5
    public User me_() {
        return this.f89757b.me_();
    }

    @Override // p153l.bn5
    public void mergeNetworkStateIntoLocalState(Envelope envelope, x20 x20Var) {
        this.f89757b.mergeNetworkStateIntoLocalState(envelope, x20Var);
    }

    @Override // p153l.bn5
    public void pollUserCounters() {
        this.f89757b.pollUserCounters();
    }

    @Override // p153l.bn5
    public User queryMe() {
        return this.f89757b.queryMe();
    }

    @Override // p153l.bn5
    /* JADX INFO: renamed from: r */
    public void mo105312r(Act act) {
        this.f89757b.mo31118r(act);
    }

    @Override // p153l.bn5
    public void sendThirdPartLoginResult(int i, String str) {
        this.f89756a.sendThirdPartLoginResult(i, str);
    }

    @Override // p153l.bn5
    public void signOut() {
        this.f89756a.signOut();
    }

    @Override // p153l.bn5
    public boolean signedIn_() {
        return TantanApp.f17901e.mo107143b() != null && TantanApp.f17900d.mo107143b().booleanValue();
    }

    @Override // p153l.bn5
    /* JADX INFO: renamed from: t2 */
    public s0y mo105313t2() {
        return this.f89756a.mo29145t2();
    }

    @Override // p153l.bn5
    /* JADX INFO: renamed from: t5 */
    public Class mo105314t5() {
        return this.f89756a.mo29143Vs();
    }

    @Override // p153l.bn5
    public void trackPlayerBlockTime(long j, String str, String str2) {
        this.f89757b.trackPlayerBlockTime(j, str, str2);
    }

    @Override // p153l.bn5
    /* JADX INFO: renamed from: u4 */
    public C22421c<AlipayAuthEnvelop> mo105315u4(String str, String str2) {
        return this.f89757b.mo31119u4(str, str2);
    }

    @Override // p153l.bn5
    public String userId() {
        if (getAuthData().mo107143b() == null) {
            return null;
        }
        return getAuthData().mo107143b().userId;
    }

    @Override // p153l.bn5
    /* JADX INFO: renamed from: v0 */
    public Class<? extends Act> mo105316v0() {
        return this.f89757b.mo31120v0();
    }

    @Override // p153l.bn5
    /* JADX INFO: renamed from: z5 */
    public C22421c<uxj0> mo105317z5(pcj<x1d0> pcjVar, C22507a<ArrayList<Contract>> c22507a) {
        return this.f89757b.mo31121z5(pcjVar, c22507a);
    }
}
