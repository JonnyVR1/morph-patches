package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes4.dex */
public class zzr extends mq2<LongLinkLiveMessage.Block> {
    public zzr(zod zodVar) {
        super(zodVar);
    }

    /* JADX INFO: renamed from: z */
    private String m222279z(LongLinkLiveMessage.Block block) {
        if (block.getTempdata().getFieldsList().isEmpty()) {
            return zrv.m221193k().m203594c4();
        }
        String fields = block.getTempdata().getFields(0);
        return xzr.INSTANCE.m213805a(xau.m209911u(!wft.m206159b(2) ? R$string.f47574Hf : R$string.f48489y0, fields), fields, -1).toString();
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
        if (!TextUtils.equals(id, zrv.f205799a.m207631D0()) && !TextUtils.equals(strM120148a, id)) {
            return null;
        }
        CrashHelper.m82479c(new IllegalStateException("live boot message send in block msg handler"));
        return new LiveControlMessage(str, "boot").setContent(m222279z(block)).setFrom(LiveControlMessage.FROM_LIVE_ROOM_BLOCK);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo113619x(String str, LongLinkLiveMessage.Block block, String str2) {
        if (!wft.m206159b(2)) {
            String id = block.getUser().getId();
            String strM120148a = eb20.m120148a();
            if (!TextUtils.isEmpty(id) && (TextUtils.equals(id, zrv.f205799a.m207631D0()) || TextUtils.equals(strM120148a, id))) {
                return null;
            }
        }
        return m159457n(str, block.getTempdata().getId(), block.getUser(), block.getManager(), block.getTempdata());
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.Block> mo95510b() {
        return LongLinkLiveMessage.Block.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return LiveControlMessage.FROM_LIVE_ROOM_BLOCK;
    }
}
