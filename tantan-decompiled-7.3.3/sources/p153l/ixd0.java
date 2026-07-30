package p153l;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Pair;
import com.tantanapp.common.utils.CrashHelper;
import com.tencent.mmkv.MMKV;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes11.dex */
public abstract class ixd0<T> {

    /* JADX INFO: renamed from: m */
    public static final HashSet<String> f117380m = new HashSet<>(Arrays.asList(hxd0.DEFAULT_FILE_NAME));

    /* JADX INFO: renamed from: n */
    public static HashSet<String> f117381n = new HashSet<>();

    /* JADX INFO: renamed from: a */
    public final String f117382a;

    /* JADX INFO: renamed from: b */
    public final String f117383b;

    /* JADX INFO: renamed from: c */
    public final T f117384c;

    /* JADX INFO: renamed from: d */
    public final boolean f117385d;

    /* JADX INFO: renamed from: e */
    public boolean f117386e = true;

    /* JADX INFO: renamed from: f */
    public T f117387f = null;

    /* JADX INFO: renamed from: g */
    public final String f117388g;

    /* JADX INFO: renamed from: h */
    public final String f117389h;

    /* JADX INFO: renamed from: i */
    public C22507a<T> f117390i;

    /* JADX INFO: renamed from: j */
    public final Context f117391j;

    /* JADX INFO: renamed from: k */
    public SharedPreferences f117392k;

    /* JADX INFO: renamed from: l */
    public SharedPreferences f117393l;

    public ixd0(Context context, String str, T t, boolean z, String str2) {
        this.f117382a = str;
        this.f117383b = str + "_backup";
        this.f117384c = t;
        this.f117385d = z;
        f117381n.add(str);
        this.f117388g = str2;
        this.f117389h = str2 + "_backup";
        this.f117391j = context;
    }

    /* JADX INFO: renamed from: a */
    public static void m142509a(String str) {
        f117380m.add(str);
    }

    /* JADX INFO: renamed from: b */
    public abstract T mo107143b();

    /* JADX INFO: renamed from: c */
    public C22421c<T> m142510c() {
        C22507a<T> c22507a = this.f117390i;
        if (c22507a != null) {
            return c22507a;
        }
        C22507a<T> c22507aM222758b = C22507a.m222758b();
        this.f117390i = c22507aM222758b;
        c22507aM222758b.onNext(mo107143b());
        return this.f117390i;
    }

    /* JADX INFO: renamed from: d */
    public SharedPreferences m142511d() {
        if (this.f117392k == null) {
            Context contextM147943a = this.f117391j;
            if (contextM147943a == null) {
                contextM147943a = k26.m147943a();
            }
            if (f117380m.contains(this.f117388g)) {
                this.f117392k = MMKV.mmkvWithID(this.f117388g, new File(contextM147943a.getFilesDir().getParent(), hxd0.MMKV_DIR).getAbsolutePath());
            } else {
                CrashHelper.m82479c(new Exception("file should use mmkv--->" + this.f117388g));
                if (kmk0.f127510c) {
                    azk0.m101074a("please contact dengxuejiu, fileName should use default fileName temporarily or add it to sets");
                    return null;
                }
                this.f117392k = contextM147943a.getSharedPreferences(this.f117388g, 0);
            }
        }
        return this.f117392k;
    }

    /* JADX INFO: renamed from: e */
    public SharedPreferences m142512e() {
        if (this.f117393l == null) {
            Context contextM147943a = this.f117391j;
            if (contextM147943a == null) {
                contextM147943a = k26.m147943a();
            }
            this.f117393l = new i4f0(contextM147943a.getSharedPreferences(this.f117389h, 0), true);
        }
        return this.f117393l;
    }

    /* JADX INFO: renamed from: f */
    public abstract T mo107144f();

    /* JADX INFO: renamed from: g */
    public abstract Pair<SharedPreferences.Editor, SharedPreferences.Editor> mo107145g(T t);
}
