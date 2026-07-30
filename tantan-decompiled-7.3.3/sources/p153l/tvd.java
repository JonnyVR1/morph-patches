package p153l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class tvd {

    /* JADX INFO: renamed from: a */
    public final String f176257a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final String f176258b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final String f176259c;

    public tvd(String str, @Nullable String str2, @Nullable String str3) {
        this.f176257a = str;
        this.f176258b = str2;
        this.f176259c = str3;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && tvd.class == obj.getClass()) {
            tvd tvdVar = (tvd) obj;
            if (bmk0.m105123c(this.f176257a, tvdVar.f176257a) && bmk0.m105123c(this.f176258b, tvdVar.f176258b) && bmk0.m105123c(this.f176259c, tvdVar.f176259c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.f176257a.hashCode() * 31;
        String str = this.f176258b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f176259c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
