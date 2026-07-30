package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.settings.filter.newui.FilterSwitchCell;
import com.p046p1.mobile.putong.core.p053ui.settings.filter.newui.NewUIAbFilterBaseSetting;
import com.p046p1.mobile.putong.core.p053ui.settings.filter.tags.TagContainerLayout;
import com.p046p1.mobile.putong.core.view.CommonLabelShowView;
import p147v.VFrame;
import p147v.VLinear;
import p147v.VListCell;
import p147v.VRangeSlider;
import p147v.VSlider;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ub40 {
    /* JADX INFO: renamed from: a */
    public static void m192815a(NewUIAbFilterBaseSetting newUIAbFilterBaseSetting, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        newUIAbFilterBaseSetting.f36206c = (VListCell) viewGroup.getChildAt(0);
        newUIAbFilterBaseSetting.f36207d = (VFrame) viewGroup.getChildAt(1);
        newUIAbFilterBaseSetting.f36208e = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        newUIAbFilterBaseSetting.f36209f = (VFrame) viewGroup.getChildAt(2);
        newUIAbFilterBaseSetting.f36210g = (CommonLabelShowView) viewGroup.getChildAt(3);
        newUIAbFilterBaseSetting.f36211h = (TextView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        newUIAbFilterBaseSetting.f36212i = (VRangeSlider) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2);
        newUIAbFilterBaseSetting.f36213j = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(0);
        newUIAbFilterBaseSetting.f36214k = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(1);
        newUIAbFilterBaseSetting.f36215l = (VSlider) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(2);
        newUIAbFilterBaseSetting.f36216m = (VListCell) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1);
        newUIAbFilterBaseSetting.f36217n = (FilterSwitchCell) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(3);
        newUIAbFilterBaseSetting.f36218o = (VFrame) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(4);
        newUIAbFilterBaseSetting.f36219p = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(4)).getChildAt(1);
        newUIAbFilterBaseSetting.f36220q = (VSlider) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(4)).getChildAt(2);
        newUIAbFilterBaseSetting.f36221r = (VLinear) viewGroup.getChildAt(6);
        newUIAbFilterBaseSetting.f36222s = (VListCell) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(1);
        newUIAbFilterBaseSetting.f36223t = (TagContainerLayout) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(1);
        newUIAbFilterBaseSetting.f36224u = (VText) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(0);
        newUIAbFilterBaseSetting.f36225v = (VListCell) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(1);
        newUIAbFilterBaseSetting.f36226w = (VLinear) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(2);
        newUIAbFilterBaseSetting.f36227x = (VListCell) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(2)).getChildAt(1);
    }
}
