package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.BottomVoiceItemView;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class we3 {
    /* JADX INFO: renamed from: a */
    public static void m205990a(BottomVoiceItemView bottomVoiceItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        bottomVoiceItemView.f49342a = (FrameLayout) viewGroup.getChildAt(0);
        bottomVoiceItemView.f49343b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        bottomVoiceItemView.f49344c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        bottomVoiceItemView.f49345d = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        bottomVoiceItemView.f49346e = (TextView) viewGroup.getChildAt(1);
    }
}
