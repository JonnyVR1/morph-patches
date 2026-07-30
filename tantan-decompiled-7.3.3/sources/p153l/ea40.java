package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.newui.NewPictureView;
import p151v.VDraweeView;
import p151v.VFrame_ColorFilter;
import p151v.VImage;
import p151v.VProgressBar;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ea40 {
    /* JADX INFO: renamed from: a */
    public static void m120007a(NewPictureView newPictureView, View view) {
        newPictureView.f21971a = (VDraweeView) view.findViewById(adc0.f70031N5);
        newPictureView.f21972b = (VFrame_ColorFilter) view.findViewById(adc0.f70043O0);
        newPictureView.f21973c = (ImageView) view.findViewById(adc0.f70524qa);
        newPictureView.f21974d = (VProgressBar) view.findViewById(adc0.f69897F7);
        newPictureView.f21975e = (ImageView) view.findViewById(adc0.f70574t9);
        newPictureView.f21976f = (LinearLayout) view.findViewById(adc0.f70117S6);
        ViewGroup viewGroup = (ViewGroup) view;
        newPictureView.f21977g = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        newPictureView.f21978h = (VText) view.findViewById(adc0.f70456ma);
        newPictureView.f21979i = (VImage) view.findViewById(adc0.f70590u8);
        newPictureView.f21980j = (VText) view.findViewById(adc0.f70523q9);
        newPictureView.f21981k = (LinearLayout) viewGroup.getChildAt(3);
        newPictureView.f21982l = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        newPictureView.f21983m = (VImage) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
    }
}
