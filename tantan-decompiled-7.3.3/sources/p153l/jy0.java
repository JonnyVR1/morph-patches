package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes11.dex */
public class jy0 extends RecyclerView.Adapter<RecyclerView.AbstractC0569e0> {

    /* JADX INFO: renamed from: a */
    public wy0 f123101a;

    /* JADX INFO: renamed from: l.jy0$a */
    public class C18057a extends RecyclerView.AbstractC0569e0 {

        /* JADX INFO: renamed from: a */
        public VDraweeView f123102a;

        public C18057a(View view) {
            super(view);
            this.f123102a = (VDraweeView) view.findViewById(adc0.f70031N5);
        }
    }

    /* JADX INFO: renamed from: l.jy0$b */
    public class C18058b extends RecyclerView.AbstractC0569e0 {

        /* JADX INFO: renamed from: a */
        public View f123104a;

        public C18058b(View view) {
            super(view);
            this.f123104a = view.findViewById(adc0.f70547s);
        }
    }

    public jy0(wy0 wy0Var) {
        this.f123101a = wy0Var;
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m147459D(View view) {
        this.f123101a.getAct().pickImagesWithPicker(this.f123101a.m208471i() - this.f123101a.m208473l().f154612f.size(), true, false, false);
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m147460E(int i, Dialog dialog, View view, int i2, CharSequence charSequence) {
        this.f123101a.m208473l().f154612f.remove(i);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m147461F(final int i, View view) {
        this.f123101a.getAct().dialog().m21535f0(new String[]{this.f123101a.getAct().getString(R$string.f19352j)}).m21536g0(new Dialog.InterfaceC4462g() { // from class: l.iy0
            @Override // com.p051p1.mobile.android.app.Dialog.InterfaceC4462g
            /* JADX INFO: renamed from: a */
            public final void mo21568a(Dialog dialog, View view2, int i2, CharSequence charSequence) {
                this.f117489a.m147460E(i, dialog, view2, i2, charSequence);
            }
        }).m21567z0();
    }

    public Object getItem(int i) {
        return i == this.f123101a.m208473l().f154612f.size() ? "add image" : this.f123101a.m208473l().f154612f.get(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (this.f123101a.m208473l().f154612f == null) {
            return 0;
        }
        return (this.f123101a.m208473l().f154612f.size() >= this.f123101a.m208471i() || jyb.m147520m(this.f123101a.m208473l().f154612f, new qcj() { // from class: l.fy0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                Media media = (Media) obj;
                return Boolean.valueOf((media instanceof Picture) && media.isFromShoot());
            }
        })) ? this.f123101a.m208473l().f154612f.size() : this.f123101a.m208473l().f154612f.size() + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return getItem(i).equals("add image") ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull RecyclerView.AbstractC0569e0 abstractC0569e0, final int i) {
        if (abstractC0569e0 instanceof C18058b) {
            bnl0.m105509E0(((C18058b) abstractC0569e0).f123104a, new View.OnClickListener() { // from class: l.gy0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f107020a.m147459D(view);
                }
            });
            return;
        }
        if (abstractC0569e0 instanceof C18057a) {
            VDraweeView vDraweeView = ((C18057a) abstractC0569e0).f123102a;
            vDraweeView.setOnClickListener(new View.OnClickListener() { // from class: l.hy0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f112086a.m147461F(i, view);
                }
            });
            uqb0.f180374G.m98798o(vDraweeView);
            Object item = getItem(i);
            if (item instanceof Media) {
                uqb0.f180374G.m127150m0(vDraweeView, ((Media) item).url);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public RecyclerView.AbstractC0569e0 onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        wy0 wy0Var = this.f123101a;
        return i == 0 ? new C18057a(wy0Var.getAct().inflater().inflate(kec0.f125448I, viewGroup, false)) : new C18058b(wy0Var.getAct().inflater().inflate(kec0.f125432H, viewGroup, false));
    }
}
