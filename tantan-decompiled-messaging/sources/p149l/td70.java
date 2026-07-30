package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.mediapicker.PickerSelectedItem;
import p147v.VDraweeView;
import p147v.VImage;

/* JADX INFO: loaded from: classes10.dex */
public class td70 {
    /* JADX INFO: renamed from: a */
    public static void m188066a(PickerSelectedItem pickerSelectedItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        pickerSelectedItem.f30645a = (VDraweeView) viewGroup.getChildAt(0);
        pickerSelectedItem.f30646b = (VImage) viewGroup.getChildAt(1);
    }
}
