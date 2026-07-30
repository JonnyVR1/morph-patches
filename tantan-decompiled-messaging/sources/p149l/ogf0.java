package p149l;

import com.facebook.datasource.AbstractDataSource;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ogf0<T> extends AbstractDataSource<T> {
    /* JADX INFO: renamed from: x */
    public static <T> ogf0<T> m164199x() {
        return new ogf0<>();
    }

    @Override // com.facebook.datasource.AbstractDataSource
    /* JADX INFO: renamed from: o */
    public boolean mo8191o(Throwable th) {
        return super.mo8191o((Throwable) rf80.m179116g(th));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.datasource.AbstractDataSource
    /* JADX INFO: renamed from: u */
    public boolean mo8197u(T t, boolean z, Map<String, Object> map) {
        return super.mo8197u(rf80.m179116g(t), z, map);
    }
}
