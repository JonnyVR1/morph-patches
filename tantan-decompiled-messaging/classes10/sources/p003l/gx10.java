package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p1.mobile.putong.core.ui.settings.MyTabAbSettingsItem;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class gx10 {
    /* JADX INFO: renamed from: a */
    public static void m6838a(MyTabAbSettingsItem myTabAbSettingsItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        myTabAbSettingsItem.a = viewGroup.getChildAt(0);
        myTabAbSettingsItem.b = (ImageView) viewGroup.getChildAt(1);
        myTabAbSettingsItem.c = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        myTabAbSettingsItem.d = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        myTabAbSettingsItem.e = viewGroup.getChildAt(3);
        myTabAbSettingsItem.f = viewGroup.getChildAt(4);
        myTabAbSettingsItem.g = (ImageView) viewGroup.getChildAt(5);
        myTabAbSettingsItem.h = viewGroup.getChildAt(6);
    }

    /* JADX INFO: renamed from: b */
    public static View m6839b(MyTabAbSettingsItem myTabAbSettingsItem, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.J7, viewGroup, true);
        m6838a(myTabAbSettingsItem, viewInflate);
        return viewInflate;
    }
}
