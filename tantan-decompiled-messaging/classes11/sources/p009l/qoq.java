package p009l;

import android.text.TextUtils;
import com.p1.mobile.putong.live.base.data.BLiveJsDialogConfig;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;
import l.f30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class qoq {

    /* JADX INFO: renamed from: a */
    public final String f19416a;

    /* JADX INFO: renamed from: b */
    public BLiveJsDialogConfig f19417b;

    /* JADX INFO: renamed from: c */
    public String f19418c;

    /* JADX INFO: renamed from: d */
    public final f30<String, String> f19419d;

    public qoq(String str, String str2, String str3, f30<String, String> f30Var) {
        this.f19416a = str;
        this.f19419d = f30Var;
        this.f19418c = str3;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            BLiveJsDialogConfig bLiveJsDialogConfig = (BLiveJsDialogConfig) BLiveJsDialogConfig.JSON_ADAPTER.parse(str2);
            this.f19417b = bLiveJsDialogConfig;
            bLiveJsDialogConfig.callJs = f30Var;
        } catch (IOException e) {
            CrashHelper.c(e);
        }
    }

    /* JADX INFO: renamed from: a */
    public BLiveJsDialogConfig m21125a() {
        return this.f19417b;
    }

    /* JADX INFO: renamed from: b */
    public String m21126b() {
        return this.f19418c;
    }

    /* JADX INFO: renamed from: c */
    public boolean m21127c() {
        return TextUtils.equals(this.f19416a, "dismiss");
    }

    /* JADX INFO: renamed from: d */
    public boolean m21128d() {
        return TextUtils.equals(this.f19416a, "show");
    }
}
