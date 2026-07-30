package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes11.dex */
public class cy0 extends RecyclerView.Adapter<RecyclerView.AbstractC0566d0> {

    /* JADX INFO: renamed from: a */
    public py0 f82912a;

    /* JADX INFO: renamed from: l.cy0$a */
    public class C16272a extends RecyclerView.AbstractC0566d0 {

        /* JADX INFO: renamed from: a */
        public VDraweeView f82913a;

        public C16272a(View view) {
            super(view);
            this.f82913a = (VDraweeView) view.findViewById(u4c0.f173909L5);
        }
    }

    /* JADX INFO: renamed from: l.cy0$b */
    public class C16273b extends RecyclerView.AbstractC0566d0 {

        /* JADX INFO: renamed from: a */
        public View f82915a;

        public C16273b(View view) {
            super(view);
            this.f82915a = view.findViewById(u4c0.f174456s);
        }
    }

    public cy0(py0 py0Var) {
        this.f82912a = py0Var;
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m109126D(View view) {
        this.f82912a.getAct().pickImagesWithPicker(this.f82912a.m171979i() - this.f82912a.m171981l().f115418f.size(), true, false, false);
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m109127E(int i, Dialog dialog, View view, int i2, CharSequence charSequence) {
        this.f82912a.m171981l().f115418f.remove(i);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m109128F(final int i, View view) {
        this.f82912a.getAct().dialog().m20536f0(new String[]{this.f82912a.getAct().getString(R$string.f18622j)}).m20537g0(new Dialog.InterfaceC4311g() { // from class: l.by0
            @Override // com.p046p1.mobile.android.app.Dialog.InterfaceC4311g
            /* JADX INFO: renamed from: a */
            public final void mo20569a(Dialog dialog, View view2, int i2, CharSequence charSequence) {
                this.f77847a.m109127E(i, dialog, view2, i2, charSequence);
            }
        }).m20568z0();
    }

    public Object getItem(int i) {
        return i == this.f82912a.m171981l().f115418f.size() ? "add image" : this.f82912a.m171981l().f115418f.get(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (this.f82912a.m171981l().f115418f == null) {
            return 0;
        }
        return (this.f82912a.m171981l().f115418f.size() >= this.f82912a.m171979i() || vwb.m200337m(this.f82912a.m171981l().f115418f, new w9j() { // from class: l.yx0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                Media media = (Media) obj;
                return Boolean.valueOf((media instanceof Picture) && media.isFromShoot());
            }
        })) ? this.f82912a.m171981l().f115418f.size() : this.f82912a.m171981l().f115418f.size() + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return getItem(i).equals("add image") ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull RecyclerView.AbstractC0566d0 abstractC0566d0, final int i) {
        if (abstractC0566d0 instanceof C16273b) {
            xdl0.m208329E0(((C16273b) abstractC0566d0).f82915a, new View.OnClickListener() { // from class: l.zx0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f205370a.m109126D(view);
                }
            });
            return;
        }
        if (abstractC0566d0 instanceof C16272a) {
            VDraweeView vDraweeView = ((C16272a) abstractC0566d0).f82913a;
            vDraweeView.setOnClickListener(new View.OnClickListener() { // from class: l.ay0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f72245a.m109128F(i, view);
                }
            });
            qib0.f154691G.m184725o(vDraweeView);
            Object item = getItem(i);
            if (item instanceof Media) {
                qib0.f154691G.m102367m0(vDraweeView, ((Media) item).url);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public RecyclerView.AbstractC0566d0 onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        py0 py0Var = this.f82912a;
        return i == 0 ? new C16272a(py0Var.getAct().inflater().inflate(f6c0.f95394I, viewGroup, false)) : new C16273b(py0Var.getAct().inflater().inflate(f6c0.f95378H, viewGroup, false));
    }
}
