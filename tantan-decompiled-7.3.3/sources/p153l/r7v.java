package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.external.internal.virtualVoice.square.header.LiveVoiceInternalQuickEntryItemView;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes9.dex */
public class r7v {
    /* JADX INFO: renamed from: a */
    public static void m180164a(LiveVoiceInternalQuickEntryItemView liveVoiceInternalQuickEntryItemView, View view) {
        liveVoiceInternalQuickEntryItemView.f46368c = (LiveVoiceInternalQuickEntryItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        liveVoiceInternalQuickEntryItemView.f46369d = (VDraweeView) viewGroup.getChildAt(0);
        liveVoiceInternalQuickEntryItemView.f46370e = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        liveVoiceInternalQuickEntryItemView.f46371f = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
