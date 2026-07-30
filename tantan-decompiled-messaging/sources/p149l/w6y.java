package p149l;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.businessdata.meet.MeetLiveItemData;
import com.p046p1.mobile.putong.core.data.LiveType;
import com.p046p1.mobile.putong.core.newui.newmeet.frag.meet.NewMeetFragPresenter;
import com.p046p1.mobile.putong.core.newui.newmeet.header.MeetStateHeaderItem;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes11.dex */
public class w6y extends dac0<MeetLiveItemData> {

    /* JADX INFO: renamed from: c */
    public final ArrayList<MeetLiveItemData> f185009c = new ArrayList<>();

    /* JADX INFO: renamed from: d */
    public final NewMeetFragPresenter f185010d;

    public w6y(NewMeetFragPresenter newMeetFragPresenter) {
        this.f185010d = newMeetFragPresenter;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f185009c.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return o7r.m163037a(viewGroup.getContext()).inflate(k6c0.f121446x1, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, final MeetLiveItemData meetLiveItemData, int i, int i2) {
        ((MeetStateHeaderItem) view).m43034R(meetLiveItemData, new e30() { // from class: l.t6y
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f168650a.m201995J(meetLiveItemData, (View) obj);
            }
        }, new e30() { // from class: l.u6y
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f174895a.m201996K(meetLiveItemData, (View) obj);
            }
        });
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public MeetLiveItemData getItem(int i) {
        return this.f185009c.get(i);
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m201995J(MeetLiveItemData meetLiveItemData, View view) {
        if (meetLiveItemData.getItem().liveType == LiveType.get("live")) {
            zvf0.m220399u("e_live_room_enter", "p_meet", vwb.m200311Y("meet_realtime_relationship", g2y.m124193c(meetLiveItemData)), vwb.m200311Y("module", "meet_photo"), vwb.m200311Y("other_user_id", meetLiveItemData.user.f56011id), vwb.m200311Y("live_enter_source", "realtime_meet"));
            this.f185010d.m43024n1(meetLiveItemData.user.f56011id, meetLiveItemData.getItem().roomId);
        } else if (meetLiveItemData.getItem().liveType == LiveType.get(LiveType.liveVoice)) {
            zvf0.m220399u("e_live_audio_room_enter", "p_meet", vwb.m200311Y("meet_realtime_relationship", g2y.m124193c(meetLiveItemData)), vwb.m200311Y("audio_card_type", "meet_photo"));
            this.f185010d.m43025o1(meetLiveItemData.user.f56011id, meetLiveItemData.getItem().roomId);
        }
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m201996K(MeetLiveItemData meetLiveItemData, View view) {
        this.f185010d.m43018h1(meetLiveItemData, true);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: L */
    public void m201997L(List<MeetLiveItemData> list) {
        if (vwb.m200335l(list, this.f185009c, new x9j() { // from class: l.v6y
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return Boolean.valueOf(Objects.equals(((MeetLiveItemData) obj).getItem(), ((MeetLiveItemData) obj2).getItem()));
            }
        })) {
            return;
        }
        this.f185009c.clear();
        this.f185009c.addAll(list);
        notifyDataSetChanged();
    }
}
