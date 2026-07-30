package com.p051p1.mobile.putong.live_api.api.serviceprovider.api;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.LiveRegionTag;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserLiveState;
import com.p051p1.mobile.putong.data.UserWealthGradeConfig;
import com.p051p1.mobile.putong.data.VoiceLiveState;
import com.tantanapp.android.injecter.facade.template.IProvider;
import com.tantanapp.common.data.ValueObject;
import java.util.HashMap;
import java.util.List;
import p137rx.C22421c;
import p153l.ano0;
import p153l.bkj0;
import p153l.c8m0;
import p153l.ceo;
import p153l.csp;
import p153l.cvu;
import p153l.dq1;
import p153l.e4h;
import p153l.f7s;
import p153l.ftn0;
import p153l.g1t;
import p153l.hbs;
import p153l.j4n0;
import p153l.lc3;
import p153l.n2t;
import p153l.nam;
import p153l.pf60;
import p153l.qam;
import p153l.qhk0;
import p153l.s1u;
import p153l.wfh0;
import p153l.x20;
import p153l.xwk;

/* JADX INFO: loaded from: classes10.dex */
public interface LiveService extends IProvider, qhk0 {
    /* JADX INFO: renamed from: Bq */
    boolean mo68395Bq();

    /* JADX INFO: renamed from: C8 */
    boolean mo68396C8();

    /* JADX INFO: renamed from: Dr */
    String mo68397Dr(String str);

    /* JADX INFO: renamed from: Ei */
    boolean mo68398Ei(int i);

    /* JADX INFO: renamed from: Ep */
    void mo68399Ep();

    /* JADX INFO: renamed from: F8 */
    void mo68400F8(Act act, boolean z, boolean z2, String str);

    /* JADX INFO: renamed from: Fr */
    void mo68401Fr();

    /* JADX INFO: renamed from: Gj */
    UserWealthGradeConfig mo68402Gj(int i, boolean z);

    /* JADX INFO: renamed from: Gr */
    Intent mo68403Gr(Context context, @Nullable LiveSettingArgs liveSettingArgs);

    /* JADX INFO: renamed from: He */
    void mo68404He(HashMap<String, ValueObject> map, HashMap<String, ValueObject> map2, Envelope envelope);

    /* JADX INFO: renamed from: Hh */
    String mo68405Hh();

    /* JADX INFO: renamed from: I6 */
    j4n0 mo68406I6();

    /* JADX INFO: renamed from: Ii */
    boolean mo68407Ii(Intent intent);

    /* JADX INFO: renamed from: Ir */
    void mo68408Ir(String str, String str2);

    /* JADX INFO: renamed from: Kb */
    boolean mo68409Kb();

    /* JADX INFO: renamed from: L7 */
    C22421c<Boolean> mo68410L7();

    /* JADX INFO: renamed from: Lh */
    qam mo68411Lh();

    /* JADX INFO: renamed from: M6 */
    ftn0 mo68412M6();

    /* JADX INFO: renamed from: M7 */
    boolean mo68413M7();

    /* JADX INFO: renamed from: Ms */
    csp mo68414Ms(Act act, dq1 dq1Var);

    /* JADX INFO: renamed from: Ok */
    boolean mo68415Ok();

    /* JADX INFO: renamed from: Om */
    boolean mo68416Om();

    /* JADX INFO: renamed from: Qc */
    boolean mo68419Qc();

    /* JADX INFO: renamed from: Qj */
    boolean mo68420Qj();

    /* JADX INFO: renamed from: Rh */
    boolean mo68422Rh();

    /* JADX INFO: renamed from: S8 */
    C22421c<pf60<ValueObject, ValueObject>> mo68424S8(String str);

    /* JADX INFO: renamed from: Sf */
    void mo68425Sf();

    /* JADX INFO: renamed from: Tc */
    void mo68427Tc(Act act, String str, boolean z);

    /* JADX INFO: renamed from: Uf */
    g1t mo68428Uf(Context context);

    /* JADX INFO: renamed from: Vm */
    boolean mo68429Vm(ValueObject valueObject);

    /* JADX INFO: renamed from: Xh */
    Intent mo68430Xh(Context context, IntentParams intentParams);

    /* JADX INFO: renamed from: Y8 */
    void mo68431Y8(Act act, boolean z, int i, x20 x20Var);

    /* JADX INFO: renamed from: Yk */
    boolean mo68432Yk(String str);

    /* JADX INFO: renamed from: Ys */
    lc3 mo68433Ys();

    /* JADX INFO: renamed from: Z8 */
    void mo68434Z8(Act act, Bundle bundle);

    @Nullable
    /* JADX INFO: renamed from: Zl */
    VoiceLiveState mo68435Zl(String str);

    /* JADX INFO: renamed from: Zo */
    nam mo68436Zo();

    /* JADX INFO: renamed from: Zr */
    boolean mo68437Zr();

    /* JADX INFO: renamed from: a */
    hbs mo68438a();

    /* JADX INFO: renamed from: a7 */
    String mo68439a7();

    /* JADX INFO: renamed from: ao */
    C22421c<Boolean> mo68440ao(String str);

    /* JADX INFO: renamed from: b7 */
    PutongFrag mo68441b7();

    /* JADX INFO: renamed from: bl */
    C22421c<f7s> mo68442bl();

    Fragment buildLiveSquareFrag();

    /* JADX INFO: renamed from: c8 */
    int mo68443c8();

    /* JADX INFO: renamed from: ce */
    f7s mo68444ce();

    /* JADX INFO: renamed from: co */
    ano0 mo68445co();

    /* JADX INFO: renamed from: ek */
    void mo68446ek(Act act, String str);

    /* JADX INFO: renamed from: es */
    boolean mo68447es();

    e4h feedEntry();

    /* JADX INFO: renamed from: g6 */
    void mo68448g6(String str);

    /* JADX INFO: renamed from: g9 */
    boolean mo68449g9();

    /* JADX INFO: renamed from: ga */
    void mo68450ga(Act act, String str, String str2);

    xwk getH5PageApi();

    int getHomeLiveTabPosition();

    String getLiveCardText();

    cvu getLiveVerification();

    String getTopShowingPageId(Fragment fragment);

    String getUserLiveId(String str);

    String getUserVirtualVoiceId(String str);

    /* JADX INFO: renamed from: gg */
    int mo68451gg();

    /* JADX INFO: renamed from: gj */
    void mo68452gj(Act act, String str);

    boolean hasLiveSettingEntry();

    /* JADX INFO: renamed from: ih */
    String mo68453ih();

    boolean isLiveSquareHome(Fragment fragment);

    boolean isLiving();

    boolean liveShowMomentLikesAndComments();

    /* JADX INFO: renamed from: lp */
    boolean mo68454lp();

    @Nullable
    /* JADX INFO: renamed from: lt */
    UserLiveState mo68455lt(String str);

    /* JADX INFO: renamed from: mg */
    s1u mo68456mg();

    /* JADX INFO: renamed from: ne */
    void mo68457ne();

    /* JADX INFO: renamed from: nf */
    void mo68458nf(Act act, String str);

    /* JADX INFO: renamed from: oj */
    void mo68459oj(View view, bkj0<ValueObject, ValueObject, Boolean> bkj0Var, String str);

    /* JADX INFO: renamed from: oo */
    wfh0 mo68460oo();

    /* JADX INFO: renamed from: p8 */
    boolean mo68461p8();

    void putLiveState(List<User> list);

    /* JADX INFO: renamed from: qs */
    ceo mo68462qs();

    /* JADX INFO: renamed from: r9 */
    c8m0 mo68463r9();

    /* JADX INFO: renamed from: rb */
    boolean mo68464rb();

    /* JADX INFO: renamed from: rh */
    void mo68465rh(Act act);

    /* JADX INFO: renamed from: rk */
    void mo68466rk(LiveRegionTag liveRegionTag);

    /* JADX INFO: renamed from: sd */
    long mo68467sd();

    /* JADX INFO: renamed from: sj */
    String mo68468sj();

    void startAudienceLive(Context context, IntentParams intentParams);

    void startAudienceLive(Context context, String str, String str2, @Nullable String str3);

    void startLiveVerificationPage(Context context);

    /* JADX INFO: renamed from: t7 */
    n2t mo68469t7();

    /* JADX INFO: renamed from: ub */
    boolean mo68470ub(ValueObject valueObject);

    /* JADX INFO: renamed from: ue */
    Frag mo68471ue(String str, String str2);

    void updateLiveMemberUser(User user, boolean z);

    /* JADX INFO: renamed from: uq */
    void mo68472uq(Act act, String str, String str2);

    /* JADX INFO: renamed from: vf */
    Intent mo68473vf(Intent intent);

    /* JADX INFO: renamed from: wc */
    void mo68474wc(String str);

    /* JADX INFO: renamed from: wd */
    void mo68475wd(Context context, String str, String str2, @Nullable String str3);

    /* JADX INFO: renamed from: yn */
    boolean mo68476yn();

    /* JADX INFO: renamed from: zn */
    void mo68477zn(Act act, String str);
}
