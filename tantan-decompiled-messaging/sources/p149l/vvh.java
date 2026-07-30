package p149l;

import android.view.View;
import com.p046p1.mobile.putong.data.Music;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.RawFeed;

/* JADX INFO: loaded from: classes12.dex */
public interface vvh<T> {
    /* JADX INFO: renamed from: a */
    void mo142715a(boolean z);

    /* JADX INFO: renamed from: c */
    void mo142719c(View view, T t);

    /* JADX INFO: renamed from: i */
    void mo142725i(T t);

    /* JADX INFO: renamed from: m */
    void mo142214m(Moment moment, RawFeed rawFeed, Music music);

    void onDestroy();
}
