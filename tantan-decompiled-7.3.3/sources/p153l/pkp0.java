package p153l;

import android.view.View;
import com.immomo.momomediaext.sei.BaseSei;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0004¨\u0006\u0010"}, m88121d2 = {"Ll/pkp0;", "Ll/pdv;", "Ll/tkp0;", "<init>", "()V", "", BaseSei.f14625Y, "", "withShadow", "F0", "(Z)V", "", BaseSei.f14624X, "()I", "k", "destroy", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class pkp0 extends pdv<tkp0<?>> {
    /* JADX INFO: renamed from: v */
    public static void m172748v(pkp0 pkp0Var, View view) {
        pkp0Var.mo72910j();
    }

    /* JADX INFO: renamed from: w */
    public static void m172749w(pkp0 pkp0Var, View view) {
        ((tkp0) pkp0Var.f48554b).m191586T3();
    }

    /* JADX INFO: renamed from: y */
    private final void m172750y() {
        bnl0.m105524M(this.f151837h, true);
        this.f151837h.m69898f("人气榜单", n9c0.f140856p1);
        this.f151837h.setFAQListener(new View.OnClickListener() { // from class: l.nkp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                pkp0.m172749w(this.f142476a, view);
            }
        });
        this.f151837h.setBackListener(new View.OnClickListener() { // from class: l.okp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                pkp0.m172748v(this.f147771a, view);
            }
        });
        this.f151837h.setLeftView(1);
        this.f151837h.setRightView(3);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder, p153l.isl
    /* JADX INFO: renamed from: F0 */
    public void mo72905F0(boolean withShadow) {
        super.mo72905F0(withShadow);
        m172750y();
        qnp0.m177260c1(this.f151836g, 0, 0, 0, -qa00.m175859d(16.0f), qa00.m175859d(16.0f));
        this.f151836g.m78597j0("room", "room");
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder, p153l.iam
    public void destroy() {
        mo72910j();
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder
    /* JADX INFO: renamed from: k */
    public int mo72911k() {
        return obc0.f146517v;
    }

    /* JADX INFO: renamed from: x */
    public int m172751x() {
        return qa00.m175859d(567.0f);
    }
}
