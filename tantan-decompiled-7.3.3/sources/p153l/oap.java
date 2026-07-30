package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.active.IntlRecallMembershipCard;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class oap {
    /* JADX INFO: renamed from: a */
    public static void m166848a(IntlRecallMembershipCard intlRecallMembershipCard, View view) {
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
