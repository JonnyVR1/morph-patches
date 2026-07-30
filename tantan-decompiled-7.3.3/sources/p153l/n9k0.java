package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.CommonMedalView;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.view.UserCardMedalAndNameView;
import com.p051p1.mobile.putong.live.livingroom.royal.LiveGradientTextView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class n9k0 {
    /* JADX INFO: renamed from: a */
    public static void m161988a(UserCardMedalAndNameView userCardMedalAndNameView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        userCardMedalAndNameView.f50263a = (LiveGradientTextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        userCardMedalAndNameView.f50264b = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        userCardMedalAndNameView.f50265c = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        userCardMedalAndNameView.f50266d = (VLinear) viewGroup.getChildAt(1);
        userCardMedalAndNameView.f50267e = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        userCardMedalAndNameView.f50268f = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        userCardMedalAndNameView.f50269g = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        userCardMedalAndNameView.f50270h = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        userCardMedalAndNameView.f50271i = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
        userCardMedalAndNameView.f50272j = (ConstraintLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(2);
        userCardMedalAndNameView.f50273k = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(2)).getChildAt(0);
        userCardMedalAndNameView.f50274l = (CommonMedalView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(3);
        userCardMedalAndNameView.f50275m = (CommonMedalView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(4);
        userCardMedalAndNameView.f50276n = (CommonMedalView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(5);
        userCardMedalAndNameView.f50277o = (CommonMedalView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(6);
        userCardMedalAndNameView.f50278p = (CommonMedalView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(7);
    }
}
