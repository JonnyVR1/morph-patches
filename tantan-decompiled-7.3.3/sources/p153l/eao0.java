package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.emoji.VoiceMicEmojiItemView;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class eao0 {
    /* JADX INFO: renamed from: a */
    public static void m120099a(VoiceMicEmojiItemView voiceMicEmojiItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceMicEmojiItemView.f53963a = (FrameLayout) viewGroup.getChildAt(0);
        voiceMicEmojiItemView.f53964b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        voiceMicEmojiItemView.f53965c = (VText) viewGroup.getChildAt(1);
    }
}
