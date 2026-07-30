package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.newui.messages.ConversationWeakenView;
import p147v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class zl6 {
    /* JADX INFO: renamed from: a */
    public static void m219246a(ConversationWeakenView conversationWeakenView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        conversationWeakenView.f25072c = (VLinear) viewGroup.getChildAt(0);
        conversationWeakenView.f25073d = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        conversationWeakenView.f25074e = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        conversationWeakenView.f25075f = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        conversationWeakenView.f25076g = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
    }
}
