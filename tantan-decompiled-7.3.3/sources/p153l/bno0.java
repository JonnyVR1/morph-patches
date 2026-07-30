package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.data.PushMessage;
import com.p051p1.mobile.putong.data.PushMessageCustom;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes9.dex */
public class bno0 implements ano0 {

    /* JADX INFO: renamed from: a */
    public v4n0 f77567a;

    /* JADX INFO: renamed from: b */
    public C22508b<uxj0> f77568b = C22508b.m222767b();

    @Override // p153l.ano0
    /* JADX INFO: renamed from: a */
    public View mo99018a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(xec0.f193844a2, viewGroup, false);
    }

    @Override // p153l.ano0
    /* JADX INFO: renamed from: b */
    public void mo99019b(int i) {
        this.f77568b.onNext(uxj0.f181467a);
    }

    @Override // p153l.ano0
    /* JADX INFO: renamed from: c */
    public void mo99020c(int i, View view, PushMessage pushMessage) {
        qnp0.m177261d1(view, qa00.m175859d(20.0f));
        if (i != 0 || pushMessage == null) {
            return;
        }
        try {
            if (this.f77567a == null) {
                PushMessageCustom pushMessageCustom = pushMessage.messageCustom;
                m105598e(pushMessageCustom.liveId, pushMessageCustom.userId);
            }
            this.f77567a = new v4n0(this, view, i, pushMessage);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            e.printStackTrace();
        }
    }

    @Override // p153l.ano0
    /* JADX INFO: renamed from: d */
    public C22508b<uxj0> mo99021d() {
        return this.f77568b;
    }

    /* JADX INFO: renamed from: e */
    public final void m105598e(String str, String str2) {
        q4f q4fVar = new q4f();
        q4fVar.f155566d = EventNameEnum.PAGE_VIEW;
        q4fVar.f155576n = "p_suggest_users_home_view";
        i4g0.m138517o(q4fVar, jyb.m147494Y("suggest_card_type", "audio_room"), jyb.m147494Y("liveId", str), jyb.m147494Y("anchorId", str2), jyb.m147494Y("audio_card_type", "swipe_card"), jyb.m147494Y("audio_room_label", "NA"), jyb.m147494Y("audio_room_type", "普通"), jyb.m147494Y("topic_id", "NA"), jyb.m147494Y("audio_tab_id", "NA"));
    }
}
