package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.core.p053ui.likedusers.tablayout.undolike.UndoCoverAnimView;
import com.p046p1.mobile.putong.core.p053ui.likedusers.tablayout.undolike.UndoFlipFrameLayout;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class unj0 {
    /* JADX INFO: renamed from: a */
    public static void m194424a(UndoCoverAnimView undoCoverAnimView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        undoCoverAnimView._background = viewGroup.getChildAt(0);
        undoCoverAnimView._undo_flip_layout = (UndoFlipFrameLayout) viewGroup.getChildAt(1);
        undoCoverAnimView._image = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        undoCoverAnimView._personal_info = (ConstraintLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        undoCoverAnimView._online_status = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        undoCoverAnimView._user_info = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        undoCoverAnimView._action_btn = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2);
        undoCoverAnimView._new_user = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        undoCoverAnimView._mask = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        undoCoverAnimView._heart = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
    }
}
