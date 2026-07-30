package p153l;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveDragonScourgeDisplayChatMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class s9s extends qct<dw40> {
    public s9s(dum dumVar) {
        super(dumVar);
    }

    /* JADX INFO: renamed from: L3 */
    public final void m185221L3(LongLinkSocketMessage.DragonScourgeRecords dragonScourgeRecords, SpannableStringBuilder spannableStringBuilder) {
        Iterator<Long> it = dragonScourgeRecords.getMonstersList().iterator();
        int i = 0;
        while (it.hasNext()) {
            long jLongValue = it.next().longValue();
            if (jLongValue < dragonScourgeRecords.getMonsterUrlsCount()) {
                String monsterUrls = dragonScourgeRecords.getMonsterUrls((int) jLongValue);
                spannableStringBuilder.append("img");
                hi20 hi20Var = new hi20(this.f196919f, monsterUrls, 18);
                hi20Var.mo145148a(1);
                int i2 = i + 3;
                spannableStringBuilder.setSpan(hi20Var, i, i2, 33);
                i = i2;
            }
        }
        spannableStringBuilder.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
    }

    /* JADX INFO: renamed from: M3 */
    public final /* synthetic */ void m185222M3(LongLinkSocketMessage.DragonScourgeRecords dragonScourgeRecords, BLiveDragonScourgeDisplayChatMessage bLiveDragonScourgeDisplayChatMessage) {
        if (bLiveDragonScourgeDisplayChatMessage.isDisplay) {
            m213811F2().ChatEvent.openDragonPushMsg().mo199273j(Boolean.TRUE);
            LiveMessage liveMessageCreate = LiveMessage.create();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            m185221L3(dragonScourgeRecords, spannableStringBuilder);
            liveMessageCreate.setDragonModuleInfo(dragonScourgeRecords.getTitle(), dragonScourgeRecords.getSchema(), LiveMessage.DRAGON_INFO_CHAT_CATEGORY, spannableStringBuilder);
            m213811F2().ChatEvent.addDragonInfoMsg().mo199273j(liveMessageCreate);
        }
    }

    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ void m185223N3(LongLinkSocketMessage.DragonScourgeRecords dragonScourgeRecords) {
        if (jyb.m147479J(dragonScourgeRecords.getMonstersList()) || jyb.m147479J(dragonScourgeRecords.getMonsterUrlsList()) || TextUtils.isEmpty(dragonScourgeRecords.getTitle())) {
            return;
        }
        m185224O3(dragonScourgeRecords);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O3 */
    public final void m185224O3(final LongLinkSocketMessage.DragonScourgeRecords dragonScourgeRecords) {
        User userM168532l0 = ((dw40) m213810E2()).m168532l0();
        if (userM168532l0 == null) {
            return;
        }
        duringCreated(aiv.m98149y0(userM168532l0.f56859id)).subscribe(dhw.m115825d(new y20() { // from class: l.r9s
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f161865a.m185222M3(dragonScourgeRecords, (BLiveDragonScourgeDisplayChatMessage) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(((dw40) m213810E2()).m168545q1().f71779x1).subscribe(dhw.m115825d(new y20() { // from class: l.q9s
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f156259a.m185223N3((LongLinkSocketMessage.DragonScourgeRecords) obj);
            }
        }));
    }
}
