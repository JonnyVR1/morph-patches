package p153l;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.VirtualCardType;
import com.p051p1.mobile.putong.core.newui.home.NewNewProfileCard;
import com.p051p1.mobile.putong.core.newui.home.ViewTreeObserverOnGlobalLayoutListenerC8017b;
import com.p051p1.mobile.putong.core.p058ui.PictureView;
import com.p051p1.mobile.putong.core.p058ui.home.VirtualCard;
import com.p051p1.mobile.putong.data.User;

/* JADX INFO: loaded from: classes11.dex */
public interface q7m extends xql, kql {
    /* JADX INFO: renamed from: B0 */
    boolean mo37806B0(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b, q7m q7mVar, CoreSuggested.UserInfo userInfo, int i);

    /* JADX INFO: renamed from: C */
    void mo37809C();

    /* JADX INFO: renamed from: D */
    boolean mo37812D(String str);

    /* JADX INFO: renamed from: F */
    boolean mo38919F();

    /* JADX INFO: renamed from: R */
    boolean mo38920R();

    /* JADX INFO: renamed from: T */
    void mo37855T(User user, CoreSuggested.UserInfo userInfo, int i);

    /* JADX INFO: renamed from: U */
    void mo37857U();

    /* JADX INFO: renamed from: Y */
    PictureView mo37867Y();

    ik4 getCardData();

    View getCardView();

    default Context getContext() {
        return getCardView().getContext();
    }

    @Deprecated
    default VirtualCard getVirtualCard() {
        return null;
    }

    /* JADX INFO: renamed from: i */
    default boolean m175663i() {
        return false;
    }

    /* JADX INFO: renamed from: m */
    void mo37911m(User user, CoreSuggested.UserInfo userInfo, int i, View view);

    /* JADX INFO: renamed from: q0 */
    boolean mo37925q0();

    /* JADX INFO: renamed from: r */
    void mo37928r();

    void setPageHelper(@NonNull NewNewProfileCard.InterfaceC8014d interfaceC8014d);

    void setUsHomeCardAnimHelper(fqj0 fqj0Var);

    /* JADX INFO: renamed from: t */
    ViewStub mo37935t();

    /* JADX INFO: renamed from: y */
    boolean mo37950y();

    /* JADX INFO: renamed from: G */
    default void mo37820G() {
    }

    /* JADX INFO: renamed from: I */
    default void mo37825I() {
    }

    /* JADX INFO: renamed from: n */
    default void m175664n() {
    }

    /* JADX INFO: renamed from: s */
    default void mo37932s() {
    }

    default void setExpandedScrollListener(atl atlVar) {
    }

    default void setUndoClickAction(x20 x20Var) {
    }

    @Deprecated
    /* JADX INFO: renamed from: Q */
    default void mo37848Q(CoreSuggested.UserInfo userInfo, uxl0 uxl0Var, VirtualCardType virtualCardType, int i) {
    }
}
