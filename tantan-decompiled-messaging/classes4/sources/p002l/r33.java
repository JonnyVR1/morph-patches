package p002l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import java.util.List;
import l.vwb;
import l.w8u;
import l.ypv;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class r33 extends vp2<LongLinkLiveMessage.Block> {
    public r33(und undVar) {
        super(undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkLiveMessage.Block block, String str) {
        return m24095r(block.getRoomId(), "no_care", "no_care");
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public LiveControlMessage mo10148w(String str, LongLinkLiveMessage.Block block, String str2) {
        String id = block.getUser().getId();
        String strM24290a = w220.m24290a();
        if (TextUtils.isEmpty(id)) {
            return null;
        }
        if (TextUtils.equals(id, ypv.a.D0()) || TextUtils.equals(strM24290a, id)) {
            return new LiveControlMessage(str, "boot").setContent(m21758z(block)).setFrom(LiveControlMessage.FROM_VOICE_ROOM_BLOCK);
        }
        return null;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo9247x(String str, LongLinkLiveMessage.Block block, String str2) {
        String id = block.getUser().getId();
        String strM24290a = w220.m24290a();
        if (TextUtils.isEmpty(id) || !(TextUtils.equals(id, ypv.a.D0()) || TextUtils.equals(strM24290a, id))) {
            return m24092n(str, block.getTempdata().getId(), block.getUser(), block.getManager(), block.getTempdata());
        }
        return null;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.Block> mo9244b() {
        return LongLinkLiveMessage.Block.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.guildRoom.block";
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: h */
    public List<String> mo12303h() {
        return vwb.f0(new String[]{LiveControlMessage.FROM_VOICE_ROOM_BLOCK});
    }

    /* JADX INFO: renamed from: z */
    public final String m21758z(LongLinkLiveMessage.Block block) {
        if (block.getTempdata().getFieldsList().isEmpty()) {
            return ypv.k().c4();
        }
        String fields = block.getTempdata().getFields(0);
        return wxr.INSTANCE.m25545b(w8u.u(R$string.f2768Hf, fields), fields, -1).toString();
    }
}
