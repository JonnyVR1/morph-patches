package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterVideoView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.live.LiveTagView;
import com.p046p1.mobile.putong.feed.newui.preview.gesture.PlayerViewWithTransAnim;
import com.p046p1.mobile.putong.newui.view.VExpandableTextContainer;
import com.tantanapp.media.ttmediaeffect.anim.AnimEffectPlayer;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class tsg {
    /* JADX INFO: renamed from: a */
    public static void m190561a(ssg ssgVar, View view) {
        ssgVar.f166187a = (FeedCenterVideoView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        ssgVar.f166188b = viewGroup.getChildAt(0);
        ssgVar.f166189c = (VLinear) viewGroup.getChildAt(1);
        ssgVar.f166190d = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        ssgVar.f166191e = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        ssgVar.f166192f = (VLinear) viewGroup.getChildAt(2);
        ssgVar.f166193g = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        ssgVar.f166194h = (LiveTagView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        ssgVar.f166195i = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
        ssgVar.f166196j = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(2);
        ssgVar.f166197k = (VExpandableTextContainer) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        ssgVar.f166198l = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        ssgVar.f166199m = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        ssgVar.f166200n = (PlayerViewWithTransAnim) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4)).getChildAt(0);
        ssgVar.f166201o = (VFrame) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4)).getChildAt(1);
        ssgVar.f166202p = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4)).getChildAt(1)).getChildAt(0);
        ssgVar.f166203q = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4)).getChildAt(1)).getChildAt(1);
        ssgVar.f166204r = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4)).getChildAt(1)).getChildAt(2);
        ssgVar.f166205s = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4)).getChildAt(2);
        ssgVar.f166206t = (ConstraintLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4)).getChildAt(3);
        ssgVar.f166207u = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4)).getChildAt(3)).getChildAt(1);
        ssgVar.f166208v = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4)).getChildAt(3)).getChildAt(1)).getChildAt(0);
        ssgVar.f166209w = (AnimEffectPlayer) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4)).getChildAt(3)).getChildAt(1)).getChildAt(1);
        ssgVar.f166210x = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4)).getChildAt(4);
        ssgVar.f166211y = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(5);
        ssgVar.f166212z = viewGroup.getChildAt(3);
    }
}
