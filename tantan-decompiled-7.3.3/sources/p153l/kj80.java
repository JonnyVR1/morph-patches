package p153l;

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
@Metadata(m88120d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0001*\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006\"\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\b\"\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\b\"(\u0010\r\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\"\u0018\u0010\u0014\u001a\u00020\u0011*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m88121d2 = {"Landroid/view/View;", "", "a", "(Landroid/view/View;)V", "Landroid/view/ViewGroup;", "b", "(Landroid/view/ViewGroup;)V", "", "I", "PoolingContainerListenerHolderTag", "IsPoolingContainerTag", "", "value", "isPoolingContainer", "(Landroid/view/View;)Z", Constants.INAPP_DATA_TAG, "(Landroid/view/View;Z)V", "Ll/mj80;", "c", "(Landroid/view/View;)Ll/mj80;", "poolingContainerListenerHolder", "customview-poolingcontainer_release"}, m88122k = 2, m88123mv = {1, 6, 0}, m88125xi = 48)
@JvmName
public final class kj80 {

    /* JADX INFO: renamed from: a */
    public static final int f127079a = sdc0.f167396b;

    /* JADX INFO: renamed from: b */
    public static final int f127080b = sdc0.f167395a;

    /* JADX INFO: renamed from: a */
    public static final void m150022a(@NotNull View view) {
        view.getClass();
        Iterator<View> it = ViewKt.m1334a(view).iterator();
        while (it.hasNext()) {
            m150024c(it.next()).m158570a();
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m150023b(@NotNull ViewGroup viewGroup) {
        viewGroup.getClass();
        Iterator<View> it = ViewGroupKt.m1330b(viewGroup).iterator();
        while (it.hasNext()) {
            m150024c(it.next()).m158570a();
        }
    }

    /* JADX INFO: renamed from: c */
    public static final mj80 m150024c(View view) {
        int i = f127079a;
        mj80 mj80Var = (mj80) view.getTag(i);
        if (mj80Var != null) {
            return mj80Var;
        }
        mj80 mj80Var2 = new mj80();
        view.setTag(i, mj80Var2);
        return mj80Var2;
    }

    /* JADX INFO: renamed from: d */
    public static final void m150025d(@NotNull View view, boolean z) {
        view.getClass();
        view.setTag(f127080b, Boolean.valueOf(z));
    }
}
