package p153l;

import android.content.res.Resources;
import android.widget.SpinnerAdapter;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface jvi0 extends SpinnerAdapter {
    @Nullable
    Resources.Theme getDropDownViewTheme();

    void setDropDownViewTheme(@Nullable Resources.Theme theme);
}
