package p149l;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.alibaba.fastjson.JSON;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.BubbleInfo;
import com.p046p1.mobile.putong.data.CommonData;
import com.p046p1.mobile.putong.data.Detect;
import com.p046p1.mobile.putong.data.DetectCategoryType;
import com.p046p1.mobile.putong.data.DetectRequest;
import com.p046p1.mobile.putong.data.DetectText;
import com.p046p1.mobile.putong.data.Emotion;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.MessageLocation;
import com.p046p1.mobile.putong.data.TextTheme;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.PoiGuidePopWindow;
import com.p046p1.mobile.putong.feed.data.StateEmotion;
import com.p069ss.bytertc.audio.device.webrtc.WebRtcAudioTrack;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p147v.VEditText;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class frh extends BottomSheetDialog implements aa80.InterfaceC15555a, moh.InterfaceC18519a, qoh.InterfaceC19547b {

    /* JADX INFO: renamed from: A */
    public int f98932A;

    /* JADX INFO: renamed from: B */
    public moh f98933B;

    /* JADX INFO: renamed from: C */
    public c4g0 f98934C;

    /* JADX INFO: renamed from: D */
    public qoh f98935D;

    /* JADX INFO: renamed from: E */
    public String f98936E;

    /* JADX INFO: renamed from: F */
    public BottomSheetBehavior.BottomSheetCallback f98937F;

    /* JADX INFO: renamed from: a */
    public FrameLayout f98938a;

    /* JADX INFO: renamed from: b */
    public View f98939b;

    /* JADX INFO: renamed from: c */
    public RelativeLayout f98940c;

    /* JADX INFO: renamed from: d */
    public ImageView f98941d;

    /* JADX INFO: renamed from: e */
    public VText f98942e;

    /* JADX INFO: renamed from: f */
    public VText f98943f;

    /* JADX INFO: renamed from: g */
    public VRecyclerView f98944g;

    /* JADX INFO: renamed from: h */
    public VEditText f98945h;

    /* JADX INFO: renamed from: i */
    public VText f98946i;

    /* JADX INFO: renamed from: j */
    public VRecyclerView f98947j;

    /* JADX INFO: renamed from: k */
    public TextView f98948k;

    /* JADX INFO: renamed from: l */
    public boolean f98949l;

    /* JADX INFO: renamed from: m */
    public BottomSheetBehavior f98950m;

    /* JADX INFO: renamed from: n */
    public Act f98951n;

    /* JADX INFO: renamed from: o */
    public int f98952o;

    /* JADX INFO: renamed from: p */
    public cwf0 f98953p;

    /* JADX INFO: renamed from: q */
    public String f98954q;

    /* JADX INFO: renamed from: r */
    public gsl f98955r;

    /* JADX INFO: renamed from: s */
    public PoiGuidePopWindow f98956s;

    /* JADX INFO: renamed from: t */
    public String f98957t;

    /* JADX INFO: renamed from: u */
    public e30<String> f98958u;

    /* JADX INFO: renamed from: v */
    public e30<String> f98959v;

    /* JADX INFO: renamed from: w */
    public MessageLocation f98960w;

    /* JADX INFO: renamed from: x */
    public Emotion f98961x;

    /* JADX INFO: renamed from: y */
    public boolean f98962y;

    /* JADX INFO: renamed from: z */
    public int f98963z;

    /* JADX INFO: renamed from: l.frh$b */
    public static class C16915b {

        /* JADX INFO: renamed from: a */
        public Act f98965a;

        /* JADX INFO: renamed from: b */
        public int f98966b;

        /* JADX INFO: renamed from: c */
        public cwf0 f98967c;

        /* JADX INFO: renamed from: d */
        public String f98968d;

        /* JADX INFO: renamed from: e */
        public gsl f98969e;

        /* JADX INFO: renamed from: f */
        public PoiGuidePopWindow f98970f;

        /* JADX INFO: renamed from: g */
        public e30<String> f98971g;

        /* JADX INFO: renamed from: h */
        public e30<String> f98972h;

        /* JADX INFO: renamed from: i */
        public String f98973i;

        public C16915b(Act act, int i) {
            this.f98965a = act;
            this.f98966b = i;
        }

        /* JADX INFO: renamed from: a */
        public frh m122870a() {
            frh frhVar = new frh(this.f98965a);
            frhVar.m122845M(this.f98966b);
            frhVar.m122843K(this.f98968d, this.f98967c);
            frhVar.m122844L(this.f98970f);
            frhVar.m122842J(this.f98969e);
            frhVar.m122841I(this.f98973i);
            frhVar.m122840H(this.f98971g);
            frhVar.m122839G(this.f98972h);
            return frhVar;
        }

        /* JADX INFO: renamed from: b */
        public C16915b m122871b(gsl gslVar) {
            this.f98969e = gslVar;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C16915b m122872c(String str, cwf0 cwf0Var) {
            this.f98968d = str;
            this.f98967c = cwf0Var;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C16915b m122873d(PoiGuidePopWindow poiGuidePopWindow) {
            this.f98970f = poiGuidePopWindow;
            return this;
        }
    }

    public frh(@NonNull Context context) {
        super(context);
        this.f98937F = new C16914a();
        m122820Y(context);
    }

    /* JADX INFO: renamed from: O */
    private void m122817O(String str) {
        final HashMap map = new HashMap();
        PoiGuidePopWindow poiGuidePopWindow = this.f98956s;
        map.put("showtime", Integer.valueOf(poiGuidePopWindow.firstTimeShow ? 0 : poiGuidePopWindow.swipeLimit));
        map.put("user_segment", this.f98956s.userPostType);
        final Moment momentNew_ = Moment.new_();
        momentNew_.value = str;
        momentNew_.allowForward = null;
        momentNew_.additionalData = null;
        momentNew_.location = this.f98960w;
        momentNew_.from = m122849S();
        FeedModule.f38855d.m209404Y6(momentNew_, "poi").subscribe(mkd0.m154956H(new e30() { // from class: l.uqh
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f177748a.m122860g0(momentNew_, map, (Envelope) obj);
            }
        }, new e30() { // from class: l.vqh
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f182649a.m122861h0(momentNew_, map, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: P */
    private void m122818P(String str) {
        if (TextUtils.isEmpty(str)) {
            lsi0.m151595y("未获取内容，发布失败");
            return;
        }
        this.f98949l = true;
        if (NullChecker.m81303a(this.f98961x)) {
            zvf0.m220399u("e_set_my_state_post", m122850T(), vwb.m200311Y("source_page", m122849S()));
            m122831t0(this.f98961x, str);
        }
        m122817O(str);
    }

    /* JADX INFO: renamed from: W */
    private void m122819W(final View view) {
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        int iHeight = rect.height();
        int iMax = Math.max(this.f98963z, iHeight);
        this.f98963z = iMax;
        if (this.f98932A == iHeight) {
            return;
        }
        this.f98932A = iHeight;
        if (iHeight < iMax + WebRtcAudioTrack.AudioTrackErrorCode.AUDIO_TRACK_INIT_MINBUFFER_ERROR) {
            view.getTranslationY();
            view.post(new Runnable() { // from class: l.crh
                @Override // java.lang.Runnable
                public final void run() {
                    view.setTranslationY(-t100.f167236K);
                }
            });
        } else {
            view.getTranslationY();
            view.setTranslationY(0.0f);
        }
    }

    /* JADX INFO: renamed from: Y */
    private void m122820Y(Context context) {
        Act act = (Act) context;
        this.f98951n = act;
        setContentView(m122838F(LayoutInflater.from(act), null));
    }

    /* JADX INFO: renamed from: Z */
    private void m122821Z() {
        this.f98945h.setHint("请输入您此刻的想法");
        String strM189185a = tih.m189185a();
        boolean zIsEmpty = TextUtils.isEmpty(strM189185a);
        TextView textView = this.f98948k;
        if (zIsEmpty) {
            textView.setText("完成");
        } else {
            textView.setText(strM189185a);
        }
        this.f98942e.setText(m122852V());
        this.f98942e.setTypeface(Typeface.DEFAULT_BOLD);
        this.f98943f.setText(m122848R());
        xdl0.m208329E0(this.f98941d, new View.OnClickListener() { // from class: l.sqh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f165986a.m122823k0(view);
            }
        });
        xdl0.m208329E0(this.f98939b, new View.OnClickListener() { // from class: l.wqh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f187692a.m122824l0(view);
            }
        });
        xdl0.m208329E0(this.f98940c, new View.OnClickListener() { // from class: l.xqh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f194012a.m122825m0(view);
            }
        });
        xdl0.m208329E0(this.f98948k, new View.OnClickListener() { // from class: l.yqh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f199552a.m122866o0(view);
            }
        });
    }

    /* JADX INFO: renamed from: c0 */
    private void m122822c0() {
        m122821Z();
        m122855b0();
        m122854a0();
        m122827q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public /* synthetic */ void m122823k0(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public /* synthetic */ void m122824l0(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m122825m0(View view) {
        m122853X();
    }

    /* JADX INFO: renamed from: q0 */
    private void m122827q0() {
        this.f98938a.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: l.brh
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f76902a.m122867p0();
            }
        });
    }

    /* JADX INFO: renamed from: t0 */
    private void m122831t0(Emotion emotion, String str) {
        BubbleInfo bubbleInfo = new BubbleInfo();
        if (!TextUtils.isEmpty(str) && str.length() > 60) {
            str = str.substring(0, 60);
        }
        bubbleInfo.value = str;
        bubbleInfo.location = this.f98960w;
        bubbleInfo.emotion = emotion;
        TextTheme textTheme = new TextTheme();
        textTheme.backgroundColor = emotion.backgroundColor;
        textTheme.iconColor = emotion.iconColor;
        bubbleInfo.textTheme = textTheme;
        FeedModule.f38856e.m132649V0(bubbleInfo, m122850T());
    }

    /* JADX INFO: renamed from: F */
    public View m122838F(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return grh.m127712b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: G */
    public void m122839G(e30<String> e30Var) {
        this.f98959v = e30Var;
    }

    /* JADX INFO: renamed from: H */
    public void m122840H(e30<String> e30Var) {
        this.f98958u = e30Var;
    }

    /* JADX INFO: renamed from: I */
    public void m122841I(String str) {
        this.f98957t = str;
    }

    /* JADX INFO: renamed from: J */
    public void m122842J(gsl gslVar) {
        this.f98955r = gslVar;
    }

    /* JADX INFO: renamed from: K */
    public void m122843K(String str, cwf0 cwf0Var) {
        this.f98954q = str;
        this.f98953p = cwf0Var;
    }

    /* JADX INFO: renamed from: L */
    public void m122844L(PoiGuidePopWindow poiGuidePopWindow) {
        this.f98956s = poiGuidePopWindow;
        if (NullChecker.m81303a(poiGuidePopWindow)) {
            this.f98960w = poiGuidePopWindow.location;
        }
    }

    /* JADX INFO: renamed from: M */
    public void m122845M(int i) {
        this.f98952o = i;
    }

    /* JADX INFO: renamed from: N */
    public void m122846N(String str, DetectCategoryType detectCategoryType, String str2, final String str3, final d30 d30Var) {
        this.f98962y = true;
        DetectRequest detectRequest = new DetectRequest();
        detectRequest.category = detectCategoryType;
        DetectText detectText = new DetectText();
        detectText.key = str2;
        detectText.value = str;
        ArrayList arrayList = new ArrayList();
        detectRequest.text = arrayList;
        arrayList.add(detectText);
        FeedModule.f38855d.m209341P6(detectRequest).subscribe(mkd0.m154956H(new e30() { // from class: l.erh
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f92927a.m122859f0(d30Var, str3, (Envelope) obj);
            }
        }, new e30() { // from class: l.tqh
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f171589a.m122858e0(d30Var, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Q */
    public final void m122847Q() {
        this.f98934C = p980.m167864g(this.f98960w, 3).subscribe(mkd0.m154956H(new e30() { // from class: l.zqh
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f204383a.m122862i0((List) obj);
            }
        }, new e30() { // from class: l.arh
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f71271a.m122863j0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: R */
    public final String m122848R() {
        PoiGuidePopWindow poiGuidePopWindow = this.f98956s;
        if (poiGuidePopWindow != null) {
            return TextUtils.isEmpty(poiGuidePopWindow.desc) ? "点亮足迹，查看来过这里的人" : this.f98956s.desc;
        }
        String str = sti.f166371o.get();
        return !TextUtils.isEmpty(str) ? str : "点亮足迹，查看来过这里的人";
    }

    /* JADX INFO: renamed from: S */
    public final String m122849S() {
        return m122856d0() ? "poi_lighten_guide" : "poi_lighten_click";
    }

    @NonNull
    /* JADX INFO: renamed from: T */
    public String m122850T() {
        String str = this.f98954q;
        return str == null ? "" : str;
    }

    /* JADX INFO: renamed from: U */
    public final void m122851U() {
        ArrayList arrayList = new ArrayList();
        String str = sti.f166363g.get();
        PoiGuidePopWindow poiGuidePopWindow = this.f98956s;
        String str2 = poiGuidePopWindow == null ? "" : poiGuidePopWindow.emotionId;
        Emotion emotion = null;
        if (!TextUtils.isEmpty(str)) {
            try {
                Iterator it = JSON.parseArray(str, StateEmotion.class).iterator();
                while (it.hasNext()) {
                    for (Emotion emotion2 : ((StateEmotion) it.next()).emotions) {
                        if (TextUtils.equals(str2, emotion2.f38748id)) {
                            emotion = emotion2;
                        } else {
                            arrayList.add(emotion2);
                        }
                    }
                }
            } catch (Exception e) {
                CrashHelper.m81296c(e);
            }
        }
        if (NullChecker.m81303a(emotion)) {
            arrayList.add(0, emotion);
        }
        if (vwb.m200296J(arrayList)) {
            return;
        }
        if (this.f98961x == null) {
            mo122857e((Emotion) arrayList.get(0));
        }
        this.f98935D.m175745K(arrayList, this.f98961x);
    }

    /* JADX INFO: renamed from: V */
    public final String m122852V() {
        PoiGuidePopWindow poiGuidePopWindow = this.f98956s;
        if (poiGuidePopWindow != null) {
            return TextUtils.isEmpty(poiGuidePopWindow.title) ? "告诉附近的人你来了" : this.f98956s.title;
        }
        String str = sti.f166370n.get();
        return !TextUtils.isEmpty(str) ? str : "告诉附近的人你来了";
    }

    /* JADX INFO: renamed from: X */
    public void m122853X() {
        InputMethodManager inputMethodManager = (InputMethodManager) this.f98951n.getSystemService("input_method");
        if (!inputMethodManager.isActive() || getCurrentFocus() == null || getCurrentFocus().getWindowToken() == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 2);
    }

    /* JADX INFO: renamed from: a0 */
    public final void m122854a0() {
        if (NullChecker.m81303a(this.f98960w) && vqg.m199559n(this.f98960w.coordinates) > 2000) {
            this.f98960w = null;
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(0);
        this.f98947j.setLayoutManager(linearLayoutManager);
        moh mohVar = new moh(this.f98951n, m122850T(), this.f98957t);
        this.f98933B = mohVar;
        mohVar.m155701O(this);
        this.f98947j.setAdapter(this.f98933B);
        m122847Q();
    }

    /* JADX INFO: renamed from: b0 */
    public final void m122855b0() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(0);
        this.f98944g.setLayoutManager(linearLayoutManager);
        qoh qohVar = new qoh(this.f98951n, m122850T(), this.f98957t);
        this.f98935D = qohVar;
        qohVar.m175746L(this);
        this.f98944g.setAdapter(this.f98935D);
        m122851U();
    }

    /* JADX INFO: renamed from: d0 */
    public final boolean m122856d0() {
        return this.f98952o == 1;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        m122853X();
        super.dismiss();
        if (NullChecker.m81303a(this.f98959v)) {
            this.f98959v.call("");
        }
        aa80.m95532b().m95535d(this);
        if (NullChecker.m81303a(this.f98955r)) {
            this.f98955r.mo127807c();
        }
        if (NullChecker.m81303a(this.f98953p)) {
            i0e.m133796e(this.f98953p);
        }
        if (!NullChecker.m81303a(this.f98934C) || this.f98934C.isUnsubscribed()) {
            return;
        }
        this.f98934C.unsubscribe();
    }

    @Override // p149l.qoh.InterfaceC19547b
    /* JADX INFO: renamed from: e */
    public void mo122857e(Emotion emotion) {
        this.f98961x = emotion;
        m122868r0();
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m122858e0(d30 d30Var, Throwable th) {
        this.f98962y = false;
        d30Var.call();
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m122859f0(d30 d30Var, String str, Envelope envelope) {
        this.f98962y = false;
        Detect detect = ((CommonData) envelope.getModuleData(CommonData.class)).detect;
        if (vwb.m200296J(detect.text) && vwb.m200296J(detect.media)) {
            d30Var.call();
            return;
        }
        if (vqg.m199555l(detect, this.f98954q)) {
            lsi0.m151593w(R$string.f39141s);
        } else if (TextUtils.isEmpty(str)) {
            lsi0.m151593w(R$string.f38996W2);
        } else {
            lsi0.m151595y(str);
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m122860g0(Moment moment, HashMap map, Envelope envelope) {
        lsi0.m151595y("发布成功");
        zi60.m218961w().m218982n(moment, m122850T(), 201, false, map);
        if (m122856d0()) {
            w980.m202252h().m202265r(this.f98960w);
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m122861h0(Moment moment, HashMap map, Throwable th) {
        lsi0.m151595y("发布失败");
        zi60.m218961w().m218983o(moment, m122850T(), th, false, map);
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m122862i0(List list) {
        if (isShowing()) {
            m122869s0(list);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m122863j0(Throwable th) {
        if (isShowing()) {
            m122869s0(null);
        }
    }

    @Override // p149l.moh.InterfaceC18519a
    /* JADX INFO: renamed from: l */
    public void mo122864l(MessageLocation messageLocation) {
        this.f98960w = messageLocation;
        m122868r0();
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m122865n0(String str) {
        m122818P(str);
        dismiss();
    }

    @Override // p149l.aa80.InterfaceC15555a
    /* JADX INFO: renamed from: o */
    public void mo95536o(k90 k90Var) {
        this.f98933B.m155697J(k90Var);
        this.f98947j.scrollToPosition(0);
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m122866o0(View view) {
        final String strTrim = NullChecker.m81303a(this.f98945h.getText()) ? this.f98945h.getText().toString().trim() : null;
        if (!TextUtils.isEmpty(strTrim)) {
            m122846N(strTrim, DetectCategoryType.get("moment"), "moment", null, new d30() { // from class: l.drh
                @Override // p149l.d30
                public final void call() {
                    this.f87612a.m122865n0(strTrim);
                }
            });
        } else if (TextUtils.isEmpty(this.f98936E)) {
            lsi0.m151595y("请输入您此刻的想法");
        } else {
            m122818P(this.f98936E);
            dismiss();
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m122867p0() {
        FrameLayout frameLayout = this.f98938a;
        if (frameLayout != null) {
            m122819W(frameLayout);
        }
    }

    /* JADX INFO: renamed from: r0 */
    public void m122868r0() {
        MessageLocation messageLocation;
        String str;
        Emotion emotion = this.f98961x;
        if (emotion == null || (messageLocation = this.f98960w) == null) {
            return;
        }
        try {
            String str2 = emotion.defaultDoc;
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            String str4 = messageLocation.name;
            if (str4 != null) {
                str3 = str4;
            }
            str = String.format(str2, str3);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f98936E = str;
        this.f98945h.setHint(str);
    }

    /* JADX INFO: renamed from: s0 */
    public final void m122869s0(List<MessageLocation> list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(noh.m160413b());
        if (NullChecker.m81303a(this.f98960w)) {
            arrayList.add(new noh(this.f98960w, 2));
        }
        if (!vwb.m200296J(list)) {
            for (MessageLocation messageLocation : list) {
                if (this.f98960w == null) {
                    mo122864l(messageLocation);
                }
                arrayList.add(new noh(messageLocation, 3));
            }
        }
        arrayList.add(noh.m160412a());
        this.f98933B.m155700N(arrayList, this.f98960w);
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        FrameLayout frameLayout = (FrameLayout) findViewById(p4c0.f147063E);
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        layoutParams.height = -1;
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setBackgroundColor(0);
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
        this.f98950m = bottomSheetBehaviorFrom;
        bottomSheetBehaviorFrom.setState(3);
        this.f98950m.setBottomSheetCallback(this.f98937F);
        aa80.m95532b().m95533a(this);
        if (NullChecker.m81303a(this.f98955r)) {
            this.f98955r.mo127806b();
        }
        m122822c0();
        if (NullChecker.m81303a(this.f98958u)) {
            this.f98958u.call("");
        }
        if (NullChecker.m81303a(this.f98953p)) {
            i0e.m133797f(this.f98953p);
        }
    }

    /* JADX INFO: renamed from: l.frh$a */
    public class C16914a extends BottomSheetBehavior.BottomSheetCallback {
        public C16914a() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1) {
                frh.this.f98950m.setState(3);
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }
    }
}
