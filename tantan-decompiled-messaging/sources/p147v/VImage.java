package p147v;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import com.tantanapp.common.utils.CrashHelper;
import p147v.VImage;
import p149l.d30;
import p149l.m23;
import p149l.tj40;

/* JADX INFO: loaded from: classes3.dex */
public class VImage extends AppCompatImageView implements tj40.InterfaceC20186a {

    /* JADX INFO: renamed from: c */
    public final tj40 f209127c;

    public VImage(Context context) {
        super(context);
        this.f209127c = new tj40(this);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m223059f() {
    }

    @Override // p149l.tj40.InterfaceC20186a
    /* JADX INFO: renamed from: c */
    public void mo189247c(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        try {
            super.draw(canvas);
        } catch (Throwable th) {
            CrashHelper.m81296c(th);
            m23.m152650b(this, th, new d30() { // from class: l.jpk0
                @Override // p149l.d30
                public final void call() {
                    VImage.m223059f();
                }
            });
        }
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m223060g() {
        setImageDrawable(null);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (Throwable th) {
            CrashHelper.m81296c(th);
            m23.m152650b(this, th, new d30() { // from class: l.kpk0
                @Override // p149l.d30
                public final void call() {
                    this.f124167a.m223060g();
                }
            });
        }
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        this.f209127c.m189245a(colorFilter);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(@Nullable @org.jetbrains.annotations.Nullable Drawable drawable) {
        super.setImageDrawable(drawable);
    }

    public VImage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f209127c = new tj40(this);
    }

    public VImage(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f209127c = new tj40(this);
    }
}
