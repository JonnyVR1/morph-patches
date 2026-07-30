package p149l;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.alibaba.fastjson.JSON;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.BubbleInfo;
import com.p046p1.mobile.putong.data.DetectCategoryType;
import com.p046p1.mobile.putong.data.Emotion;
import com.p046p1.mobile.putong.data.MessageLocation;
import com.p046p1.mobile.putong.data.TextTheme;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.PoiEmotionGuide;
import com.p046p1.mobile.putong.feed.data.PoiGuidePopWindow;
import com.p046p1.mobile.putong.feed.data.StateEmotion;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class lph extends qnh {

    /* JADX INFO: renamed from: Q */
    public static String f129206Q = "p_poi_lighten_state_pop";

    /* JADX INFO: renamed from: L */
    public Emotion f129207L;

    /* JADX INFO: renamed from: M */
    public Emotion f129208M;

    /* JADX INFO: renamed from: N */
    public Emotion f129209N;

    /* JADX INFO: renamed from: O */
    public Emotion f129210O;

    /* JADX INFO: renamed from: P */
    public Emotion f129211P;

    /* JADX INFO: renamed from: l.lph$a */
    public static class C18279a {

        /* JADX INFO: renamed from: a */
        public Act f129212a;

        /* JADX INFO: renamed from: b */
        public PoiGuidePopWindow f129213b;

        /* JADX INFO: renamed from: c */
        public boolean f129214c;

        /* JADX INFO: renamed from: d */
        public gsl f129215d;

        /* JADX INFO: renamed from: a */
        public lph m150864a() {
            lph lphVar = new lph(this.f129212a);
            lphVar.m175678g0(this.f129214c);
            lphVar.m175679h0(this.f129213b);
            lphVar.m175677f0(this.f129215d);
            return lphVar;
        }

        /* JADX INFO: renamed from: b */
        public C18279a m150865b(Act act) {
            this.f129212a = act;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C18279a m150866c(gsl gslVar) {
            this.f129215d = gslVar;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C18279a m150867d(boolean z) {
            this.f129214c = z;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C18279a m150868e(PoiGuidePopWindow poiGuidePopWindow) {
            this.f129213b = poiGuidePopWindow;
            return this;
        }
    }

    public lph(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public /* synthetic */ void m150852s0(String str) {
        m150856q0(str);
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public /* synthetic */ void m150853t0(View view) {
        final String string = NullChecker.m81303a(this.f155469u.getText()) ? this.f155469u.getText().toString() : null;
        if (!TextUtils.isEmpty(string)) {
            m175660G(string, DetectCategoryType.get("moment"), "moment", null, new d30() { // from class: l.kph
                @Override // p149l.d30
                public final void call() {
                    this.f124152a.m150852s0(string);
                }
            });
        } else if (TextUtils.isEmpty(this.f155446H)) {
            lsi0.m151595y("请输入您此刻的想法");
        } else {
            m150856q0(this.f155446H);
            dismiss();
        }
    }

    /* JADX INFO: renamed from: A0 */
    public final void m150854A0(Emotion emotion, String str) {
        BubbleInfo bubbleInfo = new BubbleInfo();
        if (!TextUtils.isEmpty(str) && str.length() > 30) {
            str = str.substring(0, 30);
        }
        bubbleInfo.value = str;
        bubbleInfo.emotion = emotion;
        TextTheme textTheme = new TextTheme();
        textTheme.backgroundColor = emotion.backgroundColor;
        textTheme.iconColor = emotion.iconColor;
        bubbleInfo.textTheme = textTheme;
        FeedModule.f38856e.m132649V0(bubbleInfo, mo112893J());
    }

    /* JADX INFO: renamed from: B0 */
    public void m150855B0() {
        if (vwb.m200296J(this.f155443E.emotionGuides) || this.f155443E.emotionGuides.size() < 4) {
            xdl0.m208344M(this.f155456h, false);
            return;
        }
        xdl0.m208344M(this.f155456h, true);
        int iM208412y0 = xdl0.m208412y0();
        int i = t100.f167276y;
        int i2 = (((iM208412y0 - i) - i) - (t100.f167259h * 3)) / 4;
        ViewGroup.LayoutParams layoutParams = this.f155457i.getLayoutParams();
        layoutParams.width = i2;
        this.f155457i.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = this.f155460l.getLayoutParams();
        layoutParams2.width = i2;
        this.f155460l.setLayoutParams(layoutParams2);
        ViewGroup.LayoutParams layoutParams3 = this.f155463o.getLayoutParams();
        layoutParams3.width = i2;
        this.f155463o.setLayoutParams(layoutParams3);
        ViewGroup.LayoutParams layoutParams4 = this.f155466r.getLayoutParams();
        layoutParams4.width = i2;
        this.f155466r.setLayoutParams(layoutParams4);
        m150857r0();
        xdl0.m208329E0(this.f155457i, new View.OnClickListener() { // from class: l.gph
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f103802a.m150859v0(view);
            }
        });
        xdl0.m208329E0(this.f155460l, new View.OnClickListener() { // from class: l.hph
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f108925a.m150860w0(view);
            }
        });
        xdl0.m208329E0(this.f155463o, new View.OnClickListener() { // from class: l.iph
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f114295a.m150861x0(view);
            }
        });
        xdl0.m208329E0(this.f155466r, new View.OnClickListener() { // from class: l.jph
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f119187a.m150862y0(view);
            }
        });
    }

    @Override // p149l.qnh
    /* JADX INFO: renamed from: J */
    public String mo112893J() {
        return f129206Q;
    }

    @Override // p149l.qnh
    /* JADX INFO: renamed from: R */
    public void mo112894R() {
        m150855B0();
        xdl0.m208329E0(this.f155471w, new View.OnClickListener() { // from class: l.eph
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f92654a.m150853t0(view);
            }
        });
    }

    @Override // p149l.qnh
    /* JADX INFO: renamed from: d0 */
    public void mo112895d0() {
        MessageLocation messageLocation = this.f155441C;
        if (messageLocation == null) {
            return;
        }
        String str = String.format(this.f155443E.subTitle, messageLocation.name);
        this.f155446H = str;
        this.f155469u.setHint(str);
        if (this.f129207L != null) {
            PoiEmotionGuide poiEmotionGuide = (PoiEmotionGuide) vwb.m200346r(this.f155443E.emotionGuides, new w9j() { // from class: l.fph
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f98697a.m150858u0((PoiEmotionGuide) obj);
                }
            });
            if (!NullChecker.m81303a(poiEmotionGuide) || TextUtils.isEmpty(poiEmotionGuide.guide)) {
                return;
            }
            String str2 = String.format(poiEmotionGuide.guide, this.f155441C.name);
            this.f155446H = str2;
            this.f155469u.setHint(str2);
        }
    }

    @Override // p149l.qnh, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
    }

    /* JADX INFO: renamed from: q0 */
    public final void m150856q0(String str) {
        if (NullChecker.m81303a(this.f129207L)) {
            zvf0.m220399u("e_set_my_state_post", mo112893J(), vwb.m200311Y("source_page", this.f155444F ? "poi_lighten_guide" : "poi_lighten_click"));
            m150854A0(this.f129207L, str);
        }
        m175661H(str);
    }

    /* JADX INFO: renamed from: r0 */
    public final void m150857r0() {
        List array;
        String str = sti.f166363g.get();
        if (TextUtils.isEmpty(str)) {
            xdl0.m208344M(this.f155456h, false);
            return;
        }
        try {
            array = JSON.parseArray(str, StateEmotion.class);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            array = null;
        }
        if (vwb.m200296J(array)) {
            xdl0.m208344M(this.f155456h, false);
            return;
        }
        Iterator it = array.iterator();
        while (it.hasNext()) {
            for (Emotion emotion : ((StateEmotion) it.next()).emotions) {
                if (this.f129208M == null && TextUtils.equals(emotion.f38748id, this.f155443E.emotionGuides.get(0).emotionId)) {
                    this.f129208M = emotion;
                }
                if (this.f129209N == null && TextUtils.equals(emotion.f38748id, this.f155443E.emotionGuides.get(1).emotionId)) {
                    this.f129209N = emotion;
                }
                if (this.f129210O == null && TextUtils.equals(emotion.f38748id, this.f155443E.emotionGuides.get(2).emotionId)) {
                    this.f129210O = emotion;
                }
                if (this.f129211P == null && TextUtils.equals(emotion.f38748id, this.f155443E.emotionGuides.get(3).emotionId)) {
                    this.f129211P = emotion;
                }
            }
        }
        if (NullChecker.m81303a(this.f129208M)) {
            qib0.f154691G.m102325I0(this.f155458j, this.f129208M.emojiUrl, t100.m186890d(52.0f), t100.m186890d(52.0f));
            this.f155459k.setText(this.f129208M.text);
            this.f129207L = this.f129208M;
            this.f155457i.setSelected(true);
            mo112895d0();
        }
        if (NullChecker.m81303a(this.f129209N)) {
            qib0.f154691G.m102325I0(this.f155461m, this.f129209N.emojiUrl, t100.m186890d(52.0f), t100.m186890d(52.0f));
            this.f155462n.setText(this.f129209N.text);
        }
        if (NullChecker.m81303a(this.f129210O)) {
            qib0.f154691G.m102325I0(this.f155464p, this.f129210O.emojiUrl, t100.m186890d(52.0f), t100.m186890d(52.0f));
            this.f155465q.setText(this.f129210O.text);
        }
        if (NullChecker.m81303a(this.f129211P)) {
            qib0.f154691G.m102325I0(this.f155467s, this.f129211P.emojiUrl, t100.m186890d(52.0f), t100.m186890d(52.0f));
            this.f155468t.setText(this.f129211P.text);
        }
    }

    @Override // p149l.qnh, android.app.Dialog
    public void show() {
        super.show();
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ Boolean m150858u0(PoiEmotionGuide poiEmotionGuide) {
        return Boolean.valueOf(TextUtils.equals(poiEmotionGuide.emotionId, this.f129207L.f38748id));
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m150859v0(View view) {
        if (this.f155457i.isSelected()) {
            this.f155457i.setSelected(false);
            this.f129207L = null;
        } else {
            this.f155460l.setSelected(false);
            this.f155463o.setSelected(false);
            this.f155466r.setSelected(false);
            this.f155457i.setSelected(true);
            this.f129207L = this.f129208M;
        }
        m150863z0();
        mo112895d0();
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ void m150860w0(View view) {
        if (this.f155460l.isSelected()) {
            this.f155460l.setSelected(false);
            this.f129207L = null;
        } else {
            this.f155457i.setSelected(false);
            this.f155463o.setSelected(false);
            this.f155466r.setSelected(false);
            this.f155460l.setSelected(true);
            this.f129207L = this.f129209N;
        }
        m150863z0();
        mo112895d0();
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m150861x0(View view) {
        if (this.f155463o.isSelected()) {
            this.f155463o.setSelected(false);
            this.f129207L = null;
        } else {
            this.f155460l.setSelected(false);
            this.f155457i.setSelected(false);
            this.f155466r.setSelected(false);
            this.f155463o.setSelected(true);
            this.f129207L = this.f129210O;
        }
        m150863z0();
        mo112895d0();
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m150862y0(View view) {
        if (this.f155466r.isSelected()) {
            this.f155466r.setSelected(false);
            this.f129207L = null;
        } else {
            this.f155460l.setSelected(false);
            this.f155463o.setSelected(false);
            this.f155457i.setSelected(false);
            this.f155466r.setSelected(true);
            this.f129207L = this.f129211P;
        }
        m150863z0();
        mo112895d0();
    }

    /* JADX INFO: renamed from: z0 */
    public final void m150863z0() {
        if (this.f129207L == null) {
            return;
        }
        zvf0.m220399u("e_set_my_state_type", mo112893J(), vwb.m200311Y("state_type_id", this.f129207L.f38748id));
    }
}
