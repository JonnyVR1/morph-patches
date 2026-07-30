package p007l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p003p1.mobile.android.p005ui.poplevel.PopLifecycleEvent;
import java.util.Objects;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public final class pc80 {

    /* JADX INFO: renamed from: a */
    public PopLifecycleEvent f3709a;

    /* JADX INFO: renamed from: b */
    public boolean f3710b;

    /* JADX INFO: renamed from: c */
    public String f3711c;

    public pc80(PopLifecycleEvent popLifecycleEvent, boolean z, String str) {
        this.f3709a = popLifecycleEvent;
        this.f3710b = z;
        this.f3711c = str;
    }

    /* JADX INFO: renamed from: a */
    public static pc80 m10251a(PopLifecycleEvent popLifecycleEvent, boolean z, String str) {
        return new pc80(popLifecycleEvent, z, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && pc80.class == obj.getClass()) {
            pc80 pc80Var = (pc80) obj;
            if (Objects.equals(this.f3709a, pc80Var.f3709a) && Boolean.valueOf(this.f3710b).equals(Boolean.valueOf(pc80Var.f3710b)) && TextUtils.equals(this.f3711c, pc80Var.f3711c)) {
                return true;
            }
        }
        return false;
    }
}
