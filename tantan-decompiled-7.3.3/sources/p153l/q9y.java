package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.legacy.widget.Space;
import com.p051p1.mobile.putong.core.newui.newmeet.feed.CoreExpandableTextContainer;
import com.p051p1.mobile.putong.core.newui.newmeet.feed.MeetFeedBaseItemView;
import com.p051p1.mobile.putong.newui.view.ODiamondTagLabel;
import com.p051p1.mobile.putong.p070ui.headframe.HeaderFrameWrapper;
import com.tantan.library.svga.SVGAnimationView;
import p151v.VFrame_Shadow;
import p151v.VImage;
import p151v.VLinear_FillerMeasure;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class q9y {
    /* JADX INFO: renamed from: a */
    public static void m175851a(MeetFeedBaseItemView meetFeedBaseItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        meetFeedBaseItemView.f26907d = (SVGAnimationView) viewGroup.getChildAt(0);
        meetFeedBaseItemView.f26908e = (HeaderFrameWrapper) viewGroup.getChildAt(1);
        meetFeedBaseItemView.f26909f = (VLinear_FillerMeasure) viewGroup.getChildAt(2);
        meetFeedBaseItemView.f26910g = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        meetFeedBaseItemView.f26911h = (Space) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        meetFeedBaseItemView.f26912i = (VImage) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        meetFeedBaseItemView.f26913j = (Space) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        meetFeedBaseItemView.f26914k = (ODiamondTagLabel) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4);
        meetFeedBaseItemView.f26915l = (VText) viewGroup.getChildAt(3);
        meetFeedBaseItemView.f26916m = (LinearLayout) viewGroup.getChildAt(4);
        meetFeedBaseItemView.f26917n = (VFrame_Shadow) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        meetFeedBaseItemView.f26918o = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0)).getChildAt(0);
        meetFeedBaseItemView.f26919p = (ImageView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        meetFeedBaseItemView.f26920q = (VFrame_Shadow) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2);
        meetFeedBaseItemView.f26921r = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2)).getChildAt(0);
        meetFeedBaseItemView.f26922s = (FrameLayout) viewGroup.getChildAt(5);
        meetFeedBaseItemView.f26923t = (TextView) viewGroup.getChildAt(6);
        meetFeedBaseItemView.f26924u = viewGroup.getChildAt(7);
        meetFeedBaseItemView.f26925v = (LinearLayout) viewGroup.getChildAt(8);
        meetFeedBaseItemView.f26926w = (CoreExpandableTextContainer) viewGroup.getChildAt(9);
    }
}
