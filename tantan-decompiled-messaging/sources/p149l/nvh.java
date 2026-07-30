package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.data.BubbleInfo;
import com.p046p1.mobile.putong.data.DoublePair;
import com.p046p1.mobile.putong.data.Emotion;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.MessageLocation;
import com.p046p1.mobile.putong.data.TextTheme;
import com.p046p1.mobile.putong.feed.newui.mediapicker.post.NewPostLocationAct;
import com.p046p1.mobile.putong.feed.newui.status.display.view.FeedStatesMediaView;
import com.p046p1.mobile.putong.feed.newui.status.post.FeedPostStatusAct;
import com.p046p1.mobile.putong.feed.newui.status.selectstatus.FeedSelectStatusAct;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p147v.VDraweeView;
import p147v.VEditText;
import p147v.VImage;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class nvh implements s7m<wuh>, dyq {

    /* JADX INFO: renamed from: a */
    public VRelative f140717a;

    /* JADX INFO: renamed from: b */
    public FeedStatesMediaView f140718b;

    /* JADX INFO: renamed from: c */
    public View f140719c;

    /* JADX INFO: renamed from: d */
    public VImage f140720d;

    /* JADX INFO: renamed from: e */
    public VRelative f140721e;

    /* JADX INFO: renamed from: f */
    public VText f140722f;

    /* JADX INFO: renamed from: g */
    public VEditText f140723g;

    /* JADX INFO: renamed from: h */
    public VText f140724h;

    /* JADX INFO: renamed from: i */
    public VImage f140725i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f140726j;

    /* JADX INFO: renamed from: k */
    public ConstraintLayout f140727k;

    /* JADX INFO: renamed from: l */
    public VImage f140728l;

    /* JADX INFO: renamed from: m */
    public VImage f140729m;

    /* JADX INFO: renamed from: n */
    public VImage f140730n;

    /* JADX INFO: renamed from: o */
    public VText f140731o;

    /* JADX INFO: renamed from: p */
    public wuh f140732p;

    /* JADX INFO: renamed from: q */
    public FeedPostStatusAct f140733q;

    /* JADX INFO: renamed from: r */
    public boolean f140734r;

    /* JADX INFO: renamed from: u */
    public MessageLocation f140737u;

    /* JADX INFO: renamed from: v */
    public Media f140738v;

    /* JADX INFO: renamed from: s */
    public final Interpolator f140735s = new jig();

    /* JADX INFO: renamed from: t */
    public final Interpolator f140736t = new jig();

    /* JADX INFO: renamed from: w */
    public boolean f140739w = false;

    public nvh(FeedPostStatusAct feedPostStatusAct) {
        this.f140733q = feedPostStatusAct;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: A */
    private void m161596A() {
        xdl0.m208329E0(this.f140720d, new View.OnClickListener() { // from class: l.dvh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f88062a.m161622F(view);
            }
        });
        vwb.m200354z(vwb.m200324f0(this.f140724h, this.f140725i), new e30() { // from class: l.evh
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f93337a.m161597H((View) obj);
            }
        });
        xdl0.m208329E0(this.f140730n, new View.OnClickListener() { // from class: l.fvh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99445a.m161598I(view);
            }
        });
        xdl0.m208329E0(this.f140729m, new View.OnClickListener() { // from class: l.gvh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f104572a.m161599J(view);
            }
        });
        xdl0.m208329E0(this.f140728l, new View.OnClickListener() { // from class: l.hvh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f109644a.m161600K(view);
            }
        });
        this.f140722f.setOnTouchListener(new View.OnTouchListener() { // from class: l.ivh
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f115167a.m161624L(view, motionEvent);
            }
        });
        this.f140723g.setFilters(new InputFilter[]{new m2h(30)});
        this.f140723g.addTextChangedListener(new C18782a());
        xdl0.m208329E0(this.f140731o, new View.OnClickListener() { // from class: l.jvh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f119940a.m161626N(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m161597H(View view) {
        view.setOnClickListener(new View.OnClickListener() { // from class: l.zuh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f204853a.m161623G(view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m161598I(View view) {
        m161641x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m161599J(View view) {
        oe40.m163836f0(this.f140733q, true);
        this.f140733q.hideInput(this.f140723g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m161600K(View view) {
        FeedPostStatusAct feedPostStatusAct = this.f140733q;
        feedPostStatusAct.startActivityForResult(MediaPickerAct.m78919X1(feedPostStatusAct, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropProportion(0.730198f).build()).withVideoPickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).build()).withFromType(7).withMediaPreviewPageId("p_camera_album_picture_preview").needAllSelectedMediaPreview().build()), 66);
        this.f140733q.overridePendingTransition(uzb0.f178984i, uzb0.f178980e);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0063  */
    /* JADX INFO: renamed from: W */
    private void m161601W() {
        zvf0.m220368A("e_set_my_state_post", "p_set_my_state_post", j760.m140076a("source_page", this.f140733q.f42966m));
        this.f140731o.setSelected(true);
        m161632T(this.f140733q.f42963j);
        if (NullChecker.m81303a(this.f140733q.f42964k)) {
            if (TextUtils.isEmpty(this.f140733q.f42964k.location.name)) {
                this.f140737u = null;
                this.f140722f.setVisibility(4);
            } else {
                MessageLocation messageLocation = this.f140733q.f42964k.location;
                DoublePair doublePair = messageLocation.coordinates;
                if (doublePair.first == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && doublePair.second == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                    this.f140737u = null;
                    this.f140722f.setVisibility(4);
                } else {
                    this.f140737u = messageLocation;
                    this.f140722f.setVisibility(0);
                    this.f140722f.setText(this.f140737u.name);
                }
            }
            if (!TextUtils.isEmpty(this.f140733q.f42964k.value)) {
                this.f140723g.setText(this.f140733q.f42964k.value);
                VEditText vEditText = this.f140723g;
                vEditText.setSelection(vEditText.getText().length());
            }
            if (NullChecker.m81303a(this.f140733q.f42964k) && this.f140733q.f42964k.media.size() > 0) {
                m161633U((ArrayList) this.f140733q.f42964k.media);
                return;
            }
            this.f140738v = null;
            FeedPostStatusAct feedPostStatusAct = this.f140733q;
            feedPostStatusAct.m65802n2(feedPostStatusAct.m65810d2());
        }
    }

    /* JADX INFO: renamed from: Z */
    private void m161602Z(int i) {
        bt0.m103748u(true, this.f140735s, 290L, bt0.m103744q(this.f140727k, "translationY", -i)).start();
    }

    /* JADX INFO: renamed from: r */
    private void m161617r() {
        ViewGroup.LayoutParams layoutParams = this.f140718b.getLayoutParams();
        int iM208412y0 = xdl0.m208412y0();
        layoutParams.width = iM208412y0;
        layoutParams.height = (int) (iM208412y0 * 1.3694916f);
        this.f140718b.setLayoutParams(layoutParams);
        this.f140718b.setOutlineProvider(new ajh(t100.m186890d(24.0f)));
        this.f140718b.setClipToOutline(true);
        m161639v();
        e51.m114743H(this.f140733q, new Runnable() { // from class: l.xuh
            @Override // java.lang.Runnable
            public final void run() {
                this.f194498a.m161627O();
            }
        }, 200L);
        if (nkg.m159848E()) {
            xdl0.m208344M(this.f140728l, false);
            xdl0.m208344M(this.f140729m, false);
            xdl0.m208344M(this.f140730n, false);
        }
    }

    /* JADX INFO: renamed from: y */
    private GradientDrawable m161618y() {
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{this.f140733q.getResources().getColor(e1c0.f88772a), this.f140733q.getResources().getColor(e1c0.f88772a), this.f140733q.getResources().getColor(e1c0.f88772a)});
        gradientDrawable.setCornerRadii(new float[]{t100.m186890d(24.0f), t100.m186890d(24.0f), t100.m186890d(24.0f), t100.m186890d(24.0f), 0.0f, 0.0f, 0.0f, 0.0f});
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TL_BR);
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public final void m161620C(int i) {
        float measuredHeight = this.f140717a.getMeasuredHeight() / t100.m186890d(774.0f);
        int iM186890d = (int) (t100.m186890d(83.0f) * measuredHeight);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f140721e.getLayoutParams();
        layoutParams.bottomMargin = i + iM186890d;
        this.f140721e.setLayoutParams(layoutParams);
        m161635X(this.f140723g, measuredHeight, 20);
        m161635X(this.f140724h, measuredHeight, 59);
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f140726j.getLayoutParams();
        int iM186890d2 = (int) (t100.m186890d(108.0f) * measuredHeight);
        layoutParams2.width = iM186890d2;
        layoutParams2.height = iM186890d2;
        this.f140726j.setLayoutParams(layoutParams2);
        this.f140721e.setVisibility(0);
    }

    @Override // p149l.s7m
    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m161622F(View view) {
        this.f140733q.hideInput(this.f140723g);
        this.f140733q.lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m161623G(View view) {
        FeedPostStatusAct feedPostStatusAct = this.f140733q;
        FeedSelectStatusAct.m65818E2(feedPostStatusAct, feedPostStatusAct.f42966m);
        this.f140733q.hideInput(this.f140723g);
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ boolean m161624L(View view, MotionEvent motionEvent) {
        Drawable drawable = this.f140722f.getCompoundDrawables()[2];
        if (drawable != null && motionEvent.getAction() == 0 && motionEvent.getX() > (this.f140722f.getWidth() - this.f140722f.getPaddingRight()) - drawable.getIntrinsicWidth()) {
            this.f140722f.setVisibility(4);
            this.f140737u = null;
        }
        return false;
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m161626N(View view) {
        if (!Network.isConnected(this.f140733q)) {
            osi0.m165783g("网络异常");
            return;
        }
        if (ijb0.m136539C().isJailedOrRestrict()) {
            kjb0.m146186I();
            return;
        }
        zvf0.m220399u("e_set_my_state_post", "p_set_my_state_post", j760.m140076a("source_page", this.f140733q.f42966m));
        final BubbleInfo bubbleInfo = new BubbleInfo();
        String string = this.f140723g.getText().toString();
        if (!TextUtils.isEmpty(string)) {
            bubbleInfo.value = string;
        }
        bubbleInfo.emotion = this.f140733q.f42963j;
        if (NullChecker.m81303a(this.f140737u)) {
            bubbleInfo.location = this.f140737u;
        }
        TextTheme textTheme = new TextTheme();
        textTheme.backgroundColor = this.f140733q.f42963j.backgroundColor;
        if (nkg.m159848E()) {
            textTheme.iconColor = this.f140733q.f42963j.iconColor;
        }
        bubbleInfo.textTheme = textTheme;
        if (NullChecker.m81303a(this.f140738v)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.f140738v);
            bubbleInfo.media = arrayList;
        }
        if (TextUtils.isEmpty(string)) {
            m161625M(bubbleInfo);
        } else {
            this.f140732p.m205630g0(string, new d30() { // from class: l.lvh
                @Override // p149l.d30
                public final void call() {
                    this.f130163a.m161625M(bubbleInfo);
                }
            });
        }
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m161627O() {
        xdl0.m208320A(this.f140723g);
        this.f140733q.showInput(this.f140723g, 0);
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m161628P() {
        xdl0.m208320A(this.f140723g);
        this.f140733q.showInput(this.f140723g, 0);
    }

    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public void m161621E() {
        PermissionHelper.m79882c().m79900r("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION").m79905w(false).m79903u(true).m79895m(new d30() { // from class: l.avh
            @Override // p149l.d30
            public final void call() {
                this.f71939a.m161641x();
            }
        }, new e30() { // from class: l.bvh
            @Override // p149l.e30
            public final void call(Object obj) {
                lsi0.m151595y("开启定位服务，获取精准定位");
            }
        }).m79891i(this.f140733q);
    }

    /* JADX INFO: renamed from: R */
    public void m161630R() {
        e51.m114743H(this.f140733q, new Runnable() { // from class: l.yuh
            @Override // java.lang.Runnable
            public final void run() {
                this.f200081a.m161628P();
            }
        }, 400L);
    }

    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public void m161625M(BubbleInfo bubbleInfo) {
        this.f140733q.hideInput(this.f140723g);
        this.f140732p.m205634k0(bubbleInfo);
        this.f140733q.lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: T */
    public void m161632T(Emotion emotion) {
        qib0.f154691G.m102331L0(this.f140726j, emotion.emojiUrl);
        this.f140724h.setText(emotion.text);
    }

    /* JADX INFO: renamed from: U */
    public void m161633U(ArrayList<Media> arrayList) {
        this.f140733q.m65802n2(m161618y());
        this.f140719c.setVisibility(0);
        this.f140738v = arrayList.get(0);
        this.f140718b.setAutoPlay(true);
        this.f140718b.m65755f(this.f140738v, !this.f140733q.f42965l);
    }

    /* JADX INFO: renamed from: V */
    public void m161634V(BubbleInfo bubbleInfo) {
        FeedPostStatusAct feedPostStatusAct = this.f140733q;
        Emotion emotion = bubbleInfo.emotion;
        feedPostStatusAct.f42963j = emotion;
        emotion.backgroundColor = bubbleInfo.textTheme.backgroundColor;
        m161632T(emotion);
        m161633U((ArrayList) bubbleInfo.media);
        if (TextUtils.isEmpty(bubbleInfo.location.name)) {
            this.f140737u = bubbleInfo.location;
            this.f140722f.setVisibility(0);
            this.f140722f.setText(this.f140737u.name);
        } else {
            this.f140722f.setVisibility(4);
        }
        if (TextUtils.isEmpty(bubbleInfo.value)) {
            this.f140723g.setText(bubbleInfo.value);
        }
    }

    /* JADX INFO: renamed from: X */
    public void m161635X(View view, float f, int i) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
        layoutParams.bottomMargin = (int) (t100.m186890d(i) * f);
        view.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: Y */
    public void m161636Y() {
        if (!NullChecker.m81303a(this.f140732p.f188116c)) {
            this.f140737u = null;
            this.f140722f.setText((CharSequence) null);
            this.f140722f.setVisibility(4);
            return;
        }
        MessageLocation messageLocation = new MessageLocation();
        this.f140737u = messageLocation;
        wuh wuhVar = this.f140732p;
        String str = wuhVar.f188114a;
        messageLocation.name = str;
        messageLocation.address = wuhVar.f188115b;
        messageLocation.coordinates = wuhVar.f188116c;
        this.f140722f.setText(str);
        this.f140722f.setVisibility(0);
    }

    @Override // p149l.s7m
    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f140733q;
    }

    @Override // p149l.dyq
    /* JADX INFO: renamed from: h */
    public void mo42557h(int i, int i2) {
        if (i <= 0 || this.f140734r || i == xdl0.m208336I(this.f140733q)) {
            if (i == 0 && this.f140734r) {
                this.f140734r = false;
                m161642z();
                return;
            } else {
                if (xdl0.m208349O0(this.f140721e)) {
                    return;
                }
                m161620C(this.f140717a.getMeasuredHeight() / 3);
                return;
            }
        }
        if (Build.VERSION.SDK_INT >= 30 && i > xdl0.m208408w0() / 2) {
            i /= 2;
        }
        if (!this.f140739w) {
            this.f140739w = true;
            m161637s(i);
        }
        this.f140734r = true;
        m161602Z(i);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM161638u = m161638u(layoutInflater, viewGroup);
        m161617r();
        m161596A();
        m161601W();
        return viewM161638u;
    }

    /* JADX INFO: renamed from: s */
    public final void m161637s(final int i) {
        this.f140717a.post(new Runnable() { // from class: l.cvh
            @Override // java.lang.Runnable
            public final void run() {
                this.f82661a.m161620C(i);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public View m161638u(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ovh.m166193b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: v */
    public void m161639v() {
        fyq fyqVar = new fyq(getAct());
        fyqVar.m123794g(this);
        this.f140733q.getWindow().getDecorView().post(new vog(fyqVar));
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(wuh wuhVar) {
        this.f140732p = wuhVar;
    }

    /* JADX INFO: renamed from: x */
    public void m161641x() {
        if (cjh.m107155a(new d30() { // from class: l.kvh
            @Override // p149l.d30
            public final void call() {
                this.f124773a.m161621E();
            }
        })) {
            this.f140733q.startActivityForResult(new Intent(this.f140733q, (Class<?>) NewPostLocationAct.class), 10020);
            this.f140733q.overridePendingTransition(uzb0.f178984i, uzb0.f178980e);
            this.f140733q.hideInput(this.f140723g);
        }
    }

    /* JADX INFO: renamed from: z */
    public void m161642z() {
        bt0.m103748u(true, this.f140735s, 390L, bt0.m103744q(this.f140727k, "translationY", 0.0f)).start();
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.nvh$a */
    public class C18782a implements TextWatcher {
        public C18782a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (nvh.this.f140723g.getLineCount() > 3) {
                String string = editable.toString();
                int selectionStart = nvh.this.f140723g.getSelectionStart();
                nvh.this.f140723g.setText((selectionStart != nvh.this.f140723g.getSelectionEnd() || selectionStart >= string.length() || selectionStart < 1) ? string.substring(0, editable.length() - 1) : string.substring(0, selectionStart - 1).concat(string.substring(selectionStart)));
                VEditText vEditText = nvh.this.f140723g;
                vEditText.setSelection(vEditText.getText().length());
                e51.m114742G(new Runnable() { // from class: l.mvh
                    @Override // java.lang.Runnable
                    public final void run() {
                        lsi0.m151580j("最多输入3行");
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
