package com.p046p1.mobile.putong.core_api.api.serviceprovider.api.core;

import android.content.Context;
import android.content.Intent;
import com.alipay.sdk.app.AuthTask;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.C4699a;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.data.AlipayAuthEnvelop;
import com.p046p1.mobile.putong.data.Contract;
import com.p046p1.mobile.putong.data.Counter;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.android.injecter.facade.template.IProvider;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p149l.d30;
import p149l.j760;
import p149l.op8;
import p149l.roj0;
import p149l.stc0;
import p149l.v9j;
import p149l.vrx;

/* JADX INFO: loaded from: classes10.dex */
public interface CoreCommonService extends IProvider {
    /* JADX INFO: renamed from: A2 */
    vrx mo30100A2();

    /* JADX INFO: renamed from: C3 */
    C22306c<Boolean> mo30101C3(String str);

    /* JADX INFO: renamed from: G */
    C4699a mo30102G(PutongAct putongAct);

    /* JADX INFO: renamed from: I */
    boolean mo30103I(Envelope envelope);

    /* JADX INFO: renamed from: L0 */
    vrx mo30104L0();

    /* JADX INFO: renamed from: P1 */
    String mo30105P1();

    /* JADX INFO: renamed from: P4 */
    vrx mo30106P4();

    /* JADX INFO: renamed from: R3 */
    void mo30107R3(Throwable th);

    /* JADX INFO: renamed from: T3 */
    void mo30108T3(Envelope envelope, HashSet<String> hashSet, Integer num);

    /* JADX INFO: renamed from: U4 */
    boolean mo30109U4();

    /* JADX INFO: renamed from: X4 */
    boolean mo30110X4();

    /* JADX INFO: renamed from: Y1 */
    C22306c<Picture> mo30111Y1(Picture picture);

    /* JADX INFO: renamed from: a */
    op8 mo30112a();

    /* JADX INFO: renamed from: a3 */
    int mo30113a3();

    C22306c<j760<Integer, String>> alipayAuthWithErrorCode(AuthTask authTask);

    /* JADX INFO: renamed from: c2 */
    void mo30114c2(PutongAct putongAct, d30 d30Var);

    Counter counter_();

    Intent getMainActIntent(Context context);

    User getUserByIdInModule(String str);

    /* JADX INFO: renamed from: j0 */
    vrx mo30115j0();

    /* JADX INFO: renamed from: l3 */
    C22306c<List<Picture>> mo30117l3(List<Media> list);

    /* JADX INFO: renamed from: l5 */
    vrx mo30118l5();

    /* JADX INFO: renamed from: me */
    C22306c<User> mo30119me();

    User me_();

    void mergeNetworkStateIntoLocalState(Envelope envelope, d30 d30Var);

    void pollUserCounters();

    User queryMe();

    /* JADX INFO: renamed from: r */
    void mo30120r(Act act);

    void trackPlayerBlockTime(long j, String str, String str2);

    /* JADX INFO: renamed from: u4 */
    C22306c<AlipayAuthEnvelop> mo30121u4(String str, String str2);

    /* JADX INFO: renamed from: v0 */
    Class<? extends Act> mo30122v0();

    /* JADX INFO: renamed from: z5 */
    C22306c<roj0> mo30123z5(v9j<stc0> v9jVar, C22392a<ArrayList<Contract>> c22392a);
}
