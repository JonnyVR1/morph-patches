package p009l;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.p000p1.mobile.putong.core.newui.home.opt.CardProgressAction;
import com.p000p1.mobile.putong.core.newui.home.views.CardOperationButton;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public interface nsl {
    /* JADX INFO: renamed from: a */
    void mo2399a(float f, CardProgressAction cardProgressAction);

    /* JADX INFO: renamed from: c */
    void mo2400c(CardProgressAction cardProgressAction);

    View getRealView();

    /* JADX INFO: renamed from: i */
    void mo2336i();

    /* JADX INFO: renamed from: j */
    void mo2337j(float f);

    void reset();

    void setNormalStateLayerBackground(Drawable drawable);

    void setOnLongPressListener(CardOperationButton.InterfaceC0213b interfaceC0213b);

    void setPressedStateLayerBackground(Drawable drawable);
}
