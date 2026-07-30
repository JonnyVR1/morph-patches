package p149l;

import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.feed.newui.camera.widget.CameraMenuView;
import com.p046p1.mobile.putong.feed.newui.kankan.view.FeedComicFacePropMenuView;

/* JADX INFO: loaded from: classes12.dex */
public class tf5 {
    /* JADX INFO: renamed from: a */
    public static void m188651a(sf5 sf5Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        sf5Var.f164215a = (SurfaceView) viewGroup.getChildAt(0);
        sf5Var.f164216b = (FrameLayout) viewGroup.getChildAt(3);
        sf5Var.f164217c = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        sf5Var.f164218d = (TextView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        sf5Var.f164219e = (ImageView) viewGroup.getChildAt(4);
        sf5Var.f164220f = (TextView) viewGroup.getChildAt(5);
        sf5Var.f164221g = (ImageView) viewGroup.getChildAt(6);
        sf5Var.f164222h = (LinearLayout) viewGroup.getChildAt(7);
        sf5Var.f164223i = (ImageView) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(0);
        sf5Var.f164224j = (TextView) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(1);
        sf5Var.f164225k = (LinearLayout) viewGroup.getChildAt(8);
        sf5Var.f164226l = (CameraMenuView) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(0);
        sf5Var.f164227m = (CameraMenuView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(1)).getChildAt(0);
        sf5Var.f164228n = (ViewStub) viewGroup.getChildAt(9);
        sf5Var.f164229o = (FeedComicFacePropMenuView) viewGroup.getChildAt(10);
    }

    /* JADX INFO: renamed from: b */
    public static View m188652b(sf5 sf5Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142300v0, viewGroup, false);
        m188651a(sf5Var, viewInflate);
        return viewInflate;
    }
}
