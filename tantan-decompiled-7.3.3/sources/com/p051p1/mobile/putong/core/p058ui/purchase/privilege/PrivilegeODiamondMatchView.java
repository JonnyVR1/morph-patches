package com.p051p1.mobile.putong.core.p058ui.purchase.privilege;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Privilege;
import p151v.AutoVDraweeView;
import p151v.VDraweeView;
import p151v.VImage;
import p153l.c17;
import p153l.jbc0;
import p153l.le90;
import p153l.uqb0;

/* JADX INFO: loaded from: classes12.dex */
public class PrivilegeODiamondMatchView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f35936a;

    /* JADX INFO: renamed from: b */
    public AutoVDraweeView f35937b;

    /* JADX INFO: renamed from: c */
    public VImage f35938c;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.privilege.PrivilegeODiamondMatchView$a */
    public static /* synthetic */ class C8959a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f35939a;

        static {
            int[] iArr = new int[Privilege.values().length];
            f35939a = iArr;
            try {
                iArr[Privilege.vip_super_like.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35939a[Privilege.vip_independent_super_like.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35939a[Privilege.online_match_tickets.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35939a[Privilege.oDiamondGreetings.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public PrivilegeODiamondMatchView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m55445a(View view) {
        le90.m153881a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m55446b(@NonNull Privilege privilege) {
        this.f35937b.setImageUrl(CoreModule.m30933P().m143405a().mo34642zj(CoreModule.f18264c.f20381e0.m116600p9()));
        int i = C8959a.f35939a[privilege.ordinal()];
        if (i == 1 || i == 2) {
            uqb0.f180374G.m127138Y0(this.f35936a, c17.m107528u0() ? jbc0.f119287K4 : jbc0.f119273J4);
            this.f35938c.setImageResource(jbc0.f119203E4);
        } else if (i == 3) {
            uqb0.f180374G.m127138Y0(this.f35936a, c17.m107528u0() ? jbc0.f119259I4 : jbc0.f119245H4);
            this.f35938c.setImageResource(jbc0.f119189D4);
        } else {
            if (i != 4) {
                return;
            }
            uqb0.f180374G.m127138Y0(this.f35936a, c17.m107528u0() ? jbc0.f119231G4 : jbc0.f119217F4);
            this.f35938c.setImageResource(CoreModule.f18276o.m132214d().mo34703I5() ? jbc0.f119175C4 : jbc0.f119161B4);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m55445a(this);
    }

    public PrivilegeODiamondMatchView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeODiamondMatchView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
