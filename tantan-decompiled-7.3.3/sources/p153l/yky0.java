package p153l;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.google.android.gms.ads.internal.util.C2098b;

/* JADX INFO: loaded from: classes6.dex */
public final class yky0 implements zhs0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ bis0 f200503a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f200504b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Uri f200505c;

    public yky0(C2098b c2098b, bis0 bis0Var, Context context, Uri uri) {
        this.f200503a = bis0Var;
        this.f200504b = context;
        this.f200505c = uri;
    }

    @Override // p153l.zhs0
    public final void zza() {
        vzb vzbVarM204046a = new vzb.C20961a(this.f200503a.m104510a()).m204046a();
        vzbVarM204046a.f186459a.setPackage(lqx0.m155512a(this.f200504b));
        vzbVarM204046a.m204045a(this.f200504b, this.f200505c);
        this.f200503a.m104515f((Activity) this.f200504b);
    }
}
