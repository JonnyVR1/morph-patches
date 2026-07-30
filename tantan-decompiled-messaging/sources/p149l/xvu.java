package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.external.internal.live.square.fragments.videochat.dialog.LiveVideoChatRandomDialog;

/* JADX INFO: loaded from: classes13.dex */
public class xvu {
    /* JADX INFO: renamed from: a */
    public static void m211307a(LiveVideoChatRandomDialog liveVideoChatRandomDialog, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveVideoChatRandomDialog._background = viewGroup.getChildAt(0);
        liveVideoChatRandomDialog._text = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        liveVideoChatRandomDialog._desc1 = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        liveVideoChatRandomDialog._desc2 = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        liveVideoChatRandomDialog._desc3 = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        liveVideoChatRandomDialog._confirm = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
    }
}
