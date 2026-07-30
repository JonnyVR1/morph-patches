package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.messages.view.MessageUserHeaderLayout;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class kzz {
    /* JADX INFO: renamed from: a */
    public static void m7649a(MessageUserHeaderLayout messageUserHeaderLayout, View view) {
        messageUserHeaderLayout.u = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        messageUserHeaderLayout.v = (RelativeLayout) viewGroup.getChildAt(0);
        messageUserHeaderLayout.w = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        messageUserHeaderLayout.x = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        messageUserHeaderLayout.y = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        messageUserHeaderLayout.z = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2);
        messageUserHeaderLayout.A = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3);
        messageUserHeaderLayout.B = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        messageUserHeaderLayout.C = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        messageUserHeaderLayout.D = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
        messageUserHeaderLayout.E = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        messageUserHeaderLayout.F = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        messageUserHeaderLayout.G = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        messageUserHeaderLayout.H = (LinearLayout) viewGroup.getChildAt(1);
        messageUserHeaderLayout.I = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        messageUserHeaderLayout.J = view.findViewById(y4c0.f8776V1);
        ViewGroup viewGroup2 = (ViewGroup) view;
        messageUserHeaderLayout.K = ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(0)).getChildAt(1);
        messageUserHeaderLayout.L = (LinearLayout) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(1);
        messageUserHeaderLayout.M = view.findViewById(y4c0.f8856h2);
        messageUserHeaderLayout.N = ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(1)).getChildAt(1);
        messageUserHeaderLayout.O = (LinearLayout) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(2);
        messageUserHeaderLayout.P = view.findViewById(y4c0.f8963w4);
        messageUserHeaderLayout.Q = ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(2)).getChildAt(1);
        messageUserHeaderLayout.R = (LinearLayout) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(3);
        messageUserHeaderLayout.S = view.findViewById(y4c0.f8767T4);
        messageUserHeaderLayout.T = ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(3)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m7650b(MessageUserHeaderLayout messageUserHeaderLayout, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(l6c0.f5945a4, viewGroup, false);
        m7649a(messageUserHeaderLayout, viewInflate);
        return viewInflate;
    }
}
