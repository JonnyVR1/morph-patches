package p153l;

import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ScrollView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.vip.widget.LetterSendPanel;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p151v.VEditText;

/* JADX INFO: loaded from: classes12.dex */
public class tmp {

    /* JADX INFO: renamed from: a */
    public static jxd0 f174952a = new jxd0("vip_letter_cover_profile_guide_shown_b", Boolean.FALSE);

    /* JADX INFO: renamed from: l.tmp$a */
    public class ViewOnLayoutChangeListenerC20347a implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: a */
        public boolean f174953a = true;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ScrollView f174954b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ LetterSendPanel f174955c;

        public ViewOnLayoutChangeListenerC20347a(ScrollView scrollView, LetterSendPanel letterSendPanel) {
            this.f174954b = scrollView;
            this.f174955c = letterSendPanel;
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m191805b(ScrollView scrollView, LetterSendPanel letterSendPanel) {
            scrollView.fullScroll(130);
            if (!this.f174953a) {
                letterSendPanel.f38865l.requestFocus();
            }
            this.f174953a = false;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            final ScrollView scrollView = this.f174954b;
            final LetterSendPanel letterSendPanel = this.f174955c;
            scrollView.post(new Runnable() { // from class: l.smp
                @Override // java.lang.Runnable
                public final void run() {
                    this.f169594a.m191805b(scrollView, letterSendPanel);
                }
            });
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m191796b(Act act, LetterSendPanel letterSendPanel, y20 y20Var, Dialog dialog, String str) {
        InputMethodManager inputMethodManager = (InputMethodManager) act.getSystemService("input_method");
        VEditText editTextView = letterSendPanel.getEditTextView();
        if (NullChecker.m82486a(inputMethodManager) && NullChecker.m82486a(editTextView)) {
            inputMethodManager.hideSoftInputFromWindow(editTextView.getWindowToken(), 0);
        }
        y20Var.call(str);
        dialog.dismiss();
    }

    /* JADX INFO: renamed from: c */
    public static String m191797c() {
        boolean zM107528u0 = c17.m107528u0();
        String str = zM107528u0 ? "https://auto.tancdn.com/v1/images/eyJpZCI6IktZQ1VMRDRQNEE1TUpMVFpYS0g2TjVYR1ZMQU8yRTA3IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo0MTIxMTMxNDU1MjI0MDQ2Mzg5fQ.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IkpZWkdENEFWQkNYRUFBSzVXNFhEM1A3NkJHTFhNNjA2IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3NTc5ODk2MDQ2MDUwMTYxNDQ5fQ.png";
        String strM175820y = q8g0.m175820y();
        if ("ko-KR".equals(strM175820y)) {
            return zM107528u0 ? "https://auto.tancdn.com/v1/images/eyJpZCI6IjVYU0xMVEpKSFhaSzRBS1A2SDNBT0daSFg1VFMyVjA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozNTQ0NzQxMDcxNjY0OTMxNjM3LCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IjJWQkJaVEJLWjY0NVlCUkpBNUpWN1ZDUDdDSUxJSjA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozNTQ0NzQxMTQ4NjM2ODIwMjczLCJhYiI6MH0.png";
        }
        if ("ja-JP".equals(strM175820y)) {
            return zM107528u0 ? "https://auto.tancdn.com/v1/images/eyJpZCI6IklEN0wzWUg1MkZCNVpaMjRIT0VDVlFDUTdHRVpKVTA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozNTQ0NzQxMDcxNjY0OTMxNjM3LCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IkdEQUY3UVVQUE1FWlMyTkZIVFlCSjVaRUZFR05SNDA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozNTQ0NzQxMTQ4NjM2ODIwMjczLCJhYiI6MH0.png";
        }
        if ("id-ID".equals(strM175820y)) {
            return zM107528u0 ? "https://auto.tancdn.com/v1/images/eyJpZCI6IkRWUjQzQ1IzUkVJWU1ON0xJUEE2UzZDSk5VUFBaTzA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo0MTIxMjAxODIzOTY4MzU1MTI1LCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6Ikk2MjNIT0FCTzQ0VkRXWE1UNkhHUFg0UFRURTdZWTA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo0MTIxMjAxOTAwOTQwMjQzNzYxLCJhYiI6MH0.png";
        }
        if ("zh-TW".equals(strM175820y)) {
            return zM107528u0 ? "https://auto.tancdn.com/v1/images/eyJpZCI6IkZHSkxSN1pWNUpOQ1FHWlRNUzI1V0xMRVpQVEpYMzA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo0MTIxMjAxODIzOTY4MzU1MTI1LCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IlZWNFRNNUNMUlNSN1YyR0wzUEY0TFhIUDdHWklENDA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo0MTIxMTMxNTMyMTk2MDY2MDk3LCJhYiI6MH0.png";
        }
        if ("zh-CN".equals(strM175820y)) {
            return zM107528u0 ? "https://auto.tancdn.com/v1/images/eyJpZCI6IlgyUlM1V1NDRExWTkhIRlZDVTVPSVBQSVZHRkVCRjA3IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3NTc5ODk1OTUxODY0ODQ5MjA1fQ.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6Ik4zSkIyNUNVQjdWUlEyWEhSS1BCUFVHU1ZUSE42RTA2IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3NTc5ODk2MDQ2MDUwMTYxNDQ5fQ.png";
        }
        return str;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m191798d() {
        return joa.m146355E3() || a5i0.m96096G();
    }

    /* JADX INFO: renamed from: e */
    public static int m191799e() {
        return dbc0.f87652zq;
    }

    /* JADX INFO: renamed from: f */
    public static int m191800f() {
        return dbc0.f86453Os;
    }

    /* JADX INFO: renamed from: g */
    public static void m191801g(final Act act, User user, final y20<String> y20Var, String str) {
        final Dialog dialog = new Dialog(act, agc0.f71140z);
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_letter_sentmessage_page", dialog.getClass().getName());
        dialog.setCancelable(true);
        dialog.setCanceledOnTouchOutside(true);
        ScrollView scrollView = (ScrollView) act.inflater().inflate(kec0.f126021qd, (ViewGroup) null, false);
        final LetterSendPanel letterSendPanel = (LetterSendPanel) scrollView.findViewById(adc0.f70151U6);
        letterSendPanel.setFrom(str);
        letterSendPanel.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC20347a(scrollView, letterSendPanel));
        if (NullChecker.m82486a(y20Var)) {
            letterSendPanel.setSendClickCallBack(new y20() { // from class: l.qmp
                @Override // p153l.y20
                public final void call(Object obj) {
                    tmp.m191796b(act, letterSendPanel, y20Var, dialog, (String) obj);
                }
            });
        }
        dialog.setContentView(scrollView);
        ViewGroup.LayoutParams layoutParams = letterSendPanel.getLayoutParams();
        layoutParams.width = act.getResources().getDisplayMetrics().widthPixels;
        letterSendPanel.setLayoutParams(layoutParams);
        dialog.getWindow().setGravity(80);
        dialog.getWindow().setWindowAnimations(agc0.f71107A);
        letterSendPanel.setLetterWrapperLibraries(CoreModule.f18265d.m217942B(user.gender, q8g0.m175820y()));
        letterSendPanel.m58929C(user, false);
        letterSendPanel.setCloseClick(new vsb(dialog));
        dialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.rmp
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        });
        dialog.getWindow().setSoftInputMode(16);
        dialog.show();
        w1e.m204402f(l4g0VarM204399c);
    }

    /* JADX INFO: renamed from: h */
    public static String m191802h() {
        return m191797c();
    }

    /* JADX INFO: renamed from: i */
    public static int m191803i() {
        return dbc0.f86132Er;
    }
}
