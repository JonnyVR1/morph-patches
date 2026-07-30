package p153l;

import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.feed.newui.camera.widget.CameraMenuView;
import com.p051p1.mobile.putong.feed.newui.kankan.view.FeedComicFacePropMenuView;

/* JADX INFO: loaded from: classes13.dex */
public class tg5 {
    /* JADX INFO: renamed from: a */
    public static void m191014a(sg5 sg5Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        sg5Var.f167806a = (SurfaceView) viewGroup.getChildAt(0);
        sg5Var.f167807b = (FrameLayout) viewGroup.getChildAt(3);
        sg5Var.f167808c = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        sg5Var.f167809d = (TextView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        sg5Var.f167810e = (ImageView) viewGroup.getChildAt(4);
        sg5Var.f167811f = (TextView) viewGroup.getChildAt(5);
        sg5Var.f167812g = (ImageView) viewGroup.getChildAt(6);
        sg5Var.f167813h = (LinearLayout) viewGroup.getChildAt(7);
        sg5Var.f167814i = (ImageView) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(0);
        sg5Var.f167815j = (TextView) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(1);
        sg5Var.f167816k = (LinearLayout) viewGroup.getChildAt(8);
        sg5Var.f167817l = (CameraMenuView) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(0);
        sg5Var.f167818m = (CameraMenuView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(1)).getChildAt(0);
        sg5Var.f167819n = (ViewStub) viewGroup.getChildAt(9);
        sg5Var.f167820o = (FeedComicFacePropMenuView) viewGroup.getChildAt(10);
    }

    /* JADX INFO: renamed from: b */
    public static View m191015b(sg5 sg5Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173769v0, viewGroup, false);
        m191014a(sg5Var, viewInflate);
        return viewInflate;
    }
}
