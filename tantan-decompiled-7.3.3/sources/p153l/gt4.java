package p153l;

import android.util.Log;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class gt4 extends LiveBaseAdapter {

    /* JADX INFO: renamed from: j */
    public final yql f106377j;

    /* JADX INFO: renamed from: k */
    public final Act f106378k;

    /* JADX INFO: renamed from: l */
    public final ArrayList<LiveMessage> f106379l = new ArrayList<>();

    public gt4(yql yqlVar, Act act) {
        this.f106377j = yqlVar;
        this.f106378k = act;
    }

    public Act act() {
        return this.f106378k;
    }

    /* JADX INFO: renamed from: e0 */
    public ArrayList<LiveMessage> m132197e0() {
        return this.f106379l;
    }

    /* JADX INFO: renamed from: f0 */
    public void mo132198f0(List<LiveMessage> list) {
        dh2 cb20Var;
        ArrayList arrayList = new ArrayList();
        for (LiveMessage liveMessage : list) {
            if (liveMessage == null) {
                fhw.m125605a("[live][trace_problem]", Log.getStackTraceString(new Exception("liveMessage is null")));
            } else {
                if (liveMessage.isNotifyMessage()) {
                    cb20Var = new m05(liveMessage, this.f106377j);
                } else {
                    int i = liveMessage.category;
                    if (i == LiveMessage.NORMAL_CHAT_CATEGORY) {
                        cb20Var = new sz4(liveMessage, this.f106377j);
                    } else if (i == LiveMessage.VOICE_CHAT_CATEGORY) {
                        cb20Var = new ban0(liveMessage, this.f106377j);
                    } else if (i == LiveMessage.DRAGON_INFO_CHAT_CATEGORY) {
                        cb20Var = new bbe(liveMessage, this.f106377j);
                    } else {
                        cb20Var = i == LiveMessage.MYSTERY_BOX_RECORD ? new cb20(liveMessage, this.f106377j) : new sz4(liveMessage, this.f106377j);
                    }
                }
                arrayList.add(cb20Var);
            }
        }
        List<d3q<?>> list2 = this.f45086a;
        if (list2 == null || list2.size() <= arrayList.size()) {
            m68555a0(arrayList, true);
        } else {
            m68554Z(arrayList);
        }
    }

    /* JADX INFO: renamed from: g0 */
    public void m132199g0(List<LiveMessage> list) {
        this.f106379l.clear();
        this.f106379l.addAll(list);
        mo132198f0(this.f106379l);
    }
}
