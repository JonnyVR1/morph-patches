package p153l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tantanapp.common.data.ValueObject;
import com.tantanapp.common.data.orm.Column;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class h0i0 {

    /* JADX INFO: renamed from: a */
    public List<Column> f107302a;

    /* JADX INFO: renamed from: b */
    public x20 f107303b;

    public h0i0(@Nullable List<Column> list, @NonNull x20 x20Var) {
        this.f107302a = list;
        this.f107303b = x20Var;
    }

    /* JADX INFO: renamed from: a */
    public boolean m133169a(List<ds4> list) {
        boolean z = false;
        for (ds4 ds4Var : list) {
            int i = ds4Var.f90453a;
            if (i == 0 || i == 1) {
                z = true;
                break;
            }
            if (i != 2) {
                wtq0.m207906a("wrong change type");
                return false;
            }
            for (Column column : this.f107302a) {
                if (!ValueObject.util_equals(column.get(ds4Var.f90454b), column.get(ds4Var.f90455c))) {
                    z = true;
                    break;
                    break;
                }
            }
            if (z) {
                break;
            }
        }
        return z;
    }
}
