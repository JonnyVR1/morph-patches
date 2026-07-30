package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p1.mobile.putong.core.ui.messages.model.view.MessageNewProfileSettingFunItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class wsz {
    /* JADX INFO: renamed from: a */
    public static void m10543a(MessageNewProfileSettingFunItem messageNewProfileSettingFunItem, View view) {
        messageNewProfileSettingFunItem.d = (MessageNewProfileSettingFunItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        messageNewProfileSettingFunItem.e = viewGroup.getChildAt(0);
        messageNewProfileSettingFunItem.f = viewGroup.getChildAt(1);
        messageNewProfileSettingFunItem.g = viewGroup.getChildAt(2);
        messageNewProfileSettingFunItem.h = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        messageNewProfileSettingFunItem.i = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }
}
