package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.CommonData;
import com.p046p1.mobile.putong.data.Detect;
import com.p046p1.mobile.putong.data.DetectCategoryType;
import com.p046p1.mobile.putong.data.DetectRequest;
import com.p046p1.mobile.putong.data.DetectText;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.MessageLocation;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.PoiGuidePopWindow;
import com.p046p1.mobile.putong.feed.newui.mediapicker.post.NewPostLocationAct;
import com.p069ss.bytertc.audio.device.webrtc.WebRtcAudioTrack;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import p147v.VDraweeView;
import p147v.VEditText;
import p147v.VLinear;
import p147v.VText;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes12.dex */
public abstract class qnh extends BottomSheetDialog implements aa80.InterfaceC15555a {

    /* JADX INFO: renamed from: K */
    public static String f155438K = "from_poi_diaog";

    /* JADX INFO: renamed from: A */
    public int f155439A;

    /* JADX INFO: renamed from: B */
    public int f155440B;

    /* JADX INFO: renamed from: C */
    public MessageLocation f155441C;

    /* JADX INFO: renamed from: D */
    public boolean f155442D;

    /* JADX INFO: renamed from: E */
    public PoiGuidePopWindow f155443E;

    /* JADX INFO: renamed from: F */
    public boolean f155444F;

    /* JADX INFO: renamed from: G */
    public gsl f155445G;

    /* JADX INFO: renamed from: H */
    public String f155446H;

    /* JADX INFO: renamed from: I */
    public cwf0 f155447I;

    /* JADX INFO: renamed from: J */
    public BottomSheetBehavior.BottomSheetCallback f155448J;

    /* JADX INFO: renamed from: a */
    public FrameLayout f155449a;

    /* JADX INFO: renamed from: b */
    public View f155450b;

    /* JADX INFO: renamed from: c */
    public RelativeLayout f155451c;

    /* JADX INFO: renamed from: d */
    public View f155452d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f155453e;

    /* JADX INFO: renamed from: f */
    public ImageView f155454f;

    /* JADX INFO: renamed from: g */
    public VText f155455g;

    /* JADX INFO: renamed from: h */
    public VLinear f155456h;

    /* JADX INFO: renamed from: i */
    public VLinear f155457i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f155458j;

    /* JADX INFO: renamed from: k */
    public TextView f155459k;

    /* JADX INFO: renamed from: l */
    public VLinear f155460l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f155461m;

    /* JADX INFO: renamed from: n */
    public TextView f155462n;

    /* JADX INFO: renamed from: o */
    public VLinear f155463o;

    /* JADX INFO: renamed from: p */
    public VDraweeView f155464p;

    /* JADX INFO: renamed from: q */
    public TextView f155465q;

    /* JADX INFO: renamed from: r */
    public VLinear f155466r;

    /* JADX INFO: renamed from: s */
    public VDraweeView f155467s;

    /* JADX INFO: renamed from: t */
    public TextView f155468t;

    /* JADX INFO: renamed from: u */
    public VEditText f155469u;

    /* JADX INFO: renamed from: v */
    public VText f155470v;

    /* JADX INFO: renamed from: w */
    public TextView f155471w;

    /* JADX INFO: renamed from: x */
    public Act f155472x;

    /* JADX INFO: renamed from: y */
    public BottomSheetBehavior f155473y;

    /* JADX INFO: renamed from: z */
    public boolean f155474z;

    public qnh(@NonNull Context context) {
        super(context);
        this.f155474z = false;
        this.f155448J = new C19543a();
        m175644M(context);
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m175641C(Throwable th) {
    }

    /* JADX INFO: renamed from: K */
    private void m175643K(final View view) {
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        int iHeight = rect.height();
        int iMax = Math.max(this.f155439A, iHeight);
        this.f155439A = iMax;
        if (this.f155440B == iHeight) {
            return;
        }
        this.f155440B = iHeight;
        if (iHeight < iMax + WebRtcAudioTrack.AudioTrackErrorCode.AUDIO_TRACK_INIT_MINBUFFER_ERROR) {
            view.getTranslationY();
            view.post(new Runnable() { // from class: l.nnh
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

    /* JADX INFO: renamed from: M */
    private void m175644M(Context context) {
        this.f155472x = (Act) context;
        setContentView(m175662I());
    }

    /* JADX INFO: renamed from: P */
    private void m175645P() {
        cwf0 cwf0VarM133794c = i0e.m133794c(mo112893J(), Dialog.class.getName());
        this.f155447I = cwf0VarM133794c;
        j760 j760VarM200311Y = vwb.m200311Y("poi_pop_type", this.f155444F ? "poi_lighten_guide" : "poi_lighten_click");
        PoiGuidePopWindow poiGuidePopWindow = this.f155443E;
        cwf0VarM133794c.m109040p(j760VarM200311Y, vwb.m200311Y("showtime", Integer.valueOf(poiGuidePopWindow.firstTimeShow ? 0 : poiGuidePopWindow.swipeLimit)), vwb.m200311Y("user_segment", this.f155443E.userPostType));
    }

    /* JADX INFO: renamed from: Q */
    private void m175646Q() {
        m175664N();
        mo112894R();
        m175647c0();
    }

    /* JADX INFO: renamed from: c0 */
    private void m175647c0() {
        this.f155449a.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: l.enh
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f92314a.m175675b0();
            }
        });
    }

    /* JADX INFO: renamed from: E */
    public View m175658E(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return rnh.m180067b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: F */
    public void m175659F() {
        if (!NullChecker.m81303a(this.f155441C) || vqg.m199559n(this.f155441C.coordinates) <= 2000) {
            m175676e0();
        } else {
            p980.m167863f(this.f155472x).subscribe(mkd0.m154956H(new e30() { // from class: l.lnh
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f128992a.m175666S((k90) obj);
                }
            }, new e30() { // from class: l.mnh
                @Override // p149l.e30
                public final void call(Object obj) {
                    qnh.m175641C((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: G */
    public void m175660G(String str, DetectCategoryType detectCategoryType, String str2, final String str3, final d30 d30Var) {
        this.f155442D = true;
        DetectRequest detectRequest = new DetectRequest();
        detectRequest.category = detectCategoryType;
        DetectText detectText = new DetectText();
        detectText.key = str2;
        detectText.value = str;
        ArrayList arrayList = new ArrayList();
        detectRequest.text = arrayList;
        arrayList.add(detectText);
        FeedModule.f38855d.m209341P6(detectRequest).subscribe(mkd0.m154956H(new e30() { // from class: l.onh
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f144784a.m175667T(d30Var, str3, (Envelope) obj);
            }
        }, new e30() { // from class: l.pnh
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f150394a.m175668U(d30Var, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: H */
    public void m175661H(String str) {
        if (TextUtils.isEmpty(str)) {
            lsi0.m151595y("未获取内容，发布失败");
            return;
        }
        final HashMap map = new HashMap();
        PoiGuidePopWindow poiGuidePopWindow = this.f155443E;
        map.put("showtime", Integer.valueOf(poiGuidePopWindow.firstTimeShow ? 0 : poiGuidePopWindow.swipeLimit));
        map.put("user_segment", this.f155443E.userPostType);
        final Moment momentNew_ = Moment.new_();
        momentNew_.value = str;
        momentNew_.allowForward = null;
        momentNew_.additionalData = null;
        momentNew_.location = this.f155441C;
        momentNew_.from = this.f155444F ? "poi_lighten_guide" : "poi_lighten_click";
        FeedModule.f38855d.m209404Y6(momentNew_, "poi").subscribe(mkd0.m154956H(new e30() { // from class: l.fnh
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f98418a.m175669V(momentNew_, map, (Envelope) obj);
            }
        }, new e30() { // from class: l.gnh
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f103598a.m175670W(momentNew_, map, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: I */
    public View m175662I() {
        return m175658E(LayoutInflater.from(this.f155472x), null);
    }

    /* JADX INFO: renamed from: J */
    public abstract String mo112893J();

    /* JADX INFO: renamed from: L */
    public void m175663L() {
        InputMethodManager inputMethodManager = (InputMethodManager) this.f155472x.getSystemService("input_method");
        if (!inputMethodManager.isActive() || getCurrentFocus() == null || getCurrentFocus().getWindowToken() == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 2);
    }

    /* JADX INFO: renamed from: N */
    public final void m175664N() {
        if (FeedModule.m60222H().mo30692I4()) {
            qib0.f154691G.m102325I0(this.f155453e, "https://auto.tancdn.com/v1/images/eyJpZCI6Ik1JWFhaVkpSR1RDWTJXUDUyQlhYWk1VS1lXTlhMNjE0IiwidyI6NDIwLCJoIjozMzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyMzA2MzE1ODIxMzM3MzUwNjY0fQ.png", t100.m186890d(140.0f), t100.m186890d(110.0f));
            xdl0.m208345M0(this.f155452d, false);
            this.f155455g.setTextSize(24.0f);
            this.f155455g.setTextColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
            this.f155457i.setBackgroundResource(f3c0.f94572m3);
            this.f155460l.setBackgroundResource(f3c0.f94572m3);
            this.f155463o.setBackgroundResource(f3c0.f94572m3);
            this.f155466r.setBackgroundResource(f3c0.f94572m3);
            this.f155469u.setHintTextColor(this.f155472x.getResources().getColor(e1c0.f88776c));
            this.f155469u.setTextSize(16.0f);
            this.f155470v.setBackgroundResource(f3c0.f94580n3);
            this.f155471w.setBackgroundResource(f3c0.f94552k);
        } else {
            qib0.f154691G.m102325I0(this.f155453e, this.f155443E.icon, t100.m186890d(140.0f), t100.m186890d(110.0f));
        }
        this.f155455g.setText(this.f155443E.title);
        this.f155455g.setTypeface(Typeface.DEFAULT_BOLD);
        this.f155470v.setTypeface(null, 1);
        String strM189185a = tih.m189185a();
        if (!TextUtils.isEmpty(strM189185a)) {
            this.f155471w.setText(strM189185a);
        }
        xdl0.m208329E0(this.f155454f, new View.OnClickListener() { // from class: l.hnh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f108629a.m175671X(view);
            }
        });
        xdl0.m208329E0(this.f155450b, new View.OnClickListener() { // from class: l.inh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f114021a.m175672Y(view);
            }
        });
        xdl0.m208329E0(this.f155451c, new View.OnClickListener() { // from class: l.jnh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f118853a.m175673Z(view);
            }
        });
        xdl0.m208329E0(this.f155470v, new View.OnClickListener() { // from class: l.knh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f123889a.m175674a0(view);
            }
        });
        m175659F();
        mo112895d0();
    }

    /* JADX INFO: renamed from: O */
    public final void m175665O(k90 k90Var) {
        if (k90Var == null) {
            return;
        }
        MessageLocation messageLocation = new MessageLocation();
        this.f155441C = messageLocation;
        messageLocation.name = k90Var.m144984c();
        this.f155441C.address = k90Var.m144982a();
        this.f155441C.coordinates = k90Var.m144983b();
    }

    /* JADX INFO: renamed from: R */
    public abstract void mo112894R();

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m175666S(k90 k90Var) {
        m175665O(k90Var);
        m175676e0();
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m175667T(d30 d30Var, String str, Envelope envelope) {
        this.f155442D = false;
        Detect detect = ((CommonData) envelope.getModuleData(CommonData.class)).detect;
        if (vwb.m200296J(detect.text) && vwb.m200296J(detect.media)) {
            d30Var.call();
            return;
        }
        if (vqg.m199555l(detect, mo112893J())) {
            lsi0.m151593w(R$string.f39141s);
        } else if (TextUtils.isEmpty(str)) {
            lsi0.m151593w(R$string.f38996W2);
        } else {
            lsi0.m151595y(str);
        }
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m175668U(d30 d30Var, Throwable th) {
        this.f155442D = false;
        d30Var.call();
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m175669V(Moment moment, HashMap map, Envelope envelope) {
        lsi0.m151595y("发布成功");
        zi60.m218961w().m218982n(moment, mo112893J(), 201, false, map);
        if (this.f155444F) {
            w980.m202252h().m202265r(this.f155441C);
        }
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m175670W(Moment moment, HashMap map, Throwable th) {
        lsi0.m151595y("发布失败");
        zi60.m218961w().m218983o(moment, mo112893J(), th, false, map);
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m175671X(View view) {
        dismiss();
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m175672Y(View view) {
        dismiss();
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m175673Z(View view) {
        m175663L();
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m175674a0(View view) {
        zvf0.m220396r("e_poi_tag", mo112893J());
        m175680i0();
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m175675b0() {
        FrameLayout frameLayout = this.f155449a;
        if (frameLayout != null) {
            m175643K(frameLayout);
        }
    }

    /* JADX INFO: renamed from: d0 */
    public abstract void mo112895d0();

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        m175663L();
        super.dismiss();
        aa80.m95532b().m95535d(this);
        if (NullChecker.m81303a(this.f155445G)) {
            this.f155445G.mo127807c();
        }
        if (this.f155447I == null) {
            m175645P();
        }
        i0e.m133796e(this.f155447I);
    }

    /* JADX INFO: renamed from: e0 */
    public final void m175676e0() {
        MessageLocation messageLocation = this.f155441C;
        VText vText = this.f155470v;
        if (messageLocation == null) {
            vText.setText("");
        } else {
            vText.setText(messageLocation.name);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public void m175677f0(gsl gslVar) {
        this.f155445G = gslVar;
    }

    /* JADX INFO: renamed from: g0 */
    public void m175678g0(boolean z) {
        this.f155444F = z;
    }

    /* JADX INFO: renamed from: h0 */
    public void m175679h0(PoiGuidePopWindow poiGuidePopWindow) {
        this.f155443E = poiGuidePopWindow;
        this.f155441C = poiGuidePopWindow.location;
    }

    /* JADX INFO: renamed from: i0 */
    public final void m175680i0() {
        Act act = this.f155472x;
        act.startActivity(NewPostLocationAct.m62703V1(act, f155438K));
        this.f155472x.overridePendingTransition(uzb0.f178984i, 0);
    }

    @Override // p149l.aa80.InterfaceC15555a
    /* JADX INFO: renamed from: o */
    public void mo95536o(k90 k90Var) {
        if (k90Var == null) {
            return;
        }
        m175665O(k90Var);
        m175676e0();
        mo112895d0();
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
        this.f155473y = bottomSheetBehaviorFrom;
        bottomSheetBehaviorFrom.setState(3);
        this.f155473y.setBottomSheetCallback(this.f155448J);
        aa80.m95532b().m95533a(this);
        if (NullChecker.m81303a(this.f155445G)) {
            this.f155445G.mo127806b();
        }
        m175646Q();
        if (this.f155447I == null) {
            m175645P();
        }
        i0e.m133797f(this.f155447I);
    }

    /* JADX INFO: renamed from: l.qnh$a */
    public class C19543a extends BottomSheetBehavior.BottomSheetCallback {
        public C19543a() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1) {
                qnh.this.f155473y.setState(3);
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }
    }
}
