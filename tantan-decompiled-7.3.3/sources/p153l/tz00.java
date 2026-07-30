package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.feed.p065ui.moments.MomentsInProfilePreviewAct;
import p151v.VFrame;
import p151v.VPager;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class tz00 {
    /* JADX INFO: renamed from: a */
    public static void m193633a(MomentsInProfilePreviewAct momentsInProfilePreviewAct, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        momentsInProfilePreviewAct.f44761c = (VPager) viewGroup.getChildAt(0);
        momentsInProfilePreviewAct.f44762d = (LinearLayout) viewGroup.getChildAt(1);
        momentsInProfilePreviewAct.f44763e = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        momentsInProfilePreviewAct.f44764f = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        momentsInProfilePreviewAct.f44765g = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        momentsInProfilePreviewAct.f44766h = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        momentsInProfilePreviewAct.f44767i = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        momentsInProfilePreviewAct.f44768j = (VFrame) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2)).getChildAt(0);
        momentsInProfilePreviewAct.f44769k = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m193634b(MomentsInProfilePreviewAct momentsInProfilePreviewAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173475B4, viewGroup, false);
        m193633a(momentsInProfilePreviewAct, viewInflate);
        return viewInflate;
    }
}
