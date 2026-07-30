package p151v;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.SwitchCompat;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes3.dex */
public class VSwitch extends SwitchCompat {
    public VSwitch(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // androidx.appcompat.widget.SwitchCompat, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        try {
            super.jumpDrawablesToCurrentState();
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
    }

    public VSwitch(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VSwitch(Context context) {
        super(context);
    }
}
