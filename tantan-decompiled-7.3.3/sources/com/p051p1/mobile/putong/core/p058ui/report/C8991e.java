package com.p051p1.mobile.putong.core.p058ui.report;

import android.content.Context;
import android.graphics.Rect;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.data.Media;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VEditText;
import p151v.VRecycler_Fixed;
import p151v.VText;
import p153l.c9c0;
import p153l.e1d0;
import p153l.iam;
import p153l.jic0;
import p153l.jyb;
import p153l.kec0;
import p153l.lyh0;
import p153l.p9r;
import p153l.q8g0;
import p153l.qa00;
import p153l.uqb0;
import p153l.vum;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.report.e */
/* JADX INFO: loaded from: classes12.dex */
public class C8991e implements iam<C8990d> {

    /* JADX INFO: renamed from: a */
    public VText f36399a;

    /* JADX INFO: renamed from: b */
    public VText f36400b;

    /* JADX INFO: renamed from: c */
    public VRecycler_Fixed f36401c;

    /* JADX INFO: renamed from: d */
    public VEditText f36402d;

    /* JADX INFO: renamed from: e */
    public VText f36403e;

    /* JADX INFO: renamed from: f */
    public VButton f36404f;

    /* JADX INFO: renamed from: g */
    public final Context f36405g;

    /* JADX INFO: renamed from: h */
    public C8990d f36406h;

    /* JADX INFO: renamed from: i */
    public c f36407i;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.report.e$a */
    public class a extends RecyclerView.AbstractC0578n {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0561a0 c0561a0) {
            int iM175859d = qa00.m175859d(8.0f);
            rect.set(iM175859d, iM175859d, iM175859d, iM175859d);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.report.e$b */
    public class b implements TextWatcher {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ReportCategory f36409a;

        public b(ReportCategory reportCategory) {
            this.f36409a = reportCategory;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            C8991e.this.f36403e.setText(editable.length() + "/100");
            if (!this.f36409a.isGP() || ((ReportAct) C8991e.this.act()).f36384h) {
                C8991e.this.f36404f.setEnabled(editable.length() >= 10 || this.f36409a.isCategorised());
            } else {
                C8991e c8991e = C8991e.this;
                c8991e.m55864i(c8991e.f36407i.f36411c, editable.toString());
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.report.e$c */
    public class c extends jic0<Media> {

        /* JADX INFO: renamed from: c */
        public final List<Media> f36411c = new ArrayList();

        public c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: L */
        public /* synthetic */ void m55873L(View view) {
            C8991e.this.f36406h.m55855q0();
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: C */
        public int mo29823C() {
            return Math.min(this.f36411c.size() + 1, 8);
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: D */
        public View mo29824D(ViewGroup viewGroup, int i) {
            LayoutInflater layoutInflaterM171370a = p9r.m171370a(viewGroup.getContext());
            if (i == 0) {
                View viewInflate = layoutInflaterM171370a.inflate(kec0.f125527Me, viewGroup, false);
                viewInflate.setOnClickListener(new View.OnClickListener() { // from class: l.b1d0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f74366a.m55873L(view);
                    }
                });
                return viewInflate;
            }
            final View viewInflate2 = layoutInflaterM171370a.inflate(kec0.f125575Pe, viewGroup, false);
            viewInflate2.setOnClickListener(new View.OnClickListener() { // from class: l.c1d0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f79388a.m55878N(viewInflate2, view);
                }
            });
            viewInflate2.setLayerType(1, null);
            return viewInflate2;
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public void mo29822A(View view, Media media, int i, int i2) {
            if (i == 1) {
                uqb0.f180374G.m127146i0((VDraweeView) view, media.url);
            }
        }

        /* JADX INFO: renamed from: J */
        public void m55875J(List<Media> list) {
            int itemCount = getItemCount();
            this.f36411c.addAll(list);
            if (this.f36411c.size() < 8) {
                notifyItemRangeInserted(itemCount - 1, list.size());
            } else {
                notifyItemRangeInserted(itemCount - 1, 7 - itemCount);
                notifyItemChanged(7);
            }
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
        public Media getItem(int i) {
            if (this.f36411c.size() > i) {
                return this.f36411c.get(i);
            }
            return null;
        }

        /* JADX INFO: renamed from: M */
        public final /* synthetic */ void m55877M(View view, Dialog dialog, View view2, int i, CharSequence charSequence) {
            int adapterPosition = C8991e.this.f36401c.findContainingViewHolder(view).getAdapterPosition();
            this.f36411c.remove(adapterPosition);
            C8991e.this.f36406h.m55848j0(adapterPosition);
            C8991e c8991e = C8991e.this;
            c8991e.m55864i(this.f36411c, c8991e.f36402d.getText().toString());
            if (adapterPosition == 7) {
                notifyItemChanged(7);
            } else {
                notifyItemRemoved(adapterPosition);
            }
        }

        /* JADX INFO: renamed from: N */
        public final /* synthetic */ void m55878N(final View view, View view2) {
            C8991e.this.act().dialog().m21534e0(jyb.m147507f0(C8991e.this.act().string(R$string.f19352j))).m21536g0(new Dialog.InterfaceC4462g() { // from class: l.d1d0
                @Override // com.p051p1.mobile.android.app.Dialog.InterfaceC4462g
                /* JADX INFO: renamed from: a */
                public final void mo21568a(Dialog dialog, View view3, int i, CharSequence charSequence) {
                    this.f84665a.m55877M(view, dialog, view3, i, charSequence);
                }
            }).m21567z0();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            return this.f36411c.size() > i ? 1 : 0;
        }
    }

    public C8991e(Context context) {
        this.f36405g = context;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f36405g;
    }

    /* JADX INFO: renamed from: d */
    public View m55861d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return e1d0.m118969b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: e */
    public void m55862e(List<Media> list) {
        m55864i(list, this.f36402d.getText().toString());
        this.f36407i.m55875J(list);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(C8990d c8990d) {
        this.f36406h = c8990d;
    }

    /* JADX INFO: renamed from: i */
    public void m55864i(List<Media> list, String str) {
        this.f36404f.setEnabled(str.replace(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR, "").length() >= 5 && !list.isEmpty());
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM55861d = m55861d(layoutInflater, viewGroup);
        this.f36400b.setText(q8g0.m175796b0(act().string(R$string.f18308Am), jyb.m147507f0(act().string(R$string.f18339Bm)), act().getResources().getColor(c9c0.f80351L), lyh0.m156283c(2)));
        this.f36401c.setLayoutManager(new GridLayoutManager(this.f36405g, 4));
        this.f36401c.addItemDecoration(new a());
        VRecycler_Fixed vRecycler_Fixed = this.f36401c;
        c cVar = new c();
        this.f36407i = cVar;
        vRecycler_Fixed.setAdapter(cVar);
        this.f36403e.setText("0/100");
        return viewM55861d;
    }

    /* JADX INFO: renamed from: j */
    public final int m55865j(ReportCategory reportCategory) {
        if (!reportCategory.isGP() || ((ReportAct) act()).f36384h) {
            return reportCategory.isCategorised() ? R$string.f19406km : R$string.f19437lm;
        }
        return R$string.f19468mm;
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m55866k(View view) {
        this.f36406h.m55857s0(this.f36402d.getText().toString());
    }

    /* JADX INFO: renamed from: l */
    public void m55867l(ReportCategory reportCategory, boolean z) {
        this.f36399a.setText(act().string(reportCategory.resId));
        this.f36402d.setHint(m55865j(reportCategory));
        InputFilter[] filters = this.f36402d.getFilters();
        InputFilter[] inputFilterArr = filters == null ? new InputFilter[1] : (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
        inputFilterArr[inputFilterArr.length - 1] = vum.f185823a;
        this.f36402d.setFilters(inputFilterArr);
        this.f36402d.addTextChangedListener(new b(reportCategory));
        this.f36404f.setEnabled(z);
        this.f36404f.setOnClickListener(new View.OnClickListener() { // from class: l.a1d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f67806a.m55866k(view);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public String m55868m() {
        VEditText vEditText = this.f36402d;
        return vEditText == null ? "" : vEditText.getText().toString();
    }
}
