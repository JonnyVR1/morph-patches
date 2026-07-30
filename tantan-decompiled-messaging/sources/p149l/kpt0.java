package p149l;

import android.content.Context;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzeih;
import com.google.android.gms.internal.ads.zzeii;

/* JADX INFO: loaded from: classes6.dex */
public final class kpt0 implements ezt0, dyt0 {

    /* JADX INFO: renamed from: a */
    public final Context f124191a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final q9t0 f124192b;

    /* JADX INFO: renamed from: c */
    public final kxv0 f124193c;

    /* JADX INFO: renamed from: d */
    public final zzcei f124194d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public b6w0 f124195e;

    /* JADX INFO: renamed from: f */
    public boolean f124196f;

    public kpt0(Context context, @Nullable q9t0 q9t0Var, kxv0 kxv0Var, zzcei zzceiVar) {
        this.f124191a = context;
        this.f124192b = q9t0Var;
        this.f124193c = kxv0Var;
        this.f124194d = zzceiVar;
    }

    /* JADX INFO: renamed from: b */
    private final synchronized void m146885b() {
        zzeii zzeiiVar;
        zzeih zzeihVar;
        try {
            if (this.f124193c.f125177U && this.f124192b != null) {
                if (vny0.m199063a().mo109953b(this.f124191a)) {
                    zzcei zzceiVar = this.f124194d;
                    String str = zzceiVar.zzb + "." + zzceiVar.zzc;
                    lyv0 lyv0Var = this.f124193c.f125179W;
                    String strM152299a = lyv0Var.m152299a();
                    if (lyv0Var.m152300b() == 1) {
                        zzeihVar = zzeih.VIDEO;
                        zzeiiVar = zzeii.DEFINED_BY_JAVASCRIPT;
                    } else {
                        kxv0 kxv0Var = this.f124193c;
                        zzeih zzeihVar2 = zzeih.HTML_DISPLAY;
                        zzeiiVar = kxv0Var.f125193f == 1 ? zzeii.ONE_PIXEL : zzeii.BEGIN_TO_RENDER;
                        zzeihVar = zzeihVar2;
                    }
                    b6w0 b6w0VarMo109954c = vny0.m199063a().mo109954c(str, this.f124192b.mo13661L(), "", "javascript", strM152299a, zzeiiVar, zzeihVar, this.f124193c.f125208m0);
                    this.f124195e = b6w0VarMo109954c;
                    Object obj = this.f124192b;
                    if (b6w0VarMo109954c != null) {
                        vny0.m199063a().mo109956e(this.f124195e, (View) obj);
                        this.f124192b.mo13671W(this.f124195e);
                        vny0.m199063a().mo109959h(this.f124195e);
                        this.f124196f = true;
                        this.f124192b.mo13674Z("onSdkLoaded", new e01());
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p149l.dyt0
    /* JADX INFO: renamed from: a */
    public final synchronized void mo95459a() {
        q9t0 q9t0Var;
        try {
            if (!this.f124196f) {
                m146885b();
            }
            if (!this.f124193c.f125177U || this.f124195e == null || (q9t0Var = this.f124192b) == null) {
                return;
            }
            q9t0Var.mo13674Z("onSdkImpression", new e01());
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p149l.ezt0
    public final synchronized void zzr() {
        if (this.f124196f) {
            return;
        }
        m146885b();
    }
}
