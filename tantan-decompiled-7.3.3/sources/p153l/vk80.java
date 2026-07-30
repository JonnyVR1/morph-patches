package p153l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.p053ui.poplevel.PopLifecycleEvent;
import java.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
public final class vk80 {

    /* JADX INFO: renamed from: a */
    public PopLifecycleEvent f184465a;

    /* JADX INFO: renamed from: b */
    public boolean f184466b;

    /* JADX INFO: renamed from: c */
    public String f184467c;

    public vk80(PopLifecycleEvent popLifecycleEvent, boolean z, String str) {
        this.f184465a = popLifecycleEvent;
        this.f184466b = z;
        this.f184467c = str;
    }

    /* JADX INFO: renamed from: a */
    public static vk80 m201567a(PopLifecycleEvent popLifecycleEvent, boolean z, String str) {
        return new vk80(popLifecycleEvent, z, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && vk80.class == obj.getClass()) {
            vk80 vk80Var = (vk80) obj;
            if (Objects.equals(this.f184465a, vk80Var.f184465a) && Boolean.valueOf(this.f184466b).equals(Boolean.valueOf(vk80Var.f184466b)) && TextUtils.equals(this.f184467c, vk80Var.f184467c)) {
                return true;
            }
        }
        return false;
    }
}
