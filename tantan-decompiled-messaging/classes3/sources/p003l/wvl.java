package p003l;

import android.view.View;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.bean.MarrySeriesType;
import com.p1.mobile.putong.data.User;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public interface wvl {
    /* JADX INFO: renamed from: d */
    default void mo575d(User user) {
        setContent(m2x.m6196c(getItemType(), user));
    }

    /* JADX INFO: renamed from: d0 */
    default boolean mo594d0() {
        return true;
    }

    /* JADX INFO: renamed from: f */
    default boolean mo576f() {
        return true;
    }

    View getClickView();

    MarrySeriesType getItemType();

    default void setContent(String str) {
    }
}
