package p149l;

import android.content.DialogInterface;
import android.view.View;
import com.p046p1.mobile.putong.live.base.data.BLive;
import com.p046p1.mobile.putong.live.base.data.BLiveOwner;
import com.p046p1.mobile.putong.live.base.data.BLiveSuggestLive;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12611a;
import com.p046p1.mobile.putong.live.livingroom.archi.frag.RoomFrag;
import com.p046p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import com.p046p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomType;
import com.p046p1.mobile.putong.live.livingroom.view.JumpNextView;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public class kif0 {

    /* JADX INFO: renamed from: a */
    public RoomFrag f123324a;

    /* JADX INFO: renamed from: b */
    public DialogC12611a f123325b;

    /* JADX INFO: renamed from: c */
    public l8d0 f123326c;

    /* JADX INFO: renamed from: d */
    public cwf0 f123327d;

    /* JADX INFO: renamed from: e */
    public a8s f123328e;

    public kif0(RoomFrag roomFrag, l8d0 l8d0Var, a8s a8sVar) {
        this.f123324a = roomFrag;
        this.f123326c = l8d0Var;
        this.f123328e = a8sVar;
    }

    /* JADX INFO: renamed from: e */
    public void m146080e() {
        if (m146082g()) {
            this.f123325b.dismiss();
            this.f123325b = null;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final h7d0 m146081f(BLiveSuggestLive bLiveSuggestLive) {
        return h7d0.m129655x().m129684w("e_anchor_recommend").m129673l(1).m129664c(bLiveSuggestLive).m129662a();
    }

    /* JADX INFO: renamed from: g */
    public boolean m146082g() {
        DialogC12611a dialogC12611a = this.f123325b;
        return dialogC12611a != null && dialogC12611a.isShowing();
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m146083h(DialogInterface dialogInterface) {
        cwf0 cwf0Var = this.f123327d;
        if (cwf0Var != null) {
            cwf0Var.m109035k();
            this.f123327d.m109034j();
        }
        this.f123325b = null;
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m146084i(BLiveSuggestLive bLiveSuggestLive, DialogInterface dialogInterface) {
        cwf0 cwf0Var = new cwf0("p_user_live_end", a8s.class.getName());
        this.f123327d = cwf0Var;
        cwf0Var.m109033i();
        this.f123327d.m109036l();
        zcu.m218095j(m146081f(bLiveSuggestLive), "p_user_live_end");
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m146085j() {
        this.f123325b.dismiss();
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m146086k(BLiveSuggestLive bLiveSuggestLive, Boolean bool) {
        DialogC12611a dialogC12611a = this.f123325b;
        if (dialogC12611a != null) {
            dialogC12611a.dismiss();
        }
        BLive bLiveNew_ = BLive.new_();
        bLiveNew_.type = "live";
        bLiveNew_.f44323id = bLiveSuggestLive.f44450id;
        BLiveOwner bLiveOwnerNew_ = BLiveOwner.new_();
        bLiveNew_.anchor = bLiveOwnerNew_;
        bLiveOwnerNew_.f44419id = bLiveSuggestLive.anchor.f44451id;
        BLiveOwner bLiveOwnerNew_2 = BLiveOwner.new_();
        bLiveNew_.room = bLiveOwnerNew_2;
        bLiveOwnerNew_2.f44419id = bLiveSuggestLive.room.f44452id;
        JumpRoomData.C12761a c12761aM73026o = new JumpRoomData.C12761a().m73026o(bLiveNew_);
        c12761aM73026o.m73025n(JumpRoomType.END_SUGGEST);
        if (this.f123326c.m148869E0().m207276r() != null) {
            c12761aM73026o.m73023l(this.f123326c.m148869E0().m207276r().f44323id);
        }
        this.f123326c.m148885V0(c12761aM73026o.m73024m());
        zcu.m218093h(m146081f(bLiveSuggestLive), "p_user_live_end");
    }

    /* JADX INFO: renamed from: l */
    public final void m146087l(RoomFrag roomFrag, final BLiveSuggestLive bLiveSuggestLive) {
        DialogC12611a dialogC12611a = this.f123325b;
        if (dialogC12611a != null) {
            if (dialogC12611a.isShowing()) {
                return;
            }
            this.f123325b.show();
            return;
        }
        JumpNextView jumpNextView = (JumpNextView) View.inflate(roomFrag.act(), t6c0.f168165R1, null);
        String str = bLiveSuggestLive.room.coverUrl;
        if (str != null) {
            hxs.m133406s("context_single_room", jumpNextView.f51929b, str);
        }
        jumpNextView.f51932e.setText(String.format(jumpNextView.getContext().getString(R$string.f47117a3), bLiveSuggestLive.anchor.name));
        DialogC12611a dialogC12611a2 = new DialogC12611a(roomFrag.act(), jumpNextView);
        this.f123325b = dialogC12611a2;
        dialogC12611a2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.gif0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f102891a.m146083h(dialogInterface);
            }
        });
        this.f123325b.setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.hif0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f107926a.m146084i(bLiveSuggestLive, dialogInterface);
            }
        });
        this.f123325b.setCancelable(true);
        this.f123325b.show();
        jumpNextView.setCloseAction(new d30() { // from class: l.iif0
            @Override // p149l.d30
            public final void call() {
                this.f113399a.m146085j();
            }
        });
        jumpNextView.setJumpAction(new e30() { // from class: l.jif0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f118095a.m146086k(bLiveSuggestLive, (Boolean) obj);
            }
        });
        jumpNextView.m76469r(roomFrag);
        jumpNextView.m76468q();
    }

    /* JADX INFO: renamed from: m */
    public void m146088m(BLiveSuggestLive bLiveSuggestLive) {
        m146087l(this.f123324a, bLiveSuggestLive);
    }
}
