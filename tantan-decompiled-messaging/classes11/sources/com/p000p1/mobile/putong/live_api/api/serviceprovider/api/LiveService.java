package com.p000p1.mobile.putong.live_api.api.serviceprovider.api;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Frag;
import com.p1.mobile.putong.app.PutongFrag;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.LiveRegionTag;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserLiveState;
import com.p1.mobile.putong.data.UserWealthGradeConfig;
import com.p1.mobile.putong.data.VoiceLiveState;
import com.tantanapp.android.injecter.facade.template.IProvider;
import com.tantanapp.common.data.ValueObject;
import java.util.HashMap;
import java.util.List;
import l.d30;
import l.j760;
import l.k8k0;
import l.wp1;
import l.xaj0;
import p009l.a8m;
import p009l.bkn0;
import p009l.btu;
import p009l.cco;
import p009l.cqp;
import p009l.e5s;
import p009l.fvm0;
import p009l.fzs;
import p009l.g9s;
import p009l.huk;
import p009l.m0t;
import p009l.o7h0;
import p009l.p2h;
import p009l.rzt;
import p009l.wb3;
import p009l.wdo0;
import p009l.x7m;
import p009l.yyl0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public interface LiveService extends IProvider, k8k0 {
    /* JADX INFO: renamed from: Bq */
    boolean m9002Bq();

    /* JADX INFO: renamed from: C8 */
    boolean m9003C8();

    /* JADX INFO: renamed from: Dr */
    String m9004Dr(String str);

    /* JADX INFO: renamed from: Ei */
    boolean m9005Ei(int i);

    /* JADX INFO: renamed from: Ep */
    void m9006Ep();

    /* JADX INFO: renamed from: F8 */
    void m9007F8(Act act, boolean z, boolean z2, String str);

    /* JADX INFO: renamed from: Fr */
    void m9008Fr();

    /* JADX INFO: renamed from: Gj */
    UserWealthGradeConfig m9009Gj(int i, boolean z);

    /* JADX INFO: renamed from: Gr */
    Intent m9010Gr(Context context, @Nullable LiveSettingArgs liveSettingArgs);

    /* JADX INFO: renamed from: He */
    void m9011He(HashMap<String, ValueObject> map, HashMap<String, ValueObject> map2, Envelope envelope);

    /* JADX INFO: renamed from: Hh */
    String m9012Hh();

    /* JADX INFO: renamed from: I6 */
    fvm0 m9013I6();

    /* JADX INFO: renamed from: Ii */
    boolean m9014Ii(Intent intent);

    /* JADX INFO: renamed from: Ir */
    void m9015Ir(String str, String str2);

    /* JADX INFO: renamed from: Kb */
    boolean m9016Kb();

    /* JADX INFO: renamed from: L7 */
    c<Boolean> m9017L7();

    /* JADX INFO: renamed from: Lh */
    a8m m9018Lh();

    /* JADX INFO: renamed from: M6 */
    bkn0 m9019M6();

    /* JADX INFO: renamed from: M7 */
    boolean m9020M7();

    /* JADX INFO: renamed from: Ms */
    cqp m9021Ms(Act act, wp1 wp1Var);

    /* JADX INFO: renamed from: Ok */
    boolean m9022Ok();

    /* JADX INFO: renamed from: Om */
    boolean m9023Om();

    /* JADX INFO: renamed from: Qc */
    boolean m9024Qc();

    /* JADX INFO: renamed from: Qj */
    boolean m9025Qj();

    /* JADX INFO: renamed from: Rh */
    boolean m9026Rh();

    /* JADX INFO: renamed from: S8 */
    c<j760<ValueObject, ValueObject>> m9027S8(String str);

    /* JADX INFO: renamed from: Sf */
    void m9028Sf();

    /* JADX INFO: renamed from: Tc */
    void m9029Tc(Act act, String str, boolean z);

    /* JADX INFO: renamed from: Uf */
    fzs m9030Uf(Context context);

    /* JADX INFO: renamed from: Vm */
    boolean m9031Vm(ValueObject valueObject);

    /* JADX INFO: renamed from: Xh */
    Intent m9032Xh(Context context, IntentParams intentParams);

    /* JADX INFO: renamed from: Y8 */
    void m9033Y8(Act act, boolean z, int i, d30 d30Var);

    /* JADX INFO: renamed from: Yk */
    boolean m9034Yk(String str);

    /* JADX INFO: renamed from: Ys */
    wb3 m9035Ys();

    /* JADX INFO: renamed from: Z8 */
    void m9036Z8(Act act, Bundle bundle);

    @Nullable
    /* JADX INFO: renamed from: Zl */
    VoiceLiveState m9037Zl(String str);

    /* JADX INFO: renamed from: Zo */
    x7m m9038Zo();

    /* JADX INFO: renamed from: Zr */
    boolean m9039Zr();

    /* JADX INFO: renamed from: a */
    g9s m9040a();

    /* JADX INFO: renamed from: a7 */
    String m9041a7();

    /* JADX INFO: renamed from: ao */
    c<Boolean> m9042ao(String str);

    /* JADX INFO: renamed from: b7 */
    PutongFrag m9043b7();

    /* JADX INFO: renamed from: bl */
    c<e5s> m9044bl();

    Fragment buildLiveSquareFrag();

    /* JADX INFO: renamed from: c8 */
    int m9045c8();

    /* JADX INFO: renamed from: ce */
    e5s m9046ce();

    /* JADX INFO: renamed from: co */
    wdo0 m9047co();

    /* JADX INFO: renamed from: ek */
    void m9048ek(Act act, String str);

    /* JADX INFO: renamed from: es */
    boolean m9049es();

    p2h feedEntry();

    /* JADX INFO: renamed from: g6 */
    void m9050g6(String str);

    /* JADX INFO: renamed from: g9 */
    boolean m9051g9();

    /* JADX INFO: renamed from: ga */
    void m9052ga(Act act, String str, String str2);

    huk getH5PageApi();

    int getHomeLiveTabPosition();

    String getLiveCardText();

    btu getLiveVerification();

    String getTopShowingPageId(Fragment fragment);

    String getUserLiveId(String str);

    String getUserVirtualVoiceId(String str);

    /* JADX INFO: renamed from: gg */
    int m9053gg();

    /* JADX INFO: renamed from: gj */
    void m9054gj(Act act, String str);

    boolean hasLiveSettingEntry();

    /* JADX INFO: renamed from: ih */
    String m9055ih();

    boolean isLiveSquareHome(Fragment fragment);

    boolean isLiving();

    boolean liveShowMomentLikesAndComments();

    /* JADX INFO: renamed from: lp */
    boolean m9056lp();

    @Nullable
    /* JADX INFO: renamed from: lt */
    UserLiveState m9057lt(String str);

    /* JADX INFO: renamed from: mg */
    rzt m9058mg();

    /* JADX INFO: renamed from: ne */
    void m9059ne();

    /* JADX INFO: renamed from: nf */
    void m9060nf(Act act, String str);

    /* JADX INFO: renamed from: oj */
    void m9061oj(View view, xaj0<ValueObject, ValueObject, Boolean> xaj0Var, String str);

    /* JADX INFO: renamed from: oo */
    o7h0 m9062oo();

    /* JADX INFO: renamed from: p8 */
    boolean m9063p8();

    void putLiveState(List<User> list);

    /* JADX INFO: renamed from: qs */
    cco m9064qs();

    /* JADX INFO: renamed from: r9 */
    yyl0 m9065r9();

    /* JADX INFO: renamed from: rb */
    boolean m9066rb();

    /* JADX INFO: renamed from: rh */
    void m9067rh(Act act);

    /* JADX INFO: renamed from: rk */
    void m9068rk(LiveRegionTag liveRegionTag);

    /* JADX INFO: renamed from: sd */
    long m9069sd();

    /* JADX INFO: renamed from: sj */
    String m9070sj();

    void startAudienceLive(Context context, IntentParams intentParams);

    void startAudienceLive(Context context, String str, String str2, @Nullable String str3);

    void startLiveVerificationPage(Context context);

    /* JADX INFO: renamed from: t7 */
    m0t m9071t7();

    /* JADX INFO: renamed from: ub */
    boolean m9072ub(ValueObject valueObject);

    /* JADX INFO: renamed from: ue */
    Frag m9073ue(String str, String str2);

    void updateLiveMemberUser(User user, boolean z);

    /* JADX INFO: renamed from: uq */
    void m9074uq(Act act, String str, String str2);

    /* JADX INFO: renamed from: vf */
    Intent m9075vf(Intent intent);

    /* JADX INFO: renamed from: wc */
    void m9076wc(String str);

    /* JADX INFO: renamed from: wd */
    void m9077wd(Context context, String str, String str2, @Nullable String str3);

    /* JADX INFO: renamed from: yn */
    boolean m9078yn();

    /* JADX INFO: renamed from: zn */
    void m9079zn(Act act, String str);
}
