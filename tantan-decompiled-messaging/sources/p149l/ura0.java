package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.p046p1.mobile.putong.core.p053ui.vip.greet.ProfileSendContainerView;

/* JADX INFO: loaded from: classes10.dex */
public class ura0 {
    /* JADX INFO: renamed from: a */
    public static void m195058a(ProfileSendContainerView profileSendContainerView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        profileSendContainerView.f37075a = (ViewStub) viewGroup.getChildAt(0);
        profileSendContainerView.f37076b = (ViewStub) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m195059b(ProfileSendContainerView profileSendContainerView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95597Ua, viewGroup, true);
        m195058a(profileSendContainerView, viewInflate);
        return viewInflate;
    }
}
