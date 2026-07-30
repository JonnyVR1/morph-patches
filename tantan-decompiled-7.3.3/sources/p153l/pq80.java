package p153l;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.p051p1.mobile.putong.core.p058ui.PhotoPreviewView;
import com.p051p1.mobile.putong.core.p058ui.PlayerView;

/* JADX INFO: loaded from: classes3.dex */
public interface pq80 {
    /* JADX INFO: renamed from: b */
    void mo173326b(cf60 cf60Var);

    /* JADX INFO: renamed from: d */
    default void m173327d(int i, View view) {
        if (view instanceof PlayerView) {
            mo173332i(i, (PlayerView) view);
        } else if (view instanceof PhotoPreviewView) {
            mo173331h(i, (PhotoPreviewView) view);
        }
    }

    /* JADX INFO: renamed from: e */
    ie80.C17711c mo173328e();

    /* JADX INFO: renamed from: f */
    void mo173329f(ViewPager viewPager, int i, int i2);

    /* JADX INFO: renamed from: g */
    void mo173330g();

    /* JADX INFO: renamed from: h */
    void mo173331h(int i, PhotoPreviewView photoPreviewView);

    /* JADX INFO: renamed from: i */
    void mo173332i(int i, PlayerView playerView);
}
