package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderUserView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class otb0 {
    /* JADX INFO: renamed from: a */
    public static void m165933a(QuickChatHeaderUserView quickChatHeaderUserView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        quickChatHeaderUserView._profile_user = (VDraweeView) viewGroup.getChildAt(0);
        quickChatHeaderUserView._green = (VImage) viewGroup.getChildAt(1);
        quickChatHeaderUserView._name = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        quickChatHeaderUserView._sex = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        quickChatHeaderUserView._close = (VImage) viewGroup.getChildAt(3);
        quickChatHeaderUserView._tag1 = (VText) viewGroup.getChildAt(4);
        quickChatHeaderUserView._tag2 = (VText) viewGroup.getChildAt(5);
        quickChatHeaderUserView._tag3 = (VText) viewGroup.getChildAt(6);
        quickChatHeaderUserView._gotochat = (VText) viewGroup.getChildAt(7);
    }

    /* JADX INFO: renamed from: b */
    public static View m165934b(QuickChatHeaderUserView quickChatHeaderUserView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f96033ub, viewGroup, true);
        m165933a(quickChatHeaderUserView, viewInflate);
        return viewInflate;
    }
}
