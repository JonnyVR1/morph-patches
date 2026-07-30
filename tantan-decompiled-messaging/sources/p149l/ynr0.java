package p149l;

import androidx.annotation.Nullable;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class ynr0 {

    /* JADX INFO: renamed from: a */
    public final int f199205a;

    /* JADX INFO: renamed from: b */
    public final List f199206b;

    /* JADX INFO: renamed from: c */
    public final int f199207c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final InputStream f199208d;

    public ynr0(int i, List list, int i2, InputStream inputStream) {
        this.f199205a = i;
        this.f199206b = list;
        this.f199207c = i2;
        this.f199208d = inputStream;
    }

    /* JADX INFO: renamed from: a */
    public final int m215438a() {
        return this.f199207c;
    }

    /* JADX INFO: renamed from: b */
    public final int m215439b() {
        return this.f199205a;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final InputStream m215440c() {
        InputStream inputStream = this.f199208d;
        if (inputStream != null) {
            return inputStream;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final List m215441d() {
        return Collections.unmodifiableList(this.f199206b);
    }
}
