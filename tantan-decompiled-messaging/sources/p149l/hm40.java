package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.widget.NormalBuzzComboEntranceView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class hm40 {
    /* JADX INFO: renamed from: a */
    public static void m131696a(NormalBuzzComboEntranceView normalBuzzComboEntranceView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        normalBuzzComboEntranceView._content_root = (VLinear) viewGroup.getChildAt(0);
        normalBuzzComboEntranceView._content_root_title = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        normalBuzzComboEntranceView._content_root_desc = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        normalBuzzComboEntranceView._icon = (VImage) viewGroup.getChildAt(1);
        normalBuzzComboEntranceView._red_dot = viewGroup.getChildAt(2);
        normalBuzzComboEntranceView._arrow_icon = viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m131697b(NormalBuzzComboEntranceView normalBuzzComboEntranceView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(h6c0.f106027d, viewGroup, true);
        m131696a(normalBuzzComboEntranceView, viewInflate);
        return viewInflate;
    }
}
