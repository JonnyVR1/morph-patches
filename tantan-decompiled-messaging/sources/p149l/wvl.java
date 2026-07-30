package p149l;

import android.view.View;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.bean.MarrySeriesType;
import com.p046p1.mobile.putong.data.User;

/* JADX INFO: loaded from: classes3.dex */
public interface wvl {
    /* JADX INFO: renamed from: d */
    default void mo47525d(User user) {
        setContent(m2x.m152721c(getItemType(), user));
    }

    /* JADX INFO: renamed from: d0 */
    default boolean mo47542d0() {
        return true;
    }

    /* JADX INFO: renamed from: f */
    default boolean mo47526f() {
        return true;
    }

    View getClickView();

    MarrySeriesType getItemType();

    default void setContent(String str) {
    }
}
