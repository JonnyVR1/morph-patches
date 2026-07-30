package p153l;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.google.android.gms.ads.internal.overlay.BinderC2096b;
import com.google.android.gms.ads.internal.util.C2098b;
import com.google.android.gms.ads.internal.zzj;

/* JADX INFO: loaded from: classes6.dex */
public final class u8y0 extends aas0 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ BinderC2096b f178081c;

    public /* synthetic */ u8y0(BinderC2096b binderC2096b, q3y0 q3y0Var) {
        this.f178081c = binderC2096b;
    }

    @Override // p153l.aas0
    /* JADX INFO: renamed from: a */
    public final void mo96666a() {
        final BitmapDrawable bitmapDrawable;
        Bitmap bitmapM95869a = bxy0.m106939w().m95869a(Integer.valueOf(this.f178081c.f9721b.zzo.zzf));
        if (bitmapM95869a != null) {
            bxy0.m106934r();
            BinderC2096b binderC2096b = this.f178081c;
            zzj zzjVar = binderC2096b.f9721b.zzo;
            boolean z = zzjVar.zzd;
            float f = zzjVar.zze;
            Activity activity = binderC2096b.f9720a;
            if (!z || f <= 0.0f || f > 25.0f) {
                bitmapDrawable = new BitmapDrawable(activity.getResources(), bitmapM95869a);
            } else {
                try {
                    Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapM95869a, bitmapM95869a.getWidth(), bitmapM95869a.getHeight(), false);
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateScaledBitmap);
                    RenderScript renderScriptCreate = RenderScript.create(activity);
                    ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
                    Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateScaledBitmap);
                    Allocation allocationCreateFromBitmap2 = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap);
                    scriptIntrinsicBlurCreate.setRadius(f);
                    scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
                    scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
                    allocationCreateFromBitmap2.copyTo(bitmapCreateBitmap);
                    bitmapDrawable = new BitmapDrawable(activity.getResources(), bitmapCreateBitmap);
                } catch (RuntimeException unused) {
                    bitmapDrawable = new BitmapDrawable(activity.getResources(), bitmapM95869a);
                }
            }
            C2098b.f9751l.post(new Runnable() { // from class: l.myx0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f139444a.f178081c.f9720a.getWindow().setBackgroundDrawable(bitmapDrawable);
                }
            });
        }
    }
}
