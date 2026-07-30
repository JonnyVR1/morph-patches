package p153l;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.Property;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.app.NotificationCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.android.gms.common.api.Api;
import com.google.firebase.messaging.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.p053ui.bubble.C4496a;
import com.p051p1.mobile.android.p053ui.bubble.C4499d;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.BreakIce;
import com.p051p1.mobile.putong.core.data.VerificationCenter;
import com.p051p1.mobile.putong.core.newui.messages.C8291a;
import com.p051p1.mobile.putong.core.p058ui.match.C8618a;
import com.p051p1.mobile.putong.core.p058ui.match.MatchAct;
import com.p051p1.mobile.putong.core.util.CertificationUtil;
import com.p051p1.mobile.putong.core.view.HeartView;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.sunshine.engine.bone.StageView;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.spongycastle.crypto.tls.CipherSuite;
import p137rx.C22421c;
import p151v.VButton;
import p151v.VButton_FakeShadow;
import p151v.VDraweeView;
import p151v.VEditText;
import p151v.VFrame;
import p151v.VIcon;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRecyclerView;
import p151v.VRelative;
import p151v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class xcx implements qyl<xbx> {

    /* JADX INFO: renamed from: A */
    public VLinear f193411A;

    /* JADX INFO: renamed from: B */
    public VText f193412B;

    /* JADX INFO: renamed from: C */
    public VImage f193413C;

    /* JADX INFO: renamed from: D */
    public LinearLayout f193414D;

    /* JADX INFO: renamed from: E */
    public VEditText f193415E;

    /* JADX INFO: renamed from: E0 */
    public int f193416E0;

    /* JADX INFO: renamed from: F */
    public VText f193417F;

    /* JADX INFO: renamed from: F0 */
    public Animator f193418F0;

    /* JADX INFO: renamed from: G */
    public VLinear f193419G;

    /* JADX INFO: renamed from: H */
    public FrameLayout f193421H;

    /* JADX INFO: renamed from: H0 */
    public int f193422H0;

    /* JADX INFO: renamed from: I */
    public SVGAnimationView f193423I;

    /* JADX INFO: renamed from: J */
    public ImageView f193425J;

    /* JADX INFO: renamed from: K */
    public VText f193427K;

    /* JADX INFO: renamed from: L */
    public FrameLayout f193429L;

    /* JADX INFO: renamed from: L0 */
    public boolean f193430L0;

    /* JADX INFO: renamed from: M */
    public SVGAnimationView f193431M;

    /* JADX INFO: renamed from: N */
    public ImageView f193433N;

    /* JADX INFO: renamed from: O */
    public VText f193435O;

    /* JADX INFO: renamed from: P */
    public FrameLayout f193437P;

    /* JADX INFO: renamed from: P0 */
    public f0r f193438P0;

    /* JADX INFO: renamed from: Q */
    public SVGAnimationView f193439Q;

    /* JADX INFO: renamed from: R */
    public ImageView f193441R;

    /* JADX INFO: renamed from: S */
    public VText f193443S;

    /* JADX INFO: renamed from: T */
    public FrameLayout f193445T;

    /* JADX INFO: renamed from: T0 */
    public int f193446T0;

    /* JADX INFO: renamed from: U */
    public SVGAnimationView f193447U;

    /* JADX INFO: renamed from: U0 */
    public C21288g f193448U0;

    /* JADX INFO: renamed from: V */
    public ImageView f193449V;

    /* JADX INFO: renamed from: V0 */
    public LinearLayoutManager f193450V0;

    /* JADX INFO: renamed from: W */
    public VText f193451W;

    /* JADX INFO: renamed from: X */
    public VButton_FakeShadow f193453X;

    /* JADX INFO: renamed from: Y */
    public VButton f193455Y;

    /* JADX INFO: renamed from: Z */
    public MatchAct f193457Z;

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f193458a;

    /* JADX INFO: renamed from: b */
    public SVGAnimationView f193459b;

    /* JADX INFO: renamed from: c */
    public ConstraintLayout f193460c;

    /* JADX INFO: renamed from: d */
    public HeartView f193461d;

    /* JADX INFO: renamed from: e */
    public StageView f193462e;

    /* JADX INFO: renamed from: f */
    public VText f193463f;

    /* JADX INFO: renamed from: g */
    public TextView f193464g;

    /* JADX INFO: renamed from: h */
    public VText f193465h;

    /* JADX INFO: renamed from: i */
    public TextView f193466i;

    /* JADX INFO: renamed from: j */
    public VText f193467j;

    /* JADX INFO: renamed from: k */
    public VRelative f193468k;

    /* JADX INFO: renamed from: k0 */
    public xbx f193469k0;

    /* JADX INFO: renamed from: l */
    public VDraweeView f193470l;

    /* JADX INFO: renamed from: m */
    public SVGAnimationView f193471m;

    /* JADX INFO: renamed from: n */
    public VImage f193472n;

    /* JADX INFO: renamed from: o */
    public Guideline f193473o;

    /* JADX INFO: renamed from: p */
    public VRelative f193474p;

    /* JADX INFO: renamed from: q */
    public VDraweeView f193476q;

    /* JADX INFO: renamed from: r */
    public VImage f193477r;

    /* JADX INFO: renamed from: s */
    public VFrame f193478s;

    /* JADX INFO: renamed from: t */
    public VIcon f193479t;

    /* JADX INFO: renamed from: u */
    public VIcon f193480u;

    /* JADX INFO: renamed from: v */
    public View f193481v;

    /* JADX INFO: renamed from: w */
    public VImage f193482w;

    /* JADX INFO: renamed from: x */
    public VRecyclerView f193483x;

    /* JADX INFO: renamed from: y */
    public TextView f193484y;

    /* JADX INFO: renamed from: z */
    public TextView f193485z;

    /* JADX INFO: renamed from: p0 */
    public boolean f193475p0 = false;

    /* JADX INFO: renamed from: G0 */
    public boolean f193420G0 = false;

    /* JADX INFO: renamed from: I0 */
    public float f193424I0 = 811.0f;

    /* JADX INFO: renamed from: J0 */
    public boolean f193426J0 = true;

    /* JADX INFO: renamed from: K0 */
    public User f193428K0 = null;

    /* JADX INFO: renamed from: M0 */
    public View.OnClickListener f193432M0 = new View.OnClickListener() { // from class: l.jcx
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f120098a.m210361t1(view);
        }
    };

    /* JADX INFO: renamed from: N0 */
    public View.OnClickListener f193434N0 = new View.OnClickListener() { // from class: l.pcx
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f151637a.m210364u1(view);
        }
    };

    /* JADX INFO: renamed from: O0 */
    public View.OnClickListener f193436O0 = new View.OnClickListener() { // from class: l.qcx
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f156634a.m210367v1(view);
        }
    };

    /* JADX INFO: renamed from: Q0 */
    public float f193440Q0 = 1.0f;

    /* JADX INFO: renamed from: R0 */
    public float f193442R0 = 1.0f;

    /* JADX INFO: renamed from: S0 */
    public int f193444S0 = qa00.m175859d(1.0f * 51.0f);

    /* JADX INFO: renamed from: W0 */
    public C4499d f193452W0 = C4499d.m21895l();

    /* JADX INFO: renamed from: X0 */
    public vxd0 f193454X0 = new vxd0("core_match_ice_break_guide_shown_" + CoreModule.m30929H().userId(), 0);

    /* JADX INFO: renamed from: Y0 */
    public Set<String> f193456Y0 = new HashSet();

    /* JADX INFO: renamed from: l.xcx$a */
    public class RunnableC21282a implements Runnable {
        public RunnableC21282a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (xcx.this.getAct() == null) {
                return;
            }
            xcx.this.getAct().m68056e2();
        }
    }

    /* JADX INFO: renamed from: l.xcx$b */
    public class RunnableC21283b implements Runnable {
        public RunnableC21283b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (xcx.this.getAct() == null) {
                return;
            }
            xcx.this.getAct().m68056e2();
        }
    }

    /* JADX INFO: renamed from: l.xcx$c */
    public class C21284c extends RecyclerView.AbstractC0584t {
        public C21284c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                xcx.this.m210405b2(xcx.this.f193450V0.findFirstVisibleItemPosition(), xcx.this.f193450V0.findLastVisibleItemPosition(), "swipe");
            }
        }
    }

    /* JADX INFO: renamed from: l.xcx$d */
    public class RunnableC21285d implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f193489a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ TextView f193490b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f193491c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f193492d;

        public RunnableC21285d(int i, TextView textView, String str, String str2) {
            this.f193489a = i;
            this.f193490b = textView;
            this.f193491c = str;
            this.f193492d = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (gra.m131740r1() && this.f193489a == 44) {
                xcx.this.f193465h.setText("重逢配对");
                xcx.this.f193466i.setText("再次重逢你们依然互相喜欢，去聊聊吧");
                bnl0.m105538V(xcx.this.f193466i, qa00.m175859d(32.0f));
                bnl0.m105539W(xcx.this.f193466i, qa00.m175859d(32.0f));
                xcx.this.f193466i.setTextColor(Color.parseColor("#66E8CA8A"));
                return;
            }
            boolean zM131701j2 = gra.m131701j2();
            xcx xcxVar = xcx.this;
            if (zM131701j2) {
                xcxVar.m210415h2(this.f193490b, this.f193491c, this.f193492d);
            } else {
                xcxVar.m210413g2(this.f193490b, this.f193491c, this.f193492d);
            }
        }
    }

    /* JADX INFO: renamed from: l.xcx$g */
    public class C21288g extends jic0<BreakIce> {

        /* JADX INFO: renamed from: c */
        public List<BreakIce> f193497c;

        public C21288g() {
            this.f193497c = new ArrayList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: H */
        public /* synthetic */ void m210431H(BreakIce breakIce, View view) {
            i4g0.m138523u("e_breakice_content", xcx.this.getAct().pageId(), jyb.m147494Y("actor_user_id", CoreModule.m30929H().userId()), jyb.m147494Y(Constants.MessagePayloadKeys.MSGID_SERVER, breakIce.tipId), jyb.m147494Y("chat_content", breakIce.content));
            xcx.this.f193469k0.m210067a2(breakIce, xcx.this.f193469k0.m148775o0());
            CoreModule.f18264c.f20381e0.m116474I9(xcx.this.f193469k0.m148775o0(), breakIce.tipId);
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: C */
        public int getPageCount() {
            return this.f193497c.size();
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: D */
        public View mo29824D(ViewGroup viewGroup, int i) {
            return p9r.m171370a(xcx.this.getContext()).inflate(kec0.f125896j7, (ViewGroup) null, false);
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public void mo29822A(View view, final BreakIce breakIce, int i, int i2) {
            TextView textView = (TextView) view.findViewById(adc0.f70124Sd);
            textView.setText(breakIce.content);
            bnl0.m105509E0(textView, new View.OnClickListener() { // from class: l.ycx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f198554a.m210431H(breakIce, view2);
                }
            });
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public BreakIce getItem(int i) {
            return this.f193497c.get(i);
        }

        /* JADX INFO: renamed from: I */
        public void m210434I(List<BreakIce> list) {
            if (jyb.m147479J(list)) {
                return;
            }
            this.f193497c.clear();
            this.f193497c.addAll(list);
            notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: l.xcx$h */
    public static class C21289h {
        /* JADX INFO: renamed from: b */
        public static void m210436b(xcx xcxVar, View view) {
            xcxVar.f193458a = (ConstraintLayout) view;
            ViewGroup viewGroup = (ViewGroup) view;
            xcxVar.f193459b = (SVGAnimationView) viewGroup.getChildAt(0);
            xcxVar.f193460c = (ConstraintLayout) viewGroup.getChildAt(1);
            xcxVar.f193461d = (HeartView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
            xcxVar.f193462e = (StageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
            xcxVar.f193463f = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
            xcxVar.f193464g = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
            xcxVar.f193465h = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
            xcxVar.f193466i = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
            xcxVar.f193467j = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6);
            xcxVar.f193468k = (VRelative) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(7);
            xcxVar.f193470l = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(7)).getChildAt(0);
            xcxVar.f193471m = (SVGAnimationView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(7)).getChildAt(1);
            xcxVar.f193472n = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(7)).getChildAt(2);
            xcxVar.f193473o = (Guideline) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(8);
            xcxVar.f193474p = (VRelative) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(9);
            xcxVar.f193476q = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(9)).getChildAt(0);
            xcxVar.f193477r = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(9)).getChildAt(1);
            xcxVar.f193478s = (VFrame) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(9)).getChildAt(2);
            xcxVar.f193479t = (VIcon) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(9)).getChildAt(2)).getChildAt(0);
            xcxVar.f193480u = (VIcon) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(9)).getChildAt(2)).getChildAt(1);
            xcxVar.f193481v = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(9)).getChildAt(3);
            xcxVar.f193482w = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(9)).getChildAt(4);
            xcxVar.f193483x = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(10);
            xcxVar.f193484y = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(11);
            xcxVar.f193485z = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(12);
            xcxVar.f193411A = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(13);
            xcxVar.f193412B = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(13)).getChildAt(0);
            xcxVar.f193413C = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(13)).getChildAt(1);
            xcxVar.f193414D = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(14);
            xcxVar.f193415E = (VEditText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(14)).getChildAt(0);
            xcxVar.f193417F = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(14)).getChildAt(1);
            xcxVar.f193419G = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(15);
            xcxVar.f193421H = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(15)).getChildAt(0);
            xcxVar.f193423I = (SVGAnimationView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(15)).getChildAt(0)).getChildAt(0);
            xcxVar.f193425J = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(15)).getChildAt(0)).getChildAt(1);
            xcxVar.f193427K = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(15)).getChildAt(0)).getChildAt(2);
            xcxVar.f193429L = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(15)).getChildAt(2);
            xcxVar.f193431M = (SVGAnimationView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(15)).getChildAt(2)).getChildAt(0);
            xcxVar.f193433N = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(15)).getChildAt(2)).getChildAt(1);
            xcxVar.f193435O = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(15)).getChildAt(2)).getChildAt(2);
            xcxVar.f193437P = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(15)).getChildAt(4);
            xcxVar.f193439Q = (SVGAnimationView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(15)).getChildAt(4)).getChildAt(0);
            xcxVar.f193441R = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(15)).getChildAt(4)).getChildAt(1);
            xcxVar.f193443S = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(15)).getChildAt(4)).getChildAt(2);
            xcxVar.f193445T = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(15)).getChildAt(6);
            xcxVar.f193447U = (SVGAnimationView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(15)).getChildAt(6)).getChildAt(0);
            xcxVar.f193449V = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(15)).getChildAt(6)).getChildAt(1);
            xcxVar.f193451W = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(15)).getChildAt(6)).getChildAt(2);
            xcxVar.f193453X = (VButton_FakeShadow) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(16);
            xcxVar.f193455Y = (VButton) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(17);
        }

        /* JADX INFO: renamed from: c */
        public static View m210437c(xcx xcxVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(kec0.f125930l7, viewGroup, false);
            m210436b(xcxVar, viewInflate);
            return viewInflate;
        }
    }

    public xcx(MatchAct matchAct) {
        this.f193457Z = matchAct;
    }

    /* JADX INFO: renamed from: W0 */
    private void m210317W0() {
        m210398V0(false);
    }

    /* JADX INFO: renamed from: Y1 */
    private void m210320Y1() {
        bnl0.m105524M(this.f193477r, true);
        boolean zM114685j0 = d79.m114685j0();
        VImage vImage = this.f193477r;
        if (zM114685j0) {
            vImage.setImageDrawable(j26.m143192e(getAct(), dbc0.f86889ce));
        } else {
            vImage.setImageDrawable(j26.m143192e(getAct(), dbc0.f86856be));
        }
    }

    /* JADX INFO: renamed from: Z1 */
    private void m210322Z1() {
        bnl0.m105524M(this.f193472n, true);
        boolean zM114685j0 = d79.m114685j0();
        VImage vImage = this.f193472n;
        if (zM114685j0) {
            vImage.setImageDrawable(j26.m143192e(getAct(), dbc0.f86889ce));
        } else {
            vImage.setImageDrawable(j26.m143192e(getAct(), dbc0.f86856be));
        }
    }

    /* JADX INFO: renamed from: a2 */
    private void m210325a2() {
        getAct();
        ArrayList<Act.C4450r> arrayList = Act.globalLifeCycle_().get(Integer.valueOf(getAct().getTaskId()));
        if (arrayList == null) {
            this.f193469k0.m210078s1();
            return;
        }
        Activity activity = arrayList.size() > 0 ? arrayList.get(0).f16062a.get() : null;
        if (activity == null || activity.getWindow() == null || activity.getWindow().getDecorView() == null || activity.getWindow().getDecorView().getWidth() <= 0 || activity.getWindow().getDecorView().getHeight() <= 0) {
            this.f193469k0.m210078s1();
        } else {
            z7x.m218924a(activity, getAct(), 0);
        }
    }

    /* JADX INFO: renamed from: c2 */
    private void m210330c2() {
        int i;
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        Settings settings = userM116600p9.settings;
        boolean z = NullChecker.m82486a(userM116600p9) && NullChecker.m82486a(settings) && uqb0.f180396b0.f170324a.mo29171rq(settings.getSettingGroup()) && NullChecker.m82486a(this.f193428K0) && NullChecker.m82486a(this.f193428K0.settings) && NullChecker.m82486a(this.f193428K0.settings.getSettingGroup().gender.newGender);
        String language = Locale.getDefault().getLanguage();
        language.getClass();
        switch (language) {
            case "in":
                if (z) {
                    i = dbc0.f86370M9;
                    break;
                } else {
                    i = dbc0.f86626U9;
                    break;
                }
                break;
            case "ja":
                if (z) {
                    i = dbc0.f86402N9;
                    break;
                } else {
                    i = dbc0.f86658V9;
                    break;
                }
                break;
            case "ko":
                if (z) {
                    i = dbc0.f86434O9;
                    break;
                } else {
                    i = dbc0.f86690W9;
                    break;
                }
                break;
            case "th":
                if (z) {
                    i = dbc0.f86466P9;
                    break;
                } else {
                    i = dbc0.f86722X9;
                    break;
                }
                break;
            case "vi":
                if (z) {
                    i = dbc0.f86498Q9;
                    break;
                } else {
                    i = dbc0.f86754Y9;
                    break;
                }
                break;
            case "zh":
                if (Locale.getDefault().getCountry() != "TW" && Locale.getDefault().getCountry() != "HK" && Locale.getDefault().getCountry() != "MO") {
                    i = !z ? dbc0.f86786Z9 : dbc0.f86530R9;
                    break;
                } else {
                    if (!z) {
                        i = dbc0.f86819aa;
                    } else {
                        i = dbc0.f86562S9;
                    }
                    break;
                }
                break;
            default:
                if (z) {
                    i = dbc0.f86338L9;
                    break;
                } else {
                    i = dbc0.f86594T9;
                    break;
                }
                break;
        }
        this.f193482w.setBackgroundResource(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m1 */
    public /* synthetic */ void m210349m1(View view) {
        getAct().hideInput();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t1 */
    public /* synthetic */ void m210361t1(View view) {
        sfj0.m185596c("e_matched_later", "p_successful_match_view", sfj0.C20032a.m185615h("match_source", this.f193469k0.m148776p0(getAct().f31317e)));
        getAct().f31321i = true;
        this.f193469k0.m210066Z1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u1 */
    public /* synthetic */ void m210364u1(View view) {
        if (this.f193426J0) {
            i4g0.m138520r("e_matched_share", "p_successful_match_view");
            this.f193469k0.m210070d2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v1 */
    public /* synthetic */ void m210367v1(View view) {
        sfj0.m185596c("e_matched_send_message", getAct().pageId(), new sfj0.C20032a[0]);
        String strTrim = this.f193415E.getText().toString().trim();
        if (gra.m131701j2()) {
            d810.m114776i(getAct(), this.f193428K0, strTrim, true, new RunnableC21282a(), this.f193469k0.f193232i);
        } else {
            this.f193469k0.m210069c2(strTrim, this.f193475p0);
        }
    }

    /* JADX INFO: renamed from: A1 */
    public final /* synthetic */ void m210376A1(View view) {
        sfj0.m185596c("e_intl_instantmatch_no_ultra_click", getAct().pageId(), new sfj0.C20032a[0]);
        if (!joa.m146354D3()) {
            this.f193469k0.m210072f2(false);
        } else if (C8618a.m48771w().m48772A()) {
            C8618a.m48771w().m48781J(getAct(), this.f193428K0, new x20() { // from class: l.ecx
                @Override // p153l.x20
                public final void call() {
                    this.f93115a.m210429z1();
                }
            });
        } else {
            o1j0.m165624F(getAct(), getAct().getString(R$string.f19703u9));
            getAct().m68056e2();
        }
    }

    /* JADX INFO: renamed from: B1 */
    public final /* synthetic */ void m210377B1(View view) {
        sfj0.m185596c("e_intl_instantmatch_no_ultra_giveup", getAct().pageId(), new sfj0.C20032a[0]);
        getAct().m68056e2();
    }

    @Override // p153l.iam
    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f193457Z;
    }

    /* JADX INFO: renamed from: C1 */
    public final /* synthetic */ void m210378C1(View view) {
        sfj0.m185596c("e_intl_match_sayhi", getAct().pageId(), new sfj0.C20032a[0]);
        this.f193469k0.m210071e2(false);
    }

    /* JADX INFO: renamed from: E1 */
    public final /* synthetic */ void m210379E1(View view) {
        getAct().m68056e2();
    }

    /* JADX INFO: renamed from: F1 */
    public final /* synthetic */ void m210380F1(int i, View view) {
        if (i == 43) {
            this.f193469k0.m210076j2(false);
        } else {
            getAct().m68056e2();
        }
    }

    /* JADX INFO: renamed from: G1 */
    public final /* synthetic */ void m210381G1(View view) {
        getAct().m68056e2();
    }

    /* JADX INFO: renamed from: H1 */
    public final /* synthetic */ void m210382H1(User user, View view) {
        VerificationCenter verificationCenterM32615k4 = CoreModule.f18264c.f20294B0.m32615k4();
        if (NullChecker.m82486a(verificationCenterM32615k4) && TEnum.equals(verificationCenterM32615k4.picVerificationInfo.status, "verified")) {
            r1j0.m179420g("已认证");
        } else if (NullChecker.m82486a(verificationCenterM32615k4) && TEnum.equals(verificationCenterM32615k4.picVerificationInfo.status, "pending")) {
            r1j0.m179420g("正在审核中");
        } else {
            pq4.m173309q(getAct());
        }
        i4g0.m138523u("e_successful_match_view_verification", "p_successful_match_view", jyb.m147494Y("receiver_user_id", user.f56859id));
    }

    /* JADX INFO: renamed from: I1 */
    public final /* synthetic */ void m210383I1(ValueAnimator valueAnimator) {
        this.f193461d.setPercent(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: renamed from: J1 */
    public final /* synthetic */ void m210384J1(View view) {
        m210406d1("[" + getAct().getString(R$string.f18522Hj) + com.clevertap.android.sdk.Constants.AES_SUFFIX, "NEW_EMOJI_HAHE", 1);
    }

    /* JADX INFO: renamed from: K1 */
    public final /* synthetic */ void m210385K1(View view) {
        m210406d1("[" + getAct().getString(R$string.f18491Gj) + com.clevertap.android.sdk.Constants.AES_SUFFIX, "NEW_EMOJI_BEER", 2);
    }

    /* JADX INFO: renamed from: L1 */
    public final /* synthetic */ void m210386L1(View view) {
        m210406d1("[" + getAct().getString(R$string.f19357j4) + com.clevertap.android.sdk.Constants.AES_SUFFIX, "EMOJI_70", 3);
    }

    /* JADX INFO: renamed from: M1 */
    public final /* synthetic */ void m210387M1(View view) {
        m210406d1("[" + getAct().getString(R$string.f19328i4) + com.clevertap.android.sdk.Constants.AES_SUFFIX, "EMOJI_63", 4);
    }

    /* JADX INFO: renamed from: O1 */
    public final void m210388O1(User user, int i, ArrayList<String> arrayList) {
        String str;
        if (i == 15) {
            this.f193466i.setText(R$string.f18808R1);
        } else if (i == 12 || i == 11 || i == 13) {
            if (i == 12) {
                m210407d2(this.f193466i, getAct().getString(R$string.f18987X0), user.name, i);
            } else if (i == 13) {
                m210407d2(this.f193466i, getAct().getString(R$string.f18505H2), user.name, i);
            } else if (i == 11) {
                m210407d2(this.f193466i, getAct().getString(R$string.f18957W0), user.name, i);
            }
        } else if (i == 0 || i == 39 || i == 37 || i == 38 || i == 47 || i == 10) {
            m210407d2(this.f193466i, getAct().getString(R$string.f19218ei), user.name, i);
        } else if (i == 1) {
            if (arrayList.size() > 0) {
                str = user.name + " (" + arrayList.get(0) + ")";
            } else {
                str = user.name;
            }
            m210407d2(this.f193466i, getAct().getString(R$string.f18799Qm), str, i);
        } else if (i == 26) {
            m210407d2(this.f193466i, getAct().getString(R$string.f19218ei), user.name, i);
        }
        if (this.f193426J0) {
            return;
        }
        m210407d2(this.f193466i, getAct().getString(R$string.f18841S4), user.name, i);
    }

    /* JADX INFO: renamed from: P1 */
    public final Animator m210389P1(int i) {
        return gt0.m132180z(m210419k2(i, 500, qa00.m175859d(this.f193440Q0 * 40.0f), 0), m210396U0(500, 0, 1), gt0.m132166l(this.f193464g, View.ALPHA, 0L, 500L, new DecelerateInterpolator(), 0.0f, 1.0f), gt0.m132166l(this.f193464g, View.TRANSLATION_Y, 0L, 500L, new DecelerateInterpolator(), qa00.m175859d(40.0f), 0.0f));
    }

    /* JADX INFO: renamed from: Q1 */
    public void m210390Q1() {
        this.f193453X.setClickable(false);
    }

    /* JADX INFO: renamed from: R1 */
    public final Animator m210391R1() {
        this.f193468k.setTranslationX(-qa00.m175859d(this.f193442R0 * 108.0f));
        this.f193474p.setTranslationX(qa00.m175859d(this.f193442R0 * 108.0f));
        fzf0 fzf0Var = new fzf0(0.4f);
        VRelative vRelative = this.f193468k;
        Property property = View.TRANSLATION_X;
        Animator animatorM132166l = gt0.m132166l(vRelative, property, 200L, 700L, fzf0Var, (-qa00.m175859d(108.0f)) * this.f193442R0, qa00.m175859d(30.0f) * this.f193442R0);
        Animator animatorM132166l2 = gt0.m132166l(this.f193474p, property, 200L, 700L, fzf0Var, qa00.m175859d(108.0f) * this.f193442R0, (-qa00.m175859d(30.0f)) * this.f193442R0);
        VRelative vRelative2 = this.f193468k;
        Property property2 = View.ALPHA;
        Animator animatorM132180z = gt0.m132180z(animatorM132166l, animatorM132166l2, gt0.m132166l(vRelative2, property2, 0L, 200L, new AccelerateInterpolator(), 0.0f, 1.0f), gt0.m132166l(this.f193474p, property2, 0L, 200L, new AccelerateInterpolator(), 0.0f, 1.0f));
        this.f193418F0 = animatorM132180z;
        return animatorM132180z;
    }

    /* JADX INFO: renamed from: S0 */
    public View m210392S0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C21289h.m210437c(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: S1 */
    public void m210393S1(List<BreakIce> list) {
        bnl0.m105525M0(this.f193483x, true);
        this.f193450V0 = (LinearLayoutManager) this.f193483x.getLayoutManager();
        C21288g c21288g = new C21288g();
        this.f193448U0 = c21288g;
        this.f193483x.setAdapter(c21288g);
        this.f193448U0.m210434I(list);
        bnl0.m105533Q0(this.f193483x, new y20() { // from class: l.acx
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f69767a.m210427w1((int[]) obj);
            }
        });
        this.f193483x.addOnScrollListener(new C21284c());
        int iM175859d = qa00.m175859d(this.f193440Q0 * 100.0f);
        this.f193446T0 = iM175859d;
        bnl0.m105540X(this.f193414D, iM175859d);
        bnl0.m105537U(this.f193483x, qa00.m175859d(this.f193440Q0 * 10.0f));
        m210395T1();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
    public MatchAct getAct() {
        return this.f193457Z;
    }

    /* JADX INFO: renamed from: T1 */
    public final void m210395T1() {
        if (this.f193454X0.get().intValue() >= gra.m131682f3()) {
            return;
        }
        getAct().duringCreated(C22421c.timer(2L, TimeUnit.SECONDS)).observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.fcx
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f98301a.m210428y1((Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U0 */
    public final Animator m210396U0(int i, int i2, int i3) {
        DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
        if (gra.m131701j2()) {
            TextView textView = this.f193466i;
            Property property = View.ALPHA;
            long j = i;
            float f = i2;
            float f2 = i3;
            return gt0.m132180z(gt0.m132166l(textView, property, 0L, j, decelerateInterpolator, f, f2), gt0.m132166l(this.f193467j, property, 0L, j, decelerateInterpolator, f, f2));
        }
        VText vText = this.f193465h;
        Property property2 = View.ALPHA;
        long j2 = i;
        float f3 = i2;
        float f4 = i3;
        return gt0.m132180z(gt0.m132166l(vText, property2, 0L, j2, decelerateInterpolator, f3, f4), gt0.m132166l(this.f193466i, property2, 0L, j2, decelerateInterpolator, f3, f4));
    }

    /* JADX INFO: renamed from: U1 */
    public void m210397U1(User user, final User user2, final int i, ArrayList<String> arrayList) {
        String str;
        if (user == null || user2 == null) {
            NullChecker.m82487b(user);
            NullChecker.m82487b(user2);
            getAct().m68056e2();
            return;
        }
        if (this.f193469k0.m210077r1() == 50 || this.f193469k0.m210077r1() == 51) {
            this.f193461d.m60720d("https://auto.tancdn.com/v1/images/eyJpZCI6IjU0SU1CU0ZaRktSNkJSTTY2UEpXUklTTkdNQlo2UzE0IiwidyI6MTUzNSwiaCI6MTM0MywiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjg2ODY1NzI1MzAwODg4OTEzOX0.png");
            this.f193461d.setBackgroundColor(Color.parseColor("#F3E1FF"));
        } else {
            this.f193461d.m60719c();
        }
        this.f193428K0 = user2;
        if (this.f193469k0.m210077r1() == 40) {
            uqb0.f180374G.m127115L0(this.f193470l, user.m61308fp().profileBig().formatted());
            this.f193485z.setText(getAct().getResources().getText(user2.isFemale() ? R$string.f19188di : R$string.f19157ci));
            uqb0.f180374G.m127120O(this.f193476q, user2.m61308fp().profileBig().formatted(), 4, 30);
            return;
        }
        if (this.f193469k0.m210077r1() == 41) {
            uqb0.f180374G.m127109I0(this.f193470l, user.m61308fp().profileMiddle().formatted(), CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA256, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA256);
            if (wj90.m206620c(user2)) {
                uqb0.f180374G.m127120O(this.f193476q, user2.m61308fp().profileBig().formatted(), 4, 30);
            } else {
                uqb0.f180374G.m127109I0(this.f193476q, user2.m61308fp().profileMiddle().formatted(), CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA256, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA256);
            }
            this.f193466i.setText(String.format("开通黑金会员立即与%s聊天！", user2.isFemale() ? "她" : "他"));
            this.f193485z.setText(getAct().getResources().getText(user2.isFemale() ? R$string.f19188di : R$string.f19157ci));
            return;
        }
        boolean z = false;
        if (this.f193469k0.m210077r1() == 50) {
            bnl0.m105524M(this.f193414D, false);
            bnl0.m105524M(this.f193453X, false);
            bnl0.m105524M(this.f193455Y, false);
            bnl0.m105524M(this.f193484y, true);
            bnl0.m105524M(this.f193485z, true);
            bnl0.m105524M(this.f193482w, true);
            bnl0.m105524M(this.f193464g, true);
            this.f193464g.setText(getAct().getString(R$string.f18922Up));
            this.f193465h.setText(getAct().getString(R$string.f19741vg));
            this.f193465h.setAutoSizeTextTypeWithDefaults(1);
            this.f193466i.setText(String.format(getAct().getString(R$string.f19710ug), user2.name));
            this.f193466i.setMaxLines(Api.BaseClientBuilder.API_PRIORITY_OTHER);
            e1b.m118959Q0(this.f193466i, R$string.f19710ug);
            this.f193466i.setTextColor(Color.parseColor("#66000000"));
            bnl0.m105505C0(this.f193484y, qa00.m175859d(this.f193440Q0 * 56.0f));
            this.f193484y.setText(getAct().getString(R$string.f19648sg));
            this.f193484y.setTextSize(this.f193440Q0 * 16.0f);
            this.f193484y.setBackgroundResource(dbc0.f87147kb);
            this.f193484y.setTextColor(Color.parseColor("#F9E7FF"));
            bnl0.m105505C0(this.f193485z, qa00.m175859d(this.f193440Q0 * 56.0f));
            this.f193485z.setText(getAct().getString(R$string.f19679tg));
            this.f193485z.setTextSize(this.f193440Q0 * 16.0f);
            sfj0.m185601h("e_intl_instantmatch_no_ultra_click", getAct().pageId(), new sfj0.C20032a[0]);
            sfj0.m185601h("e_intl_instantmatch_no_ultra_giveup", getAct().pageId(), new sfj0.C20032a[0]);
            this.f193484y.setOnClickListener(new View.OnClickListener() { // from class: l.rcx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f162261a.m210376A1(view);
                }
            });
            this.f193485z.setOnClickListener(new View.OnClickListener() { // from class: l.scx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f167356a.m210377B1(view);
                }
            });
            uqb0.f180374G.m127111J0(this.f193470l, user.m61308fp().profileMiddle(), false);
            uqb0.f180374G.m127111J0(this.f193476q, user2.m61308fp().profileMiddle(), false);
            return;
        }
        if (i == 48 || i == 49) {
            bnl0.m105524M(this.f193414D, false);
            bnl0.m105524M(this.f193453X, false);
            bnl0.m105524M(this.f193455Y, false);
            bnl0.m105524M(this.f193484y, true);
            bnl0.m105524M(this.f193485z, true);
            bnl0.m105524M(this.f193482w, true);
            bnl0.m105524M(this.f193464g, true);
            m210330c2();
            this.f193464g.setText(getAct().getString(R$string.f18922Up));
            this.f193465h.setText(getAct().getString(R$string.f18908Ub));
            this.f193465h.setAutoSizeTextTypeWithDefaults(1);
            this.f193466i.setText(getAct().getString(R$string.f19675tc));
            this.f193466i.setTextColor(Color.parseColor("#66000000"));
            bnl0.m105505C0(this.f193484y, qa00.m175859d(this.f193440Q0 * 56.0f));
            this.f193484y.setText(getAct().getString(R$string.f19613rc));
            this.f193484y.setTextSize(this.f193440Q0 * 16.0f);
            this.f193484y.setTextColor(Color.parseColor("#FF4B72"));
            bnl0.m105505C0(this.f193485z, qa00.m175859d(this.f193440Q0 * 56.0f));
            this.f193485z.setText(getAct().getString(R$string.f19644sc));
            this.f193485z.setTextSize(this.f193440Q0 * 16.0f);
            this.f193484y.setOnClickListener(new View.OnClickListener() { // from class: l.tcx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f173286a.m210378C1(view);
                }
            });
            this.f193485z.setOnClickListener(new View.OnClickListener() { // from class: l.ucx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f178470a.m210379E1(view);
                }
            });
            uqb0.f180374G.m127111J0(this.f193470l, user.m61308fp().profileMiddle(), false);
            uqb0.f180374G.m127111J0(this.f193476q, user2.m61308fp().profileMiddle(), false);
            return;
        }
        if (i == 42 || i == 43) {
            bnl0.m105524M(this.f193414D, false);
            bnl0.m105524M(this.f193453X, false);
            bnl0.m105524M(this.f193455Y, false);
            bnl0.m105524M(this.f193484y, true);
            bnl0.m105524M(this.f193485z, true);
            this.f193464g.setText("Congratulations！");
            this.f193465h.setText("互相喜欢");
            this.f193466i.setText(String.format("开通SVIP会员立即和%s聊天！", user2.isFemale() ? "她" : "他"));
            bnl0.m105505C0(this.f193484y, qa00.m175859d(this.f193440Q0 * 56.0f));
            this.f193484y.setText(i == 43 ? "发消息" : "确定");
            this.f193484y.setTextSize(this.f193440Q0 * 16.0f);
            bnl0.m105505C0(this.f193485z, qa00.m175859d(this.f193440Q0 * 56.0f));
            TextView textView = this.f193485z;
            if (i == 43) {
                str = String.format("放弃%s", user2.isFemale() ? "她" : "他");
            } else {
                str = "继续探索";
            }
            textView.setText(str);
            this.f193485z.setTextSize(this.f193440Q0 * 16.0f);
            this.f193484y.setOnClickListener(new View.OnClickListener() { // from class: l.vcx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f183497a.m210380F1(i, view);
                }
            });
            this.f193485z.setOnClickListener(new View.OnClickListener() { // from class: l.wcx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f188516a.m210381G1(view);
                }
            });
            uqb0.f180374G.m127111J0(this.f193470l, user.m61308fp().profileMiddle(), false);
            uqb0.f180374G.m127111J0(this.f193476q, user2.m61308fp().profileMiddle(), false);
            return;
        }
        if (i == 47) {
            this.f193464g.setText(getAct().getString(R$string.f18922Up));
            this.f193465h.setText(getAct().getString(R$string.f18908Ub));
            this.f193465h.setAutoSizeTextTypeWithDefaults(1);
            this.f193466i.setTextColor(Color.parseColor("#66000000"));
            bnl0.m105524M(this.f193482w, true);
            m210330c2();
            uqb0.f180374G.m127111J0(this.f193470l, user.m61308fp().profileMiddle(), false);
            uqb0.f180374G.m127111J0(this.f193476q, user2.m61308fp().profileMiddle(), false);
        } else {
            uqb0.f180374G.m127111J0(this.f193470l, user.m61308fp().profileMiddle(), false);
            uqb0.f180374G.m127111J0(this.f193476q, user2.m61308fp().profileMiddle(), false);
        }
        if (i == 51) {
            this.f193466i.setText(getAct().getString(R$string.f19772wg, user2.name));
            this.f193466i.setMaxLines(Api.BaseClientBuilder.API_PRIORITY_OTHER);
            e1b.m118959Q0(this.f193466i, R$string.f19772wg);
            this.f193417F.setTextColor(Color.parseColor("#33000000"));
            qnp0.m177262e1(this.f193415E, dbc0.f86872bu);
        }
        if (C8291a.m42842p(user2.f56859id)) {
            this.f193426J0 = false;
            bnl0.m105525M0(this.f193464g, false);
            this.f193453X.setText(R$string.f18781Q4);
            this.f193455Y.setCompoundDrawables(null, null, null, null);
            this.f193455Y.setCompoundDrawablePadding(qa00.m175859d(0.0f));
            this.f193455Y.setText(R$string.f18811R4);
            this.f193415E.setHint(R$string.f18871T4);
            this.f193465h.setText(R$string.f18901U4);
            bnl0.m105525M0(this.f193468k, false);
            this.f193474p.setTranslationX(-qa00.m175859d(this.f193442R0 * 95.0f));
        }
        m210388O1(user2, i, arrayList);
        if (gra.m131701j2()) {
            m210401X1(user2);
            bnl0.m105524M(this.f193419G, true);
            sfj0.m185601h("e_match_emoji", "p_successful_match_view", sfj0.C20032a.m185613f("emoji_quantity", 4));
        }
        if (gra.m131740r1() && i == 44) {
            this.f193465h.setText("重逢配对");
            this.f193466i.setText("再次重逢你们依然互相喜欢，去聊聊吧");
            bnl0.m105538V(this.f193466i, qa00.m175859d(32.0f));
            bnl0.m105539W(this.f193466i, qa00.m175859d(32.0f));
        }
        if (this.f193426J0) {
            this.f193468k.setTranslationX(qa00.m175859d(30.0f));
            this.f193474p.setTranslationX(-qa00.m175859d(30.0f));
        }
        if (nrb0.m164466b() && !CertificationUtil.m59336l() && user2.isPicVerificationVerified()) {
            z = true;
        }
        this.f193430L0 = z;
        if (z) {
            bnl0.m105540X(this.f193414D, qa00.m175859d(this.f193440Q0 * 64.0f));
            bnl0.m105509E0(this.f193411A, new View.OnClickListener() { // from class: l.zbx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f203710a.m210382H1(user2, view);
                }
            });
            bnl0.m105524M(this.f193411A, true);
            i4g0.m138492A("e_successful_match_view_verification", "p_successful_match_view", jyb.m147494Y("receiver_user_id", user2.f56859id));
        }
    }

    /* JADX INFO: renamed from: V0 */
    public void m210398V0(boolean z) {
        Animator animatorM132164j;
        int i = this.f193446T0;
        if (i > 0) {
            LinearLayout linearLayout = this.f193414D;
            if (z) {
                bnl0.m105540X(linearLayout, this.f193444S0);
                if (gra.m131681f2()) {
                    bnl0.m105525M0(this.f193483x, false);
                }
            } else {
                bnl0.m105540X(linearLayout, i);
                if (gra.m131681f2()) {
                    bnl0.m105525M0(this.f193483x, true);
                }
            }
        }
        Integer num = Act.savedKeyboardHeight.get();
        int bottom = qa00.m175858c().heightPixels - this.f193414D.getBottom();
        if (this.f193422H0 + bottom < num.intValue() + qa00.m175859d(this.f193440Q0 * 50.0f)) {
            this.f193422H0 = (num.intValue() - bottom) + qa00.m175859d(this.f193440Q0 * 50.0f);
        }
        this.f193420G0 = z;
        int measuredWidth = this.f193468k.getMeasuredWidth();
        gt0.m132180z(m210419k2(-1, 300, z ? 0 : -qa00.m175859d(this.f193440Q0 * 40.0f), z ? -qa00.m175859d(this.f193440Q0 * 40.0f) : 0), m210396U0(300, z ? 1 : 0, !z ? 1 : 0)).start();
        VImage vImage = this.f193472n;
        if (z) {
            Property property = View.ALPHA;
            gt0.m132166l(vImage, property, 0L, 300L, new DecelerateInterpolator(), 1.0f, 0.0f).start();
            gt0.m132166l(this.f193477r, property, 0L, 300L, new DecelerateInterpolator(), 1.0f, 0.0f).start();
        } else {
            Property property2 = View.ALPHA;
            gt0.m132166l(vImage, property2, 0L, 300L, new DecelerateInterpolator(), 0.0f, 1.0f).start();
            gt0.m132166l(this.f193477r, property2, 0L, 300L, new DecelerateInterpolator(), 0.0f, 1.0f).start();
        }
        VRelative vRelative = this.f193468k;
        Property property3 = View.TRANSLATION_X;
        Animator animatorM132168n = gt0.m132168n(vRelative, property3, z ? qa00.m175859d(34.0f) : measuredWidth / 2, z ? measuredWidth / 2 : qa00.m175859d(34.0f));
        VRelative vRelative2 = this.f193468k;
        Property property4 = View.TRANSLATION_Y;
        Animator animatorM132168n2 = gt0.m132168n(vRelative2, property4, z ? 0.0f : -(this.f193422H0 - qa00.m175859d(this.f193440Q0 * 20.0f)), z ? -(this.f193422H0 - qa00.m175859d(this.f193440Q0 * 20.0f)) : 0.0f);
        Animator animatorM132168n3 = gt0.m132168n(this.f193474p, property4, z ? 0.0f : -(this.f193422H0 - qa00.m175859d(this.f193440Q0 * 20.0f)), z ? -(this.f193422H0 - qa00.m175859d(this.f193440Q0 * 20.0f)) : 0.0f);
        Animator animatorM132168n4 = gt0.m132168n(this.f193474p, View.SCALE_X, z ? 1.0f : 1.01f, z ? 1.01f : 1.0f);
        Animator animatorM132168n5 = gt0.m132168n(this.f193474p, View.SCALE_Y, z ? 1.0f : 1.01f, z ? 1.01f : 1.0f);
        Animator animatorM132168n6 = gt0.m132168n(this.f193414D, property4, z ? 0.0f : -this.f193422H0, z ? -this.f193422H0 : 0.0f);
        Animator animatorM132164j2 = gt0.m132164j(0);
        if (this.f193426J0) {
            animatorM132164j = gt0.m132168n(this.f193474p, property3, z ? -qa00.m175859d(34.0f) : (-measuredWidth) / 2, z ? (-measuredWidth) / 2 : -qa00.m175859d(34.0f));
        } else {
            animatorM132164j = gt0.m132164j(0);
        }
        Animator animatorM132180z = gt0.m132180z((Animator[]) Arrays.asList(animatorM132168n, animatorM132168n2, animatorM132168n3, animatorM132168n4, animatorM132168n5, animatorM132168n6, animatorM132164j2, animatorM132164j).toArray(new Animator[0]));
        animatorM132180z.setInterpolator(new DecelerateInterpolator());
        animatorM132180z.setDuration(300L);
        animatorM132180z.addListener(new C21286e(z));
        animatorM132180z.start();
    }

    /* JADX INFO: renamed from: V1 */
    public final void m210399V1() {
        if (this.f193469k0.m210077r1() == 50 || this.f193469k0.m210077r1() == 51) {
            bnl0.m105524M(this.f193461d, false);
            bnl0.m105524M(this.f193462e, false);
            SVGALoader.with(getAct()).from("https://auto.tancdn.com/v1/raw/7036ab37-664e-486d-a3b1-3162a0f94c9214.svga").autoPlay(true).repeatCount(1).into(this.f193459b);
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ybx
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f198368a.m210383I1(valueAnimator);
            }
        });
        valueAnimatorOfFloat.setInterpolator(new OvershootInterpolator());
        valueAnimatorOfFloat.setDuration(500L);
        valueAnimatorOfFloat.start();
        SVGALoader.with(getAct()).from("https://auto.tancdn.com/v1/raw/45411073-a242-4383-adb6-d088856a7c6a10.so").autoPlay(true).repeatCount(1).into(this.f193459b);
        this.f193462e.m82101d("animations/match_heart_success/config.xml", "animations/match_heart_success/pic");
    }

    /* JADX INFO: renamed from: X0 */
    public final void m210400X0(int i) {
        m210398V0(true);
    }

    /* JADX INFO: renamed from: X1 */
    public final void m210401X1(User user) {
        String strM210408e1 = m210408e1(user);
        boolean zIsEmpty = TextUtils.isEmpty(strM210408e1);
        VText vText = this.f193467j;
        if (zIsEmpty) {
            bnl0.m105524M(vText, false);
        } else {
            vText.setText(strM210408e1);
        }
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(xbx xbxVar) {
        this.f193469k0 = xbxVar;
    }

    /* JADX INFO: renamed from: Z0 */
    public final void m210403Z0() {
        bnl0.m105524M(this.f193472n, false);
        bnl0.m105524M(this.f193477r, false);
    }

    /* JADX INFO: renamed from: a1 */
    public final void m210404a1() {
        if (gra.m131681f2()) {
            this.f193452W0.m21899k("MatchIceBreakBubble");
        }
    }

    /* JADX INFO: renamed from: b2 */
    public final void m210405b2(int i, int i2, String str) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i3 = i; i3 <= i2; i3++) {
            String str2 = this.f193448U0.getItem(i3).tipId;
            if (!this.f193456Y0.contains(str2)) {
                if (i3 > i && sb2.length() > 0) {
                    sb.append(com.meituan.robust.Constants.PACKNAME_END);
                    sb2.append(com.meituan.robust.Constants.PACKNAME_END);
                }
                sb.append(this.f193448U0.getItem(i3).content);
                sb2.append(str2);
                this.f193456Y0.add(str2);
            }
        }
        if (sb2.length() > 0) {
            i4g0.m138492A("e_breakice_content", getAct().pageId(), jyb.m147494Y(NotificationCompat.CATEGORY_STATUS, str), jyb.m147494Y(Constants.MessagePayloadKeys.MSGID_SERVER, sb2.toString()), jyb.m147494Y("chat_content", sb.toString()));
        }
    }

    /* JADX INFO: renamed from: d1 */
    public final void m210406d1(String str, String str2, int i) {
        tye.m193572c().m193583l(str2);
        d810.m114775h(getAct(), this.f193428K0, str, false, new RunnableC21283b());
        sfj0.m185596c("e_match_emoji", "p_successful_match_view", sfj0.C20032a.m185613f("select_emoji", i));
    }

    /* JADX INFO: renamed from: d2 */
    public final void m210407d2(TextView textView, String str, String str2, int i) {
        l51.m152888H(getAct(), new RunnableC21285d(i, textView, str, str2), 350L);
    }

    @Override // p153l.iam
    public void destroy() {
        m210404a1();
    }

    /* JADX INFO: renamed from: e1 */
    public final String m210408e1(User user) {
        StringBuilder sb = new StringBuilder(user.description);
        if (TextUtils.isEmpty(sb.toString())) {
            if (!TextUtils.isEmpty(user.location.region.city) && !user.isHideLocationFromSVip()) {
                sb.append(user.location.region.city);
                String strM175811p = q8g0.m175811p(user.location.distance, true);
                if (!TextUtils.isEmpty(strM175811p)) {
                    sb.append("(");
                    sb.append(strM175811p);
                    sb.append(")");
                }
            }
            if (!TextUtils.isEmpty(q8g0.m175804j0(user.profile.zodiac))) {
                if (TextUtils.isEmpty(sb.toString())) {
                    sb.append(q8g0.m175804j0(user.profile.zodiac));
                } else {
                    sb.append(" · ");
                    sb.append(q8g0.m175804j0(user.profile.zodiac));
                }
            }
            if (user.age.intValue() > 0 && !user.isHideAgeFromSVip()) {
                if (TextUtils.isEmpty(sb.toString())) {
                    sb.append(user.age);
                    sb.append("岁");
                } else {
                    sb.append(" · ");
                    sb.append(user.age);
                    sb.append("岁");
                }
            }
        }
        return hmj0.m135869e(sb.toString());
    }

    /* JADX INFO: renamed from: e2 */
    public final void m210409e2() {
        this.f193427K.setText("[" + getAct().getString(R$string.f18522Hj) + com.clevertap.android.sdk.Constants.AES_SUFFIX);
        bnl0.m105509E0(this.f193421H, new View.OnClickListener() { // from class: l.hcx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f108754a.m210384J1(view);
            }
        });
        this.f193435O.setText("[" + getAct().getString(R$string.f18491Gj) + com.clevertap.android.sdk.Constants.AES_SUFFIX);
        bnl0.m105509E0(this.f193429L, new View.OnClickListener() { // from class: l.icx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f114449a.m210385K1(view);
            }
        });
        this.f193443S.setText("[" + getAct().getString(R$string.f19357j4) + com.clevertap.android.sdk.Constants.AES_SUFFIX);
        bnl0.m105509E0(this.f193437P, new View.OnClickListener() { // from class: l.kcx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f125108a.m210386L1(view);
            }
        });
        this.f193451W.setText("[" + getAct().getString(R$string.f19328i4) + com.clevertap.android.sdk.Constants.AES_SUFFIX);
        bnl0.m105509E0(this.f193445T, new View.OnClickListener() { // from class: l.lcx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f131387a.m210387M1(view);
            }
        });
    }

    @Override // p153l.qyl
    public Animator enterAnimation() {
        m210399V1();
        return this.f193426J0 ? gt0.m132180z(m210391R1(), m210389P1(this.f193469k0.m210077r1())) : gt0.m132180z(m210389P1(this.f193469k0.m210077r1()));
    }

    @Override // p153l.qyl
    public Animator exitAnimation() {
        return gt0.m132164j(1);
    }

    /* JADX INFO: renamed from: f1 */
    public final void m210410f1() {
        bnl0.m105524M(this.f193472n, false);
    }

    /* JADX INFO: renamed from: f2 */
    public void m210411f2() {
        this.f193415E.clearFocus();
    }

    /* JADX INFO: renamed from: g1 */
    public final void m210412g1() {
        bnl0.m105524M(this.f193477r, false);
    }

    /* JADX INFO: renamed from: g2 */
    public final void m210413g2(TextView textView, String str, String str2) {
        String str3;
        String str4;
        if (str.contains("%s")) {
            int iIndexOf = str.indexOf("%s");
            String str5 = "  " + str2 + "  ";
            int length = str5.length();
            SpannableString spannableString = new SpannableString(String.format(str, str5));
            spannableString.setSpan(new StyleSpan(1), iIndexOf, length + iIndexOf, 33);
            textView.setText(spannableString);
            if (textView.getLineCount() <= 2) {
                return;
            }
            int lineEnd = (textView.getLayout().getLineEnd(1) - str.length()) - 3;
            if (lineEnd < 0) {
                str3 = MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + str2 + "... ";
                str4 = String.format(str, str3);
            } else {
                str3 = MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + str2.substring(0, lineEnd) + "... ";
                str4 = String.format(str, str3);
            }
            SpannableString spannableString2 = new SpannableString(str4);
            spannableString2.setSpan(new StyleSpan(1), iIndexOf, str3.length() + iIndexOf, 33);
            textView.setText(spannableString2);
        }
    }

    @Override // p153l.qyl
    /* JADX INFO: renamed from: h */
    public void mo114282h(int i, int i2) {
        int i3 = this.f193416E0;
        if (i - i3 > 0 || i > 0) {
            if (!this.f193475p0) {
                m210400X0(i);
            }
            this.f193475p0 = true;
        } else if (i - i3 < 0) {
            if (this.f193475p0) {
                m210317W0();
            }
            this.f193475p0 = false;
        }
        this.f193416E0 = i;
    }

    /* JADX INFO: renamed from: h1 */
    public final void m210414h1(int i) {
        if (i == 12 || i == 11 || (i == 13 && pgj.m172246c())) {
            if (i == 12) {
                m210322Z1();
                m210412g1();
                return;
            } else if (i == 11) {
                m210320Y1();
                m210410f1();
                return;
            } else {
                if (i == 13) {
                    m210320Y1();
                    m210322Z1();
                    return;
                }
                return;
            }
        }
        if (i != 39 && i != 37 && i != 38) {
            m210403Z0();
            return;
        }
        if (i == 38) {
            bnl0.m105524M(this.f193472n, true);
            bnl0.m105524M(this.f193477r, false);
            this.f193472n.setImageDrawable(j26.m143192e(getAct(), dbc0.f86889ce));
        } else if (i == 37) {
            bnl0.m105524M(this.f193472n, false);
            bnl0.m105524M(this.f193477r, true);
            this.f193477r.setImageDrawable(j26.m143192e(getAct(), dbc0.f86889ce));
        } else if (i == 39) {
            bnl0.m105524M(this.f193472n, true);
            bnl0.m105524M(this.f193477r, true);
            this.f193472n.setImageDrawable(j26.m143192e(getAct(), dbc0.f86889ce));
            this.f193477r.setImageDrawable(j26.m143192e(getAct(), dbc0.f86889ce));
        }
    }

    /* JADX INFO: renamed from: h2 */
    public final void m210415h2(TextView textView, String str, String str2) {
        String str3;
        String str4;
        if (str == null || textView == null || !str.contains("%s")) {
            return;
        }
        int iIndexOf = str.indexOf("%s");
        String str5 = MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + str2 + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        int length = str5.length();
        SpannableString spannableString = new SpannableString(String.format(str, str5));
        spannableString.setSpan(new StyleSpan(1), iIndexOf, length + iIndexOf, 33);
        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#CC000000")), iIndexOf, str5.length() + iIndexOf, 33);
        textView.setText(spannableString);
        if (textView.getLineCount() <= 2) {
            return;
        }
        int lineEnd = (textView.getLayout().getLineEnd(1) - str.length()) - 3;
        if (lineEnd < 0) {
            str3 = MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + str2 + "... ";
            str4 = String.format(str, str3);
        } else {
            str3 = MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + str2.substring(0, lineEnd) + "... ";
            str4 = String.format(str, str3);
        }
        SpannableString spannableString2 = new SpannableString(str4);
        spannableString2.setSpan(new StyleSpan(1), iIndexOf, str3.length() + iIndexOf, 33);
        spannableString2.setSpan(new ForegroundColorSpan(Color.parseColor("#CC000000")), iIndexOf, str3.length() + iIndexOf, 33);
        textView.setText(spannableString2);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m210392S0(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j1 */
    public void m210417j1(boolean z, final int i) {
        this.f193440Q0 = rsf0.m182965i(bnl0.m105588w0()) / this.f193424I0;
        if (rsf0.m182965i(bnl0.m105592y0()) < 360.0f) {
            this.f193442R0 = rsf0.m182965i(bnl0.m105592y0()) / 375.0f;
        } else {
            this.f193442R0 = this.f193440Q0;
        }
        this.f193422H0 = qa00.m175859d(this.f193440Q0 * 130.0f);
        bnl0.m105540X(this.f193464g, qa00.m175859d(this.f193440Q0 * 73.0f));
        bnl0.m105540X(this.f193465h, qa00.m175859d(this.f193440Q0 * 31.0f));
        bnl0.m105540X(this.f193466i, qa00.m175859d(this.f193440Q0 * 5.0f));
        bnl0.m105540X(this.f193468k, qa00.m175859d(this.f193440Q0 * 181.0f));
        bnl0.m105540X(this.f193474p, qa00.m175859d(this.f193440Q0 * 181.0f));
        bnl0.m105505C0(this.f193468k, qa00.m175859d(this.f193442R0 * 200.0f));
        bnl0.m105507D0(qa00.m175859d(this.f193442R0 * 190.0f), this.f193468k);
        bnl0.m105505C0(this.f193470l, qa00.m175859d(this.f193442R0 * 190.0f));
        bnl0.m105507D0(qa00.m175859d(this.f193442R0 * 190.0f), this.f193470l);
        bnl0.m105505C0(this.f193474p, qa00.m175859d(this.f193442R0 * 200.0f));
        bnl0.m105507D0(qa00.m175859d(this.f193442R0 * 190.0f), this.f193474p);
        bnl0.m105505C0(this.f193476q, qa00.m175859d(this.f193442R0 * 190.0f));
        bnl0.m105507D0(qa00.m175859d(this.f193442R0 * 190.0f), this.f193476q);
        bnl0.m105505C0(this.f193472n, qa00.m175859d(this.f193442R0 * 30.0f));
        bnl0.m105507D0(qa00.m175859d(this.f193442R0 * 30.0f), this.f193472n);
        bnl0.m105505C0(this.f193477r, qa00.m175859d(this.f193442R0 * 30.0f));
        bnl0.m105507D0(qa00.m175859d(this.f193442R0 * 30.0f), this.f193477r);
        bnl0.m105505C0(this.f193414D, qa00.m175859d(this.f193440Q0 * 64.0f));
        bnl0.m105505C0(this.f193417F, qa00.m175859d(this.f193440Q0 * 48.0f));
        bnl0.m105540X(this.f193453X, qa00.m175859d(this.f193440Q0 * 25.0f));
        bnl0.m105540X(this.f193455Y, qa00.m175859d(this.f193440Q0 * 14.0f));
        this.f193464g.setText(getAct().getString(R$string.f18922Up));
        this.f193464g.setTextSize(this.f193440Q0 * 18.0f);
        this.f193465h.setText(getAct().getString(R$string.f18892Tp));
        this.f193465h.setTextSize(this.f193440Q0 * 34.0f);
        this.f193466i.setTextSize(this.f193440Q0 * 18.0f);
        this.f193415E.setTextSize(this.f193440Q0 * 18.0f);
        this.f193417F.setTextSize(this.f193440Q0 * 16.0f);
        this.f193453X.setTextSize(this.f193440Q0 * 16.0f);
        this.f193455Y.setTextSize(this.f193440Q0 * 16.0f);
        this.f193417F.getPaint().setFakeBoldText(true);
        bnl0.m105509E0(this.f193455Y, this.f193434N0);
        bnl0.m105509E0(this.f193453X, this.f193432M0);
        bnl0.m105509E0(this.f193417F, this.f193436O0);
        bnl0.m105509E0(this.f193458a, new View.OnClickListener() { // from class: l.bcx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f76205a.m210349m1(view);
            }
        });
        m210420l1();
        m210418k1();
        m210414h1(i);
        if (!IntlCountryCodeController.m29125v() && z) {
            m210325a2();
        }
        if (i == 40 || i == 41) {
            bnl0.m105524M(this.f193414D, false);
            bnl0.m105524M(this.f193453X, false);
            bnl0.m105524M(this.f193455Y, false);
            bnl0.m105524M(this.f193484y, true);
            bnl0.m105524M(this.f193485z, true);
            this.f193464g.setText("Congratulations！");
            bnl0.m105505C0(this.f193484y, qa00.m175859d(this.f193440Q0 * 56.0f));
            this.f193484y.setTextSize(this.f193440Q0 * 16.0f);
            bnl0.m105505C0(this.f193485z, qa00.m175859d(this.f193440Q0 * 56.0f));
            this.f193485z.setTextSize(this.f193440Q0 * 16.0f);
            this.f193484y.setOnClickListener(new View.OnClickListener() { // from class: l.ccx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f81039a.m210421n1(i, view);
                }
            });
            this.f193485z.setOnClickListener(new View.OnClickListener() { // from class: l.dcx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f87838a.m210422o1(i, view);
                }
            });
        }
        if (gra.m131701j2()) {
            bnl0.m105524M(this.f193464g, false);
            bnl0.m105524M(this.f193467j, true);
            this.f193465h.setTextSize(this.f193440Q0 * 32.0f);
            this.f193465h.setTextColor(Color.parseColor("#CC000000"));
            this.f193465h.setTypeface(Typeface.defaultFromStyle(1));
            this.f193466i.setTextSize(this.f193440Q0 * 18.0f);
            this.f193466i.setTextColor(Color.parseColor("#66000000"));
            this.f193467j.setTextSize(this.f193440Q0 * 16.0f);
            this.f193455Y.setTypeface(Typeface.defaultFromStyle(1));
            this.f193463f.setTextSize(this.f193440Q0 * 18.0f);
            this.f193463f.setTypeface(Typeface.defaultFromStyle(1));
            this.f193417F.setTextColor(Color.parseColor("#33000000"));
            this.f193415E.setTextSize(this.f193440Q0 * 16.0f);
            bnl0.m105505C0(this.f193414D, qa00.m175859d(this.f193440Q0 * 56.0f));
            bnl0.m105540X(this.f193465h, qa00.m175859d(this.f193440Q0 * 59.0f));
            bnl0.m105540X(this.f193466i, qa00.m175859d(this.f193440Q0 * 24.0f));
            bnl0.m105540X(this.f193467j, qa00.m175859d(this.f193440Q0 * 5.0f));
            bnl0.m105540X(this.f193453X, qa00.m175859d(this.f193440Q0 * 20.0f));
            bnl0.m105540X(this.f193468k, qa00.m175859d(this.f193440Q0 * 228.0f));
            bnl0.m105540X(this.f193474p, qa00.m175859d(this.f193440Q0 * 228.0f));
            bnl0.m105540X(this.f193414D, qa00.m175859d(this.f193440Q0 * 40.0f));
            bnl0.m105540X(this.f193463f, qa00.m175859d(this.f193440Q0 * 47.0f));
            m210409e2();
            sfj0.m185601h("e_matched_send_message", "p_successful_match_view", new sfj0.C20032a[0]);
            sfj0.m185601h("e_matched_text_box", "p_successful_match_view", new sfj0.C20032a[0]);
            sfj0.m185601h("e_matched_later", "p_successful_match_view", new sfj0.C20032a[0]);
        } else {
            bnl0.m105524M(this.f193467j, false);
            bnl0.m105524M(this.f193419G, false);
            bnl0.m105524M(this.f193463f, false);
        }
        bnl0.m105540X(this.f193411A, qa00.m175859d(this.f193440Q0 * 28.0f));
    }

    /* JADX INFO: renamed from: k1 */
    public final void m210418k1() {
        bnl0.m105509E0(this.f193415E, new View.OnClickListener() { // from class: l.mcx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f135849a.m210423p1(view);
            }
        });
        this.f193415E.addTextChangedListener(new C21287f());
        this.f193415E.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: l.ncx
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return this.f141410a.m210424q1(textView, i, keyEvent);
            }
        });
        this.f193415E.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: l.ocx
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                this.f146746a.m210425r1(view, z);
            }
        });
    }

    /* JADX INFO: renamed from: k2 */
    public final Animator m210419k2(int i, int i2, int i3, int i4) {
        DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
        Animator animatorM132166l = i == 40 ? gt0.m132166l(this.f193484y, View.TRANSLATION_Y, 0L, i2, decelerateInterpolator, i3, i4) : gt0.m132166l(this.f193414D, View.TRANSLATION_Y, 0L, i2, decelerateInterpolator, i3, i4);
        if (gra.m131701j2()) {
            TextView textView = this.f193466i;
            Property property = View.TRANSLATION_Y;
            long j = i2;
            float f = i3;
            float f2 = i4;
            return gt0.m132180z(gt0.m132166l(textView, property, 0L, j, decelerateInterpolator, f, f2), gt0.m132166l(this.f193467j, property, 0L, j, decelerateInterpolator, f, f2), animatorM132166l);
        }
        VText vText = this.f193465h;
        Property property2 = View.TRANSLATION_Y;
        long j2 = i2;
        float f3 = i3;
        float f4 = i4;
        return gt0.m132180z(gt0.m132166l(vText, property2, 0L, j2, decelerateInterpolator, f3, f4), gt0.m132166l(this.f193466i, property2, 0L, j2, decelerateInterpolator, f3, f4), animatorM132166l);
    }

    /* JADX INFO: renamed from: l1 */
    public final void m210420l1() {
        if (this.f193438P0 == null) {
            this.f193438P0 = new f0r(getAct());
        }
        getAct().getWindow().getDecorView().post(new Runnable() { // from class: l.gcx
            @Override // java.lang.Runnable
            public final void run() {
                this.f103610a.m210426s1();
            }
        });
    }

    /* JADX INFO: renamed from: n1 */
    public final /* synthetic */ void m210421n1(int i, View view) {
        xbx xbxVar = this.f193469k0;
        if (i == 41) {
            xbxVar.m210073g2(false);
        } else {
            xbxVar.m210074h2(false);
        }
    }

    /* JADX INFO: renamed from: o1 */
    public final /* synthetic */ void m210422o1(int i, View view) {
        getAct().m68056e2();
        if (i == 40) {
            o1j0.m165651y(String.format(getAct().getResources().getString(com.p051p1.mobile.putong.core.member.R$string.f21321F0), new Object[0]));
        }
    }

    /* JADX INFO: renamed from: p1 */
    public final /* synthetic */ void m210423p1(View view) {
        i4g0.m138520r("e_matched_text_box", getAct().pageId());
    }

    /* JADX INFO: renamed from: q1 */
    public final /* synthetic */ boolean m210424q1(TextView textView, int i, KeyEvent keyEvent) {
        if (!qt4.f159383e.get().booleanValue()) {
            return false;
        }
        if (TextUtils.isEmpty(this.f193415E.getText().toString().trim())) {
            return true;
        }
        if (i == 4 || i == 6 || (NullChecker.m82486a(keyEvent) && 66 == keyEvent.getKeyCode() && keyEvent.getAction() == 0)) {
            this.f193436O0.onClick(this.f193417F);
        }
        return true;
    }

    /* JADX INFO: renamed from: r1 */
    public final /* synthetic */ void m210425r1(View view, boolean z) {
        if (z) {
            i4g0.m138520r("e_matched_text_box", getAct().pageId());
        }
    }

    /* JADX INFO: renamed from: s1 */
    public final /* synthetic */ void m210426s1() {
        this.f193438P0.m123510h();
    }

    /* JADX INFO: renamed from: w1 */
    public final /* synthetic */ void m210427w1(int[] iArr) {
        m210405b2(0, this.f193450V0.findLastVisibleItemPosition(), "init");
    }

    /* JADX INFO: renamed from: y1 */
    public final /* synthetic */ void m210428y1(Long l2) {
        this.f193452W0.m21908u(new C4496a(getAct()).m21848D("左滑可以选择更多内容哦～").m21869k(j26.m143190c(getAct(), c9c0.f80342I)).m21851G(c9c0.f80357N).m21877t(true).m21854J(14.0f).m21863e(false).m21849E(false).m21881x(-qa00.f156316c).m21860b(com.clevertap.android.sdk.Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS).m21874q(zvk.f206227D | zvk.f206228E), this.f193483x, "MatchIceBreakBubble");
        vxd0 vxd0Var = this.f193454X0;
        vxd0Var.put(Integer.valueOf(vxd0Var.get().intValue() + 1));
    }

    /* JADX INFO: renamed from: z1 */
    public final /* synthetic */ void m210429z1() {
        C8618a.m48771w().m48802z(getAct(), this.f193428K0);
        CoreModule.f18264c.f20337P1.f92199R.m137019l(uxj0.f181467a);
        getAct().m68056e2();
    }

    /* JADX INFO: renamed from: i2 */
    public void m210416i2() {
    }

    @Override // p153l.qyl
    public void initAnimationState() {
    }

    /* JADX INFO: renamed from: l.xcx$e */
    public class C21286e implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f193494a;

        public C21286e(boolean z) {
            this.f193494a = z;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            onAnimationEnd(animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f193494a && xcx.this.f193430L0) {
                bnl0.m105524M(xcx.this.f193411A, true);
            }
            boolean zM131701j2 = gra.m131701j2();
            boolean z = this.f193494a;
            if (zM131701j2) {
                xcx xcxVar = xcx.this;
                if (z) {
                    bnl0.m105525M0(xcxVar.f193465h, false);
                    bnl0.m105524M(xcx.this.f193463f, true);
                    return;
                } else {
                    bnl0.m105525M0(xcxVar.f193465h, true);
                    bnl0.m105524M(xcx.this.f193463f, false);
                    return;
                }
            }
            xcx xcxVar2 = xcx.this;
            if (z) {
                bnl0.m105525M0(xcxVar2.f193464g, true);
                xcx.this.f193464g.setText(xcx.this.getAct().getString(R$string.f18927V0));
            } else {
                bnl0.m105525M0(xcxVar2.f193464g, xcx.this.f193426J0);
                xcx.this.f193464g.setText(xcx.this.getAct().getString(R$string.f18922Up));
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f193494a) {
                bnl0.m105524M(xcx.this.f193411A, false);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: l.xcx$f */
    public class C21287f implements TextWatcher {
        public C21287f() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (gra.m131701j2()) {
                xcx.this.f193417F.setTextColor(Color.parseColor(editable.toString().trim().isEmpty() ? "#33000000" : "#FE7E1D"));
            }
            if (xcx.this.f193469k0.m210077r1() == 51) {
                xcx.this.f193417F.setTextColor(Color.parseColor(editable.toString().trim().isEmpty() ? "#33000000" : "#7439B3"));
            }
            boolean zIsEmpty = editable.toString().trim().isEmpty();
            xcx xcxVar = xcx.this;
            if (zIsEmpty) {
                bnl0.m105525M0(xcxVar.f193417F, false);
            } else {
                bnl0.m105525M0(xcxVar.f193417F, true);
            }
            xcx.this.f193417F.setEnabled(!editable.toString().trim().isEmpty());
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
