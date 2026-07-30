package p151v;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import com.tantanapp.common.utils.CrashHelper;
import p151v.VImage;
import p153l.c33;
import p153l.hs40;
import p153l.x20;

/* JADX INFO: loaded from: classes3.dex */
public class VImage extends AppCompatImageView implements hs40.InterfaceC17567a {

    /* JADX INFO: renamed from: c */
    public final hs40 f210049c;

    public VImage(Context context) {
        super(context);
        this.f210049c = new hs40(this);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m224305f() {
    }

    @Override // p153l.hs40.InterfaceC17567a
    /* JADX INFO: renamed from: c */
    public void mo136951c(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        try {
            super.draw(canvas);
        } catch (Throwable th) {
            CrashHelper.m82479c(th);
            c33.m107766b(this, th, new x20() { // from class: l.pyk0
                @Override // p153l.x20
                public final void call() {
                    VImage.m224305f();
                }
            });
        }
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m224306g() {
        setImageDrawable(null);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (Throwable th) {
            CrashHelper.m82479c(th);
            c33.m107766b(this, th, new x20() { // from class: l.qyk0
                @Override // p153l.x20
                public final void call() {
                    this.f160163a.m224306g();
                }
            });
        }
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        this.f210049c.m136949a(colorFilter);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(@Nullable @org.jetbrains.annotations.Nullable Drawable drawable) {
        super.setImageDrawable(drawable);
    }

    public VImage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f210049c = new hs40(this);
    }

    public VImage(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f210049c = new hs40(this);
    }
}
