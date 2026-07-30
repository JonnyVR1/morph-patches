package p149l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.data.LiveRight;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes9.dex */
public class az6 extends xh5 {

    /* JADX INFO: renamed from: e */
    public static String f72333e;

    /* JADX INFO: renamed from: a */
    public HashMap<String, String> f72334a;

    /* JADX INFO: renamed from: b */
    public ConcurrentHashMap<String, LiveRight> f72335b;

    /* JADX INFO: renamed from: c */
    public String f72336c;

    /* JADX INFO: renamed from: d */
    public uqd0 f72337d;

    static {
        if (NullChecker.m81303a(App.f15369e.getExternalCacheDir())) {
            f72333e = App.f15369e.getExternalCacheDir().getAbsolutePath();
        } else {
            f72333e = App.f15369e.getCacheDir().getAbsolutePath();
        }
    }

    public az6(xh5 xh5Var) {
        super(xh5Var);
        this.f72334a = new HashMap<>();
        this.f72335b = new ConcurrentHashMap<>();
        this.f72336c = f72333e + "/LiveRight/";
        this.f72337d = new uqd0("liveRightCacheFileVersion", "");
    }

    @Nullable
    /* JADX INFO: renamed from: x */
    public String m99639x(String str) {
        return (TextUtils.isEmpty(str) || !this.f72334a.containsKey(str)) ? "" : this.f72334a.get(str);
    }

    /* JADX INFO: renamed from: y */
    public LiveRight m99640y(String str) {
        return this.f72335b.get(str);
    }
}
