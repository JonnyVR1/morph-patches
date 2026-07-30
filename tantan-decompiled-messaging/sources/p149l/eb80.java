package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewGroupKt;
import androidx.core.view.ViewKt;
import com.clevertap.android.sdk.Constants;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0001*\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006\"\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\b\"\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\b\"(\u0010\r\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\"\u0018\u0010\u0014\u001a\u00020\u0011*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m87232d2 = {"Landroid/view/View;", "", "a", "(Landroid/view/View;)V", "Landroid/view/ViewGroup;", "b", "(Landroid/view/ViewGroup;)V", "", "I", "PoolingContainerListenerHolderTag", "IsPoolingContainerTag", "", "value", "isPoolingContainer", "(Landroid/view/View;)Z", Constants.INAPP_DATA_TAG, "(Landroid/view/View;Z)V", "Ll/gb80;", "c", "(Landroid/view/View;)Ll/gb80;", "poolingContainerListenerHolder", "customview-poolingcontainer_release"}, m87233k = 2, m87234mv = {1, 6, 0}, m87236xi = 48)
@JvmName
public final class eb80 {

    /* JADX INFO: renamed from: a */
    public static final int f90307a = n5c0.f137203b;

    /* JADX INFO: renamed from: b */
    public static final int f90308b = n5c0.f137202a;

    /* JADX INFO: renamed from: a */
    public static final void m115459a(@NotNull View view) {
        view.getClass();
        Iterator<View> it = ViewKt.m1333a(view).iterator();
        while (it.hasNext()) {
            m115461c(it.next()).m125124a();
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m115460b(@NotNull ViewGroup viewGroup) {
        viewGroup.getClass();
        Iterator<View> it = ViewGroupKt.m1329b(viewGroup).iterator();
        while (it.hasNext()) {
            m115461c(it.next()).m125124a();
        }
    }

    /* JADX INFO: renamed from: c */
    public static final gb80 m115461c(View view) {
        int i = f90307a;
        gb80 gb80Var = (gb80) view.getTag(i);
        if (gb80Var != null) {
            return gb80Var;
        }
        gb80 gb80Var2 = new gb80();
        view.setTag(i, gb80Var2);
        return gb80Var2;
    }

    /* JADX INFO: renamed from: d */
    public static final void m115462d(@NotNull View view, boolean z) {
        view.getClass();
        view.setTag(f90308b, Boolean.valueOf(z));
    }
}
