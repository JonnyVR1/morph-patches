package p149l;

import android.net.Uri;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class xag0 {

    /* JADX INFO: renamed from: a */
    public boolean f191737a;

    /* JADX INFO: renamed from: b */
    public boolean f191738b;

    /* JADX INFO: renamed from: c */
    public boolean f191739c;

    /* JADX INFO: renamed from: d */
    public boolean f191740d;

    /* JADX INFO: renamed from: e */
    public final slg0 f191741e;

    /* JADX INFO: renamed from: f */
    public final tfg0 f191742f;

    /* JADX INFO: renamed from: g */
    public final long f191743g;

    public xag0(slg0 slg0Var, tfg0 tfg0Var, long j) {
        this.f191741e = slg0Var;
        this.f191742f = tfg0Var;
        this.f191743g = j;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0097 A[EDGE_INSN: B:37:0x0097->B:40:0x009d BREAK  A[LOOP:0: B:34:0x0085->B:38:0x0099]] */
    /* JADX INFO: renamed from: a */
    public final void m207572a() {
        File fileM184802j;
        boolean z;
        Uri uri = this.f191741e.f165192d;
        this.f191738b = !uri.getScheme().equals("content") ? (fileM184802j = this.f191741e.m184802j()) == null || !fileM184802j.exists() : qlg0.m175478a(uri) <= 0;
        int size = this.f191742f.f169981g.size();
        if (size > 0) {
            tfg0 tfg0Var = this.f191742f;
            if (!tfg0Var.f169983i && tfg0Var.m188708d() != null) {
                if (!this.f191742f.m188708d().equals(this.f191741e.m184802j()) || this.f191742f.m188708d().length() > this.f191742f.m188707c() || (this.f191743g > 0 && this.f191742f.m188707c() != this.f191743g)) {
                    z = false;
                    break;
                }
                int i = 0;
                while (true) {
                    if (i >= size) {
                        z = true;
                        break;
                    } else {
                        if (((sbg0) this.f191742f.f169981g.get(i)).f163535b <= 0) {
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
        this.f191739c = z;
        rig0 rig0Var = bog0.m102944a().f76519e;
        this.f191740d = true;
        this.f191737a = (this.f191739c && this.f191738b) ? false : true;
    }

    public final String toString() {
        return "fileExist[" + this.f191738b + "] infoRight[" + this.f191739c + "] outputStreamSupport[" + this.f191740d + "] " + super.toString();
    }
}
