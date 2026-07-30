package p028v.navigationbar;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import l.b9c0;
import l.qri0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class NavigationTabItem extends View {

    /* JADX INFO: renamed from: a */
    public final CharSequence f13386a;

    /* JADX INFO: renamed from: b */
    public final Drawable f13387b;

    /* JADX INFO: renamed from: c */
    public final int f13388c;

    @SuppressLint({"RestrictedApi"})
    public NavigationTabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (attributeSet == null) {
            this.f13386a = null;
            this.f13387b = null;
            this.f13388c = 0;
        } else {
            qri0 qri0VarT = qri0.t(context, attributeSet, b9c0.f2);
            this.f13386a = qri0VarT.p(b9c0.i2);
            this.f13387b = qri0VarT.g(b9c0.g2);
            this.f13388c = qri0VarT.n(b9c0.h2, 0);
            qri0VarT.v();
        }
    }

    public NavigationTabItem(Context context) {
        this(context, null);
    }
}
