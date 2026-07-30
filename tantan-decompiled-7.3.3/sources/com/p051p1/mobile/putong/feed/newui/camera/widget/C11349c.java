package com.p051p1.mobile.putong.feed.newui.camera.widget;

import android.animation.Animator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.CameraSticker;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p153l.dmk0;
import p153l.fo0;
import p153l.jic0;
import p153l.o1j0;
import p153l.pf60;
import p153l.psd0;
import p153l.tec0;
import p153l.xc4;
import p153l.y20;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.c */
/* JADX INFO: loaded from: classes13.dex */
public class C11349c extends jic0<CameraSticker> {

    /* JADX INFO: renamed from: d */
    public Context f40705d;

    /* JADX INFO: renamed from: i */
    public CameraSticker f40710i;

    /* JADX INFO: renamed from: j */
    public MaskMenuView.InterfaceC11342a f40711j;

    /* JADX INFO: renamed from: k */
    public int f40712k;

    /* JADX INFO: renamed from: e */
    public List<CameraSticker> f40706e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public HashMap<String, Animator> f40707f = new HashMap<>();

    /* JADX INFO: renamed from: g */
    public int f40708g = -1;

    /* JADX INFO: renamed from: h */
    public int f40709h = -1;

    /* JADX INFO: renamed from: c */
    public final y20<pf60<CameraSticker, Integer>> f40704c = dmk0.m116962a(300, new y20() { // from class: l.y94
        @Override // p153l.y20
        public final void call(Object obj) {
            this.f198063a.m62953K((pf60) obj);
        }
    });

    public C11349c(Context context) {
        this.f40705d = context;
        mo68557c(act(), xc4.m210114c().f193263f).observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.z94
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f203443a.m62957L((CameraSticker) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m62953K(pf60 pf60Var) {
        m62962Q((CameraSticker) pf60Var.f152156a, ((Integer) pf60Var.f152157b).intValue());
    }

    private Act act() {
        return (Act) this.f40705d;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f40706e.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return act().inflater().inflate(tec0.f173603X, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, CameraSticker cameraSticker, int i, int i2) {
        if (((CameraMaskItemView) view).m62609d(cameraSticker, this, this.f40707f, i2, xc4.m210114c().m210118e())) {
            this.f40708g = i2;
        }
    }

    /* JADX INFO: renamed from: I */
    public void m62955I() {
        m62961P(null, -1);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public CameraSticker getItem(int i) {
        return this.f40706e.get(i);
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m62958M(CameraSticker cameraSticker, int i, File file) {
        if (NullChecker.m82486a(file)) {
            cameraSticker.state = 3;
            cameraSticker.hasModelFile = true;
            cameraSticker.modelFilePath = file.getAbsolutePath();
        } else {
            cameraSticker.state = 4;
            o1j0.m165634h(R$string.f39979q1);
        }
        m62959N(cameraSticker);
        CameraSticker cameraStickerM210116b = xc4.m210114c().m210116b();
        if (NullChecker.m82487b(cameraStickerM210116b) && TextUtils.equals(cameraStickerM210116b.cId, cameraSticker.cId) && this.f40709h == i && cameraSticker.hasModelFile && NullChecker.m82486a(this.f40711j)) {
            this.f40711j.mo62875b(cameraSticker, this.f40712k, false);
            m62961P(cameraSticker, i);
        }
        notifyItemChanged(i);
    }

    /* JADX INFO: renamed from: N */
    public final void m62959N(CameraSticker cameraSticker) {
        int i = cameraSticker.state;
        if (i != 2) {
            if (i == 3) {
                xc4.m210114c().f193263f.m137019l(cameraSticker);
                xc4.m210114c().m210117d().remove(cameraSticker.f40067id);
                return;
            } else if (i != 4) {
                return;
            }
        }
        xc4.m210114c().f193263f.m137019l(cameraSticker);
        xc4.m210114c().m210117d().put(cameraSticker.f40067id, cameraSticker);
    }

    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public void m62957L(@Nullable CameraSticker cameraSticker) {
        CameraSticker cameraSticker2;
        if (NullChecker.m82486a(this.f40706e) && NullChecker.m82486a(cameraSticker)) {
            for (int i = 0; i < this.f40706e.size() && (cameraSticker2 = this.f40706e.get(i)) != cameraSticker; i++) {
                if (NullChecker.m82487b(cameraSticker2) && TextUtils.equals(cameraSticker2.f40067id, cameraSticker.f40067id)) {
                    int i2 = cameraSticker.state;
                    cameraSticker2.state = i2;
                    if (i2 == 3) {
                        cameraSticker2.hasModelFile = true;
                        cameraSticker2.modelFilePath = cameraSticker.modelFilePath;
                    }
                    notifyItemChanged(i);
                }
            }
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m62961P(CameraSticker cameraSticker, int i) {
        int i2 = this.f40708g;
        this.f40708g = i;
        this.f40710i = cameraSticker;
        notifyItemChanged(i);
        notifyItemChanged(i2);
    }

    /* JADX INFO: renamed from: Q */
    public final void m62962Q(final CameraSticker cameraSticker, final int i) {
        xc4.m210114c().m210123j(cameraSticker);
        this.f40709h = i;
        xc4.m210114c().m210125l(cameraSticker);
        if (cameraSticker.hasModelFile) {
            if (NullChecker.m82486a(this.f40711j)) {
                this.f40711j.mo62875b(cameraSticker, this.f40712k, false);
            }
            m62961P(cameraSticker, i);
        } else {
            if (cameraSticker.state == 2) {
                return;
            }
            cameraSticker.state = 2;
            m62959N(cameraSticker);
            act().duringCreated(FeedModule.f39701b.m61701c2(cameraSticker)).subscribe(psd0.m173596G(new y20() { // from class: l.aa4
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f69100a.m62958M(cameraSticker, i, (File) obj);
                }
            }));
        }
        notifyItemChanged(i);
    }

    /* JADX INFO: renamed from: R */
    public void m62963R(MaskMenuView.InterfaceC11342a interfaceC11342a) {
        this.f40711j = interfaceC11342a;
    }

    /* JADX INFO: renamed from: S */
    public void m62964S(@Nullable List<CameraSticker> list) {
        if (NullChecker.m82486a(list)) {
            this.f40706e = list;
            xc4.m210114c().m210119f(list);
            notifyDataSetChanged();
        }
    }
}
