package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.messages.view.MessageMarryHeaderLayout;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class zqz {
    /* JADX INFO: renamed from: a */
    public static void m11445a(MessageMarryHeaderLayout messageMarryHeaderLayout, View view) {
        messageMarryHeaderLayout.a = (MessageMarryHeaderLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        messageMarryHeaderLayout.b = (FrameLayout) viewGroup.getChildAt(0);
        messageMarryHeaderLayout.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        messageMarryHeaderLayout.d = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        messageMarryHeaderLayout.e = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        messageMarryHeaderLayout.f = (TextView) viewGroup.getChildAt(1);
        messageMarryHeaderLayout.g = (HorizontalScrollView) viewGroup.getChildAt(2);
        messageMarryHeaderLayout.h = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
    }
}
