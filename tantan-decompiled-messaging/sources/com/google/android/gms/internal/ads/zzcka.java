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
import com.google.android.gms.ads.internal.overlay.BinderC2073b;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.util.C2075b;
import com.google.android.gms.common.util.Predicate;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.eclipse.jetty.http.MimeTypes;
import org.json.JSONObject;
import p149l.b6w0;
import p149l.b8s0;
import p149l.c8s0;
import p149l.d1s0;
import p149l.g4r0;
import p149l.gnr;
import p149l.h1s0;
import p149l.hbt0;
import p149l.jbs0;
import p149l.k5t0;
import p149l.kxv0;
import p149l.m7s0;
import p149l.myv0;
import p149l.nxv0;
import p149l.o7t0;
import p149l.obw0;
import p149l.ptr0;
import p149l.q9t0;
import p149l.rbt0;
import p149l.rxr0;
import p149l.sat0;
import p149l.vgs0;
import p149l.vny0;
import p149l.yas0;
import p149l.z0r0;

/* JADX INFO: loaded from: classes6.dex */
public final class zzcka extends FrameLayout implements q9t0 {

    /* JADX INFO: renamed from: a */
    public final q9t0 f10171a;

    /* JADX INFO: renamed from: b */
    public final k5t0 f10172b;

    /* JADX INFO: renamed from: c */
    public final AtomicBoolean f10173c;

    /* JADX WARN: Multi-variable type inference failed */
    public zzcka(q9t0 q9t0Var) {
        super(q9t0Var.getContext());
        this.f10173c = new AtomicBoolean();
        this.f10171a = q9t0Var;
        this.f10172b = new k5t0(q9t0Var.mo13662M(), this, this);
        addView((View) q9t0Var);
    }

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: C */
    public final void mo13652C(boolean z) {
        this.f10171a.mo13652C(z);
    }

    @Override // p149l.v5t0
    /* JADX INFO: renamed from: D */
    public final void mo13653D(int i) {
        this.f10171a.mo13653D(i);
    }

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: E */
    public final void mo13654E(boolean z) {
        this.f10171a.mo13654E(true);
    }

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: F */
    public final void mo13655F(@Nullable jbs0 jbs0Var) {
        this.f10171a.mo13655F(jbs0Var);
    }

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: G */
    public final void mo13656G(rbt0 rbt0Var) {
        this.f10171a.mo13656G(rbt0Var);
    }

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: H */
    public final void mo13657H(BinderC2073b binderC2073b) {
        this.f10171a.mo13657H(binderC2073b);
    }

    @Override // p149l.q9t0
    @Nullable
    /* JADX INFO: renamed from: I */
    public final jbs0 mo13658I() {
        return this.f10171a.mo13658I();
    }

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: J */
    public final boolean mo13659J(boolean z, int i) {
        if (!this.f10173c.compareAndSet(false, true)) {
            return true;
        }
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131977L0)).booleanValue()) {
            return false;
        }
        if (this.f10171a.getParent() instanceof ViewGroup) {
            ((ViewGroup) this.f10171a.getParent()).removeView((View) this.f10171a);
        }
        this.f10171a.mo13659J(z, i);
        return true;
    }

    @Override // p149l.v5t0
    /* JADX INFO: renamed from: K */
    public final void mo13660K(boolean z, long j) {
        this.f10171a.mo13660K(z, j);
    }

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: L */
    public final WebView mo13661L() {
        return (WebView) this.f10171a;
    }

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: M */
    public final Context mo13662M() {
        return this.f10171a.mo13662M();
    }

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: N */
    public final void mo13663N(kxv0 kxv0Var, nxv0 nxv0Var) {
        this.f10171a.mo13663N(kxv0Var, nxv0Var);
    }

    @Override // p149l.v5t0
    /* JADX INFO: renamed from: P */
    public final o7t0 mo13664P(String str) {
        return this.f10171a.mo13664P(str);
    }

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: Q */
    public final void mo13665Q(String str, vgs0 vgs0Var) {
        this.f10171a.mo13665Q(str, vgs0Var);
    }

    @Override // p149l.zat0
    /* JADX INFO: renamed from: R */
    public final void mo13666R(boolean z, int i, String str, boolean z2, boolean z3) {
        this.f10171a.mo13666R(z, i, str, z2, z3);
    }

    @Override // p149l.zat0
    /* JADX INFO: renamed from: S */
    public final void mo13667S(zzc zzcVar, boolean z) {
        this.f10171a.mo13667S(zzcVar, z);
    }

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: T */
    public final gnr mo13668T() {
        return this.f10171a.mo13668T();
    }

    @Override // p149l.sxr0
    /* JADX INFO: renamed from: U */
    public final void mo13669U(rxr0 rxr0Var) {
        this.f10171a.mo13669U(rxr0Var);
    }

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: V */
    public final boolean mo13670V() {
        return this.f10171a.mo13670V();
    }

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: W */
    public final void mo13671W(b6w0 b6w0Var) {
        this.f10171a.mo13671W(b6w0Var);
    }

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: X */
    public final void mo13672X(BinderC2073b binderC2073b) {
        this.f10171a.mo13672X(binderC2073b);
    }

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: Y */
    public final boolean mo13673Y() {
        return this.f10171a.mo13673Y();
    }

    @Override // p149l.eks0
    /* JADX INFO: renamed from: Z */
    public final void mo13674Z(String str, Map map) {
        this.f10171a.mo13674Z(str, map);
    }

    @Override // p149l.q9t0, p149l.v5t0
    /* JADX INFO: renamed from: a */
    public final sat0 mo13675a() {
        return this.f10171a.mo13675a();
    }

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: a0 */
    public final boolean mo13676a0() {
        return this.f10171a.mo13676a0();
    }

    @Override // p149l.rks0
    /* JADX INFO: renamed from: b */
    public final void mo13677b(String str, String str2) {
        this.f10171a.mo13677b("window.inspectorInfo", str2);
    }

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: b0 */
    public final void mo13678b0(boolean z) {
        this.f10171a.mo13678b0(z);
    }

    @Override // p149l.q9t0, p149l.h9t0
    /* JADX INFO: renamed from: c */
    public final kxv0 mo13679c() {
        return this.f10171a.mo13679c();
    }

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: c0 */
    public final boolean mo13680c0() {
        return this.f10173c.get();
    }

    @Override // p149l.q9t0
    public final boolean canGoBack() {
        return this.f10171a.canGoBack();
    }

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: d */
    public final h1s0 mo13681d() {
        return this.f10171a.mo13681d();
    }

    @Override // p149l.xzx0
    /* JADX INFO: renamed from: d0 */
    public final void mo13682d0() {
        this.f10171a.mo13682d0();
    }

    @Override // p149l.q9t0
    public final void destroy() {
        final b6w0 b6w0VarMo13699n = mo13699n();
        if (b6w0VarMo13699n == null) {
            this.f10171a.destroy();
            return;
        }
        obw0 obw0Var = C2075b.f9714l;
        obw0Var.post(new Runnable() { // from class: l.eat0
            @Override // java.lang.Runnable
            public final void run() {
                vny0.m199063a().mo109955d(b6w0VarMo13699n);
            }
        });
        final q9t0 q9t0Var = this.f10171a;
        Objects.requireNonNull(q9t0Var);
        obw0Var.postDelayed(new Runnable() { // from class: l.fat0
            @Override // java.lang.Runnable
            public final void run() {
                q9t0Var.destroy();
            }
        }, ((Integer) d1s0.m109677c().m144697a(m7s0.f132101V4)).intValue());
    }

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: e */
    public final String mo13683e() {
        return this.f10171a.mo13683e();
    }

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: e0 */
    public final void mo13684e0(int i) {
        this.f10171a.mo13684e0(i);
    }

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: f */
    public final myv0 mo13685f() {
        return this.f10171a.mo13685f();
    }

    @Override // p149l.v5t0
    /* JADX INFO: renamed from: f0 */
    public final void mo13686f0(int i) {
    }

    @Override // p149l.q9t0, p149l.v5t0
    /* JADX INFO: renamed from: g */
    public final void mo13687g(String str, o7t0 o7t0Var) {
        this.f10171a.mo13687g(str, o7t0Var);
    }

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: g0 */
    public final void mo13688g0(Context context) {
        this.f10171a.mo13688g0(context);
    }

    @Override // p149l.q9t0
    public final void goBack() {
        this.f10171a.goBack();
    }

    @Override // p149l.q9t0, p149l.tat0
    /* JADX INFO: renamed from: h */
    public final nxv0 mo13689h() {
        return this.f10171a.mo13689h();
    }

    @Override // p149l.v5t0
    /* JADX INFO: renamed from: h0 */
    public final void mo13690h0(int i) {
    }

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: i0 */
    public final void mo13691i0(boolean z) {
        this.f10171a.mo13691i0(z);
    }

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: j */
    public final boolean mo13692j() {
        return this.f10171a.mo13692j();
    }

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: j0 */
    public final void mo13693j0(String str, vgs0 vgs0Var) {
        this.f10171a.mo13693j0(str, vgs0Var);
    }

    @Override // p149l.v5t0
    /* JADX INFO: renamed from: k */
    public final void mo13694k() {
        this.f10171a.mo13694k();
    }

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: l */
    public final void mo13695l() {
        this.f10171a.mo13695l();
    }

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: l0 */
    public final void mo13696l0(h1s0 h1s0Var) {
        this.f10171a.mo13696l0(h1s0Var);
    }

    @Override // p149l.q9t0
    public final void loadData(String str, String str2, String str3) {
        this.f10171a.loadData(str, MimeTypes.TEXT_HTML, str3);
    }

    @Override // p149l.q9t0
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.f10171a.loadDataWithBaseURL(str, str2, MimeTypes.TEXT_HTML, "UTF-8", null);
    }

    @Override // p149l.q9t0
    public final void loadUrl(String str) {
        this.f10171a.loadUrl(str);
    }

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: m */
    public final void mo13697m() {
        this.f10171a.mo13697m();
    }

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: m0 */
    public final void mo13698m0(boolean z) {
        this.f10171a.mo13698m0(z);
    }

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: n */
    public final b6w0 mo13699n() {
        return this.f10171a.mo13699n();
    }

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: n0 */
    public final void mo13700n0() {
        this.f10171a.mo13700n0();
    }

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: o */
    public final WebViewClient mo13701o() {
        return this.f10171a.mo13701o();
    }

    @Override // p149l.xzx0
    /* JADX INFO: renamed from: o0 */
    public final void mo13702o0() {
        this.f10171a.mo13702o0();
    }

    @Override // p149l.b1r0
    public final void onAdClicked() {
        q9t0 q9t0Var = this.f10171a;
        if (q9t0Var != null) {
            q9t0Var.onAdClicked();
        }
    }

    @Override // p149l.q9t0
    public final void onPause() {
        this.f10172b.m144553f();
        this.f10171a.onPause();
    }

    @Override // p149l.q9t0
    public final void onResume() {
        this.f10171a.onResume();
    }

    @Override // p149l.q9t0, p149l.cbt0
    /* JADX INFO: renamed from: p */
    public final ptr0 mo13703p() {
        return this.f10171a.mo13703p();
    }

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: p0 */
    public final void mo13704p0() {
        HashMap map = new HashMap(3);
        map.put("app_muted", String.valueOf(vny0.m199082t().m124398e()));
        map.put("app_volume", String.valueOf(vny0.m199082t().m124395a()));
        zzckf zzckfVar = (zzckf) this.f10171a;
        map.put("device_volume", String.valueOf(g4r0.m124394b(zzckfVar.getContext())));
        zzckfVar.mo13674Z("volume", map);
    }

    @Override // p149l.eks0
    /* JADX INFO: renamed from: q */
    public final void mo13705q(String str, JSONObject jSONObject) {
        this.f10171a.mo13705q(str, jSONObject);
    }

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: r */
    public final void mo13706r() {
        this.f10171a.mo13706r();
    }

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: r0 */
    public final void mo13707r0(yas0 yas0Var) {
        this.f10171a.mo13707r0(yas0Var);
    }

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: s */
    public final void mo13708s() {
        TextView textView = new TextView(getContext());
        vny0.m199080r();
        textView.setText(C2075b.m12305Z());
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

    @Override // p149l.v5t0
    /* JADX INFO: renamed from: s0 */
    public final String mo13709s0() {
        return this.f10171a.mo13709s0();
    }

    @Override // android.view.View, p149l.q9t0
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f10171a.setOnClickListener(onClickListener);
    }

    @Override // android.view.View, p149l.q9t0
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f10171a.setOnTouchListener(onTouchListener);
    }

    @Override // p149l.q9t0
    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.f10171a.setWebChromeClient(webChromeClient);
    }

    @Override // p149l.q9t0
    public final void setWebViewClient(WebViewClient webViewClient) {
        this.f10171a.setWebViewClient(webViewClient);
    }

    @Override // p149l.q9t0, p149l.v5t0
    /* JADX INFO: renamed from: t */
    public final void mo13710t(sat0 sat0Var) {
        this.f10171a.mo13710t(sat0Var);
    }

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: t0 */
    public final void mo13711t0(String str, Predicate predicate) {
        this.f10171a.mo13711t0(str, predicate);
    }

    @Override // p149l.v5t0
    /* JADX INFO: renamed from: u */
    public final void mo13712u(boolean z) {
        this.f10171a.mo13712u(false);
    }

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: u0 */
    public final void mo13713u0(int i) {
        this.f10171a.mo13713u0(i);
    }

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: v */
    public final void mo13714v() {
        setBackgroundColor(0);
        this.f10171a.setBackgroundColor(0);
    }

    @Override // p149l.zat0
    /* JADX INFO: renamed from: v0 */
    public final void mo13715v0(boolean z, int i, boolean z2) {
        this.f10171a.mo13715v0(z, i, z2);
    }

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: w */
    public final void mo13716w(boolean z) {
        this.f10171a.mo13716w(z);
    }

    @Override // p149l.zat0
    /* JADX INFO: renamed from: w0 */
    public final void mo13717w0(boolean z, int i, String str, String str2, boolean z2) {
        this.f10171a.mo13717w0(z, i, str, str2, z2);
    }

    @Override // p149l.v5t0
    /* JADX INFO: renamed from: x */
    public final void mo13718x(int i) {
        this.f10172b.m144554g(i);
    }

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: x0 */
    public final void mo13719x0(String str, String str2, @Nullable String str3) {
        this.f10171a.mo13719x0(str, str2, null);
    }

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: y */
    public final BinderC2073b mo13720y() {
        return this.f10171a.mo13720y();
    }

    @Override // p149l.q9t0
    /* JADX INFO: renamed from: y0 */
    public final void mo13721y0(boolean z) {
        this.f10171a.mo13721y0(z);
    }

    @Override // p149l.zat0
    /* JADX INFO: renamed from: z */
    public final void mo13722z(String str, String str2, int i) {
        this.f10171a.mo13722z(str, str2, 14);
    }

    @Override // p149l.rks0
    /* JADX INFO: renamed from: z0 */
    public final void mo13723z0(String str, JSONObject jSONObject) {
        ((zzckf) this.f10171a).mo13677b(str, jSONObject.toString());
    }

    @Override // p149l.q9t0, p149l.ebt0
    public final View zzF() {
        return this;
    }

    @Override // p149l.q9t0
    public final BinderC2073b zzL() {
        return this.f10171a.zzL();
    }

    @Override // p149l.q9t0
    public final hbt0 zzN() {
        return ((zzckf) this.f10171a).m13727B0();
    }

    @Override // p149l.q9t0, p149l.bbt0
    public final rbt0 zzO() {
        return this.f10171a.zzO();
    }

    @Override // p149l.q9t0
    public final void zzV() {
        this.f10172b.m144552e();
        this.f10171a.zzV();
    }

    @Override // p149l.rks0
    public final void zza(String str) {
        ((zzckf) this.f10171a).m13730G0(str);
    }

    @Override // p149l.q9t0
    public final boolean zzaz() {
        return this.f10171a.zzaz();
    }

    @Override // p149l.a7u0
    public final void zzbo() {
        q9t0 q9t0Var = this.f10171a;
        if (q9t0Var != null) {
            q9t0Var.zzbo();
        }
    }

    @Override // p149l.v5t0
    public final int zzf() {
        return this.f10171a.zzf();
    }

    @Override // p149l.v5t0
    public final int zzg() {
        return ((Boolean) d1s0.m109677c().m144697a(m7s0.f131968K3)).booleanValue() ? this.f10171a.getMeasuredHeight() : getMeasuredHeight();
    }

    @Override // p149l.v5t0
    public final int zzh() {
        return ((Boolean) d1s0.m109677c().m144697a(m7s0.f131968K3)).booleanValue() ? this.f10171a.getMeasuredWidth() : getMeasuredWidth();
    }

    @Override // p149l.q9t0, p149l.wat0, p149l.v5t0
    @Nullable
    public final Activity zzi() {
        return this.f10171a.zzi();
    }

    @Override // p149l.q9t0, p149l.v5t0
    public final z0r0 zzj() {
        return this.f10171a.zzj();
    }

    @Override // p149l.v5t0
    public final b8s0 zzk() {
        return this.f10171a.zzk();
    }

    @Override // p149l.q9t0, p149l.v5t0
    public final c8s0 zzm() {
        return this.f10171a.zzm();
    }

    @Override // p149l.q9t0, p149l.dbt0, p149l.v5t0
    public final zzcei zzn() {
        return this.f10171a.zzn();
    }

    @Override // p149l.v5t0
    public final k5t0 zzo() {
        return this.f10172b;
    }

    @Override // p149l.v5t0
    public final String zzr() {
        return this.f10171a.zzr();
    }

    @Override // p149l.a7u0
    public final void zzs() {
        q9t0 q9t0Var = this.f10171a;
        if (q9t0Var != null) {
            q9t0Var.zzs();
        }
    }

    @Override // p149l.v5t0
    public final void zzu() {
        this.f10171a.zzu();
    }
}
