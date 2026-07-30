package p153l;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes6.dex */
public final class k5s0 extends x5s0 {

    /* JADX INFO: renamed from: i */
    public static volatile String f124125i;

    /* JADX INFO: renamed from: j */
    public static final Object f124126j = new Object();

    public k5s0(b4s0 b4s0Var, String str, String str2, fzr0 fzr0Var, int i, int i2) {
        super(b4s0Var, "d4INySQwKXrFgcw/Yp0O6t4YGx7HF+F75DncE44LSIy22mr4UP50R657OPRB1jqZ", "AemuwIJaLmYE+nU5fadET3FINkdby4LnWDkawsC9pWk=", fzr0Var, i, 1);
    }

    @Override // p153l.x5s0
    /* JADX INFO: renamed from: a */
    public final void mo96251a() throws IllegalAccessException, InvocationTargetException {
        this.f192522e.m128317r("E");
        if (f124125i == null) {
            synchronized (f124126j) {
                try {
                    if (f124125i == null) {
                        f124125i = (String) this.f192523f.invoke(null, null);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        synchronized (this.f192522e) {
            this.f192522e.m128317r(f124125i);
        }
    }
}
