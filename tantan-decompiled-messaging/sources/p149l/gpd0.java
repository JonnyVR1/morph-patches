package p149l;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Pair;
import com.tantanapp.common.utils.CrashHelper;
import com.tencent.mmkv.MMKV;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes13.dex */
public abstract class gpd0<T> {

    /* JADX INFO: renamed from: m */
    public static final HashSet<String> f103781m = new HashSet<>(Arrays.asList(fpd0.DEFAULT_FILE_NAME));

    /* JADX INFO: renamed from: n */
    public static HashSet<String> f103782n = new HashSet<>();

    /* JADX INFO: renamed from: a */
    public final String f103783a;

    /* JADX INFO: renamed from: b */
    public final String f103784b;

    /* JADX INFO: renamed from: c */
    public final T f103785c;

    /* JADX INFO: renamed from: d */
    public final boolean f103786d;

    /* JADX INFO: renamed from: e */
    public boolean f103787e = true;

    /* JADX INFO: renamed from: f */
    public T f103788f = null;

    /* JADX INFO: renamed from: g */
    public final String f103789g;

    /* JADX INFO: renamed from: h */
    public final String f103790h;

    /* JADX INFO: renamed from: i */
    public C22392a<T> f103791i;

    /* JADX INFO: renamed from: j */
    public final Context f103792j;

    /* JADX INFO: renamed from: k */
    public SharedPreferences f103793k;

    /* JADX INFO: renamed from: l */
    public SharedPreferences f103794l;

    public gpd0(Context context, String str, T t, boolean z, String str2) {
        this.f103783a = str;
        this.f103784b = str + "_backup";
        this.f103785c = t;
        this.f103786d = z;
        f103782n.add(str);
        this.f103789g = str2;
        this.f103790h = str2 + "_backup";
        this.f103792j = context;
    }

    /* JADX INFO: renamed from: a */
    public static void m127347a(String str) {
        f103781m.add(str);
    }

    /* JADX INFO: renamed from: b */
    public abstract T mo108248b();

    /* JADX INFO: renamed from: c */
    public C22306c<T> m127348c() {
        C22392a<T> c22392a = this.f103791i;
        if (c22392a != null) {
            return c22392a;
        }
        C22392a<T> c22392aM221512b = C22392a.m221512b();
        this.f103791i = c22392aM221512b;
        c22392aM221512b.onNext(mo108248b());
        return this.f103791i;
    }

    /* JADX INFO: renamed from: d */
    public SharedPreferences m127349d() {
        if (this.f103793k == null) {
            Context contextM119092a = this.f103792j;
            if (contextM119092a == null) {
                contextM119092a = f16.m119092a();
            }
            if (f103781m.contains(this.f103789g)) {
                this.f103793k = MMKV.mmkvWithID(this.f103789g, new File(contextM119092a.getFilesDir().getParent(), fpd0.MMKV_DIR).getAbsolutePath());
            } else {
                CrashHelper.m81296c(new Exception("file should use mmkv--->" + this.f103789g));
                if (edk0.f90613c) {
                    upk0.m194883a("please contact dengxuejiu, fileName should use default fileName temporarily or add it to sets");
                    return null;
                }
                this.f103793k = contextM119092a.getSharedPreferences(this.f103789g, 0);
            }
        }
        return this.f103793k;
    }

    /* JADX INFO: renamed from: e */
    public SharedPreferences m127350e() {
        if (this.f103794l == null) {
            Context contextM119092a = this.f103792j;
            if (contextM119092a == null) {
                contextM119092a = f16.m119092a();
            }
            this.f103794l = new bwe0(contextM119092a.getSharedPreferences(this.f103790h, 0), true);
        }
        return this.f103794l;
    }

    /* JADX INFO: renamed from: f */
    public abstract T mo117618f();

    /* JADX INFO: renamed from: g */
    public abstract Pair<SharedPreferences.Editor, SharedPreferences.Editor> mo117619g(T t);
}
