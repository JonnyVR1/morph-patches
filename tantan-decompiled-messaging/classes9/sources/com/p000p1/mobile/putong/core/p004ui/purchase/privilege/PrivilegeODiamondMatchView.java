package com.p000p1.mobile.putong.core.p004ui.purchase.privilege;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Privilege;
import l.d3c0;
import l.h690;
import l.zz6;
import p006l.qib0;
import v.AutoVDraweeView;
import v.VDraweeView;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class PrivilegeODiamondMatchView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f4869a;

    /* JADX INFO: renamed from: b */
    public AutoVDraweeView f4870b;

    /* JADX INFO: renamed from: c */
    public VImage f4871c;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.privilege.PrivilegeODiamondMatchView$a */
    public static /* synthetic */ class C0232a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f4872a;

        static {
            int[] iArr = new int[Privilege.values().length];
            f4872a = iArr;
            try {
                iArr[Privilege.vip_super_like.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4872a[Privilege.vip_independent_super_like.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4872a[Privilege.online_match_tickets.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4872a[Privilege.oDiamondGreetings.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public PrivilegeODiamondMatchView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m7597a(View view) {
        h690.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m7598b(@NonNull Privilege privilege) {
        this.f4870b.setImageUrl(CoreModule.m1854P().m11706a().m5576zj(CoreModule.f1534c.f3628e0.m21490p9()));
        int i = C0232a.f4872a[privilege.ordinal()];
        if (i == 1 || i == 2) {
            qib0.f19782G.m12767Y0(this.f4869a, zz6.u0() ? d3c0.K4 : d3c0.J4);
            this.f4871c.setImageResource(d3c0.E4);
        } else if (i == 3) {
            qib0.f19782G.m12767Y0(this.f4869a, zz6.u0() ? d3c0.I4 : d3c0.H4);
            this.f4871c.setImageResource(d3c0.D4);
        } else {
            if (i != 4) {
                return;
            }
            qib0.f19782G.m12767Y0(this.f4869a, zz6.u0() ? d3c0.G4 : d3c0.F4);
            this.f4871c.setImageResource(CoreModule.f1546o.m25559d().m5637I5() ? d3c0.C4 : d3c0.B4);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7597a(this);
    }

    public PrivilegeODiamondMatchView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeODiamondMatchView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
