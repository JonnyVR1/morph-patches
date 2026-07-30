package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.messages.emoji.VEditTextEmojiCompat;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class qp00 {
    /* JADX INFO: renamed from: a */
    public static void m177390a(pp00 pp00Var, View view) {
        pp00Var.f153445a = (RelativeLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        pp00Var.f153446b = (RelativeLayout) viewGroup.getChildAt(0);
        pp00Var.f153447c = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        pp00Var.f153448d = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        pp00Var.f153449e = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        pp00Var.f153450f = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        pp00Var.f153451g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2);
        pp00Var.f153452h = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3);
        pp00Var.f153453i = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(4);
        pp00Var.f153454j = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        pp00Var.f153455k = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        pp00Var.f153456l = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        pp00Var.f153457m = (VEditTextEmojiCompat) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        pp00Var.f153458n = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m177391b(pp00 pp00Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125424G7, viewGroup, false);
        m177390a(pp00Var, viewInflate);
        return viewInflate;
    }
}
