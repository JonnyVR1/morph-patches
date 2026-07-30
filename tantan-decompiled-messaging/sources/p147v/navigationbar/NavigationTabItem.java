package p147v.navigationbar;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import p149l.b9c0;
import p149l.qri0;

/* JADX INFO: loaded from: classes3.dex */
public class NavigationTabItem extends View {

    /* JADX INFO: renamed from: a */
    public final CharSequence f209761a;

    /* JADX INFO: renamed from: b */
    public final Drawable f209762b;

    /* JADX INFO: renamed from: c */
    public final int f209763c;

    @SuppressLint({"RestrictedApi"})
    public NavigationTabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (attributeSet == null) {
            this.f209761a = null;
            this.f209762b = null;
            this.f209763c = 0;
        } else {
            qri0 qri0VarM175992t = qri0.m175992t(context, attributeSet, b9c0.f74423f2);
            this.f209761a = qri0VarM175992t.m176009p(b9c0.f74444i2);
            this.f209762b = qri0VarM175992t.m176000g(b9c0.f74430g2);
            this.f209763c = qri0VarM175992t.m176007n(b9c0.f74437h2, 0);
            qri0VarM175992t.m176012v();
        }
    }

    public NavigationTabItem(Context context) {
        this(context, null);
    }
}
