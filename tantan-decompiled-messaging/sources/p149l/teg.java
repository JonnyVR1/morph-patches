package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.live.base.apibean.BaseLiveBean;
import com.p046p1.mobile.putong.live.base.apibean.BaseLiveListBean;
import com.p046p1.mobile.putong.live.external.R$string;

/* JADX INFO: loaded from: classes13.dex */
public class teg extends jq2<ueg> {

    /* JADX INFO: renamed from: a */
    public boolean f169839a;

    /* JADX INFO: renamed from: b */
    public boolean f169840b;

    public teg(mcr mcrVar) {
        super(mcrVar);
        this.f169840b = this.f169840b;
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m188490f0(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            if (!TextUtils.isEmpty(coreService.metaMessage)) {
                lsi0.m151595y(coreService.metaMessage);
                return;
            }
        }
        lsi0.m151565C(R$string.f44923r);
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        m188498n0("");
    }

    /* JADX INFO: renamed from: i0 */
    public void m188493i0(final int i, String str, String str2, final boolean z) {
        ((ueg) this.viewModel).m193251k(i, "approved");
        duringCreated(eeg.m115964a(str, str2, z)).subscribe(ffw.m121194e(new e30() { // from class: l.reg
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f159053a.m188495k0(z, i, (BaseLiveBean) obj);
            }
        }, new e30() { // from class: l.seg
            @Override // p149l.e30
            public final void call(Object obj) {
                teg.m188490f0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j0 */
    public boolean m188494j0() {
        return this.f169839a;
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m188495k0(boolean z, int i, BaseLiveBean baseLiveBean) {
        V v2 = this.viewModel;
        if (z) {
            ((ueg) v2).m193251k(i, "approved");
            lsi0.m151593w(R$string.f44925s);
        } else {
            ((ueg) v2).m193251k(i, "rejected");
            lsi0.m151593w(R$string.f44929u);
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m188496l0(String str, BaseLiveListBean baseLiveListBean) {
        this.f169839a = false;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        V v2 = this.viewModel;
        if (zIsEmpty) {
            ((ueg) v2).m193250j(baseLiveListBean);
        } else {
            ((ueg) v2).m193248d(baseLiveListBean);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m188497m0(String str, Throwable th) {
        this.f169839a = false;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        V v2 = this.viewModel;
        if (zIsEmpty) {
            ((ueg) v2).m193250j(null);
        } else {
            ((ueg) v2).m193249i();
        }
    }

    /* JADX INFO: renamed from: n0 */
    public void m188498n0(final String str) {
        this.f169839a = true;
        duringCreated(eeg.m115969f(l9s.m149093o0(), str)).subscribe(ffw.m121194e(new e30() { // from class: l.peg
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f148433a.m188496l0(str, (BaseLiveListBean) obj);
            }
        }, new e30() { // from class: l.qeg
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f154031a.m188497m0(str, (Throwable) obj);
            }
        }));
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
