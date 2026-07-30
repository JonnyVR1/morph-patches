package p149l;

import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class ykr0 {

    /* JADX INFO: renamed from: a */
    public final int f198826a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final String f198827b;

    /* JADX INFO: renamed from: c */
    public final List f198828c;

    /* JADX INFO: renamed from: d */
    public final byte[] f198829d;

    public ykr0(int i, @Nullable String str, @Nullable List list, byte[] bArr) {
        this.f198826a = i;
        this.f198827b = str;
        this.f198828c = list == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list);
        this.f198829d = bArr;
    }
}
