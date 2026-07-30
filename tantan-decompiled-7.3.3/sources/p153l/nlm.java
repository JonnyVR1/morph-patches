package p153l;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.data.Dimension;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.feed.R$string;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Arrays;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import p137rx.C22421c;
import p151v.VDraweeView;
import p151v.VImage;

/* JADX INFO: loaded from: classes13.dex */
public class nlm extends RecyclerView.Adapter<RecyclerView.AbstractC0569e0> {

    /* JADX INFO: renamed from: a */
    public bh4 f142565a;

    /* JADX INFO: renamed from: l.nlm$a */
    public class C18897a extends RecyclerView.AbstractC0569e0 {

        /* JADX INFO: renamed from: a */
        public VDraweeView f142566a;

        /* JADX INFO: renamed from: b */
        public VImage f142567b;

        /* JADX INFO: renamed from: c */
        public View f142568c;

        public C18897a(View view) {
            super(view);
            this.f142566a = (VDraweeView) view.findViewById(hdc0.f108942m0);
            this.f142567b = (VImage) view.findViewById(hdc0.f108955q1);
            this.f142568c = view.findViewById(hdc0.f108838H0);
        }
    }

    /* JADX INFO: renamed from: l.nlm$b */
    public class C18898b extends RecyclerView.AbstractC0569e0 {

        /* JADX INFO: renamed from: a */
        public View f142570a;

        public C18898b(View view) {
            super(view);
            this.f142570a = view.findViewById(hdc0.f108894a);
        }
    }

    public nlm(bh4 bh4Var) {
        this.f142565a = bh4Var;
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m163729D(RecyclerView.AbstractC0569e0 abstractC0569e0, VDraweeView vDraweeView, Video video) {
        if (NullChecker.m82486a(video.cover) && NullChecker.m82486a(video.cover.url)) {
            C18897a c18897a = (C18897a) abstractC0569e0;
            bnl0.m105525M0(c18897a.f142567b, true);
            bnl0.m105525M0(c18897a.f142568c, false);
            uqb0.f180374G.m127150m0(vDraweeView, video.cover.url);
        } else {
            C18897a c18897a2 = (C18897a) abstractC0569e0;
            bnl0.m105525M0(c18897a2.f142567b, false);
            bnl0.m105525M0(c18897a2.f142568c, true);
        }
        ((C18897a) abstractC0569e0).f142567b.setImageResource(lbc0.f130936S1);
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m163730E(Object obj, gcg0 gcg0Var) {
        Video video = (Video) obj;
        gcg0Var.m137019l(video);
        wel0 wel0Var = new wel0(new vel0(oki.m168038z(video.url)), false, false);
        Picture picture = video.cover;
        if (picture == null || TextUtils.isEmpty(picture.url)) {
            Picture picture2 = new Picture();
            video.cover = picture2;
            picture2.url = oki.m168011B(wel0Var.m206013c(0));
            video.cover.size = new Dimension(wel0Var.m206019k());
            video.cover.mediaType = DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG;
            uqb0.f180374G.m127160x0(video.url);
        }
        gcg0Var.m137019l(video);
        gcg0Var.onCompleted();
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m163737J(Dialog dialog, View view, int i, CharSequence charSequence) {
        if (i == 0) {
            this.f142565a.getAct().pickImagesWithPicker(9 - this.f142565a.m104309J().f162897a.size(), true, false, false);
        } else {
            if (i != 1) {
                return;
            }
            this.f142565a.getAct().pickImagesWithPicker(0, true, true, false);
        }
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m163738K(View view) {
        if (this.f142565a.m104309J().f162897a.size() > 0) {
            this.f142565a.getAct().pickImagesWithPicker(9 - this.f142565a.m104309J().f162897a.size(), true, false, false);
            return;
        }
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_moment_type_selection_pop", Dialog.class.getName());
        w1e.m204402f(l4g0VarM204399c);
        this.f142565a.getAct().dialog().m21534e0(Arrays.asList(this.f142565a.getAct().getString(R$string.f39828T4), this.f142565a.getAct().getString(R$string.f39834U4))).m21536g0(new Dialog.InterfaceC4462g() { // from class: l.llm
            @Override // com.p051p1.mobile.android.app.Dialog.InterfaceC4462g
            /* JADX INFO: renamed from: a */
            public final void mo21568a(Dialog dialog, View view2, int i, CharSequence charSequence) {
                this.f132577a.m163737J(dialog, view2, i, charSequence);
            }
        }).m21525V(new DialogInterface.OnDismissListener() { // from class: l.mlm
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        }).m21567z0();
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m163739L(int i, Dialog dialog, View view, int i2, CharSequence charSequence) {
        this.f142565a.m104309J().f162897a.remove(i);
        notifyDataSetChanged();
        this.f142565a.m104314O();
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m163740M(final int i, View view) {
        this.f142565a.getAct().dialog().m21535f0(new String[]{this.f142565a.getAct().getString(R$string.f39900f)}).m21536g0(new Dialog.InterfaceC4462g() { // from class: l.klm
            @Override // com.p051p1.mobile.android.app.Dialog.InterfaceC4462g
            /* JADX INFO: renamed from: a */
            public final void mo21568a(Dialog dialog, View view2, int i2, CharSequence charSequence) {
                this.f127396a.m163739L(i, dialog, view2, i2, charSequence);
            }
        }).m21567z0();
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m163741N(RecyclerView.AbstractC0569e0 abstractC0569e0, Object obj, Throwable th) {
        o1j0.m165634h(R$string.f39994s4);
        C18897a c18897a = (C18897a) abstractC0569e0;
        bnl0.m105525M0(c18897a.f142567b, true);
        bnl0.m105525M0(c18897a.f142568c, false);
        c18897a.f142567b.setImageResource(lbc0.f131045g6);
        if (this.f142565a.m104309J().f162897a.remove(obj)) {
            notifyDataSetChanged();
            this.f142565a.m104314O();
        }
    }

    /* JADX INFO: renamed from: O */
    public void m163742O(ArrayList<Media> arrayList) {
        if (!NullChecker.m82486a(arrayList) || arrayList.size() <= 0) {
            return;
        }
        this.f142565a.m104309J().f162897a.addAll(arrayList);
        notifyDataSetChanged();
    }

    public Object getItem(int i) {
        return i == this.f142565a.m104309J().f162897a.size() ? "add image" : this.f142565a.m104309J().f162897a.get(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (this.f142565a.m104309J().f162897a == null) {
            return 0;
        }
        return (this.f142565a.m104309J().f162897a.size() >= 9 || jyb.m147520m(this.f142565a.m104309J().f162897a, new qcj() { // from class: l.dlm
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((Media) obj) instanceof Video);
            }
        }) || jyb.m147520m(this.f142565a.m104309J().f162897a, new qcj() { // from class: l.elm
            @Override // p153l.qcj
            public final Object call(Object obj) {
                Media media = (Media) obj;
                return Boolean.valueOf((media instanceof Picture) && media.isFromShoot());
            }
        })) ? this.f142565a.m104309J().f162897a.size() : this.f142565a.m104309J().f162897a.size() + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (getItem(i).equals("add image")) {
            return 1;
        }
        return getItem(i) instanceof Video ? 2 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(final RecyclerView.AbstractC0569e0 abstractC0569e0, final int i) {
        if (abstractC0569e0 instanceof C18898b) {
            ((C18898b) abstractC0569e0).f142570a.setOnClickListener(new View.OnClickListener() { // from class: l.flm
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f99675a.m163738K(view);
                }
            });
            return;
        }
        final VDraweeView vDraweeView = ((C18897a) abstractC0569e0).f142566a;
        vDraweeView.setOnClickListener(new View.OnClickListener() { // from class: l.glm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f104871a.m163740M(i, view);
            }
        });
        uqb0.f180374G.m98798o(vDraweeView);
        final Object item = getItem(i);
        if (item instanceof Media) {
            if (item instanceof Video) {
                this.f142565a.getAct().duringCreated(C22421c.create(new C22421c.a() { // from class: l.hlm
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        nlm.m163730E(item, (gcg0) obj);
                    }
                }).compose(psd0.m173605P()), false).observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.ilm
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        nlm.m163729D(abstractC0569e0, vDraweeView, (Video) obj);
                    }
                }, new y20() { // from class: l.jlm
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f121581a.m163741N(abstractC0569e0, item, (Throwable) obj);
                    }
                }));
            } else {
                uqb0.f180374G.m127150m0(vDraweeView, ((Media) item).url);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.AbstractC0569e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new C18898b(this.f142565a.getAct().inflater().inflate(tec0.f173696k4, viewGroup, false));
        }
        bh4 bh4Var = this.f142565a;
        return i == 2 ? new C18897a(bh4Var.getAct().inflater().inflate(tec0.f173724o4, viewGroup, false)) : new C18897a(bh4Var.getAct().inflater().inflate(tec0.f173703l4, viewGroup, false));
    }
}
