package com.p046p1.mobile.putong.core.newui.femalevip;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.newui.femalevip.FemaleVipGuideCardView;
import com.p046p1.mobile.putong.core.newui.home.NewNewHomeFrag;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import p147v.VImage;
import p147v.VText;
import p149l.fdi;
import p149l.hdi;
import p149l.idi;
import p149l.vwb;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class FemaleVipGuideCardView extends CardView {

    /* JADX INFO: renamed from: a */
    public FemaleVipGuideCardView f21477a;

    /* JADX INFO: renamed from: b */
    public VImage f21478b;

    /* JADX INFO: renamed from: c */
    public VText f21479c;

    /* JADX INFO: renamed from: d */
    public VText f21480d;

    /* JADX INFO: renamed from: e */
    public VImage f21481e;

    /* JADX INFO: renamed from: f */
    public VText f21482f;

    /* JADX INFO: renamed from: g */
    public boolean f21483g;

    public FemaleVipGuideCardView(@NonNull Context context) {
        super(context);
        this.f21483g = true;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m36451b(NewNewHomeFrag newNewHomeFrag, fdi fdiVar, View view) {
        if (!idi.m135447c().m135456i()) {
            C8764c.m53431V(newNewHomeFrag.act(), "p_home,femalevip_card", Privilege.pick_tantan_credits_users);
        }
        zvf0.m220399u("e_card_femalevip", "p_suggest_users_home_view", vwb.m200311Y("direction", "like"));
        fdiVar.f97049c = Boolean.TRUE;
        newNewHomeFrag.f21678C.m37125A2().mo38801A(SwipeDirection.RIGHT);
    }

    /* JADX INFO: renamed from: e */
    public final void m36452e(View view) {
        hdi.m130590a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public void m36453f(final NewNewHomeFrag newNewHomeFrag, final fdi fdiVar) {
        if (newNewHomeFrag == null || fdiVar == null) {
            return;
        }
        this.f21482f.setTypeface(Typeface.defaultFromStyle(1));
        if (this.f21483g) {
            this.f21483g = false;
            zvf0.m220402x("e_card_femalevip", "p_suggest_users_home_view");
        }
        xdl0.m208329E0(this.f21482f, new View.OnClickListener() { // from class: l.gdi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FemaleVipGuideCardView.m36451b(newNewHomeFrag, fdiVar, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m36452e(this);
    }

    public FemaleVipGuideCardView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21483g = true;
    }

    public FemaleVipGuideCardView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f21483g = true;
    }
}
