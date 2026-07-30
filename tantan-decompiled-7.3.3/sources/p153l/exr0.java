package p153l;

import androidx.annotation.Nullable;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class exr0 {

    /* JADX INFO: renamed from: a */
    public final int f96327a;

    /* JADX INFO: renamed from: b */
    public final List f96328b;

    /* JADX INFO: renamed from: c */
    public final int f96329c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final InputStream f96330d;

    public exr0(int i, List list, int i2, InputStream inputStream) {
        this.f96327a = i;
        this.f96328b = list;
        this.f96329c = i2;
        this.f96330d = inputStream;
    }

    /* JADX INFO: renamed from: a */
    public final int m123097a() {
        return this.f96329c;
    }

    /* JADX INFO: renamed from: b */
    public final int m123098b() {
        return this.f96327a;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final InputStream m123099c() {
        InputStream inputStream = this.f96330d;
        if (inputStream != null) {
            return inputStream;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final List m123100d() {
        return Collections.unmodifiableList(this.f96328b);
    }
}
