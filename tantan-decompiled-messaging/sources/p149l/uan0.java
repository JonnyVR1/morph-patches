package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.giftwall.detail.VoiceGiftWallLightItemView;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class uan0 {
    /* JADX INFO: renamed from: a */
    public static void m192791a(tan0 tan0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        tan0Var.f169151a = viewGroup.getChildAt(0);
        tan0Var.f169152b = (FrameLayout) viewGroup.getChildAt(1);
        tan0Var.f169153c = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        tan0Var.f169154d = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        tan0Var.f169155e = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        tan0Var.f169156f = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        tan0Var.f169157g = (VoiceGiftWallLightItemView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2)).getChildAt(0);
        tan0Var.f169158h = (VoiceGiftWallLightItemView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2)).getChildAt(1);
        tan0Var.f169159i = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        tan0Var.f169160j = (RelativeLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0);
        tan0Var.f169161k = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        tan0Var.f169162l = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        tan0Var.f169163m = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(2);
        tan0Var.f169164n = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(3);
        tan0Var.f169165o = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(4);
        tan0Var.f169166p = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(5);
        tan0Var.f169167q = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1);
        tan0Var.f169168r = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m192792b(tan0 tan0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168148P8, viewGroup, false);
        m192791a(tan0Var, viewInflate);
        return viewInflate;
    }
}
