package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.widget.NewUIBuzzComboEntranceView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class wb40 {
    /* JADX INFO: renamed from: a */
    public static void m202511a(NewUIBuzzComboEntranceView newUIBuzzComboEntranceView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        newUIBuzzComboEntranceView._content_bg = viewGroup.getChildAt(0);
        newUIBuzzComboEntranceView._icon = (VImage) viewGroup.getChildAt(1);
        newUIBuzzComboEntranceView._content_root = (VLinear) viewGroup.getChildAt(2);
        newUIBuzzComboEntranceView._content_root_title = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        newUIBuzzComboEntranceView._content_root_desc = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        newUIBuzzComboEntranceView._red_dot = viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m202512b(NewUIBuzzComboEntranceView newUIBuzzComboEntranceView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(h6c0.f106029f, viewGroup, true);
        m202511a(newUIBuzzComboEntranceView, viewInflate);
        return viewInflate;
    }
}
