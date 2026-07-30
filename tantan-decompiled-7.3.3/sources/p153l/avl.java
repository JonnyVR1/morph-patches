package p153l;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.p051p1.mobile.putong.core.newui.home.opt.CardProgressAction;
import com.p051p1.mobile.putong.core.newui.home.views.CardOperationButton;

/* JADX INFO: loaded from: classes11.dex */
public interface avl {
    /* JADX INFO: renamed from: a */
    void mo39424a(float f, CardProgressAction cardProgressAction);

    /* JADX INFO: renamed from: c */
    void mo39425c(CardProgressAction cardProgressAction);

    View getRealView();

    /* JADX INFO: renamed from: i */
    void mo39361i();

    /* JADX INFO: renamed from: j */
    void mo39362j(float f);

    void reset();

    void setNormalStateLayerBackground(Drawable drawable);

    void setOnLongPressListener(CardOperationButton.InterfaceC8200b interfaceC8200b);

    void setPressedStateLayerBackground(Drawable drawable);
}
