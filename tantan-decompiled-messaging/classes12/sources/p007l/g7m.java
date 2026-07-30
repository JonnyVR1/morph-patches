package p007l;

import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.newui.camera.IVVideoEditFrag;
import com.p000p1.mobile.putong.feed.newui.camera.widget.CameraMenuView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class g7m {
    /* JADX INFO: renamed from: a */
    public static void m10424a(IVVideoEditFrag iVVideoEditFrag, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        iVVideoEditFrag.f774z = (TextureView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        iVVideoEditFrag.f745A = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        iVVideoEditFrag.f746B = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        iVVideoEditFrag.f747C = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        iVVideoEditFrag.f748D = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0);
        iVVideoEditFrag.f749E = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(1);
        iVVideoEditFrag.f751F = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        iVVideoEditFrag.f752G = (CameraMenuView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(0);
        iVVideoEditFrag.f753H = (CameraMenuView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(1);
        iVVideoEditFrag.f754I = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(2);
        iVVideoEditFrag.f755J = (ViewStub) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        iVVideoEditFrag.f756K = (ViewStub) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6);
        iVVideoEditFrag.f757L = (ViewStub) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7);
    }

    /* JADX INFO: renamed from: b */
    public static View m10425b(IVVideoEditFrag iVVideoEditFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11312u0, viewGroup, false);
        m10424a(iVVideoEditFrag, viewInflate);
        return viewInflate;
    }
}
