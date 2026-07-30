package p153l;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.cc */
/* JADX INFO: loaded from: classes.dex */
public class C16226cc {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final Object f80879a;

    /* JADX INFO: renamed from: l.cc$a */
    public static class a extends AccessibilityNodeProvider {

        /* JADX INFO: renamed from: a */
        public final C16226cc f80880a;

        public a(C16226cc c16226cc) {
            this.f80880a = c16226cc;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            C15967bc c15967bcMo108693b = this.f80880a.mo108693b(i);
            if (c15967bcMo108693b == null) {
                return null;
            }
            return c15967bcMo108693b.m103398S0();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            List<C15967bc> listM108694c = this.f80880a.m108694c(str, i);
            if (listM108694c == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = listM108694c.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(listM108694c.get(i2).m103398S0());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i) {
            C15967bc c15967bcMo108695d = this.f80880a.mo108695d(i);
            if (c15967bcMo108695d == null) {
                return null;
            }
            return c15967bcMo108695d.m103398S0();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i, int i2, Bundle bundle) {
            return this.f80880a.mo108697f(i, i2, bundle);
        }
    }

    /* JADX INFO: renamed from: l.cc$b */
    @RequiresApi(26)
    public static class b extends a {
        public b(C16226cc c16226cc) {
            super(c16226cc);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f80880a.m108692a(i, C15967bc.m103355T0(accessibilityNodeInfo), str, bundle);
        }
    }

    public C16226cc() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f80879a = new b(this);
        } else {
            this.f80879a = new a(this);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public C15967bc mo108693b(int i) {
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public List<C15967bc> m108694c(@NonNull String str, int i) {
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public C15967bc mo108695d(int i) {
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public Object m108696e() {
        return this.f80879a;
    }

    /* JADX INFO: renamed from: f */
    public boolean mo108697f(int i, int i2, @Nullable Bundle bundle) {
        return false;
    }

    public C16226cc(@Nullable Object obj) {
        this.f80879a = obj;
    }

    /* JADX INFO: renamed from: a */
    public void m108692a(int i, @NonNull C15967bc c15967bc, @NonNull String str, @Nullable Bundle bundle) {
    }
}
