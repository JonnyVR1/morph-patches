package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.p053ui.notifications.SysnotifListener;
import com.p046p1.mobile.putong.live.base.data.BLiveJsDialogConfig;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
public class qoq {

    /* JADX INFO: renamed from: a */
    public final String f155615a;

    /* JADX INFO: renamed from: b */
    public BLiveJsDialogConfig f155616b;

    /* JADX INFO: renamed from: c */
    public String f155617c;

    /* JADX INFO: renamed from: d */
    public final f30<String, String> f155618d;

    public qoq(String str, String str2, String str3, f30<String, String> f30Var) {
        this.f155615a = str;
        this.f155618d = f30Var;
        this.f155617c = str3;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            BLiveJsDialogConfig bLiveJsDialogConfig = BLiveJsDialogConfig.JSON_ADAPTER.parse(str2);
            this.f155616b = bLiveJsDialogConfig;
            bLiveJsDialogConfig.callJs = f30Var;
        } catch (IOException e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: a */
    public BLiveJsDialogConfig m175750a() {
        return this.f155616b;
    }

    /* JADX INFO: renamed from: b */
    public String m175751b() {
        return this.f155617c;
    }

    /* JADX INFO: renamed from: c */
    public boolean m175752c() {
        return TextUtils.equals(this.f155615a, SysnotifListener.ACTION_DISMISS);
    }

    /* JADX INFO: renamed from: d */
    public boolean m175753d() {
        return TextUtils.equals(this.f155615a, "show");
    }
}
