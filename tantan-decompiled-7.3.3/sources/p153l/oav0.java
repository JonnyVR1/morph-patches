package p153l;

import android.app.Activity;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.overlay.BinderC2096b;

/* JADX INFO: loaded from: classes6.dex */
public final class oav0 extends rbv0 {

    /* JADX INFO: renamed from: a */
    public Activity f145759a;

    /* JADX INFO: renamed from: b */
    public BinderC2096b f145760b;

    /* JADX INFO: renamed from: c */
    public String f145761c;

    /* JADX INFO: renamed from: d */
    public String f145762d;

    @Override // p153l.rbv0
    /* JADX INFO: renamed from: a */
    public final rbv0 mo166853a(Activity activity) {
        if (activity != null) {
            this.f145759a = activity;
            return this;
        }
        mnd0.m159157a("Null activity");
        return null;
    }

    @Override // p153l.rbv0
    /* JADX INFO: renamed from: b */
    public final rbv0 mo166854b(@Nullable BinderC2096b binderC2096b) {
        this.f145760b = binderC2096b;
        return this;
    }

    @Override // p153l.rbv0
    /* JADX INFO: renamed from: c */
    public final rbv0 mo166855c(@Nullable String str) {
        this.f145761c = str;
        return this;
    }

    @Override // p153l.rbv0
    /* JADX INFO: renamed from: d */
    public final rbv0 mo166856d(@Nullable String str) {
        this.f145762d = str;
        return this;
    }

    @Override // p153l.rbv0
    /* JADX INFO: renamed from: e */
    public final sbv0 mo166857e() {
        Activity activity = this.f145759a;
        if (activity != null) {
            return new qav0(activity, this.f145760b, this.f145761c, this.f145762d, null);
        }
        wtq0.m207906a("Missing required properties: activity");
        return null;
    }
}
