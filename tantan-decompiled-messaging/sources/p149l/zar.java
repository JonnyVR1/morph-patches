package p149l;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.CompoundButton;
import android.widget.ScrollView;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.p048ui.pushbubble.SimplePushBubble;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.p053ui.poplevel.CorePopLevel;
import com.p046p1.mobile.putong.core.p053ui.vip.widget.LetterSendPanel;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p147v.VEditText;

/* JADX INFO: loaded from: classes9.dex */
public class zar {

    /* JADX INFO: renamed from: l.zar$a */
    public class ViewOnLayoutChangeListenerC21653a implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: a */
        public boolean f202390a = true;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ScrollView f202391b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ LetterSendPanel f202392c;

        public ViewOnLayoutChangeListenerC21653a(ScrollView scrollView, LetterSendPanel letterSendPanel) {
            this.f202391b = scrollView;
            this.f202392c = letterSendPanel;
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m217752b(ScrollView scrollView, LetterSendPanel letterSendPanel) {
            scrollView.fullScroll(130);
            if (!this.f202390a) {
                letterSendPanel.f38017l.requestFocus();
            }
            this.f202390a = false;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            final ScrollView scrollView = this.f202391b;
            final LetterSendPanel letterSendPanel = this.f202392c;
            scrollView.post(new Runnable() { // from class: l.yar
                @Override // java.lang.Runnable
                public final void run() {
                    this.f197232a.m217752b(scrollView, letterSendPanel);
                }
            });
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m217742a(boolean[] zArr, d30 d30Var, dj3 dj3Var) {
        zArr[0] = false;
        d30Var.call();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m217743b(boolean[] zArr, d30 d30Var, DialogInterface dialogInterface) {
        if (zArr[0] && NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m217744c(boolean[] zArr, d30 d30Var, dj3 dj3Var) {
        zArr[0] = true;
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m217746e(Act act, LetterSendPanel letterSendPanel, e30 e30Var, Dialog dialog, String str) {
        InputMethodManager inputMethodManager = (InputMethodManager) act.getSystemService("input_method");
        VEditText editTextView = letterSendPanel.getEditTextView();
        if (NullChecker.m81303a(inputMethodManager) && NullChecker.m81303a(editTextView)) {
            inputMethodManager.hideSoftInputFromWindow(editTextView.getWindowToken(), 0);
        }
        e30Var.call(str);
        dialog.dismiss();
    }

    /* JADX INFO: renamed from: g */
    public static void m217748g(Act act, final d30 d30Var, final d30 d30Var2) {
        int iM210346X4 = CoreModule.f17545c.f19570H0.m210346X4();
        final boolean[] zArr = {true};
        dj3 dj3VarM112012s = new dj3.C16391a(act).m112010B(act.getString(R$string.f18566h3)).m112009A(i0g0.m133847N(act.getString(R$string.f17622Bp, MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + iM210346X4 + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR), Color.parseColor("#fe7e1d"), eqh0.m117752c(2))).m112017x(act.string(R$string.f17652Cp), new e30() { // from class: l.sar
            @Override // p149l.e30
            public final void call(Object obj) {
                zar.m217742a(zArr, d30Var, (dj3) obj);
            }
        }).m112015v(act.string(R$string.f18408c), new e30() { // from class: l.tar
            @Override // p149l.e30
            public final void call(Object obj) {
                zar.m217744c(zArr, d30Var2, (dj3) obj);
            }
        }).m112018y(swh0.m186255p0().m186288K1()).m112016w(R$string.f17798Hl, new CompoundButton.OnCheckedChangeListener() { // from class: l.uar
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                swh0.m186255p0().m186292O0(z);
            }
        }).m112019z(new DialogInterface.OnDismissListener() { // from class: l.var
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                zar.m217743b(zArr, d30Var2, dialogInterface);
            }
        }).m112012s();
        dj3VarM112012s.m111984h().m45197E(x2c0.f189495Kp).m45203O("https://fe-static.tancdn.com/v1/images/eyJpZCI6IkFKTk1TSzJaRkpMT0xLRVVVNFhGT01DTDQ3SVBMSDE0IiwidyI6OTMzLCJoIjo3NjgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo0MjM4NjgyMDAyMjMxMDQ3fQ.webp");
        dj3VarM112012s.m111991o();
    }

    /* JADX INFO: renamed from: h */
    public static void m217749h(final Act act, User user, final e30<String> e30Var, boolean z) {
        final Dialog dialog = new Dialog(act, v7c0.f180379z);
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_letter_sentmessage_page", dialog.getClass().getName());
        dialog.setCancelable(true);
        dialog.setCanceledOnTouchOutside(true);
        ScrollView scrollView = (ScrollView) act.inflater().inflate(f6c0.f95848jd, (ViewGroup) null, false);
        final LetterSendPanel letterSendPanel = (LetterSendPanel) scrollView.findViewById(u4c0.f174029S6);
        letterSendPanel.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC21653a(scrollView, letterSendPanel));
        if (NullChecker.m81303a(e30Var)) {
            letterSendPanel.setSendClickCallBack(new e30() { // from class: l.war
                @Override // p149l.e30
                public final void call(Object obj) {
                    zar.m217746e(act, letterSendPanel, e30Var, dialog, (String) obj);
                }
            });
        }
        dialog.setContentView(scrollView);
        ViewGroup.LayoutParams layoutParams = letterSendPanel.getLayoutParams();
        layoutParams.width = act.getResources().getDisplayMetrics().widthPixels;
        letterSendPanel.setLayoutParams(layoutParams);
        dialog.getWindow().setGravity(80);
        dialog.getWindow().setWindowAnimations(v7c0.f180346A);
        letterSendPanel.setLetterWrapperLibraries(CoreModule.f17546d.m200498D(user.gender, i0g0.m133885y()));
        letterSendPanel.m57746C(user, z);
        dialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.xar
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        });
        dialog.getWindow().setSoftInputMode(16);
        dialog.show();
        i0e.m133797f(cwf0VarM133794c);
    }

    /* JADX INFO: renamed from: i */
    public static void m217750i(Act act) {
        hdb0.m130575c().m130582i(new SimplePushBubble.C4372a(act, o7r.m163037a(act).inflate(f6c0.f95892m6, (ViewGroup) null)).m21164B(1).m21176z(CorePopLevel.LETTER_SEND_DONE).m21169s());
    }
}
