package p007l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.newui.mediaoperation.preview.item.PickerSelectedItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class sd70 {
    /* JADX INFO: renamed from: a */
    public static void m14126a(PickerSelectedItem pickerSelectedItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        pickerSelectedItem.a = viewGroup.getChildAt(0);
        pickerSelectedItem.b = viewGroup.getChildAt(1);
    }
}
