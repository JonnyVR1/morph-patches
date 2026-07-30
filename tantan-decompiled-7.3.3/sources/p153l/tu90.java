package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.itemholders.ProfileGameItemHolder;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.view.ProfileItemImageView;
import com.p051p1.mobile.putong.core.p058ui.profile.views.FlowView;
import p151v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class tu90 {
    /* JADX INFO: renamed from: a */
    public static void m192739a(ProfileGameItemHolder profileGameItemHolder, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        profileGameItemHolder.f34840u = (FlowView) viewGroup.getChildAt(1);
        profileGameItemHolder.f34841v = (VLinear) viewGroup.getChildAt(2);
        profileGameItemHolder.f34842w = (ProfileItemImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        profileGameItemHolder.f34843x = (ProfileItemImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        profileGameItemHolder.f34844y = (ProfileItemImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m192740b(ProfileGameItemHolder profileGameItemHolder, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125570P9, viewGroup, false);
        m192739a(profileGameItemHolder, viewInflate);
        return viewInflate;
    }
}
