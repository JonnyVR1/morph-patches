package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.widget.NormalBuzzComboEntranceView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class vu40 {
    /* JADX INFO: renamed from: a */
    public static void m202774a(NormalBuzzComboEntranceView normalBuzzComboEntranceView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        normalBuzzComboEntranceView._content_root = (VLinear) viewGroup.getChildAt(0);
        normalBuzzComboEntranceView._content_root_title = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        normalBuzzComboEntranceView._content_root_desc = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        normalBuzzComboEntranceView._icon = (VImage) viewGroup.getChildAt(1);
        normalBuzzComboEntranceView._red_dot = viewGroup.getChildAt(2);
        normalBuzzComboEntranceView._arrow_icon = viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m202775b(NormalBuzzComboEntranceView normalBuzzComboEntranceView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(mec0.f136469d, viewGroup, true);
        m202774a(normalBuzzComboEntranceView, viewInflate);
        return viewInflate;
    }
}
