package p149l;

import android.media.MediaPlayer;
import com.google.android.gms.internal.ads.zzcfp;

/* JADX INFO: loaded from: classes6.dex */
public final class k4t0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MediaPlayer f121125a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzcfp f121126b;

    public k4t0(zzcfp zzcfpVar, MediaPlayer mediaPlayer) {
        this.f121125a = mediaPlayer;
        this.f121126b = zzcfpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcfp.m13561J(this.f121126b, this.f121125a);
        zzcfp zzcfpVar = this.f121126b;
        if (zzcfpVar.f10131p != null) {
            zzcfpVar.f10131p.zzf();
        }
    }
}
