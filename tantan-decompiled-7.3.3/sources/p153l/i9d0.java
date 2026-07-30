package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.external.page.rights.list.view.RightChatShadingView;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class i9d0 {
    /* JADX INFO: renamed from: a */
    public static void m139093a(RightChatShadingView rightChatShadingView, View view) {
        rightChatShadingView.f46872a = (RightChatShadingView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        rightChatShadingView.f46873b = (ConstraintLayout) viewGroup.getChildAt(0);
        rightChatShadingView.f46874c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        rightChatShadingView.f46875d = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        rightChatShadingView.f46876e = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        rightChatShadingView.f46877f = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        rightChatShadingView.f46878g = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        rightChatShadingView.f46879h = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        rightChatShadingView.f46880i = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5)).getChildAt(0);
        rightChatShadingView.f46881j = (VButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6);
    }
}
