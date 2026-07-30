package p006l;

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
import com.p000p1.mobile.putong.app.PutongAct;
import com.p000p1.mobile.putong.core.CoreBusinessModule;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.newui.home.b;
import com.p1.mobile.putong.core.newui.main.NewMainAct;
import com.p1.mobile.putong.core.newui.messages.ConversationsTabFrag;
import com.p1.mobile.putong.core.ui.helpcenter.HelpCenterFrag;
import com.p1.mobile.putong.core.ui.profile.views.ProfileCustomBar;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.idl;
import l.mji0;
import l.nx0;
import l.t100;
import l.v9j;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class ys9 implements ts9 {
    /* JADX INFO: renamed from: o */
    public static /* synthetic */ Boolean m28372o(ActionMenuView actionMenuView, Act act) {
        for (int i = 0; i < actionMenuView.getChildCount(); i++) {
            ActionMenuItemView childAt = actionMenuView.getChildAt(i);
            if (childAt instanceof ActionMenuItemView) {
                act.getAppTheme().j(childAt);
                break;
            }
        }
        return Boolean.TRUE;
    }

    @Override // p006l.ts9
    /* JADX INFO: renamed from: A4 */
    public void mo24809A4(Act act) {
        m28373p(act, new e30() { // from class: l.ws9
            public final void call(Object obj) {
                CrashHelper.c(new Exception("setTantanCoinWalletActionMenuViewTheme error: " + ((String) obj)));
            }
        });
    }

    @Override // p006l.ts9
    /* JADX INFO: renamed from: a */
    public void mo24810a(Act act) {
        m28373p(act, new e30() { // from class: l.vs9
            public final void call(Object obj) {
                CrashHelper.c(new Exception("setIntlEmojiActionMenuViewTheme error: " + ((String) obj)));
            }
        });
    }

    @Override // p006l.ts9
    /* JADX INFO: renamed from: b */
    public int mo24811b() {
        return x2c0.f26255S1;
    }

    @Override // p006l.ts9
    /* JADX INFO: renamed from: c */
    public int mo24812c() {
        return w0c0.f24678c2;
    }

    @Override // p006l.ts9
    /* JADX INFO: renamed from: d */
    public void mo24813d(ConversationsTabFrag conversationsTabFrag) {
        Act act = conversationsTabFrag.act();
        nx0 appTheme = act.getAppTheme();
        act.toolbar().setBackground(appTheme.b());
        act.toolbar().setTitleTextColor(appTheme.f());
        act.toolbar().setSubtitleTextColor(appTheme.e());
        act.setTitleColor(appTheme.f());
        TextView textView = act.centralTitle;
        if (textView != null) {
            textView.setTextSize(2, 20.0f);
            act.centralTitle.setAllCaps(false);
            act.centralTitle.setTypeface(Typeface.DEFAULT_BOLD);
            act.centralTitle.setIncludeFontPadding(false);
            act.centralTitle.setTextColor(appTheme.f());
        }
    }

    @Override // p006l.ts9
    /* JADX INFO: renamed from: e */
    public void mo24814e(MenuItem menuItem) {
        ImageView imageView = (ImageView) menuItem.getActionView().findViewById(u4c0.f23055j3);
        if (imageView != null) {
            Drawable drawableMutate = imageView.getDrawable().mutate();
            drawableMutate.setColorFilter(-2667209, PorterDuff.Mode.SRC_ATOP);
            imageView.setImageDrawable(drawableMutate);
        }
    }

    @Override // p006l.ts9
    /* JADX INFO: renamed from: f */
    public void mo24815f(idl idlVar) {
        NewMainAct newMainActR = idlVar.R();
        if (newMainActR == null) {
            return;
        }
        nx0 appTheme = newMainActR.getAppTheme();
        View view = new View(newMainActR);
        view.setBackgroundColor(appTheme.d());
        idlVar.a.addView(view, new LinearLayout.LayoutParams(-1, 0));
        xdl0.r0(new View[]{view});
        idlVar.a.setBackground(appTheme.b());
        idlVar.R.c().setBackground(appTheme.b());
        idlVar.R.i().setImageResource(x2c0.f26255S1);
        idlVar.m.setBackgroundColor(-1);
        idlVar.O.setBackgroundColor(-1);
    }

    @Override // p006l.ts9
    /* JADX INFO: renamed from: g */
    public void mo24816g(ConversationsTabFrag conversationsTabFrag) {
        Act act = conversationsTabFrag.act();
        nx0 appTheme = act.getAppTheme();
        FrameLayout frameLayout = new FrameLayout(act);
        frameLayout.setBackground(appTheme.b());
        xdl0.r0(new View[]{frameLayout});
        int iD = t100.d(44.0f);
        try {
            if (NullChecker.a(act.toolbar())) {
                Toolbar toolbar = act.toolbar();
                toolbar.setPadding(0, toolbar.getPaddingTop(), toolbar.getPaddingRight(), toolbar.getPaddingBottom());
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = iD;
                toolbar.setLayoutParams(layoutParams);
                TextView textView = (TextView) Act.TOOLBAR_TITLE_VIEW_FILED.get(toolbar);
                if (NullChecker.a(textView)) {
                    textView.setTextSize(21.0f);
                    mji0.o(textView, v7c0.f24174B);
                    textView.setTextColor(act.getResources().getColor(w0c0.f24715p));
                    ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
                    layoutParams2.height = iD;
                    textView.setLayoutParams(layoutParams2);
                    textView.setPadding(-t100.d(5.0f), t100.d(2.0f), 0, 0);
                }
                ViewGroup.LayoutParams layoutParams3 = toolbar.getLayoutParams();
                layoutParams3.height = iD;
                toolbar.setLayoutParams(layoutParams3);
            }
        } catch (Exception e) {
            CrashHelper.c(new Exception("initToolbarTheme reflect mNavButtonView error: " + e.getMessage()));
        }
        View view = new View(act);
        view.setBackgroundColor(appTheme.d());
        frameLayout.addView(view, new ViewGroup.LayoutParams(-1, 0));
        xdl0.r0(new View[]{view});
        xdl0.q0(iD, new View[]{frameLayout});
        xdl0.D0(-1, new View[]{frameLayout});
        conversationsTabFrag.B.addView(frameLayout);
        View view2 = conversationsTabFrag.E;
        View view3 = conversationsTabFrag.C;
        if (view2 == null) {
            xdl0.Z(new View[]{view3, conversationsTabFrag.I});
            xdl0.Y(iD, new View[]{conversationsTabFrag.C, conversationsTabFrag.I});
        } else {
            xdl0.Z(new View[]{view3, view2, conversationsTabFrag.I});
            xdl0.Y(iD, new View[]{conversationsTabFrag.C, conversationsTabFrag.E, conversationsTabFrag.I});
        }
    }

    @Override // p006l.ts9
    /* JADX INFO: renamed from: h */
    public void mo24817h(ProfileCustomBar profileCustomBar) {
        profileCustomBar.d.setImageDrawable(profileCustomBar.d.getDrawable().mutate());
    }

    @Override // p006l.ts9
    /* JADX INFO: renamed from: i */
    public void mo24818i(TabLayout tabLayout) {
        tabLayout.setBackgroundColor(-1);
        tabLayout.setTabTextColors(2130706432, -16777216);
        tabLayout.setSelectedTabIndicatorColor(-2279389);
    }

    @Override // p006l.ts9
    /* JADX INFO: renamed from: j */
    public void mo24819j(NewMainAct newMainAct) {
        PutongAct.setLightStatusBar(newMainAct.getWindow(), 1040);
    }

    @Override // p006l.ts9
    /* JADX INFO: renamed from: k */
    public void mo24820k(b bVar) {
        NewMainAct newMainActK1 = bVar.K1();
        if (newMainActK1 == null) {
            return;
        }
        nx0 appTheme = newMainActK1.getAppTheme();
        if (!upa.m25545z()) {
            View view = new View(newMainActK1);
            view.setBackgroundColor(appTheme.d());
            bVar.a.addView(view, new LinearLayout.LayoutParams(-1, 0));
            bVar.b.setBackground(appTheme.b());
            bVar.U.i().setImageResource(CoreBusinessModule.m1820m0().mo24811b());
            bVar.B.setBackgroundColor(-1);
            bVar.C.setBackgroundColor(-1);
        }
        if (g6a.m15600w() || upa.m25545z()) {
            return;
        }
        bVar.U.c().setBackground(appTheme.b());
    }

    @Override // p006l.ts9
    /* JADX INFO: renamed from: l */
    public void mo24821l(HelpCenterFrag helpCenterFrag, Menu menu, MenuInflater menuInflater, MenuItem menuItem) {
        ImageView imageView = (ImageView) menuItem.getActionView().findViewById(u4c0.f23125n5);
        Drawable drawableMutate = imageView.getDrawable().mutate();
        drawableMutate.setColorFilter(-1289674463, PorterDuff.Mode.SRC_ATOP);
        imageView.setImageDrawable(drawableMutate);
    }

    /* JADX INFO: renamed from: p */
    public final void m28373p(final Act act, e30<String> e30Var) {
        if (NullChecker.a(act.toolbar())) {
            try {
                final ActionMenuView actionMenuView = (ActionMenuView) Act.TOOLBAR_MENU_VIEW_FILED.get(act.toolbar());
                if (NullChecker.a(actionMenuView)) {
                    xdl0.b0(actionMenuView, new v9j() { // from class: l.xs9
                        public final Object call() {
                            return ys9.m28372o(actionMenuView, act);
                        }
                    });
                }
            } catch (Exception e) {
                CrashHelper.c(e);
                e30Var.call(e.getMessage());
            }
        }
    }
}
