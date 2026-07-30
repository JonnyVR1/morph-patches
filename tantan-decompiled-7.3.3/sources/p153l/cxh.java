package p153l;

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
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.data.BubbleInfo;
import com.p051p1.mobile.putong.data.DoublePair;
import com.p051p1.mobile.putong.data.Emotion;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.MessageLocation;
import com.p051p1.mobile.putong.data.TextTheme;
import com.p051p1.mobile.putong.feed.newui.mediapicker.post.NewPostLocationAct;
import com.p051p1.mobile.putong.feed.newui.status.display.view.FeedStatesMediaView;
import com.p051p1.mobile.putong.feed.newui.status.post.FeedPostStatusAct;
import com.p051p1.mobile.putong.feed.newui.status.selectstatus.FeedSelectStatusAct;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p151v.VDraweeView;
import p151v.VEditText;
import p151v.VImage;
import p151v.VRelative;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class cxh implements iam<lwh>, d0r {

    /* JADX INFO: renamed from: a */
    public VRelative f84224a;

    /* JADX INFO: renamed from: b */
    public FeedStatesMediaView f84225b;

    /* JADX INFO: renamed from: c */
    public View f84226c;

    /* JADX INFO: renamed from: d */
    public VImage f84227d;

    /* JADX INFO: renamed from: e */
    public VRelative f84228e;

    /* JADX INFO: renamed from: f */
    public VText f84229f;

    /* JADX INFO: renamed from: g */
    public VEditText f84230g;

    /* JADX INFO: renamed from: h */
    public VText f84231h;

    /* JADX INFO: renamed from: i */
    public VImage f84232i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f84233j;

    /* JADX INFO: renamed from: k */
    public ConstraintLayout f84234k;

    /* JADX INFO: renamed from: l */
    public VImage f84235l;

    /* JADX INFO: renamed from: m */
    public VImage f84236m;

    /* JADX INFO: renamed from: n */
    public VImage f84237n;

    /* JADX INFO: renamed from: o */
    public VText f84238o;

    /* JADX INFO: renamed from: p */
    public lwh f84239p;

    /* JADX INFO: renamed from: q */
    public FeedPostStatusAct f84240q;

    /* JADX INFO: renamed from: r */
    public boolean f84241r;

    /* JADX INFO: renamed from: u */
    public MessageLocation f84244u;

    /* JADX INFO: renamed from: v */
    public Media f84245v;

    /* JADX INFO: renamed from: s */
    public final Interpolator f84242s = new xjg();

    /* JADX INFO: renamed from: t */
    public final Interpolator f84243t = new xjg();

    /* JADX INFO: renamed from: w */
    public boolean f84246w = false;

    public cxh(FeedPostStatusAct feedPostStatusAct) {
        this.f84240q = feedPostStatusAct;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: A */
    private void m112984A() {
        bnl0.m105509E0(this.f84227d, new View.OnClickListener() { // from class: l.swh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f170977a.m113010F(view);
            }
        });
        jyb.m147537z(jyb.m147507f0(this.f84231h, this.f84232i), new y20() { // from class: l.twh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f176395a.m112985H((View) obj);
            }
        });
        bnl0.m105509E0(this.f84237n, new View.OnClickListener() { // from class: l.uwh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f181278a.m112986I(view);
            }
        });
        bnl0.m105509E0(this.f84236m, new View.OnClickListener() { // from class: l.vwh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f186140a.m112987J(view);
            }
        });
        bnl0.m105509E0(this.f84235l, new View.OnClickListener() { // from class: l.wwh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f191278a.m112988K(view);
            }
        });
        this.f84229f.setOnTouchListener(new View.OnTouchListener() { // from class: l.xwh
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f196500a.m113012L(view, motionEvent);
            }
        });
        this.f84230g.setFilters(new InputFilter[]{new b4h(30)});
        this.f84230g.addTextChangedListener(new C16390a());
        bnl0.m105509E0(this.f84238o, new View.OnClickListener() { // from class: l.ywh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f201837a.m113014N(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m112985H(View view) {
        view.setOnClickListener(new View.OnClickListener() { // from class: l.owh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f149478a.m113011G(view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m112986I(View view) {
        m113029x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m112987J(View view) {
        cn40.m111386f0(this.f84240q, true);
        this.f84240q.hideInput(this.f84230g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m112988K(View view) {
        FeedPostStatusAct feedPostStatusAct = this.f84240q;
        feedPostStatusAct.startActivityForResult(MediaPickerAct.m80102Y1(feedPostStatusAct, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropProportion(0.730198f).build()).withVideoPickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).build()).withFromType(7).withMediaPreviewPageId("p_camera_album_picture_preview").needAllSelectedMediaPreview().build()), 66);
        this.f84240q.overridePendingTransition(a8c0.f68909i, a8c0.f68905e);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0063  */
    /* JADX INFO: renamed from: W */
    private void m112989W() {
        i4g0.m138492A("e_set_my_state_post", "p_set_my_state_post", pf60.m172085a("source_page", this.f84240q.f43814m));
        this.f84238o.setSelected(true);
        m113020T(this.f84240q.f43811j);
        if (NullChecker.m82486a(this.f84240q.f43812k)) {
            if (TextUtils.isEmpty(this.f84240q.f43812k.location.name)) {
                this.f84244u = null;
                this.f84229f.setVisibility(4);
            } else {
                MessageLocation messageLocation = this.f84240q.f43812k.location;
                DoublePair doublePair = messageLocation.coordinates;
                if (doublePair.first == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && doublePair.second == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                    this.f84244u = null;
                    this.f84229f.setVisibility(4);
                } else {
                    this.f84244u = messageLocation;
                    this.f84229f.setVisibility(0);
                    this.f84229f.setText(this.f84244u.name);
                }
            }
            if (!TextUtils.isEmpty(this.f84240q.f43812k.value)) {
                this.f84230g.setText(this.f84240q.f43812k.value);
                VEditText vEditText = this.f84230g;
                vEditText.setSelection(vEditText.getText().length());
            }
            if (NullChecker.m82486a(this.f84240q.f43812k) && this.f84240q.f43812k.media.size() > 0) {
                m113021U((ArrayList) this.f84240q.f43812k.media);
                return;
            }
            this.f84245v = null;
            FeedPostStatusAct feedPostStatusAct = this.f84240q;
            feedPostStatusAct.m66985o2(feedPostStatusAct.m66993e2());
        }
    }

    /* JADX INFO: renamed from: Z */
    private void m112990Z(int i) {
        gt0.m132175u(true, this.f84242s, 290L, gt0.m132171q(this.f84234k, "translationY", -i)).start();
    }

    /* JADX INFO: renamed from: r */
    private void m113005r() {
        ViewGroup.LayoutParams layoutParams = this.f84225b.getLayoutParams();
        int iM105592y0 = bnl0.m105592y0();
        layoutParams.width = iM105592y0;
        layoutParams.height = (int) (iM105592y0 * 1.3694916f);
        this.f84225b.setLayoutParams(layoutParams);
        this.f84225b.setOutlineProvider(new pkh(qa00.m175859d(24.0f)));
        this.f84225b.setClipToOutline(true);
        m113027v();
        l51.m152888H(this.f84240q, new Runnable() { // from class: l.mwh
            @Override // java.lang.Runnable
            public final void run() {
                this.f139095a.m113015O();
            }
        }, 200L);
        if (cmg.m111177E()) {
            bnl0.m105524M(this.f84235l, false);
            bnl0.m105524M(this.f84236m, false);
            bnl0.m105524M(this.f84237n, false);
        }
    }

    /* JADX INFO: renamed from: y */
    private GradientDrawable m113006y() {
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{this.f84240q.getResources().getColor(k9c0.f124495a), this.f84240q.getResources().getColor(k9c0.f124495a), this.f84240q.getResources().getColor(k9c0.f124495a)});
        gradientDrawable.setCornerRadii(new float[]{qa00.m175859d(24.0f), qa00.m175859d(24.0f), qa00.m175859d(24.0f), qa00.m175859d(24.0f), 0.0f, 0.0f, 0.0f, 0.0f});
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TL_BR);
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public final void m113008C(int i) {
        float measuredHeight = this.f84224a.getMeasuredHeight() / qa00.m175859d(774.0f);
        int iM175859d = (int) (qa00.m175859d(83.0f) * measuredHeight);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f84228e.getLayoutParams();
        layoutParams.bottomMargin = i + iM175859d;
        this.f84228e.setLayoutParams(layoutParams);
        m113023X(this.f84230g, measuredHeight, 20);
        m113023X(this.f84231h, measuredHeight, 59);
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f84233j.getLayoutParams();
        int iM175859d2 = (int) (qa00.m175859d(108.0f) * measuredHeight);
        layoutParams2.width = iM175859d2;
        layoutParams2.height = iM175859d2;
        this.f84233j.setLayoutParams(layoutParams2);
        this.f84228e.setVisibility(0);
    }

    @Override // p153l.iam
    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m113010F(View view) {
        this.f84240q.hideInput(this.f84230g);
        this.f84240q.lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m113011G(View view) {
        FeedPostStatusAct feedPostStatusAct = this.f84240q;
        FeedSelectStatusAct.m67002F2(feedPostStatusAct, feedPostStatusAct.f43814m);
        this.f84240q.hideInput(this.f84230g);
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ boolean m113012L(View view, MotionEvent motionEvent) {
        Drawable drawable = this.f84229f.getCompoundDrawables()[2];
        if (drawable != null && motionEvent.getAction() == 0 && motionEvent.getX() > (this.f84229f.getWidth() - this.f84229f.getPaddingRight()) - drawable.getIntrinsicWidth()) {
            this.f84229f.setVisibility(4);
            this.f84244u = null;
        }
        return false;
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m113014N(View view) {
        if (!Network.isConnected(this.f84240q)) {
            r1j0.m179420g("网络异常");
            return;
        }
        if (mrb0.m159625C().isJailedOrRestrict()) {
            orb0.m168880I();
            return;
        }
        i4g0.m138523u("e_set_my_state_post", "p_set_my_state_post", pf60.m172085a("source_page", this.f84240q.f43814m));
        final BubbleInfo bubbleInfo = new BubbleInfo();
        String string = this.f84230g.getText().toString();
        if (!TextUtils.isEmpty(string)) {
            bubbleInfo.value = string;
        }
        bubbleInfo.emotion = this.f84240q.f43811j;
        if (NullChecker.m82486a(this.f84244u)) {
            bubbleInfo.location = this.f84244u;
        }
        TextTheme textTheme = new TextTheme();
        textTheme.backgroundColor = this.f84240q.f43811j.backgroundColor;
        if (cmg.m111177E()) {
            textTheme.iconColor = this.f84240q.f43811j.iconColor;
        }
        bubbleInfo.textTheme = textTheme;
        if (NullChecker.m82486a(this.f84245v)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.f84245v);
            bubbleInfo.media = arrayList;
        }
        if (TextUtils.isEmpty(string)) {
            m113013M(bubbleInfo);
        } else {
            this.f84239p.m156047g0(string, new x20() { // from class: l.axh
                @Override // p153l.x20
                public final void call() {
                    this.f73856a.m113013M(bubbleInfo);
                }
            });
        }
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m113015O() {
        bnl0.m105500A(this.f84230g);
        this.f84240q.showInput(this.f84230g, 0);
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m113016P() {
        bnl0.m105500A(this.f84230g);
        this.f84240q.showInput(this.f84230g, 0);
    }

    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public void m113009E() {
        PermissionHelper.m81065c().m81083r("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION").m81088w(false).m81086u(true).m81078m(new x20() { // from class: l.pwh
            @Override // p153l.x20
            public final void call() {
                this.f154404a.m113029x();
            }
        }, new y20() { // from class: l.qwh
            @Override // p153l.y20
            public final void call(Object obj) {
                o1j0.m165651y("开启定位服务，获取精准定位");
            }
        }).m81074i(this.f84240q);
    }

    /* JADX INFO: renamed from: R */
    public void m113018R() {
        l51.m152888H(this.f84240q, new Runnable() { // from class: l.nwh
            @Override // java.lang.Runnable
            public final void run() {
                this.f143959a.m113016P();
            }
        }, 400L);
    }

    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public void m113013M(BubbleInfo bubbleInfo) {
        this.f84240q.hideInput(this.f84230g);
        this.f84239p.m156051k0(bubbleInfo);
        this.f84240q.lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: T */
    public void m113020T(Emotion emotion) {
        uqb0.f180374G.m127115L0(this.f84233j, emotion.emojiUrl);
        this.f84231h.setText(emotion.text);
    }

    /* JADX INFO: renamed from: U */
    public void m113021U(ArrayList<Media> arrayList) {
        this.f84240q.m66985o2(m113006y());
        this.f84226c.setVisibility(0);
        this.f84245v = arrayList.get(0);
        this.f84225b.setAutoPlay(true);
        this.f84225b.m66938f(this.f84245v, !this.f84240q.f43813l);
    }

    /* JADX INFO: renamed from: V */
    public void m113022V(BubbleInfo bubbleInfo) {
        FeedPostStatusAct feedPostStatusAct = this.f84240q;
        Emotion emotion = bubbleInfo.emotion;
        feedPostStatusAct.f43811j = emotion;
        emotion.backgroundColor = bubbleInfo.textTheme.backgroundColor;
        m113020T(emotion);
        m113021U((ArrayList) bubbleInfo.media);
        if (TextUtils.isEmpty(bubbleInfo.location.name)) {
            this.f84244u = bubbleInfo.location;
            this.f84229f.setVisibility(0);
            this.f84229f.setText(this.f84244u.name);
        } else {
            this.f84229f.setVisibility(4);
        }
        if (TextUtils.isEmpty(bubbleInfo.value)) {
            this.f84230g.setText(bubbleInfo.value);
        }
    }

    /* JADX INFO: renamed from: X */
    public void m113023X(View view, float f, int i) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
        layoutParams.bottomMargin = (int) (qa00.m175859d(i) * f);
        view.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: Y */
    public void m113024Y() {
        if (!NullChecker.m82486a(this.f84239p.f133814c)) {
            this.f84244u = null;
            this.f84229f.setText((CharSequence) null);
            this.f84229f.setVisibility(4);
            return;
        }
        MessageLocation messageLocation = new MessageLocation();
        this.f84244u = messageLocation;
        lwh lwhVar = this.f84239p;
        String str = lwhVar.f133812a;
        messageLocation.name = str;
        messageLocation.address = lwhVar.f133813b;
        messageLocation.coordinates = lwhVar.f133814c;
        this.f84229f.setText(str);
        this.f84229f.setVisibility(0);
    }

    @Override // p153l.iam
    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f84240q;
    }

    @Override // p153l.d0r
    /* JADX INFO: renamed from: h */
    public void mo43567h(int i, int i2) {
        if (i <= 0 || this.f84241r || i == bnl0.m105516I(this.f84240q)) {
            if (i == 0 && this.f84241r) {
                this.f84241r = false;
                m113030z();
                return;
            } else {
                if (bnl0.m105529O0(this.f84228e)) {
                    return;
                }
                m113008C(this.f84224a.getMeasuredHeight() / 3);
                return;
            }
        }
        if (Build.VERSION.SDK_INT >= 30 && i > bnl0.m105588w0() / 2) {
            i /= 2;
        }
        if (!this.f84246w) {
            this.f84246w = true;
            m113025s(i);
        }
        this.f84241r = true;
        m112990Z(i);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM113026u = m113026u(layoutInflater, viewGroup);
        m113005r();
        m112984A();
        m112989W();
        return viewM113026u;
    }

    /* JADX INFO: renamed from: s */
    public final void m113025s(final int i) {
        this.f84224a.post(new Runnable() { // from class: l.rwh
            @Override // java.lang.Runnable
            public final void run() {
                this.f165138a.m113008C(i);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public View m113026u(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return dxh.m118478b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: v */
    public void m113027v() {
        f0r f0rVar = new f0r(getAct());
        f0rVar.m123509g(this);
        this.f84240q.getWindow().getDecorView().post(new kqg(f0rVar));
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(lwh lwhVar) {
        this.f84239p = lwhVar;
    }

    /* JADX INFO: renamed from: x */
    public void m113029x() {
        if (rkh.m181857a(new x20() { // from class: l.zwh
            @Override // p153l.x20
            public final void call() {
                this.f206348a.m113009E();
            }
        })) {
            this.f84240q.startActivityForResult(new Intent(this.f84240q, (Class<?>) NewPostLocationAct.class), 10020);
            this.f84240q.overridePendingTransition(a8c0.f68909i, a8c0.f68905e);
            this.f84240q.hideInput(this.f84230g);
        }
    }

    /* JADX INFO: renamed from: z */
    public void m113030z() {
        gt0.m132175u(true, this.f84242s, 390L, gt0.m132171q(this.f84234k, "translationY", 0.0f)).start();
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.cxh$a */
    public class C16390a implements TextWatcher {
        public C16390a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (cxh.this.f84230g.getLineCount() > 3) {
                String string = editable.toString();
                int selectionStart = cxh.this.f84230g.getSelectionStart();
                cxh.this.f84230g.setText((selectionStart != cxh.this.f84230g.getSelectionEnd() || selectionStart >= string.length() || selectionStart < 1) ? string.substring(0, editable.length() - 1) : string.substring(0, selectionStart - 1).concat(string.substring(selectionStart)));
                VEditText vEditText = cxh.this.f84230g;
                vEditText.setSelection(vEditText.getText().length());
                l51.m152887G(new Runnable() { // from class: l.bxh
                    @Override // java.lang.Runnable
                    public final void run() {
                        o1j0.m165636j("最多输入3行");
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
