package p153l;

import android.content.Context;
import android.content.SharedPreferences;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes11.dex */
public abstract class azd0<T> extends hxd0<T> {
    public azd0(String str, T t) {
        this(str, t, true, hxd0.DEFAULT_FILE_NAME);
    }

    @Override // p153l.hxd0
    public boolean clear() {
        boolean zCommit;
        this.cached = null;
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

    @Override // p153l.hxd0
    public T defaultValue() {
        return this.defaultValue;
    }

    @Override // p153l.hxd0
    public T get() {
        if (this.empty) {
            this.cached = retrieveValue();
            this.empty = false;
        }
        return this.cached;
    }

    @Override // p153l.hxd0
    public boolean put(T t) {
        if (this.cached != null && this.cached.equals(t)) {
            return true;
        }
        SharedPreferences.Editor editorSaveValue = saveValue(t);
        this.cached = t;
        boolean zCommit = false;
        this.empty = false;
        if (this.async) {
            editorSaveValue.apply();
        } else {
            zCommit = editorSaveValue.commit();
        }
        C22507a<T> c22507a = this.subj;
        if (c22507a != null) {
            c22507a.onNext(this.cached);
        }
        return zCommit;
    }

    @Override // p153l.hxd0
    public abstract T retrieveValue();

    @Override // p153l.hxd0
    public abstract SharedPreferences.Editor saveValue(T t);

    public azd0(Context context, String str, T t, boolean z, String str2) {
        super(context, str, t, z, str2);
    }

    public azd0(String str, T t, boolean z, String str2) {
        super(str, t, z, str2);
    }
}
