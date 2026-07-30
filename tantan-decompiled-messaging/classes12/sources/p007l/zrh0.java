package p007l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tantanapp.common.data.ValueObject;
import com.tantanapp.common.data.orm.Column;
import java.util.List;
import l.d30;
import l.qkq0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class zrh0 {

    /* JADX INFO: renamed from: a */
    public List<Column> f15849a;

    /* JADX INFO: renamed from: b */
    public d30 f15850b;

    public zrh0(@Nullable List<Column> list, @NonNull d30 d30Var) {
        this.f15849a = list;
        this.f15850b = d30Var;
    }

    /* JADX INFO: renamed from: a */
    public boolean m17536a(List<er4> list) {
        boolean z = false;
        for (er4 er4Var : list) {
            int i = er4Var.f7460a;
            if (i == 0 || i == 1) {
                z = true;
                break;
            }
            if (i != 2) {
                qkq0.a("wrong change type");
                return false;
            }
            for (Column column : this.f15849a) {
                if (!ValueObject.util_equals(column.get(er4Var.f7461b), column.get(er4Var.f7462c))) {
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
