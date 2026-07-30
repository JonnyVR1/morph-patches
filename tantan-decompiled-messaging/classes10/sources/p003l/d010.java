package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.core.p001ui.growth.fakebyconv.MsgTabFakeBubbleRoot;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class d010 {
    /* JADX INFO: renamed from: a */
    public static void m6029a(MsgTabFakeBubbleRoot msgTabFakeBubbleRoot, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        msgTabFakeBubbleRoot.f1905a = (LinearLayout) viewGroup.getChildAt(0);
        msgTabFakeBubbleRoot.f1906b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        msgTabFakeBubbleRoot.f1907c = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        msgTabFakeBubbleRoot.f1908d = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        msgTabFakeBubbleRoot.f1909e = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        msgTabFakeBubbleRoot.f1910f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        msgTabFakeBubbleRoot.f1911g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2);
        msgTabFakeBubbleRoot.f1912h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        msgTabFakeBubbleRoot.f1913i = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
    }
}
