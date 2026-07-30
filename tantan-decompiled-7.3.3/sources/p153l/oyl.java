package p153l;

import android.view.View;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.bean.MarrySeriesType;
import com.p051p1.mobile.putong.data.User;

/* JADX INFO: loaded from: classes3.dex */
public interface oyl {
    /* JADX INFO: renamed from: d */
    default void mo48708d(User user) {
        setContent(l5x.m153006c(getItemType(), user));
    }

    /* JADX INFO: renamed from: d0 */
    default boolean mo48725d0() {
        return true;
    }

    /* JADX INFO: renamed from: f */
    default boolean mo48709f() {
        return true;
    }

    View getClickView();

    MarrySeriesType getItemType();

    default void setContent(String str) {
    }
}
