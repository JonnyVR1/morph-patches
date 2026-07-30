package p153l;

import android.location.Location;
import androidx.annotation.Nullable;
import java.util.Date;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class txs0 implements u7y {

    /* JADX INFO: renamed from: a */
    public final Date f176595a;

    /* JADX INFO: renamed from: b */
    public final int f176596b;

    /* JADX INFO: renamed from: c */
    public final Set f176597c;

    /* JADX INFO: renamed from: d */
    public final boolean f176598d;

    /* JADX INFO: renamed from: e */
    public final Location f176599e;

    /* JADX INFO: renamed from: f */
    public final int f176600f;

    /* JADX INFO: renamed from: g */
    public final boolean f176601g;

    /* JADX INFO: renamed from: h */
    public final String f176602h;

    public txs0(@Nullable Date date, int i, @Nullable Set set, @Nullable Location location, boolean z, int i2, boolean z2, int i3, String str) {
        this.f176595a = date;
        this.f176596b = i;
        this.f176597c = set;
        this.f176599e = location;
        this.f176598d = z;
        this.f176600f = i2;
        this.f176601g = z2;
        this.f176602h = str;
    }

    @Override // p153l.u7y
    /* JADX INFO: renamed from: a */
    public final int mo123242a() {
        return this.f176600f;
    }

    @Override // p153l.u7y
    @Deprecated
    /* JADX INFO: renamed from: b */
    public final boolean mo123243b() {
        return this.f176601g;
    }

    @Override // p153l.u7y
    /* JADX INFO: renamed from: c */
    public final Set<String> mo123244c() {
        return this.f176597c;
    }

    @Override // p153l.u7y
    /* JADX INFO: renamed from: e */
    public final boolean mo123246e() {
        return this.f176598d;
    }
}
