package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.newui.mediaoperation.preview.MediaPreviewAct;
import p147v.VButton;
import p147v.VFrame;
import p147v.VPager;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class utx {
    /* JADX INFO: renamed from: a */
    public static void m195318a(MediaPreviewAct mediaPreviewAct, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        mediaPreviewAct.f54058c = (VPager) viewGroup.getChildAt(0);
        mediaPreviewAct.f54059d = (VFrame) viewGroup.getChildAt(1);
        mediaPreviewAct.f54060e = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        mediaPreviewAct.f54061f = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        mediaPreviewAct.f54062g = (LinearLayout) viewGroup.getChildAt(2);
        mediaPreviewAct.f54063h = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        mediaPreviewAct.f54064i = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0);
        mediaPreviewAct.f54065j = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        mediaPreviewAct.f54066k = (VButton) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m195319b(MediaPreviewAct mediaPreviewAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(e6c0.f89567z, viewGroup, false);
        m195318a(mediaPreviewAct, viewInflate);
        return viewInflate;
    }
}
