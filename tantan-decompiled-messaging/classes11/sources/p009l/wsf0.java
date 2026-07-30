package p009l;

import android.view.View;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.SwipeDirection;
import l.e30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public interface wsf0<T extends View, A> extends nti0 {
    /* JADX INFO: renamed from: A */
    void mo2797A(SwipeDirection swipeDirection);

    /* JADX INFO: renamed from: c */
    boolean mo2804c(boolean z);

    /* JADX INFO: renamed from: d */
    T mo2805d();

    /* JADX INFO: renamed from: e */
    void mo2806e(float f);

    /* JADX INFO: renamed from: g */
    void mo2807g(id50 id50Var);

    int getMeasuredHeightProxy();

    int getMeasuredWidthProxy();

    chj0 getUsHomeCardAnimHelper();

    /* JADX INFO: renamed from: i */
    void mo2808i(e30<mol> e30Var);

    @Nullable
    /* JADX INFO: renamed from: j */
    CoreSuggested.UserInfo mo2809j();

    /* JADX INFO: renamed from: k */
    void mo2810k(T t, SwipeDirection swipeDirection, float f, boolean z);

    @Nullable
    /* JADX INFO: renamed from: l */
    jj4 mo2811l();

    /* JADX INFO: renamed from: m */
    boolean mo2812m();

    /* JADX INFO: renamed from: n */
    void mo2813n();

    @Nullable
    /* JADX INFO: renamed from: o */
    jj4 mo2814o();

    /* JADX INFO: renamed from: p */
    void mo2815p(VSwipeStack.c cVar);

    /* JADX INFO: renamed from: r */
    void mo2816r(SwipeDirection swipeDirection, boolean z);

    void setAdapter(A a);

    void setAllowUpSwipe(boolean z);

    void setUsHomeCardAnimHelper(chj0 chj0Var);

    void setUsHomeExpandCardAnimHelper(ehj0 ehj0Var);

    /* JADX INFO: renamed from: y */
    void mo2818y();
}
