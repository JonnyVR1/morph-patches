package p153l;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public final class n4s0 extends x5s0 {

    /* JADX INFO: renamed from: j */
    public static final y5s0 f140253j = new y5s0();

    /* JADX INFO: renamed from: i */
    public final Context f140254i;

    public n4s0(b4s0 b4s0Var, String str, String str2, fzr0 fzr0Var, int i, int i2, Context context) {
        super(b4s0Var, "F0+pSvx9GtXcjR12oFzzp5apK08MRky74IYez805WxvZBZTjFs672zxMax8w5kp9", "69psxaRqrIVZzPpt4pN0wGmA/kc6O8gjOJlblyEzW1E=", fzr0Var, i, 29);
        this.f140254i = context;
    }

    @Override // p153l.x5s0
    /* JADX INFO: renamed from: a */
    public final void mo96251a() throws IllegalAccessException, InvocationTargetException {
        this.f192522e.m128313o0("E");
        AtomicReference atomicReferenceM214317a = f140253j.m214317a(this.f140254i.getPackageName());
        if (atomicReferenceM214317a.get() == null) {
            synchronized (atomicReferenceM214317a) {
                try {
                    if (atomicReferenceM214317a.get() == null) {
                        atomicReferenceM214317a.set((String) this.f192523f.invoke(null, this.f140254i));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        String str = (String) atomicReferenceM214317a.get();
        synchronized (this.f192522e) {
            this.f192522e.m128313o0(o0s0.m165547a(str.getBytes(), true));
        }
    }
}
