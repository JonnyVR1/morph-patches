package p149l;

import android.content.Context;
import java.util.ArrayList;
import tech.sud.gip.core.GameInfo;
import tech.sud.gip.core.SudLoadMGParamModel;

/* JADX INFO: loaded from: classes.dex */
public final class ylg0 {

    /* JADX INFO: renamed from: i */
    public static final String f198884i = "SudGIP ".concat(ylg0.class.getSimpleName());

    /* JADX INFO: renamed from: a */
    public final Context f198885a;

    /* JADX INFO: renamed from: b */
    public final int f198886b;

    /* JADX INFO: renamed from: c */
    public final String f198887c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f198888d;

    /* JADX INFO: renamed from: e */
    public GameInfo f198889e;

    /* JADX INFO: renamed from: f */
    public final vfg0 f198890f;

    /* JADX INFO: renamed from: g */
    public int f198891g;

    /* JADX INFO: renamed from: h */
    public t7g0 f198892h;

    public ylg0(Context context, SudLoadMGParamModel sudLoadMGParamModel, int i, String str, cjg0 cjg0Var) {
        ArrayList arrayList = new ArrayList();
        this.f198888d = arrayList;
        this.f198891g = 0;
        ejg0 ejg0Var = new ejg0(this);
        this.f198885a = context;
        this.f198886b = i;
        this.f198887c = str;
        this.f198890f = cjg0Var;
        vcg0 vcg0Var = vcg0.f180926c;
        if (vcg0Var == null) {
            qkq0.m175383a("SudGameRuntime hasn't been initialized");
            throw null;
        }
        arrayList.add(new ydg0(context, sudLoadMGParamModel, vcg0Var, ejg0Var));
        vcg0 vcg0Var2 = vcg0.f180926c;
        if (vcg0Var2 == null) {
            qkq0.m175383a("SudGameRuntime hasn't been initialized");
            throw null;
        }
        arrayList.add(new xrg0(context, vcg0Var2, ejg0Var));
        vcg0 vcg0Var3 = vcg0.f180926c;
        if (vcg0Var3 != null) {
            arrayList.add(new l9g0(context, vcg0Var3, ejg0Var));
        } else {
            qkq0.m175383a("SudGameRuntime hasn't been initialized");
            throw null;
        }
    }
}
