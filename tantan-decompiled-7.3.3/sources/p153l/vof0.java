package p153l;

import com.facebook.datasource.AbstractDataSource;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class vof0<T> extends AbstractDataSource<T> {
    /* JADX INFO: renamed from: x */
    public static <T> vof0<T> m202118x() {
        return new vof0<>();
    }

    @Override // com.facebook.datasource.AbstractDataSource
    /* JADX INFO: renamed from: o */
    public boolean mo8245o(Throwable th) {
        return super.mo8245o((Throwable) wn80.m207182g(th));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.datasource.AbstractDataSource
    /* JADX INFO: renamed from: u */
    public boolean mo8251u(T t, boolean z, Map<String, Object> map) {
        return super.mo8251u(wn80.m207182g(t), z, map);
    }
}
