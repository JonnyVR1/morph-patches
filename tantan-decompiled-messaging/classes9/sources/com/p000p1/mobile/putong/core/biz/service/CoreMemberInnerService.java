package com.p000p1.mobile.putong.core.biz.service;

import android.content.Context;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Frag;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.data.User;
import com.tantanapp.android.injecter.facade.template.IProvider;
import l.d30;
import l.e30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public interface CoreMemberInnerService extends IProvider {
    /* JADX INFO: renamed from: Do */
    void m6901Do(Act act, String str, String str2);

    /* JADX INFO: renamed from: Fb */
    void m6902Fb();

    /* JADX INFO: renamed from: Fj */
    int m6903Fj();

    /* JADX INFO: renamed from: Fq */
    void m6904Fq();

    /* JADX INFO: renamed from: Hn */
    Frag m6905Hn();

    /* JADX INFO: renamed from: Hs */
    int m6906Hs();

    /* JADX INFO: renamed from: Kh */
    void m6907Kh(String str);

    /* JADX INFO: renamed from: Pp */
    Frag m6908Pp();

    /* JADX INFO: renamed from: Qo */
    void m6909Qo();

    /* JADX INFO: renamed from: Se */
    int m6910Se();

    /* JADX INFO: renamed from: Vh */
    boolean m6911Vh();

    /* JADX INFO: renamed from: W6 */
    void m6912W6(Frag frag, String str);

    /* JADX INFO: renamed from: Xm */
    int m6913Xm();

    /* JADX INFO: renamed from: Xp */
    boolean m6914Xp(PurchaseType purchaseType);

    /* JADX INFO: renamed from: br */
    void m6915br();

    /* JADX INFO: renamed from: cc */
    int m6916cc();

    /* JADX INFO: renamed from: dt */
    void m6917dt(Act act, PurchaseType purchaseType, Privilege privilege, d30 d30Var);

    /* JADX INFO: renamed from: fn */
    boolean m6918fn(String str);

    /* JADX INFO: renamed from: j7 */
    void m6919j7(Context context, User user, ImageView imageView, boolean z, boolean z2);

    @DrawableRes
    /* JADX INFO: renamed from: jn */
    int m6920jn();

    /* JADX INFO: renamed from: lg */
    Frag m6921lg();

    /* JADX INFO: renamed from: li */
    void m6922li(@NonNull Context context, String str, boolean z);

    /* JADX INFO: renamed from: o7 */
    void m6923o7(Context context, User user, ImageView imageView, boolean z, boolean z2);

    /* JADX INFO: renamed from: ro */
    void m6924ro(User user, ImageView imageView);

    /* JADX INFO: renamed from: ul */
    int m6925ul();

    /* JADX INFO: renamed from: vr */
    void m6926vr(Act act, User user, boolean z, @Nullable e30<Boolean> e30Var, String str);

    /* JADX INFO: renamed from: wq */
    boolean m6927wq();

    /* JADX INFO: renamed from: x6 */
    int m6928x6();

    /* JADX INFO: renamed from: yb */
    String m6929yb(Context context);
}
