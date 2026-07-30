package p028v;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VFrame_OnLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public WeakReference<InterfaceC1334a> f12741a;

    /* JADX INFO: renamed from: v.VFrame_OnLayout$a */
    public interface InterfaceC1334a {
        /* JADX INFO: renamed from: a */
        void m11526a();
    }

    public VFrame_OnLayout(@NonNull Context context) {
        super(context);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        WeakReference<InterfaceC1334a> weakReference = this.f12741a;
        if (weakReference == null || weakReference.get() == null || !z) {
            return;
        }
        this.f12741a.get().m11526a();
    }

    public VFrame_OnLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VFrame_OnLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
