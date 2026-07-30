package p149l;

import android.os.IBinder;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class iew0 extends xdw0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ IBinder f112931b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ lew0 f112932c;

    public iew0(lew0 lew0Var, IBinder iBinder) {
        this.f112931b = iBinder;
        this.f112932c = lew0Var;
    }

    @Override // p149l.xdw0
    /* JADX INFO: renamed from: a */
    public final void mo96146a() {
        this.f112932c.f127768a.f133516m = lcw0.m149370o8(this.f112931b);
        mew0.m154330q(this.f112932c.f127768a);
        this.f112932c.f127768a.f133510g = false;
        Iterator it = this.f112932c.f127768a.f133507d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f112932c.f127768a.f133507d.clear();
    }
}
