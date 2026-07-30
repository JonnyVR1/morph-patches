package p149l;

import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ScrollView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.data.UserPrivilege;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.core.p053ui.vip.widget.LetterSendPanel;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p147v.VEditText;

/* JADX INFO: loaded from: classes11.dex */
public class lrb {

    /* JADX INFO: renamed from: b */
    public static lrb f129540b;

    /* JADX INFO: renamed from: a */
    public User f129541a;

    /* JADX INFO: renamed from: l.lrb$a */
    public class ViewOnLayoutChangeListenerC18289a implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: a */
        public boolean f129542a = true;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ScrollView f129543b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ LetterSendPanel f129544c;

        public ViewOnLayoutChangeListenerC18289a(ScrollView scrollView, LetterSendPanel letterSendPanel) {
            this.f129543b = scrollView;
            this.f129544c = letterSendPanel;
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m151166b(ScrollView scrollView, LetterSendPanel letterSendPanel) {
            scrollView.fullScroll(130);
            if (!this.f129542a) {
                letterSendPanel.f38017l.requestFocus();
            }
            this.f129542a = false;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            final ScrollView scrollView = this.f129543b;
            final LetterSendPanel letterSendPanel = this.f129544c;
            scrollView.post(new Runnable() { // from class: l.krb
                @Override // java.lang.Runnable
                public final void run() {
                    this.f124338a.m151166b(scrollView, letterSendPanel);
                }
            });
        }
    }

    /* JADX INFO: renamed from: f */
    public static lrb m151154f() {
        if (f129540b == null) {
            synchronized (lrb.class) {
                try {
                    if (f129540b == null) {
                        f129540b = new lrb();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f129540b;
    }

    /* JADX INFO: renamed from: d */
    public void m151155d(Act act) {
        m151164n(false);
        int iM186232f0 = swh0.m186232f0();
        UserPrivilege userPrivilegeM210113w4 = CoreModule.f17545c.f19555C0.m210113w4(SummarizedPrivilegesId.get(SummarizedPrivilegesId.spotLight));
        if (userPrivilegeM210113w4 != null && userPrivilegeM210113w4.content.remaining > 0) {
            m73.m153335o(act, null, null, PurchaseType.TYPE_SPOTLIGHT, true);
        } else if (iM186232f0 > 0) {
            m73.m153335o(act, null, null, PurchaseType.TYPE_SPOTLIGHT, false);
        } else {
            C8764c.m53448d1(act, "p_messages_view,e_messages_spotlight,click", new e30() { // from class: l.jrb
                @Override // p149l.e30
                public final void call(Object obj) {
                    CoreModule.f17545c.f19579K0.m176980O3(null, swh0.m186198I1(), true);
                }
            });
        }
    }

    /* JADX INFO: renamed from: e */
    public User m151156e() {
        return this.f129541a;
    }

    /* JADX INFO: renamed from: g */
    public final void m151157g(Act act, LetterSendPanel letterSendPanel) {
        InputMethodManager inputMethodManager = (InputMethodManager) act.getSystemService("input_method");
        VEditText editTextView = letterSendPanel.getEditTextView();
        if (NullChecker.m81303a(inputMethodManager) && NullChecker.m81303a(editTextView)) {
            inputMethodManager.hideSoftInputFromWindow(editTextView.getWindowToken(), 0);
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m151158h(Act act, LetterSendPanel letterSendPanel, e30 e30Var, Dialog dialog, String str) {
        m151157g(act, letterSendPanel);
        if (NullChecker.m81303a(e30Var)) {
            e30Var.call(Boolean.TRUE);
        }
        dialog.dismiss();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m151159i(cwf0 cwf0Var, Act act, LetterSendPanel letterSendPanel, DialogInterface dialogInterface) {
        i0e.m133796e(cwf0Var);
        m151157g(act, letterSendPanel);
    }

    /* JADX INFO: renamed from: j */
    public void m151160j() {
        CoreModule.f17545c.f19579K0.m176983R3();
        this.f129541a = null;
        f129540b = null;
    }

    /* JADX INFO: renamed from: k */
    public void m151161k(User user) {
        this.f129541a = user;
    }

    /* JADX INFO: renamed from: l */
    public void m151162l(Act act) {
        m151164n(false);
        f73.m119728C(act);
    }

    /* JADX INFO: renamed from: m */
    public void m151163m(final Act act, User user, final e30<Boolean> e30Var) {
        final Dialog dialog = new Dialog(act, v7c0.f180379z);
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_spotlight_chat_popup", dialog.getClass().getName());
        dialog.setCancelable(true);
        dialog.setCanceledOnTouchOutside(true);
        ScrollView scrollView = (ScrollView) act.inflater().inflate(f6c0.f95848jd, (ViewGroup) null, false);
        final LetterSendPanel letterSendPanel = (LetterSendPanel) scrollView.findViewById(u4c0.f174029S6);
        letterSendPanel.setFrom("spotlight_messages");
        letterSendPanel.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC18289a(scrollView, letterSendPanel));
        letterSendPanel.setSendClickCallBack(new e30() { // from class: l.grb
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f104039a.m151158h(act, letterSendPanel, e30Var, dialog, (String) obj);
            }
        });
        dialog.setContentView(scrollView);
        ViewGroup.LayoutParams layoutParams = letterSendPanel.getLayoutParams();
        layoutParams.width = act.getResources().getDisplayMetrics().widthPixels;
        letterSendPanel.setLayoutParams(layoutParams);
        dialog.getWindow().setGravity(80);
        dialog.getWindow().setWindowAnimations(v7c0.f180346A);
        letterSendPanel.setLetterWrapperLibraries(CoreModule.f17546d.m200497C(user.gender, i0g0.m133885y(), true));
        letterSendPanel.m57746C(user, false);
        letterSendPanel.setCloseClick(new hrb(dialog));
        dialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.irb
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f114609a.m151159i(cwf0VarM133794c, act, letterSendPanel, dialogInterface);
            }
        });
        dialog.getWindow().setSoftInputMode(16);
        dialog.show();
        i0e.m133797f(cwf0VarM133794c);
    }

    /* JADX INFO: renamed from: n */
    public void m151164n(boolean z) {
        if (z) {
            zvf0.m220402x("e_messages_spotlight", OMSDialogPositon.p_messages_view);
        } else {
            zvf0.m220396r("e_messages_spotlight", OMSDialogPositon.p_messages_view);
        }
    }
}
