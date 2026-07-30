package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p1.mobile.putong.core.ui.messages.model.view.MessageNewProfileSettingHead;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ysz {
    /* JADX INFO: renamed from: a */
    public static void m11281a(MessageNewProfileSettingHead messageNewProfileSettingHead, View view) {
        messageNewProfileSettingHead.d = (MessageNewProfileSettingHead) view;
        ViewGroup viewGroup = (ViewGroup) view;
        messageNewProfileSettingHead.e = (FrameLayout) viewGroup.getChildAt(0);
        messageNewProfileSettingHead.f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        messageNewProfileSettingHead.g = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        messageNewProfileSettingHead.h = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        messageNewProfileSettingHead.i = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
