package p153l;

import android.util.Log;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class m5n0 extends gt4 {

    /* JADX INFO: renamed from: m */
    public boolean f134918m;

    /* JADX INFO: renamed from: n */
    public yh2 f134919n;

    public m5n0(yql yqlVar, yh2 yh2Var) {
        super(yqlVar, yh2Var.act());
        this.f134919n = yh2Var;
    }

    @Override // p153l.gt4
    /* JADX INFO: renamed from: f0 */
    public void mo132198f0(List<LiveMessage> list) {
        dh2 cb20Var;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            if (i >= list.size()) {
                m68555a0(arrayList, true);
                return;
            }
            LiveMessage liveMessage = list.get(i);
            if (liveMessage == null) {
                fhw.m125605a("[live][trace_problem]", Log.getStackTraceString(new Exception("liveMessage is null")));
            } else {
                if (liveMessage.isNotifyMessage()) {
                    cb20Var = new m05(liveMessage, this.f106377j);
                } else {
                    int i2 = liveMessage.category;
                    if (i2 == LiveMessage.NORMAL_CHAT_CATEGORY) {
                        cb20Var = new i3p0(liveMessage, this.f106377j);
                    } else if (i2 == LiveMessage.VOICE_CHAT_CATEGORY) {
                        cb20Var = this.f134918m ? new e9n0(liveMessage, this.f106377j) : new ban0(liveMessage, this.f106377j);
                    } else if (i2 == LiveMessage.VOICE_CHAT_MIC_EMOJI_CATEGORY) {
                        cb20Var = new gao0(this.f134919n, liveMessage, this.f106377j);
                    } else if (i2 == LiveMessage.VOICE_CHAT_VIRTUAL_NOTICE_CATEGORY) {
                        cb20Var = new can0(liveMessage, this.f106377j);
                    } else {
                        cb20Var = i2 == LiveMessage.MYSTERY_BOX_RECORD ? new cb20(liveMessage, this.f106377j) : new i3p0(liveMessage, this.f106377j);
                    }
                }
                cb20Var.m115781I(i == list.size() - 1);
                arrayList.add(cb20Var);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: h0 */
    public void m157107h0(boolean z) {
        this.f134918m = z;
    }
}
