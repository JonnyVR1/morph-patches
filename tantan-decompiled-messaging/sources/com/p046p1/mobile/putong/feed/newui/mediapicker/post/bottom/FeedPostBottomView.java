package com.p046p1.mobile.putong.feed.newui.mediapicker.post.bottom;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.p048ui.bubble.C4345a;
import com.p046p1.mobile.android.p048ui.bubble.C4348d;
import com.p046p1.mobile.putong.data.Audio;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.TopicCategorie;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.p046p1.mobile.putong.feed.newui.kankan.recorder.ComicFaceRecorderActivity;
import com.p046p1.mobile.putong.feed.newui.mediapicker.audiopost.AudioRecordState;
import com.p046p1.mobile.putong.feed.newui.mediapicker.post.C11245a;
import com.p046p1.mobile.putong.feed.newui.mediapicker.post.C11246b;
import com.p046p1.mobile.putong.feed.newui.mediapicker.post.FeedPostPageMediaSelectableHandle;
import com.p046p1.mobile.putong.feed.newui.mediapicker.post.bottom.FeedPostBottomView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.redpointview.FeedRedDotView;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import com.p046p1.mobile.putong.util.audio.AudioBusinessType;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VImage;
import p147v.VListCell;
import p147v.VText;
import p149l.bt0;
import p149l.d30;
import p149l.e1c0;
import p149l.e30;
import p149l.el00;
import p149l.eqg;
import p149l.f3c0;
import p149l.hpd0;
import p149l.ib1;
import p149l.j760;
import p149l.lsi0;
import p149l.m84;
import p149l.nkg;
import p149l.oe40;
import p149l.osi0;
import p149l.t100;
import p149l.u2h;
import p149l.ush;
import p149l.uzb0;
import p149l.xdl0;
import p149l.zqx;
import p149l.zvf0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedPostBottomView extends ConstraintLayout {

    /* JADX INFO: renamed from: G */
    public static hpd0 f40770G = new hpd0("HAS_SHOW_AT_TIP" + FeedModule.m60221F().userId(), Boolean.FALSE);

    /* JADX INFO: renamed from: A */
    public boolean f40771A;

    /* JADX INFO: renamed from: B */
    public boolean f40772B;

    /* JADX INFO: renamed from: C */
    public int f40773C;

    /* JADX INFO: renamed from: D */
    public InterfaceC11258f f40774D;

    /* JADX INFO: renamed from: E */
    public String f40775E;

    /* JADX INFO: renamed from: F */
    public boolean f40776F;

    /* JADX INFO: renamed from: d */
    public FeedPostBottomTitleTagsView f40777d;

    /* JADX INFO: renamed from: e */
    public FeedPostBottomTopicView f40778e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f40779f;

    /* JADX INFO: renamed from: g */
    public ImageView f40780g;

    /* JADX INFO: renamed from: h */
    public ImageView f40781h;

    /* JADX INFO: renamed from: i */
    public FeedRedDotView f40782i;

    /* JADX INFO: renamed from: j */
    public VImage f40783j;

    /* JADX INFO: renamed from: k */
    public ImageView f40784k;

    /* JADX INFO: renamed from: l */
    public ImageView f40785l;

    /* JADX INFO: renamed from: m */
    public ImageView f40786m;

    /* JADX INFO: renamed from: n */
    public VText f40787n;

    /* JADX INFO: renamed from: o */
    public FrameLayout f40788o;

    /* JADX INFO: renamed from: p */
    public FrameLayout f40789p;

    /* JADX INFO: renamed from: q */
    public FeedPostBottomAlbumView f40790q;

    /* JADX INFO: renamed from: r */
    public FeedPostBottomAudioView f40791r;

    /* JADX INFO: renamed from: s */
    public View f40792s;

    /* JADX INFO: renamed from: t */
    public int f40793t;

    /* JADX INFO: renamed from: u */
    public C11245a f40794u;

    /* JADX INFO: renamed from: v */
    public Act f40795v;

    /* JADX INFO: renamed from: w */
    public InterfaceC11256d f40796w;

    /* JADX INFO: renamed from: x */
    public InterfaceC11257e f40797x;

    /* JADX INFO: renamed from: y */
    public InterfaceC11255c f40798y;

    /* JADX INFO: renamed from: z */
    public d30 f40799z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.post.bottom.FeedPostBottomView$a */
    public class C11253a implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f40800a;

        public C11253a(boolean z) {
            this.f40800a = z;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f40800a) {
                return;
            }
            FeedPostBottomView.this.f40792s.setVisibility(8);
            FeedPostBottomView.this.f40792s.requestLayout();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f40800a) {
                FeedPostBottomView.this.f40792s.setVisibility(0);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.post.bottom.FeedPostBottomView$b */
    public static /* synthetic */ class C11254b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f40802a;

        static {
            int[] iArr = new int[AudioRecordState.values().length];
            f40802a = iArr;
            try {
                iArr[AudioRecordState.WAITING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40802a[AudioRecordState.RECORDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.post.bottom.FeedPostBottomView$c */
    public interface InterfaceC11255c {
        /* JADX INFO: renamed from: a */
        void mo63055a();
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.post.bottom.FeedPostBottomView$d */
    public interface InterfaceC11256d {
        /* JADX INFO: renamed from: a */
        void mo63056a(Audio audio);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.post.bottom.FeedPostBottomView$e */
    public interface InterfaceC11257e {
        /* JADX INFO: renamed from: a */
        void mo63057a();
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.post.bottom.FeedPostBottomView$f */
    public interface InterfaceC11258f {
        /* JADX INFO: renamed from: a */
        void mo63058a(String str);
    }

    public FeedPostBottomView(Context context) {
        super(context);
        this.f40793t = C11246b.f40684X;
    }

    /* JADX INFO: renamed from: F1 */
    private void m62983F1(Act act, final d30 d30Var) {
        PermissionHelper.m79882c().m79900r("android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE").m79905w(false).m79897o(new d30() { // from class: l.ksh
            @Override // p149l.d30
            public final void call() {
                FeedPostBottomView.m63001s0(d30Var);
            }
        }).m79891i(act);
    }

    /* JADX INFO: renamed from: G0 */
    private boolean m62984G0() {
        return PermissionHelper.m79881b("android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public /* synthetic */ void m62985V0(View view) {
        m63038j1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X0 */
    public /* synthetic */ void m62986X0(View view) {
        zvf0.m220396r("e_moment_poi", "p_moment_post");
        if (NullChecker.m81303a(this.f40797x)) {
            this.f40797x.mo63057a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y0 */
    public /* synthetic */ void m62987Y0(View view) {
        if (NullChecker.m81303a(this.f40798y)) {
            this.f40798y.mo63055a();
        }
        this.f40785l.setSelected(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z0 */
    public /* synthetic */ void m62988Z0(View view) {
        m63035f1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e1 */
    public /* synthetic */ void m62989e1(View view) {
        this.f40778e.m62977K();
    }

    /* JADX INFO: renamed from: n0 */
    public static /* synthetic */ boolean m62996n0(View view, MotionEvent motionEvent) {
        return true;
    }

    /* JADX INFO: renamed from: s0 */
    public static /* synthetic */ void m63001s0(d30 d30Var) {
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: u0 */
    public static /* synthetic */ boolean m63003u0(View view, MotionEvent motionEvent) {
        return false;
    }

    /* JADX INFO: renamed from: A1 */
    public void m63006A1(List<String> list, eqg eqgVar) {
        if (!this.f40777d.m62960z()) {
            this.f40777d.m62959w(this.f40795v, this.f40794u);
        }
        if (!xdl0.m208349O0(this.f40777d)) {
            xdl0.m208344M(this.f40777d, true);
        }
        if (!xdl0.m208349O0(this.f40786m)) {
            xdl0.m208344M(this.f40786m, true);
        }
        if (xdl0.m208349O0(this.f40778e)) {
            xdl0.m208344M(this.f40778e, false);
        }
        this.f40776F = true;
        this.f40777d.m62957C(list, eqgVar);
    }

    /* JADX INFO: renamed from: B0 */
    public void m63007B0() {
        if (this.f40772B) {
            m63040l1();
        } else {
            m63027P0();
        }
    }

    /* JADX INFO: renamed from: B1 */
    public void m63008B1(j760<List<TopicCategorie>, List<TopicMoment>> j760Var) {
        this.f40778e.m62975F(j760Var);
    }

    /* JADX INFO: renamed from: C1 */
    public final void m63009C1() {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f40791r.getLayoutParams();
        marginLayoutParams.height = this.f40793t;
        this.f40791r.setLayoutParams(marginLayoutParams);
        this.f40791r.setKeyboardHeight(Integer.valueOf(this.f40793t));
    }

    /* JADX INFO: renamed from: D0 */
    public boolean m63010D0() {
        return this.f40791r.m62949w();
    }

    /* JADX INFO: renamed from: E0 */
    public void m63011E0() {
        this.f40792s.setOnTouchListener(new View.OnTouchListener() { // from class: l.gsh
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return FeedPostBottomView.m63003u0(view, motionEvent);
            }
        });
        m63017I1(false);
    }

    /* JADX INFO: renamed from: E1 */
    public boolean m63012E1() {
        if (!nkg.m159914x() || f40770G.get().booleanValue()) {
            return false;
        }
        f40770G.put(Boolean.TRUE);
        this.f40775E = C4348d.m20896l().m20908t(new C4345a(this.f40795v).m20849D("新玩法上线，点击体验").m20873o(C4345a.f15682P, t100.m186890d(8.0f)).m20875q(C4345a.f15683Q | C4345a.f15682P).m20861b(3000L).m20882x(-t100.m186890d(13.0f)), this.f40785l);
        return true;
    }

    /* JADX INFO: renamed from: G1 */
    public void m63013G1(boolean z) {
        this.f40780g.setSelected(z);
        xdl0.m208345M0(this.f40790q, z);
    }

    /* JADX INFO: renamed from: H0 */
    public void m63014H0(float f, boolean z) {
        if (this.f40772B) {
            if (m63023L1()) {
                return;
            }
            m63040l1();
            return;
        }
        if (f > 0.0f && m63028Q0()) {
            int[] iArr = new int[2];
            this.f40790q.getLocationInWindow(iArr);
            if (f > iArr[1]) {
                return;
            }
        }
        if (m63028Q0()) {
            this.f40780g.setSelected(false);
            m63045r1(false);
        } else if (z && NullChecker.m81303a(this.f40799z)) {
            this.f40799z.call();
        }
    }

    /* JADX INFO: renamed from: H1 */
    public void m63015H1() {
        this.f40792s.setOnTouchListener(new View.OnTouchListener() { // from class: l.hsh
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return FeedPostBottomView.m62996n0(view, motionEvent);
            }
        });
        m63017I1(true);
    }

    /* JADX INFO: renamed from: I0 */
    public void m63016I0() {
        this.f40790q.m62936p(this.f40795v, this.f40794u);
    }

    /* JADX INFO: renamed from: I1 */
    public final void m63017I1(boolean z) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f40792s, "alpha", z ? 0.0f : 1.0f, z ? 1.0f : 0.0f);
        objectAnimatorOfFloat.setDuration(200L);
        objectAnimatorOfFloat.addListener(new C11253a(z));
        objectAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: J0 */
    public final void m63018J0() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f40790q.getLayoutParams();
        layoutParams.height = this.f40793t;
        this.f40790q.setLayoutParams(layoutParams);
        m63009C1();
        xdl0.m208325C0(this.f40789p, this.f40793t);
    }

    /* JADX INFO: renamed from: J1 */
    public void m63019J1() {
        if (this.f40772B) {
            this.f40791r.m62947F();
        }
    }

    /* JADX INFO: renamed from: K0 */
    public void m63020K0(d30 d30Var) {
        this.f40783j.setVisibility(0);
        m63022L0(d30Var);
        zvf0.m220402x("e_voice_moment_post", "p_moment_post");
    }

    /* JADX INFO: renamed from: K1 */
    public void m63021K1(boolean z) {
        if (this.f40776F) {
            return;
        }
        xdl0.m208344M(this.f40778e, z);
    }

    /* JADX INFO: renamed from: L0 */
    public final void m63022L0(final d30 d30Var) {
        xdl0.m208329E0(this.f40783j, new View.OnClickListener() { // from class: l.fsh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99076a.m63030S0(d30Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: L1 */
    public boolean m63023L1() {
        return this.f40792s.getVisibility() == 0;
    }

    /* JADX INFO: renamed from: M1 */
    public void m63024M1(Integer num) {
        setAlbumHeight(num);
    }

    /* JADX INFO: renamed from: N0 */
    public void m63025N0() {
        this.f40791r.m62950z(this.f40795v, new e30() { // from class: l.ssh
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f166215a.m63031T0(obj);
            }
        }, new e30() { // from class: l.tsh
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f171939a.m63032U0(obj);
            }
        });
    }

    /* JADX INFO: renamed from: O0 */
    public void m63026O0(final Act act, C11245a c11245a) {
        this.f40795v = act;
        this.f40794u = c11245a;
        addView(m63051y0(LayoutInflater.from(act), this));
        if (u2h.m191499h()) {
            this.f40780g.setImageResource(f3c0.f94500d3);
            this.f40781h.setImageResource(f3c0.f94516f3);
            this.f40783j.setImageResource(f3c0.f94508e3);
            this.f40784k.setImageResource(f3c0.f94524g3);
            this.f40786m.setImageResource(f3c0.f94532h3);
            this.f40787n.setTextColor(getResources().getColor(e1c0.f88786h));
            Drawable drawable = getResources().getDrawable(f3c0.f94460Y1);
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            this.f40787n.setCompoundDrawables(null, null, drawable, null);
        }
        xdl0.m208329E0(this.f40781h, new View.OnClickListener() { // from class: l.msh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f135497a.m62985V0(view);
            }
        });
        xdl0.m208329E0(this.f40784k, new View.OnClickListener() { // from class: l.nsh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f140267a.m62986X0(view);
            }
        });
        xdl0.m208344M(this.f40785l, nkg.m159914x());
        xdl0.m208329E0(this.f40785l, new View.OnClickListener() { // from class: l.osh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f145395a.m62987Y0(view);
            }
        });
        xdl0.m208329E0(this.f40780g, new View.OnClickListener() { // from class: l.psh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f151016a.m62988Z0(view);
            }
        });
        this.f40787n.getPaint().setFakeBoldText(true);
        this.f40787n.setText(el00.m117022k().m117026j());
        this.f40773C = el00.m117022k().m117024h();
        xdl0.m208329E0(this.f40787n, new View.OnClickListener() { // from class: l.qsh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f156193a.m63034d1(act, view);
            }
        });
        xdl0.m208344M(this.f40786m, false);
        xdl0.m208329E0(this.f40786m, new View.OnClickListener() { // from class: l.rsh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f160865a.m62989e1(view);
            }
        });
        this.f40778e.m62980z(act, c11245a);
        m63018J0();
    }

    /* JADX INFO: renamed from: P0 */
    public void m63027P0() {
        this.f40783j.setSelected(true);
        if (m63028Q0() || this.f40771A) {
            m63013G1(false);
            xdl0.m208345M0(this.f40789p, true);
            this.f40791r.m62948v(true);
        } else {
            xdl0.m208345M0(this.f40789p, true);
            xdl0.m208345M0(this.f40791r, true);
            m63045r1(true);
        }
        if (this.f40771A && NullChecker.m81303a(this.f40799z)) {
            this.f40799z.call();
        }
        this.f40772B = true;
        zvf0.m220402x("e_voice_button", "p_moment_post");
    }

    /* JADX INFO: renamed from: Q0 */
    public boolean m63028Q0() {
        return this.f40780g.isSelected();
    }

    /* JADX INFO: renamed from: R0 */
    public boolean m63029R0() {
        return this.f40772B;
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m63030S0(d30 d30Var, View view) {
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
        m63039k1(true);
    }

    /* JADX INFO: renamed from: T0 */
    public final /* synthetic */ void m63031T0(Object obj) {
        if (NullChecker.m81303a(this.f40796w)) {
            this.f40796w.mo63056a((Audio) obj);
        }
        m63011E0();
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ void m63032U0(Object obj) {
        int i = C11254b.f40802a[((AudioRecordState) obj).ordinal()];
        if (i == 1) {
            m63011E0();
        } else {
            if (i != 2) {
                return;
            }
            m63015H1();
        }
    }

    /* JADX INFO: renamed from: a1 */
    public final /* synthetic */ void m63033a1(VListCell.C22545a c22545a, int i) {
        this.f40787n.setText(el00.m117022k().m117028m(i));
        this.f40773C = i;
        if (NullChecker.m81303a(this.f40774D)) {
            this.f40774D.mo63058a(el00.m117022k().m117030o(this.f40773C));
        }
    }

    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ void m63034d1(Act act, View view) {
        el00.m117022k().m117035t(act, this.f40773C, new el00.InterfaceC16641b() { // from class: l.ish
            @Override // p149l.el00.InterfaceC16641b
            /* JADX INFO: renamed from: a */
            public final void mo117045a(VListCell.C22545a c22545a, int i) {
                this.f114765a.m63033a1(c22545a, i);
            }
        });
    }

    /* JADX INFO: renamed from: g1 */
    public final /* synthetic */ void m63036g1(int i) {
        xdl0.m208325C0(this.f40789p, i);
    }

    public String getSelectedFolderPath() {
        return this.f40790q.getSelectedFolderPath();
    }

    public int getSelectedPosition() {
        return this.f40773C;
    }

    public List<TopicMoment> getTopicList() {
        return this.f40778e.getTopicList();
    }

    /* JADX INFO: renamed from: h1 */
    public final /* synthetic */ void m63037h1(ValueAnimator valueAnimator) {
        xdl0.m208325C0(this.f40789p, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: renamed from: j1 */
    public void m63038j1() {
        AudioBusinessType audioBusinessTypeMo135235c = ib1.m135233b().mo135235c();
        if (NullChecker.m81303a(audioBusinessTypeMo135235c)) {
            osi0.m165783g(audioBusinessTypeMo135235c.getBusinessMsg());
            return;
        }
        if (FeedPostPageMediaSelectableHandle.m62678c(this.f40794u.m62777g1(), this.f40794u.f40673p)) {
            if (this.f40794u.m62783m1()) {
                ComicFaceRecorderActivity.m62060h2(this.f40795v);
                return;
            }
            if (this.f40790q.m62937s()) {
                oe40.m163840h0(this.f40795v, this.f40794u.m62777g1().size() > 0, null, "", true, false);
            } else if (this.f40794u.m62777g1().size() == this.f40790q.getMaxCount()) {
                lsi0.m151578h(R$string.f38893F1);
                return;
            } else {
                this.f40782i.m65056k();
                oe40.m163840h0(this.f40795v, this.f40794u.m62777g1().size() > 0, this.f40790q.getSelectedImages(), this.f40790q.getSelectedFolderPath(), true, false);
            }
            m84.m153429e().m153439k();
        }
    }

    /* JADX INFO: renamed from: k1 */
    public void m63039k1(boolean z) {
        AudioBusinessType audioBusinessTypeMo135235c = ib1.m135233b().mo135235c();
        if (NullChecker.m81303a(audioBusinessTypeMo135235c)) {
            osi0.m165783g(audioBusinessTypeMo135235c.getBusinessMsg());
            return;
        }
        zvf0.m220396r("e_voice_moment_post", "p_moment_post");
        if (FeedPostPageMediaSelectableHandle.m62677b(this.f40794u.m62777g1(), this.f40794u.f40673p)) {
            m63025N0();
            m63007B0();
        }
    }

    /* JADX INFO: renamed from: l1 */
    public void m63040l1() {
        this.f40772B = false;
        if (!this.f40771A && !m63028Q0()) {
            m63045r1(false);
        }
        if (this.f40771A) {
            xdl0.m208345M0(this.f40789p, false);
        }
        this.f40783j.setSelected(false);
        this.f40792s.setVisibility(8);
    }

    /* JADX INFO: renamed from: n1, reason: merged with bridge method [inline-methods] */
    public final void m63035f1() {
        if (!zqx.m219898k() && !m62984G0()) {
            m62983F1(this.f40795v, new d30() { // from class: l.jsh
                @Override // p149l.d30
                public final void call() {
                    this.f119509a.m63035f1();
                }
            });
        } else if (FeedPostPageMediaSelectableHandle.m62676a(this.f40794u.m62777g1(), this.f40794u.f40673p)) {
            m63046s1();
        }
    }

    /* JADX INFO: renamed from: o1 */
    public void m63042o1(boolean z) {
        this.f40790q.m62938u(z);
    }

    /* JADX INFO: renamed from: p1 */
    public void m63043p1(String str, List<TopicMoment> list) {
        if (this.f40776F) {
            return;
        }
        this.f40778e.m62973C(str, list);
    }

    /* JADX INFO: renamed from: q1 */
    public void m63044q1(ArrayList<Media> arrayList) {
        this.f40790q.m62939v(arrayList);
    }

    /* JADX INFO: renamed from: r1 */
    public final void m63045r1(boolean z) {
        int i = z ? 0 : this.f40793t;
        final int i2 = z ? this.f40793t : 0;
        Animator animatorM103738k = bt0.m103738k(ValueAnimator.ofInt(i, i2), new LinearInterpolator(), 0L, z ? 200L : 300L);
        ((ValueAnimator) animatorM103738k).addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.esh
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f93009a.m63037h1(valueAnimator);
            }
        });
        bt0.m103733f(animatorM103738k, new Runnable() { // from class: l.lsh
            @Override // java.lang.Runnable
            public final void run() {
                this.f129866a.m63036g1(i2);
            }
        });
        animatorM103738k.start();
    }

    /* JADX INFO: renamed from: s1 */
    public void m63046s1() {
        if (this.f40790q.m62937s()) {
            return;
        }
        if (NullChecker.m81303a(this.f40790q.getSelectedVideo())) {
            lsi0.m151578h(R$string.f39067h0);
            return;
        }
        Act act = this.f40795v;
        act.startActivityForResult(MediaPickerAct.m78919X1(act, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(9).build()).withVideoPickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).build()).withAlreadySelectedMedia(this.f40794u.m62777g1()).withSelectedFolderPath(this.f40790q.getSelectedFolderPath()).withFromType(2).withMediaPreviewPageId("p_camera_album_picture_preview").needAllSelectedMediaPreview().withIsNewUIAb(u2h.m191499h()).build()), 66);
        this.f40795v.overridePendingTransition(uzb0.f178984i, 0);
    }

    public void setAlbumHeight(Integer num) {
        if (num.intValue() == 0 || this.f40793t == num.intValue()) {
            return;
        }
        this.f40793t = num.intValue();
        m63018J0();
    }

    public void setFeedPostAtListener(InterfaceC11255c interfaceC11255c) {
        this.f40798y = interfaceC11255c;
    }

    public void setFeedPostAudioFinishListener(InterfaceC11256d interfaceC11256d) {
        this.f40796w = interfaceC11256d;
    }

    public void setFeedPostLocationListener(InterfaceC11257e interfaceC11257e) {
        this.f40797x = interfaceC11257e;
    }

    public void setHideInputEditFieldAction(d30 d30Var) {
        this.f40799z = d30Var;
    }

    public void setIMomentVisibleChangedListener(InterfaceC11258f interfaceC11258f) {
        this.f40774D = interfaceC11258f;
    }

    public void setSelectedImages(ArrayList<Media> arrayList) {
        this.f40790q.setSelectedImages(arrayList);
    }

    /* JADX INFO: renamed from: t1 */
    public void m63047t1(Boolean bool) {
        if (bool.booleanValue() == this.f40771A) {
            return;
        }
        this.f40771A = bool.booleanValue();
        if (bool.booleanValue()) {
            m63050w1();
        } else {
            m63049v1();
        }
    }

    /* JADX INFO: renamed from: u1 */
    public void m63048u1(boolean z) {
        xdl0.m208344M(this.f40782i, z);
    }

    /* JADX INFO: renamed from: v1 */
    public final void m63049v1() {
        if (m63028Q0() || this.f40772B) {
            return;
        }
        m63045r1(this.f40771A);
    }

    /* JADX INFO: renamed from: w1 */
    public final void m63050w1() {
        if (m63028Q0()) {
            m63013G1(false);
        } else if (this.f40772B) {
            m63040l1();
        } else {
            xdl0.m208345M0(this.f40789p, false);
            m63045r1(this.f40771A);
        }
    }

    /* JADX INFO: renamed from: y0 */
    public View m63051y0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ush.m195197b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: y1 */
    public void m63052y1(String str) {
        this.f40790q.m62940w(str);
    }

    /* JADX INFO: renamed from: z0 */
    public void m63053z0() {
        if (this.f40771A || this.f40789p.getHeight() == 0) {
            return;
        }
        m63045r1(false);
    }

    /* JADX INFO: renamed from: z1 */
    public void m63054z1() {
        this.f40778e.m62974E();
    }

    public FeedPostBottomView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f40793t = C11246b.f40684X;
    }

    public FeedPostBottomView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f40793t = C11246b.f40684X;
    }
}
