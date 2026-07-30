package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.legacy.widget.Space;
import com.p046p1.mobile.putong.core.newui.newmeet.feed.CoreExpandableTextContainer;
import com.p046p1.mobile.putong.core.newui.newmeet.feed.MeetFeedBaseItemView;
import com.p046p1.mobile.putong.newui.view.ODiamondTagLabel;
import com.p046p1.mobile.putong.p065ui.headframe.HeaderFrameWrapper;
import com.tantan.library.svga.SVGAnimationView;
import p147v.VFrame_Shadow;
import p147v.VImage;
import p147v.VLinear_FillerMeasure;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class t0y {
    /* JADX INFO: renamed from: a */
    public static void m186878a(MeetFeedBaseItemView meetFeedBaseItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        meetFeedBaseItemView.f26165d = (SVGAnimationView) viewGroup.getChildAt(0);
        meetFeedBaseItemView.f26166e = (HeaderFrameWrapper) viewGroup.getChildAt(1);
        meetFeedBaseItemView.f26167f = (VLinear_FillerMeasure) viewGroup.getChildAt(2);
        meetFeedBaseItemView.f26168g = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        meetFeedBaseItemView.f26169h = (Space) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        meetFeedBaseItemView.f26170i = (VImage) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        meetFeedBaseItemView.f26171j = (Space) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        meetFeedBaseItemView.f26172k = (ODiamondTagLabel) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4);
        meetFeedBaseItemView.f26173l = (VText) viewGroup.getChildAt(3);
        meetFeedBaseItemView.f26174m = (LinearLayout) viewGroup.getChildAt(4);
        meetFeedBaseItemView.f26175n = (VFrame_Shadow) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        meetFeedBaseItemView.f26176o = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0)).getChildAt(0);
        meetFeedBaseItemView.f26177p = (ImageView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        meetFeedBaseItemView.f26178q = (VFrame_Shadow) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2);
        meetFeedBaseItemView.f26179r = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2)).getChildAt(0);
        meetFeedBaseItemView.f26180s = (FrameLayout) viewGroup.getChildAt(5);
        meetFeedBaseItemView.f26181t = (TextView) viewGroup.getChildAt(6);
        meetFeedBaseItemView.f26182u = viewGroup.getChildAt(7);
        meetFeedBaseItemView.f26183v = (LinearLayout) viewGroup.getChildAt(8);
        meetFeedBaseItemView.f26184w = (CoreExpandableTextContainer) viewGroup.getChildAt(9);
    }
}
