package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.mediapicker.PickerSelectedItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class td70 {
    /* JADX INFO: renamed from: a */
    public static void m9566a(PickerSelectedItem pickerSelectedItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        pickerSelectedItem.a = viewGroup.getChildAt(0);
        pickerSelectedItem.b = viewGroup.getChildAt(1);
    }
}
