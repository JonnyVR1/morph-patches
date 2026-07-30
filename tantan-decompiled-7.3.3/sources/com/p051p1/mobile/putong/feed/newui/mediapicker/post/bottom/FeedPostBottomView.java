package com.p051p1.mobile.putong.feed.newui.mediapicker.post.bottom;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.p053ui.bubble.C4496a;
import com.p051p1.mobile.android.p053ui.bubble.C4499d;
import com.p051p1.mobile.putong.data.Audio;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.TopicCategorie;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.p051p1.mobile.putong.feed.newui.kankan.recorder.ComicFaceRecorderActivity;
import com.p051p1.mobile.putong.feed.newui.mediapicker.audiopost.AudioRecordState;
import com.p051p1.mobile.putong.feed.newui.mediapicker.post.C11408a;
import com.p051p1.mobile.putong.feed.newui.mediapicker.post.C11409b;
import com.p051p1.mobile.putong.feed.newui.mediapicker.post.FeedPostPageMediaSelectableHandle;
import com.p051p1.mobile.putong.feed.newui.mediapicker.post.bottom.FeedPostBottomView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.redpointview.FeedRedDotView;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import com.p051p1.mobile.putong.util.audio.AudioBusinessType;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VImage;
import p151v.VListCell;
import p151v.VText;
import p153l.a8c0;
import p153l.bnl0;
import p153l.cmg;
import p153l.cn40;
import p153l.gt0;
import p153l.i4g0;
import p153l.j4h;
import p153l.juh;
import p153l.jxd0;
import p153l.k9c0;
import p153l.l94;
import p153l.lbc0;
import p153l.nt00;
import p153l.o1j0;
import p153l.pb1;
import p153l.pf60;
import p153l.qa00;
import p153l.r1j0;
import p153l.trg;
import p153l.wzx;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class FeedPostBottomView extends ConstraintLayout {

    /* JADX INFO: renamed from: G */
    public static jxd0 f41618G = new jxd0("HAS_SHOW_AT_TIP" + FeedModule.m61405F().userId(), Boolean.FALSE);

    /* JADX INFO: renamed from: A */
    public boolean f41619A;

    /* JADX INFO: renamed from: B */
    public boolean f41620B;

    /* JADX INFO: renamed from: C */
    public int f41621C;

    /* JADX INFO: renamed from: D */
    public InterfaceC11421f f41622D;

    /* JADX INFO: renamed from: E */
    public String f41623E;

    /* JADX INFO: renamed from: F */
    public boolean f41624F;

    /* JADX INFO: renamed from: d */
    public FeedPostBottomTitleTagsView f41625d;

    /* JADX INFO: renamed from: e */
    public FeedPostBottomTopicView f41626e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f41627f;

    /* JADX INFO: renamed from: g */
    public ImageView f41628g;

    /* JADX INFO: renamed from: h */
    public ImageView f41629h;

    /* JADX INFO: renamed from: i */
    public FeedRedDotView f41630i;

    /* JADX INFO: renamed from: j */
    public VImage f41631j;

    /* JADX INFO: renamed from: k */
    public ImageView f41632k;

    /* JADX INFO: renamed from: l */
    public ImageView f41633l;

    /* JADX INFO: renamed from: m */
    public ImageView f41634m;

    /* JADX INFO: renamed from: n */
    public VText f41635n;

    /* JADX INFO: renamed from: o */
    public FrameLayout f41636o;

    /* JADX INFO: renamed from: p */
    public FrameLayout f41637p;

    /* JADX INFO: renamed from: q */
    public FeedPostBottomAlbumView f41638q;

    /* JADX INFO: renamed from: r */
    public FeedPostBottomAudioView f41639r;

    /* JADX INFO: renamed from: s */
    public View f41640s;

    /* JADX INFO: renamed from: t */
    public int f41641t;

    /* JADX INFO: renamed from: u */
    public C11408a f41642u;

    /* JADX INFO: renamed from: v */
    public Act f41643v;

    /* JADX INFO: renamed from: w */
    public InterfaceC11419d f41644w;

    /* JADX INFO: renamed from: x */
    public InterfaceC11420e f41645x;

    /* JADX INFO: renamed from: y */
    public InterfaceC11418c f41646y;

    /* JADX INFO: renamed from: z */
    public x20 f41647z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.post.bottom.FeedPostBottomView$a */
    public class C11416a implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f41648a;

        public C11416a(boolean z) {
            this.f41648a = z;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f41648a) {
                return;
            }
            FeedPostBottomView.this.f41640s.setVisibility(8);
            FeedPostBottomView.this.f41640s.requestLayout();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f41648a) {
                FeedPostBottomView.this.f41640s.setVisibility(0);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.post.bottom.FeedPostBottomView$b */
    public static /* synthetic */ class C11417b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f41650a;

        static {
            int[] iArr = new int[AudioRecordState.values().length];
            f41650a = iArr;
            try {
                iArr[AudioRecordState.WAITING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41650a[AudioRecordState.RECORDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.post.bottom.FeedPostBottomView$c */
    public interface InterfaceC11418c {
        /* JADX INFO: renamed from: a */
        void mo64238a();
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.post.bottom.FeedPostBottomView$d */
    public interface InterfaceC11419d {
        /* JADX INFO: renamed from: a */
        void mo64239a(Audio audio);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.post.bottom.FeedPostBottomView$e */
    public interface InterfaceC11420e {
        /* JADX INFO: renamed from: a */
        void mo64240a();
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.post.bottom.FeedPostBottomView$f */
    public interface InterfaceC11421f {
        /* JADX INFO: renamed from: a */
        void mo64241a(String str);
    }

    public FeedPostBottomView(Context context) {
        super(context);
        this.f41641t = C11409b.f41532X;
    }

    /* JADX INFO: renamed from: F1 */
    private void m64166F1(Act act, final x20 x20Var) {
        PermissionHelper.m81065c().m81083r("android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE").m81088w(false).m81080o(new x20() { // from class: l.zth
            @Override // p153l.x20
            public final void call() {
                FeedPostBottomView.m64184s0(x20Var);
            }
        }).m81074i(act);
    }

    /* JADX INFO: renamed from: G0 */
    private boolean m64167G0() {
        return PermissionHelper.m81064b("android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public /* synthetic */ void m64168V0(View view) {
        m64221j1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X0 */
    public /* synthetic */ void m64169X0(View view) {
        i4g0.m138520r("e_moment_poi", "p_moment_post");
        if (NullChecker.m82486a(this.f41645x)) {
            this.f41645x.mo64240a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y0 */
    public /* synthetic */ void m64170Y0(View view) {
        if (NullChecker.m82486a(this.f41646y)) {
            this.f41646y.mo64238a();
        }
        this.f41633l.setSelected(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z0 */
    public /* synthetic */ void m64171Z0(View view) {
        m64218f1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e1 */
    public /* synthetic */ void m64172e1(View view) {
        this.f41626e.m64160K();
    }

    /* JADX INFO: renamed from: n0 */
    public static /* synthetic */ boolean m64179n0(View view, MotionEvent motionEvent) {
        return true;
    }

    /* JADX INFO: renamed from: s0 */
    public static /* synthetic */ void m64184s0(x20 x20Var) {
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: u0 */
    public static /* synthetic */ boolean m64186u0(View view, MotionEvent motionEvent) {
        return false;
    }

    /* JADX INFO: renamed from: A1 */
    public void m64189A1(List<String> list, trg trgVar) {
        if (!this.f41625d.m64143z()) {
            this.f41625d.m64142w(this.f41643v, this.f41642u);
        }
        if (!bnl0.m105529O0(this.f41625d)) {
            bnl0.m105524M(this.f41625d, true);
        }
        if (!bnl0.m105529O0(this.f41634m)) {
            bnl0.m105524M(this.f41634m, true);
        }
        if (bnl0.m105529O0(this.f41626e)) {
            bnl0.m105524M(this.f41626e, false);
        }
        this.f41624F = true;
        this.f41625d.m64140C(list, trgVar);
    }

    /* JADX INFO: renamed from: B0 */
    public void m64190B0() {
        if (this.f41620B) {
            m64223l1();
        } else {
            m64210P0();
        }
    }

    /* JADX INFO: renamed from: B1 */
    public void m64191B1(pf60<List<TopicCategorie>, List<TopicMoment>> pf60Var) {
        this.f41626e.m64158F(pf60Var);
    }

    /* JADX INFO: renamed from: C1 */
    public final void m64192C1() {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f41639r.getLayoutParams();
        marginLayoutParams.height = this.f41641t;
        this.f41639r.setLayoutParams(marginLayoutParams);
        this.f41639r.setKeyboardHeight(Integer.valueOf(this.f41641t));
    }

    /* JADX INFO: renamed from: D0 */
    public boolean m64193D0() {
        return this.f41639r.m64132w();
    }

    /* JADX INFO: renamed from: E0 */
    public void m64194E0() {
        this.f41640s.setOnTouchListener(new View.OnTouchListener() { // from class: l.vth
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return FeedPostBottomView.m64186u0(view, motionEvent);
            }
        });
        m64200I1(false);
    }

    /* JADX INFO: renamed from: E1 */
    public boolean m64195E1() {
        if (!cmg.m111243x() || f41618G.get().booleanValue()) {
            return false;
        }
        f41618G.put(Boolean.TRUE);
        this.f41623E = C4499d.m21895l().m21907t(new C4496a(this.f41643v).m21848D("新玩法上线，点击体验").m21872o(C4496a.f16401P, qa00.m175859d(8.0f)).m21874q(C4496a.f16402Q | C4496a.f16401P).m21860b(3000L).m21881x(-qa00.m175859d(13.0f)), this.f41633l);
        return true;
    }

    /* JADX INFO: renamed from: G1 */
    public void m64196G1(boolean z) {
        this.f41628g.setSelected(z);
        bnl0.m105525M0(this.f41638q, z);
    }

    /* JADX INFO: renamed from: H0 */
    public void m64197H0(float f, boolean z) {
        if (this.f41620B) {
            if (m64206L1()) {
                return;
            }
            m64223l1();
            return;
        }
        if (f > 0.0f && m64211Q0()) {
            int[] iArr = new int[2];
            this.f41638q.getLocationInWindow(iArr);
            if (f > iArr[1]) {
                return;
            }
        }
        if (m64211Q0()) {
            this.f41628g.setSelected(false);
            m64228r1(false);
        } else if (z && NullChecker.m82486a(this.f41647z)) {
            this.f41647z.call();
        }
    }

    /* JADX INFO: renamed from: H1 */
    public void m64198H1() {
        this.f41640s.setOnTouchListener(new View.OnTouchListener() { // from class: l.wth
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return FeedPostBottomView.m64179n0(view, motionEvent);
            }
        });
        m64200I1(true);
    }

    /* JADX INFO: renamed from: I0 */
    public void m64199I0() {
        this.f41638q.m64119p(this.f41643v, this.f41642u);
    }

    /* JADX INFO: renamed from: I1 */
    public final void m64200I1(boolean z) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f41640s, "alpha", z ? 0.0f : 1.0f, z ? 1.0f : 0.0f);
        objectAnimatorOfFloat.setDuration(200L);
        objectAnimatorOfFloat.addListener(new C11416a(z));
        objectAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: J0 */
    public final void m64201J0() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f41638q.getLayoutParams();
        layoutParams.height = this.f41641t;
        this.f41638q.setLayoutParams(layoutParams);
        m64192C1();
        bnl0.m105505C0(this.f41637p, this.f41641t);
    }

    /* JADX INFO: renamed from: J1 */
    public void m64202J1() {
        if (this.f41620B) {
            this.f41639r.m64130F();
        }
    }

    /* JADX INFO: renamed from: K0 */
    public void m64203K0(x20 x20Var) {
        this.f41631j.setVisibility(0);
        m64205L0(x20Var);
        i4g0.m138526x("e_voice_moment_post", "p_moment_post");
    }

    /* JADX INFO: renamed from: K1 */
    public void m64204K1(boolean z) {
        if (this.f41624F) {
            return;
        }
        bnl0.m105524M(this.f41626e, z);
    }

    /* JADX INFO: renamed from: L0 */
    public final void m64205L0(final x20 x20Var) {
        bnl0.m105509E0(this.f41631j, new View.OnClickListener() { // from class: l.uth
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f180956a.m64213S0(x20Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: L1 */
    public boolean m64206L1() {
        return this.f41640s.getVisibility() == 0;
    }

    /* JADX INFO: renamed from: M1 */
    public void m64207M1(Integer num) {
        setAlbumHeight(num);
    }

    /* JADX INFO: renamed from: N0 */
    public void m64208N0() {
        this.f41639r.m64133z(this.f41643v, new y20() { // from class: l.huh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f111669a.m64214T0(obj);
            }
        }, new y20() { // from class: l.iuh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f116949a.m64215U0(obj);
            }
        });
    }

    /* JADX INFO: renamed from: O0 */
    public void m64209O0(final Act act, C11408a c11408a) {
        this.f41643v = act;
        this.f41642u = c11408a;
        addView(m64234y0(LayoutInflater.from(act), this));
        if (j4h.m143424h()) {
            this.f41628g.setImageResource(lbc0.f131018d3);
            this.f41629h.setImageResource(lbc0.f131034f3);
            this.f41631j.setImageResource(lbc0.f131026e3);
            this.f41632k.setImageResource(lbc0.f131042g3);
            this.f41634m.setImageResource(lbc0.f131050h3);
            this.f41635n.setTextColor(getResources().getColor(k9c0.f124509h));
            Drawable drawable = getResources().getDrawable(lbc0.f130978Y1);
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            this.f41635n.setCompoundDrawables(null, null, drawable, null);
        }
        bnl0.m105509E0(this.f41629h, new View.OnClickListener() { // from class: l.buh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f78510a.m64168V0(view);
            }
        });
        bnl0.m105509E0(this.f41632k, new View.OnClickListener() { // from class: l.cuh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f83840a.m64169X0(view);
            }
        });
        bnl0.m105524M(this.f41633l, cmg.m111243x());
        bnl0.m105509E0(this.f41633l, new View.OnClickListener() { // from class: l.duh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f90796a.m64170Y0(view);
            }
        });
        bnl0.m105509E0(this.f41628g, new View.OnClickListener() { // from class: l.euh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f95871a.m64171Z0(view);
            }
        });
        this.f41635n.getPaint().setFakeBoldText(true);
        this.f41635n.setText(nt00.m164664k().m164668j());
        this.f41621C = nt00.m164664k().m164666h();
        bnl0.m105509E0(this.f41635n, new View.OnClickListener() { // from class: l.fuh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f100915a.m64217d1(act, view);
            }
        });
        bnl0.m105524M(this.f41634m, false);
        bnl0.m105509E0(this.f41634m, new View.OnClickListener() { // from class: l.guh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f106508a.m64172e1(view);
            }
        });
        this.f41626e.m64163z(act, c11408a);
        m64201J0();
    }

    /* JADX INFO: renamed from: P0 */
    public void m64210P0() {
        this.f41631j.setSelected(true);
        if (m64211Q0() || this.f41619A) {
            m64196G1(false);
            bnl0.m105525M0(this.f41637p, true);
            this.f41639r.m64131v(true);
        } else {
            bnl0.m105525M0(this.f41637p, true);
            bnl0.m105525M0(this.f41639r, true);
            m64228r1(true);
        }
        if (this.f41619A && NullChecker.m82486a(this.f41647z)) {
            this.f41647z.call();
        }
        this.f41620B = true;
        i4g0.m138526x("e_voice_button", "p_moment_post");
    }

    /* JADX INFO: renamed from: Q0 */
    public boolean m64211Q0() {
        return this.f41628g.isSelected();
    }

    /* JADX INFO: renamed from: R0 */
    public boolean m64212R0() {
        return this.f41620B;
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m64213S0(x20 x20Var, View view) {
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
        m64222k1(true);
    }

    /* JADX INFO: renamed from: T0 */
    public final /* synthetic */ void m64214T0(Object obj) {
        if (NullChecker.m82486a(this.f41644w)) {
            this.f41644w.mo64239a((Audio) obj);
        }
        m64194E0();
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ void m64215U0(Object obj) {
        int i = C11417b.f41650a[((AudioRecordState) obj).ordinal()];
        if (i == 1) {
            m64194E0();
        } else {
            if (i != 2) {
                return;
            }
            m64198H1();
        }
    }

    /* JADX INFO: renamed from: a1 */
    public final /* synthetic */ void m64216a1(VListCell.C22660a c22660a, int i) {
        this.f41635n.setText(nt00.m164664k().m164670m(i));
        this.f41621C = i;
        if (NullChecker.m82486a(this.f41622D)) {
            this.f41622D.mo64241a(nt00.m164664k().m164672o(this.f41621C));
        }
    }

    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ void m64217d1(Act act, View view) {
        nt00.m164664k().m164677t(act, this.f41621C, new nt00.InterfaceC18946b() { // from class: l.xth
            @Override // p153l.nt00.InterfaceC18946b
            /* JADX INFO: renamed from: a */
            public final void mo164687a(VListCell.C22660a c22660a, int i) {
                this.f196213a.m64216a1(c22660a, i);
            }
        });
    }

    /* JADX INFO: renamed from: g1 */
    public final /* synthetic */ void m64219g1(int i) {
        bnl0.m105505C0(this.f41637p, i);
    }

    public String getSelectedFolderPath() {
        return this.f41638q.getSelectedFolderPath();
    }

    public int getSelectedPosition() {
        return this.f41621C;
    }

    public List<TopicMoment> getTopicList() {
        return this.f41626e.getTopicList();
    }

    /* JADX INFO: renamed from: h1 */
    public final /* synthetic */ void m64220h1(ValueAnimator valueAnimator) {
        bnl0.m105505C0(this.f41637p, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: renamed from: j1 */
    public void m64221j1() {
        AudioBusinessType audioBusinessTypeMo171474c = pb1.m171472b().mo171474c();
        if (NullChecker.m82486a(audioBusinessTypeMo171474c)) {
            r1j0.m179420g(audioBusinessTypeMo171474c.getBusinessMsg());
            return;
        }
        if (FeedPostPageMediaSelectableHandle.m63861c(this.f41642u.m63960g1(), this.f41642u.f41521p)) {
            if (this.f41642u.m63966m1()) {
                ComicFaceRecorderActivity.m63243i2(this.f41643v);
                return;
            }
            if (this.f41638q.m64120s()) {
                cn40.m111390h0(this.f41643v, this.f41642u.m63960g1().size() > 0, null, "", true, false);
            } else if (this.f41642u.m63960g1().size() == this.f41638q.getMaxCount()) {
                o1j0.m165634h(R$string.f39741F1);
                return;
            } else {
                this.f41630i.m66239k();
                cn40.m111390h0(this.f41643v, this.f41642u.m63960g1().size() > 0, this.f41638q.getSelectedImages(), this.f41638q.getSelectedFolderPath(), true, false);
            }
            l94.m153309e().m153319k();
        }
    }

    /* JADX INFO: renamed from: k1 */
    public void m64222k1(boolean z) {
        AudioBusinessType audioBusinessTypeMo171474c = pb1.m171472b().mo171474c();
        if (NullChecker.m82486a(audioBusinessTypeMo171474c)) {
            r1j0.m179420g(audioBusinessTypeMo171474c.getBusinessMsg());
            return;
        }
        i4g0.m138520r("e_voice_moment_post", "p_moment_post");
        if (FeedPostPageMediaSelectableHandle.m63860b(this.f41642u.m63960g1(), this.f41642u.f41521p)) {
            m64208N0();
            m64190B0();
        }
    }

    /* JADX INFO: renamed from: l1 */
    public void m64223l1() {
        this.f41620B = false;
        if (!this.f41619A && !m64211Q0()) {
            m64228r1(false);
        }
        if (this.f41619A) {
            bnl0.m105525M0(this.f41637p, false);
        }
        this.f41631j.setSelected(false);
        this.f41640s.setVisibility(8);
    }

    /* JADX INFO: renamed from: n1, reason: merged with bridge method [inline-methods] */
    public final void m64218f1() {
        if (!wzx.m208784k() && !m64167G0()) {
            m64166F1(this.f41643v, new x20() { // from class: l.yth
                @Override // p153l.x20
                public final void call() {
                    this.f201508a.m64218f1();
                }
            });
        } else if (FeedPostPageMediaSelectableHandle.m63859a(this.f41642u.m63960g1(), this.f41642u.f41521p)) {
            m64229s1();
        }
    }

    /* JADX INFO: renamed from: o1 */
    public void m64225o1(boolean z) {
        this.f41638q.m64121u(z);
    }

    /* JADX INFO: renamed from: p1 */
    public void m64226p1(String str, List<TopicMoment> list) {
        if (this.f41624F) {
            return;
        }
        this.f41626e.m64156C(str, list);
    }

    /* JADX INFO: renamed from: q1 */
    public void m64227q1(ArrayList<Media> arrayList) {
        this.f41638q.m64122v(arrayList);
    }

    /* JADX INFO: renamed from: r1 */
    public final void m64228r1(boolean z) {
        int i = z ? 0 : this.f41641t;
        final int i2 = z ? this.f41641t : 0;
        Animator animatorM132165k = gt0.m132165k(ValueAnimator.ofInt(i, i2), new LinearInterpolator(), 0L, z ? 200L : 300L);
        ((ValueAnimator) animatorM132165k).addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.tth
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f176074a.m64220h1(valueAnimator);
            }
        });
        gt0.m132160f(animatorM132165k, new Runnable() { // from class: l.auh
            @Override // java.lang.Runnable
            public final void run() {
                this.f73516a.m64219g1(i2);
            }
        });
        animatorM132165k.start();
    }

    /* JADX INFO: renamed from: s1 */
    public void m64229s1() {
        if (this.f41638q.m64120s()) {
            return;
        }
        if (NullChecker.m82486a(this.f41638q.getSelectedVideo())) {
            o1j0.m165634h(R$string.f39915h0);
            return;
        }
        Act act = this.f41643v;
        act.startActivityForResult(MediaPickerAct.m80102Y1(act, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(9).build()).withVideoPickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).build()).withAlreadySelectedMedia(this.f41642u.m63960g1()).withSelectedFolderPath(this.f41638q.getSelectedFolderPath()).withFromType(2).withMediaPreviewPageId("p_camera_album_picture_preview").needAllSelectedMediaPreview().withIsNewUIAb(j4h.m143424h()).build()), 66);
        this.f41643v.overridePendingTransition(a8c0.f68909i, 0);
    }

    public void setAlbumHeight(Integer num) {
        if (num.intValue() == 0 || this.f41641t == num.intValue()) {
            return;
        }
        this.f41641t = num.intValue();
        m64201J0();
    }

    public void setFeedPostAtListener(InterfaceC11418c interfaceC11418c) {
        this.f41646y = interfaceC11418c;
    }

    public void setFeedPostAudioFinishListener(InterfaceC11419d interfaceC11419d) {
        this.f41644w = interfaceC11419d;
    }

    public void setFeedPostLocationListener(InterfaceC11420e interfaceC11420e) {
        this.f41645x = interfaceC11420e;
    }

    public void setHideInputEditFieldAction(x20 x20Var) {
        this.f41647z = x20Var;
    }

    public void setIMomentVisibleChangedListener(InterfaceC11421f interfaceC11421f) {
        this.f41622D = interfaceC11421f;
    }

    public void setSelectedImages(ArrayList<Media> arrayList) {
        this.f41638q.setSelectedImages(arrayList);
    }

    /* JADX INFO: renamed from: t1 */
    public void m64230t1(Boolean bool) {
        if (bool.booleanValue() == this.f41619A) {
            return;
        }
        this.f41619A = bool.booleanValue();
        if (bool.booleanValue()) {
            m64233w1();
        } else {
            m64232v1();
        }
    }

    /* JADX INFO: renamed from: u1 */
    public void m64231u1(boolean z) {
        bnl0.m105524M(this.f41630i, z);
    }

    /* JADX INFO: renamed from: v1 */
    public final void m64232v1() {
        if (m64211Q0() || this.f41620B) {
            return;
        }
        m64228r1(this.f41619A);
    }

    /* JADX INFO: renamed from: w1 */
    public final void m64233w1() {
        if (m64211Q0()) {
            m64196G1(false);
        } else if (this.f41620B) {
            m64223l1();
        } else {
            bnl0.m105525M0(this.f41637p, false);
            m64228r1(this.f41619A);
        }
    }

    /* JADX INFO: renamed from: y0 */
    public View m64234y0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return juh.m146982b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: y1 */
    public void m64235y1(String str) {
        this.f41638q.m64123w(str);
    }

    /* JADX INFO: renamed from: z0 */
    public void m64236z0() {
        if (this.f41619A || this.f41637p.getHeight() == 0) {
            return;
        }
        m64228r1(false);
    }

    /* JADX INFO: renamed from: z1 */
    public void m64237z1() {
        this.f41626e.m64157E();
    }

    public FeedPostBottomView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f41641t = C11409b.f41532X;
    }

    public FeedPostBottomView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f41641t = C11409b.f41532X;
    }
}
