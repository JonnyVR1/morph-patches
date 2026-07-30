package p002l;

import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class a080 extends vp2<LongLinkLiveMessage.PkPunishmentSelected> {
    public a080(und undVar) {
        super(undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo9247x(String str, LongLinkLiveMessage.PkPunishmentSelected pkPunishmentSelected, String str2) {
        return m24092n(str, pkPunishmentSelected.getTempdata().getId(), null, null, pkPunishmentSelected.getTempdata());
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class mo9244b() {
        return LongLinkLiveMessage.PkPunishmentSelected.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.pk.punishment.selected";
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkLiveMessage.PkPunishmentSelected pkPunishmentSelected, String str) {
        return true;
    }
}
