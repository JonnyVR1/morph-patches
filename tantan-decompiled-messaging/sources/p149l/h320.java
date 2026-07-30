package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.popup.NameFakeView;
import p147v.VButton_FakeShadow;
import p147v.VMaterialEdit;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class h320 {
    /* JADX INFO: renamed from: a */
    public static void m129156a(NameFakeView nameFakeView, View view) {
        nameFakeView.f32818a = (NameFakeView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        nameFakeView.f32819b = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        nameFakeView.f32820c = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        nameFakeView.f32821d = (VMaterialEdit) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        nameFakeView.f32822e = (VButton_FakeShadow) viewGroup.getChildAt(1);
    }
}
