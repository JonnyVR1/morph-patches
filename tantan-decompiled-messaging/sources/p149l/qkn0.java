package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.livingroom.voice.applymanager.VoiceLiveApplyManagerEnterViewModel;

/* JADX INFO: loaded from: classes4.dex */
public class qkn0 {
    /* JADX INFO: renamed from: a */
    public static void m175378a(VoiceLiveApplyManagerEnterViewModel voiceLiveApplyManagerEnterViewModel, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceLiveApplyManagerEnterViewModel.f52837a = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        voiceLiveApplyManagerEnterViewModel.f52838b = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        voiceLiveApplyManagerEnterViewModel.f52839c = (TextView) viewGroup.getChildAt(1);
    }
}
