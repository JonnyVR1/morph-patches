package p002l;

import android.content.DialogInterface;
import com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public interface vtl {
    /* JADX INFO: renamed from: a */
    void mo5149a(DialogInterface.OnDismissListener onDismissListener);

    /* JADX INFO: renamed from: b */
    int mo5150b();

    /* JADX INFO: renamed from: c */
    void mo5151c(DialogInterface.OnShowListener onShowListener);

    void dismiss();

    LiveDialogEnum getType();
}
