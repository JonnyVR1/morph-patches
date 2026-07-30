package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.newui.mediaoperation.preview.item.PickerSelectedItem;
import p151v.VDraweeView;
import p151v.VImage;

/* JADX INFO: loaded from: classes13.dex */
public class yl70 {
    /* JADX INFO: renamed from: a */
    public static void m216564a(PickerSelectedItem pickerSelectedItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        pickerSelectedItem.f54954a = (VDraweeView) viewGroup.getChildAt(0);
        pickerSelectedItem.f54955b = (VImage) viewGroup.getChildAt(1);
    }
}
