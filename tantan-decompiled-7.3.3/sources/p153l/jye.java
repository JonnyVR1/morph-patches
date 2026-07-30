package p153l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public class jye extends Drawable {

    /* JADX INFO: renamed from: a */
    public final int f123129a;

    /* JADX INFO: renamed from: b */
    public TextView f123130b;

    public jye(Context context, CharSequence charSequence, float f, int i) {
        TextView textView = new TextView(context);
        this.f123130b = textView;
        textView.setText(hxj0.m137614c(charSequence));
        this.f123130b.setPadding(qa00.m175859d(1.5f), 0, 0, 0);
        this.f123130b.setGravity(17);
        this.f123130b.setTextSize(1, f);
        this.f123130b.setTextColor(-65536);
        this.f123129a = i;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        this.f123130b.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f123129a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f123129a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.f123130b.getMeasuredWidth() != rect.width() || this.f123130b.getMeasuredHeight() != rect.height()) {
            this.f123130b.measure(rect.width(), rect.height());
        }
        this.f123130b.layout(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
    }
}
