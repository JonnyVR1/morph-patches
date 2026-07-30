package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.livingroom.other.obs.ObsPreviewView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class ya50 {
    /* JADX INFO: renamed from: a */
    public static void m214856a(ObsPreviewView obsPreviewView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        obsPreviewView.f52079a = (FrameLayout) viewGroup.getChildAt(0);
        obsPreviewView.f52080b = (LinearLayout) viewGroup.getChildAt(1);
        obsPreviewView.f52081c = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        obsPreviewView.f52082d = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        obsPreviewView.f52083e = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
        obsPreviewView.f52084f = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        obsPreviewView.f52085g = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        obsPreviewView.f52086h = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0);
        obsPreviewView.f52087i = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        obsPreviewView.f52088j = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
    }
}
