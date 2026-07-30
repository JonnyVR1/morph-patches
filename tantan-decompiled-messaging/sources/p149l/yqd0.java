package p149l;

import android.content.Context;
import android.content.SharedPreferences;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes13.dex */
public abstract class yqd0<T> extends fpd0<T> {
    public yqd0(String str, T t) {
        this(str, t, true, fpd0.DEFAULT_FILE_NAME);
    }

    @Override // p149l.fpd0
    public boolean clear() {
        boolean zCommit;
        this.cached = null;
        this.empty = true;
        SharedPreferences.Editor editorRemove = pref().edit().remove(this.f98687id);
        if (this.async) {
            editorRemove.apply();
            zCommit = false;
        } else {
            zCommit = editorRemove.commit();
        }
        C22392a<T> c22392a = this.subj;
        if (c22392a != null) {
            c22392a.onNext(null);
        }
        return zCommit;
    }

    @Override // p149l.fpd0
    public T defaultValue() {
        return this.defaultValue;
    }

    @Override // p149l.fpd0
    public T get() {
        if (this.empty) {
            this.cached = retrieveValue();
            this.empty = false;
        }
        return this.cached;
    }

    @Override // p149l.fpd0
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
        C22392a<T> c22392a = this.subj;
        if (c22392a != null) {
            c22392a.onNext(this.cached);
        }
        return zCommit;
    }

    @Override // p149l.fpd0
    public abstract T retrieveValue();

    @Override // p149l.fpd0
    public abstract SharedPreferences.Editor saveValue(T t);

    public yqd0(Context context, String str, T t, boolean z, String str2) {
        super(context, str, t, z, str2);
    }

    public yqd0(String str, T t, boolean z, String str2) {
        super(str, t, z, str2);
    }
}
