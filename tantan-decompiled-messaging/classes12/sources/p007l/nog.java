package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.feed.newui.mediapicker.audiopost.FeedAudioRecordView;
import com.p000p1.mobile.putong.feed.newui.view.progressbar.FeedProgressBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class nog {
    /* JADX INFO: renamed from: a */
    public static void m12298a(FeedAudioRecordView feedAudioRecordView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedAudioRecordView.f2021a = viewGroup.getChildAt(0);
        feedAudioRecordView.f2022b = viewGroup.getChildAt(1);
        feedAudioRecordView.f2023c = viewGroup.getChildAt(2);
        feedAudioRecordView.f2024d = (FeedProgressBar) viewGroup.getChildAt(3);
        feedAudioRecordView.f2025e = viewGroup.getChildAt(4);
        feedAudioRecordView.f2026f = viewGroup.getChildAt(5);
        feedAudioRecordView.f2027g = viewGroup.getChildAt(6);
        feedAudioRecordView.f2028h = viewGroup.getChildAt(7);
        feedAudioRecordView.f2029i = viewGroup.getChildAt(8);
        feedAudioRecordView.f2030j = viewGroup.getChildAt(9);
    }

    /* JADX INFO: renamed from: b */
    public static View m12299b(FeedAudioRecordView feedAudioRecordView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11075K, viewGroup, false);
        m12298a(feedAudioRecordView, viewInflate);
        return viewInflate;
    }
}
