package p149l;

import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public interface o2u {
    /* JADX INFO: renamed from: h */
    default boolean m162323h(@NonNull List<Object> list) {
        if (vwb.m200296J(list)) {
            return false;
        }
        Object obj = list.get(0);
        return (obj instanceof Integer) && ((Integer) obj).intValue() == 2;
    }
}
