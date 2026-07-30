package p149l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p046p1.mobile.longlink.msg.livechat.LongLinkChatMessage;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveVoiceActiveGiftMessage;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class crc0 {

    /* JADX INFO: renamed from: a */
    public BLiveAbsData f82197a;

    /* JADX INFO: renamed from: b */
    public String f82198b;

    /* JADX INFO: renamed from: c */
    public long f82199c;

    /* JADX INFO: renamed from: d */
    public LongLinkChatMessage.LiveChatMessage f82200d;

    /* JADX INFO: renamed from: e */
    public int f82201e;

    /* JADX INFO: renamed from: f */
    public String f82202f;

    /* JADX INFO: renamed from: g */
    public String f82203g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public List<LongLinkLiveVoiceActiveGiftMessage.VoiceGiftItem> f82204h;

    /* JADX INFO: renamed from: i */
    public String f82205i;

    /* JADX INFO: renamed from: j */
    public boolean f82206j = false;

    /* JADX INFO: renamed from: k */
    public String f82207k;

    /* JADX INFO: renamed from: a */
    public boolean m108353a() {
        return TextUtils.equals(this.f82205i, this.f82197a.anchor.f44419id);
    }

    /* JADX INFO: renamed from: b */
    public boolean m108354b() {
        return this.f82206j && x4s.m207012b(this.f82197a.liveMode);
    }
}
