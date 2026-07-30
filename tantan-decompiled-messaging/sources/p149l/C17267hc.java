package p149l;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.hc */
/* JADX INFO: loaded from: classes.dex */
public class C17267hc {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final Object f106986a;

    /* JADX INFO: renamed from: l.hc$a */
    public static class a extends AccessibilityNodeProvider {

        /* JADX INFO: renamed from: a */
        public final C17267hc f106987a;

        public a(C17267hc c17267hc) {
            this.f106987a = c17267hc;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            C17055gc c17055gcMo130361b = this.f106987a.mo130361b(i);
            if (c17055gcMo130361b == null) {
                return null;
            }
            return c17055gcMo130361b.m125394S0();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            List<C17055gc> listM130362c = this.f106987a.m130362c(str, i);
            if (listM130362c == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = listM130362c.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(listM130362c.get(i2).m125394S0());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i) {
            C17055gc c17055gcMo130363d = this.f106987a.mo130363d(i);
            if (c17055gcMo130363d == null) {
                return null;
            }
            return c17055gcMo130363d.m125394S0();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i, int i2, Bundle bundle) {
            return this.f106987a.mo130365f(i, i2, bundle);
        }
    }

    /* JADX INFO: renamed from: l.hc$b */
    @RequiresApi(26)
    public static class b extends a {
        public b(C17267hc c17267hc) {
            super(c17267hc);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f106987a.m130360a(i, C17055gc.m125351T0(accessibilityNodeInfo), str, bundle);
        }
    }

    public C17267hc() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f106986a = new b(this);
        } else {
            this.f106986a = new a(this);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public C17055gc mo130361b(int i) {
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public List<C17055gc> m130362c(@NonNull String str, int i) {
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public C17055gc mo130363d(int i) {
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public Object m130364e() {
        return this.f106986a;
    }

    /* JADX INFO: renamed from: f */
    public boolean mo130365f(int i, int i2, @Nullable Bundle bundle) {
        return false;
    }

    public C17267hc(@Nullable Object obj) {
        this.f106986a = obj;
    }

    /* JADX INFO: renamed from: a */
    public void m130360a(int i, @NonNull C17055gc c17055gc, @NonNull String str, @Nullable Bundle bundle) {
    }
}
