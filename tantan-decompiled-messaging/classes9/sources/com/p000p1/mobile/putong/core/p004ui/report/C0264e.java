package com.p000p1.mobile.putong.core.p004ui.report;

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
import com.p000p1.mobile.putong.core.R$string;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.data.Media;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import l.dac0;
import l.eqh0;
import l.i0g0;
import l.o7r;
import l.s7m;
import l.t100;
import l.tsm;
import l.vwb;
import l.zsc0;
import p006l.f6c0;
import p006l.qib0;
import p006l.w0c0;
import v.VButton;
import v.VDraweeView;
import v.VEditText;
import v.VRecycler_Fixed;
import v.VText;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.report.e */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C0264e implements s7m<C0263d> {

    /* JADX INFO: renamed from: a */
    public VText f5332a;

    /* JADX INFO: renamed from: b */
    public VText f5333b;

    /* JADX INFO: renamed from: c */
    public VRecycler_Fixed f5334c;

    /* JADX INFO: renamed from: d */
    public VEditText f5335d;

    /* JADX INFO: renamed from: e */
    public VText f5336e;

    /* JADX INFO: renamed from: f */
    public VButton f5337f;

    /* JADX INFO: renamed from: g */
    public final Context f5338g;

    /* JADX INFO: renamed from: h */
    public C0263d f5339h;

    /* JADX INFO: renamed from: i */
    public c f5340i;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.report.e$a */
    public class a extends RecyclerView.n {
        public a() {
        }

        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
            int iD = t100.d(8.0f);
            rect.set(iD, iD, iD, iD);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.report.e$b */
    public class b implements TextWatcher {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ReportCategory f5342a;

        public b(ReportCategory reportCategory) {
            this.f5342a = reportCategory;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            C0264e.this.f5336e.setText(editable.length() + "/100");
            if (!this.f5342a.isGP() || ((ReportAct) C0264e.this.act()).f5317h) {
                C0264e.this.f5337f.setEnabled(editable.length() >= 10 || this.f5342a.isCategorised());
            } else {
                C0264e c0264e = C0264e.this;
                c0264e.m8034i(c0264e.f5340i.f5344c, editable.toString());
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
        public final List<Media> f5344c = new ArrayList();

        public c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: L */
        public /* synthetic */ void m8044L(View view) {
            C0264e.this.f5339h.m8024q0();
        }

        /* JADX INFO: renamed from: C */
        public int m8046C() {
            return Math.min(this.f5344c.size() + 1, 8);
        }

        /* JADX INFO: renamed from: D */
        public View m8047D(ViewGroup viewGroup, int i) {
            LayoutInflater layoutInflaterA = o7r.a(viewGroup.getContext());
            if (i == 0) {
                View viewInflate = layoutInflaterA.inflate(f6c0.f11775Fe, viewGroup, false);
                viewInflate.setOnClickListener(new View.OnClickListener() { // from class: l.wsc0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f25381a.m8044L(view);
                    }
                });
                return viewInflate;
            }
            final View viewInflate2 = layoutInflaterA.inflate(f6c0.f11823Ie, viewGroup, false);
            viewInflate2.setOnClickListener(new View.OnClickListener() { // from class: l.xsc0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f27707a.m8052N(viewInflate2, view);
                }
            });
            viewInflate2.setLayerType(1, null);
            return viewInflate2;
        }

        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public void m8045A(View view, Media media, int i, int i2) {
            if (i == 1) {
                qib0.f19782G.m12776i0((VDraweeView) view, media.url);
            }
        }

        /* JADX INFO: renamed from: J */
        public void m8049J(List<Media> list) {
            int itemCount = getItemCount();
            this.f5344c.addAll(list);
            if (this.f5344c.size() < 8) {
                notifyItemRangeInserted(itemCount - 1, list.size());
            } else {
                notifyItemRangeInserted(itemCount - 1, 7 - itemCount);
                notifyItemChanged(7);
            }
        }

        /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
        public Media getItem(int i) {
            if (this.f5344c.size() > i) {
                return this.f5344c.get(i);
            }
            return null;
        }

        /* JADX INFO: renamed from: M */
        public final /* synthetic */ void m8051M(View view, Dialog dialog, View view2, int i, CharSequence charSequence) {
            int adapterPosition = C0264e.this.f5334c.findContainingViewHolder(view).getAdapterPosition();
            this.f5344c.remove(adapterPosition);
            C0264e.this.f5339h.m8017j0(adapterPosition);
            C0264e c0264e = C0264e.this;
            c0264e.m8034i(this.f5344c, c0264e.f5335d.getText().toString());
            if (adapterPosition == 7) {
                notifyItemChanged(7);
            } else {
                notifyItemRemoved(adapterPosition);
            }
        }

        /* JADX INFO: renamed from: N */
        public final /* synthetic */ void m8052N(final View view, View view2) {
            C0264e.this.act().dialog().e0(vwb.f0(new String[]{C0264e.this.act().string(R$string.f2611j)})).g0(new Dialog.g() { // from class: l.ysc0
                /* JADX INFO: renamed from: a */
                public final void m28389a(Dialog dialog, View view3, int i, CharSequence charSequence) {
                    this.f28371a.m8051M(view, dialog, view3, i, charSequence);
                }
            }).z0();
        }

        public int getItemViewType(int i) {
            return this.f5344c.size() > i ? 1 : 0;
        }
    }

    public C0264e(Context context) {
        this.f5338g = context;
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m8030C0() {
        return this.f5338g;
    }

    /* JADX INFO: renamed from: d */
    public View m8031d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return zsc0.b(this, layoutInflater, viewGroup);
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: e */
    public void m8032e(List<Media> list) {
        m8034i(list, this.f5335d.getText().toString());
        this.f5340i.m8049J(list);
    }

    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void m8035i1(C0263d c0263d) {
        this.f5339h = c0263d;
    }

    /* JADX INFO: renamed from: i */
    public void m8034i(List<Media> list, String str) {
        this.f5337f.setEnabled(str.replace(" ", "").length() >= 5 && !list.isEmpty());
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM8031d = m8031d(layoutInflater, viewGroup);
        this.f5333b.setText(i0g0.b0(act().string(R$string.f2481em), vwb.f0(new String[]{act().string(R$string.f2512fm)}), act().getResources().getColor(w0c0.f24622L), eqh0.c(2)));
        this.f5334c.setLayoutManager(new GridLayoutManager(this.f5338g, 4));
        this.f5334c.addItemDecoration(new a());
        VRecycler_Fixed vRecycler_Fixed = this.f5334c;
        c cVar = new c();
        this.f5340i = cVar;
        vRecycler_Fixed.setAdapter(cVar);
        this.f5336e.setText("0/100");
        return viewM8031d;
    }

    /* JADX INFO: renamed from: j */
    public final int m8036j(ReportCategory reportCategory) {
        if (!reportCategory.isGP() || ((ReportAct) act()).f5317h) {
            return reportCategory.isCategorised() ? R$string.f1997Ol : R$string.f2027Pl;
        }
        return R$string.f2057Ql;
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m8037k(View view) {
        this.f5339h.m8026s0(this.f5335d.getText().toString());
    }

    /* JADX INFO: renamed from: l */
    public void m8038l(ReportCategory reportCategory, boolean z) {
        this.f5332a.setText(act().string(reportCategory.resId));
        this.f5335d.setHint(m8036j(reportCategory));
        InputFilter[] filters = this.f5335d.getFilters();
        InputFilter[] inputFilterArr = filters == null ? new InputFilter[1] : (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
        inputFilterArr[inputFilterArr.length - 1] = tsm.a;
        this.f5335d.setFilters(inputFilterArr);
        this.f5335d.addTextChangedListener(new b(reportCategory));
        this.f5337f.setEnabled(z);
        this.f5337f.setOnClickListener(new View.OnClickListener() { // from class: l.vsc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f24444a.m8037k(view);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public String m8039m() {
        VEditText vEditText = this.f5335d;
        return vEditText == null ? "" : vEditText.getText().toString();
    }
}
