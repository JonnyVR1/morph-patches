package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p051p1.mobile.putong.core.p058ui.verification.remind.view.SimpleUpdateAvatarView;
import p151v.VProgressBar;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class dqf0 {
    /* JADX INFO: renamed from: a */
    public static void m117520a(SimpleUpdateAvatarView simpleUpdateAvatarView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        simpleUpdateAvatarView.f37538a = (SimpleDraweeView) viewGroup.getChildAt(0);
        simpleUpdateAvatarView.f37539b = (VProgressBar) viewGroup.getChildAt(1);
        simpleUpdateAvatarView.f37540c = (VText) viewGroup.getChildAt(2);
    }
}
