package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.newui.mediaoperation.preview.item.PickerSelectedItem;
import p147v.VDraweeView;
import p147v.VImage;

/* JADX INFO: loaded from: classes12.dex */
public class sd70 {
    /* JADX INFO: renamed from: a */
    public static void m183482a(PickerSelectedItem pickerSelectedItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        pickerSelectedItem.f54106a = (VDraweeView) viewGroup.getChildAt(0);
        pickerSelectedItem.f54107b = (VImage) viewGroup.getChildAt(1);
    }
}
