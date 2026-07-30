package p009l;

import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ScrollView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p1.mobile.putong.core.data.UserPrivilege;
import com.p1.mobile.putong.core.ui.purchase.c;
import com.p1.mobile.putong.core.ui.vip.widget.LetterSendPanel;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import l.cwf0;
import l.d30;
import l.e30;
import l.f6c0;
import l.f73;
import l.m73;
import l.swh0;
import l.u4c0;
import l.v7c0;
import l.zvf0;
import v.VEditText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class lrb {

    /* JADX INFO: renamed from: b */
    public static lrb f16379b;

    /* JADX INFO: renamed from: a */
    public User f16380a;

    /* JADX INFO: renamed from: l.lrb$a */
    public class ViewOnLayoutChangeListenerC1022a implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: a */
        public boolean f16381a = true;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ScrollView f16382b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ LetterSendPanel f16383c;

        public ViewOnLayoutChangeListenerC1022a(ScrollView scrollView, LetterSendPanel letterSendPanel) {
            this.f16382b = scrollView;
            this.f16383c = letterSendPanel;
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m18011b(ScrollView scrollView, LetterSendPanel letterSendPanel) {
            scrollView.fullScroll(130);
            if (!this.f16381a) {
                letterSendPanel.l.requestFocus();
            }
            this.f16381a = false;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            final ScrollView scrollView = this.f16382b;
            final LetterSendPanel letterSendPanel = this.f16383c;
            scrollView.post(new Runnable() { // from class: l.krb
                @Override // java.lang.Runnable
                public final void run() {
                    this.f15825a.m18011b(scrollView, letterSendPanel);
                }
            });
        }
    }

    /* JADX INFO: renamed from: f */
    public static lrb m17999f() {
        if (f16379b == null) {
            synchronized (lrb.class) {
                try {
                    if (f16379b == null) {
                        f16379b = new lrb();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f16379b;
    }

    /* JADX INFO: renamed from: d */
    public void m18000d(Act act) {
        m18009n(false);
        int iF0 = swh0.f0();
        UserPrivilege userPrivilegeW4 = CoreModule.c.C0.w4(SummarizedPrivilegesId.get("spotLight"));
        if (userPrivilegeW4 != null && userPrivilegeW4.content.remaining > 0) {
            m73.o(act, (d30) null, (d30) null, PurchaseType.TYPE_SPOTLIGHT, true);
        } else if (iF0 > 0) {
            m73.o(act, (d30) null, (d30) null, PurchaseType.TYPE_SPOTLIGHT, false);
        } else {
            c.d1(act, "p_messages_view,e_messages_spotlight,click", new e30() { // from class: l.jrb
                public final void call(Object obj) {
                    CoreModule.c.K0.O3((d30) null, swh0.I1(), true);
                }
            });
        }
    }

    /* JADX INFO: renamed from: e */
    public User m18001e() {
        return this.f16380a;
    }

    /* JADX INFO: renamed from: g */
    public final void m18002g(Act act, LetterSendPanel letterSendPanel) {
        InputMethodManager inputMethodManager = (InputMethodManager) act.getSystemService("input_method");
        VEditText editTextView = letterSendPanel.getEditTextView();
        if (NullChecker.a(inputMethodManager) && NullChecker.a(editTextView)) {
            inputMethodManager.hideSoftInputFromWindow(editTextView.getWindowToken(), 0);
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m18003h(Act act, LetterSendPanel letterSendPanel, e30 e30Var, Dialog dialog, String str) {
        m18002g(act, letterSendPanel);
        if (NullChecker.a(e30Var)) {
            e30Var.call(Boolean.TRUE);
        }
        dialog.dismiss();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m18004i(cwf0 cwf0Var, Act act, LetterSendPanel letterSendPanel, DialogInterface dialogInterface) {
        i0e.m16064e(cwf0Var);
        m18002g(act, letterSendPanel);
    }

    /* JADX INFO: renamed from: j */
    public void m18005j() {
        CoreModule.c.K0.R3();
        this.f16380a = null;
        f16379b = null;
    }

    /* JADX INFO: renamed from: k */
    public void m18006k(User user) {
        this.f16380a = user;
    }

    /* JADX INFO: renamed from: l */
    public void m18007l(Act act) {
        m18009n(false);
        f73.C(act);
    }

    /* JADX INFO: renamed from: m */
    public void m18008m(final Act act, User user, final e30<Boolean> e30Var) {
        final Dialog dialog = new Dialog(act, v7c0.z);
        final cwf0 cwf0VarM16062c = i0e.m16062c("p_spotlight_chat_popup", dialog.getClass().getName());
        dialog.setCancelable(true);
        dialog.setCanceledOnTouchOutside(true);
        ScrollView scrollView = (ScrollView) act.inflater().inflate(f6c0.jd, (ViewGroup) null, false);
        final LetterSendPanel letterSendPanelFindViewById = scrollView.findViewById(u4c0.S6);
        letterSendPanelFindViewById.setFrom("spotlight_messages");
        letterSendPanelFindViewById.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC1022a(scrollView, letterSendPanelFindViewById));
        letterSendPanelFindViewById.setSendClickCallBack(new e30() { // from class: l.grb
            public final void call(Object obj) {
                this.f13697a.m18003h(act, letterSendPanelFindViewById, e30Var, dialog, (String) obj);
            }
        });
        dialog.setContentView(scrollView);
        ViewGroup.LayoutParams layoutParams = letterSendPanelFindViewById.getLayoutParams();
        layoutParams.width = act.getResources().getDisplayMetrics().widthPixels;
        letterSendPanelFindViewById.setLayoutParams(layoutParams);
        dialog.getWindow().setGravity(80);
        dialog.getWindow().setWindowAnimations(v7c0.A);
        letterSendPanelFindViewById.setLetterWrapperLibraries(CoreModule.d.C(user.gender, i0g0.m16153y(), true));
        letterSendPanelFindViewById.C(user, false);
        letterSendPanelFindViewById.setCloseClick(new d30() { // from class: l.hrb
            public final void call() {
                dialog.dismiss();
            }
        });
        dialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.irb
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f14779a.m18004i(cwf0VarM16062c, act, letterSendPanelFindViewById, dialogInterface);
            }
        });
        dialog.getWindow().setSoftInputMode(16);
        dialog.show();
        i0e.m16065f(cwf0VarM16062c);
    }

    /* JADX INFO: renamed from: n */
    public void m18009n(boolean z) {
        if (z) {
            zvf0.x("e_messages_spotlight", "p_messages_view");
        } else {
            zvf0.r("e_messages_spotlight", "p_messages_view");
        }
    }
}
