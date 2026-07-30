package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder;
import p149l.zi2;

/* JADX INFO: loaded from: classes4.dex */
public class y5t<P extends zi2, T> extends BaseDialogHolder<P, T> {

    /* JADX INFO: renamed from: e */
    public LinearLayout f196478e;

    /* JADX INFO: renamed from: f */
    public TextView f196479f;

    /* JADX INFO: renamed from: g */
    public TextView f196480g;

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168549v4, viewGroup, false);
        m213017u((ViewGroup) viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: u */
    public void m213017u(ViewGroup viewGroup) {
        this.f196478e = (LinearLayout) viewGroup;
        TextView textView = (TextView) viewGroup.findViewById(g5c0.f100666D0);
        this.f196479f = textView;
        String str = textView == null ? "_content" : null;
        TextView textView2 = (TextView) viewGroup.getChildAt(2);
        this.f196480g = textView2;
        if (textView2 == null) {
            str = "_complete";
        }
        if (str == null) {
            return;
        }
        jfd0.m141176a("Missing required view with ID:".concat(str));
    }
}
