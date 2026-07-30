package p006l;

import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ScrollView;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.vip.widget.LetterSendPanel;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import l.cwf0;
import l.e30;
import l.hpd0;
import l.hrb;
import l.i0e;
import l.i0g0;
import l.zz6;
import v.VEditText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class tkp {

    /* JADX INFO: renamed from: a */
    public static hpd0 f22157a = new hpd0("vip_letter_cover_profile_guide_shown_b", Boolean.FALSE);

    /* JADX INFO: renamed from: l.tkp$a */
    public class ViewOnLayoutChangeListenerC1312a implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: a */
        public boolean f22158a = true;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ScrollView f22159b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ LetterSendPanel f22160c;

        public ViewOnLayoutChangeListenerC1312a(ScrollView scrollView, LetterSendPanel letterSendPanel) {
            this.f22159b = scrollView;
            this.f22160c = letterSendPanel;
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m24752b(ScrollView scrollView, LetterSendPanel letterSendPanel) {
            scrollView.fullScroll(130);
            if (!this.f22158a) {
                letterSendPanel.f7798l.requestFocus();
            }
            this.f22158a = false;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            final ScrollView scrollView = this.f22159b;
            final LetterSendPanel letterSendPanel = this.f22160c;
            scrollView.post(new Runnable() { // from class: l.skp
                @Override // java.lang.Runnable
                public final void run() {
                    this.f21400a.m24752b(scrollView, letterSendPanel);
                }
            });
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m24743b(Act act, LetterSendPanel letterSendPanel, e30 e30Var, Dialog dialog, String str) {
        InputMethodManager inputMethodManager = (InputMethodManager) act.getSystemService("input_method");
        VEditText editTextView = letterSendPanel.getEditTextView();
        if (NullChecker.a(inputMethodManager) && NullChecker.a(editTextView)) {
            inputMethodManager.hideSoftInputFromWindow(editTextView.getWindowToken(), 0);
        }
        e30Var.call(str);
        dialog.dismiss();
    }

    /* JADX INFO: renamed from: c */
    public static String m24744c() {
        boolean zU0 = zz6.u0();
        String str = zU0 ? "https://auto.tancdn.com/v1/images/eyJpZCI6IktZQ1VMRDRQNEE1TUpMVFpYS0g2TjVYR1ZMQU8yRTA3IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo0MTIxMTMxNDU1MjI0MDQ2Mzg5fQ.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IkpZWkdENEFWQkNYRUFBSzVXNFhEM1A3NkJHTFhNNjA2IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3NTc5ODk2MDQ2MDUwMTYxNDQ5fQ.png";
        String strY = i0g0.y();
        if ("ko-KR".equals(strY)) {
            return zU0 ? "https://auto.tancdn.com/v1/images/eyJpZCI6IjVYU0xMVEpKSFhaSzRBS1A2SDNBT0daSFg1VFMyVjA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozNTQ0NzQxMDcxNjY0OTMxNjM3LCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IjJWQkJaVEJLWjY0NVlCUkpBNUpWN1ZDUDdDSUxJSjA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozNTQ0NzQxMTQ4NjM2ODIwMjczLCJhYiI6MH0.png";
        }
        if ("ja-JP".equals(strY)) {
            return zU0 ? "https://auto.tancdn.com/v1/images/eyJpZCI6IklEN0wzWUg1MkZCNVpaMjRIT0VDVlFDUTdHRVpKVTA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozNTQ0NzQxMDcxNjY0OTMxNjM3LCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IkdEQUY3UVVQUE1FWlMyTkZIVFlCSjVaRUZFR05SNDA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozNTQ0NzQxMTQ4NjM2ODIwMjczLCJhYiI6MH0.png";
        }
        if ("id-ID".equals(strY)) {
            return zU0 ? "https://auto.tancdn.com/v1/images/eyJpZCI6IkRWUjQzQ1IzUkVJWU1ON0xJUEE2UzZDSk5VUFBaTzA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo0MTIxMjAxODIzOTY4MzU1MTI1LCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6Ikk2MjNIT0FCTzQ0VkRXWE1UNkhHUFg0UFRURTdZWTA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo0MTIxMjAxOTAwOTQwMjQzNzYxLCJhYiI6MH0.png";
        }
        if ("zh-TW".equals(strY)) {
            return zU0 ? "https://auto.tancdn.com/v1/images/eyJpZCI6IkZHSkxSN1pWNUpOQ1FHWlRNUzI1V0xMRVpQVEpYMzA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo0MTIxMjAxODIzOTY4MzU1MTI1LCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IlZWNFRNNUNMUlNSN1YyR0wzUEY0TFhIUDdHWklENDA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo0MTIxMTMxNTMyMTk2MDY2MDk3LCJhYiI6MH0.png";
        }
        if ("zh-CN".equals(strY)) {
            return zU0 ? "https://auto.tancdn.com/v1/images/eyJpZCI6IlgyUlM1V1NDRExWTkhIRlZDVTVPSVBQSVZHRkVCRjA3IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3NTc5ODk1OTUxODY0ODQ5MjA1fQ.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6Ik4zSkIyNUNVQjdWUlEyWEhSS1BCUFVHU1ZUSE42RTA2IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3NTc5ODk2MDQ2MDUwMTYxNDQ5fQ.png";
        }
        return str;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m24745d() {
        return xma.m27349D3() || swh0.m24242G();
    }

    /* JADX INFO: renamed from: e */
    public static int m24746e() {
        return x2c0.f26062Lp;
    }

    /* JADX INFO: renamed from: f */
    public static int m24747f() {
        return x2c0.f26530as;
    }

    /* JADX INFO: renamed from: g */
    public static void m24748g(final Act act, User user, final e30<String> e30Var, String str) {
        final Dialog dialog = new Dialog(act, v7c0.f24206z);
        final cwf0 cwf0VarC = i0e.c("p_letter_sentmessage_page", dialog.getClass().getName());
        dialog.setCancelable(true);
        dialog.setCanceledOnTouchOutside(true);
        ScrollView scrollView = (ScrollView) act.inflater().inflate(f6c0.f12262jd, (ViewGroup) null, false);
        final LetterSendPanel letterSendPanel = (LetterSendPanel) scrollView.findViewById(u4c0.f22777S6);
        letterSendPanel.setFrom(str);
        letterSendPanel.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC1312a(scrollView, letterSendPanel));
        if (NullChecker.a(e30Var)) {
            letterSendPanel.setSendClickCallBack(new e30() { // from class: l.qkp
                public final void call(Object obj) {
                    tkp.m24743b(act, letterSendPanel, e30Var, dialog, (String) obj);
                }
            });
        }
        dialog.setContentView(scrollView);
        ViewGroup.LayoutParams layoutParams = letterSendPanel.getLayoutParams();
        layoutParams.width = act.getResources().getDisplayMetrics().widthPixels;
        letterSendPanel.setLayoutParams(layoutParams);
        dialog.getWindow().setGravity(80);
        dialog.getWindow().setWindowAnimations(v7c0.f24173A);
        letterSendPanel.setLetterWrapperLibraries(CoreModule.f1535d.m25975B(user.gender, i0g0.y()));
        letterSendPanel.m11242C(user, false);
        letterSendPanel.setCloseClick(new hrb(dialog));
        dialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.rkp
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.e(cwf0VarC);
            }
        });
        dialog.getWindow().setSoftInputMode(16);
        dialog.show();
        i0e.f(cwf0VarC);
    }

    /* JADX INFO: renamed from: h */
    public static String m24749h() {
        return m24744c();
    }

    /* JADX INFO: renamed from: i */
    public static int m24750i() {
        return x2c0.f26218Qq;
    }
}
