package p028v;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import com.tantanapp.common.utils.CrashHelper;
import l.tj40;
import p003l.d30;
import p003l.m23;
import p028v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VImage extends AppCompatImageView implements tj40.a {

    /* JADX INFO: renamed from: c */
    public final tj40 f12752c;

    public VImage(Context context) {
        super(context);
        this.f12752c = new tj40(this);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m11538f() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public void m11539c(ColorFilter colorFilter) {
        super/*android.widget.ImageView*/.setColorFilter(colorFilter);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void draw(@NonNull Canvas canvas) {
        try {
            super/*android.view.View*/.draw(canvas);
        } catch (Throwable th) {
            CrashHelper.c(th);
            m23.m6193b(this, th, new d30() { // from class: l.jpk0
                @Override // p003l.d30
                public final void call() {
                    VImage.m11538f();
                }
            });
        }
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m11540g() {
        setImageDrawable(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDraw(Canvas canvas) {
        try {
            super/*android.view.View*/.onDraw(canvas);
        } catch (Throwable th) {
            CrashHelper.c(th);
            m23.m6193b(this, th, new d30() { // from class: l.kpk0
                @Override // p003l.d30
                public final void call() {
                    this.f5003a.m11540g();
                }
            });
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f12752c.a(colorFilter);
    }

    public void setImageDrawable(@Nullable @org.jetbrains.annotations.Nullable Drawable drawable) {
        super.setImageDrawable(drawable);
    }

    public VImage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12752c = new tj40(this);
    }

    public VImage(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12752c = new tj40(this);
    }
}
