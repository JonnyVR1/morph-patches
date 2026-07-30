package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.alibaba.fastjson.JSON;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.BubbleInfo;
import com.p051p1.mobile.putong.data.DetectCategoryType;
import com.p051p1.mobile.putong.data.Emotion;
import com.p051p1.mobile.putong.data.MessageLocation;
import com.p051p1.mobile.putong.data.TextTheme;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.PoiEmotionGuide;
import com.p051p1.mobile.putong.feed.data.PoiGuidePopWindow;
import com.p051p1.mobile.putong.feed.data.StateEmotion;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class arh extends fph {

    /* JADX INFO: renamed from: Q */
    public static String f72935Q = "p_poi_lighten_state_pop";

    /* JADX INFO: renamed from: L */
    public Emotion f72936L;

    /* JADX INFO: renamed from: M */
    public Emotion f72937M;

    /* JADX INFO: renamed from: N */
    public Emotion f72938N;

    /* JADX INFO: renamed from: O */
    public Emotion f72939O;

    /* JADX INFO: renamed from: P */
    public Emotion f72940P;

    /* JADX INFO: renamed from: l.arh$a */
    public static class C15805a {

        /* JADX INFO: renamed from: a */
        public Act f72941a;

        /* JADX INFO: renamed from: b */
        public PoiGuidePopWindow f72942b;

        /* JADX INFO: renamed from: c */
        public boolean f72943c;

        /* JADX INFO: renamed from: d */
        public uul f72944d;

        /* JADX INFO: renamed from: a */
        public arh m99697a() {
            arh arhVar = new arh(this.f72941a);
            arhVar.m126626g0(this.f72943c);
            arhVar.m126627h0(this.f72942b);
            arhVar.m126625f0(this.f72944d);
            return arhVar;
        }

        /* JADX INFO: renamed from: b */
        public C15805a m99698b(Act act) {
            this.f72941a = act;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C15805a m99699c(uul uulVar) {
            this.f72944d = uulVar;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C15805a m99700d(boolean z) {
            this.f72943c = z;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C15805a m99701e(PoiGuidePopWindow poiGuidePopWindow) {
            this.f72942b = poiGuidePopWindow;
            return this;
        }
    }

    public arh(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public /* synthetic */ void m99682s0(String str) {
        m99689q0(str);
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public /* synthetic */ void m99683t0(View view) {
        final String string = NullChecker.m82486a(this.f100160u.getText()) ? this.f100160u.getText().toString() : null;
        if (!TextUtils.isEmpty(string)) {
            m126608G(string, DetectCategoryType.get("moment"), "moment", null, new x20() { // from class: l.zqh
                @Override // p153l.x20
                public final void call() {
                    this.f205613a.m99682s0(string);
                }
            });
        } else if (TextUtils.isEmpty(this.f100137H)) {
            o1j0.m165651y("请输入您此刻的想法");
        } else {
            m99689q0(this.f100137H);
            dismiss();
        }
    }

    /* JADX INFO: renamed from: A0 */
    public final void m99684A0(Emotion emotion, String str) {
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
        FeedModule.f39704e.m159782V0(bubbleInfo, mo99686J());
    }

    /* JADX INFO: renamed from: B0 */
    public void m99685B0() {
        if (jyb.m147479J(this.f100134E.emotionGuides) || this.f100134E.emotionGuides.size() < 4) {
            bnl0.m105524M(this.f100147h, false);
            return;
        }
        bnl0.m105524M(this.f100147h, true);
        int iM105592y0 = bnl0.m105592y0();
        int i = qa00.f156338y;
        int i2 = (((iM105592y0 - i) - i) - (qa00.f156321h * 3)) / 4;
        ViewGroup.LayoutParams layoutParams = this.f100148i.getLayoutParams();
        layoutParams.width = i2;
        this.f100148i.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = this.f100151l.getLayoutParams();
        layoutParams2.width = i2;
        this.f100151l.setLayoutParams(layoutParams2);
        ViewGroup.LayoutParams layoutParams3 = this.f100154o.getLayoutParams();
        layoutParams3.width = i2;
        this.f100154o.setLayoutParams(layoutParams3);
        ViewGroup.LayoutParams layoutParams4 = this.f100157r.getLayoutParams();
        layoutParams4.width = i2;
        this.f100157r.setLayoutParams(layoutParams4);
        m99690r0();
        bnl0.m105509E0(this.f100148i, new View.OnClickListener() { // from class: l.vqh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f185351a.m99692v0(view);
            }
        });
        bnl0.m105509E0(this.f100151l, new View.OnClickListener() { // from class: l.wqh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f190408a.m99693w0(view);
            }
        });
        bnl0.m105509E0(this.f100154o, new View.OnClickListener() { // from class: l.xqh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f195805a.m99694x0(view);
            }
        });
        bnl0.m105509E0(this.f100157r, new View.OnClickListener() { // from class: l.yqh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f201215a.m99695y0(view);
            }
        });
    }

    @Override // p153l.fph
    /* JADX INFO: renamed from: J */
    public String mo99686J() {
        return f72935Q;
    }

    @Override // p153l.fph
    /* JADX INFO: renamed from: R */
    public void mo99687R() {
        m99685B0();
        bnl0.m105509E0(this.f100162w, new View.OnClickListener() { // from class: l.tqh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f175732a.m99683t0(view);
            }
        });
    }

    @Override // p153l.fph
    /* JADX INFO: renamed from: d0 */
    public void mo99688d0() {
        MessageLocation messageLocation = this.f100132C;
        if (messageLocation == null) {
            return;
        }
        String str = String.format(this.f100134E.subTitle, messageLocation.name);
        this.f100137H = str;
        this.f100160u.setHint(str);
        if (this.f72936L != null) {
            PoiEmotionGuide poiEmotionGuide = (PoiEmotionGuide) jyb.m147529r(this.f100134E.emotionGuides, new qcj() { // from class: l.uqh
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f180457a.m99691u0((PoiEmotionGuide) obj);
                }
            });
            if (!NullChecker.m82486a(poiEmotionGuide) || TextUtils.isEmpty(poiEmotionGuide.guide)) {
                return;
            }
            String str2 = String.format(poiEmotionGuide.guide, this.f100132C.name);
            this.f100137H = str2;
            this.f100160u.setHint(str2);
        }
    }

    @Override // p153l.fph, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
    }

    /* JADX INFO: renamed from: q0 */
    public final void m99689q0(String str) {
        if (NullChecker.m82486a(this.f72936L)) {
            i4g0.m138523u("e_set_my_state_post", mo99686J(), jyb.m147494Y("source_page", this.f100135F ? "poi_lighten_guide" : "poi_lighten_click"));
            m99684A0(this.f72936L, str);
        }
        m126609H(str);
    }

    /* JADX INFO: renamed from: r0 */
    public final void m99690r0() {
        List array;
        String str = owi.f149488g.get();
        if (TextUtils.isEmpty(str)) {
            bnl0.m105524M(this.f100147h, false);
            return;
        }
        try {
            array = JSON.parseArray(str, StateEmotion.class);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            array = null;
        }
        if (jyb.m147479J(array)) {
            bnl0.m105524M(this.f100147h, false);
            return;
        }
        Iterator it = array.iterator();
        while (it.hasNext()) {
            for (Emotion emotion : ((StateEmotion) it.next()).emotions) {
                if (this.f72937M == null && TextUtils.equals(emotion.f39596id, this.f100134E.emotionGuides.get(0).emotionId)) {
                    this.f72937M = emotion;
                }
                if (this.f72938N == null && TextUtils.equals(emotion.f39596id, this.f100134E.emotionGuides.get(1).emotionId)) {
                    this.f72938N = emotion;
                }
                if (this.f72939O == null && TextUtils.equals(emotion.f39596id, this.f100134E.emotionGuides.get(2).emotionId)) {
                    this.f72939O = emotion;
                }
                if (this.f72940P == null && TextUtils.equals(emotion.f39596id, this.f100134E.emotionGuides.get(3).emotionId)) {
                    this.f72940P = emotion;
                }
            }
        }
        if (NullChecker.m82486a(this.f72937M)) {
            uqb0.f180374G.m127109I0(this.f100149j, this.f72937M.emojiUrl, qa00.m175859d(52.0f), qa00.m175859d(52.0f));
            this.f100150k.setText(this.f72937M.text);
            this.f72936L = this.f72937M;
            this.f100148i.setSelected(true);
            mo99688d0();
        }
        if (NullChecker.m82486a(this.f72938N)) {
            uqb0.f180374G.m127109I0(this.f100152m, this.f72938N.emojiUrl, qa00.m175859d(52.0f), qa00.m175859d(52.0f));
            this.f100153n.setText(this.f72938N.text);
        }
        if (NullChecker.m82486a(this.f72939O)) {
            uqb0.f180374G.m127109I0(this.f100155p, this.f72939O.emojiUrl, qa00.m175859d(52.0f), qa00.m175859d(52.0f));
            this.f100156q.setText(this.f72939O.text);
        }
        if (NullChecker.m82486a(this.f72940P)) {
            uqb0.f180374G.m127109I0(this.f100158s, this.f72940P.emojiUrl, qa00.m175859d(52.0f), qa00.m175859d(52.0f));
            this.f100159t.setText(this.f72940P.text);
        }
    }

    @Override // p153l.fph, android.app.Dialog
    public void show() {
        super.show();
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ Boolean m99691u0(PoiEmotionGuide poiEmotionGuide) {
        return Boolean.valueOf(TextUtils.equals(poiEmotionGuide.emotionId, this.f72936L.f39596id));
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m99692v0(View view) {
        if (this.f100148i.isSelected()) {
            this.f100148i.setSelected(false);
            this.f72936L = null;
        } else {
            this.f100151l.setSelected(false);
            this.f100154o.setSelected(false);
            this.f100157r.setSelected(false);
            this.f100148i.setSelected(true);
            this.f72936L = this.f72937M;
        }
        m99696z0();
        mo99688d0();
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ void m99693w0(View view) {
        if (this.f100151l.isSelected()) {
            this.f100151l.setSelected(false);
            this.f72936L = null;
        } else {
            this.f100148i.setSelected(false);
            this.f100154o.setSelected(false);
            this.f100157r.setSelected(false);
            this.f100151l.setSelected(true);
            this.f72936L = this.f72938N;
        }
        m99696z0();
        mo99688d0();
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m99694x0(View view) {
        if (this.f100154o.isSelected()) {
            this.f100154o.setSelected(false);
            this.f72936L = null;
        } else {
            this.f100151l.setSelected(false);
            this.f100148i.setSelected(false);
            this.f100157r.setSelected(false);
            this.f100154o.setSelected(true);
            this.f72936L = this.f72939O;
        }
        m99696z0();
        mo99688d0();
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m99695y0(View view) {
        if (this.f100157r.isSelected()) {
            this.f100157r.setSelected(false);
            this.f72936L = null;
        } else {
            this.f100151l.setSelected(false);
            this.f100154o.setSelected(false);
            this.f100148i.setSelected(false);
            this.f100157r.setSelected(true);
            this.f72936L = this.f72940P;
        }
        m99696z0();
        mo99688d0();
    }

    /* JADX INFO: renamed from: z0 */
    public final void m99696z0() {
        if (this.f72936L == null) {
            return;
        }
        i4g0.m138523u("e_set_my_state_type", mo99686J(), jyb.m147494Y("state_type_id", this.f72936L.f39596id));
    }
}
