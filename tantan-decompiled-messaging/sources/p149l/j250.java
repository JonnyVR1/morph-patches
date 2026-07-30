package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.livingroom.other.obs.ObsPreviewView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class j250 {
    /* JADX INFO: renamed from: a */
    public static void m139416a(ObsPreviewView obsPreviewView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        obsPreviewView.f51231a = (FrameLayout) viewGroup.getChildAt(0);
        obsPreviewView.f51232b = (LinearLayout) viewGroup.getChildAt(1);
        obsPreviewView.f51233c = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        obsPreviewView.f51234d = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        obsPreviewView.f51235e = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
        obsPreviewView.f51236f = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        obsPreviewView.f51237g = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        obsPreviewView.f51238h = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0);
        obsPreviewView.f51239i = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        obsPreviewView.f51240j = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
    }
}
