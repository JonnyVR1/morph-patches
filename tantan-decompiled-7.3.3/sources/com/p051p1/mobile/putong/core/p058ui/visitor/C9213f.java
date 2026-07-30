package com.p051p1.mobile.putong.core.p058ui.visitor;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Act;
import java.util.ArrayList;
import java.util.List;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.cfm0;
import p153l.ddc0;
import p153l.gbc0;
import p153l.h80;
import p153l.pec0;
import p153l.qa00;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.visitor.f */
/* JADX INFO: loaded from: classes12.dex */
public class C9213f extends AbstractC9208a {

    /* JADX INFO: renamed from: e */
    public List<cfm0> f39024e;

    /* JADX INFO: renamed from: f */
    public h80 f39025f;

    public C9213f(Act act, AbstractC9208a.a aVar, h80 h80Var) {
        super(act, aVar);
        this.f39024e = new ArrayList();
        this.f39025f = h80Var;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f39024e.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        if (i == 2) {
            return this.f38987d.inflater().inflate(pec0.f151992g2, viewGroup, false);
        }
        if (i != 3) {
            if (i == 1) {
                return this.f38987d.inflater().inflate(pec0.f151988f2, viewGroup, false);
            }
            VText vText = new VText(this.f38987d);
            vText.setTextColor(Color.parseColor("#66000000"));
            vText.setTextSize(15.0f);
            vText.getPaint().setFakeBoldText(true);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            int i2 = qa00.f156323j;
            layoutParams.leftMargin = i2;
            layoutParams.topMargin = i2;
            vText.setLayoutParams(layoutParams);
            vText.setGravity(80);
            return vText;
        }
        LinearLayout linearLayout = new LinearLayout(this.f38987d);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.bottomMargin = qa00.m175859d(130.0f);
        layoutParams2.topMargin = qa00.m175859d(24.0f);
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
        this.f39024e = list;
        notifyDataSetChanged();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, cfm0 cfm0Var, int i, int i2) {
        if (i == 2) {
            ((VisitorsFlowNoPrivilegeItemView) view).m59024g(this.f38987d, cfm0Var, i2, this.f38986c);
            return;
        }
        if (i == 3) {
            ((VText) view.findViewById(ddc0.f87880J)).setText(cfm0Var.f81528f);
            return;
        }
        if (i == 1) {
            ((VisitorsFlowHasPrivilegeItemView) view).m59013c(this.f38987d, cfm0Var);
            this.f39025f.m133881h(view, cfm0Var, i2);
        } else if (i == 0) {
            ((VText) view).setText(cfm0Var.f81525c);
        }
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public cfm0 getItem(int i) {
        return this.f39024e.get(i);
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
        return 3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NonNull RecyclerView.AbstractC0569e0 abstractC0569e0) {
        super.onViewAttachedToWindow(abstractC0569e0);
        this.f39025f.m133880g(abstractC0569e0.itemView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(@NonNull RecyclerView.AbstractC0569e0 abstractC0569e0) {
        super.onViewDetachedFromWindow(abstractC0569e0);
        this.f39025f.m133882i(abstractC0569e0.itemView);
    }
}
