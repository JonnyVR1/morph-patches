package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.widget.NewUIBuzzComboEntranceView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class kk40 {
    /* JADX INFO: renamed from: a */
    public static void m150083a(NewUIBuzzComboEntranceView newUIBuzzComboEntranceView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        newUIBuzzComboEntranceView._content_bg = viewGroup.getChildAt(0);
        newUIBuzzComboEntranceView._icon = (VImage) viewGroup.getChildAt(1);
        newUIBuzzComboEntranceView._content_root = (VLinear) viewGroup.getChildAt(2);
        newUIBuzzComboEntranceView._content_root_title = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        newUIBuzzComboEntranceView._content_root_desc = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        newUIBuzzComboEntranceView._red_dot = viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m150084b(NewUIBuzzComboEntranceView newUIBuzzComboEntranceView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(mec0.f136471f, viewGroup, true);
        m150083a(newUIBuzzComboEntranceView, viewInflate);
        return viewInflate;
    }
}
