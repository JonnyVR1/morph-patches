package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;

/* JADX INFO: loaded from: classes4.dex */
public class g880 extends mq2<LongLinkLiveMessage.PkPunishmentSelected> {
    public g880(zod zodVar) {
        super(zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo113619x(String str, LongLinkLiveMessage.PkPunishmentSelected pkPunishmentSelected, String str2) {
        return m159457n(str, pkPunishmentSelected.getTempdata().getId(), null, null, pkPunishmentSelected.getTempdata());
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class mo95510b() {
        return LongLinkLiveMessage.PkPunishmentSelected.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.pk.punishment.selected";
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkLiveMessage.PkPunishmentSelected pkPunishmentSelected, String str) {
        return true;
    }
}
