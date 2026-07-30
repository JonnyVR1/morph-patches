package p009l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import l.f6c0;
import l.qib0;
import l.u4c0;
import l.vwb;
import l.w9j;
import l.xdl0;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class cy0 extends RecyclerView.Adapter<RecyclerView.d0> {

    /* JADX INFO: renamed from: a */
    public py0 f10810a;

    /* JADX INFO: renamed from: l.cy0$a */
    public class C0834a extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a */
        public VDraweeView f10811a;

        public C0834a(View view) {
            super(view);
            this.f10811a = view.findViewById(u4c0.L5);
        }
    }

    /* JADX INFO: renamed from: l.cy0$b */
    public class C0835b extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a */
        public View f10813a;

        public C0835b(View view) {
            super(view);
            this.f10813a = view.findViewById(u4c0.s);
        }
    }

    public cy0(py0 py0Var) {
        this.f10810a = py0Var;
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m12873D(View view) {
        this.f10810a.act().pickImagesWithPicker(this.f10810a.m20761i() - this.f10810a.m20764l().f14856f.size(), true, false, false);
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m12874E(int i, Dialog dialog, View view, int i2, CharSequence charSequence) {
        this.f10810a.m20764l().f14856f.remove(i);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m12875F(final int i, View view) {
        this.f10810a.act().dialog().f0(new String[]{this.f10810a.act().getString(R.string.j)}).g0(new Dialog.g() { // from class: l.by0
            /* JADX INFO: renamed from: a */
            public final void m12322a(Dialog dialog, View view2, int i2, CharSequence charSequence) {
                this.f10351a.m12874E(i, dialog, view2, i2, charSequence);
            }
        }).z0();
    }

    public Object getItem(int i) {
        return i == this.f10810a.m20764l().f14856f.size() ? "add image" : this.f10810a.m20764l().f14856f.get(i);
    }

    public int getItemCount() {
        if (this.f10810a.m20764l().f14856f == null) {
            return 0;
        }
        return (this.f10810a.m20764l().f14856f.size() >= this.f10810a.m20761i() || vwb.m(this.f10810a.m20764l().f14856f, new w9j() { // from class: l.yx0
            public final Object call(Object obj) {
                Media media = (Media) obj;
                return Boolean.valueOf((media instanceof Picture) && media.isFromShoot());
            }
        })) ? this.f10810a.m20764l().f14856f.size() : this.f10810a.m20764l().f14856f.size() + 1;
    }

    public int getItemViewType(int i) {
        return getItem(i).equals("add image") ? 1 : 0;
    }

    public void onBindViewHolder(@NonNull RecyclerView.d0 d0Var, final int i) {
        if (d0Var instanceof C0835b) {
            xdl0.E0(((C0835b) d0Var).f10813a, new View.OnClickListener() { // from class: l.zx0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f24013a.m12873D(view);
                }
            });
            return;
        }
        if (d0Var instanceof C0834a) {
            VDraweeView vDraweeView = ((C0834a) d0Var).f10811a;
            vDraweeView.setOnClickListener(new View.OnClickListener() { // from class: l.ay0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f9764a.m12875F(i, view);
                }
            });
            qib0.G.o(vDraweeView);
            Object item = getItem(i);
            if (item instanceof Media) {
                qib0.G.m0(vDraweeView, ((Media) item).url);
            }
        }
    }

    @NonNull
    public RecyclerView.d0 onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        py0 py0Var = this.f10810a;
        return i == 0 ? new C0834a(py0Var.act().inflater().inflate(f6c0.I, viewGroup, false)) : new C0835b(py0Var.act().inflater().inflate(f6c0.H, viewGroup, false));
    }
}
