package p153l;

import android.app.Dialog;
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
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.CommonData;
import com.p051p1.mobile.putong.data.Detect;
import com.p051p1.mobile.putong.data.DetectCategoryType;
import com.p051p1.mobile.putong.data.DetectRequest;
import com.p051p1.mobile.putong.data.DetectText;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.MessageLocation;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.PoiGuidePopWindow;
import com.p051p1.mobile.putong.feed.newui.mediapicker.post.NewPostLocationAct;
import com.p074ss.bytertc.audio.device.webrtc.WebRtcAudioTrack;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import p151v.VDraweeView;
import p151v.VEditText;
import p151v.VLinear;
import p151v.VText;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes13.dex */
public abstract class fph extends BottomSheetDialog implements gi80.InterfaceC17215a {

    /* JADX INFO: renamed from: K */
    public static String f100129K = "from_poi_diaog";

    /* JADX INFO: renamed from: A */
    public int f100130A;

    /* JADX INFO: renamed from: B */
    public int f100131B;

    /* JADX INFO: renamed from: C */
    public MessageLocation f100132C;

    /* JADX INFO: renamed from: D */
    public boolean f100133D;

    /* JADX INFO: renamed from: E */
    public PoiGuidePopWindow f100134E;

    /* JADX INFO: renamed from: F */
    public boolean f100135F;

    /* JADX INFO: renamed from: G */
    public uul f100136G;

    /* JADX INFO: renamed from: H */
    public String f100137H;

    /* JADX INFO: renamed from: I */
    public l4g0 f100138I;

    /* JADX INFO: renamed from: J */
    public BottomSheetBehavior.BottomSheetCallback f100139J;

    /* JADX INFO: renamed from: a */
    public FrameLayout f100140a;

    /* JADX INFO: renamed from: b */
    public View f100141b;

    /* JADX INFO: renamed from: c */
    public RelativeLayout f100142c;

    /* JADX INFO: renamed from: d */
    public View f100143d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f100144e;

    /* JADX INFO: renamed from: f */
    public ImageView f100145f;

    /* JADX INFO: renamed from: g */
    public VText f100146g;

    /* JADX INFO: renamed from: h */
    public VLinear f100147h;

    /* JADX INFO: renamed from: i */
    public VLinear f100148i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f100149j;

    /* JADX INFO: renamed from: k */
    public TextView f100150k;

    /* JADX INFO: renamed from: l */
    public VLinear f100151l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f100152m;

    /* JADX INFO: renamed from: n */
    public TextView f100153n;

    /* JADX INFO: renamed from: o */
    public VLinear f100154o;

    /* JADX INFO: renamed from: p */
    public VDraweeView f100155p;

    /* JADX INFO: renamed from: q */
    public TextView f100156q;

    /* JADX INFO: renamed from: r */
    public VLinear f100157r;

    /* JADX INFO: renamed from: s */
    public VDraweeView f100158s;

    /* JADX INFO: renamed from: t */
    public TextView f100159t;

    /* JADX INFO: renamed from: u */
    public VEditText f100160u;

    /* JADX INFO: renamed from: v */
    public VText f100161v;

    /* JADX INFO: renamed from: w */
    public TextView f100162w;

    /* JADX INFO: renamed from: x */
    public Act f100163x;

    /* JADX INFO: renamed from: y */
    public BottomSheetBehavior f100164y;

    /* JADX INFO: renamed from: z */
    public boolean f100165z;

    public fph(@NonNull Context context) {
        super(context);
        this.f100165z = false;
        this.f100139J = new C17028a();
        m126592M(context);
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m126589C(Throwable th) {
    }

    /* JADX INFO: renamed from: K */
    private void m126591K(final View view) {
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        int iHeight = rect.height();
        int iMax = Math.max(this.f100130A, iHeight);
        this.f100130A = iMax;
        if (this.f100131B == iHeight) {
            return;
        }
        this.f100131B = iHeight;
        if (iHeight < iMax + WebRtcAudioTrack.AudioTrackErrorCode.AUDIO_TRACK_INIT_MINBUFFER_ERROR) {
            view.getTranslationY();
            view.post(new Runnable() { // from class: l.cph
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

    /* JADX INFO: renamed from: M */
    private void m126592M(Context context) {
        this.f100163x = (Act) context;
        setContentView(m126610I());
    }

    /* JADX INFO: renamed from: P */
    private void m126593P() {
        l4g0 l4g0VarM204399c = w1e.m204399c(mo99686J(), Dialog.class.getName());
        this.f100138I = l4g0VarM204399c;
        pf60 pf60VarM147494Y = jyb.m147494Y("poi_pop_type", this.f100135F ? "poi_lighten_guide" : "poi_lighten_click");
        PoiGuidePopWindow poiGuidePopWindow = this.f100134E;
        l4g0VarM204399c.m152781p(pf60VarM147494Y, jyb.m147494Y("showtime", Integer.valueOf(poiGuidePopWindow.firstTimeShow ? 0 : poiGuidePopWindow.swipeLimit)), jyb.m147494Y("user_segment", this.f100134E.userPostType));
    }

    /* JADX INFO: renamed from: Q */
    private void m126594Q() {
        m126612N();
        mo99687R();
        m126595c0();
    }

    /* JADX INFO: renamed from: c0 */
    private void m126595c0() {
        this.f100140a.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: l.toh
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f175407a.m126623b0();
            }
        });
    }

    /* JADX INFO: renamed from: E */
    public View m126606E(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return gph.m131259b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: F */
    public void m126607F() {
        if (!NullChecker.m82486a(this.f100132C) || ksg.m151218n(this.f100132C.coordinates) <= 2000) {
            m126624e0();
        } else {
            vh80.m201262f(this.f100163x).subscribe(psd0.m173597H(new y20() { // from class: l.aph
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f72724a.m126614S((g90) obj);
                }
            }, new y20() { // from class: l.bph
                @Override // p153l.y20
                public final void call(Object obj) {
                    fph.m126589C((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: G */
    public void m126608G(String str, DetectCategoryType detectCategoryType, String str2, final String str3, final x20 x20Var) {
        this.f100133D = true;
        DetectRequest detectRequest = new DetectRequest();
        detectRequest.category = detectCategoryType;
        DetectText detectText = new DetectText();
        detectText.key = str2;
        detectText.value = str;
        ArrayList arrayList = new ArrayList();
        detectRequest.text = arrayList;
        arrayList.add(detectText);
        FeedModule.f39703d.m145582P6(detectRequest).subscribe(psd0.m173597H(new y20() { // from class: l.dph
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f90057a.m126615T(x20Var, str3, (Envelope) obj);
            }
        }, new y20() { // from class: l.eph
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f95250a.m126616U(x20Var, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: H */
    public void m126609H(String str) {
        if (TextUtils.isEmpty(str)) {
            o1j0.m165651y("未获取内容，发布失败");
            return;
        }
        final HashMap map = new HashMap();
        PoiGuidePopWindow poiGuidePopWindow = this.f100134E;
        map.put("showtime", Integer.valueOf(poiGuidePopWindow.firstTimeShow ? 0 : poiGuidePopWindow.swipeLimit));
        map.put("user_segment", this.f100134E.userPostType);
        final Moment momentNew_ = Moment.new_();
        momentNew_.value = str;
        momentNew_.allowForward = null;
        momentNew_.additionalData = null;
        momentNew_.location = this.f100132C;
        momentNew_.from = this.f100135F ? "poi_lighten_guide" : "poi_lighten_click";
        FeedModule.f39703d.m145645Y6(momentNew_, "poi").subscribe(psd0.m173597H(new y20() { // from class: l.uoh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f180083a.m126617V(momentNew_, map, (Envelope) obj);
            }
        }, new y20() { // from class: l.voh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f185045a.m126618W(momentNew_, map, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: I */
    public View m126610I() {
        return m126606E(LayoutInflater.from(this.f100163x), null);
    }

    /* JADX INFO: renamed from: J */
    public abstract String mo99686J();

    /* JADX INFO: renamed from: L */
    public void m126611L() {
        InputMethodManager inputMethodManager = (InputMethodManager) this.f100163x.getSystemService("input_method");
        if (!inputMethodManager.isActive() || getCurrentFocus() == null || getCurrentFocus().getWindowToken() == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 2);
    }

    /* JADX INFO: renamed from: N */
    public final void m126612N() {
        if (FeedModule.m61406H().mo31695I4()) {
            uqb0.f180374G.m127109I0(this.f100144e, "https://auto.tancdn.com/v1/images/eyJpZCI6Ik1JWFhaVkpSR1RDWTJXUDUyQlhYWk1VS1lXTlhMNjE0IiwidyI6NDIwLCJoIjozMzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyMzA2MzE1ODIxMzM3MzUwNjY0fQ.png", qa00.m175859d(140.0f), qa00.m175859d(110.0f));
            bnl0.m105525M0(this.f100143d, false);
            this.f100146g.setTextSize(24.0f);
            this.f100146g.setTextColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
            this.f100148i.setBackgroundResource(lbc0.f131090m3);
            this.f100151l.setBackgroundResource(lbc0.f131090m3);
            this.f100154o.setBackgroundResource(lbc0.f131090m3);
            this.f100157r.setBackgroundResource(lbc0.f131090m3);
            this.f100160u.setHintTextColor(this.f100163x.getResources().getColor(k9c0.f124499c));
            this.f100160u.setTextSize(16.0f);
            this.f100161v.setBackgroundResource(lbc0.f131098n3);
            this.f100162w.setBackgroundResource(lbc0.f131070k);
        } else {
            uqb0.f180374G.m127109I0(this.f100144e, this.f100134E.icon, qa00.m175859d(140.0f), qa00.m175859d(110.0f));
        }
        this.f100146g.setText(this.f100134E.title);
        this.f100146g.setTypeface(Typeface.DEFAULT_BOLD);
        this.f100161v.setTypeface(null, 1);
        String strM140293a = ikh.m140293a();
        if (!TextUtils.isEmpty(strM140293a)) {
            this.f100162w.setText(strM140293a);
        }
        bnl0.m105509E0(this.f100145f, new View.OnClickListener() { // from class: l.woh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f190042a.m126619X(view);
            }
        });
        bnl0.m105509E0(this.f100141b, new View.OnClickListener() { // from class: l.xoh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f195574a.m126620Y(view);
            }
        });
        bnl0.m105509E0(this.f100142c, new View.OnClickListener() { // from class: l.yoh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f200978a.m126621Z(view);
            }
        });
        bnl0.m105509E0(this.f100161v, new View.OnClickListener() { // from class: l.zoh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f205351a.m126622a0(view);
            }
        });
        m126607F();
        mo99688d0();
    }

    /* JADX INFO: renamed from: O */
    public final void m126613O(g90 g90Var) {
        if (g90Var == null) {
            return;
        }
        MessageLocation messageLocation = new MessageLocation();
        this.f100132C = messageLocation;
        messageLocation.name = g90Var.m129468c();
        this.f100132C.address = g90Var.m129466a();
        this.f100132C.coordinates = g90Var.m129467b();
    }

    /* JADX INFO: renamed from: R */
    public abstract void mo99687R();

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m126614S(g90 g90Var) {
        m126613O(g90Var);
        m126624e0();
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m126615T(x20 x20Var, String str, Envelope envelope) {
        this.f100133D = false;
        Detect detect = ((CommonData) envelope.getModuleData(CommonData.class)).detect;
        if (jyb.m147479J(detect.text) && jyb.m147479J(detect.media)) {
            x20Var.call();
            return;
        }
        if (ksg.m151214l(detect, mo99686J())) {
            o1j0.m165649w(R$string.f39989s);
        } else if (TextUtils.isEmpty(str)) {
            o1j0.m165649w(R$string.f39844W2);
        } else {
            o1j0.m165651y(str);
        }
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m126616U(x20 x20Var, Throwable th) {
        this.f100133D = false;
        x20Var.call();
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m126617V(Moment moment, HashMap map, Envelope envelope) {
        o1j0.m165651y("发布成功");
        er60.m122104w().m122125n(moment, mo99686J(), 201, false, map);
        if (this.f100135F) {
            ci80.m109858h().m109871r(this.f100132C);
        }
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m126618W(Moment moment, HashMap map, Throwable th) {
        o1j0.m165651y("发布失败");
        er60.m122104w().m122126o(moment, mo99686J(), th, false, map);
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m126619X(View view) {
        dismiss();
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m126620Y(View view) {
        dismiss();
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m126621Z(View view) {
        m126611L();
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m126622a0(View view) {
        i4g0.m138520r("e_poi_tag", mo99686J());
        m126628i0();
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m126623b0() {
        FrameLayout frameLayout = this.f100140a;
        if (frameLayout != null) {
            m126591K(frameLayout);
        }
    }

    /* JADX INFO: renamed from: d0 */
    public abstract void mo99688d0();

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        m126611L();
        super.dismiss();
        gi80.m130297b().m130300d(this);
        if (NullChecker.m82486a(this.f100136G)) {
            this.f100136G.mo156950c();
        }
        if (this.f100138I == null) {
            m126593P();
        }
        w1e.m204401e(this.f100138I);
    }

    /* JADX INFO: renamed from: e0 */
    public final void m126624e0() {
        MessageLocation messageLocation = this.f100132C;
        VText vText = this.f100161v;
        if (messageLocation == null) {
            vText.setText("");
        } else {
            vText.setText(messageLocation.name);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public void m126625f0(uul uulVar) {
        this.f100136G = uulVar;
    }

    /* JADX INFO: renamed from: g0 */
    public void m126626g0(boolean z) {
        this.f100135F = z;
    }

    /* JADX INFO: renamed from: h0 */
    public void m126627h0(PoiGuidePopWindow poiGuidePopWindow) {
        this.f100134E = poiGuidePopWindow;
        this.f100132C = poiGuidePopWindow.location;
    }

    /* JADX INFO: renamed from: i0 */
    public final void m126628i0() {
        Act act = this.f100163x;
        act.startActivity(NewPostLocationAct.m63886X1(act, f100129K));
        this.f100163x.overridePendingTransition(a8c0.f68909i, 0);
    }

    @Override // p153l.gi80.InterfaceC17215a
    /* JADX INFO: renamed from: o */
    public void mo126629o(g90 g90Var) {
        if (g90Var == null) {
            return;
        }
        m126613O(g90Var);
        m126624e0();
        mo99688d0();
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
        this.f100164y = bottomSheetBehaviorFrom;
        bottomSheetBehaviorFrom.setState(3);
        this.f100164y.setBottomSheetCallback(this.f100139J);
        gi80.m130297b().m130298a(this);
        if (NullChecker.m82486a(this.f100136G)) {
            this.f100136G.mo156949b();
        }
        m126594Q();
        if (this.f100138I == null) {
            m126593P();
        }
        w1e.m204402f(this.f100138I);
    }

    /* JADX INFO: renamed from: l.fph$a */
    public class C17028a extends BottomSheetBehavior.BottomSheetCallback {
        public C17028a() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1) {
                fph.this.f100164y.setState(3);
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }
    }
}
