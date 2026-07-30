package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.newui.profile.ProfileItem;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class tz90 {
    /* JADX INFO: renamed from: a */
    public static void m193652a(ProfileItem profileItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        profileItem.f27211a = (ImageView) viewGroup.getChildAt(0);
        profileItem.f27212b = (LinearLayout) viewGroup.getChildAt(1);
        profileItem.f27213c = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        profileItem.f27214d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        profileItem.f27215e = viewGroup.getChildAt(2);
        profileItem.f27216f = (VText) viewGroup.getChildAt(3);
        profileItem.f27217g = (VText) viewGroup.getChildAt(4);
        profileItem.f27218h = (VImage) viewGroup.getChildAt(5);
        profileItem.f27219i = (VText) viewGroup.getChildAt(6);
        profileItem.f27220j = (ImageView) viewGroup.getChildAt(7);
        profileItem.f27221k = (VDraweeView) viewGroup.getChildAt(8);
        profileItem.f27222l = (ViewStub) viewGroup.getChildAt(9);
        profileItem.f27223m = (ViewStub) viewGroup.getChildAt(10);
        profileItem.f27224n = viewGroup.getChildAt(11);
    }

    /* JADX INFO: renamed from: b */
    public static View m193653b(ProfileItem profileItem, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125415Fe, viewGroup, true);
        m193652a(profileItem, viewInflate);
        return viewInflate;
    }
}
