package p153l;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.alipay.sdk.app.AuthTask;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.C4850a;
import com.p051p1.mobile.putong.app.PutongAct;
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
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes9.dex */
public interface bn5 {
    /* JADX INFO: renamed from: A2 */
    s0y mo105281A2();

    /* JADX INFO: renamed from: B5 */
    void mo105282B5(Act act, Video video, String str);

    /* JADX INFO: renamed from: C3 */
    C22421c<Boolean> mo105283C3(String str);

    /* JADX INFO: renamed from: D5 */
    boolean mo105284D5();

    /* JADX INFO: renamed from: G */
    C4850a mo105285G(PutongAct putongAct);

    /* JADX INFO: renamed from: G2 */
    qyx mo105286G2();

    /* JADX INFO: renamed from: H0 */
    String mo105287H0();

    /* JADX INFO: renamed from: I */
    boolean mo105288I(Envelope envelope);

    /* JADX INFO: renamed from: L0 */
    s0y mo105289L0();

    /* JADX INFO: renamed from: O0 */
    HashSet<String> mo105290O0(Envelope envelope, Integer num);

    /* JADX INFO: renamed from: P1 */
    String mo105291P1();

    /* JADX INFO: renamed from: P4 */
    s0y mo105292P4();

    /* JADX INFO: renamed from: R0 */
    s0y mo105293R0();

    /* JADX INFO: renamed from: R3 */
    void mo105294R3(Throwable th);

    /* JADX INFO: renamed from: T3 */
    void mo105295T3(Envelope envelope, HashSet<String> hashSet, Integer num);

    /* JADX INFO: renamed from: U4 */
    boolean mo105296U4();

    /* JADX INFO: renamed from: X4 */
    boolean mo105297X4();

    /* JADX INFO: renamed from: Y1 */
    C22421c<Picture> mo105298Y1(Picture picture);

    /* JADX INFO: renamed from: a */
    User mo105299a(String str);

    /* JADX INFO: renamed from: a3 */
    int mo105300a3();

    C22421c<AuthData> accessOutterToken();

    String accessToken();

    C22421c<pf60<Integer, String>> alipayAuthWithErrorCode(AuthTask authTask);

    /* JADX INFO: renamed from: b */
    tq8 mo105301b();

    /* JADX INFO: renamed from: c */
    hbs mo105302c();

    /* JADX INFO: renamed from: c2 */
    void mo105303c2(PutongAct putongAct, x20 x20Var);

    void clientNeedsForceUpdate();

    Counter counter_();

    /* JADX INFO: renamed from: d */
    s0y mo105304d();

    /* JADX INFO: renamed from: e */
    boolean mo105305e();

    /* JADX INFO: renamed from: f */
    boolean mo105306f();

    /* JADX INFO: renamed from: g */
    InterfaceC16069bo mo105307g();

    gxd0 getAuthData();

    Intent getMainActIntent(Context context);

    Class<? extends Activity> getSignOutJumpAct();

    SignUpData getSignUpData();

    /* JADX INFO: renamed from: j0 */
    s0y mo105308j0();

    /* JADX INFO: renamed from: l3 */
    C22421c<List<Picture>> mo105309l3(List<Media> list);

    /* JADX INFO: renamed from: l5 */
    s0y mo105310l5();

    /* JADX INFO: renamed from: me */
    C22421c<User> mo105311me();

    User me_();

    void mergeNetworkStateIntoLocalState(Envelope envelope, x20 x20Var);

    void pollUserCounters();

    User queryMe();

    /* JADX INFO: renamed from: r */
    void mo105312r(Act act);

    void sendThirdPartLoginResult(int i, String str);

    void signOut();

    boolean signedIn_();

    /* JADX INFO: renamed from: t2 */
    s0y mo105313t2();

    /* JADX INFO: renamed from: t5 */
    Class mo105314t5();

    void trackPlayerBlockTime(long j, String str, String str2);

    /* JADX INFO: renamed from: u4 */
    C22421c<AlipayAuthEnvelop> mo105315u4(String str, String str2);

    String userId();

    /* JADX INFO: renamed from: v0 */
    Class<? extends Act> mo105316v0();

    /* JADX INFO: renamed from: z5 */
    C22421c<uxj0> mo105317z5(pcj<x1d0> pcjVar, C22507a<ArrayList<Contract>> c22507a);
}
