package p153l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class fs2 {

    /* JADX INFO: renamed from: a */
    public final String f100517a;

    /* JADX INFO: renamed from: b */
    public final String f100518b;

    /* JADX INFO: renamed from: c */
    public final int f100519c;

    /* JADX INFO: renamed from: d */
    public final int f100520d;

    public fs2(String str, String str2, int i, int i2) {
        this.f100517a = str;
        this.f100518b = str2;
        this.f100519c = i;
        this.f100520d = i2;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fs2)) {
            return false;
        }
        fs2 fs2Var = (fs2) obj;
        return this.f100519c == fs2Var.f100519c && this.f100520d == fs2Var.f100520d && k950.m148863a(this.f100517a, fs2Var.f100517a) && k950.m148863a(this.f100518b, fs2Var.f100518b);
    }

    public int hashCode() {
        return k950.m148864b(this.f100517a, this.f100518b, Integer.valueOf(this.f100519c), Integer.valueOf(this.f100520d));
    }
}
