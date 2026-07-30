package p149l;

import android.content.Context;
import android.content.SharedPreferences;
import com.tantanapp.common.utils.CrashHelper;
import com.tencent.mmkv.MMKV;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes13.dex */
public abstract class fpd0<T> {
    public static final String MMKV_DIR = "tantan_save_value_dir";
    protected final boolean async;
    protected volatile T cached;
    protected final Context context;
    protected final T defaultValue;
    protected volatile boolean empty;

    /* JADX INFO: renamed from: id */
    protected final String f98687id;
    private SharedPreferences mSp;
    protected final String preferenceFileName;
    protected C22392a<T> subj;
    public static final String DEFAULT_FILE_NAME = "preferences";
    private static final HashSet<String> sets = new HashSet<>(Arrays.asList(DEFAULT_FILE_NAME));
    public static HashSet<String> debugNames = new HashSet<>();

    public fpd0(Context context, String str, T t, boolean z, String str2) {
        this.empty = true;
        this.cached = null;
        this.f98687id = str;
        this.defaultValue = t;
        this.async = z;
        debugNames.add(str);
        this.preferenceFileName = str2;
        this.context = context;
    }

    public static void addSpName2MMKVSet(String str) {
        sets.add(str);
    }

    public abstract boolean clear();

    public T defaultValue() {
        return this.defaultValue;
    }

    public abstract T get();

    public C22306c<T> obs() {
        C22392a<T> c22392a = this.subj;
        if (c22392a != null) {
            return c22392a;
        }
        C22392a<T> c22392aM221512b = C22392a.m221512b();
        this.subj = c22392aM221512b;
        c22392aM221512b.onNext(get());
        return this.subj;
    }

    public SharedPreferences pref() {
        if (this.mSp == null) {
            Context contextM119092a = this.context;
            if (contextM119092a == null) {
                contextM119092a = f16.m119092a();
            }
            if (sets.contains(this.preferenceFileName)) {
                this.mSp = MMKV.mmkvWithID(this.preferenceFileName, new File(contextM119092a.getFilesDir().getParent(), MMKV_DIR).getAbsolutePath());
            } else {
                CrashHelper.m81296c(new Exception("file should use mmkv--->" + this.preferenceFileName));
                if (edk0.f90613c) {
                    upk0.m194883a("please contact dengxuejiu, fileName should use default fileName temporarily or add it to sets");
                    return null;
                }
                this.mSp = contextM119092a.getSharedPreferences(this.preferenceFileName, 0);
            }
        }
        return this.mSp;
    }

    public abstract boolean put(T t);

    public abstract T retrieveValue();

    public abstract SharedPreferences.Editor saveValue(T t);

    public fpd0(String str, T t, boolean z, String str2) {
        this(null, str, t, z, str2);
    }

    public fpd0(String str, T t) {
        this(str, t, true, DEFAULT_FILE_NAME);
    }
}
