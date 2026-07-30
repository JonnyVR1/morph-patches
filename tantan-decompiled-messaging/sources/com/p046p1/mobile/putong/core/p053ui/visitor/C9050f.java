package com.p046p1.mobile.putong.core.p053ui.visitor;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.Act;
import java.util.ArrayList;
import java.util.List;
import p147v.VImage;
import p147v.VText;
import p149l.b3c0;
import p149l.k6c0;
import p149l.l80;
import p149l.t100;
import p149l.x4c0;
import p149l.xdl0;
import p149l.y5m0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.visitor.f */
/* JADX INFO: loaded from: classes9.dex */
public class C9050f extends AbstractC9045a {

    /* JADX INFO: renamed from: e */
    public List<y5m0> f38176e;

    /* JADX INFO: renamed from: f */
    public l80 f38177f;

    public C9050f(Act act, AbstractC9045a.a aVar, l80 l80Var) {
        super(act, aVar);
        this.f38176e = new ArrayList();
        this.f38177f = l80Var;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f38176e.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        if (i == 2) {
            return this.f38139d.inflater().inflate(k6c0.f121384g2, viewGroup, false);
        }
        if (i != 3) {
            if (i == 1) {
                return this.f38139d.inflater().inflate(k6c0.f121380f2, viewGroup, false);
            }
            VText vText = new VText(this.f38139d);
            vText.setTextColor(Color.parseColor("#66000000"));
            vText.setTextSize(15.0f);
            vText.getPaint().setFakeBoldText(true);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            int i2 = t100.f167261j;
            layoutParams.leftMargin = i2;
            layoutParams.topMargin = i2;
            vText.setLayoutParams(layoutParams);
            vText.setGravity(80);
            return vText;
        }
        LinearLayout linearLayout = new LinearLayout(this.f38139d);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.bottomMargin = t100.m186890d(130.0f);
        layoutParams2.topMargin = t100.m186890d(24.0f);
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
        this.f38176e = list;
        notifyDataSetChanged();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, y5m0 y5m0Var, int i, int i2) {
        if (i == 2) {
            ((VisitorsFlowNoPrivilegeItemView) view).m57841g(this.f38139d, y5m0Var, i2, this.f38138c);
            return;
        }
        if (i == 3) {
            ((VText) view.findViewById(x4c0.f190975J)).setText(y5m0Var.f196459f);
            return;
        }
        if (i == 1) {
            ((VisitorsFlowHasPrivilegeItemView) view).m57830c(this.f38139d, y5m0Var);
            this.f38177f.m148839h(view, y5m0Var, i2);
        } else if (i == 0) {
            ((VText) view).setText(y5m0Var.f196456c);
        }
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public y5m0 getItem(int i) {
        return this.f38176e.get(i);
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
        return 3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NonNull RecyclerView.AbstractC0566d0 abstractC0566d0) {
        super.onViewAttachedToWindow(abstractC0566d0);
        this.f38177f.m148838g(abstractC0566d0.itemView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(@NonNull RecyclerView.AbstractC0566d0 abstractC0566d0) {
        super.onViewDetachedFromWindow(abstractC0566d0);
        this.f38177f.m148840i(abstractC0566d0.itemView);
    }
}
