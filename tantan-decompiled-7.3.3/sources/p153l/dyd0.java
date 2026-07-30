package p153l;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes11.dex */
public abstract class dyd0<T> extends hxd0<T> {
    private T cloned;

    public dyd0(String str, T t) {
        super(str, t, true, hxd0.DEFAULT_FILE_NAME);
        this.cloned = null;
    }

    public abstract boolean checkEquals(@NonNull T t, T t2);

    @Override // p153l.hxd0
    public boolean clear() {
        boolean zCommit;
        this.cached = null;
        this.cloned = null;
        this.empty = true;
        SharedPreferences.Editor editorRemove = pref().edit().remove(this.f111993id);
        if (this.async) {
            editorRemove.apply();
            zCommit = false;
        } else {
            zCommit = editorRemove.commit();
        }
        C22507a<T> c22507a = this.subj;
        if (c22507a != null) {
            c22507a.onNext(null);
        }
        return zCommit;
    }

    public abstract T copyed(T t, @NonNull T t2);

    @Override // p153l.hxd0
    public final T get() {
        if (this.empty) {
            this.cached = retrieveValue();
            this.empty = false;
            if (this.cached == null) {
                this.cloned = null;
            } else {
                this.cloned = copyed(this.cloned, this.cached);
            }
        }
        return this.cloned;
    }

    @Override // p153l.hxd0
    public boolean put(T t) {
        if (this.cached != null && checkEquals(this.cached, t)) {
            return true;
        }
        SharedPreferences.Editor editorSaveValue = saveValue(t);
        if (t == null) {
            this.cached = null;
            this.cloned = null;
        } else {
            this.cached = copyed(this.cached, t);
            this.cloned = copyed(this.cloned, t);
        }
        boolean zCommit = false;
        this.empty = false;
        if (this.async) {
            editorSaveValue.apply();
        } else {
            zCommit = editorSaveValue.commit();
        }
        C22507a<T> c22507a = this.subj;
        if (c22507a != null) {
            c22507a.onNext(this.cloned);
        }
        return zCommit;
    }

    public dyd0(Context context, String str, T t, boolean z, String str2) {
        super(context, str, t, z, str2);
        this.cloned = null;
    }

    public dyd0(String str, T t, boolean z, String str2) {
        super(str, t, z, str2);
        this.cloned = null;
    }
}
