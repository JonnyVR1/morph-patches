package com.p051p1.mobile.putong.core_api.api.serviceprovider.api.core;

import android.content.Context;
import android.content.Intent;
import com.alipay.sdk.app.AuthTask;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.C4850a;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.data.AlipayAuthEnvelop;
import com.p051p1.mobile.putong.data.Contract;
import com.p051p1.mobile.putong.data.Counter;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.android.injecter.facade.template.IProvider;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p153l.pcj;
import p153l.pf60;
import p153l.s0y;
import p153l.tq8;
import p153l.uxj0;
import p153l.x1d0;
import p153l.x20;

/* JADX INFO: loaded from: classes12.dex */
public interface CoreCommonService extends IProvider {
    /* JADX INFO: renamed from: A2 */
    s0y mo31098A2();

    /* JADX INFO: renamed from: C3 */
    C22421c<Boolean> mo31099C3(String str);

    /* JADX INFO: renamed from: G */
    C4850a mo31100G(PutongAct putongAct);

    /* JADX INFO: renamed from: I */
    boolean mo31101I(Envelope envelope);

    /* JADX INFO: renamed from: L0 */
    s0y mo31102L0();

    /* JADX INFO: renamed from: P1 */
    String mo31103P1();

    /* JADX INFO: renamed from: P4 */
    s0y mo31104P4();

    /* JADX INFO: renamed from: R3 */
    void mo31105R3(Throwable th);

    /* JADX INFO: renamed from: T3 */
    void mo31106T3(Envelope envelope, HashSet<String> hashSet, Integer num);

    /* JADX INFO: renamed from: U4 */
    boolean mo31107U4();

    /* JADX INFO: renamed from: X4 */
    boolean mo31108X4();

    /* JADX INFO: renamed from: Y1 */
    C22421c<Picture> mo31109Y1(Picture picture);

    /* JADX INFO: renamed from: a */
    tq8 mo31110a();

    /* JADX INFO: renamed from: a3 */
    int mo31111a3();

    C22421c<pf60<Integer, String>> alipayAuthWithErrorCode(AuthTask authTask);

    /* JADX INFO: renamed from: c2 */
    void mo31112c2(PutongAct putongAct, x20 x20Var);

    Counter counter_();

    Intent getMainActIntent(Context context);

    User getUserByIdInModule(String str);

    /* JADX INFO: renamed from: j0 */
    s0y mo31113j0();

    /* JADX INFO: renamed from: l3 */
    C22421c<List<Picture>> mo31115l3(List<Media> list);

    /* JADX INFO: renamed from: l5 */
    s0y mo31116l5();

    /* JADX INFO: renamed from: me */
    C22421c<User> mo31117me();

    User me_();

    void mergeNetworkStateIntoLocalState(Envelope envelope, x20 x20Var);

    void pollUserCounters();

    User queryMe();

    /* JADX INFO: renamed from: r */
    void mo31118r(Act act);

    void trackPlayerBlockTime(long j, String str, String str2);

    /* JADX INFO: renamed from: u4 */
    C22421c<AlipayAuthEnvelop> mo31119u4(String str, String str2);

    /* JADX INFO: renamed from: v0 */
    Class<? extends Act> mo31120v0();

    /* JADX INFO: renamed from: z5 */
    C22421c<uxj0> mo31121z5(pcj<x1d0> pcjVar, C22507a<ArrayList<Contract>> c22507a);
}
