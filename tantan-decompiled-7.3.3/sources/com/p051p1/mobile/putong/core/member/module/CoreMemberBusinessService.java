package com.p051p1.mobile.putong.core.member.module;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.putong.core.data.LikeUser;
import com.p051p1.mobile.putong.core.data.LikedUser;
import com.p051p1.mobile.putong.core.data.PicksUser;
import com.p051p1.mobile.putong.core.newui.view.BoostViewContainer;
import com.p051p1.mobile.putong.core.p058ui.vip.picks.view.PicksItemView;
import com.p051p1.mobile.putong.data.LikeExtraData;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.android.injecter.facade.template.IProvider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VRelative;
import p153l.an70;
import p153l.cwl;
import p153l.dwl;
import p153l.ewl;
import p153l.gwl;
import p153l.jic0;
import p153l.nnr;
import p153l.sm70;
import p153l.x20;
import p153l.y20;
import p153l.z20;

/* JADX INFO: loaded from: classes10.dex */
public interface CoreMemberBusinessService extends IProvider {
    /* JADX INFO: renamed from: An */
    void mo36972An(User user);

    /* JADX INFO: renamed from: Bi */
    void mo36973Bi(User user);

    /* JADX INFO: renamed from: Ej */
    boolean mo36974Ej(boolean z, boolean z2, boolean z3, int i, String str, User user, Act act, String str2, z20<Relationship, Integer> z20Var, x20 x20Var);

    /* JADX INFO: renamed from: Jb */
    void mo36975Jb(Act act, int i, Intent intent);

    /* JADX INFO: renamed from: Ml */
    boolean mo36976Ml(Act act, User user, boolean z, boolean z2, boolean z3, String str, y20<Relationship> y20Var, y20<Throwable> y20Var2, String str2, LikeExtraData likeExtraData, String str3, String str4);

    /* JADX INFO: renamed from: O6 */
    void mo36977O6();

    /* JADX INFO: renamed from: Pb */
    boolean mo36978Pb(boolean z, boolean z2, boolean z3, int i, String str, User user, Act act, String str2, z20<Relationship, Integer> z20Var, x20 x20Var);

    /* JADX INFO: renamed from: Qd */
    boolean mo36979Qd(Act act, boolean z, boolean z2, int i, String str, String str2, User user, LikeUser likeUser, String str3, @Nullable y20<LikeUser> y20Var);

    /* JADX INFO: renamed from: Qe */
    void mo36980Qe(Act act, BoostViewContainer boostViewContainer);

    /* JADX INFO: renamed from: Ra */
    void mo36981Ra(@NotNull VRelative vRelative, @Nullable Act act, @NotNull String str, PicksItemView picksItemView);

    /* JADX INFO: renamed from: Ss */
    void mo36982Ss(nnr nnrVar);

    /* JADX INFO: renamed from: X8 */
    void mo36983X8(@NonNull String str, Act act);

    /* JADX INFO: renamed from: Yq */
    void mo36984Yq(int i, Intent intent, Act act);

    /* JADX INFO: renamed from: a9 */
    Intent mo36985a9(Context context);

    /* JADX INFO: renamed from: be */
    boolean mo36986be(Act act, gwl gwlVar, boolean z, boolean z2, boolean z3, int i, String str, String str2, User user, LikedUser likedUser);

    /* JADX INFO: renamed from: bj */
    int mo36987bj();

    /* JADX INFO: renamed from: bo */
    String mo36988bo();

    /* JADX INFO: renamed from: cb */
    boolean mo36989cb(Act act, Boolean bool, Boolean bool2, Boolean bool3, User user);

    /* JADX INFO: renamed from: ch */
    String mo36990ch();

    /* JADX INFO: renamed from: fe */
    boolean mo36991fe(boolean z, boolean z2, boolean z3, boolean z4, int i, String str, dwl dwlVar, ewl ewlVar, cwl cwlVar);

    /* JADX INFO: renamed from: ge */
    boolean mo36992ge(@NotNull Act act);

    /* JADX INFO: renamed from: k */
    boolean mo36993k();

    /* JADX INFO: renamed from: l1 */
    void mo36994l1(Act act, String str);

    /* JADX INFO: renamed from: lm */
    void mo36995lm(Act act, User user, String str, boolean z, Runnable runnable, Runnable runnable2, String str2);

    /* JADX INFO: renamed from: m6 */
    void mo36996m6(nnr nnrVar);

    /* JADX INFO: renamed from: n9 */
    void mo36997n9(nnr nnrVar);

    /* JADX INFO: renamed from: on */
    boolean mo36998on(boolean z, boolean z2, boolean z3, int i, @NotNull String str, @NotNull User user, String str2, @NotNull Frag frag, @NotNull PicksUser picksUser, @Nullable String str3, @NotNull jic0 jic0Var, @NotNull y20<String> y20Var, @NotNull x20 x20Var);

    /* JADX INFO: renamed from: pc */
    String mo36999pc();

    /* JADX INFO: renamed from: tq */
    boolean mo37000tq(Act act, User user, boolean z, boolean z2, boolean z3, String str, y20<Relationship> y20Var, y20<Throwable> y20Var2, String str2, LikeExtraData likeExtraData, String str3, String str4);

    /* JADX INFO: renamed from: vk */
    boolean mo37001vk(boolean z, boolean z2, boolean z3, int i, @NotNull String str, @NotNull User user, @Nullable String str2, @Nullable Act act, @Nullable an70 an70Var, @NotNull PicksUser picksUser, sm70 sm70Var);

    /* JADX INFO: renamed from: yk */
    void mo37002yk(Act act);
}
