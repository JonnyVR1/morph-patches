package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p1.mobile.putong.newui.mediaoperation.preview.MediaPreviewAct;
import l.e6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class utx {
    /* JADX INFO: renamed from: a */
    public static void m15137a(MediaPreviewAct mediaPreviewAct, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        mediaPreviewAct.c = viewGroup.getChildAt(0);
        mediaPreviewAct.d = viewGroup.getChildAt(1);
        mediaPreviewAct.e = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        mediaPreviewAct.f = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        mediaPreviewAct.g = (LinearLayout) viewGroup.getChildAt(2);
        mediaPreviewAct.h = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        mediaPreviewAct.i = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0);
        mediaPreviewAct.j = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        mediaPreviewAct.k = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m15138b(MediaPreviewAct mediaPreviewAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(e6c0.z, viewGroup, false);
        m15137a(mediaPreviewAct, viewInflate);
        return viewInflate;
    }
}
