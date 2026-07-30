package p007l;

import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.newui.camera.widget.CameraMenuView;
import com.p000p1.mobile.putong.feed.newui.kankan.view.FeedComicFacePropMenuView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class tf5 {
    /* JADX INFO: renamed from: a */
    public static void m14514a(sf5 sf5Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        sf5Var.f12918a = (SurfaceView) viewGroup.getChildAt(0);
        sf5Var.f12919b = (FrameLayout) viewGroup.getChildAt(3);
        sf5Var.f12920c = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        sf5Var.f12921d = (TextView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        sf5Var.f12922e = (ImageView) viewGroup.getChildAt(4);
        sf5Var.f12923f = (TextView) viewGroup.getChildAt(5);
        sf5Var.f12924g = (ImageView) viewGroup.getChildAt(6);
        sf5Var.f12925h = (LinearLayout) viewGroup.getChildAt(7);
        sf5Var.f12926i = (ImageView) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(0);
        sf5Var.f12927j = (TextView) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(1);
        sf5Var.f12928k = (LinearLayout) viewGroup.getChildAt(8);
        sf5Var.f12929l = (CameraMenuView) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(0);
        sf5Var.f12930m = (CameraMenuView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(1)).getChildAt(0);
        sf5Var.f12931n = (ViewStub) viewGroup.getChildAt(9);
        sf5Var.f12932o = (FeedComicFacePropMenuView) viewGroup.getChildAt(10);
    }

    /* JADX INFO: renamed from: b */
    public static View m14515b(sf5 sf5Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11319v0, viewGroup, false);
        m14514a(sf5Var, viewInflate);
        return viewInflate;
    }
}
