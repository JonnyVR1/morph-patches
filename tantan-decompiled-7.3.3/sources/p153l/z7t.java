package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder;
import p153l.hj2;

/* JADX INFO: loaded from: classes4.dex */
public class z7t<P extends hj2, T> extends BaseDialogHolder<P, T> {

    /* JADX INFO: renamed from: e */
    public LinearLayout f203263e;

    /* JADX INFO: renamed from: f */
    public TextView f203264f;

    /* JADX INFO: renamed from: g */
    public TextView f203265g;

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199281v4, viewGroup, false);
        m218916u((ViewGroup) viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: u */
    public void m218916u(ViewGroup viewGroup) {
        this.f203263e = (LinearLayout) viewGroup;
        TextView textView = (TextView) viewGroup.findViewById(mdc0.f135911D0);
        this.f203264f = textView;
        String str = textView == null ? "_content" : null;
        TextView textView2 = (TextView) viewGroup.getChildAt(2);
        this.f203265g = textView2;
        if (textView2 == null) {
            str = "_complete";
        }
        if (str == null) {
            return;
        }
        mnd0.m159157a("Missing required view with ID:".concat(str));
    }
}
