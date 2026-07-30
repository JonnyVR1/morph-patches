package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.p053ui.messages.model.view.MessageNewProfileSettingHead;
import com.p046p1.mobile.putong.core.p053ui.view.GradientBgButton;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ysz {
    /* JADX INFO: renamed from: a */
    public static void m215991a(MessageNewProfileSettingHead messageNewProfileSettingHead, View view) {
        messageNewProfileSettingHead.f32135d = (MessageNewProfileSettingHead) view;
        ViewGroup viewGroup = (ViewGroup) view;
        messageNewProfileSettingHead.f32136e = (FrameLayout) viewGroup.getChildAt(0);
        messageNewProfileSettingHead.f32137f = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        messageNewProfileSettingHead.f32138g = (GradientBgButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        messageNewProfileSettingHead.f32139h = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        messageNewProfileSettingHead.f32140i = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
