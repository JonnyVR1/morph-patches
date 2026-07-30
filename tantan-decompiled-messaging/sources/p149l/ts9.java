package p149l;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import com.google.android.material.tabs.TabLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.newui.home.ViewTreeObserverOnGlobalLayoutListenerC7866b;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.core.newui.messages.ConversationsTabFrag;
import com.p046p1.mobile.putong.core.p053ui.helpcenter.HelpCenterFrag;
import com.p046p1.mobile.putong.core.p053ui.profile.views.ProfileCustomBar;

/* JADX INFO: loaded from: classes9.dex */
public interface ts9 {
    @DrawableRes
    /* JADX INFO: renamed from: b */
    int mo190515b();

    @ColorRes
    /* JADX INFO: renamed from: c */
    default int mo190516c() {
        return w0c0.f183805S1;
    }

    /* JADX INFO: renamed from: d */
    void mo190517d(ConversationsTabFrag conversationsTabFrag);

    /* JADX INFO: renamed from: g */
    void mo190520g(ConversationsTabFrag conversationsTabFrag);

    /* JADX INFO: renamed from: i */
    void mo190522i(TabLayout tabLayout);

    /* JADX INFO: renamed from: A4 */
    default void mo190513A4(Act act) {
    }

    /* JADX INFO: renamed from: a */
    default void mo190514a(Act act) {
    }

    /* JADX INFO: renamed from: e */
    default void mo190518e(MenuItem menuItem) {
    }

    /* JADX INFO: renamed from: f */
    default void mo190519f(idl idlVar) {
    }

    /* JADX INFO: renamed from: h */
    default void mo190521h(ProfileCustomBar profileCustomBar) {
    }

    /* JADX INFO: renamed from: j */
    default void mo190523j(NewMainAct newMainAct) {
    }

    /* JADX INFO: renamed from: k */
    default void mo190524k(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
    }

    /* JADX INFO: renamed from: l */
    default void mo190525l(HelpCenterFrag helpCenterFrag, Menu menu, MenuInflater menuInflater, MenuItem menuItem) {
    }
}
