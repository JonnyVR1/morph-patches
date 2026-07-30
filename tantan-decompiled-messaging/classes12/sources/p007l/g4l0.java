package p007l;

import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import com.p000p1.mobile.putong.feed.newui.camera.VideoEditFrag;
import com.p000p1.mobile.putong.feed.newui.camera.widget.CameraMenuView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class g4l0 {
    /* JADX INFO: renamed from: a */
    public static void m10414a(VideoEditFrag videoEditFrag, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        videoEditFrag.f915z = (TextureView) viewGroup.getChildAt(0);
        videoEditFrag.f880A = (ImageView) viewGroup.getChildAt(3);
        videoEditFrag.f881B = (ImageView) viewGroup.getChildAt(4);
        videoEditFrag.f882C = (CameraMenuView) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        videoEditFrag.f883D = (CameraMenuView) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1);
        videoEditFrag.f884E = (CameraMenuView) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(2);
        videoEditFrag.f886F = viewGroup.getChildAt(6);
        videoEditFrag.f888G = viewGroup.getChildAt(7);
        videoEditFrag.f890H = (ViewStub) viewGroup.getChildAt(8);
        videoEditFrag.f892I = (ViewStub) viewGroup.getChildAt(9);
        videoEditFrag.f894J = (ViewStub) viewGroup.getChildAt(10);
    }

    /* JADX INFO: renamed from: b */
    public static View m10415b(VideoEditFrag videoEditFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11139U3, viewGroup, false);
        m10414a(videoEditFrag, viewInflate);
        return viewInflate;
    }
}
