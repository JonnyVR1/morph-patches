package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.newui.messages.anim.view.widget.ImageXfermodeView;
import com.p051p1.mobile.putong.core.p058ui.quickaudio.newquickchat.secondfloor.item.QuickChatLoftChatItem;
import com.tantan.library.svga.SVGAnimationView;
import p151v.VFrame;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class l3c0 {
    /* JADX INFO: renamed from: a */
    public static void m152685a(QuickChatLoftChatItem quickChatLoftChatItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        quickChatLoftChatItem._rootView = (VFrame) viewGroup.getChildAt(0);
        quickChatLoftChatItem._svg_anim = (SVGAnimationView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        quickChatLoftChatItem._click_area = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        quickChatLoftChatItem._layout = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        quickChatLoftChatItem._header = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        quickChatLoftChatItem._header_content = (ImageXfermodeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        quickChatLoftChatItem._name = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
        quickChatLoftChatItem._describe = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(2);
        quickChatLoftChatItem._button = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m152686b(QuickChatLoftChatItem quickChatLoftChatItem, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125495Ke, viewGroup, true);
        m152685a(quickChatLoftChatItem, viewInflate);
        return viewInflate;
    }
}
