package p149l;

import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ScrollView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.vip.widget.LetterSendPanel;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p147v.VEditText;

/* JADX INFO: loaded from: classes9.dex */
public class tkp {

    /* JADX INFO: renamed from: a */
    public static hpd0 f170903a = new hpd0("vip_letter_cover_profile_guide_shown_b", Boolean.FALSE);

    /* JADX INFO: renamed from: l.tkp$a */
    public class ViewOnLayoutChangeListenerC20202a implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: a */
        public boolean f170904a = true;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ScrollView f170905b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ LetterSendPanel f170906c;

        public ViewOnLayoutChangeListenerC20202a(ScrollView scrollView, LetterSendPanel letterSendPanel) {
            this.f170905b = scrollView;
            this.f170906c = letterSendPanel;
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m189536b(ScrollView scrollView, LetterSendPanel letterSendPanel) {
            scrollView.fullScroll(130);
            if (!this.f170904a) {
                letterSendPanel.f38017l.requestFocus();
            }
            this.f170904a = false;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            final ScrollView scrollView = this.f170905b;
            final LetterSendPanel letterSendPanel = this.f170906c;
            scrollView.post(new Runnable() { // from class: l.skp
                @Override // java.lang.Runnable
                public final void run() {
                    this.f165001a.m189536b(scrollView, letterSendPanel);
                }
            });
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m189527b(Act act, LetterSendPanel letterSendPanel, e30 e30Var, Dialog dialog, String str) {
        InputMethodManager inputMethodManager = (InputMethodManager) act.getSystemService("input_method");
        VEditText editTextView = letterSendPanel.getEditTextView();
        if (NullChecker.m81303a(inputMethodManager) && NullChecker.m81303a(editTextView)) {
            inputMethodManager.hideSoftInputFromWindow(editTextView.getWindowToken(), 0);
        }
        e30Var.call(str);
        dialog.dismiss();
    }

    /* JADX INFO: renamed from: c */
    public static String m189528c() {
        boolean zM221004u0 = zz6.m221004u0();
        String str = zM221004u0 ? "https://auto.tancdn.com/v1/images/eyJpZCI6IktZQ1VMRDRQNEE1TUpMVFpYS0g2TjVYR1ZMQU8yRTA3IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo0MTIxMTMxNDU1MjI0MDQ2Mzg5fQ.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IkpZWkdENEFWQkNYRUFBSzVXNFhEM1A3NkJHTFhNNjA2IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3NTc5ODk2MDQ2MDUwMTYxNDQ5fQ.png";
        String strM133885y = i0g0.m133885y();
        if ("ko-KR".equals(strM133885y)) {
            return zM221004u0 ? "https://auto.tancdn.com/v1/images/eyJpZCI6IjVYU0xMVEpKSFhaSzRBS1A2SDNBT0daSFg1VFMyVjA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozNTQ0NzQxMDcxNjY0OTMxNjM3LCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IjJWQkJaVEJLWjY0NVlCUkpBNUpWN1ZDUDdDSUxJSjA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozNTQ0NzQxMTQ4NjM2ODIwMjczLCJhYiI6MH0.png";
        }
        if ("ja-JP".equals(strM133885y)) {
            return zM221004u0 ? "https://auto.tancdn.com/v1/images/eyJpZCI6IklEN0wzWUg1MkZCNVpaMjRIT0VDVlFDUTdHRVpKVTA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozNTQ0NzQxMDcxNjY0OTMxNjM3LCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IkdEQUY3UVVQUE1FWlMyTkZIVFlCSjVaRUZFR05SNDA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozNTQ0NzQxMTQ4NjM2ODIwMjczLCJhYiI6MH0.png";
        }
        if ("id-ID".equals(strM133885y)) {
            return zM221004u0 ? "https://auto.tancdn.com/v1/images/eyJpZCI6IkRWUjQzQ1IzUkVJWU1ON0xJUEE2UzZDSk5VUFBaTzA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo0MTIxMjAxODIzOTY4MzU1MTI1LCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6Ikk2MjNIT0FCTzQ0VkRXWE1UNkhHUFg0UFRURTdZWTA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo0MTIxMjAxOTAwOTQwMjQzNzYxLCJhYiI6MH0.png";
        }
        if ("zh-TW".equals(strM133885y)) {
            return zM221004u0 ? "https://auto.tancdn.com/v1/images/eyJpZCI6IkZHSkxSN1pWNUpOQ1FHWlRNUzI1V0xMRVpQVEpYMzA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo0MTIxMjAxODIzOTY4MzU1MTI1LCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IlZWNFRNNUNMUlNSN1YyR0wzUEY0TFhIUDdHWklENDA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo0MTIxMTMxNTMyMTk2MDY2MDk3LCJhYiI6MH0.png";
        }
        if ("zh-CN".equals(strM133885y)) {
            return zM221004u0 ? "https://auto.tancdn.com/v1/images/eyJpZCI6IlgyUlM1V1NDRExWTkhIRlZDVTVPSVBQSVZHRkVCRjA3IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3NTc5ODk1OTUxODY0ODQ5MjA1fQ.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6Ik4zSkIyNUNVQjdWUlEyWEhSS1BCUFVHU1ZUSE42RTA2IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3NTc5ODk2MDQ2MDUwMTYxNDQ5fQ.png";
        }
        return str;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m189529d() {
        return xma.m210041D3() || swh0.m186191G();
    }

    /* JADX INFO: renamed from: e */
    public static int m189530e() {
        return x2c0.f189526Lp;
    }

    /* JADX INFO: renamed from: f */
    public static int m189531f() {
        return x2c0.f189994as;
    }

    /* JADX INFO: renamed from: g */
    public static void m189532g(final Act act, User user, final e30<String> e30Var, String str) {
        final Dialog dialog = new Dialog(act, v7c0.f180379z);
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_letter_sentmessage_page", dialog.getClass().getName());
        dialog.setCancelable(true);
        dialog.setCanceledOnTouchOutside(true);
        ScrollView scrollView = (ScrollView) act.inflater().inflate(f6c0.f95848jd, (ViewGroup) null, false);
        final LetterSendPanel letterSendPanel = (LetterSendPanel) scrollView.findViewById(u4c0.f174029S6);
        letterSendPanel.setFrom(str);
        letterSendPanel.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC20202a(scrollView, letterSendPanel));
        if (NullChecker.m81303a(e30Var)) {
            letterSendPanel.setSendClickCallBack(new e30() { // from class: l.qkp
                @Override // p149l.e30
                public final void call(Object obj) {
                    tkp.m189527b(act, letterSendPanel, e30Var, dialog, (String) obj);
                }
            });
        }
        dialog.setContentView(scrollView);
        ViewGroup.LayoutParams layoutParams = letterSendPanel.getLayoutParams();
        layoutParams.width = act.getResources().getDisplayMetrics().widthPixels;
        letterSendPanel.setLayoutParams(layoutParams);
        dialog.getWindow().setGravity(80);
        dialog.getWindow().setWindowAnimations(v7c0.f180346A);
        letterSendPanel.setLetterWrapperLibraries(CoreModule.f17546d.m200496B(user.gender, i0g0.m133885y()));
        letterSendPanel.m57746C(user, false);
        letterSendPanel.setCloseClick(new hrb(dialog));
        dialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.rkp
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        });
        dialog.getWindow().setSoftInputMode(16);
        dialog.show();
        i0e.m133797f(cwf0VarM133794c);
    }

    /* JADX INFO: renamed from: h */
    public static String m189533h() {
        return m189528c();
    }

    /* JADX INFO: renamed from: i */
    public static int m189534i() {
        return x2c0.f189682Qq;
    }
}
