package p006l;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import com.google.android.material.tabs.TabLayout;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.newui.home.b;
import com.p1.mobile.putong.core.newui.main.NewMainAct;
import com.p1.mobile.putong.core.newui.messages.ConversationsTabFrag;
import com.p1.mobile.putong.core.ui.helpcenter.HelpCenterFrag;
import com.p1.mobile.putong.core.ui.profile.views.ProfileCustomBar;
import l.idl;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public interface ts9 {
    @DrawableRes
    /* JADX INFO: renamed from: b */
    int mo24811b();

    @ColorRes
    /* JADX INFO: renamed from: c */
    default int mo24812c() {
        return w0c0.f24645S1;
    }

    /* JADX INFO: renamed from: d */
    void mo24813d(ConversationsTabFrag conversationsTabFrag);

    /* JADX INFO: renamed from: g */
    void mo24816g(ConversationsTabFrag conversationsTabFrag);

    /* JADX INFO: renamed from: i */
    void mo24818i(TabLayout tabLayout);

    /* JADX INFO: renamed from: A4 */
    default void mo24809A4(Act act) {
    }

    /* JADX INFO: renamed from: a */
    default void mo24810a(Act act) {
    }

    /* JADX INFO: renamed from: e */
    default void mo24814e(MenuItem menuItem) {
    }

    /* JADX INFO: renamed from: f */
    default void mo24815f(idl idlVar) {
    }

    /* JADX INFO: renamed from: h */
    default void mo24817h(ProfileCustomBar profileCustomBar) {
    }

    /* JADX INFO: renamed from: j */
    default void mo24819j(NewMainAct newMainAct) {
    }

    /* JADX INFO: renamed from: k */
    default void mo24820k(b bVar) {
    }

    /* JADX INFO: renamed from: l */
    default void mo24821l(HelpCenterFrag helpCenterFrag, Menu menu, MenuInflater menuInflater, MenuItem menuItem) {
    }
}
