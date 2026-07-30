package p149l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tantanapp.common.data.ValueObject;
import com.tantanapp.common.data.orm.Column;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class zrh0 {

    /* JADX INFO: renamed from: a */
    public List<Column> f204515a;

    /* JADX INFO: renamed from: b */
    public d30 f204516b;

    public zrh0(@Nullable List<Column> list, @NonNull d30 d30Var) {
        this.f204515a = list;
        this.f204516b = d30Var;
    }

    /* JADX INFO: renamed from: a */
    public boolean m219950a(List<er4> list) {
        boolean z = false;
        for (er4 er4Var : list) {
            int i = er4Var.f92880a;
            if (i == 0 || i == 1) {
                z = true;
                break;
            }
            if (i != 2) {
                qkq0.m175383a("wrong change type");
                return false;
            }
            for (Column column : this.f204515a) {
                if (!ValueObject.util_equals(column.get(er4Var.f92881b), column.get(er4Var.f92882c))) {
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
