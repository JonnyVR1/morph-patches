package p153l;

import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class eur0 {

    /* JADX INFO: renamed from: a */
    public final int f95950a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final String f95951b;

    /* JADX INFO: renamed from: c */
    public final List f95952c;

    /* JADX INFO: renamed from: d */
    public final byte[] f95953d;

    public eur0(int i, @Nullable String str, @Nullable List list, byte[] bArr) {
        this.f95950a = i;
        this.f95951b = str;
        this.f95952c = list == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list);
        this.f95953d = bArr;
    }
}
