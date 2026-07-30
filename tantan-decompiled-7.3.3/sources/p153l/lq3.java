package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.widget.BuzzSwitchItemView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VSwitchButton;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class lq3 {
    /* JADX INFO: renamed from: a */
    public static void m155314a(BuzzSwitchItemView buzzSwitchItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        buzzSwitchItemView._icon = (VImage) viewGroup.getChildAt(0);
        buzzSwitchItemView._right_info = (VLinear) viewGroup.getChildAt(1);
        buzzSwitchItemView._right_info_title = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        buzzSwitchItemView._right_info_desc = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        buzzSwitchItemView._toggle = (VSwitchButton) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m155315b(BuzzSwitchItemView buzzSwitchItemView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(mec0.f136478m, viewGroup, true);
        m155314a(buzzSwitchItemView, viewInflate);
        return viewInflate;
    }
}
