package p007l;

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
import com.p000p1.mobile.putong.data.BubbleInfo;
import com.p000p1.mobile.putong.data.CommonData;
import com.p000p1.mobile.putong.data.Detect;
import com.p000p1.mobile.putong.data.DetectCategoryType;
import com.p000p1.mobile.putong.data.DetectRequest;
import com.p000p1.mobile.putong.data.DetectText;
import com.p000p1.mobile.putong.data.Emotion;
import com.p000p1.mobile.putong.data.Envelope;
import com.p000p1.mobile.putong.data.MessageLocation;
import com.p000p1.mobile.putong.data.TextTheme;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.PoiGuidePopWindow;
import com.p000p1.mobile.putong.feed.data.StateEmotion;
import com.p006ss.bytertc.audio.device.webrtc.WebRtcAudioTrack;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import l.c4g0;
import l.cwf0;
import l.d30;
import l.e30;
import l.i0e;
import l.j760;
import l.lsi0;
import l.mkd0;
import l.p4c0;
import l.t100;
import l.vwb;
import l.xdl0;
import l.zvf0;
import v.VEditText;
import v.VRecyclerView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class frh extends BottomSheetDialog implements aa80.InterfaceC2319a, moh.InterfaceC2431a, qoh.InterfaceC2472b {

    /* JADX INFO: renamed from: A */
    public int f8194A;

    /* JADX INFO: renamed from: B */
    public moh f8195B;

    /* JADX INFO: renamed from: C */
    public c4g0 f8196C;

    /* JADX INFO: renamed from: D */
    public qoh f8197D;

    /* JADX INFO: renamed from: E */
    public String f8198E;

    /* JADX INFO: renamed from: F */
    public BottomSheetBehavior.BottomSheetCallback f8199F;

    /* JADX INFO: renamed from: a */
    public FrameLayout f8200a;

    /* JADX INFO: renamed from: b */
    public View f8201b;

    /* JADX INFO: renamed from: c */
    public RelativeLayout f8202c;

    /* JADX INFO: renamed from: d */
    public ImageView f8203d;

    /* JADX INFO: renamed from: e */
    public VText f8204e;

    /* JADX INFO: renamed from: f */
    public VText f8205f;

    /* JADX INFO: renamed from: g */
    public VRecyclerView f8206g;

    /* JADX INFO: renamed from: h */
    public VEditText f8207h;

    /* JADX INFO: renamed from: i */
    public VText f8208i;

    /* JADX INFO: renamed from: j */
    public VRecyclerView f8209j;

    /* JADX INFO: renamed from: k */
    public TextView f8210k;

    /* JADX INFO: renamed from: l */
    public boolean f8211l;

    /* JADX INFO: renamed from: m */
    public BottomSheetBehavior f8212m;

    /* JADX INFO: renamed from: n */
    public Act f8213n;

    /* JADX INFO: renamed from: o */
    public int f8214o;

    /* JADX INFO: renamed from: p */
    public cwf0 f8215p;

    /* JADX INFO: renamed from: q */
    public String f8216q;

    /* JADX INFO: renamed from: r */
    public gsl f8217r;

    /* JADX INFO: renamed from: s */
    public PoiGuidePopWindow f8218s;

    /* JADX INFO: renamed from: t */
    public String f8219t;

    /* JADX INFO: renamed from: u */
    public e30<String> f8220u;

    /* JADX INFO: renamed from: v */
    public e30<String> f8221v;

    /* JADX INFO: renamed from: w */
    public MessageLocation f8222w;

    /* JADX INFO: renamed from: x */
    public Emotion f8223x;

    /* JADX INFO: renamed from: y */
    public boolean f8224y;

    /* JADX INFO: renamed from: z */
    public int f8225z;

    /* JADX INFO: renamed from: l.frh$b */
    public static class C2386b {

        /* JADX INFO: renamed from: a */
        public Act f8227a;

        /* JADX INFO: renamed from: b */
        public int f8228b;

        /* JADX INFO: renamed from: c */
        public cwf0 f8229c;

        /* JADX INFO: renamed from: d */
        public String f8230d;

        /* JADX INFO: renamed from: e */
        public gsl f8231e;

        /* JADX INFO: renamed from: f */
        public PoiGuidePopWindow f8232f;

        /* JADX INFO: renamed from: g */
        public e30<String> f8233g;

        /* JADX INFO: renamed from: h */
        public e30<String> f8234h;

        /* JADX INFO: renamed from: i */
        public String f8235i;

        public C2386b(Act act, int i) {
            this.f8227a = act;
            this.f8228b = i;
        }

        /* JADX INFO: renamed from: a */
        public frh m10314a() {
            frh frhVar = new frh(this.f8227a);
            frhVar.m10289M(this.f8228b);
            frhVar.m10287K(this.f8230d, this.f8229c);
            frhVar.m10288L(this.f8232f);
            frhVar.m10286J(this.f8231e);
            frhVar.m10285I(this.f8235i);
            frhVar.m10284H(this.f8233g);
            frhVar.m10283G(this.f8234h);
            return frhVar;
        }

        /* JADX INFO: renamed from: b */
        public C2386b m10315b(gsl gslVar) {
            this.f8231e = gslVar;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C2386b m10316c(String str, cwf0 cwf0Var) {
            this.f8230d = str;
            this.f8229c = cwf0Var;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C2386b m10317d(PoiGuidePopWindow poiGuidePopWindow) {
            this.f8232f = poiGuidePopWindow;
            return this;
        }
    }

    public frh(@NonNull Context context) {
        super(context);
        this.f8199F = new C2385a();
        m10264Y(context);
    }

    /* JADX INFO: renamed from: O */
    private void m10261O(String str) {
        final HashMap map = new HashMap();
        PoiGuidePopWindow poiGuidePopWindow = this.f8218s;
        map.put("showtime", Integer.valueOf(poiGuidePopWindow.firstTimeShow ? 0 : poiGuidePopWindow.swipeLimit));
        map.put("user_segment", this.f8218s.userPostType);
        final Moment momentNew_ = Moment.new_();
        momentNew_.value = str;
        momentNew_.allowForward = null;
        momentNew_.additionalData = null;
        momentNew_.location = this.f8222w;
        momentNew_.from = m10293S();
        FeedModule.f316d.m16585Y6(momentNew_, "poi").subscribe(mkd0.H(new e30() { // from class: l.uqh
            public final void call(Object obj) {
                this.f13915a.m10304g0(momentNew_, map, (Envelope) obj);
            }
        }, new e30() { // from class: l.vqh
            public final void call(Object obj) {
                this.f14279a.m10305h0(momentNew_, map, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: P */
    private void m10262P(String str) {
        if (TextUtils.isEmpty(str)) {
            lsi0.y("未获取内容，发布失败");
            return;
        }
        this.f8211l = true;
        if (NullChecker.a(this.f8223x)) {
            zvf0.u("e_set_my_state_post", m10294T(), new j760[]{vwb.Y("source_page", m10293S())});
            m10275t0(this.f8223x, str);
        }
        m10261O(str);
    }

    /* JADX INFO: renamed from: W */
    private void m10263W(final View view) {
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        int iHeight = rect.height();
        int iMax = Math.max(this.f8225z, iHeight);
        this.f8225z = iMax;
        if (this.f8194A == iHeight) {
            return;
        }
        this.f8194A = iHeight;
        if (iHeight < iMax + WebRtcAudioTrack.AudioTrackErrorCode.AUDIO_TRACK_INIT_MINBUFFER_ERROR) {
            view.getTranslationY();
            view.post(new Runnable() { // from class: l.crh
                @Override // java.lang.Runnable
                public final void run() {
                    view.setTranslationY(-t100.K);
                }
            });
        } else {
            view.getTranslationY();
            view.setTranslationY(0.0f);
        }
    }

    /* JADX INFO: renamed from: Y */
    private void m10264Y(Context context) {
        Act act = (Act) context;
        this.f8213n = act;
        setContentView(m10282F(LayoutInflater.from(act), null));
    }

    /* JADX INFO: renamed from: Z */
    private void m10265Z() {
        this.f8207h.setHint("请输入您此刻的想法");
        String strM14552a = tih.m14552a();
        boolean zIsEmpty = TextUtils.isEmpty(strM14552a);
        TextView textView = this.f8210k;
        if (zIsEmpty) {
            textView.setText("完成");
        } else {
            textView.setText(strM14552a);
        }
        this.f8204e.setText(m10296V());
        this.f8204e.setTypeface(Typeface.DEFAULT_BOLD);
        this.f8205f.setText(m10292R());
        xdl0.E0(this.f8203d, new View.OnClickListener() { // from class: l.sqh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13038a.m10267k0(view);
            }
        });
        xdl0.E0(this.f8201b, new View.OnClickListener() { // from class: l.wqh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14662a.m10268l0(view);
            }
        });
        xdl0.E0(this.f8202c, new View.OnClickListener() { // from class: l.xqh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15073a.m10269m0(view);
            }
        });
        xdl0.E0(this.f8210k, new View.OnClickListener() { // from class: l.yqh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15494a.m10310o0(view);
            }
        });
    }

    /* JADX INFO: renamed from: c0 */
    private void m10266c0() {
        m10265Z();
        m10299b0();
        m10298a0();
        m10271q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public /* synthetic */ void m10267k0(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public /* synthetic */ void m10268l0(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m10269m0(View view) {
        m10297X();
    }

    /* JADX INFO: renamed from: q0 */
    private void m10271q0() {
        this.f8200a.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: l.brh
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f6419a.m10311p0();
            }
        });
    }

    /* JADX INFO: renamed from: t0 */
    private void m10275t0(Emotion emotion, String str) {
        BubbleInfo bubbleInfo = new BubbleInfo();
        if (!TextUtils.isEmpty(str) && str.length() > 60) {
            str = str.substring(0, 60);
        }
        bubbleInfo.value = str;
        bubbleInfo.location = this.f8222w;
        bubbleInfo.emotion = emotion;
        TextTheme textTheme = new TextTheme();
        textTheme.backgroundColor = emotion.backgroundColor;
        textTheme.iconColor = emotion.iconColor;
        bubbleInfo.textTheme = textTheme;
        FeedModule.f317e.m10712V0(bubbleInfo, m10294T());
    }

    /* JADX INFO: renamed from: F */
    public View m10282F(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return grh.m10494b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: G */
    public void m10283G(e30<String> e30Var) {
        this.f8221v = e30Var;
    }

    /* JADX INFO: renamed from: H */
    public void m10284H(e30<String> e30Var) {
        this.f8220u = e30Var;
    }

    /* JADX INFO: renamed from: I */
    public void m10285I(String str) {
        this.f8219t = str;
    }

    /* JADX INFO: renamed from: J */
    public void m10286J(gsl gslVar) {
        this.f8217r = gslVar;
    }

    /* JADX INFO: renamed from: K */
    public void m10287K(String str, cwf0 cwf0Var) {
        this.f8216q = str;
        this.f8215p = cwf0Var;
    }

    /* JADX INFO: renamed from: L */
    public void m10288L(PoiGuidePopWindow poiGuidePopWindow) {
        this.f8218s = poiGuidePopWindow;
        if (NullChecker.a(poiGuidePopWindow)) {
            this.f8222w = poiGuidePopWindow.location;
        }
    }

    /* JADX INFO: renamed from: M */
    public void m10289M(int i) {
        this.f8214o = i;
    }

    /* JADX INFO: renamed from: N */
    public void m10290N(String str, DetectCategoryType detectCategoryType, String str2, final String str3, final d30 d30Var) {
        this.f8224y = true;
        DetectRequest detectRequest = new DetectRequest();
        detectRequest.category = detectCategoryType;
        DetectText detectText = new DetectText();
        detectText.key = str2;
        detectText.value = str;
        ArrayList arrayList = new ArrayList();
        detectRequest.text = arrayList;
        arrayList.add(detectText);
        FeedModule.f316d.m16522P6(detectRequest).subscribe(mkd0.H(new e30() { // from class: l.erh
            public final void call(Object obj) {
                this.f7469a.m10303f0(d30Var, str3, (Envelope) obj);
            }
        }, new e30() { // from class: l.tqh
            public final void call(Object obj) {
                this.f13382a.m10302e0(d30Var, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Q */
    public final void m10291Q() {
        this.f8196C = p980.m12950g(this.f8222w, 3).subscribe(mkd0.H(new e30() { // from class: l.zqh
            public final void call(Object obj) {
                this.f15840a.m10306i0((List) obj);
            }
        }, new e30() { // from class: l.arh
            public final void call(Object obj) {
                this.f5809a.m10307j0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: R */
    public final String m10292R() {
        PoiGuidePopWindow poiGuidePopWindow = this.f8218s;
        if (poiGuidePopWindow != null) {
            return TextUtils.isEmpty(poiGuidePopWindow.desc) ? "点亮足迹，查看来过这里的人" : this.f8218s.desc;
        }
        String str = (String) sti.f13089o.get();
        return !TextUtils.isEmpty(str) ? str : "点亮足迹，查看来过这里的人";
    }

    /* JADX INFO: renamed from: S */
    public final String m10293S() {
        return m10300d0() ? "poi_lighten_guide" : "poi_lighten_click";
    }

    @NonNull
    /* JADX INFO: renamed from: T */
    public String m10294T() {
        String str = this.f8216q;
        return str == null ? "" : str;
    }

    /* JADX INFO: renamed from: U */
    public final void m10295U() {
        ArrayList arrayList = new ArrayList();
        String str = (String) sti.f13081g.get();
        PoiGuidePopWindow poiGuidePopWindow = this.f8218s;
        String str2 = poiGuidePopWindow == null ? "" : poiGuidePopWindow.emotionId;
        Emotion emotion = null;
        if (!TextUtils.isEmpty(str)) {
            try {
                Iterator it = JSON.parseArray(str, StateEmotion.class).iterator();
                while (it.hasNext()) {
                    for (Emotion emotion2 : ((StateEmotion) it.next()).emotions) {
                        if (TextUtils.equals(str2, emotion2.f209id)) {
                            emotion = emotion2;
                        } else {
                            arrayList.add(emotion2);
                        }
                    }
                }
            } catch (Exception e) {
                CrashHelper.c(e);
            }
        }
        if (NullChecker.a(emotion)) {
            arrayList.add(0, emotion);
        }
        if (vwb.J(arrayList)) {
            return;
        }
        if (this.f8223x == null) {
            mo10301e((Emotion) arrayList.get(0));
        }
        this.f8197D.m13688K(arrayList, this.f8223x);
    }

    /* JADX INFO: renamed from: V */
    public final String m10296V() {
        PoiGuidePopWindow poiGuidePopWindow = this.f8218s;
        if (poiGuidePopWindow != null) {
            return TextUtils.isEmpty(poiGuidePopWindow.title) ? "告诉附近的人你来了" : this.f8218s.title;
        }
        String str = (String) sti.f13088n.get();
        return !TextUtils.isEmpty(str) ? str : "告诉附近的人你来了";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X */
    public void m10297X() {
        InputMethodManager inputMethodManager = (InputMethodManager) this.f8213n.getSystemService("input_method");
        if (!inputMethodManager.isActive() || getCurrentFocus() == null || getCurrentFocus().getWindowToken() == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a0 */
    public final void m10298a0() {
        if (NullChecker.a(this.f8222w) && vqg.m15529n(this.f8222w.coordinates) > 2000) {
            this.f8222w = null;
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(0);
        this.f8209j.setLayoutManager(linearLayoutManager);
        moh mohVar = new moh(this.f8213n, m10294T(), this.f8219t);
        this.f8195B = mohVar;
        mohVar.m12007O(this);
        this.f8209j.setAdapter(this.f8195B);
        m10291Q();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b0 */
    public final void m10299b0() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(0);
        this.f8206g.setLayoutManager(linearLayoutManager);
        qoh qohVar = new qoh(this.f8213n, m10294T(), this.f8219t);
        this.f8197D = qohVar;
        qohVar.m13689L(this);
        this.f8206g.setAdapter(this.f8197D);
        m10295U();
    }

    /* JADX INFO: renamed from: d0 */
    public final boolean m10300d0() {
        return this.f8214o == 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void dismiss() {
        m10297X();
        super/*android.app.Dialog*/.dismiss();
        if (NullChecker.a(this.f8221v)) {
            this.f8221v.call("");
        }
        aa80.m8468b().m8471d(this);
        if (NullChecker.a(this.f8217r)) {
            this.f8217r.mo10497c();
        }
        if (NullChecker.a(this.f8215p)) {
            i0e.e(this.f8215p);
        }
        if (!NullChecker.a(this.f8196C) || this.f8196C.isUnsubscribed()) {
            return;
        }
        this.f8196C.unsubscribe();
    }

    @Override // p007l.qoh.InterfaceC2472b
    /* JADX INFO: renamed from: e */
    public void mo10301e(Emotion emotion) {
        this.f8223x = emotion;
        m10312r0();
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m10302e0(d30 d30Var, Throwable th) {
        this.f8224y = false;
        d30Var.call();
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m10303f0(d30 d30Var, String str, Envelope envelope) {
        this.f8224y = false;
        Detect detect = ((CommonData) envelope.getModuleData(CommonData.class)).detect;
        if (vwb.J(detect.text) && vwb.J(detect.media)) {
            d30Var.call();
            return;
        }
        if (vqg.m15525l(detect, this.f8216q)) {
            lsi0.w(R$string.f602s);
        } else if (TextUtils.isEmpty(str)) {
            lsi0.w(R$string.f457W2);
        } else {
            lsi0.y(str);
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m10304g0(Moment moment, HashMap map, Envelope envelope) {
        lsi0.y("发布成功");
        zi60.m17436w().m17457n(moment, m10294T(), 201, false, map);
        if (m10300d0()) {
            w980.m15748h().m15761r(this.f8222w);
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m10305h0(Moment moment, HashMap map, Throwable th) {
        lsi0.y("发布失败");
        zi60.m17436w().m17458o(moment, m10294T(), th, false, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m10306i0(List list) {
        if (isShowing()) {
            m10313s0(list);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m10307j0(Throwable th) {
        if (isShowing()) {
            m10313s0(null);
        }
    }

    @Override // p007l.moh.InterfaceC2431a
    /* JADX INFO: renamed from: l */
    public void mo10308l(MessageLocation messageLocation) {
        this.f8222w = messageLocation;
        m10312r0();
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m10309n0(String str) {
        m10262P(str);
        dismiss();
    }

    @Override // p007l.aa80.InterfaceC2319a
    /* JADX INFO: renamed from: o */
    public void mo8472o(k90 k90Var) {
        this.f8195B.m12003J(k90Var);
        this.f8209j.scrollToPosition(0);
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m10310o0(View view) {
        final String strTrim = NullChecker.a(this.f8207h.getText()) ? this.f8207h.getText().toString().trim() : null;
        if (!TextUtils.isEmpty(strTrim)) {
            m10290N(strTrim, DetectCategoryType.get("moment"), "moment", null, new d30() { // from class: l.drh
                public final void call() {
                    this.f7040a.m10309n0(strTrim);
                }
            });
        } else if (TextUtils.isEmpty(this.f8198E)) {
            lsi0.y("请输入您此刻的想法");
        } else {
            m10262P(this.f8198E);
            dismiss();
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m10311p0() {
        FrameLayout frameLayout = this.f8200a;
        if (frameLayout != null) {
            m10263W(frameLayout);
        }
    }

    /* JADX INFO: renamed from: r0 */
    public void m10312r0() {
        MessageLocation messageLocation;
        String str;
        Emotion emotion = this.f8223x;
        if (emotion == null || (messageLocation = this.f8222w) == null) {
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
            CrashHelper.c(e);
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f8198E = str;
        this.f8207h.setHint(str);
    }

    /* JADX INFO: renamed from: s0 */
    public final void m10313s0(List<MessageLocation> list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(noh.m12301b());
        if (NullChecker.a(this.f8222w)) {
            arrayList.add(new noh(this.f8222w, 2));
        }
        if (!vwb.J(list)) {
            for (MessageLocation messageLocation : list) {
                if (this.f8222w == null) {
                    mo10308l(messageLocation);
                }
                arrayList.add(new noh(messageLocation, 3));
            }
        }
        arrayList.add(noh.m12300a());
        this.f8195B.m12006N(arrayList, this.f8222w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void show() {
        super/*android.app.Dialog*/.show();
        FrameLayout frameLayout = (FrameLayout) findViewById(p4c0.E);
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        layoutParams.height = -1;
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setBackgroundColor(0);
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
        this.f8212m = bottomSheetBehaviorFrom;
        bottomSheetBehaviorFrom.setState(3);
        this.f8212m.setBottomSheetCallback(this.f8199F);
        aa80.m8468b().m8469a(this);
        if (NullChecker.a(this.f8217r)) {
            this.f8217r.mo10496b();
        }
        m10266c0();
        if (NullChecker.a(this.f8220u)) {
            this.f8220u.call("");
        }
        if (NullChecker.a(this.f8215p)) {
            i0e.f(this.f8215p);
        }
    }

    /* JADX INFO: renamed from: l.frh$a */
    public class C2385a extends BottomSheetBehavior.BottomSheetCallback {
        public C2385a() {
        }

        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1) {
                frh.this.f8212m.setState(3);
            }
        }

        public void onSlide(@NonNull View view, float f) {
        }
    }
}
