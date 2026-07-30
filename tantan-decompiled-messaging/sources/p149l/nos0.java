package p149l;

import android.location.Location;
import androidx.annotation.Nullable;
import java.util.Date;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class nos0 implements xyx {

    /* JADX INFO: renamed from: a */
    public final Date f139866a;

    /* JADX INFO: renamed from: b */
    public final int f139867b;

    /* JADX INFO: renamed from: c */
    public final Set f139868c;

    /* JADX INFO: renamed from: d */
    public final boolean f139869d;

    /* JADX INFO: renamed from: e */
    public final Location f139870e;

    /* JADX INFO: renamed from: f */
    public final int f139871f;

    /* JADX INFO: renamed from: g */
    public final boolean f139872g;

    /* JADX INFO: renamed from: h */
    public final String f139873h;

    public nos0(@Nullable Date date, int i, @Nullable Set set, @Nullable Location location, boolean z, int i2, boolean z2, int i3, String str) {
        this.f139866a = date;
        this.f139867b = i;
        this.f139868c = set;
        this.f139870e = location;
        this.f139869d = z;
        this.f139871f = i2;
        this.f139872g = z2;
        this.f139873h = str;
    }

    @Override // p149l.xyx
    /* JADX INFO: renamed from: a */
    public final int mo160418a() {
        return this.f139871f;
    }

    @Override // p149l.xyx
    @Deprecated
    /* JADX INFO: renamed from: b */
    public final boolean mo160419b() {
        return this.f139872g;
    }

    @Override // p149l.xyx
    /* JADX INFO: renamed from: c */
    public final Set<String> mo160420c() {
        return this.f139868c;
    }

    @Override // p149l.xyx
    /* JADX INFO: renamed from: e */
    public final boolean mo160421e() {
        return this.f139869d;
    }
}
