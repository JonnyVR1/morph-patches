package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Group;
import com.p046p1.mobile.putong.live.external.internal.vchat.view.LiveVChatPayItemView;
import p147v.VImage;
import p147v.VRadioButton;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class qou {
    /* JADX INFO: renamed from: a */
    public static void m175772a(LiveVChatPayItemView liveVChatPayItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveVChatPayItemView.f45413d = (Group) viewGroup.getChildAt(0);
        liveVChatPayItemView.f45414e = (VImage) viewGroup.getChildAt(1);
        liveVChatPayItemView.f45415f = (VText) viewGroup.getChildAt(2);
        liveVChatPayItemView.f45416g = (VImage) viewGroup.getChildAt(3);
        liveVChatPayItemView.f45417h = (VRadioButton) viewGroup.getChildAt(4);
    }
}
