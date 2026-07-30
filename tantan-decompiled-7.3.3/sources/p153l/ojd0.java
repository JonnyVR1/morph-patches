package p153l;

import android.view.View;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p051p1.mobile.putong.live.base.data.BLive;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveVoice;
import com.p051p1.mobile.putong.live.livingroom.archi.act.LiveBaseFrag;
import com.p051p1.mobile.putong.live.livingroom.archi.frag.LiveScrollViewContainer;
import com.p051p1.mobile.putong.live.livingroom.base.room.RoomView;
import com.p051p1.mobile.putong.live.livingroom.officialshow.OfficialShowView;
import com.p051p1.mobile.putong.live.livingroom.virtual.VoiceVirtualRoomView;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.root.VoiceRoomView;
import com.tantan.live.eventbus.LiveEventBus;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ojd0 {

    /* JADX INFO: renamed from: a */
    public final Act f147651a;

    /* JADX INFO: renamed from: b */
    public final ogd0 f147652b;

    /* JADX INFO: renamed from: c */
    public final AudienceStartData f147653c;

    /* JADX INFO: renamed from: d */
    public pol f147654d;

    /* JADX INFO: renamed from: e */
    public final LiveBaseFrag f147655e;

    /* JADX INFO: renamed from: f */
    public oo2 f147656f;

    /* JADX INFO: renamed from: g */
    public AbstractC21253x5 f147657g;

    /* JADX INFO: renamed from: h */
    public final HashMap<String, List<AbstractC21253x5>> f147658h = new HashMap<>();

    /* JADX INFO: renamed from: i */
    public final ajt f147659i;

    /* JADX INFO: renamed from: j */
    public final bjt f147660j;

    public ojd0(ogd0 ogd0Var, LiveBaseFrag liveBaseFrag, AudienceStartData audienceStartData, ajt ajtVar, bjt bjtVar) {
        this.f147652b = ogd0Var;
        this.f147655e = liveBaseFrag;
        this.f147651a = liveBaseFrag.act();
        this.f147653c = audienceStartData;
        this.f147659i = ajtVar;
        this.f147660j = bjtVar;
    }

    /* JADX INFO: renamed from: c */
    public void m167849c(AbstractC21253x5 abstractC21253x5) {
        this.f147657g = abstractC21253x5;
    }

    /* JADX INFO: renamed from: d */
    public final ljd0 m167850d() {
        LiveBaseFrag liveBaseFrag = this.f147655e;
        pol polVar = this.f147654d;
        oo2 oo2Var = this.f147656f;
        ow40 ow40Var = new ow40(liveBaseFrag, polVar, oo2Var == null ? new ou40(new ew40(), this.f147659i, this.f147660j) : (ou40) oo2Var, new LiveEventBus());
        ((ou40) ow40Var.f90822h).m169232Q2(this.f147653c);
        lej0 lej0Var = lej0.INSTANCE;
        lej0Var.m153910d("live_room_view_inflate");
        RoomView roomView = (RoomView) View.inflate(this.f147651a, yec0.f199152l5, null);
        lej0Var.m153907a("live_room_view_inflate", "inflate");
        ljd0 upi0Var = zrv.f205799a.m207647R() ? new upi0(ow40Var, this.f147652b, roomView) : new ljd0(ow40Var, this.f147652b, roomView);
        upi0Var.init();
        this.f147656f = null;
        return upi0Var;
    }

    /* JADX INFO: renamed from: e */
    public final ef50 m167851e() {
        LiveBaseFrag liveBaseFrag = this.f147655e;
        pol polVar = this.f147654d;
        oo2 oo2Var = this.f147656f;
        ad50 ad50Var = new ad50(liveBaseFrag, polVar, oo2Var == null ? new mc50(new ew40(), this.f147659i, this.f147660j) : (mc50) oo2Var, new LiveEventBus());
        ((mc50) ad50Var.f90822h).m169232Q2(this.f147653c);
        lej0 lej0Var = lej0.INSTANCE;
        lej0Var.m153910d("live_room_view_inflate");
        OfficialShowView officialShowView = (OfficialShowView) View.inflate(this.f147651a, yec0.f198756F4, null);
        lej0Var.m153907a("live_room_view_inflate", "inflate");
        ef50 ef50Var = new ef50(ad50Var, this.f147652b, officialShowView);
        ef50Var.init();
        this.f147656f = null;
        return ef50Var;
    }

    /* JADX INFO: renamed from: f */
    public final AbstractC21253x5 m167852f() {
        AbstractC21253x5 ojp0Var;
        boolean zM203524T5 = zrv.m221193k().m203524T5();
        LiveBaseFrag liveBaseFrag = this.f147655e;
        pol polVar = this.f147654d;
        oo2 oo2Var = this.f147656f;
        noo0 noo0Var = new noo0(liveBaseFrag, polVar, (oo2Var == null || !(oo2Var instanceof jqm0)) ? new jqm0(new szn0(), this.f147659i) : (jqm0) oo2Var, new LiveEventBus());
        ((jqm0) noo0Var.f90822h).m146615g4(this.f147653c);
        if (zM203524T5) {
            ((jqm0) noo0Var.f90822h).m146613e4(this.f147651a, this.f147653c.live);
            ojp0Var = new ojp0(noo0Var, this.f147652b, (VoiceVirtualRoomView) View.inflate(this.f147651a, yec0.f199106hb, null));
        } else {
            lej0 lej0Var = lej0.INSTANCE;
            lej0Var.m153910d("voice_room_view_inflate");
            VoiceRoomView voiceRoomView = (VoiceRoomView) View.inflate(this.f147651a, yec0.f198831L7, null);
            lej0Var.m153907a("voice_room_view_inflate", "voice inflate");
            ojp0Var = new tqo0(noo0Var, this.f147652b, voiceRoomView);
        }
        ojp0Var.init();
        return ojp0Var;
    }

    /* JADX INFO: renamed from: g */
    public AbstractC21253x5 m167853g() {
        return this.f147657g;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0010  */
    /* JADX INFO: renamed from: h */
    public final AbstractC21253x5 m167854h(BLiveAbsData bLiveAbsData) {
        String str;
        AbstractC21253x5 abstractC21253x5M167852f;
        if (u9t.m195115d(bLiveAbsData)) {
            str = "officialShow";
        } else if (bLiveAbsData instanceof BLiveVoice) {
            str = BLiveAbsData.VOICE_LIVE;
        } else {
            str = "live";
            if (!(bLiveAbsData instanceof BLive) && bLiveAbsData.isVoiceLive()) {
                str = BLiveAbsData.VOICE_LIVE;
            }
        }
        List<AbstractC21253x5> arrayList = this.f147658h.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.f147658h.put(str, arrayList);
        }
        if (arrayList.size() != 0 && jyb.m147522n(arrayList, new qcj() { // from class: l.mjd0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f137071a.m167857k((AbstractC21253x5) obj);
            }
        }).size() != 0) {
            return (AbstractC21253x5) jyb.m147522n(arrayList, new qcj() { // from class: l.njd0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f142287a.m167858l((AbstractC21253x5) obj);
                }
            }).get(0);
        }
        if (str.equals(BLiveAbsData.VOICE_LIVE)) {
            abstractC21253x5M167852f = m167852f();
        } else {
            abstractC21253x5M167852f = !str.equals("officialShow") ? m167850d() : m167851e();
        }
        this.f147659i.m98468o(str);
        arrayList.add(abstractC21253x5M167852f);
        return abstractC21253x5M167852f;
    }

    /* JADX INFO: renamed from: i */
    public AbstractC21253x5 m167855i(BLiveAbsData bLiveAbsData, LiveScrollViewContainer liveScrollViewContainer) {
        AbstractC21253x5 abstractC21253x5M167854h = m167854h(bLiveAbsData);
        if (abstractC21253x5M167854h == null) {
            return null;
        }
        liveScrollViewContainer.m72976a(abstractC21253x5M167854h);
        return abstractC21253x5M167854h;
    }

    /* JADX INFO: renamed from: j */
    public AbstractC21253x5 m167856j(BLiveAbsData bLiveAbsData, LiveScrollViewContainer liveScrollViewContainer) {
        AbstractC21253x5 abstractC21253x5M167854h = m167854h(bLiveAbsData);
        if (abstractC21253x5M167854h == null) {
            return null;
        }
        liveScrollViewContainer.m72976a(abstractC21253x5M167854h);
        m167849c(abstractC21253x5M167854h);
        return abstractC21253x5M167854h;
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Boolean m167857k(AbstractC21253x5 abstractC21253x5) {
        return Boolean.valueOf(abstractC21253x5 != this.f147657g);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Boolean m167858l(AbstractC21253x5 abstractC21253x5) {
        return Boolean.valueOf(abstractC21253x5 != this.f147657g);
    }

    /* JADX INFO: renamed from: m */
    public void m167859m(oo2 oo2Var) {
        this.f147656f = oo2Var;
    }

    /* JADX INFO: renamed from: n */
    public void m167860n(pol polVar) {
        this.f147654d = polVar;
    }
}
