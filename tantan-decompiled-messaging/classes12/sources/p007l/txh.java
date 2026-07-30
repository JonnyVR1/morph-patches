package p007l;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.p000p1.mobile.putong.data.BubbleInfo;
import com.p000p1.mobile.putong.data.CommonData;
import com.p000p1.mobile.putong.data.Detect;
import com.p000p1.mobile.putong.data.DetectCategoryType;
import com.p000p1.mobile.putong.data.DetectRequest;
import com.p000p1.mobile.putong.data.DetectText;
import com.p000p1.mobile.putong.data.Emotion;
import com.p000p1.mobile.putong.data.Envelope;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.StateEmotion;
import com.p000p1.mobile.putong.feed.newui.status.selectstatus.FeedSelectAndPostStatusAct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.d30;
import l.e30;
import l.jq2;
import l.lsi0;
import l.mcr;
import l.mkd0;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class txh extends jq2<zxh> {

    /* JADX INFO: renamed from: a */
    public boolean f13465a;

    /* JADX INFO: renamed from: b */
    public List<fyh> f13466b;

    /* JADX INFO: renamed from: c */
    public FeedSelectAndPostStatusAct f13467c;

    public txh(mcr mcrVar) {
        super(mcrVar);
        this.f13466b = new ArrayList();
    }

    /* JADX INFO: renamed from: h0 */
    private void m14677h0() {
        String str = (String) sti.f13081g.get();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        for (StateEmotion stateEmotion : JSON.parseArray(str, StateEmotion.class)) {
            this.f13466b.add(new fyh(true, null, stateEmotion.categoryName));
            Iterator<Emotion> it = stateEmotion.emotions.iterator();
            while (it.hasNext()) {
                this.f13466b.add(new fyh(false, it.next(), stateEmotion.categoryName));
            }
        }
        if (this.f13467c.f4428h == null && !vwb.J(this.f13466b) && this.f13466b.size() > 1) {
            this.f13467c.f4428h = this.f13466b.get(1).m10328b();
        }
        ((zxh) ((jq2) this).viewModel).m17558A(this.f13467c.f4428h);
        ((zxh) ((jq2) this).viewModel).m17567q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m14678i0(d30 d30Var, Envelope envelope) {
        this.f13465a = false;
        Detect detect = ((CommonData) envelope.getModuleData(CommonData.class)).detect;
        if (vwb.J(detect.text) && vwb.J(detect.media)) {
            d30Var.call();
        } else if (vqg.m15525l(detect, "p_set_my_state_post")) {
            lsi0.w(R$string.f602s);
        } else {
            lsi0.w(R$string.f457W2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m14679j0(d30 d30Var, Throwable th) {
        this.f13465a = false;
        d30Var.call();
    }

    /* JADX INFO: renamed from: Z */
    public void m14680Z() {
        super.Z();
    }

    /* JADX INFO: renamed from: a0 */
    public void m14681a0() {
        super.a0();
        this.f13467c = act();
        m14677h0();
    }

    /* JADX INFO: renamed from: g0 */
    public void m14682g0(String str, final d30 d30Var) {
        this.f13465a = true;
        DetectRequest detectRequest = new DetectRequest();
        detectRequest.category = DetectCategoryType.get("moment");
        DetectText detectText = new DetectText();
        detectText.key = "myState";
        detectText.value = str;
        ArrayList arrayList = new ArrayList();
        detectRequest.text = arrayList;
        arrayList.add(detectText);
        duringCreated(FeedModule.f316d.m16522P6(detectRequest)).subscribe(mkd0.H(new e30() { // from class: l.rxh
            public final void call(Object obj) {
                this.f12755a.m14678i0(d30Var, (Envelope) obj);
            }
        }, new e30() { // from class: l.sxh
            public final void call(Object obj) {
                this.f13108a.m14679j0(d30Var, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k0 */
    public void m14683k0(BubbleInfo bubbleInfo) {
        FeedModule.f317e.m10712V0(bubbleInfo, this.f13467c.f4432l);
    }

    public void destroy() {
    }
}
