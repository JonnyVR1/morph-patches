package p149l;

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
import com.p046p1.mobile.putong.live.base.data.BLivePkInviteSource;
import java.util.Map;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes6.dex */
public final class rly0 extends bos0 {

    /* JADX INFO: renamed from: a */
    public final zzcei f160039a;

    /* JADX INFO: renamed from: b */
    public final zzq f160040b;

    /* JADX INFO: renamed from: c */
    public final Future f160041c = i3t0.f111372a.mo122102R(new pby0(this));

    /* JADX INFO: renamed from: d */
    public final Context f160042d;

    /* JADX INFO: renamed from: e */
    public final zjy0 f160043e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public WebView f160044f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public r8s0 f160045g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public ptr0 f160046h;

    /* JADX INFO: renamed from: i */
    public AsyncTask f160047i;

    public rly0(Context context, zzq zzqVar, String str, zzcei zzceiVar) {
        this.f160042d = context;
        this.f160039a = zzceiVar;
        this.f160040b = zzqVar;
        this.f160044f = new WebView(context);
        this.f160043e = new zjy0(context, str);
        m179945p8(0);
        this.f160044f.setVerticalScrollBarEnabled(false);
        this.f160044f.getSettings().setJavaScriptEnabled(true);
        this.f160044f.setWebViewClient(new x4y0(this));
        this.f160044f.setOnTouchListener(new i8y0(this));
    }

    /* JADX INFO: renamed from: v8 */
    public static /* bridge */ /* synthetic */ String m179940v8(rly0 rly0Var, String str) {
        if (rly0Var.f160046h == null) {
            return str;
        }
        Uri uriM171376a = Uri.parse(str);
        try {
            uriM171376a = rly0Var.f160046h.m171376a(uriM171376a, rly0Var.f160042d, null, null);
        } catch (zzavj e) {
            x2t0.m206870h("Unable to process ad data", e);
        }
        return uriM171376a.toString();
    }

    /* JADX INFO: renamed from: y8 */
    public static /* bridge */ /* synthetic */ void m179943y8(rly0 rly0Var, String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        rly0Var.f160042d.startActivity(intent);
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: A5 */
    public final void mo137574A5(q1s0 q1s0Var) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: C5 */
    public final void mo137575C5(n5s0 n5s0Var) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: E6 */
    public final void mo137576E6(gts0 gts0Var, String str) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: G */
    public final void mo137577G() throws RemoteException {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: G6 */
    public final void mo137578G6(cus0 cus0Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: H7 */
    public final void mo137580H7(s8s0 s8s0Var) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: I1 */
    public final void mo137581I1(zzw zzwVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: J */
    public final void mo137583J() throws RemoteException {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: L0 */
    public final void mo137584L0(zzdu zzduVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: R3 */
    public final void mo137586R3(zzq zzqVar) throws RemoteException {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: S4 */
    public final void mo137587S4() throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: X6 */
    public final void mo137588X6(String str) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: Y3 */
    public final void mo137589Y3(boolean z) {
        throw new IllegalStateException("Unused method");
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: a */
    public final String m179944a() {
        String strM219154b = this.f160043e.m219154b();
        if (true == TextUtils.isEmpty(strM219154b)) {
            strM219154b = "www.google.com";
        }
        return "https://" + strM219154b + ((String) g9s0.f101588d.m115379e());
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: e2 */
    public final void mo137590e2(zzfk zzfkVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: f2 */
    public final boolean mo137591f2(zzl zzlVar) throws RemoteException {
        Preconditions.checkNotNull(this.f160044f, "This Search Ad has already been torn down");
        this.f160043e.m219158f(zzlVar, this.f160039a);
        this.f160047i = new biy0(this, null).execute(new Void[0]);
        return true;
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: f7 */
    public final void mo137592f7(t3t0 t3t0Var) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: g */
    public final void mo137593g() throws RemoteException {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.f160047i.cancel(true);
        this.f160041c.cancel(true);
        this.f160044f.destroy();
        this.f160044f = null;
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: i8 */
    public final void mo137594i8(uxs0 uxs0Var) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: l1 */
    public final void mo137595l1(sys0 sys0Var) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: n0 */
    public final boolean mo137596n0() throws RemoteException {
        return false;
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: p0 */
    public final boolean mo137597p0() throws RemoteException {
        return false;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: p8 */
    public final void m179945p8(int i) {
        if (this.f160044f == null) {
            return;
        }
        this.f160044f.setLayoutParams(new ViewGroup.LayoutParams(-1, i));
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: r6 */
    public final void mo137598r6(String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: t */
    public final void mo137600t() throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: v3 */
    public final void mo137601v3(dts0 dts0Var) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: x2 */
    public final void mo137603x2(r8s0 r8s0Var) throws RemoteException {
        this.f160045g = r8s0Var;
    }

    @VisibleForTesting
    public final int zzb(String str) {
        String queryParameter = Uri.parse(str).getQueryParameter("height");
        if (TextUtils.isEmpty(queryParameter)) {
            return 0;
        }
        try {
            exr0.m118703b();
            return i2t0.m134096z(this.f160042d, Integer.parseInt(queryParameter));
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    @Override // p149l.ips0
    public final Bundle zzd() {
        throw new IllegalStateException("Unused method");
    }

    @Override // p149l.ips0
    public final zzq zzg() throws RemoteException {
        return this.f160040b;
    }

    @Override // p149l.ips0
    public final r8s0 zzi() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    @Override // p149l.ips0
    public final sys0 zzj() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    @Override // p149l.ips0
    @Nullable
    public final ncu0 zzk() {
        return null;
    }

    @Override // p149l.ips0
    @Nullable
    public final fgu0 zzl() {
        return null;
    }

    @Override // p149l.ips0
    public final uyl zzn() throws RemoteException {
        Preconditions.checkMainThread("getAdFrame must be called on the main UI thread.");
        return s050.m181848Y2(this.f160044f);
    }

    @VisibleForTesting
    public final String zzp() {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https://").appendEncodedPath((String) g9s0.f101588d.m115379e());
        builder.appendQueryParameter(BLivePkInviteSource.query, this.f160043e.m219156d());
        builder.appendQueryParameter("pubId", this.f160043e.m219155c());
        builder.appendQueryParameter("mappver", this.f160043e.m219153a());
        Map mapM219157e = this.f160043e.m219157e();
        for (String str : mapM219157e.keySet()) {
            builder.appendQueryParameter(str, (String) mapM219157e.get(str));
        }
        Uri uriBuild = builder.build();
        ptr0 ptr0Var = this.f160046h;
        if (ptr0Var != null) {
            try {
                uriBuild = ptr0Var.m171377b(uriBuild, this.f160042d);
            } catch (zzavj e) {
                x2t0.m206870h("Unable to process ad data", e);
            }
        }
        return m179944a() + "#" + uriBuild.getEncodedQuery();
    }

    @Override // p149l.ips0
    public final String zzr() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    @Override // p149l.ips0
    @Nullable
    public final String zzs() throws RemoteException {
        return null;
    }

    @Override // p149l.ips0
    @Nullable
    public final String zzt() throws RemoteException {
        return null;
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: H3 */
    public final void mo137579H3(s3u0 s3u0Var) {
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: I3 */
    public final void mo137582I3(s7t0 s7t0Var) {
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: P7 */
    public final void mo137585P7(uyl uylVar) {
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: s4 */
    public final void mo137599s4(boolean z) throws RemoteException {
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: w7 */
    public final void mo137602w7(zzl zzlVar, ocs0 ocs0Var) {
    }
}
