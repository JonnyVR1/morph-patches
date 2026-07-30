package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.CommonMedalView;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.view.UserCardMedalAndNameView;
import com.p046p1.mobile.putong.live.livingroom.royal.LiveGradientTextView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class h0k0 {
    /* JADX INFO: renamed from: a */
    public static void m128965a(UserCardMedalAndNameView userCardMedalAndNameView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        userCardMedalAndNameView.f49415a = (LiveGradientTextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        userCardMedalAndNameView.f49416b = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        userCardMedalAndNameView.f49417c = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        userCardMedalAndNameView.f49418d = (VLinear) viewGroup.getChildAt(1);
        userCardMedalAndNameView.f49419e = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        userCardMedalAndNameView.f49420f = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        userCardMedalAndNameView.f49421g = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        userCardMedalAndNameView.f49422h = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        userCardMedalAndNameView.f49423i = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
        userCardMedalAndNameView.f49424j = (ConstraintLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(2);
        userCardMedalAndNameView.f49425k = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(2)).getChildAt(0);
        userCardMedalAndNameView.f49426l = (CommonMedalView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(3);
        userCardMedalAndNameView.f49427m = (CommonMedalView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(4);
        userCardMedalAndNameView.f49428n = (CommonMedalView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(5);
        userCardMedalAndNameView.f49429o = (CommonMedalView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(6);
        userCardMedalAndNameView.f49430p = (CommonMedalView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(7);
    }
}
