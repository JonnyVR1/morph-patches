package p149l;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;

/* JADX INFO: loaded from: classes.dex */
public class lu0 extends PopupWindow {

    /* JADX INFO: renamed from: b */
    public static final boolean f130024b = false;

    /* JADX INFO: renamed from: a */
    public boolean f130025a;

    public lu0(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        super(context, attributeSet, i, i2);
        m151762a(context, attributeSet, i, i2);
    }

    /* JADX INFO: renamed from: a */
    public final void m151762a(Context context, AttributeSet attributeSet, int i, int i2) {
        qri0 qri0VarM175993u = qri0.m175993u(context, attributeSet, aac0.f68431c2, i, i2);
        if (qri0VarM175993u.m176011r(aac0.f68441e2)) {
            m151763b(qri0VarM175993u.m175994a(aac0.f68441e2, false));
        }
        setBackgroundDrawable(qri0VarM175993u.m176000g(aac0.f68436d2));
        qri0VarM175993u.m176012v();
    }

    /* JADX INFO: renamed from: b */
    public final void m151763b(boolean z) {
        if (f130024b) {
            this.f130025a = z;
        } else {
            ed80.m115789a(this, z);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2) {
        if (f130024b && this.f130025a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i, int i2, int i3, int i4) {
        if (f130024b && this.f130025a) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (f130024b && this.f130025a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }
}
