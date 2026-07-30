package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.sweet.view.item.VoiceSweetUserItemView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class buo0 {
    /* JADX INFO: renamed from: a */
    public static void m103976a(VoiceSweetUserItemView voiceSweetUserItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceSweetUserItemView.f53631a = (VDraweeView) viewGroup.getChildAt(0);
        voiceSweetUserItemView.f53632b = (VText) viewGroup.getChildAt(1);
        voiceSweetUserItemView.f53633c = (LinearLayout) viewGroup.getChildAt(2);
        voiceSweetUserItemView.f53634d = (VImage) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        voiceSweetUserItemView.f53635e = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        voiceSweetUserItemView.f53636f = (VDraweeView) viewGroup.getChildAt(3);
        voiceSweetUserItemView.f53637g = (VText) viewGroup.getChildAt(4);
    }
}
