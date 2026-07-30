package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.data.PushMessage;
import com.p046p1.mobile.putong.data.PushMessageCustom;
import com.p046p1.mobile.putong.live.base.data.BLiveVirtualVoiceCard;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes13.dex */
public class gvm0 implements fvm0 {

    /* JADX INFO: renamed from: a */
    public hvm0 f104580a;

    /* JADX INFO: renamed from: b */
    public int f104581b = 0;

    /* JADX INFO: renamed from: c */
    public C22393b<roj0> f104582c = C22393b.m221521b();

    @Override // p149l.fvm0
    /* JADX INFO: renamed from: a */
    public View mo123340a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(s6c0.f162702R1, viewGroup, false);
    }

    @Override // p149l.fvm0
    /* JADX INFO: renamed from: b */
    public void mo123341b(int i) {
        hvm0 hvm0Var = this.f104580a;
        if (hvm0Var != null) {
            hvm0Var.m133193b();
            this.f104580a = null;
        }
        this.f104582c.onNext(roj0.f160388a);
    }

    @Override // p149l.fvm0
    /* JADX INFO: renamed from: c */
    public void mo123342c(int i, View view, Object obj) {
        if (i != 0 || obj == null) {
            return;
        }
        try {
            if (obj instanceof BLiveVirtualVoiceCard) {
                BLiveVirtualVoiceCard bLiveVirtualVoiceCard = (BLiveVirtualVoiceCard) obj;
                if (this.f104580a == null) {
                    m128262e(bLiveVirtualVoiceCard.liveId, bLiveVirtualVoiceCard.anchor.f44451id);
                }
                this.f104580a = new kvm0(view, bLiveVirtualVoiceCard, this.f104581b);
                return;
            }
            if (obj instanceof PushMessage) {
                PushMessage pushMessage = (PushMessage) obj;
                if (this.f104580a == null) {
                    PushMessageCustom pushMessageCustom = pushMessage.messageCustom;
                    m128262e(pushMessageCustom.liveId, pushMessageCustom.userId);
                }
                this.f104580a = new nvm0(this, view, pushMessage, this.f104581b);
            }
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            e.printStackTrace();
        }
    }

    @Override // p149l.fvm0
    /* JADX INFO: renamed from: d */
    public C22393b<roj0> mo123343d() {
        return this.f104582c;
    }

    /* JADX INFO: renamed from: e */
    public final void m128262e(String str, String str2) {
        l3f l3fVar = new l3f();
        l3fVar.f125885d = EventNameEnum.PAGE_VIEW;
        l3fVar.f125895n = "p_suggest_users_home_view";
        zvf0.m220393o(l3fVar, vwb.m200311Y("suggest_card_type", "audio_room"), vwb.m200311Y("liveId", str), vwb.m200311Y("anchorId", str2), vwb.m200311Y("audio_card_type", "swipe_card"), vwb.m200311Y("audio_room_label", "NA"), vwb.m200311Y("audio_room_type", "普通"), vwb.m200311Y("topic_id", "NA"), vwb.m200311Y("audio_tab_id", "NA"));
    }
}
