package p151v;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p153l.abc0;
import p153l.gec0;

/* JADX INFO: loaded from: classes3.dex */
public class VHandleBar extends FrameLayout {
    public VHandleBar(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m224303a(context, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public final void m224303a(Context context, AttributeSet attributeSet) {
        LayoutInflater.from(context).inflate(gec0.f103798k, this);
        setBackgroundResource(abc0.f69490l);
    }

    public VHandleBar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VHandleBar(@NonNull Context context) {
        this(context, null);
    }
}
