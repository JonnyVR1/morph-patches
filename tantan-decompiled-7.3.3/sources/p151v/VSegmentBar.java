package p151v;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: loaded from: classes3.dex */
public class VSegmentBar extends TabLayout {
    public VSegmentBar(@NonNull Context context) {
        this(context, null);
    }

    public VSegmentBar(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VSegmentBar(@NonNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
