package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.external.page.rights.list.view.RightChatShadingView;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class f1d0 {
    /* JADX INFO: renamed from: a */
    public static void m119109a(RightChatShadingView rightChatShadingView, View view) {
        rightChatShadingView.f46024a = (RightChatShadingView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        rightChatShadingView.f46025b = (ConstraintLayout) viewGroup.getChildAt(0);
        rightChatShadingView.f46026c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        rightChatShadingView.f46027d = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        rightChatShadingView.f46028e = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        rightChatShadingView.f46029f = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        rightChatShadingView.f46030g = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        rightChatShadingView.f46031h = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        rightChatShadingView.f46032i = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5)).getChildAt(0);
        rightChatShadingView.f46033j = (VButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6);
    }
}
