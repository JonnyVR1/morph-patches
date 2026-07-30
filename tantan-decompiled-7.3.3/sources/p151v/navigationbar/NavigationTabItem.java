package p151v.navigationbar;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import p153l.hhc0;
import p153l.t0j0;

/* JADX INFO: loaded from: classes3.dex */
public class NavigationTabItem extends View {

    /* JADX INFO: renamed from: a */
    public final CharSequence f210683a;

    /* JADX INFO: renamed from: b */
    public final Drawable f210684b;

    /* JADX INFO: renamed from: c */
    public final int f210685c;

    @SuppressLint({"RestrictedApi"})
    public NavigationTabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (attributeSet == null) {
            this.f210683a = null;
            this.f210684b = null;
            this.f210685c = 0;
        } else {
            t0j0 t0j0VarM188781t = t0j0.m188781t(context, attributeSet, hhc0.f109732f2);
            this.f210683a = t0j0VarM188781t.m188798p(hhc0.f109753i2);
            this.f210684b = t0j0VarM188781t.m188789g(hhc0.f109739g2);
            this.f210685c = t0j0VarM188781t.m188796n(hhc0.f109746h2, 0);
            t0j0VarM188781t.m188801v();
        }
    }

    public NavigationTabItem(Context context) {
        this(context, null);
    }
}
