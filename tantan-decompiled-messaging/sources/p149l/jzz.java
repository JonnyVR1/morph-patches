package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.messages.view.MessageUserHeaderLayout;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class jzz {
    /* JADX INFO: renamed from: a */
    public static void m143968a(MessageUserHeaderLayout messageUserHeaderLayout, View view) {
        messageUserHeaderLayout.f32485a = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        messageUserHeaderLayout.f32486b = (VLinear) viewGroup.getChildAt(0);
        messageUserHeaderLayout.f32487c = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        messageUserHeaderLayout.f32488d = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        messageUserHeaderLayout.f32489e = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        messageUserHeaderLayout.f32490f = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        messageUserHeaderLayout.f32491g = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        messageUserHeaderLayout.f32492h = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        messageUserHeaderLayout.f32493i = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m143969b(MessageUserHeaderLayout messageUserHeaderLayout, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(l6c0.f126391T2, viewGroup, false);
        m143968a(messageUserHeaderLayout, viewInflate);
        return viewInflate;
    }
}
