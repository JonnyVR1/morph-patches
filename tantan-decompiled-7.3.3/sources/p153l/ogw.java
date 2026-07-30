package p153l;

import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.livingroom.virtual.ktv.bean.LrcWrapperBean;
import com.tantanapp.common.utils.CrashHelper;
import java.io.File;

/* JADX INFO: loaded from: classes5.dex */
public class ogw {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static LrcWrapperBean m167665a(String str, File file) {
        try {
            if (file.getName().endsWith(".xml")) {
                return pgw.m172273a(file);
            }
            return y6s.f197711d.equals(str) ? qgw.m176520b(file) : ngw.m163015b(file);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            return null;
        }
    }
}
