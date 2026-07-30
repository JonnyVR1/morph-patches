package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.view.ProfileIntegrityOptView;
import p147v.VImage;
import p147v.VLinear_Dividers;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class hne {
    /* JADX INFO: renamed from: a */
    public static void m131914a(gne gneVar, View view) {
        gneVar.f103590u = (VLinear_Dividers) view;
        ViewGroup viewGroup = (ViewGroup) view;
        gneVar.f103591v = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        gneVar.f103592w = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        gneVar.f103593x = (ProfileIntegrityOptView) viewGroup.getChildAt(1);
        gneVar.f103594y = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        gneVar.f103595z = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        gneVar.f103587A = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        gneVar.f103588B = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        gneVar.f103589C = (VText) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m131915b(gne gneVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95276A9, viewGroup, false);
        m131914a(gneVar, viewInflate);
        return viewInflate;
    }
}
