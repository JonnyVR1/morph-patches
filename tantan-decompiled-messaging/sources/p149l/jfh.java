package p149l;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.p046p1.mobile.putong.data.Emotion;
import com.p046p1.mobile.putong.feed.data.StateEmotion;
import com.p046p1.mobile.putong.feed.newui.mediapicker.post.state.FeedMomentPostSelectStatusAct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class jfh extends jq2<nfh> {

    /* JADX INFO: renamed from: a */
    public List<fyh> f117659a;

    /* JADX INFO: renamed from: b */
    public FeedMomentPostSelectStatusAct f117660b;

    public jfh(mcr mcrVar) {
        super(mcrVar);
        this.f117659a = new ArrayList();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        this.f117660b = (FeedMomentPostSelectStatusAct) act();
        m141179e0();
    }

    /* JADX INFO: renamed from: e0 */
    public final void m141179e0() {
        String str = sti.f166363g.get();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        for (StateEmotion stateEmotion : JSON.parseArray(str, StateEmotion.class)) {
            this.f117659a.add(new fyh(true, null, stateEmotion.categoryName));
            Iterator<Emotion> it = stateEmotion.emotions.iterator();
            while (it.hasNext()) {
                this.f117659a.add(new fyh(false, it.next(), stateEmotion.categoryName));
            }
        }
        if (this.f117660b.f40803h == null && !vwb.m200296J(this.f117659a) && this.f117659a.size() > 1) {
            this.f117660b.f40803h = this.f117659a.get(1).m123767b();
        }
        ((nfh) this.viewModel).m159252m();
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
