package p149l;

import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzfok;

/* JADX INFO: loaded from: classes6.dex */
public final class q6w0 {

    /* JADX INFO: renamed from: a */
    public final h8w0 f152965a;

    /* JADX INFO: renamed from: b */
    public final String f152966b;

    /* JADX INFO: renamed from: c */
    public final zzfok f152967c;

    /* JADX INFO: renamed from: d */
    public final String f152968d = "Ad overlay";

    public q6w0(View view, zzfok zzfokVar, @Nullable String str) {
        this.f152965a = new h8w0(view);
        this.f152966b = view.getClass().getCanonicalName();
        this.f152967c = zzfokVar;
    }

    /* JADX INFO: renamed from: a */
    public final zzfok m173175a() {
        return this.f152967c;
    }

    /* JADX INFO: renamed from: b */
    public final h8w0 m173176b() {
        return this.f152965a;
    }

    /* JADX INFO: renamed from: c */
    public final String m173177c() {
        return this.f152968d;
    }

    /* JADX INFO: renamed from: d */
    public final String m173178d() {
        return this.f152966b;
    }
}
