package p153l;

import com.google.android.gms.internal.ads.ViewOnAttachStateChangeListenerC2271t;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes6.dex */
public final class r5s0 extends x5s0 {

    /* JADX INFO: renamed from: i */
    public final ViewOnAttachStateChangeListenerC2271t f161404i;

    /* JADX INFO: renamed from: j */
    public long f161405j;

    public r5s0(b4s0 b4s0Var, String str, String str2, fzr0 fzr0Var, int i, int i2, ViewOnAttachStateChangeListenerC2271t viewOnAttachStateChangeListenerC2271t) {
        super(b4s0Var, "2ZUgS25mCfmBpvNAAnoop42ZvK9H4E17vIqHMHWBgDSruAgpJ0/PRWhyN3sqcUbC", "ZqqofhkB4+yK9ARzF+IbcECpWBtuTXlqWFDkC/AVdcM=", fzr0Var, i, 53);
        this.f161404i = viewOnAttachStateChangeListenerC2271t;
        if (viewOnAttachStateChangeListenerC2271t != null) {
            this.f161405j = viewOnAttachStateChangeListenerC2271t.m13363a();
        }
    }

    @Override // p153l.x5s0
    /* JADX INFO: renamed from: a */
    public final void mo96251a() throws IllegalAccessException, InvocationTargetException {
        if (this.f161404i != null) {
            this.f192522e.m128282G(((Long) this.f192523f.invoke(null, Long.valueOf(this.f161405j))).longValue());
        }
    }
}
