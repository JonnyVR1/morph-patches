package com.p000p1.mobile.putong.core.newui.femalevip;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import com.p000p1.mobile.putong.core.newui.femalevip.FemaleVipGuideCardView;
import com.p000p1.mobile.putong.core.newui.home.NewNewHomeFrag;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.ui.purchase.c;
import l.hdi;
import l.j760;
import l.vwb;
import l.xdl0;
import l.zvf0;
import p009l.fdi;
import p009l.idi;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class FemaleVipGuideCardView extends CardView {

    /* JADX INFO: renamed from: a */
    public FemaleVipGuideCardView f255a;

    /* JADX INFO: renamed from: b */
    public VImage f256b;

    /* JADX INFO: renamed from: c */
    public VText f257c;

    /* JADX INFO: renamed from: d */
    public VText f258d;

    /* JADX INFO: renamed from: e */
    public VImage f259e;

    /* JADX INFO: renamed from: f */
    public VText f260f;

    /* JADX INFO: renamed from: g */
    public boolean f261g;

    public FemaleVipGuideCardView(@NonNull Context context) {
        super(context);
        this.f261g = true;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m380b(NewNewHomeFrag newNewHomeFrag, fdi fdiVar, View view) {
        if (!idi.m16341c().m16350i()) {
            c.V(newNewHomeFrag.act(), "p_home,femalevip_card", Privilege.pick_tantan_credits_users);
        }
        zvf0.u("e_card_femalevip", "p_suggest_users_home_view", new j760[]{vwb.Y("direction", "like")});
        fdiVar.f12947c = Boolean.TRUE;
        newNewHomeFrag.f456C.m1092A2().mo2797A(SwipeDirection.RIGHT);
    }

    /* JADX INFO: renamed from: e */
    public final void m381e(View view) {
        hdi.a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public void m382f(final NewNewHomeFrag newNewHomeFrag, final fdi fdiVar) {
        if (newNewHomeFrag == null || fdiVar == null) {
            return;
        }
        this.f260f.setTypeface(Typeface.defaultFromStyle(1));
        if (this.f261g) {
            this.f261g = false;
            zvf0.x("e_card_femalevip", "p_suggest_users_home_view");
        }
        xdl0.E0(this.f260f, new View.OnClickListener() { // from class: l.gdi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FemaleVipGuideCardView.m380b(newNewHomeFrag, fdiVar, view);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m381e(this);
    }

    public FemaleVipGuideCardView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f261g = true;
    }

    public FemaleVipGuideCardView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f261g = true;
    }
}
