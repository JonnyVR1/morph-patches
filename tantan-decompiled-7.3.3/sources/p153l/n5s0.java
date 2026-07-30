package p153l;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class n5s0 extends x5s0 {

    /* JADX INFO: renamed from: i */
    public List f140380i;

    /* JADX INFO: renamed from: j */
    public final Context f140381j;

    public n5s0(b4s0 b4s0Var, String str, String str2, fzr0 fzr0Var, int i, int i2, Context context) {
        super(b4s0Var, "0gWjYXznHW/Eye6gdpKNKYjX/XLpx1vdgxUIuTN4hh6FwE+EupqjErYFsUwwKenZ", "tk45mDotIpTZidmNYxxiIBsjVftw/e0h3Unlwpf2Me4=", fzr0Var, i, 31);
        this.f140380i = null;
        this.f140381j = context;
    }

    @Override // p153l.x5s0
    /* JADX INFO: renamed from: a */
    public final void mo96251a() throws IllegalAccessException, InvocationTargetException {
        this.f192522e.m128289Q(-1L);
        this.f192522e.m128285M(-1L);
        Context contextM102517b = this.f140381j;
        if (contextM102517b == null) {
            contextM102517b = this.f192519b.m102517b();
        }
        if (this.f140380i == null) {
            this.f140380i = (List) this.f192523f.invoke(null, contextM102517b);
        }
        List list = this.f140380i;
        if (list == null || list.size() != 2) {
            return;
        }
        synchronized (this.f192522e) {
            this.f192522e.m128289Q(((Long) this.f140380i.get(0)).longValue());
            this.f192522e.m128285M(((Long) this.f140380i.get(1)).longValue());
        }
    }
}
