package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.settings.filter.newui.FilterSwitchCell;
import com.p051p1.mobile.putong.core.p058ui.settings.filter.newui.NewUIAbFilterBaseSetting;
import com.p051p1.mobile.putong.core.p058ui.settings.filter.tags.TagContainerLayout;
import com.p051p1.mobile.putong.core.view.CommonLabelShowView;
import p151v.VFrame;
import p151v.VLinear;
import p151v.VListCell;
import p151v.VRangeSlider;
import p151v.VSlider;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ik40 {
    /* JADX INFO: renamed from: a */
    public static void m140268a(NewUIAbFilterBaseSetting newUIAbFilterBaseSetting, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        newUIAbFilterBaseSetting.f37054c = (VListCell) viewGroup.getChildAt(0);
        newUIAbFilterBaseSetting.f37055d = (VFrame) viewGroup.getChildAt(1);
        newUIAbFilterBaseSetting.f37056e = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        newUIAbFilterBaseSetting.f37057f = (VFrame) viewGroup.getChildAt(2);
        newUIAbFilterBaseSetting.f37058g = (CommonLabelShowView) viewGroup.getChildAt(3);
        newUIAbFilterBaseSetting.f37059h = (TextView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        newUIAbFilterBaseSetting.f37060i = (VRangeSlider) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2);
        newUIAbFilterBaseSetting.f37061j = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(0);
        newUIAbFilterBaseSetting.f37062k = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(1);
        newUIAbFilterBaseSetting.f37063l = (VSlider) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(2);
        newUIAbFilterBaseSetting.f37064m = (VListCell) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1);
        newUIAbFilterBaseSetting.f37065n = (FilterSwitchCell) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(3);
        newUIAbFilterBaseSetting.f37066o = (VFrame) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(4);
        newUIAbFilterBaseSetting.f37067p = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(4)).getChildAt(1);
        newUIAbFilterBaseSetting.f37068q = (VSlider) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(4)).getChildAt(2);
        newUIAbFilterBaseSetting.f37069r = (VLinear) viewGroup.getChildAt(6);
        newUIAbFilterBaseSetting.f37070s = (VListCell) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(1);
        newUIAbFilterBaseSetting.f37071t = (TagContainerLayout) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(1);
        newUIAbFilterBaseSetting.f37072u = (VText) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(0);
        newUIAbFilterBaseSetting.f37073v = (VListCell) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(1);
        newUIAbFilterBaseSetting.f37074w = (VLinear) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(2);
        newUIAbFilterBaseSetting.f37075x = (VListCell) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(2)).getChildAt(1);
    }
}
