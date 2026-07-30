package com.p051p1.mobile.putong.core.p058ui.visitor;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import java.util.ArrayList;
import java.util.List;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.cfm0;
import p153l.ddc0;
import p153l.f9c0;
import p153l.gbc0;
import p153l.h80;
import p153l.i4g0;
import p153l.pec0;
import p153l.pf60;
import p153l.qa00;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.visitor.b */
/* JADX INFO: loaded from: classes12.dex */
public class C9209b extends AbstractC9208a {

    /* JADX INFO: renamed from: e */
    public List<cfm0> f38988e;

    /* JADX INFO: renamed from: f */
    public h80 f38989f;

    public C9209b(Act act, AbstractC9208a.a aVar, h80 h80Var) {
        super(act, aVar);
        this.f38988e = new ArrayList();
        this.f38989f = h80Var;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f38988e.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        if (i == 2) {
            return this.f38987d.inflater().inflate(pec0.f152004j2, viewGroup, false);
        }
        if (i != 3 && i != 4) {
            if (i == 1) {
                return this.f38987d.inflater().inflate(pec0.f151996h2, viewGroup, false);
            }
            VText vText = new VText(this.f38987d);
            vText.setTextColor(this.f38987d.getResources().getColor(f9c0.f97860e));
            vText.setTextSize(14.0f);
            vText.getPaint().setFakeBoldText(true);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, qa00.m175859d(44.0f));
            layoutParams.leftMargin = qa00.m175859d(16.0f);
            layoutParams.bottomMargin = qa00.m175859d(4.0f);
            vText.setLayoutParams(layoutParams);
            vText.setGravity(80);
            return vText;
        }
        LinearLayout linearLayout = new LinearLayout(this.f38987d);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.bottomMargin = qa00.m175859d(130.0f);
        layoutParams2.topMargin = qa00.m175859d(24.0f);
        if (i == 4) {
            layoutParams2.bottomMargin = qa00.m175859d(84.0f);
            layoutParams2.topMargin = qa00.m175859d(34.0f);
        }
        layoutParams2.gravity = 17;
        linearLayout.setGravity(17);
        linearLayout.setLayoutParams(layoutParams2);
        VImage vImage = new VImage(this.f38987d);
        vImage.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        vImage.setImageResource(gbc0.f103189Q5);
        bnl0.m105539W(vImage, qa00.m175859d(9.0f));
        VImage vImage2 = new VImage(this.f38987d);
        vImage2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        vImage2.setImageResource(gbc0.f103189Q5);
        bnl0.m105538V(vImage2, qa00.m175859d(9.0f));
        VText vText2 = new VText(this.f38987d);
        vText2.setTextColor(Color.parseColor("#d6d6d6"));
        vText2.setTextSize(13.0f);
        vText2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        vText2.setGravity(17);
        vText2.setId(ddc0.f87880J);
        linearLayout.addView(vImage);
        linearLayout.addView(vText2);
        linearLayout.addView(vImage2);
        return linearLayout;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.visitor.AbstractC9208a
    /* JADX INFO: renamed from: E */
    public void mo59047E(List<cfm0> list) {
        this.f38988e = list;
        notifyDataSetChanged();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, cfm0 cfm0Var, int i, int i2) {
        if (i == 2) {
            ((VisitorsUnPrivilegeView) view).m59041q(cfm0Var, i2, this.f38986c);
            return;
        }
        if (i == 3 || i == 4) {
            ((VText) view.findViewById(ddc0.f87880J)).setText(cfm0Var.f81528f);
            return;
        }
        if (i != 1) {
            if (i == 0) {
                ((VText) view).setText(cfm0Var.f81525c);
            }
        } else {
            VisitorsView visitorsView = (VisitorsView) view;
            visitorsView.m59046d(cfm0Var);
            this.f38989f.m133881h(view, cfm0Var, i2);
            m59053J(visitorsView, cfm0Var);
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m59051H(cfm0 cfm0Var) {
        i4g0.m138523u("e_moment_visitor_detail", "p_moment_visitor", pf60.m172085a("moment_visitor_type", cfm0Var.m109545a()), pf60.m172085a("owner_id", cfm0Var.f81524b.userId));
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public cfm0 getItem(int i) {
        return this.f38988e.get(i);
    }

    /* JADX INFO: renamed from: J */
    public final void m59053J(View view, final cfm0 cfm0Var) {
        bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.ot00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f148914a.m59054K(cfm0Var, view2);
            }
        });
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m59054K(cfm0 cfm0Var, View view) {
        m59051H(cfm0Var);
        this.f38987d.startActivity(CoreModule.m30933P().m143405a().mo34531jr(this.f38987d, cfm0Var.f81524b.userId, "moment_visitor", false));
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: e */
    public void mo48510e(int i) {
        this.f38986c.mo59048e(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        cfm0 item = getItem(i);
        if (item.m109546b()) {
            return 2;
        }
        if (TextUtils.isEmpty(item.f81528f)) {
            return item.m109547c() ? 1 : 0;
        }
        return item.f81529g ? 4 : 3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NonNull RecyclerView.AbstractC0569e0 abstractC0569e0) {
        super.onViewAttachedToWindow(abstractC0569e0);
        this.f38989f.m133880g(abstractC0569e0.itemView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(@NonNull RecyclerView.AbstractC0569e0 abstractC0569e0) {
        super.onViewDetachedFromWindow(abstractC0569e0);
        this.f38989f.m133882i(abstractC0569e0.itemView);
    }
}
