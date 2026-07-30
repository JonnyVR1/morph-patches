package p153l;

import android.content.DialogInterface;
import android.view.View;
import com.p051p1.mobile.putong.live.base.data.BLive;
import com.p051p1.mobile.putong.live.base.data.BLiveOwner;
import com.p051p1.mobile.putong.live.base.data.BLiveSuggestLive;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12774a;
import com.p051p1.mobile.putong.live.livingroom.archi.frag.RoomFrag;
import com.p051p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import com.p051p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomType;
import com.p051p1.mobile.putong.live.livingroom.view.JumpNextView;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public class tqf0 {

    /* JADX INFO: renamed from: a */
    public RoomFrag f175705a;

    /* JADX INFO: renamed from: b */
    public DialogC12774a f175706b;

    /* JADX INFO: renamed from: c */
    public ogd0 f175707c;

    /* JADX INFO: renamed from: d */
    public l4g0 f175708d;

    /* JADX INFO: renamed from: e */
    public bas f175709e;

    public tqf0(RoomFrag roomFrag, ogd0 ogd0Var, bas basVar) {
        this.f175705a = roomFrag;
        this.f175707c = ogd0Var;
        this.f175709e = basVar;
    }

    /* JADX INFO: renamed from: e */
    public void m192284e() {
        if (m192286g()) {
            this.f175706b.dismiss();
            this.f175706b = null;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final kfd0 m192285f(BLiveSuggestLive bLiveSuggestLive) {
        return kfd0.m149385x().m149414w("e_anchor_recommend").m149403l(1).m149394c(bLiveSuggestLive).m149392a();
    }

    /* JADX INFO: renamed from: g */
    public boolean m192286g() {
        DialogC12774a dialogC12774a = this.f175706b;
        return dialogC12774a != null && dialogC12774a.isShowing();
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m192287h(DialogInterface dialogInterface) {
        l4g0 l4g0Var = this.f175708d;
        if (l4g0Var != null) {
            l4g0Var.m152776k();
            this.f175708d.m152775j();
        }
        this.f175706b = null;
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m192288i(BLiveSuggestLive bLiveSuggestLive, DialogInterface dialogInterface) {
        l4g0 l4g0Var = new l4g0("p_user_live_end", bas.class.getName());
        this.f175708d = l4g0Var;
        l4g0Var.m152774i();
        this.f175708d.m152777l();
        afu.m97561j(m192285f(bLiveSuggestLive), "p_user_live_end");
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m192289j() {
        this.f175706b.dismiss();
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m192290k(BLiveSuggestLive bLiveSuggestLive, Boolean bool) {
        DialogC12774a dialogC12774a = this.f175706b;
        if (dialogC12774a != null) {
            dialogC12774a.dismiss();
        }
        BLive bLiveNew_ = BLive.new_();
        bLiveNew_.type = "live";
        bLiveNew_.f45171id = bLiveSuggestLive.f45298id;
        BLiveOwner bLiveOwnerNew_ = BLiveOwner.new_();
        bLiveNew_.anchor = bLiveOwnerNew_;
        bLiveOwnerNew_.f45267id = bLiveSuggestLive.anchor.f45299id;
        BLiveOwner bLiveOwnerNew_2 = BLiveOwner.new_();
        bLiveNew_.room = bLiveOwnerNew_2;
        bLiveOwnerNew_2.f45267id = bLiveSuggestLive.room.f45300id;
        JumpRoomData.C12924a c12924aM74209o = new JumpRoomData.C12924a().m74209o(bLiveNew_);
        c12924aM74209o.m74208n(JumpRoomType.END_SUGGEST);
        if (this.f175707c.m167544E0().m97613r() != null) {
            c12924aM74209o.m74206l(this.f175707c.m167544E0().m97613r().f45171id);
        }
        this.f175707c.m167560V0(c12924aM74209o.m74207m());
        afu.m97559h(m192285f(bLiveSuggestLive), "p_user_live_end");
    }

    /* JADX INFO: renamed from: l */
    public final void m192291l(RoomFrag roomFrag, final BLiveSuggestLive bLiveSuggestLive) {
        DialogC12774a dialogC12774a = this.f175706b;
        if (dialogC12774a != null) {
            if (dialogC12774a.isShowing()) {
                return;
            }
            this.f175706b.show();
            return;
        }
        JumpNextView jumpNextView = (JumpNextView) View.inflate(roomFrag.act(), yec0.f198897R1, null);
        String str = bLiveSuggestLive.room.coverUrl;
        if (str != null) {
            izs.m142868s("context_single_room", jumpNextView.f52777b, str);
        }
        jumpNextView.f52780e.setText(String.format(jumpNextView.getContext().getString(R$string.f47965a3), bLiveSuggestLive.anchor.name));
        DialogC12774a dialogC12774a2 = new DialogC12774a(roomFrag.act(), jumpNextView);
        this.f175706b = dialogC12774a2;
        dialogC12774a2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.pqf0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f153671a.m192287h(dialogInterface);
            }
        });
        this.f175706b.setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.qqf0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f158997a.m192288i(bLiveSuggestLive, dialogInterface);
            }
        });
        this.f175706b.setCancelable(true);
        this.f175706b.show();
        jumpNextView.setCloseAction(new x20() { // from class: l.rqf0
            @Override // p153l.x20
            public final void call() {
                this.f164476a.m192289j();
            }
        });
        jumpNextView.setJumpAction(new y20() { // from class: l.sqf0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f170165a.m192290k(bLiveSuggestLive, (Boolean) obj);
            }
        });
        jumpNextView.m77652r(roomFrag);
        jumpNextView.m77651q();
    }

    /* JADX INFO: renamed from: m */
    public void m192292m(BLiveSuggestLive bLiveSuggestLive) {
        m192291l(this.f175705a, bLiveSuggestLive);
    }
}
