package p006l;

import android.animation.Animator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.p000p1.mobile.putong.account.p002ui.accountai.SignUpAiAct;
import com.p000p1.mobile.putong.account.p002ui.camera.view.AccountCameraMaskItemView;
import com.p000p1.mobile.putong.account.p002ui.camera.view.AccountMaskMenuView;
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

/* JADX INFO: renamed from: l.ki */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C0933ki extends dac0<CameraSticker> {

    /* JADX INFO: renamed from: d */
    public Context f15831d;

    /* JADX INFO: renamed from: i */
    public CameraSticker f15836i;

    /* JADX INFO: renamed from: j */
    public int f15837j;

    /* JADX INFO: renamed from: e */
    public List<CameraSticker> f15832e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public HashMap<String, Animator> f15833f = new HashMap<>();

    /* JADX INFO: renamed from: g */
    public int f15834g = -1;

    /* JADX INFO: renamed from: h */
    public int f15835h = -1;

    /* JADX INFO: renamed from: c */
    public final e30<j760<CameraSticker, Integer>> f15830c = xck0.a(300, new e30() { // from class: l.hi
        public final void call(Object obj) {
            this.f13885a.m18131K((j760) obj);
        }
    });

    public C0933ki(Context context) {
        this.f15831d = context;
        c(act(), C1347uj.m25232c().f23566f).observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.ii
            public final void call(Object obj) {
                this.f14484a.m18138L((CameraSticker) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m18131K(j760 j760Var) {
        m18143Q((CameraSticker) j760Var.a, ((Integer) j760Var.b).intValue());
    }

    private Act act() {
        return this.f15831d;
    }

    /* JADX INFO: renamed from: C */
    public int m18133C() {
        return this.f15832e.size();
    }

    /* JADX INFO: renamed from: D */
    public View m18134D(ViewGroup viewGroup, int i) {
        return act().inflater().inflate(c6c0.f9433i, viewGroup, false);
    }

    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void m18132A(View view, CameraSticker cameraSticker, int i, int i2) {
        if (((AccountCameraMaskItemView) view).m830d(cameraSticker, this, this.f15833f, i2, C1347uj.m25232c().m25236e())) {
            this.f15834g = i2;
        }
    }

    /* JADX INFO: renamed from: I */
    public void m18136I() {
        m18142P(null, -1);
    }

    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public CameraSticker getItem(int i) {
        return this.f15832e.get(i);
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m18139M(CameraSticker cameraSticker, int i, File file) {
        if (NullChecker.a(file)) {
            cameraSticker.state = 3;
            cameraSticker.hasModelFile = true;
            cameraSticker.modelFilePath = file.getAbsolutePath();
        } else {
            cameraSticker.state = 4;
            lsi0.j("网络不给力");
        }
        m18140N(cameraSticker);
        CameraSticker cameraStickerM25234b = C1347uj.m25232c().m25234b();
        if (NullChecker.b(cameraStickerM25234b) && TextUtils.equals(cameraStickerM25234b.cId, cameraSticker.cId) && this.f15835h == i && cameraSticker.hasModelFile && NullChecker.a((Object) null)) {
            throw null;
        }
        notifyItemChanged(i);
    }

    /* JADX INFO: renamed from: N */
    public final void m18140N(CameraSticker cameraSticker) {
        int i = cameraSticker.state;
        if (i != 2) {
            if (i == 3) {
                C1347uj.m25232c().f23566f.onNext(cameraSticker);
                C1347uj.m25232c().m25235d().remove(cameraSticker.f333id);
                return;
            } else if (i != 4) {
                return;
            }
        }
        C1347uj.m25232c().f23566f.onNext(cameraSticker);
        C1347uj.m25232c().m25235d().put(cameraSticker.f333id, cameraSticker);
    }

    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public void m18138L(@Nullable CameraSticker cameraSticker) {
        CameraSticker cameraSticker2;
        if (NullChecker.a(this.f15832e) && NullChecker.a(cameraSticker)) {
            for (int i = 0; i < this.f15832e.size() && (cameraSticker2 = this.f15832e.get(i)) != cameraSticker; i++) {
                if (NullChecker.b(cameraSticker2) && TextUtils.equals(cameraSticker2.f333id, cameraSticker.f333id)) {
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
    public final void m18142P(CameraSticker cameraSticker, int i) {
        int i2 = this.f15834g;
        this.f15834g = i;
        this.f15836i = cameraSticker;
        notifyItemChanged(i);
        notifyItemChanged(i2);
    }

    /* JADX INFO: renamed from: Q */
    public final void m18143Q(final CameraSticker cameraSticker, final int i) {
        C1347uj.m25232c().m25241j(cameraSticker);
        this.f15835h = i;
        C1347uj.m25232c().m25243l(cameraSticker);
        if (cameraSticker.hasModelFile) {
            if (NullChecker.a((Object) null)) {
                throw null;
            }
            m18142P(cameraSticker, i);
        } else {
            if (cameraSticker.state == 2) {
                return;
            }
            cameraSticker.state = 2;
            m18140N(cameraSticker);
            act().duringCreated(SignUpAiAct.f344c.m22067C(cameraSticker)).subscribe(mkd0.G(new e30() { // from class: l.ji
                public final void call(Object obj) {
                    this.f15159a.m18139M(cameraSticker, i, (File) obj);
                }
            }));
        }
        notifyItemChanged(i);
    }

    /* JADX INFO: renamed from: S */
    public void m18145S(@Nullable List<CameraSticker> list) {
        if (NullChecker.a(list)) {
            this.f15832e = list;
            C1347uj.m25232c().m25237f(list);
            notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: R */
    public void m18144R(AccountMaskMenuView.InterfaceC0090a interfaceC0090a) {
    }
}
