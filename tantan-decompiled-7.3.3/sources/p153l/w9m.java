package p153l;

import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.feed.newui.camera.IVVideoEditFrag;
import com.p051p1.mobile.putong.feed.newui.camera.widget.CameraMenuView;
import p151v.VButton;

/* JADX INFO: loaded from: classes13.dex */
public class w9m {
    /* JADX INFO: renamed from: a */
    public static void m205603a(IVVideoEditFrag iVVideoEditFrag, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        iVVideoEditFrag.f40161z = (TextureView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        iVVideoEditFrag.f40132A = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        iVVideoEditFrag.f40133B = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        iVVideoEditFrag.f40134C = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        iVVideoEditFrag.f40135D = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0);
        iVVideoEditFrag.f40136E = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(1);
        iVVideoEditFrag.f40138F = (ConstraintLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        iVVideoEditFrag.f40139G = (CameraMenuView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(0);
        iVVideoEditFrag.f40140H = (CameraMenuView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(1);
        iVVideoEditFrag.f40141I = (VButton) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(2);
        iVVideoEditFrag.f40142J = (ViewStub) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        iVVideoEditFrag.f40143K = (ViewStub) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6);
        iVVideoEditFrag.f40144L = (ViewStub) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7);
    }

    /* JADX INFO: renamed from: b */
    public static View m205604b(IVVideoEditFrag iVVideoEditFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173762u0, viewGroup, false);
        m205603a(iVVideoEditFrag, viewInflate);
        return viewInflate;
    }
}
