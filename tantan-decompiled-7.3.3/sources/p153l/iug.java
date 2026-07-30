package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterVideoView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.live.LiveTagView;
import com.p051p1.mobile.putong.feed.newui.preview.gesture.PlayerViewWithTransAnim;
import com.p051p1.mobile.putong.newui.view.VExpandableTextContainer;
import com.tantanapp.media.ttmediaeffect.anim.AnimEffectPlayer;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class iug {
    /* JADX INFO: renamed from: a */
    public static void m142188a(hug hugVar, View view) {
        hugVar.f111643a = (FeedCenterVideoView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        hugVar.f111644b = viewGroup.getChildAt(0);
        hugVar.f111645c = (VLinear) viewGroup.getChildAt(1);
        hugVar.f111646d = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        hugVar.f111647e = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        hugVar.f111648f = (VLinear) viewGroup.getChildAt(2);
        hugVar.f111649g = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        hugVar.f111650h = (LiveTagView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        hugVar.f111651i = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
        hugVar.f111652j = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(2);
        hugVar.f111653k = (VExpandableTextContainer) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        hugVar.f111654l = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        hugVar.f111655m = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        hugVar.f111656n = (PlayerViewWithTransAnim) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4)).getChildAt(0);
        hugVar.f111657o = (VFrame) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4)).getChildAt(1);
        hugVar.f111658p = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4)).getChildAt(1)).getChildAt(0);
        hugVar.f111659q = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4)).getChildAt(1)).getChildAt(1);
        hugVar.f111660r = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4)).getChildAt(1)).getChildAt(2);
        hugVar.f111661s = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4)).getChildAt(2);
        hugVar.f111662t = (ConstraintLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4)).getChildAt(3);
        hugVar.f111663u = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4)).getChildAt(3)).getChildAt(1);
        hugVar.f111664v = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4)).getChildAt(3)).getChildAt(1)).getChildAt(0);
        hugVar.f111665w = (AnimEffectPlayer) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4)).getChildAt(3)).getChildAt(1)).getChildAt(1);
        hugVar.f111666x = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4)).getChildAt(4);
        hugVar.f111667y = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(5);
        hugVar.f111668z = viewGroup.getChildAt(3);
    }
}
