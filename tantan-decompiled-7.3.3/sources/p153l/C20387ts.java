package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p051p1.mobile.putong.account.p055ui.mediapicker.impl.AccountMediaItemView;
import p151v.VCheckCircle;
import p151v.VDraweeView;
import p151v.VFrame;

/* JADX INFO: renamed from: l.ts */
/* JADX INFO: loaded from: classes9.dex */
public class C20387ts {
    /* JADX INFO: renamed from: a */
    public static void m192531a(AccountMediaItemView accountMediaItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        accountMediaItemView.f17725a = (VDraweeView) viewGroup.getChildAt(0);
        accountMediaItemView.f17726b = (ImageView) viewGroup.getChildAt(1);
        accountMediaItemView.f17727c = viewGroup.getChildAt(2);
        accountMediaItemView.f17728d = (VFrame) viewGroup.getChildAt(3);
        accountMediaItemView.f17729e = (VCheckCircle) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
    }
}
