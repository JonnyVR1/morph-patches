package p002l;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import com.p000p1.mobile.putong.live.livingroom.archi.frag.RoomFrag;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.tantanapp.common.data.DbObject;
import java.util.HashMap;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class jwt extends lcr {

    /* JADX INFO: renamed from: g */
    public boolean f14096g;

    /* JADX INFO: renamed from: h */
    public Act f14097h;

    /* JADX INFO: renamed from: i */
    public ho2 f14098i;

    /* JADX INFO: renamed from: l.jwt$a */
    public class ViewOnClickListenerC0644a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Dialog f14099a;

        public ViewOnClickListenerC0644a(Dialog dialog) {
            this.f14099a = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            HashMap map = new HashMap();
            map.put("anchorId", ((DbObject) jwt.this.f14098i.m14582l0()).id);
            map.put("liveId", jwt.this.f14098i.m17235k());
            map.put("click_type", "keep");
            zvf0.s("e_live_room_audio_open_pop", "p_user_live_room", map);
            this.f14099a.dismiss();
        }
    }

    /* JADX INFO: renamed from: l.jwt$b */
    public class ViewOnClickListenerC0645b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Dialog f14101a;

        public ViewOnClickListenerC0645b(Dialog dialog) {
            this.f14101a = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            HashMap map = new HashMap();
            map.put("anchorId", ((DbObject) jwt.this.f14098i.m14582l0()).id);
            map.put("liveId", jwt.this.f14098i.m17235k());
            map.put("click_type", "open");
            zvf0.s("e_live_room_audio_open_pop", "p_user_live_room", map);
            jwt.this.m16396N2(false);
            this.f14101a.dismiss();
        }
    }

    public jwt(RoomFrag roomFrag) {
        super(roomFrag);
    }

    /* JADX INFO: renamed from: M2 */
    private void m16395M2() {
        Dialog dialogZ = this.f14097h.dialog().M(t6c0.f19641P5).v().z();
        dialogZ.P().findViewById(g5c0.f10989W2).setOnClickListener(new ViewOnClickListenerC0644a(dialogZ));
        dialogZ.P().findViewById(g5c0.f11211t6).setOnClickListener(new ViewOnClickListenerC0645b(dialogZ));
        dialogZ.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        dialogZ.show();
    }

    @Override // p002l.lcr
    /* JADX INFO: renamed from: F2 */
    public void mo11879F2(bsm bsmVar) {
        super.mo11879F2(bsmVar);
        this.f14097h = bsmVar.f8332a;
        D d = bsmVar.f8339h;
        this.f14098i = d;
        if (d == 0 || this.f14096g) {
            return;
        }
        this.f14096g = true;
        bsmVar.f8343l.PlayerEvent.switchMute().j(Boolean.TRUE);
        m16395M2();
        HashMap map = new HashMap();
        map.put("anchorId", ((DbObject) this.f14098i.m14582l0()).id);
        map.put("liveId", this.f14098i.m17235k());
        zvf0.y("e_live_room_audio_open_pop", "p_user_live_room", map);
    }

    /* JADX INFO: renamed from: N2 */
    public final void m16396N2(boolean z) {
        m17134D2().f8343l.PlayerEvent.switchMute().j(Boolean.valueOf(z));
    }
}
