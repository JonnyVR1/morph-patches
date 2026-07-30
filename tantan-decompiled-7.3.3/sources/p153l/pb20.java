package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.popup.NameFakeView;
import p151v.VButton_FakeShadow;
import p151v.VMaterialEdit;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class pb20 {
    /* JADX INFO: renamed from: a */
    public static void m171479a(NameFakeView nameFakeView, View view) {
        nameFakeView.f33666a = (NameFakeView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        nameFakeView.f33667b = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        nameFakeView.f33668c = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        nameFakeView.f33669d = (VMaterialEdit) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        nameFakeView.f33670e = (VButton_FakeShadow) viewGroup.getChildAt(1);
    }
}
