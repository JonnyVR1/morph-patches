package p149l;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.alipay.sdk.app.AuthTask;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.account_api.api.serviceprovider.api.AccountCommonService;
import com.p046p1.mobile.putong.app.C4699a;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.app.TantanApp;
import com.p046p1.mobile.putong.core_api.api.serviceprovider.api.core.CoreCommonService;
import com.p046p1.mobile.putong.data.AlipayAuthEnvelop;
import com.p046p1.mobile.putong.data.AuthData;
import com.p046p1.mobile.putong.data.Contract;
import com.p046p1.mobile.putong.data.Counter;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.SignUpData;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.feed.FeedCommonService;
import com.p046p1.mobile.putong.live_api.api.serviceprovider.api.live.LiveCommonService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes9.dex */
public final class am5 implements yl5 {

    /* JADX INFO: renamed from: a */
    public volatile AccountCommonService f70557a;

    /* JADX INFO: renamed from: b */
    public volatile CoreCommonService f70558b;

    /* JADX INFO: renamed from: c */
    public volatile FeedCommonService f70559c;

    /* JADX INFO: renamed from: d */
    public volatile LiveCommonService f70560d;

    @Override // p149l.yl5
    /* JADX INFO: renamed from: A2 */
    public vrx mo97492A2() {
        return this.f70558b.mo30100A2();
    }

    @Override // p149l.yl5
    /* JADX INFO: renamed from: B5 */
    public void mo97493B5(Act act, Video video, String str) {
        this.f70559c.mo60228B5(act, video, str);
    }

    @Override // p149l.yl5
    /* JADX INFO: renamed from: C3 */
    public C22306c<Boolean> mo97494C3(String str) {
        return this.f70558b.mo30101C3(str);
    }

    @Override // p149l.yl5
    /* JADX INFO: renamed from: D5 */
    public boolean mo97495D5() {
        return this.f70557a.mo28141D5();
    }

    @Override // p149l.yl5
    /* JADX INFO: renamed from: G */
    public C4699a mo97496G(PutongAct putongAct) {
        return this.f70558b.mo30102G(putongAct);
    }

    @Override // p149l.yl5
    /* JADX INFO: renamed from: G2 */
    public tpx mo97497G2() {
        return this.f70557a.mo28142G2();
    }

    @Override // p149l.yl5
    /* JADX INFO: renamed from: H0 */
    public String mo97498H0() {
        if (this.f70559c == null) {
            return null;
        }
        return this.f70559c.mo60229H0();
    }

    @Override // p149l.yl5
    /* JADX INFO: renamed from: I */
    public boolean mo97499I(Envelope envelope) {
        return this.f70558b.mo30103I(envelope);
    }

    @Override // p149l.yl5
    /* JADX INFO: renamed from: L0 */
    public vrx mo97500L0() {
        return this.f70558b.mo30104L0();
    }

    @Override // p149l.yl5
    /* JADX INFO: renamed from: O0 */
    public HashSet<String> mo97501O0(Envelope envelope, Integer num) {
        return this.f70559c.mo60230O0(envelope, num);
    }

    @Override // p149l.yl5
    /* JADX INFO: renamed from: P1 */
    public String mo97502P1() {
        return this.f70558b.mo30105P1();
    }

    @Override // p149l.yl5
    /* JADX INFO: renamed from: P4 */
    public vrx mo97503P4() {
        return this.f70558b.mo30106P4();
    }

    @Override // p149l.yl5
    /* JADX INFO: renamed from: R0 */
    public vrx mo97504R0() {
        return this.f70559c.mo60231R0();
    }

    @Override // p149l.yl5
    /* JADX INFO: renamed from: R3 */
    public void mo97505R3(Throwable th) {
        this.f70558b.mo30107R3(th);
    }

    @Override // p149l.yl5
    /* JADX INFO: renamed from: T3 */
    public void mo97506T3(Envelope envelope, HashSet<String> hashSet, Integer num) {
        this.f70558b.mo30108T3(envelope, hashSet, num);
    }

    @Override // p149l.yl5
    /* JADX INFO: renamed from: U4 */
    public boolean mo97507U4() {
        return this.f70558b == null || this.f70558b.mo30109U4();
    }

    @Override // p149l.yl5
    /* JADX INFO: renamed from: X4 */
    public boolean mo97508X4() {
        return this.f70558b.mo30110X4();
    }

    @Override // p149l.yl5
    /* JADX INFO: renamed from: Y1 */
    public C22306c<Picture> mo97509Y1(Picture picture) {
        return this.f70558b.mo30111Y1(picture);
    }

    @Override // p149l.yl5
    /* JADX INFO: renamed from: a */
    public User mo97510a(String str) {
        return this.f70558b.getUserByIdInModule(str);
    }

    @Override // p149l.yl5
    /* JADX INFO: renamed from: a3 */
    public int mo97511a3() {
        return this.f70558b.mo30113a3();
    }

    @Override // p149l.yl5
    public C22306c<AuthData> accessOutterToken() {
        return this.f70557a.accessOutterToken();
    }

    @Override // p149l.yl5
    public String accessToken() {
        epd0 epd0Var = TantanApp.f17182e;
        return epd0Var.mo108248b() == null ? "" : epd0Var.mo108248b().accessToken;
    }

    @Override // p149l.yl5
    public C22306c<j760<Integer, String>> alipayAuthWithErrorCode(AuthTask authTask) {
        return this.f70558b.alipayAuthWithErrorCode(authTask);
    }

    @Override // p149l.yl5
    /* JADX INFO: renamed from: b */
    public op8 mo97512b() {
        return this.f70558b.mo30112a();
    }

    @Override // p149l.yl5
    /* JADX INFO: renamed from: c */
    public g9s mo97513c() {
        return this.f70560d.mo67169a();
    }

    @Override // p149l.yl5
    /* JADX INFO: renamed from: c2 */
    public void mo97514c2(PutongAct putongAct, d30 d30Var) {
        this.f70558b.mo30114c2(putongAct, d30Var);
    }

    @Override // p149l.yl5
    public void clientNeedsForceUpdate() {
        this.f70557a.clientNeedsForceUpdate();
    }

    @Override // p149l.yl5
    public Counter counter_() {
        return this.f70558b.counter_();
    }

    @Override // p149l.yl5
    /* JADX INFO: renamed from: d */
    public vrx mo97515d() {
        return this.f70559c.mo60232nh();
    }

    @Override // p149l.yl5
    /* JADX INFO: renamed from: e */
    public boolean mo97516e() {
        return this.f70557a.mo28143G9();
    }

    @Override // p149l.yl5
    /* JADX INFO: renamed from: f */
    public boolean mo97517f() {
        return this.f70557a.mo28147x9();
    }

    @Override // p149l.yl5
    /* JADX INFO: renamed from: g */
    public InterfaceC17361ho mo97518g() {
        return this.f70557a.mo28145a();
    }

    @Override // p149l.yl5
    public epd0 getAuthData() {
        return TantanApp.f17182e;
    }

    @Override // p149l.yl5
    public Intent getMainActIntent(Context context) {
        return this.f70558b.getMainActIntent(context);
    }

    @Override // p149l.yl5
    public Class<? extends Activity> getSignOutJumpAct() {
        return this.f70557a.getSignOutJumpAct();
    }

    @Override // p149l.yl5
    public SignUpData getSignUpData() {
        return this.f70557a.getSignUpData();
    }

    @Override // p149l.yl5
    /* JADX INFO: renamed from: j0 */
    public vrx mo97519j0() {
        return this.f70558b.mo30115j0();
    }

    @Override // p149l.yl5
    /* JADX INFO: renamed from: l3 */
    public C22306c<List<Picture>> mo97520l3(List<Media> list) {
        return this.f70558b.mo30117l3(list);
    }

    @Override // p149l.yl5
    /* JADX INFO: renamed from: l5 */
    public vrx mo97521l5() {
        return this.f70558b.mo30118l5();
    }

    @Override // p149l.yl5
    /* JADX INFO: renamed from: me */
    public C22306c<User> mo97522me() {
        return this.f70558b.mo30119me();
    }

    @Override // p149l.yl5
    public User me_() {
        return this.f70558b.me_();
    }

    @Override // p149l.yl5
    public void mergeNetworkStateIntoLocalState(Envelope envelope, d30 d30Var) {
        this.f70558b.mergeNetworkStateIntoLocalState(envelope, d30Var);
    }

    @Override // p149l.yl5
    public void pollUserCounters() {
        this.f70558b.pollUserCounters();
    }

    @Override // p149l.yl5
    public User queryMe() {
        return this.f70558b.queryMe();
    }

    @Override // p149l.yl5
    /* JADX INFO: renamed from: r */
    public void mo97523r(Act act) {
        this.f70558b.mo30120r(act);
    }

    @Override // p149l.yl5
    public void sendThirdPartLoginResult(int i, String str) {
        this.f70557a.sendThirdPartLoginResult(i, str);
    }

    @Override // p149l.yl5
    public void signOut() {
        this.f70557a.signOut();
    }

    @Override // p149l.yl5
    public boolean signedIn_() {
        return TantanApp.f17182e.mo108248b() != null && TantanApp.f17181d.mo108248b().booleanValue();
    }

    @Override // p149l.yl5
    /* JADX INFO: renamed from: t2 */
    public vrx mo97524t2() {
        return this.f70557a.mo28146t2();
    }

    @Override // p149l.yl5
    /* JADX INFO: renamed from: t5 */
    public Class mo97525t5() {
        return this.f70557a.mo28144Vs();
    }

    @Override // p149l.yl5
    public void trackPlayerBlockTime(long j, String str, String str2) {
        this.f70558b.trackPlayerBlockTime(j, str, str2);
    }

    @Override // p149l.yl5
    /* JADX INFO: renamed from: u4 */
    public C22306c<AlipayAuthEnvelop> mo97526u4(String str, String str2) {
        return this.f70558b.mo30121u4(str, str2);
    }

    @Override // p149l.yl5
    public String userId() {
        if (getAuthData().mo108248b() == null) {
            return null;
        }
        return getAuthData().mo108248b().userId;
    }

    @Override // p149l.yl5
    /* JADX INFO: renamed from: v0 */
    public Class<? extends Act> mo97527v0() {
        return this.f70558b.mo30122v0();
    }

    @Override // p149l.yl5
    /* JADX INFO: renamed from: z5 */
    public C22306c<roj0> mo97528z5(v9j<stc0> v9jVar, C22392a<ArrayList<Contract>> c22392a) {
        return this.f70558b.mo30123z5(v9jVar, c22392a);
    }
}
