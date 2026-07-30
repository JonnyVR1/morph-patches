package p153l;

import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ValueObject;
import com.tantanapp.common.utils.CrashHelper;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class csj0 {
    /* JADX INFO: renamed from: a */
    public static void m112183a(ValueObject valueObject, ValueObject valueObject2) {
        if (valueObject.hasCopyId() && valueObject2.hasCopyId()) {
            valueObject2.setCopyId(valueObject.getCopyId());
        }
    }

    /* JADX INFO: renamed from: b */
    public static <T extends ValueObject, O extends ValueObject> List<T> m112184b(List<O> list, JsonAdapter<T> jsonAdapter) {
        fg00 fg00Var = new fg00(jsonAdapter);
        fg00Var.m125474f(list);
        return fg00Var;
    }

    /* JADX INFO: renamed from: c */
    public static <T extends ValueObject, O extends ValueObject> T m112185c(O o, JsonAdapter<T> jsonAdapter) {
        T t = null;
        if (o == null) {
            return null;
        }
        o.createTransValue();
        try {
            T t2 = jsonAdapter.parse(o.toJson());
            if (t2 == null) {
                return t2;
            }
            try {
                t2.setExtList(o.getExtList());
                o.copyTransValue(t2);
                m112183a(o, t2);
                return t2;
            } catch (Exception e) {
                e = e;
                t = t2;
                CrashHelper.m82479c(e);
                return t;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }
}
