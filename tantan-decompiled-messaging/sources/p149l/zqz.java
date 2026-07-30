package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.messages.view.MessageMarryHeaderLayout;
import p147v.VDraweeView;
import p147v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class zqz {
    /* JADX INFO: renamed from: a */
    public static void m219913a(MessageMarryHeaderLayout messageMarryHeaderLayout, View view) {
        messageMarryHeaderLayout.f32436a = (MessageMarryHeaderLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        messageMarryHeaderLayout.f32437b = (FrameLayout) viewGroup.getChildAt(0);
        messageMarryHeaderLayout.f32438c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        messageMarryHeaderLayout.f32439d = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        messageMarryHeaderLayout.f32440e = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        messageMarryHeaderLayout.f32441f = (TextView) viewGroup.getChildAt(1);
        messageMarryHeaderLayout.f32442g = (HorizontalScrollView) viewGroup.getChildAt(2);
        messageMarryHeaderLayout.f32443h = (VLinear) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
    }
}
