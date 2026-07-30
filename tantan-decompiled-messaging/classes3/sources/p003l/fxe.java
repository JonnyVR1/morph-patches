package p003l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class fxe extends Drawable {

    /* JADX INFO: renamed from: a */
    public final int f3761a;

    /* JADX INFO: renamed from: b */
    public TextView f3762b;

    public fxe(Context context, CharSequence charSequence, float f, int i) {
        TextView textView = new TextView(context);
        this.f3762b = textView;
        textView.setText(eoj0.m3914c(charSequence));
        this.f3762b.setPadding(t100.d(1.5f), 0, 0, 0);
        this.f3762b.setGravity(17);
        this.f3762b.setTextSize(1, f);
        this.f3762b.setTextColor(-65536);
        this.f3761a = i;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        this.f3762b.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f3761a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f3761a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.f3762b.getMeasuredWidth() != rect.width() || this.f3762b.getMeasuredHeight() != rect.height()) {
            this.f3762b.measure(rect.width(), rect.height());
        }
        this.f3762b.layout(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
    }
}
