package p153l;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.PushMessageCustom;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.apibean.IntlVoiceLiveActivitiesCellBean;
import com.p051p1.mobile.putong.live.base.bean.AnchorStartData;
import com.p051p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceFeedStyle;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceFeedStyleType;
import com.p051p1.mobile.putong.live.external.intl.module.api.IntlVoiceCenterApiProvider;
import com.p051p1.mobile.putong.live.external.page.setting.LiveIndependentSettingAct;
import com.p051p1.mobile.putong.live.external.voice.entry.VoiceConversationEntryAct;
import java.util.HashMap;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class itn0 implements ftn0 {
    @Override // p153l.ftn0
    /* JADX INFO: renamed from: a */
    public HashMap<String, String> mo127330a() {
        BLiveVoiceFeedStyle bLiveVoiceFeedStyleM203596c6 = tbs.f172989b.m203596c6();
        HashMap<String, String> map = new HashMap<>();
        if (bLiveVoiceFeedStyleM203596c6 == null) {
            return map;
        }
        map.put("page_follow", TEnum.equals(bLiveVoiceFeedStyleM203596c6.follow, BLiveVoiceFeedStyleType.BigCard) ? "type_big_card" : "type_small_card");
        map.put("page_nearby", TEnum.equals(bLiveVoiceFeedStyleM203596c6.nearby, BLiveVoiceFeedStyleType.BigCard) ? "type_big_card" : "type_small_card");
        map.put("page_photo", TEnum.equals(bLiveVoiceFeedStyleM203596c6.photo, BLiveVoiceFeedStyleType.BigCard) ? "type_big_card" : "type_small_card");
        return map;
    }

    @Override // p153l.ftn0
    /* JADX INFO: renamed from: b */
    public void mo127331b() {
        j6t j6tVar = tbs.f172993f;
        if (j6tVar != null) {
            j6tVar.m143702d();
        }
        lwk0.m156066b().m156067a();
        lti.m155789d().m155792c();
    }

    @Override // p153l.ftn0
    /* JADX INFO: renamed from: c */
    public boolean mo127332c() {
        return wft.m206162e() || wft.m206160c();
    }

    @Override // p153l.ftn0
    /* JADX INFO: renamed from: d */
    public Intent mo127333d(Context context) {
        return VoiceConversationEntryAct.m72128Y1(context);
    }

    @Override // p153l.ftn0
    /* JADX INFO: renamed from: e */
    public void mo127334e(Context context, String str, String str2, @Nullable String str3) {
        context.startActivity(tbs.f172993f.m143704f(context, AudienceStartData.getBuilder().m68789Q(true).m68777E(str).m68787O(str2).m68798y(str3).m68794u()));
    }

    @Override // p153l.ftn0
    /* JADX INFO: renamed from: f */
    public C22421c<uxj0> mo127335f() {
        return ((fk3) tbs.m190077m(itd0.f116820b)).m125965p();
    }

    @Override // p153l.ftn0
    /* JADX INFO: renamed from: i */
    public void mo127338i(Act act, String str) {
        tbs.f172993f.m143700b(act, AnchorStartData.getBuilder().m68746n(str).m68743k());
    }

    @Override // p153l.ftn0
    /* JADX INFO: renamed from: j */
    public void mo127339j(Act act) {
        if (wft.m206159b(3)) {
            return;
        }
        act.duringCreated(vvn.m203024c()).subscribe(dhw.m115829h(new y20() { // from class: l.htn0
            @Override // p153l.y20
            public final void call(Object obj) {
                ((fk3) tbs.m190077m(itd0.f116820b)).m125946M((m4s) obj);
            }
        }));
    }

    @Override // p153l.ftn0
    /* JADX INFO: renamed from: k */
    public m4s mo127340k() {
        return ((fk3) tbs.m190077m(itd0.f116820b)).m125963n();
    }

    @Override // p153l.ftn0
    /* JADX INFO: renamed from: l */
    public String mo127341l(int i) {
        return hyn0.m137760b(i);
    }

    @Override // p153l.ftn0
    /* JADX INFO: renamed from: m */
    public C22421c<uxj0> mo127342m() {
        return ((fk3) tbs.m190077m(itd0.f116820b)).m125967r();
    }

    @Override // p153l.ftn0
    /* JADX INFO: renamed from: n */
    public void mo127343n(Context context) {
        context.startActivity(LiveIndependentSettingAct.m71882Z1(context, "voice_favorite_chat_rooms", null));
    }

    @Override // p153l.ftn0
    /* JADX INFO: renamed from: o */
    public void mo127344o(Act act) {
        act.duringCreated(IntlVoiceCenterApiProvider.getVoiceActivitiesChatData()).subscribe(dhw.m115826e(new y20() { // from class: l.gtn0
            @Override // p153l.y20
            public final void call(Object obj) {
                ((fk3) tbs.m190077m(itd0.f116820b)).m125947N((IntlVoiceLiveActivitiesCellBean) obj);
            }
        }, new zh0()));
    }

    @Override // p153l.ftn0
    /* JADX INFO: renamed from: p */
    public void mo127345p(Context context, String str, String str2, String str3, @Nullable String str4) {
        context.startActivity(tbs.f172993f.m143704f(context, AudienceStartData.getBuilder().m68777E(str).m68787O(str2).m68798y(str4).m68789Q(true).m68799z(str3).m68794u()));
    }

    @Override // p153l.ftn0
    /* JADX INFO: renamed from: q */
    public boolean mo127346q() {
        vwt vwtVar = tbs.f172989b;
        if (vwtVar == null) {
            return false;
        }
        return vwtVar.m203554X3();
    }

    @Override // p153l.ftn0
    /* JADX INFO: renamed from: r */
    public void mo127347r(Context context, String str) {
        h3g0.m133482a(context, str);
    }

    @Override // p153l.ftn0
    /* JADX INFO: renamed from: s */
    public View mo127348s(Act act) {
        return new View(act);
    }

    @Override // p153l.ftn0
    /* JADX INFO: renamed from: t */
    public C22421c<m4s> mo127349t() {
        return ((fk3) tbs.m190077m(itd0.f116820b)).m125964o();
    }

    @Override // p153l.ftn0
    /* JADX INFO: renamed from: u */
    public void mo127350u(Act act, Bundle bundle) {
        bjo0.m104637d(act, bundle);
    }

    @Override // p153l.ftn0
    /* JADX INFO: renamed from: g */
    public void mo127336g(View view, PushMessageCustom pushMessageCustom, x20 x20Var) {
    }

    @Override // p153l.ftn0
    /* JADX INFO: renamed from: h */
    public void mo127337h(Act act, ViewGroup viewGroup, String str, String str2) {
    }
}
