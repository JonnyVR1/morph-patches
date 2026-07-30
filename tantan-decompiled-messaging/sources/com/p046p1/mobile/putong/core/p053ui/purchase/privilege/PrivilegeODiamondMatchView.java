package com.p046p1.mobile.putong.core.p053ui.purchase.privilege;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Privilege;
import p147v.AutoVDraweeView;
import p147v.VDraweeView;
import p147v.VImage;
import p149l.d3c0;
import p149l.h690;
import p149l.qib0;
import p149l.zz6;

/* JADX INFO: loaded from: classes9.dex */
public class PrivilegeODiamondMatchView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f35088a;

    /* JADX INFO: renamed from: b */
    public AutoVDraweeView f35089b;

    /* JADX INFO: renamed from: c */
    public VImage f35090c;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.privilege.PrivilegeODiamondMatchView$a */
    public static /* synthetic */ class C8796a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f35091a;

        static {
            int[] iArr = new int[Privilege.values().length];
            f35091a = iArr;
            try {
                iArr[Privilege.vip_super_like.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35091a[Privilege.vip_independent_super_like.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35091a[Privilege.online_match_tickets.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35091a[Privilege.oDiamondGreetings.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public PrivilegeODiamondMatchView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m54262a(View view) {
        h690.m129469a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m54263b(@NonNull Privilege privilege) {
        this.f35089b.setImageUrl(CoreModule.m29935P().m94651a().mo33639zj(CoreModule.f17545c.f19639e0.m169527p9()));
        int i = C8796a.f35091a[privilege.ordinal()];
        if (i == 1 || i == 2) {
            qib0.f154691G.m102354Y0(this.f35088a, zz6.m221004u0() ? d3c0.f83632K4 : d3c0.f83618J4);
            this.f35090c.setImageResource(d3c0.f83548E4);
        } else if (i == 3) {
            qib0.f154691G.m102354Y0(this.f35088a, zz6.m221004u0() ? d3c0.f83604I4 : d3c0.f83590H4);
            this.f35090c.setImageResource(d3c0.f83534D4);
        } else {
            if (i != 4) {
                return;
            }
            qib0.f154691G.m102354Y0(this.f35088a, zz6.m221004u0() ? d3c0.f83576G4 : d3c0.f83562F4);
            this.f35090c.setImageResource(CoreModule.f17557o.m195057d().mo33700I5() ? d3c0.f83520C4 : d3c0.f83506B4);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m54262a(this);
    }

    public PrivilegeODiamondMatchView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeODiamondMatchView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
