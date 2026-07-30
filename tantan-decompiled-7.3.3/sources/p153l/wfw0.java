package p153l;

import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzfok;

/* JADX INFO: loaded from: classes6.dex */
public final class wfw0 {

    /* JADX INFO: renamed from: a */
    public final nhw0 f188893a;

    /* JADX INFO: renamed from: b */
    public final String f188894b;

    /* JADX INFO: renamed from: c */
    public final zzfok f188895c;

    /* JADX INFO: renamed from: d */
    public final String f188896d = "Ad overlay";

    public wfw0(View view, zzfok zzfokVar, @Nullable String str) {
        this.f188893a = new nhw0(view);
        this.f188894b = view.getClass().getCanonicalName();
        this.f188895c = zzfokVar;
    }

    /* JADX INFO: renamed from: a */
    public final zzfok m206166a() {
        return this.f188895c;
    }

    /* JADX INFO: renamed from: b */
    public final nhw0 m206167b() {
        return this.f188893a;
    }

    /* JADX INFO: renamed from: c */
    public final String m206168c() {
        return this.f188896d;
    }

    /* JADX INFO: renamed from: d */
    public final String m206169d() {
        return this.f188894b;
    }
}
