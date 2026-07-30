package p153l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p051p1.mobile.longlink.msg.livechat.LongLinkChatMessage;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveVoiceActiveGiftMessage;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class hzc0 {

    /* JADX INFO: renamed from: a */
    public BLiveAbsData f112221a;

    /* JADX INFO: renamed from: b */
    public String f112222b;

    /* JADX INFO: renamed from: c */
    public long f112223c;

    /* JADX INFO: renamed from: d */
    public LongLinkChatMessage.LiveChatMessage f112224d;

    /* JADX INFO: renamed from: e */
    public int f112225e;

    /* JADX INFO: renamed from: f */
    public String f112226f;

    /* JADX INFO: renamed from: g */
    public String f112227g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public List<LongLinkLiveVoiceActiveGiftMessage.VoiceGiftItem> f112228h;

    /* JADX INFO: renamed from: i */
    public String f112229i;

    /* JADX INFO: renamed from: j */
    public boolean f112230j = false;

    /* JADX INFO: renamed from: k */
    public String f112231k;

    /* JADX INFO: renamed from: a */
    public boolean m137883a() {
        return TextUtils.equals(this.f112229i, this.f112221a.anchor.f45267id);
    }

    /* JADX INFO: renamed from: b */
    public boolean m137884b() {
        return this.f112230j && y6s.m214494b(this.f112221a.liveMode);
    }
}
