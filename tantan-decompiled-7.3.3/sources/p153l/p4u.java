package p153l;

import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public interface p4u {
    /* JADX INFO: renamed from: h */
    default boolean m170580h(@NonNull List<Object> list) {
        if (jyb.m147479J(list)) {
            return false;
        }
        Object obj = list.get(0);
        return (obj instanceof Integer) && ((Integer) obj).intValue() == 2;
    }
}
