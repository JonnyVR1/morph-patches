package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.p1.mobile.putong.core.ui.vip.greet.ProfileSendContainerView;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ura0 {
    /* JADX INFO: renamed from: a */
    public static void m9765a(ProfileSendContainerView profileSendContainerView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        profileSendContainerView.a = (ViewStub) viewGroup.getChildAt(0);
        profileSendContainerView.b = (ViewStub) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m9766b(ProfileSendContainerView profileSendContainerView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.Ua, viewGroup, true);
        m9765a(profileSendContainerView, viewInflate);
        return viewInflate;
    }
}
