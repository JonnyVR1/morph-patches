package p153l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.hellogroup.fep.base.core.FepManager;
import com.hellogroup.fep.feppkg.internal.core.CheckPolicy;
import com.hellogroup.fep.feppkg.model.FepPackageConfig;
import com.immomo.mwc.sdk.MWCEngine;
import java.io.File;
import org.eclipse.jetty.util.StringUtil;

/* JADX INFO: loaded from: classes7.dex */
public class crw implements krq {

    /* JADX INFO: renamed from: a */
    private zgi f83368a;

    /* JADX INFO: renamed from: b */
    private String f83369b = null;

    /* JADX INFO: renamed from: c */
    private String f83370c = null;

    public crw() {
        try {
            this.f83368a = FepManager.m17582z().m17591l("https://g.immomo.com/fep/momo/m-fes-sdk/mwc-js-sdk/mwc-jsf.js?_bid=1002065", CheckPolicy.LOCAL_ONLY);
        } catch (Throwable th) {
            MWCEngine.m20362m("MWCJsfProviderImpl", null, "get:jsf:package:info:exception @error=%s", th);
        }
    }

    @Override // p153l.krq
    @NonNull
    /* JADX INFO: renamed from: a */
    public String mo112087a() {
        String str = this.f83370c;
        if (str != null) {
            return str;
        }
        this.f83370c = "";
        zgi zgiVar = this.f83368a;
        if (zgiVar == null) {
            return "";
        }
        String strM219626i = zgiVar.m219626i();
        FepPackageConfig fepPackageConfigM219623f = this.f83368a.m219623f();
        if (fepPackageConfigM219623f != null) {
            File[] fileArrListFiles = new File(strM219626i + File.separator + fepPackageConfigM219623f.getUrl()).listFiles();
            if (fileArrListFiles != null) {
                for (File file : fileArrListFiles) {
                    if ("mwc-jsf.js".equals(file.getName())) {
                        if (file.canRead()) {
                            String absolutePath = file.getAbsolutePath();
                            this.f83370c = absolutePath;
                            return absolutePath;
                        }
                        MWCEngine.m20354Q("MWCJsfProviderImpl", null, "unable to read the jsf file in the offline package, so replace it with the assets resource: %s", "mwc-jsf.js");
                    }
                }
            }
        }
        return this.f83370c;
    }

    @Override // p153l.krq
    @NonNull
    /* JADX INFO: renamed from: b */
    public String mo112088b() {
        String str = this.f83369b;
        if (str != null) {
            return str;
        }
        if (this.f83368a == null || (this.f83370c == null && TextUtils.isEmpty(mo112087a()))) {
            this.f83369b = StringUtil.ALL_INTERFACES;
            return StringUtil.ALL_INTERFACES;
        }
        FepPackageConfig fepPackageConfigM219623f = this.f83368a.m219623f();
        if (fepPackageConfigM219623f != null) {
            this.f83369b = fepPackageConfigM219623f.getVersionStr();
        }
        return this.f83369b;
    }
}
