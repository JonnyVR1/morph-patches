package p153l;

import android.content.Context;
import com.core.glcore.util.CameraHelper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class pvh0 {

    /* JADX INFO: renamed from: a */
    public static List<hyh0> f154300a = new ArrayList();

    /* JADX INFO: renamed from: a */
    public static boolean m173962a() {
        List<hyh0> list = f154300a;
        return (list == null || list.isEmpty()) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public static List<hyh0> m173963b(Context context) {
        if (m173962a()) {
            return f154300a;
        }
        List<erf0> listM104546v = biw.m104546v(context, 3);
        ArrayList arrayList = new ArrayList();
        if (listM104546v != null) {
            for (erf0 erf0Var : listM104546v) {
                arrayList.add(new hyh0(erf0Var.m122180b(), erf0Var.m122179a()));
            }
        }
        f154300a = arrayList;
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public static hyh0 m173964c(Context context, hyh0 hyh0Var, int i, float f) {
        List<hyh0> listM173963b = m173963b(context);
        ArrayList arrayList = new ArrayList();
        for (hyh0 hyh0Var2 : listM173963b) {
            arrayList.add(new erf0(hyh0Var2.f112117a, hyh0Var2.f112118b));
        }
        erf0 erf0VarSeletecMatchSize = CameraHelper.seletecMatchSize(arrayList, new erf0(hyh0Var.f112117a, hyh0Var.f112118b), i, f);
        return new hyh0(erf0VarSeletecMatchSize == null ? 0 : erf0VarSeletecMatchSize.m122180b(), erf0VarSeletecMatchSize != null ? erf0VarSeletecMatchSize.m122179a() : 0);
    }
}
