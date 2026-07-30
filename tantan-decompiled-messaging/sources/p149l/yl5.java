package p149l;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.alipay.sdk.app.AuthTask;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.C4699a;
import com.p046p1.mobile.putong.app.PutongAct;
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
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes9.dex */
public interface yl5 {
    /* JADX INFO: renamed from: A2 */
    vrx mo97492A2();

    /* JADX INFO: renamed from: B5 */
    void mo97493B5(Act act, Video video, String str);

    /* JADX INFO: renamed from: C3 */
    C22306c<Boolean> mo97494C3(String str);

    /* JADX INFO: renamed from: D5 */
    boolean mo97495D5();

    /* JADX INFO: renamed from: G */
    C4699a mo97496G(PutongAct putongAct);

    /* JADX INFO: renamed from: G2 */
    tpx mo97497G2();

    /* JADX INFO: renamed from: H0 */
    String mo97498H0();

    /* JADX INFO: renamed from: I */
    boolean mo97499I(Envelope envelope);

    /* JADX INFO: renamed from: L0 */
    vrx mo97500L0();

    /* JADX INFO: renamed from: O0 */
    HashSet<String> mo97501O0(Envelope envelope, Integer num);

    /* JADX INFO: renamed from: P1 */
    String mo97502P1();

    /* JADX INFO: renamed from: P4 */
    vrx mo97503P4();

    /* JADX INFO: renamed from: R0 */
    vrx mo97504R0();

    /* JADX INFO: renamed from: R3 */
    void mo97505R3(Throwable th);

    /* JADX INFO: renamed from: T3 */
    void mo97506T3(Envelope envelope, HashSet<String> hashSet, Integer num);

    /* JADX INFO: renamed from: U4 */
    boolean mo97507U4();

    /* JADX INFO: renamed from: X4 */
    boolean mo97508X4();

    /* JADX INFO: renamed from: Y1 */
    C22306c<Picture> mo97509Y1(Picture picture);

    /* JADX INFO: renamed from: a */
    User mo97510a(String str);

    /* JADX INFO: renamed from: a3 */
    int mo97511a3();

    C22306c<AuthData> accessOutterToken();

    String accessToken();

    C22306c<j760<Integer, String>> alipayAuthWithErrorCode(AuthTask authTask);

    /* JADX INFO: renamed from: b */
    op8 mo97512b();

    /* JADX INFO: renamed from: c */
    g9s mo97513c();

    /* JADX INFO: renamed from: c2 */
    void mo97514c2(PutongAct putongAct, d30 d30Var);

    void clientNeedsForceUpdate();

    Counter counter_();

    /* JADX INFO: renamed from: d */
    vrx mo97515d();

    /* JADX INFO: renamed from: e */
    boolean mo97516e();

    /* JADX INFO: renamed from: f */
    boolean mo97517f();

    /* JADX INFO: renamed from: g */
    InterfaceC17361ho mo97518g();

    epd0 getAuthData();

    Intent getMainActIntent(Context context);

    Class<? extends Activity> getSignOutJumpAct();

    SignUpData getSignUpData();

    /* JADX INFO: renamed from: j0 */
    vrx mo97519j0();

    /* JADX INFO: renamed from: l3 */
    C22306c<List<Picture>> mo97520l3(List<Media> list);

    /* JADX INFO: renamed from: l5 */
    vrx mo97521l5();

    /* JADX INFO: renamed from: me */
    C22306c<User> mo97522me();

    User me_();

    void mergeNetworkStateIntoLocalState(Envelope envelope, d30 d30Var);

    void pollUserCounters();

    User queryMe();

    /* JADX INFO: renamed from: r */
    void mo97523r(Act act);

    void sendThirdPartLoginResult(int i, String str);

    void signOut();

    boolean signedIn_();

    /* JADX INFO: renamed from: t2 */
    vrx mo97524t2();

    /* JADX INFO: renamed from: t5 */
    Class mo97525t5();

    void trackPlayerBlockTime(long j, String str, String str2);

    /* JADX INFO: renamed from: u4 */
    C22306c<AlipayAuthEnvelop> mo97526u4(String str, String str2);

    String userId();

    /* JADX INFO: renamed from: v0 */
    Class<? extends Act> mo97527v0();

    /* JADX INFO: renamed from: z5 */
    C22306c<roj0> mo97528z5(v9j<stc0> v9jVar, C22392a<ArrayList<Contract>> c22392a);
}
