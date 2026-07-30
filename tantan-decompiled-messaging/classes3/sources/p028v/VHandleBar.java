package p028v;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import l.b6c0;
import l.u2c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VHandleBar extends FrameLayout {
    public VHandleBar(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m11536a(context, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public final void m11536a(Context context, AttributeSet attributeSet) {
        LayoutInflater.from(context).inflate(b6c0.k, this);
        setBackgroundResource(u2c0.l);
    }

    public VHandleBar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VHandleBar(@NonNull Context context) {
        this(context, null);
    }
}
