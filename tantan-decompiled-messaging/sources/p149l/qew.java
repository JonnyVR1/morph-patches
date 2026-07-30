package p149l;

import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.livingroom.virtual.ktv.bean.LrcWrapperBean;
import com.tantanapp.common.utils.CrashHelper;
import java.io.File;

/* JADX INFO: loaded from: classes5.dex */
public class qew {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static LrcWrapperBean m174256a(String str, File file) {
        try {
            if (file.getName().endsWith(".xml")) {
                return rew.m179061a(file);
            }
            return x4s.f191056d.equals(str) ? sew.m183724b(file) : pew.m168560b(file);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            return null;
        }
    }
}
