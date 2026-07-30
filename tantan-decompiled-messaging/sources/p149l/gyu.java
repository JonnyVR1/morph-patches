package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes4.dex */
public class gyu {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f105037a;

    /* JADX INFO: renamed from: b */
    public View f105038b;

    /* JADX INFO: renamed from: c */
    public TextView f105039c;

    /* JADX INFO: renamed from: d */
    public TextView f105040d;

    /* JADX INFO: renamed from: e */
    public View f105041e;

    /* JADX INFO: renamed from: f */
    public TextView f105042f;

    /* JADX INFO: renamed from: g */
    public TextView f105043g;

    /* JADX INFO: renamed from: a */
    public void m128732a(ViewGroup viewGroup) {
        this.f105037a = (ConstraintLayout) viewGroup;
        View childAt = viewGroup.getChildAt(0);
        this.f105038b = childAt;
        String str = childAt == null ? "_empty" : null;
        TextView textView = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        this.f105039c = textView;
        if (textView == null) {
            str = "_title";
        }
        TextView textView2 = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        this.f105040d = textView2;
        if (textView2 == null) {
            str = "_content";
        }
        View childAt2 = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        this.f105041e = childAt2;
        if (childAt2 == null) {
            str = "_line";
        }
        TextView textView3 = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        this.f105042f = textView3;
        if (textView3 == null) {
            str = "_cancel";
        }
        TextView textView4 = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        this.f105043g = textView4;
        if (textView4 == null) {
            str = "_accept";
        }
        if (str == null) {
            return;
        }
        jfd0.m141176a("Missing required view with ID:".concat(str));
    }

    /* JADX INFO: renamed from: b */
    public ConstraintLayout m128733b() {
        return this.f105037a;
    }

    /* JADX INFO: renamed from: c */
    public View m128734c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168331e7, viewGroup, false);
        m128732a((ViewGroup) viewInflate);
        return viewInflate;
    }
}
