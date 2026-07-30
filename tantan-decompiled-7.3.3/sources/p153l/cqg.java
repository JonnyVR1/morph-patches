package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.feed.newui.mediapicker.audiopost.FeedAudioRecordView;
import com.p051p1.mobile.putong.feed.newui.view.progressbar.FeedProgressBar;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class cqg {
    /* JADX INFO: renamed from: a */
    public static void m111897a(FeedAudioRecordView feedAudioRecordView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedAudioRecordView.f41408a = viewGroup.getChildAt(0);
        feedAudioRecordView.f41409b = viewGroup.getChildAt(1);
        feedAudioRecordView.f41410c = viewGroup.getChildAt(2);
        feedAudioRecordView.f41411d = (FeedProgressBar) viewGroup.getChildAt(3);
        feedAudioRecordView.f41412e = (VImage) viewGroup.getChildAt(4);
        feedAudioRecordView.f41413f = (VText) viewGroup.getChildAt(5);
        feedAudioRecordView.f41414g = (VText) viewGroup.getChildAt(6);
        feedAudioRecordView.f41415h = (VText) viewGroup.getChildAt(7);
        feedAudioRecordView.f41416i = (VImage) viewGroup.getChildAt(8);
        feedAudioRecordView.f41417j = (VImage) viewGroup.getChildAt(9);
    }

    /* JADX INFO: renamed from: b */
    public static View m111898b(FeedAudioRecordView feedAudioRecordView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173525K, viewGroup, false);
        m111897a(feedAudioRecordView, viewInflate);
        return viewInflate;
    }
}
