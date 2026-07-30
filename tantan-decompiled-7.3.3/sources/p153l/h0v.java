package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes4.dex */
public class h0v {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f107331a;

    /* JADX INFO: renamed from: b */
    public View f107332b;

    /* JADX INFO: renamed from: c */
    public TextView f107333c;

    /* JADX INFO: renamed from: d */
    public TextView f107334d;

    /* JADX INFO: renamed from: e */
    public View f107335e;

    /* JADX INFO: renamed from: f */
    public TextView f107336f;

    /* JADX INFO: renamed from: g */
    public TextView f107337g;

    /* JADX INFO: renamed from: a */
    public void m133197a(ViewGroup viewGroup) {
        this.f107331a = (ConstraintLayout) viewGroup;
        View childAt = viewGroup.getChildAt(0);
        this.f107332b = childAt;
        String str = childAt == null ? "_empty" : null;
        TextView textView = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        this.f107333c = textView;
        if (textView == null) {
            str = "_title";
        }
        TextView textView2 = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        this.f107334d = textView2;
        if (textView2 == null) {
            str = "_content";
        }
        View childAt2 = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        this.f107335e = childAt2;
        if (childAt2 == null) {
            str = "_line";
        }
        TextView textView3 = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        this.f107336f = textView3;
        if (textView3 == null) {
            str = "_cancel";
        }
        TextView textView4 = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        this.f107337g = textView4;
        if (textView4 == null) {
            str = "_accept";
        }
        if (str == null) {
            return;
        }
        mnd0.m159157a("Missing required view with ID:".concat(str));
    }

    /* JADX INFO: renamed from: b */
    public ConstraintLayout m133198b() {
        return this.f107331a;
    }

    /* JADX INFO: renamed from: c */
    public View m133199c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199063e7, viewGroup, false);
        m133197a((ViewGroup) viewInflate);
        return viewInflate;
    }
}
