package p153l;

import android.view.View;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.SwipeDirection;

/* JADX INFO: loaded from: classes11.dex */
public interface f1g0<T extends View, A> extends r2j0 {
    /* JADX INFO: renamed from: A */
    void mo39804A(SwipeDirection swipeDirection);

    /* JADX INFO: renamed from: c */
    boolean mo39811c(boolean z);

    /* JADX INFO: renamed from: d */
    T mo39812d();

    /* JADX INFO: renamed from: e */
    void mo39813e(float f);

    /* JADX INFO: renamed from: g */
    void mo39814g(pl50 pl50Var);

    int getMeasuredHeightProxy();

    int getMeasuredWidthProxy();

    fqj0 getUsHomeCardAnimHelper();

    /* JADX INFO: renamed from: i */
    void mo39815i(y20<xql> y20Var);

    @Nullable
    /* JADX INFO: renamed from: j */
    CoreSuggested.UserInfo mo39816j();

    /* JADX INFO: renamed from: k */
    void mo39817k(T t, SwipeDirection swipeDirection, float f, boolean z);

    @Nullable
    /* JADX INFO: renamed from: l */
    ik4 mo39818l();

    /* JADX INFO: renamed from: m */
    boolean mo39819m();

    /* JADX INFO: renamed from: n */
    void mo39820n();

    @Nullable
    /* JADX INFO: renamed from: o */
    ik4 mo39821o();

    /* JADX INFO: renamed from: p */
    void mo39822p(VSwipeStack.InterfaceC4918c interfaceC4918c);

    /* JADX INFO: renamed from: r */
    void mo39823r(SwipeDirection swipeDirection, boolean z);

    void setAdapter(A a);

    void setAllowUpSwipe(boolean z);

    void setUsHomeCardAnimHelper(fqj0 fqj0Var);

    void setUsHomeExpandCardAnimHelper(hqj0 hqj0Var);

    /* JADX INFO: renamed from: y */
    void mo39825y();
}
