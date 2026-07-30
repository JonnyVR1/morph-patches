package p153l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.data.LiveRight;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes9.dex */
public class d07 extends xi5 {

    /* JADX INFO: renamed from: e */
    public static String f84531e;

    /* JADX INFO: renamed from: a */
    public HashMap<String, String> f84532a;

    /* JADX INFO: renamed from: b */
    public ConcurrentHashMap<String, LiveRight> f84533b;

    /* JADX INFO: renamed from: c */
    public String f84534c;

    /* JADX INFO: renamed from: d */
    public wyd0 f84535d;

    static {
        if (NullChecker.m82486a(App.f16088e.getExternalCacheDir())) {
            f84531e = App.f16088e.getExternalCacheDir().getAbsolutePath();
        } else {
            f84531e = App.f16088e.getCacheDir().getAbsolutePath();
        }
    }

    public d07(xi5 xi5Var) {
        super(xi5Var);
        this.f84532a = new HashMap<>();
        this.f84533b = new ConcurrentHashMap<>();
        this.f84534c = f84531e + "/LiveRight/";
        this.f84535d = new wyd0("liveRightCacheFileVersion", "");
    }

    @Nullable
    /* JADX INFO: renamed from: x */
    public String m113364x(String str) {
        return (TextUtils.isEmpty(str) || !this.f84532a.containsKey(str)) ? "" : this.f84532a.get(str);
    }

    /* JADX INFO: renamed from: y */
    public LiveRight m113365y(String str) {
        return this.f84533b.get(str);
    }
}
