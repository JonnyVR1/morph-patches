package com.p046p1.mobile.putong.core.p053ui.report;

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
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.data.Media;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VEditText;
import p147v.VRecycler_Fixed;
import p147v.VText;
import p149l.dac0;
import p149l.eqh0;
import p149l.f6c0;
import p149l.i0g0;
import p149l.o7r;
import p149l.qib0;
import p149l.s7m;
import p149l.t100;
import p149l.tsm;
import p149l.vwb;
import p149l.w0c0;
import p149l.zsc0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.report.e */
/* JADX INFO: loaded from: classes9.dex */
public class C8828e implements s7m<C8827d> {

    /* JADX INFO: renamed from: a */
    public VText f35551a;

    /* JADX INFO: renamed from: b */
    public VText f35552b;

    /* JADX INFO: renamed from: c */
    public VRecycler_Fixed f35553c;

    /* JADX INFO: renamed from: d */
    public VEditText f35554d;

    /* JADX INFO: renamed from: e */
    public VText f35555e;

    /* JADX INFO: renamed from: f */
    public VButton f35556f;

    /* JADX INFO: renamed from: g */
    public final Context f35557g;

    /* JADX INFO: renamed from: h */
    public C8827d f35558h;

    /* JADX INFO: renamed from: i */
    public c f35559i;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.report.e$a */
    public class a extends RecyclerView.AbstractC0576n {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0588z c0588z) {
            int iM186890d = t100.m186890d(8.0f);
            rect.set(iM186890d, iM186890d, iM186890d, iM186890d);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.report.e$b */
    public class b implements TextWatcher {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ReportCategory f35561a;

        public b(ReportCategory reportCategory) {
            this.f35561a = reportCategory;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            C8828e.this.f35555e.setText(editable.length() + "/100");
            if (!this.f35561a.isGP() || ((ReportAct) C8828e.this.act()).f35536h) {
                C8828e.this.f35556f.setEnabled(editable.length() >= 10 || this.f35561a.isCategorised());
            } else {
                C8828e c8828e = C8828e.this;
                c8828e.m54681i(c8828e.f35559i.f35563c, editable.toString());
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
    public class c extends dac0<Media> {

        /* JADX INFO: renamed from: c */
        public final List<Media> f35563c = new ArrayList();

        public c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: L */
        public /* synthetic */ void m54690L(View view) {
            C8828e.this.f35558h.m54672q0();
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: C */
        public int mo28824C() {
            return Math.min(this.f35563c.size() + 1, 8);
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: D */
        public View mo28825D(ViewGroup viewGroup, int i) {
            LayoutInflater layoutInflaterM163037a = o7r.m163037a(viewGroup.getContext());
            if (i == 0) {
                View viewInflate = layoutInflaterM163037a.inflate(f6c0.f95361Fe, viewGroup, false);
                viewInflate.setOnClickListener(new View.OnClickListener() { // from class: l.wsc0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f187913a.m54690L(view);
                    }
                });
                return viewInflate;
            }
            final View viewInflate2 = layoutInflaterM163037a.inflate(f6c0.f95409Ie, viewGroup, false);
            viewInflate2.setOnClickListener(new View.OnClickListener() { // from class: l.xsc0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f194224a.m54695N(viewInflate2, view);
                }
            });
            viewInflate2.setLayerType(1, null);
            return viewInflate2;
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public void mo28823A(View view, Media media, int i, int i2) {
            if (i == 1) {
                qib0.f154691G.m102363i0((VDraweeView) view, media.url);
            }
        }

        /* JADX INFO: renamed from: J */
        public void m54692J(List<Media> list) {
            int itemCount = getItemCount();
            this.f35563c.addAll(list);
            if (this.f35563c.size() < 8) {
                notifyItemRangeInserted(itemCount - 1, list.size());
            } else {
                notifyItemRangeInserted(itemCount - 1, 7 - itemCount);
                notifyItemChanged(7);
            }
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
        public Media getItem(int i) {
            if (this.f35563c.size() > i) {
                return this.f35563c.get(i);
            }
            return null;
        }

        /* JADX INFO: renamed from: M */
        public final /* synthetic */ void m54694M(View view, Dialog dialog, View view2, int i, CharSequence charSequence) {
            int adapterPosition = C8828e.this.f35553c.findContainingViewHolder(view).getAdapterPosition();
            this.f35563c.remove(adapterPosition);
            C8828e.this.f35558h.m54665j0(adapterPosition);
            C8828e c8828e = C8828e.this;
            c8828e.m54681i(this.f35563c, c8828e.f35554d.getText().toString());
            if (adapterPosition == 7) {
                notifyItemChanged(7);
            } else {
                notifyItemRemoved(adapterPosition);
            }
        }

        /* JADX INFO: renamed from: N */
        public final /* synthetic */ void m54695N(final View view, View view2) {
            C8828e.this.act().dialog().m20535e0(vwb.m200324f0(C8828e.this.act().string(R$string.f18622j))).m20537g0(new Dialog.InterfaceC4311g() { // from class: l.ysc0
                @Override // com.p046p1.mobile.android.app.Dialog.InterfaceC4311g
                /* JADX INFO: renamed from: a */
                public final void mo20569a(Dialog dialog, View view3, int i, CharSequence charSequence) {
                    this.f199760a.m54694M(view, dialog, view3, i, charSequence);
                }
            }).m20568z0();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            return this.f35563c.size() > i ? 1 : 0;
        }
    }

    public C8828e(Context context) {
        this.f35557g = context;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f35557g;
    }

    /* JADX INFO: renamed from: d */
    public View m54678d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return zsc0.m220001b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: e */
    public void m54679e(List<Media> list) {
        m54681i(list, this.f35554d.getText().toString());
        this.f35559i.m54692J(list);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(C8827d c8827d) {
        this.f35558h = c8827d;
    }

    /* JADX INFO: renamed from: i */
    public void m54681i(List<Media> list, String str) {
        this.f35556f.setEnabled(str.replace(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR, "").length() >= 5 && !list.isEmpty());
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM54678d = m54678d(layoutInflater, viewGroup);
        this.f35552b.setText(i0g0.m133861b0(act().string(R$string.f18492em), vwb.m200324f0(act().string(R$string.f18523fm)), act().getResources().getColor(w0c0.f183782L), eqh0.m117752c(2)));
        this.f35553c.setLayoutManager(new GridLayoutManager(this.f35557g, 4));
        this.f35553c.addItemDecoration(new a());
        VRecycler_Fixed vRecycler_Fixed = this.f35553c;
        c cVar = new c();
        this.f35559i = cVar;
        vRecycler_Fixed.setAdapter(cVar);
        this.f35555e.setText("0/100");
        return viewM54678d;
    }

    /* JADX INFO: renamed from: j */
    public final int m54682j(ReportCategory reportCategory) {
        if (!reportCategory.isGP() || ((ReportAct) act()).f35536h) {
            return reportCategory.isCategorised() ? R$string.f18008Ol : R$string.f18038Pl;
        }
        return R$string.f18068Ql;
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m54683k(View view) {
        this.f35558h.m54674s0(this.f35554d.getText().toString());
    }

    /* JADX INFO: renamed from: l */
    public void m54684l(ReportCategory reportCategory, boolean z) {
        this.f35551a.setText(act().string(reportCategory.resId));
        this.f35554d.setHint(m54682j(reportCategory));
        InputFilter[] filters = this.f35554d.getFilters();
        InputFilter[] inputFilterArr = filters == null ? new InputFilter[1] : (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
        inputFilterArr[inputFilterArr.length - 1] = tsm.f171944a;
        this.f35554d.setFilters(inputFilterArr);
        this.f35554d.addTextChangedListener(new b(reportCategory));
        this.f35556f.setEnabled(z);
        this.f35556f.setOnClickListener(new View.OnClickListener() { // from class: l.vsc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f182825a.m54683k(view);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public String m54685m() {
        VEditText vEditText = this.f35554d;
        return vEditText == null ? "" : vEditText.getText().toString();
    }
}
