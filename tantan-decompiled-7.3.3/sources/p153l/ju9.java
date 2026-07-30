package p153l;

import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.tabs.TabLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreBusinessModule;
import com.p051p1.mobile.putong.core.newui.home.ViewTreeObserverOnGlobalLayoutListenerC8017b;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core.newui.messages.ConversationsList;
import com.p051p1.mobile.putong.core.newui.messages.ConversationsTabFrag;
import com.p051p1.mobile.putong.core.p058ui.helpcenter.HelpCenterFrag;
import com.p051p1.mobile.putong.core.p058ui.profile.views.ProfileCustomBar;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import p151v.VPager;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes9.dex */
public class ju9 implements eu9 {
    /* JADX INFO: renamed from: o */
    public static /* synthetic */ Boolean m146975o(ActionMenuView actionMenuView, Act act) {
        for (int i = 0; i < actionMenuView.getChildCount(); i++) {
            View childAt = actionMenuView.getChildAt(i);
            if (childAt instanceof ActionMenuItemView) {
                act.getAppTheme().mo134830j((ActionMenuItemView) childAt);
                break;
            }
        }
        return Boolean.TRUE;
    }

    @Override // p153l.eu9
    /* JADX INFO: renamed from: A4 */
    public void mo122540A4(Act act) {
        m146976p(act, new y20() { // from class: l.hu9
            @Override // p153l.y20
            public final void call(Object obj) {
                CrashHelper.m82479c(new Exception("setTantanCoinWalletActionMenuViewTheme error: " + ((String) obj)));
            }
        });
    }

    @Override // p153l.eu9
    /* JADX INFO: renamed from: a */
    public void mo122541a(Act act) {
        m146976p(act, new y20() { // from class: l.gu9
            @Override // p153l.y20
            public final void call(Object obj) {
                CrashHelper.m82479c(new Exception("setIntlEmojiActionMenuViewTheme error: " + ((String) obj)));
            }
        });
    }

    @Override // p153l.eu9
    /* JADX INFO: renamed from: b */
    public int mo122542b() {
        return dbc0.f86586T1;
    }

    @Override // p153l.eu9
    /* JADX INFO: renamed from: c */
    public int mo122543c() {
        return c9c0.f80411d2;
    }

    @Override // p153l.eu9
    /* JADX INFO: renamed from: d */
    public void mo122544d(ConversationsTabFrag conversationsTabFrag) {
        Act act = conversationsTabFrag.act();
        ux0 appTheme = act.getAppTheme();
        act.toolbar().setBackground(appTheme.mo134822b());
        act.toolbar().setTitleTextColor(appTheme.mo134826f());
        act.toolbar().setSubtitleTextColor(appTheme.mo134825e());
        act.setTitleColor(appTheme.mo134826f());
        TextView textView = act.centralTitle;
        if (textView != null) {
            textView.setTextSize(2, 20.0f);
            act.centralTitle.setAllCaps(false);
            act.centralTitle.setTypeface(Typeface.DEFAULT_BOLD);
            act.centralTitle.setIncludeFontPadding(false);
            act.centralTitle.setTextColor(appTheme.mo134826f());
        }
    }

    @Override // p153l.eu9
    /* JADX INFO: renamed from: e */
    public void mo122545e(MenuItem menuItem) {
        ImageView imageView = (ImageView) menuItem.getActionView().findViewById(adc0.f70432l3);
        if (imageView != null) {
            Drawable drawableMutate = imageView.getDrawable().mutate();
            drawableMutate.setColorFilter(-2667209, PorterDuff.Mode.SRC_ATOP);
            imageView.setImageDrawable(drawableMutate);
        }
    }

    @Override // p153l.eu9
    /* JADX INFO: renamed from: f */
    public void mo122546f(yfl yflVar) {
        NewMainAct newMainActAct = yflVar.act();
        if (newMainActAct == null) {
            return;
        }
        ux0 appTheme = newMainActAct.getAppTheme();
        View view = new View(newMainActAct);
        view.setBackgroundColor(appTheme.mo134824d());
        yflVar.f199585a.addView(view, new LinearLayout.LayoutParams(-1, 0));
        bnl0.m105578r0(view);
        yflVar.f199585a.setBackground(appTheme.mo134822b());
        yflVar.f199569R.mo118286c().setBackground(appTheme.mo134822b());
        yflVar.f199569R.mo118292i().setImageResource(dbc0.f86586T1);
        yflVar.f199598m.setBackgroundColor(-1);
        yflVar.f199563O.setBackgroundColor(-1);
    }

    @Override // p153l.eu9
    /* JADX INFO: renamed from: g */
    public void mo122547g(ConversationsTabFrag conversationsTabFrag) {
        Act act = conversationsTabFrag.act();
        ux0 appTheme = act.getAppTheme();
        FrameLayout frameLayout = new FrameLayout(act);
        frameLayout.setBackground(appTheme.mo134822b());
        bnl0.m105578r0(frameLayout);
        int iM175859d = qa00.m175859d(44.0f);
        try {
            if (NullChecker.m82486a(act.toolbar())) {
                Toolbar toolbar = act.toolbar();
                toolbar.setPadding(0, toolbar.getPaddingTop(), toolbar.getPaddingRight(), toolbar.getPaddingBottom());
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = iM175859d;
                toolbar.setLayoutParams(layoutParams);
                TextView textView = (TextView) Act.TOOLBAR_TITLE_VIEW_FILED.get(toolbar);
                if (NullChecker.m82486a(textView)) {
                    textView.setTextSize(21.0f);
                    msi0.m159817o(textView, agc0.f71108B);
                    textView.setTextColor(act.getResources().getColor(c9c0.f80445p));
                    ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
                    layoutParams2.height = iM175859d;
                    textView.setLayoutParams(layoutParams2);
                    textView.setPadding(-qa00.m175859d(5.0f), qa00.m175859d(2.0f), 0, 0);
                }
                ViewGroup.LayoutParams layoutParams3 = toolbar.getLayoutParams();
                layoutParams3.height = iM175859d;
                toolbar.setLayoutParams(layoutParams3);
            }
        } catch (Exception e) {
            CrashHelper.m82479c(new Exception("initToolbarTheme reflect mNavButtonView error: " + e.getMessage()));
        }
        View view = new View(act);
        view.setBackgroundColor(appTheme.mo134824d());
        frameLayout.addView(view, new ViewGroup.LayoutParams(-1, 0));
        bnl0.m105578r0(view);
        bnl0.m105576q0(iM175859d, frameLayout);
        bnl0.m105507D0(-1, frameLayout);
        conversationsTabFrag.f25934B.addView(frameLayout);
        ConversationsList conversationsList = conversationsTabFrag.f25937E;
        VPager vPager = conversationsTabFrag.f25935C;
        if (conversationsList == null) {
            bnl0.m105542Z(vPager, conversationsTabFrag.f25944I);
            bnl0.m105541Y(iM175859d, conversationsTabFrag.f25935C, conversationsTabFrag.f25944I);
        } else {
            bnl0.m105542Z(vPager, conversationsList, conversationsTabFrag.f25944I);
            bnl0.m105541Y(iM175859d, conversationsTabFrag.f25935C, conversationsTabFrag.f25937E, conversationsTabFrag.f25944I);
        }
    }

    @Override // p153l.eu9
    /* JADX INFO: renamed from: h */
    public void mo122548h(ProfileCustomBar profileCustomBar) {
        profileCustomBar.f34998d.setImageDrawable(profileCustomBar.f34998d.getDrawable().mutate());
    }

    @Override // p153l.eu9
    /* JADX INFO: renamed from: i */
    public void mo122549i(TabLayout tabLayout) {
        tabLayout.setBackgroundColor(-1);
        tabLayout.setTabTextColors(2130706432, RoundedDrawable.DEFAULT_BORDER_COLOR);
        tabLayout.setSelectedTabIndicatorColor(-2279389);
    }

    @Override // p153l.eu9
    /* JADX INFO: renamed from: j */
    public void mo122550j(NewMainAct newMainAct) {
        PutongAct.setLightStatusBar(newMainAct.getWindow(), 1040);
    }

    @Override // p153l.eu9
    /* JADX INFO: renamed from: k */
    public void mo122551k(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        NewMainAct newMainActAct = viewTreeObserverOnGlobalLayoutListenerC8017b.act();
        if (newMainActAct == null) {
            return;
        }
        ux0 appTheme = newMainActAct.getAppTheme();
        if (!gra.m131778z()) {
            View view = new View(newMainActAct);
            view.setBackgroundColor(appTheme.mo134824d());
            viewTreeObserverOnGlobalLayoutListenerC8017b.f22658a.addView(view, new LinearLayout.LayoutParams(-1, 0));
            viewTreeObserverOnGlobalLayoutListenerC8017b.f22660b.setBackground(appTheme.mo134822b());
            viewTreeObserverOnGlobalLayoutListenerC8017b.f22646U.mo118292i().setImageResource(CoreBusinessModule.m30906m0().mo122542b());
            viewTreeObserverOnGlobalLayoutListenerC8017b.f22605B.setBackgroundColor(-1);
            viewTreeObserverOnGlobalLayoutListenerC8017b.f22607C.setBackgroundColor(-1);
        }
        if (s7a.m184994w() || gra.m131778z()) {
            return;
        }
        viewTreeObserverOnGlobalLayoutListenerC8017b.f22646U.mo118286c().setBackground(appTheme.mo134822b());
    }

    @Override // p153l.eu9
    /* JADX INFO: renamed from: l */
    public void mo122552l(HelpCenterFrag helpCenterFrag, Menu menu, MenuInflater menuInflater, MenuItem menuItem) {
        ImageView imageView = (ImageView) menuItem.getActionView().findViewById(adc0.f70502p5);
        Drawable drawableMutate = imageView.getDrawable().mutate();
        drawableMutate.setColorFilter(-1289674463, PorterDuff.Mode.SRC_ATOP);
        imageView.setImageDrawable(drawableMutate);
    }

    /* JADX INFO: renamed from: p */
    public final void m146976p(final Act act, y20<String> y20Var) {
        if (NullChecker.m82486a(act.toolbar())) {
            try {
                final ActionMenuView actionMenuView = (ActionMenuView) Act.TOOLBAR_MENU_VIEW_FILED.get(act.toolbar());
                if (NullChecker.m82486a(actionMenuView)) {
                    bnl0.m105546b0(actionMenuView, new pcj() { // from class: l.iu9
                        @Override // p153l.pcj, java.util.concurrent.Callable
                        public final Object call() {
                            return ju9.m146975o(actionMenuView, act);
                        }
                    });
                }
            } catch (Exception e) {
                CrashHelper.m82479c(e);
                y20Var.call(e.getMessage());
            }
        }
    }
}
