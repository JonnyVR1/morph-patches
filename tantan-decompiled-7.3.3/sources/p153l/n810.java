package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.p058ui.growth.fakebyconv.MsgTabFakeBubbleRoot;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class n810 {
    /* JADX INFO: renamed from: a */
    public static void m161890a(MsgTabFakeBubbleRoot msgTabFakeBubbleRoot, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        msgTabFakeBubbleRoot.f30359a = (LinearLayout) viewGroup.getChildAt(0);
        msgTabFakeBubbleRoot.f30360b = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        msgTabFakeBubbleRoot.f30361c = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        msgTabFakeBubbleRoot.f30362d = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        msgTabFakeBubbleRoot.f30363e = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        msgTabFakeBubbleRoot.f30364f = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        msgTabFakeBubbleRoot.f30365g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2);
        msgTabFakeBubbleRoot.f30366h = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        msgTabFakeBubbleRoot.f30367i = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
    }
}
