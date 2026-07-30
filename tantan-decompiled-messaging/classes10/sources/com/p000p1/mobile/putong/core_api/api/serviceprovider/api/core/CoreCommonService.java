package com.p000p1.mobile.putong.core_api.api.serviceprovider.api.core;

import android.content.Context;
import android.content.Intent;
import com.alipay.sdk.app.AuthTask;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.app.a;
import com.p1.mobile.putong.data.AlipayAuthEnvelop;
import com.p1.mobile.putong.data.Contract;
import com.p1.mobile.putong.data.Counter;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.User;
import com.tantanapp.android.injecter.facade.template.IProvider;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import l.d30;
import l.j760;
import l.roj0;
import l.stc0;
import l.v9j;
import l.vrx;
import p003l.op8;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public interface CoreCommonService extends IProvider {
    /* JADX INFO: renamed from: A2 */
    vrx m5243A2();

    /* JADX INFO: renamed from: C3 */
    c<Boolean> m5244C3(String str);

    /* JADX INFO: renamed from: G */
    a m5245G(PutongAct putongAct);

    /* JADX INFO: renamed from: I */
    boolean m5246I(Envelope envelope);

    /* JADX INFO: renamed from: L0 */
    vrx m5247L0();

    /* JADX INFO: renamed from: P1 */
    String m5248P1();

    /* JADX INFO: renamed from: P4 */
    vrx m5249P4();

    /* JADX INFO: renamed from: R3 */
    void m5250R3(Throwable th);

    /* JADX INFO: renamed from: T3 */
    void m5251T3(Envelope envelope, HashSet<String> hashSet, Integer num);

    /* JADX INFO: renamed from: U4 */
    boolean m5252U4();

    /* JADX INFO: renamed from: X4 */
    boolean m5253X4();

    /* JADX INFO: renamed from: Y1 */
    c<Picture> m5254Y1(Picture picture);

    /* JADX INFO: renamed from: a */
    op8 m5255a();

    /* JADX INFO: renamed from: a3 */
    int m5256a3();

    c<j760<Integer, String>> alipayAuthWithErrorCode(AuthTask authTask);

    /* JADX INFO: renamed from: c2 */
    void m5257c2(PutongAct putongAct, d30 d30Var);

    Counter counter_();

    Intent getMainActIntent(Context context);

    User getUserByIdInModule(String str);

    /* JADX INFO: renamed from: j0 */
    vrx m5258j0();

    /* JADX INFO: renamed from: l3 */
    c<List<Picture>> m5259l3(List<Media> list);

    /* JADX INFO: renamed from: l5 */
    vrx m5260l5();

    /* JADX INFO: renamed from: me */
    c<User> m5261me();

    User me_();

    void mergeNetworkStateIntoLocalState(Envelope envelope, d30 d30Var);

    void pollUserCounters();

    User queryMe();

    /* JADX INFO: renamed from: r */
    void m5262r(Act act);

    void trackPlayerBlockTime(long j, String str, String str2);

    /* JADX INFO: renamed from: u4 */
    c<AlipayAuthEnvelop> m5263u4(String str, String str2);

    /* JADX INFO: renamed from: v0 */
    Class<? extends Act> m5264v0();

    /* JADX INFO: renamed from: z5 */
    c<roj0> m5265z5(v9j<stc0> v9jVar, rx.subjects.a<ArrayList<Contract>> aVar);
}
