package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.BottomVoicePlayItemView;
import p151v.VDraweeView;
import p151v.VFrame;

/* JADX INFO: loaded from: classes4.dex */
public class xe3 {
    /* JADX INFO: renamed from: a */
    public static void m210556a(BottomVoicePlayItemView bottomVoicePlayItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        bottomVoicePlayItemView.f49348a = (VFrame) viewGroup.getChildAt(0);
        bottomVoicePlayItemView.f49349b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        bottomVoicePlayItemView.f49350c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        bottomVoicePlayItemView.f49351d = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        bottomVoicePlayItemView.f49352e = (TextView) viewGroup.getChildAt(1);
    }
}
