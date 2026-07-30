package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.external.page.rights.list.view.RightEnterRoomEffectView;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class fad0 {
    /* JADX INFO: renamed from: a */
    public static void m124748a(RightEnterRoomEffectView rightEnterRoomEffectView, View view) {
        rightEnterRoomEffectView.f46890a = (RightEnterRoomEffectView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        rightEnterRoomEffectView.f46891b = (ConstraintLayout) viewGroup.getChildAt(0);
        rightEnterRoomEffectView.f46892c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        rightEnterRoomEffectView.f46893d = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        rightEnterRoomEffectView.f46894e = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        rightEnterRoomEffectView.f46895f = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        rightEnterRoomEffectView.f46896g = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        rightEnterRoomEffectView.f46897h = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        rightEnterRoomEffectView.f46898i = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5)).getChildAt(0);
        rightEnterRoomEffectView.f46899j = (VButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6);
    }
}
