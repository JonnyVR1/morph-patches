package p149l;

import android.util.Log;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class hs4 extends LiveBaseAdapter {

    /* JADX INFO: renamed from: j */
    public final nol f109285j;

    /* JADX INFO: renamed from: k */
    public final Act f109286k;

    /* JADX INFO: renamed from: l */
    public final ArrayList<LiveMessage> f109287l = new ArrayList<>();

    public hs4(nol nolVar, Act act) {
        this.f109285j = nolVar;
        this.f109286k = act;
    }

    public Act act() {
        return this.f109286k;
    }

    /* JADX INFO: renamed from: e0 */
    public ArrayList<LiveMessage> m132768e0() {
        return this.f109287l;
    }

    /* JADX INFO: renamed from: f0 */
    public void mo132769f0(List<LiveMessage> list) {
        wg2 u220Var;
        ArrayList arrayList = new ArrayList();
        for (LiveMessage liveMessage : list) {
            if (liveMessage == null) {
                hfw.m130790a("[live][trace_problem]", Log.getStackTraceString(new Exception("liveMessage is null")));
            } else {
                if (liveMessage.isNotifyMessage()) {
                    u220Var = new nz4(liveMessage, this.f109285j);
                } else {
                    int i = liveMessage.category;
                    if (i == LiveMessage.NORMAL_CHAT_CATEGORY) {
                        u220Var = new ty4(liveMessage, this.f109285j);
                    } else if (i == LiveMessage.VOICE_CHAT_CATEGORY) {
                        u220Var = new x0n0(liveMessage, this.f109285j);
                    } else if (i == LiveMessage.DRAGON_INFO_CHAT_CATEGORY) {
                        u220Var = new x9e(liveMessage, this.f109285j);
                    } else {
                        u220Var = i == LiveMessage.MYSTERY_BOX_RECORD ? new u220(liveMessage, this.f109285j) : new ty4(liveMessage, this.f109285j);
                    }
                }
                arrayList.add(u220Var);
            }
        }
        List<d1q<?>> list2 = this.f44238a;
        if (list2 == null || list2.size() <= arrayList.size()) {
            m67372a0(arrayList, true);
        } else {
            m67371Z(arrayList);
        }
    }

    /* JADX INFO: renamed from: g0 */
    public void m132770g0(List<LiveMessage> list) {
        this.f109287l.clear();
        this.f109287l.addAll(list);
        mo132769f0(this.f109287l);
    }
}
