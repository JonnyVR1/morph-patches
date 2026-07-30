package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.external.view.widgets.LiveSquareMenuItemView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class e2u {
    /* JADX INFO: renamed from: a */
    public static void m114528a(LiveSquareMenuItemView liveSquareMenuItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveSquareMenuItemView.f46343a = (VImage) viewGroup.getChildAt(0);
        liveSquareMenuItemView.f46344b = (VDraweeView) viewGroup.getChildAt(1);
        liveSquareMenuItemView.f46345c = (VText) viewGroup.getChildAt(2);
    }
}
