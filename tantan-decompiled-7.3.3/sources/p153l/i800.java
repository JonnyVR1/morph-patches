package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.p058ui.messages.view.MessageUserHeaderLayout;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class i800 {
    /* JADX INFO: renamed from: a */
    public static void m138991a(MessageUserHeaderLayout messageUserHeaderLayout, View view) {
        messageUserHeaderLayout.f33342j = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        messageUserHeaderLayout.f33343k = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        messageUserHeaderLayout.f33345l = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        messageUserHeaderLayout.f33346m = (LinearLayout) viewGroup.getChildAt(1);
        messageUserHeaderLayout.f33347n = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        messageUserHeaderLayout.f33348o = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        messageUserHeaderLayout.f33349p = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        messageUserHeaderLayout.f33351q = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
        messageUserHeaderLayout.f33352r = (ViewStub) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        messageUserHeaderLayout.f33353s = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        messageUserHeaderLayout.f33354t = (ViewStub) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m138992b(MessageUserHeaderLayout messageUserHeaderLayout, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(qec0.f157041h4, viewGroup, false);
        m138991a(messageUserHeaderLayout, viewInflate);
        return viewInflate;
    }
}
