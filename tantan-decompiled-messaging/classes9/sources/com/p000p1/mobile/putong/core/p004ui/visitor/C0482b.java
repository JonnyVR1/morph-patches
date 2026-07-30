package com.p000p1.mobile.putong.core.p004ui.visitor;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.android.app.Act;
import java.util.ArrayList;
import java.util.List;
import l.b3c0;
import l.j760;
import l.k6c0;
import l.l80;
import l.t100;
import l.x4c0;
import l.xdl0;
import l.z0c0;
import l.zvf0;
import p006l.y5m0;
import v.VImage;
import v.VText;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.visitor.b */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C0482b extends AbstractC0481a {

    /* JADX INFO: renamed from: e */
    public List<y5m0> f7921e;

    /* JADX INFO: renamed from: f */
    public l80 f7922f;

    public C0482b(Act act, AbstractC0481a.a aVar, l80 l80Var) {
        super(act, aVar);
        this.f7921e = new ArrayList();
        this.f7922f = l80Var;
    }

    /* JADX INFO: renamed from: C */
    public int m11377C() {
        return this.f7921e.size();
    }

    /* JADX INFO: renamed from: D */
    public View m11378D(ViewGroup viewGroup, int i) {
        if (i == 2) {
            return this.f7920d.inflater().inflate(k6c0.j2, viewGroup, false);
        }
        if (i != 3 && i != 4) {
            if (i == 1) {
                return this.f7920d.inflater().inflate(k6c0.h2, viewGroup, false);
            }
            VText vText = new VText(this.f7920d);
            vText.setTextColor(this.f7920d.getResources().getColor(z0c0.e));
            vText.setTextSize(14.0f);
            vText.getPaint().setFakeBoldText(true);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, t100.d(44.0f));
            layoutParams.leftMargin = t100.d(16.0f);
            layoutParams.bottomMargin = t100.d(4.0f);
            vText.setLayoutParams(layoutParams);
            vText.setGravity(80);
            return vText;
        }
        LinearLayout linearLayout = new LinearLayout(this.f7920d);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.bottomMargin = t100.d(130.0f);
        layoutParams2.topMargin = t100.d(24.0f);
        if (i == 4) {
            layoutParams2.bottomMargin = t100.d(84.0f);
            layoutParams2.topMargin = t100.d(34.0f);
        }
        layoutParams2.gravity = 17;
        linearLayout.setGravity(17);
        linearLayout.setLayoutParams(layoutParams2);
        View vImage = new VImage(this.f7920d);
        vImage.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        vImage.setImageResource(b3c0.Q5);
        xdl0.W(vImage, t100.d(9.0f));
        View vImage2 = new VImage(this.f7920d);
        vImage2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        vImage2.setImageResource(b3c0.Q5);
        xdl0.V(vImage2, t100.d(9.0f));
        VText vText2 = new VText(this.f7920d);
        vText2.setTextColor(Color.parseColor("#d6d6d6"));
        vText2.setTextSize(13.0f);
        vText2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        vText2.setGravity(17);
        vText2.setId(x4c0.J);
        linearLayout.addView(vImage);
        linearLayout.addView(vText2);
        linearLayout.addView(vImage2);
        return linearLayout;
    }

    @Override // com.p000p1.mobile.putong.core.p004ui.visitor.AbstractC0481a
    /* JADX INFO: renamed from: E */
    public void mo11373E(List<y5m0> list) {
        this.f7921e = list;
        notifyDataSetChanged();
    }

    @Override // 
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void mo11376A(View view, y5m0 y5m0Var, int i, int i2) {
        if (i == 2) {
            ((VisitorsUnPrivilegeView) view).m11367q(y5m0Var, i2, this.f7919c);
            return;
        }
        if (i == 3 || i == 4) {
            view.findViewById(x4c0.J).setText(y5m0Var.f28038f);
            return;
        }
        if (i != 1) {
            if (i == 0) {
                ((VText) view).setText(y5m0Var.f28035c);
            }
        } else {
            VisitorsView visitorsView = (VisitorsView) view;
            visitorsView.m11372d(y5m0Var);
            this.f7922f.h(view, y5m0Var, i2);
            m11382J(visitorsView, y5m0Var);
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m11380H(y5m0 y5m0Var) {
        zvf0.u("e_moment_visitor_detail", "p_moment_visitor", new j760[]{j760.a("moment_visitor_type", y5m0Var.m28086a()), j760.a("owner_id", y5m0Var.f28034b.userId)});
    }

    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public y5m0 getItem(int i) {
        return this.f7921e.get(i);
    }

    /* JADX INFO: renamed from: J */
    public final void m11382J(View view, final y5m0 y5m0Var) {
        xdl0.E0(view, new View.OnClickListener() { // from class: l.fl00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f12750a.m11383K(y5m0Var, view2);
            }
        });
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m11383K(y5m0 y5m0Var, View view) {
        m11380H(y5m0Var);
        this.f7920d.startActivity(CoreModule.m1854P().m11706a().m5465jr(this.f7920d, y5m0Var.f28034b.userId, "moment_visitor", false));
    }

    /* JADX INFO: renamed from: e */
    public void m11384e(int i) {
        this.f7919c.mo11374e(i);
    }

    public long getItemId(int i) {
        return i;
    }

    public int getItemViewType(int i) {
        y5m0 item = getItem(i);
        if (item.m28087b()) {
            return 2;
        }
        if (TextUtils.isEmpty(item.f28038f)) {
            return item.m28088c() ? 1 : 0;
        }
        return item.f28039g ? 4 : 3;
    }

    public void onViewAttachedToWindow(@NonNull RecyclerView.d0 d0Var) {
        super/*androidx.recyclerview.widget.RecyclerView.Adapter*/.onViewAttachedToWindow(d0Var);
        this.f7922f.g(d0Var.itemView);
    }

    public void onViewDetachedFromWindow(@NonNull RecyclerView.d0 d0Var) {
        super/*androidx.recyclerview.widget.RecyclerView.Adapter*/.onViewDetachedFromWindow(d0Var);
        this.f7922f.i(d0Var.itemView);
    }
}
