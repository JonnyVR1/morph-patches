package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.immomo.svgaplayer.view.MomoLayUpSVGAImageView;
import com.p046p1.mobile.putong.live.base.view.XEGiftView;
import com.p046p1.mobile.putong.live.livingroom.increment.recharge.LiveRemindDialog;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class xdt {
    /* JADX INFO: renamed from: a */
    public static void m208428a(LiveRemindDialog liveRemindDialog, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveRemindDialog.f50880d = (FrameLayout) viewGroup.getChildAt(0);
        liveRemindDialog.f50881e = (MomoLayUpSVGAImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        liveRemindDialog.f50882f = (XEGiftView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        liveRemindDialog.f50883g = (VText) viewGroup.getChildAt(1);
        liveRemindDialog.f50884h = (VText) viewGroup.getChildAt(2);
    }
}
