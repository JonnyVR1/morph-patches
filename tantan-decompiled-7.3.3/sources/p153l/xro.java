package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.active.IntlPartnerActiveCard;
import com.p051p1.mobile.putong.core.p058ui.roundcorners.view.RoundLinearLayout;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class xro {
    /* JADX INFO: renamed from: a */
    public static void m212845a(IntlPartnerActiveCard intlPartnerActiveCard, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlPartnerActiveCard._card_bg = (VDraweeView) viewGroup.getChildAt(0);
        intlPartnerActiveCard._us_card_bg = (VDraweeView) viewGroup.getChildAt(1);
        intlPartnerActiveCard._card_bottom_bg = (VDraweeView) viewGroup.getChildAt(2);
        intlPartnerActiveCard._user_info = (VLinear) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        intlPartnerActiveCard._user_info_title = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0);
        intlPartnerActiveCard._user_info_age = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(1);
        intlPartnerActiveCard._desc_text = (TextView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        intlPartnerActiveCard._btn_bottom = (RoundLinearLayout) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        intlPartnerActiveCard._btn_bottom_btn_bottom_text = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2)).getChildAt(0);
        intlPartnerActiveCard._buttons_us = (VLinear) viewGroup.getChildAt(4);
        intlPartnerActiveCard._buttons_us_like_us = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        intlPartnerActiveCard._buttons_us_dislike_us = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
    }
}
