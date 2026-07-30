package p153l;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;

/* JADX INFO: loaded from: classes.dex */
public class ru0 extends PopupWindow {

    /* JADX INFO: renamed from: b */
    public static final boolean f164888b = false;

    /* JADX INFO: renamed from: a */
    public boolean f164889a;

    public ru0(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        super(context, attributeSet, i, i2);
        m183182a(context, attributeSet, i, i2);
    }

    /* JADX INFO: renamed from: a */
    public final void m183182a(Context context, AttributeSet attributeSet, int i, int i2) {
        t0j0 t0j0VarM188782u = t0j0.m188782u(context, attributeSet, gic0.f104357c2, i, i2);
        if (t0j0VarM188782u.m188800r(gic0.f104367e2)) {
            m183183b(t0j0VarM188782u.m188783a(gic0.f104367e2, false));
        }
        setBackgroundDrawable(t0j0VarM188782u.m188789g(gic0.f104362d2));
        t0j0VarM188782u.m188801v();
    }

    /* JADX INFO: renamed from: b */
    public final void m183183b(boolean z) {
        if (f164888b) {
            this.f164889a = z;
        } else {
            kl80.m150356a(this, z);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2) {
        if (f164888b && this.f164889a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i, int i2, int i3, int i4) {
        if (f164888b && this.f164889a) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (f164888b && this.f164889a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }
}
