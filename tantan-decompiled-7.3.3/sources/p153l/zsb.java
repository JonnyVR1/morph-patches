package p153l;

import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ScrollView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.data.UserPrivilege;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.core.p058ui.vip.widget.LetterSendPanel;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p151v.VEditText;

/* JADX INFO: loaded from: classes11.dex */
public class zsb {

    /* JADX INFO: renamed from: b */
    public static zsb f205854b;

    /* JADX INFO: renamed from: a */
    public User f205855a;

    /* JADX INFO: renamed from: l.zsb$a */
    public class ViewOnLayoutChangeListenerC21883a implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: a */
        public boolean f205856a = true;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ScrollView f205857b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ LetterSendPanel f205858c;

        public ViewOnLayoutChangeListenerC21883a(ScrollView scrollView, LetterSendPanel letterSendPanel) {
            this.f205857b = scrollView;
            this.f205858c = letterSendPanel;
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m221325b(ScrollView scrollView, LetterSendPanel letterSendPanel) {
            scrollView.fullScroll(130);
            if (!this.f205856a) {
                letterSendPanel.f38865l.requestFocus();
            }
            this.f205856a = false;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            final ScrollView scrollView = this.f205857b;
            final LetterSendPanel letterSendPanel = this.f205858c;
            scrollView.post(new Runnable() { // from class: l.ysb
                @Override // java.lang.Runnable
                public final void run() {
                    this.f201384a.m221325b(scrollView, letterSendPanel);
                }
            });
        }
    }

    /* JADX INFO: renamed from: f */
    public static zsb m221313f() {
        if (f205854b == null) {
            synchronized (zsb.class) {
                try {
                    if (f205854b == null) {
                        f205854b = new zsb();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f205854b;
    }

    /* JADX INFO: renamed from: d */
    public void m221314d(Act act) {
        m221323n(false);
        int iM96137f0 = a5i0.m96137f0();
        UserPrivilege userPrivilegeM146426x4 = CoreModule.f18264c.f20297C0.m146426x4(SummarizedPrivilegesId.get(SummarizedPrivilegesId.spotLight));
        if (userPrivilegeM146426x4 != null && userPrivilegeM146426x4.content.remaining > 0) {
            b83.m102913o(act, null, null, PurchaseType.TYPE_SPOTLIGHT, true);
        } else if (iM96137f0 > 0) {
            b83.m102913o(act, null, null, PurchaseType.TYPE_SPOTLIGHT, false);
        } else {
            C8927c.m54631d1(act, "p_messages_view,e_messages_spotlight,click", new y20() { // from class: l.xsb
                @Override // p153l.y20
                public final void call(Object obj) {
                    CoreModule.f18264c.f20321K0.m113307O3(null, a5i0.m96103I1(), true);
                }
            });
        }
    }

    /* JADX INFO: renamed from: e */
    public User m221315e() {
        return this.f205855a;
    }

    /* JADX INFO: renamed from: g */
    public final void m221316g(Act act, LetterSendPanel letterSendPanel) {
        InputMethodManager inputMethodManager = (InputMethodManager) act.getSystemService("input_method");
        VEditText editTextView = letterSendPanel.getEditTextView();
        if (NullChecker.m82486a(inputMethodManager) && NullChecker.m82486a(editTextView)) {
            inputMethodManager.hideSoftInputFromWindow(editTextView.getWindowToken(), 0);
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m221317h(Act act, LetterSendPanel letterSendPanel, y20 y20Var, Dialog dialog, String str) {
        m221316g(act, letterSendPanel);
        if (NullChecker.m82486a(y20Var)) {
            y20Var.call(Boolean.TRUE);
        }
        dialog.dismiss();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m221318i(l4g0 l4g0Var, Act act, LetterSendPanel letterSendPanel, DialogInterface dialogInterface) {
        w1e.m204401e(l4g0Var);
        m221316g(act, letterSendPanel);
    }

    /* JADX INFO: renamed from: j */
    public void m221319j() {
        CoreModule.f18264c.f20321K0.m113310R3();
        this.f205855a = null;
        f205854b = null;
    }

    /* JADX INFO: renamed from: k */
    public void m221320k(User user) {
        this.f205855a = user;
    }

    /* JADX INFO: renamed from: l */
    public void m221321l(Act act) {
        m221323n(false);
        u73.m194805C(act);
    }

    /* JADX INFO: renamed from: m */
    public void m221322m(final Act act, User user, final y20<Boolean> y20Var) {
        final Dialog dialog = new Dialog(act, agc0.f71140z);
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_spotlight_chat_popup", dialog.getClass().getName());
        dialog.setCancelable(true);
        dialog.setCanceledOnTouchOutside(true);
        ScrollView scrollView = (ScrollView) act.inflater().inflate(kec0.f126021qd, (ViewGroup) null, false);
        final LetterSendPanel letterSendPanel = (LetterSendPanel) scrollView.findViewById(adc0.f70151U6);
        letterSendPanel.setFrom("spotlight_messages");
        letterSendPanel.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC21883a(scrollView, letterSendPanel));
        letterSendPanel.setSendClickCallBack(new y20() { // from class: l.usb
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f180757a.m221317h(act, letterSendPanel, y20Var, dialog, (String) obj);
            }
        });
        dialog.setContentView(scrollView);
        ViewGroup.LayoutParams layoutParams = letterSendPanel.getLayoutParams();
        layoutParams.width = act.getResources().getDisplayMetrics().widthPixels;
        letterSendPanel.setLayoutParams(layoutParams);
        dialog.getWindow().setGravity(80);
        dialog.getWindow().setWindowAnimations(agc0.f71107A);
        letterSendPanel.setLetterWrapperLibraries(CoreModule.f18265d.m217943C(user.gender, q8g0.m175820y(), true));
        letterSendPanel.m58929C(user, false);
        letterSendPanel.setCloseClick(new vsb(dialog));
        dialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.wsb
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f190605a.m221318i(l4g0VarM204399c, act, letterSendPanel, dialogInterface);
            }
        });
        dialog.getWindow().setSoftInputMode(16);
        dialog.show();
        w1e.m204402f(l4g0VarM204399c);
    }

    /* JADX INFO: renamed from: n */
    public void m221323n(boolean z) {
        if (z) {
            i4g0.m138526x("e_messages_spotlight", OMSDialogPositon.p_messages_view);
        } else {
            i4g0.m138520r("e_messages_spotlight", OMSDialogPositon.p_messages_view);
        }
    }
}
