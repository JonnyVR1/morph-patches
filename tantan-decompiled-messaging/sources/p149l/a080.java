package p149l;

import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;

/* JADX INFO: loaded from: classes4.dex */
public class a080 extends vp2<LongLinkLiveMessage.PkPunishmentSelected> {
    public a080(und undVar) {
        super(undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo94401x(String str, LongLinkLiveMessage.PkPunishmentSelected pkPunishmentSelected, String str2) {
        return m199209n(str, pkPunishmentSelected.getTempdata().getId(), null, null, pkPunishmentSelected.getTempdata());
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class mo94398b() {
        return LongLinkLiveMessage.PkPunishmentSelected.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "live.pk.punishment.selected";
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkLiveMessage.PkPunishmentSelected pkPunishmentSelected, String str) {
        return true;
    }
}
