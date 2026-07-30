package p149l;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Utils;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class zcm {

    /* JADX INFO: renamed from: a */
    private final HashSet<String> f202557a;

    private zcm(String[] strArr) {
        this.f202557a = new HashSet<>();
        m218070e(strArr);
    }

    /* JADX INFO: renamed from: b */
    public static zcm m218067b(String str) {
        return new zcm(str.split(Constants.SEPARATOR_COMMA));
    }

    /* JADX INFO: renamed from: c */
    public static zcm m218068c(String[] strArr) {
        return new zcm(strArr);
    }

    /* JADX INFO: renamed from: d */
    public static zcm m218069d() {
        return new zcm(Constants.LEGACY_IDENTITY_KEYS);
    }

    /* JADX INFO: renamed from: e */
    private void m218070e(String[] strArr) {
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        for (String str : strArr) {
            if (Utils.m5906c(Constants.ALL_IDENTITY_KEYS, str)) {
                this.f202557a.add(Utils.m5911h(str));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m218071a(String str) {
        return Utils.m5906c(this.f202557a, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f202557a.equals(((zcm) obj).f202557a);
    }

    /* JADX INFO: renamed from: f */
    public boolean m218072f() {
        return !this.f202557a.isEmpty();
    }

    public int hashCode() {
        return super.hashCode();
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = this.f202557a.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (Constants.ALL_IDENTITY_KEYS.contains(next)) {
                sb.append(next);
                sb.append(it.hasNext() ? Constants.SEPARATOR_COMMA : "");
            }
        }
        return sb.toString();
    }

    private zcm(HashSet<String> hashSet) {
        HashSet<String> hashSet2 = new HashSet<>();
        this.f202557a = hashSet2;
        hashSet2.addAll(hashSet);
    }
}
