package p153l;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.overlay.BinderC2096b;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.internal.ads.zzcei;

/* JADX INFO: loaded from: classes6.dex */
public interface wit0 extends har0, ggu0, nit0, kts0, zjt0, ckt0, xts0, y6s0, fkt0, d9y0, ikt0, jkt0, bft0, kkt0 {
    /* JADX INFO: renamed from: C */
    void mo13706C(boolean z);

    /* JADX INFO: renamed from: E */
    void mo13708E(boolean z);

    /* JADX INFO: renamed from: F */
    void mo13709F(pks0 pks0Var);

    /* JADX INFO: renamed from: G */
    void mo13710G(xkt0 xkt0Var);

    /* JADX INFO: renamed from: H */
    void mo13711H(BinderC2096b binderC2096b);

    /* JADX INFO: renamed from: I */
    pks0 mo13712I();

    /* JADX INFO: renamed from: J */
    boolean mo13713J(boolean z, int i);

    /* JADX INFO: renamed from: L */
    WebView mo13715L();

    /* JADX INFO: renamed from: M */
    Context mo13716M();

    /* JADX INFO: renamed from: N */
    void mo13717N(q6w0 q6w0Var, t6w0 t6w0Var);

    /* JADX INFO: renamed from: Q */
    void mo13719Q(String str, bqs0 bqs0Var);

    /* JADX INFO: renamed from: T */
    hpr mo13722T();

    /* JADX INFO: renamed from: V */
    boolean mo13724V();

    /* JADX INFO: renamed from: W */
    void mo13725W(hfw0 hfw0Var);

    /* JADX INFO: renamed from: X */
    void mo13726X(BinderC2096b binderC2096b);

    /* JADX INFO: renamed from: Y */
    boolean mo13727Y();

    /* JADX INFO: renamed from: a */
    yjt0 mo13729a();

    /* JADX INFO: renamed from: a0 */
    boolean mo13730a0();

    /* JADX INFO: renamed from: b0 */
    void mo13732b0(boolean z);

    /* JADX INFO: renamed from: c */
    q6w0 mo13733c();

    /* JADX INFO: renamed from: c0 */
    boolean mo13734c0();

    boolean canGoBack();

    /* JADX INFO: renamed from: d */
    nas0 mo13735d();

    void destroy();

    /* JADX INFO: renamed from: e */
    String mo13737e();

    /* JADX INFO: renamed from: e0 */
    void mo13738e0(int i);

    /* JADX INFO: renamed from: f */
    s7w0 mo13739f();

    /* JADX INFO: renamed from: g */
    void mo13741g(String str, ugt0 ugt0Var);

    /* JADX INFO: renamed from: g0 */
    void mo13742g0(Context context);

    @Override // p153l.ckt0, p153l.bft0
    Context getContext();

    int getHeight();

    ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    int getMeasuredHeight();

    int getMeasuredWidth();

    ViewParent getParent();

    int getWidth();

    void goBack();

    /* JADX INFO: renamed from: h */
    t6w0 mo13743h();

    /* JADX INFO: renamed from: i0 */
    void mo13745i0(boolean z);

    boolean isAttachedToWindow();

    /* JADX INFO: renamed from: j */
    boolean mo13746j();

    /* JADX INFO: renamed from: j0 */
    void mo13747j0(String str, bqs0 bqs0Var);

    /* JADX INFO: renamed from: l */
    void mo13749l();

    /* JADX INFO: renamed from: l0 */
    void mo13750l0(nas0 nas0Var);

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    /* JADX INFO: renamed from: m */
    void mo13751m();

    /* JADX INFO: renamed from: m0 */
    void mo13752m0(boolean z);

    void measure(int i, int i2);

    /* JADX INFO: renamed from: n */
    hfw0 mo13753n();

    /* JADX INFO: renamed from: n0 */
    void mo13754n0();

    /* JADX INFO: renamed from: o */
    WebViewClient mo13755o();

    void onPause();

    void onResume();

    /* JADX INFO: renamed from: p */
    v2s0 mo13757p();

    /* JADX INFO: renamed from: p0 */
    void mo13758p0();

    /* JADX INFO: renamed from: r */
    void mo13760r();

    /* JADX INFO: renamed from: r0 */
    void mo13761r0(eks0 eks0Var);

    /* JADX INFO: renamed from: s */
    void mo13762s();

    @Override // p153l.bft0
    void setBackgroundColor(int i);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    /* JADX INFO: renamed from: t */
    void mo13764t(yjt0 yjt0Var);

    /* JADX INFO: renamed from: t0 */
    void mo13765t0(String str, Predicate predicate);

    /* JADX INFO: renamed from: u0 */
    void mo13767u0(int i);

    /* JADX INFO: renamed from: v */
    void mo13768v();

    /* JADX INFO: renamed from: w */
    void mo13770w(boolean z);

    /* JADX INFO: renamed from: x0 */
    void mo13773x0(String str, String str2, String str3);

    /* JADX INFO: renamed from: y */
    BinderC2096b mo13774y();

    /* JADX INFO: renamed from: y0 */
    void mo13775y0(boolean z);

    View zzF();

    BinderC2096b zzL();

    nkt0 zzN();

    xkt0 zzO();

    void zzV();

    boolean zzaz();

    Activity zzi();

    far0 zzj();

    ihs0 zzm();

    zzcei zzn();
}
