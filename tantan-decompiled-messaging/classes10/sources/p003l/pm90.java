package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.profile.profilelist.itemholders.ProfileGameItemHolder;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class pm90 {
    /* JADX INFO: renamed from: a */
    public static void m8761a(ProfileGameItemHolder profileGameItemHolder, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        profileGameItemHolder.u = viewGroup.getChildAt(1);
        profileGameItemHolder.v = viewGroup.getChildAt(2);
        profileGameItemHolder.w = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        profileGameItemHolder.x = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        profileGameItemHolder.y = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m8762b(ProfileGameItemHolder profileGameItemHolder, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.I9, viewGroup, false);
        m8761a(profileGameItemHolder, viewInflate);
        return viewInflate;
    }
}
