package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.p053ui.messages.view.MessageUserHeaderLayout;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class lzz {
    /* JADX INFO: renamed from: a */
    public static void m152408a(MessageUserHeaderLayout messageUserHeaderLayout, View view) {
        messageUserHeaderLayout.f32494j = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        messageUserHeaderLayout.f32495k = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        messageUserHeaderLayout.f32497l = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        messageUserHeaderLayout.f32498m = (LinearLayout) viewGroup.getChildAt(1);
        messageUserHeaderLayout.f32499n = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        messageUserHeaderLayout.f32500o = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        messageUserHeaderLayout.f32501p = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        messageUserHeaderLayout.f32503q = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
        messageUserHeaderLayout.f32504r = (ViewStub) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        messageUserHeaderLayout.f32505s = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        messageUserHeaderLayout.f32506t = (ViewStub) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m152409b(MessageUserHeaderLayout messageUserHeaderLayout, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(l6c0.f126485h4, viewGroup, false);
        m152408a(messageUserHeaderLayout, viewInflate);
        return viewInflate;
    }
}
