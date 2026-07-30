package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.newui.messages.anim.view.QuickChatAudioNewUiHeaderUserPeiLiaoView;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ssb0 {
    /* JADX INFO: renamed from: a */
    public static void m185715a(QuickChatAudioNewUiHeaderUserPeiLiaoView quickChatAudioNewUiHeaderUserPeiLiaoView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        quickChatAudioNewUiHeaderUserPeiLiaoView._img_icon = (ImageView) viewGroup.getChildAt(0);
        quickChatAudioNewUiHeaderUserPeiLiaoView._mark = (TextView) viewGroup.getChildAt(1);
        quickChatAudioNewUiHeaderUserPeiLiaoView._avatar_layout = (VFrame) viewGroup.getChildAt(2);
        quickChatAudioNewUiHeaderUserPeiLiaoView._profile_user = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        quickChatAudioNewUiHeaderUserPeiLiaoView._green = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        quickChatAudioNewUiHeaderUserPeiLiaoView._text_layout = (LinearLayout) viewGroup.getChildAt(3);
        quickChatAudioNewUiHeaderUserPeiLiaoView._name = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0);
        quickChatAudioNewUiHeaderUserPeiLiaoView._avatar_icon = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(1);
        quickChatAudioNewUiHeaderUserPeiLiaoView._age = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        quickChatAudioNewUiHeaderUserPeiLiaoView._say_hi = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        quickChatAudioNewUiHeaderUserPeiLiaoView._close = (VImage) viewGroup.getChildAt(4);
        quickChatAudioNewUiHeaderUserPeiLiaoView._gotochat = (VText) viewGroup.getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m185716b(QuickChatAudioNewUiHeaderUserPeiLiaoView quickChatAudioNewUiHeaderUserPeiLiaoView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95948pb, viewGroup, true);
        m185715a(quickChatAudioNewUiHeaderUserPeiLiaoView, viewInflate);
        return viewInflate;
    }
}
