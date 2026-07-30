package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.overlay.BinderC2096b;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.util.C2098b;
import com.google.android.gms.common.util.Predicate;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.eclipse.jetty.http.MimeTypes;
import org.json.JSONObject;
import p153l.bqs0;
import p153l.bxy0;
import p153l.eks0;
import p153l.far0;
import p153l.hfw0;
import p153l.hhs0;
import p153l.hpr;
import p153l.ihs0;
import p153l.jas0;
import p153l.mdr0;
import p153l.nas0;
import p153l.nkt0;
import p153l.pks0;
import p153l.q6w0;
import p153l.qet0;
import p153l.s7w0;
import p153l.sgs0;
import p153l.t6w0;
import p153l.ugt0;
import p153l.ukw0;
import p153l.v2s0;
import p153l.wit0;
import p153l.x6s0;
import p153l.xkt0;
import p153l.yjt0;

/* JADX INFO: loaded from: classes6.dex */
public final class zzcka extends FrameLayout implements wit0 {

    /* JADX INFO: renamed from: a */
    public final wit0 f10208a;

    /* JADX INFO: renamed from: b */
    public final qet0 f10209b;

    /* JADX INFO: renamed from: c */
    public final AtomicBoolean f10210c;

    /* JADX WARN: Multi-variable type inference failed */
    public zzcka(wit0 wit0Var) {
        super(wit0Var.getContext());
        this.f10210c = new AtomicBoolean();
        this.f10208a = wit0Var;
        this.f10209b = new qet0(wit0Var.mo13716M(), this, this);
        addView((View) wit0Var);
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: C */
    public final void mo13706C(boolean z) {
        this.f10208a.mo13706C(z);
    }

    @Override // p153l.bft0
    /* JADX INFO: renamed from: D */
    public final void mo13707D(int i) {
        this.f10208a.mo13707D(i);
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: E */
    public final void mo13708E(boolean z) {
        this.f10208a.mo13708E(true);
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: F */
    public final void mo13709F(@Nullable pks0 pks0Var) {
        this.f10208a.mo13709F(pks0Var);
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: G */
    public final void mo13710G(xkt0 xkt0Var) {
        this.f10208a.mo13710G(xkt0Var);
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: H */
    public final void mo13711H(BinderC2096b binderC2096b) {
        this.f10208a.mo13711H(binderC2096b);
    }

    @Override // p153l.wit0
    @Nullable
    /* JADX INFO: renamed from: I */
    public final pks0 mo13712I() {
        return this.f10208a.mo13712I();
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: J */
    public final boolean mo13713J(boolean z, int i) {
        if (!this.f10210c.compareAndSet(false, true)) {
            return true;
        }
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168048L0)).booleanValue()) {
            return false;
        }
        if (this.f10208a.getParent() instanceof ViewGroup) {
            ((ViewGroup) this.f10208a.getParent()).removeView((View) this.f10208a);
        }
        this.f10208a.mo13713J(z, i);
        return true;
    }

    @Override // p153l.bft0
    /* JADX INFO: renamed from: K */
    public final void mo13714K(boolean z, long j) {
        this.f10208a.mo13714K(z, j);
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: L */
    public final WebView mo13715L() {
        return (WebView) this.f10208a;
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: M */
    public final Context mo13716M() {
        return this.f10208a.mo13716M();
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: N */
    public final void mo13717N(q6w0 q6w0Var, t6w0 t6w0Var) {
        this.f10208a.mo13717N(q6w0Var, t6w0Var);
    }

    @Override // p153l.bft0
    /* JADX INFO: renamed from: P */
    public final ugt0 mo13718P(String str) {
        return this.f10208a.mo13718P(str);
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: Q */
    public final void mo13719Q(String str, bqs0 bqs0Var) {
        this.f10208a.mo13719Q(str, bqs0Var);
    }

    @Override // p153l.fkt0
    /* JADX INFO: renamed from: R */
    public final void mo13720R(boolean z, int i, String str, boolean z2, boolean z3) {
        this.f10208a.mo13720R(z, i, str, z2, z3);
    }

    @Override // p153l.fkt0
    /* JADX INFO: renamed from: S */
    public final void mo13721S(zzc zzcVar, boolean z) {
        this.f10208a.mo13721S(zzcVar, z);
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: T */
    public final hpr mo13722T() {
        return this.f10208a.mo13722T();
    }

    @Override // p153l.y6s0
    /* JADX INFO: renamed from: U */
    public final void mo13723U(x6s0 x6s0Var) {
        this.f10208a.mo13723U(x6s0Var);
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: V */
    public final boolean mo13724V() {
        return this.f10208a.mo13724V();
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: W */
    public final void mo13725W(hfw0 hfw0Var) {
        this.f10208a.mo13725W(hfw0Var);
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: X */
    public final void mo13726X(BinderC2096b binderC2096b) {
        this.f10208a.mo13726X(binderC2096b);
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: Y */
    public final boolean mo13727Y() {
        return this.f10208a.mo13727Y();
    }

    @Override // p153l.kts0
    /* JADX INFO: renamed from: Z */
    public final void mo13728Z(String str, Map map) {
        this.f10208a.mo13728Z(str, map);
    }

    @Override // p153l.wit0, p153l.bft0
    /* JADX INFO: renamed from: a */
    public final yjt0 mo13729a() {
        return this.f10208a.mo13729a();
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: a0 */
    public final boolean mo13730a0() {
        return this.f10208a.mo13730a0();
    }

    @Override // p153l.xts0
    /* JADX INFO: renamed from: b */
    public final void mo13731b(String str, String str2) {
        this.f10208a.mo13731b("window.inspectorInfo", str2);
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: b0 */
    public final void mo13732b0(boolean z) {
        this.f10208a.mo13732b0(z);
    }

    @Override // p153l.wit0, p153l.nit0
    /* JADX INFO: renamed from: c */
    public final q6w0 mo13733c() {
        return this.f10208a.mo13733c();
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: c0 */
    public final boolean mo13734c0() {
        return this.f10210c.get();
    }

    @Override // p153l.wit0
    public final boolean canGoBack() {
        return this.f10208a.canGoBack();
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: d */
    public final nas0 mo13735d() {
        return this.f10208a.mo13735d();
    }

    @Override // p153l.d9y0
    /* JADX INFO: renamed from: d0 */
    public final void mo13736d0() {
        this.f10208a.mo13736d0();
    }

    @Override // p153l.wit0
    public final void destroy() {
        final hfw0 hfw0VarMo13753n = mo13753n();
        if (hfw0VarMo13753n == null) {
            this.f10208a.destroy();
            return;
        }
        ukw0 ukw0Var = C2098b.f9751l;
        ukw0Var.post(new Runnable() { // from class: l.kjt0
            @Override // java.lang.Runnable
            public final void run() {
                bxy0.m106917a().mo144390d(hfw0VarMo13753n);
            }
        });
        final wit0 wit0Var = this.f10208a;
        Objects.requireNonNull(wit0Var);
        ukw0Var.postDelayed(new Runnable() { // from class: l.ljt0
            @Override // java.lang.Runnable
            public final void run() {
                wit0Var.destroy();
            }
        }, ((Integer) jas0.m144075c().m176505a(sgs0.f168172V4)).intValue());
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: e */
    public final String mo13737e() {
        return this.f10208a.mo13737e();
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: e0 */
    public final void mo13738e0(int i) {
        this.f10208a.mo13738e0(i);
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: f */
    public final s7w0 mo13739f() {
        return this.f10208a.mo13739f();
    }

    @Override // p153l.bft0
    /* JADX INFO: renamed from: f0 */
    public final void mo13740f0(int i) {
    }

    @Override // p153l.wit0, p153l.bft0
    /* JADX INFO: renamed from: g */
    public final void mo13741g(String str, ugt0 ugt0Var) {
        this.f10208a.mo13741g(str, ugt0Var);
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: g0 */
    public final void mo13742g0(Context context) {
        this.f10208a.mo13742g0(context);
    }

    @Override // p153l.wit0
    public final void goBack() {
        this.f10208a.goBack();
    }

    @Override // p153l.wit0, p153l.zjt0
    /* JADX INFO: renamed from: h */
    public final t6w0 mo13743h() {
        return this.f10208a.mo13743h();
    }

    @Override // p153l.bft0
    /* JADX INFO: renamed from: h0 */
    public final void mo13744h0(int i) {
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: i0 */
    public final void mo13745i0(boolean z) {
        this.f10208a.mo13745i0(z);
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: j */
    public final boolean mo13746j() {
        return this.f10208a.mo13746j();
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: j0 */
    public final void mo13747j0(String str, bqs0 bqs0Var) {
        this.f10208a.mo13747j0(str, bqs0Var);
    }

    @Override // p153l.bft0
    /* JADX INFO: renamed from: k */
    public final void mo13748k() {
        this.f10208a.mo13748k();
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: l */
    public final void mo13749l() {
        this.f10208a.mo13749l();
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: l0 */
    public final void mo13750l0(nas0 nas0Var) {
        this.f10208a.mo13750l0(nas0Var);
    }

    @Override // p153l.wit0
    public final void loadData(String str, String str2, String str3) {
        this.f10208a.loadData(str, MimeTypes.TEXT_HTML, str3);
    }

    @Override // p153l.wit0
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.f10208a.loadDataWithBaseURL(str, str2, MimeTypes.TEXT_HTML, "UTF-8", null);
    }

    @Override // p153l.wit0
    public final void loadUrl(String str) {
        this.f10208a.loadUrl(str);
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: m */
    public final void mo13751m() {
        this.f10208a.mo13751m();
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: m0 */
    public final void mo13752m0(boolean z) {
        this.f10208a.mo13752m0(z);
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: n */
    public final hfw0 mo13753n() {
        return this.f10208a.mo13753n();
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: n0 */
    public final void mo13754n0() {
        this.f10208a.mo13754n0();
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: o */
    public final WebViewClient mo13755o() {
        return this.f10208a.mo13755o();
    }

    @Override // p153l.d9y0
    /* JADX INFO: renamed from: o0 */
    public final void mo13756o0() {
        this.f10208a.mo13756o0();
    }

    @Override // p153l.har0
    public final void onAdClicked() {
        wit0 wit0Var = this.f10208a;
        if (wit0Var != null) {
            wit0Var.onAdClicked();
        }
    }

    @Override // p153l.wit0
    public final void onPause() {
        this.f10209b.m176273f();
        this.f10208a.onPause();
    }

    @Override // p153l.wit0
    public final void onResume() {
        this.f10208a.onResume();
    }

    @Override // p153l.wit0, p153l.ikt0
    /* JADX INFO: renamed from: p */
    public final v2s0 mo13757p() {
        return this.f10208a.mo13757p();
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: p0 */
    public final void mo13758p0() {
        HashMap map = new HashMap(3);
        map.put("app_muted", String.valueOf(bxy0.m106936t().m157993e()));
        map.put("app_volume", String.valueOf(bxy0.m106936t().m157990a()));
        zzckf zzckfVar = (zzckf) this.f10208a;
        map.put("device_volume", String.valueOf(mdr0.m157989b(zzckfVar.getContext())));
        zzckfVar.mo13728Z("volume", map);
    }

    @Override // p153l.kts0
    /* JADX INFO: renamed from: q */
    public final void mo13759q(String str, JSONObject jSONObject) {
        this.f10208a.mo13759q(str, jSONObject);
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: r */
    public final void mo13760r() {
        this.f10208a.mo13760r();
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: r0 */
    public final void mo13761r0(eks0 eks0Var) {
        this.f10208a.mo13761r0(eks0Var);
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: s */
    public final void mo13762s() {
        TextView textView = new TextView(getContext());
        bxy0.m106934r();
        textView.setText(C2098b.m12359Z());
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        textView.setBackground(gradientDrawable);
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
    }

    @Override // p153l.bft0
    /* JADX INFO: renamed from: s0 */
    public final String mo13763s0() {
        return this.f10208a.mo13763s0();
    }

    @Override // android.view.View, p153l.wit0
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f10208a.setOnClickListener(onClickListener);
    }

    @Override // android.view.View, p153l.wit0
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f10208a.setOnTouchListener(onTouchListener);
    }

    @Override // p153l.wit0
    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.f10208a.setWebChromeClient(webChromeClient);
    }

    @Override // p153l.wit0
    public final void setWebViewClient(WebViewClient webViewClient) {
        this.f10208a.setWebViewClient(webViewClient);
    }

    @Override // p153l.wit0, p153l.bft0
    /* JADX INFO: renamed from: t */
    public final void mo13764t(yjt0 yjt0Var) {
        this.f10208a.mo13764t(yjt0Var);
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: t0 */
    public final void mo13765t0(String str, Predicate predicate) {
        this.f10208a.mo13765t0(str, predicate);
    }

    @Override // p153l.bft0
    /* JADX INFO: renamed from: u */
    public final void mo13766u(boolean z) {
        this.f10208a.mo13766u(false);
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: u0 */
    public final void mo13767u0(int i) {
        this.f10208a.mo13767u0(i);
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: v */
    public final void mo13768v() {
        setBackgroundColor(0);
        this.f10208a.setBackgroundColor(0);
    }

    @Override // p153l.fkt0
    /* JADX INFO: renamed from: v0 */
    public final void mo13769v0(boolean z, int i, boolean z2) {
        this.f10208a.mo13769v0(z, i, z2);
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: w */
    public final void mo13770w(boolean z) {
        this.f10208a.mo13770w(z);
    }

    @Override // p153l.fkt0
    /* JADX INFO: renamed from: w0 */
    public final void mo13771w0(boolean z, int i, String str, String str2, boolean z2) {
        this.f10208a.mo13771w0(z, i, str, str2, z2);
    }

    @Override // p153l.bft0
    /* JADX INFO: renamed from: x */
    public final void mo13772x(int i) {
        this.f10209b.m176274g(i);
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: x0 */
    public final void mo13773x0(String str, String str2, @Nullable String str3) {
        this.f10208a.mo13773x0(str, str2, null);
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: y */
    public final BinderC2096b mo13774y() {
        return this.f10208a.mo13774y();
    }

    @Override // p153l.wit0
    /* JADX INFO: renamed from: y0 */
    public final void mo13775y0(boolean z) {
        this.f10208a.mo13775y0(z);
    }

    @Override // p153l.fkt0
    /* JADX INFO: renamed from: z */
    public final void mo13776z(String str, String str2, int i) {
        this.f10208a.mo13776z(str, str2, 14);
    }

    @Override // p153l.xts0
    /* JADX INFO: renamed from: z0 */
    public final void mo13777z0(String str, JSONObject jSONObject) {
        ((zzckf) this.f10208a).mo13731b(str, jSONObject.toString());
    }

    @Override // p153l.wit0, p153l.kkt0
    public final View zzF() {
        return this;
    }

    @Override // p153l.wit0
    public final BinderC2096b zzL() {
        return this.f10208a.zzL();
    }

    @Override // p153l.wit0
    public final nkt0 zzN() {
        return ((zzckf) this.f10208a).m13781B0();
    }

    @Override // p153l.wit0, p153l.hkt0
    public final xkt0 zzO() {
        return this.f10208a.zzO();
    }

    @Override // p153l.wit0
    public final void zzV() {
        this.f10209b.m176272e();
        this.f10208a.zzV();
    }

    @Override // p153l.xts0
    public final void zza(String str) {
        ((zzckf) this.f10208a).m13784G0(str);
    }

    @Override // p153l.wit0
    public final boolean zzaz() {
        return this.f10208a.zzaz();
    }

    @Override // p153l.ggu0
    public final void zzbo() {
        wit0 wit0Var = this.f10208a;
        if (wit0Var != null) {
            wit0Var.zzbo();
        }
    }

    @Override // p153l.bft0
    public final int zzf() {
        return this.f10208a.zzf();
    }

    @Override // p153l.bft0
    public final int zzg() {
        return ((Boolean) jas0.m144075c().m176505a(sgs0.f168039K3)).booleanValue() ? this.f10208a.getMeasuredHeight() : getMeasuredHeight();
    }

    @Override // p153l.bft0
    public final int zzh() {
        return ((Boolean) jas0.m144075c().m176505a(sgs0.f168039K3)).booleanValue() ? this.f10208a.getMeasuredWidth() : getMeasuredWidth();
    }

    @Override // p153l.wit0, p153l.ckt0, p153l.bft0
    @Nullable
    public final Activity zzi() {
        return this.f10208a.zzi();
    }

    @Override // p153l.wit0, p153l.bft0
    public final far0 zzj() {
        return this.f10208a.zzj();
    }

    @Override // p153l.bft0
    public final hhs0 zzk() {
        return this.f10208a.zzk();
    }

    @Override // p153l.wit0, p153l.bft0
    public final ihs0 zzm() {
        return this.f10208a.zzm();
    }

    @Override // p153l.wit0, p153l.jkt0, p153l.bft0
    public final zzcei zzn() {
        return this.f10208a.zzn();
    }

    @Override // p153l.bft0
    public final qet0 zzo() {
        return this.f10209b;
    }

    @Override // p153l.bft0
    public final String zzr() {
        return this.f10208a.zzr();
    }

    @Override // p153l.ggu0
    public final void zzs() {
        wit0 wit0Var = this.f10208a;
        if (wit0Var != null) {
            wit0Var.zzs();
        }
    }

    @Override // p153l.bft0
    public final void zzu() {
        this.f10208a.zzu();
    }
}
