package p007l;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.data.Dimension;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.Picture;
import com.p000p1.mobile.putong.data.Video;
import com.p000p1.mobile.putong.feed.R$string;
import com.p1.mobile.android.app.Dialog;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Arrays;
import l.cwf0;
import l.e30;
import l.i0e;
import l.jo0;
import l.lsi0;
import l.mkd0;
import l.qib0;
import l.r5l0;
import l.rhi;
import l.s5l0;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.z3g0;
import rx.c;
import v.VDraweeView;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class kjm extends RecyclerView.Adapter<RecyclerView.d0> {

    /* JADX INFO: renamed from: a */
    public cg4 f9732a;

    /* JADX INFO: renamed from: l.kjm$a */
    public class C2410a extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a */
        public VDraweeView f9733a;

        /* JADX INFO: renamed from: b */
        public VImage f9734b;

        /* JADX INFO: renamed from: c */
        public View f9735c;

        public C2410a(View view) {
            super(view);
            this.f9733a = view.findViewById(b5c0.f6070m0);
            this.f9734b = view.findViewById(b5c0.f6083q1);
            this.f9735c = view.findViewById(b5c0.f5966H0);
        }
    }

    /* JADX INFO: renamed from: l.kjm$b */
    public class C2411b extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a */
        public View f9737a;

        public C2411b(View view) {
            super(view);
            this.f9737a = view.findViewById(b5c0.f6022a);
        }
    }

    public kjm(cg4 cg4Var) {
        this.f9732a = cg4Var;
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m11477D(RecyclerView.d0 d0Var, VDraweeView vDraweeView, Video video) {
        if (NullChecker.a(video.cover) && NullChecker.a(video.cover.url)) {
            C2410a c2410a = (C2410a) d0Var;
            xdl0.M0(c2410a.f9734b, true);
            xdl0.M0(c2410a.f9735c, false);
            qib0.G.m0(vDraweeView, video.cover.url);
        } else {
            C2410a c2410a2 = (C2410a) d0Var;
            xdl0.M0(c2410a2.f9734b, false);
            xdl0.M0(c2410a2.f9735c, true);
        }
        ((C2410a) d0Var).f9734b.setImageResource(f3c0.f7701S1);
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m11478E(Object obj, z3g0 z3g0Var) {
        Video video = (Video) obj;
        z3g0Var.onNext(video);
        s5l0 s5l0Var = new s5l0(new r5l0(rhi.z(video.url)), false, false);
        Picture picture = video.cover;
        if (picture == null || TextUtils.isEmpty(picture.url)) {
            Picture picture2 = new Picture();
            video.cover = picture2;
            picture2.url = rhi.B(s5l0Var.c(0));
            video.cover.size = new Dimension(s5l0Var.k());
            video.cover.mediaType = "image/jpeg";
            qib0.G.x0(video.url);
        }
        z3g0Var.onNext(video);
        z3g0Var.onCompleted();
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m11485J(Dialog dialog, View view, int i, CharSequence charSequence) {
        if (i == 0) {
            this.f9732a.act().pickImagesWithPicker(9 - this.f9732a.m9150J().f12901a.size(), true, false, false);
        } else {
            if (i != 1) {
                return;
            }
            this.f9732a.act().pickImagesWithPicker(0, true, true, false);
        }
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m11486K(View view) {
        if (this.f9732a.m9150J().f12901a.size() > 0) {
            this.f9732a.act().pickImagesWithPicker(9 - this.f9732a.m9150J().f12901a.size(), true, false, false);
            return;
        }
        final cwf0 cwf0VarC = i0e.c("p_moment_type_selection_pop", Dialog.class.getName());
        i0e.f(cwf0VarC);
        this.f9732a.act().dialog().e0(Arrays.asList(this.f9732a.act().getString(R$string.f441T4), this.f9732a.act().getString(R$string.f447U4))).g0(new Dialog.g() { // from class: l.ijm
            /* JADX INFO: renamed from: a */
            public final void m10958a(Dialog dialog, View view2, int i, CharSequence charSequence) {
                this.f9045a.m11485J(dialog, view2, i, charSequence);
            }
        }).V(new DialogInterface.OnDismissListener() { // from class: l.jjm
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.e(cwf0VarC);
            }
        }).z0();
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m11487L(int i, Dialog dialog, View view, int i2, CharSequence charSequence) {
        this.f9732a.m9150J().f12901a.remove(i);
        notifyDataSetChanged();
        this.f9732a.m9155O();
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m11488M(final int i, View view) {
        this.f9732a.act().dialog().f0(new String[]{this.f9732a.act().getString(R$string.f513f)}).g0(new Dialog.g() { // from class: l.hjm
            /* JADX INFO: renamed from: a */
            public final void m10646a(Dialog dialog, View view2, int i2, CharSequence charSequence) {
                this.f8754a.m11487L(i, dialog, view2, i2, charSequence);
            }
        }).z0();
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m11489N(RecyclerView.d0 d0Var, Object obj, Throwable th) {
        lsi0.h(R$string.f607s4);
        C2410a c2410a = (C2410a) d0Var;
        xdl0.M0(c2410a.f9734b, true);
        xdl0.M0(c2410a.f9735c, false);
        c2410a.f9734b.setImageResource(f3c0.f7810g6);
        if (this.f9732a.m9150J().f12901a.remove(obj)) {
            notifyDataSetChanged();
            this.f9732a.m9155O();
        }
    }

    /* JADX INFO: renamed from: O */
    public void m11490O(ArrayList<Media> arrayList) {
        if (!NullChecker.a(arrayList) || arrayList.size() <= 0) {
            return;
        }
        this.f9732a.m9150J().f12901a.addAll(arrayList);
        notifyDataSetChanged();
    }

    public Object getItem(int i) {
        return i == this.f9732a.m9150J().f12901a.size() ? "add image" : this.f9732a.m9150J().f12901a.get(i);
    }

    public int getItemCount() {
        if (this.f9732a.m9150J().f12901a == null) {
            return 0;
        }
        return (this.f9732a.m9150J().f12901a.size() >= 9 || vwb.m(this.f9732a.m9150J().f12901a, new w9j() { // from class: l.ajm
            public final Object call(Object obj) {
                return Boolean.valueOf(((Media) obj) instanceof Video);
            }
        }) || vwb.m(this.f9732a.m9150J().f12901a, new w9j() { // from class: l.bjm
            public final Object call(Object obj) {
                Media media = (Media) obj;
                return Boolean.valueOf((media instanceof Picture) && media.isFromShoot());
            }
        })) ? this.f9732a.m9150J().f12901a.size() : this.f9732a.m9150J().f12901a.size() + 1;
    }

    public int getItemViewType(int i) {
        if (getItem(i).equals("add image")) {
            return 1;
        }
        return getItem(i) instanceof Video ? 2 : 0;
    }

    public void onBindViewHolder(final RecyclerView.d0 d0Var, final int i) {
        if (d0Var instanceof C2411b) {
            ((C2411b) d0Var).f9737a.setOnClickListener(new View.OnClickListener() { // from class: l.cjm
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f6660a.m11486K(view);
                }
            });
            return;
        }
        final VDraweeView vDraweeView = ((C2410a) d0Var).f9733a;
        vDraweeView.setOnClickListener(new View.OnClickListener() { // from class: l.djm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6966a.m11488M(i, view);
            }
        });
        qib0.G.o(vDraweeView);
        final Object item = getItem(i);
        if (item instanceof Media) {
            if (item instanceof Video) {
                this.f9732a.act().duringCreated(c.create(new c.a() { // from class: l.ejm
                    public final void call(Object obj) {
                        kjm.m11478E(item, (z3g0) obj);
                    }
                }).compose(mkd0.P()), false).observeOn(jo0.a()).subscribe(mkd0.H(new e30() { // from class: l.fjm
                    public final void call(Object obj) {
                        kjm.m11477D(d0Var, vDraweeView, (Video) obj);
                    }
                }, new e30() { // from class: l.gjm
                    public final void call(Object obj) {
                        this.f8468a.m11489N(d0Var, item, (Throwable) obj);
                    }
                }));
            } else {
                qib0.G.m0(vDraweeView, ((Media) item).url);
            }
        }
    }

    public RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new C2411b(this.f9732a.act().inflater().inflate(o6c0.f11246k4, viewGroup, false));
        }
        cg4 cg4Var = this.f9732a;
        return i == 2 ? new C2410a(cg4Var.act().inflater().inflate(o6c0.f11274o4, viewGroup, false)) : new C2410a(cg4Var.act().inflater().inflate(o6c0.f11253l4, viewGroup, false));
    }
}
