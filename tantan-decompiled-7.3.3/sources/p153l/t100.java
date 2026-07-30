package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p051p1.mobile.putong.core.p058ui.messages.model.view.MessageNewProfileSettingFunItem;
import p151v.VLinear;
import p151v.VSwitchButton;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class t100 {
    /* JADX INFO: renamed from: a */
    public static void m188828a(MessageNewProfileSettingFunItem messageNewProfileSettingFunItem, View view) {
        messageNewProfileSettingFunItem.f32976d = (MessageNewProfileSettingFunItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        messageNewProfileSettingFunItem.f32977e = (VText) viewGroup.getChildAt(0);
        messageNewProfileSettingFunItem.f32978f = (VSwitchButton) viewGroup.getChildAt(1);
        messageNewProfileSettingFunItem.f32979g = (VLinear) viewGroup.getChildAt(2);
        messageNewProfileSettingFunItem.f32980h = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        messageNewProfileSettingFunItem.f32981i = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }
}
