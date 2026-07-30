package com.p051p1.mobile.putong.newui.mediaoperation.mediapicker;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.putong.common.R$string;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerFrag;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.decoration.MediaItemRenderDecoration;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.folder.FolderSelectView;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.util.C13230a;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.util.MediaWrapper;
import com.p051p1.mobile.putong.newui.mediaoperation.preview.MediaPreviewAct;
import com.p051p1.mobile.putong.p070ui.mediapicker.MediaPickerBaseAct;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p137rx.C22421c;
import p137rx.schedulers.Schedulers;
import p151v.VButton;
import p151v.VLinear;
import p151v.VRecyclerView;
import p153l.b9c0;
import p153l.bnl0;
import p153l.bvx;
import p153l.cbc0;
import p153l.ewi;
import p153l.fo0;
import p153l.i4g0;
import p153l.iwi;
import p153l.jh0;
import p153l.jyb;
import p153l.psd0;
import p153l.pzx;
import p153l.qcj;
import p153l.qyx;
import p153l.s0y;
import p153l.uqb0;
import p153l.vg60;
import p153l.wzx;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes10.dex */
public class MediaPickerFrag extends MediaPickerBaseFrag {

    /* JADX INFO: renamed from: I */
    public RelativeLayout f54862I;

    /* JADX INFO: renamed from: J */
    public ImageView f54863J;

    /* JADX INFO: renamed from: K */
    public TextView f54864K;

    /* JADX INFO: renamed from: L */
    public ImageView f54865L;

    /* JADX INFO: renamed from: M */
    public VLinear f54866M;

    /* JADX INFO: renamed from: N */
    public FrameLayout f54867N;

    /* JADX INFO: renamed from: O */
    public VRecyclerView f54868O;

    /* JADX INFO: renamed from: P */
    public FolderSelectView f54869P;

    /* JADX INFO: renamed from: Q */
    public RelativeLayout f54870Q;

    /* JADX INFO: renamed from: R */
    public TextView f54871R;

    /* JADX INFO: renamed from: S */
    public VButton f54872S;

    /* JADX INFO: renamed from: T */
    public iwi f54873T;

    /* JADX INFO: renamed from: U */
    public vg60<ewi> f54874U = vg60.m201220b();

    /* JADX INFO: renamed from: V */
    public String f54875V;

    /* JADX INFO: renamed from: W */
    public qyx f54876W;

    /* JADX INFO: renamed from: X */
    public wzx f54877X;

    /* JADX INFO: renamed from: G5 */
    private void m80115G5() {
        this.f54863J.setOnClickListener(new View.OnClickListener() { // from class: l.tyx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f176723a.m80116J5(view);
            }
        });
        this.f54870Q.setOnClickListener(new View.OnClickListener() { // from class: l.ezx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MediaPickerFrag.m80141r5(view);
            }
        });
        boolean zIsRadio = this.f54859G.isRadio();
        VButton vButton = this.f54872S;
        if (zIsRadio) {
            vButton.setVisibility(8);
        } else {
            bnl0.m105509E0(vButton, new View.OnClickListener() { // from class: l.hzx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f112312a.m80117K5(view);
                }
            });
        }
        jyb.m147537z(jyb.m147507f0(this.f54864K, this.f54865L), new y20() { // from class: l.izx
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f117765a.m80119M5((View) obj);
            }
        });
        this.f54869P.setOnClickListener(new View.OnClickListener() { // from class: l.jzx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f123341a.m80154N5(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J5 */
    public /* synthetic */ void m80116J5(View view) {
        act().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K5 */
    public /* synthetic */ void m80117K5(View view) {
        if (m80147A5()) {
            m80104M4();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L5 */
    public /* synthetic */ void m80118L5(View view) {
        m80166d6();
        if (bnl0.m105529O0(this.f54869P)) {
            m80148B5();
        } else {
            m80171j6();
        }
        i4g0.m138520r("e_album_list", "p_camera_local_album");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M5 */
    public /* synthetic */ void m80119M5(View view) {
        if (NullChecker.m82486a(view)) {
            view.setOnClickListener(new View.OnClickListener() { // from class: l.xyx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f196799a.m80118L5(view2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q5 */
    public /* synthetic */ Boolean m80120Q5(ewi ewiVar) {
        return Boolean.valueOf(ewiVar.f96162b.equals(this.f54875V));
    }

    /* JADX INFO: renamed from: Z5 */
    private void m80121Z5() {
        jh0 jh0Var = this.f54854B;
        if (jh0Var != null) {
            jh0Var.m144822I();
        }
    }

    /* JADX INFO: renamed from: c6 */
    private void m80123c6() {
        TextView textView = this.f54864K;
        ewi ewiVar = this.f54861z.selectedFolder;
        textView.setText(ewiVar == null ? getResources().getString(R$string.f18120Z) : ewiVar.f96161a);
        MediaWrapper mediaWrapper = this.f54861z;
        ewi ewiVar2 = mediaWrapper.selectedFolder;
        this.f54854B.m144823J(ewiVar2 == null ? mediaWrapper.allMediasInPhoto : ewiVar2.f96163c);
    }

    /* JADX INFO: renamed from: e6 */
    private void m80126e6() {
        this.f54861z.setSelectedFolder((ewi) jyb.m147529r(this.f54874U.f184001a, new qcj() { // from class: l.fzx
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f101560a.m80120Q5((ewi) obj);
            }
        }));
        m80123c6();
    }

    /* JADX INFO: renamed from: k6 */
    private void m80133k6() {
        if (isAdded()) {
            TextView textView = this.f54864K;
            ewi ewiVar = this.f54861z.selectedFolder;
            textView.setText(ewiVar == null ? act().getString(R$string.f18120Z) : ewiVar.f96161a);
        }
    }

    /* JADX INFO: renamed from: l6 */
    private void m80135l6() {
        ewi ewiVar = (ewi) jyb.m147529r(this.f54874U.f184001a, new qcj() { // from class: l.gzx
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f107246a.m80161V5((ewi) obj);
            }
        });
        if (NullChecker.m82486a(this.f54861z.selectedFolder) && this.f54861z.selectedFolder.equals(ewiVar)) {
            return;
        }
        this.f54861z.setSelectedFolder(ewiVar);
        m80133k6();
    }

    /* JADX INFO: renamed from: p5 */
    public static /* synthetic */ vg60 m80139p5(List list) {
        return new vg60(jyb.m147486Q(list, new qcj() { // from class: l.dzx
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ewi.m122953b((v2i0) obj);
            }
        }), null);
    }

    /* JADX INFO: renamed from: r5 */
    public static /* synthetic */ void m80141r5(View view) {
    }

    /* JADX INFO: renamed from: A5 */
    public boolean m80147A5() {
        return this.f54861z.allSelectedMedias.size() > 0;
    }

    /* JADX INFO: renamed from: B5 */
    public final void m80148B5() {
        bnl0.m105524M(this.f54869P, false);
        this.f54865L.setRotation(0.0f);
    }

    @Override // p153l.rn20
    /* JADX INFO: renamed from: C */
    public Frag mo63697C() {
        return this;
    }

    /* JADX INFO: renamed from: C5 */
    public final void m80149C5() {
        C22421c<List<Media>> c22421cM106629u;
        if (act() == null || act().isFinishing() || getContext() == null) {
            return;
        }
        bvx bvxVar = new bvx(act(), true, true, true, 80);
        MediaPickerParamsObject mediaPickerParamsObject = this.f54859G;
        if (mediaPickerParamsObject.videoPickConfig == null) {
            c22421cM106629u = bvxVar.m106628t();
        } else {
            c22421cM106629u = mediaPickerParamsObject.imagePickConfig == null ? bvxVar.m106629u() : bvxVar.m106626r();
        }
        m80168g6(bvxVar, c22421cM106629u);
        m80169h6(c22421cM106629u);
        act().getSupportLoaderManager().mo3089e(0, null, bvxVar);
    }

    /* JADX INFO: renamed from: D5 */
    public void m80150D5() {
        MediaPickerParamsObject mediaPickerParamsObject = this.f54859G;
        if (mediaPickerParamsObject != null) {
            m80153I5(mediaPickerParamsObject.alreadySelectedImages);
            MediaPickerParamsObject mediaPickerParamsObject2 = this.f54859G;
            this.f54875V = mediaPickerParamsObject2.selectedFolderPath;
            MediaPickConfig mediaPickConfig = mediaPickerParamsObject2.imagePickConfig;
            if (mediaPickConfig != null) {
                MediaWrapper mediaWrapper = this.f54861z;
                mediaWrapper.imageCropProportion = mediaPickConfig.imageCropProportion;
                mediaWrapper.imageCropWidth = mediaPickConfig.imageCropWidth;
            }
        }
    }

    /* JADX INFO: renamed from: E5 */
    public void mo40314E5() {
        if (this.f54873T == null) {
            this.f54873T = new iwi(act(), this.f54861z);
        }
    }

    /* JADX INFO: renamed from: F5 */
    public final void m80151F5() {
        if (this.f54859G.initialShowSelectFold) {
            m80171j6();
        } else {
            m80148B5();
        }
    }

    /* JADX INFO: renamed from: H5 */
    public MediaPickerParamsObject m80152H5(Bundle bundle) {
        return (MediaPickerParamsObject) bundle.getSerializable("params_object");
    }

    /* JADX INFO: renamed from: I5 */
    public final void m80153I5(List<Media> list) {
        if (NullChecker.m82486a(list)) {
            this.f54861z.clearAllSelectedMedia();
            Iterator<Media> it = list.iterator();
            while (it.hasNext()) {
                this.f54861z.addSelectedMedia(it.next());
            }
            m80172m6();
        }
    }

    /* JADX INFO: renamed from: N5 */
    public final /* synthetic */ void m80154N5(View view) {
        m80148B5();
    }

    /* JADX INFO: renamed from: O5 */
    public final /* synthetic */ void m80155O5() {
        this.f54861z.allMediasInPhoto.f184001a.clear();
        this.f54874U.f184001a.clear();
        m80149C5();
    }

    /* JADX INFO: renamed from: P5 */
    public final /* synthetic */ void m80156P5(Bundle bundle) {
        boolean z;
        boolean z2;
        if (!wzx.m208784k()) {
            PermissionHelper.m81065c().m81083r("android.permission.READ_EXTERNAL_STORAGE").m81088w(false).m81086u(true).m81080o(new x20() { // from class: l.wyx
                @Override // p153l.x20
                public final void call() {
                    this.f191713a.m80149C5();
                }
            }).m81074i(act());
            return;
        }
        wzx wzxVar = new wzx();
        this.f54877X = wzxVar;
        MediaPickerParamsObject mediaPickerParamsObject = this.f54859G;
        if (mediaPickerParamsObject.videoPickConfig == null) {
            z2 = false;
            z = true;
        } else if (mediaPickerParamsObject.imagePickConfig == null) {
            z = false;
            z2 = true;
        } else {
            z = true;
            z2 = true;
        }
        wzxVar.m208786e(getActivity(), this.f54866M, z, z2, new x20() { // from class: l.vyx
            @Override // p153l.x20
            public final void call() {
                this.f186432a.m80155O5();
            }
        }, null, null, null, null);
    }

    @Override // com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerBaseFrag
    /* JADX INFO: renamed from: Q4 */
    public void mo80108Q4() {
        mo40315Y5();
    }

    /* JADX INFO: renamed from: R5 */
    public final /* synthetic */ void m80157R5(View view) {
        if (this.f54861z.getFirstMedia() == null) {
            return;
        }
        mo63697C().startActivityForResult(MediaPreviewAct.m80207H2(act()).m80270j(this.f54861z.allSelectedMedias).m80267g(this.f54859G).m80266f(this.f54861z.getCurrentMaxCount(this.f54859G)).m80269i(this.f54861z.getFirstMedia()).m80261a(), 1);
    }

    /* JADX INFO: renamed from: S5 */
    public final /* synthetic */ void m80158S5(bvx bvxVar, List list) {
        boolean zM147479J = jyb.m147479J(this.f54861z.allMediasInPhoto.f184001a);
        MediaWrapper mediaWrapper = this.f54861z;
        if (zM147479J) {
            mediaWrapper.allMediasInPhoto = new vg60<>(list, null);
            jh0 jh0Var = this.f54854B;
            if (jh0Var != null) {
                jh0Var.m144823J(this.f54861z.allMediasInPhoto);
            }
        } else {
            int size = mediaWrapper.allMediasInPhoto.f184001a.size();
            this.f54861z.allMediasInPhoto.f184001a.addAll(list);
            jh0 jh0Var2 = this.f54854B;
            if (jh0Var2 != null) {
                jh0Var2.notifyItemRangeInserted(size, list.size());
            }
        }
        if (bvxVar.f78666g && NullChecker.m82486a(act())) {
            act().getSupportLoaderManager().mo3089e(0, null, bvxVar);
        }
    }

    @Override // com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerBaseFrag
    /* JADX INFO: renamed from: T4 */
    public MediaItemRenderDecoration mo63713T4(MediaPickerParamsObject mediaPickerParamsObject) {
        return null;
    }

    /* JADX INFO: renamed from: T5 */
    public final /* synthetic */ void m80159T5(vg60 vg60Var) {
        if (act() == null || act().isFinishing() || getContext() == null) {
            return;
        }
        if (jyb.m147479J(this.f54874U.f184001a)) {
            this.f54874U = vg60Var;
            m80126e6();
        } else {
            m80163X5(this.f54874U.f184001a, vg60Var.f184001a);
            m80135l6();
        }
        if (this.f54859G.initialShowSelectFold) {
            m80166d6();
        }
    }

    @Override // com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerBaseFrag
    /* JADX INFO: renamed from: U4 */
    public MediaPickerParamsObject mo63715U4() {
        return m80152H5(getArguments());
    }

    /* JADX INFO: renamed from: U5 */
    public final /* synthetic */ void m80160U5() {
        this.f54868O.scrollToPosition(0);
    }

    @Override // com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerBaseFrag
    /* JADX INFO: renamed from: V4 */
    public s0y mo63717V4(MediaPickerParamsObject mediaPickerParamsObject) {
        if (this.f54858F == null) {
            switch (mediaPickerParamsObject.fromType) {
                case 1:
                case 9:
                    return uqb0.f180397c0.mo105310l5();
                case 2:
                case 5:
                case 8:
                    return uqb0.f180397c0.mo105293R0();
                case 3:
                    return uqb0.f180397c0.mo105313t2();
                case 4:
                case 10:
                case 11:
                case 13:
                case 14:
                    return uqb0.f180397c0.mo105289L0();
                case 7:
                    return uqb0.f180397c0.mo105304d();
                case 12:
                case 15:
                case 17:
                    return uqb0.f180397c0.mo105281A2();
                case 16:
                    m80113a5();
                    return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: V5 */
    public final /* synthetic */ Boolean m80161V5(ewi ewiVar) {
        return Boolean.valueOf(ewiVar.f96162b.equals(this.f54875V));
    }

    /* JADX INFO: renamed from: W5 */
    public final /* synthetic */ void m80162W5(Media media) {
        boolean zM82486a = NullChecker.m82486a(media.originUrl);
        Map<String, Integer> map = this.f54853A;
        if (zM82486a) {
            map.put(media.originUrl, Integer.valueOf(this.f54861z.allMediasInPhoto.f184001a.indexOf(media)));
        } else {
            map.put(media.url, Integer.valueOf(this.f54861z.allMediasInPhoto.f184001a.indexOf(media)));
        }
    }

    @Override // com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerBaseFrag
    /* JADX INFO: renamed from: X4 */
    public RecyclerView mo63720X4() {
        return this.f54868O;
    }

    /* JADX INFO: renamed from: X5 */
    public List<ewi> m80163X5(List<ewi> list, List<ewi> list2) {
        if (NullChecker.m82486a(list2) && list2.size() > 0) {
            for (int i = 0; i < list2.size(); i++) {
                ewi ewiVar = list2.get(i);
                if (list.contains(ewiVar)) {
                    list.get(list.indexOf(ewiVar)).f96164d += ewiVar.f96164d;
                    list.get(list.indexOf(ewiVar)).f96163c.f184001a.addAll(ewiVar.f96163c.f184001a);
                } else {
                    list.add(ewiVar);
                }
            }
        }
        return list;
    }

    /* JADX INFO: renamed from: Y5 */
    public void mo40315Y5() {
        if (this.f54861z.allSelectedMedias.isEmpty() || this.f54861z.allSelectedMedias.size() < this.f54859G.getMinImageSelectCount()) {
            this.f54871R.setClickable(false);
            this.f54871R.setTextColor(act().getResources().getColor(b9c0.f75560f));
            this.f54872S.setClickable(false);
            this.f54872S.setSelected(false);
        } else {
            this.f54871R.setClickable(true);
            this.f54871R.setTextColor(act().getResources().getColor(b9c0.f75557c));
            this.f54872S.setClickable(true);
            this.f54872S.setSelected(true);
        }
        m80165b6();
    }

    @Override // com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerBaseFrag
    /* JADX INFO: renamed from: Z4 */
    public void mo63723Z4(Media media, boolean z) {
        MediaWrapper mediaWrapper;
        final String str = z ? media.originUrl : media.url;
        this.f54853A.remove(str);
        this.f54861z.unCheckMedia(media);
        jyb.m147503d0(this.f54861z.allSelectedMedias, new qcj() { // from class: l.mzx
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(str.equalsIgnoreCase(((Media) obj).url));
            }
        });
        jyb.m147503d0(this.f54861z.allSelectedMedias, new qcj() { // from class: l.nzx
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(str.equalsIgnoreCase(((Media) obj).originUrl));
            }
        });
        if (jyb.m147479J(this.f54861z.allSelectedMedias)) {
            m80121Z5();
            return;
        }
        HashMap map = new HashMap();
        map.put(media.url, media);
        int i = 0;
        while (true) {
            int size = this.f54861z.allSelectedMedias.size();
            mediaWrapper = this.f54861z;
            if (i >= size) {
                break;
            }
            Media media2 = mediaWrapper.allSelectedMedias.get(i);
            boolean zContainsKey = this.f54853A.containsKey(media2.url);
            Map<String, Integer> map2 = this.f54853A;
            if (zContainsKey) {
                if (i != map2.get(media2.url).intValue()) {
                    this.f54853A.put(media2.url, Integer.valueOf(i));
                    map.put(media2.url, media2);
                }
            } else if (map2.containsKey(media2.originUrl) && i != this.f54853A.get(media2.originUrl).intValue()) {
                this.f54853A.put(media2.originUrl, Integer.valueOf(i));
                map.put(media2.originUrl, media2);
            }
            i++;
        }
        ewi ewiVar = mediaWrapper.selectedFolder;
        vg60<Media> vg60Var = ewiVar == null ? mediaWrapper.allMediasInPhoto : ewiVar.f96163c;
        for (int i2 = 0; i2 < vg60Var.f184001a.size(); i2++) {
            Media media3 = vg60Var.f184001a.get(i2);
            if (map.containsKey(media3.url)) {
                this.f54854B.notifyItemChanged(i2);
            } else if (map.containsKey(media3.originUrl)) {
                this.f54854B.notifyItemChanged(i2);
            }
        }
        if (this.f54853A.size() + 1 == this.f54859G.getMaxVideoSelectCount() || this.f54853A.size() + 1 == this.f54859G.getMaxImageSelectCount()) {
            m80121Z5();
        }
    }

    /* JADX INFO: renamed from: a6 */
    public final void m80164a6() {
        m80167f6();
        m80165b6();
        if (this.f54859G.isRadio()) {
            this.f54872S.setVisibility(8);
        }
        if (this.f54872S.getVisibility() == 8 && this.f54871R.getVisibility() == 8) {
            this.f54870Q.setVisibility(8);
        }
        if (NullChecker.m82486a(this.f54859G)) {
            int i = this.f54859G.fromType;
            if (i == 10 || i == 13 || i == 11) {
                this.f54870Q.setVisibility(8);
            }
        }
    }

    /* JADX INFO: renamed from: b6 */
    public final void m80165b6() {
        int currentCount = this.f54861z.getCurrentCount();
        VButton vButton = this.f54872S;
        if (currentCount == 0) {
            vButton.setText(this.f54859G.submitButtonTitle);
        } else {
            vButton.setText(String.format("%s %d", this.f54859G.submitButtonTitle, Integer.valueOf(this.f54861z.getCurrentCount())));
        }
    }

    /* JADX INFO: renamed from: d6 */
    public final void m80166d6() {
        mo40314E5();
        this.f54873T.m142383K(new y20() { // from class: l.azx
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f74198a.m80170i6((ewi) obj);
            }
        });
        this.f54869P.m80184b(this.f54873T);
        this.f54873T.m142382J(this.f54874U);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        creates(new y20() { // from class: l.kzx
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f129472a.m80156P5((Bundle) obj);
            }
        }, new x20() { // from class: l.lzx
            @Override // p153l.x20
            public final void call() {
                C13230a.m80205h(null);
            }
        });
    }

    /* JADX INFO: renamed from: f6 */
    public final void m80167f6() {
        boolean z = this.f54859G.needAllSelectedMediaPreview;
        TextView textView = this.f54871R;
        if (!z) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            this.f54871R.setOnClickListener(new View.OnClickListener() { // from class: l.uyx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f181682a.m80157R5(view);
                }
            });
        }
    }

    @Override // com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerBaseFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        m80115G5();
        mo40315Y5();
        m80164a6();
        m80174y5();
        m80121Z5();
        m80151F5();
    }

    /* JADX INFO: renamed from: g6 */
    public final void m80168g6(final bvx bvxVar, C22421c<List<Media>> c22421c) {
        c22421c.distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.bzx
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f79181a.m80158S5(bvxVar, (List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h6 */
    public final void m80169h6(C22421c<List<Media>> c22421c) {
        c22421c.distinctUntilChanged().observeOn(Schedulers.m222739io()).compose(bvx.m106622n(MediaPickerBaseAct.f55454k)).map(new qcj() { // from class: l.yyx
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return MediaPickerFrag.m80139p5((List) obj);
            }
        }).observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.zyx
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f206653a.m80159T5((vg60) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i6 */
    public void m80170i6(ewi ewiVar) {
        this.f54861z.setSelectedFolder(ewiVar);
        m80123c6();
        m21591l4(new Runnable() { // from class: l.czx
            @Override // java.lang.Runnable
            public final void run() {
                this.f84502a.m80160U5();
            }
        });
        m80148B5();
        this.f54873T.m142381I();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM80173x5 = m80173x5(layoutInflater, viewGroup);
        this.f54872S.setTypeface(null, 1);
        if (this.f54859G.isNewUIAb) {
            this.f54863J.setImageResource(cbc0.f80761b0);
            this.f54865L.setImageResource(cbc0.f80801v0);
            this.f54864K.setTextColor(getResources().getColor(b9c0.f75558d));
        }
        return viewM80173x5;
    }

    /* JADX INFO: renamed from: j6 */
    public final void m80171j6() {
        bnl0.m105524M(this.f54869P, true);
        this.f54865L.setRotation(180.0f);
    }

    /* JADX INFO: renamed from: m6 */
    public final void m80172m6() {
        this.f54853A.clear();
        jyb.m147537z(this.f54861z.allSelectedMedias, new y20() { // from class: l.ozx
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f149972a.m80162W5((Media) obj);
            }
        });
        m80121Z5();
    }

    @Override // com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerBaseFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: n4 */
    public void mo21593n4(Bundle bundle) {
        super.mo21593n4(bundle);
        m80150D5();
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1 && i2 == -1) {
            m80153I5((ArrayList) intent.getSerializableExtra("extra_images"));
            mo80108Q4();
            if (NullChecker.m82486a(this.f54858F)) {
                this.f54858F.mo99893f(act(), this.f54861z, this.f54859G, intent);
                return;
            }
            return;
        }
        if (i == 1 && i2 == 555) {
            m80153I5((ArrayList) intent.getSerializableExtra("extra_images"));
            m80106O4();
            return;
        }
        if (i == 10000 && i2 == -1 && NullChecker.m82486a(intent)) {
            Serializable serializableExtra = intent.getSerializableExtra("camera_images_path");
            if (NullChecker.m82486a(serializableExtra)) {
                ArrayList<Media> arrayList = (ArrayList) serializableExtra;
                if (jyb.m147479J(arrayList)) {
                    return;
                }
                this.f54854B.m144824K(arrayList);
            }
        }
    }

    @Override // p153l.rn20
    /* JADX INFO: renamed from: q0 */
    public Video mo63732q0() {
        return (Video) this.f54861z.getSelectedVideo();
    }

    @Override // p153l.rn20
    /* JADX INFO: renamed from: x */
    public Map<String, Integer> mo63733x() {
        return this.f54853A;
    }

    /* JADX INFO: renamed from: x5 */
    public View m80173x5(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return pzx.m174626b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: y5 */
    public final void m80174y5() {
        View viewMo178756a;
        qyx qyxVarM80175z5 = m80175z5();
        this.f54876W = qyxVarM80175z5;
        if (qyxVarM80175z5 == null || (viewMo178756a = qyxVarM80175z5.mo178756a(act())) == null) {
            return;
        }
        viewMo178756a.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = viewMo178756a.getMeasuredHeight();
        VRecyclerView vRecyclerView = this.f54868O;
        bnl0.m105548c0(vRecyclerView, measuredHeight + vRecyclerView.getPaddingBottom());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        this.f54867N.addView(viewMo178756a, layoutParams);
    }

    /* JADX INFO: renamed from: z5 */
    public qyx m80175z5() {
        if (this.f54859G.fromType == 3) {
            return uqb0.f180397c0.mo105286G2();
        }
        return null;
    }
}
