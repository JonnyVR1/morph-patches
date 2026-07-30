package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.newui.messages.anim.view.widget.ImageXfermodeView;
import com.p051p1.mobile.putong.core.p058ui.quickaudio.newquickchat.secondfloor.item.QuickChatPageItem;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class a5c0 {
    /* JADX INFO: renamed from: a */
    public static void m96047a(QuickChatPageItem quickChatPageItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        quickChatPageItem._rootView = (VLinear) viewGroup.getChildAt(0);
        quickChatPageItem._icon = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        quickChatPageItem._title = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        quickChatPageItem._sub_title = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        quickChatPageItem._head_icon = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        quickChatPageItem._real_head_icon = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        quickChatPageItem._user_model_1 = (ImageXfermodeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(0);
        quickChatPageItem._user_model_2 = (ImageXfermodeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(1);
        quickChatPageItem._user_model_3 = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m96048b(QuickChatPageItem quickChatPageItem, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125511Le, viewGroup, true);
        m96047a(quickChatPageItem, viewInflate);
        return viewInflate;
    }
}
