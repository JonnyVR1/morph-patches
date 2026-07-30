package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.p053ui.growth.fakebyconv.MsgTabFakeBubbleRoot;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class d010 {
    /* JADX INFO: renamed from: a */
    public static void m109452a(MsgTabFakeBubbleRoot msgTabFakeBubbleRoot, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        msgTabFakeBubbleRoot.f29511a = (LinearLayout) viewGroup.getChildAt(0);
        msgTabFakeBubbleRoot.f29512b = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        msgTabFakeBubbleRoot.f29513c = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        msgTabFakeBubbleRoot.f29514d = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        msgTabFakeBubbleRoot.f29515e = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        msgTabFakeBubbleRoot.f29516f = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        msgTabFakeBubbleRoot.f29517g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2);
        msgTabFakeBubbleRoot.f29518h = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        msgTabFakeBubbleRoot.f29519i = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
    }
}
