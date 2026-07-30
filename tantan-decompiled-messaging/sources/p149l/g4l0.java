package p149l;

import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import com.p046p1.mobile.putong.feed.newui.camera.VideoEditFrag;
import com.p046p1.mobile.putong.feed.newui.camera.widget.CameraMenuView;
import p147v.VButton;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class g4l0 {
    /* JADX INFO: renamed from: a */
    public static void m124381a(VideoEditFrag videoEditFrag, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        videoEditFrag.f39454z = (TextureView) viewGroup.getChildAt(0);
        videoEditFrag.f39419A = (ImageView) viewGroup.getChildAt(3);
        videoEditFrag.f39420B = (ImageView) viewGroup.getChildAt(4);
        videoEditFrag.f39421C = (CameraMenuView) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        videoEditFrag.f39422D = (CameraMenuView) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1);
        videoEditFrag.f39423E = (CameraMenuView) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(2);
        videoEditFrag.f39425F = (VButton) viewGroup.getChildAt(6);
        videoEditFrag.f39427G = (VText) viewGroup.getChildAt(7);
        videoEditFrag.f39429H = (ViewStub) viewGroup.getChildAt(8);
        videoEditFrag.f39431I = (ViewStub) viewGroup.getChildAt(9);
        videoEditFrag.f39433J = (ViewStub) viewGroup.getChildAt(10);
    }

    /* JADX INFO: renamed from: b */
    public static View m124382b(VideoEditFrag videoEditFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142120U3, viewGroup, false);
        m124381a(videoEditFrag, viewInflate);
        return viewInflate;
    }
}
