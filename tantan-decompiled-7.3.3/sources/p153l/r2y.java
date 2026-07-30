package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.newui.mediaoperation.preview.MediaPreviewAct;
import p151v.VButton;
import p151v.VFrame;
import p151v.VPager;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class r2y {
    /* JADX INFO: renamed from: a */
    public static void m179571a(MediaPreviewAct mediaPreviewAct, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        mediaPreviewAct.f54906c = (VPager) viewGroup.getChildAt(0);
        mediaPreviewAct.f54907d = (VFrame) viewGroup.getChildAt(1);
        mediaPreviewAct.f54908e = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        mediaPreviewAct.f54909f = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        mediaPreviewAct.f54910g = (LinearLayout) viewGroup.getChildAt(2);
        mediaPreviewAct.f54911h = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        mediaPreviewAct.f54912i = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0);
        mediaPreviewAct.f54913j = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        mediaPreviewAct.f54914k = (VButton) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m179572b(MediaPreviewAct mediaPreviewAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(jec0.f120480z, viewGroup, false);
        m179571a(mediaPreviewAct, viewInflate);
        return viewInflate;
    }
}
