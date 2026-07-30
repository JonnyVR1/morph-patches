package p149l;

import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.feed.newui.camera.IVVideoEditFrag;
import com.p046p1.mobile.putong.feed.newui.camera.widget.CameraMenuView;
import p147v.VButton;

/* JADX INFO: loaded from: classes12.dex */
public class g7m {
    /* JADX INFO: renamed from: a */
    public static void m124716a(IVVideoEditFrag iVVideoEditFrag, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        iVVideoEditFrag.f39313z = (TextureView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        iVVideoEditFrag.f39284A = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        iVVideoEditFrag.f39285B = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        iVVideoEditFrag.f39286C = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        iVVideoEditFrag.f39287D = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0);
        iVVideoEditFrag.f39288E = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(1);
        iVVideoEditFrag.f39290F = (ConstraintLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        iVVideoEditFrag.f39291G = (CameraMenuView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(0);
        iVVideoEditFrag.f39292H = (CameraMenuView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(1);
        iVVideoEditFrag.f39293I = (VButton) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(2);
        iVVideoEditFrag.f39294J = (ViewStub) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        iVVideoEditFrag.f39295K = (ViewStub) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6);
        iVVideoEditFrag.f39296L = (ViewStub) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7);
    }

    /* JADX INFO: renamed from: b */
    public static View m124717b(IVVideoEditFrag iVVideoEditFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142293u0, viewGroup, false);
        m124716a(iVVideoEditFrag, viewInflate);
        return viewInflate;
    }
}
