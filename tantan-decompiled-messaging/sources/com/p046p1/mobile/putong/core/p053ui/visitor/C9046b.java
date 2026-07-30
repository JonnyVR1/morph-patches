package com.p046p1.mobile.putong.core.p053ui.visitor;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import java.util.ArrayList;
import java.util.List;
import p147v.VImage;
import p147v.VText;
import p149l.b3c0;
import p149l.j760;
import p149l.k6c0;
import p149l.l80;
import p149l.t100;
import p149l.x4c0;
import p149l.xdl0;
import p149l.y5m0;
import p149l.z0c0;
import p149l.zvf0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.visitor.b */
/* JADX INFO: loaded from: classes9.dex */
public class C9046b extends AbstractC9045a {

    /* JADX INFO: renamed from: e */
    public List<y5m0> f38140e;

    /* JADX INFO: renamed from: f */
    public l80 f38141f;

    public C9046b(Act act, AbstractC9045a.a aVar, l80 l80Var) {
        super(act, aVar);
        this.f38140e = new ArrayList();
        this.f38141f = l80Var;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f38140e.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        if (i == 2) {
            return this.f38139d.inflater().inflate(k6c0.f121396j2, viewGroup, false);
        }
        if (i != 3 && i != 4) {
            if (i == 1) {
                return this.f38139d.inflater().inflate(k6c0.f121388h2, viewGroup, false);
            }
            VText vText = new VText(this.f38139d);
            vText.setTextColor(this.f38139d.getResources().getColor(z0c0.f200977e));
            vText.setTextSize(14.0f);
            vText.getPaint().setFakeBoldText(true);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, t100.m186890d(44.0f));
            layoutParams.leftMargin = t100.m186890d(16.0f);
            layoutParams.bottomMargin = t100.m186890d(4.0f);
            vText.setLayoutParams(layoutParams);
            vText.setGravity(80);
            return vText;
        }
        LinearLayout linearLayout = new LinearLayout(this.f38139d);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.bottomMargin = t100.m186890d(130.0f);
        layoutParams2.topMargin = t100.m186890d(24.0f);
        if (i == 4) {
            layoutParams2.bottomMargin = t100.m186890d(84.0f);
            layoutParams2.topMargin = t100.m186890d(34.0f);
        }
        layoutParams2.gravity = 17;
        linearLayout.setGravity(17);
        linearLayout.setLayoutParams(layoutParams2);
        VImage vImage = new VImage(this.f38139d);
        vImage.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        vImage.setImageResource(b3c0.f72938Q5);
        xdl0.m208359W(vImage, t100.m186890d(9.0f));
        VImage vImage2 = new VImage(this.f38139d);
        vImage2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        vImage2.setImageResource(b3c0.f72938Q5);
        xdl0.m208358V(vImage2, t100.m186890d(9.0f));
        VText vText2 = new VText(this.f38139d);
        vText2.setTextColor(Color.parseColor("#d6d6d6"));
        vText2.setTextSize(13.0f);
        vText2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        vText2.setGravity(17);
        vText2.setId(x4c0.f190975J);
        linearLayout.addView(vImage);
        linearLayout.addView(vText2);
        linearLayout.addView(vImage2);
        return linearLayout;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.visitor.AbstractC9045a
    /* JADX INFO: renamed from: E */
    public void mo57864E(List<y5m0> list) {
        this.f38140e = list;
        notifyDataSetChanged();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, y5m0 y5m0Var, int i, int i2) {
        if (i == 2) {
            ((VisitorsUnPrivilegeView) view).m57858q(y5m0Var, i2, this.f38138c);
            return;
        }
        if (i == 3 || i == 4) {
            ((VText) view.findViewById(x4c0.f190975J)).setText(y5m0Var.f196459f);
            return;
        }
        if (i != 1) {
            if (i == 0) {
                ((VText) view).setText(y5m0Var.f196456c);
            }
        } else {
            VisitorsView visitorsView = (VisitorsView) view;
            visitorsView.m57863d(y5m0Var);
            this.f38141f.m148839h(view, y5m0Var, i2);
            m57870J(visitorsView, y5m0Var);
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m57868H(y5m0 y5m0Var) {
        zvf0.m220399u("e_moment_visitor_detail", "p_moment_visitor", j760.m140076a("moment_visitor_type", y5m0Var.m213001a()), j760.m140076a("owner_id", y5m0Var.f196455b.userId));
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public y5m0 getItem(int i) {
        return this.f38140e.get(i);
    }

    /* JADX INFO: renamed from: J */
    public final void m57870J(View view, final y5m0 y5m0Var) {
        xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.fl00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f98115a.m57871K(y5m0Var, view2);
            }
        });
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m57871K(y5m0 y5m0Var, View view) {
        m57868H(y5m0Var);
        this.f38139d.startActivity(CoreModule.m29935P().m94651a().mo33528jr(this.f38139d, y5m0Var.f196455b.userId, "moment_visitor", false));
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: e */
    public void mo47327e(int i) {
        this.f38138c.mo57865e(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        y5m0 item = getItem(i);
        if (item.m213002b()) {
            return 2;
        }
        if (TextUtils.isEmpty(item.f196459f)) {
            return item.m213003c() ? 1 : 0;
        }
        return item.f196460g ? 4 : 3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NonNull RecyclerView.AbstractC0566d0 abstractC0566d0) {
        super.onViewAttachedToWindow(abstractC0566d0);
        this.f38141f.m148838g(abstractC0566d0.itemView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(@NonNull RecyclerView.AbstractC0566d0 abstractC0566d0) {
        super.onViewDetachedFromWindow(abstractC0566d0);
        this.f38141f.m148840i(abstractC0566d0.itemView);
    }
}
