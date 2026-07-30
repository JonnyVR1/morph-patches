package com.p051p1.mobile.putong.core.p058ui.profile.exploop.inputitem;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.core.p058ui.VText_Medium;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.inputitem.ExpProfileLoopSelectTypeData;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType;
import java.util.ArrayList;
import p153l.bnl0;
import p153l.dbc0;
import p153l.jic0;
import p153l.jyb;
import p153l.o1j0;
import p153l.qa00;
import p153l.qcj;
import p153l.y20;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes4.dex */
public class ExpProfileLoopSelectTypeFrag extends ExpProfileEditLoopBaseFrag {

    /* JADX INFO: renamed from: F */
    public RecyclerView f34199F;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.exploop.inputitem.ExpProfileLoopSelectTypeFrag$a */
    public static class C8816a extends jic0<ExpProfileLoopSelectTypeData.ItemData> {

        /* JADX INFO: renamed from: c */
        public final ExpProfileLoopSelectTypeFrag f34200c;

        /* JADX INFO: renamed from: d */
        public final ArrayList<ExpProfileLoopSelectTypeData.ItemData> f34201d;

        /* JADX INFO: renamed from: e */
        public final boolean f34202e;

        /* JADX INFO: renamed from: f */
        public final int f34203f;

        /* JADX INFO: renamed from: g */
        public String f34204g;

        public C8816a(ExpProfileLoopSelectTypeFrag expProfileLoopSelectTypeFrag, ExpLoopInputType expLoopInputType) {
            this.f34200c = expProfileLoopSelectTypeFrag;
            this.f34202e = 2 == expLoopInputType.inputContentType;
            this.f34203f = expLoopInputType.getData().getSelectType().count;
            this.f34204g = expLoopInputType.getData().getSelectType().text;
            this.f34201d = expLoopInputType.getData().getSelectType().list;
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: C */
        public int getPageCount() {
            return this.f34201d.size();
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: D */
        public View mo29824D(ViewGroup viewGroup, int i) {
            VText_Medium vText_Medium = new VText_Medium(viewGroup.getContext());
            vText_Medium.setBackgroundResource(dbc0.f87164ks);
            vText_Medium.setGravity(17);
            RecyclerView.C0580p c0580p = new RecyclerView.C0580p(bnl0.f77544e, qa00.f156292E);
            ((ViewGroup.MarginLayoutParams) c0580p).bottomMargin = qa00.f156321h;
            vText_Medium.setLayoutParams(c0580p);
            return vText_Medium;
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public void mo29822A(View view, final ExpProfileLoopSelectTypeData.ItemData itemData, int i, int i2) {
            if (view instanceof VText_Medium) {
                VText_Medium vText_Medium = (VText_Medium) view;
                vText_Medium.setText(itemData.text);
                vText_Medium.setTextSize(16.0f);
                vText_Medium.setTextColor(itemData.boolValue ? -1 : RoundedDrawable.DEFAULT_BORDER_COLOR);
            }
            view.setSelected(itemData.boolValue);
            bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.njf
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f142289a.m52549J(itemData, view2);
                }
            });
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public ExpProfileLoopSelectTypeData.ItemData getItem(int i) {
            return this.f34201d.get(i);
        }

        /* JADX INFO: renamed from: J */
        public final /* synthetic */ void m52549J(ExpProfileLoopSelectTypeData.ItemData itemData, View view) {
            if (!this.f34202e) {
                jyb.m147537z(this.f34201d, new y20() { // from class: l.pjf
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        ((ExpProfileLoopSelectTypeData.ItemData) obj).boolValue = false;
                    }
                });
                itemData.boolValue = true;
                this.f34200c.m52426M4().m52414b2().m110171q0();
            } else {
                if (!itemData.boolValue && this.f34203f > 0 && jyb.m147506f(this.f34201d, new qcj() { // from class: l.ojf
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((ExpProfileLoopSelectTypeData.ItemData) obj).boolValue);
                    }
                }) >= this.f34203f) {
                    if (TextUtils.isEmpty(this.f34204g)) {
                        return;
                    }
                    o1j0.m165651y(this.f34204g);
                    return;
                }
                itemData.boolValue = !itemData.boolValue;
                this.f34200c.m52432R4(true);
            }
            notifyDataSetChanged();
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: O4 */
    public View mo52429O4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        RecyclerView recyclerView = new RecyclerView(viewGroup.getContext());
        this.f34199F = recyclerView;
        return recyclerView;
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        C8816a c8816a = new C8816a(this, this.f34127A);
        this.f34199F.setLayoutManager(linearLayoutManager);
        this.f34199F.setAdapter(c8816a);
        if (2 == this.f34127A.inputContentType) {
            m52426M4().m52419h2("(多选)");
        }
    }
}
