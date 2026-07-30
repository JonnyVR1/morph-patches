package p009l;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.newui.newmeet.frag.meet.NewMeetFragPresenter;
import com.p000p1.mobile.putong.core.newui.newmeet.header.MeetStateHeaderItem;
import com.p1.mobile.putong.core.businessdata.meet.AbsMeetUserItemData;
import com.p1.mobile.putong.core.businessdata.meet.MeetLiveItemData;
import com.p1.mobile.putong.core.data.LiveType;
import com.tantanapp.common.data.DbObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import l.dac0;
import l.e30;
import l.j760;
import l.k6c0;
import l.vwb;
import l.x9j;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class w6y extends dac0<MeetLiveItemData> {

    /* JADX INFO: renamed from: c */
    public final ArrayList<MeetLiveItemData> f21926c = new ArrayList<>();

    /* JADX INFO: renamed from: d */
    public final NewMeetFragPresenter f21927d;

    public w6y(NewMeetFragPresenter newMeetFragPresenter) {
        this.f21927d = newMeetFragPresenter;
    }

    /* JADX INFO: renamed from: C */
    public int m23957C() {
        return this.f21926c.size();
    }

    /* JADX INFO: renamed from: D */
    public View m23958D(ViewGroup viewGroup, int i) {
        return o7r.m19649a(viewGroup.getContext()).inflate(k6c0.x1, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void m23956A(View view, final MeetLiveItemData meetLiveItemData, int i, int i2) {
        ((MeetStateHeaderItem) view).m7236R(meetLiveItemData, new e30() { // from class: l.t6y
            public final void call(Object obj) {
                this.f20572a.m23961J(meetLiveItemData, (View) obj);
            }
        }, new e30() { // from class: l.u6y
            public final void call(Object obj) {
                this.f21007a.m23962K(meetLiveItemData, (View) obj);
            }
        });
    }

    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public MeetLiveItemData getItem(int i) {
        return this.f21926c.get(i);
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m23961J(MeetLiveItemData meetLiveItemData, View view) {
        if (meetLiveItemData.getItem().liveType == LiveType.get("live")) {
            zvf0.u("e_live_room_enter", "p_meet", new j760[]{vwb.Y("meet_realtime_relationship", g2y.m14766c(meetLiveItemData)), vwb.Y("module", "meet_photo"), vwb.Y("other_user_id", ((DbObject) ((AbsMeetUserItemData) meetLiveItemData).user).id), vwb.Y("live_enter_source", "realtime_meet")});
            this.f21927d.m7224n1(((DbObject) ((AbsMeetUserItemData) meetLiveItemData).user).id, meetLiveItemData.getItem().roomId);
        } else if (meetLiveItemData.getItem().liveType == LiveType.get("liveVoice")) {
            zvf0.u("e_live_audio_room_enter", "p_meet", new j760[]{vwb.Y("meet_realtime_relationship", g2y.m14766c(meetLiveItemData)), vwb.Y("audio_card_type", "meet_photo")});
            this.f21927d.m7225o1(((DbObject) ((AbsMeetUserItemData) meetLiveItemData).user).id, meetLiveItemData.getItem().roomId);
        }
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m23962K(MeetLiveItemData meetLiveItemData, View view) {
        this.f21927d.m7218h1(meetLiveItemData, true);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: L */
    public void m23963L(List<MeetLiveItemData> list) {
        if (vwb.l(list, this.f21926c, new x9j() { // from class: l.v6y
            public final Object call(Object obj, Object obj2) {
                return Boolean.valueOf(Objects.equals(((MeetLiveItemData) obj).getItem(), ((MeetLiveItemData) obj2).getItem()));
            }
        })) {
            return;
        }
        this.f21926c.clear();
        this.f21926c.addAll(list);
        notifyDataSetChanged();
    }
}
