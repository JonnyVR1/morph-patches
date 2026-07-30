package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.feed.p060ui.moments.MomentsInProfilePreviewAct;
import p147v.VFrame;
import p147v.VPager;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class kr00 {
    /* JADX INFO: renamed from: a */
    public static void m146963a(MomentsInProfilePreviewAct momentsInProfilePreviewAct, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        momentsInProfilePreviewAct.f43913c = (VPager) viewGroup.getChildAt(0);
        momentsInProfilePreviewAct.f43914d = (LinearLayout) viewGroup.getChildAt(1);
        momentsInProfilePreviewAct.f43915e = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        momentsInProfilePreviewAct.f43916f = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        momentsInProfilePreviewAct.f43917g = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        momentsInProfilePreviewAct.f43918h = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        momentsInProfilePreviewAct.f43919i = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        momentsInProfilePreviewAct.f43920j = (VFrame) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2)).getChildAt(0);
        momentsInProfilePreviewAct.f43921k = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m146964b(MomentsInProfilePreviewAct momentsInProfilePreviewAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142006B4, viewGroup, false);
        m146963a(momentsInProfilePreviewAct, viewInflate);
        return viewInflate;
    }
}
