package com.p046p1.mobile.putong.core.p053ui.profile.exploop.inputitem;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.core.p053ui.VText_Medium;
import com.p046p1.mobile.putong.core.p053ui.profile.exploop.inputitem.ExpProfileLoopSelectTypeData;
import com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputType;
import java.util.ArrayList;
import p149l.dac0;
import p149l.e30;
import p149l.lsi0;
import p149l.t100;
import p149l.vwb;
import p149l.w9j;
import p149l.x2c0;
import p149l.xdl0;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes4.dex */
public class ExpProfileLoopSelectTypeFrag extends ExpProfileEditLoopBaseFrag {

    /* JADX INFO: renamed from: F */
    public RecyclerView f33351F;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.exploop.inputitem.ExpProfileLoopSelectTypeFrag$a */
    public static class C8653a extends dac0<ExpProfileLoopSelectTypeData.ItemData> {

        /* JADX INFO: renamed from: c */
        public final ExpProfileLoopSelectTypeFrag f33352c;

        /* JADX INFO: renamed from: d */
        public final ArrayList<ExpProfileLoopSelectTypeData.ItemData> f33353d;

        /* JADX INFO: renamed from: e */
        public final boolean f33354e;

        /* JADX INFO: renamed from: f */
        public final int f33355f;

        /* JADX INFO: renamed from: g */
        public String f33356g;

        public C8653a(ExpProfileLoopSelectTypeFrag expProfileLoopSelectTypeFrag, ExpLoopInputType expLoopInputType) {
            this.f33352c = expProfileLoopSelectTypeFrag;
            this.f33354e = 2 == expLoopInputType.inputContentType;
            this.f33355f = expLoopInputType.getData().getSelectType().count;
            this.f33356g = expLoopInputType.getData().getSelectType().text;
            this.f33353d = expLoopInputType.getData().getSelectType().list;
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: C */
        public int getPageCount() {
            return this.f33353d.size();
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: D */
        public View mo28825D(ViewGroup viewGroup, int i) {
            VText_Medium vText_Medium = new VText_Medium(viewGroup.getContext());
            vText_Medium.setBackgroundResource(x2c0.f190694wr);
            vText_Medium.setGravity(17);
            RecyclerView.C0578p c0578p = new RecyclerView.C0578p(xdl0.f192403e, t100.f167230E);
            ((ViewGroup.MarginLayoutParams) c0578p).bottomMargin = t100.f167259h;
            vText_Medium.setLayoutParams(c0578p);
            return vText_Medium;
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public void mo28823A(View view, final ExpProfileLoopSelectTypeData.ItemData itemData, int i, int i2) {
            if (view instanceof VText_Medium) {
                VText_Medium vText_Medium = (VText_Medium) view;
                vText_Medium.setText(itemData.text);
                vText_Medium.setTextSize(16.0f);
                vText_Medium.setTextColor(itemData.boolValue ? -1 : RoundedDrawable.DEFAULT_BORDER_COLOR);
            }
            view.setSelected(itemData.boolValue);
            xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.hif
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f107924a.m51366J(itemData, view2);
                }
            });
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public ExpProfileLoopSelectTypeData.ItemData getItem(int i) {
            return this.f33353d.get(i);
        }

        /* JADX INFO: renamed from: J */
        public final /* synthetic */ void m51366J(ExpProfileLoopSelectTypeData.ItemData itemData, View view) {
            if (!this.f33354e) {
                vwb.m200354z(this.f33353d, new e30() { // from class: l.jif
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        ((ExpProfileLoopSelectTypeData.ItemData) obj).boolValue = false;
                    }
                });
                itemData.boolValue = true;
                this.f33352c.m51243M4().m51231a2().m203205q0();
            } else {
                if (!itemData.boolValue && this.f33355f > 0 && vwb.m200323f(this.f33353d, new w9j() { // from class: l.iif
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((ExpProfileLoopSelectTypeData.ItemData) obj).boolValue);
                    }
                }) >= this.f33355f) {
                    if (TextUtils.isEmpty(this.f33356g)) {
                        return;
                    }
                    lsi0.m151595y(this.f33356g);
                    return;
                }
                itemData.boolValue = !itemData.boolValue;
                this.f33352c.m51249R4(true);
            }
            notifyDataSetChanged();
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: O4 */
    public View mo51246O4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        RecyclerView recyclerView = new RecyclerView(viewGroup.getContext());
        this.f33351F = recyclerView;
        return recyclerView;
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        C8653a c8653a = new C8653a(this, this.f33279A);
        this.f33351F.setLayoutManager(linearLayoutManager);
        this.f33351F.setAdapter(c8653a);
        if (2 == this.f33279A.inputContentType) {
            m51243M4().m51236g2("(多选)");
        }
    }
}
