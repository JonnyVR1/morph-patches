package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p046p1.mobile.putong.core.p053ui.messages.model.view.MessageNewProfileSettingFunItem;
import p147v.VLinear;
import p147v.VSwitchButton;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class wsz {
    /* JADX INFO: renamed from: a */
    public static void m205530a(MessageNewProfileSettingFunItem messageNewProfileSettingFunItem, View view) {
        messageNewProfileSettingFunItem.f32128d = (MessageNewProfileSettingFunItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        messageNewProfileSettingFunItem.f32129e = (VText) viewGroup.getChildAt(0);
        messageNewProfileSettingFunItem.f32130f = (VSwitchButton) viewGroup.getChildAt(1);
        messageNewProfileSettingFunItem.f32131g = (VLinear) viewGroup.getChildAt(2);
        messageNewProfileSettingFunItem.f32132h = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        messageNewProfileSettingFunItem.f32133i = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }
}
