package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder;
import p153l.hj2;

/* JADX INFO: loaded from: classes4.dex */
public class i7t<P extends hj2, T> extends BaseDialogHolder<P, T> {

    /* JADX INFO: renamed from: e */
    public RelativeLayout f113291e;

    /* JADX INFO: renamed from: f */
    public TextView f113292f;

    /* JADX INFO: renamed from: g */
    public TextView f113293g;

    /* JADX INFO: renamed from: h */
    public EditText f113294h;

    /* JADX INFO: renamed from: i */
    public TextView f113295i;

    /* JADX INFO: renamed from: j */
    public TextView f113296j;

    /* JADX INFO: renamed from: k */
    public TextView f113297k;

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f198983Y3, viewGroup, false);
        m138982u((ViewGroup) viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: u */
    public void m138982u(ViewGroup viewGroup) {
        this.f113291e = (RelativeLayout) viewGroup;
        TextView textView = (TextView) viewGroup.getChildAt(0);
        this.f113292f = textView;
        String str = textView == null ? "_title" : null;
        TextView textView2 = (TextView) viewGroup.getChildAt(1);
        this.f113293g = textView2;
        if (textView2 == null) {
            str = "_can_input_num";
        }
        EditText editText = (EditText) viewGroup.getChildAt(2);
        this.f113294h = editText;
        if (editText == null) {
            str = "_input_text";
        }
        TextView textView3 = (TextView) viewGroup.getChildAt(3);
        this.f113295i = textView3;
        if (textView3 == null) {
            str = "_input_count";
        }
        TextView textView4 = (TextView) viewGroup.getChildAt(4);
        this.f113296j = textView4;
        if (textView4 == null) {
            str = "_complete_update";
        }
        TextView textView5 = (TextView) viewGroup.getChildAt(5);
        this.f113297k = textView5;
        if (textView5 == null) {
            str = "_cancel";
        }
        if (str == null) {
            return;
        }
        mnd0.m159157a("Missing required view with ID:".concat(str));
    }
}
