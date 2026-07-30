package p149l;

import android.util.Log;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class iwm0 extends hs4 {

    /* JADX INFO: renamed from: m */
    public boolean f115285m;

    /* JADX INFO: renamed from: n */
    public rh2 f115286n;

    public iwm0(nol nolVar, rh2 rh2Var) {
        super(nolVar, rh2Var.act());
        this.f115286n = rh2Var;
    }

    @Override // p149l.hs4
    /* JADX INFO: renamed from: f0 */
    public void mo132769f0(List<LiveMessage> list) {
        wg2 u220Var;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            if (i >= list.size()) {
                m67372a0(arrayList, true);
                return;
            }
            LiveMessage liveMessage = list.get(i);
            if (liveMessage == null) {
                hfw.m130790a("[live][trace_problem]", Log.getStackTraceString(new Exception("liveMessage is null")));
            } else {
                if (liveMessage.isNotifyMessage()) {
                    u220Var = new nz4(liveMessage, this.f109285j);
                } else {
                    int i2 = liveMessage.category;
                    if (i2 == LiveMessage.NORMAL_CHAT_CATEGORY) {
                        u220Var = new euo0(liveMessage, this.f109285j);
                    } else if (i2 == LiveMessage.VOICE_CHAT_CATEGORY) {
                        u220Var = this.f115285m ? new a0n0(liveMessage, this.f109285j) : new x0n0(liveMessage, this.f109285j);
                    } else if (i2 == LiveMessage.VOICE_CHAT_MIC_EMOJI_CATEGORY) {
                        u220Var = new c1o0(this.f115286n, liveMessage, this.f109285j);
                    } else if (i2 == LiveMessage.VOICE_CHAT_VIRTUAL_NOTICE_CATEGORY) {
                        u220Var = new y0n0(liveMessage, this.f109285j);
                    } else {
                        u220Var = i2 == LiveMessage.MYSTERY_BOX_RECORD ? new u220(liveMessage, this.f109285j) : new euo0(liveMessage, this.f109285j);
                    }
                }
                u220Var.m202999I(i == list.size() - 1);
                arrayList.add(u220Var);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: h0 */
    public void m138756h0(boolean z) {
        this.f115285m = z;
    }
}
