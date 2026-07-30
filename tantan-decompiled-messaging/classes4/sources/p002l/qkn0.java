package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p1.mobile.putong.live.livingroom.voice.applymanager.VoiceLiveApplyManagerEnterViewModel;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class qkn0 {
    /* JADX INFO: renamed from: a */
    public static void m21475a(VoiceLiveApplyManagerEnterViewModel voiceLiveApplyManagerEnterViewModel, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceLiveApplyManagerEnterViewModel.a = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        voiceLiveApplyManagerEnterViewModel.b = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        voiceLiveApplyManagerEnterViewModel.c = (TextView) viewGroup.getChildAt(1);
    }
}
