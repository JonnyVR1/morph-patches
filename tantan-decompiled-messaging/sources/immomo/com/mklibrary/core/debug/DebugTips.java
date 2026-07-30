package immomo.com.mklibrary.core.debug;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public class DebugTips extends TextView {
    public DebugTips(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m87124a();
    }

    /* JADX INFO: renamed from: a */
    private void m87124a() {
        setBackgroundColor(Integer.MIN_VALUE);
        setTextColor(-1);
    }

    public DebugTips(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DebugTips(Context context) {
        this(context, null);
    }
}
