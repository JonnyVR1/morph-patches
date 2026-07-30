package p003l;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.p1.mobile.putong.core.ui.PhotoPreviewView;
import com.p1.mobile.putong.core.ui.PlayerView;
import l.c680;
import l.w660;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public interface li80 {
    /* JADX INFO: renamed from: b */
    void mo6026b(w660 w660Var);

    /* JADX INFO: renamed from: d */
    default void m6027d(int i, View view) {
        if (view instanceof PlayerView) {
            mo6032i(i, (PlayerView) view);
        } else if (view instanceof PhotoPreviewView) {
            mo6031h(i, (PhotoPreviewView) view);
        }
    }

    /* JADX INFO: renamed from: e */
    c680.c mo6028e();

    /* JADX INFO: renamed from: f */
    void mo6029f(ViewPager viewPager, int i, int i2);

    /* JADX INFO: renamed from: g */
    void mo6030g();

    /* JADX INFO: renamed from: h */
    void mo6031h(int i, PhotoPreviewView photoPreviewView);

    /* JADX INFO: renamed from: i */
    void mo6032i(int i, PlayerView playerView);
}
