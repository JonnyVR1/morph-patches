package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.sweet.view.VoiceSweetErrorView;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.sweet.view.VoiceSweetRankListView;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class t1p0 {
    /* JADX INFO: renamed from: a */
    public static void m188930a(VoiceSweetRankListView voiceSweetRankListView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceSweetRankListView.f54424d = (ConstraintLayout) viewGroup.getChildAt(0);
        voiceSweetRankListView.f54425e = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        voiceSweetRankListView.f54426f = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        voiceSweetRankListView.f54427g = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        voiceSweetRankListView.f54428h = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        voiceSweetRankListView.f54429i = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        voiceSweetRankListView.f54430j = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        voiceSweetRankListView.f54431k = (RecyclerView) viewGroup.getChildAt(1);
        voiceSweetRankListView.f54432l = (VoiceSweetErrorView) viewGroup.getChildAt(2);
    }
}
