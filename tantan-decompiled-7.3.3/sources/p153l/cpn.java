package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.hideandseek.IntlHideAndSeekInfoView;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class cpn {
    /* JADX INFO: renamed from: a */
    public static void m111812a(IntlHideAndSeekInfoView intlHideAndSeekInfoView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlHideAndSeekInfoView._info_icon = (VDraweeView) viewGroup.getChildAt(0);
        intlHideAndSeekInfoView._game_content = (VLinear) viewGroup.getChildAt(1);
        intlHideAndSeekInfoView._game_content_title = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        intlHideAndSeekInfoView._game_content_subtitle = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        intlHideAndSeekInfoView._game_time = (VText) viewGroup.getChildAt(2);
        intlHideAndSeekInfoView._game_location = (VText) viewGroup.getChildAt(3);
        intlHideAndSeekInfoView._game_member = (VLinear) viewGroup.getChildAt(4);
        intlHideAndSeekInfoView._positive = (VButton) viewGroup.getChildAt(5);
        intlHideAndSeekInfoView._negative = (VButton) viewGroup.getChildAt(6);
    }

    /* JADX INFO: renamed from: b */
    public static View m111813b(IntlHideAndSeekInfoView intlHideAndSeekInfoView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125469J4, viewGroup, true);
        m111812a(intlHideAndSeekInfoView, viewInflate);
        return viewInflate;
    }
}
