package p149l;

import android.net.Uri;
import androidx.annotation.NonNull;
import immomo.com.mklibrary.fep.FepStrategyInfo;
import immomo.com.mklibrary.fep.FepVersion;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class am10 extends AbstractC17922k4 {
    public am10(@NonNull String str, FepStrategyInfo fepStrategyInfo) {
        super(str, 0L, fepStrategyInfo);
        if (fepStrategyInfo != null) {
            this.f120919g = fepStrategyInfo.getProject();
        }
    }

    @Override // p149l.AbstractC17922k4
    /* JADX INFO: renamed from: g */
    public String mo97466g(@NonNull String str) {
        try {
            if (m144452c(this.f120919g) && m144452c(str)) {
                FepVersion fepVersionM144457i = m144457i(str);
                if (m144460m(fepVersionM144457i)) {
                    return super.m144458j(str);
                }
                if (m144461n(fepVersionM144457i)) {
                    boolean zM144448l = AbstractC17922k4.m144448l(str);
                    Uri uri = Uri.parse(str);
                    List<String> pathSegments = uri.getPathSegments();
                    Uri.Builder builderBuildUpon = uri.buildUpon();
                    builderBuildUpon.path("");
                    int i = -1;
                    for (int i2 = 0; i2 < pathSegments.size(); i2++) {
                        String str2 = pathSegments.get(i2);
                        builderBuildUpon.appendPath(str2);
                        if (zM144448l) {
                            if (i < 0 && b0g0.m99768a(str2, "v-")) {
                                i = i2 + 1;
                            }
                        } else if (i < 0 && b0g0.m99768a(str2, this.f120919g)) {
                            int i3 = i2 + 1;
                            if (i3 < pathSegments.size()) {
                                while (b0g0.m99768a(pathSegments.get(i3), this.f120919g) && (i3 = i3 + 1) < pathSegments.size()) {
                                }
                                i = i3 - 1;
                            } else {
                                i = i2;
                            }
                        }
                        if (i > 0 && i == i2) {
                            if (!zM144448l) {
                                builderBuildUpon.appendPath("grey");
                            } else if (AbstractC17922k4.f120912j.matcher(str2).matches()) {
                                builderBuildUpon.appendPath("grey");
                            }
                        }
                    }
                    return m144458j(builderBuildUpon.toString());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return super.mo97466g(str);
    }
}
