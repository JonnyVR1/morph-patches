package p153l;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import com.google.android.material.tabs.TabLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.newui.home.ViewTreeObserverOnGlobalLayoutListenerC8017b;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core.newui.messages.ConversationsTabFrag;
import com.p051p1.mobile.putong.core.p058ui.helpcenter.HelpCenterFrag;
import com.p051p1.mobile.putong.core.p058ui.profile.views.ProfileCustomBar;

/* JADX INFO: loaded from: classes9.dex */
public interface eu9 {
    @DrawableRes
    /* JADX INFO: renamed from: b */
    int mo122542b();

    @ColorRes
    /* JADX INFO: renamed from: c */
    default int mo122543c() {
        return c9c0.f80377T1;
    }

    /* JADX INFO: renamed from: d */
    void mo122544d(ConversationsTabFrag conversationsTabFrag);

    /* JADX INFO: renamed from: g */
    void mo122547g(ConversationsTabFrag conversationsTabFrag);

    /* JADX INFO: renamed from: i */
    void mo122549i(TabLayout tabLayout);

    /* JADX INFO: renamed from: A4 */
    default void mo122540A4(Act act) {
    }

    /* JADX INFO: renamed from: a */
    default void mo122541a(Act act) {
    }

    /* JADX INFO: renamed from: e */
    default void mo122545e(MenuItem menuItem) {
    }

    /* JADX INFO: renamed from: f */
    default void mo122546f(yfl yflVar) {
    }

    /* JADX INFO: renamed from: h */
    default void mo122548h(ProfileCustomBar profileCustomBar) {
    }

    /* JADX INFO: renamed from: j */
    default void mo122550j(NewMainAct newMainAct) {
    }

    /* JADX INFO: renamed from: k */
    default void mo122551k(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
    }

    /* JADX INFO: renamed from: l */
    default void mo122552l(HelpCenterFrag helpCenterFrag, Menu menu, MenuInflater menuInflater, MenuItem menuItem) {
    }
}
