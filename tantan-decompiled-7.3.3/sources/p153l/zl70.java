package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.mediapicker.PickerSelectedItem;
import p151v.VDraweeView;
import p151v.VImage;

/* JADX INFO: loaded from: classes10.dex */
public class zl70 {
    /* JADX INFO: renamed from: a */
    public static void m220168a(PickerSelectedItem pickerSelectedItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        pickerSelectedItem.f31493a = (VDraweeView) viewGroup.getChildAt(0);
        pickerSelectedItem.f31494b = (VImage) viewGroup.getChildAt(1);
    }
}
