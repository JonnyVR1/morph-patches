package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.livingroom.voice.applymanager.VoiceLiveApplyManagerEnterViewModel;

/* JADX INFO: loaded from: classes4.dex */
public class utn0 {
    /* JADX INFO: renamed from: a */
    public static void m198067a(VoiceLiveApplyManagerEnterViewModel voiceLiveApplyManagerEnterViewModel, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceLiveApplyManagerEnterViewModel.f53685a = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        voiceLiveApplyManagerEnterViewModel.f53686b = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        voiceLiveApplyManagerEnterViewModel.f53687c = (TextView) viewGroup.getChildAt(1);
    }
}
