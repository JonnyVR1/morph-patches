package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p1.mobile.putong.core.ui.messages.view.MessageUserHeaderLayout;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class lzz {
    /* JADX INFO: renamed from: a */
    public static void m7934a(MessageUserHeaderLayout messageUserHeaderLayout, View view) {
        messageUserHeaderLayout.j = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        messageUserHeaderLayout.k = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        messageUserHeaderLayout.l = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        messageUserHeaderLayout.m = (LinearLayout) viewGroup.getChildAt(1);
        messageUserHeaderLayout.n = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        messageUserHeaderLayout.o = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        messageUserHeaderLayout.p = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        messageUserHeaderLayout.q = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
        messageUserHeaderLayout.r = (ViewStub) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        messageUserHeaderLayout.s = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        messageUserHeaderLayout.t = (ViewStub) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m7935b(MessageUserHeaderLayout messageUserHeaderLayout, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(l6c0.f5994h4, viewGroup, false);
        m7934a(messageUserHeaderLayout, viewInflate);
        return viewInflate;
    }
}
