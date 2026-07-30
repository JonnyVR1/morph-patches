package p149l;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.google.android.gms.ads.internal.overlay.BinderC2073b;
import com.google.android.gms.ads.internal.util.C2075b;
import com.google.android.gms.ads.internal.zzj;

/* JADX INFO: loaded from: classes6.dex */
public final class ozx0 extends u0s0 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ BinderC2073b f146516c;

    public /* synthetic */ ozx0(BinderC2073b binderC2073b, kux0 kux0Var) {
        this.f146516c = binderC2073b;
    }

    @Override // p149l.u0s0
    /* JADX INFO: renamed from: a */
    public final void mo123689a() {
        final BitmapDrawable bitmapDrawable;
        Bitmap bitmapM195308a = vny0.m199085w().m195308a(Integer.valueOf(this.f146516c.f9684b.zzo.zzf));
        if (bitmapM195308a != null) {
            vny0.m199080r();
            BinderC2073b binderC2073b = this.f146516c;
            zzj zzjVar = binderC2073b.f9684b.zzo;
            boolean z = zzjVar.zzd;
            float f = zzjVar.zze;
            Activity activity = binderC2073b.f9683a;
            if (!z || f <= 0.0f || f > 25.0f) {
                bitmapDrawable = new BitmapDrawable(activity.getResources(), bitmapM195308a);
            } else {
                try {
                    Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapM195308a, bitmapM195308a.getWidth(), bitmapM195308a.getHeight(), false);
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
                    bitmapDrawable = new BitmapDrawable(activity.getResources(), bitmapM195308a);
                }
            }
            C2075b.f9714l.post(new Runnable() { // from class: l.gpx0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f103862a.f146516c.f9683a.getWindow().setBackgroundDrawable(bitmapDrawable);
                }
            });
        }
    }
}
