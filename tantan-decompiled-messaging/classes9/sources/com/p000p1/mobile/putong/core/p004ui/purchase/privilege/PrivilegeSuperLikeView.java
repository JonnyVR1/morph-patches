package com.p000p1.mobile.putong.core.p004ui.purchase.privilege;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.Media;
import com.tantanapp.common.utils.NullChecker;
import l.biq;
import l.d3c0;
import l.n3b0;
import l.ob90;
import l.sb90;
import l.zz6;
import p006l.qib0;
import v.AutoVDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class PrivilegeSuperLikeView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public AutoVDraweeView f4886a;

    /* JADX INFO: renamed from: b */
    public AutoVDraweeView f4887b;

    /* JADX INFO: renamed from: c */
    public ImageView f4888c;

    public PrivilegeSuperLikeView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m7613a(View view) {
        ob90.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m7614b() {
        this.f4886a.setImageUrl(((Media) CoreModule.f1534c.f3628e0.m21490p9().fp()).url);
        if (!NullChecker.a(n3b0.j())) {
            qib0.f19782G.m12767Y0(this.f4887b, zz6.u0() ? d3c0.xc : d3c0.wc);
            return;
        }
        boolean zC = sb90.c(n3b0.j());
        AutoVDraweeView autoVDraweeView = this.f4887b;
        if (zC) {
            autoVDraweeView.y(((Media) n3b0.j().fp()).url, new biq(4, 15));
        } else {
            autoVDraweeView.setImageUrl(((Media) n3b0.j().fp()).url);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7613a(this);
    }

    public PrivilegeSuperLikeView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeSuperLikeView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
