package com.p051p1.mobile.putong.core.biz.service;

import android.content.Context;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.android.injecter.facade.template.IProvider;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes9.dex */
public interface CoreMemberInnerService extends IProvider {
    /* JADX INFO: renamed from: Do */
    void mo35967Do(Act act, String str, String str2);

    /* JADX INFO: renamed from: Fb */
    void mo35968Fb();

    /* JADX INFO: renamed from: Fj */
    int mo35969Fj();

    /* JADX INFO: renamed from: Fq */
    void mo35970Fq();

    /* JADX INFO: renamed from: Hn */
    Frag mo35971Hn();

    /* JADX INFO: renamed from: Hs */
    int mo35972Hs();

    /* JADX INFO: renamed from: Kh */
    void mo35973Kh(String str);

    /* JADX INFO: renamed from: Pp */
    Frag mo35974Pp();

    /* JADX INFO: renamed from: Qo */
    void mo35975Qo();

    /* JADX INFO: renamed from: Se */
    int mo35976Se();

    /* JADX INFO: renamed from: Vh */
    boolean mo35977Vh();

    /* JADX INFO: renamed from: W6 */
    void mo35978W6(Frag frag, String str);

    /* JADX INFO: renamed from: Xm */
    int mo35979Xm();

    /* JADX INFO: renamed from: Xp */
    boolean mo35980Xp(PurchaseType purchaseType);

    /* JADX INFO: renamed from: br */
    void mo35981br();

    /* JADX INFO: renamed from: cc */
    int mo35982cc();

    /* JADX INFO: renamed from: dt */
    void mo35983dt(Act act, PurchaseType purchaseType, Privilege privilege, x20 x20Var);

    /* JADX INFO: renamed from: fn */
    boolean mo35984fn(String str);

    /* JADX INFO: renamed from: j7 */
    void mo35985j7(Context context, User user, ImageView imageView, boolean z, boolean z2);

    @DrawableRes
    /* JADX INFO: renamed from: jn */
    int mo35986jn();

    /* JADX INFO: renamed from: lg */
    Frag mo35987lg();

    /* JADX INFO: renamed from: li */
    void mo35988li(@NonNull Context context, String str, boolean z);

    /* JADX INFO: renamed from: o7 */
    void mo35989o7(Context context, User user, ImageView imageView, boolean z, boolean z2);

    /* JADX INFO: renamed from: ro */
    void mo35990ro(User user, ImageView imageView);

    /* JADX INFO: renamed from: ul */
    int mo35991ul();

    /* JADX INFO: renamed from: vr */
    void mo35992vr(Act act, User user, boolean z, @Nullable y20<Boolean> y20Var, String str);

    /* JADX INFO: renamed from: wq */
    boolean mo35993wq();

    /* JADX INFO: renamed from: x6 */
    int mo35994x6();

    /* JADX INFO: renamed from: yb */
    String mo35995yb(Context context);
}
