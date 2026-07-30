package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p046p1.mobile.putong.account.p050ui.mediapicker.impl.AccountMediaItemView;
import p147v.VCheckCircle;
import p147v.VDraweeView;
import p147v.VFrame;

/* JADX INFO: renamed from: l.zs */
/* JADX INFO: loaded from: classes9.dex */
public class C21758zs {
    /* JADX INFO: renamed from: a */
    public static void m219991a(AccountMediaItemView accountMediaItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        accountMediaItemView.f17006a = (VDraweeView) viewGroup.getChildAt(0);
        accountMediaItemView.f17007b = (ImageView) viewGroup.getChildAt(1);
        accountMediaItemView.f17008c = viewGroup.getChildAt(2);
        accountMediaItemView.f17009d = (VFrame) viewGroup.getChildAt(3);
        accountMediaItemView.f17010e = (VCheckCircle) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
    }
}
