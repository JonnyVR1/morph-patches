package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p051p1.mobile.putong.account.p055ui.camera.view.AccountMakeupItemView;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: renamed from: l.vr */
/* JADX INFO: loaded from: classes9.dex */
public class C20908vr {
    /* JADX INFO: renamed from: a */
    public static void m202463a(AccountMakeupItemView accountMakeupItemView, View view) {
        accountMakeupItemView.f17577a = (AccountMakeupItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        accountMakeupItemView.f17578b = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        accountMakeupItemView.f17579c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        accountMakeupItemView.f17580d = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        accountMakeupItemView.f17581e = (VText) viewGroup.getChildAt(1);
        accountMakeupItemView.f17582f = (TextView) viewGroup.getChildAt(2);
    }
}
