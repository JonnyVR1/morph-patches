package p007l;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.alibaba.fastjson.JSON;
import com.p000p1.mobile.putong.data.BubbleInfo;
import com.p000p1.mobile.putong.data.DetectCategoryType;
import com.p000p1.mobile.putong.data.Emotion;
import com.p000p1.mobile.putong.data.MessageLocation;
import com.p000p1.mobile.putong.data.TextTheme;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.PoiEmotionGuide;
import com.p000p1.mobile.putong.feed.data.PoiGuidePopWindow;
import com.p000p1.mobile.putong.feed.data.StateEmotion;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import java.util.List;
import l.d30;
import l.j760;
import l.lsi0;
import l.qib0;
import l.t100;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class lph extends qnh {

    /* JADX INFO: renamed from: Q */
    public static String f10090Q = "p_poi_lighten_state_pop";

    /* JADX INFO: renamed from: L */
    public Emotion f10091L;

    /* JADX INFO: renamed from: M */
    public Emotion f10092M;

    /* JADX INFO: renamed from: N */
    public Emotion f10093N;

    /* JADX INFO: renamed from: O */
    public Emotion f10094O;

    /* JADX INFO: renamed from: P */
    public Emotion f10095P;

    /* JADX INFO: renamed from: l.lph$a */
    public static class C2419a {

        /* JADX INFO: renamed from: a */
        public Act f10096a;

        /* JADX INFO: renamed from: b */
        public PoiGuidePopWindow f10097b;

        /* JADX INFO: renamed from: c */
        public boolean f10098c;

        /* JADX INFO: renamed from: d */
        public gsl f10099d;

        /* JADX INFO: renamed from: a */
        public lph m11691a() {
            lph lphVar = new lph(this.f10096a);
            lphVar.m13673g0(this.f10098c);
            lphVar.m13674h0(this.f10097b);
            lphVar.m13672f0(this.f10099d);
            return lphVar;
        }

        /* JADX INFO: renamed from: b */
        public C2419a m11692b(Act act) {
            this.f10096a = act;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C2419a m11693c(gsl gslVar) {
            this.f10099d = gslVar;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C2419a m11694d(boolean z) {
            this.f10098c = z;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C2419a m11695e(PoiGuidePopWindow poiGuidePopWindow) {
            this.f10097b = poiGuidePopWindow;
            return this;
        }
    }

    public lph(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public /* synthetic */ void m11679s0(String str) {
        m11683q0(str);
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public /* synthetic */ void m11680t0(View view) {
        final String string = NullChecker.a(this.f12326u.getText()) ? this.f12326u.getText().toString() : null;
        if (!TextUtils.isEmpty(string)) {
            m13655G(string, DetectCategoryType.get("moment"), "moment", null, new d30() { // from class: l.kph
                public final void call() {
                    this.f9764a.m11679s0(string);
                }
            });
        } else if (TextUtils.isEmpty(this.f12303H)) {
            lsi0.y("请输入您此刻的想法");
        } else {
            m11683q0(this.f12303H);
            dismiss();
        }
    }

    /* JADX INFO: renamed from: A0 */
    public final void m11681A0(Emotion emotion, String str) {
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
        FeedModule.f317e.m10712V0(bubbleInfo, mo9541J());
    }

    /* JADX INFO: renamed from: B0 */
    public void m11682B0() {
        if (vwb.J(this.f12300E.emotionGuides) || this.f12300E.emotionGuides.size() < 4) {
            xdl0.M(this.f12313h, false);
            return;
        }
        xdl0.M(this.f12313h, true);
        int iY0 = xdl0.y0();
        int i = t100.y;
        int i2 = (((iY0 - i) - i) - (t100.h * 3)) / 4;
        ViewGroup.LayoutParams layoutParams = this.f12314i.getLayoutParams();
        layoutParams.width = i2;
        this.f12314i.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = this.f12317l.getLayoutParams();
        layoutParams2.width = i2;
        this.f12317l.setLayoutParams(layoutParams2);
        ViewGroup.LayoutParams layoutParams3 = this.f12320o.getLayoutParams();
        layoutParams3.width = i2;
        this.f12320o.setLayoutParams(layoutParams3);
        ViewGroup.LayoutParams layoutParams4 = this.f12323r.getLayoutParams();
        layoutParams4.width = i2;
        this.f12323r.setLayoutParams(layoutParams4);
        m11684r0();
        xdl0.E0(this.f12314i, new View.OnClickListener() { // from class: l.gph
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8496a.m11686v0(view);
            }
        });
        xdl0.E0(this.f12317l, new View.OnClickListener() { // from class: l.hph
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8787a.m11687w0(view);
            }
        });
        xdl0.E0(this.f12320o, new View.OnClickListener() { // from class: l.iph
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9115a.m11688x0(view);
            }
        });
        xdl0.E0(this.f12323r, new View.OnClickListener() { // from class: l.jph
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9501a.m11689y0(view);
            }
        });
    }

    @Override // p007l.qnh
    /* JADX INFO: renamed from: J */
    public String mo9541J() {
        return f10090Q;
    }

    @Override // p007l.qnh
    /* JADX INFO: renamed from: R */
    public void mo9542R() {
        m11682B0();
        xdl0.E0(this.f12328w, new View.OnClickListener() { // from class: l.eph
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7452a.m11680t0(view);
            }
        });
    }

    @Override // p007l.qnh
    /* JADX INFO: renamed from: d0 */
    public void mo9543d0() {
        MessageLocation messageLocation = this.f12298C;
        if (messageLocation == null) {
            return;
        }
        String str = String.format(this.f12300E.subTitle, messageLocation.name);
        this.f12303H = str;
        this.f12326u.setHint(str);
        if (this.f10091L != null) {
            PoiEmotionGuide poiEmotionGuide = (PoiEmotionGuide) vwb.r(this.f12300E.emotionGuides, new w9j() { // from class: l.fph
                public final Object call(Object obj) {
                    return this.f8182a.m11685u0((PoiEmotionGuide) obj);
                }
            });
            if (!NullChecker.a(poiEmotionGuide) || TextUtils.isEmpty(poiEmotionGuide.guide)) {
                return;
            }
            String str2 = String.format(poiEmotionGuide.guide, this.f12298C.name);
            this.f12303H = str2;
            this.f12326u.setHint(str2);
        }
    }

    @Override // p007l.qnh
    public void dismiss() {
        super.dismiss();
    }

    /* JADX INFO: renamed from: q0 */
    public final void m11683q0(String str) {
        if (NullChecker.a(this.f10091L)) {
            zvf0.u("e_set_my_state_post", mo9541J(), new j760[]{vwb.Y("source_page", this.f12301F ? "poi_lighten_guide" : "poi_lighten_click")});
            m11681A0(this.f10091L, str);
        }
        m13656H(str);
    }

    /* JADX INFO: renamed from: r0 */
    public final void m11684r0() {
        List array;
        String str = (String) sti.f13081g.get();
        if (TextUtils.isEmpty(str)) {
            xdl0.M(this.f12313h, false);
            return;
        }
        try {
            array = JSON.parseArray(str, StateEmotion.class);
        } catch (Exception e) {
            CrashHelper.c(e);
            array = null;
        }
        if (vwb.J(array)) {
            xdl0.M(this.f12313h, false);
            return;
        }
        Iterator it = array.iterator();
        while (it.hasNext()) {
            for (Emotion emotion : ((StateEmotion) it.next()).emotions) {
                if (this.f10092M == null && TextUtils.equals(emotion.f209id, this.f12300E.emotionGuides.get(0).emotionId)) {
                    this.f10092M = emotion;
                }
                if (this.f10093N == null && TextUtils.equals(emotion.f209id, this.f12300E.emotionGuides.get(1).emotionId)) {
                    this.f10093N = emotion;
                }
                if (this.f10094O == null && TextUtils.equals(emotion.f209id, this.f12300E.emotionGuides.get(2).emotionId)) {
                    this.f10094O = emotion;
                }
                if (this.f10095P == null && TextUtils.equals(emotion.f209id, this.f12300E.emotionGuides.get(3).emotionId)) {
                    this.f10095P = emotion;
                }
            }
        }
        if (NullChecker.a(this.f10092M)) {
            qib0.G.I0(this.f12315j, this.f10092M.emojiUrl, t100.d(52.0f), t100.d(52.0f));
            this.f12316k.setText(this.f10092M.text);
            this.f10091L = this.f10092M;
            this.f12314i.setSelected(true);
            mo9543d0();
        }
        if (NullChecker.a(this.f10093N)) {
            qib0.G.I0(this.f12318m, this.f10093N.emojiUrl, t100.d(52.0f), t100.d(52.0f));
            this.f12319n.setText(this.f10093N.text);
        }
        if (NullChecker.a(this.f10094O)) {
            qib0.G.I0(this.f12321p, this.f10094O.emojiUrl, t100.d(52.0f), t100.d(52.0f));
            this.f12322q.setText(this.f10094O.text);
        }
        if (NullChecker.a(this.f10095P)) {
            qib0.G.I0(this.f12324s, this.f10095P.emojiUrl, t100.d(52.0f), t100.d(52.0f));
            this.f12325t.setText(this.f10095P.text);
        }
    }

    @Override // p007l.qnh
    public void show() {
        super.show();
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ Boolean m11685u0(PoiEmotionGuide poiEmotionGuide) {
        return Boolean.valueOf(TextUtils.equals(poiEmotionGuide.emotionId, this.f10091L.f209id));
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m11686v0(View view) {
        if (this.f12314i.isSelected()) {
            this.f12314i.setSelected(false);
            this.f10091L = null;
        } else {
            this.f12317l.setSelected(false);
            this.f12320o.setSelected(false);
            this.f12323r.setSelected(false);
            this.f12314i.setSelected(true);
            this.f10091L = this.f10092M;
        }
        m11690z0();
        mo9543d0();
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ void m11687w0(View view) {
        if (this.f12317l.isSelected()) {
            this.f12317l.setSelected(false);
            this.f10091L = null;
        } else {
            this.f12314i.setSelected(false);
            this.f12320o.setSelected(false);
            this.f12323r.setSelected(false);
            this.f12317l.setSelected(true);
            this.f10091L = this.f10093N;
        }
        m11690z0();
        mo9543d0();
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m11688x0(View view) {
        if (this.f12320o.isSelected()) {
            this.f12320o.setSelected(false);
            this.f10091L = null;
        } else {
            this.f12317l.setSelected(false);
            this.f12314i.setSelected(false);
            this.f12323r.setSelected(false);
            this.f12320o.setSelected(true);
            this.f10091L = this.f10094O;
        }
        m11690z0();
        mo9543d0();
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m11689y0(View view) {
        if (this.f12323r.isSelected()) {
            this.f12323r.setSelected(false);
            this.f10091L = null;
        } else {
            this.f12317l.setSelected(false);
            this.f12320o.setSelected(false);
            this.f12314i.setSelected(false);
            this.f12323r.setSelected(true);
            this.f10091L = this.f10095P;
        }
        m11690z0();
        mo9543d0();
    }

    /* JADX INFO: renamed from: z0 */
    public final void m11690z0() {
        if (this.f10091L == null) {
            return;
        }
        zvf0.u("e_set_my_state_type", mo9541J(), new j760[]{vwb.Y("state_type_id", this.f10091L.f209id)});
    }
}
