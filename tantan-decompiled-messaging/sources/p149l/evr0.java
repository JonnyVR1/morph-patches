package p149l;

import android.app.Activity;
import android.view.View;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes6.dex */
public final class evr0 extends rwr0 {

    /* JADX INFO: renamed from: i */
    public final Activity f93375i;

    /* JADX INFO: renamed from: j */
    public final View f93376j;

    public evr0(vur0 vur0Var, String str, String str2, zpr0 zpr0Var, int i, int i2, View view, Activity activity) {
        super(vur0Var, "sA157cQy3kuoY6/Q8khf6XMDmxSzcYyzmkuwKzX0O8QIfXTfkmyj/S2OF9jehLNc", "FdxRYG9/HOndmgVdj1eVgDulreHUGSjsWl31nKn2TzY=", zpr0Var, i, 62);
        this.f93376j = view;
        this.f93375i = activity;
    }

    @Override // p149l.rwr0
    /* JADX INFO: renamed from: a */
    public final void mo99305a() throws IllegalAccessException, InvocationTargetException {
        if (this.f93376j == null) {
            return;
        }
        Boolean bool = (Boolean) d1s0.m109677c().m144697a(m7s0.f132417u2);
        boolean zBooleanValue = bool.booleanValue();
        Object[] objArr = (Object[]) this.f161372f.invoke(null, this.f93376j, this.f93375i, bool);
        synchronized (this.f161371e) {
            try {
                this.f161371e.m219767d0(((Long) objArr[0]).longValue());
                this.f161371e.m219769f0(((Long) objArr[1]).longValue());
                if (zBooleanValue) {
                    this.f161371e.m219768e0((String) objArr[2]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
