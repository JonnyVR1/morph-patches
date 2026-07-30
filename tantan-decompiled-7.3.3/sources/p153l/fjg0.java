package p153l;

import android.net.Uri;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class fjg0 {

    /* JADX INFO: renamed from: a */
    public boolean f99326a;

    /* JADX INFO: renamed from: b */
    public boolean f99327b;

    /* JADX INFO: renamed from: c */
    public boolean f99328c;

    /* JADX INFO: renamed from: d */
    public boolean f99329d;

    /* JADX INFO: renamed from: e */
    public final aug0 f99330e;

    /* JADX INFO: renamed from: f */
    public final bog0 f99331f;

    /* JADX INFO: renamed from: g */
    public final long f99332g;

    public fjg0(aug0 aug0Var, bog0 bog0Var, long j) {
        this.f99330e = aug0Var;
        this.f99331f = bog0Var;
        this.f99332g = j;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0097 A[EDGE_INSN: B:37:0x0097->B:40:0x009d BREAK  A[LOOP:0: B:34:0x0085->B:38:0x0099]] */
    /* JADX INFO: renamed from: a */
    public final void m125804a() {
        File fileM100397j;
        boolean z;
        Uri uri = this.f99330e.f73495d;
        this.f99327b = !uri.getScheme().equals("content") ? (fileM100397j = this.f99330e.m100397j()) == null || !fileM100397j.exists() : ytg0.m217309a(uri) <= 0;
        int size = this.f99331f.f77680g.size();
        if (size > 0) {
            bog0 bog0Var = this.f99331f;
            if (!bog0Var.f77682i && bog0Var.m105680d() != null) {
                if (!this.f99331f.m105680d().equals(this.f99330e.m100397j()) || this.f99331f.m105680d().length() > this.f99331f.m105679c() || (this.f99332g > 0 && this.f99331f.m105679c() != this.f99332g)) {
                    z = false;
                    break;
                }
                int i = 0;
                while (true) {
                    if (i >= size) {
                        z = true;
                        break;
                    } else {
                        if (((akg0) this.f99331f.f77680g.get(i)).f72004b <= 0) {
                            z = false;
                            break;
                        }
                        i++;
                    }
                }
            } else {
                z = false;
                break;
            }
        } else {
            z = false;
            break;
        }
        this.f99328c = z;
        zqg0 zqg0Var = jwg0.m147162a().f122923e;
        this.f99329d = true;
        this.f99326a = (this.f99328c && this.f99327b) ? false : true;
    }

    public final String toString() {
        return "fileExist[" + this.f99327b + "] infoRight[" + this.f99328c + "] outputStreamSupport[" + this.f99329d + "] " + super.toString();
    }
}
