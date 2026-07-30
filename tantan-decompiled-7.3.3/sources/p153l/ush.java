package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.BubbleInfo;
import com.p051p1.mobile.putong.data.CommonData;
import com.p051p1.mobile.putong.data.Detect;
import com.p051p1.mobile.putong.data.DetectCategoryType;
import com.p051p1.mobile.putong.data.DetectRequest;
import com.p051p1.mobile.putong.data.DetectText;
import com.p051p1.mobile.putong.data.Emotion;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.MessageLocation;
import com.p051p1.mobile.putong.data.TextTheme;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.PoiGuidePopWindow;
import com.p051p1.mobile.putong.feed.data.StateEmotion;
import com.p074ss.bytertc.audio.device.webrtc.WebRtcAudioTrack;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p151v.VEditText;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class ush extends BottomSheetDialog implements gi80.InterfaceC17215a, bqh.InterfaceC16082a, fqh.InterfaceC17031b {

    /* JADX INFO: renamed from: A */
    public int f180777A;

    /* JADX INFO: renamed from: B */
    public bqh f180778B;

    /* JADX INFO: renamed from: C */
    public kcg0 f180779C;

    /* JADX INFO: renamed from: D */
    public fqh f180780D;

    /* JADX INFO: renamed from: E */
    public String f180781E;

    /* JADX INFO: renamed from: F */
    public BottomSheetBehavior.BottomSheetCallback f180782F;

    /* JADX INFO: renamed from: a */
    public FrameLayout f180783a;

    /* JADX INFO: renamed from: b */
    public View f180784b;

    /* JADX INFO: renamed from: c */
    public RelativeLayout f180785c;

    /* JADX INFO: renamed from: d */
    public ImageView f180786d;

    /* JADX INFO: renamed from: e */
    public VText f180787e;

    /* JADX INFO: renamed from: f */
    public VText f180788f;

    /* JADX INFO: renamed from: g */
    public VRecyclerView f180789g;

    /* JADX INFO: renamed from: h */
    public VEditText f180790h;

    /* JADX INFO: renamed from: i */
    public VText f180791i;

    /* JADX INFO: renamed from: j */
    public VRecyclerView f180792j;

    /* JADX INFO: renamed from: k */
    public TextView f180793k;

    /* JADX INFO: renamed from: l */
    public boolean f180794l;

    /* JADX INFO: renamed from: m */
    public BottomSheetBehavior f180795m;

    /* JADX INFO: renamed from: n */
    public Act f180796n;

    /* JADX INFO: renamed from: o */
    public int f180797o;

    /* JADX INFO: renamed from: p */
    public l4g0 f180798p;

    /* JADX INFO: renamed from: q */
    public String f180799q;

    /* JADX INFO: renamed from: r */
    public uul f180800r;

    /* JADX INFO: renamed from: s */
    public PoiGuidePopWindow f180801s;

    /* JADX INFO: renamed from: t */
    public String f180802t;

    /* JADX INFO: renamed from: u */
    public y20<String> f180803u;

    /* JADX INFO: renamed from: v */
    public y20<String> f180804v;

    /* JADX INFO: renamed from: w */
    public MessageLocation f180805w;

    /* JADX INFO: renamed from: x */
    public Emotion f180806x;

    /* JADX INFO: renamed from: y */
    public boolean f180807y;

    /* JADX INFO: renamed from: z */
    public int f180808z;

    /* JADX INFO: renamed from: l.ush$b */
    public static class C20657b {

        /* JADX INFO: renamed from: a */
        public Act f180810a;

        /* JADX INFO: renamed from: b */
        public int f180811b;

        /* JADX INFO: renamed from: c */
        public l4g0 f180812c;

        /* JADX INFO: renamed from: d */
        public String f180813d;

        /* JADX INFO: renamed from: e */
        public uul f180814e;

        /* JADX INFO: renamed from: f */
        public PoiGuidePopWindow f180815f;

        /* JADX INFO: renamed from: g */
        public y20<String> f180816g;

        /* JADX INFO: renamed from: h */
        public y20<String> f180817h;

        /* JADX INFO: renamed from: i */
        public String f180818i;

        public C20657b(Act act, int i) {
            this.f180810a = act;
            this.f180811b = i;
        }

        /* JADX INFO: renamed from: a */
        public ush m197936a() {
            ush ushVar = new ush(this.f180810a);
            ushVar.m197913M(this.f180811b);
            ushVar.m197911K(this.f180813d, this.f180812c);
            ushVar.m197912L(this.f180815f);
            ushVar.m197910J(this.f180814e);
            ushVar.m197909I(this.f180818i);
            ushVar.m197908H(this.f180816g);
            ushVar.m197907G(this.f180817h);
            return ushVar;
        }

        /* JADX INFO: renamed from: b */
        public C20657b m197937b(uul uulVar) {
            this.f180814e = uulVar;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C20657b m197938c(String str, l4g0 l4g0Var) {
            this.f180813d = str;
            this.f180812c = l4g0Var;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C20657b m197939d(PoiGuidePopWindow poiGuidePopWindow) {
            this.f180815f = poiGuidePopWindow;
            return this;
        }
    }

    public ush(@NonNull Context context) {
        super(context);
        this.f180782F = new C20656a();
        m197888Y(context);
    }

    /* JADX INFO: renamed from: O */
    private void m197885O(String str) {
        final HashMap map = new HashMap();
        PoiGuidePopWindow poiGuidePopWindow = this.f180801s;
        map.put("showtime", Integer.valueOf(poiGuidePopWindow.firstTimeShow ? 0 : poiGuidePopWindow.swipeLimit));
        map.put("user_segment", this.f180801s.userPostType);
        final Moment momentNew_ = Moment.new_();
        momentNew_.value = str;
        momentNew_.allowForward = null;
        momentNew_.additionalData = null;
        momentNew_.location = this.f180805w;
        momentNew_.from = m197917S();
        FeedModule.f39703d.m145645Y6(momentNew_, "poi").subscribe(psd0.m173597H(new y20() { // from class: l.jsh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f122464a.m197927g0(momentNew_, map, (Envelope) obj);
            }
        }, new y20() { // from class: l.ksh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f128571a.m197928h0(momentNew_, map, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: P */
    private void m197886P(String str) {
        if (TextUtils.isEmpty(str)) {
            o1j0.m165651y("未获取内容，发布失败");
            return;
        }
        this.f180794l = true;
        if (NullChecker.m82486a(this.f180806x)) {
            i4g0.m138523u("e_set_my_state_post", m197918T(), jyb.m147494Y("source_page", m197917S()));
            m197899t0(this.f180806x, str);
        }
        m197885O(str);
    }

    /* JADX INFO: renamed from: W */
    private void m197887W(final View view) {
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        int iHeight = rect.height();
        int iMax = Math.max(this.f180808z, iHeight);
        this.f180808z = iMax;
        if (this.f180777A == iHeight) {
            return;
        }
        this.f180777A = iHeight;
        if (iHeight < iMax + WebRtcAudioTrack.AudioTrackErrorCode.AUDIO_TRACK_INIT_MINBUFFER_ERROR) {
            view.getTranslationY();
            view.post(new Runnable() { // from class: l.rsh
                @Override // java.lang.Runnable
                public final void run() {
                    view.setTranslationY(-qa00.f156298K);
                }
            });
        } else {
            view.getTranslationY();
            view.setTranslationY(0.0f);
        }
    }

    /* JADX INFO: renamed from: Y */
    private void m197888Y(Context context) {
        Act act = (Act) context;
        this.f180796n = act;
        setContentView(m197906F(LayoutInflater.from(act), null));
    }

    /* JADX INFO: renamed from: Z */
    private void m197889Z() {
        this.f180790h.setHint("请输入您此刻的想法");
        String strM140293a = ikh.m140293a();
        boolean zIsEmpty = TextUtils.isEmpty(strM140293a);
        TextView textView = this.f180793k;
        if (zIsEmpty) {
            textView.setText("完成");
        } else {
            textView.setText(strM140293a);
        }
        this.f180787e.setText(m197920V());
        this.f180787e.setTypeface(Typeface.DEFAULT_BOLD);
        this.f180788f.setText(m197916R());
        bnl0.m105509E0(this.f180786d, new View.OnClickListener() { // from class: l.hsh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f111443a.m197891k0(view);
            }
        });
        bnl0.m105509E0(this.f180784b, new View.OnClickListener() { // from class: l.lsh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f133422a.m197892l0(view);
            }
        });
        bnl0.m105509E0(this.f180785c, new View.OnClickListener() { // from class: l.msh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f138479a.m197893m0(view);
            }
        });
        bnl0.m105509E0(this.f180793k, new View.OnClickListener() { // from class: l.nsh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f143503a.m197932o0(view);
            }
        });
    }

    /* JADX INFO: renamed from: c0 */
    private void m197890c0() {
        m197889Z();
        m197923b0();
        m197922a0();
        m197895q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public /* synthetic */ void m197891k0(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public /* synthetic */ void m197892l0(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m197893m0(View view) {
        m197921X();
    }

    /* JADX INFO: renamed from: q0 */
    private void m197895q0() {
        this.f180783a.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: l.qsh
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f159324a.m197933p0();
            }
        });
    }

    /* JADX INFO: renamed from: t0 */
    private void m197899t0(Emotion emotion, String str) {
        BubbleInfo bubbleInfo = new BubbleInfo();
        if (!TextUtils.isEmpty(str) && str.length() > 60) {
            str = str.substring(0, 60);
        }
        bubbleInfo.value = str;
        bubbleInfo.location = this.f180805w;
        bubbleInfo.emotion = emotion;
        TextTheme textTheme = new TextTheme();
        textTheme.backgroundColor = emotion.backgroundColor;
        textTheme.iconColor = emotion.iconColor;
        bubbleInfo.textTheme = textTheme;
        FeedModule.f39704e.m159782V0(bubbleInfo, m197918T());
    }

    /* JADX INFO: renamed from: F */
    public View m197906F(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return vsh.m202614b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: G */
    public void m197907G(y20<String> y20Var) {
        this.f180804v = y20Var;
    }

    /* JADX INFO: renamed from: H */
    public void m197908H(y20<String> y20Var) {
        this.f180803u = y20Var;
    }

    /* JADX INFO: renamed from: I */
    public void m197909I(String str) {
        this.f180802t = str;
    }

    /* JADX INFO: renamed from: J */
    public void m197910J(uul uulVar) {
        this.f180800r = uulVar;
    }

    /* JADX INFO: renamed from: K */
    public void m197911K(String str, l4g0 l4g0Var) {
        this.f180799q = str;
        this.f180798p = l4g0Var;
    }

    /* JADX INFO: renamed from: L */
    public void m197912L(PoiGuidePopWindow poiGuidePopWindow) {
        this.f180801s = poiGuidePopWindow;
        if (NullChecker.m82486a(poiGuidePopWindow)) {
            this.f180805w = poiGuidePopWindow.location;
        }
    }

    /* JADX INFO: renamed from: M */
    public void m197913M(int i) {
        this.f180797o = i;
    }

    /* JADX INFO: renamed from: N */
    public void m197914N(String str, DetectCategoryType detectCategoryType, String str2, final String str3, final x20 x20Var) {
        this.f180807y = true;
        DetectRequest detectRequest = new DetectRequest();
        detectRequest.category = detectCategoryType;
        DetectText detectText = new DetectText();
        detectText.key = str2;
        detectText.value = str;
        ArrayList arrayList = new ArrayList();
        detectRequest.text = arrayList;
        arrayList.add(detectText);
        FeedModule.f39703d.m145582P6(detectRequest).subscribe(psd0.m173597H(new y20() { // from class: l.tsh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f175999a.m197926f0(x20Var, str3, (Envelope) obj);
            }
        }, new y20() { // from class: l.ish
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f116660a.m197925e0(x20Var, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Q */
    public final void m197915Q() {
        this.f180779C = vh80.m201263g(this.f180805w, 3).subscribe(psd0.m173597H(new y20() { // from class: l.osh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f148833a.m197929i0((List) obj);
            }
        }, new y20() { // from class: l.psh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f153904a.m197930j0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: R */
    public final String m197916R() {
        PoiGuidePopWindow poiGuidePopWindow = this.f180801s;
        if (poiGuidePopWindow != null) {
            return TextUtils.isEmpty(poiGuidePopWindow.desc) ? "点亮足迹，查看来过这里的人" : this.f180801s.desc;
        }
        String str = owi.f149496o.get();
        return !TextUtils.isEmpty(str) ? str : "点亮足迹，查看来过这里的人";
    }

    /* JADX INFO: renamed from: S */
    public final String m197917S() {
        return m197924d0() ? "poi_lighten_guide" : "poi_lighten_click";
    }

    @NonNull
    /* JADX INFO: renamed from: T */
    public String m197918T() {
        String str = this.f180799q;
        return str == null ? "" : str;
    }

    /* JADX INFO: renamed from: U */
    public final void m197919U() {
        ArrayList arrayList = new ArrayList();
        String str = owi.f149488g.get();
        PoiGuidePopWindow poiGuidePopWindow = this.f180801s;
        String str2 = poiGuidePopWindow == null ? "" : poiGuidePopWindow.emotionId;
        Emotion emotion = null;
        if (!TextUtils.isEmpty(str)) {
            try {
                Iterator it = JSON.parseArray(str, StateEmotion.class).iterator();
                while (it.hasNext()) {
                    for (Emotion emotion2 : ((StateEmotion) it.next()).emotions) {
                        if (TextUtils.equals(str2, emotion2.f39596id)) {
                            emotion = emotion2;
                        } else {
                            arrayList.add(emotion2);
                        }
                    }
                }
            } catch (Exception e) {
                CrashHelper.m82479c(e);
            }
        }
        if (NullChecker.m82486a(emotion)) {
            arrayList.add(0, emotion);
        }
        if (jyb.m147479J(arrayList)) {
            return;
        }
        if (this.f180806x == null) {
            mo126760e((Emotion) arrayList.get(0));
        }
        this.f180780D.m126756K(arrayList, this.f180806x);
    }

    /* JADX INFO: renamed from: V */
    public final String m197920V() {
        PoiGuidePopWindow poiGuidePopWindow = this.f180801s;
        if (poiGuidePopWindow != null) {
            return TextUtils.isEmpty(poiGuidePopWindow.title) ? "告诉附近的人你来了" : this.f180801s.title;
        }
        String str = owi.f149495n.get();
        return !TextUtils.isEmpty(str) ? str : "告诉附近的人你来了";
    }

    /* JADX INFO: renamed from: X */
    public void m197921X() {
        InputMethodManager inputMethodManager = (InputMethodManager) this.f180796n.getSystemService("input_method");
        if (!inputMethodManager.isActive() || getCurrentFocus() == null || getCurrentFocus().getWindowToken() == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 2);
    }

    /* JADX INFO: renamed from: a0 */
    public final void m197922a0() {
        if (NullChecker.m82486a(this.f180805w) && ksg.m151218n(this.f180805w.coordinates) > 2000) {
            this.f180805w = null;
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(0);
        this.f180792j.setLayoutManager(linearLayoutManager);
        bqh bqhVar = new bqh(this.f180796n, m197918T(), this.f180802t);
        this.f180778B = bqhVar;
        bqhVar.m105930O(this);
        this.f180792j.setAdapter(this.f180778B);
        m197915Q();
    }

    /* JADX INFO: renamed from: b0 */
    public final void m197923b0() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(0);
        this.f180789g.setLayoutManager(linearLayoutManager);
        fqh fqhVar = new fqh(this.f180796n, m197918T(), this.f180802t);
        this.f180780D = fqhVar;
        fqhVar.m126757L(this);
        this.f180789g.setAdapter(this.f180780D);
        m197919U();
    }

    /* JADX INFO: renamed from: d0 */
    public final boolean m197924d0() {
        return this.f180797o == 1;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        m197921X();
        super.dismiss();
        if (NullChecker.m82486a(this.f180804v)) {
            this.f180804v.call("");
        }
        gi80.m130297b().m130300d(this);
        if (NullChecker.m82486a(this.f180800r)) {
            this.f180800r.mo156950c();
        }
        if (NullChecker.m82486a(this.f180798p)) {
            w1e.m204401e(this.f180798p);
        }
        if (!NullChecker.m82486a(this.f180779C) || this.f180779C.isUnsubscribed()) {
            return;
        }
        this.f180779C.unsubscribe();
    }

    @Override // p153l.fqh.InterfaceC17031b
    /* JADX INFO: renamed from: e */
    public void mo126760e(Emotion emotion) {
        this.f180806x = emotion;
        m197934r0();
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m197925e0(x20 x20Var, Throwable th) {
        this.f180807y = false;
        x20Var.call();
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m197926f0(x20 x20Var, String str, Envelope envelope) {
        this.f180807y = false;
        Detect detect = ((CommonData) envelope.getModuleData(CommonData.class)).detect;
        if (jyb.m147479J(detect.text) && jyb.m147479J(detect.media)) {
            x20Var.call();
            return;
        }
        if (ksg.m151214l(detect, this.f180799q)) {
            o1j0.m165649w(R$string.f39989s);
        } else if (TextUtils.isEmpty(str)) {
            o1j0.m165649w(R$string.f39844W2);
        } else {
            o1j0.m165651y(str);
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m197927g0(Moment moment, HashMap map, Envelope envelope) {
        o1j0.m165651y("发布成功");
        er60.m122104w().m122125n(moment, m197918T(), 201, false, map);
        if (m197924d0()) {
            ci80.m109858h().m109871r(this.f180805w);
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m197928h0(Moment moment, HashMap map, Throwable th) {
        o1j0.m165651y("发布失败");
        er60.m122104w().m122126o(moment, m197918T(), th, false, map);
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m197929i0(List list) {
        if (isShowing()) {
            m197935s0(list);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m197930j0(Throwable th) {
        if (isShowing()) {
            m197935s0(null);
        }
    }

    @Override // p153l.bqh.InterfaceC16082a
    /* JADX INFO: renamed from: l */
    public void mo105933l(MessageLocation messageLocation) {
        this.f180805w = messageLocation;
        m197934r0();
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m197931n0(String str) {
        m197886P(str);
        dismiss();
    }

    @Override // p153l.gi80.InterfaceC17215a
    /* JADX INFO: renamed from: o */
    public void mo126629o(g90 g90Var) {
        this.f180778B.m105926J(g90Var);
        this.f180792j.scrollToPosition(0);
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m197932o0(View view) {
        final String strTrim = NullChecker.m82486a(this.f180790h.getText()) ? this.f180790h.getText().toString().trim() : null;
        if (!TextUtils.isEmpty(strTrim)) {
            m197914N(strTrim, DetectCategoryType.get("moment"), "moment", null, new x20() { // from class: l.ssh
                @Override // p153l.x20
                public final void call() {
                    this.f170457a.m197931n0(strTrim);
                }
            });
        } else if (TextUtils.isEmpty(this.f180781E)) {
            o1j0.m165651y("请输入您此刻的想法");
        } else {
            m197886P(this.f180781E);
            dismiss();
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m197933p0() {
        FrameLayout frameLayout = this.f180783a;
        if (frameLayout != null) {
            m197887W(frameLayout);
        }
    }

    /* JADX INFO: renamed from: r0 */
    public void m197934r0() {
        MessageLocation messageLocation;
        String str;
        Emotion emotion = this.f180806x;
        if (emotion == null || (messageLocation = this.f180805w) == null) {
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
            CrashHelper.m82479c(e);
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f180781E = str;
        this.f180790h.setHint(str);
    }

    /* JADX INFO: renamed from: s0 */
    public final void m197935s0(List<MessageLocation> list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(cqh.m111901b());
        if (NullChecker.m82486a(this.f180805w)) {
            arrayList.add(new cqh(this.f180805w, 2));
        }
        if (!jyb.m147479J(list)) {
            for (MessageLocation messageLocation : list) {
                if (this.f180805w == null) {
                    mo105933l(messageLocation);
                }
                arrayList.add(new cqh(messageLocation, 3));
            }
        }
        arrayList.add(cqh.m111900a());
        this.f180778B.m105929N(arrayList, this.f180805w);
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        FrameLayout frameLayout = (FrameLayout) findViewById(vcc0.f183363E);
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        layoutParams.height = -1;
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setBackgroundColor(0);
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
        this.f180795m = bottomSheetBehaviorFrom;
        bottomSheetBehaviorFrom.setState(3);
        this.f180795m.setBottomSheetCallback(this.f180782F);
        gi80.m130297b().m130298a(this);
        if (NullChecker.m82486a(this.f180800r)) {
            this.f180800r.mo156949b();
        }
        m197890c0();
        if (NullChecker.m82486a(this.f180803u)) {
            this.f180803u.call("");
        }
        if (NullChecker.m82486a(this.f180798p)) {
            w1e.m204402f(this.f180798p);
        }
    }

    /* JADX INFO: renamed from: l.ush$a */
    public class C20656a extends BottomSheetBehavior.BottomSheetCallback {
        public C20656a() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1) {
                ush.this.f180795m.setState(3);
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }
    }
}
