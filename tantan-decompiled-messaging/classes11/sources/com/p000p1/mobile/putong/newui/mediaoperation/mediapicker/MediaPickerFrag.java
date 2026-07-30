package com.p000p1.mobile.putong.newui.mediaoperation.mediapicker;

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
import com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerFrag;
import com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.decoration.MediaItemRenderDecoration;
import com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.folder.FolderSelectView;
import com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.util.C0469a;
import com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.util.MediaWrapper;
import com.p000p1.mobile.putong.newui.mediaoperation.preview.MediaPreviewAct;
import com.p000p1.mobile.putong.p004ui.mediapicker.MediaPickerBaseAct;
import com.p000p1.mobile.putong.p004ui.permission.PermissionHelper;
import com.p1.mobile.android.app.Frag;
import com.p1.mobile.putong.common.R;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Video;
import com.tantanapp.common.utils.NullChecker;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l.d30;
import l.e30;
import l.jo0;
import l.mkd0;
import l.nuh0;
import l.qib0;
import l.sqx;
import l.v0c0;
import l.vwb;
import l.w2c0;
import l.w9j;
import l.xdl0;
import l.zvf0;
import p009l.emx;
import p009l.iti;
import p009l.mti;
import p009l.nh0;
import p009l.q860;
import p009l.tpx;
import p009l.vrx;
import p009l.zqx;
import rx.c;
import rx.schedulers.Schedulers;
import v.VButton;
import v.VLinear;
import v.VRecyclerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class MediaPickerFrag extends MediaPickerBaseFrag {

    /* JADX INFO: renamed from: I */
    public RelativeLayout f7620I;

    /* JADX INFO: renamed from: J */
    public ImageView f7621J;

    /* JADX INFO: renamed from: K */
    public TextView f7622K;

    /* JADX INFO: renamed from: L */
    public ImageView f7623L;

    /* JADX INFO: renamed from: M */
    public VLinear f7624M;

    /* JADX INFO: renamed from: N */
    public FrameLayout f7625N;

    /* JADX INFO: renamed from: O */
    public VRecyclerView f7626O;

    /* JADX INFO: renamed from: P */
    public FolderSelectView f7627P;

    /* JADX INFO: renamed from: Q */
    public RelativeLayout f7628Q;

    /* JADX INFO: renamed from: R */
    public TextView f7629R;

    /* JADX INFO: renamed from: S */
    public VButton f7630S;

    /* JADX INFO: renamed from: T */
    public mti f7631T;

    /* JADX INFO: renamed from: U */
    public q860<iti> f7632U = q860.m20833b();

    /* JADX INFO: renamed from: V */
    public String f7633V;

    /* JADX INFO: renamed from: W */
    public tpx f7634W;

    /* JADX INFO: renamed from: X */
    public zqx f7635X;

    /* JADX INFO: renamed from: G5 */
    private void m9236G5() {
        this.f7621J.setOnClickListener(new View.OnClickListener() { // from class: l.wpx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22280a.m9237J5(view);
            }
        });
        this.f7628Q.setOnClickListener(new View.OnClickListener() { // from class: l.hqx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MediaPickerFrag.m9262r5(view);
            }
        });
        boolean zIsRadio = this.f7617G.isRadio();
        VButton vButton = this.f7630S;
        if (zIsRadio) {
            vButton.setVisibility(8);
        } else {
            xdl0.E0(vButton, new View.OnClickListener() { // from class: l.kqx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f15819a.m9238K5(view);
                }
            });
        }
        vwb.z(vwb.f0(new View[]{this.f7622K, this.f7623L}), new e30() { // from class: l.lqx
            public final void call(Object obj) {
                this.f16308a.m9240M5((View) obj);
            }
        });
        this.f7627P.setOnClickListener(new View.OnClickListener() { // from class: l.mqx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f17053a.m9276N5(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J5 */
    public /* synthetic */ void m9237J5(View view) {
        act().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K5 */
    public /* synthetic */ void m9238K5(View view) {
        if (m9268A5()) {
            m9219M4();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L5 */
    public /* synthetic */ void m9239L5(View view) {
        m9288d6();
        if (xdl0.O0(this.f7627P)) {
            m9269B5();
        } else {
            m9294j6();
        }
        zvf0.r("e_album_list", "p_camera_local_album");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M5 */
    public /* synthetic */ void m9240M5(View view) {
        if (NullChecker.a(view)) {
            view.setOnClickListener(new View.OnClickListener() { // from class: l.aqx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f9624a.m9239L5(view2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q5 */
    public /* synthetic */ Boolean m9241Q5(iti itiVar) {
        return Boolean.valueOf(itiVar.f14798b.equals(this.f7633V));
    }

    /* JADX INFO: renamed from: Z5 */
    private void m9242Z5() {
        nh0 nh0Var = this.f7612B;
        if (nh0Var != null) {
            nh0Var.m18873I();
        }
    }

    /* JADX INFO: renamed from: c6 */
    private void m9244c6() {
        TextView textView = this.f7622K;
        iti itiVar = this.f7619z.selectedFolder;
        textView.setText(itiVar == null ? getResources().getString(R.string.Z) : itiVar.f14797a);
        MediaWrapper mediaWrapper = this.f7619z;
        iti itiVar2 = mediaWrapper.selectedFolder;
        this.f7612B.m18874J(itiVar2 == null ? mediaWrapper.allMediasInPhoto : itiVar2.f14799c);
    }

    /* JADX INFO: renamed from: e6 */
    private void m9247e6() {
        this.f7619z.setSelectedFolder((iti) vwb.r(this.f7632U.f19068a, new w9j() { // from class: l.iqx
            public final Object call(Object obj) {
                return this.f14772a.m9241Q5((iti) obj);
            }
        }));
        m9244c6();
    }

    /* JADX INFO: renamed from: k6 */
    private void m9254k6() {
        if (isAdded()) {
            TextView textView = this.f7622K;
            iti itiVar = this.f7619z.selectedFolder;
            textView.setText(itiVar == null ? act().getString(R.string.Z) : itiVar.f14797a);
        }
    }

    /* JADX INFO: renamed from: l6 */
    private void m9256l6() {
        iti itiVar = (iti) vwb.r(this.f7632U.f19068a, new w9j() { // from class: l.jqx
            public final Object call(Object obj) {
                return this.f15262a.m9283V5((iti) obj);
            }
        });
        if (NullChecker.a(this.f7619z.selectedFolder) && this.f7619z.selectedFolder.equals(itiVar)) {
            return;
        }
        this.f7619z.setSelectedFolder(itiVar);
        m9254k6();
    }

    /* JADX INFO: renamed from: p5 */
    public static /* synthetic */ q860 m9260p5(List list) {
        return new q860(vwb.Q(list, new w9j() { // from class: l.gqx
            public final Object call(Object obj) {
                return iti.m16697b((nuh0) obj);
            }
        }), null);
    }

    /* JADX INFO: renamed from: r5 */
    public static /* synthetic */ void m9262r5(View view) {
    }

    /* JADX INFO: renamed from: A5 */
    public boolean m9268A5() {
        return this.f7619z.allSelectedMedias.size() > 0;
    }

    /* JADX INFO: renamed from: B5 */
    public final void m9269B5() {
        xdl0.M(this.f7627P, false);
        this.f7623L.setRotation(0.0f);
    }

    @Override // p009l.hf20
    /* JADX INFO: renamed from: C */
    public Frag mo9270C() {
        return this;
    }

    /* JADX INFO: renamed from: C5 */
    public final void m9271C5() {
        c<List<Media>> cVarM14000u;
        if (act() == null || act().isFinishing() || getContext() == null) {
            return;
        }
        emx emxVar = new emx(act(), true, true, true, 80);
        MediaPickerParamsObject mediaPickerParamsObject = this.f7617G;
        if (mediaPickerParamsObject.videoPickConfig == null) {
            cVarM14000u = emxVar.m13999t();
        } else {
            cVarM14000u = mediaPickerParamsObject.imagePickConfig == null ? emxVar.m14000u() : emxVar.m13997r();
        }
        m9291g6(emxVar, cVarM14000u);
        m9292h6(cVarM14000u);
        act().getSupportLoaderManager().e(0, (Bundle) null, emxVar);
    }

    /* JADX INFO: renamed from: D5 */
    public void m9272D5() {
        MediaPickerParamsObject mediaPickerParamsObject = this.f7617G;
        if (mediaPickerParamsObject != null) {
            m9275I5(mediaPickerParamsObject.alreadySelectedImages);
            MediaPickerParamsObject mediaPickerParamsObject2 = this.f7617G;
            this.f7633V = mediaPickerParamsObject2.selectedFolderPath;
            MediaPickConfig mediaPickConfig = mediaPickerParamsObject2.imagePickConfig;
            if (mediaPickConfig != null) {
                MediaWrapper mediaWrapper = this.f7619z;
                mediaWrapper.imageCropProportion = mediaPickConfig.imageCropProportion;
                mediaWrapper.imageCropWidth = mediaPickConfig.imageCropWidth;
            }
        }
    }

    /* JADX INFO: renamed from: E5 */
    public void mo3336E5() {
        if (this.f7631T == null) {
            this.f7631T = new mti(act(), this.f7619z);
        }
    }

    /* JADX INFO: renamed from: F5 */
    public final void m9273F5() {
        if (this.f7617G.initialShowSelectFold) {
            m9294j6();
        } else {
            m9269B5();
        }
    }

    /* JADX INFO: renamed from: H5 */
    public MediaPickerParamsObject m9274H5(Bundle bundle) {
        return (MediaPickerParamsObject) bundle.getSerializable("params_object");
    }

    /* JADX INFO: renamed from: I5 */
    public final void m9275I5(List<Media> list) {
        if (NullChecker.a(list)) {
            this.f7619z.clearAllSelectedMedia();
            Iterator<Media> it = list.iterator();
            while (it.hasNext()) {
                this.f7619z.addSelectedMedia(it.next());
            }
            m9295m6();
        }
    }

    /* JADX INFO: renamed from: N5 */
    public final /* synthetic */ void m9276N5(View view) {
        m9269B5();
    }

    /* JADX INFO: renamed from: O5 */
    public final /* synthetic */ void m9277O5() {
        this.f7619z.allMediasInPhoto.f19068a.clear();
        this.f7632U.f19068a.clear();
        m9271C5();
    }

    /* JADX INFO: renamed from: P5 */
    public final /* synthetic */ void m9278P5(Bundle bundle) {
        boolean z;
        boolean z2;
        if (!zqx.m25938k()) {
            PermissionHelper.m10211c().m10229r("android.permission.READ_EXTERNAL_STORAGE").m10234w(false).m10232u(true).m10226o(new d30() { // from class: l.zpx
                public final void call() {
                    this.f23829a.m9271C5();
                }
            }).m10220i(act());
            return;
        }
        zqx zqxVar = new zqx();
        this.f7635X = zqxVar;
        MediaPickerParamsObject mediaPickerParamsObject = this.f7617G;
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
        zqxVar.m25940e(getActivity(), this.f7624M, z, z2, new d30() { // from class: l.ypx
            public final void call() {
                this.f23205a.m9277O5();
            }
        }, null, null, null, null);
    }

    @Override // com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerBaseFrag
    /* JADX INFO: renamed from: Q4 */
    public void mo9223Q4() {
        mo3337Y5();
    }

    /* JADX INFO: renamed from: R5 */
    public final /* synthetic */ void m9279R5(View view) {
        if (this.f7619z.getFirstMedia() == null) {
            return;
        }
        mo9270C().startActivityForResult(MediaPreviewAct.m9332F2(act()).m9395j(this.f7619z.allSelectedMedias).m9392g(this.f7617G).m9391f(this.f7619z.getCurrentMaxCount(this.f7617G)).m9394i(this.f7619z.getFirstMedia()).m9386a(), 1);
    }

    /* JADX INFO: renamed from: S5 */
    public final /* synthetic */ void m9280S5(emx emxVar, List list) {
        boolean zJ = vwb.J(this.f7619z.allMediasInPhoto.f19068a);
        MediaWrapper mediaWrapper = this.f7619z;
        if (zJ) {
            mediaWrapper.allMediasInPhoto = new q860<>(list, null);
            nh0 nh0Var = this.f7612B;
            if (nh0Var != null) {
                nh0Var.m18874J(this.f7619z.allMediasInPhoto);
            }
        } else {
            int size = mediaWrapper.allMediasInPhoto.f19068a.size();
            this.f7619z.allMediasInPhoto.f19068a.addAll(list);
            nh0 nh0Var2 = this.f7612B;
            if (nh0Var2 != null) {
                nh0Var2.notifyItemRangeInserted(size, list.size());
            }
        }
        if (emxVar.f12614g && NullChecker.a(act())) {
            act().getSupportLoaderManager().e(0, (Bundle) null, emxVar);
        }
    }

    @Override // com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerBaseFrag
    /* JADX INFO: renamed from: T4 */
    public MediaItemRenderDecoration mo9226T4(MediaPickerParamsObject mediaPickerParamsObject) {
        return null;
    }

    /* JADX INFO: renamed from: T5 */
    public final /* synthetic */ void m9281T5(q860 q860Var) {
        if (act() == null || act().isFinishing() || getContext() == null) {
            return;
        }
        if (vwb.J(this.f7632U.f19068a)) {
            this.f7632U = q860Var;
            m9247e6();
        } else {
            m9285X5(this.f7632U.f19068a, q860Var.f19068a);
            m9256l6();
        }
        if (this.f7617G.initialShowSelectFold) {
            m9288d6();
        }
    }

    @Override // com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerBaseFrag
    /* JADX INFO: renamed from: U4 */
    public MediaPickerParamsObject mo9227U4() {
        return m9274H5(getArguments());
    }

    /* JADX INFO: renamed from: U5 */
    public final /* synthetic */ void m9282U5() {
        this.f7626O.scrollToPosition(0);
    }

    @Override // com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerBaseFrag
    /* JADX INFO: renamed from: V4 */
    public vrx mo9228V4(MediaPickerParamsObject mediaPickerParamsObject) {
        if (this.f7616F == null) {
            switch (mediaPickerParamsObject.fromType) {
                case 1:
                case MediaPickerParamsObject.FROM_JS_BRIDGE_SWIPE_CARD /* 9 */:
                    return qib0.c0.l5();
                case 2:
                case 5:
                case 8:
                    return qib0.c0.R0();
                case 3:
                    return qib0.c0.t2();
                case 4:
                case 10:
                case MediaPickerParamsObject.FROM_CHAT_SWITCH_BACK_PIC /* 11 */:
                case MediaPickerParamsObject.FROM_CHAT_LIMIT_SHOOT_PIC /* 13 */:
                case MediaPickerParamsObject.FROM_CITY_CENTER_UPLOAD_PIC /* 14 */:
                    return qib0.c0.L0();
                case 7:
                    return qib0.c0.d();
                case MediaPickerParamsObject.FROM_PROFILE_WEALTH /* 12 */:
                case MediaPickerParamsObject.FROM_PROFILE_GAME /* 15 */:
                case MediaPickerParamsObject.FROM_PROFILE_PET /* 17 */:
                    return qib0.c0.A2();
                case MediaPickerParamsObject.FROM_DEFAULT /* 16 */:
                    m9233a5();
                    return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: V5 */
    public final /* synthetic */ Boolean m9283V5(iti itiVar) {
        return Boolean.valueOf(itiVar.f14798b.equals(this.f7633V));
    }

    /* JADX INFO: renamed from: W5 */
    public final /* synthetic */ void m9284W5(Media media) {
        boolean zA = NullChecker.a(media.originUrl);
        Map<String, Integer> map = this.f7611A;
        if (zA) {
            map.put(media.originUrl, Integer.valueOf(this.f7619z.allMediasInPhoto.f19068a.indexOf(media)));
        } else {
            map.put(media.url, Integer.valueOf(this.f7619z.allMediasInPhoto.f19068a.indexOf(media)));
        }
    }

    @Override // com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerBaseFrag
    /* JADX INFO: renamed from: X4 */
    public RecyclerView mo9230X4() {
        return this.f7626O;
    }

    /* JADX INFO: renamed from: X5 */
    public List<iti> m9285X5(List<iti> list, List<iti> list2) {
        if (NullChecker.a(list2) && list2.size() > 0) {
            for (int i = 0; i < list2.size(); i++) {
                iti itiVar = list2.get(i);
                if (list.contains(itiVar)) {
                    list.get(list.indexOf(itiVar)).f14800d += itiVar.f14800d;
                    list.get(list.indexOf(itiVar)).f14799c.f19068a.addAll(itiVar.f14799c.f19068a);
                } else {
                    list.add(itiVar);
                }
            }
        }
        return list;
    }

    /* JADX INFO: renamed from: Y5 */
    public void mo3337Y5() {
        if (this.f7619z.allSelectedMedias.isEmpty() || this.f7619z.allSelectedMedias.size() < this.f7617G.getMinImageSelectCount()) {
            this.f7629R.setClickable(false);
            this.f7629R.setTextColor(act().getResources().getColor(v0c0.f));
            this.f7630S.setClickable(false);
            this.f7630S.setSelected(false);
        } else {
            this.f7629R.setClickable(true);
            this.f7629R.setTextColor(act().getResources().getColor(v0c0.c));
            this.f7630S.setClickable(true);
            this.f7630S.setSelected(true);
        }
        m9287b6();
    }

    @Override // com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerBaseFrag
    /* JADX INFO: renamed from: Z4 */
    public void mo9232Z4(Media media, boolean z) {
        MediaWrapper mediaWrapper;
        final String str = z ? media.originUrl : media.url;
        this.f7611A.remove(str);
        this.f7619z.unCheckMedia(media);
        vwb.d0(this.f7619z.allSelectedMedias, new w9j() { // from class: l.pqx
            public final Object call(Object obj) {
                return Boolean.valueOf(str.equalsIgnoreCase(((Media) obj).url));
            }
        });
        vwb.d0(this.f7619z.allSelectedMedias, new w9j() { // from class: l.qqx
            public final Object call(Object obj) {
                return Boolean.valueOf(str.equalsIgnoreCase(((Media) obj).originUrl));
            }
        });
        if (vwb.J(this.f7619z.allSelectedMedias)) {
            m9242Z5();
            return;
        }
        HashMap map = new HashMap();
        map.put(media.url, media);
        int i = 0;
        while (true) {
            int size = this.f7619z.allSelectedMedias.size();
            mediaWrapper = this.f7619z;
            if (i >= size) {
                break;
            }
            Media media2 = mediaWrapper.allSelectedMedias.get(i);
            boolean zContainsKey = this.f7611A.containsKey(media2.url);
            Map<String, Integer> map2 = this.f7611A;
            if (zContainsKey) {
                if (i != map2.get(media2.url).intValue()) {
                    this.f7611A.put(media2.url, Integer.valueOf(i));
                    map.put(media2.url, media2);
                }
            } else if (map2.containsKey(media2.originUrl) && i != this.f7611A.get(media2.originUrl).intValue()) {
                this.f7611A.put(media2.originUrl, Integer.valueOf(i));
                map.put(media2.originUrl, media2);
            }
            i++;
        }
        iti itiVar = mediaWrapper.selectedFolder;
        q860<Media> q860Var = itiVar == null ? mediaWrapper.allMediasInPhoto : itiVar.f14799c;
        for (int i2 = 0; i2 < q860Var.f19068a.size(); i2++) {
            Media media3 = q860Var.f19068a.get(i2);
            if (map.containsKey(media3.url)) {
                this.f7612B.notifyItemChanged(i2);
            } else if (map.containsKey(media3.originUrl)) {
                this.f7612B.notifyItemChanged(i2);
            }
        }
        if (this.f7611A.size() + 1 == this.f7617G.getMaxVideoSelectCount() || this.f7611A.size() + 1 == this.f7617G.getMaxImageSelectCount()) {
            m9242Z5();
        }
    }

    /* JADX INFO: renamed from: a6 */
    public final void m9286a6() {
        m9290f6();
        m9287b6();
        if (this.f7617G.isRadio()) {
            this.f7630S.setVisibility(8);
        }
        if (this.f7630S.getVisibility() == 8 && this.f7629R.getVisibility() == 8) {
            this.f7628Q.setVisibility(8);
        }
        if (NullChecker.a(this.f7617G)) {
            int i = this.f7617G.fromType;
            if (i == 10 || i == 13 || i == 11) {
                this.f7628Q.setVisibility(8);
            }
        }
    }

    /* JADX INFO: renamed from: b6 */
    public final void m9287b6() {
        int currentCount = this.f7619z.getCurrentCount();
        VButton vButton = this.f7630S;
        if (currentCount == 0) {
            vButton.setText(this.f7617G.submitButtonTitle);
        } else {
            vButton.setText(String.format("%s %d", this.f7617G.submitButtonTitle, Integer.valueOf(this.f7619z.getCurrentCount())));
        }
    }

    /* JADX INFO: renamed from: d6 */
    public final void m9288d6() {
        mo3336E5();
        this.f7631T.m18596K(new e30() { // from class: l.dqx
            public final void call(Object obj) {
                this.f11955a.m9293i6((iti) obj);
            }
        });
        this.f7627P.m9309b(this.f7631T);
        this.f7631T.m18595J(this.f7632U);
    }

    /* JADX INFO: renamed from: f4 */
    public void m9289f4() {
        super.f4();
        creates(new e30() { // from class: l.nqx
            public final void call(Object obj) {
                this.f17620a.m9278P5((Bundle) obj);
            }
        }, new d30() { // from class: l.oqx
            public final void call() {
                C0469a.m9330h(null);
            }
        });
    }

    /* JADX INFO: renamed from: f6 */
    public final void m9290f6() {
        boolean z = this.f7617G.needAllSelectedMediaPreview;
        TextView textView = this.f7629R;
        if (!z) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            this.f7629R.setOnClickListener(new View.OnClickListener() { // from class: l.xpx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f22693a.m9279R5(view);
                }
            });
        }
    }

    @Override // com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerBaseFrag
    /* JADX INFO: renamed from: g4 */
    public void mo3338g4(Bundle bundle) {
        super.mo3338g4(bundle);
        m9236G5();
        mo3337Y5();
        m9286a6();
        m9299y5();
        m9242Z5();
        m9273F5();
    }

    /* JADX INFO: renamed from: g6 */
    public final void m9291g6(final emx emxVar, c<List<Media>> cVar) {
        cVar.distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.eqx
            public final void call(Object obj) {
                this.f12662a.m9280S5(emxVar, (List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h6 */
    public final void m9292h6(c<List<Media>> cVar) {
        cVar.distinctUntilChanged().observeOn(Schedulers.io()).compose(emx.m13990n(MediaPickerBaseAct.f8212k)).map(new w9j() { // from class: l.bqx
            public final Object call(Object obj) {
                return MediaPickerFrag.m9260p5((List) obj);
            }
        }).observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.cqx
            public final void call(Object obj) {
                this.f10731a.m9281T5((q860) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i6 */
    public void m9293i6(iti itiVar) {
        this.f7619z.setSelectedFolder(itiVar);
        m9244c6();
        l4(new Runnable() { // from class: l.fqx
            @Override // java.lang.Runnable
            public final void run() {
                this.f13139a.m9282U5();
            }
        });
        m9269B5();
        this.f7631T.m18594I();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM9298x5 = m9298x5(layoutInflater, viewGroup);
        this.f7630S.setTypeface(null, 1);
        if (this.f7617G.isNewUIAb) {
            this.f7621J.setImageResource(w2c0.b0);
            this.f7623L.setImageResource(w2c0.v0);
            this.f7622K.setTextColor(getResources().getColor(v0c0.d));
        }
        return viewM9298x5;
    }

    /* JADX INFO: renamed from: j6 */
    public final void m9294j6() {
        xdl0.M(this.f7627P, true);
        this.f7623L.setRotation(180.0f);
    }

    /* JADX INFO: renamed from: m6 */
    public final void m9295m6() {
        this.f7611A.clear();
        vwb.z(this.f7619z.allSelectedMedias, new e30() { // from class: l.rqx
            public final void call(Object obj) {
                this.f19953a.m9284W5((Media) obj);
            }
        });
        m9242Z5();
    }

    @Override // com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerBaseFrag
    /* JADX INFO: renamed from: n4 */
    public void mo3339n4(Bundle bundle) {
        super.mo3339n4(bundle);
        m9272D5();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super/*com.p1.mobile.android.app.Frag*/.onActivityResult(i, i2, intent);
        if (i == 1 && i2 == -1) {
            m9275I5((ArrayList) intent.getSerializableExtra("extra_images"));
            mo9223Q4();
            if (NullChecker.a(this.f7616F)) {
                this.f7616F.m23708f(act(), this.f7619z, this.f7617G, intent);
                return;
            }
            return;
        }
        if (i == 1 && i2 == 555) {
            m9275I5((ArrayList) intent.getSerializableExtra("extra_images"));
            m9221O4();
            return;
        }
        if (i == 10000 && i2 == -1 && NullChecker.a(intent)) {
            Serializable serializableExtra = intent.getSerializableExtra("camera_images_path");
            if (NullChecker.a(serializableExtra)) {
                ArrayList<Media> arrayList = (ArrayList) serializableExtra;
                if (vwb.J(arrayList)) {
                    return;
                }
                this.f7612B.m18875K(arrayList);
            }
        }
    }

    @Override // p009l.hf20
    /* JADX INFO: renamed from: q0 */
    public Video mo9296q0() {
        return this.f7619z.getSelectedVideo();
    }

    @Override // p009l.hf20
    /* JADX INFO: renamed from: x */
    public Map<String, Integer> mo9297x() {
        return this.f7611A;
    }

    /* JADX INFO: renamed from: x5 */
    public View m9298x5(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return sqx.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: y5 */
    public final void m9299y5() {
        View viewM22620a;
        tpx tpxVarM9300z5 = m9300z5();
        this.f7634W = tpxVarM9300z5;
        if (tpxVarM9300z5 == null || (viewM22620a = tpxVarM9300z5.m22620a(act())) == null) {
            return;
        }
        viewM22620a.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = viewM22620a.getMeasuredHeight();
        VRecyclerView vRecyclerView = this.f7626O;
        xdl0.c0(vRecyclerView, measuredHeight + vRecyclerView.getPaddingBottom());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        this.f7625N.addView(viewM22620a, layoutParams);
    }

    /* JADX INFO: renamed from: z5 */
    public tpx m9300z5() {
        if (this.f7617G.fromType == 3) {
            return qib0.c0.G2();
        }
        return null;
    }
}
