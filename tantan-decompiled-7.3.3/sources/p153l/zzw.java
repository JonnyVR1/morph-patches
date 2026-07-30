package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.view.MarryEditProfileItemAvatarCardView;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.view.MarryEditProfileItemAvatarView;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.view.MarryEditProfileItemImagesView;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.view.MarryEditProfileItemTagsView;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.view.MarryEditProfileItemTextView;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.view.MarryEditProfileItemView;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class zzw {
    /* JADX INFO: renamed from: a */
    public static void m222290a(yzw yzwVar, View view) {
        yzwVar.f202241b = (ScrollView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        yzwVar.f202242c = (MarryEditProfileItemAvatarView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        yzwVar.f202243d = (MarryEditProfileItemAvatarCardView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        yzwVar.f202244e = (MarryEditProfileItemTextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        yzwVar.f202245f = (MarryEditProfileItemImagesView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(2);
        yzwVar.f202246g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(4);
        yzwVar.f202247h = (MarryEditProfileItemView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(5);
        yzwVar.f202248i = (MarryEditProfileItemView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(6);
        yzwVar.f202249j = (MarryEditProfileItemView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(7);
        yzwVar.f202250k = (MarryEditProfileItemTagsView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(8);
        yzwVar.f202251l = (MarryEditProfileItemTextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(9);
        yzwVar.f202252m = (MarryEditProfileItemTextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(10);
        yzwVar.f202253n = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(12);
        yzwVar.f202254o = (MarryEditProfileItemView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(13);
        yzwVar.f202255p = (MarryEditProfileItemView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(14);
        yzwVar.f202256q = (MarryEditProfileItemView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(15);
        yzwVar.f202257r = (MarryEditProfileItemView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(16);
        yzwVar.f202258s = (MarryEditProfileItemView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(17);
        yzwVar.f202259t = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(19);
        yzwVar.f202260u = (MarryEditProfileItemView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(20);
        yzwVar.f202261v = (MarryEditProfileItemView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(21);
        yzwVar.f202262w = (MarryEditProfileItemView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(22);
        yzwVar.f202263x = (MarryEditProfileItemView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(23);
        yzwVar.f202264y = (MarryEditProfileItemView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(24);
        yzwVar.f202265z = (MarryEditProfileItemView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(25);
        yzwVar.f202231A = (MarryEditProfileItemView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(26);
        yzwVar.f202232B = (MarryEditProfileItemTextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(28);
        yzwVar.f202233C = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(30);
        yzwVar.f202234D = (MarryEditProfileItemView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(31);
        yzwVar.f202235E = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(32);
        yzwVar.f202236F = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(32)).getChildAt(0);
        yzwVar.f202237G = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(32)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m222291b(yzw yzwVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(sec0.f167523M, viewGroup, false);
        m222290a(yzwVar, viewInflate);
        return viewInflate;
    }
}
