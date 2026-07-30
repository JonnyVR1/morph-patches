package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.data.PushMessage;
import com.p051p1.mobile.putong.data.PushMessageCustom;
import com.p051p1.mobile.putong.live.base.data.BLiveVirtualVoiceCard;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes9.dex */
public class k4n0 implements j4n0 {

    /* JADX INFO: renamed from: a */
    public l4n0 f123904a;

    /* JADX INFO: renamed from: b */
    public int f123905b = 0;

    /* JADX INFO: renamed from: c */
    public C22508b<uxj0> f123906c = C22508b.m222767b();

    @Override // p153l.j4n0
    /* JADX INFO: renamed from: a */
    public View mo143442a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(xec0.f193816R1, viewGroup, false);
    }

    @Override // p153l.j4n0
    /* JADX INFO: renamed from: b */
    public void mo143443b(int i) {
        l4n0 l4n0Var = this.f123904a;
        if (l4n0Var != null) {
            l4n0Var.m152811b();
            this.f123904a = null;
        }
        this.f123906c.onNext(uxj0.f181467a);
    }

    @Override // p153l.j4n0
    /* JADX INFO: renamed from: c */
    public void mo143444c(int i, View view, Object obj) {
        if (i != 0 || obj == null) {
            return;
        }
        try {
            if (obj instanceof BLiveVirtualVoiceCard) {
                BLiveVirtualVoiceCard bLiveVirtualVoiceCard = (BLiveVirtualVoiceCard) obj;
                if (this.f123904a == null) {
                    m148271e(bLiveVirtualVoiceCard.liveId, bLiveVirtualVoiceCard.anchor.f45299id);
                }
                this.f123904a = new o4n0(view, bLiveVirtualVoiceCard, this.f123905b);
                return;
            }
            if (obj instanceof PushMessage) {
                PushMessage pushMessage = (PushMessage) obj;
                if (this.f123904a == null) {
                    PushMessageCustom pushMessageCustom = pushMessage.messageCustom;
                    m148271e(pushMessageCustom.liveId, pushMessageCustom.userId);
                }
                this.f123904a = new r4n0(this, view, pushMessage, this.f123905b);
            }
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            e.printStackTrace();
        }
    }

    @Override // p153l.j4n0
    /* JADX INFO: renamed from: d */
    public C22508b<uxj0> mo143445d() {
        return this.f123906c;
    }

    /* JADX INFO: renamed from: e */
    public final void m148271e(String str, String str2) {
        q4f q4fVar = new q4f();
        q4fVar.f155566d = EventNameEnum.PAGE_VIEW;
        q4fVar.f155576n = "p_suggest_users_home_view";
        i4g0.m138517o(q4fVar, jyb.m147494Y("suggest_card_type", "audio_room"), jyb.m147494Y("liveId", str), jyb.m147494Y("anchorId", str2), jyb.m147494Y("audio_card_type", "swipe_card"), jyb.m147494Y("audio_room_label", "NA"), jyb.m147494Y("audio_room_type", "普通"), jyb.m147494Y("topic_id", "NA"), jyb.m147494Y("audio_tab_id", "NA"));
    }
}
