package p149l;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public final class hvr0 extends rwr0 {

    /* JADX INFO: renamed from: j */
    public static final swr0 f109693j = new swr0();

    /* JADX INFO: renamed from: i */
    public final Context f109694i;

    public hvr0(vur0 vur0Var, String str, String str2, zpr0 zpr0Var, int i, int i2, Context context) {
        super(vur0Var, "F0+pSvx9GtXcjR12oFzzp5apK08MRky74IYez805WxvZBZTjFs672zxMax8w5kp9", "69psxaRqrIVZzPpt4pN0wGmA/kc6O8gjOJlblyEzW1E=", zpr0Var, i, 29);
        this.f109694i = context;
    }

    @Override // p149l.rwr0
    /* JADX INFO: renamed from: a */
    public final void mo99305a() throws IllegalAccessException, InvocationTargetException {
        this.f161371e.m219778o0("E");
        AtomicReference atomicReferenceM186355a = f109693j.m186355a(this.f109694i.getPackageName());
        if (atomicReferenceM186355a.get() == null) {
            synchronized (atomicReferenceM186355a) {
                try {
                    if (atomicReferenceM186355a.get() == null) {
                        atomicReferenceM186355a.set((String) this.f161372f.invoke(null, this.f109694i));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        String str = (String) atomicReferenceM186355a.get();
        synchronized (this.f161371e) {
            this.f161371e.m219778o0(irr0.m137915a(str.getBytes(), true));
        }
    }
}
