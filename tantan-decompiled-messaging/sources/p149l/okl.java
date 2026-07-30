package p149l;

import androidx.annotation.Nullable;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class okl {

    /* JADX INFO: renamed from: a */
    private final int f144445a;

    /* JADX INFO: renamed from: b */
    private final List<ixk> f144446b;

    /* JADX INFO: renamed from: c */
    private final int f144447c;

    /* JADX INFO: renamed from: d */
    @Nullable
    private final InputStream f144448d;

    /* JADX INFO: renamed from: e */
    @Nullable
    private final byte[] f144449e;

    public okl(int i, List<ixk> list, int i2, InputStream inputStream) {
        this.f144445a = i;
        this.f144446b = list;
        this.f144447c = i2;
        this.f144448d = inputStream;
        this.f144449e = null;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final InputStream m164861a() {
        InputStream inputStream = this.f144448d;
        if (inputStream != null) {
            return inputStream;
        }
        if (this.f144449e != null) {
            return new ByteArrayInputStream(this.f144449e);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final int m164862b() {
        return this.f144447c;
    }

    /* JADX INFO: renamed from: c */
    public final List<ixk> m164863c() {
        return Collections.unmodifiableList(this.f144446b);
    }

    /* JADX INFO: renamed from: d */
    public final int m164864d() {
        return this.f144445a;
    }

    public okl(int i, List<ixk> list) {
        this(i, list, -1, null);
    }
}
