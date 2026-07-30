package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.livingroom.increment.noble.NobleAttentionDialogView;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class il40 {
    /* JADX INFO: renamed from: a */
    public static void m136958a(NobleAttentionDialogView nobleAttentionDialogView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        nobleAttentionDialogView._empty_view = viewGroup.getChildAt(0);
        nobleAttentionDialogView._bg = viewGroup.getChildAt(1);
        nobleAttentionDialogView._avatar = (VDraweeView) viewGroup.getChildAt(2);
        nobleAttentionDialogView._title = (VText) viewGroup.getChildAt(3);
        nobleAttentionDialogView._summary = (VText) viewGroup.getChildAt(4);
        nobleAttentionDialogView._see = (VText) viewGroup.getChildAt(5);
        nobleAttentionDialogView._leave = (VText) viewGroup.getChildAt(6);
    }
}
