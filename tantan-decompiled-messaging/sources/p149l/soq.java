package p149l;

import android.graphics.Color;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.base.data.BLiveJsDialogItemType;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes4.dex */
public interface soq {
    /* JADX INFO: renamed from: c */
    default void m185292c(TextView textView, String str, BLiveJsDialogItemType bLiveJsDialogItemType) {
        textView.setText(bLiveJsDialogItemType.title);
        try {
            textView.setTextColor(Color.parseColor(uep0.m193323j(bLiveJsDialogItemType.textColor)));
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            ztr.m220140e(bLiveJsDialogItemType, str, e);
        }
        textView.setTextSize(bLiveJsDialogItemType.textSize);
        textView.setGravity(m185293d(bLiveJsDialogItemType));
    }

    /* JADX INFO: renamed from: d */
    default int m185293d(BLiveJsDialogItemType bLiveJsDialogItemType) {
        int i = bLiveJsDialogItemType.contentGravity;
        return (i == 1 || i == 2) ? 0 : 17;
    }

    /* JADX INFO: renamed from: g */
    void mo73103g(BLiveJsDialogItemType bLiveJsDialogItemType, String str, LinearLayout.LayoutParams layoutParams);
}
