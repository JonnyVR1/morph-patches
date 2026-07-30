package p153l;

import android.content.Context;
import android.view.View;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiCallInvite;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12774a;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallConnectionIconView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p151v.VText;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\n\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001c\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, m88121d2 = {"Ll/u810;", "Ll/h7t;", "Ll/e910;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "init", "()V", "Lcom/p1/mobile/putong/live/base/data/BLiveMultiCallInvite;", "callInvite", BaseSei.f14626Z, "(Lcom/p1/mobile/putong/live/base/data/BLiveMultiCallInvite;)V", "", "withShadow", "F0", "(Z)V", "e", "()Z", "", "showSeconds", "", "cnt", "A", "(IJ)V", "k", "()I", "B", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class u810 extends h7t<e910<?>> {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    public u810(@NotNull Context context) {
        context.getClass();
        this.context = context;
    }

    /* JADX INFO: renamed from: v */
    public static void m194903v() {
    }

    /* JADX INFO: renamed from: w */
    public static void m194904w(u810 u810Var, View view) {
        jr10.INSTANCE.m146666c("invited", "refuse", ((e910) u810Var.f48554b).m213815L2());
        ((e910) u810Var.f48554b).m119865f4();
    }

    /* JADX INFO: renamed from: x */
    public static void m194905x(u810 u810Var, View view) {
        jr10.INSTANCE.m146666c("invited", "accept", ((e910) u810Var.f48554b).m213815L2());
        e910 e910Var = (e910) u810Var.f48554b;
        String str = cd10.f81081i;
        str.getClass();
        e910Var.m119860Y3(str);
    }

    /* JADX INFO: renamed from: y */
    public static void m194906y(u810 u810Var, View view) {
        jr10.INSTANCE.m146666c("invited", "accept", ((e910) u810Var.f48554b).m213815L2());
        e910 e910Var = (e910) u810Var.f48554b;
        String str = cd10.f81082j;
        str.getClass();
        e910Var.m119860Y3(str);
    }

    /* JADX INFO: renamed from: A */
    public final void m194907A(int showSeconds, long cnt) {
        this.f108160h.setText(xau.m209911u(R$string.f48147i9, Long.valueOf(((long) showSeconds) - cnt)));
    }

    /* JADX INFO: renamed from: B */
    public final void m194908B() {
        this.f108162j.setText(xau.m209910t(R$string.f48234m9));
        bnl0.m105525M0(this.f108161i, true);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder, p153l.isl
    /* JADX INFO: renamed from: F0 */
    public void mo72905F0(boolean withShadow) {
        super.mo72905F0(withShadow);
        jr10.INSTANCE.m146670o("invited", ((e910) this.f48554b).m213815L2());
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder
    /* JADX INFO: renamed from: e */
    public boolean mo72907e() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder, p153l.isl
    public void init() {
        super.init();
        bnl0.m105509E0(this.f108160h, new View.OnClickListener() { // from class: l.q810
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                u810.m194904w(this.f156062a, view);
            }
        });
        bnl0.m105509E0(this.f108161i, new View.OnClickListener() { // from class: l.r810
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                u810.m194906y(this.f161659a, view);
            }
        });
        bnl0.m105509E0(this.f108162j, new View.OnClickListener() { // from class: l.s810
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                u810.m194905x(this.f166737a, view);
            }
        });
        if (!((e910) this.f48554b).m213815L2() && bf10.m103809O()) {
            m194908B();
        }
        m72916s(new DialogC12774a.c() { // from class: l.t810
            @Override // com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12774a.c
            /* JADX INFO: renamed from: o */
            public final void mo72967o() {
                u810.m194903v();
            }
        });
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder
    /* JADX INFO: renamed from: k */
    public int mo72911k() {
        return 0;
    }

    /* JADX INFO: renamed from: z */
    public void m194909z(@NotNull BLiveMultiCallInvite callInvite) {
        callInvite.getClass();
        MultiCallConnectionIconView multiCallConnectionIconView = this.f108158f;
        String str = callInvite.ownerUserAvatar;
        str.getClass();
        multiCallConnectionIconView.m76895i0(str, false);
        if (((e910) this.f48554b).m213815L2()) {
            VText vText = this.f108159g;
            int i = R$string.f48497y8;
            String str2 = callInvite.ownerUserName;
            str2.getClass();
            vText.setText(xau.m209911u(i, bf10.m103846x(str2, 0, 2, null)));
        }
        long j = callInvite.showSeconds;
        ((e910) this.f48554b).m119862c4(j > 0 ? (int) j : 60);
    }
}
