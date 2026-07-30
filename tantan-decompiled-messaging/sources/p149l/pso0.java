package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.sweet.view.VoiceSweetErrorView;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.sweet.view.VoiceSweetRankListView;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class pso0 {
    /* JADX INFO: renamed from: a */
    public static void m171184a(VoiceSweetRankListView voiceSweetRankListView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceSweetRankListView.f53576d = (ConstraintLayout) viewGroup.getChildAt(0);
        voiceSweetRankListView.f53577e = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        voiceSweetRankListView.f53578f = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        voiceSweetRankListView.f53579g = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        voiceSweetRankListView.f53580h = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        voiceSweetRankListView.f53581i = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        voiceSweetRankListView.f53582j = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        voiceSweetRankListView.f53583k = (RecyclerView) viewGroup.getChildAt(1);
        voiceSweetRankListView.f53584l = (VoiceSweetErrorView) viewGroup.getChildAt(2);
    }
}
