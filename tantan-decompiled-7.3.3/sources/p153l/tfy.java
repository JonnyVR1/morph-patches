package p153l;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.businessdata.meet.MeetLiveItemData;
import com.p051p1.mobile.putong.core.data.LiveType;
import com.p051p1.mobile.putong.core.newui.newmeet.frag.meet.NewMeetFragPresenter;
import com.p051p1.mobile.putong.core.newui.newmeet.header.MeetStateHeaderItem;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes11.dex */
public class tfy extends jic0<MeetLiveItemData> {

    /* JADX INFO: renamed from: c */
    public final ArrayList<MeetLiveItemData> f174023c = new ArrayList<>();

    /* JADX INFO: renamed from: d */
    public final NewMeetFragPresenter f174024d;

    public tfy(NewMeetFragPresenter newMeetFragPresenter) {
        this.f174024d = newMeetFragPresenter;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f174023c.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return p9r.m171370a(viewGroup.getContext()).inflate(pec0.f152054x1, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, final MeetLiveItemData meetLiveItemData, int i, int i2) {
        ((MeetStateHeaderItem) view).m44045R(meetLiveItemData, new y20() { // from class: l.qfy
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f157359a.m191010J(meetLiveItemData, (View) obj);
            }
        }, new y20() { // from class: l.rfy
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f162890a.m191011K(meetLiveItemData, (View) obj);
            }
        });
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public MeetLiveItemData getItem(int i) {
        return this.f174023c.get(i);
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m191010J(MeetLiveItemData meetLiveItemData, View view) {
        if (meetLiveItemData.getItem().liveType == LiveType.get("live")) {
            i4g0.m138523u("e_live_room_enter", "p_meet", jyb.m147494Y("meet_realtime_relationship", dby.m115175c(meetLiveItemData)), jyb.m147494Y("module", "meet_photo"), jyb.m147494Y("other_user_id", meetLiveItemData.user.f56859id), jyb.m147494Y("live_enter_source", "realtime_meet"));
            this.f174024d.m44035n1(meetLiveItemData.user.f56859id, meetLiveItemData.getItem().roomId);
        } else if (meetLiveItemData.getItem().liveType == LiveType.get(LiveType.liveVoice)) {
            i4g0.m138523u("e_live_audio_room_enter", "p_meet", jyb.m147494Y("meet_realtime_relationship", dby.m115175c(meetLiveItemData)), jyb.m147494Y("audio_card_type", "meet_photo"));
            this.f174024d.m44036o1(meetLiveItemData.user.f56859id, meetLiveItemData.getItem().roomId);
        }
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m191011K(MeetLiveItemData meetLiveItemData, View view) {
        this.f174024d.m44029h1(meetLiveItemData, true);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: L */
    public void m191012L(List<MeetLiveItemData> list) {
        if (jyb.m147518l(list, this.f174023c, new rcj() { // from class: l.sfy
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return Boolean.valueOf(Objects.equals(((MeetLiveItemData) obj).getItem(), ((MeetLiveItemData) obj2).getItem()));
            }
        })) {
            return;
        }
        this.f174023c.clear();
        this.f174023c.addAll(list);
        notifyDataSetChanged();
    }
}
