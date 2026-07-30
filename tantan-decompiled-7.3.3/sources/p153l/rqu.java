package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Group;
import com.p051p1.mobile.putong.live.external.internal.vchat.view.LiveVChatPayItemView;
import p151v.VImage;
import p151v.VRadioButton;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class rqu {
    /* JADX INFO: renamed from: a */
    public static void m182673a(LiveVChatPayItemView liveVChatPayItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveVChatPayItemView.f46261d = (Group) viewGroup.getChildAt(0);
        liveVChatPayItemView.f46262e = (VImage) viewGroup.getChildAt(1);
        liveVChatPayItemView.f46263f = (VText) viewGroup.getChildAt(2);
        liveVChatPayItemView.f46264g = (VImage) viewGroup.getChildAt(3);
        liveVChatPayItemView.f46265h = (VRadioButton) viewGroup.getChildAt(4);
    }
}
