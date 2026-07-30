package p153l;

import Sudchar.Sudcase;
import Sudchar.Sudfor;
import Sudchar.Sudif;
import Sudchar.Sudint;
import Sudchar.Sudnew;
import java.net.SocketException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class ixg0 {

    /* JADX INFO: renamed from: a */
    public String f117399a;

    /* JADX INFO: renamed from: b */
    public final vfg0 f117400b;

    /* JADX INFO: renamed from: c */
    public volatile boolean f117401c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f117402d;

    /* JADX INFO: renamed from: e */
    public volatile boolean f117403e;

    /* JADX INFO: renamed from: f */
    public volatile boolean f117404f;

    /* JADX INFO: renamed from: g */
    public volatile boolean f117405g;

    /* JADX INFO: renamed from: h */
    public volatile boolean f117406h;

    /* JADX INFO: renamed from: i */
    public volatile Exception f117407i;

    public ixg0(vfg0 vfg0Var) {
        this.f117400b = vfg0Var;
    }

    /* JADX INFO: renamed from: a */
    public final vfg0 m142518a() {
        vfg0 vfg0Var = this.f117400b;
        if (vfg0Var != null) {
            return vfg0Var;
        }
        fig0.m125680a();
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m142519b(Exception exc) {
        if (this.f117402d) {
            return;
        }
        if (exc instanceof Sudnew) {
            this.f117401c = true;
            this.f117407i = exc;
            return;
        }
        if (exc instanceof Sudcase) {
            this.f117403e = true;
            this.f117407i = exc;
            return;
        }
        if (exc == Sudif.f211028Suddo) {
            this.f117405g = true;
            return;
        }
        if (exc instanceof Sudint) {
            this.f117406h = true;
            this.f117407i = exc;
        } else if (exc != Sudfor.f211027Suddo) {
            this.f117404f = true;
            this.f117407i = exc;
            if (exc instanceof SocketException) {
                return;
            }
            Objects.toString(exc);
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m142520c() {
        return this.f117401c || this.f117402d || this.f117403e || this.f117404f || this.f117405g || this.f117406h;
    }
}
