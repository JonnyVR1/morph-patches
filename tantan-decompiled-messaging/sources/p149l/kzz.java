package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.messages.view.MessageUserHeaderLayout;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class kzz {
    /* JADX INFO: renamed from: a */
    public static void m147963a(MessageUserHeaderLayout messageUserHeaderLayout, View view) {
        messageUserHeaderLayout.f32507u = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        messageUserHeaderLayout.f32508v = (RelativeLayout) viewGroup.getChildAt(0);
        messageUserHeaderLayout.f32509w = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        messageUserHeaderLayout.f32510x = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        messageUserHeaderLayout.f32511y = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        messageUserHeaderLayout.f32512z = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2);
        messageUserHeaderLayout.f32449A = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3);
        messageUserHeaderLayout.f32450B = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        messageUserHeaderLayout.f32451C = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        messageUserHeaderLayout.f32452D = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
        messageUserHeaderLayout.f32453E = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        messageUserHeaderLayout.f32455F = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        messageUserHeaderLayout.f32457G = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        messageUserHeaderLayout.f32459H = (LinearLayout) viewGroup.getChildAt(1);
        messageUserHeaderLayout.f32461I = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        messageUserHeaderLayout.f32463J = (VImage) view.findViewById(y4c0.f196059V1);
        ViewGroup viewGroup2 = (ViewGroup) view;
        messageUserHeaderLayout.f32465K = (VText) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(0)).getChildAt(1);
        messageUserHeaderLayout.f32467L = (LinearLayout) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(1);
        messageUserHeaderLayout.f32469M = (VImage) view.findViewById(y4c0.f196139h2);
        messageUserHeaderLayout.f32471N = (VText) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(1)).getChildAt(1);
        messageUserHeaderLayout.f32473O = (LinearLayout) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(2);
        messageUserHeaderLayout.f32475P = (VImage) view.findViewById(y4c0.f196246w4);
        messageUserHeaderLayout.f32477Q = (VText) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(2)).getChildAt(1);
        messageUserHeaderLayout.f32479R = (LinearLayout) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(3);
        messageUserHeaderLayout.f32480S = (VImage) view.findViewById(y4c0.f196050T4);
        messageUserHeaderLayout.f32481T = (VText) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(3)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m147964b(MessageUserHeaderLayout messageUserHeaderLayout, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(l6c0.f126436a4, viewGroup, false);
        m147963a(messageUserHeaderLayout, viewInflate);
        return viewInflate;
    }
}
