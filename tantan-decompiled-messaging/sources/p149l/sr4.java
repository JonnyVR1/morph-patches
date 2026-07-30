package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.account.p050ui.accountai.new2021.view.ChannelRegisterView;
import p147v.VButton;
import p147v.VButton_FakeShadow;

/* JADX INFO: loaded from: classes9.dex */
public class sr4 {
    /* JADX INFO: renamed from: a */
    public static void m185622a(ChannelRegisterView channelRegisterView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        channelRegisterView.f16396c = (VButton) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        channelRegisterView.f16397d = (VButton_FakeShadow) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m185623b(ChannelRegisterView channelRegisterView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(c6c0.f79488a0, viewGroup, true);
        m185622a(channelRegisterView, viewInflate);
        return viewInflate;
    }
}
