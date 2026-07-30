package p002l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.increment.noble.NobleAttentionDialogView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class il40 {
    /* JADX INFO: renamed from: a */
    public static void m15234a(NobleAttentionDialogView nobleAttentionDialogView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        nobleAttentionDialogView._empty_view = viewGroup.getChildAt(0);
        nobleAttentionDialogView._bg = viewGroup.getChildAt(1);
        nobleAttentionDialogView._avatar = viewGroup.getChildAt(2);
        nobleAttentionDialogView._title = viewGroup.getChildAt(3);
        nobleAttentionDialogView._summary = viewGroup.getChildAt(4);
        nobleAttentionDialogView._see = viewGroup.getChildAt(5);
        nobleAttentionDialogView._leave = viewGroup.getChildAt(6);
    }
}
