package p028v;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.SwitchCompat;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VSwitch extends SwitchCompat {
    public VSwitch(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void jumpDrawablesToCurrentState() {
        try {
            super.jumpDrawablesToCurrentState();
        } catch (Exception e) {
            CrashHelper.c(e);
        }
    }

    public VSwitch(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VSwitch(Context context) {
        super(context);
    }
}
