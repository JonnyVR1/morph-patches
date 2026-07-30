package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.feed.newui.videoflow.util.FeedVideoFlowRecycleView;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class i9i {
    /* JADX INFO: renamed from: a */
    public static void m135054a(h9i h9iVar, View view) {
        h9iVar.f106589a = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        h9iVar.f106590b = (FeedVideoFlowRecycleView) viewGroup.getChildAt(0);
        h9iVar.f106591c = (RelativeLayout) viewGroup.getChildAt(1);
        h9iVar.f106592d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m135055b(h9i h9iVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142243n, viewGroup, false);
        m135054a(h9iVar, viewInflate);
        return viewInflate;
    }
}
