package p149l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.immomo.mwc.sdk.MWCEngine;
import java.io.File;
import org.eclipse.jetty.util.StringUtil;

/* JADX INFO: loaded from: classes2.dex */
public class dow implements kpq {

    /* JADX INFO: renamed from: a */
    private v750 f87208a;

    /* JADX INFO: renamed from: b */
    private String f87209b = null;

    /* JADX INFO: renamed from: c */
    private String f87210c = null;

    public dow() {
        try {
            this.f87208a = yhw.m214862s().m214871t("1002065");
        } catch (Throwable th) {
            MWCEngine.m19382m("MWCJsfProviderImpl", null, "get:jsf:package:info:exception @error=%s", th);
        }
    }

    @Override // p149l.kpq
    @NonNull
    /* JADX INFO: renamed from: a */
    public String mo112828a() {
        h460 h460VarM217446q;
        String str = this.f87210c;
        if (str != null) {
            return str;
        }
        this.f87210c = "";
        v750 v750Var = this.f87208a;
        if (v750Var == null) {
            return "";
        }
        String strM197337c = v750Var.m197337c();
        try {
            h460VarM217446q = z750.m217446q(strM197337c);
        } catch (Throwable th) {
            MWCEngine.m19382m("MWCJsfProviderImpl", null, "read:jsf:package:configs:exception @error=%s", th);
            h460VarM217446q = null;
        }
        if (h460VarM217446q != null) {
            File[] fileArrListFiles = new File(strM197337c + File.separator + h460VarM217446q.m129225f()).listFiles();
            if (fileArrListFiles != null) {
                for (File file : fileArrListFiles) {
                    if ("mwc-jsf.js".equals(file.getName())) {
                        if (file.canRead()) {
                            String absolutePath = file.getAbsolutePath();
                            this.f87210c = absolutePath;
                            return absolutePath;
                        }
                        MWCEngine.m19374Q("MWCJsfProviderImpl", null, "unable to read the jsf file in the offline package, so replace it with the assets resource: %s", "mwc-jsf.js");
                    }
                }
            }
        }
        return this.f87210c;
    }

    @Override // p149l.kpq
    @NonNull
    /* JADX INFO: renamed from: b */
    public String mo112829b() {
        String str = this.f87209b;
        if (str != null) {
            return str;
        }
        if (this.f87208a == null || (this.f87210c == null && TextUtils.isEmpty(mo112828a()))) {
            this.f87209b = StringUtil.ALL_INTERFACES;
            return StringUtil.ALL_INTERFACES;
        }
        String strM197341g = this.f87208a.m197341g();
        this.f87209b = strM197341g;
        return strM197341g;
    }
}
