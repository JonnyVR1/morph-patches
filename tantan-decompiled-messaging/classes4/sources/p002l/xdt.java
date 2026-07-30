package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.live.livingroom.increment.recharge.LiveRemindDialog;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class xdt {
    /* JADX INFO: renamed from: a */
    public static void m25897a(LiveRemindDialog liveRemindDialog, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveRemindDialog.f6922d = (FrameLayout) viewGroup.getChildAt(0);
        liveRemindDialog.f6923e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        liveRemindDialog.f6924f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        liveRemindDialog.f6925g = viewGroup.getChildAt(1);
        liveRemindDialog.f6926h = viewGroup.getChildAt(2);
    }
}
