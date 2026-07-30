package p149l;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveDragonScourgeDisplayChatMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class r7s extends pat<pn40> {
    public r7s(bsm bsmVar) {
        super(bsmVar);
    }

    /* JADX INFO: renamed from: L3 */
    public final void m178205L3(LongLinkSocketMessage.DragonScourgeRecords dragonScourgeRecords, SpannableStringBuilder spannableStringBuilder) {
        Iterator<Long> it = dragonScourgeRecords.getMonstersList().iterator();
        int i = 0;
        while (it.hasNext()) {
            long jLongValue = it.next().longValue();
            if (jLongValue < dragonScourgeRecords.getMonsterUrlsCount()) {
                String monsterUrls = dragonScourgeRecords.getMonsterUrls((int) jLongValue);
                spannableStringBuilder.append("img");
                z920 z920Var = new z920(this.f188513f, monsterUrls, 18);
                z920Var.mo95709a(1);
                int i2 = i + 3;
                spannableStringBuilder.setSpan(z920Var, i, i2, 33);
                i = i2;
            }
        }
        spannableStringBuilder.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
    }

    /* JADX INFO: renamed from: M3 */
    public final /* synthetic */ void m178206M3(LongLinkSocketMessage.DragonScourgeRecords dragonScourgeRecords, BLiveDragonScourgeDisplayChatMessage bLiveDragonScourgeDisplayChatMessage) {
        if (bLiveDragonScourgeDisplayChatMessage.isDisplay) {
            m206028F2().ChatEvent.openDragonPushMsg().mo172463j(Boolean.TRUE);
            LiveMessage liveMessageCreate = LiveMessage.create();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            m178205L3(dragonScourgeRecords, spannableStringBuilder);
            liveMessageCreate.setDragonModuleInfo(dragonScourgeRecords.getTitle(), dragonScourgeRecords.getSchema(), LiveMessage.DRAGON_INFO_CHAT_CATEGORY, spannableStringBuilder);
            m206028F2().ChatEvent.addDragonInfoMsg().mo172463j(liveMessageCreate);
        }
    }

    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ void m178207N3(LongLinkSocketMessage.DragonScourgeRecords dragonScourgeRecords) {
        if (vwb.m200296J(dragonScourgeRecords.getMonstersList()) || vwb.m200296J(dragonScourgeRecords.getMonsterUrlsList()) || TextUtils.isEmpty(dragonScourgeRecords.getTitle())) {
            return;
        }
        m178208O3(dragonScourgeRecords);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O3 */
    public final void m178208O3(final LongLinkSocketMessage.DragonScourgeRecords dragonScourgeRecords) {
        User userM132146l0 = ((pn40) m206027E2()).m132146l0();
        if (userM132146l0 == null) {
            return;
        }
        duringCreated(zfv.m218615y0(userM132146l0.f56011id)).subscribe(ffw.m121193d(new e30() { // from class: l.q7s
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f153070a.m178206M3(dragonScourgeRecords, (BLiveDragonScourgeDisplayChatMessage) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(((pn40) m206027E2()).m132160q1().f170512x1).subscribe(ffw.m121193d(new e30() { // from class: l.p7s
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f147539a.m178207N3((LongLinkSocketMessage.DragonScourgeRecords) obj);
            }
        }));
    }
}
