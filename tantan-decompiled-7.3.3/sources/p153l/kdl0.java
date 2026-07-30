package p153l;

import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import com.p051p1.mobile.putong.feed.newui.camera.VideoEditFrag;
import com.p051p1.mobile.putong.feed.newui.camera.widget.CameraMenuView;
import p151v.VButton;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class kdl0 {
    /* JADX INFO: renamed from: a */
    public static void m149210a(VideoEditFrag videoEditFrag, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        videoEditFrag.f40302z = (TextureView) viewGroup.getChildAt(0);
        videoEditFrag.f40267A = (ImageView) viewGroup.getChildAt(3);
        videoEditFrag.f40268B = (ImageView) viewGroup.getChildAt(4);
        videoEditFrag.f40269C = (CameraMenuView) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        videoEditFrag.f40270D = (CameraMenuView) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1);
        videoEditFrag.f40271E = (CameraMenuView) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(2);
        videoEditFrag.f40273F = (VButton) viewGroup.getChildAt(6);
        videoEditFrag.f40275G = (VText) viewGroup.getChildAt(7);
        videoEditFrag.f40277H = (ViewStub) viewGroup.getChildAt(8);
        videoEditFrag.f40279I = (ViewStub) viewGroup.getChildAt(9);
        videoEditFrag.f40281J = (ViewStub) viewGroup.getChildAt(10);
    }

    /* JADX INFO: renamed from: b */
    public static View m149211b(VideoEditFrag videoEditFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173589U3, viewGroup, false);
        m149210a(videoEditFrag, viewInflate);
        return viewInflate;
    }
}
