package p002l;

import android.graphics.Color;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p1.mobile.putong.live.base.data.BLiveJsDialogItemType;
import com.tantanapp.common.utils.CrashHelper;
import l.uep0;
import l.ztr;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public interface soq {
    /* JADX INFO: renamed from: c */
    default void m22585c(TextView textView, String str, BLiveJsDialogItemType bLiveJsDialogItemType) {
        textView.setText(bLiveJsDialogItemType.title);
        try {
            textView.setTextColor(Color.parseColor(uep0.j(bLiveJsDialogItemType.textColor)));
        } catch (Exception e) {
            CrashHelper.c(e);
            ztr.e(bLiveJsDialogItemType, str, e);
        }
        textView.setTextSize(bLiveJsDialogItemType.textSize);
        textView.setGravity(m22586d(bLiveJsDialogItemType));
    }

    /* JADX INFO: renamed from: d */
    default int m22586d(BLiveJsDialogItemType bLiveJsDialogItemType) {
        int i = bLiveJsDialogItemType.contentGravity;
        return (i == 1 || i == 2) ? 0 : 17;
    }

    /* JADX INFO: renamed from: g */
    void mo6629g(BLiveJsDialogItemType bLiveJsDialogItemType, String str, LinearLayout.LayoutParams layoutParams);
}
