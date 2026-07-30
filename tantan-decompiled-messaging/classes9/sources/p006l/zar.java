package p006l;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.CompoundButton;
import android.widget.ScrollView;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p000p1.mobile.putong.core.p004ui.vip.widget.LetterSendPanel;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.ui.pushbubble.SimplePushBubble;
import com.p1.mobile.putong.core.ui.poplevel.CorePopLevel;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import l.cwf0;
import l.d30;
import l.dj3;
import l.e30;
import l.eqh0;
import l.hdb0;
import l.i0e;
import l.i0g0;
import l.o7r;
import v.VEditText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class zar {

    /* JADX INFO: renamed from: l.zar$a */
    public class ViewOnLayoutChangeListenerC1515a implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: a */
        public boolean f28690a = true;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ScrollView f28691b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ LetterSendPanel f28692c;

        public ViewOnLayoutChangeListenerC1515a(ScrollView scrollView, LetterSendPanel letterSendPanel) {
            this.f28691b = scrollView;
            this.f28692c = letterSendPanel;
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m28633b(ScrollView scrollView, LetterSendPanel letterSendPanel) {
            scrollView.fullScroll(130);
            if (!this.f28690a) {
                letterSendPanel.f7798l.requestFocus();
            }
            this.f28690a = false;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            final ScrollView scrollView = this.f28691b;
            final LetterSendPanel letterSendPanel = this.f28692c;
            scrollView.post(new Runnable() { // from class: l.yar
                @Override // java.lang.Runnable
                public final void run() {
                    this.f28102a.m28633b(scrollView, letterSendPanel);
                }
            });
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m28623a(boolean[] zArr, d30 d30Var, dj3 dj3Var) {
        zArr[0] = false;
        d30Var.call();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m28624b(boolean[] zArr, d30 d30Var, DialogInterface dialogInterface) {
        if (zArr[0] && NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m28625c(boolean[] zArr, d30 d30Var, dj3 dj3Var) {
        zArr[0] = true;
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m28627e(Act act, LetterSendPanel letterSendPanel, e30 e30Var, Dialog dialog, String str) {
        InputMethodManager inputMethodManager = (InputMethodManager) act.getSystemService("input_method");
        VEditText editTextView = letterSendPanel.getEditTextView();
        if (NullChecker.a(inputMethodManager) && NullChecker.a(editTextView)) {
            inputMethodManager.hideSoftInputFromWindow(editTextView.getWindowToken(), 0);
        }
        e30Var.call(str);
        dialog.dismiss();
    }

    /* JADX INFO: renamed from: g */
    public static void m28629g(Act act, final d30 d30Var, final d30 d30Var2) {
        int iM27521X4 = CoreModule.f1534c.f3559H0.m27521X4();
        final boolean[] zArr = {true};
        dj3 dj3VarS = new dj3.a(act).B(act.getString(R$string.f2555h3)).A(i0g0.N(act.getString(R$string.f1611Bp, " " + iM27521X4 + " "), Color.parseColor("#fe7e1d"), eqh0.c(2))).x(act.string(R$string.f1641Cp), new e30() { // from class: l.sar
            public final void call(Object obj) {
                zar.m28623a(zArr, d30Var, (dj3) obj);
            }
        }).v(act.string(R$string.f2397c), new e30() { // from class: l.tar
            public final void call(Object obj) {
                zar.m28625c(zArr, d30Var2, (dj3) obj);
            }
        }).y(swh0.m24306p0().m24339K1()).w(R$string.f1787Hl, new CompoundButton.OnCheckedChangeListener() { // from class: l.uar
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                swh0.m24306p0().m24343O0(z);
            }
        }).z(new DialogInterface.OnDismissListener() { // from class: l.var
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                zar.m28624b(zArr, d30Var2, dialogInterface);
            }
        }).s();
        dj3VarS.h().E(x2c0.f26031Kp).O("https://fe-static.tancdn.com/v1/images/eyJpZCI6IkFKTk1TSzJaRkpMT0xLRVVVNFhGT01DTDQ3SVBMSDE0IiwidyI6OTMzLCJoIjo3NjgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo0MjM4NjgyMDAyMjMxMDQ3fQ.webp");
        dj3VarS.o();
    }

    /* JADX INFO: renamed from: h */
    public static void m28630h(final Act act, User user, final e30<String> e30Var, boolean z) {
        final Dialog dialog = new Dialog(act, v7c0.f24206z);
        final cwf0 cwf0VarC = i0e.c("p_letter_sentmessage_page", dialog.getClass().getName());
        dialog.setCancelable(true);
        dialog.setCanceledOnTouchOutside(true);
        ScrollView scrollView = (ScrollView) act.inflater().inflate(f6c0.f12262jd, (ViewGroup) null, false);
        final LetterSendPanel letterSendPanel = (LetterSendPanel) scrollView.findViewById(u4c0.f22777S6);
        letterSendPanel.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC1515a(scrollView, letterSendPanel));
        if (NullChecker.a(e30Var)) {
            letterSendPanel.setSendClickCallBack(new e30() { // from class: l.war
                public final void call(Object obj) {
                    zar.m28627e(act, letterSendPanel, e30Var, dialog, (String) obj);
                }
            });
        }
        dialog.setContentView(scrollView);
        ViewGroup.LayoutParams layoutParams = letterSendPanel.getLayoutParams();
        layoutParams.width = act.getResources().getDisplayMetrics().widthPixels;
        letterSendPanel.setLayoutParams(layoutParams);
        dialog.getWindow().setGravity(80);
        dialog.getWindow().setWindowAnimations(v7c0.f24173A);
        letterSendPanel.setLetterWrapperLibraries(CoreModule.f1535d.m25977D(user.gender, i0g0.y()));
        letterSendPanel.m11242C(user, z);
        dialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.xar
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.e(cwf0VarC);
            }
        });
        dialog.getWindow().setSoftInputMode(16);
        dialog.show();
        i0e.f(cwf0VarC);
    }

    /* JADX INFO: renamed from: i */
    public static void m28631i(Act act) {
        hdb0.c().i(new SimplePushBubble.a(act, o7r.a(act).inflate(f6c0.f12306m6, (ViewGroup) null)).B(1).z(CorePopLevel.LETTER_SEND_DONE).s());
    }
}
