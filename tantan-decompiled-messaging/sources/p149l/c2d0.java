package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.external.page.rights.list.view.RightEnterRoomEffectView;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class c2d0 {
    /* JADX INFO: renamed from: a */
    public static void m104906a(RightEnterRoomEffectView rightEnterRoomEffectView, View view) {
        rightEnterRoomEffectView.f46042a = (RightEnterRoomEffectView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        rightEnterRoomEffectView.f46043b = (ConstraintLayout) viewGroup.getChildAt(0);
        rightEnterRoomEffectView.f46044c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        rightEnterRoomEffectView.f46045d = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        rightEnterRoomEffectView.f46046e = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        rightEnterRoomEffectView.f46047f = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        rightEnterRoomEffectView.f46048g = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        rightEnterRoomEffectView.f46049h = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        rightEnterRoomEffectView.f46050i = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5)).getChildAt(0);
        rightEnterRoomEffectView.f46051j = (VButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6);
    }
}
