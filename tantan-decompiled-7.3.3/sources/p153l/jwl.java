package p153l;

import android.content.DialogInterface;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;

/* JADX INFO: loaded from: classes4.dex */
public interface jwl {
    /* JADX INFO: renamed from: a */
    void mo72964a(DialogInterface.OnDismissListener onDismissListener);

    /* JADX INFO: renamed from: b */
    int mo72965b();

    /* JADX INFO: renamed from: c */
    void mo72966c(DialogInterface.OnShowListener onShowListener);

    void dismiss();

    LiveDialogEnum getType();
}
