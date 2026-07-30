package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.roundcorners.view.RoundButton;
import p151v.VButton;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class cxi0 {
    /* JADX INFO: renamed from: a */
    public static void m113032a(bxi0 bxi0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        bxi0Var._close = (VButton) viewGroup.getChildAt(0);
        bxi0Var._avatar = (VDraweeView) viewGroup.getChildAt(1);
        bxi0Var._id = (TextView) viewGroup.getChildAt(2);
        bxi0Var._desc = (TextView) viewGroup.getChildAt(3);
        bxi0Var._confirm = (RoundButton) viewGroup.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m113033b(bxi0 bxi0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125580Q3, viewGroup, false);
        m113032a(bxi0Var, viewInflate);
        return viewInflate;
    }
}
