package com.p046p1.mobile.putong.core.biz.service;

import android.content.Context;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.android.injecter.facade.template.IProvider;
import p149l.d30;
import p149l.e30;

/* JADX INFO: loaded from: classes9.dex */
public interface CoreMemberInnerService extends IProvider {
    /* JADX INFO: renamed from: Do */
    void mo34964Do(Act act, String str, String str2);

    /* JADX INFO: renamed from: Fb */
    void mo34965Fb();

    /* JADX INFO: renamed from: Fj */
    int mo34966Fj();

    /* JADX INFO: renamed from: Fq */
    void mo34967Fq();

    /* JADX INFO: renamed from: Hn */
    Frag mo34968Hn();

    /* JADX INFO: renamed from: Hs */
    int mo34969Hs();

    /* JADX INFO: renamed from: Kh */
    void mo34970Kh(String str);

    /* JADX INFO: renamed from: Pp */
    Frag mo34971Pp();

    /* JADX INFO: renamed from: Qo */
    void mo34972Qo();

    /* JADX INFO: renamed from: Se */
    int mo34973Se();

    /* JADX INFO: renamed from: Vh */
    boolean mo34974Vh();

    /* JADX INFO: renamed from: W6 */
    void mo34975W6(Frag frag, String str);

    /* JADX INFO: renamed from: Xm */
    int mo34976Xm();

    /* JADX INFO: renamed from: Xp */
    boolean mo34977Xp(PurchaseType purchaseType);

    /* JADX INFO: renamed from: br */
    void mo34978br();

    /* JADX INFO: renamed from: cc */
    int mo34979cc();

    /* JADX INFO: renamed from: dt */
    void mo34980dt(Act act, PurchaseType purchaseType, Privilege privilege, d30 d30Var);

    /* JADX INFO: renamed from: fn */
    boolean mo34981fn(String str);

    /* JADX INFO: renamed from: j7 */
    void mo34982j7(Context context, User user, ImageView imageView, boolean z, boolean z2);

    @DrawableRes
    /* JADX INFO: renamed from: jn */
    int mo34983jn();

    /* JADX INFO: renamed from: lg */
    Frag mo34984lg();

    /* JADX INFO: renamed from: li */
    void mo34985li(@NonNull Context context, String str, boolean z);

    /* JADX INFO: renamed from: o7 */
    void mo34986o7(Context context, User user, ImageView imageView, boolean z, boolean z2);

    /* JADX INFO: renamed from: ro */
    void mo34987ro(User user, ImageView imageView);

    /* JADX INFO: renamed from: ul */
    int mo34988ul();

    /* JADX INFO: renamed from: vr */
    void mo34989vr(Act act, User user, boolean z, @Nullable e30<Boolean> e30Var, String str);

    /* JADX INFO: renamed from: wq */
    boolean mo34990wq();

    /* JADX INFO: renamed from: x6 */
    int mo34991x6();

    /* JADX INFO: renamed from: yb */
    String mo34992yb(Context context);
}
