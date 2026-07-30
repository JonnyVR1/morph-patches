package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.newui.messages.anim.view.QuickChatAudioNewUiHeaderUserView;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class wsb0 {
    /* JADX INFO: renamed from: a */
    public static void m205473a(QuickChatAudioNewUiHeaderUserView quickChatAudioNewUiHeaderUserView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        quickChatAudioNewUiHeaderUserView._mark = (TextView) viewGroup.getChildAt(0);
        quickChatAudioNewUiHeaderUserView._avatar_layout = (VFrame) viewGroup.getChildAt(1);
        quickChatAudioNewUiHeaderUserView._profile_user = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        quickChatAudioNewUiHeaderUserView._green = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        quickChatAudioNewUiHeaderUserView._text_layout = (LinearLayout) viewGroup.getChildAt(2);
        quickChatAudioNewUiHeaderUserView._name = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        quickChatAudioNewUiHeaderUserView._avatar_icon = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
        quickChatAudioNewUiHeaderUserView._age = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        quickChatAudioNewUiHeaderUserView._say_hi = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        quickChatAudioNewUiHeaderUserView._close = (VImage) viewGroup.getChildAt(3);
        quickChatAudioNewUiHeaderUserView._gotochat = (VText) viewGroup.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m205474b(QuickChatAudioNewUiHeaderUserView quickChatAudioNewUiHeaderUserView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95931ob, viewGroup, true);
        m205473a(quickChatAudioNewUiHeaderUserView, viewInflate);
        return viewInflate;
    }
}
