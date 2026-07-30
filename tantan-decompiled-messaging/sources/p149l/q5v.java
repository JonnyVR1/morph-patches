package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.external.internal.virtualVoice.square.header.LiveVoiceInternalQuickEntryItemView;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes13.dex */
public class q5v {
    /* JADX INFO: renamed from: a */
    public static void m173101a(LiveVoiceInternalQuickEntryItemView liveVoiceInternalQuickEntryItemView, View view) {
        liveVoiceInternalQuickEntryItemView.f45520c = (LiveVoiceInternalQuickEntryItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        liveVoiceInternalQuickEntryItemView.f45521d = (VDraweeView) viewGroup.getChildAt(0);
        liveVoiceInternalQuickEntryItemView.f45522e = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        liveVoiceInternalQuickEntryItemView.f45523f = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
