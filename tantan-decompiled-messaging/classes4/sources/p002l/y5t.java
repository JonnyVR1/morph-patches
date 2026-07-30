package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder;
import l.jfd0;
import p002l.zi2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class y5t<P extends zi2, T> extends BaseDialogHolder<P, T> {

    /* JADX INFO: renamed from: e */
    public LinearLayout f22678e;

    /* JADX INFO: renamed from: f */
    public TextView f22679f;

    /* JADX INFO: renamed from: g */
    public TextView f22680g;

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f20045v4, viewGroup, false);
        m26363u((ViewGroup) viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: u */
    public void m26363u(ViewGroup viewGroup) {
        this.f22678e = (LinearLayout) viewGroup;
        TextView textView = (TextView) viewGroup.findViewById(g5c0.f10816D0);
        this.f22679f = textView;
        String str = textView == null ? "_content" : null;
        TextView textView2 = (TextView) viewGroup.getChildAt(2);
        this.f22680g = textView2;
        if (textView2 == null) {
            str = "_complete";
        }
        if (str == null) {
            return;
        }
        jfd0.a("Missing required view with ID:".concat(str));
    }
}
