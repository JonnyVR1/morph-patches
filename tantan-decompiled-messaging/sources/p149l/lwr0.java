package p149l;

import com.google.android.gms.internal.ads.ViewOnAttachStateChangeListenerC2248t;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes6.dex */
public final class lwr0 extends rwr0 {

    /* JADX INFO: renamed from: i */
    public final ViewOnAttachStateChangeListenerC2248t f130298i;

    /* JADX INFO: renamed from: j */
    public long f130299j;

    public lwr0(vur0 vur0Var, String str, String str2, zpr0 zpr0Var, int i, int i2, ViewOnAttachStateChangeListenerC2248t viewOnAttachStateChangeListenerC2248t) {
        super(vur0Var, "2ZUgS25mCfmBpvNAAnoop42ZvK9H4E17vIqHMHWBgDSruAgpJ0/PRWhyN3sqcUbC", "ZqqofhkB4+yK9ARzF+IbcECpWBtuTXlqWFDkC/AVdcM=", zpr0Var, i, 53);
        this.f130298i = viewOnAttachStateChangeListenerC2248t;
        if (viewOnAttachStateChangeListenerC2248t != null) {
            this.f130299j = viewOnAttachStateChangeListenerC2248t.m13309a();
        }
    }

    @Override // p149l.rwr0
    /* JADX INFO: renamed from: a */
    public final void mo99305a() throws IllegalAccessException, InvocationTargetException {
        if (this.f130298i != null) {
            this.f161371e.m219747G(((Long) this.f161372f.invoke(null, Long.valueOf(this.f130299j))).longValue());
        }
    }
}
