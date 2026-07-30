package p007l;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.data.BubbleInfo;
import com.p000p1.mobile.putong.data.DoublePair;
import com.p000p1.mobile.putong.data.Emotion;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.MessageLocation;
import com.p000p1.mobile.putong.data.TextTheme;
import com.p000p1.mobile.putong.feed.newui.mediapicker.post.NewPostLocationAct;
import com.p000p1.mobile.putong.feed.newui.status.display.view.FeedStatesMediaView;
import com.p000p1.mobile.putong.feed.newui.status.post.FeedPostStatusAct;
import com.p000p1.mobile.putong.feed.newui.status.selectstatus.FeedSelectStatusAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.api.api.Network;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p1.mobile.putong.ui.permission.PermissionHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.bt0;
import l.d30;
import l.dyq;
import l.e30;
import l.e51;
import l.fyq;
import l.j760;
import l.jig;
import l.lsi0;
import l.osi0;
import l.qib0;
import l.s7m;
import l.t100;
import l.vwb;
import l.xdl0;
import l.zvf0;
import v.VDraweeView;
import v.VEditText;
import v.VImage;
import v.VRelative;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class nvh implements s7m<wuh>, dyq {

    /* JADX INFO: renamed from: a */
    public VRelative f10893a;

    /* JADX INFO: renamed from: b */
    public FeedStatesMediaView f10894b;

    /* JADX INFO: renamed from: c */
    public View f10895c;

    /* JADX INFO: renamed from: d */
    public VImage f10896d;

    /* JADX INFO: renamed from: e */
    public VRelative f10897e;

    /* JADX INFO: renamed from: f */
    public VText f10898f;

    /* JADX INFO: renamed from: g */
    public VEditText f10899g;

    /* JADX INFO: renamed from: h */
    public VText f10900h;

    /* JADX INFO: renamed from: i */
    public VImage f10901i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f10902j;

    /* JADX INFO: renamed from: k */
    public ConstraintLayout f10903k;

    /* JADX INFO: renamed from: l */
    public VImage f10904l;

    /* JADX INFO: renamed from: m */
    public VImage f10905m;

    /* JADX INFO: renamed from: n */
    public VImage f10906n;

    /* JADX INFO: renamed from: o */
    public VText f10907o;

    /* JADX INFO: renamed from: p */
    public wuh f10908p;

    /* JADX INFO: renamed from: q */
    public FeedPostStatusAct f10909q;

    /* JADX INFO: renamed from: r */
    public boolean f10910r;

    /* JADX INFO: renamed from: u */
    public MessageLocation f10913u;

    /* JADX INFO: renamed from: v */
    public Media f10914v;

    /* JADX INFO: renamed from: s */
    public final Interpolator f10911s = new jig();

    /* JADX INFO: renamed from: t */
    public final Interpolator f10912t = new jig();

    /* JADX INFO: renamed from: w */
    public boolean f10915w = false;

    public nvh(FeedPostStatusAct feedPostStatusAct) {
        this.f10909q = feedPostStatusAct;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: A */
    private void m12337A() {
        xdl0.E0(this.f10896d, new View.OnClickListener() { // from class: l.dvh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7076a.m12364F(view);
            }
        });
        vwb.z(vwb.f0(new View[]{this.f10900h, this.f10901i}), new e30() { // from class: l.evh
            public final void call(Object obj) {
                this.f7486a.m12338H((View) obj);
            }
        });
        xdl0.E0(this.f10906n, new View.OnClickListener() { // from class: l.fvh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8258a.m12339I(view);
            }
        });
        xdl0.E0(this.f10905m, new View.OnClickListener() { // from class: l.gvh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8528a.m12340J(view);
            }
        });
        xdl0.E0(this.f10904l, new View.OnClickListener() { // from class: l.hvh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8828a.m12341K(view);
            }
        });
        this.f10898f.setOnTouchListener(new View.OnTouchListener() { // from class: l.ivh
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f9146a.m12366L(view, motionEvent);
            }
        });
        this.f10899g.setFilters(new InputFilter[]{new m2h(30)});
        this.f10899g.addTextChangedListener(new C2443a());
        xdl0.E0(this.f10907o, new View.OnClickListener() { // from class: l.jvh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9539a.m12368N(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m12338H(View view) {
        view.setOnClickListener(new View.OnClickListener() { // from class: l.zuh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f15859a.m12365G(view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m12339I(View view) {
        m12385x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m12340J(View view) {
        oe40.m12573f0(this.f10909q, true);
        this.f10909q.hideInput(this.f10899g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m12341K(View view) {
        PutongAct putongAct = this.f10909q;
        putongAct.startActivityForResult(MediaPickerAct.X1(putongAct, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropProportion(0.730198f).build()).withVideoPickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).build()).withFromType(7).withMediaPreviewPageId("p_camera_album_picture_preview").needAllSelectedMediaPreview().build()), 66);
        this.f10909q.overridePendingTransition(uzb0.f13995i, uzb0.f13991e);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0063  */
    /* JADX INFO: renamed from: W */
    private void m12342W() {
        zvf0.A("e_set_my_state_post", "p_set_my_state_post", new j760[]{j760.a("source_page", this.f10909q.f4427m)});
        this.f10907o.setSelected(true);
        m12374T(this.f10909q.f4424j);
        if (NullChecker.a(this.f10909q.f4425k)) {
            if (TextUtils.isEmpty(this.f10909q.f4425k.location.name)) {
                this.f10913u = null;
                this.f10898f.setVisibility(4);
            } else {
                MessageLocation messageLocation = this.f10909q.f4425k.location;
                DoublePair doublePair = messageLocation.coordinates;
                if (doublePair.first == 0.0d && doublePair.second == 0.0d) {
                    this.f10913u = null;
                    this.f10898f.setVisibility(4);
                } else {
                    this.f10913u = messageLocation;
                    this.f10898f.setVisibility(0);
                    this.f10898f.setText(this.f10913u.name);
                }
            }
            if (!TextUtils.isEmpty(this.f10909q.f4425k.value)) {
                this.f10899g.setText(this.f10909q.f4425k.value);
                VEditText vEditText = this.f10899g;
                vEditText.setSelection(vEditText.getText().length());
            }
            if (NullChecker.a(this.f10909q.f4425k) && this.f10909q.f4425k.media.size() > 0) {
                m12375U((ArrayList) this.f10909q.f4425k.media);
                return;
            }
            this.f10914v = null;
            FeedPostStatusAct feedPostStatusAct = this.f10909q;
            feedPostStatusAct.m6948n2(feedPostStatusAct.m6956d2());
        }
    }

    /* JADX INFO: renamed from: Z */
    private void m12343Z(int i) {
        bt0.u(true, this.f10911s, 290L, new Animator[]{bt0.q(this.f10903k, "translationY", new float[]{-i})}).start();
    }

    /* JADX INFO: renamed from: r */
    private void m12358r() {
        ViewGroup.LayoutParams layoutParams = this.f10894b.getLayoutParams();
        int iY0 = xdl0.y0();
        layoutParams.width = iY0;
        layoutParams.height = (int) (iY0 * 1.3694916f);
        this.f10894b.setLayoutParams(layoutParams);
        this.f10894b.setOutlineProvider(new ajh(t100.d(24.0f)));
        this.f10894b.setClipToOutline(true);
        m12383v();
        e51.H(this.f10909q, new Runnable() { // from class: l.xuh
            @Override // java.lang.Runnable
            public final void run() {
                this.f15156a.m12369O();
            }
        }, 200L);
        if (nkg.m12207E()) {
            xdl0.M(this.f10904l, false);
            xdl0.M(this.f10905m, false);
            xdl0.M(this.f10906n, false);
        }
    }

    /* JADX INFO: renamed from: y */
    private GradientDrawable m12359y() {
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{this.f10909q.getResources().getColor(e1c0.f7128a), this.f10909q.getResources().getColor(e1c0.f7128a), this.f10909q.getResources().getColor(e1c0.f7128a)});
        gradientDrawable.setCornerRadii(new float[]{t100.d(24.0f), t100.d(24.0f), t100.d(24.0f), t100.d(24.0f), 0.0f, 0.0f, 0.0f, 0.0f});
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TL_BR);
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public final void m12361C(int i) {
        float measuredHeight = this.f10893a.getMeasuredHeight() / t100.d(774.0f);
        int iD = (int) (t100.d(83.0f) * measuredHeight);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f10897e.getLayoutParams();
        layoutParams.bottomMargin = i + iD;
        this.f10897e.setLayoutParams(layoutParams);
        m12377X(this.f10899g, measuredHeight, 20);
        m12377X(this.f10900h, measuredHeight, 59);
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f10902j.getLayoutParams();
        int iD2 = (int) (t100.d(108.0f) * measuredHeight);
        layoutParams2.width = iD2;
        layoutParams2.height = iD2;
        this.f10902j.setLayoutParams(layoutParams2);
        this.f10897e.setVisibility(0);
    }

    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m12362C0() {
        return null;
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m12364F(View view) {
        this.f10909q.hideInput(this.f10899g);
        this.f10909q.finish();
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m12365G(View view) {
        FeedPostStatusAct feedPostStatusAct = this.f10909q;
        FeedSelectStatusAct.m6964E2(feedPostStatusAct, feedPostStatusAct.f4427m);
        this.f10909q.hideInput(this.f10899g);
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ boolean m12366L(View view, MotionEvent motionEvent) {
        Drawable drawable = this.f10898f.getCompoundDrawables()[2];
        if (drawable != null && motionEvent.getAction() == 0 && motionEvent.getX() > (this.f10898f.getWidth() - this.f10898f.getPaddingRight()) - drawable.getIntrinsicWidth()) {
            this.f10898f.setVisibility(4);
            this.f10913u = null;
        }
        return false;
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m12368N(View view) {
        if (!Network.isConnected(this.f10909q)) {
            osi0.g("网络异常");
            return;
        }
        if (ijb0.m10892C().isJailedOrRestrict()) {
            kjb0.m11445I();
            return;
        }
        zvf0.u("e_set_my_state_post", "p_set_my_state_post", new j760[]{j760.a("source_page", this.f10909q.f4427m)});
        final BubbleInfo bubbleInfo = new BubbleInfo();
        String string = this.f10899g.getText().toString();
        if (!TextUtils.isEmpty(string)) {
            bubbleInfo.value = string;
        }
        bubbleInfo.emotion = this.f10909q.f4424j;
        if (NullChecker.a(this.f10913u)) {
            bubbleInfo.location = this.f10913u;
        }
        TextTheme textTheme = new TextTheme();
        textTheme.backgroundColor = this.f10909q.f4424j.backgroundColor;
        if (nkg.m12207E()) {
            textTheme.iconColor = this.f10909q.f4424j.iconColor;
        }
        bubbleInfo.textTheme = textTheme;
        if (NullChecker.a(this.f10914v)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.f10914v);
            bubbleInfo.media = arrayList;
        }
        if (TextUtils.isEmpty(string)) {
            m12367M(bubbleInfo);
        } else {
            this.f10908p.m15929g0(string, new d30() { // from class: l.lvh
                public final void call() {
                    this.f10141a.m12367M(bubbleInfo);
                }
            });
        }
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m12369O() {
        xdl0.A(this.f10899g);
        this.f10909q.showInput(this.f10899g, 0);
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m12370P() {
        xdl0.A(this.f10899g);
        this.f10909q.showInput(this.f10899g, 0);
    }

    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public void m12363E() {
        PermissionHelper.c().r(new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}).w(false).u(true).m(new d30() { // from class: l.avh
            public final void call() {
                this.f5864a.m12385x();
            }
        }, new e30() { // from class: l.bvh
            public final void call(Object obj) {
                lsi0.y("开启定位服务，获取精准定位");
            }
        }).i(this.f10909q);
    }

    /* JADX INFO: renamed from: R */
    public void m12372R() {
        e51.H(this.f10909q, new Runnable() { // from class: l.yuh
            @Override // java.lang.Runnable
            public final void run() {
                this.f15505a.m12370P();
            }
        }, 400L);
    }

    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public void m12367M(BubbleInfo bubbleInfo) {
        this.f10909q.hideInput(this.f10899g);
        this.f10908p.m15933k0(bubbleInfo);
        this.f10909q.finish();
    }

    /* JADX INFO: renamed from: T */
    public void m12374T(Emotion emotion) {
        qib0.G.L0(this.f10902j, emotion.emojiUrl);
        this.f10900h.setText(emotion.text);
    }

    /* JADX INFO: renamed from: U */
    public void m12375U(ArrayList<Media> arrayList) {
        this.f10909q.m6948n2(m12359y());
        this.f10895c.setVisibility(0);
        this.f10914v = arrayList.get(0);
        this.f10894b.setAutoPlay(true);
        this.f10894b.m6901f(this.f10914v, !this.f10909q.f4426l);
    }

    /* JADX INFO: renamed from: V */
    public void m12376V(BubbleInfo bubbleInfo) {
        FeedPostStatusAct feedPostStatusAct = this.f10909q;
        Emotion emotion = bubbleInfo.emotion;
        feedPostStatusAct.f4424j = emotion;
        emotion.backgroundColor = bubbleInfo.textTheme.backgroundColor;
        m12374T(emotion);
        m12375U((ArrayList) bubbleInfo.media);
        if (TextUtils.isEmpty(bubbleInfo.location.name)) {
            this.f10913u = bubbleInfo.location;
            this.f10898f.setVisibility(0);
            this.f10898f.setText(this.f10913u.name);
        } else {
            this.f10898f.setVisibility(4);
        }
        if (TextUtils.isEmpty(bubbleInfo.value)) {
            this.f10899g.setText(bubbleInfo.value);
        }
    }

    /* JADX INFO: renamed from: X */
    public void m12377X(View view, float f, int i) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
        layoutParams.bottomMargin = (int) (t100.d(i) * f);
        view.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: Y */
    public void m12378Y() {
        if (!NullChecker.a(this.f10908p.f14687c)) {
            this.f10913u = null;
            this.f10898f.setText(null);
            this.f10898f.setVisibility(4);
            return;
        }
        MessageLocation messageLocation = new MessageLocation();
        this.f10913u = messageLocation;
        wuh wuhVar = this.f10908p;
        String str = wuhVar.f14685a;
        messageLocation.name = str;
        messageLocation.address = wuhVar.f14686b;
        messageLocation.coordinates = wuhVar.f14687c;
        this.f10898f.setText(str);
        this.f10898f.setVisibility(0);
    }

    @Nullable
    @org.jetbrains.annotations.Nullable
    public Act act() {
        return this.f10909q;
    }

    /* JADX INFO: renamed from: h */
    public void m12379h(int i, int i2) {
        if (i <= 0 || this.f10910r || i == xdl0.I(this.f10909q)) {
            if (i == 0 && this.f10910r) {
                this.f10910r = false;
                m12386z();
                return;
            } else {
                if (xdl0.O0(this.f10897e)) {
                    return;
                }
                m12361C(this.f10893a.getMeasuredHeight() / 3);
                return;
            }
        }
        if (Build.VERSION.SDK_INT >= 30 && i > xdl0.w0() / 2) {
            i /= 2;
        }
        if (!this.f10915w) {
            this.f10915w = true;
            m12381s(i);
        }
        this.f10910r = true;
        m12343Z(i);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM12382u = m12382u(layoutInflater, viewGroup);
        m12358r();
        m12337A();
        m12342W();
        return viewM12382u;
    }

    /* JADX INFO: renamed from: s */
    public final void m12381s(final int i) {
        this.f10893a.post(new Runnable() { // from class: l.cvh
            @Override // java.lang.Runnable
            public final void run() {
                this.f6737a.m12361C(i);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public View m12382u(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ovh.m12867b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: v */
    public void m12383v() {
        fyq fyqVar = new fyq(act());
        fyqVar.g(this);
        this.f10909q.getWindow().getDecorView().post(new vog(fyqVar));
    }

    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void m12380i1(wuh wuhVar) {
        this.f10908p = wuhVar;
    }

    /* JADX INFO: renamed from: x */
    public void m12385x() {
        if (cjh.m9191a(new d30() { // from class: l.kvh
            public final void call() {
                this.f9807a.m12363E();
            }
        })) {
            this.f10909q.startActivityForResult(new Intent((Context) this.f10909q, (Class<?>) NewPostLocationAct.class), 10020);
            this.f10909q.overridePendingTransition(uzb0.f13995i, uzb0.f13991e);
            this.f10909q.hideInput(this.f10899g);
        }
    }

    /* JADX INFO: renamed from: z */
    public void m12386z() {
        bt0.u(true, this.f10911s, 390L, new Animator[]{bt0.q(this.f10903k, "translationY", new float[]{0.0f})}).start();
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: l.nvh$a */
    public class C2443a implements TextWatcher {
        public C2443a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (nvh.this.f10899g.getLineCount() > 3) {
                String string = editable.toString();
                int selectionStart = nvh.this.f10899g.getSelectionStart();
                nvh.this.f10899g.setText((selectionStart != nvh.this.f10899g.getSelectionEnd() || selectionStart >= string.length() || selectionStart < 1) ? string.substring(0, editable.length() - 1) : string.substring(0, selectionStart - 1).concat(string.substring(selectionStart)));
                VEditText vEditText = nvh.this.f10899g;
                vEditText.setSelection(vEditText.getText().length());
                e51.G(new Runnable() { // from class: l.mvh
                    @Override // java.lang.Runnable
                    public final void run() {
                        lsi0.j("最多输入3行");
                    }
                });
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
