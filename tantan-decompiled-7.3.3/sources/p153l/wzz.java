package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.messages.view.MessageMarryHeaderLayout;
import p151v.VDraweeView;
import p151v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class wzz {
    /* JADX INFO: renamed from: a */
    public static void m208792a(MessageMarryHeaderLayout messageMarryHeaderLayout, View view) {
        messageMarryHeaderLayout.f33284a = (MessageMarryHeaderLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        messageMarryHeaderLayout.f33285b = (FrameLayout) viewGroup.getChildAt(0);
        messageMarryHeaderLayout.f33286c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        messageMarryHeaderLayout.f33287d = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        messageMarryHeaderLayout.f33288e = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        messageMarryHeaderLayout.f33289f = (TextView) viewGroup.getChildAt(1);
        messageMarryHeaderLayout.f33290g = (HorizontalScrollView) viewGroup.getChildAt(2);
        messageMarryHeaderLayout.f33291h = (VLinear) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
    }
}
