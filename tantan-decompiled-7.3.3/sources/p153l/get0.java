package p153l;

import com.google.android.gms.internal.ads.zzcfz;

/* JADX INFO: loaded from: classes6.dex */
public final class get0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f103855a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzcfz f103856b;

    public get0(zzcfz zzcfzVar, boolean z) {
        this.f103855a = z;
        this.f103856b = zzcfzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103856b.m13662m("windowVisibilityChanged", "isVisible", String.valueOf(this.f103855a));
    }
}
