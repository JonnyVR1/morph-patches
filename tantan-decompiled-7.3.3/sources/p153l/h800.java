package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.messages.view.MessageUserHeaderLayout;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class h800 {
    /* JADX INFO: renamed from: a */
    public static void m133888a(MessageUserHeaderLayout messageUserHeaderLayout, View view) {
        messageUserHeaderLayout.f33355u = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        messageUserHeaderLayout.f33356v = (RelativeLayout) viewGroup.getChildAt(0);
        messageUserHeaderLayout.f33357w = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        messageUserHeaderLayout.f33358x = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        messageUserHeaderLayout.f33359y = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        messageUserHeaderLayout.f33360z = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2);
        messageUserHeaderLayout.f33297A = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3);
        messageUserHeaderLayout.f33298B = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        messageUserHeaderLayout.f33299C = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        messageUserHeaderLayout.f33300D = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
        messageUserHeaderLayout.f33301E = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        messageUserHeaderLayout.f33303F = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        messageUserHeaderLayout.f33305G = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        messageUserHeaderLayout.f33307H = (LinearLayout) viewGroup.getChildAt(1);
        messageUserHeaderLayout.f33309I = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        messageUserHeaderLayout.f33311J = (VImage) view.findViewById(edc0.f93294V1);
        ViewGroup viewGroup2 = (ViewGroup) view;
        messageUserHeaderLayout.f33313K = (VText) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(0)).getChildAt(1);
        messageUserHeaderLayout.f33315L = (LinearLayout) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(1);
        messageUserHeaderLayout.f33317M = (VImage) view.findViewById(edc0.f93374h2);
        messageUserHeaderLayout.f33319N = (VText) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(1)).getChildAt(1);
        messageUserHeaderLayout.f33321O = (LinearLayout) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(2);
        messageUserHeaderLayout.f33323P = (VImage) view.findViewById(edc0.f93481w4);
        messageUserHeaderLayout.f33325Q = (VText) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(2)).getChildAt(1);
        messageUserHeaderLayout.f33327R = (LinearLayout) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(3);
        messageUserHeaderLayout.f33328S = (VImage) view.findViewById(edc0.f93285T4);
        messageUserHeaderLayout.f33329T = (VText) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(3)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m133889b(MessageUserHeaderLayout messageUserHeaderLayout, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(qec0.f156992a4, viewGroup, false);
        m133888a(messageUserHeaderLayout, viewInflate);
        return viewInflate;
    }
}
