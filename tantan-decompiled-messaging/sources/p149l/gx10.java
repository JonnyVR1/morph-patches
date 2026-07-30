package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p046p1.mobile.putong.core.p053ui.settings.MyTabAbSettingsItem;
import p147v.VSwitch;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class gx10 {
    /* JADX INFO: renamed from: a */
    public static void m128528a(MyTabAbSettingsItem myTabAbSettingsItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        myTabAbSettingsItem.f35824a = viewGroup.getChildAt(0);
        myTabAbSettingsItem.f35825b = (ImageView) viewGroup.getChildAt(1);
        myTabAbSettingsItem.f35826c = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        myTabAbSettingsItem.f35827d = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        myTabAbSettingsItem.f35828e = (VSwitch) viewGroup.getChildAt(3);
        myTabAbSettingsItem.f35829f = viewGroup.getChildAt(4);
        myTabAbSettingsItem.f35830g = (ImageView) viewGroup.getChildAt(5);
        myTabAbSettingsItem.f35831h = viewGroup.getChildAt(6);
    }

    /* JADX INFO: renamed from: b */
    public static View m128529b(MyTabAbSettingsItem myTabAbSettingsItem, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95418J7, viewGroup, true);
        m128528a(myTabAbSettingsItem, viewInflate);
        return viewInflate;
    }
}
