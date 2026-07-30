package p153l;

import android.app.Activity;
import android.view.View;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes6.dex */
public final class k4s0 extends x5s0 {

    /* JADX INFO: renamed from: i */
    public final Activity f123920i;

    /* JADX INFO: renamed from: j */
    public final View f123921j;

    public k4s0(b4s0 b4s0Var, String str, String str2, fzr0 fzr0Var, int i, int i2, View view, Activity activity) {
        super(b4s0Var, "sA157cQy3kuoY6/Q8khf6XMDmxSzcYyzmkuwKzX0O8QIfXTfkmyj/S2OF9jehLNc", "FdxRYG9/HOndmgVdj1eVgDulreHUGSjsWl31nKn2TzY=", fzr0Var, i, 62);
        this.f123921j = view;
        this.f123920i = activity;
    }

    @Override // p153l.x5s0
    /* JADX INFO: renamed from: a */
    public final void mo96251a() throws IllegalAccessException, InvocationTargetException {
        if (this.f123921j == null) {
            return;
        }
        Boolean bool = (Boolean) jas0.m144075c().m176505a(sgs0.f168488u2);
        boolean zBooleanValue = bool.booleanValue();
        Object[] objArr = (Object[]) this.f192523f.invoke(null, this.f123921j, this.f123920i, bool);
        synchronized (this.f192522e) {
            try {
                this.f192522e.m128302d0(((Long) objArr[0]).longValue());
                this.f192522e.m128304f0(((Long) objArr[1]).longValue());
                if (zBooleanValue) {
                    this.f192522e.m128303e0((String) objArr[2]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
