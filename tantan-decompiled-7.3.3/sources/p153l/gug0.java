package p153l;

import android.content.Context;
import java.util.ArrayList;
import tech.sud.gip.core.GameInfo;
import tech.sud.gip.core.SudLoadMGParamModel;

/* JADX INFO: loaded from: classes.dex */
public final class gug0 {

    /* JADX INFO: renamed from: i */
    public static final String f106499i = "SudGIP ".concat(gug0.class.getSimpleName());

    /* JADX INFO: renamed from: a */
    public final Context f106500a;

    /* JADX INFO: renamed from: b */
    public final int f106501b;

    /* JADX INFO: renamed from: c */
    public final String f106502c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f106503d;

    /* JADX INFO: renamed from: e */
    public GameInfo f106504e;

    /* JADX INFO: renamed from: f */
    public final dog0 f106505f;

    /* JADX INFO: renamed from: g */
    public int f106506g;

    /* JADX INFO: renamed from: h */
    public bgg0 f106507h;

    public gug0(Context context, SudLoadMGParamModel sudLoadMGParamModel, int i, String str, krg0 krg0Var) {
        ArrayList arrayList = new ArrayList();
        this.f106503d = arrayList;
        this.f106506g = 0;
        mrg0 mrg0Var = new mrg0(this);
        this.f106500a = context;
        this.f106501b = i;
        this.f106502c = str;
        this.f106505f = krg0Var;
        dlg0 dlg0Var = dlg0.f89532c;
        if (dlg0Var == null) {
            wtq0.m207906a("SudGameRuntime hasn't been initialized");
            throw null;
        }
        arrayList.add(new gmg0(context, sudLoadMGParamModel, dlg0Var, mrg0Var));
        dlg0 dlg0Var2 = dlg0.f89532c;
        if (dlg0Var2 == null) {
            wtq0.m207906a("SudGameRuntime hasn't been initialized");
            throw null;
        }
        arrayList.add(new f0h0(context, dlg0Var2, mrg0Var));
        dlg0 dlg0Var3 = dlg0.f89532c;
        if (dlg0Var3 != null) {
            arrayList.add(new thg0(context, dlg0Var3, mrg0Var));
        } else {
            wtq0.m207906a("SudGameRuntime hasn't been initialized");
            throw null;
        }
    }
}
