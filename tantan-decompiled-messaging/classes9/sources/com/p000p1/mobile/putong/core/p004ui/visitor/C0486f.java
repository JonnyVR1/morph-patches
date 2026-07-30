package com.p000p1.mobile.putong.core.p004ui.visitor;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p1.mobile.android.app.Act;
import java.util.ArrayList;
import java.util.List;
import l.b3c0;
import l.k6c0;
import l.l80;
import l.t100;
import l.x4c0;
import l.xdl0;
import p006l.y5m0;
import v.VImage;
import v.VText;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.visitor.f */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C0486f extends AbstractC0481a {

    /* JADX INFO: renamed from: e */
    public List<y5m0> f7957e;

    /* JADX INFO: renamed from: f */
    public l80 f7958f;

    public C0486f(Act act, AbstractC0481a.a aVar, l80 l80Var) {
        super(act, aVar);
        this.f7957e = new ArrayList();
        this.f7958f = l80Var;
    }

    /* JADX INFO: renamed from: C */
    public int m11498C() {
        return this.f7957e.size();
    }

    /* JADX INFO: renamed from: D */
    public View m11499D(ViewGroup viewGroup, int i) {
        if (i == 2) {
            return this.f7920d.inflater().inflate(k6c0.g2, viewGroup, false);
        }
        if (i != 3) {
            if (i == 1) {
                return this.f7920d.inflater().inflate(k6c0.f2, viewGroup, false);
            }
            VText vText = new VText(this.f7920d);
            vText.setTextColor(Color.parseColor("#66000000"));
            vText.setTextSize(15.0f);
            vText.getPaint().setFakeBoldText(true);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            int i2 = t100.j;
            layoutParams.leftMargin = i2;
            layoutParams.topMargin = i2;
            vText.setLayoutParams(layoutParams);
            vText.setGravity(80);
            return vText;
        }
        LinearLayout linearLayout = new LinearLayout(this.f7920d);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.bottomMargin = t100.d(130.0f);
        layoutParams2.topMargin = t100.d(24.0f);
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
        this.f7957e = list;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void m11497A(View view, y5m0 y5m0Var, int i, int i2) {
        if (i == 2) {
            ((VisitorsFlowNoPrivilegeItemView) view).m11350g(this.f7920d, y5m0Var, i2, this.f7919c);
            return;
        }
        if (i == 3) {
            view.findViewById(x4c0.J).setText(y5m0Var.f28038f);
            return;
        }
        if (i == 1) {
            ((VisitorsFlowHasPrivilegeItemView) view).m11339c(this.f7920d, y5m0Var);
            this.f7958f.h(view, y5m0Var, i2);
        } else if (i == 0) {
            ((VText) view).setText(y5m0Var.f28035c);
        }
    }

    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public y5m0 getItem(int i) {
        return this.f7957e.get(i);
    }

    /* JADX INFO: renamed from: e */
    public void m11502e(int i) {
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
        return 3;
    }

    public void onViewAttachedToWindow(@NonNull RecyclerView.d0 d0Var) {
        super/*androidx.recyclerview.widget.RecyclerView.Adapter*/.onViewAttachedToWindow(d0Var);
        this.f7958f.g(d0Var.itemView);
    }

    public void onViewDetachedFromWindow(@NonNull RecyclerView.d0 d0Var) {
        super/*androidx.recyclerview.widget.RecyclerView.Adapter*/.onViewDetachedFromWindow(d0Var);
        this.f7958f.i(d0Var.itemView);
    }
}
