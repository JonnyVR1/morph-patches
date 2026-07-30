package com.p046p1.mobile.putong.live.livingroom.virtual.room.functions.dialog.topic;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.OMSSwipeMoment;
import com.p046p1.mobile.putong.data.OMSTemplateType;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceChatTopic;
import com.p046p1.mobile.putong.live.base.data.VirtualVoiceMotionType;
import com.p046p1.mobile.putong.live.livingroom.binding.LiveVirtualVoiceTopicDialogViewBindings;
import com.p046p1.mobile.putong.live.livingroom.virtual.preview.PreviewTagView;
import com.p046p1.mobile.putong.live.livingroom.virtual.room.functions.dialog.topic.TopicView;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import p147v.VText;
import p149l.b2s;
import p149l.cxq;
import p149l.d1j0;
import p149l.e30;
import p149l.e51;
import p149l.h1c0;
import p149l.h4t;
import p149l.j7n0;
import p149l.kvc0;
import p149l.nnn0;
import p149l.osi0;
import p149l.svq;
import p149l.t100;
import p149l.url;
import p149l.vwb;
import p149l.w7n0;
import p149l.w9j;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0010J#\u0010\u0016\u001a\u00020\f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0015\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0018\u0010\u0010J\u0017\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001d\u0010\u0010J\u0017\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001f\u0010 J/\u0010%\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020!H\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\fH\u0002¢\u0006\u0004\b'\u0010\u0010J\u000f\u0010(\u001a\u00020\fH\u0002¢\u0006\u0004\b(\u0010\u0010J'\u0010,\u001a\u00020\f2\u0006\u0010*\u001a\u00020)2\u0006\u0010\u001e\u001a\u00020\u00132\u0006\u0010+\u001a\u00020\u0019H\u0002¢\u0006\u0004\b,\u0010-R\u0018\u00100\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00103\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00106\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b7\u00108R \u0010=\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020)098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006>"}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/virtual/room/functions/dialog/topic/TopicView;", "Lcom/p1/mobile/putong/live/livingroom/binding/LiveVirtualVoiceTopicDialogViewBindings;", "Ll/d1j0;", "Ll/url;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Ll/j7n0;", OMSTemplateType.dialog, "", "a", "(Ll/j7n0;)V", Constants.INAPP_DATA_TAG, "()V", ResourceDirection.f38808v, "", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceChatTopic;", "tagTopicList", "currentTopic", "B", "(Ljava/util/List;Lcom/p1/mobile/putong/live/base/data/BLiveVoiceChatTopic;)V", "c", "", "show", "b", "(Z)V", b2s.C_ZONE, "voiceTopic", BaseSei.f13930X, "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceChatTopic;)V", "", "realWidth", FirebaseAnalytics.Param.INDEX, "selectIndex", "u", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceChatTopic;III)V", "A", BaseSei.f13932Z, "Lcom/p1/mobile/putong/live/livingroom/virtual/preview/PreviewTagView;", "tagView", "touch", "w", "(Lcom/p1/mobile/putong/live/livingroom/virtual/preview/PreviewTagView;Lcom/p1/mobile/putong/live/base/data/BLiveVoiceChatTopic;Z)V", RXScreenCaptureService.KEY_INDEX, "Lcom/p1/mobile/putong/live/livingroom/virtual/preview/PreviewTagView;", "selectedTagView", "j", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceChatTopic;", "selectedVoiceTopic", "k", "Z", "isCustomEdit", BLiveStormDanmakuGiftResourceType.f44444l, "Ll/j7n0;", "", "", "m", "Ljava/util/Map;", "tagViewMap", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class TopicView extends LiveVirtualVoiceTopicDialogViewBindings<d1j0> implements url {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public PreviewTagView selectedTagView;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public BLiveVoiceChatTopic selectedVoiceTopic;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public boolean isCustomEdit;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public j7n0 dialog;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final Map<String, PreviewTagView> tagViewMap;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.virtual.room.functions.dialog.topic.TopicView$a */
    @Metadata(m87231d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J1\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ1\u0010\f\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m87232d2 = {"com/p1/mobile/putong/live/livingroom/virtual/room/functions/dialog/topic/TopicView$a", "Landroid/text/TextWatcher;", "", BLiveStormDanmakuGiftResourceType.f44446s, "", "start", "count", OMSSwipeMoment.after, "", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", OMSSwipeMoment.before, "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "(Landroid/text/Editable;)V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C12976a implements TextWatcher {
        public C12976a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s) {
            s.getClass();
            if (s.length() > 0 && s.length() >= 100) {
                osi0.m165783g("最多可键入100个字符");
                TopicView.this.f48167f.setText(s.subSequence(0, s.length() - 1).toString());
                EditText editText = TopicView.this.f48167f;
                editText.setSelection(editText.getText().length());
            }
            TopicView.this.m77365v();
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
    public static Boolean m77351i(BLiveVoiceChatTopic bLiveVoiceChatTopic, BLiveVoiceChatTopic bLiveVoiceChatTopic2) {
        return Boolean.valueOf(TextUtils.equals(bLiveVoiceChatTopic2.tag, bLiveVoiceChatTopic.tag));
    }

    /* JADX INFO: renamed from: j */
    public static void m77352j(final TopicView topicView, String str) {
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
            previewTagView2.m77232a();
        }
        e51.m114743H(topicView.act(), new Runnable() { // from class: l.d3j0
            @Override // java.lang.Runnable
            public final void run() {
                TopicView.m77360y(this.f84231a);
            }
        }, 10L);
        topicView.m77365v();
    }

    /* JADX INFO: renamed from: k */
    public static Unit m77353k(TopicView topicView, View view) {
        view.getClass();
        if (StringsKt.m93438e0(topicView.f48167f.getText().toString())) {
            return Unit.INSTANCE;
        }
        BLiveVoiceChatTopic bLiveVoiceChatTopic = topicView.selectedVoiceTopic;
        if (bLiveVoiceChatTopic != null && bLiveVoiceChatTopic.isCustomDefault()) {
            return Unit.INSTANCE;
        }
        BLiveVoiceChatTopic bLiveVoiceChatTopic2 = topicView.selectedVoiceTopic;
        if (bLiveVoiceChatTopic2 != null) {
            bLiveVoiceChatTopic2.topic = topicView.f48167f.getText().toString();
            d1j0 d1j0Var = (d1j0) topicView.f48162a;
            BLiveVoiceChatTopic bLiveVoiceChatTopic3 = topicView.selectedVoiceTopic;
            bLiveVoiceChatTopic3.getClass();
            d1j0Var.m109627S3(bLiveVoiceChatTopic3);
        }
        T t = topicView.f48162a;
        t.getClass();
        w7n0.m202027d((h4t) t, VirtualVoiceMotionType.chatTopic);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m */
    public static void m77355m(TopicView topicView, PreviewTagView previewTagView, BLiveVoiceChatTopic bLiveVoiceChatTopic, View view) {
        topicView.m77366w(previewTagView, bLiveVoiceChatTopic, true);
    }

    /* JADX INFO: renamed from: n */
    public static void m77356n(TopicView topicView, View view, boolean z) {
        topicView.isCustomEdit = false;
    }

    /* JADX INFO: renamed from: p */
    public static void m77357p(TopicView topicView) {
        Act act = topicView.act();
        if (act != null) {
            act.showInput(topicView.f48165d.f48387b, 0);
        }
    }

    /* JADX INFO: renamed from: q */
    public static Unit m77358q(TopicView topicView, View view) {
        view.getClass();
        BLiveVoiceChatTopic bLiveVoiceChatTopic = topicView.selectedVoiceTopic;
        if (bLiveVoiceChatTopic != null) {
            topicView.m77367x(bLiveVoiceChatTopic);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    public static Boolean m77359s(BLiveVoiceChatTopic bLiveVoiceChatTopic) {
        return Boolean.valueOf(bLiveVoiceChatTopic.isCustom);
    }

    /* JADX INFO: renamed from: y */
    public static final void m77360y(TopicView topicView) {
        Act act = topicView.act();
        if (act != null) {
            act.hideInput(topicView.f48165d.f48387b);
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m77361A() {
        BLiveVoiceChatTopic bLiveVoiceChatTopic = this.selectedVoiceTopic;
        if (bLiveVoiceChatTopic != null) {
            bLiveVoiceChatTopic.getClass();
            if (bLiveVoiceChatTopic.isCustom && this.isCustomEdit) {
                xdl0.m208344M(this.f48165d, true);
                this.f48165d.m77350e();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B */
    public final void m77362B(@NotNull List<? extends BLiveVoiceChatTopic> tagTopicList, @NotNull final BLiveVoiceChatTopic currentTopic) {
        tagTopicList.getClass();
        currentTopic.getClass();
        this.f48164c.removeAllViews();
        this.tagViewMap.clear();
        int iM208412y0 = (xdl0.m208412y0() - svq.m186103c(65)) / 4;
        boolean zM87488d = Intrinsics.m87488d(VirtualVoiceMotionType.chatTopic, ((nnn0) ((d1j0) this.f48162a).m206027E2()).mo149813j().template);
        int i = 0;
        int iM200293G = (TextUtils.isEmpty(currentTopic.topic) || !zM87488d) ? 0 : vwb.m200293G(tagTopicList, new w9j() { // from class: l.e3j0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return TopicView.m77351i(currentTopic, (BLiveVoiceChatTopic) obj);
            }
        });
        if (iM200293G < 0) {
            iM200293G = 0;
        }
        for (Object obj : tagTopicList) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            m77364u((BLiveVoiceChatTopic) obj, iM208412y0, i, iM200293G);
            i = i2;
        }
        if (((BLiveVoiceChatTopic) vwb.m200346r(tagTopicList, new w9j() { // from class: l.f3j0
            @Override // p149l.w9j
            public final Object call(Object obj2) {
                return TopicView.m77359s((BLiveVoiceChatTopic) obj2);
            }
        })) == null) {
            BLiveVoiceChatTopic bLiveVoiceChatTopicNew_ = BLiveVoiceChatTopic.new_();
            bLiveVoiceChatTopicNew_.tag = "添加自定义标签";
            bLiveVoiceChatTopicNew_.isCustom = true;
            m77364u(bLiveVoiceChatTopicNew_, iM208412y0, tagTopicList.size(), iM200293G);
        }
        if (TextUtils.isEmpty(currentTopic.topic) || !zM87488d) {
            return;
        }
        this.f48167f.setText(currentTopic.topic);
    }

    /* JADX INFO: renamed from: C */
    public final void m77363C() {
        this.isCustomEdit = true;
        xdl0.m208344M(this.f48165d, true);
        this.f48165d.m77350e();
        e51.m114743H(act(), new Runnable() { // from class: l.h3j0
            @Override // java.lang.Runnable
            public final void run() {
                TopicView.m77357p(this.f105744a);
            }
        }, 10L);
    }

    @Override // p149l.url
    /* JADX INFO: renamed from: a */
    public void mo77327a(@NotNull j7n0 dialog) {
        dialog.getClass();
        this.dialog = dialog;
        VText vText = this.f48169h;
        vText.getClass();
        cxq.m109105c(vText, new Function1() { // from class: l.x2j0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TopicView.m77353k(this.f190805a, (View) obj);
            }
        });
        this.f48167f.setFilters(new InputFilter[]{new InputFilter.LengthFilter(100)});
        ImageView imageView = this.f48168g;
        imageView.getClass();
        cxq.m109105c(imageView, new Function1() { // from class: l.z2j0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TopicView.m77358q(this.f201253a, (View) obj);
            }
        });
        ((d1j0) this.f48162a).m109628T3();
        this.f48165d.m77349d(new e30() { // from class: l.b3j0
            @Override // p149l.e30
            public final void call(Object obj) {
                TopicView.m77352j(this.f73238a, (String) obj);
            }
        });
        this.f48167f.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: l.c3j0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                TopicView.m77356n(this.f78950a, view, z);
            }
        });
        this.f48167f.addTextChangedListener(new C12976a());
    }

    @Override // p149l.url
    /* JADX INFO: renamed from: b */
    public void mo77328b(boolean show) {
        if (show) {
            m77361A();
        } else {
            m77368z();
        }
    }

    @Override // p149l.url
    /* JADX INFO: renamed from: c */
    public void mo77329c() {
        super.mo77329c();
        this.f48167f.setText("");
        this.f48167f.clearFocus();
    }

    @Override // p149l.url
    /* JADX INFO: renamed from: d */
    public void mo77330d() {
        super.mo77330d();
        ((d1j0) this.f48162a).m109628T3();
        this.f48167f.setText("");
        this.f48167f.clearFocus();
    }

    @Override // p149l.url
    /* JADX INFO: renamed from: e */
    public /* bridge */ void mo77331e() {
        super.mo77331e();
    }

    /* JADX INFO: renamed from: u */
    public final void m77364u(final BLiveVoiceChatTopic voiceTopic, int realWidth, int index, int selectIndex) {
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
        if (voiceTopic.isCustom && !Intrinsics.m87488d("添加自定义标签", voiceTopic.tag)) {
            previewTagView.m77232a();
        }
        if (index == selectIndex) {
            m77366w(previewTagView, voiceTopic, false);
        }
        xdl0.m208329E0(previewTagView, new View.OnClickListener() { // from class: l.g3j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TopicView.m77355m(this.f100479a, previewTagView, voiceTopic, view);
            }
        });
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        xdl0.m208370d0(previewTagView, t100.m186890d(13.0f));
        xdl0.m208372e0(previewTagView, t100.m186890d(13.0f));
        int i = t100.f167260i;
        xdl0.m208374f0(previewTagView, i);
        xdl0.m208368c0(previewTagView, i);
        previewTagView.getTagTextView().setTextSize(12.0f);
        this.f48164c.addView(previewTagView, marginLayoutParams);
        xdl0.m208357U(previewTagView, svq.m186103c(8));
        int i2 = index % 4;
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            xdl0.m208359W(previewTagView, svq.m186103c(8));
        } else {
            xdl0.m208359W(previewTagView, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:11:0x0029  */
    /* JADX INFO: renamed from: v */
    public final void m77365v() {
        Editable text;
        BLiveVoiceChatTopic bLiveVoiceChatTopic = this.selectedVoiceTopic;
        boolean z = false;
        if (bLiveVoiceChatTopic != null) {
            bLiveVoiceChatTopic.getClass();
            if (bLiveVoiceChatTopic.isCustom) {
                BLiveVoiceChatTopic bLiveVoiceChatTopic2 = this.selectedVoiceTopic;
                bLiveVoiceChatTopic2.getClass();
                if (!bLiveVoiceChatTopic2.isCustomDefault()) {
                    Editable text2 = this.f48167f.getText();
                    text2.getClass();
                    if (!StringsKt.m93438e0(text2)) {
                        z = true;
                    }
                }
            } else {
                text = this.f48167f.getText();
                text.getClass();
                if (!StringsKt.m93438e0(text)) {
                    z = true;
                }
            }
        } else {
            text = this.f48167f.getText();
            text.getClass();
            if (!StringsKt.m93438e0(text)) {
                z = true;
            }
        }
        this.f48169h.setSelected(z);
        VText vText = this.f48169h;
        if (z) {
            vText.setTextColor(kvc0.m147352a(h1c0.f105416w1));
        } else {
            vText.setTextColor(kvc0.m147352a(h1c0.f105386m1));
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m77366w(PreviewTagView tagView, BLiveVoiceChatTopic voiceTopic, boolean touch) {
        if (voiceTopic.isCustom) {
            if (touch) {
                m77363C();
            }
            xdl0.m208345M0(this.f48168g, false);
        } else {
            xdl0.m208344M(this.f48165d, false);
            this.f48165d.m77348c();
            xdl0.m208345M0(this.f48168g, true);
        }
        boolean zM87488d = Intrinsics.m87488d(this.selectedTagView, tagView);
        PreviewTagView previewTagView = this.selectedTagView;
        if (zM87488d) {
            Intrinsics.m87488d(previewTagView, tagView);
            return;
        }
        if (previewTagView != null) {
            previewTagView.getClass();
            previewTagView.setSelected(false);
        }
        tagView.setSelected(true);
        this.selectedTagView = tagView;
        this.selectedVoiceTopic = voiceTopic;
        m77365v();
    }

    /* JADX INFO: renamed from: x */
    public final void m77367x(BLiveVoiceChatTopic voiceTopic) {
        List<String> list = voiceTopic.topics;
        list.getClass();
        String str = "";
        if (!list.isEmpty()) {
            String str2 = voiceTopic.topics.get(Random.INSTANCE.nextInt(voiceTopic.topics.size()));
            str = str2.length() != 0 ? str2 : "";
        }
        this.f48167f.setText(str);
        this.f48167f.setSelection(str.length());
    }

    /* JADX INFO: renamed from: z */
    public final void m77368z() {
        xdl0.m208344M(this.f48165d, false);
        this.f48165d.m77348c();
    }
}
