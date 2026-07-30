package com.p000p1.mobile.putong.core.p001ui.profile.exploop.inputitem;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.inputitem.ExpProfileLoopSelectTypeData;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType;
import com.p1.mobile.putong.core.ui.VText_Medium;
import java.util.ArrayList;
import l.dac0;
import l.e30;
import l.lsi0;
import l.t100;
import l.vwb;
import l.w9j;
import l.x2c0;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ExpProfileLoopSelectTypeFrag extends ExpProfileEditLoopBaseFrag {

    /* JADX INFO: renamed from: F */
    public RecyclerView f1173F;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.exploop.inputitem.ExpProfileLoopSelectTypeFrag$a */
    public static class C0078a extends dac0<ExpProfileLoopSelectTypeData.ItemData> {

        /* JADX INFO: renamed from: c */
        public final ExpProfileLoopSelectTypeFrag f1174c;

        /* JADX INFO: renamed from: d */
        public final ArrayList<ExpProfileLoopSelectTypeData.ItemData> f1175d;

        /* JADX INFO: renamed from: e */
        public final boolean f1176e;

        /* JADX INFO: renamed from: f */
        public final int f1177f;

        /* JADX INFO: renamed from: g */
        public String f1178g;

        public C0078a(ExpProfileLoopSelectTypeFrag expProfileLoopSelectTypeFrag, ExpLoopInputType expLoopInputType) {
            this.f1174c = expProfileLoopSelectTypeFrag;
            this.f1176e = 2 == expLoopInputType.inputContentType;
            this.f1177f = expLoopInputType.getData().getSelectType().count;
            this.f1178g = expLoopInputType.getData().getSelectType().text;
            this.f1175d = expLoopInputType.getData().getSelectType().list;
        }

        /* JADX INFO: renamed from: C */
        public int m1842C() {
            return this.f1175d.size();
        }

        /* JADX INFO: renamed from: D */
        public View m1843D(ViewGroup viewGroup, int i) {
            VText_Medium vText_Medium = new VText_Medium(viewGroup.getContext());
            vText_Medium.setBackgroundResource(x2c0.wr);
            vText_Medium.setGravity(17);
            RecyclerView.p pVar = new RecyclerView.p(xdl0.e, t100.E);
            ((ViewGroup.MarginLayoutParams) pVar).bottomMargin = t100.h;
            vText_Medium.setLayoutParams(pVar);
            return vText_Medium;
        }

        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public void m1841A(View view, final ExpProfileLoopSelectTypeData.ItemData itemData, int i, int i2) {
            if (view instanceof VText_Medium) {
                VText_Medium vText_Medium = (VText_Medium) view;
                vText_Medium.setText(itemData.text);
                vText_Medium.setTextSize(16.0f);
                vText_Medium.setTextColor(itemData.boolValue ? -1 : -16777216);
            }
            view.setSelected(itemData.boolValue);
            xdl0.E0(view, new View.OnClickListener() { // from class: l.hif
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f12048a.m1846J(itemData, view2);
                }
            });
        }

        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public ExpProfileLoopSelectTypeData.ItemData getItem(int i) {
            return this.f1175d.get(i);
        }

        /* JADX INFO: renamed from: J */
        public final /* synthetic */ void m1846J(ExpProfileLoopSelectTypeData.ItemData itemData, View view) {
            if (!this.f1176e) {
                vwb.z(this.f1175d, new e30() { // from class: l.jif
                    public final void call(Object obj) {
                        ((ExpProfileLoopSelectTypeData.ItemData) obj).boolValue = false;
                    }
                });
                itemData.boolValue = true;
                this.f1174c.m1698M4().m1686a2().m24655q0();
            } else {
                if (!itemData.boolValue && this.f1177f > 0 && vwb.f(this.f1175d, new w9j() { // from class: l.iif
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((ExpProfileLoopSelectTypeData.ItemData) obj).boolValue);
                    }
                }) >= this.f1177f) {
                    if (TextUtils.isEmpty(this.f1178g)) {
                        return;
                    }
                    lsi0.y(this.f1178g);
                    return;
                }
                itemData.boolValue = !itemData.boolValue;
                this.f1174c.m1704R4(true);
            }
            notifyDataSetChanged();
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: O4 */
    public View mo1701O4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        RecyclerView recyclerView = new RecyclerView(viewGroup.getContext());
        this.f1173F = recyclerView;
        return recyclerView;
    }

    /* JADX INFO: renamed from: f4 */
    public void m1836f4() {
        super.f4();
    }

    /* JADX INFO: renamed from: g4 */
    public void m1837g4(Bundle bundle) {
        super/*com.p1.mobile.android.app.Frag*/.g4(bundle);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        C0078a c0078a = new C0078a(this, this.f1101A);
        this.f1173F.setLayoutManager(linearLayoutManager);
        this.f1173F.setAdapter(c0078a);
        if (2 == this.f1101A.inputContentType) {
            m1698M4().m1691g2("(多选)");
        }
    }
}
