package p002l;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.base.data.BLiveDragonScourgeDisplayChatMessage;
import com.tantanapp.common.data.DbObject;
import java.util.Iterator;
import l.e30;
import l.ffw;
import l.vwb;
import l.z920;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class r7s extends pat<pn40> {
    public r7s(bsm bsmVar) {
        super(bsmVar);
    }

    /* JADX INFO: renamed from: L3 */
    public final void m21798L3(LongLinkSocketMessage.DragonScourgeRecords dragonScourgeRecords, SpannableStringBuilder spannableStringBuilder) {
        Iterator it = dragonScourgeRecords.getMonstersList().iterator();
        int i = 0;
        while (it.hasNext()) {
            long jLongValue = ((Long) it.next()).longValue();
            if (jLongValue < dragonScourgeRecords.getMonsterUrlsCount()) {
                String monsterUrls = dragonScourgeRecords.getMonsterUrls((int) jLongValue);
                spannableStringBuilder.append("img");
                z920 z920Var = new z920(this.f22037f, monsterUrls, 18);
                z920Var.a(1);
                int i2 = i + 3;
                spannableStringBuilder.setSpan(z920Var, i, i2, 33);
                i = i2;
            }
        }
        spannableStringBuilder.append(" ");
    }

    /* JADX INFO: renamed from: M3 */
    public final /* synthetic */ void m21799M3(LongLinkSocketMessage.DragonScourgeRecords dragonScourgeRecords, BLiveDragonScourgeDisplayChatMessage bLiveDragonScourgeDisplayChatMessage) {
        if (bLiveDragonScourgeDisplayChatMessage.isDisplay) {
            m25548F2().ChatEvent.openDragonPushMsg().j(Boolean.TRUE);
            LiveMessage liveMessageCreate = LiveMessage.create();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            m21798L3(dragonScourgeRecords, spannableStringBuilder);
            liveMessageCreate.setDragonModuleInfo(dragonScourgeRecords.getTitle(), dragonScourgeRecords.getSchema(), LiveMessage.DRAGON_INFO_CHAT_CATEGORY, spannableStringBuilder);
            m25548F2().ChatEvent.addDragonInfoMsg().j(liveMessageCreate);
        }
    }

    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ void m21800N3(LongLinkSocketMessage.DragonScourgeRecords dragonScourgeRecords) {
        if (vwb.J(dragonScourgeRecords.getMonstersList()) || vwb.J(dragonScourgeRecords.getMonsterUrlsList()) || TextUtils.isEmpty(dragonScourgeRecords.getTitle())) {
            return;
        }
        m21801O3(dragonScourgeRecords);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O3 */
    public final void m21801O3(final LongLinkSocketMessage.DragonScourgeRecords dragonScourgeRecords) {
        User userM14582l0 = ((pn40) m25547E2()).m14582l0();
        if (userM14582l0 == null) {
            return;
        }
        duringCreated(zfv.m27318y0(((DbObject) userM14582l0).id)).subscribe(ffw.d(new e30() { // from class: l.q7s
            public final void call(Object obj) {
                this.f17846a.m21799M3(dragonScourgeRecords, (BLiveDragonScourgeDisplayChatMessage) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t */
    public void m21802t() {
        super.t();
        duringCreated(((pn40) m25547E2()).m14596q1().x1).subscribe(ffw.d(new e30() { // from class: l.p7s
            public final void call(Object obj) {
                this.f17050a.m21800N3((LongLinkSocketMessage.DragonScourgeRecords) obj);
            }
        }));
    }
}
