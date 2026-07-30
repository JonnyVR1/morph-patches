package p149l;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.VirtualCardType;
import com.p046p1.mobile.putong.core.newui.home.NewNewProfileCard;
import com.p046p1.mobile.putong.core.newui.home.ViewTreeObserverOnGlobalLayoutListenerC7866b;
import com.p046p1.mobile.putong.core.p053ui.PictureView;
import com.p046p1.mobile.putong.core.p053ui.home.VirtualCard;
import com.p046p1.mobile.putong.data.User;

/* JADX INFO: loaded from: classes11.dex */
public interface a5m extends mol, znl {
    /* JADX INFO: renamed from: B0 */
    boolean mo36803B0(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b, a5m a5mVar, CoreSuggested.UserInfo userInfo, int i);

    /* JADX INFO: renamed from: C */
    void mo36806C();

    /* JADX INFO: renamed from: D */
    boolean mo36809D(String str);

    /* JADX INFO: renamed from: F */
    boolean mo37916F();

    /* JADX INFO: renamed from: R */
    boolean mo37917R();

    /* JADX INFO: renamed from: T */
    void mo36852T(User user, CoreSuggested.UserInfo userInfo, int i);

    /* JADX INFO: renamed from: U */
    void mo36854U();

    /* JADX INFO: renamed from: Y */
    PictureView mo36864Y();

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
    default boolean m95053i() {
        return false;
    }

    /* JADX INFO: renamed from: m */
    void mo36908m(User user, CoreSuggested.UserInfo userInfo, int i, View view);

    /* JADX INFO: renamed from: q0 */
    boolean mo36922q0();

    /* JADX INFO: renamed from: r */
    void mo36925r();

    void setPageHelper(@NonNull NewNewProfileCard.InterfaceC7863d interfaceC7863d);

    void setUsHomeCardAnimHelper(chj0 chj0Var);

    /* JADX INFO: renamed from: t */
    ViewStub mo36932t();

    /* JADX INFO: renamed from: y */
    boolean mo36947y();

    /* JADX INFO: renamed from: G */
    default void mo36817G() {
    }

    /* JADX INFO: renamed from: I */
    default void mo36822I() {
    }

    /* JADX INFO: renamed from: n */
    default void m95054n() {
    }

    /* JADX INFO: renamed from: s */
    default void mo36929s() {
    }

    default void setExpandedScrollListener(oql oqlVar) {
    }

    default void setUndoClickAction(d30 d30Var) {
    }

    @Deprecated
    /* JADX INFO: renamed from: Q */
    default void mo36845Q(CoreSuggested.UserInfo userInfo, qol0 qol0Var, VirtualCardType virtualCardType, int i) {
    }
}
