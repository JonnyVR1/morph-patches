package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class h43 extends mq2<LongLinkLiveMessage.Block> {
    public h43(zod zodVar) {
        super(zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkLiveMessage.Block block, String str) {
        return m159460r(block.getRoomId(), "no_care", "no_care");
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public LiveControlMessage mo95513w(String str, LongLinkLiveMessage.Block block, String str2) {
        String id = block.getUser().getId();
        String strM120148a = eb20.m120148a();
        if (TextUtils.isEmpty(id)) {
            return null;
        }
        if (TextUtils.equals(id, zrv.f205799a.m207631D0()) || TextUtils.equals(strM120148a, id)) {
            return new LiveControlMessage(str, "boot").setContent(m133543z(block)).setFrom(LiveControlMessage.FROM_VOICE_ROOM_BLOCK);
        }
        return null;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo113619x(String str, LongLinkLiveMessage.Block block, String str2) {
        String id = block.getUser().getId();
        String strM120148a = eb20.m120148a();
        if (TextUtils.isEmpty(id) || !(TextUtils.equals(id, zrv.f205799a.m207631D0()) || TextUtils.equals(strM120148a, id))) {
            return m159457n(str, block.getTempdata().getId(), block.getUser(), block.getManager(), block.getTempdata());
        }
        return null;
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.Block> mo95510b() {
        return LongLinkLiveMessage.Block.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.guildRoom.block";
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: h */
    public List<String> mo116845h() {
        return jyb.m147507f0(LiveControlMessage.FROM_VOICE_ROOM_BLOCK);
    }

    /* JADX INFO: renamed from: z */
    public final String m133543z(LongLinkLiveMessage.Block block) {
        if (block.getTempdata().getFieldsList().isEmpty()) {
            return zrv.m221193k().m203594c4();
        }
        String fields = block.getTempdata().getFields(0);
        return xzr.INSTANCE.m213806b(xau.m209911u(R$string.f47574Hf, fields), fields, -1).toString();
    }
}
