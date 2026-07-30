package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.giftwall.detail.VoiceGiftWallLightItemView;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class yjn0 {
    /* JADX INFO: renamed from: a */
    public static void m216415a(xjn0 xjn0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        xjn0Var.f194610a = viewGroup.getChildAt(0);
        xjn0Var.f194611b = (FrameLayout) viewGroup.getChildAt(1);
        xjn0Var.f194612c = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        xjn0Var.f194613d = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        xjn0Var.f194614e = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        xjn0Var.f194615f = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        xjn0Var.f194616g = (VoiceGiftWallLightItemView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2)).getChildAt(0);
        xjn0Var.f194617h = (VoiceGiftWallLightItemView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2)).getChildAt(1);
        xjn0Var.f194618i = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        xjn0Var.f194619j = (RelativeLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0);
        xjn0Var.f194620k = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        xjn0Var.f194621l = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        xjn0Var.f194622m = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(2);
        xjn0Var.f194623n = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(3);
        xjn0Var.f194624o = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(4);
        xjn0Var.f194625p = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(5);
        xjn0Var.f194626q = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1);
        xjn0Var.f194627r = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m216416b(xjn0 xjn0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f198880P8, viewGroup, false);
        m216415a(xjn0Var, viewInflate);
        return viewInflate;
    }
}
