package p149l;

import android.view.View;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.SwipeDirection;

/* JADX INFO: loaded from: classes11.dex */
public interface wsf0<T extends View, A> extends nti0 {
    /* JADX INFO: renamed from: A */
    void mo38801A(SwipeDirection swipeDirection);

    /* JADX INFO: renamed from: c */
    boolean mo38808c(boolean z);

    /* JADX INFO: renamed from: d */
    T mo38809d();

    /* JADX INFO: renamed from: e */
    void mo38810e(float f);

    /* JADX INFO: renamed from: g */
    void mo38811g(id50 id50Var);

    int getMeasuredHeightProxy();

    int getMeasuredWidthProxy();

    chj0 getUsHomeCardAnimHelper();

    /* JADX INFO: renamed from: i */
    void mo38812i(e30<mol> e30Var);

    @Nullable
    /* JADX INFO: renamed from: j */
    CoreSuggested.UserInfo mo38813j();

    /* JADX INFO: renamed from: k */
    void mo38814k(T t, SwipeDirection swipeDirection, float f, boolean z);

    @Nullable
    /* JADX INFO: renamed from: l */
    jj4 mo38815l();

    /* JADX INFO: renamed from: m */
    boolean mo38816m();

    /* JADX INFO: renamed from: n */
    void mo38817n();

    @Nullable
    /* JADX INFO: renamed from: o */
    jj4 mo38818o();

    /* JADX INFO: renamed from: p */
    void mo38819p(VSwipeStack.InterfaceC4767c interfaceC4767c);

    /* JADX INFO: renamed from: r */
    void mo38820r(SwipeDirection swipeDirection, boolean z);

    void setAdapter(A a);

    void setAllowUpSwipe(boolean z);

    void setUsHomeCardAnimHelper(chj0 chj0Var);

    void setUsHomeExpandCardAnimHelper(ehj0 ehj0Var);

    /* JADX INFO: renamed from: y */
    void mo38822y();
}
