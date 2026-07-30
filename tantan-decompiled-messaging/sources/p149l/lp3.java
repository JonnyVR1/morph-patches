package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.widget.BuzzSwitchItemView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VSwitchButton;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class lp3 {
    /* JADX INFO: renamed from: a */
    public static void m150821a(BuzzSwitchItemView buzzSwitchItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        buzzSwitchItemView._icon = (VImage) viewGroup.getChildAt(0);
        buzzSwitchItemView._right_info = (VLinear) viewGroup.getChildAt(1);
        buzzSwitchItemView._right_info_title = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        buzzSwitchItemView._right_info_desc = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        buzzSwitchItemView._toggle = (VSwitchButton) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m150822b(BuzzSwitchItemView buzzSwitchItemView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(h6c0.f106036m, viewGroup, true);
        m150821a(buzzSwitchItemView, viewInflate);
        return viewInflate;
    }
}
