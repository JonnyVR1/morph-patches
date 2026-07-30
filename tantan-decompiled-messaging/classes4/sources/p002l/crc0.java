package p002l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage;
import com.p1.mobile.longlink.msg.liveroom.LongLinkLiveVoiceActiveGiftMessage;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import java.util.List;
import l.x4s;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class crc0 {

    /* JADX INFO: renamed from: a */
    public BLiveAbsData f8911a;

    /* JADX INFO: renamed from: b */
    public String f8912b;

    /* JADX INFO: renamed from: c */
    public long f8913c;

    /* JADX INFO: renamed from: d */
    public LongLinkChatMessage.LiveChatMessage f8914d;

    /* JADX INFO: renamed from: e */
    public int f8915e;

    /* JADX INFO: renamed from: f */
    public String f8916f;

    /* JADX INFO: renamed from: g */
    public String f8917g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public List<LongLinkLiveVoiceActiveGiftMessage.VoiceGiftItem> f8918h;

    /* JADX INFO: renamed from: i */
    public String f8919i;

    /* JADX INFO: renamed from: j */
    public boolean f8920j = false;

    /* JADX INFO: renamed from: k */
    public String f8921k;

    /* JADX INFO: renamed from: a */
    public boolean m11341a() {
        return TextUtils.equals(this.f8919i, this.f8911a.anchor.id);
    }

    /* JADX INFO: renamed from: b */
    public boolean m11342b() {
        return this.f8920j && x4s.b(this.f8911a.liveMode);
    }
}
