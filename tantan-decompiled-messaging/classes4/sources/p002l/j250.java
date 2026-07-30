package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.live.livingroom.other.obs.ObsPreviewView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class j250 {
    /* JADX INFO: renamed from: a */
    public static void m15567a(ObsPreviewView obsPreviewView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        obsPreviewView.f7273a = (FrameLayout) viewGroup.getChildAt(0);
        obsPreviewView.f7274b = (LinearLayout) viewGroup.getChildAt(1);
        obsPreviewView.f7275c = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        obsPreviewView.f7276d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        obsPreviewView.f7277e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
        obsPreviewView.f7278f = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        obsPreviewView.f7279g = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        obsPreviewView.f7280h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0);
        obsPreviewView.f7281i = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        obsPreviewView.f7282j = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
    }
}
