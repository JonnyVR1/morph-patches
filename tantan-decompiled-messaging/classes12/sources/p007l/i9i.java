package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.feed.newui.videoflow.util.FeedVideoFlowRecycleView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class i9i {
    /* JADX INFO: renamed from: a */
    public static void m10844a(h9i h9iVar, View view) {
        h9iVar.f8640a = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        h9iVar.f8641b = (FeedVideoFlowRecycleView) viewGroup.getChildAt(0);
        h9iVar.f8642c = (RelativeLayout) viewGroup.getChildAt(1);
        h9iVar.f8643d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m10845b(h9i h9iVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11262n, viewGroup, false);
        m10844a(h9iVar, viewInflate);
        return viewInflate;
    }
}
