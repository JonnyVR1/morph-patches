package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.newui.messages.anim.view.QuickChatAudioNewUiHeaderUserView;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class a1c0 {
    /* JADX INFO: renamed from: a */
    public static void m95482a(QuickChatAudioNewUiHeaderUserView quickChatAudioNewUiHeaderUserView, View view) {
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
    public static View m95483b(QuickChatAudioNewUiHeaderUserView quickChatAudioNewUiHeaderUserView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f126104vb, viewGroup, true);
        m95482a(quickChatAudioNewUiHeaderUserView, viewInflate);
        return viewInflate;
    }
}
