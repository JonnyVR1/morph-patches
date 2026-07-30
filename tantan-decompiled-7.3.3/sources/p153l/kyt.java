package p153l;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.live.livingroom.archi.frag.RoomFrag;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class kyt extends mer {

    /* JADX INFO: renamed from: g */
    public boolean f129347g;

    /* JADX INFO: renamed from: h */
    public Act f129348h;

    /* JADX INFO: renamed from: i */
    public oo2 f129349i;

    /* JADX INFO: renamed from: l.kyt$a */
    public class ViewOnClickListenerC18307a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Dialog f129350a;

        public ViewOnClickListenerC18307a(Dialog dialog) {
            this.f129350a = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            HashMap map = new HashMap();
            map.put("anchorId", kyt.this.f129349i.m168532l0().f56859id);
            map.put("liveId", kyt.this.f129349i.m202191k());
            map.put("click_type", "keep");
            i4g0.m138521s("e_live_room_audio_open_pop", "p_user_live_room", map);
            this.f129350a.dismiss();
        }
    }

    /* JADX INFO: renamed from: l.kyt$b */
    public class ViewOnClickListenerC18308b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Dialog f129352a;

        public ViewOnClickListenerC18308b(Dialog dialog) {
            this.f129352a = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            HashMap map = new HashMap();
            map.put("anchorId", kyt.this.f129349i.m168532l0().f56859id);
            map.put("liveId", kyt.this.f129349i.m202191k());
            map.put("click_type", "open");
            i4g0.m138521s("e_live_room_audio_open_pop", "p_user_live_room", map);
            kyt.this.m152131N2(false);
            this.f129352a.dismiss();
        }
    }

    public kyt(RoomFrag roomFrag) {
        super(roomFrag);
    }

    /* JADX INFO: renamed from: M2 */
    private void m152130M2() {
        Dialog dialogM21566z = this.f129348h.dialog().m21516M(yec0.f198877P5).m21558v().m21566z();
        dialogM21566z.m21457P().findViewById(mdc0.f136084W2).setOnClickListener(new ViewOnClickListenerC18307a(dialogM21566z));
        dialogM21566z.m21457P().findViewById(mdc0.f136306t6).setOnClickListener(new ViewOnClickListenerC18308b(dialogM21566z));
        dialogM21566z.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        dialogM21566z.show();
    }

    @Override // p153l.mer
    /* JADX INFO: renamed from: F2 */
    public void mo136576F2(dum dumVar) {
        super.mo136576F2(dumVar);
        this.f129348h = dumVar.f90815a;
        D d = dumVar.f90822h;
        this.f129349i = d;
        if (d == 0 || this.f129347g) {
            return;
        }
        this.f129347g = true;
        dumVar.f90826l.PlayerEvent.switchMute().mo199273j(Boolean.TRUE);
        m152130M2();
        HashMap map = new HashMap();
        map.put("anchorId", this.f129349i.m168532l0().f56859id);
        map.put("liveId", this.f129349i.m202191k());
        i4g0.m138527y("e_live_room_audio_open_pop", "p_user_live_room", map);
    }

    /* JADX INFO: renamed from: N2 */
    public final void m152131N2(boolean z) {
        m158073D2().f90826l.PlayerEvent.switchMute().mo199273j(Boolean.valueOf(z));
    }
}
