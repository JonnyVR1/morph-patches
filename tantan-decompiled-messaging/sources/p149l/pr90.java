package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.newui.profile.ProfileItem;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class pr90 {
    /* JADX INFO: renamed from: a */
    public static void m170992a(ProfileItem profileItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        profileItem.f26469a = (ImageView) viewGroup.getChildAt(0);
        profileItem.f26470b = (LinearLayout) viewGroup.getChildAt(1);
        profileItem.f26471c = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        profileItem.f26472d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        profileItem.f26473e = viewGroup.getChildAt(2);
        profileItem.f26474f = (VText) viewGroup.getChildAt(3);
        profileItem.f26475g = (VText) viewGroup.getChildAt(4);
        profileItem.f26476h = (VImage) viewGroup.getChildAt(5);
        profileItem.f26477i = (VText) viewGroup.getChildAt(6);
        profileItem.f26478j = (ImageView) viewGroup.getChildAt(7);
        profileItem.f26479k = (VDraweeView) viewGroup.getChildAt(8);
        profileItem.f26480l = (ViewStub) viewGroup.getChildAt(9);
        profileItem.f26481m = (ViewStub) viewGroup.getChildAt(10);
        profileItem.f26482n = viewGroup.getChildAt(11);
    }

    /* JADX INFO: renamed from: b */
    public static View m170993b(ProfileItem profileItem, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f96104ye, viewGroup, true);
        m170992a(profileItem, viewInflate);
        return viewInflate;
    }
}
