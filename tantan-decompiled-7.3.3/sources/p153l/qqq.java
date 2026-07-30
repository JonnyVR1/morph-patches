package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.p058ui.notifications.SysnotifListener;
import com.p051p1.mobile.putong.live.base.data.BLiveJsDialogConfig;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public class qqq {

    /* JADX INFO: renamed from: a */
    public final String f159025a;

    /* JADX INFO: renamed from: b */
    public BLiveJsDialogConfig f159026b;

    /* JADX INFO: renamed from: c */
    public String f159027c;

    /* JADX INFO: renamed from: d */
    public final z20<String, String> f159028d;

    public qqq(String str, String str2, String str3, z20<String, String> z20Var) {
        this.f159025a = str;
        this.f159028d = z20Var;
        this.f159027c = str3;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            BLiveJsDialogConfig bLiveJsDialogConfig = BLiveJsDialogConfig.JSON_ADAPTER.parse(str2);
            this.f159026b = bLiveJsDialogConfig;
            bLiveJsDialogConfig.callJs = z20Var;
        } catch (IOException e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: a */
    public BLiveJsDialogConfig m177506a() {
        return this.f159026b;
    }

    /* JADX INFO: renamed from: b */
    public String m177507b() {
        return this.f159027c;
    }

    /* JADX INFO: renamed from: c */
    public boolean m177508c() {
        return TextUtils.equals(this.f159025a, SysnotifListener.ACTION_DISMISS);
    }

    /* JADX INFO: renamed from: d */
    public boolean m177509d() {
        return TextUtils.equals(this.f159025a, "show");
    }
}
