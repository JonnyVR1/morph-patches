package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.itemholders.ProfileGameItemHolder;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.view.ProfileItemImageView;
import com.p046p1.mobile.putong.core.p053ui.profile.views.FlowView;
import p147v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class pm90 {
    /* JADX INFO: renamed from: a */
    public static void m170298a(ProfileGameItemHolder profileGameItemHolder, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        profileGameItemHolder.f33992u = (FlowView) viewGroup.getChildAt(1);
        profileGameItemHolder.f33993v = (VLinear) viewGroup.getChildAt(2);
        profileGameItemHolder.f33994w = (ProfileItemImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        profileGameItemHolder.f33995x = (ProfileItemImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        profileGameItemHolder.f33996y = (ProfileItemImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m170299b(ProfileGameItemHolder profileGameItemHolder, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95404I9, viewGroup, false);
        m170298a(profileGameItemHolder, viewInflate);
        return viewInflate;
    }
}
