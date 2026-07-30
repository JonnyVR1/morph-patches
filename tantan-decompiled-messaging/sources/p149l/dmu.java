package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.external.internal.vchat.view.LiveVChatInfoView;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class dmu {
    /* JADX INFO: renamed from: a */
    public static void m112528a(LiveVChatInfoView liveVChatInfoView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveVChatInfoView.f45386a = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        liveVChatInfoView.f45387b = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        liveVChatInfoView.f45388c = (TextView) viewGroup.getChildAt(1);
    }
}
