package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.feed.p005ui.moments.MomentsInProfilePreviewAct;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class kr00 {
    /* JADX INFO: renamed from: a */
    public static void m11513a(MomentsInProfilePreviewAct momentsInProfilePreviewAct, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        momentsInProfilePreviewAct.f5374c = viewGroup.getChildAt(0);
        momentsInProfilePreviewAct.f5375d = (LinearLayout) viewGroup.getChildAt(1);
        momentsInProfilePreviewAct.f5376e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        momentsInProfilePreviewAct.f5377f = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        momentsInProfilePreviewAct.f5378g = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        momentsInProfilePreviewAct.f5379h = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        momentsInProfilePreviewAct.f5380i = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        momentsInProfilePreviewAct.f5381j = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2)).getChildAt(0);
        momentsInProfilePreviewAct.f5382k = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m11514b(MomentsInProfilePreviewAct momentsInProfilePreviewAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11025B4, viewGroup, false);
        m11513a(momentsInProfilePreviewAct, viewInflate);
        return viewInflate;
    }
}
