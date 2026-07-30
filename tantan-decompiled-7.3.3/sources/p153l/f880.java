package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LivePkMessage;

/* JADX INFO: loaded from: classes4.dex */
public class f880 extends jk2<LongLinkLiveMessage.PkPunishmentSelect, LivePkMessage> {
    public f880(wbg0 wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkLiveMessage.PkPunishmentSelect pkPunishmentSelect, String str) {
        return true;
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LivePkMessage mo95993z(String str, LongLinkLiveMessage.PkPunishmentSelect pkPunishmentSelect) {
        return new LivePkMessage(pkPunishmentSelect.getPkId(), "pk_punish_select").setPkPunishmentSelect(pkPunishmentSelect);
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class mo95510b() {
        return LongLinkLiveMessage.PkPunishmentSelect.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.pk.punishment.select";
    }
}
