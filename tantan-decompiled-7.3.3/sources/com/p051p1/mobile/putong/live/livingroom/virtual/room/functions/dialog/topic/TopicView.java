package com.p051p1.mobile.putong.live.livingroom.virtual.room.functions.dialog.topic;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.OMSSwipeMoment;
import com.p051p1.mobile.putong.data.OMSTemplateType;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceChatTopic;
import com.p051p1.mobile.putong.live.base.data.VirtualVoiceMotionType;
import com.p051p1.mobile.putong.live.livingroom.binding.LiveVirtualVoiceTopicDialogViewBindings;
import com.p051p1.mobile.putong.live.livingroom.virtual.preview.PreviewTagView;
import com.p051p1.mobile.putong.live.livingroom.virtual.room.functions.dialog.topic.TopicView;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.Random;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VText;
import p153l.ahn0;
import p153l.bnl0;
import p153l.c4s;
import p153l.czq;
import p153l.haj0;
import p153l.i6t;
import p153l.iul;
import p153l.jyb;
import p153l.l51;
import p153l.n3d0;
import p153l.n9c0;
import p153l.ngn0;
import p153l.qa00;
import p153l.qcj;
import p153l.r1j0;
import p153l.rwn0;
import p153l.txq;
import p153l.y20;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0010J#\u0010\u0016\u001a\u00020\f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0015\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0018\u0010\u0010J\u0017\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001d\u0010\u0010J\u0017\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001f\u0010 J/\u0010%\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020!H\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\fH\u0002¢\u0006\u0004\b'\u0010\u0010J\u000f\u0010(\u001a\u00020\fH\u0002¢\u0006\u0004\b(\u0010\u0010J'\u0010,\u001a\u00020\f2\u0006\u0010*\u001a\u00020)2\u0006\u0010\u001e\u001a\u00020\u00132\u0006\u0010+\u001a\u00020\u0019H\u0002¢\u0006\u0004\b,\u0010-R\u0018\u00100\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00103\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00106\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b7\u00108R \u0010=\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020)098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006>"}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/virtual/room/functions/dialog/topic/TopicView;", "Lcom/p1/mobile/putong/live/livingroom/binding/LiveVirtualVoiceTopicDialogViewBindings;", "Ll/haj0;", "Ll/iul;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Ll/ngn0;", OMSTemplateType.dialog, "", "a", "(Ll/ngn0;)V", Constants.INAPP_DATA_TAG, "()V", ResourceDirection.f39656v, "", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceChatTopic;", "tagTopicList", "currentTopic", "B", "(Ljava/util/List;Lcom/p1/mobile/putong/live/base/data/BLiveVoiceChatTopic;)V", "c", "", "show", "b", "(Z)V", c4s.C_ZONE, "voiceTopic", BaseSei.f14624X, "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceChatTopic;)V", "", "realWidth", FirebaseAnalytics.Param.INDEX, "selectIndex", "u", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceChatTopic;III)V", "A", BaseSei.f14626Z, "Lcom/p1/mobile/putong/live/livingroom/virtual/preview/PreviewTagView;", "tagView", "touch", "w", "(Lcom/p1/mobile/putong/live/livingroom/virtual/preview/PreviewTagView;Lcom/p1/mobile/putong/live/base/data/BLiveVoiceChatTopic;Z)V", RXScreenCaptureService.KEY_INDEX, "Lcom/p1/mobile/putong/live/livingroom/virtual/preview/PreviewTagView;", "selectedTagView", "j", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceChatTopic;", "selectedVoiceTopic", "k", "Z", "isCustomEdit", BLiveStormDanmakuGiftResourceType.f45292l, "Ll/ngn0;", "", "", "m", "Ljava/util/Map;", "tagViewMap", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class TopicView extends LiveVirtualVoiceTopicDialogViewBindings<haj0> implements iul {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public PreviewTagView selectedTagView;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public BLiveVoiceChatTopic selectedVoiceTopic;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public boolean isCustomEdit;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public ngn0 dialog;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final Map<String, PreviewTagView> tagViewMap;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.virtual.room.functions.dialog.topic.TopicView$a */
    @Metadata(m88120d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J1\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ1\u0010\f\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m88121d2 = {"com/p1/mobile/putong/live/livingroom/virtual/room/functions/dialog/topic/TopicView$a", "Landroid/text/TextWatcher;", "", BLiveStormDanmakuGiftResourceType.f45294s, "", "start", "count", OMSSwipeMoment.after, "", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", OMSSwipeMoment.before, "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "(Landroid/text/Editable;)V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C13139a implements TextWatcher {
        public C13139a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s) {
            s.getClass();
            if (s.length() > 0 && s.length() >= 100) {
                r1j0.m179420g("最多可键入100个字符");
                TopicView.this.f49015f.setText(s.subSequence(0, s.length() - 1).toString());
                EditText editText = TopicView.this.f49015f;
                editText.setSelection(editText.getText().length());
            }
            TopicView.this.m78548v();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopicView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        this.tagViewMap = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: i */
    public static Boolean m78534i(BLiveVoiceChatTopic bLiveVoiceChatTopic, BLiveVoiceChatTopic bLiveVoiceChatTopic2) {
        return Boolean.valueOf(TextUtils.equals(bLiveVoiceChatTopic2.tag, bLiveVoiceChatTopic.tag));
    }

    /* JADX INFO: renamed from: j */
    public static void m78535j(final TopicView topicView, String str) {
        BLiveVoiceChatTopic bLiveVoiceChatTopic = topicView.selectedVoiceTopic;
        if (bLiveVoiceChatTopic == null || !bLiveVoiceChatTopic.isCustom) {
            return;
        }
        bLiveVoiceChatTopic.getClass();
        bLiveVoiceChatTopic.tag = str;
        PreviewTagView previewTagView = topicView.selectedTagView;
        previewTagView.getClass();
        str.getClass();
        previewTagView.setTagText(str);
        PreviewTagView previewTagView2 = topicView.selectedTagView;
        if (previewTagView2 != null) {
            previewTagView2.m78415a();
        }
        l51.m152888H(topicView.act(), new Runnable() { // from class: l.hcj0
            @Override // java.lang.Runnable
            public final void run() {
                TopicView.m78543y(this.f108702a);
            }
        }, 10L);
        topicView.m78548v();
    }

    /* JADX INFO: renamed from: k */
    public static Unit m78536k(TopicView topicView, View view) {
        view.getClass();
        if (StringsKt.m94329e0(topicView.f49015f.getText().toString())) {
            return Unit.INSTANCE;
        }
        BLiveVoiceChatTopic bLiveVoiceChatTopic = topicView.selectedVoiceTopic;
        if (bLiveVoiceChatTopic != null && bLiveVoiceChatTopic.isCustomDefault()) {
            return Unit.INSTANCE;
        }
        BLiveVoiceChatTopic bLiveVoiceChatTopic2 = topicView.selectedVoiceTopic;
        if (bLiveVoiceChatTopic2 != null) {
            bLiveVoiceChatTopic2.topic = topicView.f49015f.getText().toString();
            haj0 haj0Var = (haj0) topicView.f49010a;
            BLiveVoiceChatTopic bLiveVoiceChatTopic3 = topicView.selectedVoiceTopic;
            bLiveVoiceChatTopic3.getClass();
            haj0Var.m134172S3(bLiveVoiceChatTopic3);
        }
        T t = topicView.f49010a;
        t.getClass();
        ahn0.m97862d((i6t) t, VirtualVoiceMotionType.chatTopic);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m */
    public static void m78538m(TopicView topicView, PreviewTagView previewTagView, BLiveVoiceChatTopic bLiveVoiceChatTopic, View view) {
        topicView.m78549w(previewTagView, bLiveVoiceChatTopic, true);
    }

    /* JADX INFO: renamed from: n */
    public static void m78539n(TopicView topicView, View view, boolean z) {
        topicView.isCustomEdit = false;
    }

    /* JADX INFO: renamed from: p */
    public static void m78540p(TopicView topicView) {
        Act act = topicView.act();
        if (act != null) {
            act.showInput(topicView.f49013d.f49235b, 0);
        }
    }

    /* JADX INFO: renamed from: q */
    public static Unit m78541q(TopicView topicView, View view) {
        view.getClass();
        BLiveVoiceChatTopic bLiveVoiceChatTopic = topicView.selectedVoiceTopic;
        if (bLiveVoiceChatTopic != null) {
            topicView.m78550x(bLiveVoiceChatTopic);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    public static Boolean m78542s(BLiveVoiceChatTopic bLiveVoiceChatTopic) {
        return Boolean.valueOf(bLiveVoiceChatTopic.isCustom);
    }

    /* JADX INFO: renamed from: y */
    public static final void m78543y(TopicView topicView) {
        Act act = topicView.act();
        if (act != null) {
            act.hideInput(topicView.f49013d.f49235b);
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m78544A() {
        BLiveVoiceChatTopic bLiveVoiceChatTopic = this.selectedVoiceTopic;
        if (bLiveVoiceChatTopic != null) {
            bLiveVoiceChatTopic.getClass();
            if (bLiveVoiceChatTopic.isCustom && this.isCustomEdit) {
                bnl0.m105524M(this.f49013d, true);
                this.f49013d.m78533e();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B */
    public final void m78545B(@NotNull List<? extends BLiveVoiceChatTopic> tagTopicList, @NotNull final BLiveVoiceChatTopic currentTopic) {
        tagTopicList.getClass();
        currentTopic.getClass();
        this.f49012c.removeAllViews();
        this.tagViewMap.clear();
        int iM105592y0 = (bnl0.m105592y0() - txq.m193530c(65)) / 4;
        boolean zM88377d = Intrinsics.m88377d(VirtualVoiceMotionType.chatTopic, ((rwn0) ((haj0) this.f49010a).m213810E2()).mo183435j().template);
        int i = 0;
        int iM147476G = (TextUtils.isEmpty(currentTopic.topic) || !zM88377d) ? 0 : jyb.m147476G(tagTopicList, new qcj() { // from class: l.icj0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return TopicView.m78534i(currentTopic, (BLiveVoiceChatTopic) obj);
            }
        });
        if (iM147476G < 0) {
            iM147476G = 0;
        }
        for (Object obj : tagTopicList) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            m78547u((BLiveVoiceChatTopic) obj, iM105592y0, i, iM147476G);
            i = i2;
        }
        if (((BLiveVoiceChatTopic) jyb.m147529r(tagTopicList, new qcj() { // from class: l.jcj0
            @Override // p153l.qcj
            public final Object call(Object obj2) {
                return TopicView.m78542s((BLiveVoiceChatTopic) obj2);
            }
        })) == null) {
            BLiveVoiceChatTopic bLiveVoiceChatTopicNew_ = BLiveVoiceChatTopic.new_();
            bLiveVoiceChatTopicNew_.tag = "添加自定义标签";
            bLiveVoiceChatTopicNew_.isCustom = true;
            m78547u(bLiveVoiceChatTopicNew_, iM105592y0, tagTopicList.size(), iM147476G);
        }
        if (TextUtils.isEmpty(currentTopic.topic) || !zM88377d) {
            return;
        }
        this.f49015f.setText(currentTopic.topic);
    }

    /* JADX INFO: renamed from: C */
    public final void m78546C() {
        this.isCustomEdit = true;
        bnl0.m105524M(this.f49013d, true);
        this.f49013d.m78533e();
        l51.m152888H(act(), new Runnable() { // from class: l.lcj0
            @Override // java.lang.Runnable
            public final void run() {
                TopicView.m78540p(this.f131362a);
            }
        }, 10L);
    }

    @Override // p153l.iul
    /* JADX INFO: renamed from: a */
    public void mo78510a(@NotNull ngn0 dialog) {
        dialog.getClass();
        this.dialog = dialog;
        VText vText = this.f49017h;
        vText.getClass();
        czq.m113347c(vText, new Function1() { // from class: l.bcj0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TopicView.m78536k(this.f76178a, (View) obj);
            }
        });
        this.f49015f.setFilters(new InputFilter[]{new InputFilter.LengthFilter(100)});
        ImageView imageView = this.f49016g;
        imageView.getClass();
        czq.m113347c(imageView, new Function1() { // from class: l.dcj0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TopicView.m78541q(this.f87788a, (View) obj);
            }
        });
        ((haj0) this.f49010a).m134173T3();
        this.f49013d.m78532d(new y20() { // from class: l.fcj0
            @Override // p153l.y20
            public final void call(Object obj) {
                TopicView.m78535j(this.f98223a, (String) obj);
            }
        });
        this.f49015f.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: l.gcj0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                TopicView.m78539n(this.f103584a, view, z);
            }
        });
        this.f49015f.addTextChangedListener(new C13139a());
    }

    @Override // p153l.iul
    /* JADX INFO: renamed from: b */
    public void mo78511b(boolean show) {
        if (show) {
            m78544A();
        } else {
            m78551z();
        }
    }

    @Override // p153l.iul
    /* JADX INFO: renamed from: c */
    public void mo78512c() {
        super.mo78512c();
        this.f49015f.setText("");
        this.f49015f.clearFocus();
    }

    @Override // p153l.iul
    /* JADX INFO: renamed from: d */
    public void mo78513d() {
        super.mo78513d();
        ((haj0) this.f49010a).m134173T3();
        this.f49015f.setText("");
        this.f49015f.clearFocus();
    }

    @Override // p153l.iul
    /* JADX INFO: renamed from: e */
    public /* bridge */ void mo78514e() {
        super.mo78514e();
    }

    /* JADX INFO: renamed from: u */
    public final void m78547u(final BLiveVoiceChatTopic voiceTopic, int realWidth, int index, int selectIndex) {
        Context context = getRootView().getContext();
        context.getClass();
        final PreviewTagView previewTagView = new PreviewTagView(context, null, 0, 6, null);
        this.tagViewMap.put(voiceTopic.topic, previewTagView);
        previewTagView.setVoiceTopic(voiceTopic);
        String str = voiceTopic.tag;
        if (str.length() == 0) {
            str = "";
        }
        previewTagView.setTagText(str);
        if (voiceTopic.isCustom && !Intrinsics.m88377d("添加自定义标签", voiceTopic.tag)) {
            previewTagView.m78415a();
        }
        if (index == selectIndex) {
            m78549w(previewTagView, voiceTopic, false);
        }
        bnl0.m105509E0(previewTagView, new View.OnClickListener() { // from class: l.kcj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TopicView.m78538m(this.f125070a, previewTagView, voiceTopic, view);
            }
        });
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        bnl0.m105550d0(previewTagView, qa00.m175859d(13.0f));
        bnl0.m105552e0(previewTagView, qa00.m175859d(13.0f));
        int i = qa00.f156322i;
        bnl0.m105554f0(previewTagView, i);
        bnl0.m105548c0(previewTagView, i);
        previewTagView.getTagTextView().setTextSize(12.0f);
        this.f49012c.addView(previewTagView, marginLayoutParams);
        bnl0.m105537U(previewTagView, txq.m193530c(8));
        int i2 = index % 4;
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            bnl0.m105539W(previewTagView, txq.m193530c(8));
        } else {
            bnl0.m105539W(previewTagView, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:11:0x0029  */
    /* JADX INFO: renamed from: v */
    public final void m78548v() {
        Editable text;
        BLiveVoiceChatTopic bLiveVoiceChatTopic = this.selectedVoiceTopic;
        boolean z = false;
        if (bLiveVoiceChatTopic != null) {
            bLiveVoiceChatTopic.getClass();
            if (bLiveVoiceChatTopic.isCustom) {
                BLiveVoiceChatTopic bLiveVoiceChatTopic2 = this.selectedVoiceTopic;
                bLiveVoiceChatTopic2.getClass();
                if (!bLiveVoiceChatTopic2.isCustomDefault()) {
                    Editable text2 = this.f49015f.getText();
                    text2.getClass();
                    if (!StringsKt.m94329e0(text2)) {
                        z = true;
                    }
                }
            } else {
                text = this.f49015f.getText();
                text.getClass();
                if (!StringsKt.m94329e0(text)) {
                    z = true;
                }
            }
        } else {
            text = this.f49015f.getText();
            text.getClass();
            if (!StringsKt.m94329e0(text)) {
                z = true;
            }
        }
        this.f49017h.setSelected(z);
        VText vText = this.f49017h;
        if (z) {
            vText.setTextColor(n3d0.m161277a(n9c0.f140877w1));
        } else {
            vText.setTextColor(n3d0.m161277a(n9c0.f140847m1));
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m78549w(PreviewTagView tagView, BLiveVoiceChatTopic voiceTopic, boolean touch) {
        if (voiceTopic.isCustom) {
            if (touch) {
                m78546C();
            }
            bnl0.m105525M0(this.f49016g, false);
        } else {
            bnl0.m105524M(this.f49013d, false);
            this.f49013d.m78531c();
            bnl0.m105525M0(this.f49016g, true);
        }
        boolean zM88377d = Intrinsics.m88377d(this.selectedTagView, tagView);
        PreviewTagView previewTagView = this.selectedTagView;
        if (zM88377d) {
            Intrinsics.m88377d(previewTagView, tagView);
            return;
        }
        if (previewTagView != null) {
            previewTagView.getClass();
            previewTagView.setSelected(false);
        }
        tagView.setSelected(true);
        this.selectedTagView = tagView;
        this.selectedVoiceTopic = voiceTopic;
        m78548v();
    }

    /* JADX INFO: renamed from: x */
    public final void m78550x(BLiveVoiceChatTopic voiceTopic) {
        List<String> list = voiceTopic.topics;
        list.getClass();
        String str = "";
        if (!list.isEmpty()) {
            String str2 = voiceTopic.topics.get(Random.INSTANCE.nextInt(voiceTopic.topics.size()));
            str = str2.length() != 0 ? str2 : "";
        }
        this.f49015f.setText(str);
        this.f49015f.setSelection(str.length());
    }

    /* JADX INFO: renamed from: z */
    public final void m78551z() {
        bnl0.m105524M(this.f49013d, false);
        this.f49013d.m78531c();
    }
}
