package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class r33 extends vp2<LongLinkLiveMessage.Block> {
    public r33(und undVar) {
        super(undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkLiveMessage.Block block, String str) {
        return m199212r(block.getRoomId(), "no_care", "no_care");
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public LiveControlMessage mo99811w(String str, LongLinkLiveMessage.Block block, String str2) {
        String id = block.getUser().getId();
        String strM201014a = w220.m201014a();
        if (TextUtils.isEmpty(id)) {
            return null;
        }
        if (TextUtils.equals(id, ypv.f199493a.m199309D0()) || TextUtils.equals(strM201014a, id)) {
            return new LiveControlMessage(str, "boot").setContent(m177639z(block)).setFrom(LiveControlMessage.FROM_VOICE_ROOM_BLOCK);
        }
        return null;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo94401x(String str, LongLinkLiveMessage.Block block, String str2) {
        String id = block.getUser().getId();
        String strM201014a = w220.m201014a();
        if (TextUtils.isEmpty(id) || !(TextUtils.equals(id, ypv.f199493a.m199309D0()) || TextUtils.equals(strM201014a, id))) {
            return m199209n(str, block.getTempdata().getId(), block.getUser(), block.getManager(), block.getTempdata());
        }
        return null;
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.Block> mo94398b() {
        return LongLinkLiveMessage.Block.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "live.guildRoom.block";
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: h */
    public List<String> mo115407h() {
        return vwb.m200324f0(LiveControlMessage.FROM_VOICE_ROOM_BLOCK);
    }

    /* JADX INFO: renamed from: z */
    public final String m177639z(LongLinkLiveMessage.Block block) {
        if (block.getTempdata().getFieldsList().isEmpty()) {
            return ypv.m215672k().m195807c4();
        }
        String fields = block.getTempdata().getFields(0);
        return wxr.INSTANCE.m206025b(w8u.m202218u(R$string.f46726Hf, fields), fields, -1).toString();
    }
}
