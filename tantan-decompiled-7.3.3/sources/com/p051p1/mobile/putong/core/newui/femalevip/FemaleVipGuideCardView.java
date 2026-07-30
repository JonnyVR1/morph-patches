package com.p051p1.mobile.putong.core.newui.femalevip;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.newui.femalevip.FemaleVipGuideCardView;
import com.p051p1.mobile.putong.core.newui.home.NewNewHomeFrag;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.i4g0;
import p153l.jyb;
import p153l.uei;
import p153l.wei;
import p153l.xei;

/* JADX INFO: loaded from: classes11.dex */
public class FemaleVipGuideCardView extends CardView {

    /* JADX INFO: renamed from: a */
    public FemaleVipGuideCardView f22219a;

    /* JADX INFO: renamed from: b */
    public VImage f22220b;

    /* JADX INFO: renamed from: c */
    public VText f22221c;

    /* JADX INFO: renamed from: d */
    public VText f22222d;

    /* JADX INFO: renamed from: e */
    public VImage f22223e;

    /* JADX INFO: renamed from: f */
    public VText f22224f;

    /* JADX INFO: renamed from: g */
    public boolean f22225g;

    public FemaleVipGuideCardView(@NonNull Context context) {
        super(context);
        this.f22225g = true;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m37454b(NewNewHomeFrag newNewHomeFrag, uei ueiVar, View view) {
        if (!xei.m210680c().m210689i()) {
            C8927c.m54614V(newNewHomeFrag.act(), "p_home,femalevip_card", Privilege.pick_tantan_credits_users);
        }
        i4g0.m138523u("e_card_femalevip", "p_suggest_users_home_view", jyb.m147494Y("direction", "like"));
        ueiVar.f178660c = Boolean.TRUE;
        newNewHomeFrag.f22420C.m38128A2().mo39804A(SwipeDirection.RIGHT);
    }

    /* JADX INFO: renamed from: e */
    public final void m37455e(View view) {
        wei.m205994a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public void m37456f(final NewNewHomeFrag newNewHomeFrag, final uei ueiVar) {
        if (newNewHomeFrag == null || ueiVar == null) {
            return;
        }
        this.f22224f.setTypeface(Typeface.defaultFromStyle(1));
        if (this.f22225g) {
            this.f22225g = false;
            i4g0.m138526x("e_card_femalevip", "p_suggest_users_home_view");
        }
        bnl0.m105509E0(this.f22224f, new View.OnClickListener() { // from class: l.vei
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FemaleVipGuideCardView.m37454b(newNewHomeFrag, ueiVar, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m37455e(this);
    }

    public FemaleVipGuideCardView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22225g = true;
    }

    public FemaleVipGuideCardView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22225g = true;
    }
}
