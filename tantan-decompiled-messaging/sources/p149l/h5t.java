package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder;
import p149l.zi2;

/* JADX INFO: loaded from: classes4.dex */
public class h5t<P extends zi2, T> extends BaseDialogHolder<P, T> {

    /* JADX INFO: renamed from: e */
    public RelativeLayout f105984e;

    /* JADX INFO: renamed from: f */
    public TextView f105985f;

    /* JADX INFO: renamed from: g */
    public TextView f105986g;

    /* JADX INFO: renamed from: h */
    public EditText f105987h;

    /* JADX INFO: renamed from: i */
    public TextView f105988i;

    /* JADX INFO: renamed from: j */
    public TextView f105989j;

    /* JADX INFO: renamed from: k */
    public TextView f105990k;

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168251Y3, viewGroup, false);
        m129456u((ViewGroup) viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: u */
    public void m129456u(ViewGroup viewGroup) {
        this.f105984e = (RelativeLayout) viewGroup;
        TextView textView = (TextView) viewGroup.getChildAt(0);
        this.f105985f = textView;
        String str = textView == null ? "_title" : null;
        TextView textView2 = (TextView) viewGroup.getChildAt(1);
        this.f105986g = textView2;
        if (textView2 == null) {
            str = "_can_input_num";
        }
        EditText editText = (EditText) viewGroup.getChildAt(2);
        this.f105987h = editText;
        if (editText == null) {
            str = "_input_text";
        }
        TextView textView3 = (TextView) viewGroup.getChildAt(3);
        this.f105988i = textView3;
        if (textView3 == null) {
            str = "_input_count";
        }
        TextView textView4 = (TextView) viewGroup.getChildAt(4);
        this.f105989j = textView4;
        if (textView4 == null) {
            str = "_complete_update";
        }
        TextView textView5 = (TextView) viewGroup.getChildAt(5);
        this.f105990k = textView5;
        if (textView5 == null) {
            str = "_cancel";
        }
        if (str == null) {
            return;
        }
        jfd0.m141176a("Missing required view with ID:".concat(str));
    }
}
