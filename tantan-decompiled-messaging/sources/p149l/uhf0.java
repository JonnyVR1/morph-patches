package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p046p1.mobile.putong.core.p053ui.verification.remind.view.SimpleUpdateAvatarView;
import p147v.VProgressBar;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class uhf0 {
    /* JADX INFO: renamed from: a */
    public static void m193713a(SimpleUpdateAvatarView simpleUpdateAvatarView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        simpleUpdateAvatarView.f36690a = (SimpleDraweeView) viewGroup.getChildAt(0);
        simpleUpdateAvatarView.f36691b = (VProgressBar) viewGroup.getChildAt(1);
        simpleUpdateAvatarView.f36692c = (VText) viewGroup.getChildAt(2);
    }
}
