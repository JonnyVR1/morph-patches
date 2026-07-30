package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.core.widget.NestedScrollView;
import com.p051p1.mobile.putong.core.newui.messages.addressbook.loveradar.ChooseGreetingsView;
import com.p051p1.mobile.putong.core.newui.messages.addressbook.loveradar.FilterPairedUsersView;
import com.p051p1.mobile.putong.core.newui.messages.addressbook.loveradar.RadarSwitchView;
import p151v.VButton;
import p151v.VImage;
import p151v.VProgressBar;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class zfw {
    /* JADX INFO: renamed from: a */
    public static void m219585a(yfw yfwVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        yfwVar.f199655a = (VNavigationBar) viewGroup.getChildAt(0);
        yfwVar.f199656b = (NestedScrollView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        yfwVar.f199657c = (RadarSwitchView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        yfwVar.f199658d = (FilterPairedUsersView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        yfwVar.f199659e = (ChooseGreetingsView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(3);
        yfwVar.f199660f = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        yfwVar.f199661g = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        yfwVar.f199662h = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        yfwVar.f199663i = (VButton) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        yfwVar.f199664j = (VProgressBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m219586b(yfw yfwVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125487K6, viewGroup, false);
        m219585a(yfwVar, viewInflate);
        return viewInflate;
    }
}
