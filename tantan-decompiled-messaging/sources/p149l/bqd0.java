package p149l;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes13.dex */
public abstract class bqd0<T> extends fpd0<T> {
    private T cloned;

    public bqd0(String str, T t) {
        super(str, t, true, fpd0.DEFAULT_FILE_NAME);
        this.cloned = null;
    }

    public abstract boolean checkEquals(@NonNull T t, T t2);

    @Override // p149l.fpd0
    public boolean clear() {
        boolean zCommit;
        this.cached = null;
        this.cloned = null;
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

    public abstract T copyed(T t, @NonNull T t2);

    @Override // p149l.fpd0
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

    @Override // p149l.fpd0
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
        C22392a<T> c22392a = this.subj;
        if (c22392a != null) {
            c22392a.onNext(this.cloned);
        }
        return zCommit;
    }

    public bqd0(Context context, String str, T t, boolean z, String str2) {
        super(context, str, t, z, str2);
        this.cloned = null;
    }

    public bqd0(String str, T t, boolean z, String str2) {
        super(str, t, z, str2);
        this.cloned = null;
    }
}
