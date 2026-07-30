package p149l;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.live.livingroom.archi.frag.RoomFrag;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class jwt extends lcr {

    /* JADX INFO: renamed from: g */
    public boolean f120127g;

    /* JADX INFO: renamed from: h */
    public Act f120128h;

    /* JADX INFO: renamed from: i */
    public ho2 f120129i;

    /* JADX INFO: renamed from: l.jwt$a */
    public class ViewOnClickListenerC17881a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Dialog f120130a;

        public ViewOnClickListenerC17881a(Dialog dialog) {
            this.f120130a = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            HashMap map = new HashMap();
            map.put("anchorId", jwt.this.f120129i.m132146l0().f56011id);
            map.put("liveId", jwt.this.f120129i.m149814k());
            map.put("click_type", "keep");
            zvf0.m220397s("e_live_room_audio_open_pop", "p_user_live_room", map);
            this.f120130a.dismiss();
        }
    }

    /* JADX INFO: renamed from: l.jwt$b */
    public class ViewOnClickListenerC17882b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Dialog f120132a;

        public ViewOnClickListenerC17882b(Dialog dialog) {
            this.f120132a = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            HashMap map = new HashMap();
            map.put("anchorId", jwt.this.f120129i.m132146l0().f56011id);
            map.put("liveId", jwt.this.f120129i.m149814k());
            map.put("click_type", "open");
            zvf0.m220397s("e_live_room_audio_open_pop", "p_user_live_room", map);
            jwt.this.m143671N2(false);
            this.f120132a.dismiss();
        }
    }

    public jwt(RoomFrag roomFrag) {
        super(roomFrag);
    }

    /* JADX INFO: renamed from: M2 */
    private void m143670M2() {
        Dialog dialogM20567z = this.f120128h.dialog().m20517M(t6c0.f168145P5).m20559v().m20567z();
        dialogM20567z.m20458P().findViewById(g5c0.f100839W2).setOnClickListener(new ViewOnClickListenerC17881a(dialogM20567z));
        dialogM20567z.m20458P().findViewById(g5c0.f101061t6).setOnClickListener(new ViewOnClickListenerC17882b(dialogM20567z));
        dialogM20567z.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        dialogM20567z.show();
    }

    @Override // p149l.lcr
    /* JADX INFO: renamed from: F2 */
    public void mo111724F2(bsm bsmVar) {
        super.mo111724F2(bsmVar);
        this.f120128h = bsmVar.f77095a;
        D d = bsmVar.f77102h;
        this.f120129i = d;
        if (d == 0 || this.f120127g) {
            return;
        }
        this.f120127g = true;
        bsmVar.f77106l.PlayerEvent.switchMute().mo172463j(Boolean.TRUE);
        m143670M2();
        HashMap map = new HashMap();
        map.put("anchorId", this.f120129i.m132146l0().f56011id);
        map.put("liveId", this.f120129i.m149814k());
        zvf0.m220403y("e_live_room_audio_open_pop", "p_user_live_room", map);
    }

    /* JADX INFO: renamed from: N2 */
    public final void m143671N2(boolean z) {
        m149341D2().f77106l.PlayerEvent.switchMute().mo172463j(Boolean.valueOf(z));
    }
}
