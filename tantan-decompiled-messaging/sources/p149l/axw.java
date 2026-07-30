package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.view.MarryEditProfileItemAvatarCardView;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.view.MarryEditProfileItemAvatarView;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.view.MarryEditProfileItemImagesView;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.view.MarryEditProfileItemTagsView;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.view.MarryEditProfileItemTextView;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.view.MarryEditProfileItemView;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class axw {
    /* JADX INFO: renamed from: a */
    public static void m99524a(zww zwwVar, View view) {
        zwwVar.f205302b = (ScrollView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        zwwVar.f205303c = (MarryEditProfileItemAvatarView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        zwwVar.f205304d = (MarryEditProfileItemAvatarCardView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        zwwVar.f205305e = (MarryEditProfileItemTextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        zwwVar.f205306f = (MarryEditProfileItemImagesView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(2);
        zwwVar.f205307g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(4);
        zwwVar.f205308h = (MarryEditProfileItemView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(5);
        zwwVar.f205309i = (MarryEditProfileItemView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(6);
        zwwVar.f205310j = (MarryEditProfileItemView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(7);
        zwwVar.f205311k = (MarryEditProfileItemTagsView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(8);
        zwwVar.f205312l = (MarryEditProfileItemTextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(9);
        zwwVar.f205313m = (MarryEditProfileItemTextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(10);
        zwwVar.f205314n = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(12);
        zwwVar.f205315o = (MarryEditProfileItemView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(13);
        zwwVar.f205316p = (MarryEditProfileItemView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(14);
        zwwVar.f205317q = (MarryEditProfileItemView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(15);
        zwwVar.f205318r = (MarryEditProfileItemView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(16);
        zwwVar.f205319s = (MarryEditProfileItemView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(17);
        zwwVar.f205320t = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(19);
        zwwVar.f205321u = (MarryEditProfileItemView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(20);
        zwwVar.f205322v = (MarryEditProfileItemView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(21);
        zwwVar.f205323w = (MarryEditProfileItemView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(22);
        zwwVar.f205324x = (MarryEditProfileItemView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(23);
        zwwVar.f205325y = (MarryEditProfileItemView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(24);
        zwwVar.f205326z = (MarryEditProfileItemView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(25);
        zwwVar.f205292A = (MarryEditProfileItemView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(26);
        zwwVar.f205293B = (MarryEditProfileItemTextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(28);
        zwwVar.f205294C = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(30);
        zwwVar.f205295D = (MarryEditProfileItemView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(31);
        zwwVar.f205296E = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(32);
        zwwVar.f205297F = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(32)).getChildAt(0);
        zwwVar.f205298G = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(32)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m99525b(zww zwwVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.f137309M, viewGroup, false);
        m99524a(zwwVar, viewInflate);
        return viewInflate;
    }
}
