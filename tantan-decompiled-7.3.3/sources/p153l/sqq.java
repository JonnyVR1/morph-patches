package p153l;

import android.graphics.Color;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.base.data.BLiveJsDialogItemType;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes4.dex */
public interface sqq {
    /* JADX INFO: renamed from: c */
    default void m187556c(TextView textView, String str, BLiveJsDialogItemType bLiveJsDialogItemType) {
        textView.setText(bLiveJsDialogItemType.title);
        try {
            textView.setTextColor(Color.parseColor(ynp0.m216933j(bLiveJsDialogItemType.textColor)));
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            awr.m100711e(bLiveJsDialogItemType, str, e);
        }
        textView.setTextSize(bLiveJsDialogItemType.textSize);
        textView.setGravity(m187557d(bLiveJsDialogItemType));
    }

    /* JADX INFO: renamed from: d */
    default int m187557d(BLiveJsDialogItemType bLiveJsDialogItemType) {
        int i = bLiveJsDialogItemType.contentGravity;
        return (i == 1 || i == 2) ? 0 : 17;
    }

    /* JADX INFO: renamed from: g */
    void mo74286g(BLiveJsDialogItemType bLiveJsDialogItemType, String str, LinearLayout.LayoutParams layoutParams);
}
