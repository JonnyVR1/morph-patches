package p153l;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.p051p1.mobile.putong.data.Emotion;
import com.p051p1.mobile.putong.feed.data.StateEmotion;
import com.p051p1.mobile.putong.feed.newui.mediapicker.post.state.FeedMomentPostSelectStatusAct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class ygh extends ar2<chh> {

    /* JADX INFO: renamed from: a */
    public List<uzh> f199831a;

    /* JADX INFO: renamed from: b */
    public FeedMomentPostSelectStatusAct f199832b;

    public ygh(ner nerVar) {
        super(nerVar);
        this.f199831a = new ArrayList();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        this.f199832b = (FeedMomentPostSelectStatusAct) act();
        m215841e0();
    }

    /* JADX INFO: renamed from: e0 */
    public final void m215841e0() {
        String str = owi.f149488g.get();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        for (StateEmotion stateEmotion : JSON.parseArray(str, StateEmotion.class)) {
            this.f199831a.add(new uzh(true, null, stateEmotion.categoryName));
            Iterator<Emotion> it = stateEmotion.emotions.iterator();
            while (it.hasNext()) {
                this.f199831a.add(new uzh(false, it.next(), stateEmotion.categoryName));
            }
        }
        if (this.f199832b.f41651h == null && !jyb.m147479J(this.f199831a) && this.f199831a.size() > 1) {
            this.f199832b.f41651h = this.f199831a.get(1).m198834b();
        }
        ((chh) this.viewModel).m109793m();
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
