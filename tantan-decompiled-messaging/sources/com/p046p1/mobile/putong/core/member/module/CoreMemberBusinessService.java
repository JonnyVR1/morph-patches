package com.p046p1.mobile.putong.core.member.module;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.putong.core.data.LikeUser;
import com.p046p1.mobile.putong.core.data.LikedUser;
import com.p046p1.mobile.putong.core.data.PicksUser;
import com.p046p1.mobile.putong.core.newui.view.BoostViewContainer;
import com.p046p1.mobile.putong.core.p053ui.vip.picks.view.PicksItemView;
import com.p046p1.mobile.putong.data.LikeExtraData;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.android.injecter.facade.template.IProvider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VRelative;
import p149l.d30;
import p149l.dac0;
import p149l.e30;
import p149l.f30;
import p149l.me70;
import p149l.mlr;
import p149l.otl;
import p149l.ptl;
import p149l.qtl;
import p149l.stl;
import p149l.ue70;

/* JADX INFO: loaded from: classes10.dex */
public interface CoreMemberBusinessService extends IProvider {
    /* JADX INFO: renamed from: An */
    void mo35969An(User user);

    /* JADX INFO: renamed from: Bi */
    void mo35970Bi(User user);

    /* JADX INFO: renamed from: Ej */
    boolean mo35971Ej(boolean z, boolean z2, boolean z3, int i, String str, User user, Act act, String str2, f30<Relationship, Integer> f30Var, d30 d30Var);

    /* JADX INFO: renamed from: Jb */
    void mo35972Jb(Act act, int i, Intent intent);

    /* JADX INFO: renamed from: Ml */
    boolean mo35973Ml(Act act, User user, boolean z, boolean z2, boolean z3, String str, e30<Relationship> e30Var, e30<Throwable> e30Var2, String str2, LikeExtraData likeExtraData, String str3, String str4);

    /* JADX INFO: renamed from: O6 */
    void mo35974O6();

    /* JADX INFO: renamed from: Pb */
    boolean mo35975Pb(boolean z, boolean z2, boolean z3, int i, String str, User user, Act act, String str2, f30<Relationship, Integer> f30Var, d30 d30Var);

    /* JADX INFO: renamed from: Qd */
    boolean mo35976Qd(Act act, boolean z, boolean z2, int i, String str, String str2, User user, LikeUser likeUser, String str3, @Nullable e30<LikeUser> e30Var);

    /* JADX INFO: renamed from: Qe */
    void mo35977Qe(Act act, BoostViewContainer boostViewContainer);

    /* JADX INFO: renamed from: Ra */
    void mo35978Ra(@NotNull VRelative vRelative, @Nullable Act act, @NotNull String str, PicksItemView picksItemView);

    /* JADX INFO: renamed from: Ss */
    void mo35979Ss(mlr mlrVar);

    /* JADX INFO: renamed from: X8 */
    void mo35980X8(@NonNull String str, Act act);

    /* JADX INFO: renamed from: Yq */
    void mo35981Yq(int i, Intent intent, Act act);

    /* JADX INFO: renamed from: a9 */
    Intent mo35982a9(Context context);

    /* JADX INFO: renamed from: be */
    boolean mo35983be(Act act, stl stlVar, boolean z, boolean z2, boolean z3, int i, String str, String str2, User user, LikedUser likedUser);

    /* JADX INFO: renamed from: bj */
    int mo35984bj();

    /* JADX INFO: renamed from: bo */
    String mo35985bo();

    /* JADX INFO: renamed from: cb */
    boolean mo35986cb(Act act, Boolean bool, Boolean bool2, Boolean bool3, User user);

    /* JADX INFO: renamed from: ch */
    String mo35987ch();

    /* JADX INFO: renamed from: fe */
    boolean mo35988fe(boolean z, boolean z2, boolean z3, boolean z4, int i, String str, ptl ptlVar, qtl qtlVar, otl otlVar);

    /* JADX INFO: renamed from: ge */
    boolean mo35989ge(@NotNull Act act);

    /* JADX INFO: renamed from: k */
    boolean mo35990k();

    /* JADX INFO: renamed from: l1 */
    void mo35991l1(Act act, String str);

    /* JADX INFO: renamed from: lm */
    void mo35992lm(Act act, User user, String str, boolean z, Runnable runnable, Runnable runnable2, String str2);

    /* JADX INFO: renamed from: m6 */
    void mo35993m6(mlr mlrVar);

    /* JADX INFO: renamed from: n9 */
    void mo35994n9(mlr mlrVar);

    /* JADX INFO: renamed from: on */
    boolean mo35995on(boolean z, boolean z2, boolean z3, int i, @NotNull String str, @NotNull User user, String str2, @NotNull Frag frag, @NotNull PicksUser picksUser, @Nullable String str3, @NotNull dac0 dac0Var, @NotNull e30<String> e30Var, @NotNull d30 d30Var);

    /* JADX INFO: renamed from: pc */
    String mo35996pc();

    /* JADX INFO: renamed from: tq */
    boolean mo35997tq(Act act, User user, boolean z, boolean z2, boolean z3, String str, e30<Relationship> e30Var, e30<Throwable> e30Var2, String str2, LikeExtraData likeExtraData, String str3, String str4);

    /* JADX INFO: renamed from: vk */
    boolean mo35998vk(boolean z, boolean z2, boolean z3, int i, @NotNull String str, @NotNull User user, @Nullable String str2, @Nullable Act act, @Nullable ue70 ue70Var, @NotNull PicksUser picksUser, me70 me70Var);

    /* JADX INFO: renamed from: yk */
    void mo35999yk(Act act);
}
