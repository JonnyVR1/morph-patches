package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.messages.view.MessageUserHeaderLayout;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class jzz {
    /* JADX INFO: renamed from: a */
    public static void m7470a(MessageUserHeaderLayout messageUserHeaderLayout, View view) {
        messageUserHeaderLayout.a = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        messageUserHeaderLayout.b = viewGroup.getChildAt(0);
        messageUserHeaderLayout.c = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        messageUserHeaderLayout.d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        messageUserHeaderLayout.e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        messageUserHeaderLayout.f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        messageUserHeaderLayout.g = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        messageUserHeaderLayout.h = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        messageUserHeaderLayout.i = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m7471b(MessageUserHeaderLayout messageUserHeaderLayout, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(l6c0.f5900T2, viewGroup, false);
        m7470a(messageUserHeaderLayout, viewInflate);
        return viewInflate;
    }
}
