package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.PicPostDlgView;
import p151v.VDraweeView;
import p151v.VImage;

/* JADX INFO: loaded from: classes10.dex */
public class kl70 {
    /* JADX INFO: renamed from: a */
    public static void m150354a(PicPostDlgView picPostDlgView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        picPostDlgView.f34452a = (VDraweeView) viewGroup.getChildAt(0);
        picPostDlgView.f34453b = (VDraweeView) viewGroup.getChildAt(1);
        picPostDlgView.f34454c = (VDraweeView) viewGroup.getChildAt(2);
        picPostDlgView.f34455d = (VImage) viewGroup.getChildAt(3);
    }
}
