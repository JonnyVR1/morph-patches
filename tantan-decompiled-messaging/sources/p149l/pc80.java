package p149l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.p048ui.poplevel.PopLifecycleEvent;
import java.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
public final class pc80 {

    /* JADX INFO: renamed from: a */
    public PopLifecycleEvent f148149a;

    /* JADX INFO: renamed from: b */
    public boolean f148150b;

    /* JADX INFO: renamed from: c */
    public String f148151c;

    public pc80(PopLifecycleEvent popLifecycleEvent, boolean z, String str) {
        this.f148149a = popLifecycleEvent;
        this.f148150b = z;
        this.f148151c = str;
    }

    /* JADX INFO: renamed from: a */
    public static pc80 m168320a(PopLifecycleEvent popLifecycleEvent, boolean z, String str) {
        return new pc80(popLifecycleEvent, z, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && pc80.class == obj.getClass()) {
            pc80 pc80Var = (pc80) obj;
            if (Objects.equals(this.f148149a, pc80Var.f148149a) && Boolean.valueOf(this.f148150b).equals(Boolean.valueOf(pc80Var.f148150b)) && TextUtils.equals(this.f148151c, pc80Var.f148151c)) {
                return true;
            }
        }
        return false;
    }
}
