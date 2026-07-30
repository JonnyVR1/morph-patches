package p149l;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.p046p1.mobile.putong.core.newui.home.opt.CardProgressAction;
import com.p046p1.mobile.putong.core.newui.home.views.CardOperationButton;

/* JADX INFO: loaded from: classes11.dex */
public interface nsl {
    /* JADX INFO: renamed from: a */
    void mo38421a(float f, CardProgressAction cardProgressAction);

    /* JADX INFO: renamed from: c */
    void mo38422c(CardProgressAction cardProgressAction);

    View getRealView();

    /* JADX INFO: renamed from: i */
    void mo38358i();

    /* JADX INFO: renamed from: j */
    void mo38359j(float f);

    void reset();

    void setNormalStateLayerBackground(Drawable drawable);

    void setOnLongPressListener(CardOperationButton.InterfaceC8049b interfaceC8049b);

    void setPressedStateLayerBackground(Drawable drawable);
}
