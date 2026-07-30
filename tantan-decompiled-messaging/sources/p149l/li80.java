package p149l;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.p046p1.mobile.putong.core.p053ui.PhotoPreviewView;
import com.p046p1.mobile.putong.core.p053ui.PlayerView;

/* JADX INFO: loaded from: classes3.dex */
public interface li80 {
    /* JADX INFO: renamed from: b */
    void mo149880b(w660 w660Var);

    /* JADX INFO: renamed from: d */
    default void m149881d(int i, View view) {
        if (view instanceof PlayerView) {
            mo149886i(i, (PlayerView) view);
        } else if (view instanceof PhotoPreviewView) {
            mo149885h(i, (PhotoPreviewView) view);
        }
    }

    /* JADX INFO: renamed from: e */
    c680.C16085c mo149882e();

    /* JADX INFO: renamed from: f */
    void mo149883f(ViewPager viewPager, int i, int i2);

    /* JADX INFO: renamed from: g */
    void mo149884g();

    /* JADX INFO: renamed from: h */
    void mo149885h(int i, PhotoPreviewView photoPreviewView);

    /* JADX INFO: renamed from: i */
    void mo149886i(int i, PlayerView playerView);
}
