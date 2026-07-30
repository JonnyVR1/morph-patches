package p009l;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.newui.home.NewNewProfileCard;
import com.p000p1.mobile.putong.core.newui.home.ViewTreeObserverOnGlobalLayoutListenerC0030b;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.data.VirtualCardType;
import com.p1.mobile.putong.core.ui.PictureView;
import com.p1.mobile.putong.core.ui.home.VirtualCard;
import com.p1.mobile.putong.data.User;
import l.d30;
import l.qol0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public interface a5m extends mol, znl {
    /* JADX INFO: renamed from: B0 */
    boolean mo759B0(ViewTreeObserverOnGlobalLayoutListenerC0030b viewTreeObserverOnGlobalLayoutListenerC0030b, a5m a5mVar, CoreSuggested.UserInfo userInfo, int i);

    /* JADX INFO: renamed from: C */
    void mo762C();

    /* JADX INFO: renamed from: D */
    boolean mo765D(String str);

    /* JADX INFO: renamed from: F */
    boolean mo1890F();

    /* JADX INFO: renamed from: R */
    boolean mo1891R();

    /* JADX INFO: renamed from: T */
    void mo810T(User user, CoreSuggested.UserInfo userInfo, int i);

    /* JADX INFO: renamed from: U */
    void mo812U();

    /* JADX INFO: renamed from: Y */
    PictureView mo824Y();

    jj4 getCardData();

    View getCardView();

    default Context getContext() {
        return getCardView().getContext();
    }

    @Deprecated
    default VirtualCard getVirtualCard() {
        return null;
    }

    /* JADX INFO: renamed from: i */
    default boolean m11244i() {
        return false;
    }

    /* JADX INFO: renamed from: m */
    void mo872m(User user, CoreSuggested.UserInfo userInfo, int i, View view);

    /* JADX INFO: renamed from: q0 */
    boolean mo888q0();

    /* JADX INFO: renamed from: r */
    void mo891r();

    void setPageHelper(@NonNull NewNewProfileCard.InterfaceC0027d interfaceC0027d);

    void setUsHomeCardAnimHelper(chj0 chj0Var);

    /* JADX INFO: renamed from: t */
    ViewStub mo898t();

    /* JADX INFO: renamed from: y */
    boolean mo914y();

    /* JADX INFO: renamed from: G */
    default void mo773G() {
    }

    /* JADX INFO: renamed from: I */
    default void mo778I() {
    }

    /* JADX INFO: renamed from: n */
    default void m11245n() {
    }

    /* JADX INFO: renamed from: s */
    default void mo895s() {
    }

    default void setExpandedScrollListener(oql oqlVar) {
    }

    default void setUndoClickAction(d30 d30Var) {
    }

    @Deprecated
    /* JADX INFO: renamed from: Q */
    default void mo802Q(CoreSuggested.UserInfo userInfo, qol0 qol0Var, VirtualCardType virtualCardType, int i) {
    }
}
