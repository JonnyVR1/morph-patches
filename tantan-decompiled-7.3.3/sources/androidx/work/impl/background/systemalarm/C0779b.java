package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import java.util.ArrayList;
import java.util.List;
import p153l.mjq0;
import p153l.qzv;
import p153l.sa5;
import p153l.tjq0;

/* JADX INFO: renamed from: androidx.work.impl.background.systemalarm.b */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class C0779b {

    /* JADX INFO: renamed from: f */
    public static final String f3541f = qzv.m178831i("ConstraintsCmdHandler");

    /* JADX INFO: renamed from: a */
    public final Context f3542a;

    /* JADX INFO: renamed from: b */
    public final sa5 f3543b;

    /* JADX INFO: renamed from: c */
    public final int f3544c;

    /* JADX INFO: renamed from: d */
    public final C0781d f3545d;

    /* JADX INFO: renamed from: e */
    public final WorkConstraintsTracker f3546e;

    public C0779b(@NonNull Context context, sa5 sa5Var, int i, @NonNull C0781d c0781d) {
        this.f3542a = context;
        this.f3543b = sa5Var;
        this.f3544c = i;
        this.f3545d = c0781d;
        this.f3546e = new WorkConstraintsTracker(c0781d.m4560f().m211162t());
    }

    @WorkerThread
    /* JADX INFO: renamed from: a */
    public void m4545a() {
        List<mjq0> listMo163455t = this.f3545d.m4560f().m211163u().workSpecDao().mo163455t();
        ConstraintProxy.updateAll(this.f3542a, listMo163455t);
        ArrayList<mjq0> arrayList = new ArrayList(listMo163455t.size());
        long jCurrentTimeMillis = this.f3543b.currentTimeMillis();
        for (mjq0 mjq0Var : listMo163455t) {
            if (jCurrentTimeMillis >= mjq0Var.m158599b() && (!mjq0Var.m158607k() || this.f3546e.m4580a(mjq0Var))) {
                arrayList.add(mjq0Var);
            }
        }
        for (mjq0 mjq0Var2 : arrayList) {
            String str = mjq0Var2.id;
            Intent intentM4530b = C0778a.m4530b(this.f3542a, tjq0.m191450a(mjq0Var2));
            qzv.m178829e().mo178832a(f3541f, "Creating a delay_met command for workSpec with id (" + str + ")");
            this.f3545d.m4559e().mo216345c().execute(new C0781d.b(this.f3545d, intentM4530b, this.f3544c));
        }
    }
}
