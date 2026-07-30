package com.p046p1.mobile.putong.feed.newui.camera.widget;

import android.animation.Animator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.CameraSticker;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p149l.dac0;
import p149l.e30;
import p149l.j760;
import p149l.jo0;
import p149l.lsi0;
import p149l.mkd0;
import p149l.o6c0;
import p149l.xck0;
import p149l.yb4;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.c */
/* JADX INFO: loaded from: classes12.dex */
public class C11186c extends dac0<CameraSticker> {

    /* JADX INFO: renamed from: d */
    public Context f39857d;

    /* JADX INFO: renamed from: i */
    public CameraSticker f39862i;

    /* JADX INFO: renamed from: j */
    public MaskMenuView.InterfaceC11179a f39863j;

    /* JADX INFO: renamed from: k */
    public int f39864k;

    /* JADX INFO: renamed from: e */
    public List<CameraSticker> f39858e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public HashMap<String, Animator> f39859f = new HashMap<>();

    /* JADX INFO: renamed from: g */
    public int f39860g = -1;

    /* JADX INFO: renamed from: h */
    public int f39861h = -1;

    /* JADX INFO: renamed from: c */
    public final e30<j760<CameraSticker, Integer>> f39856c = xck0.m208120a(300, new e30() { // from class: l.z84
        @Override // p149l.e30
        public final void call(Object obj) {
            this.f202100a.m61770K((j760) obj);
        }
    });

    public C11186c(Context context) {
        this.f39857d = context;
        mo67374c(act(), yb4.m213936c().f197305f).observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.a94
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f68109a.m61774L((CameraSticker) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m61770K(j760 j760Var) {
        m61779Q((CameraSticker) j760Var.f116564a, ((Integer) j760Var.f116565b).intValue());
    }

    private Act act() {
        return (Act) this.f39857d;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f39858e.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return act().inflater().inflate(o6c0.f142134X, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, CameraSticker cameraSticker, int i, int i2) {
        if (((CameraMaskItemView) view).m61425d(cameraSticker, this, this.f39859f, i2, yb4.m213936c().m213940e())) {
            this.f39860g = i2;
        }
    }

    /* JADX INFO: renamed from: I */
    public void m61772I() {
        m61778P(null, -1);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public CameraSticker getItem(int i) {
        return this.f39858e.get(i);
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m61775M(CameraSticker cameraSticker, int i, File file) {
        if (NullChecker.m81303a(file)) {
            cameraSticker.state = 3;
            cameraSticker.hasModelFile = true;
            cameraSticker.modelFilePath = file.getAbsolutePath();
        } else {
            cameraSticker.state = 4;
            lsi0.m151578h(R$string.f39131q1);
        }
        m61776N(cameraSticker);
        CameraSticker cameraStickerM213938b = yb4.m213936c().m213938b();
        if (NullChecker.m81304b(cameraStickerM213938b) && TextUtils.equals(cameraStickerM213938b.cId, cameraSticker.cId) && this.f39861h == i && cameraSticker.hasModelFile && NullChecker.m81303a(this.f39863j)) {
            this.f39863j.mo61691b(cameraSticker, this.f39864k, false);
            m61778P(cameraSticker, i);
        }
        notifyItemChanged(i);
    }

    /* JADX INFO: renamed from: N */
    public final void m61776N(CameraSticker cameraSticker) {
        int i = cameraSticker.state;
        if (i != 2) {
            if (i == 3) {
                yb4.m213936c().f197305f.m132487l(cameraSticker);
                yb4.m213936c().m213939d().remove(cameraSticker.f39219id);
                return;
            } else if (i != 4) {
                return;
            }
        }
        yb4.m213936c().f197305f.m132487l(cameraSticker);
        yb4.m213936c().m213939d().put(cameraSticker.f39219id, cameraSticker);
    }

    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public void m61774L(@Nullable CameraSticker cameraSticker) {
        CameraSticker cameraSticker2;
        if (NullChecker.m81303a(this.f39858e) && NullChecker.m81303a(cameraSticker)) {
            for (int i = 0; i < this.f39858e.size() && (cameraSticker2 = this.f39858e.get(i)) != cameraSticker; i++) {
                if (NullChecker.m81304b(cameraSticker2) && TextUtils.equals(cameraSticker2.f39219id, cameraSticker.f39219id)) {
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
    public final void m61778P(CameraSticker cameraSticker, int i) {
        int i2 = this.f39860g;
        this.f39860g = i;
        this.f39862i = cameraSticker;
        notifyItemChanged(i);
        notifyItemChanged(i2);
    }

    /* JADX INFO: renamed from: Q */
    public final void m61779Q(final CameraSticker cameraSticker, final int i) {
        yb4.m213936c().m213945j(cameraSticker);
        this.f39861h = i;
        yb4.m213936c().m213947l(cameraSticker);
        if (cameraSticker.hasModelFile) {
            if (NullChecker.m81303a(this.f39863j)) {
                this.f39863j.mo61691b(cameraSticker, this.f39864k, false);
            }
            m61778P(cameraSticker, i);
        } else {
            if (cameraSticker.state == 2) {
                return;
            }
            cameraSticker.state = 2;
            m61776N(cameraSticker);
            act().duringCreated(FeedModule.f38853b.m60517c2(cameraSticker)).subscribe(mkd0.m154955G(new e30() { // from class: l.b94
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f74194a.m61775M(cameraSticker, i, (File) obj);
                }
            }));
        }
        notifyItemChanged(i);
    }

    /* JADX INFO: renamed from: R */
    public void m61780R(MaskMenuView.InterfaceC11179a interfaceC11179a) {
        this.f39863j = interfaceC11179a;
    }

    /* JADX INFO: renamed from: S */
    public void m61781S(@Nullable List<CameraSticker> list) {
        if (NullChecker.m81303a(list)) {
            this.f39858e = list;
            yb4.m213936c().m213941f(list);
            notifyDataSetChanged();
        }
    }
}
