package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.external.internal.vchat.view.LiveVChatInfoView;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class eou {
    /* JADX INFO: renamed from: a */
    public static void m121820a(LiveVChatInfoView liveVChatInfoView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveVChatInfoView.f46234a = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        liveVChatInfoView.f46235b = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        liveVChatInfoView.f46236c = (TextView) viewGroup.getChildAt(1);
    }
}
