package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.data.PushMessage;
import com.p046p1.mobile.putong.data.PushMessageCustom;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes13.dex */
public class xdo0 implements wdo0 {

    /* JADX INFO: renamed from: a */
    public rvm0 f192433a;

    /* JADX INFO: renamed from: b */
    public C22393b<roj0> f192434b = C22393b.m221521b();

    @Override // p149l.wdo0
    /* JADX INFO: renamed from: a */
    public View mo202773a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(s6c0.f162730a2, viewGroup, false);
    }

    @Override // p149l.wdo0
    /* JADX INFO: renamed from: b */
    public void mo202774b(int i) {
        this.f192434b.onNext(roj0.f160388a);
    }

    @Override // p149l.wdo0
    /* JADX INFO: renamed from: c */
    public void mo202775c(int i, View view, PushMessage pushMessage) {
        mep0.m154302d1(view, t100.m186890d(20.0f));
        if (i != 0 || pushMessage == null) {
            return;
        }
        try {
            if (this.f192433a == null) {
                PushMessageCustom pushMessageCustom = pushMessage.messageCustom;
                m208418e(pushMessageCustom.liveId, pushMessageCustom.userId);
            }
            this.f192433a = new rvm0(this, view, i, pushMessage);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            e.printStackTrace();
        }
    }

    @Override // p149l.wdo0
    /* JADX INFO: renamed from: d */
    public C22393b<roj0> mo202776d() {
        return this.f192434b;
    }

    /* JADX INFO: renamed from: e */
    public final void m208418e(String str, String str2) {
        l3f l3fVar = new l3f();
        l3fVar.f125885d = EventNameEnum.PAGE_VIEW;
        l3fVar.f125895n = "p_suggest_users_home_view";
        zvf0.m220393o(l3fVar, vwb.m200311Y("suggest_card_type", "audio_room"), vwb.m200311Y("liveId", str), vwb.m200311Y("anchorId", str2), vwb.m200311Y("audio_card_type", "swipe_card"), vwb.m200311Y("audio_room_label", "NA"), vwb.m200311Y("audio_room_type", "普通"), vwb.m200311Y("topic_id", "NA"), vwb.m200311Y("audio_tab_id", "NA"));
    }
}
