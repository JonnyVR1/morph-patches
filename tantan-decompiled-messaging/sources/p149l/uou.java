package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.external.internal.vchat.view.LiveVChatPreviewView;
import p147v.VButton;
import p147v.VFrame;
import p147v.VImage;

/* JADX INFO: loaded from: classes13.dex */
public class uou {
    /* JADX INFO: renamed from: a */
    public static void m194566a(LiveVChatPreviewView liveVChatPreviewView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveVChatPreviewView.f45418d = (VFrame) viewGroup.getChildAt(0);
        liveVChatPreviewView.f45419e = (VImage) viewGroup.getChildAt(1);
        liveVChatPreviewView.f45420f = (VButton) viewGroup.getChildAt(2);
        liveVChatPreviewView.f45421g = (VImage) viewGroup.getChildAt(3);
    }
}
