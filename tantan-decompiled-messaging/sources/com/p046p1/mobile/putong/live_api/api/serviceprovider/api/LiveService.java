package com.p046p1.mobile.putong.live_api.api.serviceprovider.api;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.LiveRegionTag;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserLiveState;
import com.p046p1.mobile.putong.data.UserWealthGradeConfig;
import com.p046p1.mobile.putong.data.VoiceLiveState;
import com.tantanapp.android.injecter.facade.template.IProvider;
import com.tantanapp.common.data.ValueObject;
import java.util.HashMap;
import java.util.List;
import p133rx.C22306c;
import p149l.a8m;
import p149l.bkn0;
import p149l.btu;
import p149l.cco;
import p149l.cqp;
import p149l.d30;
import p149l.e5s;
import p149l.fvm0;
import p149l.fzs;
import p149l.g9s;
import p149l.huk;
import p149l.j760;
import p149l.k8k0;
import p149l.m0t;
import p149l.o7h0;
import p149l.p2h;
import p149l.rzt;
import p149l.wb3;
import p149l.wdo0;
import p149l.wp1;
import p149l.x7m;
import p149l.xaj0;
import p149l.yyl0;

/* JADX INFO: loaded from: classes11.dex */
public interface LiveService extends IProvider, k8k0 {
    /* JADX INFO: renamed from: Bq */
    boolean mo67212Bq();

    /* JADX INFO: renamed from: C8 */
    boolean mo67213C8();

    /* JADX INFO: renamed from: Dr */
    String mo67214Dr(String str);

    /* JADX INFO: renamed from: Ei */
    boolean mo67215Ei(int i);

    /* JADX INFO: renamed from: Ep */
    void mo67216Ep();

    /* JADX INFO: renamed from: F8 */
    void mo67217F8(Act act, boolean z, boolean z2, String str);

    /* JADX INFO: renamed from: Fr */
    void mo67218Fr();

    /* JADX INFO: renamed from: Gj */
    UserWealthGradeConfig mo67219Gj(int i, boolean z);

    /* JADX INFO: renamed from: Gr */
    Intent mo67220Gr(Context context, @Nullable LiveSettingArgs liveSettingArgs);

    /* JADX INFO: renamed from: He */
    void mo67221He(HashMap<String, ValueObject> map, HashMap<String, ValueObject> map2, Envelope envelope);

    /* JADX INFO: renamed from: Hh */
    String mo67222Hh();

    /* JADX INFO: renamed from: I6 */
    fvm0 mo67223I6();

    /* JADX INFO: renamed from: Ii */
    boolean mo67224Ii(Intent intent);

    /* JADX INFO: renamed from: Ir */
    void mo67225Ir(String str, String str2);

    /* JADX INFO: renamed from: Kb */
    boolean mo67226Kb();

    /* JADX INFO: renamed from: L7 */
    C22306c<Boolean> mo67227L7();

    /* JADX INFO: renamed from: Lh */
    a8m mo67228Lh();

    /* JADX INFO: renamed from: M6 */
    bkn0 mo67229M6();

    /* JADX INFO: renamed from: M7 */
    boolean mo67230M7();

    /* JADX INFO: renamed from: Ms */
    cqp mo67231Ms(Act act, wp1 wp1Var);

    /* JADX INFO: renamed from: Ok */
    boolean mo67232Ok();

    /* JADX INFO: renamed from: Om */
    boolean mo67233Om();

    /* JADX INFO: renamed from: Qc */
    boolean mo67236Qc();

    /* JADX INFO: renamed from: Qj */
    boolean mo67237Qj();

    /* JADX INFO: renamed from: Rh */
    boolean mo67239Rh();

    /* JADX INFO: renamed from: S8 */
    C22306c<j760<ValueObject, ValueObject>> mo67241S8(String str);

    /* JADX INFO: renamed from: Sf */
    void mo67242Sf();

    /* JADX INFO: renamed from: Tc */
    void mo67244Tc(Act act, String str, boolean z);

    /* JADX INFO: renamed from: Uf */
    fzs mo67245Uf(Context context);

    /* JADX INFO: renamed from: Vm */
    boolean mo67246Vm(ValueObject valueObject);

    /* JADX INFO: renamed from: Xh */
    Intent mo67247Xh(Context context, IntentParams intentParams);

    /* JADX INFO: renamed from: Y8 */
    void mo67248Y8(Act act, boolean z, int i, d30 d30Var);

    /* JADX INFO: renamed from: Yk */
    boolean mo67249Yk(String str);

    /* JADX INFO: renamed from: Ys */
    wb3 mo67250Ys();

    /* JADX INFO: renamed from: Z8 */
    void mo67251Z8(Act act, Bundle bundle);

    @Nullable
    /* JADX INFO: renamed from: Zl */
    VoiceLiveState mo67252Zl(String str);

    /* JADX INFO: renamed from: Zo */
    x7m mo67253Zo();

    /* JADX INFO: renamed from: Zr */
    boolean mo67254Zr();

    /* JADX INFO: renamed from: a */
    g9s mo67255a();

    /* JADX INFO: renamed from: a7 */
    String mo67256a7();

    /* JADX INFO: renamed from: ao */
    C22306c<Boolean> mo67257ao(String str);

    /* JADX INFO: renamed from: b7 */
    PutongFrag mo67258b7();

    /* JADX INFO: renamed from: bl */
    C22306c<e5s> mo67259bl();

    Fragment buildLiveSquareFrag();

    /* JADX INFO: renamed from: c8 */
    int mo67260c8();

    /* JADX INFO: renamed from: ce */
    e5s mo67261ce();

    /* JADX INFO: renamed from: co */
    wdo0 mo67262co();

    /* JADX INFO: renamed from: ek */
    void mo67263ek(Act act, String str);

    /* JADX INFO: renamed from: es */
    boolean mo67264es();

    p2h feedEntry();

    /* JADX INFO: renamed from: g6 */
    void mo67265g6(String str);

    /* JADX INFO: renamed from: g9 */
    boolean mo67266g9();

    /* JADX INFO: renamed from: ga */
    void mo67267ga(Act act, String str, String str2);

    huk getH5PageApi();

    int getHomeLiveTabPosition();

    String getLiveCardText();

    btu getLiveVerification();

    String getTopShowingPageId(Fragment fragment);

    String getUserLiveId(String str);

    String getUserVirtualVoiceId(String str);

    /* JADX INFO: renamed from: gg */
    int mo67268gg();

    /* JADX INFO: renamed from: gj */
    void mo67269gj(Act act, String str);

    boolean hasLiveSettingEntry();

    /* JADX INFO: renamed from: ih */
    String mo67270ih();

    boolean isLiveSquareHome(Fragment fragment);

    boolean isLiving();

    boolean liveShowMomentLikesAndComments();

    /* JADX INFO: renamed from: lp */
    boolean mo67271lp();

    @Nullable
    /* JADX INFO: renamed from: lt */
    UserLiveState mo67272lt(String str);

    /* JADX INFO: renamed from: mg */
    rzt mo67273mg();

    /* JADX INFO: renamed from: ne */
    void mo67274ne();

    /* JADX INFO: renamed from: nf */
    void mo67275nf(Act act, String str);

    /* JADX INFO: renamed from: oj */
    void mo67276oj(View view, xaj0<ValueObject, ValueObject, Boolean> xaj0Var, String str);

    /* JADX INFO: renamed from: oo */
    o7h0 mo67277oo();

    /* JADX INFO: renamed from: p8 */
    boolean mo67278p8();

    void putLiveState(List<User> list);

    /* JADX INFO: renamed from: qs */
    cco mo67279qs();

    /* JADX INFO: renamed from: r9 */
    yyl0 mo67280r9();

    /* JADX INFO: renamed from: rb */
    boolean mo67281rb();

    /* JADX INFO: renamed from: rh */
    void mo67282rh(Act act);

    /* JADX INFO: renamed from: rk */
    void mo67283rk(LiveRegionTag liveRegionTag);

    /* JADX INFO: renamed from: sd */
    long mo67284sd();

    /* JADX INFO: renamed from: sj */
    String mo67285sj();

    void startAudienceLive(Context context, IntentParams intentParams);

    void startAudienceLive(Context context, String str, String str2, @Nullable String str3);

    void startLiveVerificationPage(Context context);

    /* JADX INFO: renamed from: t7 */
    m0t mo67286t7();

    /* JADX INFO: renamed from: ub */
    boolean mo67287ub(ValueObject valueObject);

    /* JADX INFO: renamed from: ue */
    Frag mo67288ue(String str, String str2);

    void updateLiveMemberUser(User user, boolean z);

    /* JADX INFO: renamed from: uq */
    void mo67289uq(Act act, String str, String str2);

    /* JADX INFO: renamed from: vf */
    Intent mo67290vf(Intent intent);

    /* JADX INFO: renamed from: wc */
    void mo67291wc(String str);

    /* JADX INFO: renamed from: wd */
    void mo67292wd(Context context, String str, String str2, @Nullable String str3);

    /* JADX INFO: renamed from: yn */
    boolean mo67293yn();

    /* JADX INFO: renamed from: zn */
    void mo67294zn(Act act, String str);
}
