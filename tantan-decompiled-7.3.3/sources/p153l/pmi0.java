package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.core.newui.view.LinearMeasureOrderLayout;
import com.p051p1.mobile.putong.core.p058ui.tarot.TarotInfoView;
import org.apmem.tools.layouts.FlowLayout;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class pmi0 {
    /* JADX INFO: renamed from: a */
    public static void m172949a(TarotInfoView tarotInfoView, View view) {
        tarotInfoView._constrain_layout = (ConstraintLayout) ((ViewGroup) view).getChildAt(0);
        tarotInfoView._image = (VDraweeView) view.findViewById(adc0.f70031N5);
        ViewGroup viewGroup = (ViewGroup) view;
        tarotInfoView._close = (VButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        tarotInfoView._space = (Space) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        tarotInfoView._info_layout = (ConstraintLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        tarotInfoView._order_layout = (LinearMeasureOrderLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0);
        tarotInfoView._name = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0)).getChildAt(0);
        tarotInfoView._age = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0)).getChildAt(1);
        tarotInfoView._zodiac = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(1);
        tarotInfoView._card_layout = (RelativeLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(2);
        tarotInfoView._type = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(2)).getChildAt(0);
        tarotInfoView._tags = (FlowLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(2)).getChildAt(1);
        tarotInfoView._desc = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(2)).getChildAt(2);
        tarotInfoView._image_layout = (RelativeLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(3);
        tarotInfoView._tarot_image = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(3)).getChildAt(0);
        tarotInfoView._reversed = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(3)).getChildAt(1);
        tarotInfoView._upright = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(3)).getChildAt(2);
        tarotInfoView._branding = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(4);
        tarotInfoView._save_pic = (LinearLayout) viewGroup.getChildAt(1);
        tarotInfoView._save_pic_text = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        tarotInfoView._normal_operation = (ViewStub) viewGroup.getChildAt(2);
        tarotInfoView._usa_operation = (ViewStub) viewGroup.getChildAt(3);
    }
}
