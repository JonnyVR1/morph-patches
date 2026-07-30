package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreBusinessModule;
import com.p046p1.mobile.putong.core.newui.home.ViewTreeObserverOnGlobalLayoutListenerC7866b;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.core.newui.messages.ConversationsList;
import com.p046p1.mobile.putong.core.newui.messages.ConversationsTabFrag;
import com.p046p1.mobile.putong.core.p053ui.helpcenter.HelpCenterFrag;
import com.p046p1.mobile.putong.core.p053ui.profile.views.ProfileCustomBar;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import p147v.VPager;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes9.dex */
public class ys9 implements ts9 {
    /* JADX INFO: renamed from: o */
    public static /* synthetic */ Boolean m215884o(ActionMenuView actionMenuView, Act act) {
        for (int i = 0; i < actionMenuView.getChildCount(); i++) {
            View childAt = actionMenuView.getChildAt(i);
            if (childAt instanceof ActionMenuItemView) {
                act.getAppTheme().mo103048j((ActionMenuItemView) childAt);
                break;
            }
        }
        return Boolean.TRUE;
    }

    @Override // p149l.ts9
    /* JADX INFO: renamed from: A4 */
    public void mo190513A4(Act act) {
        m215885p(act, new e30() { // from class: l.ws9
            @Override // p149l.e30
            public final void call(Object obj) {
                CrashHelper.m81296c(new Exception("setTantanCoinWalletActionMenuViewTheme error: " + ((String) obj)));
            }
        });
    }

    @Override // p149l.ts9
    /* JADX INFO: renamed from: a */
    public void mo190514a(Act act) {
        m215885p(act, new e30() { // from class: l.vs9
            @Override // p149l.e30
            public final void call(Object obj) {
                CrashHelper.m81296c(new Exception("setIntlEmojiActionMenuViewTheme error: " + ((String) obj)));
            }
        });
    }

    @Override // p149l.ts9
    /* JADX INFO: renamed from: b */
    public int mo190515b() {
        return x2c0.f189719S1;
    }

    @Override // p149l.ts9
    /* JADX INFO: renamed from: c */
    public int mo190516c() {
        return w0c0.f183838c2;
    }

    @Override // p149l.ts9
    /* JADX INFO: renamed from: d */
    public void mo190517d(ConversationsTabFrag conversationsTabFrag) {
        Act act = conversationsTabFrag.act();
        nx0 appTheme = act.getAppTheme();
        act.toolbar().setBackground(appTheme.mo105492b());
        act.toolbar().setTitleTextColor(appTheme.mo103046f());
        act.toolbar().setSubtitleTextColor(appTheme.mo103045e());
        act.setTitleColor(appTheme.mo103046f());
        TextView textView = act.centralTitle;
        if (textView != null) {
            textView.setTextSize(2, 20.0f);
            act.centralTitle.setAllCaps(false);
            act.centralTitle.setTypeface(Typeface.DEFAULT_BOLD);
            act.centralTitle.setIncludeFontPadding(false);
            act.centralTitle.setTextColor(appTheme.mo103046f());
        }
    }

    @Override // p149l.ts9
    /* JADX INFO: renamed from: e */
    public void mo190518e(MenuItem menuItem) {
        ImageView imageView = (ImageView) menuItem.getActionView().findViewById(u4c0.f174307j3);
        if (imageView != null) {
            Drawable drawableMutate = imageView.getDrawable().mutate();
            drawableMutate.setColorFilter(-2667209, PorterDuff.Mode.SRC_ATOP);
            imageView.setImageDrawable(drawableMutate);
        }
    }

    @Override // p149l.ts9
    /* JADX INFO: renamed from: f */
    public void mo190519f(idl idlVar) {
        NewMainAct newMainActAct = idlVar.act();
        if (newMainActAct == null) {
            return;
        }
        nx0 appTheme = newMainActAct.getAppTheme();
        View view = new View(newMainActAct);
        view.setBackgroundColor(appTheme.mo105493d());
        idlVar.f112615a.addView(view, new LinearLayout.LayoutParams(-1, 0));
        xdl0.m208398r0(view);
        idlVar.f112615a.setBackground(appTheme.mo105492b());
        idlVar.f112599R.mo126592c().setBackground(appTheme.mo105492b());
        idlVar.f112599R.mo126598i().setImageResource(x2c0.f189719S1);
        idlVar.f112628m.setBackgroundColor(-1);
        idlVar.f112593O.setBackgroundColor(-1);
    }

    @Override // p149l.ts9
    /* JADX INFO: renamed from: g */
    public void mo190520g(ConversationsTabFrag conversationsTabFrag) {
        Act act = conversationsTabFrag.act();
        nx0 appTheme = act.getAppTheme();
        FrameLayout frameLayout = new FrameLayout(act);
        frameLayout.setBackground(appTheme.mo105492b());
        xdl0.m208398r0(frameLayout);
        int iM186890d = t100.m186890d(44.0f);
        try {
            if (NullChecker.m81303a(act.toolbar())) {
                Toolbar toolbar = act.toolbar();
                toolbar.setPadding(0, toolbar.getPaddingTop(), toolbar.getPaddingRight(), toolbar.getPaddingBottom());
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = iM186890d;
                toolbar.setLayoutParams(layoutParams);
                TextView textView = (TextView) Act.TOOLBAR_TITLE_VIEW_FILED.get(toolbar);
                if (NullChecker.m81303a(textView)) {
                    textView.setTextSize(21.0f);
                    mji0.m154821o(textView, v7c0.f180347B);
                    textView.setTextColor(act.getResources().getColor(w0c0.f183875p));
                    ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
                    layoutParams2.height = iM186890d;
                    textView.setLayoutParams(layoutParams2);
                    textView.setPadding(-t100.m186890d(5.0f), t100.m186890d(2.0f), 0, 0);
                }
                ViewGroup.LayoutParams layoutParams3 = toolbar.getLayoutParams();
                layoutParams3.height = iM186890d;
                toolbar.setLayoutParams(layoutParams3);
            }
        } catch (Exception e) {
            CrashHelper.m81296c(new Exception("initToolbarTheme reflect mNavButtonView error: " + e.getMessage()));
        }
        View view = new View(act);
        view.setBackgroundColor(appTheme.mo105493d());
        frameLayout.addView(view, new ViewGroup.LayoutParams(-1, 0));
        xdl0.m208398r0(view);
        xdl0.m208396q0(iM186890d, frameLayout);
        xdl0.m208327D0(-1, frameLayout);
        conversationsTabFrag.f25192B.addView(frameLayout);
        ConversationsList conversationsList = conversationsTabFrag.f25195E;
        VPager vPager = conversationsTabFrag.f25193C;
        if (conversationsList == null) {
            xdl0.m208362Z(vPager, conversationsTabFrag.f25202I);
            xdl0.m208361Y(iM186890d, conversationsTabFrag.f25193C, conversationsTabFrag.f25202I);
        } else {
            xdl0.m208362Z(vPager, conversationsList, conversationsTabFrag.f25202I);
            xdl0.m208361Y(iM186890d, conversationsTabFrag.f25193C, conversationsTabFrag.f25195E, conversationsTabFrag.f25202I);
        }
    }

    @Override // p149l.ts9
    /* JADX INFO: renamed from: h */
    public void mo190521h(ProfileCustomBar profileCustomBar) {
        profileCustomBar.f34150d.setImageDrawable(profileCustomBar.f34150d.getDrawable().mutate());
    }

    @Override // p149l.ts9
    /* JADX INFO: renamed from: i */
    public void mo190522i(TabLayout tabLayout) {
        tabLayout.setBackgroundColor(-1);
        tabLayout.setTabTextColors(2130706432, RoundedDrawable.DEFAULT_BORDER_COLOR);
        tabLayout.setSelectedTabIndicatorColor(-2279389);
    }

    @Override // p149l.ts9
    /* JADX INFO: renamed from: j */
    public void mo190523j(NewMainAct newMainAct) {
        PutongAct.setLightStatusBar(newMainAct.getWindow(), 1040);
    }

    @Override // p149l.ts9
    /* JADX INFO: renamed from: k */
    public void mo190524k(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        NewMainAct newMainActAct = viewTreeObserverOnGlobalLayoutListenerC7866b.act();
        if (newMainActAct == null) {
            return;
        }
        nx0 appTheme = newMainActAct.getAppTheme();
        if (!upa.m194847z()) {
            View view = new View(newMainActAct);
            view.setBackgroundColor(appTheme.mo105493d());
            viewTreeObserverOnGlobalLayoutListenerC7866b.f21916a.addView(view, new LinearLayout.LayoutParams(-1, 0));
            viewTreeObserverOnGlobalLayoutListenerC7866b.f21918b.setBackground(appTheme.mo105492b());
            viewTreeObserverOnGlobalLayoutListenerC7866b.f21904U.mo126598i().setImageResource(CoreBusinessModule.m29908m0().mo190515b());
            viewTreeObserverOnGlobalLayoutListenerC7866b.f21863B.setBackgroundColor(-1);
            viewTreeObserverOnGlobalLayoutListenerC7866b.f21865C.setBackgroundColor(-1);
        }
        if (g6a.m124574w() || upa.m194847z()) {
            return;
        }
        viewTreeObserverOnGlobalLayoutListenerC7866b.f21904U.mo126592c().setBackground(appTheme.mo105492b());
    }

    @Override // p149l.ts9
    /* JADX INFO: renamed from: l */
    public void mo190525l(HelpCenterFrag helpCenterFrag, Menu menu, MenuInflater menuInflater, MenuItem menuItem) {
        ImageView imageView = (ImageView) menuItem.getActionView().findViewById(u4c0.f174377n5);
        Drawable drawableMutate = imageView.getDrawable().mutate();
        drawableMutate.setColorFilter(-1289674463, PorterDuff.Mode.SRC_ATOP);
        imageView.setImageDrawable(drawableMutate);
    }

    /* JADX INFO: renamed from: p */
    public final void m215885p(final Act act, e30<String> e30Var) {
        if (NullChecker.m81303a(act.toolbar())) {
            try {
                final ActionMenuView actionMenuView = (ActionMenuView) Act.TOOLBAR_MENU_VIEW_FILED.get(act.toolbar());
                if (NullChecker.m81303a(actionMenuView)) {
                    xdl0.m208366b0(actionMenuView, new v9j() { // from class: l.xs9
                        @Override // p149l.v9j, java.util.concurrent.Callable
                        public final Object call() {
                            return ys9.m215884o(actionMenuView, act);
                        }
                    });
                }
            } catch (Exception e) {
                CrashHelper.m81296c(e);
                e30Var.call(e.getMessage());
            }
        }
    }
}
