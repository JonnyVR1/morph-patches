package p002l;

import android.util.Log;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import java.util.ArrayList;
import java.util.List;
import l.a0n0;
import l.c1o0;
import l.euo0;
import l.hfw;
import l.x0n0;
import l.y0n0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class iwm0 extends hs4 {

    /* JADX INFO: renamed from: m */
    public boolean f13455m;

    /* JADX INFO: renamed from: n */
    public rh2 f13456n;

    public iwm0(nol nolVar, rh2 rh2Var) {
        super(nolVar, rh2Var.act());
        this.f13456n = rh2Var;
    }

    @Override // p002l.hs4
    /* JADX INFO: renamed from: f0 */
    public void mo14804f0(List<LiveMessage> list) {
        wg2 u220Var;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            if (i >= list.size()) {
                a0(arrayList, true);
                return;
            }
            LiveMessage liveMessage = list.get(i);
            if (liveMessage == null) {
                hfw.a("[live][trace_problem]", Log.getStackTraceString(new Exception("liveMessage is null")));
            } else {
                if (liveMessage.isNotifyMessage()) {
                    u220Var = new nz4(liveMessage, this.f12255j);
                } else {
                    int i2 = liveMessage.category;
                    if (i2 == LiveMessage.NORMAL_CHAT_CATEGORY) {
                        u220Var = new euo0(liveMessage, this.f12255j);
                    } else if (i2 == LiveMessage.VOICE_CHAT_CATEGORY) {
                        u220Var = this.f13455m ? new a0n0(liveMessage, this.f12255j) : new x0n0(liveMessage, this.f12255j);
                    } else if (i2 == LiveMessage.VOICE_CHAT_MIC_EMOJI_CATEGORY) {
                        u220Var = new c1o0(this.f13456n, liveMessage, this.f12255j);
                    } else if (i2 == LiveMessage.VOICE_CHAT_VIRTUAL_NOTICE_CATEGORY) {
                        u220Var = new y0n0(liveMessage, this.f12255j);
                    } else {
                        u220Var = i2 == LiveMessage.MYSTERY_BOX_RECORD ? new u220(liveMessage, this.f12255j) : new euo0(liveMessage, this.f12255j);
                    }
                }
                u220Var.m24561I(i == list.size() - 1);
                arrayList.add(u220Var);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: h0 */
    public void m15470h0(boolean z) {
        this.f13455m = z;
    }
}
