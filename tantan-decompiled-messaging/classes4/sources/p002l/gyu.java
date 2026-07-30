package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import l.jfd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class gyu {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f11687a;

    /* JADX INFO: renamed from: b */
    public View f11688b;

    /* JADX INFO: renamed from: c */
    public TextView f11689c;

    /* JADX INFO: renamed from: d */
    public TextView f11690d;

    /* JADX INFO: renamed from: e */
    public View f11691e;

    /* JADX INFO: renamed from: f */
    public TextView f11692f;

    /* JADX INFO: renamed from: g */
    public TextView f11693g;

    /* JADX INFO: renamed from: a */
    public void m14081a(ViewGroup viewGroup) {
        this.f11687a = (ConstraintLayout) viewGroup;
        View childAt = viewGroup.getChildAt(0);
        this.f11688b = childAt;
        String str = childAt == null ? "_empty" : null;
        TextView textView = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        this.f11689c = textView;
        if (textView == null) {
            str = "_title";
        }
        TextView textView2 = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        this.f11690d = textView2;
        if (textView2 == null) {
            str = "_content";
        }
        View childAt2 = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        this.f11691e = childAt2;
        if (childAt2 == null) {
            str = "_line";
        }
        TextView textView3 = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        this.f11692f = textView3;
        if (textView3 == null) {
            str = "_cancel";
        }
        TextView textView4 = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        this.f11693g = textView4;
        if (textView4 == null) {
            str = "_accept";
        }
        if (str == null) {
            return;
        }
        jfd0.a("Missing required view with ID:".concat(str));
    }

    /* JADX INFO: renamed from: b */
    public ConstraintLayout m14082b() {
        return this.f11687a;
    }

    /* JADX INFO: renamed from: c */
    public View m14083c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19827e7, viewGroup, false);
        m14081a((ViewGroup) viewInflate);
        return viewInflate;
    }
}
