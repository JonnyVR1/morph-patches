package com.p000p1.mobile.putong.feed.newui.camera.widget;

import android.animation.Animator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.data.GivenGiftBrief;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.CameraSticker;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import l.dac0;
import l.e30;
import l.j760;
import l.jo0;
import l.lsi0;
import l.mkd0;
import l.xck0;
import p007l.o6c0;
import p007l.yb4;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.c */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class C2030c extends dac0<CameraSticker> {

    /* JADX INFO: renamed from: d */
    public Context f1318d;

    /* JADX INFO: renamed from: i */
    public CameraSticker f1323i;

    /* JADX INFO: renamed from: j */
    public MaskMenuView.InterfaceC2023a f1324j;

    /* JADX INFO: renamed from: k */
    public int f1325k;

    /* JADX INFO: renamed from: e */
    public List<CameraSticker> f1319e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public HashMap<String, Animator> f1320f = new HashMap<>();

    /* JADX INFO: renamed from: g */
    public int f1321g = -1;

    /* JADX INFO: renamed from: h */
    public int f1322h = -1;

    /* JADX INFO: renamed from: c */
    public final e30<j760<CameraSticker, Integer>> f1317c = xck0.a(GivenGiftBrief.LUXURY_GIFT_LEVEL, new e30() { // from class: l.z84
        public final void call(Object obj) {
            this.f15643a.m2728K((j760) obj);
        }
    });

    public C2030c(Context context) {
        this.f1318d = context;
        c(act(), yb4.m17102c().f15387f).observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.a94
            public final void call(Object obj) {
                this.f5664a.m2735L((CameraSticker) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m2728K(j760 j760Var) {
        m2740Q((CameraSticker) j760Var.a, ((Integer) j760Var.b).intValue());
    }

    private Act act() {
        return this.f1318d;
    }

    /* JADX INFO: renamed from: C */
    public int m2730C() {
        return this.f1319e.size();
    }

    /* JADX INFO: renamed from: D */
    public View m2731D(ViewGroup viewGroup, int i) {
        return act().inflater().inflate(o6c0.f11153X, viewGroup, false);
    }

    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void m2729A(View view, CameraSticker cameraSticker, int i, int i2) {
        if (((CameraMaskItemView) view).m2375d(cameraSticker, this, this.f1320f, i2, yb4.m17102c().m17106e())) {
            this.f1321g = i2;
        }
    }

    /* JADX INFO: renamed from: I */
    public void m2733I() {
        m2739P(null, -1);
    }

    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public CameraSticker getItem(int i) {
        return this.f1319e.get(i);
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m2736M(CameraSticker cameraSticker, int i, File file) {
        if (NullChecker.a(file)) {
            cameraSticker.state = 3;
            cameraSticker.hasModelFile = true;
            cameraSticker.modelFilePath = file.getAbsolutePath();
        } else {
            cameraSticker.state = 4;
            lsi0.h(R$string.f592q1);
        }
        m2737N(cameraSticker);
        CameraSticker cameraStickerM17104b = yb4.m17102c().m17104b();
        if (NullChecker.b(cameraStickerM17104b) && TextUtils.equals(cameraStickerM17104b.cId, cameraSticker.cId) && this.f1322h == i && cameraSticker.hasModelFile && NullChecker.a(this.f1324j)) {
            this.f1324j.mo2643b(cameraSticker, this.f1325k, false);
            m2739P(cameraSticker, i);
        }
        notifyItemChanged(i);
    }

    /* JADX INFO: renamed from: N */
    public final void m2737N(CameraSticker cameraSticker) {
        int i = cameraSticker.state;
        if (i != 2) {
            if (i == 3) {
                yb4.m17102c().f15387f.onNext(cameraSticker);
                yb4.m17102c().m17105d().remove(cameraSticker.f680id);
                return;
            } else if (i != 4) {
                return;
            }
        }
        yb4.m17102c().f15387f.onNext(cameraSticker);
        yb4.m17102c().m17105d().put(cameraSticker.f680id, cameraSticker);
    }

    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public void m2735L(@Nullable CameraSticker cameraSticker) {
        CameraSticker cameraSticker2;
        if (NullChecker.a(this.f1319e) && NullChecker.a(cameraSticker)) {
            for (int i = 0; i < this.f1319e.size() && (cameraSticker2 = this.f1319e.get(i)) != cameraSticker; i++) {
                if (NullChecker.b(cameraSticker2) && TextUtils.equals(cameraSticker2.f680id, cameraSticker.f680id)) {
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
    public final void m2739P(CameraSticker cameraSticker, int i) {
        int i2 = this.f1321g;
        this.f1321g = i;
        this.f1323i = cameraSticker;
        notifyItemChanged(i);
        notifyItemChanged(i2);
    }

    /* JADX INFO: renamed from: Q */
    public final void m2740Q(final CameraSticker cameraSticker, final int i) {
        yb4.m17102c().m17111j(cameraSticker);
        this.f1322h = i;
        yb4.m17102c().m17113l(cameraSticker);
        if (cameraSticker.hasModelFile) {
            if (NullChecker.a(this.f1324j)) {
                this.f1324j.mo2643b(cameraSticker, this.f1325k, false);
            }
            m2739P(cameraSticker, i);
        } else {
            if (cameraSticker.state == 2) {
                return;
            }
            cameraSticker.state = 2;
            m2737N(cameraSticker);
            act().duringCreated(FeedModule.f314b.m1443c2(cameraSticker)).subscribe(mkd0.G(new e30() { // from class: l.b94
                public final void call(Object obj) {
                    this.f6184a.m2736M(cameraSticker, i, (File) obj);
                }
            }));
        }
        notifyItemChanged(i);
    }

    /* JADX INFO: renamed from: R */
    public void m2741R(MaskMenuView.InterfaceC2023a interfaceC2023a) {
        this.f1324j = interfaceC2023a;
    }

    /* JADX INFO: renamed from: S */
    public void m2742S(@Nullable List<CameraSticker> list) {
        if (NullChecker.a(list)) {
            this.f1319e = list;
            yb4.m17102c().m17107f(list);
            notifyDataSetChanged();
        }
    }
}
