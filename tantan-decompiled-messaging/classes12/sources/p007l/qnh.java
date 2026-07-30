package p007l;

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
import com.p000p1.mobile.putong.data.CommonData;
import com.p000p1.mobile.putong.data.Detect;
import com.p000p1.mobile.putong.data.DetectCategoryType;
import com.p000p1.mobile.putong.data.DetectRequest;
import com.p000p1.mobile.putong.data.DetectText;
import com.p000p1.mobile.putong.data.Envelope;
import com.p000p1.mobile.putong.data.MessageLocation;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.PoiGuidePopWindow;
import com.p000p1.mobile.putong.feed.newui.mediapicker.post.NewPostLocationAct;
import com.p006ss.bytertc.audio.device.webrtc.WebRtcAudioTrack;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import l.cwf0;
import l.d30;
import l.e30;
import l.i0e;
import l.j760;
import l.lsi0;
import l.mkd0;
import l.p4c0;
import l.qib0;
import l.t100;
import l.vwb;
import l.xdl0;
import l.zvf0;
import v.VDraweeView;
import v.VEditText;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public abstract class qnh extends BottomSheetDialog implements aa80.InterfaceC2319a {

    /* JADX INFO: renamed from: K */
    public static String f12295K = "from_poi_diaog";

    /* JADX INFO: renamed from: A */
    public int f12296A;

    /* JADX INFO: renamed from: B */
    public int f12297B;

    /* JADX INFO: renamed from: C */
    public MessageLocation f12298C;

    /* JADX INFO: renamed from: D */
    public boolean f12299D;

    /* JADX INFO: renamed from: E */
    public PoiGuidePopWindow f12300E;

    /* JADX INFO: renamed from: F */
    public boolean f12301F;

    /* JADX INFO: renamed from: G */
    public gsl f12302G;

    /* JADX INFO: renamed from: H */
    public String f12303H;

    /* JADX INFO: renamed from: I */
    public cwf0 f12304I;

    /* JADX INFO: renamed from: J */
    public BottomSheetBehavior.BottomSheetCallback f12305J;

    /* JADX INFO: renamed from: a */
    public FrameLayout f12306a;

    /* JADX INFO: renamed from: b */
    public View f12307b;

    /* JADX INFO: renamed from: c */
    public RelativeLayout f12308c;

    /* JADX INFO: renamed from: d */
    public View f12309d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f12310e;

    /* JADX INFO: renamed from: f */
    public ImageView f12311f;

    /* JADX INFO: renamed from: g */
    public VText f12312g;

    /* JADX INFO: renamed from: h */
    public VLinear f12313h;

    /* JADX INFO: renamed from: i */
    public VLinear f12314i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f12315j;

    /* JADX INFO: renamed from: k */
    public TextView f12316k;

    /* JADX INFO: renamed from: l */
    public VLinear f12317l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f12318m;

    /* JADX INFO: renamed from: n */
    public TextView f12319n;

    /* JADX INFO: renamed from: o */
    public VLinear f12320o;

    /* JADX INFO: renamed from: p */
    public VDraweeView f12321p;

    /* JADX INFO: renamed from: q */
    public TextView f12322q;

    /* JADX INFO: renamed from: r */
    public VLinear f12323r;

    /* JADX INFO: renamed from: s */
    public VDraweeView f12324s;

    /* JADX INFO: renamed from: t */
    public TextView f12325t;

    /* JADX INFO: renamed from: u */
    public VEditText f12326u;

    /* JADX INFO: renamed from: v */
    public VText f12327v;

    /* JADX INFO: renamed from: w */
    public TextView f12328w;

    /* JADX INFO: renamed from: x */
    public Act f12329x;

    /* JADX INFO: renamed from: y */
    public BottomSheetBehavior f12330y;

    /* JADX INFO: renamed from: z */
    public boolean f12331z;

    public qnh(@NonNull Context context) {
        super(context);
        this.f12331z = false;
        this.f12305J = new C2470a();
        m13639M(context);
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m13636C(Throwable th) {
    }

    /* JADX INFO: renamed from: K */
    private void m13638K(final View view) {
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        int iHeight = rect.height();
        int iMax = Math.max(this.f12296A, iHeight);
        this.f12296A = iMax;
        if (this.f12297B == iHeight) {
            return;
        }
        this.f12297B = iHeight;
        if (iHeight < iMax + WebRtcAudioTrack.AudioTrackErrorCode.AUDIO_TRACK_INIT_MINBUFFER_ERROR) {
            view.getTranslationY();
            view.post(new Runnable() { // from class: l.nnh
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

    /* JADX INFO: renamed from: M */
    private void m13639M(Context context) {
        this.f12329x = (Act) context;
        setContentView(m13657I());
    }

    /* JADX INFO: renamed from: P */
    private void m13640P() {
        cwf0 cwf0VarC = i0e.c(mo9541J(), Dialog.class.getName());
        this.f12304I = cwf0VarC;
        j760 j760VarY = vwb.Y("poi_pop_type", this.f12301F ? "poi_lighten_guide" : "poi_lighten_click");
        PoiGuidePopWindow poiGuidePopWindow = this.f12300E;
        cwf0VarC.p(new j760[]{j760VarY, vwb.Y("showtime", Integer.valueOf(poiGuidePopWindow.firstTimeShow ? 0 : poiGuidePopWindow.swipeLimit)), vwb.Y("user_segment", this.f12300E.userPostType)});
    }

    /* JADX INFO: renamed from: Q */
    private void m13641Q() {
        m13659N();
        mo9542R();
        m13642c0();
    }

    /* JADX INFO: renamed from: c0 */
    private void m13642c0() {
        this.f12306a.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: l.enh
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f7439a.m13670b0();
            }
        });
    }

    /* JADX INFO: renamed from: E */
    public View m13653E(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return rnh.m13930b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: F */
    public void m13654F() {
        if (!NullChecker.a(this.f12298C) || vqg.m15529n(this.f12298C.coordinates) <= 2000) {
            m13671e0();
        } else {
            p980.m12949f(this.f12329x).subscribe(mkd0.H(new e30() { // from class: l.lnh
                public final void call(Object obj) {
                    this.f10077a.m13661S((k90) obj);
                }
            }, new e30() { // from class: l.mnh
                public final void call(Object obj) {
                    qnh.m13636C((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: G */
    public void m13655G(String str, DetectCategoryType detectCategoryType, String str2, final String str3, final d30 d30Var) {
        this.f12299D = true;
        DetectRequest detectRequest = new DetectRequest();
        detectRequest.category = detectCategoryType;
        DetectText detectText = new DetectText();
        detectText.key = str2;
        detectText.value = str;
        ArrayList arrayList = new ArrayList();
        detectRequest.text = arrayList;
        arrayList.add(detectText);
        FeedModule.f316d.m16522P6(detectRequest).subscribe(mkd0.H(new e30() { // from class: l.onh
            public final void call(Object obj) {
                this.f11541a.m13662T(d30Var, str3, (Envelope) obj);
            }
        }, new e30() { // from class: l.pnh
            public final void call(Object obj) {
                this.f11891a.m13663U(d30Var, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: H */
    public void m13656H(String str) {
        if (TextUtils.isEmpty(str)) {
            lsi0.y("未获取内容，发布失败");
            return;
        }
        final HashMap map = new HashMap();
        PoiGuidePopWindow poiGuidePopWindow = this.f12300E;
        map.put("showtime", Integer.valueOf(poiGuidePopWindow.firstTimeShow ? 0 : poiGuidePopWindow.swipeLimit));
        map.put("user_segment", this.f12300E.userPostType);
        final Moment momentNew_ = Moment.new_();
        momentNew_.value = str;
        momentNew_.allowForward = null;
        momentNew_.additionalData = null;
        momentNew_.location = this.f12298C;
        momentNew_.from = this.f12301F ? "poi_lighten_guide" : "poi_lighten_click";
        FeedModule.f316d.m16585Y6(momentNew_, "poi").subscribe(mkd0.H(new e30() { // from class: l.fnh
            public final void call(Object obj) {
                this.f8170a.m13664V(momentNew_, map, (Envelope) obj);
            }
        }, new e30() { // from class: l.gnh
            public final void call(Object obj) {
                this.f8487a.m13665W(momentNew_, map, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: I */
    public View m13657I() {
        return m13653E(LayoutInflater.from(this.f12329x), null);
    }

    /* JADX INFO: renamed from: J */
    public abstract String mo9541J();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: L */
    public void m13658L() {
        InputMethodManager inputMethodManager = (InputMethodManager) this.f12329x.getSystemService("input_method");
        if (!inputMethodManager.isActive() || getCurrentFocus() == null || getCurrentFocus().getWindowToken() == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 2);
    }

    /* JADX INFO: renamed from: N */
    public final void m13659N() {
        if (FeedModule.m1140H().I4()) {
            qib0.G.I0(this.f12310e, "https://auto.tancdn.com/v1/images/eyJpZCI6Ik1JWFhaVkpSR1RDWTJXUDUyQlhYWk1VS1lXTlhMNjE0IiwidyI6NDIwLCJoIjozMzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyMzA2MzE1ODIxMzM3MzUwNjY0fQ.png", t100.d(140.0f), t100.d(110.0f));
            xdl0.M0(this.f12309d, false);
            this.f12312g.setTextSize(24.0f);
            this.f12312g.setTextColor(-16777216);
            this.f12314i.setBackgroundResource(f3c0.f7855m3);
            this.f12317l.setBackgroundResource(f3c0.f7855m3);
            this.f12320o.setBackgroundResource(f3c0.f7855m3);
            this.f12323r.setBackgroundResource(f3c0.f7855m3);
            this.f12326u.setHintTextColor(this.f12329x.getResources().getColor(e1c0.f7132c));
            this.f12326u.setTextSize(16.0f);
            this.f12327v.setBackgroundResource(f3c0.f7863n3);
            this.f12328w.setBackgroundResource(f3c0.f7835k);
        } else {
            qib0.G.I0(this.f12310e, this.f12300E.icon, t100.d(140.0f), t100.d(110.0f));
        }
        this.f12312g.setText(this.f12300E.title);
        this.f12312g.setTypeface(Typeface.DEFAULT_BOLD);
        this.f12327v.setTypeface((Typeface) null, 1);
        String strM14552a = tih.m14552a();
        if (!TextUtils.isEmpty(strM14552a)) {
            this.f12328w.setText(strM14552a);
        }
        xdl0.E0(this.f12311f, new View.OnClickListener() { // from class: l.hnh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8780a.m13666X(view);
            }
        });
        xdl0.E0(this.f12307b, new View.OnClickListener() { // from class: l.inh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9105a.m13667Y(view);
            }
        });
        xdl0.E0(this.f12308c, new View.OnClickListener() { // from class: l.jnh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9456a.m13668Z(view);
            }
        });
        xdl0.E0(this.f12327v, new View.OnClickListener() { // from class: l.knh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9750a.m13669a0(view);
            }
        });
        m13654F();
        mo9543d0();
    }

    /* JADX INFO: renamed from: O */
    public final void m13660O(k90 k90Var) {
        if (k90Var == null) {
            return;
        }
        MessageLocation messageLocation = new MessageLocation();
        this.f12298C = messageLocation;
        messageLocation.name = k90Var.m11398c();
        this.f12298C.address = k90Var.m11396a();
        this.f12298C.coordinates = k90Var.m11397b();
    }

    /* JADX INFO: renamed from: R */
    public abstract void mo9542R();

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m13661S(k90 k90Var) {
        m13660O(k90Var);
        m13671e0();
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m13662T(d30 d30Var, String str, Envelope envelope) {
        this.f12299D = false;
        Detect detect = ((CommonData) envelope.getModuleData(CommonData.class)).detect;
        if (vwb.J(detect.text) && vwb.J(detect.media)) {
            d30Var.call();
            return;
        }
        if (vqg.m15525l(detect, mo9541J())) {
            lsi0.w(R$string.f602s);
        } else if (TextUtils.isEmpty(str)) {
            lsi0.w(R$string.f457W2);
        } else {
            lsi0.y(str);
        }
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m13663U(d30 d30Var, Throwable th) {
        this.f12299D = false;
        d30Var.call();
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m13664V(Moment moment, HashMap map, Envelope envelope) {
        lsi0.y("发布成功");
        zi60.m17436w().m17457n(moment, mo9541J(), 201, false, map);
        if (this.f12301F) {
            w980.m15748h().m15761r(this.f12298C);
        }
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m13665W(Moment moment, HashMap map, Throwable th) {
        lsi0.y("发布失败");
        zi60.m17436w().m17458o(moment, mo9541J(), th, false, map);
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m13666X(View view) {
        dismiss();
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m13667Y(View view) {
        dismiss();
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m13668Z(View view) {
        m13658L();
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m13669a0(View view) {
        zvf0.r("e_poi_tag", mo9541J());
        m13675i0();
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m13670b0() {
        FrameLayout frameLayout = this.f12306a;
        if (frameLayout != null) {
            m13638K(frameLayout);
        }
    }

    /* JADX INFO: renamed from: d0 */
    public abstract void mo9543d0();

    /* JADX WARN: Multi-variable type inference failed */
    public void dismiss() {
        m13658L();
        super/*android.app.Dialog*/.dismiss();
        aa80.m8468b().m8471d(this);
        if (NullChecker.a(this.f12302G)) {
            this.f12302G.mo10497c();
        }
        if (this.f12304I == null) {
            m13640P();
        }
        i0e.e(this.f12304I);
    }

    /* JADX INFO: renamed from: e0 */
    public final void m13671e0() {
        MessageLocation messageLocation = this.f12298C;
        VText vText = this.f12327v;
        if (messageLocation == null) {
            vText.setText("");
        } else {
            vText.setText(messageLocation.name);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public void m13672f0(gsl gslVar) {
        this.f12302G = gslVar;
    }

    /* JADX INFO: renamed from: g0 */
    public void m13673g0(boolean z) {
        this.f12301F = z;
    }

    /* JADX INFO: renamed from: h0 */
    public void m13674h0(PoiGuidePopWindow poiGuidePopWindow) {
        this.f12300E = poiGuidePopWindow;
        this.f12298C = poiGuidePopWindow.location;
    }

    /* JADX INFO: renamed from: i0 */
    public final void m13675i0() {
        Act act = this.f12329x;
        act.startActivity(NewPostLocationAct.m3708V1(act, f12295K));
        this.f12329x.overridePendingTransition(uzb0.f13995i, 0);
    }

    @Override // p007l.aa80.InterfaceC2319a
    /* JADX INFO: renamed from: o */
    public void mo8472o(k90 k90Var) {
        if (k90Var == null) {
            return;
        }
        m13660O(k90Var);
        m13671e0();
        mo9543d0();
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
        this.f12330y = bottomSheetBehaviorFrom;
        bottomSheetBehaviorFrom.setState(3);
        this.f12330y.setBottomSheetCallback(this.f12305J);
        aa80.m8468b().m8469a(this);
        if (NullChecker.a(this.f12302G)) {
            this.f12302G.mo10496b();
        }
        m13641Q();
        if (this.f12304I == null) {
            m13640P();
        }
        i0e.f(this.f12304I);
    }

    /* JADX INFO: renamed from: l.qnh$a */
    public class C2470a extends BottomSheetBehavior.BottomSheetCallback {
        public C2470a() {
        }

        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1) {
                qnh.this.f12330y.setState(3);
            }
        }

        public void onSlide(@NonNull View view, float f) {
        }
    }
}
