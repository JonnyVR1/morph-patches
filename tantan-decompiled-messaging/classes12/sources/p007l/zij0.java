package p007l;

import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ValueObject;
import com.tantanapp.common.utils.CrashHelper;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class zij0 {
    /* JADX INFO: renamed from: a */
    public static void m17469a(ValueObject valueObject, ValueObject valueObject2) {
        if (valueObject.hasCopyId() && valueObject2.hasCopyId()) {
            valueObject2.setCopyId(valueObject.getCopyId());
        }
    }

    /* JADX INFO: renamed from: b */
    public static <T extends ValueObject, O extends ValueObject> List<T> m17470b(List<O> list, JsonAdapter<T> jsonAdapter) {
        w700 w700Var = new w700(jsonAdapter);
        w700Var.m15710f(list);
        return w700Var;
    }

    /* JADX INFO: renamed from: c */
    public static <T extends ValueObject, O extends ValueObject> T m17471c(O o, JsonAdapter<T> jsonAdapter) {
        T t = null;
        if (o == null) {
            return null;
        }
        o.createTransValue();
        try {
            T t2 = (T) jsonAdapter.parse(o.toJson());
            if (t2 == null) {
                return t2;
            }
            try {
                t2.setExtList(o.getExtList());
                o.copyTransValue(t2);
                m17469a(o, t2);
                return t2;
            } catch (Exception e) {
                e = e;
                t = t2;
                CrashHelper.c(e);
                return t;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }
}
