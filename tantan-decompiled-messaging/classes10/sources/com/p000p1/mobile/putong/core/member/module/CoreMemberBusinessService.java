package com.p000p1.mobile.putong.core.member.module;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.data.LikeUser;
import com.p000p1.mobile.putong.core.data.LikedUser;
import com.p000p1.mobile.putong.core.data.PicksUser;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Frag;
import com.p1.mobile.putong.core.newui.view.BoostViewContainer;
import com.p1.mobile.putong.core.ui.vip.picks.view.PicksItemView;
import com.p1.mobile.putong.data.LikeExtraData;
import com.p1.mobile.putong.data.Relationship;
import com.p1.mobile.putong.data.User;
import com.tantanapp.android.injecter.facade.template.IProvider;
import l.d30;
import l.dac0;
import l.e30;
import l.f30;
import l.me70;
import l.mlr;
import l.otl;
import l.ptl;
import l.qtl;
import l.stl;
import l.ue70;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VRelative;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public interface CoreMemberBusinessService extends IProvider {
    /* JADX INFO: renamed from: An */
    void mo792An(User user);

    /* JADX INFO: renamed from: Bi */
    void mo793Bi(User user);

    /* JADX INFO: renamed from: Ej */
    boolean mo794Ej(boolean z, boolean z2, boolean z3, int i, String str, User user, Act act, String str2, f30<Relationship, Integer> f30Var, d30 d30Var);

    /* JADX INFO: renamed from: Jb */
    void mo795Jb(Act act, int i, Intent intent);

    /* JADX INFO: renamed from: Ml */
    boolean mo796Ml(Act act, User user, boolean z, boolean z2, boolean z3, String str, e30<Relationship> e30Var, e30<Throwable> e30Var2, String str2, LikeExtraData likeExtraData, String str3, String str4);

    /* JADX INFO: renamed from: O6 */
    void mo797O6();

    /* JADX INFO: renamed from: Pb */
    boolean mo798Pb(boolean z, boolean z2, boolean z3, int i, String str, User user, Act act, String str2, f30<Relationship, Integer> f30Var, d30 d30Var);

    /* JADX INFO: renamed from: Qd */
    boolean mo799Qd(Act act, boolean z, boolean z2, int i, String str, String str2, User user, LikeUser likeUser, String str3, @Nullable e30<LikeUser> e30Var);

    /* JADX INFO: renamed from: Qe */
    void mo800Qe(Act act, BoostViewContainer boostViewContainer);

    /* JADX INFO: renamed from: Ra */
    void mo801Ra(@NotNull VRelative vRelative, @Nullable Act act, @NotNull String str, PicksItemView picksItemView);

    /* JADX INFO: renamed from: Ss */
    void mo802Ss(mlr mlrVar);

    /* JADX INFO: renamed from: X8 */
    void mo803X8(@NonNull String str, Act act);

    /* JADX INFO: renamed from: Yq */
    void mo804Yq(int i, Intent intent, Act act);

    /* JADX INFO: renamed from: a9 */
    Intent mo805a9(Context context);

    /* JADX INFO: renamed from: be */
    boolean mo806be(Act act, stl stlVar, boolean z, boolean z2, boolean z3, int i, String str, String str2, User user, LikedUser likedUser);

    /* JADX INFO: renamed from: bj */
    int mo807bj();

    /* JADX INFO: renamed from: bo */
    String mo808bo();

    /* JADX INFO: renamed from: cb */
    boolean mo809cb(Act act, Boolean bool, Boolean bool2, Boolean bool3, User user);

    /* JADX INFO: renamed from: ch */
    String mo810ch();

    /* JADX INFO: renamed from: fe */
    boolean mo811fe(boolean z, boolean z2, boolean z3, boolean z4, int i, String str, ptl ptlVar, qtl qtlVar, otl otlVar);

    /* JADX INFO: renamed from: ge */
    boolean mo812ge(@NotNull Act act);

    /* JADX INFO: renamed from: k */
    boolean mo813k();

    /* JADX INFO: renamed from: l1 */
    void mo814l1(Act act, String str);

    /* JADX INFO: renamed from: lm */
    void mo815lm(Act act, User user, String str, boolean z, Runnable runnable, Runnable runnable2, String str2);

    /* JADX INFO: renamed from: m6 */
    void mo816m6(mlr mlrVar);

    /* JADX INFO: renamed from: n9 */
    void mo817n9(mlr mlrVar);

    /* JADX INFO: renamed from: on */
    boolean mo818on(boolean z, boolean z2, boolean z3, int i, @NotNull String str, @NotNull User user, String str2, @NotNull Frag frag, @NotNull PicksUser picksUser, @Nullable String str3, @NotNull dac0 dac0Var, @NotNull e30<String> e30Var, @NotNull d30 d30Var);

    /* JADX INFO: renamed from: pc */
    String mo819pc();

    /* JADX INFO: renamed from: tq */
    boolean mo820tq(Act act, User user, boolean z, boolean z2, boolean z3, String str, e30<Relationship> e30Var, e30<Throwable> e30Var2, String str2, LikeExtraData likeExtraData, String str3, String str4);

    /* JADX INFO: renamed from: vk */
    boolean mo821vk(boolean z, boolean z2, boolean z3, int i, @NotNull String str, @NotNull User user, @Nullable String str2, @Nullable Act act, @Nullable ue70 ue70Var, @NotNull PicksUser picksUser, me70 me70Var);

    /* JADX INFO: renamed from: yk */
    void mo822yk(Act act);
}
