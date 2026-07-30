package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterForwardVideoView;
import com.p046p1.mobile.putong.feed.newui.preview.gesture.PlayerViewWithTransAnim;
import com.p046p1.mobile.putong.newui.view.VExpandableTextContainer;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class qrg {
    /* JADX INFO: renamed from: a */
    public static void m175990a(prg prgVar, View view) {
        prgVar.f150881a = (FeedCenterForwardVideoView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        prgVar.f150882b = viewGroup.getChildAt(0);
        prgVar.f150883c = (VLinear) viewGroup.getChildAt(1);
        prgVar.f150884d = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        prgVar.f150885e = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        prgVar.f150886f = (VLinear) viewGroup.getChildAt(2);
        prgVar.f150887g = (VExpandableTextContainer) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        prgVar.f150888h = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        prgVar.f150889i = (RelativeLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0);
        prgVar.f150890j = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        prgVar.f150891k = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        prgVar.f150892l = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(1);
        prgVar.f150893m = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(1)).getChildAt(0);
        prgVar.f150894n = (PlayerViewWithTransAnim) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        prgVar.f150895o = (VFrame) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        prgVar.f150896p = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        prgVar.f150897q = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        prgVar.f150898r = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(2);
        prgVar.f150899s = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        prgVar.f150900t = viewGroup.getChildAt(3);
    }
}
