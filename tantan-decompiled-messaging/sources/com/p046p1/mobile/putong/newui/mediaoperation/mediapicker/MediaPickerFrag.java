package com.p046p1.mobile.putong.newui.mediaoperation.mediapicker;

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
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.putong.common.R$string;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerFrag;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.decoration.MediaItemRenderDecoration;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.folder.FolderSelectView;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.util.C13067a;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.util.MediaWrapper;
import com.p046p1.mobile.putong.newui.mediaoperation.preview.MediaPreviewAct;
import com.p046p1.mobile.putong.p065ui.mediapicker.MediaPickerBaseAct;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p133rx.C22306c;
import p133rx.schedulers.Schedulers;
import p147v.VButton;
import p147v.VLinear;
import p147v.VRecyclerView;
import p149l.d30;
import p149l.e30;
import p149l.emx;
import p149l.iti;
import p149l.jo0;
import p149l.mkd0;
import p149l.mti;
import p149l.nh0;
import p149l.q860;
import p149l.qib0;
import p149l.sqx;
import p149l.tpx;
import p149l.v0c0;
import p149l.vrx;
import p149l.vwb;
import p149l.w2c0;
import p149l.w9j;
import p149l.xdl0;
import p149l.zqx;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class MediaPickerFrag extends MediaPickerBaseFrag {

    /* JADX INFO: renamed from: I */
    public RelativeLayout f54014I;

    /* JADX INFO: renamed from: J */
    public ImageView f54015J;

    /* JADX INFO: renamed from: K */
    public TextView f54016K;

    /* JADX INFO: renamed from: L */
    public ImageView f54017L;

    /* JADX INFO: renamed from: M */
    public VLinear f54018M;

    /* JADX INFO: renamed from: N */
    public FrameLayout f54019N;

    /* JADX INFO: renamed from: O */
    public VRecyclerView f54020O;

    /* JADX INFO: renamed from: P */
    public FolderSelectView f54021P;

    /* JADX INFO: renamed from: Q */
    public RelativeLayout f54022Q;

    /* JADX INFO: renamed from: R */
    public TextView f54023R;

    /* JADX INFO: renamed from: S */
    public VButton f54024S;

    /* JADX INFO: renamed from: T */
    public mti f54025T;

    /* JADX INFO: renamed from: U */
    public q860<iti> f54026U = q860.m173342b();

    /* JADX INFO: renamed from: V */
    public String f54027V;

    /* JADX INFO: renamed from: W */
    public tpx f54028W;

    /* JADX INFO: renamed from: X */
    public zqx f54029X;

    /* JADX INFO: renamed from: G5 */
    private void m78932G5() {
        this.f54015J.setOnClickListener(new View.OnClickListener() { // from class: l.wpx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f187584a.m78933J5(view);
            }
        });
        this.f54022Q.setOnClickListener(new View.OnClickListener() { // from class: l.hqx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MediaPickerFrag.m78958r5(view);
            }
        });
        boolean zIsRadio = this.f54011G.isRadio();
        VButton vButton = this.f54024S;
        if (zIsRadio) {
            vButton.setVisibility(8);
        } else {
            xdl0.m208329E0(vButton, new View.OnClickListener() { // from class: l.kqx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f124305a.m78934K5(view);
                }
            });
        }
        vwb.m200354z(vwb.m200324f0(this.f54016K, this.f54017L), new e30() { // from class: l.lqx
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f129446a.m78936M5((View) obj);
            }
        });
        this.f54021P.setOnClickListener(new View.OnClickListener() { // from class: l.mqx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f135311a.m78971N5(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J5 */
    public /* synthetic */ void m78933J5(View view) {
        act().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K5 */
    public /* synthetic */ void m78934K5(View view) {
        if (m78964A5()) {
            m78921M4();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L5 */
    public /* synthetic */ void m78935L5(View view) {
        m78983d6();
        if (xdl0.m208349O0(this.f54021P)) {
            m78965B5();
        } else {
            m78988j6();
        }
        zvf0.m220396r("e_album_list", "p_camera_local_album");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M5 */
    public /* synthetic */ void m78936M5(View view) {
        if (NullChecker.m81303a(view)) {
            view.setOnClickListener(new View.OnClickListener() { // from class: l.aqx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f71214a.m78935L5(view2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q5 */
    public /* synthetic */ Boolean m78937Q5(iti itiVar) {
        return Boolean.valueOf(itiVar.f114885b.equals(this.f54027V));
    }

    /* JADX INFO: renamed from: Z5 */
    private void m78938Z5() {
        nh0 nh0Var = this.f54006B;
        if (nh0Var != null) {
            nh0Var.m159377I();
        }
    }

    /* JADX INFO: renamed from: c6 */
    private void m78940c6() {
        TextView textView = this.f54016K;
        iti itiVar = this.f54013z.selectedFolder;
        textView.setText(itiVar == null ? getResources().getString(R$string.f17401Z) : itiVar.f114884a);
        MediaWrapper mediaWrapper = this.f54013z;
        iti itiVar2 = mediaWrapper.selectedFolder;
        this.f54006B.m159378J(itiVar2 == null ? mediaWrapper.allMediasInPhoto : itiVar2.f114886c);
    }

    /* JADX INFO: renamed from: e6 */
    private void m78943e6() {
        this.f54013z.setSelectedFolder((iti) vwb.m200346r(this.f54026U.f153135a, new w9j() { // from class: l.iqx
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f114563a.m78937Q5((iti) obj);
            }
        }));
        m78940c6();
    }

    /* JADX INFO: renamed from: k6 */
    private void m78950k6() {
        if (isAdded()) {
            TextView textView = this.f54016K;
            iti itiVar = this.f54013z.selectedFolder;
            textView.setText(itiVar == null ? act().getString(R$string.f17401Z) : itiVar.f114884a);
        }
    }

    /* JADX INFO: renamed from: l6 */
    private void m78952l6() {
        iti itiVar = (iti) vwb.m200346r(this.f54026U.f153135a, new w9j() { // from class: l.jqx
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f119333a.m78978V5((iti) obj);
            }
        });
        if (NullChecker.m81303a(this.f54013z.selectedFolder) && this.f54013z.selectedFolder.equals(itiVar)) {
            return;
        }
        this.f54013z.setSelectedFolder(itiVar);
        m78950k6();
    }

    /* JADX INFO: renamed from: p5 */
    public static /* synthetic */ q860 m78956p5(List list) {
        return new q860(vwb.m200303Q(list, new w9j() { // from class: l.gqx
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return iti.m138200b((nuh0) obj);
            }
        }), null);
    }

    /* JADX INFO: renamed from: r5 */
    public static /* synthetic */ void m78958r5(View view) {
    }

    /* JADX INFO: renamed from: A5 */
    public boolean m78964A5() {
        return this.f54013z.allSelectedMedias.size() > 0;
    }

    /* JADX INFO: renamed from: B5 */
    public final void m78965B5() {
        xdl0.m208344M(this.f54021P, false);
        this.f54017L.setRotation(0.0f);
    }

    @Override // p149l.hf20
    /* JADX INFO: renamed from: C */
    public Frag mo62514C() {
        return this;
    }

    /* JADX INFO: renamed from: C5 */
    public final void m78966C5() {
        C22306c<List<Media>> c22306cM117243u;
        if (act() == null || act().isFinishing() || getContext() == null) {
            return;
        }
        emx emxVar = new emx(act(), true, true, true, 80);
        MediaPickerParamsObject mediaPickerParamsObject = this.f54011G;
        if (mediaPickerParamsObject.videoPickConfig == null) {
            c22306cM117243u = emxVar.m117242t();
        } else {
            c22306cM117243u = mediaPickerParamsObject.imagePickConfig == null ? emxVar.m117243u() : emxVar.m117240r();
        }
        m78985g6(emxVar, c22306cM117243u);
        m78986h6(c22306cM117243u);
        act().getSupportLoaderManager().mo3088e(0, null, emxVar);
    }

    /* JADX INFO: renamed from: D5 */
    public void m78967D5() {
        MediaPickerParamsObject mediaPickerParamsObject = this.f54011G;
        if (mediaPickerParamsObject != null) {
            m78970I5(mediaPickerParamsObject.alreadySelectedImages);
            MediaPickerParamsObject mediaPickerParamsObject2 = this.f54011G;
            this.f54027V = mediaPickerParamsObject2.selectedFolderPath;
            MediaPickConfig mediaPickConfig = mediaPickerParamsObject2.imagePickConfig;
            if (mediaPickConfig != null) {
                MediaWrapper mediaWrapper = this.f54013z;
                mediaWrapper.imageCropProportion = mediaPickConfig.imageCropProportion;
                mediaWrapper.imageCropWidth = mediaPickConfig.imageCropWidth;
            }
        }
    }

    /* JADX INFO: renamed from: E5 */
    public void mo39311E5() {
        if (this.f54025T == null) {
            this.f54025T = new mti(act(), this.f54013z);
        }
    }

    /* JADX INFO: renamed from: F5 */
    public final void m78968F5() {
        if (this.f54011G.initialShowSelectFold) {
            m78988j6();
        } else {
            m78965B5();
        }
    }

    /* JADX INFO: renamed from: H5 */
    public MediaPickerParamsObject m78969H5(Bundle bundle) {
        return (MediaPickerParamsObject) bundle.getSerializable("params_object");
    }

    /* JADX INFO: renamed from: I5 */
    public final void m78970I5(List<Media> list) {
        if (NullChecker.m81303a(list)) {
            this.f54013z.clearAllSelectedMedia();
            Iterator<Media> it = list.iterator();
            while (it.hasNext()) {
                this.f54013z.addSelectedMedia(it.next());
            }
            m78989m6();
        }
    }

    /* JADX INFO: renamed from: N5 */
    public final /* synthetic */ void m78971N5(View view) {
        m78965B5();
    }

    /* JADX INFO: renamed from: O5 */
    public final /* synthetic */ void m78972O5() {
        this.f54013z.allMediasInPhoto.f153135a.clear();
        this.f54026U.f153135a.clear();
        m78966C5();
    }

    /* JADX INFO: renamed from: P5 */
    public final /* synthetic */ void m78973P5(Bundle bundle) {
        boolean z;
        boolean z2;
        if (!zqx.m219898k()) {
            PermissionHelper.m79882c().m79900r("android.permission.READ_EXTERNAL_STORAGE").m79905w(false).m79903u(true).m79897o(new d30() { // from class: l.zpx
                @Override // p149l.d30
                public final void call() {
                    this.f204321a.m78966C5();
                }
            }).m79891i(act());
            return;
        }
        zqx zqxVar = new zqx();
        this.f54029X = zqxVar;
        MediaPickerParamsObject mediaPickerParamsObject = this.f54011G;
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
        zqxVar.m219900e(getActivity(), this.f54018M, z, z2, new d30() { // from class: l.ypx
            @Override // p149l.d30
            public final void call() {
                this.f199507a.m78972O5();
            }
        }, null, null, null, null);
    }

    @Override // com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerBaseFrag
    /* JADX INFO: renamed from: Q4 */
    public void mo78925Q4() {
        mo39312Y5();
    }

    /* JADX INFO: renamed from: R5 */
    public final /* synthetic */ void m78974R5(View view) {
        if (this.f54013z.getFirstMedia() == null) {
            return;
        }
        mo62514C().startActivityForResult(MediaPreviewAct.m79024F2(act()).m79087j(this.f54013z.allSelectedMedias).m79084g(this.f54011G).m79083f(this.f54013z.getCurrentMaxCount(this.f54011G)).m79086i(this.f54013z.getFirstMedia()).m79078a(), 1);
    }

    /* JADX INFO: renamed from: S5 */
    public final /* synthetic */ void m78975S5(emx emxVar, List list) {
        boolean zM200296J = vwb.m200296J(this.f54013z.allMediasInPhoto.f153135a);
        MediaWrapper mediaWrapper = this.f54013z;
        if (zM200296J) {
            mediaWrapper.allMediasInPhoto = new q860<>(list, null);
            nh0 nh0Var = this.f54006B;
            if (nh0Var != null) {
                nh0Var.m159378J(this.f54013z.allMediasInPhoto);
            }
        } else {
            int size = mediaWrapper.allMediasInPhoto.f153135a.size();
            this.f54013z.allMediasInPhoto.f153135a.addAll(list);
            nh0 nh0Var2 = this.f54006B;
            if (nh0Var2 != null) {
                nh0Var2.notifyItemRangeInserted(size, list.size());
            }
        }
        if (emxVar.f92263g && NullChecker.m81303a(act())) {
            act().getSupportLoaderManager().mo3088e(0, null, emxVar);
        }
    }

    @Override // com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerBaseFrag
    /* JADX INFO: renamed from: T4 */
    public MediaItemRenderDecoration mo62530T4(MediaPickerParamsObject mediaPickerParamsObject) {
        return null;
    }

    /* JADX INFO: renamed from: T5 */
    public final /* synthetic */ void m78976T5(q860 q860Var) {
        if (act() == null || act().isFinishing() || getContext() == null) {
            return;
        }
        if (vwb.m200296J(this.f54026U.f153135a)) {
            this.f54026U = q860Var;
            m78943e6();
        } else {
            m78980X5(this.f54026U.f153135a, q860Var.f153135a);
            m78952l6();
        }
        if (this.f54011G.initialShowSelectFold) {
            m78983d6();
        }
    }

    @Override // com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerBaseFrag
    /* JADX INFO: renamed from: U4 */
    public MediaPickerParamsObject mo62532U4() {
        return m78969H5(getArguments());
    }

    /* JADX INFO: renamed from: U5 */
    public final /* synthetic */ void m78977U5() {
        this.f54020O.scrollToPosition(0);
    }

    @Override // com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerBaseFrag
    /* JADX INFO: renamed from: V4 */
    public vrx mo62534V4(MediaPickerParamsObject mediaPickerParamsObject) {
        if (this.f54010F == null) {
            switch (mediaPickerParamsObject.fromType) {
                case 1:
                case 9:
                    return qib0.f154714c0.mo97521l5();
                case 2:
                case 5:
                case 8:
                    return qib0.f154714c0.mo97504R0();
                case 3:
                    return qib0.f154714c0.mo97524t2();
                case 4:
                case 10:
                case 11:
                case 13:
                case 14:
                    return qib0.f154714c0.mo97500L0();
                case 7:
                    return qib0.f154714c0.mo97515d();
                case 12:
                case 15:
                case 17:
                    return qib0.f154714c0.mo97492A2();
                case 16:
                    m78930a5();
                    return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: V5 */
    public final /* synthetic */ Boolean m78978V5(iti itiVar) {
        return Boolean.valueOf(itiVar.f114885b.equals(this.f54027V));
    }

    /* JADX INFO: renamed from: W5 */
    public final /* synthetic */ void m78979W5(Media media) {
        boolean zM81303a = NullChecker.m81303a(media.originUrl);
        Map<String, Integer> map = this.f54005A;
        if (zM81303a) {
            map.put(media.originUrl, Integer.valueOf(this.f54013z.allMediasInPhoto.f153135a.indexOf(media)));
        } else {
            map.put(media.url, Integer.valueOf(this.f54013z.allMediasInPhoto.f153135a.indexOf(media)));
        }
    }

    @Override // com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerBaseFrag
    /* JADX INFO: renamed from: X4 */
    public RecyclerView mo62537X4() {
        return this.f54020O;
    }

    /* JADX INFO: renamed from: X5 */
    public List<iti> m78980X5(List<iti> list, List<iti> list2) {
        if (NullChecker.m81303a(list2) && list2.size() > 0) {
            for (int i = 0; i < list2.size(); i++) {
                iti itiVar = list2.get(i);
                if (list.contains(itiVar)) {
                    list.get(list.indexOf(itiVar)).f114887d += itiVar.f114887d;
                    list.get(list.indexOf(itiVar)).f114886c.f153135a.addAll(itiVar.f114886c.f153135a);
                } else {
                    list.add(itiVar);
                }
            }
        }
        return list;
    }

    /* JADX INFO: renamed from: Y5 */
    public void mo39312Y5() {
        if (this.f54013z.allSelectedMedias.isEmpty() || this.f54013z.allSelectedMedias.size() < this.f54011G.getMinImageSelectCount()) {
            this.f54023R.setClickable(false);
            this.f54023R.setTextColor(act().getResources().getColor(v0c0.f179099f));
            this.f54024S.setClickable(false);
            this.f54024S.setSelected(false);
        } else {
            this.f54023R.setClickable(true);
            this.f54023R.setTextColor(act().getResources().getColor(v0c0.f179096c));
            this.f54024S.setClickable(true);
            this.f54024S.setSelected(true);
        }
        m78982b6();
    }

    @Override // com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerBaseFrag
    /* JADX INFO: renamed from: Z4 */
    public void mo62540Z4(Media media, boolean z) {
        MediaWrapper mediaWrapper;
        final String str = z ? media.originUrl : media.url;
        this.f54005A.remove(str);
        this.f54013z.unCheckMedia(media);
        vwb.m200320d0(this.f54013z.allSelectedMedias, new w9j() { // from class: l.pqx
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(str.equalsIgnoreCase(((Media) obj).url));
            }
        });
        vwb.m200320d0(this.f54013z.allSelectedMedias, new w9j() { // from class: l.qqx
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(str.equalsIgnoreCase(((Media) obj).originUrl));
            }
        });
        if (vwb.m200296J(this.f54013z.allSelectedMedias)) {
            m78938Z5();
            return;
        }
        HashMap map = new HashMap();
        map.put(media.url, media);
        int i = 0;
        while (true) {
            int size = this.f54013z.allSelectedMedias.size();
            mediaWrapper = this.f54013z;
            if (i >= size) {
                break;
            }
            Media media2 = mediaWrapper.allSelectedMedias.get(i);
            boolean zContainsKey = this.f54005A.containsKey(media2.url);
            Map<String, Integer> map2 = this.f54005A;
            if (zContainsKey) {
                if (i != map2.get(media2.url).intValue()) {
                    this.f54005A.put(media2.url, Integer.valueOf(i));
                    map.put(media2.url, media2);
                }
            } else if (map2.containsKey(media2.originUrl) && i != this.f54005A.get(media2.originUrl).intValue()) {
                this.f54005A.put(media2.originUrl, Integer.valueOf(i));
                map.put(media2.originUrl, media2);
            }
            i++;
        }
        iti itiVar = mediaWrapper.selectedFolder;
        q860<Media> q860Var = itiVar == null ? mediaWrapper.allMediasInPhoto : itiVar.f114886c;
        for (int i2 = 0; i2 < q860Var.f153135a.size(); i2++) {
            Media media3 = q860Var.f153135a.get(i2);
            if (map.containsKey(media3.url)) {
                this.f54006B.notifyItemChanged(i2);
            } else if (map.containsKey(media3.originUrl)) {
                this.f54006B.notifyItemChanged(i2);
            }
        }
        if (this.f54005A.size() + 1 == this.f54011G.getMaxVideoSelectCount() || this.f54005A.size() + 1 == this.f54011G.getMaxImageSelectCount()) {
            m78938Z5();
        }
    }

    /* JADX INFO: renamed from: a6 */
    public final void m78981a6() {
        m78984f6();
        m78982b6();
        if (this.f54011G.isRadio()) {
            this.f54024S.setVisibility(8);
        }
        if (this.f54024S.getVisibility() == 8 && this.f54023R.getVisibility() == 8) {
            this.f54022Q.setVisibility(8);
        }
        if (NullChecker.m81303a(this.f54011G)) {
            int i = this.f54011G.fromType;
            if (i == 10 || i == 13 || i == 11) {
                this.f54022Q.setVisibility(8);
            }
        }
    }

    /* JADX INFO: renamed from: b6 */
    public final void m78982b6() {
        int currentCount = this.f54013z.getCurrentCount();
        VButton vButton = this.f54024S;
        if (currentCount == 0) {
            vButton.setText(this.f54011G.submitButtonTitle);
        } else {
            vButton.setText(String.format("%s %d", this.f54011G.submitButtonTitle, Integer.valueOf(this.f54013z.getCurrentCount())));
        }
    }

    /* JADX INFO: renamed from: d6 */
    public final void m78983d6() {
        mo39311E5();
        this.f54025T.m156231K(new e30() { // from class: l.dqx
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f87518a.m78987i6((iti) obj);
            }
        });
        this.f54021P.m79001b(this.f54025T);
        this.f54025T.m156230J(this.f54026U);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        creates(new e30() { // from class: l.nqx
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f140119a.m78973P5((Bundle) obj);
            }
        }, new d30() { // from class: l.oqx
            @Override // p149l.d30
            public final void call() {
                C13067a.m79022h(null);
            }
        });
    }

    /* JADX INFO: renamed from: f6 */
    public final void m78984f6() {
        boolean z = this.f54011G.needAllSelectedMediaPreview;
        TextView textView = this.f54023R;
        if (!z) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            this.f54023R.setOnClickListener(new View.OnClickListener() { // from class: l.xpx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f193964a.m78974R5(view);
                }
            });
        }
    }

    @Override // com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerBaseFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        m78932G5();
        mo39312Y5();
        m78981a6();
        m78991y5();
        m78938Z5();
        m78968F5();
    }

    /* JADX INFO: renamed from: g6 */
    public final void m78985g6(final emx emxVar, C22306c<List<Media>> c22306c) {
        c22306c.distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.eqx
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f92863a.m78975S5(emxVar, (List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h6 */
    public final void m78986h6(C22306c<List<Media>> c22306c) {
        c22306c.distinctUntilChanged().observeOn(Schedulers.m221493io()).compose(emx.m117236n(MediaPickerBaseAct.f54606k)).map(new w9j() { // from class: l.bqx
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return MediaPickerFrag.m78956p5((List) obj);
            }
        }).observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.cqx
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f82124a.m78976T5((q860) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i6 */
    public void m78987i6(iti itiVar) {
        this.f54013z.setSelectedFolder(itiVar);
        m78940c6();
        m20592l4(new Runnable() { // from class: l.fqx
            @Override // java.lang.Runnable
            public final void run() {
                this.f98863a.m78977U5();
            }
        });
        m78965B5();
        this.f54025T.m156229I();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM78990x5 = m78990x5(layoutInflater, viewGroup);
        this.f54024S.setTypeface(null, 1);
        if (this.f54011G.isNewUIAb) {
            this.f54015J.setImageResource(w2c0.f184165b0);
            this.f54017L.setImageResource(w2c0.f184205v0);
            this.f54016K.setTextColor(getResources().getColor(v0c0.f179097d));
        }
        return viewM78990x5;
    }

    /* JADX INFO: renamed from: j6 */
    public final void m78988j6() {
        xdl0.m208344M(this.f54021P, true);
        this.f54017L.setRotation(180.0f);
    }

    /* JADX INFO: renamed from: m6 */
    public final void m78989m6() {
        this.f54005A.clear();
        vwb.m200354z(this.f54013z.allSelectedMedias, new e30() { // from class: l.rqx
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f160700a.m78979W5((Media) obj);
            }
        });
        m78938Z5();
    }

    @Override // com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerBaseFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: n4 */
    public void mo20594n4(Bundle bundle) {
        super.mo20594n4(bundle);
        m78967D5();
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1 && i2 == -1) {
            m78970I5((ArrayList) intent.getSerializableExtra("extra_images"));
            mo78925Q4();
            if (NullChecker.m81303a(this.f54010F)) {
                this.f54010F.mo142779f(act(), this.f54013z, this.f54011G, intent);
                return;
            }
            return;
        }
        if (i == 1 && i2 == 555) {
            m78970I5((ArrayList) intent.getSerializableExtra("extra_images"));
            m78923O4();
            return;
        }
        if (i == 10000 && i2 == -1 && NullChecker.m81303a(intent)) {
            Serializable serializableExtra = intent.getSerializableExtra("camera_images_path");
            if (NullChecker.m81303a(serializableExtra)) {
                ArrayList<Media> arrayList = (ArrayList) serializableExtra;
                if (vwb.m200296J(arrayList)) {
                    return;
                }
                this.f54006B.m159379K(arrayList);
            }
        }
    }

    @Override // p149l.hf20
    /* JADX INFO: renamed from: q0 */
    public Video mo62549q0() {
        return (Video) this.f54013z.getSelectedVideo();
    }

    @Override // p149l.hf20
    /* JADX INFO: renamed from: x */
    public Map<String, Integer> mo62550x() {
        return this.f54005A;
    }

    /* JADX INFO: renamed from: x5 */
    public View m78990x5(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return sqx.m185617b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: y5 */
    public final void m78991y5() {
        View viewMo160198a;
        tpx tpxVarM78992z5 = m78992z5();
        this.f54028W = tpxVarM78992z5;
        if (tpxVarM78992z5 == null || (viewMo160198a = tpxVarM78992z5.mo160198a(act())) == null) {
            return;
        }
        viewMo160198a.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = viewMo160198a.getMeasuredHeight();
        VRecyclerView vRecyclerView = this.f54020O;
        xdl0.m208368c0(vRecyclerView, measuredHeight + vRecyclerView.getPaddingBottom());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        this.f54019N.addView(viewMo160198a, layoutParams);
    }

    /* JADX INFO: renamed from: z5 */
    public tpx m78992z5() {
        if (this.f54011G.fromType == 3) {
            return qib0.f154714c0.mo97497G2();
        }
        return null;
    }
}
