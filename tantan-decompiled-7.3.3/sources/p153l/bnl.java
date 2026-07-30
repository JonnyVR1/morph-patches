package p153l;

import androidx.annotation.Nullable;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class bnl {

    /* JADX INFO: renamed from: a */
    private final int f77535a;

    /* JADX INFO: renamed from: b */
    private final List<yzk> f77536b;

    /* JADX INFO: renamed from: c */
    private final int f77537c;

    /* JADX INFO: renamed from: d */
    @Nullable
    private final InputStream f77538d;

    /* JADX INFO: renamed from: e */
    @Nullable
    private final byte[] f77539e;

    public bnl(int i, List<yzk> list, int i2, InputStream inputStream) {
        this.f77535a = i;
        this.f77536b = list;
        this.f77537c = i2;
        this.f77538d = inputStream;
        this.f77539e = null;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final InputStream m105496a() {
        InputStream inputStream = this.f77538d;
        if (inputStream != null) {
            return inputStream;
        }
        if (this.f77539e != null) {
            return new ByteArrayInputStream(this.f77539e);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final int m105497b() {
        return this.f77537c;
    }

    /* JADX INFO: renamed from: c */
    public final List<yzk> m105498c() {
        return Collections.unmodifiableList(this.f77536b);
    }

    /* JADX INFO: renamed from: d */
    public final int m105499d() {
        return this.f77535a;
    }

    public bnl(int i, List<yzk> list) {
        this(i, list, -1, null);
    }
}
