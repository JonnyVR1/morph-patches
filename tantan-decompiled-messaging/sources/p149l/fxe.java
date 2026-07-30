package p149l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public class fxe extends Drawable {

    /* JADX INFO: renamed from: a */
    public final int f99759a;

    /* JADX INFO: renamed from: b */
    public TextView f99760b;

    public fxe(Context context, CharSequence charSequence, float f, int i) {
        TextView textView = new TextView(context);
        this.f99760b = textView;
        textView.setText(eoj0.m117353c(charSequence));
        this.f99760b.setPadding(t100.m186890d(1.5f), 0, 0, 0);
        this.f99760b.setGravity(17);
        this.f99760b.setTextSize(1, f);
        this.f99760b.setTextColor(-65536);
        this.f99759a = i;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        this.f99760b.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f99759a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f99759a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.f99760b.getMeasuredWidth() != rect.width() || this.f99760b.getMeasuredHeight() != rect.height()) {
            this.f99760b.measure(rect.width(), rect.height());
        }
        this.f99760b.layout(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
    }
}
