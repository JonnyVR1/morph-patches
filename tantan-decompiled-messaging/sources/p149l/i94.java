package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.feed.newui.photoalbum.redpointview.FeedRedDotView;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class i94 {
    /* JADX INFO: renamed from: a */
    public static void m135004a(h94 h94Var, View view) {
        h94Var.f106511a = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        h94Var.f106512b = (VText) viewGroup.getChildAt(0);
        h94Var.f106513c = (FeedRedDotView) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m135005b(h94 h94Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142140Y, viewGroup, false);
        m135004a(h94Var, viewInflate);
        return viewInflate;
    }
}
