package p149l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import androidx.annotation.NonNull;
import com.p046p1.mobile.android.p048ui.UIModeHelper;

/* JADX INFO: loaded from: classes8.dex */
public class uj40 extends ImageSpan {
    public uj40(@NonNull Drawable drawable, int i) {
        super(drawable, i);
    }

    @Override // android.text.style.ImageSpan, android.text.style.DynamicDrawableSpan
    public Drawable getDrawable() {
        return UIModeHelper.m20819c(super.getDrawable());
    }

    public uj40(@NonNull Context context, int i) {
        super(context, i);
    }
}
