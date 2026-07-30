package p149l;

import android.view.View;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p046p1.mobile.putong.live.base.data.BLive;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveVoice;
import com.p046p1.mobile.putong.live.livingroom.archi.act.LiveBaseFrag;
import com.p046p1.mobile.putong.live.livingroom.archi.frag.LiveScrollViewContainer;
import com.p046p1.mobile.putong.live.livingroom.base.room.RoomView;
import com.p046p1.mobile.putong.live.livingroom.officialshow.OfficialShowView;
import com.p046p1.mobile.putong.live.livingroom.virtual.VoiceVirtualRoomView;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.root.VoiceRoomView;
import com.tantan.live.eventbus.LiveEventBus;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class mbd0 {

    /* JADX INFO: renamed from: a */
    public final Act f133005a;

    /* JADX INFO: renamed from: b */
    public final l8d0 f133006b;

    /* JADX INFO: renamed from: c */
    public final AudienceStartData f133007c;

    /* JADX INFO: renamed from: d */
    public dml f133008d;

    /* JADX INFO: renamed from: e */
    public final LiveBaseFrag f133009e;

    /* JADX INFO: renamed from: f */
    public ho2 f133010f;

    /* JADX INFO: renamed from: g */
    public AbstractC15533a6 f133011g;

    /* JADX INFO: renamed from: h */
    public final HashMap<String, List<AbstractC15533a6>> f133012h = new HashMap<>();

    /* JADX INFO: renamed from: i */
    public final zgt f133013i;

    /* JADX INFO: renamed from: j */
    public final aht f133014j;

    public mbd0(l8d0 l8d0Var, LiveBaseFrag liveBaseFrag, AudienceStartData audienceStartData, zgt zgtVar, aht ahtVar) {
        this.f133006b = l8d0Var;
        this.f133009e = liveBaseFrag;
        this.f133005a = liveBaseFrag.act();
        this.f133007c = audienceStartData;
        this.f133013i = zgtVar;
        this.f133014j = ahtVar;
    }

    /* JADX INFO: renamed from: c */
    public void m153870c(AbstractC15533a6 abstractC15533a6) {
        this.f133011g = abstractC15533a6;
    }

    /* JADX INFO: renamed from: d */
    public final jbd0 m153871d() {
        LiveBaseFrag liveBaseFrag = this.f133009e;
        dml dmlVar = this.f133008d;
        ho2 ho2Var = this.f133010f;
        ao40 ao40Var = new ao40(liveBaseFrag, dmlVar, ho2Var == null ? new am40(new qn40(), this.f133013i, this.f133014j) : (am40) ho2Var, new LiveEventBus());
        ((am40) ao40Var.f77102h).m97485Q2(this.f133007c);
        h5j0 h5j0Var = h5j0.INSTANCE;
        h5j0Var.m129405d("live_room_view_inflate");
        RoomView roomView = (RoomView) View.inflate(this.f133005a, t6c0.f168420l5, null);
        h5j0Var.m129402a("live_room_view_inflate", "inflate");
        jbd0 ugi0Var = ypv.f199493a.m199325R() ? new ugi0(ao40Var, this.f133006b, roomView) : new jbd0(ao40Var, this.f133006b, roomView);
        ugi0Var.init();
        this.f133010f = null;
        return ugi0Var;
    }

    /* JADX INFO: renamed from: e */
    public final p650 m153872e() {
        LiveBaseFrag liveBaseFrag = this.f133009e;
        dml dmlVar = this.f133008d;
        ho2 ho2Var = this.f133010f;
        l450 l450Var = new l450(liveBaseFrag, dmlVar, ho2Var == null ? new x350(new qn40(), this.f133013i, this.f133014j) : (x350) ho2Var, new LiveEventBus());
        ((x350) l450Var.f77102h).m97485Q2(this.f133007c);
        h5j0 h5j0Var = h5j0.INSTANCE;
        h5j0Var.m129405d("live_room_view_inflate");
        OfficialShowView officialShowView = (OfficialShowView) View.inflate(this.f133005a, t6c0.f168024F4, null);
        h5j0Var.m129402a("live_room_view_inflate", "inflate");
        p650 p650Var = new p650(l450Var, this.f133006b, officialShowView);
        p650Var.init();
        this.f133010f = null;
        return p650Var;
    }

    /* JADX INFO: renamed from: f */
    public final AbstractC15533a6 m153873f() {
        AbstractC15533a6 kap0Var;
        boolean zM195737T5 = ypv.m215672k().m195737T5();
        LiveBaseFrag liveBaseFrag = this.f133009e;
        dml dmlVar = this.f133008d;
        ho2 ho2Var = this.f133010f;
        jfo0 jfo0Var = new jfo0(liveBaseFrag, dmlVar, (ho2Var == null || !(ho2Var instanceof fhm0)) ? new fhm0(new oqn0(), this.f133013i) : (fhm0) ho2Var, new LiveEventBus());
        ((fhm0) jfo0Var.f77102h).m121386g4(this.f133007c);
        if (zM195737T5) {
            ((fhm0) jfo0Var.f77102h).m121384e4(this.f133005a, this.f133007c.live);
            kap0Var = new kap0(jfo0Var, this.f133006b, (VoiceVirtualRoomView) View.inflate(this.f133005a, t6c0.f168374hb, null));
        } else {
            h5j0 h5j0Var = h5j0.INSTANCE;
            h5j0Var.m129405d("voice_room_view_inflate");
            VoiceRoomView voiceRoomView = (VoiceRoomView) View.inflate(this.f133005a, t6c0.f168099L7, null);
            h5j0Var.m129402a("voice_room_view_inflate", "voice inflate");
            kap0Var = new pho0(jfo0Var, this.f133006b, voiceRoomView);
        }
        kap0Var.init();
        return kap0Var;
    }

    /* JADX INFO: renamed from: g */
    public AbstractC15533a6 m153874g() {
        return this.f133011g;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0010  */
    /* JADX INFO: renamed from: h */
    public final AbstractC15533a6 m153875h(BLiveAbsData bLiveAbsData) {
        String str;
        AbstractC15533a6 abstractC15533a6M153873f;
        if (t7t.m187504d(bLiveAbsData)) {
            str = "officialShow";
        } else if (bLiveAbsData instanceof BLiveVoice) {
            str = BLiveAbsData.VOICE_LIVE;
        } else {
            str = "live";
            if (!(bLiveAbsData instanceof BLive) && bLiveAbsData.isVoiceLive()) {
                str = BLiveAbsData.VOICE_LIVE;
            }
        }
        List<AbstractC15533a6> arrayList = this.f133012h.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.f133012h.put(str, arrayList);
        }
        if (arrayList.size() != 0 && vwb.m200339n(arrayList, new w9j() { // from class: l.kbd0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f122231a.m153878k((AbstractC15533a6) obj);
            }
        }).size() != 0) {
            return (AbstractC15533a6) vwb.m200339n(arrayList, new w9j() { // from class: l.lbd0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f127288a.m153879l((AbstractC15533a6) obj);
                }
            }).get(0);
        }
        if (str.equals(BLiveAbsData.VOICE_LIVE)) {
            abstractC15533a6M153873f = m153873f();
        } else {
            abstractC15533a6M153873f = !str.equals("officialShow") ? m153871d() : m153872e();
        }
        this.f133013i.m218704o(str);
        arrayList.add(abstractC15533a6M153873f);
        return abstractC15533a6M153873f;
    }

    /* JADX INFO: renamed from: i */
    public AbstractC15533a6 m153876i(BLiveAbsData bLiveAbsData, LiveScrollViewContainer liveScrollViewContainer) {
        AbstractC15533a6 abstractC15533a6M153875h = m153875h(bLiveAbsData);
        if (abstractC15533a6M153875h == null) {
            return null;
        }
        liveScrollViewContainer.m71793a(abstractC15533a6M153875h);
        return abstractC15533a6M153875h;
    }

    /* JADX INFO: renamed from: j */
    public AbstractC15533a6 m153877j(BLiveAbsData bLiveAbsData, LiveScrollViewContainer liveScrollViewContainer) {
        AbstractC15533a6 abstractC15533a6M153875h = m153875h(bLiveAbsData);
        if (abstractC15533a6M153875h == null) {
            return null;
        }
        liveScrollViewContainer.m71793a(abstractC15533a6M153875h);
        m153870c(abstractC15533a6M153875h);
        return abstractC15533a6M153875h;
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Boolean m153878k(AbstractC15533a6 abstractC15533a6) {
        return Boolean.valueOf(abstractC15533a6 != this.f133011g);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Boolean m153879l(AbstractC15533a6 abstractC15533a6) {
        return Boolean.valueOf(abstractC15533a6 != this.f133011g);
    }

    /* JADX INFO: renamed from: m */
    public void m153880m(ho2 ho2Var) {
        this.f133010f = ho2Var;
    }

    /* JADX INFO: renamed from: n */
    public void m153881n(dml dmlVar) {
        this.f133008d = dmlVar;
    }
}
