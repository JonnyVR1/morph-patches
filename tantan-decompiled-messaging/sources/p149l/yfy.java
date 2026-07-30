package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.widget.MemojiBuzzComboEntranceView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class yfy {
    /* JADX INFO: renamed from: a */
    public static void m214598a(MemojiBuzzComboEntranceView memojiBuzzComboEntranceView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        memojiBuzzComboEntranceView._content_root = (VFrame) viewGroup.getChildAt(0);
        memojiBuzzComboEntranceView._content_root_preview_root = (VFrame) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        memojiBuzzComboEntranceView._content_root_content_bg = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        memojiBuzzComboEntranceView._content_root_icon = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        memojiBuzzComboEntranceView._content_root_title = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        memojiBuzzComboEntranceView._content_root_desc = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        memojiBuzzComboEntranceView._red_dot = viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m214599b(MemojiBuzzComboEntranceView memojiBuzzComboEntranceView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(h6c0.f106028e, viewGroup, true);
        m214598a(memojiBuzzComboEntranceView, viewInflate);
        return viewInflate;
    }
}
