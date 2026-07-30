package p153l;

import android.view.View;
import com.p051p1.mobile.putong.data.Music;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.RawFeed;

/* JADX INFO: loaded from: classes13.dex */
public interface kxh<T> {
    /* JADX INFO: renamed from: a */
    void mo107409a(boolean z);

    /* JADX INFO: renamed from: c */
    void mo107411c(View view, T t);

    /* JADX INFO: renamed from: i */
    void mo107415i(T t);

    /* JADX INFO: renamed from: m */
    void mo107419m(Moment moment, RawFeed rawFeed, Music music);

    void onDestroy();
}
