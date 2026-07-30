package p153l;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.p051p1.mobile.putong.data.BubbleInfo;
import com.p051p1.mobile.putong.data.CommonData;
import com.p051p1.mobile.putong.data.Detect;
import com.p051p1.mobile.putong.data.DetectCategoryType;
import com.p051p1.mobile.putong.data.DetectRequest;
import com.p051p1.mobile.putong.data.DetectText;
import com.p051p1.mobile.putong.data.Emotion;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.StateEmotion;
import com.p051p1.mobile.putong.feed.newui.status.selectstatus.FeedSelectAndPostStatusAct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class izh extends ar2<ozh> {

    /* JADX INFO: renamed from: a */
    public boolean f117702a;

    /* JADX INFO: renamed from: b */
    public List<uzh> f117703b;

    /* JADX INFO: renamed from: c */
    public FeedSelectAndPostStatusAct f117704c;

    public izh(ner nerVar) {
        super(nerVar);
        this.f117703b = new ArrayList();
    }

    /* JADX INFO: renamed from: h0 */
    private void m142805h0() {
        String str = owi.f149488g.get();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        for (StateEmotion stateEmotion : JSON.parseArray(str, StateEmotion.class)) {
            this.f117703b.add(new uzh(true, null, stateEmotion.categoryName));
            Iterator<Emotion> it = stateEmotion.emotions.iterator();
            while (it.hasNext()) {
                this.f117703b.add(new uzh(false, it.next(), stateEmotion.categoryName));
            }
        }
        if (this.f117704c.f43815h == null && !jyb.m147479J(this.f117703b) && this.f117703b.size() > 1) {
            this.f117704c.f43815h = this.f117703b.get(1).m198834b();
        }
        ((ozh) this.viewModel).m169950A(this.f117704c.f43815h);
        ((ozh) this.viewModel).m169956q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m142806i0(x20 x20Var, Envelope envelope) {
        this.f117702a = false;
        Detect detect = ((CommonData) envelope.getModuleData(CommonData.class)).detect;
        if (jyb.m147479J(detect.text) && jyb.m147479J(detect.media)) {
            x20Var.call();
        } else if (ksg.m151214l(detect, "p_set_my_state_post")) {
            o1j0.m165649w(R$string.f39989s);
        } else {
            o1j0.m165649w(R$string.f39844W2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m142807j0(x20 x20Var, Throwable th) {
        this.f117702a = false;
        x20Var.call();
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
        this.f117704c = (FeedSelectAndPostStatusAct) act();
        m142805h0();
    }

    /* JADX INFO: renamed from: g0 */
    public void m142808g0(String str, final x20 x20Var) {
        this.f117702a = true;
        DetectRequest detectRequest = new DetectRequest();
        detectRequest.category = DetectCategoryType.get("moment");
        DetectText detectText = new DetectText();
        detectText.key = "myState";
        detectText.value = str;
        ArrayList arrayList = new ArrayList();
        detectRequest.text = arrayList;
        arrayList.add(detectText);
        duringCreated(FeedModule.f39703d.m145582P6(detectRequest)).subscribe(psd0.m173597H(new y20() { // from class: l.gzh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f107206a.m142806i0(x20Var, (Envelope) obj);
            }
        }, new y20() { // from class: l.hzh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f112244a.m142807j0(x20Var, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k0 */
    public void m142809k0(BubbleInfo bubbleInfo) {
        FeedModule.f39704e.m159782V0(bubbleInfo, this.f117704c.f43819l);
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
