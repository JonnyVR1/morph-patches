package p007l;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.p000p1.mobile.putong.data.Emotion;
import com.p000p1.mobile.putong.feed.data.StateEmotion;
import com.p000p1.mobile.putong.feed.newui.mediapicker.post.state.FeedMomentPostSelectStatusAct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.jq2;
import l.mcr;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class jfh extends jq2<nfh> {

    /* JADX INFO: renamed from: a */
    public List<fyh> f9338a;

    /* JADX INFO: renamed from: b */
    public FeedMomentPostSelectStatusAct f9339b;

    public jfh(mcr mcrVar) {
        super(mcrVar);
        this.f9338a = new ArrayList();
    }

    /* JADX INFO: renamed from: Z */
    public void m11135Z() {
        super.Z();
    }

    /* JADX INFO: renamed from: a0 */
    public void m11136a0() {
        super.a0();
        this.f9339b = act();
        m11137e0();
    }

    /* JADX INFO: renamed from: e0 */
    public final void m11137e0() {
        String str = (String) sti.f13081g.get();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        for (StateEmotion stateEmotion : JSON.parseArray(str, StateEmotion.class)) {
            this.f9338a.add(new fyh(true, null, stateEmotion.categoryName));
            Iterator<Emotion> it = stateEmotion.emotions.iterator();
            while (it.hasNext()) {
                this.f9338a.add(new fyh(false, it.next(), stateEmotion.categoryName));
            }
        }
        if (this.f9339b.f2264h == null && !vwb.J(this.f9338a) && this.f9338a.size() > 1) {
            this.f9339b.f2264h = this.f9338a.get(1).m10328b();
        }
        ((nfh) ((jq2) this).viewModel).m12169m();
    }

    public void destroy() {
    }
}
