package p153l;

import android.animation.Animator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.account.data.CameraSticker;
import com.p051p1.mobile.putong.account.p055ui.accountai.SignUpAiAct;
import com.p051p1.mobile.putong.account.p055ui.camera.view.AccountCameraMaskItemView;
import com.p051p1.mobile.putong.account.p055ui.camera.view.AccountMaskMenuView;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: l.fi */
/* JADX INFO: loaded from: classes9.dex */
public class C16977fi extends jic0<CameraSticker> {

    /* JADX INFO: renamed from: d */
    public Context f99135d;

    /* JADX INFO: renamed from: i */
    public CameraSticker f99140i;

    /* JADX INFO: renamed from: j */
    public int f99141j;

    /* JADX INFO: renamed from: e */
    public List<CameraSticker> f99136e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public HashMap<String, Animator> f99137f = new HashMap<>();

    /* JADX INFO: renamed from: g */
    public int f99138g = -1;

    /* JADX INFO: renamed from: h */
    public int f99139h = -1;

    /* JADX INFO: renamed from: c */
    public final y20<pf60<CameraSticker, Integer>> f99134c = dmk0.m116962a(300, new y20() { // from class: l.ci
        @Override // p153l.y20
        public final void call(Object obj) {
            this.f81888a.m125650K((pf60) obj);
        }
    });

    public C16977fi(Context context) {
        this.f99135d = context;
        mo68557c(act(), C19376pj.m172465c().f152638f).observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.di
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f88573a.m125654L((CameraSticker) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m125650K(pf60 pf60Var) {
        m125659Q((CameraSticker) pf60Var.f152156a, ((Integer) pf60Var.f152157b).intValue());
    }

    private Act act() {
        return (Act) this.f99135d;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f99136e.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return act().inflater().inflate(hec0.f109115i, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, CameraSticker cameraSticker, int i, int i2) {
        if (((AccountCameraMaskItemView) view).m29923d(cameraSticker, this, this.f99137f, i2, C19376pj.m172465c().m172469e())) {
            this.f99138g = i2;
        }
    }

    /* JADX INFO: renamed from: I */
    public void m125652I() {
        m125658P(null, -1);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public CameraSticker getItem(int i) {
        return this.f99136e.get(i);
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m125655M(CameraSticker cameraSticker, int i, File file) {
        if (NullChecker.m82486a(file)) {
            cameraSticker.state = 3;
            cameraSticker.hasModelFile = true;
            cameraSticker.modelFilePath = file.getAbsolutePath();
        } else {
            cameraSticker.state = 4;
            o1j0.m165636j("网络不给力");
        }
        m125656N(cameraSticker);
        CameraSticker cameraStickerM172467b = C19376pj.m172465c().m172467b();
        if (NullChecker.m82487b(cameraStickerM172467b) && TextUtils.equals(cameraStickerM172467b.cId, cameraSticker.cId) && this.f99139h == i && cameraSticker.hasModelFile && NullChecker.m82486a(null)) {
            throw null;
        }
        notifyItemChanged(i);
    }

    /* JADX INFO: renamed from: N */
    public final void m125656N(CameraSticker cameraSticker) {
        int i = cameraSticker.state;
        if (i != 2) {
            if (i == 3) {
                C19376pj.m172465c().f152638f.m137019l(cameraSticker);
                C19376pj.m172465c().m172468d().remove(cameraSticker.f17063id);
                return;
            } else if (i != 4) {
                return;
            }
        }
        C19376pj.m172465c().f152638f.m137019l(cameraSticker);
        C19376pj.m172465c().m172468d().put(cameraSticker.f17063id, cameraSticker);
    }

    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public void m125654L(@Nullable CameraSticker cameraSticker) {
        CameraSticker cameraSticker2;
        if (NullChecker.m82486a(this.f99136e) && NullChecker.m82486a(cameraSticker)) {
            for (int i = 0; i < this.f99136e.size() && (cameraSticker2 = this.f99136e.get(i)) != cameraSticker; i++) {
                if (NullChecker.m82487b(cameraSticker2) && TextUtils.equals(cameraSticker2.f17063id, cameraSticker.f17063id)) {
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
    public final void m125658P(CameraSticker cameraSticker, int i) {
        int i2 = this.f99138g;
        this.f99138g = i;
        this.f99140i = cameraSticker;
        notifyItemChanged(i);
        notifyItemChanged(i2);
    }

    /* JADX INFO: renamed from: Q */
    public final void m125659Q(final CameraSticker cameraSticker, final int i) {
        C19376pj.m172465c().m172474j(cameraSticker);
        this.f99139h = i;
        C19376pj.m172465c().m172476l(cameraSticker);
        if (cameraSticker.hasModelFile) {
            if (NullChecker.m82486a(null)) {
                throw null;
            }
            m125658P(cameraSticker, i);
        } else {
            if (cameraSticker.state == 2) {
                return;
            }
            cameraSticker.state = 2;
            m125656N(cameraSticker);
            act().duringCreated(SignUpAiAct.f17074c.m154176C(cameraSticker)).subscribe(psd0.m173596G(new y20() { // from class: l.ei
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f94096a.m125655M(cameraSticker, i, (File) obj);
                }
            }));
        }
        notifyItemChanged(i);
    }

    /* JADX INFO: renamed from: S */
    public void m125661S(@Nullable List<CameraSticker> list) {
        if (NullChecker.m82486a(list)) {
            this.f99136e = list;
            C19376pj.m172465c().m172470f(list);
            notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: R */
    public void m125660R(AccountMaskMenuView.InterfaceC4815a interfaceC4815a) {
    }
}
