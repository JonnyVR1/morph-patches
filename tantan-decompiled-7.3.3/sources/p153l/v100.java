package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.p058ui.messages.model.view.MessageNewProfileSettingHead;
import com.p051p1.mobile.putong.core.p058ui.view.GradientBgButton;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class v100 {
    /* JADX INFO: renamed from: a */
    public static void m198964a(MessageNewProfileSettingHead messageNewProfileSettingHead, View view) {
        messageNewProfileSettingHead.f32983d = (MessageNewProfileSettingHead) view;
        ViewGroup viewGroup = (ViewGroup) view;
        messageNewProfileSettingHead.f32984e = (FrameLayout) viewGroup.getChildAt(0);
        messageNewProfileSettingHead.f32985f = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        messageNewProfileSettingHead.f32986g = (GradientBgButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        messageNewProfileSettingHead.f32987h = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        messageNewProfileSettingHead.f32988i = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
