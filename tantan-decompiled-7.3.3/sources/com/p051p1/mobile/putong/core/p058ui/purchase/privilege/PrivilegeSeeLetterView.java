package com.p051p1.mobile.putong.core.p058ui.purchase.privilege;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p151v.AutoVDraweeView;
import p153l.c17;
import p153l.jbc0;
import p153l.pj90;
import p153l.uqb0;

/* JADX INFO: loaded from: classes12.dex */
public class PrivilegeSeeLetterView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public AutoVDraweeView f35952a;

    public PrivilegeSeeLetterView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m55459a(View view) {
        pj90.m172487a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m55460b() {
        User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(CoreModule.m30933P().m143405a().mo34548mb());
        if (NullChecker.m82486a(userM116503Pa)) {
            this.f35952a.setImageUrl(userM116503Pa.m61308fp().url);
        } else {
            uqb0.f180374G.m127138Y0(this.f35952a, c17.m107528u0() ? jbc0.f119375Q8 : jbc0.f119361P8);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m55459a(this);
    }

    public PrivilegeSeeLetterView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeSeeLetterView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
