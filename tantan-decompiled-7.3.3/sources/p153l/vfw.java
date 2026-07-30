package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;
import p151v.VProgressBar;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class vfw {
    /* JADX INFO: renamed from: a */
    public static void m201188a(ufw ufwVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        ufwVar.f178815a = (VNavigationBar) viewGroup.getChildAt(0);
        ufwVar.f178816b = (ViewPager2) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        ufwVar.f178817c = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        ufwVar.f178818d = (VProgressBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m201189b(ufw ufwVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125423G6, viewGroup, false);
        m201188a(ufwVar, viewInflate);
        return viewInflate;
    }
}
