package p153l;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Utils;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class pfm {

    /* JADX INFO: renamed from: a */
    private final HashSet<String> f152196a;

    private pfm(String[] strArr) {
        this.f152196a = new HashSet<>();
        m172136e(strArr);
    }

    /* JADX INFO: renamed from: b */
    public static pfm m172133b(String str) {
        return new pfm(str.split(Constants.SEPARATOR_COMMA));
    }

    /* JADX INFO: renamed from: c */
    public static pfm m172134c(String[] strArr) {
        return new pfm(strArr);
    }

    /* JADX INFO: renamed from: d */
    public static pfm m172135d() {
        return new pfm(Constants.LEGACY_IDENTITY_KEYS);
    }

    /* JADX INFO: renamed from: e */
    private void m172136e(String[] strArr) {
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        for (String str : strArr) {
            if (Utils.m5960c(Constants.ALL_IDENTITY_KEYS, str)) {
                this.f152196a.add(Utils.m5965h(str));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m172137a(String str) {
        return Utils.m5960c(this.f152196a, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f152196a.equals(((pfm) obj).f152196a);
    }

    /* JADX INFO: renamed from: f */
    public boolean m172138f() {
        return !this.f152196a.isEmpty();
    }

    public int hashCode() {
        return super.hashCode();
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = this.f152196a.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (Constants.ALL_IDENTITY_KEYS.contains(next)) {
                sb.append(next);
                sb.append(it.hasNext() ? Constants.SEPARATOR_COMMA : "");
            }
        }
        return sb.toString();
    }

    private pfm(HashSet<String> hashSet) {
        HashSet<String> hashSet2 = new HashSet<>();
        this.f152196a = hashSet2;
        hashSet2.addAll(hashSet);
    }
}
