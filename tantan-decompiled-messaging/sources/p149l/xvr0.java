package p149l;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes6.dex */
public final class xvr0 extends rwr0 {

    /* JADX INFO: renamed from: i */
    public final wur0 f194666i;

    public xvr0(vur0 vur0Var, String str, String str2, zpr0 zpr0Var, int i, int i2, wur0 wur0Var) {
        super(vur0Var, "Srq4/7DDafVhhxKPQvFzGwPCcbAxjsRhBUoTZMyZ8i1elMwCHCPiECib9I+dpg+U", "+ExOXtPxYV6dYowx9W8QaGOBr19dRESYWAuzCGJGeu8=", zpr0Var, i, 85);
        this.f194666i = wur0Var;
    }

    @Override // p149l.rwr0
    /* JADX INFO: renamed from: a */
    public final void mo99305a() throws IllegalAccessException, InvocationTargetException {
        long[] jArr = (long[]) this.f161372f.invoke(null, Long.valueOf(this.f194666i.m205673d()), Long.valueOf(this.f194666i.m205677h()), Long.valueOf(this.f194666i.m205671b()), Long.valueOf(this.f194666i.m205675f()));
        synchronized (this.f161371e) {
            this.f161371e.m219793w0(jArr[0]);
            this.f161371e.m219791v0(jArr[1]);
        }
    }
}
