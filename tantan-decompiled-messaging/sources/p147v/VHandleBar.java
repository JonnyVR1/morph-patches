package p147v;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p149l.b6c0;
import p149l.u2c0;

/* JADX INFO: loaded from: classes3.dex */
public class VHandleBar extends FrameLayout {
    public VHandleBar(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m223057a(context, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public final void m223057a(Context context, AttributeSet attributeSet) {
        LayoutInflater.from(context).inflate(b6c0.f73785k, this);
        setBackgroundResource(u2c0.f173370l);
    }

    public VHandleBar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VHandleBar(@NonNull Context context) {
        this(context, null);
    }
}
