package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.newui.messages.ConversationWeakenView;
import p151v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class cn6 {
    /* JADX INFO: renamed from: a */
    public static void m111451a(ConversationWeakenView conversationWeakenView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        conversationWeakenView.f25814c = (VLinear) viewGroup.getChildAt(0);
        conversationWeakenView.f25815d = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        conversationWeakenView.f25816e = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        conversationWeakenView.f25817f = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        conversationWeakenView.f25818g = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
    }
}
