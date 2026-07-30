package p153l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import androidx.annotation.NonNull;
import com.p051p1.mobile.android.p053ui.UIModeHelper;

/* JADX INFO: loaded from: classes8.dex */
public class is40 extends ImageSpan {
    public is40(@NonNull Drawable drawable, int i) {
        super(drawable, i);
    }

    @Override // android.text.style.ImageSpan, android.text.style.DynamicDrawableSpan
    public Drawable getDrawable() {
        return UIModeHelper.m21818c(super.getDrawable());
    }

    public is40(@NonNull Context context, int i) {
        super(context, i);
    }
}
