package p006l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.data.LiveRight;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import l.uqd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class az6 extends xh5 {

    /* JADX INFO: renamed from: e */
    public static String f8613e;

    /* JADX INFO: renamed from: a */
    public HashMap<String, String> f8614a;

    /* JADX INFO: renamed from: b */
    public ConcurrentHashMap<String, LiveRight> f8615b;

    /* JADX INFO: renamed from: c */
    public String f8616c;

    /* JADX INFO: renamed from: d */
    public uqd0 f8617d;

    static {
        if (NullChecker.a(App.e.getExternalCacheDir())) {
            f8613e = App.e.getExternalCacheDir().getAbsolutePath();
        } else {
            f8613e = App.e.getCacheDir().getAbsolutePath();
        }
    }

    public az6(xh5 xh5Var) {
        super(xh5Var);
        this.f8614a = new HashMap<>();
        this.f8615b = new ConcurrentHashMap<>();
        this.f8616c = f8613e + "/LiveRight/";
        this.f8617d = new uqd0("liveRightCacheFileVersion", "");
    }

    @Nullable
    /* JADX INFO: renamed from: x */
    public String m12348x(String str) {
        return (TextUtils.isEmpty(str) || !this.f8614a.containsKey(str)) ? "" : this.f8614a.get(str);
    }

    /* JADX INFO: renamed from: y */
    public LiveRight m12349y(String str) {
        return this.f8615b.get(str);
    }
}
