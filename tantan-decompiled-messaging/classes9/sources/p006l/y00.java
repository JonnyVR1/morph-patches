package p006l;

import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.account.p002ui.camera.pager.AccountFilterScrollMoreViewPager;
import com.p000p1.mobile.putong.account.p002ui.camera.view.AccountCameraMenuView;
import com.p000p1.mobile.putong.account.p002ui.camera.view.AccountCameraPhotoControlView;
import com.p000p1.mobile.putong.account.p002ui.camera.view.AccountCameraVideoControlView;
import com.p000p1.mobile.putong.account.p002ui.camera.view.AccountVideoRecordProgressView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class y00 {
    /* JADX INFO: renamed from: a */
    public static void m27733a(x00 x00Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        x00Var.f25580a = (SurfaceView) viewGroup.getChildAt(0);
        x00Var.f25582b = viewGroup.getChildAt(3);
        x00Var.f25584c = viewGroup.getChildAt(4);
        x00Var.f25586d = (ViewStub) viewGroup.getChildAt(5);
        x00Var.f25588e = (AccountFilterScrollMoreViewPager) viewGroup.getChildAt(6);
        x00Var.f25590f = (FrameLayout) viewGroup.getChildAt(7);
        x00Var.f25592g = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(0);
        x00Var.f25594h = (TextView) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(1);
        x00Var.f25596i = (TextView) viewGroup.getChildAt(8);
        x00Var.f25598j = (ImageView) viewGroup.getChildAt(9);
        x00Var.f25600k = (TextView) viewGroup.getChildAt(10);
        x00Var.f25603l = (FrameLayout) viewGroup.getChildAt(11);
        x00Var.f25605m = ((ViewGroup) viewGroup.getChildAt(11)).getChildAt(0);
        x00Var.f25607n = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(11)).getChildAt(1);
        x00Var.f25609o = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(11)).getChildAt(1)).getChildAt(0);
        x00Var.f25611p = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(11)).getChildAt(1)).getChildAt(1);
        x00Var.f25614q = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(11)).getChildAt(1)).getChildAt(2);
        x00Var.f25616r = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(11)).getChildAt(1)).getChildAt(3);
        x00Var.f25618s = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(11)).getChildAt(1)).getChildAt(4);
        x00Var.f25620t = (TextView) viewGroup.getChildAt(12);
        x00Var.f25622u = (AccountVideoRecordProgressView) viewGroup.getChildAt(13);
        x00Var.f25624v = (ImageView) viewGroup.getChildAt(14);
        x00Var.f25626w = (LinearLayout) viewGroup.getChildAt(15);
        x00Var.f25628x = (ImageView) ((ViewGroup) viewGroup.getChildAt(15)).getChildAt(0);
        x00Var.f25630y = (TextView) ((ViewGroup) viewGroup.getChildAt(15)).getChildAt(1);
        x00Var.f25632z = (LinearLayout) viewGroup.getChildAt(16);
        x00Var.f25527A = (TextView) ((ViewGroup) viewGroup.getChildAt(16)).getChildAt(1);
        x00Var.f25529B = (LinearLayout) viewGroup.getChildAt(17);
        x00Var.f25531C = (AccountCameraMenuView) ((ViewGroup) viewGroup.getChildAt(17)).getChildAt(0);
        x00Var.f25533D = (AccountCameraMenuView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(17)).getChildAt(1)).getChildAt(0);
        x00Var.f25535E = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(17)).getChildAt(1)).getChildAt(1);
        x00Var.f25538F = (AccountCameraMenuView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(17)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        x00Var.f25540G = (AccountCameraMenuView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(17)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        x00Var.f25542H = (AccountCameraMenuView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(17)).getChildAt(1)).getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        x00Var.f25544I = (AccountCameraMenuView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(17)).getChildAt(1)).getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        x00Var.f25546J = (AccountCameraMenuView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(17)).getChildAt(1)).getChildAt(1)).getChildAt(2)).getChildAt(1);
        x00Var.f25548K = (TextView) viewGroup.getChildAt(18);
        x00Var.f25550L = (AccountCameraVideoControlView) viewGroup.getChildAt(19);
        x00Var.f25552M = (AccountCameraPhotoControlView) viewGroup.getChildAt(20);
        x00Var.f25554N = (ViewStub) viewGroup.getChildAt(21);
        x00Var.f25556O = (ViewStub) viewGroup.getChildAt(22);
        x00Var.f25558P = (ViewStub) viewGroup.getChildAt(23);
        x00Var.f25560Q = (ViewStub) viewGroup.getChildAt(24);
        x00Var.f25562R = (ViewStub) viewGroup.getChildAt(25);
        x00Var.f25564S = (ViewStub) viewGroup.getChildAt(26);
        x00Var.f25566T = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(27)).getChildAt(0);
        x00Var.f25568U = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(27)).getChildAt(0)).getChildAt(0);
        x00Var.f25570V = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(27)).getChildAt(0)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m27734b(x00 x00Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(c6c0.f9453u, viewGroup, false);
        m27733a(x00Var, viewInflate);
        return viewInflate;
    }
}
