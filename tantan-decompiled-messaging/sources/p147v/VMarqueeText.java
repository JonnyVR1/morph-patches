package p147v;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public class VMarqueeText extends VText {
    public VMarqueeText(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public boolean isFocused() {
        return true;
    }
}
