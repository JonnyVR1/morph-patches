package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.feed.newui.mediapicker.audiopost.FeedAudioRecordView;
import com.p046p1.mobile.putong.feed.newui.view.progressbar.FeedProgressBar;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class nog {
    /* JADX INFO: renamed from: a */
    public static void m160410a(FeedAudioRecordView feedAudioRecordView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedAudioRecordView.f40560a = viewGroup.getChildAt(0);
        feedAudioRecordView.f40561b = viewGroup.getChildAt(1);
        feedAudioRecordView.f40562c = viewGroup.getChildAt(2);
        feedAudioRecordView.f40563d = (FeedProgressBar) viewGroup.getChildAt(3);
        feedAudioRecordView.f40564e = (VImage) viewGroup.getChildAt(4);
        feedAudioRecordView.f40565f = (VText) viewGroup.getChildAt(5);
        feedAudioRecordView.f40566g = (VText) viewGroup.getChildAt(6);
        feedAudioRecordView.f40567h = (VText) viewGroup.getChildAt(7);
        feedAudioRecordView.f40568i = (VImage) viewGroup.getChildAt(8);
        feedAudioRecordView.f40569j = (VImage) viewGroup.getChildAt(9);
    }

    /* JADX INFO: renamed from: b */
    public static View m160411b(FeedAudioRecordView feedAudioRecordView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142056K, viewGroup, false);
        m160410a(feedAudioRecordView, viewInflate);
        return viewInflate;
    }
}
