package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.active.IntlRecallMembershipCard;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class o8p {
    /* JADX INFO: renamed from: a */
    public static void m163189a(IntlRecallMembershipCard intlRecallMembershipCard, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlRecallMembershipCard._card_bg = (VDraweeView) viewGroup.getChildAt(0);
        intlRecallMembershipCard._card_icon = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        intlRecallMembershipCard._card_title = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        intlRecallMembershipCard._card_subtitle = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        intlRecallMembershipCard._card_big_icon = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        intlRecallMembershipCard._card_btn_bg = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        intlRecallMembershipCard._card_btn = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
    }
}
