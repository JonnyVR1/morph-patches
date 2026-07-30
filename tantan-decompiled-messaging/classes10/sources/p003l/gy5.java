package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.p001ui.constellationmatch.ConstellationInfoView;
import l.u4c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class gy5 {
    /* JADX INFO: renamed from: a */
    public static void m6898a(ConstellationInfoView constellationInfoView, View view) {
        constellationInfoView._constrain_layout = ((ViewGroup) view).getChildAt(0);
        constellationInfoView._image = view.findViewById(u4c0.L5);
        ViewGroup viewGroup = (ViewGroup) view;
        constellationInfoView._close = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        constellationInfoView._order_layout = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        constellationInfoView._name = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(0);
        constellationInfoView._age = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(1);
        constellationInfoView._space = (Space) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        constellationInfoView._constellation_image = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6);
        constellationInfoView._info_layout = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7);
        constellationInfoView._card_layout = (RelativeLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7)).getChildAt(0);
        constellationInfoView._type = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7)).getChildAt(0)).getChildAt(0);
        constellationInfoView._tags = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7)).getChildAt(0)).getChildAt(1);
        constellationInfoView._desc = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7)).getChildAt(0)).getChildAt(2);
        constellationInfoView._branding = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7)).getChildAt(1);
        constellationInfoView._save_pic = (LinearLayout) viewGroup.getChildAt(1);
        constellationInfoView._save_pic_text = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        constellationInfoView._normal_operation = (ViewStub) viewGroup.getChildAt(2);
        constellationInfoView._usa_operation = (ViewStub) viewGroup.getChildAt(3);
    }
}
