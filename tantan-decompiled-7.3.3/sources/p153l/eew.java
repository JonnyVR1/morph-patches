package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.p058ui.messages.emoji.VEditTextEmojiCompat;
import p151v.VImage;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class eew {
    /* JADX INFO: renamed from: a */
    public static void m120570a(dew dewVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        dewVar.f88088a = (FrameLayout) viewGroup.getChildAt(0);
        dewVar.f88089b = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        dewVar.f88090c = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        dewVar.f88091d = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        dewVar.f88092e = (LinearLayout) viewGroup.getChildAt(1);
        dewVar.f88093f = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        dewVar.f88094g = (VEditTextEmojiCompat) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        dewVar.f88095h = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        dewVar.f88096i = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
        dewVar.f88097j = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m120571b(dew dewVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125356C6, viewGroup, false);
        m120570a(dewVar, viewInflate);
        return viewInflate;
    }
}
