package p149l;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.overlay.BinderC2073b;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.internal.ads.zzcei;

/* JADX INFO: loaded from: classes6.dex */
public interface q9t0 extends b1r0, a7u0, h9t0, eks0, tat0, wat0, rks0, sxr0, zat0, xzx0, cbt0, dbt0, v5t0, ebt0 {
    /* JADX INFO: renamed from: C */
    void mo13652C(boolean z);

    /* JADX INFO: renamed from: E */
    void mo13654E(boolean z);

    /* JADX INFO: renamed from: F */
    void mo13655F(jbs0 jbs0Var);

    /* JADX INFO: renamed from: G */
    void mo13656G(rbt0 rbt0Var);

    /* JADX INFO: renamed from: H */
    void mo13657H(BinderC2073b binderC2073b);

    /* JADX INFO: renamed from: I */
    jbs0 mo13658I();

    /* JADX INFO: renamed from: J */
    boolean mo13659J(boolean z, int i);

    /* JADX INFO: renamed from: L */
    WebView mo13661L();

    /* JADX INFO: renamed from: M */
    Context mo13662M();

    /* JADX INFO: renamed from: N */
    void mo13663N(kxv0 kxv0Var, nxv0 nxv0Var);

    /* JADX INFO: renamed from: Q */
    void mo13665Q(String str, vgs0 vgs0Var);

    /* JADX INFO: renamed from: T */
    gnr mo13668T();

    /* JADX INFO: renamed from: V */
    boolean mo13670V();

    /* JADX INFO: renamed from: W */
    void mo13671W(b6w0 b6w0Var);

    /* JADX INFO: renamed from: X */
    void mo13672X(BinderC2073b binderC2073b);

    /* JADX INFO: renamed from: Y */
    boolean mo13673Y();

    /* JADX INFO: renamed from: a */
    sat0 mo13675a();

    /* JADX INFO: renamed from: a0 */
    boolean mo13676a0();

    /* JADX INFO: renamed from: b0 */
    void mo13678b0(boolean z);

    /* JADX INFO: renamed from: c */
    kxv0 mo13679c();

    /* JADX INFO: renamed from: c0 */
    boolean mo13680c0();

    boolean canGoBack();

    /* JADX INFO: renamed from: d */
    h1s0 mo13681d();

    void destroy();

    /* JADX INFO: renamed from: e */
    String mo13683e();

    /* JADX INFO: renamed from: e0 */
    void mo13684e0(int i);

    /* JADX INFO: renamed from: f */
    myv0 mo13685f();

    /* JADX INFO: renamed from: g */
    void mo13687g(String str, o7t0 o7t0Var);

    /* JADX INFO: renamed from: g0 */
    void mo13688g0(Context context);

    @Override // p149l.wat0, p149l.v5t0
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
    nxv0 mo13689h();

    /* JADX INFO: renamed from: i0 */
    void mo13691i0(boolean z);

    boolean isAttachedToWindow();

    /* JADX INFO: renamed from: j */
    boolean mo13692j();

    /* JADX INFO: renamed from: j0 */
    void mo13693j0(String str, vgs0 vgs0Var);

    /* JADX INFO: renamed from: l */
    void mo13695l();

    /* JADX INFO: renamed from: l0 */
    void mo13696l0(h1s0 h1s0Var);

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    /* JADX INFO: renamed from: m */
    void mo13697m();

    /* JADX INFO: renamed from: m0 */
    void mo13698m0(boolean z);

    void measure(int i, int i2);

    /* JADX INFO: renamed from: n */
    b6w0 mo13699n();

    /* JADX INFO: renamed from: n0 */
    void mo13700n0();

    /* JADX INFO: renamed from: o */
    WebViewClient mo13701o();

    void onPause();

    void onResume();

    /* JADX INFO: renamed from: p */
    ptr0 mo13703p();

    /* JADX INFO: renamed from: p0 */
    void mo13704p0();

    /* JADX INFO: renamed from: r */
    void mo13706r();

    /* JADX INFO: renamed from: r0 */
    void mo13707r0(yas0 yas0Var);

    /* JADX INFO: renamed from: s */
    void mo13708s();

    @Override // p149l.v5t0
    void setBackgroundColor(int i);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    /* JADX INFO: renamed from: t */
    void mo13710t(sat0 sat0Var);

    /* JADX INFO: renamed from: t0 */
    void mo13711t0(String str, Predicate predicate);

    /* JADX INFO: renamed from: u0 */
    void mo13713u0(int i);

    /* JADX INFO: renamed from: v */
    void mo13714v();

    /* JADX INFO: renamed from: w */
    void mo13716w(boolean z);

    /* JADX INFO: renamed from: x0 */
    void mo13719x0(String str, String str2, String str3);

    /* JADX INFO: renamed from: y */
    BinderC2073b mo13720y();

    /* JADX INFO: renamed from: y0 */
    void mo13721y0(boolean z);

    View zzF();

    BinderC2073b zzL();

    hbt0 zzN();

    rbt0 zzO();

    void zzV();

    boolean zzaz();

    Activity zzi();

    z0r0 zzj();

    c8s0 zzm();

    zzcei zzn();
}
