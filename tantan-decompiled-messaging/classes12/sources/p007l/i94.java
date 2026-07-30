package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.feed.newui.photoalbum.redpointview.FeedRedDotView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class i94 {
    /* JADX INFO: renamed from: a */
    public static void m10842a(h94 h94Var, View view) {
        h94Var.f8633a = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        h94Var.f8634b = viewGroup.getChildAt(0);
        h94Var.f8635c = (FeedRedDotView) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m10843b(h94 h94Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11159Y, viewGroup, false);
        m10842a(h94Var, viewInflate);
        return viewInflate;
    }
}
