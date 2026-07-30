package p149l;

import android.animation.Animator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.account.data.CameraSticker;
import com.p046p1.mobile.putong.account.p050ui.accountai.SignUpAiAct;
import com.p046p1.mobile.putong.account.p050ui.camera.view.AccountCameraMaskItemView;
import com.p046p1.mobile.putong.account.p050ui.camera.view.AccountMaskMenuView;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: l.ki */
/* JADX INFO: loaded from: classes9.dex */
public class C18021ki extends dac0<CameraSticker> {

    /* JADX INFO: renamed from: d */
    public Context f123245d;

    /* JADX INFO: renamed from: i */
    public CameraSticker f123250i;

    /* JADX INFO: renamed from: j */
    public int f123251j;

    /* JADX INFO: renamed from: e */
    public List<CameraSticker> f123246e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public HashMap<String, Animator> f123247f = new HashMap<>();

    /* JADX INFO: renamed from: g */
    public int f123248g = -1;

    /* JADX INFO: renamed from: h */
    public int f123249h = -1;

    /* JADX INFO: renamed from: c */
    public final e30<j760<CameraSticker, Integer>> f123244c = xck0.m208120a(300, new e30() { // from class: l.hi
        @Override // p149l.e30
        public final void call(Object obj) {
            this.f107864a.m146028K((j760) obj);
        }
    });

    public C18021ki(Context context) {
        this.f123245d = context;
        mo67374c(act(), C20443uj.m193970c().f176715f).observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.ii
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f113358a.m146032L((CameraSticker) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m146028K(j760 j760Var) {
        m146037Q((CameraSticker) j760Var.f116564a, ((Integer) j760Var.f116565b).intValue());
    }

    private Act act() {
        return (Act) this.f123245d;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f123246e.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return act().inflater().inflate(c6c0.f79503i, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, CameraSticker cameraSticker, int i, int i2) {
        if (((AccountCameraMaskItemView) view).m28924d(cameraSticker, this, this.f123247f, i2, C20443uj.m193970c().m193974e())) {
            this.f123248g = i2;
        }
    }

    /* JADX INFO: renamed from: I */
    public void m146030I() {
        m146036P(null, -1);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public CameraSticker getItem(int i) {
        return this.f123246e.get(i);
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m146033M(CameraSticker cameraSticker, int i, File file) {
        if (NullChecker.m81303a(file)) {
            cameraSticker.state = 3;
            cameraSticker.hasModelFile = true;
            cameraSticker.modelFilePath = file.getAbsolutePath();
        } else {
            cameraSticker.state = 4;
            lsi0.m151580j("网络不给力");
        }
        m146034N(cameraSticker);
        CameraSticker cameraStickerM193972b = C20443uj.m193970c().m193972b();
        if (NullChecker.m81304b(cameraStickerM193972b) && TextUtils.equals(cameraStickerM193972b.cId, cameraSticker.cId) && this.f123249h == i && cameraSticker.hasModelFile && NullChecker.m81303a(null)) {
            throw null;
        }
        notifyItemChanged(i);
    }

    /* JADX INFO: renamed from: N */
    public final void m146034N(CameraSticker cameraSticker) {
        int i = cameraSticker.state;
        if (i != 2) {
            if (i == 3) {
                C20443uj.m193970c().f176715f.m132487l(cameraSticker);
                C20443uj.m193970c().m193973d().remove(cameraSticker.f16344id);
                return;
            } else if (i != 4) {
                return;
            }
        }
        C20443uj.m193970c().f176715f.m132487l(cameraSticker);
        C20443uj.m193970c().m193973d().put(cameraSticker.f16344id, cameraSticker);
    }

    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public void m146032L(@Nullable CameraSticker cameraSticker) {
        CameraSticker cameraSticker2;
        if (NullChecker.m81303a(this.f123246e) && NullChecker.m81303a(cameraSticker)) {
            for (int i = 0; i < this.f123246e.size() && (cameraSticker2 = this.f123246e.get(i)) != cameraSticker; i++) {
                if (NullChecker.m81304b(cameraSticker2) && TextUtils.equals(cameraSticker2.f16344id, cameraSticker.f16344id)) {
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
    public final void m146036P(CameraSticker cameraSticker, int i) {
        int i2 = this.f123248g;
        this.f123248g = i;
        this.f123250i = cameraSticker;
        notifyItemChanged(i);
        notifyItemChanged(i2);
    }

    /* JADX INFO: renamed from: Q */
    public final void m146037Q(final CameraSticker cameraSticker, final int i) {
        C20443uj.m193970c().m193979j(cameraSticker);
        this.f123249h = i;
        C20443uj.m193970c().m193981l(cameraSticker);
        if (cameraSticker.hasModelFile) {
            if (NullChecker.m81303a(null)) {
                throw null;
            }
            m146036P(cameraSticker, i);
        } else {
            if (cameraSticker.state == 2) {
                return;
            }
            cameraSticker.state = 2;
            m146034N(cameraSticker);
            act().duringCreated(SignUpAiAct.f16355c.m174483C(cameraSticker)).subscribe(mkd0.m154955G(new e30() { // from class: l.ji
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f118037a.m146033M(cameraSticker, i, (File) obj);
                }
            }));
        }
        notifyItemChanged(i);
    }

    /* JADX INFO: renamed from: S */
    public void m146039S(@Nullable List<CameraSticker> list) {
        if (NullChecker.m81303a(list)) {
            this.f123246e = list;
            C20443uj.m193970c().m193975f(list);
            notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: R */
    public void m146038R(AccountMaskMenuView.InterfaceC4664a interfaceC4664a) {
    }
}
