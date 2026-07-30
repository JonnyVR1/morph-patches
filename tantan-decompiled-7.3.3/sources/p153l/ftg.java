package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterForwardVideoView;
import com.p051p1.mobile.putong.feed.newui.preview.gesture.PlayerViewWithTransAnim;
import com.p051p1.mobile.putong.newui.view.VExpandableTextContainer;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class ftg {
    /* JADX INFO: renamed from: a */
    public static void m127322a(etg etgVar, View view) {
        etgVar.f95718a = (FeedCenterForwardVideoView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        etgVar.f95719b = viewGroup.getChildAt(0);
        etgVar.f95720c = (VLinear) viewGroup.getChildAt(1);
        etgVar.f95721d = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        etgVar.f95722e = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        etgVar.f95723f = (VLinear) viewGroup.getChildAt(2);
        etgVar.f95724g = (VExpandableTextContainer) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        etgVar.f95725h = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        etgVar.f95726i = (RelativeLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0);
        etgVar.f95727j = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        etgVar.f95728k = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        etgVar.f95729l = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(1);
        etgVar.f95730m = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(1)).getChildAt(0);
        etgVar.f95731n = (PlayerViewWithTransAnim) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        etgVar.f95732o = (VFrame) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        etgVar.f95733p = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        etgVar.f95734q = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        etgVar.f95735r = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(2);
        etgVar.f95736s = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        etgVar.f95737t = viewGroup.getChildAt(3);
    }
}
