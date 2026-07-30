package p153l;

import android.media.MediaPlayer;
import com.google.android.gms.internal.ads.zzcfp;

/* JADX INFO: loaded from: classes6.dex */
public final class qdt0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MediaPlayer f156767a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzcfp f156768b;

    public qdt0(zzcfp zzcfpVar, MediaPlayer mediaPlayer) {
        this.f156767a = mediaPlayer;
        this.f156768b = zzcfpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcfp.m13615J(this.f156768b, this.f156767a);
        zzcfp zzcfpVar = this.f156768b;
        if (zzcfpVar.f10168p != null) {
            zzcfpVar.f10168p.zzf();
        }
    }
}
