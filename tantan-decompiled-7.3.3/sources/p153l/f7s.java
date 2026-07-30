package p153l;

import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes10.dex */
public class f7s {

    /* JADX INFO: renamed from: a */
    public int f97588a;

    /* JADX INFO: renamed from: b */
    public int f97589b;

    /* JADX INFO: renamed from: c */
    public List<String> f97590c;

    /* JADX INFO: renamed from: d */
    public int f97591d;

    /* JADX INFO: renamed from: e */
    public int f97592e;

    /* JADX INFO: renamed from: f */
    public int f97593f;

    /* JADX INFO: renamed from: g */
    public int f97594g;

    /* JADX INFO: renamed from: h */
    public int f97595h;

    /* JADX INFO: renamed from: a */
    public boolean m124477a() {
        return this.f97594g > 0;
    }

    /* JADX INFO: renamed from: b */
    public boolean m124478b() {
        List<String> list = this.f97590c;
        return list != null && list.size() > 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            f7s f7sVar = (f7s) obj;
            if (this.f97588a == f7sVar.f97588a && this.f97589b == f7sVar.f97589b && this.f97591d == f7sVar.f97591d && this.f97592e == f7sVar.f97592e && this.f97593f == f7sVar.f97593f && this.f97594g == f7sVar.f97594g && this.f97595h == f7sVar.f97595h && Objects.equals(this.f97590c, f7sVar.f97590c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f97588a), Integer.valueOf(this.f97589b), this.f97590c, Integer.valueOf(this.f97591d), Integer.valueOf(this.f97592e), Integer.valueOf(this.f97593f), Integer.valueOf(this.f97594g), Integer.valueOf(this.f97595h));
    }
}
