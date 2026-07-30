package p149l;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.PushMessageCustom;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.apibean.IntlVoiceLiveActivitiesCellBean;
import com.p046p1.mobile.putong.live.base.bean.AnchorStartData;
import com.p046p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceFeedStyle;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceFeedStyleType;
import com.p046p1.mobile.putong.live.external.intl.module.api.IntlVoiceCenterApiProvider;
import com.p046p1.mobile.putong.live.external.page.setting.LiveIndependentSettingAct;
import com.p046p1.mobile.putong.live.external.voice.entry.VoiceConversationEntryAct;
import java.util.HashMap;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes13.dex */
public class ekn0 implements bkn0 {
    @Override // p149l.bkn0
    /* JADX INFO: renamed from: a */
    public HashMap<String, String> mo102416a() {
        BLiveVoiceFeedStyle bLiveVoiceFeedStyleM195809c6 = s9s.f163228b.m195809c6();
        HashMap<String, String> map = new HashMap<>();
        if (bLiveVoiceFeedStyleM195809c6 == null) {
            return map;
        }
        map.put("page_follow", TEnum.equals(bLiveVoiceFeedStyleM195809c6.follow, BLiveVoiceFeedStyleType.BigCard) ? "type_big_card" : "type_small_card");
        map.put("page_nearby", TEnum.equals(bLiveVoiceFeedStyleM195809c6.nearby, BLiveVoiceFeedStyleType.BigCard) ? "type_big_card" : "type_small_card");
        map.put("page_photo", TEnum.equals(bLiveVoiceFeedStyleM195809c6.photo, BLiveVoiceFeedStyleType.BigCard) ? "type_big_card" : "type_small_card");
        return map;
    }

    @Override // p149l.bkn0
    /* JADX INFO: renamed from: b */
    public void mo102417b() {
        i4t i4tVar = s9s.f163232f;
        if (i4tVar != null) {
            i4tVar.m134371d();
        }
        fnk0.m122316b().m122317a();
        pqi.m170912d().m170915c();
    }

    @Override // p149l.bkn0
    /* JADX INFO: renamed from: c */
    public boolean mo102418c() {
        return vdt.m198095e() || vdt.m198093c();
    }

    @Override // p149l.bkn0
    /* JADX INFO: renamed from: d */
    public Intent mo102419d(Context context) {
        return VoiceConversationEntryAct.m70945X1(context);
    }

    @Override // p149l.bkn0
    /* JADX INFO: renamed from: e */
    public void mo102420e(Context context, String str, String str2, @Nullable String str3) {
        context.startActivity(s9s.f163232f.m134373f(context, AudienceStartData.getBuilder().m67606Q(true).m67594E(str).m67604O(str2).m67615y(str3).m67611u()));
    }

    @Override // p149l.bkn0
    /* JADX INFO: renamed from: f */
    public C22306c<roj0> mo102421f() {
        return ((nj3) s9s.m182763m(gld0.f103312b)).m159634p();
    }

    @Override // p149l.bkn0
    /* JADX INFO: renamed from: i */
    public void mo102424i(Act act, String str) {
        s9s.f163232f.m134369b(act, AnchorStartData.getBuilder().m67563n(str).m67560k());
    }

    @Override // p149l.bkn0
    /* JADX INFO: renamed from: j */
    public void mo102425j(Act act) {
        if (vdt.m198092b(3)) {
            return;
        }
        act.duringCreated(vtn.m200048c()).subscribe(ffw.m121197h(new e30() { // from class: l.dkn0
            @Override // p149l.e30
            public final void call(Object obj) {
                ((nj3) s9s.m182763m(gld0.f103312b)).m159615M((l2s) obj);
            }
        }));
    }

    @Override // p149l.bkn0
    /* JADX INFO: renamed from: k */
    public l2s mo102426k() {
        return ((nj3) s9s.m182763m(gld0.f103312b)).m159632n();
    }

    @Override // p149l.bkn0
    /* JADX INFO: renamed from: l */
    public String mo102427l(int i) {
        return dpn0.m112919b(i);
    }

    @Override // p149l.bkn0
    /* JADX INFO: renamed from: m */
    public C22306c<roj0> mo102428m() {
        return ((nj3) s9s.m182763m(gld0.f103312b)).m159636r();
    }

    @Override // p149l.bkn0
    /* JADX INFO: renamed from: n */
    public void mo102429n(Context context) {
        context.startActivity(LiveIndependentSettingAct.m70699Y1(context, "voice_favorite_chat_rooms", null));
    }

    @Override // p149l.bkn0
    /* JADX INFO: renamed from: o */
    public void mo102430o(Act act) {
        act.duringCreated(IntlVoiceCenterApiProvider.getVoiceActivitiesChatData()).subscribe(ffw.m121194e(new e30() { // from class: l.ckn0
            @Override // p149l.e30
            public final void call(Object obj) {
                ((nj3) s9s.m182763m(gld0.f103312b)).m159616N((IntlVoiceLiveActivitiesCellBean) obj);
            }
        }, new di0()));
    }

    @Override // p149l.bkn0
    /* JADX INFO: renamed from: p */
    public void mo102431p(Context context, String str, String str2, String str3, @Nullable String str4) {
        context.startActivity(s9s.f163232f.m134373f(context, AudienceStartData.getBuilder().m67594E(str).m67604O(str2).m67615y(str4).m67606Q(true).m67616z(str3).m67611u()));
    }

    @Override // p149l.bkn0
    /* JADX INFO: renamed from: q */
    public boolean mo102432q() {
        uut uutVar = s9s.f163228b;
        if (uutVar == null) {
            return false;
        }
        return uutVar.m195767X3();
    }

    @Override // p149l.bkn0
    /* JADX INFO: renamed from: r */
    public void mo102433r(Context context, String str) {
        yuf0.m216111a(context, str);
    }

    @Override // p149l.bkn0
    /* JADX INFO: renamed from: s */
    public View mo102434s(Act act) {
        return new View(act);
    }

    @Override // p149l.bkn0
    /* JADX INFO: renamed from: t */
    public C22306c<l2s> mo102435t() {
        return ((nj3) s9s.m182763m(gld0.f103312b)).m159633o();
    }

    @Override // p149l.bkn0
    /* JADX INFO: renamed from: u */
    public void mo102436u(Act act, Bundle bundle) {
        x9o0.m207504d(act, bundle);
    }

    @Override // p149l.bkn0
    /* JADX INFO: renamed from: g */
    public void mo102422g(View view, PushMessageCustom pushMessageCustom, d30 d30Var) {
    }

    @Override // p149l.bkn0
    /* JADX INFO: renamed from: h */
    public void mo102423h(Act act, ViewGroup viewGroup, String str, String str2) {
    }
}
