package p153l;

import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import java.util.Collection;
import java.util.HashSet;

/* JADX INFO: loaded from: classes11.dex */
public class xyd0 extends dyd0<HashSet<String>> {
    public xyd0(String str, HashSet hashSet) {
        super(str, hashSet);
    }

    @Override // p153l.dyd0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean checkEquals(@NonNull HashSet<String> hashSet, HashSet<String> hashSet2) {
        return hashSet.equals(hashSet2);
    }

    @Override // p153l.dyd0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public HashSet<String> copyed(HashSet<String> hashSet, @NonNull HashSet<String> hashSet2) {
        return (HashSet) hashSet2.clone();
    }

    @Override // p153l.hxd0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public HashSet<String> retrieveValue() {
        return (HashSet) pref().getStringSet(this.f111993id, this.defaultValue != 0 ? new HashSet((Collection) this.defaultValue) : null);
    }

    @Override // p153l.hxd0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public SharedPreferences.Editor saveValue(HashSet hashSet) {
        return pref().edit().putStringSet(this.f111993id, hashSet);
    }
}
