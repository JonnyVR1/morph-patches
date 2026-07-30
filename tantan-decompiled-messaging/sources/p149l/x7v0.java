package p149l;

import android.text.TextUtils;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class x7v0 {

    /* JADX INFO: renamed from: a */
    public final String f191380a;

    /* JADX INFO: renamed from: b */
    public final String f191381b;

    /* JADX INFO: renamed from: c */
    public int f191382c;

    /* JADX INFO: renamed from: d */
    public long f191383d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final Integer f191384e;

    public x7v0(String str, String str2, int i, long j, @Nullable Integer num) {
        this.f191380a = str;
        this.f191381b = str2;
        this.f191382c = i;
        this.f191383d = j;
        this.f191384e = num;
    }

    public final String toString() {
        String str = this.f191380a + "." + this.f191382c + "." + this.f191383d;
        if (!TextUtils.isEmpty(this.f191381b)) {
            str = str + "." + this.f191381b;
        }
        if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f131870C1)).booleanValue() || this.f191384e == null || TextUtils.isEmpty(this.f191381b)) {
            return str;
        }
        return str + "." + this.f191384e;
    }
}
