package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.external.internal.vchat.view.LiveVChatPreviewView;
import p151v.VButton;
import p151v.VFrame;
import p151v.VImage;

/* JADX INFO: loaded from: classes9.dex */
public class vqu {
    /* JADX INFO: renamed from: a */
    public static void m202455a(LiveVChatPreviewView liveVChatPreviewView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveVChatPreviewView.f46266d = (VFrame) viewGroup.getChildAt(0);
        liveVChatPreviewView.f46267e = (VImage) viewGroup.getChildAt(1);
        liveVChatPreviewView.f46268f = (VButton) viewGroup.getChildAt(2);
        liveVChatPreviewView.f46269g = (VImage) viewGroup.getChildAt(3);
    }
}
