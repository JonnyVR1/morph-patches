package p149l;

import android.content.DialogInterface;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;

/* JADX INFO: loaded from: classes4.dex */
public interface vtl {
    /* JADX INFO: renamed from: a */
    void mo71781a(DialogInterface.OnDismissListener onDismissListener);

    /* JADX INFO: renamed from: b */
    int mo71782b();

    /* JADX INFO: renamed from: c */
    void mo71783c(DialogInterface.OnShowListener onShowListener);

    void dismiss();

    LiveDialogEnum getType();
}
