package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.core.widget.NestedScrollView;
import com.p046p1.mobile.putong.core.newui.messages.addressbook.loveradar.ChooseGreetingsView;
import com.p046p1.mobile.putong.core.newui.messages.addressbook.loveradar.FilterPairedUsersView;
import com.p046p1.mobile.putong.core.newui.messages.addressbook.loveradar.RadarSwitchView;
import p147v.VButton;
import p147v.VImage;
import p147v.VProgressBar;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class bew {
    /* JADX INFO: renamed from: a */
    public static void m101420a(aew aewVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        aewVar.f69105a = (VNavigationBar) viewGroup.getChildAt(0);
        aewVar.f69106b = (NestedScrollView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        aewVar.f69107c = (RadarSwitchView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        aewVar.f69108d = (FilterPairedUsersView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        aewVar.f69109e = (ChooseGreetingsView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(3);
        aewVar.f69110f = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        aewVar.f69111g = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        aewVar.f69112h = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        aewVar.f69113i = (VButton) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        aewVar.f69114j = (VProgressBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m101421b(aew aewVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95417J6, viewGroup, false);
        m101420a(aewVar, viewInflate);
        return viewInflate;
    }
}
