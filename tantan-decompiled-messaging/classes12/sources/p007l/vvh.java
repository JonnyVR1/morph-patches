package p007l;

import android.view.View;
import com.p000p1.mobile.putong.data.Music;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.RawFeed;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public interface vvh<T> {
    /* JADX INFO: renamed from: a */
    void mo11298a(boolean z);

    /* JADX INFO: renamed from: c */
    void mo11302c(View view, T t);

    /* JADX INFO: renamed from: i */
    void mo11309i(T t);

    /* JADX INFO: renamed from: m */
    void mo11232m(Moment moment, RawFeed rawFeed, Music music);

    void onDestroy();
}
