package p153l;

import com.google.android.gms.internal.measurement.zzcn;
import com.google.android.gms.internal.measurement.zzco;

/* JADX INFO: loaded from: classes6.dex */
public final class pat0 extends skt0 {

    /* JADX INFO: renamed from: a */
    public String f151327a;

    /* JADX INFO: renamed from: b */
    public zzco f151328b;

    /* JADX INFO: renamed from: c */
    public zzcn f151329c;

    /* JADX INFO: renamed from: d */
    public byte f151330d;

    @Override // p153l.skt0
    /* JADX INFO: renamed from: a */
    public final skt0 mo171462a(zzcn zzcnVar) {
        if (zzcnVar != null) {
            this.f151329c = zzcnVar;
            return this;
        }
        mnd0.m159157a("Null filePurpose");
        return null;
    }

    @Override // p153l.skt0
    /* JADX INFO: renamed from: b */
    public final skt0 mo171463b(zzco zzcoVar) {
        if (zzcoVar != null) {
            this.f151328b = zzcoVar;
            return this;
        }
        mnd0.m159157a("Null fileChecks");
        return null;
    }

    @Override // p153l.skt0
    /* JADX INFO: renamed from: c */
    public final skt0 mo171464c(boolean z) {
        this.f151330d = (byte) (this.f151330d | 1);
        return this;
    }

    @Override // p153l.skt0
    /* JADX INFO: renamed from: d */
    public final bmt0 mo171465d() {
        if (this.f151330d == 1 && this.f151327a != null && this.f151328b != null && this.f151329c != null) {
            return new xbt0(this.f151327a, this.f151328b, this.f151329c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f151327a == null) {
            sb.append(" fileOwner");
        }
        if ((1 & this.f151330d) == 0) {
            sb.append(" hasDifferentDmaOwner");
        }
        if (this.f151328b == null) {
            sb.append(" fileChecks");
        }
        if (this.f151329c == null) {
            sb.append(" filePurpose");
        }
        wtq0.m207906a("Missing required properties:".concat(String.valueOf(sb)));
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final skt0 m171466e(String str) {
        this.f151327a = str;
        return this;
    }
}
