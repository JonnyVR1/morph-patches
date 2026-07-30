package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.profile.views.ProfileLoopActionLayout;
import com.p046p1.mobile.putong.core.p053ui.profile.views.ProfileLoopEditPetUploadPhoto;
import com.p046p1.mobile.putong.core.p053ui.profile.views.ProfileLoopEditUploadPhoto;
import p147v.VList;

/* JADX INFO: loaded from: classes10.dex */
public class mla0 {
    /* JADX INFO: renamed from: a */
    public static void m155136a(lla0 lla0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        lla0Var.f128665a = (TextView) viewGroup.getChildAt(0);
        lla0Var.f128666b = (TextView) viewGroup.getChildAt(1);
        lla0Var.f128667c = (VList) viewGroup.getChildAt(2);
        lla0Var.f128668d = (ProfileLoopEditUploadPhoto) viewGroup.getChildAt(3);
        lla0Var.f128669e = (ProfileLoopEditPetUploadPhoto) viewGroup.getChildAt(4);
        lla0Var.f128670f = (ProfileLoopActionLayout) viewGroup.getChildAt(5);
        lla0Var.f128671g = (FrameLayout) viewGroup.getChildAt(6);
    }

    /* JADX INFO: renamed from: b */
    public static View m155137b(lla0 lla0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.f137298G0, viewGroup, false);
        m155136a(lla0Var, viewInflate);
        return viewInflate;
    }
}
