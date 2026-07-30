package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.newui.messages.anim.view.widget.ImageXfermodeView;
import com.p046p1.mobile.putong.core.p053ui.quickaudio.newquickchat.secondfloor.item.QuickChatPageItem;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class wwb0 {
    /* JADX INFO: renamed from: a */
    public static void m205853a(QuickChatPageItem quickChatPageItem, View view) {
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
    public static View m205854b(QuickChatPageItem quickChatPageItem, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95345Ee, viewGroup, true);
        m205853a(quickChatPageItem, viewInflate);
        return viewInflate;
    }
}
