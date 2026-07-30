package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder;
import l.jfd0;
import p002l.zi2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class h5t<P extends zi2, T> extends BaseDialogHolder<P, T> {

    /* JADX INFO: renamed from: e */
    public RelativeLayout f11887e;

    /* JADX INFO: renamed from: f */
    public TextView f11888f;

    /* JADX INFO: renamed from: g */
    public TextView f11889g;

    /* JADX INFO: renamed from: h */
    public EditText f11890h;

    /* JADX INFO: renamed from: i */
    public TextView f11891i;

    /* JADX INFO: renamed from: j */
    public TextView f11892j;

    /* JADX INFO: renamed from: k */
    public TextView f11893k;

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19747Y3, viewGroup, false);
        m14217u((ViewGroup) viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: u */
    public void m14217u(ViewGroup viewGroup) {
        this.f11887e = (RelativeLayout) viewGroup;
        TextView textView = (TextView) viewGroup.getChildAt(0);
        this.f11888f = textView;
        String str = textView == null ? "_title" : null;
        TextView textView2 = (TextView) viewGroup.getChildAt(1);
        this.f11889g = textView2;
        if (textView2 == null) {
            str = "_can_input_num";
        }
        EditText editText = (EditText) viewGroup.getChildAt(2);
        this.f11890h = editText;
        if (editText == null) {
            str = "_input_text";
        }
        TextView textView3 = (TextView) viewGroup.getChildAt(3);
        this.f11891i = textView3;
        if (textView3 == null) {
            str = "_input_count";
        }
        TextView textView4 = (TextView) viewGroup.getChildAt(4);
        this.f11892j = textView4;
        if (textView4 == null) {
            str = "_complete_update";
        }
        TextView textView5 = (TextView) viewGroup.getChildAt(5);
        this.f11893k = textView5;
        if (textView5 == null) {
            str = "_cancel";
        }
        if (str == null) {
            return;
        }
        jfd0.a("Missing required view with ID:".concat(str));
    }
}
