package p149l;

import android.content.res.Resources;
import android.widget.SpinnerAdapter;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface imi0 extends SpinnerAdapter {
    @Nullable
    Resources.Theme getDropDownViewTheme();

    void setDropDownViewTheme(@Nullable Resources.Theme theme);
}
