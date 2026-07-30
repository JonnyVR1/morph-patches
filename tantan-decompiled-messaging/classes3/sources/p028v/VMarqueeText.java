package p028v;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VMarqueeText extends VText {
    public VMarqueeText(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean isFocused() {
        return true;
    }
}
