package p006l;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.alipay.sdk.app.AuthTask;
import com.p000p1.mobile.putong.app.C0125a;
import com.p000p1.mobile.putong.app.PutongAct;
import com.p1.mobile.android.app.Act;
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
public interface yl5 {
    /* JADX INFO: renamed from: A2 */
    vrx mo11984A2();

    /* JADX INFO: renamed from: B5 */
    void mo11985B5(Act act, Video video, String str);

    /* JADX INFO: renamed from: C3 */
    c<Boolean> mo11986C3(String str);

    /* JADX INFO: renamed from: D5 */
    boolean mo11987D5();

    /* JADX INFO: renamed from: G */
    C0125a mo11988G(PutongAct putongAct);

    /* JADX INFO: renamed from: G2 */
    tpx mo11989G2();

    /* JADX INFO: renamed from: H0 */
    String mo11990H0();

    /* JADX INFO: renamed from: I */
    boolean mo11991I(Envelope envelope);

    /* JADX INFO: renamed from: L0 */
    vrx mo11992L0();

    /* JADX INFO: renamed from: O0 */
    HashSet<String> mo11993O0(Envelope envelope, Integer num);

    /* JADX INFO: renamed from: P1 */
    String mo11994P1();

    /* JADX INFO: renamed from: P4 */
    vrx mo11995P4();

    /* JADX INFO: renamed from: R0 */
    vrx mo11996R0();

    /* JADX INFO: renamed from: R3 */
    void mo11997R3(Throwable th);

    /* JADX INFO: renamed from: T3 */
    void mo11998T3(Envelope envelope, HashSet<String> hashSet, Integer num);

    /* JADX INFO: renamed from: U4 */
    boolean mo11999U4();

    /* JADX INFO: renamed from: X4 */
    boolean mo12000X4();

    /* JADX INFO: renamed from: Y1 */
    c<Picture> mo12001Y1(Picture picture);

    /* JADX INFO: renamed from: a */
    User mo12002a(String str);

    /* JADX INFO: renamed from: a3 */
    int mo12003a3();

    c<AuthData> accessOutterToken();

    String accessToken();

    c<j760<Integer, String>> alipayAuthWithErrorCode(AuthTask authTask);

    /* JADX INFO: renamed from: b */
    op8 mo12004b();

    /* JADX INFO: renamed from: c */
    g9s mo12005c();

    /* JADX INFO: renamed from: c2 */
    void mo12006c2(PutongAct putongAct, d30 d30Var);

    void clientNeedsForceUpdate();

    Counter counter_();

    /* JADX INFO: renamed from: d */
    vrx mo12007d();

    /* JADX INFO: renamed from: e */
    boolean mo12008e();

    /* JADX INFO: renamed from: f */
    boolean mo12009f();

    /* JADX INFO: renamed from: g */
    InterfaceC0810ho mo12010g();

    epd0 getAuthData();

    Intent getMainActIntent(Context context);

    Class<? extends Activity> getSignOutJumpAct();

    SignUpData getSignUpData();

    /* JADX INFO: renamed from: j0 */
    vrx mo12011j0();

    /* JADX INFO: renamed from: l3 */
    c<List<Picture>> mo12012l3(List<Media> list);

    /* JADX INFO: renamed from: l5 */
    vrx mo12013l5();

    /* JADX INFO: renamed from: me */
    c<User> mo12014me();

    User me_();

    void mergeNetworkStateIntoLocalState(Envelope envelope, d30 d30Var);

    void pollUserCounters();

    User queryMe();

    /* JADX INFO: renamed from: r */
    void mo12015r(Act act);

    void sendThirdPartLoginResult(int i, String str);

    void signOut();

    boolean signedIn_();

    /* JADX INFO: renamed from: t2 */
    vrx mo12016t2();

    /* JADX INFO: renamed from: t5 */
    Class mo12017t5();

    void trackPlayerBlockTime(long j, String str, String str2);

    /* JADX INFO: renamed from: u4 */
    c<AlipayAuthEnvelop> mo12018u4(String str, String str2);

    String userId();

    /* JADX INFO: renamed from: v0 */
    Class<? extends Act> mo12019v0();

    /* JADX INFO: renamed from: z5 */
    c<roj0> mo12020z5(v9j<stc0> v9jVar, a<ArrayList<Contract>> aVar);
}
