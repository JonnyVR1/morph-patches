package p002l;

import android.content.DialogInterface;
import android.view.View;
import androidx.appcompat.app.a;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.C0200a;
import com.p000p1.mobile.putong.live.livingroom.archi.frag.RoomFrag;
import com.p000p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import com.p000p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomType;
import com.p1.mobile.putong.live.base.data.BLive;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p1.mobile.putong.live.base.data.BLiveOwner;
import com.p1.mobile.putong.live.base.data.BLiveSuggestLive;
import com.p1.mobile.putong.live.livingroom.view.JumpNextView;
import l.cwf0;
import l.d30;
import l.e30;
import l.h7d0;
import l.hxs;
import l.zcu;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class kif0 {

    /* JADX INFO: renamed from: a */
    public RoomFrag f14341a;

    /* JADX INFO: renamed from: b */
    public C0200a f14342b;

    /* JADX INFO: renamed from: c */
    public l8d0 f14343c;

    /* JADX INFO: renamed from: d */
    public cwf0 f14344d;

    /* JADX INFO: renamed from: e */
    public a8s f14345e;

    public kif0(RoomFrag roomFrag, l8d0 l8d0Var, a8s a8sVar) {
        this.f14341a = roomFrag;
        this.f14343c = l8d0Var;
        this.f14345e = a8sVar;
    }

    /* JADX INFO: renamed from: e */
    public void m16626e() {
        if (m16628g()) {
            this.f14342b.dismiss();
            this.f14342b = null;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final h7d0 m16627f(BLiveSuggestLive bLiveSuggestLive) {
        return h7d0.x().w("e_anchor_recommend").l(1).c(bLiveSuggestLive).a();
    }

    /* JADX INFO: renamed from: g */
    public boolean m16628g() {
        a aVar = this.f14342b;
        return aVar != null && aVar.isShowing();
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m16629h(DialogInterface dialogInterface) {
        cwf0 cwf0Var = this.f14344d;
        if (cwf0Var != null) {
            cwf0Var.k();
            this.f14344d.j();
        }
        this.f14342b = null;
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m16630i(BLiveSuggestLive bLiveSuggestLive, DialogInterface dialogInterface) {
        cwf0 cwf0Var = new cwf0("p_user_live_end", a8s.class.getName());
        this.f14344d = cwf0Var;
        cwf0Var.i();
        this.f14344d.l();
        zcu.j(m16627f(bLiveSuggestLive), "p_user_live_end");
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m16631j() {
        this.f14342b.dismiss();
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m16632k(BLiveSuggestLive bLiveSuggestLive, Boolean bool) {
        C0200a c0200a = this.f14342b;
        if (c0200a != null) {
            c0200a.dismiss();
        }
        BLiveAbsData bLiveAbsDataNew_ = BLive.new_();
        bLiveAbsDataNew_.type = "live";
        bLiveAbsDataNew_.id = bLiveSuggestLive.id;
        BLiveOwner bLiveOwnerNew_ = BLiveOwner.new_();
        bLiveAbsDataNew_.anchor = bLiveOwnerNew_;
        bLiveOwnerNew_.id = bLiveSuggestLive.anchor.id;
        BLiveOwner bLiveOwnerNew_2 = BLiveOwner.new_();
        bLiveAbsDataNew_.room = bLiveOwnerNew_2;
        bLiveOwnerNew_2.id = bLiveSuggestLive.room.id;
        JumpRoomData.C0350a c0350aM6549o = new JumpRoomData.C0350a().m6549o(bLiveAbsDataNew_);
        c0350aM6549o.m6548n(JumpRoomType.END_SUGGEST);
        if (this.f14343c.m17060E0().m25728r() != null) {
            c0350aM6549o.m6546l(this.f14343c.m17060E0().m25728r().id);
        }
        this.f14343c.m17076V0(c0350aM6549o.m6547m());
        zcu.h(m16627f(bLiveSuggestLive), "p_user_live_end");
    }

    /* JADX INFO: renamed from: l */
    public final void m16633l(RoomFrag roomFrag, final BLiveSuggestLive bLiveSuggestLive) {
        a aVar = this.f14342b;
        if (aVar != null) {
            if (aVar.isShowing()) {
                return;
            }
            this.f14342b.show();
            return;
        }
        JumpNextView jumpNextViewInflate = View.inflate(roomFrag.act(), t6c0.f19661R1, null);
        String str = bLiveSuggestLive.room.coverUrl;
        if (str != null) {
            hxs.s("context_single_room", jumpNextViewInflate.b, str);
        }
        jumpNextViewInflate.e.setText(String.format(jumpNextViewInflate.getContext().getString(R$string.f3159a3), bLiveSuggestLive.anchor.name));
        C0200a c0200a = new C0200a(roomFrag.act(), jumpNextViewInflate);
        this.f14342b = c0200a;
        c0200a.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.gif0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f11454a.m16629h(dialogInterface);
            }
        });
        this.f14342b.setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.hif0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f12050a.m16630i(bLiveSuggestLive, dialogInterface);
            }
        });
        this.f14342b.setCancelable(true);
        this.f14342b.show();
        jumpNextViewInflate.setCloseAction(new d30() { // from class: l.iif0
            public final void call() {
                this.f13263a.m16631j();
            }
        });
        jumpNextViewInflate.setJumpAction(new e30() { // from class: l.jif0
            public final void call(Object obj) {
                this.f13800a.m16632k(bLiveSuggestLive, (Boolean) obj);
            }
        });
        jumpNextViewInflate.r(roomFrag);
        jumpNextViewInflate.q();
    }

    /* JADX INFO: renamed from: m */
    public void m16634m(BLiveSuggestLive bLiveSuggestLive) {
        m16633l(this.f14341a, bLiveSuggestLive);
    }
}
