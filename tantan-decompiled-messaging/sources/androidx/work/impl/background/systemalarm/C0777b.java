package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import java.util.ArrayList;
import java.util.List;
import p149l.haq0;
import p149l.oaq0;
import p149l.r95;
import p149l.txv;

/* JADX INFO: renamed from: androidx.work.impl.background.systemalarm.b */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class C0777b {

    /* JADX INFO: renamed from: f */
    public static final String f3541f = txv.m190978i("ConstraintsCmdHandler");

    /* JADX INFO: renamed from: a */
    public final Context f3542a;

    /* JADX INFO: renamed from: b */
    public final r95 f3543b;

    /* JADX INFO: renamed from: c */
    public final int f3544c;

    /* JADX INFO: renamed from: d */
    public final C0779d f3545d;

    /* JADX INFO: renamed from: e */
    public final WorkConstraintsTracker f3546e;

    public C0777b(@NonNull Context context, r95 r95Var, int i, @NonNull C0779d c0779d) {
        this.f3542a = context;
        this.f3543b = r95Var;
        this.f3544c = i;
        this.f3545d = c0779d;
        this.f3546e = new WorkConstraintsTracker(c0779d.m4558f().m182749t());
    }

    @WorkerThread
    /* JADX INFO: renamed from: a */
    public void m4543a() {
        List<haq0> listMo135188t = this.f3545d.m4558f().m182750u().workSpecDao().mo135188t();
        ConstraintProxy.updateAll(this.f3542a, listMo135188t);
        ArrayList<haq0> arrayList = new ArrayList(listMo135188t.size());
        long jCurrentTimeMillis = this.f3543b.currentTimeMillis();
        for (haq0 haq0Var : listMo135188t) {
            if (jCurrentTimeMillis >= haq0Var.m130157b() && (!haq0Var.m130165k() || this.f3546e.m4578a(haq0Var))) {
                arrayList.add(haq0Var);
            }
        }
        for (haq0 haq0Var2 : arrayList) {
            String str = haq0Var2.id;
            Intent intentM4528b = C0776a.m4528b(this.f3542a, oaq0.m163363a(haq0Var2));
            txv.m190976e().mo190979a(f3541f, "Creating a delay_met command for workSpec with id (" + str + ")");
            this.f3545d.m4557e().mo187637c().execute(new C0779d.b(this.f3545d, intentM4528b, this.f3544c));
        }
    }
}
