package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.profile.views.EditProfileGameImageView;
import com.p046p1.mobile.putong.core.p053ui.profile.views.EditProfileItemTextView;
import p147v.VImage;
import p147v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class bme {
    /* JADX INFO: renamed from: a */
    public static void m102640a(ame ameVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        ameVar.f70586u = (EditProfileItemTextView) viewGroup.getChildAt(1);
        ameVar.f70587v = (EditProfileItemTextView) viewGroup.getChildAt(2);
        ameVar.f70588w = (EditProfileItemTextView) viewGroup.getChildAt(3);
        ameVar.f70589x = (EditProfileItemTextView) viewGroup.getChildAt(4);
        ameVar.f70590y = (VLinear) viewGroup.getChildAt(5);
        ameVar.f70591z = (VLinear) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        ameVar.f70578A = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(1);
        ameVar.f70579B = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(2);
        ameVar.f70580C = (VLinear) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1);
        ameVar.f70581D = (EditProfileGameImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1)).getChildAt(0);
        ameVar.f70582E = (EditProfileGameImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1)).getChildAt(1);
        ameVar.f70583F = (EditProfileGameImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m102641b(ame ameVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f96065w9, viewGroup, false);
        m102640a(ameVar, viewInflate);
        return viewInflate;
    }
}
