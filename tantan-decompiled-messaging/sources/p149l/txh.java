package p149l;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.p046p1.mobile.putong.data.BubbleInfo;
import com.p046p1.mobile.putong.data.CommonData;
import com.p046p1.mobile.putong.data.Detect;
import com.p046p1.mobile.putong.data.DetectCategoryType;
import com.p046p1.mobile.putong.data.DetectRequest;
import com.p046p1.mobile.putong.data.DetectText;
import com.p046p1.mobile.putong.data.Emotion;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.StateEmotion;
import com.p046p1.mobile.putong.feed.newui.status.selectstatus.FeedSelectAndPostStatusAct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class txh extends jq2<zxh> {

    /* JADX INFO: renamed from: a */
    public boolean f172508a;

    /* JADX INFO: renamed from: b */
    public List<fyh> f172509b;

    /* JADX INFO: renamed from: c */
    public FeedSelectAndPostStatusAct f172510c;

    public txh(mcr mcrVar) {
        super(mcrVar);
        this.f172509b = new ArrayList();
    }

    /* JADX INFO: renamed from: h0 */
    private void m190955h0() {
        String str = sti.f166363g.get();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        for (StateEmotion stateEmotion : JSON.parseArray(str, StateEmotion.class)) {
            this.f172509b.add(new fyh(true, null, stateEmotion.categoryName));
            Iterator<Emotion> it = stateEmotion.emotions.iterator();
            while (it.hasNext()) {
                this.f172509b.add(new fyh(false, it.next(), stateEmotion.categoryName));
            }
        }
        if (this.f172510c.f42967h == null && !vwb.m200296J(this.f172509b) && this.f172509b.size() > 1) {
            this.f172510c.f42967h = this.f172509b.get(1).m123767b();
        }
        ((zxh) this.viewModel).m220811A(this.f172510c.f42967h);
        ((zxh) this.viewModel).m220817q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m190956i0(d30 d30Var, Envelope envelope) {
        this.f172508a = false;
        Detect detect = ((CommonData) envelope.getModuleData(CommonData.class)).detect;
        if (vwb.m200296J(detect.text) && vwb.m200296J(detect.media)) {
            d30Var.call();
        } else if (vqg.m199555l(detect, "p_set_my_state_post")) {
            lsi0.m151593w(R$string.f39141s);
        } else {
            lsi0.m151593w(R$string.f38996W2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m190957j0(d30 d30Var, Throwable th) {
        this.f172508a = false;
        d30Var.call();
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
        this.f172510c = (FeedSelectAndPostStatusAct) act();
        m190955h0();
    }

    /* JADX INFO: renamed from: g0 */
    public void m190958g0(String str, final d30 d30Var) {
        this.f172508a = true;
        DetectRequest detectRequest = new DetectRequest();
        detectRequest.category = DetectCategoryType.get("moment");
        DetectText detectText = new DetectText();
        detectText.key = "myState";
        detectText.value = str;
        ArrayList arrayList = new ArrayList();
        detectRequest.text = arrayList;
        arrayList.add(detectText);
        duringCreated(FeedModule.f38855d.m209341P6(detectRequest)).subscribe(mkd0.m154956H(new e30() { // from class: l.rxh
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f161473a.m190956i0(d30Var, (Envelope) obj);
            }
        }, new e30() { // from class: l.sxh
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f166792a.m190957j0(d30Var, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k0 */
    public void m190959k0(BubbleInfo bubbleInfo) {
        FeedModule.f38856e.m132649V0(bubbleInfo, this.f172510c.f42971l);
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
