package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Group;
import com.p051p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.LiveVChatGiftOuterContentView;
import p151v.VImage;
import p151v.VPager;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class cnu {
    /* JADX INFO: renamed from: a */
    public static void m111541a(LiveVChatGiftOuterContentView liveVChatGiftOuterContentView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveVChatGiftOuterContentView.f46069d = (VPager) viewGroup.getChildAt(0);
        liveVChatGiftOuterContentView.f46070e = (VImage) viewGroup.getChildAt(1);
        liveVChatGiftOuterContentView.f46071f = (VText) viewGroup.getChildAt(2);
        liveVChatGiftOuterContentView.f46072g = (Group) viewGroup.getChildAt(3);
    }
}
