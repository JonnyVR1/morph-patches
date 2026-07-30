package p149l;

import Sudchar.Sudcase;
import Sudchar.Sudfor;
import Sudchar.Sudif;
import Sudchar.Sudint;
import Sudchar.Sudnew;
import java.net.SocketException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class apg0 {

    /* JADX INFO: renamed from: a */
    public String f71037a;

    /* JADX INFO: renamed from: b */
    public final n7g0 f71038b;

    /* JADX INFO: renamed from: c */
    public volatile boolean f71039c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f71040d;

    /* JADX INFO: renamed from: e */
    public volatile boolean f71041e;

    /* JADX INFO: renamed from: f */
    public volatile boolean f71042f;

    /* JADX INFO: renamed from: g */
    public volatile boolean f71043g;

    /* JADX INFO: renamed from: h */
    public volatile boolean f71044h;

    /* JADX INFO: renamed from: i */
    public volatile Exception f71045i;

    public apg0(n7g0 n7g0Var) {
        this.f71038b = n7g0Var;
    }

    /* JADX INFO: renamed from: a */
    public final n7g0 m98117a() {
        n7g0 n7g0Var = this.f71038b;
        if (n7g0Var != null) {
            return n7g0Var;
        }
        x9g0.m207497a();
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m98118b(Exception exc) {
        if (this.f71040d) {
            return;
        }
        if (exc instanceof Sudnew) {
            this.f71039c = true;
            this.f71045i = exc;
            return;
        }
        if (exc instanceof Sudcase) {
            this.f71041e = true;
            this.f71045i = exc;
            return;
        }
        if (exc == Sudif.f210106Suddo) {
            this.f71043g = true;
            return;
        }
        if (exc instanceof Sudint) {
            this.f71044h = true;
            this.f71045i = exc;
        } else if (exc != Sudfor.f210105Suddo) {
            this.f71042f = true;
            this.f71045i = exc;
            if (exc instanceof SocketException) {
                return;
            }
            Objects.toString(exc);
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m98119c() {
        return this.f71039c || this.f71040d || this.f71041e || this.f71042f || this.f71043g || this.f71044h;
    }
}
