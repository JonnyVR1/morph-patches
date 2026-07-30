package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.feed.newui.videoflow.util.FeedVideoFlowRecycleView;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class xai {
    /* JADX INFO: renamed from: a */
    public static void m209853a(wai waiVar, View view) {
        waiVar.f188123a = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        waiVar.f188124b = (FeedVideoFlowRecycleView) viewGroup.getChildAt(0);
        waiVar.f188125c = (RelativeLayout) viewGroup.getChildAt(1);
        waiVar.f188126d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m209854b(wai waiVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173712n, viewGroup, false);
        m209853a(waiVar, viewInflate);
        return viewInflate;
    }
}
