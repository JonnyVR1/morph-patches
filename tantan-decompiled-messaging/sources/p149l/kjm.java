package p149l;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.data.Dimension;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.feed.R$string;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Arrays;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import p133rx.C22306c;
import p147v.VDraweeView;
import p147v.VImage;

/* JADX INFO: loaded from: classes12.dex */
public class kjm extends RecyclerView.Adapter<RecyclerView.AbstractC0566d0> {

    /* JADX INFO: renamed from: a */
    public cg4 f123482a;

    /* JADX INFO: renamed from: l.kjm$a */
    public class C18036a extends RecyclerView.AbstractC0566d0 {

        /* JADX INFO: renamed from: a */
        public VDraweeView f123483a;

        /* JADX INFO: renamed from: b */
        public VImage f123484b;

        /* JADX INFO: renamed from: c */
        public View f123485c;

        public C18036a(View view) {
            super(view);
            this.f123483a = (VDraweeView) view.findViewById(b5c0.f73589m0);
            this.f123484b = (VImage) view.findViewById(b5c0.f73602q1);
            this.f123485c = view.findViewById(b5c0.f73485H0);
        }
    }

    /* JADX INFO: renamed from: l.kjm$b */
    public class C18037b extends RecyclerView.AbstractC0566d0 {

        /* JADX INFO: renamed from: a */
        public View f123487a;

        public C18037b(View view) {
            super(view);
            this.f123487a = view.findViewById(b5c0.f73541a);
        }
    }

    public kjm(cg4 cg4Var) {
        this.f123482a = cg4Var;
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m146262D(RecyclerView.AbstractC0566d0 abstractC0566d0, VDraweeView vDraweeView, Video video) {
        if (NullChecker.m81303a(video.cover) && NullChecker.m81303a(video.cover.url)) {
            C18036a c18036a = (C18036a) abstractC0566d0;
            xdl0.m208345M0(c18036a.f123484b, true);
            xdl0.m208345M0(c18036a.f123485c, false);
            qib0.f154691G.m102367m0(vDraweeView, video.cover.url);
        } else {
            C18036a c18036a2 = (C18036a) abstractC0566d0;
            xdl0.m208345M0(c18036a2.f123484b, false);
            xdl0.m208345M0(c18036a2.f123485c, true);
        }
        ((C18036a) abstractC0566d0).f123484b.setImageResource(f3c0.f94418S1);
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m146263E(Object obj, z3g0 z3g0Var) {
        Video video = (Video) obj;
        z3g0Var.m132487l(video);
        s5l0 s5l0Var = new s5l0(new r5l0(rhi.m179382z(video.url)), false, false);
        Picture picture = video.cover;
        if (picture == null || TextUtils.isEmpty(picture.url)) {
            Picture picture2 = new Picture();
            video.cover = picture2;
            picture2.url = rhi.m179355B(s5l0Var.m182356c(0));
            video.cover.size = new Dimension(s5l0Var.m182362k());
            video.cover.mediaType = DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG;
            qib0.f154691G.m102377x0(video.url);
        }
        z3g0Var.m132487l(video);
        z3g0Var.onCompleted();
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m146270J(Dialog dialog, View view, int i, CharSequence charSequence) {
        if (i == 0) {
            this.f123482a.getAct().pickImagesWithPicker(9 - this.f123482a.m106676J().f164198a.size(), true, false, false);
        } else {
            if (i != 1) {
                return;
            }
            this.f123482a.getAct().pickImagesWithPicker(0, true, true, false);
        }
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m146271K(View view) {
        if (this.f123482a.m106676J().f164198a.size() > 0) {
            this.f123482a.getAct().pickImagesWithPicker(9 - this.f123482a.m106676J().f164198a.size(), true, false, false);
            return;
        }
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_moment_type_selection_pop", Dialog.class.getName());
        i0e.m133797f(cwf0VarM133794c);
        this.f123482a.getAct().dialog().m20535e0(Arrays.asList(this.f123482a.getAct().getString(R$string.f38980T4), this.f123482a.getAct().getString(R$string.f38986U4))).m20537g0(new Dialog.InterfaceC4311g() { // from class: l.ijm
            @Override // com.p046p1.mobile.android.app.Dialog.InterfaceC4311g
            /* JADX INFO: renamed from: a */
            public final void mo20569a(Dialog dialog, View view2, int i, CharSequence charSequence) {
                this.f113576a.m146270J(dialog, view2, i, charSequence);
            }
        }).m20526V(new DialogInterface.OnDismissListener() { // from class: l.jjm
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        }).m20568z0();
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m146272L(int i, Dialog dialog, View view, int i2, CharSequence charSequence) {
        this.f123482a.m106676J().f164198a.remove(i);
        notifyDataSetChanged();
        this.f123482a.m106681O();
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m146273M(final int i, View view) {
        this.f123482a.getAct().dialog().m20536f0(new String[]{this.f123482a.getAct().getString(R$string.f39052f)}).m20537g0(new Dialog.InterfaceC4311g() { // from class: l.hjm
            @Override // com.p046p1.mobile.android.app.Dialog.InterfaceC4311g
            /* JADX INFO: renamed from: a */
            public final void mo20569a(Dialog dialog, View view2, int i2, CharSequence charSequence) {
                this.f108094a.m146272L(i, dialog, view2, i2, charSequence);
            }
        }).m20568z0();
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m146274N(RecyclerView.AbstractC0566d0 abstractC0566d0, Object obj, Throwable th) {
        lsi0.m151578h(R$string.f39146s4);
        C18036a c18036a = (C18036a) abstractC0566d0;
        xdl0.m208345M0(c18036a.f123484b, true);
        xdl0.m208345M0(c18036a.f123485c, false);
        c18036a.f123484b.setImageResource(f3c0.f94527g6);
        if (this.f123482a.m106676J().f164198a.remove(obj)) {
            notifyDataSetChanged();
            this.f123482a.m106681O();
        }
    }

    /* JADX INFO: renamed from: O */
    public void m146275O(ArrayList<Media> arrayList) {
        if (!NullChecker.m81303a(arrayList) || arrayList.size() <= 0) {
            return;
        }
        this.f123482a.m106676J().f164198a.addAll(arrayList);
        notifyDataSetChanged();
    }

    public Object getItem(int i) {
        return i == this.f123482a.m106676J().f164198a.size() ? "add image" : this.f123482a.m106676J().f164198a.get(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (this.f123482a.m106676J().f164198a == null) {
            return 0;
        }
        return (this.f123482a.m106676J().f164198a.size() >= 9 || vwb.m200337m(this.f123482a.m106676J().f164198a, new w9j() { // from class: l.ajm
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((Media) obj) instanceof Video);
            }
        }) || vwb.m200337m(this.f123482a.m106676J().f164198a, new w9j() { // from class: l.bjm
            @Override // p149l.w9j
            public final Object call(Object obj) {
                Media media = (Media) obj;
                return Boolean.valueOf((media instanceof Picture) && media.isFromShoot());
            }
        })) ? this.f123482a.m106676J().f164198a.size() : this.f123482a.m106676J().f164198a.size() + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (getItem(i).equals("add image")) {
            return 1;
        }
        return getItem(i) instanceof Video ? 2 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(final RecyclerView.AbstractC0566d0 abstractC0566d0, final int i) {
        if (abstractC0566d0 instanceof C18037b) {
            ((C18037b) abstractC0566d0).f123487a.setOnClickListener(new View.OnClickListener() { // from class: l.cjm
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f81207a.m146271K(view);
                }
            });
            return;
        }
        final VDraweeView vDraweeView = ((C18036a) abstractC0566d0).f123483a;
        vDraweeView.setOnClickListener(new View.OnClickListener() { // from class: l.djm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f86560a.m146273M(i, view);
            }
        });
        qib0.f154691G.m184725o(vDraweeView);
        final Object item = getItem(i);
        if (item instanceof Media) {
            if (item instanceof Video) {
                this.f123482a.getAct().duringCreated(C22306c.create(new C22306c.a() { // from class: l.ejm
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        kjm.m146263E(item, (z3g0) obj);
                    }
                }).compose(mkd0.m154964P()), false).observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.fjm
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        kjm.m146262D(abstractC0566d0, vDraweeView, (Video) obj);
                    }
                }, new e30() { // from class: l.gjm
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f103088a.m146274N(abstractC0566d0, item, (Throwable) obj);
                    }
                }));
            } else {
                qib0.f154691G.m102367m0(vDraweeView, ((Media) item).url);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.AbstractC0566d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new C18037b(this.f123482a.getAct().inflater().inflate(o6c0.f142227k4, viewGroup, false));
        }
        cg4 cg4Var = this.f123482a;
        return i == 2 ? new C18036a(cg4Var.getAct().inflater().inflate(o6c0.f142255o4, viewGroup, false)) : new C18036a(cg4Var.getAct().inflater().inflate(o6c0.f142234l4, viewGroup, false));
    }
}
