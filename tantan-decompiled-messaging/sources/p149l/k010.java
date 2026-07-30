package p149l;

import android.content.Context;
import android.view.View;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiCallInvite;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12611a;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallConnectionIconView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p147v.VText;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\n\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001c\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, m87232d2 = {"Ll/k010;", "Ll/g5t;", "Ll/u010;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "init", "()V", "Lcom/p1/mobile/putong/live/base/data/BLiveMultiCallInvite;", "callInvite", BaseSei.f13932Z, "(Lcom/p1/mobile/putong/live/base/data/BLiveMultiCallInvite;)V", "", "withShadow", "F0", "(Z)V", "e", "()Z", "", "showSeconds", "", "cnt", "A", "(IJ)V", "k", "()I", "B", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class k010 extends g5t<u010<?>> {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    public k010(@NotNull Context context) {
        context.getClass();
        this.context = context;
    }

    /* JADX INFO: renamed from: v */
    public static void m143976v() {
    }

    /* JADX INFO: renamed from: w */
    public static void m143977w(k010 k010Var, View view) {
        zi10.INSTANCE.m218902c("invited", "refuse", ((u010) k010Var.f47706b).m206032L2());
        ((u010) k010Var.f47706b).m191268f4();
    }

    /* JADX INFO: renamed from: x */
    public static void m143978x(k010 k010Var, View view) {
        zi10.INSTANCE.m218902c("invited", "accept", ((u010) k010Var.f47706b).m206032L2());
        u010 u010Var = (u010) k010Var.f47706b;
        String str = s410.f162243i;
        str.getClass();
        u010Var.m191263Y3(str);
    }

    /* JADX INFO: renamed from: y */
    public static void m143979y(k010 k010Var, View view) {
        zi10.INSTANCE.m218902c("invited", "accept", ((u010) k010Var.f47706b).m206032L2());
        u010 u010Var = (u010) k010Var.f47706b;
        String str = s410.f162244j;
        str.getClass();
        u010Var.m191263Y3(str);
    }

    /* JADX INFO: renamed from: A */
    public final void m143980A(int showSeconds, long cnt) {
        this.f101194h.setText(w8u.m202218u(R$string.f47299i9, Long.valueOf(((long) showSeconds) - cnt)));
    }

    /* JADX INFO: renamed from: B */
    public final void m143981B() {
        this.f101196j.setText(w8u.m202217t(R$string.f47386m9));
        xdl0.m208345M0(this.f101195i, true);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder, p149l.vpl
    /* JADX INFO: renamed from: F0 */
    public void mo71722F0(boolean withShadow) {
        super.mo71722F0(withShadow);
        zi10.INSTANCE.m218906o("invited", ((u010) this.f47706b).m206032L2());
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder
    /* JADX INFO: renamed from: e */
    public boolean mo71724e() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder, p149l.vpl
    public void init() {
        super.init();
        xdl0.m208329E0(this.f101194h, new View.OnClickListener() { // from class: l.g010
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                k010.m143977w(this.f100019a, view);
            }
        });
        xdl0.m208329E0(this.f101195i, new View.OnClickListener() { // from class: l.h010
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                k010.m143979y(this.f105198a, view);
            }
        });
        xdl0.m208329E0(this.f101196j, new View.OnClickListener() { // from class: l.i010
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                k010.m143978x(this.f110254a, view);
            }
        });
        if (!((u010) this.f47706b).m206032L2() && r610.m177980O()) {
            m143981B();
        }
        m71733s(new DialogC12611a.c() { // from class: l.j010
            @Override // com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12611a.c
            /* JADX INFO: renamed from: o */
            public final void mo71784o() {
                k010.m143976v();
            }
        });
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder
    /* JADX INFO: renamed from: k */
    public int mo71728k() {
        return 0;
    }

    /* JADX INFO: renamed from: z */
    public void m143982z(@NotNull BLiveMultiCallInvite callInvite) {
        callInvite.getClass();
        MultiCallConnectionIconView multiCallConnectionIconView = this.f101192f;
        String str = callInvite.ownerUserAvatar;
        str.getClass();
        multiCallConnectionIconView.m75712i0(str, false);
        if (((u010) this.f47706b).m206032L2()) {
            VText vText = this.f101193g;
            int i = R$string.f47649y8;
            String str2 = callInvite.ownerUserName;
            str2.getClass();
            vText.setText(w8u.m202218u(i, r610.m178017x(str2, 0, 2, null)));
        }
        long j = callInvite.showSeconds;
        ((u010) this.f47706b).m191265c4(j > 0 ? (int) j : 60);
    }
}
