package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p051p1.mobile.putong.core.p058ui.settings.MyTabAbSettingsItem;
import p151v.VSwitch;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class o520 {
    /* JADX INFO: renamed from: a */
    public static void m166085a(MyTabAbSettingsItem myTabAbSettingsItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        myTabAbSettingsItem.f36672a = viewGroup.getChildAt(0);
        myTabAbSettingsItem.f36673b = (ImageView) viewGroup.getChildAt(1);
        myTabAbSettingsItem.f36674c = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        myTabAbSettingsItem.f36675d = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        myTabAbSettingsItem.f36676e = (VSwitch) viewGroup.getChildAt(3);
        myTabAbSettingsItem.f36677f = viewGroup.getChildAt(4);
        myTabAbSettingsItem.f36678g = (ImageView) viewGroup.getChildAt(5);
        myTabAbSettingsItem.f36679h = viewGroup.getChildAt(6);
    }

    /* JADX INFO: renamed from: b */
    public static View m166086b(MyTabAbSettingsItem myTabAbSettingsItem, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125584Q7, viewGroup, true);
        m166085a(myTabAbSettingsItem, viewInflate);
        return viewInflate;
    }
}
