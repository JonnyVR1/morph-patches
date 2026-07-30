package p149l;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class hwr0 extends rwr0 {

    /* JADX INFO: renamed from: i */
    public List f109782i;

    /* JADX INFO: renamed from: j */
    public final Context f109783j;

    public hwr0(vur0 vur0Var, String str, String str2, zpr0 zpr0Var, int i, int i2, Context context) {
        super(vur0Var, "0gWjYXznHW/Eye6gdpKNKYjX/XLpx1vdgxUIuTN4hh6FwE+EupqjErYFsUwwKenZ", "tk45mDotIpTZidmNYxxiIBsjVftw/e0h3Unlwpf2Me4=", zpr0Var, i, 31);
        this.f109782i = null;
        this.f109783j = context;
    }

    @Override // p149l.rwr0
    /* JADX INFO: renamed from: a */
    public final void mo99305a() throws IllegalAccessException, InvocationTargetException {
        this.f161371e.m219754Q(-1L);
        this.f161371e.m219750M(-1L);
        Context contextM200101b = this.f109783j;
        if (contextM200101b == null) {
            contextM200101b = this.f161368b.m200101b();
        }
        if (this.f109782i == null) {
            this.f109782i = (List) this.f161372f.invoke(null, contextM200101b);
        }
        List list = this.f109782i;
        if (list == null || list.size() != 2) {
            return;
        }
        synchronized (this.f161371e) {
            this.f161371e.m219754Q(((Long) this.f109782i.get(0)).longValue());
            this.f161371e.m219750M(((Long) this.f109782i.get(1)).longValue());
        }
    }
}
