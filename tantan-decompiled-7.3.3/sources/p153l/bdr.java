package p153l;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.CompoundButton;
import android.widget.ScrollView;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.p053ui.pushbubble.SimplePushBubble;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.p058ui.poplevel.CorePopLevel;
import com.p051p1.mobile.putong.core.p058ui.vip.widget.LetterSendPanel;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p151v.VEditText;

/* JADX INFO: loaded from: classes12.dex */
public class bdr {

    /* JADX INFO: renamed from: l.bdr$a */
    public class ViewOnLayoutChangeListenerC15973a implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: a */
        public boolean f76288a = true;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ScrollView f76289b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ LetterSendPanel f76290c;

        public ViewOnLayoutChangeListenerC15973a(ScrollView scrollView, LetterSendPanel letterSendPanel) {
            this.f76289b = scrollView;
            this.f76290c = letterSendPanel;
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m103633b(ScrollView scrollView, LetterSendPanel letterSendPanel) {
            scrollView.fullScroll(130);
            if (!this.f76288a) {
                letterSendPanel.f38865l.requestFocus();
            }
            this.f76288a = false;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            final ScrollView scrollView = this.f76289b;
            final LetterSendPanel letterSendPanel = this.f76290c;
            scrollView.post(new Runnable() { // from class: l.adr
                @Override // java.lang.Runnable
                public final void run() {
                    this.f70724a.m103633b(scrollView, letterSendPanel);
                }
            });
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m103623a(boolean[] zArr, x20 x20Var, tj3 tj3Var) {
        zArr[0] = false;
        x20Var.call();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m103624b(boolean[] zArr, x20 x20Var, DialogInterface dialogInterface) {
        if (zArr[0] && NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m103625c(boolean[] zArr, x20 x20Var, tj3 tj3Var) {
        zArr[0] = true;
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m103627e(Act act, LetterSendPanel letterSendPanel, y20 y20Var, Dialog dialog, String str) {
        InputMethodManager inputMethodManager = (InputMethodManager) act.getSystemService("input_method");
        VEditText editTextView = letterSendPanel.getEditTextView();
        if (NullChecker.m82486a(inputMethodManager) && NullChecker.m82486a(editTextView)) {
            inputMethodManager.hideSoftInputFromWindow(editTextView.getWindowToken(), 0);
        }
        y20Var.call(str);
        dialog.dismiss();
    }

    /* JADX INFO: renamed from: g */
    public static void m103629g(Act act, final x20 x20Var, final x20 x20Var2) {
        int iM155434X4 = CoreModule.f18264c.f20312H0.m155434X4();
        final boolean[] zArr = {true};
        tj3 tj3VarM191397s = new tj3.C20332a(act).m191395B(act.getString(R$string.f19356j3)).m191394A(q8g0.m175782N(act.getString(R$string.f18982Wp, MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + iM155434X4 + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR), Color.parseColor("#fe7e1d"), lyh0.m156283c(2))).m191402x(act.string(R$string.f19012Xp), new y20() { // from class: l.ucr
            @Override // p153l.y20
            public final void call(Object obj) {
                bdr.m103623a(zArr, x20Var, (tj3) obj);
            }
        }).m191400v(act.string(R$string.f19138c), new y20() { // from class: l.vcr
            @Override // p153l.y20
            public final void call(Object obj) {
                bdr.m103625c(zArr, x20Var2, (tj3) obj);
            }
        }).m191403y(a5i0.m96160p0().m96193K1()).m191401w(R$string.f19192dm, new CompoundButton.OnCheckedChangeListener() { // from class: l.wcr
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                a5i0.m96160p0().m96197O0(z);
            }
        }).m191404z(new DialogInterface.OnDismissListener() { // from class: l.xcr
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                bdr.m103624b(zArr, x20Var2, dialogInterface);
            }
        }).m191397s();
        tj3VarM191397s.m191369h().m46380E(dbc0.f87620yq).m46386O("https://fe-static.tancdn.com/v1/images/eyJpZCI6IkFKTk1TSzJaRkpMT0xLRVVVNFhGT01DTDQ3SVBMSDE0IiwidyI6OTMzLCJoIjo3NjgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo0MjM4NjgyMDAyMjMxMDQ3fQ.webp");
        tj3VarM191397s.m191376o();
    }

    /* JADX INFO: renamed from: h */
    public static void m103630h(final Act act, User user, final y20<String> y20Var, boolean z) {
        final Dialog dialog = new Dialog(act, agc0.f71140z);
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_letter_sentmessage_page", dialog.getClass().getName());
        dialog.setCancelable(true);
        dialog.setCanceledOnTouchOutside(true);
        ScrollView scrollView = (ScrollView) act.inflater().inflate(kec0.f126021qd, (ViewGroup) null, false);
        final LetterSendPanel letterSendPanel = (LetterSendPanel) scrollView.findViewById(adc0.f70151U6);
        letterSendPanel.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC15973a(scrollView, letterSendPanel));
        if (NullChecker.m82486a(y20Var)) {
            letterSendPanel.setSendClickCallBack(new y20() { // from class: l.ycr
                @Override // p153l.y20
                public final void call(Object obj) {
                    bdr.m103627e(act, letterSendPanel, y20Var, dialog, (String) obj);
                }
            });
        }
        dialog.setContentView(scrollView);
        ViewGroup.LayoutParams layoutParams = letterSendPanel.getLayoutParams();
        layoutParams.width = act.getResources().getDisplayMetrics().widthPixels;
        letterSendPanel.setLayoutParams(layoutParams);
        dialog.getWindow().setGravity(80);
        dialog.getWindow().setWindowAnimations(agc0.f71107A);
        letterSendPanel.setLetterWrapperLibraries(CoreModule.f18265d.m217944D(user.gender, q8g0.m175820y()));
        letterSendPanel.m58929C(user, z);
        dialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.zcr
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        });
        dialog.getWindow().setSoftInputMode(16);
        dialog.show();
        w1e.m204402f(l4g0VarM204399c);
    }

    /* JADX INFO: renamed from: i */
    public static void m103631i(Act act) {
        llb0.m154703c().m154710i(new SimplePushBubble.C4523a(act, p9r.m171370a(act).inflate(kec0.f125963n6, (ViewGroup) null)).m22163B(1).m22175z(CorePopLevel.LETTER_SEND_DONE).m22168s());
    }
}
