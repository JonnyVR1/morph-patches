package p153l;

import android.content.Context;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzeih;
import com.google.android.gms.internal.ads.zzeii;

/* JADX INFO: loaded from: classes6.dex */
public final class qyt0 implements k8u0, j7u0 {

    /* JADX INFO: renamed from: a */
    public final Context f160182a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final wit0 f160183b;

    /* JADX INFO: renamed from: c */
    public final q6w0 f160184c;

    /* JADX INFO: renamed from: d */
    public final zzcei f160185d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public hfw0 f160186e;

    /* JADX INFO: renamed from: f */
    public boolean f160187f;

    public qyt0(Context context, @Nullable wit0 wit0Var, q6w0 q6w0Var, zzcei zzceiVar) {
        this.f160182a = context;
        this.f160183b = wit0Var;
        this.f160184c = q6w0Var;
        this.f160185d = zzceiVar;
    }

    /* JADX INFO: renamed from: b */
    private final synchronized void m178732b() {
        zzeii zzeiiVar;
        zzeih zzeihVar;
        try {
            if (this.f160184c.f155867U && this.f160183b != null) {
                if (bxy0.m106917a().mo144388b(this.f160182a)) {
                    zzcei zzceiVar = this.f160185d;
                    String str = zzceiVar.zzb + "." + zzceiVar.zzc;
                    r7w0 r7w0Var = this.f160184c.f155869W;
                    String strM180165a = r7w0Var.m180165a();
                    if (r7w0Var.m180166b() == 1) {
                        zzeihVar = zzeih.VIDEO;
                        zzeiiVar = zzeii.DEFINED_BY_JAVASCRIPT;
                    } else {
                        q6w0 q6w0Var = this.f160184c;
                        zzeih zzeihVar2 = zzeih.HTML_DISPLAY;
                        zzeiiVar = q6w0Var.f155883f == 1 ? zzeii.ONE_PIXEL : zzeii.BEGIN_TO_RENDER;
                        zzeihVar = zzeihVar2;
                    }
                    hfw0 hfw0VarMo144389c = bxy0.m106917a().mo144389c(str, this.f160183b.mo13715L(), "", "javascript", strM180165a, zzeiiVar, zzeihVar, this.f160184c.f155898m0);
                    this.f160186e = hfw0VarMo144389c;
                    Object obj = this.f160183b;
                    if (hfw0VarMo144389c != null) {
                        bxy0.m106917a().mo144391e(this.f160186e, (View) obj);
                        this.f160183b.mo13725W(this.f160186e);
                        bxy0.m106917a().mo144394h(this.f160186e);
                        this.f160187f = true;
                        this.f160183b.mo13728Z("onSdkLoaded", new l01());
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p153l.j7u0
    /* JADX INFO: renamed from: a */
    public final synchronized void mo106809a() {
        wit0 wit0Var;
        try {
            if (!this.f160187f) {
                m178732b();
            }
            if (!this.f160184c.f155867U || this.f160186e == null || (wit0Var = this.f160183b) == null) {
                return;
            }
            wit0Var.mo13728Z("onSdkImpression", new l01());
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p153l.k8u0
    public final synchronized void zzr() {
        if (this.f160187f) {
            return;
        }
        m178732b();
    }
}
