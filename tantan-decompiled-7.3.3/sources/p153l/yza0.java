package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.p051p1.mobile.putong.core.p058ui.vip.greet.ProfileSendContainerView;

/* JADX INFO: loaded from: classes10.dex */
public class yza0 {
    /* JADX INFO: renamed from: a */
    public static void m218010a(ProfileSendContainerView profileSendContainerView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        profileSendContainerView.f37923a = (ViewStub) viewGroup.getChildAt(0);
        profileSendContainerView.f37924b = (ViewStub) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m218011b(ProfileSendContainerView profileSendContainerView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125765bb, viewGroup, true);
        m218010a(profileSendContainerView, viewInflate);
        return viewInflate;
    }
}
