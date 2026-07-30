package p153l;

import android.content.Context;
import android.content.SharedPreferences;
import com.tantanapp.common.utils.CrashHelper;
import com.tencent.mmkv.MMKV;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes11.dex */
public abstract class hxd0<T> {
    public static final String MMKV_DIR = "tantan_save_value_dir";
    protected final boolean async;
    protected volatile T cached;
    protected final Context context;
    protected final T defaultValue;
    protected volatile boolean empty;

    /* JADX INFO: renamed from: id */
    protected final String f111993id;
    private SharedPreferences mSp;
    protected final String preferenceFileName;
    protected C22507a<T> subj;
    public static final String DEFAULT_FILE_NAME = "preferences";
    private static final HashSet<String> sets = new HashSet<>(Arrays.asList(DEFAULT_FILE_NAME));
    public static HashSet<String> debugNames = new HashSet<>();

    public hxd0(Context context, String str, T t, boolean z, String str2) {
        this.empty = true;
        this.cached = null;
        this.f111993id = str;
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

    public C22421c<T> obs() {
        C22507a<T> c22507a = this.subj;
        if (c22507a != null) {
            return c22507a;
        }
        C22507a<T> c22507aM222758b = C22507a.m222758b();
        this.subj = c22507aM222758b;
        c22507aM222758b.onNext(get());
        return this.subj;
    }

    public SharedPreferences pref() {
        if (this.mSp == null) {
            Context contextM147943a = this.context;
            if (contextM147943a == null) {
                contextM147943a = k26.m147943a();
            }
            if (sets.contains(this.preferenceFileName)) {
                this.mSp = MMKV.mmkvWithID(this.preferenceFileName, new File(contextM147943a.getFilesDir().getParent(), MMKV_DIR).getAbsolutePath());
            } else {
                CrashHelper.m82479c(new Exception("file should use mmkv--->" + this.preferenceFileName));
                if (kmk0.f127510c) {
                    azk0.m101074a("please contact dengxuejiu, fileName should use default fileName temporarily or add it to sets");
                    return null;
                }
                this.mSp = contextM147943a.getSharedPreferences(this.preferenceFileName, 0);
            }
        }
        return this.mSp;
    }

    public abstract boolean put(T t);

    public abstract T retrieveValue();

    public abstract SharedPreferences.Editor saveValue(T t);

    public hxd0(String str, T t, boolean z, String str2) {
        this(null, str, t, z, str2);
    }

    public hxd0(String str, T t) {
        this(str, t, true, DEFAULT_FILE_NAME);
    }
}
