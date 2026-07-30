package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.core.newui.view.LinearMeasureOrderLayout;
import com.p051p1.mobile.putong.core.p058ui.constellationmatch.ConstellationInfoView;
import com.p051p1.mobile.putong.core.p058ui.roundcorners.view.RoundConstraintLayout;
import org.apmem.tools.layouts.FlowLayout;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class lz5 {
    /* JADX INFO: renamed from: a */
    public static void m156407a(ConstellationInfoView constellationInfoView, View view) {
        constellationInfoView._constrain_layout = (RoundConstraintLayout) ((ViewGroup) view).getChildAt(0);
        constellationInfoView._image = (VDraweeView) view.findViewById(adc0.f70031N5);
        ViewGroup viewGroup = (ViewGroup) view;
        constellationInfoView._close = (VButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        constellationInfoView._order_layout = (LinearMeasureOrderLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        constellationInfoView._name = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(0);
        constellationInfoView._age = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(1);
        constellationInfoView._space = (Space) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        constellationInfoView._constellation_image = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6);
        constellationInfoView._info_layout = (ConstraintLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7);
        constellationInfoView._card_layout = (RelativeLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7)).getChildAt(0);
        constellationInfoView._type = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7)).getChildAt(0)).getChildAt(0);
        constellationInfoView._tags = (FlowLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7)).getChildAt(0)).getChildAt(1);
        constellationInfoView._desc = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7)).getChildAt(0)).getChildAt(2);
        constellationInfoView._branding = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7)).getChildAt(1);
        constellationInfoView._save_pic = (LinearLayout) viewGroup.getChildAt(1);
        constellationInfoView._save_pic_text = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        constellationInfoView._normal_operation = (ViewStub) viewGroup.getChildAt(2);
        constellationInfoView._usa_operation = (ViewStub) viewGroup.getChildAt(3);
    }
}
