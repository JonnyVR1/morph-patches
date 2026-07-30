package p007l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import androidx.annotation.NonNull;
import com.p003p1.mobile.android.p005ui.UIModeHelper;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class uj40 extends ImageSpan {
    public uj40(@NonNull Drawable drawable, int i) {
        super(drawable, i);
    }

    @Override // android.text.style.ImageSpan, android.text.style.DynamicDrawableSpan
    public Drawable getDrawable() {
        return UIModeHelper.m1090c(super.getDrawable());
    }

    public uj40(@NonNull Context context, int i) {
        super(context, i);
    }
}
