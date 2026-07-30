package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p1.mobile.putong.core.newui.profile.ProfileItem;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class pr90 {
    /* JADX INFO: renamed from: a */
    public static void m8790a(ProfileItem profileItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        profileItem.a = (ImageView) viewGroup.getChildAt(0);
        profileItem.b = (LinearLayout) viewGroup.getChildAt(1);
        profileItem.c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        profileItem.d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        profileItem.e = viewGroup.getChildAt(2);
        profileItem.f = viewGroup.getChildAt(3);
        profileItem.g = viewGroup.getChildAt(4);
        profileItem.h = viewGroup.getChildAt(5);
        profileItem.i = viewGroup.getChildAt(6);
        profileItem.j = (ImageView) viewGroup.getChildAt(7);
        profileItem.k = viewGroup.getChildAt(8);
        profileItem.l = (ViewStub) viewGroup.getChildAt(9);
        profileItem.m = (ViewStub) viewGroup.getChildAt(10);
        profileItem.n = viewGroup.getChildAt(11);
    }

    /* JADX INFO: renamed from: b */
    public static View m8791b(ProfileItem profileItem, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.ye, viewGroup, true);
        m8790a(profileItem, viewInflate);
        return viewInflate;
    }
}
