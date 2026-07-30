package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterImageView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.live.LiveTagView;
import com.p046p1.mobile.putong.newui.view.VExpandableTextContainer;
import com.tantanapp.media.ttmediaeffect.anim.AnimEffectPlayer;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class yrg {
    /* JADX INFO: renamed from: a */
    public static void m215837a(xrg xrgVar, View view) {
        xrgVar.f194116a = (FeedCenterImageView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        xrgVar.f194117b = viewGroup.getChildAt(0);
        xrgVar.f194118c = (VLinear) viewGroup.getChildAt(1);
        xrgVar.f194119d = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        xrgVar.f194120e = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        xrgVar.f194121f = (VLinear) viewGroup.getChildAt(2);
        xrgVar.f194122g = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        xrgVar.f194123h = (LiveTagView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        xrgVar.f194124i = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
        xrgVar.f194125j = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(2);
        xrgVar.f194126k = (VExpandableTextContainer) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        xrgVar.f194127l = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        xrgVar.f194128m = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        xrgVar.f194129n = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4);
        xrgVar.f194130o = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4)).getChildAt(9);
        xrgVar.f194131p = (ConstraintLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4)).getChildAt(10);
        xrgVar.f194132q = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4)).getChildAt(10)).getChildAt(1);
        xrgVar.f194133r = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4)).getChildAt(10)).getChildAt(1)).getChildAt(0);
        xrgVar.f194134s = (AnimEffectPlayer) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4)).getChildAt(10)).getChildAt(1)).getChildAt(1);
        xrgVar.f194135t = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4)).getChildAt(11);
        xrgVar.f194136u = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(5);
        xrgVar.f194137v = viewGroup.getChildAt(3);
    }
}
