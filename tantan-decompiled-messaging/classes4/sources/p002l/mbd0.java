package p002l;

import android.view.View;
import com.p000p1.mobile.putong.live.livingroom.archi.act.LiveBaseFrag;
import com.p000p1.mobile.putong.live.livingroom.archi.frag.LiveScrollViewContainer;
import com.p000p1.mobile.putong.live.livingroom.base.room.RoomView;
import com.p000p1.mobile.putong.live.livingroom.officialshow.OfficialShowView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p1.mobile.putong.live.base.data.BLive;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p1.mobile.putong.live.base.data.BLiveVoice;
import com.p1.mobile.putong.live.livingroom.voice.intl.root.VoiceRoomView;
import com.tantan.live.eventbus.LiveEventBus;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import l.dml;
import l.fhm0;
import l.h5j0;
import l.jfo0;
import l.kap0;
import l.pho0;
import l.vwb;
import l.w9j;
import l.ypv;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class mbd0 {

    /* JADX INFO: renamed from: a */
    public final Act f15311a;

    /* JADX INFO: renamed from: b */
    public final l8d0 f15312b;

    /* JADX INFO: renamed from: c */
    public final AudienceStartData f15313c;

    /* JADX INFO: renamed from: d */
    public dml f15314d;

    /* JADX INFO: renamed from: e */
    public final LiveBaseFrag f15315e;

    /* JADX INFO: renamed from: f */
    public ho2 f15316f;

    /* JADX INFO: renamed from: g */
    public AbstractC0485a6 f15317g;

    /* JADX INFO: renamed from: h */
    public final HashMap<String, List<AbstractC0485a6>> f15318h = new HashMap<>();

    /* JADX INFO: renamed from: i */
    public final zgt f15319i;

    /* JADX INFO: renamed from: j */
    public final aht f15320j;

    public mbd0(l8d0 l8d0Var, LiveBaseFrag liveBaseFrag, AudienceStartData audienceStartData, zgt zgtVar, aht ahtVar) {
        this.f15312b = l8d0Var;
        this.f15315e = liveBaseFrag;
        this.f15311a = liveBaseFrag.act();
        this.f15313c = audienceStartData;
        this.f15319i = zgtVar;
        this.f15320j = ahtVar;
    }

    /* JADX INFO: renamed from: c */
    public void m17800c(AbstractC0485a6 abstractC0485a6) {
        this.f15317g = abstractC0485a6;
    }

    /* JADX INFO: renamed from: d */
    public final jbd0 m17801d() {
        LiveBaseFrag liveBaseFrag = this.f15315e;
        dml dmlVar = this.f15314d;
        ho2 ho2Var = this.f15316f;
        ao40 ao40Var = new ao40(liveBaseFrag, dmlVar, ho2Var == null ? new am40(new qn40(), this.f15319i, this.f15320j) : (am40) ho2Var, new LiveEventBus());
        ((am40) ao40Var.f8339h).m9888Q2(this.f15313c);
        h5j0 h5j0Var = h5j0.INSTANCE;
        h5j0Var.d("live_room_view_inflate");
        RoomView roomView = (RoomView) View.inflate(this.f15311a, t6c0.f19916l5, null);
        h5j0Var.a("live_room_view_inflate", "inflate");
        jbd0 ugi0Var = ypv.a.R() ? new ugi0(ao40Var, this.f15312b, roomView) : new jbd0(ao40Var, this.f15312b, roomView);
        ugi0Var.init();
        this.f15316f = null;
        return ugi0Var;
    }

    /* JADX INFO: renamed from: e */
    public final p650 m17802e() {
        LiveBaseFrag liveBaseFrag = this.f15315e;
        dml dmlVar = this.f15314d;
        ho2 ho2Var = this.f15316f;
        l450 l450Var = new l450(liveBaseFrag, dmlVar, ho2Var == null ? new x350(new qn40(), this.f15319i, this.f15320j) : (x350) ho2Var, new LiveEventBus());
        ((x350) l450Var.f8339h).m9888Q2(this.f15313c);
        h5j0 h5j0Var = h5j0.INSTANCE;
        h5j0Var.d("live_room_view_inflate");
        OfficialShowView officialShowView = (OfficialShowView) View.inflate(this.f15311a, t6c0.f19520F4, null);
        h5j0Var.a("live_room_view_inflate", "inflate");
        p650 p650Var = new p650(l450Var, this.f15312b, officialShowView);
        p650Var.init();
        this.f15316f = null;
        return p650Var;
    }

    /* JADX INFO: renamed from: f */
    public final AbstractC0485a6 m17803f() {
        pho0 kap0Var;
        boolean zT5 = ypv.k().T5();
        LiveBaseFrag liveBaseFrag = this.f15315e;
        dml dmlVar = this.f15314d;
        fhm0 fhm0Var = this.f15316f;
        jfo0 jfo0Var = new jfo0(liveBaseFrag, dmlVar, (fhm0Var == null || !(fhm0Var instanceof fhm0)) ? new fhm0(new oqn0(), this.f15319i) : fhm0Var, new LiveEventBus());
        jfo0Var.f8339h.g4(this.f15313c);
        if (zT5) {
            jfo0Var.f8339h.e4(this.f15311a, this.f15313c.live);
            kap0Var = new kap0(jfo0Var, this.f15312b, View.inflate(this.f15311a, t6c0.f19870hb, null));
        } else {
            h5j0 h5j0Var = h5j0.INSTANCE;
            h5j0Var.d("voice_room_view_inflate");
            VoiceRoomView voiceRoomViewInflate = View.inflate(this.f15311a, t6c0.f19595L7, null);
            h5j0Var.a("voice_room_view_inflate", "voice inflate");
            kap0Var = new pho0(jfo0Var, this.f15312b, voiceRoomViewInflate);
        }
        kap0Var.init();
        return kap0Var;
    }

    /* JADX INFO: renamed from: g */
    public AbstractC0485a6 m17804g() {
        return this.f15317g;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0010  */
    /* JADX INFO: renamed from: h */
    public final AbstractC0485a6 m17805h(BLiveAbsData bLiveAbsData) {
        String str;
        AbstractC0485a6 abstractC0485a6M17803f;
        if (t7t.m22812d(bLiveAbsData)) {
            str = "officialShow";
        } else if (bLiveAbsData instanceof BLiveVoice) {
            str = "voice-live";
        } else {
            str = "live";
            if (!(bLiveAbsData instanceof BLive) && bLiveAbsData.isVoiceLive()) {
                str = "voice-live";
            }
        }
        List<AbstractC0485a6> arrayList = this.f15318h.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.f15318h.put(str, arrayList);
        }
        if (arrayList.size() != 0 && vwb.n(arrayList, new w9j() { // from class: l.kbd0
            public final Object call(Object obj) {
                return this.f14269a.m17808k((AbstractC0485a6) obj);
            }
        }).size() != 0) {
            return (AbstractC0485a6) vwb.n(arrayList, new w9j() { // from class: l.lbd0
                public final Object call(Object obj) {
                    return this.f14753a.m17809l((AbstractC0485a6) obj);
                }
            }).get(0);
        }
        if (str.equals("voice-live")) {
            abstractC0485a6M17803f = m17803f();
        } else {
            abstractC0485a6M17803f = !str.equals("officialShow") ? m17801d() : m17802e();
        }
        this.f15319i.m27355o(str);
        arrayList.add(abstractC0485a6M17803f);
        return abstractC0485a6M17803f;
    }

    /* JADX INFO: renamed from: i */
    public AbstractC0485a6 m17806i(BLiveAbsData bLiveAbsData, LiveScrollViewContainer liveScrollViewContainer) {
        AbstractC0485a6 abstractC0485a6M17805h = m17805h(bLiveAbsData);
        if (abstractC0485a6M17805h == null) {
            return null;
        }
        liveScrollViewContainer.m5162a(abstractC0485a6M17805h);
        return abstractC0485a6M17805h;
    }

    /* JADX INFO: renamed from: j */
    public AbstractC0485a6 m17807j(BLiveAbsData bLiveAbsData, LiveScrollViewContainer liveScrollViewContainer) {
        AbstractC0485a6 abstractC0485a6M17805h = m17805h(bLiveAbsData);
        if (abstractC0485a6M17805h == null) {
            return null;
        }
        liveScrollViewContainer.m5162a(abstractC0485a6M17805h);
        m17800c(abstractC0485a6M17805h);
        return abstractC0485a6M17805h;
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Boolean m17808k(AbstractC0485a6 abstractC0485a6) {
        return Boolean.valueOf(abstractC0485a6 != this.f15317g);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Boolean m17809l(AbstractC0485a6 abstractC0485a6) {
        return Boolean.valueOf(abstractC0485a6 != this.f15317g);
    }

    /* JADX INFO: renamed from: m */
    public void m17810m(ho2 ho2Var) {
        this.f15316f = ho2Var;
    }

    /* JADX INFO: renamed from: n */
    public void m17811n(dml dmlVar) {
        this.f15314d = dmlVar;
    }
}
