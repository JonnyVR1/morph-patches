package p002l;

import android.util.Log;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import java.util.ArrayList;
import java.util.List;
import l.hfw;
import l.x0n0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class hs4 extends LiveBaseAdapter {

    /* JADX INFO: renamed from: j */
    public final nol f12255j;

    /* JADX INFO: renamed from: k */
    public final Act f12256k;

    /* JADX INFO: renamed from: l */
    public final ArrayList<LiveMessage> f12257l = new ArrayList<>();

    public hs4(nol nolVar, Act act) {
        this.f12255j = nolVar;
        this.f12256k = act;
    }

    public Act act() {
        return this.f12256k;
    }

    /* JADX INFO: renamed from: e0 */
    public ArrayList<LiveMessage> m14803e0() {
        return this.f12257l;
    }

    /* JADX INFO: renamed from: f0 */
    public void mo14804f0(List<LiveMessage> list) {
        x0n0 u220Var;
        ArrayList arrayList = new ArrayList();
        for (LiveMessage liveMessage : list) {
            if (liveMessage == null) {
                hfw.a("[live][trace_problem]", Log.getStackTraceString(new Exception("liveMessage is null")));
            } else {
                if (liveMessage.isNotifyMessage()) {
                    u220Var = new nz4(liveMessage, this.f12255j);
                } else {
                    int i = liveMessage.category;
                    if (i == LiveMessage.NORMAL_CHAT_CATEGORY) {
                        u220Var = new ty4(liveMessage, this.f12255j);
                    } else if (i == LiveMessage.VOICE_CHAT_CATEGORY) {
                        u220Var = new x0n0(liveMessage, this.f12255j);
                    } else if (i == LiveMessage.DRAGON_INFO_CHAT_CATEGORY) {
                        u220Var = new x9e(liveMessage, this.f12255j);
                    } else {
                        u220Var = i == LiveMessage.MYSTERY_BOX_RECORD ? new u220(liveMessage, this.f12255j) : new ty4(liveMessage, this.f12255j);
                    }
                }
                arrayList.add(u220Var);
            }
        }
        List list2 = ((LiveBaseAdapter) this).a;
        if (list2 == null || list2.size() <= arrayList.size()) {
            a0(arrayList, true);
        } else {
            Z(arrayList);
        }
    }

    /* JADX INFO: renamed from: g0 */
    public void m14805g0(List<LiveMessage> list) {
        this.f12257l.clear();
        this.f12257l.addAll(list);
        mo14804f0(this.f12257l);
    }
}
