package p149l;

import com.immomo.moment.filtermanager.MMPresetFilter;
import com.immomo.moment.filtermanager.MMProcessUnit;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class eki {
    /* JADX INFO: renamed from: a */
    public static String m116976a(int i, List<MMPresetFilter> list) {
        if (list != null && i < list.size() && i >= 0) {
            MMPresetFilter mMPresetFilter = list.get(i);
            if (mMPresetFilter != null && (mMPresetFilter.lookupUrl != null || mMPresetFilter.manifestUrl != null)) {
                File file = new File(mMPresetFilter.lookupUrl);
                File file2 = new File(mMPresetFilter.manifestUrl);
                if (!file.exists() && !file2.exists()) {
                    return null;
                }
            }
            for (MMProcessUnit mMProcessUnit : mMPresetFilter.getProcessUnits()) {
                if (!mMProcessUnit.isDecoration()) {
                    if (mMProcessUnit.getTexturePath1() == null || !mMProcessUnit.getTexturePath1().startsWith("light_room_filters")) {
                        return mMProcessUnit.getTexturePath1();
                    }
                    return null;
                }
            }
        }
        return null;
    }
}
