package p153l;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.client.zzdu;
import com.google.android.gms.ads.internal.client.zzfk;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzavj;
import com.google.android.gms.internal.ads.zzcei;
import com.p051p1.mobile.putong.live.base.data.BLivePkInviteSource;
import java.util.Map;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes6.dex */
public final class xuy0 extends hxs0 {

    /* JADX INFO: renamed from: a */
    public final zzcei f196334a;

    /* JADX INFO: renamed from: b */
    public final zzq f196335b;

    /* JADX INFO: renamed from: c */
    public final Future f196336c = oct0.f146733a.mo155969R(new vky0(this));

    /* JADX INFO: renamed from: d */
    public final Context f196337d;

    /* JADX INFO: renamed from: e */
    public final fty0 f196338e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public WebView f196339f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public xhs0 f196340g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public v2s0 f196341h;

    /* JADX INFO: renamed from: i */
    public AsyncTask f196342i;

    public xuy0(Context context, zzq zzqVar, String str, zzcei zzceiVar) {
        this.f196337d = context;
        this.f196334a = zzceiVar;
        this.f196335b = zzqVar;
        this.f196339f = new WebView(context);
        this.f196338e = new fty0(context, str);
        m213208p8(0);
        this.f196339f.setVerticalScrollBarEnabled(false);
        this.f196339f.getSettings().setJavaScriptEnabled(true);
        this.f196339f.setWebViewClient(new dey0(this));
        this.f196339f.setOnTouchListener(new ohy0(this));
    }

    /* JADX INFO: renamed from: v8 */
    public static /* bridge */ /* synthetic */ String m213203v8(xuy0 xuy0Var, String str) {
        if (xuy0Var.f196341h == null) {
            return str;
        }
        Uri uriM199145a = Uri.parse(str);
        try {
            uriM199145a = xuy0Var.f196341h.m199145a(uriM199145a, xuy0Var.f196337d, null, null);
        } catch (zzavj e) {
            dct0.m115299h("Unable to process ad data", e);
        }
        return uriM199145a.toString();
    }

    /* JADX INFO: renamed from: y8 */
    public static /* bridge */ /* synthetic */ void m213206y8(xuy0 xuy0Var, String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        xuy0Var.f196337d.startActivity(intent);
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: A5 */
    public final void mo113742A5(was0 was0Var) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: C5 */
    public final void mo113743C5(tes0 tes0Var) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: E6 */
    public final void mo113744E6(m2t0 m2t0Var, String str) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: G */
    public final void mo113745G() throws RemoteException {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: G6 */
    public final void mo113746G6(i3t0 i3t0Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: H7 */
    public final void mo113748H7(yhs0 yhs0Var) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: I1 */
    public final void mo113749I1(zzw zzwVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: J */
    public final void mo113751J() throws RemoteException {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: L0 */
    public final void mo113752L0(zzdu zzduVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: R3 */
    public final void mo113757R3(zzq zzqVar) throws RemoteException {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: S4 */
    public final void mo113758S4() throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: X6 */
    public final void mo113759X6(String str) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: Y3 */
    public final void mo113760Y3(boolean z) {
        throw new IllegalStateException("Unused method");
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: a */
    public final String m213207a() {
        String strM127402b = this.f196338e.m127402b();
        if (true == TextUtils.isEmpty(strM127402b)) {
            strM127402b = "www.google.com";
        }
        return "https://" + strM127402b + ((String) mis0.f137017d.m149974e());
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: e2 */
    public final void mo113761e2(zzfk zzfkVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: f2 */
    public final boolean mo113762f2(zzl zzlVar) throws RemoteException {
        Preconditions.checkNotNull(this.f196339f, "This Search Ad has already been torn down");
        this.f196338e.m127406f(zzlVar, this.f196334a);
        this.f196342i = new hry0(this, null).execute(new Void[0]);
        return true;
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: f7 */
    public final void mo113763f7(zct0 zct0Var) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: g */
    public final void mo113764g() throws RemoteException {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.f196342i.cancel(true);
        this.f196336c.cancel(true);
        this.f196339f.destroy();
        this.f196339f = null;
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: i8 */
    public final void mo113766i8(a7t0 a7t0Var) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: l1 */
    public final void mo113767l1(y7t0 y7t0Var) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: n0 */
    public final boolean mo113770n0() throws RemoteException {
        return false;
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: p0 */
    public final boolean mo113771p0() throws RemoteException {
        return false;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: p8 */
    public final void m213208p8(int i) {
        if (this.f196339f == null) {
            return;
        }
        this.f196339f.setLayoutParams(new ViewGroup.LayoutParams(-1, i));
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: r6 */
    public final void mo113772r6(String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: t */
    public final void mo113775t() throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: v3 */
    public final void mo113776v3(j2t0 j2t0Var) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: x2 */
    public final void mo113778x2(xhs0 xhs0Var) throws RemoteException {
        this.f196340g = xhs0Var;
    }

    @VisibleForTesting
    public final int zzb(String str) {
        String queryParameter = Uri.parse(str).getQueryParameter("height");
        if (TextUtils.isEmpty(queryParameter)) {
            return 0;
        }
        try {
            k6s0.m148569b();
            return obt0.m167049z(this.f196337d, Integer.parseInt(queryParameter));
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    @Override // p153l.oys0
    public final Bundle zzd() {
        throw new IllegalStateException("Unused method");
    }

    @Override // p153l.oys0
    public final zzq zzg() throws RemoteException {
        return this.f196335b;
    }

    @Override // p153l.oys0
    public final xhs0 zzi() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    @Override // p153l.oys0
    public final y7t0 zzj() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    @Override // p153l.oys0
    @Nullable
    public final tlu0 zzk() {
        return null;
    }

    @Override // p153l.oys0
    @Nullable
    public final lpu0 zzl() {
        return null;
    }

    @Override // p153l.oys0
    public final p1m zzn() throws RemoteException {
        Preconditions.checkMainThread("getAdFrame must be called on the main UI thread.");
        return h950.m134038Y2(this.f196339f);
    }

    @VisibleForTesting
    public final String zzp() {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https://").appendEncodedPath((String) mis0.f137017d.m149974e());
        builder.appendQueryParameter(BLivePkInviteSource.query, this.f196338e.m127404d());
        builder.appendQueryParameter("pubId", this.f196338e.m127403c());
        builder.appendQueryParameter("mappver", this.f196338e.m127401a());
        Map mapM127405e = this.f196338e.m127405e();
        for (String str : mapM127405e.keySet()) {
            builder.appendQueryParameter(str, (String) mapM127405e.get(str));
        }
        Uri uriBuild = builder.build();
        v2s0 v2s0Var = this.f196341h;
        if (v2s0Var != null) {
            try {
                uriBuild = v2s0Var.m199146b(uriBuild, this.f196337d);
            } catch (zzavj e) {
                dct0.m115299h("Unable to process ad data", e);
            }
        }
        return m213207a() + "#" + uriBuild.getEncodedQuery();
    }

    @Override // p153l.oys0
    public final String zzr() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    @Override // p153l.oys0
    @Nullable
    public final String zzs() throws RemoteException {
        return null;
    }

    @Override // p153l.oys0
    @Nullable
    public final String zzt() throws RemoteException {
        return null;
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: H3 */
    public final void mo113747H3(ycu0 ycu0Var) {
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: I3 */
    public final void mo113750I3(ygt0 ygt0Var) {
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: P7 */
    public final void mo113756P7(p1m p1mVar) {
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: s4 */
    public final void mo113774s4(boolean z) throws RemoteException {
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: w7 */
    public final void mo113777w7(zzl zzlVar, uls0 uls0Var) {
    }
}
