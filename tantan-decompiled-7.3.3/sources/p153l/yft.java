package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.immomo.svgaplayer.view.MomoLayUpSVGAImageView;
import com.p051p1.mobile.putong.live.base.view.XEGiftView;
import com.p051p1.mobile.putong.live.livingroom.increment.recharge.LiveRemindDialog;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class yft {
    /* JADX INFO: renamed from: a */
    public static void m215814a(LiveRemindDialog liveRemindDialog, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveRemindDialog.f51728d = (FrameLayout) viewGroup.getChildAt(0);
        liveRemindDialog.f51729e = (MomoLayUpSVGAImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        liveRemindDialog.f51730f = (XEGiftView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        liveRemindDialog.f51731g = (VText) viewGroup.getChildAt(1);
        liveRemindDialog.f51732h = (VText) viewGroup.getChildAt(2);
    }
}
