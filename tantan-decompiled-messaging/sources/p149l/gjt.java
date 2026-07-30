package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.base.view.LivingNewTagView;
import com.p046p1.mobile.putong.live.external.square.search.widgets.LiveSearchAnchorItemView;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class gjt {
    /* JADX INFO: renamed from: a */
    public static void m126563a(LiveSearchAnchorItemView liveSearchAnchorItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveSearchAnchorItemView.f46235a = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        liveSearchAnchorItemView.f46236b = (LivingNewTagView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        liveSearchAnchorItemView.f46237c = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        liveSearchAnchorItemView.f46238d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        liveSearchAnchorItemView.f46239e = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        liveSearchAnchorItemView.f46240f = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        liveSearchAnchorItemView.f46241g = (LinearLayout) viewGroup.getChildAt(2);
        liveSearchAnchorItemView.f46242h = (AnimEffectPlayer) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        liveSearchAnchorItemView.f46243i = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        liveSearchAnchorItemView.f46244j = (VButton) viewGroup.getChildAt(3);
    }
}
